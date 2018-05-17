
package br.com.hjsystems.gestaoweb.nfe.beans;

public class Dup {
    private String nDup;
    private String dVenc;
    private String vDup;

    public Dup(String nDup, String dVenc, String vDup){
        this.nDup   = nDup;
        this.dVenc  = dVenc;
        this.vDup   = vDup;
    }
    
    public Dup() {
        
    }

    public String getnDup() {
        return nDup;
    }

    public void setnDup(String nDup) {
        this.nDup = nDup;
    }

    public String getdVenc() {
        return dVenc;
    }

    public void setdVenc(String dVenc) {
        this.dVenc = dVenc;
    }

    public String getvDup() {
        return vDup;
    }

    public void setvDup(String vDup) {
        this.vDup = vDup;
    }

}
