
package br.com.hjsystems.gestaoweb.nfe.beans;

public class Transp {
    private String modFrete;
    private Transporta transporta;
    private VeicTransp veicTransp;
    private Vol vol;

    public Transp(String modFrete, Transporta transporta, VeicTransp veicTransp, Vol vol){
        this.modFrete       = modFrete;
        this.transporta     = transporta;
        this.veicTransp     = veicTransp;
        this.vol            = vol;
    }
    public Transp(){
        
    }

}
