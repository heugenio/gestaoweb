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
@Table(name = "ITENS_REQUISICOES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ItensRequisicoes.findAll", query = "SELECT i FROM ItensRequisicoes i"),
    @NamedQuery(name = "ItensRequisicoes.findByItrqId", query = "SELECT i FROM ItensRequisicoes i WHERE i.itrqId = :itrqId"),
    @NamedQuery(name = "ItensRequisicoes.findByItrqQtde", query = "SELECT i FROM ItensRequisicoes i WHERE i.itrqQtde = :itrqQtde"),
    @NamedQuery(name = "ItensRequisicoes.findByItrqQtdeEstornada", query = "SELECT i FROM ItensRequisicoes i WHERE i.itrqQtdeEstornada = :itrqQtdeEstornada"),
    @NamedQuery(name = "ItensRequisicoes.findByItrqQtdeRequisitada", query = "SELECT i FROM ItensRequisicoes i WHERE i.itrqQtdeRequisitada = :itrqQtdeRequisitada"),
    @NamedQuery(name = "ItensRequisicoes.findByItrqUnidSigla", query = "SELECT i FROM ItensRequisicoes i WHERE i.itrqUnidSigla = :itrqUnidSigla"),
    @NamedQuery(name = "ItensRequisicoes.findByItrqSbupMultiplicador", query = "SELECT i FROM ItensRequisicoes i WHERE i.itrqSbupMultiplicador = :itrqSbupMultiplicador"),
    @NamedQuery(name = "ItensRequisicoes.findByItrqPrecoUnitario", query = "SELECT i FROM ItensRequisicoes i WHERE i.itrqPrecoUnitario = :itrqPrecoUnitario"),
    @NamedQuery(name = "ItensRequisicoes.findByItrqProdDescricao", query = "SELECT i FROM ItensRequisicoes i WHERE i.itrqProdDescricao = :itrqProdDescricao"),
    @NamedQuery(name = "ItensRequisicoes.findByItrqPrecoTabela", query = "SELECT i FROM ItensRequisicoes i WHERE i.itrqPrecoTabela = :itrqPrecoTabela"),
    @NamedQuery(name = "ItensRequisicoes.findByItrqDesconto", query = "SELECT i FROM ItensRequisicoes i WHERE i.itrqDesconto = :itrqDesconto"),
    @NamedQuery(name = "ItensRequisicoes.findByItrqVlrDescontoSobreTotal", query = "SELECT i FROM ItensRequisicoes i WHERE i.itrqVlrDescontoSobreTotal = :itrqVlrDescontoSobreTotal"),
    @NamedQuery(name = "ItensRequisicoes.findByItrqVlrFinal", query = "SELECT i FROM ItensRequisicoes i WHERE i.itrqVlrFinal = :itrqVlrFinal"),
    @NamedQuery(name = "ItensRequisicoes.findByItrqLastupdate", query = "SELECT i FROM ItensRequisicoes i WHERE i.itrqLastupdate = :itrqLastupdate"),
    @NamedQuery(name = "ItensRequisicoes.findByItrqCustoNaOperacao", query = "SELECT i FROM ItensRequisicoes i WHERE i.itrqCustoNaOperacao = :itrqCustoNaOperacao"),
    @NamedQuery(name = "ItensRequisicoes.findByItrqQtdEntrada", query = "SELECT i FROM ItensRequisicoes i WHERE i.itrqQtdEntrada = :itrqQtdEntrada"),
    @NamedQuery(name = "ItensRequisicoes.findByItrqQtdTrocas", query = "SELECT i FROM ItensRequisicoes i WHERE i.itrqQtdTrocas = :itrqQtdTrocas"),
    @NamedQuery(name = "ItensRequisicoes.findByItrqQtdRecusados", query = "SELECT i FROM ItensRequisicoes i WHERE i.itrqQtdRecusados = :itrqQtdRecusados"),
    @NamedQuery(name = "ItensRequisicoes.findByItrqQtdVelhos", query = "SELECT i FROM ItensRequisicoes i WHERE i.itrqQtdVelhos = :itrqQtdVelhos"),
    @NamedQuery(name = "ItensRequisicoes.findByItrqQtdQuebrasMaquina", query = "SELECT i FROM ItensRequisicoes i WHERE i.itrqQtdQuebrasMaquina = :itrqQtdQuebrasMaquina"),
    @NamedQuery(name = "ItensRequisicoes.findByItrqQtdQuebrasEstoque", query = "SELECT i FROM ItensRequisicoes i WHERE i.itrqQtdQuebrasEstoque = :itrqQtdQuebrasEstoque"),
    @NamedQuery(name = "ItensRequisicoes.findByItrqQtdQuebrasCarga", query = "SELECT i FROM ItensRequisicoes i WHERE i.itrqQtdQuebrasCarga = :itrqQtdQuebrasCarga"),
    @NamedQuery(name = "ItensRequisicoes.findByItrqDescQuebra", query = "SELECT i FROM ItensRequisicoes i WHERE i.itrqDescQuebra = :itrqDescQuebra"),
    @NamedQuery(name = "ItensRequisicoes.findByItrqDescQuebras", query = "SELECT i FROM ItensRequisicoes i WHERE i.itrqDescQuebras = :itrqDescQuebras")})
