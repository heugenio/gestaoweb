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
@Table(name = "SUBGRUPOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Subgrupos.findAll", query = "SELECT s FROM Subgrupos s"),
    @NamedQuery(name = "Subgrupos.findBySbgrId", query = "SELECT s FROM Subgrupos s WHERE s.sbgrId = :sbgrId"),
    @NamedQuery(name = "Subgrupos.findBySbgrCodigo", query = "SELECT s FROM Subgrupos s WHERE s.sbgrCodigo = :sbgrCodigo"),
    @NamedQuery(name = "Subgrupos.findBySbgrNome", query = "SELECT s FROM Subgrupos s WHERE s.sbgrNome = :sbgrNome"),
    @NamedQuery(name = "Subgrupos.findBySbgrPercComAvt", query = "SELECT s FROM Subgrupos s WHERE s.sbgrPercComAvt = :sbgrPercComAvt"),
    @NamedQuery(name = "Subgrupos.findBySbgrPercComPrz", query = "SELECT s FROM Subgrupos s WHERE s.sbgrPercComPrz = :sbgrPercComPrz"),
    @NamedQuery(name = "Subgrupos.findBySbGrLASTUPDATE", query = "SELECT s FROM Subgrupos s WHERE s.sbGrLASTUPDATE = :sbGrLASTUPDATE"),
    @NamedQuery(name = "Subgrupos.findBySbgrTcnPercComAvt", query = "SELECT s FROM Subgrupos s WHERE s.sbgrTcnPercComAvt = :sbgrTcnPercComAvt"),
    @NamedQuery(name = "Subgrupos.findBySbgrTcnPercComPrz", query = "SELECT s FROM Subgrupos s WHERE s.sbgrTcnPercComPrz = :sbgrTcnPercComPrz"),
    @NamedQuery(name = "Subgrupos.findBySbgrPercBonusComissao", query = "SELECT s FROM Subgrupos s WHERE s.sbgrPercBonusComissao = :sbgrPercBonusComissao"),
    @NamedQuery(name = "Subgrupos.findBySbgrPercLucroPrev", query = "SELECT s FROM Subgrupos s WHERE s.sbgrPercLucroPrev = :sbgrPercLucroPrev"),
    @NamedQuery(name = "Subgrupos.findBySbgrTcnMultPcomAvt", query = "SELECT s FROM Subgrupos s WHERE s.sbgrTcnMultPcomAvt = :sbgrTcnMultPcomAvt"),
    @NamedQuery(name = "Subgrupos.findBySbgrTcnMultPcomPrz", query = "SELECT s FROM Subgrupos s WHERE s.sbgrTcnMultPcomPrz = :sbgrTcnMultPcomPrz"),
    @NamedQuery(name = "Subgrupos.findBySbgrTcnMult2PcomAvt", query = "SELECT s FROM Subgrupos s WHERE s.sbgrTcnMult2PcomAvt = :sbgrTcnMult2PcomAvt"),
    @NamedQuery(name = "Subgrupos.findBySbgrTcnMult2PcomPrz", query = "SELECT s FROM Subgrupos s WHERE s.sbgrTcnMult2PcomPrz = :sbgrTcnMult2PcomPrz")})
