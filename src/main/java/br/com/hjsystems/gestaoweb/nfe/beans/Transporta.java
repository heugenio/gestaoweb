
package br.com.hjsystems.gestaoweb.nfe.beans;

public class Transporta {
    private String CNPJ;
    private String CPF;
    private String xNome;
    private String IE;
    private String xEnder;
    private String xMun;
    private String UF;

    public Transporta( String CNPJ, String CPF, String xNome, String IE, String xEnder, String xMun, String UF){
        this.CNPJ   = CNPJ;
        this.CPF    = CPF;
        this.IE     = IE;
        this.UF     = UF;
        this.xEnder = xEnder;
        this.xMun   = xMun;
        this.xNome  = xNome;
    }

}
