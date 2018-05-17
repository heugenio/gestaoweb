
package br.com.hjsystems.gestaoweb.nfe.beans;

public class ICMS10 {
    private String orig;
    private String CST;
    private String modBC;
    private String vBC;
    private String pICMS;
    private String vICMS;
    private String modBCST;
    private String pMVAST;
    private String vBCST;
    private String pICMSST;
    private String vICMSST;
    
    public ICMS10(String orig, String CST, String modBC, String vBC, String pICMS, String vICMS, String modBCST, String pMVAST, String vBCST, String pICMSST, String vICMSST){
        this.orig = orig;
        this.CST = CST;
        this.modBC = modBC;
        this.vBC = vBC;
        this.pICMS = pICMS;
        this.vICMS = vICMS;
        this.modBC = modBCST;
        this.pMVAST = pMVAST;
        this.vBCST = vBCST;
        this.pICMSST = pICMSST;
        this.vICMSST = vICMSST;
    }

}
