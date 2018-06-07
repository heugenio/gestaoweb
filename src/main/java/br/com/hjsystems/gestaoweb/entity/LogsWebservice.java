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
@Table(name = "LOGS_WEBSERVICE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LogsWebservice.findAll", query = "SELECT l FROM LogsWebservice l"),
    @NamedQuery(name = "LogsWebservice.findByLgwsId", query = "SELECT l FROM LogsWebservice l WHERE l.lgwsId = :lgwsId"),
    @NamedQuery(name = "LogsWebservice.findByLgwsTabela", query = "SELECT l FROM LogsWebservice l WHERE l.lgwsTabela = :lgwsTabela"),
    @NamedQuery(name = "LogsWebservice.findByLgwsData", query = "SELECT l FROM LogsWebservice l WHERE l.lgwsData = :lgwsData")})
public class LogsWebservice implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LGWS_ID")
    private String lgwsId;
    @Column(name = "LGWS_TABELA")
    private String lgwsTabela;
    @Column(name = "LGWS_DATA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lgwsData;
    @Lob
    @Column(name = "LGWS_LOG")
    private String lgwsLog;

    public LogsWebservice() {
    }

    public LogsWebservice(String lgwsId) {
        this.lgwsId = lgwsId;
    }

    public String getLgwsId() {
        return lgwsId;
    }

    public void setLgwsId(String lgwsId) {
        this.lgwsId = lgwsId;
    }

    public String getLgwsTabela() {
        return lgwsTabela;
    }

    public void setLgwsTabela(String lgwsTabela) {
        this.lgwsTabela = lgwsTabela;
    }

    public Date getLgwsData() {
        return lgwsData;
    }

    public void setLgwsData(Date lgwsData) {
        this.lgwsData = lgwsData;
    }

    public String getLgwsLog() {
        return lgwsLog;
    }

    public void setLgwsLog(String lgwsLog) {
        this.lgwsLog = lgwsLog;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lgwsId != null ? lgwsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LogsWebservice)) {
            return false;
        }
        LogsWebservice other = (LogsWebservice) object;
        if ((this.lgwsId == null && other.lgwsId != null) || (this.lgwsId != null && !this.lgwsId.equals(other.lgwsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.LogsWebservice[ lgwsId=" + lgwsId + " ]";
    }
    
}
