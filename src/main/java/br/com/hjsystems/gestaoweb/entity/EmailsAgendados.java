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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "EMAILS_AGENDADOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EmailsAgendados.findAll", query = "SELECT e FROM EmailsAgendados e"),
    @NamedQuery(name = "EmailsAgendados.findByEmagId", query = "SELECT e FROM EmailsAgendados e WHERE e.emagId = :emagId"),
    @NamedQuery(name = "EmailsAgendados.findByEmagData", query = "SELECT e FROM EmailsAgendados e WHERE e.emagData = :emagData"),
    @NamedQuery(name = "EmailsAgendados.findByEmagStatus", query = "SELECT e FROM EmailsAgendados e WHERE e.emagStatus = :emagStatus"),
    @NamedQuery(name = "EmailsAgendados.findByEmagLastupdate", query = "SELECT e FROM EmailsAgendados e WHERE e.emagLastupdate = :emagLastupdate")})
public class EmailsAgendados implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "EMAG_ID")
    private String emagId;
    @Column(name = "EMAG_DATA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date emagData;
    @Basic(optional = false)
    @Column(name = "EMAG_STATUS")
    private String emagStatus;
    @Column(name = "EMAG_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date emagLastupdate;
    @JoinColumn(name = "EMLS_ID", referencedColumnName = "EMLS_ID")
    @ManyToOne
    private Emails emlsId;
    @JoinColumn(name = "PESS_ID", referencedColumnName = "PESS_ID")
    @ManyToOne
    private Pessoas pessId;

    public EmailsAgendados() {
    }

    public EmailsAgendados(String emagId) {
        this.emagId = emagId;
    }

    public EmailsAgendados(String emagId, String emagStatus) {
        this.emagId = emagId;
        this.emagStatus = emagStatus;
    }

    public String getEmagId() {
        return emagId;
    }

    public void setEmagId(String emagId) {
        this.emagId = emagId;
    }

    public Date getEmagData() {
        return emagData;
    }

    public void setEmagData(Date emagData) {
        this.emagData = emagData;
    }

    public String getEmagStatus() {
        return emagStatus;
    }

    public void setEmagStatus(String emagStatus) {
        this.emagStatus = emagStatus;
    }

    public Date getEmagLastupdate() {
        return emagLastupdate;
    }

    public void setEmagLastupdate(Date emagLastupdate) {
        this.emagLastupdate = emagLastupdate;
    }

    public Emails getEmlsId() {
        return emlsId;
    }

    public void setEmlsId(Emails emlsId) {
        this.emlsId = emlsId;
    }

    public Pessoas getPessId() {
        return pessId;
    }

    public void setPessId(Pessoas pessId) {
        this.pessId = pessId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (emagId != null ? emagId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmailsAgendados)) {
            return false;
        }
        EmailsAgendados other = (EmailsAgendados) object;
        if ((this.emagId == null && other.emagId != null) || (this.emagId != null && !this.emagId.equals(other.emagId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.EmailsAgendados[ emagId=" + emagId + " ]";
    }
    
}
