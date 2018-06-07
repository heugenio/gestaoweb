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
import javax.persistence.Lob;
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
@Table(name = "RECEITA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Receita.findAll", query = "SELECT r FROM Receita r"),
    @NamedQuery(name = "Receita.findByRctaId", query = "SELECT r FROM Receita r WHERE r.rctaId = :rctaId"),
    @NamedQuery(name = "Receita.findByRctaQuantidade", query = "SELECT r FROM Receita r WHERE r.rctaQuantidade = :rctaQuantidade"),
    @NamedQuery(name = "Receita.findByRctaLASTUPDATE", query = "SELECT r FROM Receita r WHERE r.rctaLASTUPDATE = :rctaLASTUPDATE")})
public class Receita implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "RCTA_ID")
    private String rctaId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "RCTA_QUANTIDADE")
    private BigDecimal rctaQuantidade;
    @Lob
    @Column(name = "RCTA_OBSERVACAO")
    private String rctaObservacao;
    @Column(name = "Rcta_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rctaLASTUPDATE;
    @JoinColumn(name = "PRO_PROD_ID", referencedColumnName = "PROD_ID")
    @ManyToOne
    private Produtos proProdId;
    @JoinColumn(name = "PROD_ID", referencedColumnName = "PROD_ID")
    @ManyToOne
    private Produtos prodId;
    @JoinColumn(name = "UNID_ID", referencedColumnName = "UNID_ID")
    @ManyToOne
    private Unidades unidId;

    public Receita() {
    }

    public Receita(String rctaId) {
        this.rctaId = rctaId;
    }

    public Receita(String rctaId, BigDecimal rctaQuantidade) {
        this.rctaId = rctaId;
        this.rctaQuantidade = rctaQuantidade;
    }

    public String getRctaId() {
        return rctaId;
    }

    public void setRctaId(String rctaId) {
        this.rctaId = rctaId;
    }

    public BigDecimal getRctaQuantidade() {
        return rctaQuantidade;
    }

    public void setRctaQuantidade(BigDecimal rctaQuantidade) {
        this.rctaQuantidade = rctaQuantidade;
    }

    public String getRctaObservacao() {
        return rctaObservacao;
    }

    public void setRctaObservacao(String rctaObservacao) {
        this.rctaObservacao = rctaObservacao;
    }

    public Date getRctaLASTUPDATE() {
        return rctaLASTUPDATE;
    }

    public void setRctaLASTUPDATE(Date rctaLASTUPDATE) {
        this.rctaLASTUPDATE = rctaLASTUPDATE;
    }

    public Produtos getProProdId() {
        return proProdId;
    }

    public void setProProdId(Produtos proProdId) {
        this.proProdId = proProdId;
    }

    public Produtos getProdId() {
        return prodId;
    }

    public void setProdId(Produtos prodId) {
        this.prodId = prodId;
    }

    public Unidades getUnidId() {
        return unidId;
    }

    public void setUnidId(Unidades unidId) {
        this.unidId = unidId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rctaId != null ? rctaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Receita)) {
            return false;
        }
        Receita other = (Receita) object;
        if ((this.rctaId == null && other.rctaId != null) || (this.rctaId != null && !this.rctaId.equals(other.rctaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.Receita[ rctaId=" + rctaId + " ]";
    }
    
}
