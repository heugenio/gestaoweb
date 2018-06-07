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
@Table(name = "ITENS_LIVROS_FISCAIS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ItensLivrosFiscais.findAll", query = "SELECT i FROM ItensLivrosFiscais i"),
    @NamedQuery(name = "ItensLivrosFiscais.findByIlfsId", query = "SELECT i FROM ItensLivrosFiscais i WHERE i.ilfsId = :ilfsId"),
    @NamedQuery(name = "ItensLivrosFiscais.findByIlfsAliquotaIcms", query = "SELECT i FROM ItensLivrosFiscais i WHERE i.ilfsAliquotaIcms = :ilfsAliquotaIcms"),
    @NamedQuery(name = "ItensLivrosFiscais.findByIlfsAliquotaIpi", query = "SELECT i FROM ItensLivrosFiscais i WHERE i.ilfsAliquotaIpi = :ilfsAliquotaIpi"),
    @NamedQuery(name = "ItensLivrosFiscais.findByIlfsAliquotaIssqn", query = "SELECT i FROM ItensLivrosFiscais i WHERE i.ilfsAliquotaIssqn = :ilfsAliquotaIssqn"),
    @NamedQuery(name = "ItensLivrosFiscais.findByIlfsCodigoNatureza", query = "SELECT i FROM ItensLivrosFiscais i WHERE i.ilfsCodigoNatureza = :ilfsCodigoNatureza"),
    @NamedQuery(name = "ItensLivrosFiscais.findByIlfsTipoPagamento", query = "SELECT i FROM ItensLivrosFiscais i WHERE i.ilfsTipoPagamento = :ilfsTipoPagamento"),
    @NamedQuery(name = "ItensLivrosFiscais.findByIlfsTipoFrete", query = "SELECT i FROM ItensLivrosFiscais i WHERE i.ilfsTipoFrete = :ilfsTipoFrete"),
    @NamedQuery(name = "ItensLivrosFiscais.findByIlfsSequenciaItem", query = "SELECT i FROM ItensLivrosFiscais i WHERE i.ilfsSequenciaItem = :ilfsSequenciaItem"),
    @NamedQuery(name = "ItensLivrosFiscais.findByIlfsNumeroItem", query = "SELECT i FROM ItensLivrosFiscais i WHERE i.ilfsNumeroItem = :ilfsNumeroItem"),
    @NamedQuery(name = "ItensLivrosFiscais.findByIlfsQuantidadeItem", query = "SELECT i FROM ItensLivrosFiscais i WHERE i.ilfsQuantidadeItem = :ilfsQuantidadeItem"),
    @NamedQuery(name = "ItensLivrosFiscais.findByIlfsMovimentoRealSimbolico", query = "SELECT i FROM ItensLivrosFiscais i WHERE i.ilfsMovimentoRealSimbolico = :ilfsMovimentoRealSimbolico"),
    @NamedQuery(name = "ItensLivrosFiscais.findByIlfsAliquotaIcmsUfDestino", query = "SELECT i FROM ItensLivrosFiscais i WHERE i.ilfsAliquotaIcmsUfDestino = :ilfsAliquotaIcmsUfDestino"),
    @NamedQuery(name = "ItensLivrosFiscais.findByIlfsIpiCreditadoDebitado", query = "SELECT i FROM ItensLivrosFiscais i WHERE i.ilfsIpiCreditadoDebitado = :ilfsIpiCreditadoDebitado"),
    @NamedQuery(name = "ItensLivrosFiscais.findByIlfsUnidade", query = "SELECT i FROM ItensLivrosFiscais i WHERE i.ilfsUnidade = :ilfsUnidade"),
    @NamedQuery(name = "ItensLivrosFiscais.findByIlfsValComplementarIcms", query = "SELECT i FROM ItensLivrosFiscais i WHERE i.ilfsValComplementarIcms = :ilfsValComplementarIcms"),
    @NamedQuery(name = "ItensLivrosFiscais.findByIlfsValBaseCalculoIcms", query = "SELECT i FROM ItensLivrosFiscais i WHERE i.ilfsValBaseCalculoIcms = :ilfsValBaseCalculoIcms"),
    @NamedQuery(name = "ItensLivrosFiscais.findByIlfsValIcms", query = "SELECT i FROM ItensLivrosFiscais i WHERE i.ilfsValIcms = :ilfsValIcms"),
    @NamedQuery(name = "ItensLivrosFiscais.findByIlfsValIsentaNaoTributIcms", query = "SELECT i FROM ItensLivrosFiscais i WHERE i.ilfsValIsentaNaoTributIcms = :ilfsValIsentaNaoTributIcms"),
    @NamedQuery(name = "ItensLivrosFiscais.findByIlfsValOutraOperacaoIcms", query = "SELECT i FROM ItensLivrosFiscais i WHERE i.ilfsValOutraOperacaoIcms = :ilfsValOutraOperacaoIcms"),
    @NamedQuery(name = "ItensLivrosFiscais.findByIlfsValIcmsSubstituiTributa", query = "SELECT i FROM ItensLivrosFiscais i WHERE i.ilfsValIcmsSubstituiTributa = :ilfsValIcmsSubstituiTributa"),
    @NamedQuery(name = "ItensLivrosFiscais.findByIlfsValBaseCalculoIssqn", query = "SELECT i FROM ItensLivrosFiscais i WHERE i.ilfsValBaseCalculoIssqn = :ilfsValBaseCalculoIssqn"),
    @NamedQuery(name = "ItensLivrosFiscais.findByIlfsValIssqn", query = "SELECT i FROM ItensLivrosFiscais i WHERE i.ilfsValIssqn = :ilfsValIssqn"),
    @NamedQuery(name = "ItensLivrosFiscais.findByIlfsValBaseCalculoIpi", query = "SELECT i FROM ItensLivrosFiscais i WHERE i.ilfsValBaseCalculoIpi = :ilfsValBaseCalculoIpi"),
    @NamedQuery(name = "ItensLivrosFiscais.findByIlfsValIpi", query = "SELECT i FROM ItensLivrosFiscais i WHERE i.ilfsValIpi = :ilfsValIpi"),
    @NamedQuery(name = "ItensLivrosFiscais.findByIlfsValIsentaNaoTributaIpi", query = "SELECT i FROM ItensLivrosFiscais i WHERE i.ilfsValIsentaNaoTributaIpi = :ilfsValIsentaNaoTributaIpi"),
    @NamedQuery(name = "ItensLivrosFiscais.findByIlfsValOutraOperacaoIpi", query = "SELECT i FROM ItensLivrosFiscais i WHERE i.ilfsValOutraOperacaoIpi = :ilfsValOutraOperacaoIpi"),
    @NamedQuery(name = "ItensLivrosFiscais.findByIlfsValItem", query = "SELECT i FROM ItensLivrosFiscais i WHERE i.ilfsValItem = :ilfsValItem"),
    @NamedQuery(name = "ItensLivrosFiscais.findByIlfsValContabil", query = "SELECT i FROM ItensLivrosFiscais i WHERE i.ilfsValContabil = :ilfsValContabil"),
    @NamedQuery(name = "ItensLivrosFiscais.findByIlfsValTotalDocumento", query = "SELECT i FROM ItensLivrosFiscais i WHERE i.ilfsValTotalDocumento = :ilfsValTotalDocumento"),
    @NamedQuery(name = "ItensLivrosFiscais.findByIlfsValTotalDesconto", query = "SELECT i FROM ItensLivrosFiscais i WHERE i.ilfsValTotalDesconto = :ilfsValTotalDesconto"),
    @NamedQuery(name = "ItensLivrosFiscais.findByIlfsValMercadoria", query = "SELECT i FROM ItensLivrosFiscais i WHERE i.ilfsValMercadoria = :ilfsValMercadoria"),
    @NamedQuery(name = "ItensLivrosFiscais.findByIlfsValDespesasAcessorios", query = "SELECT i FROM ItensLivrosFiscais i WHERE i.ilfsValDespesasAcessorios = :ilfsValDespesasAcessorios"),
    @NamedQuery(name = "ItensLivrosFiscais.findByIlfsValDesconto", query = "SELECT i FROM ItensLivrosFiscais i WHERE i.ilfsValDesconto = :ilfsValDesconto"),
    @NamedQuery(name = "ItensLivrosFiscais.findByIlfsValUnitarioVenda", query = "SELECT i FROM ItensLivrosFiscais i WHERE i.ilfsValUnitarioVenda = :ilfsValUnitarioVenda"),
    @NamedQuery(name = "ItensLivrosFiscais.findByIlfsValBaseCalcSubstituicao", query = "SELECT i FROM ItensLivrosFiscais i WHERE i.ilfsValBaseCalcSubstituicao = :ilfsValBaseCalcSubstituicao"),
    @NamedQuery(name = "ItensLivrosFiscais.findByIlfsLastupdate", query = "SELECT i FROM ItensLivrosFiscais i WHERE i.ilfsLastupdate = :ilfsLastupdate")})
