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
@Table(name = "VENDEDORES_METAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VendedoresMetas.findAll", query = "SELECT v FROM VendedoresMetas v"),
    @NamedQuery(name = "VendedoresMetas.findByVdmtId", query = "SELECT v FROM VendedoresMetas v WHERE v.vdmtId = :vdmtId"),
    @NamedQuery(name = "VendedoresMetas.findByVdmtVlrMeta", query = "SELECT v FROM VendedoresMetas v WHERE v.vdmtVlrMeta = :vdmtVlrMeta"),
    @NamedQuery(name = "VendedoresMetas.findByVdmtComissaoAdd", query = "SELECT v FROM VendedoresMetas v WHERE v.vdmtComissaoAdd = :vdmtComissaoAdd"),
    @NamedQuery(name = "VendedoresMetas.findByVdmtLastupdate", query = "SELECT v FROM VendedoresMetas v WHERE v.vdmtLastupdate = :vdmtLastupdate")})
public class VendedoresMetas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "VDMT_ID")
    private String vdmtId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "VDMT_VLR_META")
    private BigDecimal vdmtVlrMeta;
    @Basic(optional = false)
    @Column(name = "VDMT_COMISSAO_ADD")
    private BigDecimal vdmtComissaoAdd;
    @Column(name = "VDMT_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date vdmtLastupdate;
    @JoinColumn(name = "GRPO_ID", referencedColumnName = "GRPO_ID")
    @ManyToOne
    private Grupos grpoId;
    @JoinColumn(name = "VDDR_ID", referencedColumnName = "VDDR_ID")
    @ManyToOne
    private Vendedores vddrId;

    public VendedoresMetas() {
    }

    public VendedoresMetas(String vdmtId) {
        this.vdmtId = vdmtId;
    }

    public VendedoresMetas(String vdmtId, BigDecimal vdmtVlrMeta, BigDecimal vdmtComissaoAdd) {
        this.vdmtId = vdmtId;
        this.vdmtVlrMeta = vdmtVlrMeta;
        this.vdmtComissaoAdd = vdmtComissaoAdd;
    }

    public String getVdmtId() {
        return vdmtId;
    }

    public void setVdmtId(String vdmtId) {
        this.vdmtId = vdmtId;
    }

    public BigDecimal getVdmtVlrMeta() {
        return vdmtVlrMeta;
    }

    public void setVdmtVlrMeta(BigDecimal vdmtVlrMeta) {
        this.vdmtVlrMeta = vdmtVlrMeta;
    }

    public BigDecimal getVdmtComissaoAdd() {
        return vdmtComissaoAdd;
    }

    public void setVdmtComissaoAdd(BigDecimal vdmtComissaoAdd) {
        this.vdmtComissaoAdd = vdmtComissaoAdd;
    }

    public Date getVdmtLastupdate() {
        return vdmtLastupdate;
    }

    public void setVdmtLastupdate(Date vdmtLastupdate) {
        this.vdmtLastupdate = vdmtLastupdate;
    }

    public Grupos getGrpoId() {
        return grpoId;
    }

    public void setGrpoId(Grupos grpoId) {
        this.grpoId = grpoId;
    }

    public Vendedores getVddrId() {
        return vddrId;
    }

    public void setVddrId(Vendedores vddrId) {
        this.vddrId = vddrId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vdmtId != null ? vdmtId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VendedoresMetas)) {
            return false;
        }
        VendedoresMetas other = (VendedoresMetas) object;
        if ((this.vdmtId == null && other.vdmtId != null) || (this.vdmtId != null && !this.vdmtId.equals(other.vdmtId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.VendedoresMetas[ vdmtId=" + vdmtId + " ]";
    }
    
}
