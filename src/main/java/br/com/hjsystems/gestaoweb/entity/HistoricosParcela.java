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
import javax.persistence.Lob;
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
@Table(name = "HISTORICOS_PARCELA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HistoricosParcela.findAll", query = "SELECT h FROM HistoricosParcela h"),
    @NamedQuery(name = "HistoricosParcela.findByHparId", query = "SELECT h FROM HistoricosParcela h WHERE h.hparId = :hparId"),
    @NamedQuery(name = "HistoricosParcela.findByHparData", query = "SELECT h FROM HistoricosParcela h WHERE h.hparData = :hparData"),
    @NamedQuery(name = "HistoricosParcela.findByHparCodigoOcorrencia", query = "SELECT h FROM HistoricosParcela h WHERE h.hparCodigoOcorrencia = :hparCodigoOcorrencia"),
    @NamedQuery(name = "HistoricosParcela.findByHparOutrasDespesas", query = "SELECT h FROM HistoricosParcela h WHERE h.hparOutrasDespesas = :hparOutrasDespesas"),
    @NamedQuery(name = "HistoricosParcela.findByHparIof", query = "SELECT h FROM HistoricosParcela h WHERE h.hparIof = :hparIof"),
    @NamedQuery(name = "HistoricosParcela.findByHparDespCartorio", query = "SELECT h FROM HistoricosParcela h WHERE h.hparDespCartorio = :hparDespCartorio"),
    @NamedQuery(name = "HistoricosParcela.findByHparDtOcorrencia", query = "SELECT h FROM HistoricosParcela h WHERE h.hparDtOcorrencia = :hparDtOcorrencia"),
    @NamedQuery(name = "HistoricosParcela.findByHparVlrPgto", query = "SELECT h FROM HistoricosParcela h WHERE h.hparVlrPgto = :hparVlrPgto"),
    @NamedQuery(name = "HistoricosParcela.findByHparDtProrrogacao", query = "SELECT h FROM HistoricosParcela h WHERE h.hparDtProrrogacao = :hparDtProrrogacao"),
    @NamedQuery(name = "HistoricosParcela.findByHparDtVencimento", query = "SELECT h FROM HistoricosParcela h WHERE h.hparDtVencimento = :hparDtVencimento"),
    @NamedQuery(name = "HistoricosParcela.findByHparValor", query = "SELECT h FROM HistoricosParcela h WHERE h.hparValor = :hparValor"),
    @NamedQuery(name = "HistoricosParcela.findByHparVlrIndexadorBase", query = "SELECT h FROM HistoricosParcela h WHERE h.hparVlrIndexadorBase = :hparVlrIndexadorBase"),
    @NamedQuery(name = "HistoricosParcela.findByHparVlrIndexadorReajuste", query = "SELECT h FROM HistoricosParcela h WHERE h.hparVlrIndexadorReajuste = :hparVlrIndexadorReajuste"),
    @NamedQuery(name = "HistoricosParcela.findByHparDescontoCapital", query = "SELECT h FROM HistoricosParcela h WHERE h.hparDescontoCapital = :hparDescontoCapital"),
    @NamedQuery(name = "HistoricosParcela.findByHparDescontoJuros", query = "SELECT h FROM HistoricosParcela h WHERE h.hparDescontoJuros = :hparDescontoJuros"),
    @NamedQuery(name = "HistoricosParcela.findByHparDescontoMulta", query = "SELECT h FROM HistoricosParcela h WHERE h.hparDescontoMulta = :hparDescontoMulta"),
    @NamedQuery(name = "HistoricosParcela.findByHparDescontoCorrecao", query = "SELECT h FROM HistoricosParcela h WHERE h.hparDescontoCorrecao = :hparDescontoCorrecao"),
    @NamedQuery(name = "HistoricosParcela.findByHparVlrDespesas", query = "SELECT h FROM HistoricosParcela h WHERE h.hparVlrDespesas = :hparVlrDespesas"),
    @NamedQuery(name = "HistoricosParcela.findByHparJuros", query = "SELECT h FROM HistoricosParcela h WHERE h.hparJuros = :hparJuros"),
    @NamedQuery(name = "HistoricosParcela.findByHparMultas", query = "SELECT h FROM HistoricosParcela h WHERE h.hparMultas = :hparMultas"),
    @NamedQuery(name = "HistoricosParcela.findByHparCorrecao", query = "SELECT h FROM HistoricosParcela h WHERE h.hparCorrecao = :hparCorrecao"),
    @NamedQuery(name = "HistoricosParcela.findByHparDeflacao", query = "SELECT h FROM HistoricosParcela h WHERE h.hparDeflacao = :hparDeflacao"),
    @NamedQuery(name = "HistoricosParcela.findByHparPercJuros", query = "SELECT h FROM HistoricosParcela h WHERE h.hparPercJuros = :hparPercJuros"),
    @NamedQuery(name = "HistoricosParcela.findByHparPercMulta", query = "SELECT h FROM HistoricosParcela h WHERE h.hparPercMulta = :hparPercMulta"),
    @NamedQuery(name = "HistoricosParcela.findByHparQuitarParcela", query = "SELECT h FROM HistoricosParcela h WHERE h.hparQuitarParcela = :hparQuitarParcela"),
    @NamedQuery(name = "HistoricosParcela.findByHparValorBaixa", query = "SELECT h FROM HistoricosParcela h WHERE h.hparValorBaixa = :hparValorBaixa"),
    @NamedQuery(name = "HistoricosParcela.findByHParLASTUPDATE", query = "SELECT h FROM HistoricosParcela h WHERE h.hParLASTUPDATE = :hParLASTUPDATE"),
    @NamedQuery(name = "HistoricosParcela.findByHparUsrsId", query = "SELECT h FROM HistoricosParcela h WHERE h.hparUsrsId = :hparUsrsId"),
    @NamedQuery(name = "HistoricosParcela.findByHparDtCredito", query = "SELECT h FROM HistoricosParcela h WHERE h.hparDtCredito = :hparDtCredito"),
    @NamedQuery(name = "HistoricosParcela.findByHparPrebaixa", query = "SELECT h FROM HistoricosParcela h WHERE h.hparPrebaixa = :hparPrebaixa"),
    @NamedQuery(name = "HistoricosParcela.findByHparDtPagamento", query = "SELECT h FROM HistoricosParcela h WHERE h.hparDtPagamento = :hparDtPagamento")})