public class ItensLivrosFiscais implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ILFS_ID")
    private String ilfsId;
    @Column(name = "ILFS_ALIQUOTA_ICMS")
    private String ilfsAliquotaIcms;
    @Column(name = "ILFS_ALIQUOTA_IPI")
    private String ilfsAliquotaIpi;
    @Column(name = "ILFS_ALIQUOTA_ISSQN")
    private String ilfsAliquotaIssqn;
    @Column(name = "ILFS_CODIGO_NATUREZA")
    private String ilfsCodigoNatureza;
    @Column(name = "ILFS_TIPO_PAGAMENTO")
    private Character ilfsTipoPagamento;
    @Column(name = "ILFS_TIPO_FRETE")
    private Character ilfsTipoFrete;
    @Column(name = "ILFS_SEQUENCIA_ITEM")
    private String ilfsSequenciaItem;
    @Column(name = "ILFS_NUMERO_ITEM")
    private String ilfsNumeroItem;
    @Column(name = "ILFS_QUANTIDADE_ITEM")
    private String ilfsQuantidadeItem;
    @Column(name = "ILFS_MOVIMENTO_REAL_SIMBOLICO")
    private Character ilfsMovimentoRealSimbolico;
    @Column(name = "ILFS_ALIQUOTA_ICMS_UF_DESTINO")
    private String ilfsAliquotaIcmsUfDestino;
    @Column(name = "ILFS_IPI_CREDITADO_DEBITADO")
    private String ilfsIpiCreditadoDebitado;
    @Column(name = "ILFS_UNIDADE")
    private String ilfsUnidade;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "ILFS_VAL_COMPLEMENTAR_ICMS")
    private BigDecimal ilfsValComplementarIcms;
    @Basic(optional = false)
    @Column(name = "ILFS_VAL_BASE_CALCULO_ICMS")
    private BigDecimal ilfsValBaseCalculoIcms;
    @Basic(optional = false)
    @Column(name = "ILFS_VAL_ICMS")
    private BigDecimal ilfsValIcms;
    @Basic(optional = false)
    @Column(name = "ILFS_VAL_ISENTA_NAO_TRIBUT_ICMS")
    private BigDecimal ilfsValIsentaNaoTributIcms;
    @Basic(optional = false)
    @Column(name = "ILFS_VAL_OUTRA_OPERACAO_ICMS")
    private BigDecimal ilfsValOutraOperacaoIcms;
    @Basic(optional = false)
    @Column(name = "ILFS_VAL_ICMS_SUBSTITUI_TRIBUTA")
    private BigDecimal ilfsValIcmsSubstituiTributa;
    @Basic(optional = false)
    @Column(name = "ILFS_VAL_BASE_CALCULO_ISSQN")
    private BigDecimal ilfsValBaseCalculoIssqn;
    @Basic(optional = false)
    @Column(name = "ILFS_VAL_ISSQN")
    private BigDecimal ilfsValIssqn;
    @Basic(optional = false)
    @Column(name = "ILFS_VAL_BASE_CALCULO_IPI")
    private BigDecimal ilfsValBaseCalculoIpi;
    @Basic(optional = false)
    @Column(name = "ILFS_VAL_IPI")
    private BigDecimal ilfsValIpi;
    @Basic(optional = false)
    @Column(name = "ILFS_VAL_ISENTA_NAO_TRIBUTA_IPI")
    private BigDecimal ilfsValIsentaNaoTributaIpi;
    @Basic(optional = false)
    @Column(name = "ILFS_VAL_OUTRA_OPERACAO_IPI")
    private BigDecimal ilfsValOutraOperacaoIpi;
    @Basic(optional = false)
    @Column(name = "ILFS_VAL_ITEM")
    private BigDecimal ilfsValItem;
    @Basic(optional = false)
    @Column(name = "ILFS_VAL_CONTABIL")
    private BigDecimal ilfsValContabil;
    @Basic(optional = false)
    @Column(name = "ILFS_VAL_TOTAL_DOCUMENTO")
    private BigDecimal ilfsValTotalDocumento;
    @Basic(optional = false)
    @Column(name = "ILFS_VAL_TOTAL_DESCONTO")
    private BigDecimal ilfsValTotalDesconto;
    @Basic(optional = false)
    @Column(name = "ILFS_VAL_MERCADORIA")
    private BigDecimal ilfsValMercadoria;
    @Basic(optional = false)
    @Column(name = "ILFS_VAL_DESPESAS_ACESSORIOS")
    private BigDecimal ilfsValDespesasAcessorios;
    @Basic(optional = false)
    @Column(name = "ILFS_VAL_DESCONTO")
    private BigDecimal ilfsValDesconto;
    @Basic(optional = false)
    @Column(name = "ILFS_VAL_UNITARIO_VENDA")
    private BigDecimal ilfsValUnitarioVenda;
    @Basic(optional = false)
    @Column(name = "ILFS_VAL_BASE_CALC_SUBSTITUICAO")
    private BigDecimal ilfsValBaseCalcSubstituicao;
    @Column(name = "ILFS_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ilfsLastupdate;
    @JoinColumn(name = "CFOP_ID", referencedColumnName = "CFOP_ID")
    @ManyToOne
    private Cfop cfopId;
    @JoinColumn(name = "LVFS_ID", referencedColumnName = "LVFS_ID")
    @ManyToOne
    private LivrosFiscais lvfsId;
    @JoinColumn(name = "PROD_ID", referencedColumnName = "PROD_ID")
    @ManyToOne
    private Produtos prodId;

    public ItensLivrosFiscais() {
    }

    public ItensLivrosFiscais(String ilfsId) {
        this.ilfsId = ilfsId;
    }

    public ItensLivrosFiscais(String ilfsId, BigDecimal ilfsValComplementarIcms, BigDecimal ilfsValBaseCalculoIcms, BigDecimal ilfsValIcms, BigDecimal ilfsValIsentaNaoTributIcms, BigDecimal ilfsValOutraOperacaoIcms, BigDecimal ilfsValIcmsSubstituiTributa, BigDecimal ilfsValBaseCalculoIssqn, BigDecimal ilfsValIssqn, BigDecimal ilfsValBaseCalculoIpi, BigDecimal ilfsValIpi, BigDecimal ilfsValIsentaNaoTributaIpi, BigDecimal ilfsValOutraOperacaoIpi, BigDecimal ilfsValItem, BigDecimal ilfsValContabil, BigDecimal ilfsValTotalDocumento, BigDecimal ilfsValTotalDesconto, BigDecimal ilfsValMercadoria, BigDecimal ilfsValDespesasAcessorios, BigDecimal ilfsValDesconto, BigDecimal ilfsValUnitarioVenda, BigDecimal ilfsValBaseCalcSubstituicao) {
        this.ilfsId = ilfsId;
        this.ilfsValComplementarIcms = ilfsValComplementarIcms;
        this.ilfsValBaseCalculoIcms = ilfsValBaseCalculoIcms;
        this.ilfsValIcms = ilfsValIcms;
        this.ilfsValIsentaNaoTributIcms = ilfsValIsentaNaoTributIcms;
        this.ilfsValOutraOperacaoIcms = ilfsValOutraOperacaoIcms;
        this.ilfsValIcmsSubstituiTributa = ilfsValIcmsSubstituiTributa;
        this.ilfsValBaseCalculoIssqn = ilfsValBaseCalculoIssqn;
        this.ilfsValIssqn = ilfsValIssqn;
        this.ilfsValBaseCalculoIpi = ilfsValBaseCalculoIpi;
        this.ilfsValIpi = ilfsValIpi;
        this.ilfsValIsentaNaoTributaIpi = ilfsValIsentaNaoTributaIpi;
        this.ilfsValOutraOperacaoIpi = ilfsValOutraOperacaoIpi;
        this.ilfsValItem = ilfsValItem;
        this.ilfsValContabil = ilfsValContabil;
        this.ilfsValTotalDocumento = ilfsValTotalDocumento;
        this.ilfsValTotalDesconto = ilfsValTotalDesconto;
        this.ilfsValMercadoria = ilfsValMercadoria;
        this.ilfsValDespesasAcessorios = ilfsValDespesasAcessorios;
        this.ilfsValDesconto = ilfsValDesconto;
        this.ilfsValUnitarioVenda = ilfsValUnitarioVenda;
        this.ilfsValBaseCalcSubstituicao = ilfsValBaseCalcSubstituicao;
    }

    public String getIlfsId() {
        return ilfsId;
    }

    public void setIlfsId(String ilfsId) {
        this.ilfsId = ilfsId;
    }

    public String getIlfsAliquotaIcms() {
        return ilfsAliquotaIcms;
    }

    public void setIlfsAliquotaIcms(String ilfsAliquotaIcms) {
        this.ilfsAliquotaIcms = ilfsAliquotaIcms;
    }

    public String getIlfsAliquotaIpi() {
        return ilfsAliquotaIpi;
    }

    public void setIlfsAliquotaIpi(String ilfsAliquotaIpi) {
        this.ilfsAliquotaIpi = ilfsAliquotaIpi;
    }

    public String getIlfsAliquotaIssqn() {
        return ilfsAliquotaIssqn;
    }

    public void setIlfsAliquotaIssqn(String ilfsAliquotaIssqn) {
        this.ilfsAliquotaIssqn = ilfsAliquotaIssqn;
    }

    public String getIlfsCodigoNatureza() {
        return ilfsCodigoNatureza;
    }

    public void setIlfsCodigoNatureza(String ilfsCodigoNatureza) {
        this.ilfsCodigoNatureza = ilfsCodigoNatureza;
    }

    public Character getIlfsTipoPagamento() {
        return ilfsTipoPagamento;
    }

    public void setIlfsTipoPagamento(Character ilfsTipoPagamento) {
        this.ilfsTipoPagamento = ilfsTipoPagamento;
    }

    public Character getIlfsTipoFrete() {
        return ilfsTipoFrete;
    }

    public void setIlfsTipoFrete(Character ilfsTipoFrete) {
        this.ilfsTipoFrete = ilfsTipoFrete;
    }

    public String getIlfsSequenciaItem() {
        return ilfsSequenciaItem;
    }

    public void setIlfsSequenciaItem(String ilfsSequenciaItem) {
        this.ilfsSequenciaItem = ilfsSequenciaItem;
    }

    public String getIlfsNumeroItem() {
        return ilfsNumeroItem;
    }

    public void setIlfsNumeroItem(String ilfsNumeroItem) {
        this.ilfsNumeroItem = ilfsNumeroItem;
    }

    public String getIlfsQuantidadeItem() {
        return ilfsQuantidadeItem;
    }

    public void setIlfsQuantidadeItem(String ilfsQuantidadeItem) {
        this.ilfsQuantidadeItem = ilfsQuantidadeItem;
    }

    public Character getIlfsMovimentoRealSimbolico() {
        return ilfsMovimentoRealSimbolico;
    }

    public void setIlfsMovimentoRealSimbolico(Character ilfsMovimentoRealSimbolico) {
        this.ilfsMovimentoRealSimbolico = ilfsMovimentoRealSimbolico;
    }

    public String getIlfsAliquotaIcmsUfDestino() {
        return ilfsAliquotaIcmsUfDestino;
    }

    public void setIlfsAliquotaIcmsUfDestino(String ilfsAliquotaIcmsUfDestino) {
        this.ilfsAliquotaIcmsUfDestino = ilfsAliquotaIcmsUfDestino;
    }

    public String getIlfsIpiCreditadoDebitado() {
        return ilfsIpiCreditadoDebitado;
    }

    public void setIlfsIpiCreditadoDebitado(String ilfsIpiCreditadoDebitado) {
        this.ilfsIpiCreditadoDebitado = ilfsIpiCreditadoDebitado;
    }

    public String getIlfsUnidade() {
        return ilfsUnidade;
    }

    public void setIlfsUnidade(String ilfsUnidade) {
        this.ilfsUnidade = ilfsUnidade;
    }

    public BigDecimal getIlfsValComplementarIcms() {
        return ilfsValComplementarIcms;
    }

    public void setIlfsValComplementarIcms(BigDecimal ilfsValComplementarIcms) {
        this.ilfsValComplementarIcms = ilfsValComplementarIcms;
    }

    public BigDecimal getIlfsValBaseCalculoIcms() {
        return ilfsValBaseCalculoIcms;
    }

    public void setIlfsValBaseCalculoIcms(BigDecimal ilfsValBaseCalculoIcms) {
        this.ilfsValBaseCalculoIcms = ilfsValBaseCalculoIcms;
    }

    public BigDecimal getIlfsValIcms() {
        return ilfsValIcms;
    }

    public void setIlfsValIcms(BigDecimal ilfsValIcms) {
        this.ilfsValIcms = ilfsValIcms;
    }

    public BigDecimal getIlfsValIsentaNaoTributIcms() {
        return ilfsValIsentaNaoTributIcms;
    }

    public void setIlfsValIsentaNaoTributIcms(BigDecimal ilfsValIsentaNaoTributIcms) {
        this.ilfsValIsentaNaoTributIcms = ilfsValIsentaNaoTributIcms;
    }

    public BigDecimal getIlfsValOutraOperacaoIcms() {
        return ilfsValOutraOperacaoIcms;
    }

    public void setIlfsValOutraOperacaoIcms(BigDecimal ilfsValOutraOperacaoIcms) {
        this.ilfsValOutraOperacaoIcms = ilfsValOutraOperacaoIcms;
    }

    public BigDecimal getIlfsValIcmsSubstituiTributa() {
        return ilfsValIcmsSubstituiTributa;
    }

    public void setIlfsValIcmsSubstituiTributa(BigDecimal ilfsValIcmsSubstituiTributa) {
        this.ilfsValIcmsSubstituiTributa = ilfsValIcmsSubstituiTributa;
    }

    public BigDecimal getIlfsValBaseCalculoIssqn() {
        return ilfsValBaseCalculoIssqn;
    }

    public void setIlfsValBaseCalculoIssqn(BigDecimal ilfsValBaseCalculoIssqn) {
        this.ilfsValBaseCalculoIssqn = ilfsValBaseCalculoIssqn;
    }

    public BigDecimal getIlfsValIssqn() {
        return ilfsValIssqn;
    }

    public void setIlfsValIssqn(BigDecimal ilfsValIssqn) {
        this.ilfsValIssqn = ilfsValIssqn;
    }

    public BigDecimal getIlfsValBaseCalculoIpi() {
        return ilfsValBaseCalculoIpi;
    }

    public void setIlfsValBaseCalculoIpi(BigDecimal ilfsValBaseCalculoIpi) {
        this.ilfsValBaseCalculoIpi = ilfsValBaseCalculoIpi;
    }

    public BigDecimal getIlfsValIpi() {
        return ilfsValIpi;
    }

    public void setIlfsValIpi(BigDecimal ilfsValIpi) {
        this.ilfsValIpi = ilfsValIpi;
    }

    public BigDecimal getIlfsValIsentaNaoTributaIpi() {
        return ilfsValIsentaNaoTributaIpi;
    }

    public void setIlfsValIsentaNaoTributaIpi(BigDecimal ilfsValIsentaNaoTributaIpi) {
        this.ilfsValIsentaNaoTributaIpi = ilfsValIsentaNaoTributaIpi;
    }

    public BigDecimal getIlfsValOutraOperacaoIpi() {
        return ilfsValOutraOperacaoIpi;
    }

    public void setIlfsValOutraOperacaoIpi(BigDecimal ilfsValOutraOperacaoIpi) {
        this.ilfsValOutraOperacaoIpi = ilfsValOutraOperacaoIpi;
    }

    public BigDecimal getIlfsValItem() {
        return ilfsValItem;
    }

    public void setIlfsValItem(BigDecimal ilfsValItem) {
        this.ilfsValItem = ilfsValItem;
    }

    public BigDecimal getIlfsValContabil() {
        return ilfsValContabil;
    }

    public void setIlfsValContabil(BigDecimal ilfsValContabil) {
        this.ilfsValContabil = ilfsValContabil;
    }

    public BigDecimal getIlfsValTotalDocumento() {
        return ilfsValTotalDocumento;
    }

    public void setIlfsValTotalDocumento(BigDecimal ilfsValTotalDocumento) {
        this.ilfsValTotalDocumento = ilfsValTotalDocumento;
    }

    public BigDecimal getIlfsValTotalDesconto() {
        return ilfsValTotalDesconto;
    }

    public void setIlfsValTotalDesconto(BigDecimal ilfsValTotalDesconto) {
        this.ilfsValTotalDesconto = ilfsValTotalDesconto;
    }

    public BigDecimal getIlfsValMercadoria() {
        return ilfsValMercadoria;
    }

    public void setIlfsValMercadoria(BigDecimal ilfsValMercadoria) {
        this.ilfsValMercadoria = ilfsValMercadoria;
    }

    public BigDecimal getIlfsValDespesasAcessorios() {
        return ilfsValDespesasAcessorios;
    }

    public void setIlfsValDespesasAcessorios(BigDecimal ilfsValDespesasAcessorios) {
        this.ilfsValDespesasAcessorios = ilfsValDespesasAcessorios;
    }

    public BigDecimal getIlfsValDesconto() {
        return ilfsValDesconto;
    }

    public void setIlfsValDesconto(BigDecimal ilfsValDesconto) {
        this.ilfsValDesconto = ilfsValDesconto;
    }

    public BigDecimal getIlfsValUnitarioVenda() {
        return ilfsValUnitarioVenda;
    }

    public void setIlfsValUnitarioVenda(BigDecimal ilfsValUnitarioVenda) {
        this.ilfsValUnitarioVenda = ilfsValUnitarioVenda;
    }

    public BigDecimal getIlfsValBaseCalcSubstituicao() {
        return ilfsValBaseCalcSubstituicao;
    }

    public void setIlfsValBaseCalcSubstituicao(BigDecimal ilfsValBaseCalcSubstituicao) {
        this.ilfsValBaseCalcSubstituicao = ilfsValBaseCalcSubstituicao;
    }

    public Date getIlfsLastupdate() {
        return ilfsLastupdate;
    }

    public void setIlfsLastupdate(Date ilfsLastupdate) {
        this.ilfsLastupdate = ilfsLastupdate;
    }

    public Cfop getCfopId() {
        return cfopId;
    }

    public void setCfopId(Cfop cfopId) {
        this.cfopId = cfopId;
    }

    public LivrosFiscais getLvfsId() {
        return lvfsId;
    }

    public void setLvfsId(LivrosFiscais lvfsId) {
        this.lvfsId = lvfsId;
    }

    public Produtos getProdId() {
        return prodId;
    }

    public void setProdId(Produtos prodId) {
        this.prodId = prodId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ilfsId != null ? ilfsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItensLivrosFiscais)) {
            return false;
        }
        ItensLivrosFiscais other = (ItensLivrosFiscais) object;
        if ((this.ilfsId == null && other.ilfsId != null) || (this.ilfsId != null && !this.ilfsId.equals(other.ilfsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.ItensLivrosFiscais[ ilfsId=" + ilfsId + " ]";
    }
    
}
