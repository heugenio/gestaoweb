/* 
    Document   : documentos.jsp
    Created on : 20/03/2018, 09:58:27
    Author     : Zeno Dolinski
    Descricao  : Controla a entrada de CPF ou CNPJ
    
    Utilizacao : Incluir o arquivo documentos.js

        Utilizado como funcao
            formatarDocumento(txtDocumento, [txtTipo]); 
                Recebe: String txtDocumento com o numero do documento.
                Recebe: String [txtTipo] que é opcional "cpf" ou "cnpj", se informado força a formatação do tipo informado,
                    se não informado formata o texto de acordo com a quantidade de caracteres
                Retorna: String formatada como CPF ou CNPJ.

            tipoDocumento(txtDocumento);
                Recebe: String txtDocumento com o numero do documento
                Retorna: "CPF/CNPJ", "CPF", "CNPJ" onde "CPF/CNPJ" refere-se ao formato nao identificado

            validaDocumento(txtDocumento, [txtTipo]); 
                Recebe: String com o numero do documento.
               Recebe: [txtTipo] é opcional "cpf" ou "cnpj" se informado força a validação do tipo solicitado,
                    se não informado valida tanto cpf como cnpj.
                Retorna: true ou false
            
            validaCpf(txtCPF);
                Recebe: String txtCPF com o numero do CPF
                Retorna: true ou false

            validaCnpj(txtCNPJ);
                Recebe: String txtCNPJ com o numero do CNPJ
                Retorna: true ou false


        Utilizado como controle do objeto input
            Temos tres classes para formacao
                "campo-documento" - O campo recebe tanto CPF quanto CNPJ e realiza a formatação do mesmo de acordo com a quantidade de digitos informados
                "campo-documento-cpf" - O campo so aceitara CPF
                "campo-documento-cnpj" - O campo so aceitara CNPJ
        
            <input type="text" value="" id="idDocumento" class="campo-documento">
            <input type="text" value="" id="idCpf" class="campo-documento-cpf">
            <input type="text" value="" id="idCnpj" class="campo-documento-cnpj">
                
                Ha outros tres controles auxiliares de saida com base em atributo data-... (funciona para as 3 classes):
                    data-tipo-documento = "idDocumento"
                        saida: "CPF/CNPJ", "CPF", "CNPJ"
                    data-documento-valido = "idDocumento"
                        saida: "CPF/CNPJ inválido", "CPF inválido", "CNPJ inválido", "CPF válido", "CNPJ válido"
                    data-documento-valido-boleano = "idDocumento"
                        saida: "true", "false"

        Utilizando os campos de controle auxiliar.
        Informe o atributo data-tipo-documento e no valor, o id do campo documento
        Obs.: "Serve para qualquer tipo de objeto"
        <input type="text" data-tipo-documento = "idDocumento" value="">
        <label data-tipo-documento = "idDocumento"></label>
*/

var ctrlDown = false;
var ctrlKey = 17;
var cmdKey = 91;
var vKey = 86;

$( document ).ready( function(){
    inicializarScriptCampoDocumento();
});

function inicializarScriptCampoDocumento(){
    $(document).keydown(function(e) {
        if (e.keyCode === ctrlKey || e.keyCode === cmdKey) ctrlDown = true;
    }).keyup(function(e) {
        if (e.keyCode === ctrlKey || e.keyCode === cmdKey) ctrlDown = false;
    });
    
    $(".campo-documento").each(function() {
        campoDocumento($(this).get(0));
    });
    
    $(".campo-documento-cpf").each(function() {
        campoDocumento($(this).get(0), "cpf");
    });
    
    $(".campo-documento-cnpj").each(function() {
        campoDocumento($(this).get(0), "cnpj");
    });
}