public class HistoricosParcela implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "HPAR_ID")
    private String hparId;
    @Column(name = "HPAR_DATA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date hparData;
    @Lob
    @Column(name = "HPAR_EFEITO")
    private String hparEfeito;
    @Basic(optional = false)
    @Column(name = "HPAR_CODIGO_OCORRENCIA")
    private String hparCodigoOcorrencia;
    @Lob
    @Column(name = "HPAR_MOTIVOS")
    private String hparMotivos;
    @Lob
    @Column(name = "HPAR_NRO_NO_BANCO")
    private String hparNroNoBanco;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "HPAR_OUTRAS_DESPESAS")
    private BigDecimal hparOutrasDespesas;
    @Basic(optional = false)
    @Column(name = "HPAR_IOF")
    private BigDecimal hparIof;
    @Basic(optional = false)
    @Column(name = "HPAR_DESP_CARTORIO")
    private BigDecimal hparDespCartorio;
    @Column(name = "HPAR_DT_OCORRENCIA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date hparDtOcorrencia;
    @Basic(optional = false)
    @Column(name = "HPAR_VLR_PGTO")
    private BigDecimal hparVlrPgto;
    @Column(name = "HPAR_DT_PRORROGACAO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date hparDtProrrogacao;
    @Column(name = "HPAR_DT_VENCIMENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date hparDtVencimento;
    @Basic(optional = false)
    @Column(name = "HPAR_VALOR")
    private BigDecimal hparValor;
    @Basic(optional = false)
    @Column(name = "HPAR_VLR_INDEXADOR_BASE")
    private BigDecimal hparVlrIndexadorBase;
    @Basic(optional = false)
    @Column(name = "HPAR_VLR_INDEXADOR_REAJUSTE")
    private BigDecimal hparVlrIndexadorReajuste;
    @Basic(optional = false)
    @Column(name = "HPAR_DESCONTO_CAPITAL")
    private BigDecimal hparDescontoCapital;
    @Basic(optional = false)
    @Column(name = "HPAR_DESCONTO_JUROS")
    private BigDecimal hparDescontoJuros;
    @Basic(optional = false)
    @Column(name = "HPAR_DESCONTO_MULTA")
    private BigDecimal hparDescontoMulta;
    @Basic(optional = false)
    @Column(name = "HPAR_DESCONTO_CORRECAO")
    private BigDecimal hparDescontoCorrecao;
    @Basic(optional = false)
    @Column(name = "HPAR_VLR_DESPESAS")
    private BigDecimal hparVlrDespesas;
    @Basic(optional = false)
    @Column(name = "HPAR_JUROS")
    private BigDecimal hparJuros;
    @Basic(optional = false)
    @Column(name = "HPAR_MULTAS")
    private BigDecimal hparMultas;
    @Basic(optional = false)
    @Column(name = "HPAR_CORRECAO")
    private BigDecimal hparCorrecao;
    @Basic(optional = false)
    @Column(name = "HPAR_DEFLACAO")
    private BigDecimal hparDeflacao;
    @Basic(optional = false)
    @Column(name = "HPAR_PERC_JUROS")
    private BigDecimal hparPercJuros;
    @Basic(optional = false)
    @Column(name = "HPAR_PERC_MULTA")
    private BigDecimal hparPercMulta;
    @Basic(optional = false)
    @Column(name = "HPAR_QUITAR_PARCELA")
    private String hparQuitarParcela;
    @Basic(optional = false)
    @Column(name = "HPAR_VALOR_BAIXA")
    private BigDecimal hparValorBaixa;
    @Column(name = "HPar_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date hParLASTUPDATE;
    @Column(name = "HPAR_USRS_ID")
    private String hparUsrsId;
    @Column(name = "HPAR_DT_CREDITO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date hparDtCredito;
    @Column(name = "HPAR_PREBAIXA")
    private String hparPrebaixa;
    @Column(name = "HPAR_DT_PAGAMENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date hparDtPagamento;
    @JoinColumn(name = "ALNA_ID", referencedColumnName = "ALNA_ID")
    @ManyToOne
    private Alineas alnaId;
    @JoinColumn(name = "BMVP_ID", referencedColumnName = "BMVP_ID")
    @ManyToOne
    private BorderoMovParcelas bmvpId;
    @JoinColumn(name = "COFR_ID", referencedColumnName = "COFR_ID")
    @ManyToOne
    private Cofres cofrId;
    @JoinColumn(name = "PGCT_ID", referencedColumnName = "PGCT_ID")
    @ManyToOne
    private PagamentosContas pgctId;
    @JoinColumn(name = "PCLS_ID", referencedColumnName = "PCLS_ID")
    @ManyToOne
    private Parcelas pclsId;

    public HistoricosParcela() {
    }

    public HistoricosParcela(String hparId) {
        this.hparId = hparId;
    }

    public HistoricosParcela(String hparId, String hparCodigoOcorrencia, BigDecimal hparOutrasDespesas, BigDecimal hparIof, BigDecimal hparDespCartorio, BigDecimal hparVlrPgto, BigDecimal hparValor, BigDecimal hparVlrIndexadorBase, BigDecimal hparVlrIndexadorReajuste, BigDecimal hparDescontoCapital, BigDecimal hparDescontoJuros, BigDecimal hparDescontoMulta, BigDecimal hparDescontoCorrecao, BigDecimal hparVlrDespesas, BigDecimal hparJuros, BigDecimal hparMultas, BigDecimal hparCorrecao, BigDecimal hparDeflacao, BigDecimal hparPercJuros, BigDecimal hparPercMulta, String hparQuitarParcela, BigDecimal hparValorBaixa) {
        this.hparId = hparId;
        this.hparCodigoOcorrencia = hparCodigoOcorrencia;
        this.hparOutrasDespesas = hparOutrasDespesas;
        this.hparIof = hparIof;
        this.hparDespCartorio = hparDespCartorio;
        this.hparVlrPgto = hparVlrPgto;
        this.hparValor = hparValor;
        this.hparVlrIndexadorBase = hparVlrIndexadorBase;
        this.hparVlrIndexadorReajuste = hparVlrIndexadorReajuste;
        this.hparDescontoCapital = hparDescontoCapital;
        this.hparDescontoJuros = hparDescontoJuros;
        this.hparDescontoMulta = hparDescontoMulta;
        this.hparDescontoCorrecao = hparDescontoCorrecao;
        this.hparVlrDespesas = hparVlrDespesas;
        this.hparJuros = hparJuros;
        this.hparMultas = hparMultas;
        this.hparCorrecao = hparCorrecao;
        this.hparDeflacao = hparDeflacao;
        this.hparPercJuros = hparPercJuros;
        this.hparPercMulta = hparPercMulta;
        this.hparQuitarParcela = hparQuitarParcela;
        this.hparValorBaixa = hparValorBaixa;
    }

    public String getHparId() {
        return hparId;
    }

    public void setHparId(String hparId) {
        this.hparId = hparId;
    }

    public Date getHparData() {
        return hparData;
    }

    public void setHparData(Date hparData) {
        this.hparData = hparData;
    }

    public String getHparEfeito() {
        return hparEfeito;
    }

    public void setHparEfeito(String hparEfeito) {
        this.hparEfeito = hparEfeito;
    }

    public String getHparCodigoOcorrencia() {
        return hparCodigoOcorrencia;
    }

    public void setHparCodigoOcorrencia(String hparCodigoOcorrencia) {
        this.hparCodigoOcorrencia = hparCodigoOcorrencia;
    }

    public String getHparMotivos() {
        return hparMotivos;
    }

    public void setHparMotivos(String hparMotivos) {
        this.hparMotivos = hparMotivos;
    }

    public String getHparNroNoBanco() {
        return hparNroNoBanco;
    }

    public void setHparNroNoBanco(String hparNroNoBanco) {
        this.hparNroNoBanco = hparNroNoBanco;
    }

    public BigDecimal getHparOutrasDespesas() {
        return hparOutrasDespesas;
    }

    public void setHparOutrasDespesas(BigDecimal hparOutrasDespesas) {
        this.hparOutrasDespesas = hparOutrasDespesas;
    }

    public BigDecimal getHparIof() {
        return hparIof;
    }

    public void setHparIof(BigDecimal hparIof) {
        this.hparIof = hparIof;
    }

    public BigDecimal getHparDespCartorio() {
        return hparDespCartorio;
    }

    public void setHparDespCartorio(BigDecimal hparDespCartorio) {
        this.hparDespCartorio = hparDespCartorio;
    }

    public Date getHparDtOcorrencia() {
        return hparDtOcorrencia;
    }

    public void setHparDtOcorrencia(Date hparDtOcorrencia) {
        this.hparDtOcorrencia = hparDtOcorrencia;
    }

    public BigDecimal getHparVlrPgto() {
        return hparVlrPgto;
    }

    public void setHparVlrPgto(BigDecimal hparVlrPgto) {
        this.hparVlrPgto = hparVlrPgto;
    }

    public Date getHparDtProrrogacao() {
        return hparDtProrrogacao;
    }

    public void setHparDtProrrogacao(Date hparDtProrrogacao) {
        this.hparDtProrrogacao = hparDtProrrogacao;
    }

    public Date getHparDtVencimento() {
        return hparDtVencimento;
    }

    public void setHparDtVencimento(Date hparDtVencimento) {
        this.hparDtVencimento = hparDtVencimento;
    }

    public BigDecimal getHparValor() {
        return hparValor;
    }

    public void setHparValor(BigDecimal hparValor) {
        this.hparValor = hparValor;
    }

    public BigDecimal getHparVlrIndexadorBase() {
        return hparVlrIndexadorBase;
    }

    public void setHparVlrIndexadorBase(BigDecimal hparVlrIndexadorBase) {
        this.hparVlrIndexadorBase = hparVlrIndexadorBase;
    }

    public BigDecimal getHparVlrIndexadorReajuste() {
        return hparVlrIndexadorReajuste;
    }

    public void setHparVlrIndexadorReajuste(BigDecimal hparVlrIndexadorReajuste) {
        this.hparVlrIndexadorReajuste = hparVlrIndexadorReajuste;
    }

    public BigDecimal getHparDescontoCapital() {
        return hparDescontoCapital;
    }

    public void setHparDescontoCapital(BigDecimal hparDescontoCapital) {
        this.hparDescontoCapital = hparDescontoCapital;
    }

    public BigDecimal getHparDescontoJuros() {
        return hparDescontoJuros;
    }

    public void setHparDescontoJuros(BigDecimal hparDescontoJuros) {
        this.hparDescontoJuros = hparDescontoJuros;
    }

    public BigDecimal getHparDescontoMulta() {
        return hparDescontoMulta;
    }

    public void setHparDescontoMulta(BigDecimal hparDescontoMulta) {
        this.hparDescontoMulta = hparDescontoMulta;
    }

    public BigDecimal getHparDescontoCorrecao() {
        return hparDescontoCorrecao;
    }

    public void setHparDescontoCorrecao(BigDecimal hparDescontoCorrecao) {
        this.hparDescontoCorrecao = hparDescontoCorrecao;
    }

    public BigDecimal getHparVlrDespesas() {
        return hparVlrDespesas;
    }

    public void setHparVlrDespesas(BigDecimal hparVlrDespesas) {
        this.hparVlrDespesas = hparVlrDespesas;
    }

    public BigDecimal getHparJuros() {
        return hparJuros;
    }

    public void setHparJuros(BigDecimal hparJuros) {
        this.hparJuros = hparJuros;
    }

    public BigDecimal getHparMultas() {
        return hparMultas;
    }

    public void setHparMultas(BigDecimal hparMultas) {
        this.hparMultas = hparMultas;
    }

    public BigDecimal getHparCorrecao() {
        return hparCorrecao;
    }

    public void setHparCorrecao(BigDecimal hparCorrecao) {
        this.hparCorrecao = hparCorrecao;
    }

    public BigDecimal getHparDeflacao() {
        return hparDeflacao;
    }

    public void setHparDeflacao(BigDecimal hparDeflacao) {
        this.hparDeflacao = hparDeflacao;
    }

    public BigDecimal getHparPercJuros() {
        return hparPercJuros;
    }

    public void setHparPercJuros(BigDecimal hparPercJuros) {
        this.hparPercJuros = hparPercJuros;
    }

    public BigDecimal getHparPercMulta() {
        return hparPercMulta;
    }

    public void setHparPercMulta(BigDecimal hparPercMulta) {
        this.hparPercMulta = hparPercMulta;
    }

    public String getHparQuitarParcela() {
        return hparQuitarParcela;
    }

    public void setHparQuitarParcela(String hparQuitarParcela) {
        this.hparQuitarParcela = hparQuitarParcela;
    }

    public BigDecimal getHparValorBaixa() {
        return hparValorBaixa;
    }

    public void setHparValorBaixa(BigDecimal hparValorBaixa) {
        this.hparValorBaixa = hparValorBaixa;
    }

    public Date getHParLASTUPDATE() {
        return hParLASTUPDATE;
    }

    public void setHParLASTUPDATE(Date hParLASTUPDATE) {
        this.hParLASTUPDATE = hParLASTUPDATE;
    }

    public String getHparUsrsId() {
        return hparUsrsId;
    }

    public void setHparUsrsId(String hparUsrsId) {
        this.hparUsrsId = hparUsrsId;
    }

    public Date getHparDtCredito() {
        return hparDtCredito;
    }

    public void setHparDtCredito(Date hparDtCredito) {
        this.hparDtCredito = hparDtCredito;
    }

    public String getHparPrebaixa() {
        return hparPrebaixa;
    }

    public void setHparPrebaixa(String hparPrebaixa) {
        this.hparPrebaixa = hparPrebaixa;
    }

    public Date getHparDtPagamento() {
        return hparDtPagamento;
    }

    public void setHparDtPagamento(Date hparDtPagamento) {
        this.hparDtPagamento = hparDtPagamento;
    }

    public Alineas getAlnaId() {
        return alnaId;
    }

    public void setAlnaId(Alineas alnaId) {
        this.alnaId = alnaId;
    }

    public BorderoMovParcelas getBmvpId() {
        return bmvpId;
    }

    public void setBmvpId(BorderoMovParcelas bmvpId) {
        this.bmvpId = bmvpId;
    }

    public Cofres getCofrId() {
        return cofrId;
    }

    public void setCofrId(Cofres cofrId) {
        this.cofrId = cofrId;
    }

    public PagamentosContas getPgctId() {
        return pgctId;
    }

    public void setPgctId(PagamentosContas pgctId) {
        this.pgctId = pgctId;
    }

    public Parcelas getPclsId() {
        return pclsId;
    }

    public void setPclsId(Parcelas pclsId) {
        this.pclsId = pclsId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hparId != null ? hparId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HistoricosParcela)) {
            return false;
        }
        HistoricosParcela other = (HistoricosParcela) object;
        if ((this.hparId == null && other.hparId != null) || (this.hparId != null && !this.hparId.equals(other.hparId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.HistoricosParcela[ hparId=" + hparId + " ]";
    }
    
}
