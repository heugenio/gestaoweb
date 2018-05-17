
package br.com.hjsystems.gestaoweb.nfe.beans;

public class ICMS00 {
    private String orig;
    private String CST;
    private String modBC;
    private String vBC;
    private String pICMS;
    private String vICMS;
    
    public ICMS00(String orig, String CST, String modBC, String vBC, String pICMS, String vICMS){
        this.orig = orig;
        this.CST = CST;
        this.modBC = modBC;
        this.vBC = vBC;
        this.pICMS = pICMS;
        this.vICMS = vICMS;
    }
    
    public ICMS00() {
        
    }

    public String getOrig() {
        return orig;
    }

    public void setOrig(String orig) {
        this.orig = orig;
    }

    public String getCST() {
        return CST;
    }

    public void setCST(String CST) {
        this.CST = CST;
    }

    public String getModBC() {
        return modBC;
    }

    public void setModBC(String modBC) {
        this.modBC = modBC;
    }

    public String getvBC() {
        return vBC;
    }

    public void setvBC(String vBC) {
        this.vBC = vBC;
    }

    public String getpICMS() {
        return pICMS;
    }

    public void setpICMS(String pICMS) {
        this.pICMS = pICMS;
    }

    public String getvICMS() {
        return vICMS;
    }

    public void setvICMS(String vICMS) {
        this.vICMS = vICMS;
    }

}
