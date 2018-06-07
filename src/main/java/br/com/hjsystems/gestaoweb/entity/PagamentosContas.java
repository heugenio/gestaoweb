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
@Table(name = "PAGAMENTOS_CONTAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PagamentosContas.findAll", query = "SELECT p FROM PagamentosContas p"),
    @NamedQuery(name = "PagamentosContas.findByPgctId", query = "SELECT p FROM PagamentosContas p WHERE p.pgctId = :pgctId"),
    @NamedQuery(name = "PagamentosContas.findByPgctData", query = "SELECT p FROM PagamentosContas p WHERE p.pgctData = :pgctData"),
    @NamedQuery(name = "PagamentosContas.findByPgctValor", query = "SELECT p FROM PagamentosContas p WHERE p.pgctValor = :pgctValor"),
    @NamedQuery(name = "PagamentosContas.findByPgctVlrIndexadorBase", query = "SELECT p FROM PagamentosContas p WHERE p.pgctVlrIndexadorBase = :pgctVlrIndexadorBase"),
    @NamedQuery(name = "PagamentosContas.findByPgctVlrIndexadorReajuste", query = "SELECT p FROM PagamentosContas p WHERE p.pgctVlrIndexadorReajuste = :pgctVlrIndexadorReajuste"),
    @NamedQuery(name = "PagamentosContas.findByPgctDescontoCapital", query = "SELECT p FROM PagamentosContas p WHERE p.pgctDescontoCapital = :pgctDescontoCapital"),
    @NamedQuery(name = "PagamentosContas.findByPgctDescontoJuros", query = "SELECT p FROM PagamentosContas p WHERE p.pgctDescontoJuros = :pgctDescontoJuros"),
    @NamedQuery(name = "PagamentosContas.findByPgctDescontoMulta", query = "SELECT p FROM PagamentosContas p WHERE p.pgctDescontoMulta = :pgctDescontoMulta"),
    @NamedQuery(name = "PagamentosContas.findByPgctDescontoCorrecao", query = "SELECT p FROM PagamentosContas p WHERE p.pgctDescontoCorrecao = :pgctDescontoCorrecao"),
    @NamedQuery(name = "PagamentosContas.findByPgctDespesas", query = "SELECT p FROM PagamentosContas p WHERE p.pgctDespesas = :pgctDespesas"),
    @NamedQuery(name = "PagamentosContas.findByPgctJuros", query = "SELECT p FROM PagamentosContas p WHERE p.pgctJuros = :pgctJuros"),
    @NamedQuery(name = "PagamentosContas.findByPgctMultas", query = "SELECT p FROM PagamentosContas p WHERE p.pgctMultas = :pgctMultas"),
    @NamedQuery(name = "PagamentosContas.findByPgctCorrecao", query = "SELECT p FROM PagamentosContas p WHERE p.pgctCorrecao = :pgctCorrecao"),
    @NamedQuery(name = "PagamentosContas.findByPgctDeflacao", query = "SELECT p FROM PagamentosContas p WHERE p.pgctDeflacao = :pgctDeflacao"),
    @NamedQuery(name = "PagamentosContas.findByPgctPercJuros", query = "SELECT p FROM PagamentosContas p WHERE p.pgctPercJuros = :pgctPercJuros"),
    @NamedQuery(name = "PagamentosContas.findByPgctPercMulta", query = "SELECT p FROM PagamentosContas p WHERE p.pgctPercMulta = :pgctPercMulta"),
    @NamedQuery(name = "PagamentosContas.findByPgctQuitarParcela", query = "SELECT p FROM PagamentosContas p WHERE p.pgctQuitarParcela = :pgctQuitarParcela"),
    @NamedQuery(name = "PagamentosContas.findByPgctDataPrebaixa", query = "SELECT p FROM PagamentosContas p WHERE p.pgctDataPrebaixa = :pgctDataPrebaixa"),
    @NamedQuery(name = "PagamentosContas.findByPgctPrebaixa", query = "SELECT p FROM PagamentosContas p WHERE p.pgctPrebaixa = :pgctPrebaixa"),
    @NamedQuery(name = "PagamentosContas.findByPlctId", query = "SELECT p FROM PagamentosContas p WHERE p.plctId = :plctId"),
    @NamedQuery(name = "PagamentosContas.findByPgCtLASTUPDATE", query = "SELECT p FROM PagamentosContas p WHERE p.pgCtLASTUPDATE = :pgCtLASTUPDATE"),
    @NamedQuery(name = "PagamentosContas.findByPgctUsrsId", query = "SELECT p FROM PagamentosContas p WHERE p.pgctUsrsId = :pgctUsrsId"),
    @NamedQuery(name = "PagamentosContas.findByPgctDataCredito", query = "SELECT p FROM PagamentosContas p WHERE p.pgctDataCredito = :pgctDataCredito"),
    @NamedQuery(name = "PagamentosContas.findByPgctDtPagamento", query = "SELECT p FROM PagamentosContas p WHERE p.pgctDtPagamento = :pgctDtPagamento")})
