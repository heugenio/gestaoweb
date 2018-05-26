/*
 * Autor: Daniel Filho 
 * Data : 21/05/2018 
*/

function converteNumeros(string)
{
    var numsStr = string.replace(/[^0-9]/g, '');
    return parseInt(numsStr);
}

function converteNumerosString(string)
{
    var numsStr = string.replace(/[^0-9]/g, '');
    return numsStr;
}

// Metodo para validar o campo com ou sem o http://
$.validator.addMethod("url_teste", function(value, element) { 
	if(value.substr(0,7) != 'http://'){
		value = 'http://' + value;
	}
	if(value.substr(value.length-1, 1) != '/'){
		value = value + '/';
	}
	return this.optional(element) || /^(http|https|ftp):\/\/[a-z0-9]+([\-\.]{1}[a-z0-9]+)*\.[a-z]{2,5}(:[0-9]{1,5})?(\/.*)?$/i.test(value); 
}, "Not valid url.");

var languagePtBr = {
	"sInfo": "Mostrando de _START_ até _END_ de _TOTAL_ registros",
    "sInfoEmpty": "Mostrando 0 até 0 de 0 registros",
    "sEmptyTable": "Nenhum registro encontrado",
    "sInfoFiltered": "(Filtrados de _MAX_ registros)",
    "sInfoPostFix": "",
    "sInfoThousands": ".",
    "sLengthMenu": "", //Exibindo _MENU_ resultados por página
    "sLoadingRecords": "Carregando...",
    "sProcessing": "Processando...",
    "sZeroRecords": "Nenhum registro encontrado",
    "sSearch": "Pesquisar",
    "oPaginate": {
        "sNext": "Próximo",
        "sPrevious": "Anterior",
        "sFirst": "Primeiro",
        "sLast": "Último"
    },
    "oAria": {
        "sSortAscending": ": Ordenar colunas de forma ascendente",
        "sSortDescending": ": Ordenar colunas de forma descendente"
    }
};


var iniciaDatePiker = function(){
	$('.datePikerGeral').pickadate({
	    selectMonths: true, 
	    selectYears: 15, 
	    today: 'Hoje',
	    clear: 'Limpar',
	    close: 'Ok',
	    closeOnSelect: false,
	    container: undefined, 
        labelMonthNext: 'Próx. Mês',
        labelMonthPrev: 'Mês Ant.',
        labelMonthSelect: 'Selecione o mês',
        labelYearSelect: 'Selecione o ano',
        monthsFull: [ 'Janeiro', 'Fevereiro', 'Marco', 'Abril', 'Maio', 'Junho', 'Julho', 'Agosto', 'Setembro', 'Outubro', 'Novembro', 'Dezembro' ],
        monthsShort: [ 'Jan', 'Fev', 'Mar', 'Abr', 'Mai', 'Jun', 'Jul', 'Aug', 'Set', 'Out', 'Nov', 'Dez' ],
        weekdaysFull: [ 'Domingo', 'Segunda', 'Terça', 'Quarta', 'Quinta', 'Sexta', 'Sabado' ],
        weekdaysShort: [ 'Dom', 'Seg', 'Ter', 'Qua', 'Qui', 'Sex', 'Sab' ],
        weekdaysLetter: [ 'D', 'S', 'T', 'Q', 'Q', 'S', 'S' ],
        closeOnSelect: false,
        format: 'dd/mm/yyyy',
        formatSubmit: 'yyyy/mm/dd',
        hiddenPrefix: '',
        hiddenSuffix: ''
	  });
};

var iniciaDatePikerMes = function(){
	$('.datePikerMes').pickadate({
	    selectMonths: true, 
	    selectYears: 15, 
	    today: 'Hoje',
	    clear: 'Limpar',
	    close: 'Ok',
	    closeOnSelect: false,
	    container: undefined, 
        labelMonthNext: 'Próx. Mês',
        labelMonthPrev: 'Mês Ant.',
        labelMonthSelect: 'Selecione o mês',
        labelYearSelect: 'Selecione o ano',
        monthsFull: [ 'Janeiro', 'Fevereiro', 'Marco', 'Abril', 'Maio', 'Junho', 'Julho', 'Agosto', 'Setembro', 'Outubro', 'Novembro', 'Dezembro' ],
        monthsShort: [ 'Jan', 'Fev', 'Mar', 'Abr', 'Mai', 'Jun', 'Jul', 'Aug', 'Set', 'Out', 'Nov', 'Dez' ],
        weekdaysFull: [ 'Domingo', 'Segunda', 'Terça', 'Quarta', 'Quinta', 'Sexta', 'Sabado' ],
        weekdaysShort: [ 'Dom', 'Seg', 'Ter', 'Qua', 'Qui', 'Sex', 'Sab' ],
        weekdaysLetter: [ 'D', 'S', 'T', 'Q', 'Q', 'S', 'S' ],
        closeOnSelect: false,
        formatSubmit: 'yyyy-mm-dd',
        format: 'mm-yyyy',
        hiddenPrefix: '',
        hiddenSuffix: ''
	  });
};
