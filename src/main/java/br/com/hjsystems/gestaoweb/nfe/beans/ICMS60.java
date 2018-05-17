
package br.com.hjsystems.gestaoweb.nfe.beans;

public class ICMS60 {
    private String orig;
    private String CST;
    private String vBCSTRet;
    private String vICMSSTRet;
    
    public ICMS60(String orig, String CST){
        this.orig = orig;
        this.CST  = CST;
    }

    public ICMS60(String orig, String CST, String vBCSTRet, String vICMSSTRet){
        this.orig = orig;
        this.CST  = CST;
        this.vBCSTRet = vBCSTRet;
        this.vICMSSTRet = vICMSSTRet;
    }

}