public class PagamentosContas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PGCT_ID")
    private String pgctId;
    @Basic(optional = false)
    @Column(name = "PGCT_DATA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pgctData;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "PGCT_VALOR")
    private BigDecimal pgctValor;
    @Basic(optional = false)
    @Column(name = "PGCT_VLR_INDEXADOR_BASE")
    private BigDecimal pgctVlrIndexadorBase;
    @Basic(optional = false)
    @Column(name = "PGCT_VLR_INDEXADOR_REAJUSTE")
    private BigDecimal pgctVlrIndexadorReajuste;
    @Basic(optional = false)
    @Column(name = "PGCT_DESCONTO_CAPITAL")
    private BigDecimal pgctDescontoCapital;
    @Basic(optional = false)
    @Column(name = "PGCT_DESCONTO_JUROS")
    private BigDecimal pgctDescontoJuros;
    @Basic(optional = false)
    @Column(name = "PGCT_DESCONTO_MULTA")
    private BigDecimal pgctDescontoMulta;
    @Basic(optional = false)
    @Column(name = "PGCT_DESCONTO_CORRECAO")
    private BigDecimal pgctDescontoCorrecao;
    @Basic(optional = false)
    @Column(name = "PGCT_DESPESAS")
    private BigDecimal pgctDespesas;
    @Basic(optional = false)
    @Column(name = "PGCT_JUROS")
    private BigDecimal pgctJuros;
    @Basic(optional = false)
    @Column(name = "PGCT_MULTAS")
    private BigDecimal pgctMultas;
    @Basic(optional = false)
    @Column(name = "PGCT_CORRECAO")
    private BigDecimal pgctCorrecao;
    @Basic(optional = false)
    @Column(name = "PGCT_DEFLACAO")
    private BigDecimal pgctDeflacao;
    @Basic(optional = false)
    @Column(name = "PGCT_PERC_JUROS")
    private BigDecimal pgctPercJuros;
    @Basic(optional = false)
    @Column(name = "PGCT_PERC_MULTA")
    private BigDecimal pgctPercMulta;
    @Basic(optional = false)
    @Column(name = "PGCT_QUITAR_PARCELA")
    private String pgctQuitarParcela;
    @Column(name = "PGCT_DATA_PREBAIXA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pgctDataPrebaixa;
    @Column(name = "PGCT_PREBAIXA")
    private String pgctPrebaixa;
    @Column(name = "PLCT_ID")
    private String plctId;
    @Column(name = "PgCt_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pgCtLASTUPDATE;
    @Column(name = "PGCT_USRS_ID")
    private String pgctUsrsId;
    @Column(name = "PGCT_DATA_CREDITO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pgctDataCredito;
    @Column(name = "PGCT_DT_PAGAMENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pgctDtPagamento;
    @OneToMany(mappedBy = "pgctId")
    private List<HistoricosParcela> historicosParcelaList;
    @JoinColumn(name = "COFR_ID", referencedColumnName = "COFR_ID")
    @ManyToOne
    private Cofres cofrId;
    @JoinColumn(name = "ITCX_ID", referencedColumnName = "ITCX_ID")
    @ManyToOne
    private ItensCaixas itcxId;
    @JoinColumn(name = "PCLS_ID", referencedColumnName = "PCLS_ID")
    @ManyToOne
    private Parcelas pclsId;
    @JoinColumn(name = "TPBX_ID", referencedColumnName = "TPBX_ID")
    @ManyToOne
    private TiposBaixa tpbxId;
    @OneToMany(mappedBy = "pgctId")
    private List<MovimentoContabil> movimentoContabilList;

    public PagamentosContas() {
    }

    public PagamentosContas(String pgctId) {
        this.pgctId = pgctId;
    }

    public PagamentosContas(String pgctId, Date pgctData, BigDecimal pgctValor, BigDecimal pgctVlrIndexadorBase, BigDecimal pgctVlrIndexadorReajuste, BigDecimal pgctDescontoCapital, BigDecimal pgctDescontoJuros, BigDecimal pgctDescontoMulta, BigDecimal pgctDescontoCorrecao, BigDecimal pgctDespesas, BigDecimal pgctJuros, BigDecimal pgctMultas, BigDecimal pgctCorrecao, BigDecimal pgctDeflacao, BigDecimal pgctPercJuros, BigDecimal pgctPercMulta, String pgctQuitarParcela) {
        this.pgctId = pgctId;
        this.pgctData = pgctData;
        this.pgctValor = pgctValor;
        this.pgctVlrIndexadorBase = pgctVlrIndexadorBase;
        this.pgctVlrIndexadorReajuste = pgctVlrIndexadorReajuste;
        this.pgctDescontoCapital = pgctDescontoCapital;
        this.pgctDescontoJuros = pgctDescontoJuros;
        this.pgctDescontoMulta = pgctDescontoMulta;
        this.pgctDescontoCorrecao = pgctDescontoCorrecao;
        this.pgctDespesas = pgctDespesas;
        this.pgctJuros = pgctJuros;
        this.pgctMultas = pgctMultas;
        this.pgctCorrecao = pgctCorrecao;
        this.pgctDeflacao = pgctDeflacao;
        this.pgctPercJuros = pgctPercJuros;
        this.pgctPercMulta = pgctPercMulta;
        this.pgctQuitarParcela = pgctQuitarParcela;
    }

    public String getPgctId() {
        return pgctId;
    }

    public void setPgctId(String pgctId) {
        this.pgctId = pgctId;
    }

    public Date getPgctData() {
        return pgctData;
    }

    public void setPgctData(Date pgctData) {
        this.pgctData = pgctData;
    }

    public BigDecimal getPgctValor() {
        return pgctValor;
    }

    public void setPgctValor(BigDecimal pgctValor) {
        this.pgctValor = pgctValor;
    }

    public BigDecimal getPgctVlrIndexadorBase() {
        return pgctVlrIndexadorBase;
    }

    public void setPgctVlrIndexadorBase(BigDecimal pgctVlrIndexadorBase) {
        this.pgctVlrIndexadorBase = pgctVlrIndexadorBase;
    }

    public BigDecimal getPgctVlrIndexadorReajuste() {
        return pgctVlrIndexadorReajuste;
    }

    public void setPgctVlrIndexadorReajuste(BigDecimal pgctVlrIndexadorReajuste) {
        this.pgctVlrIndexadorReajuste = pgctVlrIndexadorReajuste;
    }

    public BigDecimal getPgctDescontoCapital() {
        return pgctDescontoCapital;
    }

    public void setPgctDescontoCapital(BigDecimal pgctDescontoCapital) {
        this.pgctDescontoCapital = pgctDescontoCapital;
    }

    public BigDecimal getPgctDescontoJuros() {
        return pgctDescontoJuros;
    }

    public void setPgctDescontoJuros(BigDecimal pgctDescontoJuros) {
        this.pgctDescontoJuros = pgctDescontoJuros;
    }

    public BigDecimal getPgctDescontoMulta() {
        return pgctDescontoMulta;
    }

    public void setPgctDescontoMulta(BigDecimal pgctDescontoMulta) {
        this.pgctDescontoMulta = pgctDescontoMulta;
    }

    public BigDecimal getPgctDescontoCorrecao() {
        return pgctDescontoCorrecao;
    }

    public void setPgctDescontoCorrecao(BigDecimal pgctDescontoCorrecao) {
        this.pgctDescontoCorrecao = pgctDescontoCorrecao;
    }

    public BigDecimal getPgctDespesas() {
        return pgctDespesas;
    }

    public void setPgctDespesas(BigDecimal pgctDespesas) {
        this.pgctDespesas = pgctDespesas;
    }

    public BigDecimal getPgctJuros() {
        return pgctJuros;
    }

    public void setPgctJuros(BigDecimal pgctJuros) {
        this.pgctJuros = pgctJuros;
    }

    public BigDecimal getPgctMultas() {
        return pgctMultas;
    }

    public void setPgctMultas(BigDecimal pgctMultas) {
        this.pgctMultas = pgctMultas;
    }

    public BigDecimal getPgctCorrecao() {
        return pgctCorrecao;
    }

    public void setPgctCorrecao(BigDecimal pgctCorrecao) {
        this.pgctCorrecao = pgctCorrecao;
    }

    public BigDecimal getPgctDeflacao() {
        return pgctDeflacao;
    }

    public void setPgctDeflacao(BigDecimal pgctDeflacao) {
        this.pgctDeflacao = pgctDeflacao;
    }

    public BigDecimal getPgctPercJuros() {
        return pgctPercJuros;
    }

    public void setPgctPercJuros(BigDecimal pgctPercJuros) {
        this.pgctPercJuros = pgctPercJuros;
    }

    public BigDecimal getPgctPercMulta() {
        return pgctPercMulta;
    }

    public void setPgctPercMulta(BigDecimal pgctPercMulta) {
        this.pgctPercMulta = pgctPercMulta;
    }

    public String getPgctQuitarParcela() {
        return pgctQuitarParcela;
    }

    public void setPgctQuitarParcela(String pgctQuitarParcela) {
        this.pgctQuitarParcela = pgctQuitarParcela;
    }

    public Date getPgctDataPrebaixa() {
        return pgctDataPrebaixa;
    }

    public void setPgctDataPrebaixa(Date pgctDataPrebaixa) {
        this.pgctDataPrebaixa = pgctDataPrebaixa;
    }

    public String getPgctPrebaixa() {
        return pgctPrebaixa;
    }

    public void setPgctPrebaixa(String pgctPrebaixa) {
        this.pgctPrebaixa = pgctPrebaixa;
    }

    public String getPlctId() {
        return plctId;
    }

    public void setPlctId(String plctId) {
        this.plctId = plctId;
    }

    public Date getPgCtLASTUPDATE() {
        return pgCtLASTUPDATE;
    }

    public void setPgCtLASTUPDATE(Date pgCtLASTUPDATE) {
        this.pgCtLASTUPDATE = pgCtLASTUPDATE;
    }

    public String getPgctUsrsId() {
        return pgctUsrsId;
    }

    public void setPgctUsrsId(String pgctUsrsId) {
        this.pgctUsrsId = pgctUsrsId;
    }

    public Date getPgctDataCredito() {
        return pgctDataCredito;
    }

    public void setPgctDataCredito(Date pgctDataCredito) {
        this.pgctDataCredito = pgctDataCredito;
    }

    public Date getPgctDtPagamento() {
        return pgctDtPagamento;
    }

    public void setPgctDtPagamento(Date pgctDtPagamento) {
        this.pgctDtPagamento = pgctDtPagamento;
    }

    @XmlTransient
    public List<HistoricosParcela> getHistoricosParcelaList() {
        return historicosParcelaList;
    }

    public void setHistoricosParcelaList(List<HistoricosParcela> historicosParcelaList) {
        this.historicosParcelaList = historicosParcelaList;
    }

    public Cofres getCofrId() {
        return cofrId;
    }

    public void setCofrId(Cofres cofrId) {
        this.cofrId = cofrId;
    }

    public ItensCaixas getItcxId() {
        return itcxId;
    }

    public void setItcxId(ItensCaixas itcxId) {
        this.itcxId = itcxId;
    }

    public Parcelas getPclsId() {
        return pclsId;
    }

    public void setPclsId(Parcelas pclsId) {
        this.pclsId = pclsId;
    }

    public TiposBaixa getTpbxId() {
        return tpbxId;
    }

    public void setTpbxId(TiposBaixa tpbxId) {
        this.tpbxId = tpbxId;
    }

    @XmlTransient
    public List<MovimentoContabil> getMovimentoContabilList() {
        return movimentoContabilList;
    }

    public void setMovimentoContabilList(List<MovimentoContabil> movimentoContabilList) {
        this.movimentoContabilList = movimentoContabilList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pgctId != null ? pgctId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PagamentosContas)) {
            return false;
        }
        PagamentosContas other = (PagamentosContas) object;
        if ((this.pgctId == null && other.pgctId != null) || (this.pgctId != null && !this.pgctId.equals(other.pgctId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.PagamentosContas[ pgctId=" + pgctId + " ]";
    }
    
}
