
package br.com.hjsystems.gestaoweb.nfeweb;

import java.rmi.RemoteException;

import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;

import br.com.hjsystems.gestaoweb.nfeweb.exception.NfeException;
import br.com.hjsystems.gestaoweb.nfeweb.util.CertificadoUtil;
import br.com.hjsystems.gestaoweb.nfeweb.util.ConstantesUtil;
import br.com.hjsystems.gestaoweb.nfeweb.util.ObjetoUtil;
import br.com.hjsystems.gestaoweb.nfeweb.util.WebServiceUtil;
import br.com.hjsystems.gestaoweb.nfeweb.util.XmlUtil;
import br.inf.portalfiscal.nfe.schema.distdfeint.DistDFeInt;
import br.inf.portalfiscal.nfe.schema.retdistdfeint.RetDistDFeInt;
import br.inf.portalfiscal.www.nfe.wsdl.NFeDistribuicaoDFe.NFeDistribuicaoDFeStub;


/**
 *
 */
public class DistribuicaoDFe {
	
	private static NFeDistribuicaoDFeStub.NfeDistDFeInteresseResponse result;
	private static CertificadoUtil certUtil;

	/**
	 * Classe Reponsavel Por Consultar as NFE na SEFAZ
	 * 
	 * @param nfe
	 * @return nfe
	 */
	public static RetDistDFeInt consultaNfe(DistDFeInt distDFeInt, boolean valida) throws NfeException{
		
		certUtil = new CertificadoUtil();

		try {

			/**
			 * Carrega Informaçoes do Certificado Digital.
			 */
			certUtil.iniciaConfiguracoes();

			String xml = XmlUtil.objectToXml(distDFeInt);
			
			if(valida){
				String erros = Validar.validaXml(xml, Validar.DIST_DFE);
				
				if(!ObjetoUtil.isEmpty(erros)){
					throw new NfeException("Erro Na Validação do Xml: "+erros);
				}
			}
			
			OMElement ome = AXIOMUtil.stringToOM(xml);
			
			NFeDistribuicaoDFeStub.NfeDadosMsg_type0 dadosMsgType0 = new NFeDistribuicaoDFeStub.NfeDadosMsg_type0();  
			dadosMsgType0.setExtraElement(ome);  
			  
			NFeDistribuicaoDFeStub.NfeDistDFeInteresse distDFeInteresse = new NFeDistribuicaoDFeStub.NfeDistDFeInteresse();  
			distDFeInteresse.setNfeDadosMsg(dadosMsgType0);  
			  
			NFeDistribuicaoDFeStub stub = new NFeDistribuicaoDFeStub( WebServiceUtil.getUrl(ConstantesUtil.NFE, ConstantesUtil.SERVICOS.DISTRIBUICAO_DFE));  
			result = stub.nfeDistDFeInteresse(distDFeInteresse);  

			return XmlUtil.xmlToObject(result.getNfeDistDFeInteresseResult().getExtraElement().toString(), RetDistDFeInt.class);  


		} catch (RemoteException | XMLStreamException | JAXBException e) {
			throw new NfeException(e.getMessage());
		}
	}


}
