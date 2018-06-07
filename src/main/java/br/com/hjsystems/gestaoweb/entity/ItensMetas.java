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
@Table(name = "ITENS_METAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ItensMetas.findAll", query = "SELECT i FROM ItensMetas i"),
    @NamedQuery(name = "ItensMetas.findByItmtId", query = "SELECT i FROM ItensMetas i WHERE i.itmtId = :itmtId"),
    @NamedQuery(name = "ItensMetas.findByItmtValor", query = "SELECT i FROM ItensMetas i WHERE i.itmtValor = :itmtValor"),
    @NamedQuery(name = "ItensMetas.findByItmtComissaoAdd", query = "SELECT i FROM ItensMetas i WHERE i.itmtComissaoAdd = :itmtComissaoAdd"),
    @NamedQuery(name = "ItensMetas.findByItmtLastupdate", query = "SELECT i FROM ItensMetas i WHERE i.itmtLastupdate = :itmtLastupdate"),
    @NamedQuery(name = "ItensMetas.findByItmtQtde", query = "SELECT i FROM ItensMetas i WHERE i.itmtQtde = :itmtQtde")})
public class ItensMetas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ITMT_ID")
    private String itmtId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "ITMT_VALOR")
    private BigDecimal itmtValor;
    @Basic(optional = false)
    @Column(name = "ITMT_COMISSAO_ADD")
    private BigDecimal itmtComissaoAdd;
    @Column(name = "ITMT_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date itmtLastupdate;
    @Column(name = "ITMT_QTDE")
    private BigDecimal itmtQtde;
    @JoinColumn(name = "GRPO_ID", referencedColumnName = "GRPO_ID")
    @ManyToOne
    private Grupos grpoId;
    @JoinColumn(name = "META_ID", referencedColumnName = "META_ID")
    @ManyToOne
    private Metas metaId;

    public ItensMetas() {
    }

    public ItensMetas(String itmtId) {
        this.itmtId = itmtId;
    }

    public ItensMetas(String itmtId, BigDecimal itmtValor, BigDecimal itmtComissaoAdd) {
        this.itmtId = itmtId;
        this.itmtValor = itmtValor;
        this.itmtComissaoAdd = itmtComissaoAdd;
    }

    public String getItmtId() {
        return itmtId;
    }

    public void setItmtId(String itmtId) {
        this.itmtId = itmtId;
    }

    public BigDecimal getItmtValor() {
        return itmtValor;
    }

    public void setItmtValor(BigDecimal itmtValor) {
        this.itmtValor = itmtValor;
    }

    public BigDecimal getItmtComissaoAdd() {
        return itmtComissaoAdd;
    }

    public void setItmtComissaoAdd(BigDecimal itmtComissaoAdd) {
        this.itmtComissaoAdd = itmtComissaoAdd;
    }

    public Date getItmtLastupdate() {
        return itmtLastupdate;
    }

    public void setItmtLastupdate(Date itmtLastupdate) {
        this.itmtLastupdate = itmtLastupdate;
    }

    public BigDecimal getItmtQtde() {
        return itmtQtde;
    }

    public void setItmtQtde(BigDecimal itmtQtde) {
        this.itmtQtde = itmtQtde;
    }

    public Grupos getGrpoId() {
        return grpoId;
    }

    public void setGrpoId(Grupos grpoId) {
        this.grpoId = grpoId;
    }

    public Metas getMetaId() {
        return metaId;
    }

    public void setMetaId(Metas metaId) {
        this.metaId = metaId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itmtId != null ? itmtId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItensMetas)) {
            return false;
        }
        ItensMetas other = (ItensMetas) object;
        if ((this.itmtId == null && other.itmtId != null) || (this.itmtId != null && !this.itmtId.equals(other.itmtId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.ItensMetas[ itmtId=" + itmtId + " ]";
    }
    
}
