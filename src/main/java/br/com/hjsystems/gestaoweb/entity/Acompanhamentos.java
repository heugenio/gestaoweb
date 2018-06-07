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
@Table(name = "ACOMPANHAMENTOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Acompanhamentos.findAll", query = "SELECT a FROM Acompanhamentos a"),
    @NamedQuery(name = "Acompanhamentos.findByAcmpId", query = "SELECT a FROM Acompanhamentos a WHERE a.acmpId = :acmpId"),
    @NamedQuery(name = "Acompanhamentos.findByAcmpLASTUPDATE", query = "SELECT a FROM Acompanhamentos a WHERE a.acmpLASTUPDATE = :acmpLASTUPDATE"),
    @NamedQuery(name = "Acompanhamentos.findByAcmpAcomQtdVenda", query = "SELECT a FROM Acompanhamentos a WHERE a.acmpAcomQtdVenda = :acmpAcomQtdVenda"),
    @NamedQuery(name = "Acompanhamentos.findByAcmpQtde", query = "SELECT a FROM Acompanhamentos a WHERE a.acmpQtde = :acmpQtde"),
    @NamedQuery(name = "Acompanhamentos.findByAcmpPerc", query = "SELECT a FROM Acompanhamentos a WHERE a.acmpPerc = :acmpPerc")})
public class Acompanhamentos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ACMP_ID")
    private String acmpId;
    @Column(name = "Acmp_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date acmpLASTUPDATE;
    @Column(name = "ACMP_ACOM_QTD_VENDA")
    private String acmpAcomQtdVenda;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ACMP_QTDE")
    private BigDecimal acmpQtde;
    @Column(name = "ACMP_PERC")
    private BigDecimal acmpPerc;
    @JoinColumn(name = "PRO_PROD_ID", referencedColumnName = "PROD_ID")
    @ManyToOne
    private Produtos proProdId;
    @JoinColumn(name = "PROD_ID", referencedColumnName = "PROD_ID")
    @ManyToOne
    private Produtos prodId;

    public Acompanhamentos() {
    }

    public Acompanhamentos(String acmpId) {
        this.acmpId = acmpId;
    }

    public String getAcmpId() {
        return acmpId;
    }

    public void setAcmpId(String acmpId) {
        this.acmpId = acmpId;
    }

    public Date getAcmpLASTUPDATE() {
        return acmpLASTUPDATE;
    }

    public void setAcmpLASTUPDATE(Date acmpLASTUPDATE) {
        this.acmpLASTUPDATE = acmpLASTUPDATE;
    }

    public String getAcmpAcomQtdVenda() {
        return acmpAcomQtdVenda;
    }

    public void setAcmpAcomQtdVenda(String acmpAcomQtdVenda) {
        this.acmpAcomQtdVenda = acmpAcomQtdVenda;
    }

    public BigDecimal getAcmpQtde() {
        return acmpQtde;
    }

    public void setAcmpQtde(BigDecimal acmpQtde) {
        this.acmpQtde = acmpQtde;
    }

    public BigDecimal getAcmpPerc() {
        return acmpPerc;
    }

    public void setAcmpPerc(BigDecimal acmpPerc) {
        this.acmpPerc = acmpPerc;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (acmpId != null ? acmpId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Acompanhamentos)) {
            return false;
        }
        Acompanhamentos other = (Acompanhamentos) object;
        if ((this.acmpId == null && other.acmpId != null) || (this.acmpId != null && !this.acmpId.equals(other.acmpId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.Acompanhamentos[ acmpId=" + acmpId + " ]";
    }
    
}
