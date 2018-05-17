package br.com.hjsystems.gestaoweb.entity;

/*

Descrição: POJO da Configuração do email
*/

import java.io.Serializable;

public class Email implements Serializable
{
    private String hostName;
    private String nomeRemet;
    private String emailRemet;
    private String senhaEmail;
    private String portaEmail;
    private boolean ssl;

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getNomeRemet() {
        return nomeRemet;
    }

    public void setNomeRemet(String nomeRemet) {
        this.nomeRemet = nomeRemet;
    }

    public String getEmailRemet() {
        return emailRemet;
    }

    public void setEmailRemet(String emailRemet) {
        this.emailRemet = emailRemet;
    }

    public String getSenhaEmail() {
        return senhaEmail;
    }

    public void setSenhaEmail(String senhaEmail) {
        this.senhaEmail = senhaEmail;
    }

    public String getPortaEmail() {
        return portaEmail;
    }

    public void setPortaEmail(String portaEmail) {
        this.portaEmail = portaEmail;
    }

    public boolean isSsl() {
        return ssl;
    }

    public void setSsl(boolean ssl) {
        this.ssl = ssl;
    }
}
