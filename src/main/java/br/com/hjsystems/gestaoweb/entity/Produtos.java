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
@Table(name = "PRODUTOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Produtos.findAll", query = "SELECT p FROM Produtos p"),
    @NamedQuery(name = "Produtos.findByProdId", query = "SELECT p FROM Produtos p WHERE p.prodId = :prodId"),
    @NamedQuery(name = "Produtos.findByProdCodigo", query = "SELECT p FROM Produtos p WHERE p.prodCodigo = :prodCodigo"),
    @NamedQuery(name = "Produtos.findByProdNome", query = "SELECT p FROM Produtos p WHERE p.prodNome = :prodNome"),
    @NamedQuery(name = "Produtos.findByProdUsarDescComplementar", query = "SELECT p FROM Produtos p WHERE p.prodUsarDescComplementar = :prodUsarDescComplementar"),
    @NamedQuery(name = "Produtos.findByProdOrigem", query = "SELECT p FROM Produtos p WHERE p.prodOrigem = :prodOrigem"),
    @NamedQuery(name = "Produtos.findByProdNaturezaComercial", query = "SELECT p FROM Produtos p WHERE p.prodNaturezaComercial = :prodNaturezaComercial"),
    @NamedQuery(name = "Produtos.findByProdNaturezaEconomica", query = "SELECT p FROM Produtos p WHERE p.prodNaturezaEconomica = :prodNaturezaEconomica"),
    @NamedQuery(name = "Produtos.findByProdPeso", query = "SELECT p FROM Produtos p WHERE p.prodPeso = :prodPeso"),
    @NamedQuery(name = "Produtos.findByProdReferencia", query = "SELECT p FROM Produtos p WHERE p.prodReferencia = :prodReferencia"),
    @NamedQuery(name = "Produtos.findByProdReferenciaAuxiliar", query = "SELECT p FROM Produtos p WHERE p.prodReferenciaAuxiliar = :prodReferenciaAuxiliar"),
    @NamedQuery(name = "Produtos.findByProdSituacao", query = "SELECT p FROM Produtos p WHERE p.prodSituacao = :prodSituacao"),
    @NamedQuery(name = "Produtos.findByProdControleLote", query = "SELECT p FROM Produtos p WHERE p.prodControleLote = :prodControleLote"),
    @NamedQuery(name = "Produtos.findByProdMovimentaEstoque", query = "SELECT p FROM Produtos p WHERE p.prodMovimentaEstoque = :prodMovimentaEstoque"),
    @NamedQuery(name = "Produtos.findByProdAceitaSaldoNegativo", query = "SELECT p FROM Produtos p WHERE p.prodAceitaSaldoNegativo = :prodAceitaSaldoNegativo"),
    @NamedQuery(name = "Produtos.findByProdQtdeMinimaEstoque", query = "SELECT p FROM Produtos p WHERE p.prodQtdeMinimaEstoque = :prodQtdeMinimaEstoque"),
    @NamedQuery(name = "Produtos.findByProdPesoBruto", query = "SELECT p FROM Produtos p WHERE p.prodPesoBruto = :prodPesoBruto"),
    @NamedQuery(name = "Produtos.findByProdKit", query = "SELECT p FROM Produtos p WHERE p.prodKit = :prodKit"),
    @NamedQuery(name = "Produtos.findByMgvdId", query = "SELECT p FROM Produtos p WHERE p.mgvdId = :mgvdId"),
    @NamedQuery(name = "Produtos.findByProdLASTUPDATE", query = "SELECT p FROM Produtos p WHERE p.prodLASTUPDATE = :prodLASTUPDATE"),
    @NamedQuery(name = "Produtos.findByProdLocalEst", query = "SELECT p FROM Produtos p WHERE p.prodLocalEst = :prodLocalEst"),
    @NamedQuery(name = "Produtos.findByProdLocalEstAux", query = "SELECT p FROM Produtos p WHERE p.prodLocalEstAux = :prodLocalEstAux"),
    @NamedQuery(name = "Produtos.findByProdCodigoListaServico", query = "SELECT p FROM Produtos p WHERE p.prodCodigoListaServico = :prodCodigoListaServico"),
    @NamedQuery(name = "Produtos.findByProdControleSerie", query = "SELECT p FROM Produtos p WHERE p.prodControleSerie = :prodControleSerie"),
    @NamedQuery(name = "Produtos.findByProdVlrPauta", query = "SELECT p FROM Produtos p WHERE p.prodVlrPauta = :prodVlrPauta"),
    @NamedQuery(name = "Produtos.findByProdFmpcipi", query = "SELECT p FROM Produtos p WHERE p.prodFmpcipi = :prodFmpcipi"),
    @NamedQuery(name = "Produtos.findByProdFmpcfrete", query = "SELECT p FROM Produtos p WHERE p.prodFmpcfrete = :prodFmpcfrete"),
    @NamedQuery(name = "Produtos.findByProdFmpcicms", query = "SELECT p FROM Produtos p WHERE p.prodFmpcicms = :prodFmpcicms"),
    @NamedQuery(name = "Produtos.findByProdFmpc", query = "SELECT p FROM Produtos p WHERE p.prodFmpc = :prodFmpc"),
    @NamedQuery(name = "Produtos.findByProdFmpccredito", query = "SELECT p FROM Produtos p WHERE p.prodFmpccredito = :prodFmpccredito"),
    @NamedQuery(name = "Produtos.findByProdFmpcdespesas", query = "SELECT p FROM Produtos p WHERE p.prodFmpcdespesas = :prodFmpcdespesas"),
    @NamedQuery(name = "Produtos.findByProdFmpccomissao", query = "SELECT p FROM Produtos p WHERE p.prodFmpccomissao = :prodFmpccomissao"),
    @NamedQuery(name = "Produtos.findByProdFmpclucro", query = "SELECT p FROM Produtos p WHERE p.prodFmpclucro = :prodFmpclucro"),
    @NamedQuery(name = "Produtos.findByProdFmpcdebitoicms", query = "SELECT p FROM Produtos p WHERE p.prodFmpcdebitoicms = :prodFmpcdebitoicms"),
    @NamedQuery(name = "Produtos.findByProdFmpcsimples", query = "SELECT p FROM Produtos p WHERE p.prodFmpcsimples = :prodFmpcsimples"),
    @NamedQuery(name = "Produtos.findByProdCodigoListaPreco", query = "SELECT p FROM Produtos p WHERE p.prodCodigoListaPreco = :prodCodigoListaPreco"),
    @NamedQuery(name = "Produtos.findByProdVlrMaoObra", query = "SELECT p FROM Produtos p WHERE p.prodVlrMaoObra = :prodVlrMaoObra"),
    @NamedQuery(name = "Produtos.findByProdAliqFcp", query = "SELECT p FROM Produtos p WHERE p.prodAliqFcp = :prodAliqFcp"),
    @NamedQuery(name = "Produtos.findByProdOrigemExterno", query = "SELECT p FROM Produtos p WHERE p.prodOrigemExterno = :prodOrigemExterno"),
    @NamedQuery(name = "Produtos.findByTcncId", query = "SELECT p FROM Produtos p WHERE p.tcncId = :tcncId")})
