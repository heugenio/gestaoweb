/*

Descri��o: 
  
*/
package br.com.hjsystems.gestaoweb.nfeweb.eventos;

//Configura��es NFe

import br.com.hjsystems.gestaoweb.nfeweb.Certificado;
import br.com.hjsystems.gestaoweb.nfeweb.ConfiguracoesIniciaisNfe;
import br.com.hjsystems.gestaoweb.nfeweb.exception.NfeException;
import br.com.hjsystems.gestaoweb.nfeweb.util.CertificadoUtil;
import br.com.hjsystems.gestaoweb.nfeweb.util.ConstantesUtil;
import br.com.hjsystems.gestaoweb.nfeweb.util.Estados;


//Para executar qualquer fun��o NFe, deve-se inicializar as Configura��o.

//Certificado Digital do Repositorio Do Windows A1 e A3:
public class ConfiguracoesNFe {

/*
            public static ConfiguracoesIniciaisNfe iniciaConfigura��es() throws NfeException {
    // Certificado Windows
    Certificado certificado = CertificadoUtil.listaCertificadosWindows().get(0);

    return ConfiguracoesIniciaisNfe.iniciaConfiguracoes(Estados.GO , ConstantesUtil.AMBIENTE.HOMOLOGACAO,
            certificado, "C:\\SRA\\Nfe\\Schemas", ConstantesUtil.VERSAO.V3_10);
}

*/
//Certificado Digital por Arquivo .pfx

public static ConfiguracoesIniciaisNfe iniciaConfiguraoes(Estados estado, String caminho_cert, String senha_cert) throws NfeException {
    // Certificado Arquivo, Parametros: -Caminho Certificado, - Senha
    Certificado certificado = CertificadoUtil.certificadoPfx(caminho_cert, senha_cert);

    return ConfiguracoesIniciaisNfe.iniciaConfiguracoes(estado, "2",
            certificado, "C:\\Nfe\\Schemas", "3.10");
}

}
//Para Iniciar as Configura��es utilize os Parametros:

//C�digo da UF
//Ambiente (1 - Produ��o, 2 - Homologa��o)
//Certificado
//Caminho da pasta que se encontra os Schemas Xsd
//Vers�o da NFE.