/*

Descri��o: Transmiss�o / Autoriza��o do Envio Assincrono de NFe / NFCe

*/
package br.com.hjsystems.gestaoweb.nfeweb.eventos;

import br.com.hjsystems.gestaoweb.nfeweb.Certificado;
import br.com.hjsystems.gestaoweb.nfeweb.ConfiguracoesIniciaisNfe;
import br.com.hjsystems.gestaoweb.nfeweb.ConsultaRecibo;
import br.com.hjsystems.gestaoweb.nfeweb.Nfe;
import br.com.hjsystems.gestaoweb.nfeweb.exception.NfeException;
import br.com.hjsystems.gestaoweb.nfeweb.util.CertificadoUtil;
import br.com.hjsystems.gestaoweb.nfeweb.util.ConstantesUtil;
import br.com.hjsystems.gestaoweb.nfeweb.util.Estados;
import br.com.hjsystems.gestaoweb.nfeweb.util.XmlUtil;
import br.inf.portalfiscal.nfe.schema.consrecinfe.TConsReciNFe;
import br.inf.portalfiscal.nfe.schema.envinfe.TEnviNFe;
import br.inf.portalfiscal.nfe.schema.envinfe.TRetEnviNFe;
import br.inf.portalfiscal.nfe.schema.retconsrecinfe.TRetConsReciNFe;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBException;

public class EnvioAssincrono {
    String ufEmissor = "41";
    String caminhoCertificado;  // = "C:\\nfe\\dados\\empr0001\\certificado.pfx";
    String senhaCertificado;  // = "xyxyxyxy";
    String ambiente;
    Estados estado;
    boolean display = true;

    public EnvioAssincrono(String caminhoCertificado, String senhaCertificado, String ambiente, Estados estado) {
        this.caminhoCertificado = caminhoCertificado;
        this.senhaCertificado   = senhaCertificado;
        this.ambiente           = ambiente;
        this.estado             = estado;
    }
    public ConfiguracoesIniciaisNfe iniciaConfiguracoes() throws NfeException {
            final String PastaSchemas = "C:\\nfe\\Schemas";
            Certificado certificado = CertificadoUtil.certificadoPfx(caminhoCertificado, senhaCertificado);

            return ConfiguracoesIniciaisNfe.iniciaConfiguracoes(estado, ambiente,
                            certificado, PastaSchemas, ConstantesUtil.VERSAO.V3_10);

    }

    public String processar(TEnviNFe enviNFe, String tipo) throws NfeException  {
        String retorno = "";
        TRetEnviNFe retornoEnv = Nfe.enviarNfe(enviNFe, ConstantesUtil.NFE);
        if(!retornoEnv.getCStat().equals("103")){
            throw new NfeException("Status:" + retornoEnv.getCStat() + " - Motivo:" + retornoEnv.getXMotivo());
        }

        String recibo = retornoEnv.getInfRec().getNRec();

        TConsReciNFe consReciNFe = new TConsReciNFe();
        consReciNFe.setVersao("3.10");  //(config.getVersaoNfe());
        consReciNFe.setTpAmb(ambiente);  //(config.getAmbiente());
        consReciNFe.setNRec(recibo);

        TRetConsReciNFe retornoNfe = new TRetConsReciNFe();
        while(true){
            retornoNfe = ConsultaRecibo.reciboNfe(consReciNFe, true, tipo); 
            if(retornoNfe.getCStat().equals("105")){
                try {
                    System.out.println("Lote Em Processamento, vai tentar novamente apos 2 Segundo.");
                    Thread.sleep(2000);
                    continue;
                } catch (InterruptedException ex) {
                    Logger.getLogger(EnvioAssincrono.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                break;
            }
        }

        if(!retornoNfe.getCStat().equals("104")){
            throw new NfeException("Status:" + retornoNfe.getCStat() + " - " + retornoNfe.getXMotivo());
        }

        System.out.println("Status: " + retornoNfe.getProtNFe().get(0).getInfProt().getCStat() + " - " + retornoNfe.getProtNFe().get(0).getInfProt().getXMotivo());
        System.out.println("Data: " + retornoNfe.getProtNFe().get(0).getInfProt().getDhRecbto());
        System.out.println("Protocolo: " + retornoNfe.getProtNFe().get(0).getInfProt().getNProt());

        try {
            System.out.println("XML Final: " + XmlUtil.criaNfeProc(enviNFe, retornoNfe.getProtNFe().get(0)));
        } catch (JAXBException ex) {
            Logger.getLogger(EnvioAssincrono.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    }
}