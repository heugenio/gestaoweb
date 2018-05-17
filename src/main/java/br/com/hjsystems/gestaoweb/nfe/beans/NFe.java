
package br.com.hjsystems.gestaoweb.nfe.beans;

public class NFe {

	private final String xmlns="http://www.portalfiscal.inf.br/nfe"; //\"\nxmlns:ds=\"http://www.w3.org/2000/09/xmldsig#\"\nxmlns:xsi=\"www.w3.org/2001/XMLSchema-instance\"";
        private InfNFe infNFe;
        private InfNFeSupl infNFeSupl;

	public NFe(InfNFe infNFe, InfNFeSupl infNFeSupl) {
		this.infNFe = infNFe;
		this.infNFeSupl = infNFeSupl;
	}
	

}
