
package br.com.hjsystems.gestaoweb.nfe.beans;

public class COFINS {
    private COFINSAliq COFINSAliq;
    private COFINSNT COFINSNT;
    private COFINSOutr COFINSOutr;

    public COFINS(COFINSAliq COFINSAliq){
        this.COFINSAliq = COFINSAliq;
    }
    public COFINS(COFINSNT COFINSNT){
        this.COFINSNT = COFINSNT;
    }
    public COFINS(COFINSOutr COFINSOutr){
        this.COFINSOutr = COFINSOutr;
    }
    public COFINS(){
        
    }

}
