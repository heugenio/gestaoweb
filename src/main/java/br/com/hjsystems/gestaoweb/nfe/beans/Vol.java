
package br.com.hjsystems.gestaoweb.nfe.beans;

public class Vol {
    private String qVol;
    private String pesoL;
    private String pesoB;

    public Vol(String qVol, String pesoL, String pesoB) {
        this.qVol   = qVol;
        this.pesoL  = pesoL;
        this.pesoB  = pesoB;
    }
    
    public Vol() {
        
    }

    public String getqVol() {
        return qVol;
    }

    public void setqVol(String qVol) {
        this.qVol = qVol;
    }

    public String getPesoL() {
        return pesoL;
    }

    public void setPesoL(String pesoL) {
        this.pesoL = pesoL;
    }

    public String getPesoB() {
        return pesoB;
    }

    public void setPesoB(String pesoB) {
        this.pesoB = pesoB;
    }

}
