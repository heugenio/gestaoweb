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
@Table(name = "INFORMACOES_COMERCIAIS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "InformacoesComerciais.findAll", query = "SELECT i FROM InformacoesComerciais i"),
    @NamedQuery(name = "InformacoesComerciais.findByIfcmId", query = "SELECT i FROM InformacoesComerciais i WHERE i.ifcmId = :ifcmId"),
    @NamedQuery(name = "InformacoesComerciais.findByIfcmNome", query = "SELECT i FROM InformacoesComerciais i WHERE i.ifcmNome = :ifcmNome"),
    @NamedQuery(name = "InformacoesComerciais.findByIfcmClienteDesde", query = "SELECT i FROM InformacoesComerciais i WHERE i.ifcmClienteDesde = :ifcmClienteDesde"),
    @NamedQuery(name = "InformacoesComerciais.findByIfcmObservacao", query = "SELECT i FROM InformacoesComerciais i WHERE i.ifcmObservacao = :ifcmObservacao"),
    @NamedQuery(name = "InformacoesComerciais.findByIfcmValorMaiorCompra", query = "SELECT i FROM InformacoesComerciais i WHERE i.ifcmValorMaiorCompra = :ifcmValorMaiorCompra"),
    @NamedQuery(name = "InformacoesComerciais.findByIfcmDataMaiorCompra", query = "SELECT i FROM InformacoesComerciais i WHERE i.ifcmDataMaiorCompra = :ifcmDataMaiorCompra"),
    @NamedQuery(name = "InformacoesComerciais.findByIfcmInformante", query = "SELECT i FROM InformacoesComerciais i WHERE i.ifcmInformante = :ifcmInformante"),
    @NamedQuery(name = "InformacoesComerciais.findByIfcmValorUltimaCompra", query = "SELECT i FROM InformacoesComerciais i WHERE i.ifcmValorUltimaCompra = :ifcmValorUltimaCompra"),
    @NamedQuery(name = "InformacoesComerciais.findByIfcmDataUltimaCompra", query = "SELECT i FROM InformacoesComerciais i WHERE i.ifcmDataUltimaCompra = :ifcmDataUltimaCompra"),
    @NamedQuery(name = "InformacoesComerciais.findByIfcmValorDebitoAtual", query = "SELECT i FROM InformacoesComerciais i WHERE i.ifcmValorDebitoAtual = :ifcmValorDebitoAtual"),
    @NamedQuery(name = "InformacoesComerciais.findByIfcmValorMaiorAcumulo", query = "SELECT i FROM InformacoesComerciais i WHERE i.ifcmValorMaiorAcumulo = :ifcmValorMaiorAcumulo"),
    @NamedQuery(name = "InformacoesComerciais.findByIfcmDataAcumulo", query = "SELECT i FROM InformacoesComerciais i WHERE i.ifcmDataAcumulo = :ifcmDataAcumulo"),
    @NamedQuery(name = "InformacoesComerciais.findByIfcmValorLimiteCredito", query = "SELECT i FROM InformacoesComerciais i WHERE i.ifcmValorLimiteCredito = :ifcmValorLimiteCredito"),
    @NamedQuery(name = "InformacoesComerciais.findByIfcmDiasMaiorAtrazo", query = "SELECT i FROM InformacoesComerciais i WHERE i.ifcmDiasMaiorAtrazo = :ifcmDiasMaiorAtrazo"),
    @NamedQuery(name = "InformacoesComerciais.findByIfcmDiasAtrazoMedio", query = "SELECT i FROM InformacoesComerciais i WHERE i.ifcmDiasAtrazoMedio = :ifcmDiasAtrazoMedio"),
    @NamedQuery(name = "InformacoesComerciais.findByIfcmTipoPontualidade", query = "SELECT i FROM InformacoesComerciais i WHERE i.ifcmTipoPontualidade = :ifcmTipoPontualidade"),
    @NamedQuery(name = "InformacoesComerciais.findByIfcmEmpresa", query = "SELECT i FROM InformacoesComerciais i WHERE i.ifcmEmpresa = :ifcmEmpresa"),
    @NamedQuery(name = "InformacoesComerciais.findByIfCmLASTUPDATE", query = "SELECT i FROM InformacoesComerciais i WHERE i.ifCmLASTUPDATE = :ifCmLASTUPDATE")})
