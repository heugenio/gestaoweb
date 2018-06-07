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
@Table(name = "ITENS_PEDIDOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ItensPedidos.findAll", query = "SELECT i FROM ItensPedidos i"),
    @NamedQuery(name = "ItensPedidos.findByItpdId", query = "SELECT i FROM ItensPedidos i WHERE i.itpdId = :itpdId"),
    @NamedQuery(name = "ItensPedidos.findByItpdQtde", query = "SELECT i FROM ItensPedidos i WHERE i.itpdQtde = :itpdQtde"),
    @NamedQuery(name = "ItensPedidos.findByItpdQtdeReservada", query = "SELECT i FROM ItensPedidos i WHERE i.itpdQtdeReservada = :itpdQtdeReservada"),
    @NamedQuery(name = "ItensPedidos.findByItpdQtdePrereservada", query = "SELECT i FROM ItensPedidos i WHERE i.itpdQtdePrereservada = :itpdQtdePrereservada"),
    @NamedQuery(name = "ItensPedidos.findByItpdQtdeAtendida", query = "SELECT i FROM ItensPedidos i WHERE i.itpdQtdeAtendida = :itpdQtdeAtendida"),
    @NamedQuery(name = "ItensPedidos.findByItpdQtdeAFaturar", query = "SELECT i FROM ItensPedidos i WHERE i.itpdQtdeAFaturar = :itpdQtdeAFaturar"),
    @NamedQuery(name = "ItensPedidos.findByItpdQtdeFaturada", query = "SELECT i FROM ItensPedidos i WHERE i.itpdQtdeFaturada = :itpdQtdeFaturada"),
    @NamedQuery(name = "ItensPedidos.findByItpdQtdeCancelada", query = "SELECT i FROM ItensPedidos i WHERE i.itpdQtdeCancelada = :itpdQtdeCancelada"),
    @NamedQuery(name = "ItensPedidos.findByItpdQtdeAEntregar", query = "SELECT i FROM ItensPedidos i WHERE i.itpdQtdeAEntregar = :itpdQtdeAEntregar"),
    @NamedQuery(name = "ItensPedidos.findByItpdQtdeEmTransito", query = "SELECT i FROM ItensPedidos i WHERE i.itpdQtdeEmTransito = :itpdQtdeEmTransito"),
    @NamedQuery(name = "ItensPedidos.findByItpdQtdeEntregue", query = "SELECT i FROM ItensPedidos i WHERE i.itpdQtdeEntregue = :itpdQtdeEntregue"),
    @NamedQuery(name = "ItensPedidos.findByItpdUnidSigla", query = "SELECT i FROM ItensPedidos i WHERE i.itpdUnidSigla = :itpdUnidSigla"),
    @NamedQuery(name = "ItensPedidos.findByItpdSbupMultiplicador", query = "SELECT i FROM ItensPedidos i WHERE i.itpdSbupMultiplicador = :itpdSbupMultiplicador"),
    @NamedQuery(name = "ItensPedidos.findByItpdDesconto", query = "SELECT i FROM ItensPedidos i WHERE i.itpdDesconto = :itpdDesconto"),
    @NamedQuery(name = "ItensPedidos.findByItpdPrecoUnitario", query = "SELECT i FROM ItensPedidos i WHERE i.itpdPrecoUnitario = :itpdPrecoUnitario"),
    @NamedQuery(name = "ItensPedidos.findByItpdVlrJuros", query = "SELECT i FROM ItensPedidos i WHERE i.itpdVlrJuros = :itpdVlrJuros"),
    @NamedQuery(name = "ItensPedidos.findByItpdPrecoUnitarioFinal", query = "SELECT i FROM ItensPedidos i WHERE i.itpdPrecoUnitarioFinal = :itpdPrecoUnitarioFinal"),
    @NamedQuery(name = "ItensPedidos.findByItpdVlrFrete", query = "SELECT i FROM ItensPedidos i WHERE i.itpdVlrFrete = :itpdVlrFrete"),
    @NamedQuery(name = "ItensPedidos.findByItpdVlrDespesas", query = "SELECT i FROM ItensPedidos i WHERE i.itpdVlrDespesas = :itpdVlrDespesas"),
    @NamedQuery(name = "ItensPedidos.findByItpdVlrSeguro", query = "SELECT i FROM ItensPedidos i WHERE i.itpdVlrSeguro = :itpdVlrSeguro"),
    @NamedQuery(name = "ItensPedidos.findByItpdVlrDescontoSobreTotal", query = "SELECT i FROM ItensPedidos i WHERE i.itpdVlrDescontoSobreTotal = :itpdVlrDescontoSobreTotal"),
    @NamedQuery(name = "ItensPedidos.findByItpdVlrFinal", query = "SELECT i FROM ItensPedidos i WHERE i.itpdVlrFinal = :itpdVlrFinal"),
    @NamedQuery(name = "ItensPedidos.findByItpdVlrTributos", query = "SELECT i FROM ItensPedidos i WHERE i.itpdVlrTributos = :itpdVlrTributos"),
    @NamedQuery(name = "ItensPedidos.findByItpdVlrContabil", query = "SELECT i FROM ItensPedidos i WHERE i.itpdVlrContabil = :itpdVlrContabil"),
    @NamedQuery(name = "ItensPedidos.findByItpdProdDescricao", query = "SELECT i FROM ItensPedidos i WHERE i.itpdProdDescricao = :itpdProdDescricao"),
    @NamedQuery(name = "ItensPedidos.findByItpdPrecoTabela", query = "SELECT i FROM ItensPedidos i WHERE i.itpdPrecoTabela = :itpdPrecoTabela"),
    @NamedQuery(name = "ItensPedidos.findByItpdMensagem", query = "SELECT i FROM ItensPedidos i WHERE i.itpdMensagem = :itpdMensagem"),
    @NamedQuery(name = "ItensPedidos.findByItpdOutrasDespAces", query = "SELECT i FROM ItensPedidos i WHERE i.itpdOutrasDespAces = :itpdOutrasDespAces"),
    @NamedQuery(name = "ItensPedidos.findByItpdItftId", query = "SELECT i FROM ItensPedidos i WHERE i.itpdItftId = :itpdItftId"),
    @NamedQuery(name = "ItensPedidos.findByItpdCustoNaOperacao", query = "SELECT i FROM ItensPedidos i WHERE i.itpdCustoNaOperacao = :itpdCustoNaOperacao"),
    @NamedQuery(name = "ItensPedidos.findByItpdValorATributar", query = "SELECT i FROM ItensPedidos i WHERE i.itpdValorATributar = :itpdValorATributar"),
    @NamedQuery(name = "ItensPedidos.findByItpdCst", query = "SELECT i FROM ItensPedidos i WHERE i.itpdCst = :itpdCst"),
    @NamedQuery(name = "ItensPedidos.findByItpdBaseIcms", query = "SELECT i FROM ItensPedidos i WHERE i.itpdBaseIcms = :itpdBaseIcms"),
    @NamedQuery(name = "ItensPedidos.findByItpdAliqIcms", query = "SELECT i FROM ItensPedidos i WHERE i.itpdAliqIcms = :itpdAliqIcms"),
    @NamedQuery(name = "ItensPedidos.findByItpdValorIcms", query = "SELECT i FROM ItensPedidos i WHERE i.itpdValorIcms = :itpdValorIcms"),
    @NamedQuery(name = "ItensPedidos.findByItpdIva", query = "SELECT i FROM ItensPedidos i WHERE i.itpdIva = :itpdIva"),
    @NamedQuery(name = "ItensPedidos.findByItpdBaseSubstituicao", query = "SELECT i FROM ItensPedidos i WHERE i.itpdBaseSubstituicao = :itpdBaseSubstituicao"),
    @NamedQuery(name = "ItensPedidos.findByItpdAliqIpi", query = "SELECT i FROM ItensPedidos i WHERE i.itpdAliqIpi = :itpdAliqIpi"),
    @NamedQuery(name = "ItensPedidos.findByItpdIcmsSubst", query = "SELECT i FROM ItensPedidos i WHERE i.itpdIcmsSubst = :itpdIcmsSubst"),
    @NamedQuery(name = "ItensPedidos.findByItpdValorIpi", query = "SELECT i FROM ItensPedidos i WHERE i.itpdValorIpi = :itpdValorIpi"),
    @NamedQuery(name = "ItensPedidos.findByItpdBaseIsenta", query = "SELECT i FROM ItensPedidos i WHERE i.itpdBaseIsenta = :itpdBaseIsenta"),
    @NamedQuery(name = "ItensPedidos.findByItpdBaseOutr", query = "SELECT i FROM ItensPedidos i WHERE i.itpdBaseOutr = :itpdBaseOutr"),
    @NamedQuery(name = "ItensPedidos.findByItpdBaseIss", query = "SELECT i FROM ItensPedidos i WHERE i.itpdBaseIss = :itpdBaseIss"),
    @NamedQuery(name = "ItensPedidos.findByItpdAliqIss", query = "SELECT i FROM ItensPedidos i WHERE i.itpdAliqIss = :itpdAliqIss"),
    @NamedQuery(name = "ItensPedidos.findByItpdValorIss", query = "SELECT i FROM ItensPedidos i WHERE i.itpdValorIss = :itpdValorIss"),
    @NamedQuery(name = "ItensPedidos.findByItpdQtdePrevista", query = "SELECT i FROM ItensPedidos i WHERE i.itpdQtdePrevista = :itpdQtdePrevista"),
    @NamedQuery(name = "ItensPedidos.findByItpdPesoBruto", query = "SELECT i FROM ItensPedidos i WHERE i.itpdPesoBruto = :itpdPesoBruto"),
    @NamedQuery(name = "ItensPedidos.findByItpdPesoLiquido", query = "SELECT i FROM ItensPedidos i WHERE i.itpdPesoLiquido = :itpdPesoLiquido"),
    @NamedQuery(name = "ItensPedidos.findByItpdCfo", query = "SELECT i FROM ItensPedidos i WHERE i.itpdCfo = :itpdCfo"),
    @NamedQuery(name = "ItensPedidos.findByItPdLASTUPDATE", query = "SELECT i FROM ItensPedidos i WHERE i.itPdLASTUPDATE = :itPdLASTUPDATE"),
    @NamedQuery(name = "ItensPedidos.findByItpdQtdeEmbalagem", query = "SELECT i FROM ItensPedidos i WHERE i.itpdQtdeEmbalagem = :itpdQtdeEmbalagem"),
    @NamedQuery(name = "ItensPedidos.findByItpdItem", query = "SELECT i FROM ItensPedidos i WHERE i.itpdItem = :itpdItem"),
    @NamedQuery(name = "ItensPedidos.findByItprItemGrupo", query = "SELECT i FROM ItensPedidos i WHERE i.itprItemGrupo = :itprItemGrupo"),
    @NamedQuery(name = "ItensPedidos.findByItpdItemGrupo", query = "SELECT i FROM ItensPedidos i WHERE i.itpdItemGrupo = :itpdItemGrupo")})
