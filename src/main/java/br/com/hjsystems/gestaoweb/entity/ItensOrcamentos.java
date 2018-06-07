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
import javax.persistence.Lob;
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
@Table(name = "ITENS_ORCAMENTOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ItensOrcamentos.findAll", query = "SELECT i FROM ItensOrcamentos i"),
    @NamedQuery(name = "ItensOrcamentos.findByItorId", query = "SELECT i FROM ItensOrcamentos i WHERE i.itorId = :itorId"),
    @NamedQuery(name = "ItensOrcamentos.findByItorQtde", query = "SELECT i FROM ItensOrcamentos i WHERE i.itorQtde = :itorQtde"),
    @NamedQuery(name = "ItensOrcamentos.findByItorQtdeReservada", query = "SELECT i FROM ItensOrcamentos i WHERE i.itorQtdeReservada = :itorQtdeReservada"),
    @NamedQuery(name = "ItensOrcamentos.findByItorQtdePrereservada", query = "SELECT i FROM ItensOrcamentos i WHERE i.itorQtdePrereservada = :itorQtdePrereservada"),
    @NamedQuery(name = "ItensOrcamentos.findByItorQtdeAtendida", query = "SELECT i FROM ItensOrcamentos i WHERE i.itorQtdeAtendida = :itorQtdeAtendida"),
    @NamedQuery(name = "ItensOrcamentos.findByItorUnidSigla", query = "SELECT i FROM ItensOrcamentos i WHERE i.itorUnidSigla = :itorUnidSigla"),
    @NamedQuery(name = "ItensOrcamentos.findByItorSbupMultiplicador", query = "SELECT i FROM ItensOrcamentos i WHERE i.itorSbupMultiplicador = :itorSbupMultiplicador"),
    @NamedQuery(name = "ItensOrcamentos.findByItorDesconto", query = "SELECT i FROM ItensOrcamentos i WHERE i.itorDesconto = :itorDesconto"),
    @NamedQuery(name = "ItensOrcamentos.findByItorPrecoUnitario", query = "SELECT i FROM ItensOrcamentos i WHERE i.itorPrecoUnitario = :itorPrecoUnitario"),
    @NamedQuery(name = "ItensOrcamentos.findByItorVlrJuros", query = "SELECT i FROM ItensOrcamentos i WHERE i.itorVlrJuros = :itorVlrJuros"),
    @NamedQuery(name = "ItensOrcamentos.findByItorPrecoUnitarioFinal", query = "SELECT i FROM ItensOrcamentos i WHERE i.itorPrecoUnitarioFinal = :itorPrecoUnitarioFinal"),
    @NamedQuery(name = "ItensOrcamentos.findByItorVlrFrete", query = "SELECT i FROM ItensOrcamentos i WHERE i.itorVlrFrete = :itorVlrFrete"),
    @NamedQuery(name = "ItensOrcamentos.findByItorVlrDespesas", query = "SELECT i FROM ItensOrcamentos i WHERE i.itorVlrDespesas = :itorVlrDespesas"),
    @NamedQuery(name = "ItensOrcamentos.findByItorVlrSeguro", query = "SELECT i FROM ItensOrcamentos i WHERE i.itorVlrSeguro = :itorVlrSeguro"),
    @NamedQuery(name = "ItensOrcamentos.findByItorVlrDescontoSobreTotal", query = "SELECT i FROM ItensOrcamentos i WHERE i.itorVlrDescontoSobreTotal = :itorVlrDescontoSobreTotal"),
    @NamedQuery(name = "ItensOrcamentos.findByItorVlrFinal", query = "SELECT i FROM ItensOrcamentos i WHERE i.itorVlrFinal = :itorVlrFinal"),
    @NamedQuery(name = "ItensOrcamentos.findByItorVlrTributos", query = "SELECT i FROM ItensOrcamentos i WHERE i.itorVlrTributos = :itorVlrTributos"),
    @NamedQuery(name = "ItensOrcamentos.findByItorVlrContabil", query = "SELECT i FROM ItensOrcamentos i WHERE i.itorVlrContabil = :itorVlrContabil"),
    @NamedQuery(name = "ItensOrcamentos.findByItorProdDescricao", query = "SELECT i FROM ItensOrcamentos i WHERE i.itorProdDescricao = :itorProdDescricao"),
    @NamedQuery(name = "ItensOrcamentos.findByItorPrecoTabela", query = "SELECT i FROM ItensOrcamentos i WHERE i.itorPrecoTabela = :itorPrecoTabela"),
    @NamedQuery(name = "ItensOrcamentos.findByItorLastupdate", query = "SELECT i FROM ItensOrcamentos i WHERE i.itorLastupdate = :itorLastupdate"),
    @NamedQuery(name = "ItensOrcamentos.findByItorProdReferencia", query = "SELECT i FROM ItensOrcamentos i WHERE i.itorProdReferencia = :itorProdReferencia"),
    @NamedQuery(name = "ItensOrcamentos.findByItorProdCodigo", query = "SELECT i FROM ItensOrcamentos i WHERE i.itorProdCodigo = :itorProdCodigo"),
    @NamedQuery(name = "ItensOrcamentos.findByItorGanhouLicitacao", query = "SELECT i FROM ItensOrcamentos i WHERE i.itorGanhouLicitacao = :itorGanhouLicitacao"),
    @NamedQuery(name = "ItensOrcamentos.findByItorPercFrete", query = "SELECT i FROM ItensOrcamentos i WHERE i.itorPercFrete = :itorPercFrete"),
    @NamedQuery(name = "ItensOrcamentos.findByItorPercMargem", query = "SELECT i FROM ItensOrcamentos i WHERE i.itorPercMargem = :itorPercMargem"),
    @NamedQuery(name = "ItensOrcamentos.findByItorItem", query = "SELECT i FROM ItensOrcamentos i WHERE i.itorItem = :itorItem"),
    @NamedQuery(name = "ItensOrcamentos.findByItorItemGrupo", query = "SELECT i FROM ItensOrcamentos i WHERE i.itorItemGrupo = :itorItemGrupo")})