public class Subgrupos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SBGR_ID")
    private String sbgrId;
    @Basic(optional = false)
    @Column(name = "SBGR_CODIGO")
    private String sbgrCodigo;
    @Basic(optional = false)
    @Column(name = "SBGR_NOME")
    private String sbgrNome;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "SBGR_PERC_COM_AVT")
    private BigDecimal sbgrPercComAvt;
    @Basic(optional = false)
    @Column(name = "SBGR_PERC_COM_PRZ")
    private BigDecimal sbgrPercComPrz;
    @Column(name = "SbGr_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sbGrLASTUPDATE;
    @Column(name = "SBGR_TCN_PERC_COM_AVT")
    private BigDecimal sbgrTcnPercComAvt;
    @Column(name = "SBGR_TCN_PERC_COM_PRZ")
    private BigDecimal sbgrTcnPercComPrz;
    @Column(name = "SBGR_PERC_BONUS_COMISSAO")
    private BigDecimal sbgrPercBonusComissao;
    @Column(name = "SBGR_PERC_LUCRO_PREV")
    private BigDecimal sbgrPercLucroPrev;
    @Column(name = "SBGR_TCN_MULT_PCOM_AVT")
    private BigDecimal sbgrTcnMultPcomAvt;
    @Column(name = "SBGR_TCN_MULT_PCOM_PRZ")
    private BigDecimal sbgrTcnMultPcomPrz;
    @Column(name = "SBGR_TCN_MULT2_PCOM_AVT")
    private BigDecimal sbgrTcnMult2PcomAvt;
    @Column(name = "SBGR_TCN_MULT2_PCOM_PRZ")
    private BigDecimal sbgrTcnMult2PcomPrz;
    @OneToMany(mappedBy = "sbgrId")
    private List<Produtos> produtosList;
    @OneToMany(mappedBy = "sbgrId")
    private List<Emails> emailsList;

    public Subgrupos() {
    }

    public Subgrupos(String sbgrId) {
        this.sbgrId = sbgrId;
    }

    public Subgrupos(String sbgrId, String sbgrCodigo, String sbgrNome, BigDecimal sbgrPercComAvt, BigDecimal sbgrPercComPrz) {
        this.sbgrId = sbgrId;
        this.sbgrCodigo = sbgrCodigo;
        this.sbgrNome = sbgrNome;
        this.sbgrPercComAvt = sbgrPercComAvt;
        this.sbgrPercComPrz = sbgrPercComPrz;
    }

    public String getSbgrId() {
        return sbgrId;
    }

    public void setSbgrId(String sbgrId) {
        this.sbgrId = sbgrId;
    }

    public String getSbgrCodigo() {
        return sbgrCodigo;
    }

    public void setSbgrCodigo(String sbgrCodigo) {
        this.sbgrCodigo = sbgrCodigo;
    }

    public String getSbgrNome() {
        return sbgrNome;
    }

    public void setSbgrNome(String sbgrNome) {
        this.sbgrNome = sbgrNome;
    }

    public BigDecimal getSbgrPercComAvt() {
        return sbgrPercComAvt;
    }

    public void setSbgrPercComAvt(BigDecimal sbgrPercComAvt) {
        this.sbgrPercComAvt = sbgrPercComAvt;
    }

    public BigDecimal getSbgrPercComPrz() {
        return sbgrPercComPrz;
    }

    public void setSbgrPercComPrz(BigDecimal sbgrPercComPrz) {
        this.sbgrPercComPrz = sbgrPercComPrz;
    }

    public Date getSbGrLASTUPDATE() {
        return sbGrLASTUPDATE;
    }

    public void setSbGrLASTUPDATE(Date sbGrLASTUPDATE) {
        this.sbGrLASTUPDATE = sbGrLASTUPDATE;
    }

    public BigDecimal getSbgrTcnPercComAvt() {
        return sbgrTcnPercComAvt;
    }

    public void setSbgrTcnPercComAvt(BigDecimal sbgrTcnPercComAvt) {
        this.sbgrTcnPercComAvt = sbgrTcnPercComAvt;
    }

    public BigDecimal getSbgrTcnPercComPrz() {
        return sbgrTcnPercComPrz;
    }

    public void setSbgrTcnPercComPrz(BigDecimal sbgrTcnPercComPrz) {
        this.sbgrTcnPercComPrz = sbgrTcnPercComPrz;
    }

    public BigDecimal getSbgrPercBonusComissao() {
        return sbgrPercBonusComissao;
    }

    public void setSbgrPercBonusComissao(BigDecimal sbgrPercBonusComissao) {
        this.sbgrPercBonusComissao = sbgrPercBonusComissao;
    }

    public BigDecimal getSbgrPercLucroPrev() {
        return sbgrPercLucroPrev;
    }

    public void setSbgrPercLucroPrev(BigDecimal sbgrPercLucroPrev) {
        this.sbgrPercLucroPrev = sbgrPercLucroPrev;
    }

    public BigDecimal getSbgrTcnMultPcomAvt() {
        return sbgrTcnMultPcomAvt;
    }

    public void setSbgrTcnMultPcomAvt(BigDecimal sbgrTcnMultPcomAvt) {
        this.sbgrTcnMultPcomAvt = sbgrTcnMultPcomAvt;
    }

    public BigDecimal getSbgrTcnMultPcomPrz() {
        return sbgrTcnMultPcomPrz;
    }

    public void setSbgrTcnMultPcomPrz(BigDecimal sbgrTcnMultPcomPrz) {
        this.sbgrTcnMultPcomPrz = sbgrTcnMultPcomPrz;
    }

    public BigDecimal getSbgrTcnMult2PcomAvt() {
        return sbgrTcnMult2PcomAvt;
    }

    public void setSbgrTcnMult2PcomAvt(BigDecimal sbgrTcnMult2PcomAvt) {
        this.sbgrTcnMult2PcomAvt = sbgrTcnMult2PcomAvt;
    }

    public BigDecimal getSbgrTcnMult2PcomPrz() {
        return sbgrTcnMult2PcomPrz;
    }

    public void setSbgrTcnMult2PcomPrz(BigDecimal sbgrTcnMult2PcomPrz) {
        this.sbgrTcnMult2PcomPrz = sbgrTcnMult2PcomPrz;
    }

    @XmlTransient
    public List<Produtos> getProdutosList() {
        return produtosList;
    }

    public void setProdutosList(List<Produtos> produtosList) {
        this.produtosList = produtosList;
    }

    @XmlTransient
    public List<Emails> getEmailsList() {
        return emailsList;
    }

    public void setEmailsList(List<Emails> emailsList) {
        this.emailsList = emailsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sbgrId != null ? sbgrId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Subgrupos)) {
            return false;
        }
        Subgrupos other = (Subgrupos) object;
        if ((this.sbgrId == null && other.sbgrId != null) || (this.sbgrId != null && !this.sbgrId.equals(other.sbgrId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.Subgrupos[ sbgrId=" + sbgrId + " ]";
    }
    
}
