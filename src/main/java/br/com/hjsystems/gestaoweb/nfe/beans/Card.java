
package br.com.hjsystems.gestaoweb.nfe.beans;

public class Card {
    private String tpIntegra;
    private String CNPJ;
    private String tBand;
    private String cAut;
    

    public Card(String tpIntegra, String CNPJ, String tBand, String cAut){
        this.tpIntegra   = tpIntegra;
        this.CNPJ   = CNPJ;
        this.tBand   = tBand;
        this.cAut   = cAut;
    }

}
