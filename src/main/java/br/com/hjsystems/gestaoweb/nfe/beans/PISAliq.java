
package br.com.hjsystems.gestaoweb.nfe.beans;

public class PISAliq {
    private String CST;
    private String vBC;
    private String pPIS;
    private String vPIS;
    
    public PISAliq() {
        
    }

    public PISAliq(String CST, String vBC, String pPIS, String vPIS){
        this.CST = CST;
        this.vBC = vBC;
        this.pPIS = pPIS;
        this.vPIS = vPIS;
    }

    public String getCST() {
        return CST;
    }

    public void setCST(String CST) {
        this.CST = CST;
    }

    public String getvBC() {
        return vBC;
    }

    public void setvBC(String vBC) {
        this.vBC = vBC;
    }

    public String getpPIS() {
        return pPIS;
    }

    public void setpPIS(String pPIS) {
        this.pPIS = pPIS;
    }

    public String getvPIS() {
        return vPIS;
    }

    public void setvPIS(String vPIS) {
        this.vPIS = vPIS;
    }

}
