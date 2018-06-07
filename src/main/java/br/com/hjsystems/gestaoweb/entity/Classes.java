/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hjsystems.gestaoweb.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name = "CLASSES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Classes.findAll", query = "SELECT c FROM Classes c"),
    @NamedQuery(name = "Classes.findByClssId", query = "SELECT c FROM Classes c WHERE c.clssId = :clssId"),
    @NamedQuery(name = "Classes.findByClssCodigo", query = "SELECT c FROM Classes c WHERE c.clssCodigo = :clssCodigo"),
    @NamedQuery(name = "Classes.findByClssNome", query = "SELECT c FROM Classes c WHERE c.clssNome = :clssNome"),
    @NamedQuery(name = "Classes.findByClssPercComAvt", query = "SELECT c FROM Classes c WHERE c.clssPercComAvt = :clssPercComAvt"),
    @NamedQuery(name = "Classes.findByClssPercComPrz", query = "SELECT c FROM Classes c WHERE c.clssPercComPrz = :clssPercComPrz"),
    @NamedQuery(name = "Classes.findByClssLASTUPDATE", query = "SELECT c FROM Classes c WHERE c.clssLASTUPDATE = :clssLASTUPDATE"),
    @NamedQuery(name = "Classes.findByClssTcnPercComAvt", query = "SELECT c FROM Classes c WHERE c.clssTcnPercComAvt = :clssTcnPercComAvt"),
    @NamedQuery(name = "Classes.findByClssTcnPercComPrz", query = "SELECT c FROM Classes c WHERE c.clssTcnPercComPrz = :clssTcnPercComPrz"),
    @NamedQuery(name = "Classes.findByClssVlrPontos", query = "SELECT c FROM Classes c WHERE c.clssVlrPontos = :clssVlrPontos"),
    @NamedQuery(name = "Classes.findByClssTcnMultPcomAvt", query = "SELECT c FROM Classes c WHERE c.clssTcnMultPcomAvt = :clssTcnMultPcomAvt"),
    @NamedQuery(name = "Classes.findByClssTcnMultPcomPrz", query = "SELECT c FROM Classes c WHERE c.clssTcnMultPcomPrz = :clssTcnMultPcomPrz"),
    @NamedQuery(name = "Classes.findByClssTcnMult2PcomAvt", query = "SELECT c FROM Classes c WHERE c.clssTcnMult2PcomAvt = :clssTcnMult2PcomAvt"),
    @NamedQuery(name = "Classes.findByClssTcnMult2PcomPrz", query = "SELECT c FROM Classes c WHERE c.clssTcnMult2PcomPrz = :clssTcnMult2PcomPrz"),
    @NamedQuery(name = "Classes.findByClssComMaoObra", query = "SELECT c FROM Classes c WHERE c.clssComMaoObra = :clssComMaoObra")})
