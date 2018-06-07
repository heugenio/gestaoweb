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
@Table(name = "TIPOS_ESTOQUES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TiposEstoques.findAll", query = "SELECT t FROM TiposEstoques t"),
    @NamedQuery(name = "TiposEstoques.findByTestId", query = "SELECT t FROM TiposEstoques t WHERE t.testId = :testId"),
    @NamedQuery(name = "TiposEstoques.findByGrdeId", query = "SELECT t FROM TiposEstoques t WHERE t.grdeId = :grdeId"),
    @NamedQuery(name = "TiposEstoques.findByTestReserva", query = "SELECT t FROM TiposEstoques t WHERE t.testReserva = :testReserva"),
    @NamedQuery(name = "TiposEstoques.findByTestCustoMedio", query = "SELECT t FROM TiposEstoques t WHERE t.testCustoMedio = :testCustoMedio"),
    @NamedQuery(name = "TiposEstoques.findByTestRequisicoes", query = "SELECT t FROM TiposEstoques t WHERE t.testRequisicoes = :testRequisicoes"),
    @NamedQuery(name = "TiposEstoques.findByTestDtUltCompra", query = "SELECT t FROM TiposEstoques t WHERE t.testDtUltCompra = :testDtUltCompra"),
    @NamedQuery(name = "TiposEstoques.findByTestUltPrecoCusto", query = "SELECT t FROM TiposEstoques t WHERE t.testUltPrecoCusto = :testUltPrecoCusto"),
    @NamedQuery(name = "TiposEstoques.findByTestUltPrecoCompra", query = "SELECT t FROM TiposEstoques t WHERE t.testUltPrecoCompra = :testUltPrecoCompra"),
    @NamedQuery(name = "TiposEstoques.findByTestUltQtdeCompra", query = "SELECT t FROM TiposEstoques t WHERE t.testUltQtdeCompra = :testUltQtdeCompra"),
    @NamedQuery(name = "TiposEstoques.findByTestUltNfEntrada", query = "SELECT t FROM TiposEstoques t WHERE t.testUltNfEntrada = :testUltNfEntrada"),
    @NamedQuery(name = "TiposEstoques.findByTestUltFornecedorId", query = "SELECT t FROM TiposEstoques t WHERE t.testUltFornecedorId = :testUltFornecedorId"),
    @NamedQuery(name = "TiposEstoques.findByTestLastupdate", query = "SELECT t FROM TiposEstoques t WHERE t.testLastupdate = :testLastupdate"),
    @NamedQuery(name = "TiposEstoques.findByTestEnarPadrao", query = "SELECT t FROM TiposEstoques t WHERE t.testEnarPadrao = :testEnarPadrao")})
