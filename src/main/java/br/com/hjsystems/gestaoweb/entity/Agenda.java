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
@Table(name = "AGENDA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Agenda.findAll", query = "SELECT a FROM Agenda a"),
    @NamedQuery(name = "Agenda.findByAgdaId", query = "SELECT a FROM Agenda a WHERE a.agdaId = :agdaId"),
    @NamedQuery(name = "Agenda.findByAgdaEvento", query = "SELECT a FROM Agenda a WHERE a.agdaEvento = :agdaEvento"),
    @NamedQuery(name = "Agenda.findByAgdaDtEvento", query = "SELECT a FROM Agenda a WHERE a.agdaDtEvento = :agdaDtEvento"),
    @NamedQuery(name = "Agenda.findByAgdaHrEvento", query = "SELECT a FROM Agenda a WHERE a.agdaHrEvento = :agdaHrEvento"),
    @NamedQuery(name = "Agenda.findByAgdaStatus", query = "SELECT a FROM Agenda a WHERE a.agdaStatus = :agdaStatus"),
    @NamedQuery(name = "Agenda.findByAgdaLastupdate", query = "SELECT a FROM Agenda a WHERE a.agdaLastupdate = :agdaLastupdate")})
public class Agenda implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "AGDA_ID")
    private String agdaId;
    @Column(name = "AGDA_EVENTO")
    private String agdaEvento;
    @Column(name = "AGDA_DT_EVENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date agdaDtEvento;
    @Column(name = "AGDA_HR_EVENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date agdaHrEvento;
    @Column(name = "AGDA_STATUS")
    private String agdaStatus;
    @Column(name = "AGDA_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date agdaLastupdate;
    @JoinColumn(name = "CLNT_ID", referencedColumnName = "CLNT_ID")
    @ManyToOne
    private Clientes clntId;
    @JoinColumn(name = "USRS_ID", referencedColumnName = "USRS_ID")
    @ManyToOne
    private Usuarios usrsId;

    public Agenda() {
    }

    public Agenda(String agdaId) {
        this.agdaId = agdaId;
    }

    public String getAgdaId() {
        return agdaId;
    }

    public void setAgdaId(String agdaId) {
        this.agdaId = agdaId;
    }

    public String getAgdaEvento() {
        return agdaEvento;
    }

    public void setAgdaEvento(String agdaEvento) {
        this.agdaEvento = agdaEvento;
    }

    public Date getAgdaDtEvento() {
        return agdaDtEvento;
    }

    public void setAgdaDtEvento(Date agdaDtEvento) {
        this.agdaDtEvento = agdaDtEvento;
    }

    public Date getAgdaHrEvento() {
        return agdaHrEvento;
    }

    public void setAgdaHrEvento(Date agdaHrEvento) {
        this.agdaHrEvento = agdaHrEvento;
    }

    public String getAgdaStatus() {
        return agdaStatus;
    }

    public void setAgdaStatus(String agdaStatus) {
        this.agdaStatus = agdaStatus;
    }

    public Date getAgdaLastupdate() {
        return agdaLastupdate;
    }

    public void setAgdaLastupdate(Date agdaLastupdate) {
        this.agdaLastupdate = agdaLastupdate;
    }

    public Clientes getClntId() {
        return clntId;
    }

    public void setClntId(Clientes clntId) {
        this.clntId = clntId;
    }

    public Usuarios getUsrsId() {
        return usrsId;
    }

    public void setUsrsId(Usuarios usrsId) {
        this.usrsId = usrsId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (agdaId != null ? agdaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Agenda)) {
            return false;
        }
        Agenda other = (Agenda) object;
        if ((this.agdaId == null && other.agdaId != null) || (this.agdaId != null && !this.agdaId.equals(other.agdaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.Agenda[ agdaId=" + agdaId + " ]";
    }
    
}
