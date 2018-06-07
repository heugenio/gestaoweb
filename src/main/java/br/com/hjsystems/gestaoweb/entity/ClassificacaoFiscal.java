/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hjsystems.gestaoweb.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "CLASSIFICACAO_FISCAL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ClassificacaoFiscal.findAll", query = "SELECT c FROM ClassificacaoFiscal c"),
    @NamedQuery(name = "ClassificacaoFiscal.findByClfcId", query = "SELECT c FROM ClassificacaoFiscal c WHERE c.clfcId = :clfcId"),
    @NamedQuery(name = "ClassificacaoFiscal.findByClfcDestinacao", query = "SELECT c FROM ClassificacaoFiscal c WHERE c.clfcDestinacao = :clfcDestinacao"),
    @NamedQuery(name = "ClassificacaoFiscal.findByClfcNaturezaEconomica", query = "SELECT c FROM ClassificacaoFiscal c WHERE c.clfcNaturezaEconomica = :clfcNaturezaEconomica"),
    @NamedQuery(name = "ClassificacaoFiscal.findByClfcRegimeFiscalTributario", query = "SELECT c FROM ClassificacaoFiscal c WHERE c.clfcRegimeFiscalTributario = :clfcRegimeFiscalTributario"),
    @NamedQuery(name = "ClassificacaoFiscal.findByClfcNaturezaContribuinte", query = "SELECT c FROM ClassificacaoFiscal c WHERE c.clfcNaturezaContribuinte = :clfcNaturezaContribuinte"),
    @NamedQuery(name = "ClassificacaoFiscal.findByClfcObjetivoComercial", query = "SELECT c FROM ClassificacaoFiscal c WHERE c.clfcObjetivoComercial = :clfcObjetivoComercial"),
    @NamedQuery(name = "ClassificacaoFiscal.findByClfcCfop", query = "SELECT c FROM ClassificacaoFiscal c WHERE c.clfcCfop = :clfcCfop"),
    @NamedQuery(name = "ClassificacaoFiscal.findByClfcCst", query = "SELECT c FROM ClassificacaoFiscal c WHERE c.clfcCst = :clfcCst"),
    @NamedQuery(name = "ClassificacaoFiscal.findByClfcCstIpi", query = "SELECT c FROM ClassificacaoFiscal c WHERE c.clfcCstIpi = :clfcCstIpi"),
    @NamedQuery(name = "ClassificacaoFiscal.findByClFcLASTUPDATE", query = "SELECT c FROM ClassificacaoFiscal c WHERE c.clFcLASTUPDATE = :clFcLASTUPDATE"),
    @NamedQuery(name = "ClassificacaoFiscal.findByClfcCsosn", query = "SELECT c FROM ClassificacaoFiscal c WHERE c.clfcCsosn = :clfcCsosn")})