public class ItensPedidos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ITPD_ID")
    private String itpdId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "ITPD_QTDE")
    private BigDecimal itpdQtde;
    @Basic(optional = false)
    @Column(name = "ITPD_QTDE_RESERVADA")
    private BigDecimal itpdQtdeReservada;
    @Basic(optional = false)
    @Column(name = "ITPD_QTDE_PRERESERVADA")
    private BigDecimal itpdQtdePrereservada;
    @Basic(optional = false)
    @Column(name = "ITPD_QTDE_ATENDIDA")
    private BigDecimal itpdQtdeAtendida;
    @Basic(optional = false)
    @Column(name = "ITPD_QTDE_A_FATURAR")
    private BigDecimal itpdQtdeAFaturar;
    @Basic(optional = false)
    @Column(name = "ITPD_QTDE_FATURADA")
    private BigDecimal itpdQtdeFaturada;
    @Basic(optional = false)
    @Column(name = "ITPD_QTDE_CANCELADA")
    private BigDecimal itpdQtdeCancelada;
    @Basic(optional = false)
    @Column(name = "ITPD_QTDE_A_ENTREGAR")
    private BigDecimal itpdQtdeAEntregar;
    @Basic(optional = false)
    @Column(name = "ITPD_QTDE_EM_TRANSITO")
    private BigDecimal itpdQtdeEmTransito;
    @Basic(optional = false)
    @Column(name = "ITPD_QTDE_ENTREGUE")
    private BigDecimal itpdQtdeEntregue;
    @Basic(optional = false)
    @Column(name = "ITPD_UNID_SIGLA")
    private String itpdUnidSigla;
    @Basic(optional = false)
    @Column(name = "ITPD_SBUP_MULTIPLICADOR")
    private BigDecimal itpdSbupMultiplicador;
    @Basic(optional = false)
    @Column(name = "ITPD_DESCONTO")
    private BigDecimal itpdDesconto;
    @Basic(optional = false)
    @Column(name = "ITPD_PRECO_UNITARIO")
    private BigDecimal itpdPrecoUnitario;
    @Basic(optional = false)
    @Column(name = "ITPD_VLR_JUROS")
    private BigDecimal itpdVlrJuros;
    @Basic(optional = false)
    @Column(name = "ITPD_PRECO_UNITARIO_FINAL")
    private BigDecimal itpdPrecoUnitarioFinal;
    @Basic(optional = false)
    @Column(name = "ITPD_VLR_FRETE")
    private BigDecimal itpdVlrFrete;
    @Basic(optional = false)
    @Column(name = "ITPD_VLR_DESPESAS")
    private BigDecimal itpdVlrDespesas;
    @Basic(optional = false)
    @Column(name = "ITPD_VLR_SEGURO")
    private BigDecimal itpdVlrSeguro;
    @Basic(optional = false)
    @Column(name = "ITPD_VLR_DESCONTO_SOBRE_TOTAL")
    private BigDecimal itpdVlrDescontoSobreTotal;
    @Basic(optional = false)
    @Column(name = "ITPD_VLR_FINAL")
    private BigDecimal itpdVlrFinal;
    @Basic(optional = false)
    @Column(name = "ITPD_VLR_TRIBUTOS")
    private BigDecimal itpdVlrTributos;
    @Basic(optional = false)
    @Column(name = "ITPD_VLR_CONTABIL")
    private BigDecimal itpdVlrContabil;
    @Column(name = "ITPD_PROD_DESCRICAO")
    private String itpdProdDescricao;
    @Basic(optional = false)
    @Column(name = "ITPD_PRECO_TABELA")
    private BigDecimal itpdPrecoTabela;
    @Column(name = "ITPD_MENSAGEM")
    private String itpdMensagem;
    @Basic(optional = false)
    @Column(name = "ITPD_OUTRAS_DESP_ACES")
    private BigDecimal itpdOutrasDespAces;
    @Column(name = "ITPD_ITFT_ID")
    private String itpdItftId;
    @Basic(optional = false)
    @Column(name = "ITPD_CUSTO_NA_OPERACAO")
    private BigDecimal itpdCustoNaOperacao;
    @Basic(optional = false)
    @Column(name = "ITPD_VALOR_A_TRIBUTAR")
    private BigDecimal itpdValorATributar;
    @Column(name = "ITPD_CST")
    private String itpdCst;
    @Basic(optional = false)
    @Column(name = "ITPD_BASE_ICMS")
    private BigDecimal itpdBaseIcms;
    @Basic(optional = false)
    @Column(name = "ITPD_ALIQ_ICMS")
    private BigDecimal itpdAliqIcms;
    @Basic(optional = false)
    @Column(name = "ITPD_VALOR_ICMS")
    private BigDecimal itpdValorIcms;
    @Basic(optional = false)
    @Column(name = "ITPD_IVA")
    private BigDecimal itpdIva;
    @Basic(optional = false)
    @Column(name = "ITPD_BASE_SUBSTITUICAO")
    private BigDecimal itpdBaseSubstituicao;
    @Basic(optional = false)
    @Column(name = "ITPD_ALIQ_IPI")
    private BigDecimal itpdAliqIpi;
    @Basic(optional = false)
    @Column(name = "ITPD_ICMS_SUBST")
    private BigDecimal itpdIcmsSubst;
    @Basic(optional = false)
    @Column(name = "ITPD_VALOR_IPI")
    private BigDecimal itpdValorIpi;
    @Basic(optional = false)
    @Column(name = "ITPD_BASE_ISENTA")
    private BigDecimal itpdBaseIsenta;
    @Basic(optional = false)
    @Column(name = "ITPD_BASE_OUTR")
    private BigDecimal itpdBaseOutr;
    @Basic(optional = false)
    @Column(name = "ITPD_BASE_ISS")
    private BigDecimal itpdBaseIss;
    @Basic(optional = false)
    @Column(name = "ITPD_ALIQ_ISS")
    private BigDecimal itpdAliqIss;
    @Basic(optional = false)
    @Column(name = "ITPD_VALOR_ISS")
    private BigDecimal itpdValorIss;
    @Column(name = "ITPD_QTDE_PREVISTA")
    private BigDecimal itpdQtdePrevista;
    @Column(name = "ITPD_PESO_BRUTO")
    private BigDecimal itpdPesoBruto;
    @Column(name = "ITPD_PESO_LIQUIDO")
    private BigDecimal itpdPesoLiquido;
    @Column(name = "ITPD_CFO")
    private String itpdCfo;
    @Column(name = "ItPd_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date itPdLASTUPDATE;
    @Column(name = "ITPD_QTDE_EMBALAGEM")
    private BigDecimal itpdQtdeEmbalagem;
    @Column(name = "ITPD_ITEM")
    private String itpdItem;
    @Lob
    @Column(name = "ITPD_DESCRICAO_ESTENDIDA")
    private String itpdDescricaoEstendida;
    @Column(name = "ITPR_ITEM_GRUPO")
    private String itprItemGrupo;
    @Column(name = "ITPD_ITEM_GRUPO")
    private String itpdItemGrupo;
    @OneToMany(mappedBy = "itpdId")
    private List<ItensFaturados> itensFaturadosList;
    @OneToMany(mappedBy = "itpdId")
    private List<SolicitacoesCompras> solicitacoesComprasList;
    @JoinColumn(name = "APLC_ID", referencedColumnName = "APLC_ID")
    @ManyToOne
    private Aplicacoes aplcId;
    @JoinColumn(name = "CTIT_ID", referencedColumnName = "CTIT_ID")
    @ManyToOne
    private CotacoesItens ctitId;
    @OneToMany(mappedBy = "iteItpdId")
    private List<ItensPedidos> itensPedidosList;
    @JoinColumn(name = "ITE_ITPD_ID", referencedColumnName = "ITPD_ID")
    @ManyToOne
    private ItensPedidos iteItpdId;
    @JoinColumn(name = "ITRQ_ID", referencedColumnName = "ITRQ_ID")
    @ManyToOne
    private ItensRequisicoes itrqId;
    @JoinColumn(name = "PDDS_ID", referencedColumnName = "PDDS_ID")
    @ManyToOne
    private Pedidos pddsId;
    @JoinColumn(name = "PROD_ID", referencedColumnName = "PROD_ID")
    @ManyToOne
    private Produtos prodId;
    @JoinColumn(name = "PRAP_ID", referencedColumnName = "PRAP_ID")
    @ManyToOne
    private ProdutosAplicacoes prapId;
    @JoinColumn(name = "TEST_ID", referencedColumnName = "TEST_ID")
    @ManyToOne
    private TiposEstoques testId;
    @JoinColumn(name = "USRS_ID", referencedColumnName = "USRS_ID")
    @ManyToOne
    private Usuarios usrsId;
    @OneToMany(mappedBy = "itpdId")
    private List<ItensPedidosCancelados> itensPedidosCanceladosList;
    @OneToMany(mappedBy = "itpdId")
    private List<BaseTroca> baseTrocaList;
    @OneToMany(mappedBy = "itpdId")
    private List<ItensExpedidos> itensExpedidosList;
    @OneToMany(mappedBy = "iteItpdId")
    private List<PreReservasAtendidas> preReservasAtendidasList;
    @OneToMany(mappedBy = "itpdId")
    private List<PreReservasAtendidas> preReservasAtendidasList1;
    @OneToMany(mappedBy = "itpdId")
    private List<ItensEntregados> itensEntregadosList;
    @OneToMany(mappedBy = "itpdId")
    private List<OrdemProducao> ordemProducaoList;
    @OneToMany(mappedBy = "itpdId")
    private List<DivergenciasPedido> divergenciasPedidoList;

    public ItensPedidos() {
    }

    public ItensPedidos(String itpdId) {
        this.itpdId = itpdId;
    }

    public ItensPedidos(String itpdId, BigDecimal itpdQtde, BigDecimal itpdQtdeReservada, BigDecimal itpdQtdePrereservada, BigDecimal itpdQtdeAtendida, BigDecimal itpdQtdeAFaturar, BigDecimal itpdQtdeFaturada, BigDecimal itpdQtdeCancelada, BigDecimal itpdQtdeAEntregar, BigDecimal itpdQtdeEmTransito, BigDecimal itpdQtdeEntregue, String itpdUnidSigla, BigDecimal itpdSbupMultiplicador, BigDecimal itpdDesconto, BigDecimal itpdPrecoUnitario, BigDecimal itpdVlrJuros, BigDecimal itpdPrecoUnitarioFinal, BigDecimal itpdVlrFrete, BigDecimal itpdVlrDespesas, BigDecimal itpdVlrSeguro, BigDecimal itpdVlrDescontoSobreTotal, BigDecimal itpdVlrFinal, BigDecimal itpdVlrTributos, BigDecimal itpdVlrContabil, BigDecimal itpdPrecoTabela, BigDecimal itpdOutrasDespAces, BigDecimal itpdCustoNaOperacao, BigDecimal itpdValorATributar, BigDecimal itpdBaseIcms, BigDecimal itpdAliqIcms, BigDecimal itpdValorIcms, BigDecimal itpdIva, BigDecimal itpdBaseSubstituicao, BigDecimal itpdAliqIpi, BigDecimal itpdIcmsSubst, BigDecimal itpdValorIpi, BigDecimal itpdBaseIsenta, BigDecimal itpdBaseOutr, BigDecimal itpdBaseIss, BigDecimal itpdAliqIss, BigDecimal itpdValorIss) {
        this.itpdId = itpdId;
        this.itpdQtde = itpdQtde;
        this.itpdQtdeReservada = itpdQtdeReservada;
        this.itpdQtdePrereservada = itpdQtdePrereservada;
        this.itpdQtdeAtendida = itpdQtdeAtendida;
        this.itpdQtdeAFaturar = itpdQtdeAFaturar;
        this.itpdQtdeFaturada = itpdQtdeFaturada;
        this.itpdQtdeCancelada = itpdQtdeCancelada;
        this.itpdQtdeAEntregar = itpdQtdeAEntregar;
        this.itpdQtdeEmTransito = itpdQtdeEmTransito;
        this.itpdQtdeEntregue = itpdQtdeEntregue;
        this.itpdUnidSigla = itpdUnidSigla;
        this.itpdSbupMultiplicador = itpdSbupMultiplicador;
        this.itpdDesconto = itpdDesconto;
        this.itpdPrecoUnitario = itpdPrecoUnitario;
        this.itpdVlrJuros = itpdVlrJuros;
        this.itpdPrecoUnitarioFinal = itpdPrecoUnitarioFinal;
        this.itpdVlrFrete = itpdVlrFrete;
        this.itpdVlrDespesas = itpdVlrDespesas;
        this.itpdVlrSeguro = itpdVlrSeguro;
        this.itpdVlrDescontoSobreTotal = itpdVlrDescontoSobreTotal;
        this.itpdVlrFinal = itpdVlrFinal;
        this.itpdVlrTributos = itpdVlrTributos;
        this.itpdVlrContabil = itpdVlrContabil;
        this.itpdPrecoTabela = itpdPrecoTabela;
        this.itpdOutrasDespAces = itpdOutrasDespAces;
        this.itpdCustoNaOperacao = itpdCustoNaOperacao;
        this.itpdValorATributar = itpdValorATributar;
        this.itpdBaseIcms = itpdBaseIcms;
        this.itpdAliqIcms = itpdAliqIcms;
        this.itpdValorIcms = itpdValorIcms;
        this.itpdIva = itpdIva;
        this.itpdBaseSubstituicao = itpdBaseSubstituicao;
        this.itpdAliqIpi = itpdAliqIpi;
        this.itpdIcmsSubst = itpdIcmsSubst;
        this.itpdValorIpi = itpdValorIpi;
        this.itpdBaseIsenta = itpdBaseIsenta;
        this.itpdBaseOutr = itpdBaseOutr;
        this.itpdBaseIss = itpdBaseIss;
        this.itpdAliqIss = itpdAliqIss;
        this.itpdValorIss = itpdValorIss;
    }

    public String getItpdId() {
        return itpdId;
    }

    public void setItpdId(String itpdId) {
        this.itpdId = itpdId;
    }

    public BigDecimal getItpdQtde() {
        return itpdQtde;
    }

    public void setItpdQtde(BigDecimal itpdQtde) {
        this.itpdQtde = itpdQtde;
    }

    public BigDecimal getItpdQtdeReservada() {
        return itpdQtdeReservada;
    }

    public void setItpdQtdeReservada(BigDecimal itpdQtdeReservada) {
        this.itpdQtdeReservada = itpdQtdeReservada;
    }

    public BigDecimal getItpdQtdePrereservada() {
        return itpdQtdePrereservada;
    }

    public void setItpdQtdePrereservada(BigDecimal itpdQtdePrereservada) {
        this.itpdQtdePrereservada = itpdQtdePrereservada;
    }

    public BigDecimal getItpdQtdeAtendida() {
        return itpdQtdeAtendida;
    }

    public void setItpdQtdeAtendida(BigDecimal itpdQtdeAtendida) {
        this.itpdQtdeAtendida = itpdQtdeAtendida;
    }

    public BigDecimal getItpdQtdeAFaturar() {
        return itpdQtdeAFaturar;
    }

    public void setItpdQtdeAFaturar(BigDecimal itpdQtdeAFaturar) {
        this.itpdQtdeAFaturar = itpdQtdeAFaturar;
    }

    public BigDecimal getItpdQtdeFaturada() {
        return itpdQtdeFaturada;
    }

    public void setItpdQtdeFaturada(BigDecimal itpdQtdeFaturada) {
        this.itpdQtdeFaturada = itpdQtdeFaturada;
    }

    public BigDecimal getItpdQtdeCancelada() {
        return itpdQtdeCancelada;
    }

    public void setItpdQtdeCancelada(BigDecimal itpdQtdeCancelada) {
        this.itpdQtdeCancelada = itpdQtdeCancelada;
    }

    public BigDecimal getItpdQtdeAEntregar() {
        return itpdQtdeAEntregar;
    }

    public void setItpdQtdeAEntregar(BigDecimal itpdQtdeAEntregar) {
        this.itpdQtdeAEntregar = itpdQtdeAEntregar;
    }

    public BigDecimal getItpdQtdeEmTransito() {
        return itpdQtdeEmTransito;
    }

    public void setItpdQtdeEmTransito(BigDecimal itpdQtdeEmTransito) {
        this.itpdQtdeEmTransito = itpdQtdeEmTransito;
    }

    public BigDecimal getItpdQtdeEntregue() {
        return itpdQtdeEntregue;
    }

    public void setItpdQtdeEntregue(BigDecimal itpdQtdeEntregue) {
        this.itpdQtdeEntregue = itpdQtdeEntregue;
    }

    public String getItpdUnidSigla() {
        return itpdUnidSigla;
    }

    public void setItpdUnidSigla(String itpdUnidSigla) {
        this.itpdUnidSigla = itpdUnidSigla;
    }

    public BigDecimal getItpdSbupMultiplicador() {
        return itpdSbupMultiplicador;
    }

    public void setItpdSbupMultiplicador(BigDecimal itpdSbupMultiplicador) {
        this.itpdSbupMultiplicador = itpdSbupMultiplicador;
    }

    public BigDecimal getItpdDesconto() {
        return itpdDesconto;
    }

    public void setItpdDesconto(BigDecimal itpdDesconto) {
        this.itpdDesconto = itpdDesconto;
    }

    public BigDecimal getItpdPrecoUnitario() {
        return itpdPrecoUnitario;
    }

    public void setItpdPrecoUnitario(BigDecimal itpdPrecoUnitario) {
        this.itpdPrecoUnitario = itpdPrecoUnitario;
    }

    public BigDecimal getItpdVlrJuros() {
        return itpdVlrJuros;
    }

    public void setItpdVlrJuros(BigDecimal itpdVlrJuros) {
        this.itpdVlrJuros = itpdVlrJuros;
    }

    public BigDecimal getItpdPrecoUnitarioFinal() {
        return itpdPrecoUnitarioFinal;
    }

    public void setItpdPrecoUnitarioFinal(BigDecimal itpdPrecoUnitarioFinal) {
        this.itpdPrecoUnitarioFinal = itpdPrecoUnitarioFinal;
    }

    public BigDecimal getItpdVlrFrete() {
        return itpdVlrFrete;
    }

    public void setItpdVlrFrete(BigDecimal itpdVlrFrete) {
        this.itpdVlrFrete = itpdVlrFrete;
    }

    public BigDecimal getItpdVlrDespesas() {
        return itpdVlrDespesas;
    }

    public void setItpdVlrDespesas(BigDecimal itpdVlrDespesas) {
        this.itpdVlrDespesas = itpdVlrDespesas;
    }

    public BigDecimal getItpdVlrSeguro() {
        return itpdVlrSeguro;
    }

    public void setItpdVlrSeguro(BigDecimal itpdVlrSeguro) {
        this.itpdVlrSeguro = itpdVlrSeguro;
    }

    public BigDecimal getItpdVlrDescontoSobreTotal() {
        return itpdVlrDescontoSobreTotal;
    }

    public void setItpdVlrDescontoSobreTotal(BigDecimal itpdVlrDescontoSobreTotal) {
        this.itpdVlrDescontoSobreTotal = itpdVlrDescontoSobreTotal;
    }

    public BigDecimal getItpdVlrFinal() {
        return itpdVlrFinal;
    }

    public void setItpdVlrFinal(BigDecimal itpdVlrFinal) {
        this.itpdVlrFinal = itpdVlrFinal;
    }

    public BigDecimal getItpdVlrTributos() {
        return itpdVlrTributos;
    }

    public void setItpdVlrTributos(BigDecimal itpdVlrTributos) {
        this.itpdVlrTributos = itpdVlrTributos;
    }

    public BigDecimal getItpdVlrContabil() {
        return itpdVlrContabil;
    }

    public void setItpdVlrContabil(BigDecimal itpdVlrContabil) {
        this.itpdVlrContabil = itpdVlrContabil;
    }

    public String getItpdProdDescricao() {
        return itpdProdDescricao;
    }

    public void setItpdProdDescricao(String itpdProdDescricao) {
        this.itpdProdDescricao = itpdProdDescricao;
    }

    public BigDecimal getItpdPrecoTabela() {
        return itpdPrecoTabela;
    }

    public void setItpdPrecoTabela(BigDecimal itpdPrecoTabela) {
        this.itpdPrecoTabela = itpdPrecoTabela;
    }

    public String getItpdMensagem() {
        return itpdMensagem;
    }

    public void setItpdMensagem(String itpdMensagem) {
        this.itpdMensagem = itpdMensagem;
    }

    public BigDecimal getItpdOutrasDespAces() {
        return itpdOutrasDespAces;
    }

    public void setItpdOutrasDespAces(BigDecimal itpdOutrasDespAces) {
        this.itpdOutrasDespAces = itpdOutrasDespAces;
    }

    public String getItpdItftId() {
        return itpdItftId;
    }

    public void setItpdItftId(String itpdItftId) {
        this.itpdItftId = itpdItftId;
    }

    public BigDecimal getItpdCustoNaOperacao() {
        return itpdCustoNaOperacao;
    }

    public void setItpdCustoNaOperacao(BigDecimal itpdCustoNaOperacao) {
        this.itpdCustoNaOperacao = itpdCustoNaOperacao;
    }

    public BigDecimal getItpdValorATributar() {
        return itpdValorATributar;
    }

    public void setItpdValorATributar(BigDecimal itpdValorATributar) {
        this.itpdValorATributar = itpdValorATributar;
    }

    public String getItpdCst() {
        return itpdCst;
    }

    public void setItpdCst(String itpdCst) {
        this.itpdCst = itpdCst;
    }

    public BigDecimal getItpdBaseIcms() {
        return itpdBaseIcms;
    }

    public void setItpdBaseIcms(BigDecimal itpdBaseIcms) {
        this.itpdBaseIcms = itpdBaseIcms;
    }

    public BigDecimal getItpdAliqIcms() {
        return itpdAliqIcms;
    }

    public void setItpdAliqIcms(BigDecimal itpdAliqIcms) {
        this.itpdAliqIcms = itpdAliqIcms;
    }

    public BigDecimal getItpdValorIcms() {
        return itpdValorIcms;
    }

    public void setItpdValorIcms(BigDecimal itpdValorIcms) {
        this.itpdValorIcms = itpdValorIcms;
    }

    public BigDecimal getItpdIva() {
        return itpdIva;
    }

    public void setItpdIva(BigDecimal itpdIva) {
        this.itpdIva = itpdIva;
    }

    public BigDecimal getItpdBaseSubstituicao() {
        return itpdBaseSubstituicao;
    }

    public void setItpdBaseSubstituicao(BigDecimal itpdBaseSubstituicao) {
        this.itpdBaseSubstituicao = itpdBaseSubstituicao;
    }

    public BigDecimal getItpdAliqIpi() {
        return itpdAliqIpi;
    }

    public void setItpdAliqIpi(BigDecimal itpdAliqIpi) {
        this.itpdAliqIpi = itpdAliqIpi;
    }

    public BigDecimal getItpdIcmsSubst() {
        return itpdIcmsSubst;
    }

    public void setItpdIcmsSubst(BigDecimal itpdIcmsSubst) {
        this.itpdIcmsSubst = itpdIcmsSubst;
    }

    public BigDecimal getItpdValorIpi() {
        return itpdValorIpi;
    }

    public void setItpdValorIpi(BigDecimal itpdValorIpi) {
        this.itpdValorIpi = itpdValorIpi;
    }

    public BigDecimal getItpdBaseIsenta() {
        return itpdBaseIsenta;
    }

    public void setItpdBaseIsenta(BigDecimal itpdBaseIsenta) {
        this.itpdBaseIsenta = itpdBaseIsenta;
    }

    public BigDecimal getItpdBaseOutr() {
        return itpdBaseOutr;
    }

    public void setItpdBaseOutr(BigDecimal itpdBaseOutr) {
        this.itpdBaseOutr = itpdBaseOutr;
    }

    public BigDecimal getItpdBaseIss() {
        return itpdBaseIss;
    }

    public void setItpdBaseIss(BigDecimal itpdBaseIss) {
        this.itpdBaseIss = itpdBaseIss;
    }

    public BigDecimal getItpdAliqIss() {
        return itpdAliqIss;
    }

    public void setItpdAliqIss(BigDecimal itpdAliqIss) {
        this.itpdAliqIss = itpdAliqIss;
    }

    public BigDecimal getItpdValorIss() {
        return itpdValorIss;
    }

    public void setItpdValorIss(BigDecimal itpdValorIss) {
        this.itpdValorIss = itpdValorIss;
    }

    public BigDecimal getItpdQtdePrevista() {
        return itpdQtdePrevista;
    }

    public void setItpdQtdePrevista(BigDecimal itpdQtdePrevista) {
        this.itpdQtdePrevista = itpdQtdePrevista;
    }

    public BigDecimal getItpdPesoBruto() {
        return itpdPesoBruto;
    }

    public void setItpdPesoBruto(BigDecimal itpdPesoBruto) {
        this.itpdPesoBruto = itpdPesoBruto;
    }

    public BigDecimal getItpdPesoLiquido() {
        return itpdPesoLiquido;
    }

    public void setItpdPesoLiquido(BigDecimal itpdPesoLiquido) {
        this.itpdPesoLiquido = itpdPesoLiquido;
    }

    public String getItpdCfo() {
        return itpdCfo;
    }

    public void setItpdCfo(String itpdCfo) {
        this.itpdCfo = itpdCfo;
    }

    public Date getItPdLASTUPDATE() {
        return itPdLASTUPDATE;
    }

    public void setItPdLASTUPDATE(Date itPdLASTUPDATE) {
        this.itPdLASTUPDATE = itPdLASTUPDATE;
    }

    public BigDecimal getItpdQtdeEmbalagem() {
        return itpdQtdeEmbalagem;
    }

    public void setItpdQtdeEmbalagem(BigDecimal itpdQtdeEmbalagem) {
        this.itpdQtdeEmbalagem = itpdQtdeEmbalagem;
    }

    public String getItpdItem() {
        return itpdItem;
    }

    public void setItpdItem(String itpdItem) {
        this.itpdItem = itpdItem;
    }

    public String getItpdDescricaoEstendida() {
        return itpdDescricaoEstendida;
    }

    public void setItpdDescricaoEstendida(String itpdDescricaoEstendida) {
        this.itpdDescricaoEstendida = itpdDescricaoEstendida;
    }

    public String getItprItemGrupo() {
        return itprItemGrupo;
    }

    public void setItprItemGrupo(String itprItemGrupo) {
        this.itprItemGrupo = itprItemGrupo;
    }

    public String getItpdItemGrupo() {
        return itpdItemGrupo;
    }

    public void setItpdItemGrupo(String itpdItemGrupo) {
        this.itpdItemGrupo = itpdItemGrupo;
    }

    @XmlTransient
    public List<ItensFaturados> getItensFaturadosList() {
        return itensFaturadosList;
    }

    public void setItensFaturadosList(List<ItensFaturados> itensFaturadosList) {
        this.itensFaturadosList = itensFaturadosList;
    }

    @XmlTransient
    public List<SolicitacoesCompras> getSolicitacoesComprasList() {
        return solicitacoesComprasList;
    }

    public void setSolicitacoesComprasList(List<SolicitacoesCompras> solicitacoesComprasList) {
        this.solicitacoesComprasList = solicitacoesComprasList;
    }

    public Aplicacoes getAplcId() {
        return aplcId;
    }

    public void setAplcId(Aplicacoes aplcId) {
        this.aplcId = aplcId;
    }

    public CotacoesItens getCtitId() {
        return ctitId;
    }

    public void setCtitId(CotacoesItens ctitId) {
        this.ctitId = ctitId;
    }

    @XmlTransient
    public List<ItensPedidos> getItensPedidosList() {
        return itensPedidosList;
    }

    public void setItensPedidosList(List<ItensPedidos> itensPedidosList) {
        this.itensPedidosList = itensPedidosList;
    }

    public ItensPedidos getIteItpdId() {
        return iteItpdId;
    }

    public void setIteItpdId(ItensPedidos iteItpdId) {
        this.iteItpdId = iteItpdId;
    }

    public ItensRequisicoes getItrqId() {
        return itrqId;
    }

    public void setItrqId(ItensRequisicoes itrqId) {
        this.itrqId = itrqId;
    }

    public Pedidos getPddsId() {
        return pddsId;
    }

    public void setPddsId(Pedidos pddsId) {
        this.pddsId = pddsId;
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

    public Usuarios getUsrsId() {
        return usrsId;
    }

    public void setUsrsId(Usuarios usrsId) {
        this.usrsId = usrsId;
    }

    @XmlTransient
    public List<ItensPedidosCancelados> getItensPedidosCanceladosList() {
        return itensPedidosCanceladosList;
    }

    public void setItensPedidosCanceladosList(List<ItensPedidosCancelados> itensPedidosCanceladosList) {
        this.itensPedidosCanceladosList = itensPedidosCanceladosList;
    }

    @XmlTransient
    public List<BaseTroca> getBaseTrocaList() {
        return baseTrocaList;
    }

    public void setBaseTrocaList(List<BaseTroca> baseTrocaList) {
        this.baseTrocaList = baseTrocaList;
    }

    @XmlTransient
    public List<ItensExpedidos> getItensExpedidosList() {
        return itensExpedidosList;
    }

    public void setItensExpedidosList(List<ItensExpedidos> itensExpedidosList) {
        this.itensExpedidosList = itensExpedidosList;
    }

    @XmlTransient
    public List<PreReservasAtendidas> getPreReservasAtendidasList() {
        return preReservasAtendidasList;
    }

    public void setPreReservasAtendidasList(List<PreReservasAtendidas> preReservasAtendidasList) {
        this.preReservasAtendidasList = preReservasAtendidasList;
    }

    @XmlTransient
    public List<PreReservasAtendidas> getPreReservasAtendidasList1() {
        return preReservasAtendidasList1;
    }

    public void setPreReservasAtendidasList1(List<PreReservasAtendidas> preReservasAtendidasList1) {
        this.preReservasAtendidasList1 = preReservasAtendidasList1;
    }

    @XmlTransient
    public List<ItensEntregados> getItensEntregadosList() {
        return itensEntregadosList;
    }

    public void setItensEntregadosList(List<ItensEntregados> itensEntregadosList) {
        this.itensEntregadosList = itensEntregadosList;
    }

    @XmlTransient
    public List<OrdemProducao> getOrdemProducaoList() {
        return ordemProducaoList;
    }

    public void setOrdemProducaoList(List<OrdemProducao> ordemProducaoList) {
        this.ordemProducaoList = ordemProducaoList;
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
        hash += (itpdId != null ? itpdId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItensPedidos)) {
            return false;
        }
        ItensPedidos other = (ItensPedidos) object;
        if ((this.itpdId == null && other.itpdId != null) || (this.itpdId != null && !this.itpdId.equals(other.itpdId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.ItensPedidos[ itpdId=" + itpdId + " ]";
    }
    
}
