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
@Table(name = "BALANCOS_PRODUTOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BalancosProdutos.findAll", query = "SELECT b FROM BalancosProdutos b"),
    @NamedQuery(name = "BalancosProdutos.findByBlprId", query = "SELECT b FROM BalancosProdutos b WHERE b.blprId = :blprId"),
    @NamedQuery(name = "BalancosProdutos.findByBlprQtdeSistema", query = "SELECT b FROM BalancosProdutos b WHERE b.blprQtdeSistema = :blprQtdeSistema"),
    @NamedQuery(name = "BalancosProdutos.findByBlprQtdeContagem", query = "SELECT b FROM BalancosProdutos b WHERE b.blprQtdeContagem = :blprQtdeContagem"),
    @NamedQuery(name = "BalancosProdutos.findByBlprLastupdate", query = "SELECT b FROM BalancosProdutos b WHERE b.blprLastupdate = :blprLastupdate")})
public class BalancosProdutos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "BLPR_ID")
    private String blprId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "BLPR_QTDE_SISTEMA")
    private BigDecimal blprQtdeSistema;
    @Column(name = "BLPR_QTDE_CONTAGEM")
    private BigDecimal blprQtdeContagem;
    @Column(name = "BLPR_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date blprLastupdate;
    @JoinColumn(name = "BLNC_ID", referencedColumnName = "BLNC_ID")
    @ManyToOne
    private Balancos blncId;
    @JoinColumn(name = "ENAR_ID", referencedColumnName = "ENAR_ID")
    @ManyToOne
    private EnderecosArmazenamento enarId;
    @JoinColumn(name = "PROD_ID", referencedColumnName = "PROD_ID")
    @ManyToOne
    private Produtos prodId;

    public BalancosProdutos() {
    }

    public BalancosProdutos(String blprId) {
        this.blprId = blprId;
    }

    public String getBlprId() {
        return blprId;
    }

    public void setBlprId(String blprId) {
        this.blprId = blprId;
    }

    public BigDecimal getBlprQtdeSistema() {
        return blprQtdeSistema;
    }

    public void setBlprQtdeSistema(BigDecimal blprQtdeSistema) {
        this.blprQtdeSistema = blprQtdeSistema;
    }

    public BigDecimal getBlprQtdeContagem() {
        return blprQtdeContagem;
    }

    public void setBlprQtdeContagem(BigDecimal blprQtdeContagem) {
        this.blprQtdeContagem = blprQtdeContagem;
    }

    public Date getBlprLastupdate() {
        return blprLastupdate;
    }

    public void setBlprLastupdate(Date blprLastupdate) {
        this.blprLastupdate = blprLastupdate;
    }

    public Balancos getBlncId() {
        return blncId;
    }

    public void setBlncId(Balancos blncId) {
        this.blncId = blncId;
    }

    public EnderecosArmazenamento getEnarId() {
        return enarId;
    }

    public void setEnarId(EnderecosArmazenamento enarId) {
        this.enarId = enarId;
    }

    public Produtos getProdId() {
        return prodId;
    }

    public void setProdId(Produtos prodId) {
        this.prodId = prodId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (blprId != null ? blprId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BalancosProdutos)) {
            return false;
        }
        BalancosProdutos other = (BalancosProdutos) object;
        if ((this.blprId == null && other.blprId != null) || (this.blprId != null && !this.blprId.equals(other.blprId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.BalancosProdutos[ blprId=" + blprId + " ]";
    }
    
}