public class ClassificacaoFiscal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CLFC_ID")
    private String clfcId;
    @Basic(optional = false)
    @Column(name = "CLFC_DESTINACAO")
    private String clfcDestinacao;
    @Basic(optional = false)
    @Column(name = "CLFC_NATUREZA_ECONOMICA")
    private String clfcNaturezaEconomica;
    @Basic(optional = false)
    @Column(name = "CLFC_REGIME_FISCAL_TRIBUTARIO")
    private String clfcRegimeFiscalTributario;
    @Basic(optional = false)
    @Column(name = "CLFC_NATUREZA_CONTRIBUINTE")
    private String clfcNaturezaContribuinte;
    @Basic(optional = false)
    @Column(name = "CLFC_OBJETIVO_COMERCIAL")
    private String clfcObjetivoComercial;
    @Basic(optional = false)
    @Column(name = "CLFC_CFOP")
    private String clfcCfop;
    @Basic(optional = false)
    @Column(name = "CLFC_CST")
    private String clfcCst;
    @Basic(optional = false)
    @Column(name = "CLFC_CST_IPI")
    private String clfcCstIpi;
    @Column(name = "ClFc_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date clFcLASTUPDATE;
    @Column(name = "CLFC_CSOSN")
    private String clfcCsosn;
    @OneToMany(mappedBy = "clfcId")
    private List<ItensFaturados> itensFaturadosList;
    @JoinColumn(name = "MSNF_ID", referencedColumnName = "MSNF_ID")
    @ManyToOne
    private MensagensNotaFiscal msnfId;
    @JoinColumn(name = "OPCM_ID", referencedColumnName = "OPCM_ID")
    @ManyToOne
    private OperacoesComerciais opcmId;
    @JoinColumn(name = "RMAT_ID", referencedColumnName = "RMAT_ID")
    @ManyToOne
    private RamosAtividade rmatId;

    public ClassificacaoFiscal() {
    }

    public ClassificacaoFiscal(String clfcId) {
        this.clfcId = clfcId;
    }

    public ClassificacaoFiscal(String clfcId, String clfcDestinacao, String clfcNaturezaEconomica, String clfcRegimeFiscalTributario, String clfcNaturezaContribuinte, String clfcObjetivoComercial, String clfcCfop, String clfcCst, String clfcCstIpi) {
        this.clfcId = clfcId;
        this.clfcDestinacao = clfcDestinacao;
        this.clfcNaturezaEconomica = clfcNaturezaEconomica;
        this.clfcRegimeFiscalTributario = clfcRegimeFiscalTributario;
        this.clfcNaturezaContribuinte = clfcNaturezaContribuinte;
        this.clfcObjetivoComercial = clfcObjetivoComercial;
        this.clfcCfop = clfcCfop;
        this.clfcCst = clfcCst;
        this.clfcCstIpi = clfcCstIpi;
    }

    public String getClfcId() {
        return clfcId;
    }

    public void setClfcId(String clfcId) {
        this.clfcId = clfcId;
    }

    public String getClfcDestinacao() {
        return clfcDestinacao;
    }

    public void setClfcDestinacao(String clfcDestinacao) {
        this.clfcDestinacao = clfcDestinacao;
    }

    public String getClfcNaturezaEconomica() {
        return clfcNaturezaEconomica;
    }

    public void setClfcNaturezaEconomica(String clfcNaturezaEconomica) {
        this.clfcNaturezaEconomica = clfcNaturezaEconomica;
    }

    public String getClfcRegimeFiscalTributario() {
        return clfcRegimeFiscalTributario;
    }

    public void setClfcRegimeFiscalTributario(String clfcRegimeFiscalTributario) {
        this.clfcRegimeFiscalTributario = clfcRegimeFiscalTributario;
    }

    public String getClfcNaturezaContribuinte() {
        return clfcNaturezaContribuinte;
    }

    public void setClfcNaturezaContribuinte(String clfcNaturezaContribuinte) {
        this.clfcNaturezaContribuinte = clfcNaturezaContribuinte;
    }

    public String getClfcObjetivoComercial() {
        return clfcObjetivoComercial;
    }

    public void setClfcObjetivoComercial(String clfcObjetivoComercial) {
        this.clfcObjetivoComercial = clfcObjetivoComercial;
    }

    public String getClfcCfop() {
        return clfcCfop;
    }

    public void setClfcCfop(String clfcCfop) {
        this.clfcCfop = clfcCfop;
    }

    public String getClfcCst() {
        return clfcCst;
    }

    public void setClfcCst(String clfcCst) {
        this.clfcCst = clfcCst;
    }

    public String getClfcCstIpi() {
        return clfcCstIpi;
    }

    public void setClfcCstIpi(String clfcCstIpi) {
        this.clfcCstIpi = clfcCstIpi;
    }

    public Date getClFcLASTUPDATE() {
        return clFcLASTUPDATE;
    }

    public void setClFcLASTUPDATE(Date clFcLASTUPDATE) {
        this.clFcLASTUPDATE = clFcLASTUPDATE;
    }

    public String getClfcCsosn() {
        return clfcCsosn;
    }

    public void setClfcCsosn(String clfcCsosn) {
        this.clfcCsosn = clfcCsosn;
    }

    @XmlTransient
    public List<ItensFaturados> getItensFaturadosList() {
        return itensFaturadosList;
    }

    public void setItensFaturadosList(List<ItensFaturados> itensFaturadosList) {
        this.itensFaturadosList = itensFaturadosList;
    }

    public MensagensNotaFiscal getMsnfId() {
        return msnfId;
    }

    public void setMsnfId(MensagensNotaFiscal msnfId) {
        this.msnfId = msnfId;
    }

    public OperacoesComerciais getOpcmId() {
        return opcmId;
    }

    public void setOpcmId(OperacoesComerciais opcmId) {
        this.opcmId = opcmId;
    }

    public RamosAtividade getRmatId() {
        return rmatId;
    }

    public void setRmatId(RamosAtividade rmatId) {
        this.rmatId = rmatId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (clfcId != null ? clfcId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClassificacaoFiscal)) {
            return false;
        }
        ClassificacaoFiscal other = (ClassificacaoFiscal) object;
        if ((this.clfcId == null && other.clfcId != null) || (this.clfcId != null && !this.clfcId.equals(other.clfcId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.ClassificacaoFiscal[ clfcId=" + clfcId + " ]";
    }
    
}
