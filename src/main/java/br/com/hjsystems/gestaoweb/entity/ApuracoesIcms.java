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
@Table(name = "APURACOES_ICMS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ApuracoesIcms.findAll", query = "SELECT a FROM ApuracoesIcms a"),
    @NamedQuery(name = "ApuracoesIcms.findByAprcId", query = "SELECT a FROM ApuracoesIcms a WHERE a.aprcId = :aprcId"),
    @NamedQuery(name = "ApuracoesIcms.findByAprcData", query = "SELECT a FROM ApuracoesIcms a WHERE a.aprcData = :aprcData"),
    @NamedQuery(name = "ApuracoesIcms.findByAprcValDebitosSaida", query = "SELECT a FROM ApuracoesIcms a WHERE a.aprcValDebitosSaida = :aprcValDebitosSaida"),
    @NamedQuery(name = "ApuracoesIcms.findByAprcValDebitosOutros", query = "SELECT a FROM ApuracoesIcms a WHERE a.aprcValDebitosOutros = :aprcValDebitosOutros"),
    @NamedQuery(name = "ApuracoesIcms.findByAprcValCreditosEstornos", query = "SELECT a FROM ApuracoesIcms a WHERE a.aprcValCreditosEstornos = :aprcValCreditosEstornos"),
    @NamedQuery(name = "ApuracoesIcms.findByAprcValDebitosTotais", query = "SELECT a FROM ApuracoesIcms a WHERE a.aprcValDebitosTotais = :aprcValDebitosTotais"),
    @NamedQuery(name = "ApuracoesIcms.findByAprcValCreditosEntradas", query = "SELECT a FROM ApuracoesIcms a WHERE a.aprcValCreditosEntradas = :aprcValCreditosEntradas"),
    @NamedQuery(name = "ApuracoesIcms.findByAprcValCreditosOutros", query = "SELECT a FROM ApuracoesIcms a WHERE a.aprcValCreditosOutros = :aprcValCreditosOutros"),
    @NamedQuery(name = "ApuracoesIcms.findByAprcValDebitosEstornos", query = "SELECT a FROM ApuracoesIcms a WHERE a.aprcValDebitosEstornos = :aprcValDebitosEstornos"),
    @NamedQuery(name = "ApuracoesIcms.findByAprcValCreditosSubtotais", query = "SELECT a FROM ApuracoesIcms a WHERE a.aprcValCreditosSubtotais = :aprcValCreditosSubtotais"),
    @NamedQuery(name = "ApuracoesIcms.findByAprcValSaldoCredor", query = "SELECT a FROM ApuracoesIcms a WHERE a.aprcValSaldoCredor = :aprcValSaldoCredor"),
    @NamedQuery(name = "ApuracoesIcms.findByAprcValCreditosTotais", query = "SELECT a FROM ApuracoesIcms a WHERE a.aprcValCreditosTotais = :aprcValCreditosTotais"),
    @NamedQuery(name = "ApuracoesIcms.findByAprcValSaldoCredorSeguinte", query = "SELECT a FROM ApuracoesIcms a WHERE a.aprcValSaldoCredorSeguinte = :aprcValSaldoCredorSeguinte"),
    @NamedQuery(name = "ApuracoesIcms.findByAprcValTotalSaldoDevedor", query = "SELECT a FROM ApuracoesIcms a WHERE a.aprcValTotalSaldoDevedor = :aprcValTotalSaldoDevedor"),
    @NamedQuery(name = "ApuracoesIcms.findByAprcValDeducoes", query = "SELECT a FROM ApuracoesIcms a WHERE a.aprcValDeducoes = :aprcValDeducoes"),
    @NamedQuery(name = "ApuracoesIcms.findByAprcValIcmsRecolher", query = "SELECT a FROM ApuracoesIcms a WHERE a.aprcValIcmsRecolher = :aprcValIcmsRecolher"),
    @NamedQuery(name = "ApuracoesIcms.findByAprcValIcmsSubstitEntrada", query = "SELECT a FROM ApuracoesIcms a WHERE a.aprcValIcmsSubstitEntrada = :aprcValIcmsSubstitEntrada"),
    @NamedQuery(name = "ApuracoesIcms.findByAprcValIcmsSubstitSaida", query = "SELECT a FROM ApuracoesIcms a WHERE a.aprcValIcmsSubstitSaida = :aprcValIcmsSubstitSaida"),
    @NamedQuery(name = "ApuracoesIcms.findByAprcValDifereAliquotaIcms", query = "SELECT a FROM ApuracoesIcms a WHERE a.aprcValDifereAliquotaIcms = :aprcValDifereAliquotaIcms"),
    @NamedQuery(name = "ApuracoesIcms.findByAprcValIcmsImportacao", query = "SELECT a FROM ApuracoesIcms a WHERE a.aprcValIcmsImportacao = :aprcValIcmsImportacao"),
    @NamedQuery(name = "ApuracoesIcms.findByAprcValObrigacoesIcms", query = "SELECT a FROM ApuracoesIcms a WHERE a.aprcValObrigacoesIcms = :aprcValObrigacoesIcms"),
    @NamedQuery(name = "ApuracoesIcms.findByAprcValObrigacoesIcmsRecolh", query = "SELECT a FROM ApuracoesIcms a WHERE a.aprcValObrigacoesIcmsRecolh = :aprcValObrigacoesIcmsRecolh"),
    @NamedQuery(name = "ApuracoesIcms.findByAprcValIcmsSubstitEstados", query = "SELECT a FROM ApuracoesIcms a WHERE a.aprcValIcmsSubstitEstados = :aprcValIcmsSubstitEstados"),
    @NamedQuery(name = "ApuracoesIcms.findByAprcValDebitosOutros1", query = "SELECT a FROM ApuracoesIcms a WHERE a.aprcValDebitosOutros1 = :aprcValDebitosOutros1"),
    @NamedQuery(name = "ApuracoesIcms.findByAprcValDebitosOutros2", query = "SELECT a FROM ApuracoesIcms a WHERE a.aprcValDebitosOutros2 = :aprcValDebitosOutros2"),
    @NamedQuery(name = "ApuracoesIcms.findByAprcDescDebitosOutros", query = "SELECT a FROM ApuracoesIcms a WHERE a.aprcDescDebitosOutros = :aprcDescDebitosOutros"),
    @NamedQuery(name = "ApuracoesIcms.findByAprcDescDebitosOutros1", query = "SELECT a FROM ApuracoesIcms a WHERE a.aprcDescDebitosOutros1 = :aprcDescDebitosOutros1"),
    @NamedQuery(name = "ApuracoesIcms.findByAprcDescDebitosOutros2", query = "SELECT a FROM ApuracoesIcms a WHERE a.aprcDescDebitosOutros2 = :aprcDescDebitosOutros2"),
    @NamedQuery(name = "ApuracoesIcms.findByAprcValCreditosEstornos1", query = "SELECT a FROM ApuracoesIcms a WHERE a.aprcValCreditosEstornos1 = :aprcValCreditosEstornos1"),
    @NamedQuery(name = "ApuracoesIcms.findByAprcValCreditosEstornos2", query = "SELECT a FROM ApuracoesIcms a WHERE a.aprcValCreditosEstornos2 = :aprcValCreditosEstornos2"),
    @NamedQuery(name = "ApuracoesIcms.findByAprcDescCreditosEstornos", query = "SELECT a FROM ApuracoesIcms a WHERE a.aprcDescCreditosEstornos = :aprcDescCreditosEstornos"),
    @NamedQuery(name = "ApuracoesIcms.findByAprcDescCreditosEstornos1", query = "SELECT a FROM ApuracoesIcms a WHERE a.aprcDescCreditosEstornos1 = :aprcDescCreditosEstornos1"),
    @NamedQuery(name = "ApuracoesIcms.findByAprcDescCreditosEstornos2", query = "SELECT a FROM ApuracoesIcms a WHERE a.aprcDescCreditosEstornos2 = :aprcDescCreditosEstornos2"),
    @NamedQuery(name = "ApuracoesIcms.findByAprcValCreditosOutros1", query = "SELECT a FROM ApuracoesIcms a WHERE a.aprcValCreditosOutros1 = :aprcValCreditosOutros1"),
    @NamedQuery(name = "ApuracoesIcms.findByAprcValCreditosOutros2", query = "SELECT a FROM ApuracoesIcms a WHERE a.aprcValCreditosOutros2 = :aprcValCreditosOutros2"),
    @NamedQuery(name = "ApuracoesIcms.findByAprcDescCreditosOutros", query = "SELECT a FROM ApuracoesIcms a WHERE a.aprcDescCreditosOutros = :aprcDescCreditosOutros"),
    @NamedQuery(name = "ApuracoesIcms.findByAprcDescCreditosOutros1", query = "SELECT a FROM ApuracoesIcms a WHERE a.aprcDescCreditosOutros1 = :aprcDescCreditosOutros1"),
    @NamedQuery(name = "ApuracoesIcms.findByAprcDescCreditosOutros2", query = "SELECT a FROM ApuracoesIcms a WHERE a.aprcDescCreditosOutros2 = :aprcDescCreditosOutros2"),
    @NamedQuery(name = "ApuracoesIcms.findByAprcValDebitosEstornos1", query = "SELECT a FROM ApuracoesIcms a WHERE a.aprcValDebitosEstornos1 = :aprcValDebitosEstornos1"),
    @NamedQuery(name = "ApuracoesIcms.findByAprcValDebitosEstornos2", query = "SELECT a FROM ApuracoesIcms a WHERE a.aprcValDebitosEstornos2 = :aprcValDebitosEstornos2"),
    @NamedQuery(name = "ApuracoesIcms.findByAprcDescDebitosEstornos", query = "SELECT a FROM ApuracoesIcms a WHERE a.aprcDescDebitosEstornos = :aprcDescDebitosEstornos"),
    @NamedQuery(name = "ApuracoesIcms.findByAprcDescDebitosEstornos1", query = "SELECT a FROM ApuracoesIcms a WHERE a.aprcDescDebitosEstornos1 = :aprcDescDebitosEstornos1"),
    @NamedQuery(name = "ApuracoesIcms.findByAprcDescDebitosEstornos2", query = "SELECT a FROM ApuracoesIcms a WHERE a.aprcDescDebitosEstornos2 = :aprcDescDebitosEstornos2"),
    @NamedQuery(name = "ApuracoesIcms.findByAprcValCredorAnt", query = "SELECT a FROM ApuracoesIcms a WHERE a.aprcValCredorAnt = :aprcValCredorAnt"),
    @NamedQuery(name = "ApuracoesIcms.findByAprcValDeducoes1", query = "SELECT a FROM ApuracoesIcms a WHERE a.aprcValDeducoes1 = :aprcValDeducoes1"),
    @NamedQuery(name = "ApuracoesIcms.findByAprcValDeducoes2", query = "SELECT a FROM ApuracoesIcms a WHERE a.aprcValDeducoes2 = :aprcValDeducoes2"),
    @NamedQuery(name = "ApuracoesIcms.findByAprcDescDeducoes", query = "SELECT a FROM ApuracoesIcms a WHERE a.aprcDescDeducoes = :aprcDescDeducoes"),
    @NamedQuery(name = "ApuracoesIcms.findByAprcDescDeducoes1", query = "SELECT a FROM ApuracoesIcms a WHERE a.aprcDescDeducoes1 = :aprcDescDeducoes1"),
    @NamedQuery(name = "ApuracoesIcms.findByAprcDescDeducoes2", query = "SELECT a FROM ApuracoesIcms a WHERE a.aprcDescDeducoes2 = :aprcDescDeducoes2"),
    @NamedQuery(name = "ApuracoesIcms.findByAprcLastupdate", query = "SELECT a FROM ApuracoesIcms a WHERE a.aprcLastupdate = :aprcLastupdate"),
    @NamedQuery(name = "ApuracoesIcms.findByAprcTipo", query = "SELECT a FROM ApuracoesIcms a WHERE a.aprcTipo = :aprcTipo")})
