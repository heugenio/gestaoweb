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
@Table(name = "SIMPLES_NACIONAL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SimplesNacional.findAll", query = "SELECT s FROM SimplesNacional s"),
    @NamedQuery(name = "SimplesNacional.findBySpncId", query = "SELECT s FROM SimplesNacional s WHERE s.spncId = :spncId"),
    @NamedQuery(name = "SimplesNacional.findBySpncVlrInicial", query = "SELECT s FROM SimplesNacional s WHERE s.spncVlrInicial = :spncVlrInicial"),
    @NamedQuery(name = "SimplesNacional.findBySpncVlrFinal", query = "SELECT s FROM SimplesNacional s WHERE s.spncVlrFinal = :spncVlrFinal"),
    @NamedQuery(name = "SimplesNacional.findBySpncAliqVerificacao", query = "SELECT s FROM SimplesNacional s WHERE s.spncAliqVerificacao = :spncAliqVerificacao"),
    @NamedQuery(name = "SimplesNacional.findBySpncAliqIrpj", query = "SELECT s FROM SimplesNacional s WHERE s.spncAliqIrpj = :spncAliqIrpj"),
    @NamedQuery(name = "SimplesNacional.findBySpncAliqCsll", query = "SELECT s FROM SimplesNacional s WHERE s.spncAliqCsll = :spncAliqCsll"),
    @NamedQuery(name = "SimplesNacional.findBySpncAliqCofins", query = "SELECT s FROM SimplesNacional s WHERE s.spncAliqCofins = :spncAliqCofins"),
    @NamedQuery(name = "SimplesNacional.findBySpncAliqPispasep", query = "SELECT s FROM SimplesNacional s WHERE s.spncAliqPispasep = :spncAliqPispasep"),
    @NamedQuery(name = "SimplesNacional.findBySpncAliqCpp", query = "SELECT s FROM SimplesNacional s WHERE s.spncAliqCpp = :spncAliqCpp"),
    @NamedQuery(name = "SimplesNacional.findBySpncAliqIcms", query = "SELECT s FROM SimplesNacional s WHERE s.spncAliqIcms = :spncAliqIcms"),
    @NamedQuery(name = "SimplesNacional.findBySpncLastupdate", query = "SELECT s FROM SimplesNacional s WHERE s.spncLastupdate = :spncLastupdate")})
public class SimplesNacional implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SPNC_ID")
    private String spncId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "SPNC_VLR_INICIAL")
    private BigDecimal spncVlrInicial;
    @Basic(optional = false)
    @Column(name = "SPNC_VLR_FINAL")
    private BigDecimal spncVlrFinal;
    @Basic(optional = false)
    @Column(name = "SPNC_ALIQ_VERIFICACAO")
    private BigDecimal spncAliqVerificacao;
    @Basic(optional = false)
    @Column(name = "SPNC_ALIQ_IRPJ")
    private BigDecimal spncAliqIrpj;
    @Basic(optional = false)
    @Column(name = "SPNC_ALIQ_CSLL")
    private BigDecimal spncAliqCsll;
    @Basic(optional = false)
    @Column(name = "SPNC_ALIQ_COFINS")
    private BigDecimal spncAliqCofins;
    @Basic(optional = false)
    @Column(name = "SPNC_ALIQ_PISPASEP")
    private BigDecimal spncAliqPispasep;
    @Basic(optional = false)
    @Column(name = "SPNC_ALIQ_CPP")
    private BigDecimal spncAliqCpp;
    @Basic(optional = false)
    @Column(name = "SPNC_ALIQ_ICMS")
    private BigDecimal spncAliqIcms;
    @Column(name = "SPNC_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date spncLastupdate;

    public SimplesNacional() {
    }

    public SimplesNacional(String spncId) {
        this.spncId = spncId;
    }

    public SimplesNacional(String spncId, BigDecimal spncVlrInicial, BigDecimal spncVlrFinal, BigDecimal spncAliqVerificacao, BigDecimal spncAliqIrpj, BigDecimal spncAliqCsll, BigDecimal spncAliqCofins, BigDecimal spncAliqPispasep, BigDecimal spncAliqCpp, BigDecimal spncAliqIcms) {
        this.spncId = spncId;
        this.spncVlrInicial = spncVlrInicial;
        this.spncVlrFinal = spncVlrFinal;
        this.spncAliqVerificacao = spncAliqVerificacao;
        this.spncAliqIrpj = spncAliqIrpj;
        this.spncAliqCsll = spncAliqCsll;
        this.spncAliqCofins = spncAliqCofins;
        this.spncAliqPispasep = spncAliqPispasep;
        this.spncAliqCpp = spncAliqCpp;
        this.spncAliqIcms = spncAliqIcms;
    }

    public String getSpncId() {
        return spncId;
    }

    public void setSpncId(String spncId) {
        this.spncId = spncId;
    }

    public BigDecimal getSpncVlrInicial() {
        return spncVlrInicial;
    }

    public void setSpncVlrInicial(BigDecimal spncVlrInicial) {
        this.spncVlrInicial = spncVlrInicial;
    }

    public BigDecimal getSpncVlrFinal() {
        return spncVlrFinal;
    }

    public void setSpncVlrFinal(BigDecimal spncVlrFinal) {
        this.spncVlrFinal = spncVlrFinal;
    }

    public BigDecimal getSpncAliqVerificacao() {
        return spncAliqVerificacao;
    }

    public void setSpncAliqVerificacao(BigDecimal spncAliqVerificacao) {
        this.spncAliqVerificacao = spncAliqVerificacao;
    }

    public BigDecimal getSpncAliqIrpj() {
        return spncAliqIrpj;
    }

    public void setSpncAliqIrpj(BigDecimal spncAliqIrpj) {
        this.spncAliqIrpj = spncAliqIrpj;
    }

    public BigDecimal getSpncAliqCsll() {
        return spncAliqCsll;
    }

    public void setSpncAliqCsll(BigDecimal spncAliqCsll) {
        this.spncAliqCsll = spncAliqCsll;
    }

    public BigDecimal getSpncAliqCofins() {
        return spncAliqCofins;
    }

    public void setSpncAliqCofins(BigDecimal spncAliqCofins) {
        this.spncAliqCofins = spncAliqCofins;
    }

    public BigDecimal getSpncAliqPispasep() {
        return spncAliqPispasep;
    }

    public void setSpncAliqPispasep(BigDecimal spncAliqPispasep) {
        this.spncAliqPispasep = spncAliqPispasep;
    }

    public BigDecimal getSpncAliqCpp() {
        return spncAliqCpp;
    }

    public void setSpncAliqCpp(BigDecimal spncAliqCpp) {
        this.spncAliqCpp = spncAliqCpp;
    }

    public BigDecimal getSpncAliqIcms() {
        return spncAliqIcms;
    }

    public void setSpncAliqIcms(BigDecimal spncAliqIcms) {
        this.spncAliqIcms = spncAliqIcms;
    }

    public Date getSpncLastupdate() {
        return spncLastupdate;
    }

    public void setSpncLastupdate(Date spncLastupdate) {
        this.spncLastupdate = spncLastupdate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (spncId != null ? spncId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SimplesNacional)) {
            return false;
        }
        SimplesNacional other = (SimplesNacional) object;
        if ((this.spncId == null && other.spncId != null) || (this.spncId != null && !this.spncId.equals(other.spncId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.SimplesNacional[ spncId=" + spncId + " ]";
    }
    
}