function campoDocumento(obj, tipo){
    if(obj !== undefined && obj.value === undefined)obj = obj.get(0);
    if(obj === undefined || obj === null) return false;
    if(tipo === undefined || tipo === null) tipo = "";

    obj.value = obj.value.replace(/\D/g, "");

    var input = obj,
    oldValue,
    keydownHandler= function(e) {
        tecla=(window.event)?event.keyCode:e.which;
        if(tecla !== undefined){
            if (ctrlDown && tecla == vKey){
                e.target.value="";
            }
            console.log(tecla);
            if(tecla===27 || tecla===46) e.target.value = "";
        }
        oldValue = obj.value.replace(/\D/g, "");
        e.target.selectionStart = e.target.selectionEnd = 10000;

        atribuiValoresParaAgregados(obj, tipo);
    },
    inputHandler= function(e) {
        console.log("ta aqui input");
        newValue = obj.value.replace(/\D/g, "");
        if(newValue!==oldValue && typeof newValue !== "undefined"){
            if((newValue.length<=14 && tipo === "cnpj") || (newValue.length<=14 && tipo === "") || (newValue.length<=11 && tipo === "cpf")){
                if(newValue.length<oldValue.length){
                    e.target.value=formatarDocumento(newValue, tipo);
                }else{
                    nChar = newValue.replace(oldValue, "");
                    if(nChar.length > oldValue.length) e.target.value=formatarDocumento(newValue, tipo);
                    else if("0,1,2,3,4,5,6,7,8,9".indexOf(nChar)>=0) e.target.value=formatarDocumento(newValue, tipo);
                    else e.target.value=formatarDocumento(oldValue, tipo); 
                }
            } else {
                e.target.value=formatarDocumento(oldValue, tipo);
            }
        } else {
            e.target.value=formatarDocumento(oldValue, tipo);
        }
        atribuiValoresParaAgregados(obj, tipo);
    },
    cursorHandler=function(e) {
        console.log("cursor")
        e.target.selectionStart = e.target.selectionEnd = 10000;
        atribuiValoresParaAgregados(obj, tipo);
    };

    input.type = "tel";
    input.setAttribute("type","tel");
    input.style.textAlign = "left";
    input.style.paddingRight = "3px";

    input.addEventListener("keydown", keydownHandler);
    input.addEventListener("keyup", cursorHandler, false);
    input.addEventListener("input", inputHandler);
    input.addEventListener("focus", cursorHandler, false);
    input.addEventListener("mouseup", cursorHandler, false);

    atribuiValoresParaAgregados(obj, tipo);
    
    function atribuiValoresParaAgregados(obj, tipo){
        if(tipo === undefined || tipo === null) tipo = "";
        var tipoDoc = (tipo === "" ? tipoDocumento(obj.value) : tipo.toUpperCase());
        var valido = validaDocumento(obj.value, tipo);
        var saidaTipoDoc;

        saidaTipoDoc = document.querySelectorAll("[data-tipo-documento='" + obj.id + "']");
        for(var idx=0; idx<saidaTipoDoc.length; idx++){
            if( saidaTipoDoc[idx] instanceof HTMLInputElement ){
                saidaTipoDoc[idx].value = tipoDoc;
            } else {
                saidaTipoDoc[idx].innerHTML = tipoDoc;
            }
        }

        saidaTipoDoc = document.querySelectorAll("[data-documento-valido='" + obj.id + "']");
        for(var idx=0; idx<saidaTipoDoc.length; idx++){
            if( saidaTipoDoc[idx] instanceof HTMLInputElement ){
                saidaTipoDoc[idx].value = (valido ? tipoDoc + " válido" : tipoDoc + " inválido");
            } else {
                saidaTipoDoc[idx].innerHTML = (valido ? tipoDoc + " válido" : tipoDoc + " inválido");
            }
        }

        saidaTipoDoc = document.querySelectorAll("[data-documento-valido-boleano='" + obj.id + "']");
        for(var idx=0; idx<saidaTipoDoc.length; idx++){
            if( saidaTipoDoc[idx] instanceof HTMLInputElement ){
                saidaTipoDoc[idx].value = valido;
            } else {
                saidaTipoDoc[idx].innerHTML = valido;
            }
        }
    }
}



function formatarDocumento(doc, tipo){
    if(typeof doc === "undefined" || !doc || doc === "") return "";
    if(typeof tipo === "undefined" || !tipo) tipo = "";
    doc = doc.replace(/\D/g, "");
    return mascaraDocumento(doc, tipo);
}

function tipoDocumento(doc){
    var tipo = "CPF/CNPJ";
    if(typeof doc === "undefined" || !doc || doc === "") return tipo;
    doc = doc.replace(/\D/g, "");
    if(doc.length>0 && doc.length<=11) tipo = 'CPF';
    if(doc.length>11 && doc.length<=14) tipo = 'CNPJ';
    return tipo;
}