public class InformacoesComerciais implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IFCM_ID")
    private String ifcmId;
    @Column(name = "IFCM_NOME")
    private String ifcmNome;
    @Column(name = "IFCM_CLIENTE_DESDE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ifcmClienteDesde;
    @Column(name = "IFCM_OBSERVACAO")
    private String ifcmObservacao;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "IFCM_VALOR_MAIOR_COMPRA")
    private BigDecimal ifcmValorMaiorCompra;
    @Column(name = "IFCM_DATA_MAIOR_COMPRA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ifcmDataMaiorCompra;
    @Column(name = "IFCM_INFORMANTE")
    private String ifcmInformante;
    @Basic(optional = false)
    @Column(name = "IFCM_VALOR_ULTIMA_COMPRA")
    private BigDecimal ifcmValorUltimaCompra;
    @Column(name = "IFCM_DATA_ULTIMA_COMPRA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ifcmDataUltimaCompra;
    @Basic(optional = false)
    @Column(name = "IFCM_VALOR_DEBITO_ATUAL")
    private BigDecimal ifcmValorDebitoAtual;
    @Basic(optional = false)
    @Column(name = "IFCM_VALOR_MAIOR_ACUMULO")
    private BigDecimal ifcmValorMaiorAcumulo;
    @Column(name = "IFCM_DATA_ACUMULO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ifcmDataAcumulo;
    @Basic(optional = false)
    @Column(name = "IFCM_VALOR_LIMITE_CREDITO")
    private BigDecimal ifcmValorLimiteCredito;
    @Column(name = "IFCM_DIAS_MAIOR_ATRAZO")
    private Integer ifcmDiasMaiorAtrazo;
    @Column(name = "IFCM_DIAS_ATRAZO_MEDIO")
    private Integer ifcmDiasAtrazoMedio;
    @Basic(optional = false)
    @Column(name = "IFCM_TIPO_PONTUALIDADE")
    private String ifcmTipoPontualidade;
    @Column(name = "IFCM_EMPRESA")
    private String ifcmEmpresa;
    @Column(name = "IfCm_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ifCmLASTUPDATE;
    @JoinColumn(name = "CLNT_ID", referencedColumnName = "CLNT_ID")
    @ManyToOne
    private Clientes clntId;

    public InformacoesComerciais() {
    }

    public InformacoesComerciais(String ifcmId) {
        this.ifcmId = ifcmId;
    }

    public InformacoesComerciais(String ifcmId, BigDecimal ifcmValorMaiorCompra, BigDecimal ifcmValorUltimaCompra, BigDecimal ifcmValorDebitoAtual, BigDecimal ifcmValorMaiorAcumulo, BigDecimal ifcmValorLimiteCredito, String ifcmTipoPontualidade) {
        this.ifcmId = ifcmId;
        this.ifcmValorMaiorCompra = ifcmValorMaiorCompra;
        this.ifcmValorUltimaCompra = ifcmValorUltimaCompra;
        this.ifcmValorDebitoAtual = ifcmValorDebitoAtual;
        this.ifcmValorMaiorAcumulo = ifcmValorMaiorAcumulo;
        this.ifcmValorLimiteCredito = ifcmValorLimiteCredito;
        this.ifcmTipoPontualidade = ifcmTipoPontualidade;
    }

    public String getIfcmId() {
        return ifcmId;
    }

    public void setIfcmId(String ifcmId) {
        this.ifcmId = ifcmId;
    }

    public String getIfcmNome() {
        return ifcmNome;
    }

    public void setIfcmNome(String ifcmNome) {
        this.ifcmNome = ifcmNome;
    }

    public Date getIfcmClienteDesde() {
        return ifcmClienteDesde;
    }

    public void setIfcmClienteDesde(Date ifcmClienteDesde) {
        this.ifcmClienteDesde = ifcmClienteDesde;
    }

    public String getIfcmObservacao() {
        return ifcmObservacao;
    }

    public void setIfcmObservacao(String ifcmObservacao) {
        this.ifcmObservacao = ifcmObservacao;
    }

    public BigDecimal getIfcmValorMaiorCompra() {
        return ifcmValorMaiorCompra;
    }

    public void setIfcmValorMaiorCompra(BigDecimal ifcmValorMaiorCompra) {
        this.ifcmValorMaiorCompra = ifcmValorMaiorCompra;
    }

    public Date getIfcmDataMaiorCompra() {
        return ifcmDataMaiorCompra;
    }

    public void setIfcmDataMaiorCompra(Date ifcmDataMaiorCompra) {
        this.ifcmDataMaiorCompra = ifcmDataMaiorCompra;
    }

    public String getIfcmInformante() {
        return ifcmInformante;
    }

    public void setIfcmInformante(String ifcmInformante) {
        this.ifcmInformante = ifcmInformante;
    }

    public BigDecimal getIfcmValorUltimaCompra() {
        return ifcmValorUltimaCompra;
    }

    public void setIfcmValorUltimaCompra(BigDecimal ifcmValorUltimaCompra) {
        this.ifcmValorUltimaCompra = ifcmValorUltimaCompra;
    }

    public Date getIfcmDataUltimaCompra() {
        return ifcmDataUltimaCompra;
    }

    public void setIfcmDataUltimaCompra(Date ifcmDataUltimaCompra) {
        this.ifcmDataUltimaCompra = ifcmDataUltimaCompra;
    }

    public BigDecimal getIfcmValorDebitoAtual() {
        return ifcmValorDebitoAtual;
    }

    public void setIfcmValorDebitoAtual(BigDecimal ifcmValorDebitoAtual) {
        this.ifcmValorDebitoAtual = ifcmValorDebitoAtual;
    }

    public BigDecimal getIfcmValorMaiorAcumulo() {
        return ifcmValorMaiorAcumulo;
    }

    public void setIfcmValorMaiorAcumulo(BigDecimal ifcmValorMaiorAcumulo) {
        this.ifcmValorMaiorAcumulo = ifcmValorMaiorAcumulo;
    }

    public Date getIfcmDataAcumulo() {
        return ifcmDataAcumulo;
    }

    public void setIfcmDataAcumulo(Date ifcmDataAcumulo) {
        this.ifcmDataAcumulo = ifcmDataAcumulo;
    }

    public BigDecimal getIfcmValorLimiteCredito() {
        return ifcmValorLimiteCredito;
    }

    public void setIfcmValorLimiteCredito(BigDecimal ifcmValorLimiteCredito) {
        this.ifcmValorLimiteCredito = ifcmValorLimiteCredito;
    }

    public Integer getIfcmDiasMaiorAtrazo() {
        return ifcmDiasMaiorAtrazo;
    }

    public void setIfcmDiasMaiorAtrazo(Integer ifcmDiasMaiorAtrazo) {
        this.ifcmDiasMaiorAtrazo = ifcmDiasMaiorAtrazo;
    }

    public Integer getIfcmDiasAtrazoMedio() {
        return ifcmDiasAtrazoMedio;
    }

    public void setIfcmDiasAtrazoMedio(Integer ifcmDiasAtrazoMedio) {
        this.ifcmDiasAtrazoMedio = ifcmDiasAtrazoMedio;
    }

    public String getIfcmTipoPontualidade() {
        return ifcmTipoPontualidade;
    }

    public void setIfcmTipoPontualidade(String ifcmTipoPontualidade) {
        this.ifcmTipoPontualidade = ifcmTipoPontualidade;
    }

    public String getIfcmEmpresa() {
        return ifcmEmpresa;
    }

    public void setIfcmEmpresa(String ifcmEmpresa) {
        this.ifcmEmpresa = ifcmEmpresa;
    }

    public Date getIfCmLASTUPDATE() {
        return ifCmLASTUPDATE;
    }

    public void setIfCmLASTUPDATE(Date ifCmLASTUPDATE) {
        this.ifCmLASTUPDATE = ifCmLASTUPDATE;
    }

    public Clientes getClntId() {
        return clntId;
    }

    public void setClntId(Clientes clntId) {
        this.clntId = clntId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ifcmId != null ? ifcmId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InformacoesComerciais)) {
            return false;
        }
        InformacoesComerciais other = (InformacoesComerciais) object;
        if ((this.ifcmId == null && other.ifcmId != null) || (this.ifcmId != null && !this.ifcmId.equals(other.ifcmId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.InformacoesComerciais[ ifcmId=" + ifcmId + " ]";
    }
    
}
