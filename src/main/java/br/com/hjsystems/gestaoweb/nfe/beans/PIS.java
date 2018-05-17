
package br.com.hjsystems.gestaoweb.nfe.beans;

public class PIS {
    private PISAliq PISAliq;
    private PISNT PISNT;
    private PISOutr PISOutr;

    public PIS(PISAliq PISAliq){
        this.PISAliq = PISAliq;
    }
    public PIS(PISNT PISNT){
        this.PISNT = PISNT;
    }
    public PIS(PISOutr PISOutr){
        this.PISOutr = PISOutr;
    }
    public PIS(){
        
    }

}