public class Classes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CLSS_ID")
    private String clssId;
    @Basic(optional = false)
    @Column(name = "CLSS_CODIGO")
    private String clssCodigo;
    @Basic(optional = false)
    @Column(name = "CLSS_NOME")
    private String clssNome;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "CLSS_PERC_COM_AVT")
    private BigDecimal clssPercComAvt;
    @Basic(optional = false)
    @Column(name = "CLSS_PERC_COM_PRZ")
    private BigDecimal clssPercComPrz;
    @Column(name = "Clss_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date clssLASTUPDATE;
    @Column(name = "CLSS_TCN_PERC_COM_AVT")
    private BigDecimal clssTcnPercComAvt;
    @Column(name = "CLSS_TCN_PERC_COM_PRZ")
    private BigDecimal clssTcnPercComPrz;
    @Column(name = "CLSS_VLR_PONTOS")
    private BigDecimal clssVlrPontos;
    @Column(name = "CLSS_TCN_MULT_PCOM_AVT")
    private BigDecimal clssTcnMultPcomAvt;
    @Column(name = "CLSS_TCN_MULT_PCOM_PRZ")
    private BigDecimal clssTcnMultPcomPrz;
    @Column(name = "CLSS_TCN_MULT2_PCOM_AVT")
    private BigDecimal clssTcnMult2PcomAvt;
    @Column(name = "CLSS_TCN_MULT2_PCOM_PRZ")
    private BigDecimal clssTcnMult2PcomPrz;
    @Column(name = "CLSS_COM_MAO_OBRA")
    private BigDecimal clssComMaoObra;
    @OneToMany(mappedBy = "clssId")
    private List<Produtos> produtosList;

    public Classes() {
    }

    public Classes(String clssId) {
        this.clssId = clssId;
    }

    public Classes(String clssId, String clssCodigo, String clssNome, BigDecimal clssPercComAvt, BigDecimal clssPercComPrz) {
        this.clssId = clssId;
        this.clssCodigo = clssCodigo;
        this.clssNome = clssNome;
        this.clssPercComAvt = clssPercComAvt;
        this.clssPercComPrz = clssPercComPrz;
    }

    public String getClssId() {
        return clssId;
    }

    public void setClssId(String clssId) {
        this.clssId = clssId;
    }

    public String getClssCodigo() {
        return clssCodigo;
    }

    public void setClssCodigo(String clssCodigo) {
        this.clssCodigo = clssCodigo;
    }

    public String getClssNome() {
        return clssNome;
    }

    public void setClssNome(String clssNome) {
        this.clssNome = clssNome;
    }

    public BigDecimal getClssPercComAvt() {
        return clssPercComAvt;
    }

    public void setClssPercComAvt(BigDecimal clssPercComAvt) {
        this.clssPercComAvt = clssPercComAvt;
    }

    public BigDecimal getClssPercComPrz() {
        return clssPercComPrz;
    }

    public void setClssPercComPrz(BigDecimal clssPercComPrz) {
        this.clssPercComPrz = clssPercComPrz;
    }

    public Date getClssLASTUPDATE() {
        return clssLASTUPDATE;
    }

    public void setClssLASTUPDATE(Date clssLASTUPDATE) {
        this.clssLASTUPDATE = clssLASTUPDATE;
    }

    public BigDecimal getClssTcnPercComAvt() {
        return clssTcnPercComAvt;
    }

    public void setClssTcnPercComAvt(BigDecimal clssTcnPercComAvt) {
        this.clssTcnPercComAvt = clssTcnPercComAvt;
    }

    public BigDecimal getClssTcnPercComPrz() {
        return clssTcnPercComPrz;
    }

    public void setClssTcnPercComPrz(BigDecimal clssTcnPercComPrz) {
        this.clssTcnPercComPrz = clssTcnPercComPrz;
    }

    public BigDecimal getClssVlrPontos() {
        return clssVlrPontos;
    }

    public void setClssVlrPontos(BigDecimal clssVlrPontos) {
        this.clssVlrPontos = clssVlrPontos;
    }

    public BigDecimal getClssTcnMultPcomAvt() {
        return clssTcnMultPcomAvt;
    }

    public void setClssTcnMultPcomAvt(BigDecimal clssTcnMultPcomAvt) {
        this.clssTcnMultPcomAvt = clssTcnMultPcomAvt;
    }

    public BigDecimal getClssTcnMultPcomPrz() {
        return clssTcnMultPcomPrz;
    }

    public void setClssTcnMultPcomPrz(BigDecimal clssTcnMultPcomPrz) {
        this.clssTcnMultPcomPrz = clssTcnMultPcomPrz;
    }

    public BigDecimal getClssTcnMult2PcomAvt() {
        return clssTcnMult2PcomAvt;
    }

    public void setClssTcnMult2PcomAvt(BigDecimal clssTcnMult2PcomAvt) {
        this.clssTcnMult2PcomAvt = clssTcnMult2PcomAvt;
    }

    public BigDecimal getClssTcnMult2PcomPrz() {
        return clssTcnMult2PcomPrz;
    }

    public void setClssTcnMult2PcomPrz(BigDecimal clssTcnMult2PcomPrz) {
        this.clssTcnMult2PcomPrz = clssTcnMult2PcomPrz;
    }

    public BigDecimal getClssComMaoObra() {
        return clssComMaoObra;
    }

    public void setClssComMaoObra(BigDecimal clssComMaoObra) {
        this.clssComMaoObra = clssComMaoObra;
    }

    @XmlTransient
    public List<Produtos> getProdutosList() {
        return produtosList;
    }

    public void setProdutosList(List<Produtos> produtosList) {
        this.produtosList = produtosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (clssId != null ? clssId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Classes)) {
            return false;
        }
        Classes other = (Classes) object;
        if ((this.clssId == null && other.clssId != null) || (this.clssId != null && !this.clssId.equals(other.clssId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.Classes[ clssId=" + clssId + " ]";
    }
    
}
