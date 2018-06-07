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
@Table(name = "SUBCLASSES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Subclasses.findAll", query = "SELECT s FROM Subclasses s"),
    @NamedQuery(name = "Subclasses.findBySbclId", query = "SELECT s FROM Subclasses s WHERE s.sbclId = :sbclId"),
    @NamedQuery(name = "Subclasses.findBySbclCodigo", query = "SELECT s FROM Subclasses s WHERE s.sbclCodigo = :sbclCodigo"),
    @NamedQuery(name = "Subclasses.findBySbclNome", query = "SELECT s FROM Subclasses s WHERE s.sbclNome = :sbclNome"),
    @NamedQuery(name = "Subclasses.findBySbclPercComAvt", query = "SELECT s FROM Subclasses s WHERE s.sbclPercComAvt = :sbclPercComAvt"),
    @NamedQuery(name = "Subclasses.findBySbclPercComPrz", query = "SELECT s FROM Subclasses s WHERE s.sbclPercComPrz = :sbclPercComPrz"),
    @NamedQuery(name = "Subclasses.findBySbClLASTUPDATE", query = "SELECT s FROM Subclasses s WHERE s.sbClLASTUPDATE = :sbClLASTUPDATE"),
    @NamedQuery(name = "Subclasses.findBySbclTcnPercComAvt", query = "SELECT s FROM Subclasses s WHERE s.sbclTcnPercComAvt = :sbclTcnPercComAvt"),
    @NamedQuery(name = "Subclasses.findBySbclTcnPercComPrz", query = "SELECT s FROM Subclasses s WHERE s.sbclTcnPercComPrz = :sbclTcnPercComPrz"),
    @NamedQuery(name = "Subclasses.findBySbclVlrPontos", query = "SELECT s FROM Subclasses s WHERE s.sbclVlrPontos = :sbclVlrPontos"),
    @NamedQuery(name = "Subclasses.findBySbclTcnMultPcomAvt", query = "SELECT s FROM Subclasses s WHERE s.sbclTcnMultPcomAvt = :sbclTcnMultPcomAvt"),
    @NamedQuery(name = "Subclasses.findBySbclTcnMultPcomPrz", query = "SELECT s FROM Subclasses s WHERE s.sbclTcnMultPcomPrz = :sbclTcnMultPcomPrz"),
    @NamedQuery(name = "Subclasses.findBySbclTcnMult2PcomAvt", query = "SELECT s FROM Subclasses s WHERE s.sbclTcnMult2PcomAvt = :sbclTcnMult2PcomAvt"),
    @NamedQuery(name = "Subclasses.findBySbclTcnMult2PcomPrz", query = "SELECT s FROM Subclasses s WHERE s.sbclTcnMult2PcomPrz = :sbclTcnMult2PcomPrz")})
