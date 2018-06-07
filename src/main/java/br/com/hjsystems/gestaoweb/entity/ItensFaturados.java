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
@Table(name = "ITENS_FATURADOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ItensFaturados.findAll", query = "SELECT i FROM ItensFaturados i"),
    @NamedQuery(name = "ItensFaturados.findByItftId", query = "SELECT i FROM ItensFaturados i WHERE i.itftId = :itftId"),
    @NamedQuery(name = "ItensFaturados.findByItftQtde", query = "SELECT i FROM ItensFaturados i WHERE i.itftQtde = :itftQtde"),
    @NamedQuery(name = "ItensFaturados.findByItftQtdeFaturada", query = "SELECT i FROM ItensFaturados i WHERE i.itftQtdeFaturada = :itftQtdeFaturada"),
    @NamedQuery(name = "ItensFaturados.findByItftQtdeRemetida", query = "SELECT i FROM ItensFaturados i WHERE i.itftQtdeRemetida = :itftQtdeRemetida"),
    @NamedQuery(name = "ItensFaturados.findByItftQtdeDevolvida", query = "SELECT i FROM ItensFaturados i WHERE i.itftQtdeDevolvida = :itftQtdeDevolvida"),
    @NamedQuery(name = "ItensFaturados.findByItftUnidSigla", query = "SELECT i FROM ItensFaturados i WHERE i.itftUnidSigla = :itftUnidSigla"),
    @NamedQuery(name = "ItensFaturados.findByItftSbupMultiplicador", query = "SELECT i FROM ItensFaturados i WHERE i.itftSbupMultiplicador = :itftSbupMultiplicador"),
    @NamedQuery(name = "ItensFaturados.findByItftVlrDesconto", query = "SELECT i FROM ItensFaturados i WHERE i.itftVlrDesconto = :itftVlrDesconto"),
    @NamedQuery(name = "ItensFaturados.findByItftPrecoUnitario", query = "SELECT i FROM ItensFaturados i WHERE i.itftPrecoUnitario = :itftPrecoUnitario"),
    @NamedQuery(name = "ItensFaturados.findByItftVlrJuros", query = "SELECT i FROM ItensFaturados i WHERE i.itftVlrJuros = :itftVlrJuros"),
    @NamedQuery(name = "ItensFaturados.findByItftPrecoUnitarioFinal", query = "SELECT i FROM ItensFaturados i WHERE i.itftPrecoUnitarioFinal = :itftPrecoUnitarioFinal"),
    @NamedQuery(name = "ItensFaturados.findByItftVlrFrete", query = "SELECT i FROM ItensFaturados i WHERE i.itftVlrFrete = :itftVlrFrete"),
    @NamedQuery(name = "ItensFaturados.findByItftVlrDespesas", query = "SELECT i FROM ItensFaturados i WHERE i.itftVlrDespesas = :itftVlrDespesas"),
    @NamedQuery(name = "ItensFaturados.findByItftVlrSeguro", query = "SELECT i FROM ItensFaturados i WHERE i.itftVlrSeguro = :itftVlrSeguro"),
    @NamedQuery(name = "ItensFaturados.findByItftVlrDescontoSobreTotal", query = "SELECT i FROM ItensFaturados i WHERE i.itftVlrDescontoSobreTotal = :itftVlrDescontoSobreTotal"),
    @NamedQuery(name = "ItensFaturados.findByItftVlrFinal", query = "SELECT i FROM ItensFaturados i WHERE i.itftVlrFinal = :itftVlrFinal"),
    @NamedQuery(name = "ItensFaturados.findByItftVlrTributos", query = "SELECT i FROM ItensFaturados i WHERE i.itftVlrTributos = :itftVlrTributos"),
    @NamedQuery(name = "ItensFaturados.findByItftVlrContabil", query = "SELECT i FROM ItensFaturados i WHERE i.itftVlrContabil = :itftVlrContabil"),
    @NamedQuery(name = "ItensFaturados.findByItftProdDescricao", query = "SELECT i FROM ItensFaturados i WHERE i.itftProdDescricao = :itftProdDescricao"),
    @NamedQuery(name = "ItensFaturados.findByItftPrecoTabela", query = "SELECT i FROM ItensFaturados i WHERE i.itftPrecoTabela = :itftPrecoTabela"),
    @NamedQuery(name = "ItensFaturados.findByItftMensagem", query = "SELECT i FROM ItensFaturados i WHERE i.itftMensagem = :itftMensagem"),
    @NamedQuery(name = "ItensFaturados.findByItftDiferencialAliquota", query = "SELECT i FROM ItensFaturados i WHERE i.itftDiferencialAliquota = :itftDiferencialAliquota"),
    @NamedQuery(name = "ItensFaturados.findByItftAliqIcmsDestino", query = "SELECT i FROM ItensFaturados i WHERE i.itftAliqIcmsDestino = :itftAliqIcmsDestino"),
    @NamedQuery(name = "ItensFaturados.findByItftAliqIcmsOrigem", query = "SELECT i FROM ItensFaturados i WHERE i.itftAliqIcmsOrigem = :itftAliqIcmsOrigem"),
    @NamedQuery(name = "ItensFaturados.findByItftBaseIcms", query = "SELECT i FROM ItensFaturados i WHERE i.itftBaseIcms = :itftBaseIcms"),
    @NamedQuery(name = "ItensFaturados.findByItftIndiceReducao", query = "SELECT i FROM ItensFaturados i WHERE i.itftIndiceReducao = :itftIndiceReducao"),
    @NamedQuery(name = "ItensFaturados.findByItftValorIss", query = "SELECT i FROM ItensFaturados i WHERE i.itftValorIss = :itftValorIss"),
    @NamedQuery(name = "ItensFaturados.findByItftAliqIss", query = "SELECT i FROM ItensFaturados i WHERE i.itftAliqIss = :itftAliqIss"),
    @NamedQuery(name = "ItensFaturados.findByItftBaseIss", query = "SELECT i FROM ItensFaturados i WHERE i.itftBaseIss = :itftBaseIss"),
    @NamedQuery(name = "ItensFaturados.findByItftRegFiscalTribDestino", query = "SELECT i FROM ItensFaturados i WHERE i.itftRegFiscalTribDestino = :itftRegFiscalTribDestino"),
    @NamedQuery(name = "ItensFaturados.findByItftRegFiscalTribOrigem", query = "SELECT i FROM ItensFaturados i WHERE i.itftRegFiscalTribOrigem = :itftRegFiscalTribOrigem"),
    @NamedQuery(name = "ItensFaturados.findByItftCstIpi", query = "SELECT i FROM ItensFaturados i WHERE i.itftCstIpi = :itftCstIpi"),
    @NamedQuery(name = "ItensFaturados.findByItftCst", query = "SELECT i FROM ItensFaturados i WHERE i.itftCst = :itftCst"),
    @NamedQuery(name = "ItensFaturados.findByItftCfo", query = "SELECT i FROM ItensFaturados i WHERE i.itftCfo = :itftCfo"),
    @NamedQuery(name = "ItensFaturados.findByItftCustoMedioAnterior", query = "SELECT i FROM ItensFaturados i WHERE i.itftCustoMedioAnterior = :itftCustoMedioAnterior"),
    @NamedQuery(name = "ItensFaturados.findByItftCustoNaOperacao", query = "SELECT i FROM ItensFaturados i WHERE i.itftCustoNaOperacao = :itftCustoNaOperacao"),
    @NamedQuery(name = "ItensFaturados.findByItftValorIcms", query = "SELECT i FROM ItensFaturados i WHERE i.itftValorIcms = :itftValorIcms"),
    @NamedQuery(name = "ItensFaturados.findByItftIva", query = "SELECT i FROM ItensFaturados i WHERE i.itftIva = :itftIva"),
    @NamedQuery(name = "ItensFaturados.findByItftBaseSubstituicao", query = "SELECT i FROM ItensFaturados i WHERE i.itftBaseSubstituicao = :itftBaseSubstituicao"),
    @NamedQuery(name = "ItensFaturados.findByItftIcmsRetidoSaida", query = "SELECT i FROM ItensFaturados i WHERE i.itftIcmsRetidoSaida = :itftIcmsRetidoSaida"),
    @NamedQuery(name = "ItensFaturados.findByItftBaseRtdEntrada", query = "SELECT i FROM ItensFaturados i WHERE i.itftBaseRtdEntrada = :itftBaseRtdEntrada"),
    @NamedQuery(name = "ItensFaturados.findByItftIcmsRetidoEntrada", query = "SELECT i FROM ItensFaturados i WHERE i.itftIcmsRetidoEntrada = :itftIcmsRetidoEntrada"),
    @NamedQuery(name = "ItensFaturados.findByItftBaseIpi", query = "SELECT i FROM ItensFaturados i WHERE i.itftBaseIpi = :itftBaseIpi"),
    @NamedQuery(name = "ItensFaturados.findByItftAliqIpi", query = "SELECT i FROM ItensFaturados i WHERE i.itftAliqIpi = :itftAliqIpi"),
    @NamedQuery(name = "ItensFaturados.findByItftValorIpi", query = "SELECT i FROM ItensFaturados i WHERE i.itftValorIpi = :itftValorIpi"),
    @NamedQuery(name = "ItensFaturados.findByItftBaseIsenta", query = "SELECT i FROM ItensFaturados i WHERE i.itftBaseIsenta = :itftBaseIsenta"),
    @NamedQuery(name = "ItensFaturados.findByItftBaseOutr", query = "SELECT i FROM ItensFaturados i WHERE i.itftBaseOutr = :itftBaseOutr"),
    @NamedQuery(name = "ItensFaturados.findByItftBasePis", query = "SELECT i FROM ItensFaturados i WHERE i.itftBasePis = :itftBasePis"),
    @NamedQuery(name = "ItensFaturados.findByItftAliqPis", query = "SELECT i FROM ItensFaturados i WHERE i.itftAliqPis = :itftAliqPis"),
    @NamedQuery(name = "ItensFaturados.findByItftValorPis", query = "SELECT i FROM ItensFaturados i WHERE i.itftValorPis = :itftValorPis"),
    @NamedQuery(name = "ItensFaturados.findByItftBaseCofins", query = "SELECT i FROM ItensFaturados i WHERE i.itftBaseCofins = :itftBaseCofins"),
    @NamedQuery(name = "ItensFaturados.findByItftAliqCofins", query = "SELECT i FROM ItensFaturados i WHERE i.itftAliqCofins = :itftAliqCofins"),
    @NamedQuery(name = "ItensFaturados.findByItftValorCofins", query = "SELECT i FROM ItensFaturados i WHERE i.itftValorCofins = :itftValorCofins"),
    @NamedQuery(name = "ItensFaturados.findByItftPisRetido", query = "SELECT i FROM ItensFaturados i WHERE i.itftPisRetido = :itftPisRetido"),
    @NamedQuery(name = "ItensFaturados.findByItftCofinsRetido", query = "SELECT i FROM ItensFaturados i WHERE i.itftCofinsRetido = :itftCofinsRetido"),
    @NamedQuery(name = "ItensFaturados.findByItftBaseIssRetido", query = "SELECT i FROM ItensFaturados i WHERE i.itftBaseIssRetido = :itftBaseIssRetido"),
    @NamedQuery(name = "ItensFaturados.findByItftAliqIssRetido", query = "SELECT i FROM ItensFaturados i WHERE i.itftAliqIssRetido = :itftAliqIssRetido"),
    @NamedQuery(name = "ItensFaturados.findByItftIssRetido", query = "SELECT i FROM ItensFaturados i WHERE i.itftIssRetido = :itftIssRetido"),
    @NamedQuery(name = "ItensFaturados.findByItftBaseIr", query = "SELECT i FROM ItensFaturados i WHERE i.itftBaseIr = :itftBaseIr"),
    @NamedQuery(name = "ItensFaturados.findByItftAliquotaIr", query = "SELECT i FROM ItensFaturados i WHERE i.itftAliquotaIr = :itftAliquotaIr"),
    @NamedQuery(name = "ItensFaturados.findByItftValorIr", query = "SELECT i FROM ItensFaturados i WHERE i.itftValorIr = :itftValorIr"),
    @NamedQuery(name = "ItensFaturados.findByItftIrRetido", query = "SELECT i FROM ItensFaturados i WHERE i.itftIrRetido = :itftIrRetido"),
    @NamedQuery(name = "ItensFaturados.findByItftBaseCsll", query = "SELECT i FROM ItensFaturados i WHERE i.itftBaseCsll = :itftBaseCsll"),
    @NamedQuery(name = "ItensFaturados.findByItftAliquotaCsll", query = "SELECT i FROM ItensFaturados i WHERE i.itftAliquotaCsll = :itftAliquotaCsll"),
    @NamedQuery(name = "ItensFaturados.findByItftValorCsll", query = "SELECT i FROM ItensFaturados i WHERE i.itftValorCsll = :itftValorCsll"),
    @NamedQuery(name = "ItensFaturados.findByItftAdiantamentoCsll", query = "SELECT i FROM ItensFaturados i WHERE i.itftAdiantamentoCsll = :itftAdiantamentoCsll"),
    @NamedQuery(name = "ItensFaturados.findByItftOutrasDespAces", query = "SELECT i FROM ItensFaturados i WHERE i.itftOutrasDespAces = :itftOutrasDespAces"),
    @NamedQuery(name = "ItensFaturados.findByDocDcfsId", query = "SELECT i FROM ItensFaturados i WHERE i.docDcfsId = :docDcfsId"),
    @NamedQuery(name = "ItensFaturados.findByItftPesoBruto", query = "SELECT i FROM ItensFaturados i WHERE i.itftPesoBruto = :itftPesoBruto"),
    @NamedQuery(name = "ItensFaturados.findByItftPesoLiquido", query = "SELECT i FROM ItensFaturados i WHERE i.itftPesoLiquido = :itftPesoLiquido"),
    @NamedQuery(name = "ItensFaturados.findByItftNumeroItem", query = "SELECT i FROM ItensFaturados i WHERE i.itftNumeroItem = :itftNumeroItem"),
    @NamedQuery(name = "ItensFaturados.findByItftBasePisRetido", query = "SELECT i FROM ItensFaturados i WHERE i.itftBasePisRetido = :itftBasePisRetido"),
    @NamedQuery(name = "ItensFaturados.findByItftAliqPisRetido", query = "SELECT i FROM ItensFaturados i WHERE i.itftAliqPisRetido = :itftAliqPisRetido"),
    @NamedQuery(name = "ItensFaturados.findByItftBaseCofinsRetido", query = "SELECT i FROM ItensFaturados i WHERE i.itftBaseCofinsRetido = :itftBaseCofinsRetido"),
    @NamedQuery(name = "ItensFaturados.findByItftAliqCofinsRetido", query = "SELECT i FROM ItensFaturados i WHERE i.itftAliqCofinsRetido = :itftAliqCofinsRetido"),
    @NamedQuery(name = "ItensFaturados.findByItftCstPis", query = "SELECT i FROM ItensFaturados i WHERE i.itftCstPis = :itftCstPis"),
    @NamedQuery(name = "ItensFaturados.findByItftCstCofins", query = "SELECT i FROM ItensFaturados i WHERE i.itftCstCofins = :itftCstCofins"),
    @NamedQuery(name = "ItensFaturados.findByItFtLASTUPDATE", query = "SELECT i FROM ItensFaturados i WHERE i.itFtLASTUPDATE = :itFtLASTUPDATE"),
    @NamedQuery(name = "ItensFaturados.findByItftUltPrcCompra", query = "SELECT i FROM ItensFaturados i WHERE i.itftUltPrcCompra = :itftUltPrcCompra"),
    @NamedQuery(name = "ItensFaturados.findByItftAliqCredSn", query = "SELECT i FROM ItensFaturados i WHERE i.itftAliqCredSn = :itftAliqCredSn"),
    @NamedQuery(name = "ItensFaturados.findByItftCredSn", query = "SELECT i FROM ItensFaturados i WHERE i.itftCredSn = :itftCredSn"),
    @NamedQuery(name = "ItensFaturados.findByItftCsosn", query = "SELECT i FROM ItensFaturados i WHERE i.itftCsosn = :itftCsosn"),
    @NamedQuery(name = "ItensFaturados.findByItftBaseImportacao", query = "SELECT i FROM ItensFaturados i WHERE i.itftBaseImportacao = :itftBaseImportacao"),
    @NamedQuery(name = "ItensFaturados.findByItftImpImportacao", query = "SELECT i FROM ItensFaturados i WHERE i.itftImpImportacao = :itftImpImportacao"),
    @NamedQuery(name = "ItensFaturados.findByItftValorIof", query = "SELECT i FROM ItensFaturados i WHERE i.itftValorIof = :itftValorIof"),
    @NamedQuery(name = "ItensFaturados.findByItftDespesasAdu", query = "SELECT i FROM ItensFaturados i WHERE i.itftDespesasAdu = :itftDespesasAdu"),
    @NamedQuery(name = "ItensFaturados.findByItftQtdeEntregue", query = "SELECT i FROM ItensFaturados i WHERE i.itftQtdeEntregue = :itftQtdeEntregue"),
    @NamedQuery(name = "ItensFaturados.findByItftAliqIcmsDestinoInterna", query = "SELECT i FROM ItensFaturados i WHERE i.itftAliqIcmsDestinoInterna = :itftAliqIcmsDestinoInterna"),
    @NamedQuery(name = "ItensFaturados.findByItftAliqFcpDestino", query = "SELECT i FROM ItensFaturados i WHERE i.itftAliqFcpDestino = :itftAliqFcpDestino"),
    @NamedQuery(name = "ItensFaturados.findByItftAliqIcmsDestinoExterna", query = "SELECT i FROM ItensFaturados i WHERE i.itftAliqIcmsDestinoExterna = :itftAliqIcmsDestinoExterna"),
    @NamedQuery(name = "ItensFaturados.findByItftDifalOrigem", query = "SELECT i FROM ItensFaturados i WHERE i.itftDifalOrigem = :itftDifalOrigem"),
    @NamedQuery(name = "ItensFaturados.findByItftDifalDestino", query = "SELECT i FROM ItensFaturados i WHERE i.itftDifalDestino = :itftDifalDestino")})
