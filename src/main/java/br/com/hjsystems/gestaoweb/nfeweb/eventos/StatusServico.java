/*

Descri��o: Classe para Consulta do Status do Servi�o da Receita Estadual 

*/
package br.com.hjsystems.gestaoweb.nfeweb.eventos;

import br.com.hjsystems.gestaoweb.nfeweb.Certificado;
import br.com.hjsystems.gestaoweb.nfeweb.ConfiguracoesIniciaisNfe;
import br.com.hjsystems.gestaoweb.nfeweb.Nfe;
import br.com.hjsystems.gestaoweb.nfeweb.exception.NfeException;
import br.com.hjsystems.gestaoweb.nfeweb.util.CertificadoUtil;
import br.com.hjsystems.gestaoweb.nfeweb.util.ConstantesUtil;
import br.com.hjsystems.gestaoweb.nfeweb.util.Estados;
import br.inf.portalfiscal.nfe.schema.consstatserv.TConsStatServ;
import br.inf.portalfiscal.nfe.schema.retconsstatserv.TRetConsStatServ;
import java.util.List;
import javax.swing.JOptionPane;

public class StatusServico {
    String caminhoCertificado;
    String senhaCertificado;
    String ambiente;
    Estados estado;
    boolean display = false;

    public StatusServico(String caminhoCertificado, String senhaCertificado, String ambiente, Estados estado) {
        this.caminhoCertificado = caminhoCertificado;
        this.senhaCertificado   = senhaCertificado;
        this.ambiente           = ambiente;
        this.estado             = estado;
    //  a linha abaixo habilita o debug na saida do netbeans    
    //  System.setProperty("javax.net.debug", "all");
    }
    public ConfiguracoesIniciaisNfe iniciaConfiguracoes() throws NfeException {
            final String PastaSchemas = "C:\\nfe\\Schemas";
            Certificado certificado = null;
if (display) JOptionPane.showMessageDialog(null, "StatusServico.iniciaConfigura��es() - entrou no metodo c/caminho certif.: " + caminhoCertificado + " - senhacertif.: " + senhaCertificado );
            if (caminhoCertificado.indexOf("token.cfg") == -1) {  //  o certificado � do tipoA1
if (display) JOptionPane.showMessageDialog(null, "StatusServico.iniciaConfigura��es() - tipo A1. . ." );
                certificado = CertificadoUtil.certificadoPfx(caminhoCertificado, senhaCertificado);
            } else {  //  o certificado � do tipoA# (Cart�o)
if (display) JOptionPane.showMessageDialog(null, "StatusServico.iniciaConfigura��es() - tipo A3. . ." );
                certificado = CertificadoUtil.certificadoA3(caminhoCertificado, senhaCertificado);
            }
if (display) JOptionPane.showMessageDialog(null, "StatusServico.iniciaConfigura��es() - Passou tipo . . ." );
/*
            System.out.println("Nome do certificado: "+certificado.getNome()+"\n"
                                + "Senha do Certificado: "+certificado.getSenha()+"\n"
                                + "Vencimento: "+certificado.getVencimento());
*/
if (display) JOptionPane.showMessageDialog(null, "StatusServico.iniciaConfigura��es() - " + "Nome do certificado: "+certificado.getNome()+"\n"
                                + "Senha do Certificado: "+certificado.getSenha()+"\n"
                                + "Vencimento: "+certificado.getVencimento());
            return ConfiguracoesIniciaisNfe.iniciaConfiguracoes(estado, ambiente,
                            certificado, PastaSchemas, ConstantesUtil.VERSAO.V3_10);
    }
    public String processar(String tipoNFe) {
        String retorno = "erro";
        try {
if (display) JOptionPane.showMessageDialog(null, "StatusServico - Passou 1 . . ." );
                //Inicia As Configura��es
                ConfiguracoesIniciaisNfe config = iniciaConfiguracoes();
if (display) JOptionPane.showMessageDialog(null, "StatusServico - Passou 1.1 . . ." );

                TConsStatServ consStatServ = new TConsStatServ();
                consStatServ.setTpAmb(config.getAmbiente());
if (display) JOptionPane.showMessageDialog(null, "StatusServico - Passou 1.2 . . ." );
                consStatServ.setCUF(config.getEstado().getCodigoIbge());
if (display) JOptionPane.showMessageDialog(null, "StatusServico - Passou 1.3 . . ." );
                consStatServ.setVersao(config.getVersaoNfe());
                consStatServ.setXServ("STATUS");
if (display) JOptionPane.showMessageDialog(null, "StatusServico - Passou 2 . . ." );

                //Informe false para n�o fazer a valida��o do XML - Ganho De tempo.
                TRetConsStatServ retornoRet = Nfe.statusServico(consStatServ,false, tipoNFe);
if (display) JOptionPane.showMessageDialog(null, "StatusServico - Passou 3 . . ." );
                System.out.println("Status:" + retornoRet.getCStat());
                System.out.println("Motivo:" + retornoRet.getXMotivo());
                System.out.println("Data:" + retornoRet.getDhRecbto());
            retorno = retornoRet.getCStat()+"-"+retornoRet.getXMotivo();

if (display) JOptionPane.showMessageDialog(null, "Status:" + retornoRet.getCStat() + "\nMotivo:" + retornoRet.getXMotivo() + "\nData:" + retornoRet.getDhRecbto());

            } catch (NfeException e) {
                System.out.println("Erro:" + e.getMessage());
            }
        return retorno;
    }
}