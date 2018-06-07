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
@Table(name = "MAPAS_RESUMOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MapasResumos.findAll", query = "SELECT m FROM MapasResumos m"),
    @NamedQuery(name = "MapasResumos.findByMprsId", query = "SELECT m FROM MapasResumos m WHERE m.mprsId = :mprsId"),
    @NamedQuery(name = "MapasResumos.findByMprsData", query = "SELECT m FROM MapasResumos m WHERE m.mprsData = :mprsData"),
    @NamedQuery(name = "MapasResumos.findByMprsCupomInicial", query = "SELECT m FROM MapasResumos m WHERE m.mprsCupomInicial = :mprsCupomInicial"),
    @NamedQuery(name = "MapasResumos.findByMprsCupomFinal", query = "SELECT m FROM MapasResumos m WHERE m.mprsCupomFinal = :mprsCupomFinal"),
    @NamedQuery(name = "MapasResumos.findByMprsCodSerie", query = "SELECT m FROM MapasResumos m WHERE m.mprsCodSerie = :mprsCodSerie"),
    @NamedQuery(name = "MapasResumos.findByMprsSerie", query = "SELECT m FROM MapasResumos m WHERE m.mprsSerie = :mprsSerie"),
    @NamedQuery(name = "MapasResumos.findByMprsCodModelo", query = "SELECT m FROM MapasResumos m WHERE m.mprsCodModelo = :mprsCodModelo"),
    @NamedQuery(name = "MapasResumos.findByMprsContReducao", query = "SELECT m FROM MapasResumos m WHERE m.mprsContReducao = :mprsContReducao"),
    @NamedQuery(name = "MapasResumos.findByMprsContReinicio", query = "SELECT m FROM MapasResumos m WHERE m.mprsContReinicio = :mprsContReinicio"),
    @NamedQuery(name = "MapasResumos.findByMprsGrandeTotalInicial", query = "SELECT m FROM MapasResumos m WHERE m.mprsGrandeTotalInicial = :mprsGrandeTotalInicial"),
    @NamedQuery(name = "MapasResumos.findByMprsGrandeTotal", query = "SELECT m FROM MapasResumos m WHERE m.mprsGrandeTotal = :mprsGrandeTotal"),
    @NamedQuery(name = "MapasResumos.findByMprsVendaBruta", query = "SELECT m FROM MapasResumos m WHERE m.mprsVendaBruta = :mprsVendaBruta"),
    @NamedQuery(name = "MapasResumos.findByMprsCancelamentos", query = "SELECT m FROM MapasResumos m WHERE m.mprsCancelamentos = :mprsCancelamentos"),
    @NamedQuery(name = "MapasResumos.findByMprsCancelamentosIssqn", query = "SELECT m FROM MapasResumos m WHERE m.mprsCancelamentosIssqn = :mprsCancelamentosIssqn"),
    @NamedQuery(name = "MapasResumos.findByMprsCancelamentosIcms", query = "SELECT m FROM MapasResumos m WHERE m.mprsCancelamentosIcms = :mprsCancelamentosIcms"),
    @NamedQuery(name = "MapasResumos.findByMprsDescontos", query = "SELECT m FROM MapasResumos m WHERE m.mprsDescontos = :mprsDescontos"),
    @NamedQuery(name = "MapasResumos.findByMprsVendaLiquida", query = "SELECT m FROM MapasResumos m WHERE m.mprsVendaLiquida = :mprsVendaLiquida"),
    @NamedQuery(name = "MapasResumos.findByMprsAcrecimos", query = "SELECT m FROM MapasResumos m WHERE m.mprsAcrecimos = :mprsAcrecimos"),
    @NamedQuery(name = "MapasResumos.findByMprsSubstTributaria", query = "SELECT m FROM MapasResumos m WHERE m.mprsSubstTributaria = :mprsSubstTributaria"),
    @NamedQuery(name = "MapasResumos.findByMprsIsenta", query = "SELECT m FROM MapasResumos m WHERE m.mprsIsenta = :mprsIsenta"),
    @NamedQuery(name = "MapasResumos.findByMprsNaoIncidencia", query = "SELECT m FROM MapasResumos m WHERE m.mprsNaoIncidencia = :mprsNaoIncidencia"),
    @NamedQuery(name = "MapasResumos.findByMprsCodigo", query = "SELECT m FROM MapasResumos m WHERE m.mprsCodigo = :mprsCodigo"),
    @NamedQuery(name = "MapasResumos.findByMprsNrOrdem", query = "SELECT m FROM MapasResumos m WHERE m.mprsNrOrdem = :mprsNrOrdem"),
    @NamedQuery(name = "MapasResumos.findByMprsNrEcf", query = "SELECT m FROM MapasResumos m WHERE m.mprsNrEcf = :mprsNrEcf"),
    @NamedQuery(name = "MapasResumos.findByMprsTotalIss", query = "SELECT m FROM MapasResumos m WHERE m.mprsTotalIss = :mprsTotalIss"),
    @NamedQuery(name = "MapasResumos.findByMprsOutrosRecebimentos", query = "SELECT m FROM MapasResumos m WHERE m.mprsOutrosRecebimentos = :mprsOutrosRecebimentos"),
    @NamedQuery(name = "MapasResumos.findByMprsIcmsAliq", query = "SELECT m FROM MapasResumos m WHERE m.mprsIcmsAliq = :mprsIcmsAliq"),
    @NamedQuery(name = "MapasResumos.findByMprsIcmsAliq01", query = "SELECT m FROM MapasResumos m WHERE m.mprsIcmsAliq01 = :mprsIcmsAliq01"),
    @NamedQuery(name = "MapasResumos.findByMprsIcmsAliq02", query = "SELECT m FROM MapasResumos m WHERE m.mprsIcmsAliq02 = :mprsIcmsAliq02"),
    @NamedQuery(name = "MapasResumos.findByMprsIcmsBase", query = "SELECT m FROM MapasResumos m WHERE m.mprsIcmsBase = :mprsIcmsBase"),
    @NamedQuery(name = "MapasResumos.findByMprsIcmsBase01", query = "SELECT m FROM MapasResumos m WHERE m.mprsIcmsBase01 = :mprsIcmsBase01"),
    @NamedQuery(name = "MapasResumos.findByMprsIcmsBase02", query = "SELECT m FROM MapasResumos m WHERE m.mprsIcmsBase02 = :mprsIcmsBase02"),
    @NamedQuery(name = "MapasResumos.findByMprsImpostoDebitado", query = "SELECT m FROM MapasResumos m WHERE m.mprsImpostoDebitado = :mprsImpostoDebitado"),
    @NamedQuery(name = "MapasResumos.findByMprsDinheiro", query = "SELECT m FROM MapasResumos m WHERE m.mprsDinheiro = :mprsDinheiro"),
    @NamedQuery(name = "MapasResumos.findByMprsCheque", query = "SELECT m FROM MapasResumos m WHERE m.mprsCheque = :mprsCheque"),
    @NamedQuery(name = "MapasResumos.findByMprsCartao", query = "SELECT m FROM MapasResumos m WHERE m.mprsCartao = :mprsCartao"),
    @NamedQuery(name = "MapasResumos.findByMprsAprazo", query = "SELECT m FROM MapasResumos m WHERE m.mprsAprazo = :mprsAprazo"),
    @NamedQuery(name = "MapasResumos.findByMprsLastupdate", query = "SELECT m FROM MapasResumos m WHERE m.mprsLastupdate = :mprsLastupdate")})
