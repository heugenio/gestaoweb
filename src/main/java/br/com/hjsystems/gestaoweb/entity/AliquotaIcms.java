/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hjsystems.gestaoweb.entity;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "ALIQUOTA_ICMS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AliquotaIcms.findAll", query = "SELECT a FROM AliquotaIcms a"),
    @NamedQuery(name = "AliquotaIcms.findByAlqiId", query = "SELECT a FROM AliquotaIcms a WHERE a.alqiId = :alqiId"),
    @NamedQuery(name = "AliquotaIcms.findByAlqiIcms", query = "SELECT a FROM AliquotaIcms a WHERE a.alqiIcms = :alqiIcms"),
    @NamedQuery(name = "AliquotaIcms.findByAlqiReducaoIcms", query = "SELECT a FROM AliquotaIcms a WHERE a.alqiReducaoIcms = :alqiReducaoIcms"),
    @NamedQuery(name = "AliquotaIcms.findByAlqILASTUPDATE", query = "SELECT a FROM AliquotaIcms a WHERE a.alqILASTUPDATE = :alqILASTUPDATE")})
public class AliquotaIcms implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ALQI_ID")
    private String alqiId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "ALQI_ICMS")
    private BigDecimal alqiIcms;
    @Basic(optional = false)
    @Column(name = "ALQI_REDUCAO_ICMS")
    private BigDecimal alqiReducaoIcms;
    @Column(name = "AlqI_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date alqILASTUPDATE;
    @JoinColumn(name = "EST_ESTA_ID", referencedColumnName = "ESTA_ID")
    @ManyToOne
    private Estados estEstaId;
    @JoinColumn(name = "ESTA_ID", referencedColumnName = "ESTA_ID")
    @ManyToOne
    private Estados estaId;

    public AliquotaIcms() {
    }

    public AliquotaIcms(String alqiId) {
        this.alqiId = alqiId;
    }

    public AliquotaIcms(String alqiId, BigDecimal alqiIcms, BigDecimal alqiReducaoIcms) {
        this.alqiId = alqiId;
        this.alqiIcms = alqiIcms;
        this.alqiReducaoIcms = alqiReducaoIcms;
    }

    public String getAlqiId() {
        return alqiId;
    }

    public void setAlqiId(String alqiId) {
        this.alqiId = alqiId;
    }

    public BigDecimal getAlqiIcms() {
        return alqiIcms;
    }

    public void setAlqiIcms(BigDecimal alqiIcms) {
        this.alqiIcms = alqiIcms;
    }

    public BigDecimal getAlqiReducaoIcms() {
        return alqiReducaoIcms;
    }

    public void setAlqiReducaoIcms(BigDecimal alqiReducaoIcms) {
        this.alqiReducaoIcms = alqiReducaoIcms;
    }

    public Date getAlqILASTUPDATE() {
        return alqILASTUPDATE;
    }

    public void setAlqILASTUPDATE(Date alqILASTUPDATE) {
        this.alqILASTUPDATE = alqILASTUPDATE;
    }

    public Estados getEstEstaId() {
        return estEstaId;
    }

    public void setEstEstaId(Estados estEstaId) {
        this.estEstaId = estEstaId;
    }

    public Estados getEstaId() {
        return estaId;
    }

    public void setEstaId(Estados estaId) {
        this.estaId = estaId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (alqiId != null ? alqiId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AliquotaIcms)) {
            return false;
        }
        AliquotaIcms other = (AliquotaIcms) object;
        if ((this.alqiId == null && other.alqiId != null) || (this.alqiId != null && !this.alqiId.equals(other.alqiId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.AliquotaIcms[ alqiId=" + alqiId + " ]";
    }
    
}
