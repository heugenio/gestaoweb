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
@Table(name = "CENTROCUSTO_PARAMCONTAB")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CentrocustoParamcontab.findAll", query = "SELECT c FROM CentrocustoParamcontab c"),
    @NamedQuery(name = "CentrocustoParamcontab.findByCcpcId", query = "SELECT c FROM CentrocustoParamcontab c WHERE c.ccpcId = :ccpcId"),
    @NamedQuery(name = "CentrocustoParamcontab.findByCcpcLastupdate", query = "SELECT c FROM CentrocustoParamcontab c WHERE c.ccpcLastupdate = :ccpcLastupdate")})
public class CentrocustoParamcontab implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CCPC_ID")
    private String ccpcId;
    @Column(name = "CCPC_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ccpcLastupdate;
    @JoinColumn(name = "PRCT_ID", referencedColumnName = "PRCT_ID")
    @ManyToOne
    private ParametrosContabeis prctId;
    @JoinColumn(name = "PLCT_ID", referencedColumnName = "PLCT_ID")
    @ManyToOne
    private PlanoContas plctId;

    public CentrocustoParamcontab() {
    }

    public CentrocustoParamcontab(String ccpcId) {
        this.ccpcId = ccpcId;
    }

    public String getCcpcId() {
        return ccpcId;
    }

    public void setCcpcId(String ccpcId) {
        this.ccpcId = ccpcId;
    }

    public Date getCcpcLastupdate() {
        return ccpcLastupdate;
    }

    public void setCcpcLastupdate(Date ccpcLastupdate) {
        this.ccpcLastupdate = ccpcLastupdate;
    }

    public ParametrosContabeis getPrctId() {
        return prctId;
    }

    public void setPrctId(ParametrosContabeis prctId) {
        this.prctId = prctId;
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
        hash += (ccpcId != null ? ccpcId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CentrocustoParamcontab)) {
            return false;
        }
        CentrocustoParamcontab other = (CentrocustoParamcontab) object;
        if ((this.ccpcId == null && other.ccpcId != null) || (this.ccpcId != null && !this.ccpcId.equals(other.ccpcId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.CentrocustoParamcontab[ ccpcId=" + ccpcId + " ]";
    }
    
}