public class MapasResumos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MPRS_ID")
    private String mprsId;
    @Basic(optional = false)
    @Column(name = "MPRS_DATA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mprsData;
    @Basic(optional = false)
    @Column(name = "MPRS_CUPOM_INICIAL")
    private String mprsCupomInicial;
    @Basic(optional = false)
    @Column(name = "MPRS_CUPOM_FINAL")
    private String mprsCupomFinal;
    @Column(name = "MPRS_COD_SERIE")
    private String mprsCodSerie;
    @Column(name = "MPRS_SERIE")
    private String mprsSerie;
    @Column(name = "MPRS_COD_MODELO")
    private String mprsCodModelo;
    @Column(name = "MPRS_CONT_REDUCAO")
    private String mprsContReducao;
    @Column(name = "MPRS_CONT_REINICIO")
    private String mprsContReinicio;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "MPRS_GRANDE_TOTAL_INICIAL")
    private BigDecimal mprsGrandeTotalInicial;
    @Basic(optional = false)
    @Column(name = "MPRS_GRANDE_TOTAL")
    private BigDecimal mprsGrandeTotal;
    @Basic(optional = false)
    @Column(name = "MPRS_VENDA_BRUTA")
    private BigDecimal mprsVendaBruta;
    @Basic(optional = false)
    @Column(name = "MPRS_CANCELAMENTOS")
    private BigDecimal mprsCancelamentos;
    @Basic(optional = false)
    @Column(name = "MPRS_CANCELAMENTOS_ISSQN")
    private BigDecimal mprsCancelamentosIssqn;
    @Basic(optional = false)
    @Column(name = "MPRS_CANCELAMENTOS_ICMS")
    private BigDecimal mprsCancelamentosIcms;
    @Basic(optional = false)
    @Column(name = "MPRS_DESCONTOS")
    private BigDecimal mprsDescontos;
    @Basic(optional = false)
    @Column(name = "MPRS_VENDA_LIQUIDA")
    private BigDecimal mprsVendaLiquida;
    @Basic(optional = false)
    @Column(name = "MPRS_ACRECIMOS")
    private BigDecimal mprsAcrecimos;
    @Basic(optional = false)
    @Column(name = "MPRS_SUBST_TRIBUTARIA")
    private BigDecimal mprsSubstTributaria;
    @Basic(optional = false)
    @Column(name = "MPRS_ISENTA")
    private BigDecimal mprsIsenta;
    @Basic(optional = false)
    @Column(name = "MPRS_NAO_INCIDENCIA")
    private BigDecimal mprsNaoIncidencia;
    @Basic(optional = false)
    @Column(name = "MPRS_CODIGO")
    private String mprsCodigo;
    @Column(name = "MPRS_NR_ORDEM")
    private String mprsNrOrdem;
    @Column(name = "MPRS_NR_ECF")
    private String mprsNrEcf;
    @Basic(optional = false)
    @Column(name = "MPRS_TOTAL_ISS")
    private BigDecimal mprsTotalIss;
    @Basic(optional = false)
    @Column(name = "MPRS_OUTROS_RECEBIMENTOS")
    private BigDecimal mprsOutrosRecebimentos;
    @Basic(optional = false)
    @Column(name = "MPRS_ICMS_ALIQ")
    private BigDecimal mprsIcmsAliq;
    @Basic(optional = false)
    @Column(name = "MPRS_ICMS_ALIQ01")
    private BigDecimal mprsIcmsAliq01;
    @Basic(optional = false)
    @Column(name = "MPRS_ICMS_ALIQ02")
    private BigDecimal mprsIcmsAliq02;
    @Basic(optional = false)
    @Column(name = "MPRS_ICMS_BASE")
    private BigDecimal mprsIcmsBase;
    @Basic(optional = false)
    @Column(name = "MPRS_ICMS_BASE01")
    private BigDecimal mprsIcmsBase01;
    @Basic(optional = false)
    @Column(name = "MPRS_ICMS_BASE02")
    private BigDecimal mprsIcmsBase02;
    @Basic(optional = false)
    @Column(name = "MPRS_IMPOSTO_DEBITADO")
    private BigDecimal mprsImpostoDebitado;
    @Basic(optional = false)
    @Column(name = "MPRS_DINHEIRO")
    private BigDecimal mprsDinheiro;
    @Basic(optional = false)
    @Column(name = "MPRS_CHEQUE")
    private BigDecimal mprsCheque;
    @Basic(optional = false)
    @Column(name = "MPRS_CARTAO")
    private BigDecimal mprsCartao;
    @Basic(optional = false)
    @Column(name = "MPRS_APRAZO")
    private BigDecimal mprsAprazo;
    @Column(name = "MPRS_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mprsLastupdate;

    public MapasResumos() {
    }

    public MapasResumos(String mprsId) {
        this.mprsId = mprsId;
    }

    public MapasResumos(String mprsId, Date mprsData, String mprsCupomInicial, String mprsCupomFinal, BigDecimal mprsGrandeTotalInicial, BigDecimal mprsGrandeTotal, BigDecimal mprsVendaBruta, BigDecimal mprsCancelamentos, BigDecimal mprsCancelamentosIssqn, BigDecimal mprsCancelamentosIcms, BigDecimal mprsDescontos, BigDecimal mprsVendaLiquida, BigDecimal mprsAcrecimos, BigDecimal mprsSubstTributaria, BigDecimal mprsIsenta, BigDecimal mprsNaoIncidencia, String mprsCodigo, BigDecimal mprsTotalIss, BigDecimal mprsOutrosRecebimentos, BigDecimal mprsIcmsAliq, BigDecimal mprsIcmsAliq01, BigDecimal mprsIcmsAliq02, BigDecimal mprsIcmsBase, BigDecimal mprsIcmsBase01, BigDecimal mprsIcmsBase02, BigDecimal mprsImpostoDebitado, BigDecimal mprsDinheiro, BigDecimal mprsCheque, BigDecimal mprsCartao, BigDecimal mprsAprazo) {
        this.mprsId = mprsId;
        this.mprsData = mprsData;
        this.mprsCupomInicial = mprsCupomInicial;
        this.mprsCupomFinal = mprsCupomFinal;
        this.mprsGrandeTotalInicial = mprsGrandeTotalInicial;
        this.mprsGrandeTotal = mprsGrandeTotal;
        this.mprsVendaBruta = mprsVendaBruta;
        this.mprsCancelamentos = mprsCancelamentos;
        this.mprsCancelamentosIssqn = mprsCancelamentosIssqn;
        this.mprsCancelamentosIcms = mprsCancelamentosIcms;
        this.mprsDescontos = mprsDescontos;
        this.mprsVendaLiquida = mprsVendaLiquida;
        this.mprsAcrecimos = mprsAcrecimos;
        this.mprsSubstTributaria = mprsSubstTributaria;
        this.mprsIsenta = mprsIsenta;
        this.mprsNaoIncidencia = mprsNaoIncidencia;
        this.mprsCodigo = mprsCodigo;
        this.mprsTotalIss = mprsTotalIss;
        this.mprsOutrosRecebimentos = mprsOutrosRecebimentos;
        this.mprsIcmsAliq = mprsIcmsAliq;
        this.mprsIcmsAliq01 = mprsIcmsAliq01;
        this.mprsIcmsAliq02 = mprsIcmsAliq02;
        this.mprsIcmsBase = mprsIcmsBase;
        this.mprsIcmsBase01 = mprsIcmsBase01;
        this.mprsIcmsBase02 = mprsIcmsBase02;
        this.mprsImpostoDebitado = mprsImpostoDebitado;
        this.mprsDinheiro = mprsDinheiro;
        this.mprsCheque = mprsCheque;
        this.mprsCartao = mprsCartao;
        this.mprsAprazo = mprsAprazo;
    }

    public String getMprsId() {
        return mprsId;
    }

    public void setMprsId(String mprsId) {
        this.mprsId = mprsId;
    }

    public Date getMprsData() {
        return mprsData;
    }

    public void setMprsData(Date mprsData) {
        this.mprsData = mprsData;
    }

    public String getMprsCupomInicial() {
        return mprsCupomInicial;
    }

    public void setMprsCupomInicial(String mprsCupomInicial) {
        this.mprsCupomInicial = mprsCupomInicial;
    }

    public String getMprsCupomFinal() {
        return mprsCupomFinal;
    }

    public void setMprsCupomFinal(String mprsCupomFinal) {
        this.mprsCupomFinal = mprsCupomFinal;
    }

    public String getMprsCodSerie() {
        return mprsCodSerie;
    }

    public void setMprsCodSerie(String mprsCodSerie) {
        this.mprsCodSerie = mprsCodSerie;
    }

    public String getMprsSerie() {
        return mprsSerie;
    }

    public void setMprsSerie(String mprsSerie) {
        this.mprsSerie = mprsSerie;
    }

    public String getMprsCodModelo() {
        return mprsCodModelo;
    }

    public void setMprsCodModelo(String mprsCodModelo) {
        this.mprsCodModelo = mprsCodModelo;
    }

    public String getMprsContReducao() {
        return mprsContReducao;
    }

    public void setMprsContReducao(String mprsContReducao) {
        this.mprsContReducao = mprsContReducao;
    }

    public String getMprsContReinicio() {
        return mprsContReinicio;
    }

    public void setMprsContReinicio(String mprsContReinicio) {
        this.mprsContReinicio = mprsContReinicio;
    }

    public BigDecimal getMprsGrandeTotalInicial() {
        return mprsGrandeTotalInicial;
    }

    public void setMprsGrandeTotalInicial(BigDecimal mprsGrandeTotalInicial) {
        this.mprsGrandeTotalInicial = mprsGrandeTotalInicial;
    }

    public BigDecimal getMprsGrandeTotal() {
        return mprsGrandeTotal;
    }

    public void setMprsGrandeTotal(BigDecimal mprsGrandeTotal) {
        this.mprsGrandeTotal = mprsGrandeTotal;
    }

    public BigDecimal getMprsVendaBruta() {
        return mprsVendaBruta;
    }

    public void setMprsVendaBruta(BigDecimal mprsVendaBruta) {
        this.mprsVendaBruta = mprsVendaBruta;
    }

    public BigDecimal getMprsCancelamentos() {
        return mprsCancelamentos;
    }

    public void setMprsCancelamentos(BigDecimal mprsCancelamentos) {
        this.mprsCancelamentos = mprsCancelamentos;
    }

    public BigDecimal getMprsCancelamentosIssqn() {
        return mprsCancelamentosIssqn;
    }

    public void setMprsCancelamentosIssqn(BigDecimal mprsCancelamentosIssqn) {
        this.mprsCancelamentosIssqn = mprsCancelamentosIssqn;
    }

    public BigDecimal getMprsCancelamentosIcms() {
        return mprsCancelamentosIcms;
    }

    public void setMprsCancelamentosIcms(BigDecimal mprsCancelamentosIcms) {
        this.mprsCancelamentosIcms = mprsCancelamentosIcms;
    }

    public BigDecimal getMprsDescontos() {
        return mprsDescontos;
    }

    public void setMprsDescontos(BigDecimal mprsDescontos) {
        this.mprsDescontos = mprsDescontos;
    }

    public BigDecimal getMprsVendaLiquida() {
        return mprsVendaLiquida;
    }

    public void setMprsVendaLiquida(BigDecimal mprsVendaLiquida) {
        this.mprsVendaLiquida = mprsVendaLiquida;
    }

    public BigDecimal getMprsAcrecimos() {
        return mprsAcrecimos;
    }

    public void setMprsAcrecimos(BigDecimal mprsAcrecimos) {
        this.mprsAcrecimos = mprsAcrecimos;
    }

    public BigDecimal getMprsSubstTributaria() {
        return mprsSubstTributaria;
    }

    public void setMprsSubstTributaria(BigDecimal mprsSubstTributaria) {
        this.mprsSubstTributaria = mprsSubstTributaria;
    }

    public BigDecimal getMprsIsenta() {
        return mprsIsenta;
    }

    public void setMprsIsenta(BigDecimal mprsIsenta) {
        this.mprsIsenta = mprsIsenta;
    }

    public BigDecimal getMprsNaoIncidencia() {
        return mprsNaoIncidencia;
    }

    public void setMprsNaoIncidencia(BigDecimal mprsNaoIncidencia) {
        this.mprsNaoIncidencia = mprsNaoIncidencia;
    }

    public String getMprsCodigo() {
        return mprsCodigo;
    }

    public void setMprsCodigo(String mprsCodigo) {
        this.mprsCodigo = mprsCodigo;
    }

    public String getMprsNrOrdem() {
        return mprsNrOrdem;
    }

    public void setMprsNrOrdem(String mprsNrOrdem) {
        this.mprsNrOrdem = mprsNrOrdem;
    }

    public String getMprsNrEcf() {
        return mprsNrEcf;
    }

    public void setMprsNrEcf(String mprsNrEcf) {
        this.mprsNrEcf = mprsNrEcf;
    }

    public BigDecimal getMprsTotalIss() {
        return mprsTotalIss;
    }

    public void setMprsTotalIss(BigDecimal mprsTotalIss) {
        this.mprsTotalIss = mprsTotalIss;
    }

    public BigDecimal getMprsOutrosRecebimentos() {
        return mprsOutrosRecebimentos;
    }

    public void setMprsOutrosRecebimentos(BigDecimal mprsOutrosRecebimentos) {
        this.mprsOutrosRecebimentos = mprsOutrosRecebimentos;
    }

    public BigDecimal getMprsIcmsAliq() {
        return mprsIcmsAliq;
    }

    public void setMprsIcmsAliq(BigDecimal mprsIcmsAliq) {
        this.mprsIcmsAliq = mprsIcmsAliq;
    }

    public BigDecimal getMprsIcmsAliq01() {
        return mprsIcmsAliq01;
    }

    public void setMprsIcmsAliq01(BigDecimal mprsIcmsAliq01) {
        this.mprsIcmsAliq01 = mprsIcmsAliq01;
    }

    public BigDecimal getMprsIcmsAliq02() {
        return mprsIcmsAliq02;
    }

    public void setMprsIcmsAliq02(BigDecimal mprsIcmsAliq02) {
        this.mprsIcmsAliq02 = mprsIcmsAliq02;
    }

    public BigDecimal getMprsIcmsBase() {
        return mprsIcmsBase;
    }

    public void setMprsIcmsBase(BigDecimal mprsIcmsBase) {
        this.mprsIcmsBase = mprsIcmsBase;
    }

    public BigDecimal getMprsIcmsBase01() {
        return mprsIcmsBase01;
    }

    public void setMprsIcmsBase01(BigDecimal mprsIcmsBase01) {
        this.mprsIcmsBase01 = mprsIcmsBase01;
    }

    public BigDecimal getMprsIcmsBase02() {
        return mprsIcmsBase02;
    }

    public void setMprsIcmsBase02(BigDecimal mprsIcmsBase02) {
        this.mprsIcmsBase02 = mprsIcmsBase02;
    }

    public BigDecimal getMprsImpostoDebitado() {
        return mprsImpostoDebitado;
    }

    public void setMprsImpostoDebitado(BigDecimal mprsImpostoDebitado) {
        this.mprsImpostoDebitado = mprsImpostoDebitado;
    }

    public BigDecimal getMprsDinheiro() {
        return mprsDinheiro;
    }

    public void setMprsDinheiro(BigDecimal mprsDinheiro) {
        this.mprsDinheiro = mprsDinheiro;
    }

    public BigDecimal getMprsCheque() {
        return mprsCheque;
    }

    public void setMprsCheque(BigDecimal mprsCheque) {
        this.mprsCheque = mprsCheque;
    }

    public BigDecimal getMprsCartao() {
        return mprsCartao;
    }

    public void setMprsCartao(BigDecimal mprsCartao) {
        this.mprsCartao = mprsCartao;
    }

    public BigDecimal getMprsAprazo() {
        return mprsAprazo;
    }

    public void setMprsAprazo(BigDecimal mprsAprazo) {
        this.mprsAprazo = mprsAprazo;
    }

    public Date getMprsLastupdate() {
        return mprsLastupdate;
    }

    public void setMprsLastupdate(Date mprsLastupdate) {
        this.mprsLastupdate = mprsLastupdate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mprsId != null ? mprsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MapasResumos)) {
            return false;
        }
        MapasResumos other = (MapasResumos) object;
        if ((this.mprsId == null && other.mprsId != null) || (this.mprsId != null && !this.mprsId.equals(other.mprsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.MapasResumos[ mprsId=" + mprsId + " ]";
    }
    
}
