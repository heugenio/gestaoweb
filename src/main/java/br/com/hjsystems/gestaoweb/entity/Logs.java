/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hjsystems.gestaoweb.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name = "LOGS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Logs.findAll", query = "SELECT l FROM Logs l"),
    @NamedQuery(name = "Logs.findByLogsId", query = "SELECT l FROM Logs l WHERE l.logsId = :logsId"),
    @NamedQuery(name = "Logs.findByLogsOperacao", query = "SELECT l FROM Logs l WHERE l.logsOperacao = :logsOperacao"),
    @NamedQuery(name = "Logs.findByLogsTabela", query = "SELECT l FROM Logs l WHERE l.logsTabela = :logsTabela"),
    @NamedQuery(name = "Logs.findByLogsKey", query = "SELECT l FROM Logs l WHERE l.logsKey = :logsKey"),
    @NamedQuery(name = "Logs.findByLogsUsuario", query = "SELECT l FROM Logs l WHERE l.logsUsuario = :logsUsuario"),
    @NamedQuery(name = "Logs.findByLogsLastupdate", query = "SELECT l FROM Logs l WHERE l.logsLastupdate = :logsLastupdate")})
public class Logs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LOGS_ID")
    private String logsId;
    @Basic(optional = false)
    @Column(name = "LOGS_OPERACAO")
    private Character logsOperacao;
    @Basic(optional = false)
    @Column(name = "LOGS_TABELA")
    private String logsTabela;
    @Column(name = "LOGS_KEY")
    private String logsKey;
    @Column(name = "LOGS_USUARIO")
    private String logsUsuario;
    @Column(name = "LOGS_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date logsLastupdate;
    @Lob
    @Column(name = "LOGS_DADOS")
    private String logsDados;

    public Logs() {
    }

    public Logs(String logsId) {
        this.logsId = logsId;
    }

    public Logs(String logsId, Character logsOperacao, String logsTabela) {
        this.logsId = logsId;
        this.logsOperacao = logsOperacao;
        this.logsTabela = logsTabela;
    }

    public String getLogsId() {
        return logsId;
    }

    public void setLogsId(String logsId) {
        this.logsId = logsId;
    }

    public Character getLogsOperacao() {
        return logsOperacao;
    }

    public void setLogsOperacao(Character logsOperacao) {
        this.logsOperacao = logsOperacao;
    }

    public String getLogsTabela() {
        return logsTabela;
    }

    public void setLogsTabela(String logsTabela) {
        this.logsTabela = logsTabela;
    }

    public String getLogsKey() {
        return logsKey;
    }

    public void setLogsKey(String logsKey) {
        this.logsKey = logsKey;
    }

    public String getLogsUsuario() {
        return logsUsuario;
    }

    public void setLogsUsuario(String logsUsuario) {
        this.logsUsuario = logsUsuario;
    }

    public Date getLogsLastupdate() {
        return logsLastupdate;
    }

    public void setLogsLastupdate(Date logsLastupdate) {
        this.logsLastupdate = logsLastupdate;
    }

    public String getLogsDados() {
        return logsDados;
    }

    public void setLogsDados(String logsDados) {
        this.logsDados = logsDados;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (logsId != null ? logsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Logs)) {
            return false;
        }
        Logs other = (Logs) object;
        if ((this.logsId == null && other.logsId != null) || (this.logsId != null && !this.logsId.equals(other.logsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.Logs[ logsId=" + logsId + " ]";
    }
    
}