public class Subclasses implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SBCL_ID")
    private String sbclId;
    @Basic(optional = false)
    @Column(name = "SBCL_CODIGO")
    private String sbclCodigo;
    @Basic(optional = false)
    @Column(name = "SBCL_NOME")
    private String sbclNome;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "SBCL_PERC_COM_AVT")
    private BigDecimal sbclPercComAvt;
    @Basic(optional = false)
    @Column(name = "SBCL_PERC_COM_PRZ")
    private BigDecimal sbclPercComPrz;
    @Column(name = "SbCl_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sbClLASTUPDATE;
    @Column(name = "SBCL_TCN_PERC_COM_AVT")
    private BigDecimal sbclTcnPercComAvt;
    @Column(name = "SBCL_TCN_PERC_COM_PRZ")
    private BigDecimal sbclTcnPercComPrz;
    @Column(name = "SBCL_VLR_PONTOS")
    private BigDecimal sbclVlrPontos;
    @Column(name = "SBCL_TCN_MULT_PCOM_AVT")
    private BigDecimal sbclTcnMultPcomAvt;
    @Column(name = "SBCL_TCN_MULT_PCOM_PRZ")
    private BigDecimal sbclTcnMultPcomPrz;
    @Column(name = "SBCL_TCN_MULT2_PCOM_AVT")
    private BigDecimal sbclTcnMult2PcomAvt;
    @Column(name = "SBCL_TCN_MULT2_PCOM_PRZ")
    private BigDecimal sbclTcnMult2PcomPrz;
    @OneToMany(mappedBy = "sbclId")
    private List<Produtos> produtosList;

    public Subclasses() {
    }

    public Subclasses(String sbclId) {
        this.sbclId = sbclId;
    }

    public Subclasses(String sbclId, String sbclCodigo, String sbclNome, BigDecimal sbclPercComAvt, BigDecimal sbclPercComPrz) {
        this.sbclId = sbclId;
        this.sbclCodigo = sbclCodigo;
        this.sbclNome = sbclNome;
        this.sbclPercComAvt = sbclPercComAvt;
        this.sbclPercComPrz = sbclPercComPrz;
    }

    public String getSbclId() {
        return sbclId;
    }

    public void setSbclId(String sbclId) {
        this.sbclId = sbclId;
    }

    public String getSbclCodigo() {
        return sbclCodigo;
    }

    public void setSbclCodigo(String sbclCodigo) {
        this.sbclCodigo = sbclCodigo;
    }

    public String getSbclNome() {
        return sbclNome;
    }

    public void setSbclNome(String sbclNome) {
        this.sbclNome = sbclNome;
    }

    public BigDecimal getSbclPercComAvt() {
        return sbclPercComAvt;
    }

    public void setSbclPercComAvt(BigDecimal sbclPercComAvt) {
        this.sbclPercComAvt = sbclPercComAvt;
    }

    public BigDecimal getSbclPercComPrz() {
        return sbclPercComPrz;
    }

    public void setSbclPercComPrz(BigDecimal sbclPercComPrz) {
        this.sbclPercComPrz = sbclPercComPrz;
    }

    public Date getSbClLASTUPDATE() {
        return sbClLASTUPDATE;
    }

    public void setSbClLASTUPDATE(Date sbClLASTUPDATE) {
        this.sbClLASTUPDATE = sbClLASTUPDATE;
    }

    public BigDecimal getSbclTcnPercComAvt() {
        return sbclTcnPercComAvt;
    }

    public void setSbclTcnPercComAvt(BigDecimal sbclTcnPercComAvt) {
        this.sbclTcnPercComAvt = sbclTcnPercComAvt;
    }

    public BigDecimal getSbclTcnPercComPrz() {
        return sbclTcnPercComPrz;
    }

    public void setSbclTcnPercComPrz(BigDecimal sbclTcnPercComPrz) {
        this.sbclTcnPercComPrz = sbclTcnPercComPrz;
    }

    public BigDecimal getSbclVlrPontos() {
        return sbclVlrPontos;
    }

    public void setSbclVlrPontos(BigDecimal sbclVlrPontos) {
        this.sbclVlrPontos = sbclVlrPontos;
    }

    public BigDecimal getSbclTcnMultPcomAvt() {
        return sbclTcnMultPcomAvt;
    }

    public void setSbclTcnMultPcomAvt(BigDecimal sbclTcnMultPcomAvt) {
        this.sbclTcnMultPcomAvt = sbclTcnMultPcomAvt;
    }

    public BigDecimal getSbclTcnMultPcomPrz() {
        return sbclTcnMultPcomPrz;
    }

    public void setSbclTcnMultPcomPrz(BigDecimal sbclTcnMultPcomPrz) {
        this.sbclTcnMultPcomPrz = sbclTcnMultPcomPrz;
    }

    public BigDecimal getSbclTcnMult2PcomAvt() {
        return sbclTcnMult2PcomAvt;
    }

    public void setSbclTcnMult2PcomAvt(BigDecimal sbclTcnMult2PcomAvt) {
        this.sbclTcnMult2PcomAvt = sbclTcnMult2PcomAvt;
    }

    public BigDecimal getSbclTcnMult2PcomPrz() {
        return sbclTcnMult2PcomPrz;
    }

    public void setSbclTcnMult2PcomPrz(BigDecimal sbclTcnMult2PcomPrz) {
        this.sbclTcnMult2PcomPrz = sbclTcnMult2PcomPrz;
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
        hash += (sbclId != null ? sbclId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Subclasses)) {
            return false;
        }
        Subclasses other = (Subclasses) object;
        if ((this.sbclId == null && other.sbclId != null) || (this.sbclId != null && !this.sbclId.equals(other.sbclId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.Subclasses[ sbclId=" + sbclId + " ]";
    }
    
}
