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
@Table(name = "RENDAS_PESSOA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RendasPessoa.findAll", query = "SELECT r FROM RendasPessoa r"),
    @NamedQuery(name = "RendasPessoa.findByRdpsId", query = "SELECT r FROM RendasPessoa r WHERE r.rdpsId = :rdpsId"),
    @NamedQuery(name = "RendasPessoa.findByRdpsSalarioFixo", query = "SELECT r FROM RendasPessoa r WHERE r.rdpsSalarioFixo = :rdpsSalarioFixo"),
    @NamedQuery(name = "RendasPessoa.findByRdpsMediaComissao", query = "SELECT r FROM RendasPessoa r WHERE r.rdpsMediaComissao = :rdpsMediaComissao"),
    @NamedQuery(name = "RendasPessoa.findByRdpsOutrasRendas", query = "SELECT r FROM RendasPessoa r WHERE r.rdpsOutrasRendas = :rdpsOutrasRendas"),
    @NamedQuery(name = "RendasPessoa.findByRdpsRendaConjuge", query = "SELECT r FROM RendasPessoa r WHERE r.rdpsRendaConjuge = :rdpsRendaConjuge"),
    @NamedQuery(name = "RendasPessoa.findByRdpsOutrasRendasConjuge", query = "SELECT r FROM RendasPessoa r WHERE r.rdpsOutrasRendasConjuge = :rdpsOutrasRendasConjuge"),
    @NamedQuery(name = "RendasPessoa.findByRdpsAluguelMes", query = "SELECT r FROM RendasPessoa r WHERE r.rdpsAluguelMes = :rdpsAluguelMes"),
    @NamedQuery(name = "RendasPessoa.findByRdpsFinanciamentos", query = "SELECT r FROM RendasPessoa r WHERE r.rdpsFinanciamentos = :rdpsFinanciamentos"),
    @NamedQuery(name = "RendasPessoa.findByRdpsOutrasDespesas", query = "SELECT r FROM RendasPessoa r WHERE r.rdpsOutrasDespesas = :rdpsOutrasDespesas"),
    @NamedQuery(name = "RendasPessoa.findByRdPsLASTUPDATE", query = "SELECT r FROM RendasPessoa r WHERE r.rdPsLASTUPDATE = :rdPsLASTUPDATE")})