public class ItensOrcamentos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ITOR_ID")
    private String itorId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "ITOR_QTDE")
    private BigDecimal itorQtde;
    @Basic(optional = false)
    @Column(name = "ITOR_QTDE_RESERVADA")
    private BigDecimal itorQtdeReservada;
    @Basic(optional = false)
    @Column(name = "ITOR_QTDE_PRERESERVADA")
    private BigDecimal itorQtdePrereservada;
    @Basic(optional = false)
    @Column(name = "ITOR_QTDE_ATENDIDA")
    private BigDecimal itorQtdeAtendida;
    @Basic(optional = false)
    @Column(name = "ITOR_UNID_SIGLA")
    private String itorUnidSigla;
    @Basic(optional = false)
    @Column(name = "ITOR_SBUP_MULTIPLICADOR")
    private BigDecimal itorSbupMultiplicador;
    @Basic(optional = false)
    @Column(name = "ITOR_DESCONTO")
    private BigDecimal itorDesconto;
    @Basic(optional = false)
    @Column(name = "ITOR_PRECO_UNITARIO")
    private BigDecimal itorPrecoUnitario;
    @Basic(optional = false)
    @Column(name = "ITOR_VLR_JUROS")
    private BigDecimal itorVlrJuros;
    @Basic(optional = false)
    @Column(name = "ITOR_PRECO_UNITARIO_FINAL")
    private BigDecimal itorPrecoUnitarioFinal;
    @Basic(optional = false)
    @Column(name = "ITOR_VLR_FRETE")
    private BigDecimal itorVlrFrete;
    @Basic(optional = false)
    @Column(name = "ITOR_VLR_DESPESAS")
    private BigDecimal itorVlrDespesas;
    @Basic(optional = false)
    @Column(name = "ITOR_VLR_SEGURO")
    private BigDecimal itorVlrSeguro;
    @Basic(optional = false)
    @Column(name = "ITOR_VLR_DESCONTO_SOBRE_TOTAL")
    private BigDecimal itorVlrDescontoSobreTotal;
    @Basic(optional = false)
    @Column(name = "ITOR_VLR_FINAL")
    private BigDecimal itorVlrFinal;
    @Basic(optional = false)
    @Column(name = "ITOR_VLR_TRIBUTOS")
    private BigDecimal itorVlrTributos;
    @Basic(optional = false)
    @Column(name = "ITOR_VLR_CONTABIL")
    private BigDecimal itorVlrContabil;
    @Column(name = "ITOR_PROD_DESCRICAO")
    private String itorProdDescricao;
    @Basic(optional = false)
    @Column(name = "ITOR_PRECO_TABELA")
    private BigDecimal itorPrecoTabela;
    @Column(name = "ITOR_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date itorLastupdate;
    @Column(name = "ITOR_PROD_REFERENCIA")
    private String itorProdReferencia;
    @Column(name = "ITOR_PROD_CODIGO")
    private String itorProdCodigo;
    @Lob
    @Column(name = "ITOR_DESCRICAO_ESTENDIDA")
    private String itorDescricaoEstendida;
    @Column(name = "ITOR_GANHOU_LICITACAO")
    private String itorGanhouLicitacao;
    @Column(name = "ITOR_PERC_FRETE")
    private BigDecimal itorPercFrete;
    @Column(name = "ITOR_PERC_MARGEM")
    private BigDecimal itorPercMargem;
    @Column(name = "ITOR_ITEM")
    private String itorItem;
    @Column(name = "ITOR_ITEM_GRUPO")
    private String itorItemGrupo;
    @JoinColumn(name = "ORVD_ID", referencedColumnName = "ORVD_ID")
    @ManyToOne
    private OrcamentosVendas orvdId;
    @JoinColumn(name = "PROD_ID", referencedColumnName = "PROD_ID")
    @ManyToOne
    private Produtos prodId;
    @JoinColumn(name = "PRAP_ID", referencedColumnName = "PRAP_ID")
    @ManyToOne
    private ProdutosAplicacoes prapId;
    @JoinColumn(name = "TEST_ID", referencedColumnName = "TEST_ID")
    @ManyToOne
    private TiposEstoques testId;
    @OneToMany(mappedBy = "itorId")
    private List<PreReservasAtendidas> preReservasAtendidasList;

    public ItensOrcamentos() {
    }

    public ItensOrcamentos(String itorId) {
        this.itorId = itorId;
    }

    public ItensOrcamentos(String itorId, BigDecimal itorQtde, BigDecimal itorQtdeReservada, BigDecimal itorQtdePrereservada, BigDecimal itorQtdeAtendida, String itorUnidSigla, BigDecimal itorSbupMultiplicador, BigDecimal itorDesconto, BigDecimal itorPrecoUnitario, BigDecimal itorVlrJuros, BigDecimal itorPrecoUnitarioFinal, BigDecimal itorVlrFrete, BigDecimal itorVlrDespesas, BigDecimal itorVlrSeguro, BigDecimal itorVlrDescontoSobreTotal, BigDecimal itorVlrFinal, BigDecimal itorVlrTributos, BigDecimal itorVlrContabil, BigDecimal itorPrecoTabela) {
        this.itorId = itorId;
        this.itorQtde = itorQtde;
        this.itorQtdeReservada = itorQtdeReservada;
        this.itorQtdePrereservada = itorQtdePrereservada;
        this.itorQtdeAtendida = itorQtdeAtendida;
        this.itorUnidSigla = itorUnidSigla;
        this.itorSbupMultiplicador = itorSbupMultiplicador;
        this.itorDesconto = itorDesconto;
        this.itorPrecoUnitario = itorPrecoUnitario;
        this.itorVlrJuros = itorVlrJuros;
        this.itorPrecoUnitarioFinal = itorPrecoUnitarioFinal;
        this.itorVlrFrete = itorVlrFrete;
        this.itorVlrDespesas = itorVlrDespesas;
        this.itorVlrSeguro = itorVlrSeguro;
        this.itorVlrDescontoSobreTotal = itorVlrDescontoSobreTotal;
        this.itorVlrFinal = itorVlrFinal;
        this.itorVlrTributos = itorVlrTributos;
        this.itorVlrContabil = itorVlrContabil;
        this.itorPrecoTabela = itorPrecoTabela;
    }

    public String getItorId() {
        return itorId;
    }

    public void setItorId(String itorId) {
        this.itorId = itorId;
    }

    public BigDecimal getItorQtde() {
        return itorQtde;
    }

    public void setItorQtde(BigDecimal itorQtde) {
        this.itorQtde = itorQtde;
    }

    public BigDecimal getItorQtdeReservada() {
        return itorQtdeReservada;
    }

    public void setItorQtdeReservada(BigDecimal itorQtdeReservada) {
        this.itorQtdeReservada = itorQtdeReservada;
    }

    public BigDecimal getItorQtdePrereservada() {
        return itorQtdePrereservada;
    }

    public void setItorQtdePrereservada(BigDecimal itorQtdePrereservada) {
        this.itorQtdePrereservada = itorQtdePrereservada;
    }

    public BigDecimal getItorQtdeAtendida() {
        return itorQtdeAtendida;
    }

    public void setItorQtdeAtendida(BigDecimal itorQtdeAtendida) {
        this.itorQtdeAtendida = itorQtdeAtendida;
    }

    public String getItorUnidSigla() {
        return itorUnidSigla;
    }

    public void setItorUnidSigla(String itorUnidSigla) {
        this.itorUnidSigla = itorUnidSigla;
    }

    public BigDecimal getItorSbupMultiplicador() {
        return itorSbupMultiplicador;
    }

    public void setItorSbupMultiplicador(BigDecimal itorSbupMultiplicador) {
        this.itorSbupMultiplicador = itorSbupMultiplicador;
    }

    public BigDecimal getItorDesconto() {
        return itorDesconto;
    }

    public void setItorDesconto(BigDecimal itorDesconto) {
        this.itorDesconto = itorDesconto;
    }

    public BigDecimal getItorPrecoUnitario() {
        return itorPrecoUnitario;
    }

    public void setItorPrecoUnitario(BigDecimal itorPrecoUnitario) {
        this.itorPrecoUnitario = itorPrecoUnitario;
    }

    public BigDecimal getItorVlrJuros() {
        return itorVlrJuros;
    }

    public void setItorVlrJuros(BigDecimal itorVlrJuros) {
        this.itorVlrJuros = itorVlrJuros;
    }

    public BigDecimal getItorPrecoUnitarioFinal() {
        return itorPrecoUnitarioFinal;
    }

    public void setItorPrecoUnitarioFinal(BigDecimal itorPrecoUnitarioFinal) {
        this.itorPrecoUnitarioFinal = itorPrecoUnitarioFinal;
    }

    public BigDecimal getItorVlrFrete() {
        return itorVlrFrete;
    }

    public void setItorVlrFrete(BigDecimal itorVlrFrete) {
        this.itorVlrFrete = itorVlrFrete;
    }

    public BigDecimal getItorVlrDespesas() {
        return itorVlrDespesas;
    }

    public void setItorVlrDespesas(BigDecimal itorVlrDespesas) {
        this.itorVlrDespesas = itorVlrDespesas;
    }

    public BigDecimal getItorVlrSeguro() {
        return itorVlrSeguro;
    }

    public void setItorVlrSeguro(BigDecimal itorVlrSeguro) {
        this.itorVlrSeguro = itorVlrSeguro;
    }

    public BigDecimal getItorVlrDescontoSobreTotal() {
        return itorVlrDescontoSobreTotal;
    }

    public void setItorVlrDescontoSobreTotal(BigDecimal itorVlrDescontoSobreTotal) {
        this.itorVlrDescontoSobreTotal = itorVlrDescontoSobreTotal;
    }

    public BigDecimal getItorVlrFinal() {
        return itorVlrFinal;
    }

    public void setItorVlrFinal(BigDecimal itorVlrFinal) {
        this.itorVlrFinal = itorVlrFinal;
    }

    public BigDecimal getItorVlrTributos() {
        return itorVlrTributos;
    }

    public void setItorVlrTributos(BigDecimal itorVlrTributos) {
        this.itorVlrTributos = itorVlrTributos;
    }

    public BigDecimal getItorVlrContabil() {
        return itorVlrContabil;
    }

    public void setItorVlrContabil(BigDecimal itorVlrContabil) {
        this.itorVlrContabil = itorVlrContabil;
    }

    public String getItorProdDescricao() {
        return itorProdDescricao;
    }

    public void setItorProdDescricao(String itorProdDescricao) {
        this.itorProdDescricao = itorProdDescricao;
    }

    public BigDecimal getItorPrecoTabela() {
        return itorPrecoTabela;
    }

    public void setItorPrecoTabela(BigDecimal itorPrecoTabela) {
        this.itorPrecoTabela = itorPrecoTabela;
    }

    public Date getItorLastupdate() {
        return itorLastupdate;
    }

    public void setItorLastupdate(Date itorLastupdate) {
        this.itorLastupdate = itorLastupdate;
    }

    public String getItorProdReferencia() {
        return itorProdReferencia;
    }

    public void setItorProdReferencia(String itorProdReferencia) {
        this.itorProdReferencia = itorProdReferencia;
    }

    public String getItorProdCodigo() {
        return itorProdCodigo;
    }

    public void setItorProdCodigo(String itorProdCodigo) {
        this.itorProdCodigo = itorProdCodigo;
    }

    public String getItorDescricaoEstendida() {
        return itorDescricaoEstendida;
    }

    public void setItorDescricaoEstendida(String itorDescricaoEstendida) {
        this.itorDescricaoEstendida = itorDescricaoEstendida;
    }

    public String getItorGanhouLicitacao() {
        return itorGanhouLicitacao;
    }

    public void setItorGanhouLicitacao(String itorGanhouLicitacao) {
        this.itorGanhouLicitacao = itorGanhouLicitacao;
    }

    public BigDecimal getItorPercFrete() {
        return itorPercFrete;
    }

    public void setItorPercFrete(BigDecimal itorPercFrete) {
        this.itorPercFrete = itorPercFrete;
    }

    public BigDecimal getItorPercMargem() {
        return itorPercMargem;
    }

    public void setItorPercMargem(BigDecimal itorPercMargem) {
        this.itorPercMargem = itorPercMargem;
    }

    public String getItorItem() {
        return itorItem;
    }

    public void setItorItem(String itorItem) {
        this.itorItem = itorItem;
    }

    public String getItorItemGrupo() {
        return itorItemGrupo;
    }

    public void setItorItemGrupo(String itorItemGrupo) {
        this.itorItemGrupo = itorItemGrupo;
    }

    public OrcamentosVendas getOrvdId() {
        return orvdId;
    }

    public void setOrvdId(OrcamentosVendas orvdId) {
        this.orvdId = orvdId;
    }

    public Produtos getProdId() {
        return prodId;
    }

    public void setProdId(Produtos prodId) {
        this.prodId = prodId;
    }

    public ProdutosAplicacoes getPrapId() {
        return prapId;
    }

    public void setPrapId(ProdutosAplicacoes prapId) {
        this.prapId = prapId;
    }

    public TiposEstoques getTestId() {
        return testId;
    }

    public void setTestId(TiposEstoques testId) {
        this.testId = testId;
    }

    @XmlTransient
    public List<PreReservasAtendidas> getPreReservasAtendidasList() {
        return preReservasAtendidasList;
    }

    public void setPreReservasAtendidasList(List<PreReservasAtendidas> preReservasAtendidasList) {
        this.preReservasAtendidasList = preReservasAtendidasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itorId != null ? itorId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItensOrcamentos)) {
            return false;
        }
        ItensOrcamentos other = (ItensOrcamentos) object;
        if ((this.itorId == null && other.itorId != null) || (this.itorId != null && !this.itorId.equals(other.itorId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.ItensOrcamentos[ itorId=" + itorId + " ]";
    }
    
}
