/*

Descri��o: Efetua a Consulta da Situa��o da NFe / NFCe
*/
package br.com.hjsystems.gestaoweb.nfeweb.eventos;

import br.com.hjsystems.gestaoweb.nfeweb.Certificado;
import br.com.hjsystems.gestaoweb.nfeweb.ConfiguracoesIniciaisNfe;
import br.com.hjsystems.gestaoweb.nfeweb.Nfe;
import br.com.hjsystems.gestaoweb.nfeweb.exception.NfeException;
import br.com.hjsystems.gestaoweb.nfeweb.util.CertificadoUtil;
import br.com.hjsystems.gestaoweb.nfeweb.util.ConstantesUtil;
import br.com.hjsystems.gestaoweb.nfeweb.util.Estados;
import br.com.hjsystems.gestaoweb.nfeweb.util.XmlUtil;
import br.inf.portalfiscal.nfe.schema.conssitnfe.TConsSitNFe;
import br.inf.portalfiscal.nfe.schema.retconssitnfe.TRetConsSitNFe;
import javax.swing.JOptionPane;
import javax.xml.bind.JAXBException;
import javax.xml.bind.UnmarshalException;

public class ConsultarNFe {
    String ufEmissor = "41";
    String caminhoCertificado;  // = "C:\\nfe\\dados\\empr0001\\certificado.pfx";
    String senhaCertificado;  // = "xyxyxyxy";
    String ambiente;
    Estados estado;
    String numero;
    String modelo;
    boolean display = true;

    public ConsultarNFe(String caminhoCertificado, String senhaCertificado, String ambiente, String numero, String modelo, Estados estado) {
        this.caminhoCertificado = caminhoCertificado;
        this.senhaCertificado   = senhaCertificado;
        this.ambiente           = ambiente;
        this.numero             = numero;
        this.modelo             = modelo;
        this.estado             = estado;
        
    }
	public ConfiguracoesIniciaisNfe iniciaConfiguracoes() throws NfeException {
                final String PastaSchemas = "C:\\nfe\\Schemas";
                Certificado certificado = null;
                if (caminhoCertificado.indexOf("token.cfg") == -1) {  //  o certificado � do tipoA1
                    certificado = CertificadoUtil.certificadoPfx(caminhoCertificado, senhaCertificado);
                } else {  //  o certificado � do tipoA# (Cart�o)
                    certificado = CertificadoUtil.certificadoA3(caminhoCertificado, senhaCertificado);
                }
		
		return ConfiguracoesIniciaisNfe.iniciaConfiguracoes(estado, ambiente,
				certificado, PastaSchemas, ConstantesUtil.VERSAO.V3_10);
		
	}

        
    public String processar(
            String chave
        ) {
        
        String retorno = "erro";
        try {
            //Inicia As Configura��es
            ConfiguracoesIniciaisNfe config = iniciaConfiguracoes();

            TConsSitNFe consSitNFe = new TConsSitNFe();
            consSitNFe.setVersao(config.getVersaoNfe());
            consSitNFe.setTpAmb(config.getAmbiente());
            consSitNFe.setXServ("CONSULTAR");
            //Substitua os X Pela Chave que deseja Consultar
            consSitNFe.setChNFe(chave);

            String tipoNFe;
            if (modelo.equals("55")) {
                tipoNFe = ConstantesUtil.NFE;
            } else {
                tipoNFe = ConstantesUtil.NFCE;
            }
            System.out.println("ConsultarNFe.processar() - modelo: "+modelo);
            //Informe false para n�o fazer a valida��o do XML - Ganho De tempo.  
            TRetConsSitNFe retornoCon = Nfe.consultaXml(consSitNFe,true,tipoNFe);
            if (retornoCon != null) {
                System.out.println( "Numero: "+numero);
                System.out.println("Modelo: "+modelo+" - Tipo: "+tipoNFe);
                System.out.println("Status:" + retornoCon.getCStat());
                System.out.println("Motivo:" + retornoCon.getXMotivo());
                String dataMotivo = "";
                if (retornoCon.getProtNFe() != null) {
                   dataMotivo = retornoCon.getProtNFe().getInfProt().getDhRecbto().toString();
                }
                System.out.println("Data:" + dataMotivo);
                retorno = retornoCon.getCStat()+"-"+retornoCon.getXMotivo();

    JOptionPane.showMessageDialog(null, 
                "Numero: "+numero
            + "\nModelo: "+modelo+" - Tipo: "+tipoNFe
            + "\nStatus: " + retornoCon.getCStat() 
            + "\nMotivo: " + retornoCon.getXMotivo() 
            + "\nData: " + dataMotivo
        );

                //Transforma O ProtNfe do Retorno em XML
                if (retornoCon.getProtNFe() != null) {
                    String xmlProtNfe = XmlUtil.objectToXml(retornoCon.getProtNFe());
                    System.out.println(xmlProtNfe);
                }
            }

        } catch (NfeException | JAXBException e) {
            JOptionPane.showMessageDialog(null, "Erro:" + e.getMessage());

        }
        return retorno;
    }
}