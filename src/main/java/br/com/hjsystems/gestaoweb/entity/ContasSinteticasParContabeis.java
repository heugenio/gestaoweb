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
@Table(name = "CONTAS_SINTETICAS_PAR_CONTABEIS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ContasSinteticasParContabeis.findAll", query = "SELECT c FROM ContasSinteticasParContabeis c"),
    @NamedQuery(name = "ContasSinteticasParContabeis.findByCspcId", query = "SELECT c FROM ContasSinteticasParContabeis c WHERE c.cspcId = :cspcId"),
    @NamedQuery(name = "ContasSinteticasParContabeis.findByCspcLastupdate", query = "SELECT c FROM ContasSinteticasParContabeis c WHERE c.cspcLastupdate = :cspcLastupdate")})
public class ContasSinteticasParContabeis implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CSPC_ID")
    private String cspcId;
    @Column(name = "CSPC_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cspcLastupdate;
    @JoinColumn(name = "PLCT_ID", referencedColumnName = "PLCT_ID")
    @ManyToOne
    private PlanoContas plctId;

    public ContasSinteticasParContabeis() {
    }

    public ContasSinteticasParContabeis(String cspcId) {
        this.cspcId = cspcId;
    }

    public String getCspcId() {
        return cspcId;
    }

    public void setCspcId(String cspcId) {
        this.cspcId = cspcId;
    }

    public Date getCspcLastupdate() {
        return cspcLastupdate;
    }

    public void setCspcLastupdate(Date cspcLastupdate) {
        this.cspcLastupdate = cspcLastupdate;
    }

    public PlanoContas getPlctId() {
        return plctId;
    }

    public void setPlctId(PlanoContas plctId) {
        this.plctId = plctId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cspcId != null ? cspcId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContasSinteticasParContabeis)) {
            return false;
        }
        ContasSinteticasParContabeis other = (ContasSinteticasParContabeis) object;
        if ((this.cspcId == null && other.cspcId != null) || (this.cspcId != null && !this.cspcId.equals(other.cspcId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.ContasSinteticasParContabeis[ cspcId=" + cspcId + " ]";
    }
    
}
