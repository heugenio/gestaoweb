
package br.com.hjsystems.gestaoweb.nfe.beans;

public class Det {
    private String nItem;
    private Prod prod;
    private Imposto imposto;

    public Det(String nItem, Prod prod, Imposto imposto){
        this.nItem      = nItem;
        this.prod       = prod;
        this.imposto    = imposto;
    }

   // public det(){
   //
   // }
}