public class RendasPessoa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "RDPS_ID")
    private String rdpsId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "RDPS_SALARIO_FIXO")
    private BigDecimal rdpsSalarioFixo;
    @Basic(optional = false)
    @Column(name = "RDPS_MEDIA_COMISSAO")
    private BigDecimal rdpsMediaComissao;
    @Basic(optional = false)
    @Column(name = "RDPS_OUTRAS_RENDAS")
    private BigDecimal rdpsOutrasRendas;
    @Basic(optional = false)
    @Column(name = "RDPS_RENDA_CONJUGE")
    private BigDecimal rdpsRendaConjuge;
    @Basic(optional = false)
    @Column(name = "RDPS_OUTRAS_RENDAS_CONJUGE")
    private BigDecimal rdpsOutrasRendasConjuge;
    @Basic(optional = false)
    @Column(name = "RDPS_ALUGUEL_MES")
    private BigDecimal rdpsAluguelMes;
    @Basic(optional = false)
    @Column(name = "RDPS_FINANCIAMENTOS")
    private BigDecimal rdpsFinanciamentos;
    @Basic(optional = false)
    @Column(name = "RDPS_OUTRAS_DESPESAS")
    private BigDecimal rdpsOutrasDespesas;
    @Column(name = "RdPs_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rdPsLASTUPDATE;
    @JoinColumn(name = "PESS_ID", referencedColumnName = "PESS_ID")
    @ManyToOne
    private Pessoas pessId;

    public RendasPessoa() {
    }

    public RendasPessoa(String rdpsId) {
        this.rdpsId = rdpsId;
    }

    public RendasPessoa(String rdpsId, BigDecimal rdpsSalarioFixo, BigDecimal rdpsMediaComissao, BigDecimal rdpsOutrasRendas, BigDecimal rdpsRendaConjuge, BigDecimal rdpsOutrasRendasConjuge, BigDecimal rdpsAluguelMes, BigDecimal rdpsFinanciamentos, BigDecimal rdpsOutrasDespesas) {
        this.rdpsId = rdpsId;
        this.rdpsSalarioFixo = rdpsSalarioFixo;
        this.rdpsMediaComissao = rdpsMediaComissao;
        this.rdpsOutrasRendas = rdpsOutrasRendas;
        this.rdpsRendaConjuge = rdpsRendaConjuge;
        this.rdpsOutrasRendasConjuge = rdpsOutrasRendasConjuge;
        this.rdpsAluguelMes = rdpsAluguelMes;
        this.rdpsFinanciamentos = rdpsFinanciamentos;
        this.rdpsOutrasDespesas = rdpsOutrasDespesas;
    }

    public String getRdpsId() {
        return rdpsId;
    }

    public void setRdpsId(String rdpsId) {
        this.rdpsId = rdpsId;
    }

    public BigDecimal getRdpsSalarioFixo() {
        return rdpsSalarioFixo;
    }

    public void setRdpsSalarioFixo(BigDecimal rdpsSalarioFixo) {
        this.rdpsSalarioFixo = rdpsSalarioFixo;
    }

    public BigDecimal getRdpsMediaComissao() {
        return rdpsMediaComissao;
    }

    public void setRdpsMediaComissao(BigDecimal rdpsMediaComissao) {
        this.rdpsMediaComissao = rdpsMediaComissao;
    }

    public BigDecimal getRdpsOutrasRendas() {
        return rdpsOutrasRendas;
    }

    public void setRdpsOutrasRendas(BigDecimal rdpsOutrasRendas) {
        this.rdpsOutrasRendas = rdpsOutrasRendas;
    }

    public BigDecimal getRdpsRendaConjuge() {
        return rdpsRendaConjuge;
    }

    public void setRdpsRendaConjuge(BigDecimal rdpsRendaConjuge) {
        this.rdpsRendaConjuge = rdpsRendaConjuge;
    }

    public BigDecimal getRdpsOutrasRendasConjuge() {
        return rdpsOutrasRendasConjuge;
    }

    public void setRdpsOutrasRendasConjuge(BigDecimal rdpsOutrasRendasConjuge) {
        this.rdpsOutrasRendasConjuge = rdpsOutrasRendasConjuge;
    }

    public BigDecimal getRdpsAluguelMes() {
        return rdpsAluguelMes;
    }

    public void setRdpsAluguelMes(BigDecimal rdpsAluguelMes) {
        this.rdpsAluguelMes = rdpsAluguelMes;
    }

    public BigDecimal getRdpsFinanciamentos() {
        return rdpsFinanciamentos;
    }

    public void setRdpsFinanciamentos(BigDecimal rdpsFinanciamentos) {
        this.rdpsFinanciamentos = rdpsFinanciamentos;
    }

    public BigDecimal getRdpsOutrasDespesas() {
        return rdpsOutrasDespesas;
    }

    public void setRdpsOutrasDespesas(BigDecimal rdpsOutrasDespesas) {
        this.rdpsOutrasDespesas = rdpsOutrasDespesas;
    }

    public Date getRdPsLASTUPDATE() {
        return rdPsLASTUPDATE;
    }

    public void setRdPsLASTUPDATE(Date rdPsLASTUPDATE) {
        this.rdPsLASTUPDATE = rdPsLASTUPDATE;
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
        hash += (rdpsId != null ? rdpsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RendasPessoa)) {
            return false;
        }
        RendasPessoa other = (RendasPessoa) object;
        if ((this.rdpsId == null && other.rdpsId != null) || (this.rdpsId != null && !this.rdpsId.equals(other.rdpsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.RendasPessoa[ rdpsId=" + rdpsId + " ]";
    }
    
}
