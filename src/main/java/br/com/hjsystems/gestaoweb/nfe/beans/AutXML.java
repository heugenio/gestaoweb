
package br.com.hjsystems.gestaoweb.nfe.beans;

public class AutXML {
    private String CNPJ;
    private String CPF;

    public AutXML(String CNPJ, String CPF){
        this.CNPJ   = CNPJ;
        this.CPF  = CPF;
    }
    
    public AutXML() {
        
    }

    /**
     * @return the CNPJ
     */
    public String getCNPJ() {
        return CNPJ;
    }

    /**
     * @param CNPJ the CNPJ to set
     */
    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    /**
     * @return the CPF
     */
    public String getCPF() {
        return CPF;
    }

    /**
     * @param CPF the CPF to set
     */
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }


}