public class ItensRequisicoes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ITRQ_ID")
    private String itrqId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "ITRQ_QTDE")
    private BigDecimal itrqQtde;
    @Basic(optional = false)
    @Column(name = "ITRQ_QTDE_ESTORNADA")
    private BigDecimal itrqQtdeEstornada;
    @Basic(optional = false)
    @Column(name = "ITRQ_QTDE_REQUISITADA")
    private BigDecimal itrqQtdeRequisitada;
    @Basic(optional = false)
    @Column(name = "ITRQ_UNID_SIGLA")
    private String itrqUnidSigla;
    @Basic(optional = false)
    @Column(name = "ITRQ_SBUP_MULTIPLICADOR")
    private BigDecimal itrqSbupMultiplicador;
    @Basic(optional = false)
    @Column(name = "ITRQ_PRECO_UNITARIO")
    private BigDecimal itrqPrecoUnitario;
    @Column(name = "ITRQ_PROD_DESCRICAO")
    private String itrqProdDescricao;
    @Basic(optional = false)
    @Column(name = "ITRQ_PRECO_TABELA")
    private BigDecimal itrqPrecoTabela;
    @Basic(optional = false)
    @Column(name = "ITRQ_DESCONTO")
    private BigDecimal itrqDesconto;
    @Basic(optional = false)
    @Column(name = "ITRQ_VLR_DESCONTO_SOBRE_TOTAL")
    private BigDecimal itrqVlrDescontoSobreTotal;
    @Basic(optional = false)
    @Column(name = "ITRQ_VLR_FINAL")
    private BigDecimal itrqVlrFinal;
    @Column(name = "ITRQ_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date itrqLastupdate;
    @Column(name = "ITRQ_CUSTO_NA_OPERACAO")
    private BigDecimal itrqCustoNaOperacao;
    @Column(name = "ITRQ_QTD_ENTRADA")
    private BigDecimal itrqQtdEntrada;
    @Basic(optional = false)
    @Column(name = "ITRQ_QTD_TROCAS")
    private BigDecimal itrqQtdTrocas;
    @Basic(optional = false)
    @Column(name = "ITRQ_QTD_RECUSADOS")
    private BigDecimal itrqQtdRecusados;
    @Basic(optional = false)
    @Column(name = "ITRQ_QTD_VELHOS")
    private BigDecimal itrqQtdVelhos;
    @Basic(optional = false)
    @Column(name = "ITRQ_QTD_QUEBRAS_MAQUINA")
    private BigDecimal itrqQtdQuebrasMaquina;
    @Basic(optional = false)
    @Column(name = "ITRQ_QTD_QUEBRAS_ESTOQUE")
    private BigDecimal itrqQtdQuebrasEstoque;
    @Basic(optional = false)
    @Column(name = "ITRQ_QTD_QUEBRAS_CARGA")
    private BigDecimal itrqQtdQuebrasCarga;
    @Basic(optional = false)
    @Column(name = "ITRQ_DESC_QUEBRA")
    private BigDecimal itrqDescQuebra;
    @Basic(optional = false)
    @Column(name = "ITRQ_DESC_QUEBRAS")
    private BigDecimal itrqDescQuebras;
    @OneToMany(mappedBy = "itrqId")
    private List<SaldosEstoquesDiario> saldosEstoquesDiarioList;
    @OneToMany(mappedBy = "iteItrqId")
    private List<ItensRequisicoes> itensRequisicoesList;
    @JoinColumn(name = "ITE_ITRQ_ID", referencedColumnName = "ITRQ_ID")
    @ManyToOne
    private ItensRequisicoes iteItrqId;
    @JoinColumn(name = "LOTE_ID", referencedColumnName = "LOTE_ID")
    @ManyToOne
    private Lotes loteId;
    @JoinColumn(name = "PROD_ID", referencedColumnName = "PROD_ID")
    @ManyToOne
    private Produtos prodId;
    @JoinColumn(name = "RQSC_ID", referencedColumnName = "RQSC_ID")
    @ManyToOne
    private Requisicoes rqscId;
    @JoinColumn(name = "TCNC_ID", referencedColumnName = "TCNC_ID")
    @ManyToOne
    private Tecnico tcncId;
    @JoinColumn(name = "TEC_TCNC_ID", referencedColumnName = "TCNC_ID")
    @ManyToOne
    private Tecnico tecTcncId;
    @JoinColumn(name = "TEST_ID", referencedColumnName = "TEST_ID")
    @ManyToOne
    private TiposEstoques testId;
    @JoinColumn(name = "USRS_ID", referencedColumnName = "USRS_ID")
    @ManyToOne
    private Usuarios usrsId;
    @OneToMany(mappedBy = "itrqId")
    private List<SolicitacoesCompras> solicitacoesComprasList;
    @OneToMany(mappedBy = "itrqId")
    private List<ItensPedidos> itensPedidosList;
    @OneToMany(mappedBy = "itrqId")
    private List<BaseTroca> baseTrocaList;
    @OneToMany(mappedBy = "itrqId")
    private List<DivergenciasPedido> divergenciasPedidoList;

    public ItensRequisicoes() {
    }

    public ItensRequisicoes(String itrqId) {
        this.itrqId = itrqId;
    }

    public ItensRequisicoes(String itrqId, BigDecimal itrqQtde, BigDecimal itrqQtdeEstornada, BigDecimal itrqQtdeRequisitada, String itrqUnidSigla, BigDecimal itrqSbupMultiplicador, BigDecimal itrqPrecoUnitario, BigDecimal itrqPrecoTabela, BigDecimal itrqDesconto, BigDecimal itrqVlrDescontoSobreTotal, BigDecimal itrqVlrFinal, BigDecimal itrqQtdTrocas, BigDecimal itrqQtdRecusados, BigDecimal itrqQtdVelhos, BigDecimal itrqQtdQuebrasMaquina, BigDecimal itrqQtdQuebrasEstoque, BigDecimal itrqQtdQuebrasCarga, BigDecimal itrqDescQuebra, BigDecimal itrqDescQuebras) {
        this.itrqId = itrqId;
        this.itrqQtde = itrqQtde;
        this.itrqQtdeEstornada = itrqQtdeEstornada;
        this.itrqQtdeRequisitada = itrqQtdeRequisitada;
        this.itrqUnidSigla = itrqUnidSigla;
        this.itrqSbupMultiplicador = itrqSbupMultiplicador;
        this.itrqPrecoUnitario = itrqPrecoUnitario;
        this.itrqPrecoTabela = itrqPrecoTabela;
        this.itrqDesconto = itrqDesconto;
        this.itrqVlrDescontoSobreTotal = itrqVlrDescontoSobreTotal;
        this.itrqVlrFinal = itrqVlrFinal;
        this.itrqQtdTrocas = itrqQtdTrocas;
        this.itrqQtdRecusados = itrqQtdRecusados;
        this.itrqQtdVelhos = itrqQtdVelhos;
        this.itrqQtdQuebrasMaquina = itrqQtdQuebrasMaquina;
        this.itrqQtdQuebrasEstoque = itrqQtdQuebrasEstoque;
        this.itrqQtdQuebrasCarga = itrqQtdQuebrasCarga;
        this.itrqDescQuebra = itrqDescQuebra;
        this.itrqDescQuebras = itrqDescQuebras;
    }

    public String getItrqId() {
        return itrqId;
    }

    public void setItrqId(String itrqId) {
        this.itrqId = itrqId;
    }

    public BigDecimal getItrqQtde() {
        return itrqQtde;
    }

    public void setItrqQtde(BigDecimal itrqQtde) {
        this.itrqQtde = itrqQtde;
    }

    public BigDecimal getItrqQtdeEstornada() {
        return itrqQtdeEstornada;
    }

    public void setItrqQtdeEstornada(BigDecimal itrqQtdeEstornada) {
        this.itrqQtdeEstornada = itrqQtdeEstornada;
    }

    public BigDecimal getItrqQtdeRequisitada() {
        return itrqQtdeRequisitada;
    }

    public void setItrqQtdeRequisitada(BigDecimal itrqQtdeRequisitada) {
        this.itrqQtdeRequisitada = itrqQtdeRequisitada;
    }

    public String getItrqUnidSigla() {
        return itrqUnidSigla;
    }

    public void setItrqUnidSigla(String itrqUnidSigla) {
        this.itrqUnidSigla = itrqUnidSigla;
    }

    public BigDecimal getItrqSbupMultiplicador() {
        return itrqSbupMultiplicador;
    }

    public void setItrqSbupMultiplicador(BigDecimal itrqSbupMultiplicador) {
        this.itrqSbupMultiplicador = itrqSbupMultiplicador;
    }

    public BigDecimal getItrqPrecoUnitario() {
        return itrqPrecoUnitario;
    }

    public void setItrqPrecoUnitario(BigDecimal itrqPrecoUnitario) {
        this.itrqPrecoUnitario = itrqPrecoUnitario;
    }

    public String getItrqProdDescricao() {
        return itrqProdDescricao;
    }

    public void setItrqProdDescricao(String itrqProdDescricao) {
        this.itrqProdDescricao = itrqProdDescricao;
    }

    public BigDecimal getItrqPrecoTabela() {
        return itrqPrecoTabela;
    }

    public void setItrqPrecoTabela(BigDecimal itrqPrecoTabela) {
        this.itrqPrecoTabela = itrqPrecoTabela;
    }

    public BigDecimal getItrqDesconto() {
        return itrqDesconto;
    }

    public void setItrqDesconto(BigDecimal itrqDesconto) {
        this.itrqDesconto = itrqDesconto;
    }

    public BigDecimal getItrqVlrDescontoSobreTotal() {
        return itrqVlrDescontoSobreTotal;
    }

    public void setItrqVlrDescontoSobreTotal(BigDecimal itrqVlrDescontoSobreTotal) {
        this.itrqVlrDescontoSobreTotal = itrqVlrDescontoSobreTotal;
    }

    public BigDecimal getItrqVlrFinal() {
        return itrqVlrFinal;
    }

    public void setItrqVlrFinal(BigDecimal itrqVlrFinal) {
        this.itrqVlrFinal = itrqVlrFinal;
    }

    public Date getItrqLastupdate() {
        return itrqLastupdate;
    }

    public void setItrqLastupdate(Date itrqLastupdate) {
        this.itrqLastupdate = itrqLastupdate;
    }

    public BigDecimal getItrqCustoNaOperacao() {
        return itrqCustoNaOperacao;
    }

    public void setItrqCustoNaOperacao(BigDecimal itrqCustoNaOperacao) {
        this.itrqCustoNaOperacao = itrqCustoNaOperacao;
    }

    public BigDecimal getItrqQtdEntrada() {
        return itrqQtdEntrada;
    }

    public void setItrqQtdEntrada(BigDecimal itrqQtdEntrada) {
        this.itrqQtdEntrada = itrqQtdEntrada;
    }

    public BigDecimal getItrqQtdTrocas() {
        return itrqQtdTrocas;
    }

    public void setItrqQtdTrocas(BigDecimal itrqQtdTrocas) {
        this.itrqQtdTrocas = itrqQtdTrocas;
    }

    public BigDecimal getItrqQtdRecusados() {
        return itrqQtdRecusados;
    }

    public void setItrqQtdRecusados(BigDecimal itrqQtdRecusados) {
        this.itrqQtdRecusados = itrqQtdRecusados;
    }

    public BigDecimal getItrqQtdVelhos() {
        return itrqQtdVelhos;
    }

    public void setItrqQtdVelhos(BigDecimal itrqQtdVelhos) {
        this.itrqQtdVelhos = itrqQtdVelhos;
    }

    public BigDecimal getItrqQtdQuebrasMaquina() {
        return itrqQtdQuebrasMaquina;
    }

    public void setItrqQtdQuebrasMaquina(BigDecimal itrqQtdQuebrasMaquina) {
        this.itrqQtdQuebrasMaquina = itrqQtdQuebrasMaquina;
    }

    public BigDecimal getItrqQtdQuebrasEstoque() {
        return itrqQtdQuebrasEstoque;
    }

    public void setItrqQtdQuebrasEstoque(BigDecimal itrqQtdQuebrasEstoque) {
        this.itrqQtdQuebrasEstoque = itrqQtdQuebrasEstoque;
    }

    public BigDecimal getItrqQtdQuebrasCarga() {
        return itrqQtdQuebrasCarga;
    }

    public void setItrqQtdQuebrasCarga(BigDecimal itrqQtdQuebrasCarga) {
        this.itrqQtdQuebrasCarga = itrqQtdQuebrasCarga;
    }

    public BigDecimal getItrqDescQuebra() {
        return itrqDescQuebra;
    }

    public void setItrqDescQuebra(BigDecimal itrqDescQuebra) {
        this.itrqDescQuebra = itrqDescQuebra;
    }

    public BigDecimal getItrqDescQuebras() {
        return itrqDescQuebras;
    }

    public void setItrqDescQuebras(BigDecimal itrqDescQuebras) {
        this.itrqDescQuebras = itrqDescQuebras;
    }

    @XmlTransient
    public List<SaldosEstoquesDiario> getSaldosEstoquesDiarioList() {
        return saldosEstoquesDiarioList;
    }

    public void setSaldosEstoquesDiarioList(List<SaldosEstoquesDiario> saldosEstoquesDiarioList) {
        this.saldosEstoquesDiarioList = saldosEstoquesDiarioList;
    }

    @XmlTransient
    public List<ItensRequisicoes> getItensRequisicoesList() {
        return itensRequisicoesList;
    }

    public void setItensRequisicoesList(List<ItensRequisicoes> itensRequisicoesList) {
        this.itensRequisicoesList = itensRequisicoesList;
    }

    public ItensRequisicoes getIteItrqId() {
        return iteItrqId;
    }

    public void setIteItrqId(ItensRequisicoes iteItrqId) {
        this.iteItrqId = iteItrqId;
    }

    public Lotes getLoteId() {
        return loteId;
    }

    public void setLoteId(Lotes loteId) {
        this.loteId = loteId;
    }

    public Produtos getProdId() {
        return prodId;
    }

    public void setProdId(Produtos prodId) {
        this.prodId = prodId;
    }

    public Requisicoes getRqscId() {
        return rqscId;
    }

    public void setRqscId(Requisicoes rqscId) {
        this.rqscId = rqscId;
    }

    public Tecnico getTcncId() {
        return tcncId;
    }

    public void setTcncId(Tecnico tcncId) {
        this.tcncId = tcncId;
    }

    public Tecnico getTecTcncId() {
        return tecTcncId;
    }

    public void setTecTcncId(Tecnico tecTcncId) {
        this.tecTcncId = tecTcncId;
    }

    public TiposEstoques getTestId() {
        return testId;
    }

    public void setTestId(TiposEstoques testId) {
        this.testId = testId;
    }

    public Usuarios getUsrsId() {
        return usrsId;
    }

    public void setUsrsId(Usuarios usrsId) {
        this.usrsId = usrsId;
    }

    @XmlTransient
    public List<SolicitacoesCompras> getSolicitacoesComprasList() {
        return solicitacoesComprasList;
    }

    public void setSolicitacoesComprasList(List<SolicitacoesCompras> solicitacoesComprasList) {
        this.solicitacoesComprasList = solicitacoesComprasList;
    }

    @XmlTransient
    public List<ItensPedidos> getItensPedidosList() {
        return itensPedidosList;
    }

    public void setItensPedidosList(List<ItensPedidos> itensPedidosList) {
        this.itensPedidosList = itensPedidosList;
    }

    @XmlTransient
    public List<BaseTroca> getBaseTrocaList() {
        return baseTrocaList;
    }

    public void setBaseTrocaList(List<BaseTroca> baseTrocaList) {
        this.baseTrocaList = baseTrocaList;
    }

    @XmlTransient
    public List<DivergenciasPedido> getDivergenciasPedidoList() {
        return divergenciasPedidoList;
    }

    public void setDivergenciasPedidoList(List<DivergenciasPedido> divergenciasPedidoList) {
        this.divergenciasPedidoList = divergenciasPedidoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itrqId != null ? itrqId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItensRequisicoes)) {
            return false;
        }
        ItensRequisicoes other = (ItensRequisicoes) object;
        if ((this.itrqId == null && other.itrqId != null) || (this.itrqId != null && !this.itrqId.equals(other.itrqId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.ItensRequisicoes[ itrqId=" + itrqId + " ]";
    }
    
}