public class Produtos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PROD_ID")
    private String prodId;
    @Basic(optional = false)
    @Column(name = "PROD_CODIGO")
    private String prodCodigo;
    @Basic(optional = false)
    @Column(name = "PROD_NOME")
    private String prodNome;
    @Basic(optional = false)
    @Column(name = "PROD_USAR_DESC_COMPLEMENTAR")
    private String prodUsarDescComplementar;
    @Basic(optional = false)
    @Column(name = "PROD_ORIGEM")
    private Character prodOrigem;
    @Basic(optional = false)
    @Column(name = "PROD_NATUREZA_COMERCIAL")
    private String prodNaturezaComercial;
    @Basic(optional = false)
    @Column(name = "PROD_NATUREZA_ECONOMICA")
    private String prodNaturezaEconomica;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "PROD_PESO")
    private BigDecimal prodPeso;
    @Column(name = "PROD_REFERENCIA")
    private String prodReferencia;
    @Column(name = "PROD_REFERENCIA_AUXILIAR")
    private String prodReferenciaAuxiliar;
    @Lob
    @Column(name = "PROD_CARACTERISTICAS")
    private String prodCaracteristicas;
    @Basic(optional = false)
    @Column(name = "PROD_SITUACAO")
    private String prodSituacao;
    @Basic(optional = false)
    @Column(name = "PROD_CONTROLE_LOTE")
    private String prodControleLote;
    @Basic(optional = false)
    @Column(name = "PROD_MOVIMENTA_ESTOQUE")
    private String prodMovimentaEstoque;
    @Basic(optional = false)
    @Column(name = "PROD_ACEITA_SALDO_NEGATIVO")
    private String prodAceitaSaldoNegativo;
    @Column(name = "PROD_QTDE_MINIMA_ESTOQUE")
    private String prodQtdeMinimaEstoque;
    @Column(name = "PROD_PESO_BRUTO")
    private BigDecimal prodPesoBruto;
    @Lob
    @Column(name = "PROD_DESCRICAO_ESTENDIDA")
    private String prodDescricaoEstendida;
    @Column(name = "PROD_KIT")
    private String prodKit;
    @Column(name = "MGVD_ID")
    private String mgvdId;
    @Column(name = "Prod_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date prodLASTUPDATE;
    @Column(name = "PROD_LOCAL_EST")
    private String prodLocalEst;
    @Column(name = "PROD_LOCAL_EST_AUX")
    private String prodLocalEstAux;
    @Column(name = "PROD_CODIGO_LISTA_SERVICO")
    private String prodCodigoListaServico;
    @Column(name = "PROD_CONTROLE_SERIE")
    private String prodControleSerie;
    @Basic(optional = false)
    @Column(name = "PROD_VLR_PAUTA")
    private BigDecimal prodVlrPauta;
    @Basic(optional = false)
    @Column(name = "PROD_FMPCIPI")
    private BigDecimal prodFmpcipi;
    @Basic(optional = false)
    @Column(name = "PROD_FMPCFRETE")
    private BigDecimal prodFmpcfrete;
    @Basic(optional = false)
    @Column(name = "PROD_FMPCICMS")
    private BigDecimal prodFmpcicms;
    @Basic(optional = false)
    @Column(name = "PROD_FMPC")
    private BigDecimal prodFmpc;
    @Basic(optional = false)
    @Column(name = "PROD_FMPCCREDITO")
    private BigDecimal prodFmpccredito;
    @Basic(optional = false)
    @Column(name = "PROD_FMPCDESPESAS")
    private BigDecimal prodFmpcdespesas;
    @Basic(optional = false)
    @Column(name = "PROD_FMPCCOMISSAO")
    private BigDecimal prodFmpccomissao;
    @Basic(optional = false)
    @Column(name = "PROD_FMPCLUCRO")
    private BigDecimal prodFmpclucro;
    @Basic(optional = false)
    @Column(name = "PROD_FMPCDEBITOICMS")
    private BigDecimal prodFmpcdebitoicms;
    @Basic(optional = false)
    @Column(name = "PROD_FMPCSIMPLES")
    private BigDecimal prodFmpcsimples;
    @Column(name = "PROD_CODIGO_LISTA_PRECO")
    private String prodCodigoListaPreco;
    @Column(name = "PROD_VLR_MAO_OBRA")
    private BigDecimal prodVlrMaoObra;
    @Column(name = "PROD_ALIQ_FCP")
    private BigDecimal prodAliqFcp;
    @Column(name = "PROD_ORIGEM_EXTERNO")
    private Character prodOrigemExterno;
    @Column(name = "TCNC_ID")
    private String tcncId;
    @OneToMany(mappedBy = "prodId")
    private List<BalancosProdutos> balancosProdutosList;
    @OneToMany(mappedBy = "prodId")
    private List<TiposEstoques> tiposEstoquesList;
    @OneToMany(mappedBy = "prodId")
    private List<ItensOrcamentos> itensOrcamentosList;
    @OneToMany(mappedBy = "prodId")
    private List<ItensSugestoescompras> itensSugestoescomprasList;
    @JoinColumn(name = "CLSS_ID", referencedColumnName = "CLSS_ID")
    @ManyToOne
    private Classes clssId;
    @JoinColumn(name = "EQVL_ID", referencedColumnName = "EQVL_ID")
    @ManyToOne
    private Equivalentes eqvlId;
    @JoinColumn(name = "GRPO_ID", referencedColumnName = "GRPO_ID")
    @ManyToOne
    private Grupos grpoId;
    @JoinColumn(name = "HPAD_ID", referencedColumnName = "HPAD_ID")
    @ManyToOne
    private HistoricosPadrao hpadId;
    @JoinColumn(name = "MARC_ID", referencedColumnName = "MARC_ID")
    @ManyToOne
    private Marcas marcId;
    @JoinColumn(name = "NCMS_ID", referencedColumnName = "NCMS_ID")
    @ManyToOne
    private Ncms ncmsId;
    @JoinColumn(name = "PLCT_ID", referencedColumnName = "PLCT_ID")
    @ManyToOne
    private PlanoContas plctId;
    @JoinColumn(name = "SBCL_ID", referencedColumnName = "SBCL_ID")
    @ManyToOne
    private Subclasses sbclId;
    @JoinColumn(name = "SBGR_ID", referencedColumnName = "SBGR_ID")
    @ManyToOne
    private Subgrupos sbgrId;
    @OneToMany(mappedBy = "prodId")
    private List<ItensLivrosFiscais> itensLivrosFiscaisList;
    @OneToMany(mappedBy = "prodId")
    private List<ItensRequisicoes> itensRequisicoesList;
    @OneToMany(mappedBy = "prodId")
    private List<ItensFaturados> itensFaturadosList;
    @OneToMany(mappedBy = "prodId")
    private List<ImagensProdutos> imagensProdutosList;
    @OneToMany(mappedBy = "prodId")
    private List<Inventarios> inventariosList;
    @OneToMany(mappedBy = "prodId")
    private List<SubUnidadesProduto> subUnidadesProdutoList;
    @OneToMany(mappedBy = "prodId")
    private List<SolicitacoesCompras> solicitacoesComprasList;
    @OneToMany(mappedBy = "prodId")
    private List<ItensPedidos> itensPedidosList;
    @OneToMany(mappedBy = "prodId")
    private List<ItensLocacao> itensLocacaoList;
    @OneToMany(mappedBy = "prodId")
    private List<ProdutosAplicacoes> produtosAplicacoesList;
    @OneToMany(mappedBy = "prodId")
    private List<ItensComissoesTecnicos> itensComissoesTecnicosList;
    @OneToMany(mappedBy = "prodId")
    private List<CotacoesItens> cotacoesItensList;
    @OneToMany(mappedBy = "proProdId")
    private List<Acompanhamentos> acompanhamentosList;
    @OneToMany(mappedBy = "prodId")
    private List<Acompanhamentos> acompanhamentosList1;
    @OneToMany(mappedBy = "prodId")
    private List<ProdutosGrades> produtosGradesList;
    @OneToMany(mappedBy = "prodId")
    private List<PrecosProdutos> precosProdutosList;
    @OneToMany(mappedBy = "prodId")
    private List<UnemProdutos> unemProdutosList;
    @OneToMany(mappedBy = "prodId")
    private List<ProdutosTipospagamentos> produtosTipospagamentosList;
    @OneToMany(mappedBy = "prodId")
    private List<Lotes> lotesList;
    @OneToMany(mappedBy = "proProdId")
    private List<Receita> receitaList;
    @OneToMany(mappedBy = "prodId")
    private List<Receita> receitaList1;
    @OneToMany(mappedBy = "prodId")
    private List<ItensEntregados> itensEntregadosList;
    @OneToMany(mappedBy = "prodId")
    private List<OrdemProducao> ordemProducaoList;

    public Produtos() {
    }

    public Produtos(String prodId) {
        this.prodId = prodId;
    }

    public Produtos(String prodId, String prodCodigo, String prodNome, String prodUsarDescComplementar, Character prodOrigem, String prodNaturezaComercial, String prodNaturezaEconomica, BigDecimal prodPeso, String prodSituacao, String prodControleLote, String prodMovimentaEstoque, String prodAceitaSaldoNegativo, BigDecimal prodVlrPauta, BigDecimal prodFmpcipi, BigDecimal prodFmpcfrete, BigDecimal prodFmpcicms, BigDecimal prodFmpc, BigDecimal prodFmpccredito, BigDecimal prodFmpcdespesas, BigDecimal prodFmpccomissao, BigDecimal prodFmpclucro, BigDecimal prodFmpcdebitoicms, BigDecimal prodFmpcsimples) {
        this.prodId = prodId;
        this.prodCodigo = prodCodigo;
        this.prodNome = prodNome;
        this.prodUsarDescComplementar = prodUsarDescComplementar;
        this.prodOrigem = prodOrigem;
        this.prodNaturezaComercial = prodNaturezaComercial;
        this.prodNaturezaEconomica = prodNaturezaEconomica;
        this.prodPeso = prodPeso;
        this.prodSituacao = prodSituacao;
        this.prodControleLote = prodControleLote;
        this.prodMovimentaEstoque = prodMovimentaEstoque;
        this.prodAceitaSaldoNegativo = prodAceitaSaldoNegativo;
        this.prodVlrPauta = prodVlrPauta;
        this.prodFmpcipi = prodFmpcipi;
        this.prodFmpcfrete = prodFmpcfrete;
        this.prodFmpcicms = prodFmpcicms;
        this.prodFmpc = prodFmpc;
        this.prodFmpccredito = prodFmpccredito;
        this.prodFmpcdespesas = prodFmpcdespesas;
        this.prodFmpccomissao = prodFmpccomissao;
        this.prodFmpclucro = prodFmpclucro;
        this.prodFmpcdebitoicms = prodFmpcdebitoicms;
        this.prodFmpcsimples = prodFmpcsimples;
    }

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public String getProdCodigo() {
        return prodCodigo;
    }

    public void setProdCodigo(String prodCodigo) {
        this.prodCodigo = prodCodigo;
    }

    public String getProdNome() {
        return prodNome;
    }

    public void setProdNome(String prodNome) {
        this.prodNome = prodNome;
    }

    public String getProdUsarDescComplementar() {
        return prodUsarDescComplementar;
    }

    public void setProdUsarDescComplementar(String prodUsarDescComplementar) {
        this.prodUsarDescComplementar = prodUsarDescComplementar;
    }

    public Character getProdOrigem() {
        return prodOrigem;
    }

    public void setProdOrigem(Character prodOrigem) {
        this.prodOrigem = prodOrigem;
    }

    public String getProdNaturezaComercial() {
        return prodNaturezaComercial;
    }

    public void setProdNaturezaComercial(String prodNaturezaComercial) {
        this.prodNaturezaComercial = prodNaturezaComercial;
    }

    public String getProdNaturezaEconomica() {
        return prodNaturezaEconomica;
    }

    public void setProdNaturezaEconomica(String prodNaturezaEconomica) {
        this.prodNaturezaEconomica = prodNaturezaEconomica;
    }

    public BigDecimal getProdPeso() {
        return prodPeso;
    }

    public void setProdPeso(BigDecimal prodPeso) {
        this.prodPeso = prodPeso;
    }

    public String getProdReferencia() {
        return prodReferencia;
    }

    public void setProdReferencia(String prodReferencia) {
        this.prodReferencia = prodReferencia;
    }

    public String getProdReferenciaAuxiliar() {
        return prodReferenciaAuxiliar;
    }

    public void setProdReferenciaAuxiliar(String prodReferenciaAuxiliar) {
        this.prodReferenciaAuxiliar = prodReferenciaAuxiliar;
    }

    public String getProdCaracteristicas() {
        return prodCaracteristicas;
    }

    public void setProdCaracteristicas(String prodCaracteristicas) {
        this.prodCaracteristicas = prodCaracteristicas;
    }

    public String getProdSituacao() {
        return prodSituacao;
    }

    public void setProdSituacao(String prodSituacao) {
        this.prodSituacao = prodSituacao;
    }

    public String getProdControleLote() {
        return prodControleLote;
    }

    public void setProdControleLote(String prodControleLote) {
        this.prodControleLote = prodControleLote;
    }

    public String getProdMovimentaEstoque() {
        return prodMovimentaEstoque;
    }

    public void setProdMovimentaEstoque(String prodMovimentaEstoque) {
        this.prodMovimentaEstoque = prodMovimentaEstoque;
    }

    public String getProdAceitaSaldoNegativo() {
        return prodAceitaSaldoNegativo;
    }

    public void setProdAceitaSaldoNegativo(String prodAceitaSaldoNegativo) {
        this.prodAceitaSaldoNegativo = prodAceitaSaldoNegativo;
    }

    public String getProdQtdeMinimaEstoque() {
        return prodQtdeMinimaEstoque;
    }

    public void setProdQtdeMinimaEstoque(String prodQtdeMinimaEstoque) {
        this.prodQtdeMinimaEstoque = prodQtdeMinimaEstoque;
    }

    public BigDecimal getProdPesoBruto() {
        return prodPesoBruto;
    }

    public void setProdPesoBruto(BigDecimal prodPesoBruto) {
        this.prodPesoBruto = prodPesoBruto;
    }

    public String getProdDescricaoEstendida() {
        return prodDescricaoEstendida;
    }

    public void setProdDescricaoEstendida(String prodDescricaoEstendida) {
        this.prodDescricaoEstendida = prodDescricaoEstendida;
    }

    public String getProdKit() {
        return prodKit;
    }

    public void setProdKit(String prodKit) {
        this.prodKit = prodKit;
    }

    public String getMgvdId() {
        return mgvdId;
    }

    public void setMgvdId(String mgvdId) {
        this.mgvdId = mgvdId;
    }

    public Date getProdLASTUPDATE() {
        return prodLASTUPDATE;
    }

    public void setProdLASTUPDATE(Date prodLASTUPDATE) {
        this.prodLASTUPDATE = prodLASTUPDATE;
    }

    public String getProdLocalEst() {
        return prodLocalEst;
    }

    public void setProdLocalEst(String prodLocalEst) {
        this.prodLocalEst = prodLocalEst;
    }

    public String getProdLocalEstAux() {
        return prodLocalEstAux;
    }

    public void setProdLocalEstAux(String prodLocalEstAux) {
        this.prodLocalEstAux = prodLocalEstAux;
    }

    public String getProdCodigoListaServico() {
        return prodCodigoListaServico;
    }

    public void setProdCodigoListaServico(String prodCodigoListaServico) {
        this.prodCodigoListaServico = prodCodigoListaServico;
    }

    public String getProdControleSerie() {
        return prodControleSerie;
    }

    public void setProdControleSerie(String prodControleSerie) {
        this.prodControleSerie = prodControleSerie;
    }

    public BigDecimal getProdVlrPauta() {
        return prodVlrPauta;
    }

    public void setProdVlrPauta(BigDecimal prodVlrPauta) {
        this.prodVlrPauta = prodVlrPauta;
    }

    public BigDecimal getProdFmpcipi() {
        return prodFmpcipi;
    }

    public void setProdFmpcipi(BigDecimal prodFmpcipi) {
        this.prodFmpcipi = prodFmpcipi;
    }

    public BigDecimal getProdFmpcfrete() {
        return prodFmpcfrete;
    }

    public void setProdFmpcfrete(BigDecimal prodFmpcfrete) {
        this.prodFmpcfrete = prodFmpcfrete;
    }

    public BigDecimal getProdFmpcicms() {
        return prodFmpcicms;
    }

    public void setProdFmpcicms(BigDecimal prodFmpcicms) {
        this.prodFmpcicms = prodFmpcicms;
    }

    public BigDecimal getProdFmpc() {
        return prodFmpc;
    }

    public void setProdFmpc(BigDecimal prodFmpc) {
        this.prodFmpc = prodFmpc;
    }

    public BigDecimal getProdFmpccredito() {
        return prodFmpccredito;
    }

    public void setProdFmpccredito(BigDecimal prodFmpccredito) {
        this.prodFmpccredito = prodFmpccredito;
    }

    public BigDecimal getProdFmpcdespesas() {
        return prodFmpcdespesas;
    }

    public void setProdFmpcdespesas(BigDecimal prodFmpcdespesas) {
        this.prodFmpcdespesas = prodFmpcdespesas;
    }

    public BigDecimal getProdFmpccomissao() {
        return prodFmpccomissao;
    }

    public void setProdFmpccomissao(BigDecimal prodFmpccomissao) {
        this.prodFmpccomissao = prodFmpccomissao;
    }

    public BigDecimal getProdFmpclucro() {
        return prodFmpclucro;
    }

    public void setProdFmpclucro(BigDecimal prodFmpclucro) {
        this.prodFmpclucro = prodFmpclucro;
    }

    public BigDecimal getProdFmpcdebitoicms() {
        return prodFmpcdebitoicms;
    }

    public void setProdFmpcdebitoicms(BigDecimal prodFmpcdebitoicms) {
        this.prodFmpcdebitoicms = prodFmpcdebitoicms;
    }

    public BigDecimal getProdFmpcsimples() {
        return prodFmpcsimples;
    }

    public void setProdFmpcsimples(BigDecimal prodFmpcsimples) {
        this.prodFmpcsimples = prodFmpcsimples;
    }

    public String getProdCodigoListaPreco() {
        return prodCodigoListaPreco;
    }

    public void setProdCodigoListaPreco(String prodCodigoListaPreco) {
        this.prodCodigoListaPreco = prodCodigoListaPreco;
    }

    public BigDecimal getProdVlrMaoObra() {
        return prodVlrMaoObra;
    }

    public void setProdVlrMaoObra(BigDecimal prodVlrMaoObra) {
        this.prodVlrMaoObra = prodVlrMaoObra;
    }

    public BigDecimal getProdAliqFcp() {
        return prodAliqFcp;
    }

    public void setProdAliqFcp(BigDecimal prodAliqFcp) {
        this.prodAliqFcp = prodAliqFcp;
    }

    public Character getProdOrigemExterno() {
        return prodOrigemExterno;
    }

    public void setProdOrigemExterno(Character prodOrigemExterno) {
        this.prodOrigemExterno = prodOrigemExterno;
    }

    public String getTcncId() {
        return tcncId;
    }

    public void setTcncId(String tcncId) {
        this.tcncId = tcncId;
    }

    @XmlTransient
    public List<BalancosProdutos> getBalancosProdutosList() {
        return balancosProdutosList;
    }

    public void setBalancosProdutosList(List<BalancosProdutos> balancosProdutosList) {
        this.balancosProdutosList = balancosProdutosList;
    }

    @XmlTransient
    public List<TiposEstoques> getTiposEstoquesList() {
        return tiposEstoquesList;
    }

    public void setTiposEstoquesList(List<TiposEstoques> tiposEstoquesList) {
        this.tiposEstoquesList = tiposEstoquesList;
    }

    @XmlTransient
    public List<ItensOrcamentos> getItensOrcamentosList() {
        return itensOrcamentosList;
    }

    public void setItensOrcamentosList(List<ItensOrcamentos> itensOrcamentosList) {
        this.itensOrcamentosList = itensOrcamentosList;
    }

    @XmlTransient
    public List<ItensSugestoescompras> getItensSugestoescomprasList() {
        return itensSugestoescomprasList;
    }

    public void setItensSugestoescomprasList(List<ItensSugestoescompras> itensSugestoescomprasList) {
        this.itensSugestoescomprasList = itensSugestoescomprasList;
    }

    public Classes getClssId() {
        return clssId;
    }

    public void setClssId(Classes clssId) {
        this.clssId = clssId;
    }

    public Equivalentes getEqvlId() {
        return eqvlId;
    }

    public void setEqvlId(Equivalentes eqvlId) {
        this.eqvlId = eqvlId;
    }

    public Grupos getGrpoId() {
        return grpoId;
    }

    public void setGrpoId(Grupos grpoId) {
        this.grpoId = grpoId;
    }

    public HistoricosPadrao getHpadId() {
        return hpadId;
    }

    public void setHpadId(HistoricosPadrao hpadId) {
        this.hpadId = hpadId;
    }

    public Marcas getMarcId() {
        return marcId;
    }

    public void setMarcId(Marcas marcId) {
        this.marcId = marcId;
    }

    public Ncms getNcmsId() {
        return ncmsId;
    }

    public void setNcmsId(Ncms ncmsId) {
        this.ncmsId = ncmsId;
    }

    public PlanoContas getPlctId() {
        return plctId;
    }

    public void setPlctId(PlanoContas plctId) {
        this.plctId = plctId;
    }

    public Subclasses getSbclId() {
        return sbclId;
    }

    public void setSbclId(Subclasses sbclId) {
        this.sbclId = sbclId;
    }

    public Subgrupos getSbgrId() {
        return sbgrId;
    }

    public void setSbgrId(Subgrupos sbgrId) {
        this.sbgrId = sbgrId;
    }

    @XmlTransient
    public List<ItensLivrosFiscais> getItensLivrosFiscaisList() {
        return itensLivrosFiscaisList;
    }

    public void setItensLivrosFiscaisList(List<ItensLivrosFiscais> itensLivrosFiscaisList) {
        this.itensLivrosFiscaisList = itensLivrosFiscaisList;
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
    public List<ImagensProdutos> getImagensProdutosList() {
        return imagensProdutosList;
    }

    public void setImagensProdutosList(List<ImagensProdutos> imagensProdutosList) {
        this.imagensProdutosList = imagensProdutosList;
    }

    @XmlTransient
    public List<Inventarios> getInventariosList() {
        return inventariosList;
    }

    public void setInventariosList(List<Inventarios> inventariosList) {
        this.inventariosList = inventariosList;
    }

    @XmlTransient
    public List<SubUnidadesProduto> getSubUnidadesProdutoList() {
        return subUnidadesProdutoList;
    }

    public void setSubUnidadesProdutoList(List<SubUnidadesProduto> subUnidadesProdutoList) {
        this.subUnidadesProdutoList = subUnidadesProdutoList;
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
    public List<ItensLocacao> getItensLocacaoList() {
        return itensLocacaoList;
    }

    public void setItensLocacaoList(List<ItensLocacao> itensLocacaoList) {
        this.itensLocacaoList = itensLocacaoList;
    }

    @XmlTransient
    public List<ProdutosAplicacoes> getProdutosAplicacoesList() {
        return produtosAplicacoesList;
    }

    public void setProdutosAplicacoesList(List<ProdutosAplicacoes> produtosAplicacoesList) {
        this.produtosAplicacoesList = produtosAplicacoesList;
    }

    @XmlTransient
    public List<ItensComissoesTecnicos> getItensComissoesTecnicosList() {
        return itensComissoesTecnicosList;
    }

    public void setItensComissoesTecnicosList(List<ItensComissoesTecnicos> itensComissoesTecnicosList) {
        this.itensComissoesTecnicosList = itensComissoesTecnicosList;
    }

    @XmlTransient
    public List<CotacoesItens> getCotacoesItensList() {
        return cotacoesItensList;
    }

    public void setCotacoesItensList(List<CotacoesItens> cotacoesItensList) {
        this.cotacoesItensList = cotacoesItensList;
    }

    @XmlTransient
    public List<Acompanhamentos> getAcompanhamentosList() {
        return acompanhamentosList;
    }

    public void setAcompanhamentosList(List<Acompanhamentos> acompanhamentosList) {
        this.acompanhamentosList = acompanhamentosList;
    }

    @XmlTransient
    public List<Acompanhamentos> getAcompanhamentosList1() {
        return acompanhamentosList1;
    }

    public void setAcompanhamentosList1(List<Acompanhamentos> acompanhamentosList1) {
        this.acompanhamentosList1 = acompanhamentosList1;
    }

    @XmlTransient
    public List<ProdutosGrades> getProdutosGradesList() {
        return produtosGradesList;
    }

    public void setProdutosGradesList(List<ProdutosGrades> produtosGradesList) {
        this.produtosGradesList = produtosGradesList;
    }

    @XmlTransient
    public List<PrecosProdutos> getPrecosProdutosList() {
        return precosProdutosList;
    }

    public void setPrecosProdutosList(List<PrecosProdutos> precosProdutosList) {
        this.precosProdutosList = precosProdutosList;
    }

    @XmlTransient
    public List<UnemProdutos> getUnemProdutosList() {
        return unemProdutosList;
    }

    public void setUnemProdutosList(List<UnemProdutos> unemProdutosList) {
        this.unemProdutosList = unemProdutosList;
    }

    @XmlTransient
    public List<ProdutosTipospagamentos> getProdutosTipospagamentosList() {
        return produtosTipospagamentosList;
    }

    public void setProdutosTipospagamentosList(List<ProdutosTipospagamentos> produtosTipospagamentosList) {
        this.produtosTipospagamentosList = produtosTipospagamentosList;
    }

    @XmlTransient
    public List<Lotes> getLotesList() {
        return lotesList;
    }

    public void setLotesList(List<Lotes> lotesList) {
        this.lotesList = lotesList;
    }

    @XmlTransient
    public List<Receita> getReceitaList() {
        return receitaList;
    }

    public void setReceitaList(List<Receita> receitaList) {
        this.receitaList = receitaList;
    }

    @XmlTransient
    public List<Receita> getReceitaList1() {
        return receitaList1;
    }

    public void setReceitaList1(List<Receita> receitaList1) {
        this.receitaList1 = receitaList1;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prodId != null ? prodId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produtos)) {
            return false;
        }
        Produtos other = (Produtos) object;
        if ((this.prodId == null && other.prodId != null) || (this.prodId != null && !this.prodId.equals(other.prodId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.Produtos[ prodId=" + prodId + " ]";
    }
    
}
