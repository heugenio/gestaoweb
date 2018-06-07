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
@Table(name = "FACTORING")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Factoring.findAll", query = "SELECT f FROM Factoring f"),
    @NamedQuery(name = "Factoring.findByFctrId", query = "SELECT f FROM Factoring f WHERE f.fctrId = :fctrId"),
    @NamedQuery(name = "Factoring.findByFctrRazaoSocial", query = "SELECT f FROM Factoring f WHERE f.fctrRazaoSocial = :fctrRazaoSocial"),
    @NamedQuery(name = "Factoring.findByFctrAdValorem", query = "SELECT f FROM Factoring f WHERE f.fctrAdValorem = :fctrAdValorem"),
    @NamedQuery(name = "Factoring.findByFctrCpmf", query = "SELECT f FROM Factoring f WHERE f.fctrCpmf = :fctrCpmf"),
    @NamedQuery(name = "Factoring.findByFctrTaxaJuros", query = "SELECT f FROM Factoring f WHERE f.fctrTaxaJuros = :fctrTaxaJuros"),
    @NamedQuery(name = "Factoring.findByFctrSituacao", query = "SELECT f FROM Factoring f WHERE f.fctrSituacao = :fctrSituacao"),
    @NamedQuery(name = "Factoring.findByFctrLASTUPDATE", query = "SELECT f FROM Factoring f WHERE f.fctrLASTUPDATE = :fctrLASTUPDATE")})
public class Factoring implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "FCTR_ID")
    private String fctrId;
    @Column(name = "FCTR_RAZAO_SOCIAL")
    private String fctrRazaoSocial;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "FCTR_AD_VALOREM")
    private BigDecimal fctrAdValorem;
    @Basic(optional = false)
    @Column(name = "FCTR_CPMF")
    private BigDecimal fctrCpmf;
    @Basic(optional = false)
    @Column(name = "FCTR_TAXA_JUROS")
    private BigDecimal fctrTaxaJuros;
    @Basic(optional = false)
    @Column(name = "FCTR_SITUACAO")
    private String fctrSituacao;
    @Column(name = "Fctr_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fctrLASTUPDATE;
    @JoinColumn(name = "PESS_ID", referencedColumnName = "PESS_ID")
    @ManyToOne
    private Pessoas pessId;

    public Factoring() {
    }

    public Factoring(String fctrId) {
        this.fctrId = fctrId;
    }

    public Factoring(String fctrId, BigDecimal fctrAdValorem, BigDecimal fctrCpmf, BigDecimal fctrTaxaJuros, String fctrSituacao) {
        this.fctrId = fctrId;
        this.fctrAdValorem = fctrAdValorem;
        this.fctrCpmf = fctrCpmf;
        this.fctrTaxaJuros = fctrTaxaJuros;
        this.fctrSituacao = fctrSituacao;
    }

    public String getFctrId() {
        return fctrId;
    }

    public void setFctrId(String fctrId) {
        this.fctrId = fctrId;
    }

    public String getFctrRazaoSocial() {
        return fctrRazaoSocial;
    }

    public void setFctrRazaoSocial(String fctrRazaoSocial) {
        this.fctrRazaoSocial = fctrRazaoSocial;
    }

    public BigDecimal getFctrAdValorem() {
        return fctrAdValorem;
    }

    public void setFctrAdValorem(BigDecimal fctrAdValorem) {
        this.fctrAdValorem = fctrAdValorem;
    }

    public BigDecimal getFctrCpmf() {
        return fctrCpmf;
    }

    public void setFctrCpmf(BigDecimal fctrCpmf) {
        this.fctrCpmf = fctrCpmf;
    }

    public BigDecimal getFctrTaxaJuros() {
        return fctrTaxaJuros;
    }

    public void setFctrTaxaJuros(BigDecimal fctrTaxaJuros) {
        this.fctrTaxaJuros = fctrTaxaJuros;
    }

    public String getFctrSituacao() {
        return fctrSituacao;
    }

    public void setFctrSituacao(String fctrSituacao) {
        this.fctrSituacao = fctrSituacao;
    }

    public Date getFctrLASTUPDATE() {
        return fctrLASTUPDATE;
    }

    public void setFctrLASTUPDATE(Date fctrLASTUPDATE) {
        this.fctrLASTUPDATE = fctrLASTUPDATE;
    }

    public Pessoas getPessId() {
        return pessId;
    }

    public void setPessId(Pessoas pessId) {
        this.pessId = pessId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fctrId != null ? fctrId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Factoring)) {
            return false;
        }
        Factoring other = (Factoring) object;
        if ((this.fctrId == null && other.fctrId != null) || (this.fctrId != null && !this.fctrId.equals(other.fctrId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.Factoring[ fctrId=" + fctrId + " ]";
    }
    
}