function mascaraDocumento(doc, tipo){
    if(typeof doc === "undefined" || !doc || doc === "") return "";
    if(typeof tipo === "undefined" || !tipo) tipo = "";
    doc = doc.replace(/\D/g, "");
    var tamanho = doc.length;
    if (tamanho <= 11 && (tipo === "cpf" || tipo === "")) {  
        if(doc.length>2) doc = doc.replace(/(\d{2})$/,"-$1");
        doc = doc.replace(/(\d+)(\d{3}-\d{2})$/g,"$1.$2");
        doc = doc.replace(/(\d+)(\d{3}.*)/,"$1.$2");
    } else {  
        if(doc.length>2) doc = doc.replace(/(\d{2})$/,"-$1");
        doc = doc.replace(/(\d+)(\d{4}-\d{2})$/g,"$1/$2");
        doc = doc.replace(/(\d+)(\d{3}.*)/,"$1.$2");
        if(tamanho>12) doc = doc.replace(/(\d+)(\d{3}.*)/,"$1.$2");
    } 
    return doc;
}

function validaDocumento(doc, tipo){
    var valido = false;
    if(typeof doc === "undefined" || !doc || doc === "") return valido;
    if(typeof tipo === "undefined" || !tipo) tipo = "";
    doc = doc.replace(/\D/g, "");
    if((doc.length>0 && doc.length<=11 && tipo==="") || tipo === "cpf") valido = validarCpf(doc);
    if((doc.length>11 && doc.length<=14 && tipo==="") || (doc.length>0 && tipo === "cnpj")) valido = validarCnpj(doc);
    return valido;
}

function validarCpf(cpf){
    cpf = cpf.replace(/\D/g, "");
    if(cpf.length !== 11) return false;
    
    var filtro = '00000000000,11111111111,22222222222,33333333333,44444444444,55555555555,66666666666,77777777777,88888888888,99999999999,00000000191,19100000000';
    if (filtro.indexOf(cpf)>=0) return false;

    var multiplicador = 2;
    var soma1 = 0;
    var soma2 = 0;
    for (var idx = cpf.length - 2; idx >= 0; idx--) {
        if(idx>0) soma1 += cpf.substring(idx-1, (idx-1) + 1) * multiplicador;
        soma2 += cpf.substring(idx, idx + 1) * multiplicador;
        multiplicador++;
    }
    var resto1 = soma1 % 11;
    var resto2 = soma2 % 11;
    var digito1 = 0;
    var digito2 = 0;
    (resto1 === 1 || resto1 === 0) ? digito1 = 0 : digito1 = 11 - resto1;
    (resto2 === 1 || resto2 === 0) ? digito2 = 0 : digito2 = 11 - resto2;

    if (digito1.toString() !== cpf.substring(cpf.length - 2,cpf.length - 1)) return false;
    if (digito2.toString() !== cpf.substring(cpf.length - 1,cpf.length)) return false;
    return true;
}

function validarCnpj(cnpj){
    cnpj = cnpj.replace(/\D/g, "");
    if(cnpj.length !== 14) return false;
    
    var multiplicador = 2;
    var soma1 = 0;
    var soma2 = 0;
    for (var idx = cnpj.length - 2; idx >= 0; idx--) {
        if(idx>0) soma1 += cnpj.substring(idx-1, (idx-1) + 1) * multiplicador;
        soma2 += cnpj.substring(idx, idx + 1) * multiplicador;
        (multiplicador < 9) ? multiplicador++ : multiplicador = 2;
    }
    var resto1 = soma1 % 11;
    var resto2 = soma2 % 11;
    var digito1 = 0;
    var digito2 = 0;
    (resto1 === 1 || resto1 === 0) ? digito1 = 0 : digito1 = 11 - resto1;
    (resto2 === 1 || resto2 === 0) ? digito2 = 0 : digito2 = 11 - resto2;

    if (digito1.toString() !== cnpj.substring(cnpj.length - 2,cnpj.length - 1)) return false;
    if (digito2.toString() !== cnpj.substring(cnpj.length - 1,cnpj.length)) return false;
    return true;
}
