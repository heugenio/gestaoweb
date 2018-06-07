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
@Table(name = "CFOP_PARAMETROS_CONTABEIS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CfopParametrosContabeis.findAll", query = "SELECT c FROM CfopParametrosContabeis c"),
    @NamedQuery(name = "CfopParametrosContabeis.findByCfpcId", query = "SELECT c FROM CfopParametrosContabeis c WHERE c.cfpcId = :cfpcId"),
    @NamedQuery(name = "CfopParametrosContabeis.findByCfpcLastupdate", query = "SELECT c FROM CfopParametrosContabeis c WHERE c.cfpcLastupdate = :cfpcLastupdate")})
public class CfopParametrosContabeis implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CFPC_ID")
    private String cfpcId;
    @Column(name = "CFPC_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cfpcLastupdate;
    @JoinColumn(name = "CFOP_ID", referencedColumnName = "CFOP_ID")
    @ManyToOne
    private Cfop cfopId;
    @JoinColumn(name = "PRCT_ID", referencedColumnName = "PRCT_ID")
    @ManyToOne
    private ParametrosContabeis prctId;

    public CfopParametrosContabeis() {
    }

    public CfopParametrosContabeis(String cfpcId) {
        this.cfpcId = cfpcId;
    }

    public String getCfpcId() {
        return cfpcId;
    }

    public void setCfpcId(String cfpcId) {
        this.cfpcId = cfpcId;
    }

    public Date getCfpcLastupdate() {
        return cfpcLastupdate;
    }

    public void setCfpcLastupdate(Date cfpcLastupdate) {
        this.cfpcLastupdate = cfpcLastupdate;
    }

    public Cfop getCfopId() {
        return cfopId;
    }

    public void setCfopId(Cfop cfopId) {
        this.cfopId = cfopId;
    }

    public ParametrosContabeis getPrctId() {
        return prctId;
    }

    public void setPrctId(ParametrosContabeis prctId) {
        this.prctId = prctId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cfpcId != null ? cfpcId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CfopParametrosContabeis)) {
            return false;
        }
        CfopParametrosContabeis other = (CfopParametrosContabeis) object;
        if ((this.cfpcId == null && other.cfpcId != null) || (this.cfpcId != null && !this.cfpcId.equals(other.cfpcId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.CfopParametrosContabeis[ cfpcId=" + cfpcId + " ]";
    }
    
}
