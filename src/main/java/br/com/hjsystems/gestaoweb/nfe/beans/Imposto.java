
package br.com.hjsystems.gestaoweb.nfe.beans;

public class Imposto {
    private String vTotTrib;
    private ICMS ICMS;
    private PIS PIS;
    private COFINS COFINS;

    public Imposto( String vTotTrib, ICMS ICMS, PIS PIS, COFINS COFINS){
        this.vTotTrib = vTotTrib;
        this.ICMS   = ICMS;
        this.PIS    = PIS;
        this.COFINS = COFINS;
    }
    public Imposto(){}
}
