
package br.com.hjsystems.gestaoweb.nfe.beans;

import java.util.Date;

public class Dpecbean {
    private int numeronf;
    private String data_emissao;
    private String chavenfe;
    private String data_transmissao;
    private String empresa;

    public int getNumeronf() {
        return numeronf;
    }

    public void setNumeronf(int numeronf) {
        this.numeronf = numeronf;
    }

    public String getData_emissao() {
        return data_emissao;
    }

    public void setData_emissao(String data_emissao) {
        this.data_emissao = data_emissao;
    }

    public String getChavenfe() {
        return chavenfe;
    }

    public void setChavenfe(String chavenfe) {
        this.chavenfe = chavenfe;
    }

    public String getData_transmissao() {
        return data_transmissao;
    }

    public void setData_transmissao(String data_transmissao) {
        this.data_transmissao = data_transmissao;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }


}