public class ApuracoesIcms implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "APRC_ID")
    private String aprcId;
    @Column(name = "APRC_DATA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date aprcData;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "APRC_VAL_DEBITOS_SAIDA")
    private BigDecimal aprcValDebitosSaida;
    @Basic(optional = false)
    @Column(name = "APRC_VAL_DEBITOS_OUTROS")
    private BigDecimal aprcValDebitosOutros;
    @Basic(optional = false)
    @Column(name = "APRC_VAL_CREDITOS_ESTORNOS")
    private BigDecimal aprcValCreditosEstornos;
    @Basic(optional = false)
    @Column(name = "APRC_VAL_DEBITOS_TOTAIS")
    private BigDecimal aprcValDebitosTotais;
    @Basic(optional = false)
    @Column(name = "APRC_VAL_CREDITOS_ENTRADAS")
    private BigDecimal aprcValCreditosEntradas;
    @Basic(optional = false)
    @Column(name = "APRC_VAL_CREDITOS_OUTROS")
    private BigDecimal aprcValCreditosOutros;
    @Basic(optional = false)
    @Column(name = "APRC_VAL_DEBITOS_ESTORNOS")
    private BigDecimal aprcValDebitosEstornos;
    @Basic(optional = false)
    @Column(name = "APRC_VAL_CREDITOS_SUBTOTAIS")
    private BigDecimal aprcValCreditosSubtotais;
    @Basic(optional = false)
    @Column(name = "APRC_VAL_SALDO_CREDOR")
    private BigDecimal aprcValSaldoCredor;
    @Basic(optional = false)
    @Column(name = "APRC_VAL_CREDITOS_TOTAIS")
    private BigDecimal aprcValCreditosTotais;
    @Basic(optional = false)
    @Column(name = "APRC_VAL_SALDO_CREDOR_SEGUINTE")
    private BigDecimal aprcValSaldoCredorSeguinte;
    @Basic(optional = false)
    @Column(name = "APRC_VAL_TOTAL_SALDO_DEVEDOR")
    private BigDecimal aprcValTotalSaldoDevedor;
    @Basic(optional = false)
    @Column(name = "APRC_VAL_DEDUCOES")
    private BigDecimal aprcValDeducoes;
    @Basic(optional = false)
    @Column(name = "APRC_VAL_ICMS_RECOLHER")
    private BigDecimal aprcValIcmsRecolher;
    @Basic(optional = false)
    @Column(name = "APRC_VAL_ICMS_SUBSTIT_ENTRADA")
    private BigDecimal aprcValIcmsSubstitEntrada;
    @Basic(optional = false)
    @Column(name = "APRC_VAL_ICMS_SUBSTIT_SAIDA")
    private BigDecimal aprcValIcmsSubstitSaida;
    @Basic(optional = false)
    @Column(name = "APRC_VAL_DIFERE_ALIQUOTA_ICMS")
    private BigDecimal aprcValDifereAliquotaIcms;
    @Basic(optional = false)
    @Column(name = "APRC_VAL_ICMS_IMPORTACAO")
    private BigDecimal aprcValIcmsImportacao;
    @Basic(optional = false)
    @Column(name = "APRC_VAL_OBRIGACOES_ICMS")
    private BigDecimal aprcValObrigacoesIcms;
    @Basic(optional = false)
    @Column(name = "APRC_VAL_OBRIGACOES_ICMS_RECOLH")
    private BigDecimal aprcValObrigacoesIcmsRecolh;
    @Basic(optional = false)
    @Column(name = "APRC_VAL_ICMS_SUBSTIT_ESTADOS")
    private BigDecimal aprcValIcmsSubstitEstados;
    @Column(name = "APRC_VAL_DEBITOS_OUTROS1")
    private BigDecimal aprcValDebitosOutros1;
    @Column(name = "APRC_VAL_DEBITOS_OUTROS2")
    private BigDecimal aprcValDebitosOutros2;
    @Column(name = "APRC_DESC_DEBITOS_OUTROS")
    private String aprcDescDebitosOutros;
    @Column(name = "APRC_DESC_DEBITOS_OUTROS1")
    private String aprcDescDebitosOutros1;
    @Column(name = "APRC_DESC_DEBITOS_OUTROS2")
    private String aprcDescDebitosOutros2;
    @Column(name = "APRC_VAL_CREDITOS_ESTORNOS1")
    private BigDecimal aprcValCreditosEstornos1;
    @Column(name = "APRC_VAL_CREDITOS_ESTORNOS2")
    private BigDecimal aprcValCreditosEstornos2;
    @Column(name = "APRC_DESC_CREDITOS_ESTORNOS")
    private String aprcDescCreditosEstornos;
    @Column(name = "APRC_DESC_CREDITOS_ESTORNOS1")
    private String aprcDescCreditosEstornos1;
    @Column(name = "APRC_DESC_CREDITOS_ESTORNOS2")
    private String aprcDescCreditosEstornos2;
    @Column(name = "APRC_VAL_CREDITOS_OUTROS1")
    private BigDecimal aprcValCreditosOutros1;
    @Column(name = "APRC_VAL_CREDITOS_OUTROS2")
    private BigDecimal aprcValCreditosOutros2;
    @Column(name = "APRC_DESC_CREDITOS_OUTROS")
    private String aprcDescCreditosOutros;
    @Column(name = "APRC_DESC_CREDITOS_OUTROS1")
    private String aprcDescCreditosOutros1;
    @Column(name = "APRC_DESC_CREDITOS_OUTROS2")
    private String aprcDescCreditosOutros2;
    @Column(name = "APRC_VAL_DEBITOS_ESTORNOS1")
    private BigDecimal aprcValDebitosEstornos1;
    @Column(name = "APRC_VAL_DEBITOS_ESTORNOS2")
    private BigDecimal aprcValDebitosEstornos2;
    @Column(name = "APRC_DESC_DEBITOS_ESTORNOS")
    private String aprcDescDebitosEstornos;
    @Column(name = "APRC_DESC_DEBITOS_ESTORNOS1")
    private String aprcDescDebitosEstornos1;
    @Column(name = "APRC_DESC_DEBITOS_ESTORNOS2")
    private String aprcDescDebitosEstornos2;
    @Column(name = "APRC_VAL_CREDOR_ANT")
    private BigDecimal aprcValCredorAnt;
    @Column(name = "APRC_VAL_DEDUCOES1")
    private BigDecimal aprcValDeducoes1;
    @Column(name = "APRC_VAL_DEDUCOES2")
    private BigDecimal aprcValDeducoes2;
    @Column(name = "APRC_DESC_DEDUCOES")
    private String aprcDescDeducoes;
    @Column(name = "APRC_DESC_DEDUCOES1")
    private String aprcDescDeducoes1;
    @Column(name = "APRC_DESC_DEDUCOES2")
    private String aprcDescDeducoes2;
    @Column(name = "APRC_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date aprcLastupdate;
    @Column(name = "APRC_TIPO")
    private String aprcTipo;
    @JoinColumn(name = "UNEM_ID", referencedColumnName = "UNEM_ID")
    @ManyToOne
    private UnidadesEmpresariais unemId;

    public ApuracoesIcms() {
    }

    public ApuracoesIcms(String aprcId) {
        this.aprcId = aprcId;
    }

    public ApuracoesIcms(String aprcId, BigDecimal aprcValDebitosSaida, BigDecimal aprcValDebitosOutros, BigDecimal aprcValCreditosEstornos, BigDecimal aprcValDebitosTotais, BigDecimal aprcValCreditosEntradas, BigDecimal aprcValCreditosOutros, BigDecimal aprcValDebitosEstornos, BigDecimal aprcValCreditosSubtotais, BigDecimal aprcValSaldoCredor, BigDecimal aprcValCreditosTotais, BigDecimal aprcValSaldoCredorSeguinte, BigDecimal aprcValTotalSaldoDevedor, BigDecimal aprcValDeducoes, BigDecimal aprcValIcmsRecolher, BigDecimal aprcValIcmsSubstitEntrada, BigDecimal aprcValIcmsSubstitSaida, BigDecimal aprcValDifereAliquotaIcms, BigDecimal aprcValIcmsImportacao, BigDecimal aprcValObrigacoesIcms, BigDecimal aprcValObrigacoesIcmsRecolh, BigDecimal aprcValIcmsSubstitEstados) {
        this.aprcId = aprcId;
        this.aprcValDebitosSaida = aprcValDebitosSaida;
        this.aprcValDebitosOutros = aprcValDebitosOutros;
        this.aprcValCreditosEstornos = aprcValCreditosEstornos;
        this.aprcValDebitosTotais = aprcValDebitosTotais;
        this.aprcValCreditosEntradas = aprcValCreditosEntradas;
        this.aprcValCreditosOutros = aprcValCreditosOutros;
        this.aprcValDebitosEstornos = aprcValDebitosEstornos;
        this.aprcValCreditosSubtotais = aprcValCreditosSubtotais;
        this.aprcValSaldoCredor = aprcValSaldoCredor;
        this.aprcValCreditosTotais = aprcValCreditosTotais;
        this.aprcValSaldoCredorSeguinte = aprcValSaldoCredorSeguinte;
        this.aprcValTotalSaldoDevedor = aprcValTotalSaldoDevedor;
        this.aprcValDeducoes = aprcValDeducoes;
        this.aprcValIcmsRecolher = aprcValIcmsRecolher;
        this.aprcValIcmsSubstitEntrada = aprcValIcmsSubstitEntrada;
        this.aprcValIcmsSubstitSaida = aprcValIcmsSubstitSaida;
        this.aprcValDifereAliquotaIcms = aprcValDifereAliquotaIcms;
        this.aprcValIcmsImportacao = aprcValIcmsImportacao;
        this.aprcValObrigacoesIcms = aprcValObrigacoesIcms;
        this.aprcValObrigacoesIcmsRecolh = aprcValObrigacoesIcmsRecolh;
        this.aprcValIcmsSubstitEstados = aprcValIcmsSubstitEstados;
    }

    public String getAprcId() {
        return aprcId;
    }

    public void setAprcId(String aprcId) {
        this.aprcId = aprcId;
    }

    public Date getAprcData() {
        return aprcData;
    }

    public void setAprcData(Date aprcData) {
        this.aprcData = aprcData;
    }

    public BigDecimal getAprcValDebitosSaida() {
        return aprcValDebitosSaida;
    }

    public void setAprcValDebitosSaida(BigDecimal aprcValDebitosSaida) {
        this.aprcValDebitosSaida = aprcValDebitosSaida;
    }

    public BigDecimal getAprcValDebitosOutros() {
        return aprcValDebitosOutros;
    }

    public void setAprcValDebitosOutros(BigDecimal aprcValDebitosOutros) {
        this.aprcValDebitosOutros = aprcValDebitosOutros;
    }

    public BigDecimal getAprcValCreditosEstornos() {
        return aprcValCreditosEstornos;
    }

    public void setAprcValCreditosEstornos(BigDecimal aprcValCreditosEstornos) {
        this.aprcValCreditosEstornos = aprcValCreditosEstornos;
    }

    public BigDecimal getAprcValDebitosTotais() {
        return aprcValDebitosTotais;
    }

    public void setAprcValDebitosTotais(BigDecimal aprcValDebitosTotais) {
        this.aprcValDebitosTotais = aprcValDebitosTotais;
    }

    public BigDecimal getAprcValCreditosEntradas() {
        return aprcValCreditosEntradas;
    }

    public void setAprcValCreditosEntradas(BigDecimal aprcValCreditosEntradas) {
        this.aprcValCreditosEntradas = aprcValCreditosEntradas;
    }

    public BigDecimal getAprcValCreditosOutros() {
        return aprcValCreditosOutros;
    }

    public void setAprcValCreditosOutros(BigDecimal aprcValCreditosOutros) {
        this.aprcValCreditosOutros = aprcValCreditosOutros;
    }

    public BigDecimal getAprcValDebitosEstornos() {
        return aprcValDebitosEstornos;
    }

    public void setAprcValDebitosEstornos(BigDecimal aprcValDebitosEstornos) {
        this.aprcValDebitosEstornos = aprcValDebitosEstornos;
    }

    public BigDecimal getAprcValCreditosSubtotais() {
        return aprcValCreditosSubtotais;
    }

    public void setAprcValCreditosSubtotais(BigDecimal aprcValCreditosSubtotais) {
        this.aprcValCreditosSubtotais = aprcValCreditosSubtotais;
    }

    public BigDecimal getAprcValSaldoCredor() {
        return aprcValSaldoCredor;
    }

    public void setAprcValSaldoCredor(BigDecimal aprcValSaldoCredor) {
        this.aprcValSaldoCredor = aprcValSaldoCredor;
    }

    public BigDecimal getAprcValCreditosTotais() {
        return aprcValCreditosTotais;
    }

    public void setAprcValCreditosTotais(BigDecimal aprcValCreditosTotais) {
        this.aprcValCreditosTotais = aprcValCreditosTotais;
    }

    public BigDecimal getAprcValSaldoCredorSeguinte() {
        return aprcValSaldoCredorSeguinte;
    }

    public void setAprcValSaldoCredorSeguinte(BigDecimal aprcValSaldoCredorSeguinte) {
        this.aprcValSaldoCredorSeguinte = aprcValSaldoCredorSeguinte;
    }

    public BigDecimal getAprcValTotalSaldoDevedor() {
        return aprcValTotalSaldoDevedor;
    }

    public void setAprcValTotalSaldoDevedor(BigDecimal aprcValTotalSaldoDevedor) {
        this.aprcValTotalSaldoDevedor = aprcValTotalSaldoDevedor;
    }

    public BigDecimal getAprcValDeducoes() {
        return aprcValDeducoes;
    }

    public void setAprcValDeducoes(BigDecimal aprcValDeducoes) {
        this.aprcValDeducoes = aprcValDeducoes;
    }

    public BigDecimal getAprcValIcmsRecolher() {
        return aprcValIcmsRecolher;
    }

    public void setAprcValIcmsRecolher(BigDecimal aprcValIcmsRecolher) {
        this.aprcValIcmsRecolher = aprcValIcmsRecolher;
    }

    public BigDecimal getAprcValIcmsSubstitEntrada() {
        return aprcValIcmsSubstitEntrada;
    }

    public void setAprcValIcmsSubstitEntrada(BigDecimal aprcValIcmsSubstitEntrada) {
        this.aprcValIcmsSubstitEntrada = aprcValIcmsSubstitEntrada;
    }

    public BigDecimal getAprcValIcmsSubstitSaida() {
        return aprcValIcmsSubstitSaida;
    }

    public void setAprcValIcmsSubstitSaida(BigDecimal aprcValIcmsSubstitSaida) {
        this.aprcValIcmsSubstitSaida = aprcValIcmsSubstitSaida;
    }

    public BigDecimal getAprcValDifereAliquotaIcms() {
        return aprcValDifereAliquotaIcms;
    }

    public void setAprcValDifereAliquotaIcms(BigDecimal aprcValDifereAliquotaIcms) {
        this.aprcValDifereAliquotaIcms = aprcValDifereAliquotaIcms;
    }

    public BigDecimal getAprcValIcmsImportacao() {
        return aprcValIcmsImportacao;
    }

    public void setAprcValIcmsImportacao(BigDecimal aprcValIcmsImportacao) {
        this.aprcValIcmsImportacao = aprcValIcmsImportacao;
    }

    public BigDecimal getAprcValObrigacoesIcms() {
        return aprcValObrigacoesIcms;
    }

    public void setAprcValObrigacoesIcms(BigDecimal aprcValObrigacoesIcms) {
        this.aprcValObrigacoesIcms = aprcValObrigacoesIcms;
    }

    public BigDecimal getAprcValObrigacoesIcmsRecolh() {
        return aprcValObrigacoesIcmsRecolh;
    }

    public void setAprcValObrigacoesIcmsRecolh(BigDecimal aprcValObrigacoesIcmsRecolh) {
        this.aprcValObrigacoesIcmsRecolh = aprcValObrigacoesIcmsRecolh;
    }

    public BigDecimal getAprcValIcmsSubstitEstados() {
        return aprcValIcmsSubstitEstados;
    }

    public void setAprcValIcmsSubstitEstados(BigDecimal aprcValIcmsSubstitEstados) {
        this.aprcValIcmsSubstitEstados = aprcValIcmsSubstitEstados;
    }

    public BigDecimal getAprcValDebitosOutros1() {
        return aprcValDebitosOutros1;
    }

    public void setAprcValDebitosOutros1(BigDecimal aprcValDebitosOutros1) {
        this.aprcValDebitosOutros1 = aprcValDebitosOutros1;
    }

    public BigDecimal getAprcValDebitosOutros2() {
        return aprcValDebitosOutros2;
    }

    public void setAprcValDebitosOutros2(BigDecimal aprcValDebitosOutros2) {
        this.aprcValDebitosOutros2 = aprcValDebitosOutros2;
    }

    public String getAprcDescDebitosOutros() {
        return aprcDescDebitosOutros;
    }

    public void setAprcDescDebitosOutros(String aprcDescDebitosOutros) {
        this.aprcDescDebitosOutros = aprcDescDebitosOutros;
    }

    public String getAprcDescDebitosOutros1() {
        return aprcDescDebitosOutros1;
    }

    public void setAprcDescDebitosOutros1(String aprcDescDebitosOutros1) {
        this.aprcDescDebitosOutros1 = aprcDescDebitosOutros1;
    }

    public String getAprcDescDebitosOutros2() {
        return aprcDescDebitosOutros2;
    }

    public void setAprcDescDebitosOutros2(String aprcDescDebitosOutros2) {
        this.aprcDescDebitosOutros2 = aprcDescDebitosOutros2;
    }

    public BigDecimal getAprcValCreditosEstornos1() {
        return aprcValCreditosEstornos1;
    }

    public void setAprcValCreditosEstornos1(BigDecimal aprcValCreditosEstornos1) {
        this.aprcValCreditosEstornos1 = aprcValCreditosEstornos1;
    }

    public BigDecimal getAprcValCreditosEstornos2() {
        return aprcValCreditosEstornos2;
    }

    public void setAprcValCreditosEstornos2(BigDecimal aprcValCreditosEstornos2) {
        this.aprcValCreditosEstornos2 = aprcValCreditosEstornos2;
    }

    public String getAprcDescCreditosEstornos() {
        return aprcDescCreditosEstornos;
    }

    public void setAprcDescCreditosEstornos(String aprcDescCreditosEstornos) {
        this.aprcDescCreditosEstornos = aprcDescCreditosEstornos;
    }

    public String getAprcDescCreditosEstornos1() {
        return aprcDescCreditosEstornos1;
    }

    public void setAprcDescCreditosEstornos1(String aprcDescCreditosEstornos1) {
        this.aprcDescCreditosEstornos1 = aprcDescCreditosEstornos1;
    }

    public String getAprcDescCreditosEstornos2() {
        return aprcDescCreditosEstornos2;
    }

    public void setAprcDescCreditosEstornos2(String aprcDescCreditosEstornos2) {
        this.aprcDescCreditosEstornos2 = aprcDescCreditosEstornos2;
    }

    public BigDecimal getAprcValCreditosOutros1() {
        return aprcValCreditosOutros1;
    }

    public void setAprcValCreditosOutros1(BigDecimal aprcValCreditosOutros1) {
        this.aprcValCreditosOutros1 = aprcValCreditosOutros1;
    }

    public BigDecimal getAprcValCreditosOutros2() {
        return aprcValCreditosOutros2;
    }

    public void setAprcValCreditosOutros2(BigDecimal aprcValCreditosOutros2) {
        this.aprcValCreditosOutros2 = aprcValCreditosOutros2;
    }

    public String getAprcDescCreditosOutros() {
        return aprcDescCreditosOutros;
    }

    public void setAprcDescCreditosOutros(String aprcDescCreditosOutros) {
        this.aprcDescCreditosOutros = aprcDescCreditosOutros;
    }

    public String getAprcDescCreditosOutros1() {
        return aprcDescCreditosOutros1;
    }

    public void setAprcDescCreditosOutros1(String aprcDescCreditosOutros1) {
        this.aprcDescCreditosOutros1 = aprcDescCreditosOutros1;
    }

    public String getAprcDescCreditosOutros2() {
        return aprcDescCreditosOutros2;
    }

    public void setAprcDescCreditosOutros2(String aprcDescCreditosOutros2) {
        this.aprcDescCreditosOutros2 = aprcDescCreditosOutros2;
    }

    public BigDecimal getAprcValDebitosEstornos1() {
        return aprcValDebitosEstornos1;
    }

    public void setAprcValDebitosEstornos1(BigDecimal aprcValDebitosEstornos1) {
        this.aprcValDebitosEstornos1 = aprcValDebitosEstornos1;
    }

    public BigDecimal getAprcValDebitosEstornos2() {
        return aprcValDebitosEstornos2;
    }

    public void setAprcValDebitosEstornos2(BigDecimal aprcValDebitosEstornos2) {
        this.aprcValDebitosEstornos2 = aprcValDebitosEstornos2;
    }

    public String getAprcDescDebitosEstornos() {
        return aprcDescDebitosEstornos;
    }

    public void setAprcDescDebitosEstornos(String aprcDescDebitosEstornos) {
        this.aprcDescDebitosEstornos = aprcDescDebitosEstornos;
    }

    public String getAprcDescDebitosEstornos1() {
        return aprcDescDebitosEstornos1;
    }

    public void setAprcDescDebitosEstornos1(String aprcDescDebitosEstornos1) {
        this.aprcDescDebitosEstornos1 = aprcDescDebitosEstornos1;
    }

    public String getAprcDescDebitosEstornos2() {
        return aprcDescDebitosEstornos2;
    }

    public void setAprcDescDebitosEstornos2(String aprcDescDebitosEstornos2) {
        this.aprcDescDebitosEstornos2 = aprcDescDebitosEstornos2;
    }

    public BigDecimal getAprcValCredorAnt() {
        return aprcValCredorAnt;
    }

    public void setAprcValCredorAnt(BigDecimal aprcValCredorAnt) {
        this.aprcValCredorAnt = aprcValCredorAnt;
    }

    public BigDecimal getAprcValDeducoes1() {
        return aprcValDeducoes1;
    }

    public void setAprcValDeducoes1(BigDecimal aprcValDeducoes1) {
        this.aprcValDeducoes1 = aprcValDeducoes1;
    }

    public BigDecimal getAprcValDeducoes2() {
        return aprcValDeducoes2;
    }

    public void setAprcValDeducoes2(BigDecimal aprcValDeducoes2) {
        this.aprcValDeducoes2 = aprcValDeducoes2;
    }

    public String getAprcDescDeducoes() {
        return aprcDescDeducoes;
    }

    public void setAprcDescDeducoes(String aprcDescDeducoes) {
        this.aprcDescDeducoes = aprcDescDeducoes;
    }

    public String getAprcDescDeducoes1() {
        return aprcDescDeducoes1;
    }

    public void setAprcDescDeducoes1(String aprcDescDeducoes1) {
        this.aprcDescDeducoes1 = aprcDescDeducoes1;
    }

    public String getAprcDescDeducoes2() {
        return aprcDescDeducoes2;
    }

    public void setAprcDescDeducoes2(String aprcDescDeducoes2) {
        this.aprcDescDeducoes2 = aprcDescDeducoes2;
    }

    public Date getAprcLastupdate() {
        return aprcLastupdate;
    }

    public void setAprcLastupdate(Date aprcLastupdate) {
        this.aprcLastupdate = aprcLastupdate;
    }

    public String getAprcTipo() {
        return aprcTipo;
    }

    public void setAprcTipo(String aprcTipo) {
        this.aprcTipo = aprcTipo;
    }

    public UnidadesEmpresariais getUnemId() {
        return unemId;
    }

    public void setUnemId(UnidadesEmpresariais unemId) {
        this.unemId = unemId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (aprcId != null ? aprcId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ApuracoesIcms)) {
            return false;
        }
        ApuracoesIcms other = (ApuracoesIcms) object;
        if ((this.aprcId == null && other.aprcId != null) || (this.aprcId != null && !this.aprcId.equals(other.aprcId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.ApuracoesIcms[ aprcId=" + aprcId + " ]";
    }
    
}