public class ItensFaturados implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ITFT_ID")
    private String itftId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "ITFT_QTDE")
    private BigDecimal itftQtde;
    @Basic(optional = false)
    @Column(name = "ITFT_QTDE_FATURADA")
    private BigDecimal itftQtdeFaturada;
    @Basic(optional = false)
    @Column(name = "ITFT_QTDE_REMETIDA")
    private BigDecimal itftQtdeRemetida;
    @Basic(optional = false)
    @Column(name = "ITFT_QTDE_DEVOLVIDA")
    private BigDecimal itftQtdeDevolvida;
    @Basic(optional = false)
    @Column(name = "ITFT_UNID_SIGLA")
    private String itftUnidSigla;
    @Basic(optional = false)
    @Column(name = "ITFT_SBUP_MULTIPLICADOR")
    private BigDecimal itftSbupMultiplicador;
    @Basic(optional = false)
    @Column(name = "ITFT_VLR_DESCONTO")
    private BigDecimal itftVlrDesconto;
    @Basic(optional = false)
    @Column(name = "ITFT_PRECO_UNITARIO")
    private BigDecimal itftPrecoUnitario;
    @Basic(optional = false)
    @Column(name = "ITFT_VLR_JUROS")
    private BigDecimal itftVlrJuros;
    @Basic(optional = false)
    @Column(name = "ITFT_PRECO_UNITARIO_FINAL")
    private BigDecimal itftPrecoUnitarioFinal;
    @Basic(optional = false)
    @Column(name = "ITFT_VLR_FRETE")
    private BigDecimal itftVlrFrete;
    @Basic(optional = false)
    @Column(name = "ITFT_VLR_DESPESAS")
    private BigDecimal itftVlrDespesas;
    @Basic(optional = false)
    @Column(name = "ITFT_VLR_SEGURO")
    private BigDecimal itftVlrSeguro;
    @Basic(optional = false)
    @Column(name = "ITFT_VLR_DESCONTO_SOBRE_TOTAL")
    private BigDecimal itftVlrDescontoSobreTotal;
    @Basic(optional = false)
    @Column(name = "ITFT_VLR_FINAL")
    private BigDecimal itftVlrFinal;
    @Basic(optional = false)
    @Column(name = "ITFT_VLR_TRIBUTOS")
    private BigDecimal itftVlrTributos;
    @Basic(optional = false)
    @Column(name = "ITFT_VLR_CONTABIL")
    private BigDecimal itftVlrContabil;
    @Column(name = "ITFT_PROD_DESCRICAO")
    private String itftProdDescricao;
    @Basic(optional = false)
    @Column(name = "ITFT_PRECO_TABELA")
    private BigDecimal itftPrecoTabela;
    @Column(name = "ITFT_MENSAGEM")
    private String itftMensagem;
    @Basic(optional = false)
    @Column(name = "ITFT_DIFERENCIAL_ALIQUOTA")
    private BigDecimal itftDiferencialAliquota;
    @Basic(optional = false)
    @Column(name = "ITFT_ALIQ_ICMS_DESTINO")
    private BigDecimal itftAliqIcmsDestino;
    @Basic(optional = false)
    @Column(name = "ITFT_ALIQ_ICMS_ORIGEM")
    private BigDecimal itftAliqIcmsOrigem;
    @Basic(optional = false)
    @Column(name = "ITFT_BASE_ICMS")
    private BigDecimal itftBaseIcms;
    @Basic(optional = false)
    @Column(name = "ITFT_INDICE_REDUCAO")
    private BigDecimal itftIndiceReducao;
    @Basic(optional = false)
    @Column(name = "ITFT_VALOR_ISS")
    private BigDecimal itftValorIss;
    @Basic(optional = false)
    @Column(name = "ITFT_ALIQ_ISS")
    private BigDecimal itftAliqIss;
    @Basic(optional = false)
    @Column(name = "ITFT_BASE_ISS")
    private BigDecimal itftBaseIss;
    @Column(name = "ITFT_REG_FISCAL_TRIB_DESTINO")
    private String itftRegFiscalTribDestino;
    @Column(name = "ITFT_REG_FISCAL_TRIB_ORIGEM")
    private String itftRegFiscalTribOrigem;
    @Basic(optional = false)
    @Column(name = "ITFT_CST_IPI")
    private String itftCstIpi;
    @Basic(optional = false)
    @Column(name = "ITFT_CST")
    private String itftCst;
    @Basic(optional = false)
    @Column(name = "ITFT_CFO")
    private String itftCfo;
    @Basic(optional = false)
    @Column(name = "ITFT_CUSTO_MEDIO_ANTERIOR")
    private BigDecimal itftCustoMedioAnterior;
    @Basic(optional = false)
    @Column(name = "ITFT_CUSTO_NA_OPERACAO")
    private BigDecimal itftCustoNaOperacao;
    @Basic(optional = false)
    @Column(name = "ITFT_VALOR_ICMS")
    private BigDecimal itftValorIcms;
    @Basic(optional = false)
    @Column(name = "ITFT_IVA")
    private BigDecimal itftIva;
    @Basic(optional = false)
    @Column(name = "ITFT_BASE_SUBSTITUICAO")
    private BigDecimal itftBaseSubstituicao;
    @Basic(optional = false)
    @Column(name = "ITFT_ICMS_RETIDO_SAIDA")
    private BigDecimal itftIcmsRetidoSaida;
    @Basic(optional = false)
    @Column(name = "ITFT_BASE_RTD_ENTRADA")
    private BigDecimal itftBaseRtdEntrada;
    @Basic(optional = false)
    @Column(name = "ITFT_ICMS_RETIDO_ENTRADA")
    private BigDecimal itftIcmsRetidoEntrada;
    @Basic(optional = false)
    @Column(name = "ITFT_BASE_IPI")
    private BigDecimal itftBaseIpi;
    @Basic(optional = false)
    @Column(name = "ITFT_ALIQ_IPI")
    private BigDecimal itftAliqIpi;
    @Basic(optional = false)
    @Column(name = "ITFT_VALOR_IPI")
    private BigDecimal itftValorIpi;
    @Basic(optional = false)
    @Column(name = "ITFT_BASE_ISENTA")
    private BigDecimal itftBaseIsenta;
    @Basic(optional = false)
    @Column(name = "ITFT_BASE_OUTR")
    private BigDecimal itftBaseOutr;
    @Basic(optional = false)
    @Column(name = "ITFT_BASE_PIS")
    private BigDecimal itftBasePis;
    @Basic(optional = false)
    @Column(name = "ITFT_ALIQ_PIS")
    private BigDecimal itftAliqPis;
    @Basic(optional = false)
    @Column(name = "ITFT_VALOR_PIS")
    private BigDecimal itftValorPis;
    @Basic(optional = false)
    @Column(name = "ITFT_BASE_COFINS")
    private BigDecimal itftBaseCofins;
    @Basic(optional = false)
    @Column(name = "ITFT_ALIQ_COFINS")
    private BigDecimal itftAliqCofins;
    @Basic(optional = false)
    @Column(name = "ITFT_VALOR_COFINS")
    private BigDecimal itftValorCofins;
    @Basic(optional = false)
    @Column(name = "ITFT_PIS_RETIDO")
    private BigDecimal itftPisRetido;
    @Basic(optional = false)
    @Column(name = "ITFT_COFINS_RETIDO")
    private BigDecimal itftCofinsRetido;
    @Basic(optional = false)
    @Column(name = "ITFT_BASE_ISS_RETIDO")
    private BigDecimal itftBaseIssRetido;
    @Basic(optional = false)
    @Column(name = "ITFT_ALIQ_ISS_RETIDO")
    private BigDecimal itftAliqIssRetido;
    @Basic(optional = false)
    @Column(name = "ITFT_ISS_RETIDO")
    private BigDecimal itftIssRetido;
    @Basic(optional = false)
    @Column(name = "ITFT_BASE_IR")
    private BigDecimal itftBaseIr;
    @Basic(optional = false)
    @Column(name = "ITFT_ALIQUOTA_IR")
    private BigDecimal itftAliquotaIr;
    @Basic(optional = false)
    @Column(name = "ITFT_VALOR_IR")
    private BigDecimal itftValorIr;
    @Basic(optional = false)
    @Column(name = "ITFT_IR_RETIDO")
    private BigDecimal itftIrRetido;
    @Basic(optional = false)
    @Column(name = "ITFT_BASE_CSLL")
    private BigDecimal itftBaseCsll;
    @Basic(optional = false)
    @Column(name = "ITFT_ALIQUOTA_CSLL")
    private BigDecimal itftAliquotaCsll;
    @Basic(optional = false)
    @Column(name = "ITFT_VALOR_CSLL")
    private BigDecimal itftValorCsll;
    @Basic(optional = false)
    @Column(name = "ITFT_ADIANTAMENTO_CSLL")
    private BigDecimal itftAdiantamentoCsll;
    @Basic(optional = false)
    @Column(name = "ITFT_OUTRAS_DESP_ACES")
    private BigDecimal itftOutrasDespAces;
    @Column(name = "DOC_DCFS_ID")
    private String docDcfsId;
    @Column(name = "ITFT_PESO_BRUTO")
    private BigDecimal itftPesoBruto;
    @Column(name = "ITFT_PESO_LIQUIDO")
    private BigDecimal itftPesoLiquido;
    @Column(name = "ITFT_NUMERO_ITEM")
    private Integer itftNumeroItem;
    @Column(name = "ITFT_BASE_PIS_RETIDO")
    private BigDecimal itftBasePisRetido;
    @Column(name = "ITFT_ALIQ_PIS_RETIDO")
    private BigDecimal itftAliqPisRetido;
    @Column(name = "ITFT_BASE_COFINS_RETIDO")
    private BigDecimal itftBaseCofinsRetido;
    @Column(name = "ITFT_ALIQ_COFINS_RETIDO")
    private BigDecimal itftAliqCofinsRetido;
    @Column(name = "ITFT_CST_PIS")
    private String itftCstPis;
    @Column(name = "ITFT_CST_COFINS")
    private String itftCstCofins;
    @Column(name = "ItFt_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date itFtLASTUPDATE;
    @Column(name = "ITFT_ULT_PRC_COMPRA")
    private BigDecimal itftUltPrcCompra;
    @Column(name = "ITFT_ALIQ_CRED_SN")
    private BigDecimal itftAliqCredSn;
    @Column(name = "ITFT_CRED_SN")
    private BigDecimal itftCredSn;
    @Column(name = "ITFT_CSOSN")
    private String itftCsosn;
    @Column(name = "ITFT_BASE_IMPORTACAO")
    private BigDecimal itftBaseImportacao;
    @Column(name = "ITFT_IMP_IMPORTACAO")
    private BigDecimal itftImpImportacao;
    @Column(name = "ITFT_VALOR_IOF")
    private BigDecimal itftValorIof;
    @Column(name = "ITFT_DESPESAS_ADU")
    private BigDecimal itftDespesasAdu;
    @Column(name = "ITFT_QTDE_ENTREGUE")
    private BigDecimal itftQtdeEntregue;
    @Column(name = "ITFT_ALIQ_ICMS_DESTINO_INTERNA")
    private BigDecimal itftAliqIcmsDestinoInterna;
    @Column(name = "ITFT_ALIQ_FCP_DESTINO")
    private BigDecimal itftAliqFcpDestino;
    @Column(name = "ITFT_ALIQ_ICMS_DESTINO_EXTERNA")
    private BigDecimal itftAliqIcmsDestinoExterna;
    @Column(name = "ITFT_DIFAL_ORIGEM")
    private BigDecimal itftDifalOrigem;
    @Column(name = "ITFT_DIFAL_DESTINO")
    private BigDecimal itftDifalDestino;
    @OneToMany(mappedBy = "itftId")
    private List<SaldosEstoquesDiario> saldosEstoquesDiarioList;
    @JoinColumn(name = "CLFC_ID", referencedColumnName = "CLFC_ID")
    @ManyToOne
    private ClassificacaoFiscal clfcId;
    @JoinColumn(name = "DCFS_ID", referencedColumnName = "DCFS_ID")
    @ManyToOne
    private DocumentosFiscais dcfsId;
    @OneToMany(mappedBy = "iteItftId")
    private List<ItensFaturados> itensFaturadosList;
    @JoinColumn(name = "ITE_ITFT_ID", referencedColumnName = "ITFT_ID")
    @ManyToOne
    private ItensFaturados iteItftId;
    @JoinColumn(name = "ITPD_ID", referencedColumnName = "ITPD_ID")
    @ManyToOne
    private ItensPedidos itpdId;
    @JoinColumn(name = "MSNF_ID", referencedColumnName = "MSNF_ID")
    @ManyToOne
    private MensagensNotaFiscal msnfId;
    @JoinColumn(name = "PROD_ID", referencedColumnName = "PROD_ID")
    @ManyToOne
    private Produtos prodId;
    @JoinColumn(name = "TEST_ID", referencedColumnName = "TEST_ID")
    @ManyToOne
    private TiposEstoques testId;
    @OneToMany(mappedBy = "itftId")
    private List<DeclaracaoImportacao> declaracaoImportacaoList;
    @OneToMany(mappedBy = "itftId")
    private List<ProdutosSeries> produtosSeriesList;
    @OneToMany(mappedBy = "itftId")
    private List<ItensComissoesTecnicos> itensComissoesTecnicosList;
    @OneToMany(mappedBy = "itftId")
    private List<ItensEntregados> itensEntregadosList;

    public ItensFaturados() {
    }

    public ItensFaturados(String itftId) {
        this.itftId = itftId;
    }

    public ItensFaturados(String itftId, BigDecimal itftQtde, BigDecimal itftQtdeFaturada, BigDecimal itftQtdeRemetida, BigDecimal itftQtdeDevolvida, String itftUnidSigla, BigDecimal itftSbupMultiplicador, BigDecimal itftVlrDesconto, BigDecimal itftPrecoUnitario, BigDecimal itftVlrJuros, BigDecimal itftPrecoUnitarioFinal, BigDecimal itftVlrFrete, BigDecimal itftVlrDespesas, BigDecimal itftVlrSeguro, BigDecimal itftVlrDescontoSobreTotal, BigDecimal itftVlrFinal, BigDecimal itftVlrTributos, BigDecimal itftVlrContabil, BigDecimal itftPrecoTabela, BigDecimal itftDiferencialAliquota, BigDecimal itftAliqIcmsDestino, BigDecimal itftAliqIcmsOrigem, BigDecimal itftBaseIcms, BigDecimal itftIndiceReducao, BigDecimal itftValorIss, BigDecimal itftAliqIss, BigDecimal itftBaseIss, String itftCstIpi, String itftCst, String itftCfo, BigDecimal itftCustoMedioAnterior, BigDecimal itftCustoNaOperacao, BigDecimal itftValorIcms, BigDecimal itftIva, BigDecimal itftBaseSubstituicao, BigDecimal itftIcmsRetidoSaida, BigDecimal itftBaseRtdEntrada, BigDecimal itftIcmsRetidoEntrada, BigDecimal itftBaseIpi, BigDecimal itftAliqIpi, BigDecimal itftValorIpi, BigDecimal itftBaseIsenta, BigDecimal itftBaseOutr, BigDecimal itftBasePis, BigDecimal itftAliqPis, BigDecimal itftValorPis, BigDecimal itftBaseCofins, BigDecimal itftAliqCofins, BigDecimal itftValorCofins, BigDecimal itftPisRetido, BigDecimal itftCofinsRetido, BigDecimal itftBaseIssRetido, BigDecimal itftAliqIssRetido, BigDecimal itftIssRetido, BigDecimal itftBaseIr, BigDecimal itftAliquotaIr, BigDecimal itftValorIr, BigDecimal itftIrRetido, BigDecimal itftBaseCsll, BigDecimal itftAliquotaCsll, BigDecimal itftValorCsll, BigDecimal itftAdiantamentoCsll, BigDecimal itftOutrasDespAces) {
        this.itftId = itftId;
        this.itftQtde = itftQtde;
        this.itftQtdeFaturada = itftQtdeFaturada;
        this.itftQtdeRemetida = itftQtdeRemetida;
        this.itftQtdeDevolvida = itftQtdeDevolvida;
        this.itftUnidSigla = itftUnidSigla;
        this.itftSbupMultiplicador = itftSbupMultiplicador;
        this.itftVlrDesconto = itftVlrDesconto;
        this.itftPrecoUnitario = itftPrecoUnitario;
        this.itftVlrJuros = itftVlrJuros;
        this.itftPrecoUnitarioFinal = itftPrecoUnitarioFinal;
        this.itftVlrFrete = itftVlrFrete;
        this.itftVlrDespesas = itftVlrDespesas;
        this.itftVlrSeguro = itftVlrSeguro;
        this.itftVlrDescontoSobreTotal = itftVlrDescontoSobreTotal;
        this.itftVlrFinal = itftVlrFinal;
        this.itftVlrTributos = itftVlrTributos;
        this.itftVlrContabil = itftVlrContabil;
        this.itftPrecoTabela = itftPrecoTabela;
        this.itftDiferencialAliquota = itftDiferencialAliquota;
        this.itftAliqIcmsDestino = itftAliqIcmsDestino;
        this.itftAliqIcmsOrigem = itftAliqIcmsOrigem;
        this.itftBaseIcms = itftBaseIcms;
        this.itftIndiceReducao = itftIndiceReducao;
        this.itftValorIss = itftValorIss;
        this.itftAliqIss = itftAliqIss;
        this.itftBaseIss = itftBaseIss;
        this.itftCstIpi = itftCstIpi;
        this.itftCst = itftCst;
        this.itftCfo = itftCfo;
        this.itftCustoMedioAnterior = itftCustoMedioAnterior;
        this.itftCustoNaOperacao = itftCustoNaOperacao;
        this.itftValorIcms = itftValorIcms;
        this.itftIva = itftIva;
        this.itftBaseSubstituicao = itftBaseSubstituicao;
        this.itftIcmsRetidoSaida = itftIcmsRetidoSaida;
        this.itftBaseRtdEntrada = itftBaseRtdEntrada;
        this.itftIcmsRetidoEntrada = itftIcmsRetidoEntrada;
        this.itftBaseIpi = itftBaseIpi;
        this.itftAliqIpi = itftAliqIpi;
        this.itftValorIpi = itftValorIpi;
        this.itftBaseIsenta = itftBaseIsenta;
        this.itftBaseOutr = itftBaseOutr;
        this.itftBasePis = itftBasePis;
        this.itftAliqPis = itftAliqPis;
        this.itftValorPis = itftValorPis;
        this.itftBaseCofins = itftBaseCofins;
        this.itftAliqCofins = itftAliqCofins;
        this.itftValorCofins = itftValorCofins;
        this.itftPisRetido = itftPisRetido;
        this.itftCofinsRetido = itftCofinsRetido;
        this.itftBaseIssRetido = itftBaseIssRetido;
        this.itftAliqIssRetido = itftAliqIssRetido;
        this.itftIssRetido = itftIssRetido;
        this.itftBaseIr = itftBaseIr;
        this.itftAliquotaIr = itftAliquotaIr;
        this.itftValorIr = itftValorIr;
        this.itftIrRetido = itftIrRetido;
        this.itftBaseCsll = itftBaseCsll;
        this.itftAliquotaCsll = itftAliquotaCsll;
        this.itftValorCsll = itftValorCsll;
        this.itftAdiantamentoCsll = itftAdiantamentoCsll;
        this.itftOutrasDespAces = itftOutrasDespAces;
    }

    public String getItftId() {
        return itftId;
    }

    public void setItftId(String itftId) {
        this.itftId = itftId;
    }

    public BigDecimal getItftQtde() {
        return itftQtde;
    }

    public void setItftQtde(BigDecimal itftQtde) {
        this.itftQtde = itftQtde;
    }

    public BigDecimal getItftQtdeFaturada() {
        return itftQtdeFaturada;
    }

    public void setItftQtdeFaturada(BigDecimal itftQtdeFaturada) {
        this.itftQtdeFaturada = itftQtdeFaturada;
    }

    public BigDecimal getItftQtdeRemetida() {
        return itftQtdeRemetida;
    }

    public void setItftQtdeRemetida(BigDecimal itftQtdeRemetida) {
        this.itftQtdeRemetida = itftQtdeRemetida;
    }

    public BigDecimal getItftQtdeDevolvida() {
        return itftQtdeDevolvida;
    }

    public void setItftQtdeDevolvida(BigDecimal itftQtdeDevolvida) {
        this.itftQtdeDevolvida = itftQtdeDevolvida;
    }

    public String getItftUnidSigla() {
        return itftUnidSigla;
    }

    public void setItftUnidSigla(String itftUnidSigla) {
        this.itftUnidSigla = itftUnidSigla;
    }

    public BigDecimal getItftSbupMultiplicador() {
        return itftSbupMultiplicador;
    }

    public void setItftSbupMultiplicador(BigDecimal itftSbupMultiplicador) {
        this.itftSbupMultiplicador = itftSbupMultiplicador;
    }

    public BigDecimal getItftVlrDesconto() {
        return itftVlrDesconto;
    }

    public void setItftVlrDesconto(BigDecimal itftVlrDesconto) {
        this.itftVlrDesconto = itftVlrDesconto;
    }

    public BigDecimal getItftPrecoUnitario() {
        return itftPrecoUnitario;
    }

    public void setItftPrecoUnitario(BigDecimal itftPrecoUnitario) {
        this.itftPrecoUnitario = itftPrecoUnitario;
    }

    public BigDecimal getItftVlrJuros() {
        return itftVlrJuros;
    }

    public void setItftVlrJuros(BigDecimal itftVlrJuros) {
        this.itftVlrJuros = itftVlrJuros;
    }

    public BigDecimal getItftPrecoUnitarioFinal() {
        return itftPrecoUnitarioFinal;
    }

    public void setItftPrecoUnitarioFinal(BigDecimal itftPrecoUnitarioFinal) {
        this.itftPrecoUnitarioFinal = itftPrecoUnitarioFinal;
    }

    public BigDecimal getItftVlrFrete() {
        return itftVlrFrete;
    }

    public void setItftVlrFrete(BigDecimal itftVlrFrete) {
        this.itftVlrFrete = itftVlrFrete;
    }

    public BigDecimal getItftVlrDespesas() {
        return itftVlrDespesas;
    }

    public void setItftVlrDespesas(BigDecimal itftVlrDespesas) {
        this.itftVlrDespesas = itftVlrDespesas;
    }

    public BigDecimal getItftVlrSeguro() {
        return itftVlrSeguro;
    }

    public void setItftVlrSeguro(BigDecimal itftVlrSeguro) {
        this.itftVlrSeguro = itftVlrSeguro;
    }

    public BigDecimal getItftVlrDescontoSobreTotal() {
        return itftVlrDescontoSobreTotal;
    }

    public void setItftVlrDescontoSobreTotal(BigDecimal itftVlrDescontoSobreTotal) {
        this.itftVlrDescontoSobreTotal = itftVlrDescontoSobreTotal;
    }

    public BigDecimal getItftVlrFinal() {
        return itftVlrFinal;
    }

    public void setItftVlrFinal(BigDecimal itftVlrFinal) {
        this.itftVlrFinal = itftVlrFinal;
    }

    public BigDecimal getItftVlrTributos() {
        return itftVlrTributos;
    }

    public void setItftVlrTributos(BigDecimal itftVlrTributos) {
        this.itftVlrTributos = itftVlrTributos;
    }

    public BigDecimal getItftVlrContabil() {
        return itftVlrContabil;
    }

    public void setItftVlrContabil(BigDecimal itftVlrContabil) {
        this.itftVlrContabil = itftVlrContabil;
    }

    public String getItftProdDescricao() {
        return itftProdDescricao;
    }

    public void setItftProdDescricao(String itftProdDescricao) {
        this.itftProdDescricao = itftProdDescricao;
    }

    public BigDecimal getItftPrecoTabela() {
        return itftPrecoTabela;
    }

    public void setItftPrecoTabela(BigDecimal itftPrecoTabela) {
        this.itftPrecoTabela = itftPrecoTabela;
    }

    public String getItftMensagem() {
        return itftMensagem;
    }

    public void setItftMensagem(String itftMensagem) {
        this.itftMensagem = itftMensagem;
    }

    public BigDecimal getItftDiferencialAliquota() {
        return itftDiferencialAliquota;
    }

    public void setItftDiferencialAliquota(BigDecimal itftDiferencialAliquota) {
        this.itftDiferencialAliquota = itftDiferencialAliquota;
    }

    public BigDecimal getItftAliqIcmsDestino() {
        return itftAliqIcmsDestino;
    }

    public void setItftAliqIcmsDestino(BigDecimal itftAliqIcmsDestino) {
        this.itftAliqIcmsDestino = itftAliqIcmsDestino;
    }

    public BigDecimal getItftAliqIcmsOrigem() {
        return itftAliqIcmsOrigem;
    }

    public void setItftAliqIcmsOrigem(BigDecimal itftAliqIcmsOrigem) {
        this.itftAliqIcmsOrigem = itftAliqIcmsOrigem;
    }

    public BigDecimal getItftBaseIcms() {
        return itftBaseIcms;
    }

    public void setItftBaseIcms(BigDecimal itftBaseIcms) {
        this.itftBaseIcms = itftBaseIcms;
    }

    public BigDecimal getItftIndiceReducao() {
        return itftIndiceReducao;
    }

    public void setItftIndiceReducao(BigDecimal itftIndiceReducao) {
        this.itftIndiceReducao = itftIndiceReducao;
    }

    public BigDecimal getItftValorIss() {
        return itftValorIss;
    }

    public void setItftValorIss(BigDecimal itftValorIss) {
        this.itftValorIss = itftValorIss;
    }

    public BigDecimal getItftAliqIss() {
        return itftAliqIss;
    }

    public void setItftAliqIss(BigDecimal itftAliqIss) {
        this.itftAliqIss = itftAliqIss;
    }

    public BigDecimal getItftBaseIss() {
        return itftBaseIss;
    }

    public void setItftBaseIss(BigDecimal itftBaseIss) {
        this.itftBaseIss = itftBaseIss;
    }

    public String getItftRegFiscalTribDestino() {
        return itftRegFiscalTribDestino;
    }

    public void setItftRegFiscalTribDestino(String itftRegFiscalTribDestino) {
        this.itftRegFiscalTribDestino = itftRegFiscalTribDestino;
    }

    public String getItftRegFiscalTribOrigem() {
        return itftRegFiscalTribOrigem;
    }

    public void setItftRegFiscalTribOrigem(String itftRegFiscalTribOrigem) {
        this.itftRegFiscalTribOrigem = itftRegFiscalTribOrigem;
    }

    public String getItftCstIpi() {
        return itftCstIpi;
    }

    public void setItftCstIpi(String itftCstIpi) {
        this.itftCstIpi = itftCstIpi;
    }

    public String getItftCst() {
        return itftCst;
    }

    public void setItftCst(String itftCst) {
        this.itftCst = itftCst;
    }

    public String getItftCfo() {
        return itftCfo;
    }

    public void setItftCfo(String itftCfo) {
        this.itftCfo = itftCfo;
    }

    public BigDecimal getItftCustoMedioAnterior() {
        return itftCustoMedioAnterior;
    }

    public void setItftCustoMedioAnterior(BigDecimal itftCustoMedioAnterior) {
        this.itftCustoMedioAnterior = itftCustoMedioAnterior;
    }

    public BigDecimal getItftCustoNaOperacao() {
        return itftCustoNaOperacao;
    }

    public void setItftCustoNaOperacao(BigDecimal itftCustoNaOperacao) {
        this.itftCustoNaOperacao = itftCustoNaOperacao;
    }

    public BigDecimal getItftValorIcms() {
        return itftValorIcms;
    }

    public void setItftValorIcms(BigDecimal itftValorIcms) {
        this.itftValorIcms = itftValorIcms;
    }

    public BigDecimal getItftIva() {
        return itftIva;
    }

    public void setItftIva(BigDecimal itftIva) {
        this.itftIva = itftIva;
    }

    public BigDecimal getItftBaseSubstituicao() {
        return itftBaseSubstituicao;
    }

    public void setItftBaseSubstituicao(BigDecimal itftBaseSubstituicao) {
        this.itftBaseSubstituicao = itftBaseSubstituicao;
    }

    public BigDecimal getItftIcmsRetidoSaida() {
        return itftIcmsRetidoSaida;
    }

    public void setItftIcmsRetidoSaida(BigDecimal itftIcmsRetidoSaida) {
        this.itftIcmsRetidoSaida = itftIcmsRetidoSaida;
    }

    public BigDecimal getItftBaseRtdEntrada() {
        return itftBaseRtdEntrada;
    }

    public void setItftBaseRtdEntrada(BigDecimal itftBaseRtdEntrada) {
        this.itftBaseRtdEntrada = itftBaseRtdEntrada;
    }

    public BigDecimal getItftIcmsRetidoEntrada() {
        return itftIcmsRetidoEntrada;
    }

    public void setItftIcmsRetidoEntrada(BigDecimal itftIcmsRetidoEntrada) {
        this.itftIcmsRetidoEntrada = itftIcmsRetidoEntrada;
    }

    public BigDecimal getItftBaseIpi() {
        return itftBaseIpi;
    }

    public void setItftBaseIpi(BigDecimal itftBaseIpi) {
        this.itftBaseIpi = itftBaseIpi;
    }

    public BigDecimal getItftAliqIpi() {
        return itftAliqIpi;
    }

    public void setItftAliqIpi(BigDecimal itftAliqIpi) {
        this.itftAliqIpi = itftAliqIpi;
    }

    public BigDecimal getItftValorIpi() {
        return itftValorIpi;
    }

    public void setItftValorIpi(BigDecimal itftValorIpi) {
        this.itftValorIpi = itftValorIpi;
    }

    public BigDecimal getItftBaseIsenta() {
        return itftBaseIsenta;
    }

    public void setItftBaseIsenta(BigDecimal itftBaseIsenta) {
        this.itftBaseIsenta = itftBaseIsenta;
    }

    public BigDecimal getItftBaseOutr() {
        return itftBaseOutr;
    }

    public void setItftBaseOutr(BigDecimal itftBaseOutr) {
        this.itftBaseOutr = itftBaseOutr;
    }

    public BigDecimal getItftBasePis() {
        return itftBasePis;
    }

    public void setItftBasePis(BigDecimal itftBasePis) {
        this.itftBasePis = itftBasePis;
    }

    public BigDecimal getItftAliqPis() {
        return itftAliqPis;
    }

    public void setItftAliqPis(BigDecimal itftAliqPis) {
        this.itftAliqPis = itftAliqPis;
    }

    public BigDecimal getItftValorPis() {
        return itftValorPis;
    }

    public void setItftValorPis(BigDecimal itftValorPis) {
        this.itftValorPis = itftValorPis;
    }

    public BigDecimal getItftBaseCofins() {
        return itftBaseCofins;
    }

    public void setItftBaseCofins(BigDecimal itftBaseCofins) {
        this.itftBaseCofins = itftBaseCofins;
    }

    public BigDecimal getItftAliqCofins() {
        return itftAliqCofins;
    }

    public void setItftAliqCofins(BigDecimal itftAliqCofins) {
        this.itftAliqCofins = itftAliqCofins;
    }

    public BigDecimal getItftValorCofins() {
        return itftValorCofins;
    }

    public void setItftValorCofins(BigDecimal itftValorCofins) {
        this.itftValorCofins = itftValorCofins;
    }

    public BigDecimal getItftPisRetido() {
        return itftPisRetido;
    }

    public void setItftPisRetido(BigDecimal itftPisRetido) {
        this.itftPisRetido = itftPisRetido;
    }

    public BigDecimal getItftCofinsRetido() {
        return itftCofinsRetido;
    }

    public void setItftCofinsRetido(BigDecimal itftCofinsRetido) {
        this.itftCofinsRetido = itftCofinsRetido;
    }

    public BigDecimal getItftBaseIssRetido() {
        return itftBaseIssRetido;
    }

    public void setItftBaseIssRetido(BigDecimal itftBaseIssRetido) {
        this.itftBaseIssRetido = itftBaseIssRetido;
    }

    public BigDecimal getItftAliqIssRetido() {
        return itftAliqIssRetido;
    }

    public void setItftAliqIssRetido(BigDecimal itftAliqIssRetido) {
        this.itftAliqIssRetido = itftAliqIssRetido;
    }

    public BigDecimal getItftIssRetido() {
        return itftIssRetido;
    }

    public void setItftIssRetido(BigDecimal itftIssRetido) {
        this.itftIssRetido = itftIssRetido;
    }

    public BigDecimal getItftBaseIr() {
        return itftBaseIr;
    }

    public void setItftBaseIr(BigDecimal itftBaseIr) {
        this.itftBaseIr = itftBaseIr;
    }

    public BigDecimal getItftAliquotaIr() {
        return itftAliquotaIr;
    }

    public void setItftAliquotaIr(BigDecimal itftAliquotaIr) {
        this.itftAliquotaIr = itftAliquotaIr;
    }

    public BigDecimal getItftValorIr() {
        return itftValorIr;
    }

    public void setItftValorIr(BigDecimal itftValorIr) {
        this.itftValorIr = itftValorIr;
    }

    public BigDecimal getItftIrRetido() {
        return itftIrRetido;
    }

    public void setItftIrRetido(BigDecimal itftIrRetido) {
        this.itftIrRetido = itftIrRetido;
    }

    public BigDecimal getItftBaseCsll() {
        return itftBaseCsll;
    }

    public void setItftBaseCsll(BigDecimal itftBaseCsll) {
        this.itftBaseCsll = itftBaseCsll;
    }

    public BigDecimal getItftAliquotaCsll() {
        return itftAliquotaCsll;
    }

    public void setItftAliquotaCsll(BigDecimal itftAliquotaCsll) {
        this.itftAliquotaCsll = itftAliquotaCsll;
    }

    public BigDecimal getItftValorCsll() {
        return itftValorCsll;
    }

    public void setItftValorCsll(BigDecimal itftValorCsll) {
        this.itftValorCsll = itftValorCsll;
    }

    public BigDecimal getItftAdiantamentoCsll() {
        return itftAdiantamentoCsll;
    }

    public void setItftAdiantamentoCsll(BigDecimal itftAdiantamentoCsll) {
        this.itftAdiantamentoCsll = itftAdiantamentoCsll;
    }

    public BigDecimal getItftOutrasDespAces() {
        return itftOutrasDespAces;
    }

    public void setItftOutrasDespAces(BigDecimal itftOutrasDespAces) {
        this.itftOutrasDespAces = itftOutrasDespAces;
    }

    public String getDocDcfsId() {
        return docDcfsId;
    }

    public void setDocDcfsId(String docDcfsId) {
        this.docDcfsId = docDcfsId;
    }

    public BigDecimal getItftPesoBruto() {
        return itftPesoBruto;
    }

    public void setItftPesoBruto(BigDecimal itftPesoBruto) {
        this.itftPesoBruto = itftPesoBruto;
    }

    public BigDecimal getItftPesoLiquido() {
        return itftPesoLiquido;
    }

    public void setItftPesoLiquido(BigDecimal itftPesoLiquido) {
        this.itftPesoLiquido = itftPesoLiquido;
    }

    public Integer getItftNumeroItem() {
        return itftNumeroItem;
    }

    public void setItftNumeroItem(Integer itftNumeroItem) {
        this.itftNumeroItem = itftNumeroItem;
    }

    public BigDecimal getItftBasePisRetido() {
        return itftBasePisRetido;
    }

    public void setItftBasePisRetido(BigDecimal itftBasePisRetido) {
        this.itftBasePisRetido = itftBasePisRetido;
    }

    public BigDecimal getItftAliqPisRetido() {
        return itftAliqPisRetido;
    }

    public void setItftAliqPisRetido(BigDecimal itftAliqPisRetido) {
        this.itftAliqPisRetido = itftAliqPisRetido;
    }

    public BigDecimal getItftBaseCofinsRetido() {
        return itftBaseCofinsRetido;
    }

    public void setItftBaseCofinsRetido(BigDecimal itftBaseCofinsRetido) {
        this.itftBaseCofinsRetido = itftBaseCofinsRetido;
    }

    public BigDecimal getItftAliqCofinsRetido() {
        return itftAliqCofinsRetido;
    }

    public void setItftAliqCofinsRetido(BigDecimal itftAliqCofinsRetido) {
        this.itftAliqCofinsRetido = itftAliqCofinsRetido;
    }

    public String getItftCstPis() {
        return itftCstPis;
    }

    public void setItftCstPis(String itftCstPis) {
        this.itftCstPis = itftCstPis;
    }

    public String getItftCstCofins() {
        return itftCstCofins;
    }

    public void setItftCstCofins(String itftCstCofins) {
        this.itftCstCofins = itftCstCofins;
    }

    public Date getItFtLASTUPDATE() {
        return itFtLASTUPDATE;
    }

    public void setItFtLASTUPDATE(Date itFtLASTUPDATE) {
        this.itFtLASTUPDATE = itFtLASTUPDATE;
    }

    public BigDecimal getItftUltPrcCompra() {
        return itftUltPrcCompra;
    }

    public void setItftUltPrcCompra(BigDecimal itftUltPrcCompra) {
        this.itftUltPrcCompra = itftUltPrcCompra;
    }

    public BigDecimal getItftAliqCredSn() {
        return itftAliqCredSn;
    }

    public void setItftAliqCredSn(BigDecimal itftAliqCredSn) {
        this.itftAliqCredSn = itftAliqCredSn;
    }

    public BigDecimal getItftCredSn() {
        return itftCredSn;
    }

    public void setItftCredSn(BigDecimal itftCredSn) {
        this.itftCredSn = itftCredSn;
    }

    public String getItftCsosn() {
        return itftCsosn;
    }

    public void setItftCsosn(String itftCsosn) {
        this.itftCsosn = itftCsosn;
    }

    public BigDecimal getItftBaseImportacao() {
        return itftBaseImportacao;
    }

    public void setItftBaseImportacao(BigDecimal itftBaseImportacao) {
        this.itftBaseImportacao = itftBaseImportacao;
    }

    public BigDecimal getItftImpImportacao() {
        return itftImpImportacao;
    }

    public void setItftImpImportacao(BigDecimal itftImpImportacao) {
        this.itftImpImportacao = itftImpImportacao;
    }

    public BigDecimal getItftValorIof() {
        return itftValorIof;
    }

    public void setItftValorIof(BigDecimal itftValorIof) {
        this.itftValorIof = itftValorIof;
    }

    public BigDecimal getItftDespesasAdu() {
        return itftDespesasAdu;
    }

    public void setItftDespesasAdu(BigDecimal itftDespesasAdu) {
        this.itftDespesasAdu = itftDespesasAdu;
    }

    public BigDecimal getItftQtdeEntregue() {
        return itftQtdeEntregue;
    }

    public void setItftQtdeEntregue(BigDecimal itftQtdeEntregue) {
        this.itftQtdeEntregue = itftQtdeEntregue;
    }

    public BigDecimal getItftAliqIcmsDestinoInterna() {
        return itftAliqIcmsDestinoInterna;
    }

    public void setItftAliqIcmsDestinoInterna(BigDecimal itftAliqIcmsDestinoInterna) {
        this.itftAliqIcmsDestinoInterna = itftAliqIcmsDestinoInterna;
    }

    public BigDecimal getItftAliqFcpDestino() {
        return itftAliqFcpDestino;
    }

    public void setItftAliqFcpDestino(BigDecimal itftAliqFcpDestino) {
        this.itftAliqFcpDestino = itftAliqFcpDestino;
    }

    public BigDecimal getItftAliqIcmsDestinoExterna() {
        return itftAliqIcmsDestinoExterna;
    }

    public void setItftAliqIcmsDestinoExterna(BigDecimal itftAliqIcmsDestinoExterna) {
        this.itftAliqIcmsDestinoExterna = itftAliqIcmsDestinoExterna;
    }

    public BigDecimal getItftDifalOrigem() {
        return itftDifalOrigem;
    }

    public void setItftDifalOrigem(BigDecimal itftDifalOrigem) {
        this.itftDifalOrigem = itftDifalOrigem;
    }

    public BigDecimal getItftDifalDestino() {
        return itftDifalDestino;
    }

    public void setItftDifalDestino(BigDecimal itftDifalDestino) {
        this.itftDifalDestino = itftDifalDestino;
    }

    @XmlTransient
    public List<SaldosEstoquesDiario> getSaldosEstoquesDiarioList() {
        return saldosEstoquesDiarioList;
    }

    public void setSaldosEstoquesDiarioList(List<SaldosEstoquesDiario> saldosEstoquesDiarioList) {
        this.saldosEstoquesDiarioList = saldosEstoquesDiarioList;
    }

    public ClassificacaoFiscal getClfcId() {
        return clfcId;
    }

    public void setClfcId(ClassificacaoFiscal clfcId) {
        this.clfcId = clfcId;
    }

    public DocumentosFiscais getDcfsId() {
        return dcfsId;
    }

    public void setDcfsId(DocumentosFiscais dcfsId) {
        this.dcfsId = dcfsId;
    }

    @XmlTransient
    public List<ItensFaturados> getItensFaturadosList() {
        return itensFaturadosList;
    }

    public void setItensFaturadosList(List<ItensFaturados> itensFaturadosList) {
        this.itensFaturadosList = itensFaturadosList;
    }

    public ItensFaturados getIteItftId() {
        return iteItftId;
    }

    public void setIteItftId(ItensFaturados iteItftId) {
        this.iteItftId = iteItftId;
    }

    public ItensPedidos getItpdId() {
        return itpdId;
    }

    public void setItpdId(ItensPedidos itpdId) {
        this.itpdId = itpdId;
    }

    public MensagensNotaFiscal getMsnfId() {
        return msnfId;
    }

    public void setMsnfId(MensagensNotaFiscal msnfId) {
        this.msnfId = msnfId;
    }

    public Produtos getProdId() {
        return prodId;
    }

    public void setProdId(Produtos prodId) {
        this.prodId = prodId;
    }

    public TiposEstoques getTestId() {
        return testId;
    }

    public void setTestId(TiposEstoques testId) {
        this.testId = testId;
    }

    @XmlTransient
    public List<DeclaracaoImportacao> getDeclaracaoImportacaoList() {
        return declaracaoImportacaoList;
    }

    public void setDeclaracaoImportacaoList(List<DeclaracaoImportacao> declaracaoImportacaoList) {
        this.declaracaoImportacaoList = declaracaoImportacaoList;
    }

    @XmlTransient
    public List<ProdutosSeries> getProdutosSeriesList() {
        return produtosSeriesList;
    }

    public void setProdutosSeriesList(List<ProdutosSeries> produtosSeriesList) {
        this.produtosSeriesList = produtosSeriesList;
    }

    @XmlTransient
    public List<ItensComissoesTecnicos> getItensComissoesTecnicosList() {
        return itensComissoesTecnicosList;
    }

    public void setItensComissoesTecnicosList(List<ItensComissoesTecnicos> itensComissoesTecnicosList) {
        this.itensComissoesTecnicosList = itensComissoesTecnicosList;
    }

    @XmlTransient
    public List<ItensEntregados> getItensEntregadosList() {
        return itensEntregadosList;
    }

    public void setItensEntregadosList(List<ItensEntregados> itensEntregadosList) {
        this.itensEntregadosList = itensEntregadosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itftId != null ? itftId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItensFaturados)) {
            return false;
        }
        ItensFaturados other = (ItensFaturados) object;
        if ((this.itftId == null && other.itftId != null) || (this.itftId != null && !this.itftId.equals(other.itftId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.ItensFaturados[ itftId=" + itftId + " ]";
    }
    
}