public class TiposEstoques implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TEST_ID")
    private String testId;
    @Column(name = "GRDE_ID")
    private String grdeId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "TEST_RESERVA")
    private BigDecimal testReserva;
    @Basic(optional = false)
    @Column(name = "TEST_CUSTO_MEDIO")
    private BigDecimal testCustoMedio;
    @Basic(optional = false)
    @Column(name = "TEST_REQUISICOES")
    private BigDecimal testRequisicoes;
    @Column(name = "TEST_DT_ULT_COMPRA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date testDtUltCompra;
    @Basic(optional = false)
    @Column(name = "TEST_ULT_PRECO_CUSTO")
    private BigDecimal testUltPrecoCusto;
    @Basic(optional = false)
    @Column(name = "TEST_ULT_PRECO_COMPRA")
    private BigDecimal testUltPrecoCompra;
    @Basic(optional = false)
    @Column(name = "TEST_ULT_QTDE_COMPRA")
    private BigDecimal testUltQtdeCompra;
    @Column(name = "TEST_ULT_NF_ENTRADA")
    private String testUltNfEntrada;
    @Column(name = "TEST_ULT_FORNECEDOR_ID")
    private String testUltFornecedorId;
    @Column(name = "TEST_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date testLastupdate;
    @Column(name = "TEST_ENAR_PADRAO")
    private String testEnarPadrao;
    @JoinColumn(name = "ENAR_ID", referencedColumnName = "ENAR_ID")
    @ManyToOne
    private EnderecosArmazenamento enarId;
    @JoinColumn(name = "LOTE_ID", referencedColumnName = "LOTE_ID")
    @ManyToOne
    private Lotes loteId;
    @JoinColumn(name = "PROD_ID", referencedColumnName = "PROD_ID")
    @ManyToOne
    private Produtos prodId;
    @JoinColumn(name = "PDGD_ID", referencedColumnName = "PDGD_ID")
    @ManyToOne
    private ProdutosGrades pdgdId;
    @OneToMany(mappedBy = "testId")
    private List<ItensOrcamentos> itensOrcamentosList;
    @OneToMany(mappedBy = "testId")
    private List<SaldosEstoquesDiario> saldosEstoquesDiarioList;
    @OneToMany(mappedBy = "testId")
    private List<ItensRequisicoes> itensRequisicoesList;
    @OneToMany(mappedBy = "testId")
    private List<ItensFaturados> itensFaturadosList;
    @OneToMany(mappedBy = "testId")
    private List<Inventarios> inventariosList;
    @OneToMany(mappedBy = "testId")
    private List<SolicitacoesCompras> solicitacoesComprasList;
    @OneToMany(mappedBy = "testId")
    private List<RmaItens> rmaItensList;
    @OneToMany(mappedBy = "testId")
    private List<ItensPedidos> itensPedidosList;
    @OneToMany(mappedBy = "testId")
    private List<ProdutosSeries> produtosSeriesList;
    @OneToMany(mappedBy = "testId")
    private List<CotacoesItens> cotacoesItensList;
    @OneToMany(mappedBy = "testId")
    private List<SaldosEstoques> saldosEstoquesList;
    @OneToMany(mappedBy = "testId")
    private List<OrdemProducao> ordemProducaoList;
    @OneToMany(mappedBy = "testId")
    private List<ItensPreReservados> itensPreReservadosList;

    public TiposEstoques() {
    }

    public TiposEstoques(String testId) {
        this.testId = testId;
    }

    public TiposEstoques(String testId, BigDecimal testReserva, BigDecimal testCustoMedio, BigDecimal testRequisicoes, BigDecimal testUltPrecoCusto, BigDecimal testUltPrecoCompra, BigDecimal testUltQtdeCompra) {
        this.testId = testId;
        this.testReserva = testReserva;
        this.testCustoMedio = testCustoMedio;
        this.testRequisicoes = testRequisicoes;
        this.testUltPrecoCusto = testUltPrecoCusto;
        this.testUltPrecoCompra = testUltPrecoCompra;
        this.testUltQtdeCompra = testUltQtdeCompra;
    }

    public String getTestId() {
        return testId;
    }

    public void setTestId(String testId) {
        this.testId = testId;
    }

    public String getGrdeId() {
        return grdeId;
    }

    public void setGrdeId(String grdeId) {
        this.grdeId = grdeId;
    }

    public BigDecimal getTestReserva() {
        return testReserva;
    }

    public void setTestReserva(BigDecimal testReserva) {
        this.testReserva = testReserva;
    }

    public BigDecimal getTestCustoMedio() {
        return testCustoMedio;
    }

    public void setTestCustoMedio(BigDecimal testCustoMedio) {
        this.testCustoMedio = testCustoMedio;
    }

    public BigDecimal getTestRequisicoes() {
        return testRequisicoes;
    }

    public void setTestRequisicoes(BigDecimal testRequisicoes) {
        this.testRequisicoes = testRequisicoes;
    }

    public Date getTestDtUltCompra() {
        return testDtUltCompra;
    }

    public void setTestDtUltCompra(Date testDtUltCompra) {
        this.testDtUltCompra = testDtUltCompra;
    }

    public BigDecimal getTestUltPrecoCusto() {
        return testUltPrecoCusto;
    }

    public void setTestUltPrecoCusto(BigDecimal testUltPrecoCusto) {
        this.testUltPrecoCusto = testUltPrecoCusto;
    }

    public BigDecimal getTestUltPrecoCompra() {
        return testUltPrecoCompra;
    }

    public void setTestUltPrecoCompra(BigDecimal testUltPrecoCompra) {
        this.testUltPrecoCompra = testUltPrecoCompra;
    }

    public BigDecimal getTestUltQtdeCompra() {
        return testUltQtdeCompra;
    }

    public void setTestUltQtdeCompra(BigDecimal testUltQtdeCompra) {
        this.testUltQtdeCompra = testUltQtdeCompra;
    }

    public String getTestUltNfEntrada() {
        return testUltNfEntrada;
    }

    public void setTestUltNfEntrada(String testUltNfEntrada) {
        this.testUltNfEntrada = testUltNfEntrada;
    }

    public String getTestUltFornecedorId() {
        return testUltFornecedorId;
    }

    public void setTestUltFornecedorId(String testUltFornecedorId) {
        this.testUltFornecedorId = testUltFornecedorId;
    }

    public Date getTestLastupdate() {
        return testLastupdate;
    }

    public void setTestLastupdate(Date testLastupdate) {
        this.testLastupdate = testLastupdate;
    }

    public String getTestEnarPadrao() {
        return testEnarPadrao;
    }

    public void setTestEnarPadrao(String testEnarPadrao) {
        this.testEnarPadrao = testEnarPadrao;
    }

    public EnderecosArmazenamento getEnarId() {
        return enarId;
    }

    public void setEnarId(EnderecosArmazenamento enarId) {
        this.enarId = enarId;
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

    public ProdutosGrades getPdgdId() {
        return pdgdId;
    }

    public void setPdgdId(ProdutosGrades pdgdId) {
        this.pdgdId = pdgdId;
    }

    @XmlTransient
    public List<ItensOrcamentos> getItensOrcamentosList() {
        return itensOrcamentosList;
    }

    public void setItensOrcamentosList(List<ItensOrcamentos> itensOrcamentosList) {
        this.itensOrcamentosList = itensOrcamentosList;
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

    @XmlTransient
    public List<ItensFaturados> getItensFaturadosList() {
        return itensFaturadosList;
    }

    public void setItensFaturadosList(List<ItensFaturados> itensFaturadosList) {
        this.itensFaturadosList = itensFaturadosList;
    }

    @XmlTransient
    public List<Inventarios> getInventariosList() {
        return inventariosList;
    }

    public void setInventariosList(List<Inventarios> inventariosList) {
        this.inventariosList = inventariosList;
    }

    @XmlTransient
    public List<SolicitacoesCompras> getSolicitacoesComprasList() {
        return solicitacoesComprasList;
    }

    public void setSolicitacoesComprasList(List<SolicitacoesCompras> solicitacoesComprasList) {
        this.solicitacoesComprasList = solicitacoesComprasList;
    }

    @XmlTransient
    public List<RmaItens> getRmaItensList() {
        return rmaItensList;
    }

    public void setRmaItensList(List<RmaItens> rmaItensList) {
        this.rmaItensList = rmaItensList;
    }

    @XmlTransient
    public List<ItensPedidos> getItensPedidosList() {
        return itensPedidosList;
    }

    public void setItensPedidosList(List<ItensPedidos> itensPedidosList) {
        this.itensPedidosList = itensPedidosList;
    }

    @XmlTransient
    public List<ProdutosSeries> getProdutosSeriesList() {
        return produtosSeriesList;
    }

    public void setProdutosSeriesList(List<ProdutosSeries> produtosSeriesList) {
        this.produtosSeriesList = produtosSeriesList;
    }

    @XmlTransient
    public List<CotacoesItens> getCotacoesItensList() {
        return cotacoesItensList;
    }

    public void setCotacoesItensList(List<CotacoesItens> cotacoesItensList) {
        this.cotacoesItensList = cotacoesItensList;
    }

    @XmlTransient
    public List<SaldosEstoques> getSaldosEstoquesList() {
        return saldosEstoquesList;
    }

    public void setSaldosEstoquesList(List<SaldosEstoques> saldosEstoquesList) {
        this.saldosEstoquesList = saldosEstoquesList;
    }

    @XmlTransient
    public List<OrdemProducao> getOrdemProducaoList() {
        return ordemProducaoList;
    }

    public void setOrdemProducaoList(List<OrdemProducao> ordemProducaoList) {
        this.ordemProducaoList = ordemProducaoList;
    }

    @XmlTransient
    public List<ItensPreReservados> getItensPreReservadosList() {
        return itensPreReservadosList;
    }

    public void setItensPreReservadosList(List<ItensPreReservados> itensPreReservadosList) {
        this.itensPreReservadosList = itensPreReservadosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (testId != null ? testId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TiposEstoques)) {
            return false;
        }
        TiposEstoques other = (TiposEstoques) object;
        if ((this.testId == null && other.testId != null) || (this.testId != null && !this.testId.equals(other.testId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.TiposEstoques[ testId=" + testId + " ]";
    }
    
}
