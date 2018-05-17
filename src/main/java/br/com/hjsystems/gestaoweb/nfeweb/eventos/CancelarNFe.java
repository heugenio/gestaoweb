/*

Descri��o: Transmiss�o / Autoriza��o do Cancelamento da NFe / NFCe

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
import br.inf.portalfiscal.nfe.schema.envEventoCancNFe.TEnvEvento;
import br.inf.portalfiscal.nfe.schema.envEventoCancNFe.TEvento;
import br.inf.portalfiscal.nfe.schema.envEventoCancNFe.TEvento.InfEvento;
import br.inf.portalfiscal.nfe.schema.envEventoCancNFe.TEvento.InfEvento.DetEvento;
import br.inf.portalfiscal.nfe.schema.envEventoCancNFe.TProcEvento;
import br.inf.portalfiscal.nfe.schema.envEventoCancNFe.TRetEnvEvento;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.xml.bind.JAXBException;
public class CancelarNFe {
    String ufEmissor = "41";
    String caminhoCertificado;  // = "C:\\nfe\\dados\\empr0001\\certificado.pfx";
    String senhaCertificado;  // = "xyxyxyxy";
    String ambiente;
    Estados estado;
    boolean display = true;

    public CancelarNFe(String caminhoCertificado, String senhaCertificado, String ambiente, Estados estado) {
        this.caminhoCertificado = caminhoCertificado;
        this.senhaCertificado   = senhaCertificado;
        this.ambiente           = ambiente;
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
/*		
                System.out.println("Nome do certificado: "+certificado.getNome()+"\n"
                                + "Senha do Certificado: "+certificado.getSenha()+"\n"
                                + "Vencimento: "+certificado.getVencimento());
*/        
		return ConfiguracoesIniciaisNfe.iniciaConfiguracoes(estado, ambiente,
				certificado, PastaSchemas, ConstantesUtil.VERSAO.V3_10);
		
	}

        
    public String processar(
            String ufEmissor, 
            String cnpjEmissor,
            String chave,
            String lote,
            String prot, 
            String just,
            String tipoNFe,
            String fuso_horario
        ) {
        
        String retorno = "erro";
        try{
            //Inicia As Configura��es
            ConfiguracoesIniciaisNfe config = iniciaConfiguracoes();

            //Troque o X pela Chave
            //String chave = "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";

            //Troque o Y pelo Protocolo
            //String prot = "YYYYYYYYYYYYYY";
            String id = "ID110111"+chave+"01";

            TEnvEvento enviEvento = new TEnvEvento();
            enviEvento.setVersao("1.00");
            enviEvento.setIdLote(lote);

            TEvento eventoCancela = new TEvento();
            eventoCancela.setVersao("1.00");

            InfEvento infoEvento = new InfEvento();
            infoEvento.setId(id);
            infoEvento.setChNFe(chave);
            infoEvento.setCOrgao(ufEmissor);  //("52");
            infoEvento.setTpAmb(config.getAmbiente());

            
            infoEvento.setCNPJ(cnpjEmissor);

            Date data = new Date();
            final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
            String dataHoraGMT = sdf.format(data) + fuso_horario;
            
            infoEvento.setDhEvento(dataHoraGMT);  //("2016-08-30T17:46:03-03:00");
            infoEvento.setTpEvento("110111");
            infoEvento.setNSeqEvento("1");
            infoEvento.setVerEvento("1.00");

            DetEvento detEvento = new DetEvento();
            detEvento.setVersao("1.00");
            detEvento.setDescEvento("Cancelamento");
            detEvento.setNProt(prot);
            detEvento.setXJust(just);
            infoEvento.setDetEvento(detEvento);
            eventoCancela.setInfEvento(infoEvento);
            enviEvento.getEvento().add(eventoCancela);

                        //Informe false para n�o fazer a valida��o do XML - Ganho De tempo. 
            TRetEnvEvento retornoCanc = Nfe.cancelarNfe(enviEvento,true, tipoNFe);
            System.out.println("Status:" + retornoCanc.getRetEvento().get(0).getInfEvento().getCStat());
            System.out.println("Motivo:" + retornoCanc.getRetEvento().get(0).getInfEvento().getXMotivo());
            System.out.println("Data:" + retornoCanc.getRetEvento().get(0).getInfEvento().getDhRegEvento());
            retorno = retornoCanc.getCStat()+"-"+retornoCanc.getXMotivo();

JOptionPane.showMessageDialog(null, "Status:" + retornoCanc.getRetEvento().get(0).getInfEvento().getCStat() 
        + "\nMotivo:" + retornoCanc.getRetEvento().get(0).getInfEvento().getXMotivo() 
        + "\nData:" + retornoCanc.getRetEvento().get(0).getInfEvento().getDhRegEvento()
    );

            // Cria TProcEventoNFe
            TProcEvento procEvento = new TProcEvento();
            procEvento.setVersao("1.00");
            procEvento.setEvento(eventoCancela);
            procEvento.setRetEvento(retornoCanc.getRetEvento().get(0));

            System.out.println(XmlUtil.objectToXml(procEvento));

        } catch (NfeException | JAXBException e) {
            System.out.println("Erro:" + e.getMessage());
        }
        return retorno;
    }
}