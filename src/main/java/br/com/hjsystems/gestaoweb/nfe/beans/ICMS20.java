
package br.com.hjsystems.gestaoweb.nfe.beans;

public class ICMS20 {
    private String orig;
    private String CST;
    private String modBC;
    private String pRedBC;
    private String vBC;
    private String pICMS;
    private String vICMS;
    
    public ICMS20(String orig, String CST, String modBC, String pRedBC, String vBC, String pICMS, String vICMS){
        this.orig = orig;
        this.CST = CST;
        this.modBC = modBC;
        this.pRedBC = pRedBC;
        this.vBC = vBC;
        this.pICMS = pICMS;
        this.vICMS = vICMS;
    }

}
