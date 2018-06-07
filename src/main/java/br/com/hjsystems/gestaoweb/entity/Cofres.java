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
@Table(name = "COFRES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cofres.findAll", query = "SELECT c FROM Cofres c"),
    @NamedQuery(name = "Cofres.findByCofrId", query = "SELECT c FROM Cofres c WHERE c.cofrId = :cofrId"),
    @NamedQuery(name = "Cofres.findByCofrNome", query = "SELECT c FROM Cofres c WHERE c.cofrNome = :cofrNome"),
    @NamedQuery(name = "Cofres.findByCofrCodigo", query = "SELECT c FROM Cofres c WHERE c.cofrCodigo = :cofrCodigo"),
    @NamedQuery(name = "Cofres.findByCofrProximoNumero", query = "SELECT c FROM Cofres c WHERE c.cofrProximoNumero = :cofrProximoNumero"),
    @NamedQuery(name = "Cofres.findByCofrTipo", query = "SELECT c FROM Cofres c WHERE c.cofrTipo = :cofrTipo"),
    @NamedQuery(name = "Cofres.findByCofrTipoCobranca", query = "SELECT c FROM Cofres c WHERE c.cofrTipoCobranca = :cofrTipoCobranca"),
    @NamedQuery(name = "Cofres.findByCofrLocalPagamento", query = "SELECT c FROM Cofres c WHERE c.cofrLocalPagamento = :cofrLocalPagamento"),
    @NamedQuery(name = "Cofres.findByCofrConta", query = "SELECT c FROM Cofres c WHERE c.cofrConta = :cofrConta"),
    @NamedQuery(name = "Cofres.findByCofrContaDigito", query = "SELECT c FROM Cofres c WHERE c.cofrContaDigito = :cofrContaDigito"),
    @NamedQuery(name = "Cofres.findByCofrCarteira", query = "SELECT c FROM Cofres c WHERE c.cofrCarteira = :cofrCarteira"),
    @NamedQuery(name = "Cofres.findByCofrVariacao", query = "SELECT c FROM Cofres c WHERE c.cofrVariacao = :cofrVariacao"),
    @NamedQuery(name = "Cofres.findByCofrBoletoSeqInicial", query = "SELECT c FROM Cofres c WHERE c.cofrBoletoSeqInicial = :cofrBoletoSeqInicial"),
    @NamedQuery(name = "Cofres.findByCofrBoletoSeqAtual", query = "SELECT c FROM Cofres c WHERE c.cofrBoletoSeqAtual = :cofrBoletoSeqAtual"),
    @NamedQuery(name = "Cofres.findByCofrBoletoSeqFinal", query = "SELECT c FROM Cofres c WHERE c.cofrBoletoSeqFinal = :cofrBoletoSeqFinal"),
    @NamedQuery(name = "Cofres.findByCofrBoletoQtdMinimaSeq", query = "SELECT c FROM Cofres c WHERE c.cofrBoletoQtdMinimaSeq = :cofrBoletoQtdMinimaSeq"),
    @NamedQuery(name = "Cofres.findByCofrBoletoProxSeqInicial", query = "SELECT c FROM Cofres c WHERE c.cofrBoletoProxSeqInicial = :cofrBoletoProxSeqInicial"),
    @NamedQuery(name = "Cofres.findByCofrBoletoProxSeqFinal", query = "SELECT c FROM Cofres c WHERE c.cofrBoletoProxSeqFinal = :cofrBoletoProxSeqFinal"),
    @NamedQuery(name = "Cofres.findByCofrCodigoCedente", query = "SELECT c FROM Cofres c WHERE c.cofrCodigoCedente = :cofrCodigoCedente"),
    @NamedQuery(name = "Cofres.findByCofrDigitoCedente", query = "SELECT c FROM Cofres c WHERE c.cofrDigitoCedente = :cofrDigitoCedente"),
    @NamedQuery(name = "Cofres.findByCofrInstrucaoA", query = "SELECT c FROM Cofres c WHERE c.cofrInstrucaoA = :cofrInstrucaoA"),
    @NamedQuery(name = "Cofres.findByCofrInstrucaoB", query = "SELECT c FROM Cofres c WHERE c.cofrInstrucaoB = :cofrInstrucaoB"),
    @NamedQuery(name = "Cofres.findByCofrConvenio", query = "SELECT c FROM Cofres c WHERE c.cofrConvenio = :cofrConvenio"),
    @NamedQuery(name = "Cofres.findByCofrProxNroAviso", query = "SELECT c FROM Cofres c WHERE c.cofrProxNroAviso = :cofrProxNroAviso"),
    @NamedQuery(name = "Cofres.findByCofrDiretorioRemessa", query = "SELECT c FROM Cofres c WHERE c.cofrDiretorioRemessa = :cofrDiretorioRemessa"),
    @NamedQuery(name = "Cofres.findByCofrDiretorioRetorno", query = "SELECT c FROM Cofres c WHERE c.cofrDiretorioRetorno = :cofrDiretorioRetorno"),
    @NamedQuery(name = "Cofres.findByCofrTipoLayout", query = "SELECT c FROM Cofres c WHERE c.cofrTipoLayout = :cofrTipoLayout"),
    @NamedQuery(name = "Cofres.findByCofrEmitidoPor", query = "SELECT c FROM Cofres c WHERE c.cofrEmitidoPor = :cofrEmitidoPor"),
    @NamedQuery(name = "Cofres.findByCofrChequeSeqInicial", query = "SELECT c FROM Cofres c WHERE c.cofrChequeSeqInicial = :cofrChequeSeqInicial"),
    @NamedQuery(name = "Cofres.findByCofrChequeSeqAtual", query = "SELECT c FROM Cofres c WHERE c.cofrChequeSeqAtual = :cofrChequeSeqAtual"),
    @NamedQuery(name = "Cofres.findByCofrChequeSeqFinal", query = "SELECT c FROM Cofres c WHERE c.cofrChequeSeqFinal = :cofrChequeSeqFinal"),
    @NamedQuery(name = "Cofres.findByMdchId", query = "SELECT c FROM Cofres c WHERE c.mdchId = :mdchId"),
    @NamedQuery(name = "Cofres.findByCofrBoletoLayout", query = "SELECT c FROM Cofres c WHERE c.cofrBoletoLayout = :cofrBoletoLayout"),
    @NamedQuery(name = "Cofres.findByCofrLASTUPDATE", query = "SELECT c FROM Cofres c WHERE c.cofrLASTUPDATE = :cofrLASTUPDATE"),
    @NamedQuery(name = "Cofres.findByCofrMulta", query = "SELECT c FROM Cofres c WHERE c.cofrMulta = :cofrMulta"),
    @NamedQuery(name = "Cofres.findByCofrJuros", query = "SELECT c FROM Cofres c WHERE c.cofrJuros = :cofrJuros"),
    @NamedQuery(name = "Cofres.findByCofrNrremessa", query = "SELECT c FROM Cofres c WHERE c.cofrNrremessa = :cofrNrremessa"),
    @NamedQuery(name = "Cofres.findByCofrAceite", query = "SELECT c FROM Cofres c WHERE c.cofrAceite = :cofrAceite"),
    @NamedQuery(name = "Cofres.findByCofrAtivoVendas", query = "SELECT c FROM Cofres c WHERE c.cofrAtivoVendas = :cofrAtivoVendas"),
    @NamedQuery(name = "Cofres.findByCofrCodigoCarteira", query = "SELECT c FROM Cofres c WHERE c.cofrCodigoCarteira = :cofrCodigoCarteira"),
    @NamedQuery(name = "Cofres.findByCofrCodigoBaixaDevolucao", query = "SELECT c FROM Cofres c WHERE c.cofrCodigoBaixaDevolucao = :cofrCodigoBaixaDevolucao"),
    @NamedQuery(name = "Cofres.findByCofrDiasBaixaDevolucao", query = "SELECT c FROM Cofres c WHERE c.cofrDiasBaixaDevolucao = :cofrDiasBaixaDevolucao")})
public class Cofres implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COFR_ID")
    private String cofrId;
    @Basic(optional = false)
    @Column(name = "COFR_NOME")
    private String cofrNome;
    @Column(name = "COFR_CODIGO")
    private String cofrCodigo;
    @Column(name = "COFR_PROXIMO_NUMERO")
    private String cofrProximoNumero;
    @Column(name = "COFR_TIPO")
    private String cofrTipo;
    @Column(name = "COFR_TIPO_COBRANCA")
    private String cofrTipoCobranca;
    @Column(name = "COFR_LOCAL_PAGAMENTO")
    private String cofrLocalPagamento;
    @Lob
    @Column(name = "COFR_INSTRUCOES")
    private String cofrInstrucoes;
    @Column(name = "COFR_CONTA")
    private String cofrConta;
    @Column(name = "COFR_CONTA_DIGITO")
    private String cofrContaDigito;
    @Column(name = "COFR_CARTEIRA")
    private String cofrCarteira;
    @Column(name = "COFR_VARIACAO")
    private String cofrVariacao;
    @Column(name = "COFR_BOLETO_SEQ_INICIAL")
    private String cofrBoletoSeqInicial;
    @Column(name = "COFR_BOLETO_SEQ_ATUAL")
    private String cofrBoletoSeqAtual;
    @Column(name = "COFR_BOLETO_SEQ_FINAL")
    private String cofrBoletoSeqFinal;
    @Column(name = "COFR_BOLETO_QTD_MINIMA_SEQ")
    private Long cofrBoletoQtdMinimaSeq;
    @Column(name = "COFR_BOLETO_PROX_SEQ_INICIAL")
    private String cofrBoletoProxSeqInicial;
    @Column(name = "COFR_BOLETO_PROX_SEQ_FINAL")
    private String cofrBoletoProxSeqFinal;
    @Column(name = "COFR_CODIGO_CEDENTE")
    private String cofrCodigoCedente;
    @Column(name = "COFR_DIGITO_CEDENTE")
    private Character cofrDigitoCedente;
    @Column(name = "COFR_INSTRUCAO_A")
    private String cofrInstrucaoA;
    @Column(name = "COFR_INSTRUCAO_B")
    private String cofrInstrucaoB;
    @Column(name = "COFR_CONVENIO")
    private String cofrConvenio;
    @Column(name = "COFR_PROX_NRO_AVISO")
    private Integer cofrProxNroAviso;
    @Column(name = "COFR_DIRETORIO_REMESSA")
    private String cofrDiretorioRemessa;
    @Column(name = "COFR_DIRETORIO_RETORNO")
    private String cofrDiretorioRetorno;
    @Column(name = "COFR_TIPO_LAYOUT")
    private String cofrTipoLayout;
    @Column(name = "COFR_EMITIDO_POR")
    private String cofrEmitidoPor;
    @Column(name = "COFR_CHEQUE_SEQ_INICIAL")
    private Long cofrChequeSeqInicial;
    @Column(name = "COFR_CHEQUE_SEQ_ATUAL")
    private Long cofrChequeSeqAtual;
    @Column(name = "COFR_CHEQUE_SEQ_FINAL")
    private Long cofrChequeSeqFinal;
    @Column(name = "MDCH_ID")
    private String mdchId;
    @Column(name = "COFR_BOLETO_LAYOUT")
    private String cofrBoletoLayout;
    @Column(name = "Cofr_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cofrLASTUPDATE;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "COFR_MULTA")
    private BigDecimal cofrMulta;
    @Basic(optional = false)
    @Column(name = "COFR_JUROS")
    private BigDecimal cofrJuros;
    @Column(name = "COFR_NRREMESSA")
    private String cofrNrremessa;
    @Column(name = "COFR_ACEITE")
    private String cofrAceite;
    @Basic(optional = false)
    @Column(name = "COFR_ATIVO_VENDAS")
    private String cofrAtivoVendas;
    @Column(name = "COFR_CODIGO_CARTEIRA")
    private Character cofrCodigoCarteira;
    @Column(name = "COFR_CODIGO_BAIXA_DEVOLUCAO")
    private Character cofrCodigoBaixaDevolucao;
    @Column(name = "COFR_DIAS_BAIXA_DEVOLUCAO")
    private String cofrDiasBaixaDevolucao;
    @OneToMany(mappedBy = "cofrId")
    private List<HistoricosParcela> historicosParcelaList;
    @JoinColumn(name = "AGEN_ID", referencedColumnName = "AGEN_ID")
    @ManyToOne
    private Agencias agenId;
    @JoinColumn(name = "PESS_ID", referencedColumnName = "PESS_ID")
    @ManyToOne
    private Pessoas pessId;
    @JoinColumn(name = "PLA_PLCT_ID", referencedColumnName = "PLCT_ID")
    @ManyToOne
    private PlanoContas plaPlctId;
    @JoinColumn(name = "PLCT_ID", referencedColumnName = "PLCT_ID")
    @ManyToOne
    private PlanoContas plctId;
    @OneToMany(mappedBy = "cofrId")
    private List<CofresEspecies> cofresEspeciesList;
    @OneToMany(mappedBy = "cofrId")
    private List<ModelosBoletos> modelosBoletosList;
    @OneToMany(mappedBy = "cofrId")
    private List<NegociacoesOrcamento> negociacoesOrcamentoList;
    @OneToMany(mappedBy = "cofrId")
    private List<ResponsaveisCofres> responsaveisCofresList;
    @OneToMany(mappedBy = "cofrId")
    private List<PagamentosContas> pagamentosContasList;
    @OneToMany(mappedBy = "cofrId")
    private List<Cheques> chequesList;
    @OneToMany(mappedBy = "cofCofrId")
    private List<Parcelas> parcelasList;
    @OneToMany(mappedBy = "cofrId")
    private List<Parcelas> parcelasList1;
    @OneToMany(mappedBy = "cofCofrId2")
    private List<Parcelas> parcelasList2;
    @OneToMany(mappedBy = "cofrId")
    private List<Clientes> clientesList;
    @OneToMany(mappedBy = "cofCofrId")
    private List<BorderoMovParcelas> borderoMovParcelasList;
    @OneToMany(mappedBy = "cofrId")
    private List<BorderoMovParcelas> borderoMovParcelasList1;
    @OneToMany(mappedBy = "cofrId")
    private List<NegociacoesPedidos> negociacoesPedidosList;
    @OneToMany(mappedBy = "cofrId")
    private List<OrdemServico> ordemServicoList;
    @OneToMany(mappedBy = "cofrId")
    private List<HistoricosCheques> historicosChequesList;
    @OneToMany(mappedBy = "cofrId")
    private List<MovimentosCaixas> movimentosCaixasList;

    public Cofres() {
    }

    public Cofres(String cofrId) {
        this.cofrId = cofrId;
    }

    public Cofres(String cofrId, String cofrNome, BigDecimal cofrMulta, BigDecimal cofrJuros, String cofrAtivoVendas) {
        this.cofrId = cofrId;
        this.cofrNome = cofrNome;
        this.cofrMulta = cofrMulta;
        this.cofrJuros = cofrJuros;
        this.cofrAtivoVendas = cofrAtivoVendas;
    }

    public String getCofrId() {
        return cofrId;
    }

    public void setCofrId(String cofrId) {
        this.cofrId = cofrId;
    }

    public String getCofrNome() {
        return cofrNome;
    }

    public void setCofrNome(String cofrNome) {
        this.cofrNome = cofrNome;
    }

    public String getCofrCodigo() {
        return cofrCodigo;
    }

    public void setCofrCodigo(String cofrCodigo) {
        this.cofrCodigo = cofrCodigo;
    }

    public String getCofrProximoNumero() {
        return cofrProximoNumero;
    }

    public void setCofrProximoNumero(String cofrProximoNumero) {
        this.cofrProximoNumero = cofrProximoNumero;
    }

    public String getCofrTipo() {
        return cofrTipo;
    }

    public void setCofrTipo(String cofrTipo) {
        this.cofrTipo = cofrTipo;
    }

    public String getCofrTipoCobranca() {
        return cofrTipoCobranca;
    }

    public void setCofrTipoCobranca(String cofrTipoCobranca) {
        this.cofrTipoCobranca = cofrTipoCobranca;
    }

    public String getCofrLocalPagamento() {
        return cofrLocalPagamento;
    }

    public void setCofrLocalPagamento(String cofrLocalPagamento) {
        this.cofrLocalPagamento = cofrLocalPagamento;
    }

    public String getCofrInstrucoes() {
        return cofrInstrucoes;
    }

    public void setCofrInstrucoes(String cofrInstrucoes) {
        this.cofrInstrucoes = cofrInstrucoes;
    }

    public String getCofrConta() {
        return cofrConta;
    }

    public void setCofrConta(String cofrConta) {
        this.cofrConta = cofrConta;
    }

    public String getCofrContaDigito() {
        return cofrContaDigito;
    }

    public void setCofrContaDigito(String cofrContaDigito) {
        this.cofrContaDigito = cofrContaDigito;
    }

    public String getCofrCarteira() {
        return cofrCarteira;
    }

    public void setCofrCarteira(String cofrCarteira) {
        this.cofrCarteira = cofrCarteira;
    }

    public String getCofrVariacao() {
        return cofrVariacao;
    }

    public void setCofrVariacao(String cofrVariacao) {
        this.cofrVariacao = cofrVariacao;
    }

    public String getCofrBoletoSeqInicial() {
        return cofrBoletoSeqInicial;
    }

    public void setCofrBoletoSeqInicial(String cofrBoletoSeqInicial) {
        this.cofrBoletoSeqInicial = cofrBoletoSeqInicial;
    }

    public String getCofrBoletoSeqAtual() {
        return cofrBoletoSeqAtual;
    }

    public void setCofrBoletoSeqAtual(String cofrBoletoSeqAtual) {
        this.cofrBoletoSeqAtual = cofrBoletoSeqAtual;
    }

    public String getCofrBoletoSeqFinal() {
        return cofrBoletoSeqFinal;
    }

    public void setCofrBoletoSeqFinal(String cofrBoletoSeqFinal) {
        this.cofrBoletoSeqFinal = cofrBoletoSeqFinal;
    }

    public Long getCofrBoletoQtdMinimaSeq() {
        return cofrBoletoQtdMinimaSeq;
    }

    public void setCofrBoletoQtdMinimaSeq(Long cofrBoletoQtdMinimaSeq) {
        this.cofrBoletoQtdMinimaSeq = cofrBoletoQtdMinimaSeq;
    }

    public String getCofrBoletoProxSeqInicial() {
        return cofrBoletoProxSeqInicial;
    }

    public void setCofrBoletoProxSeqInicial(String cofrBoletoProxSeqInicial) {
        this.cofrBoletoProxSeqInicial = cofrBoletoProxSeqInicial;
    }

    public String getCofrBoletoProxSeqFinal() {
        return cofrBoletoProxSeqFinal;
    }

    public void setCofrBoletoProxSeqFinal(String cofrBoletoProxSeqFinal) {
        this.cofrBoletoProxSeqFinal = cofrBoletoProxSeqFinal;
    }

    public String getCofrCodigoCedente() {
        return cofrCodigoCedente;
    }

    public void setCofrCodigoCedente(String cofrCodigoCedente) {
        this.cofrCodigoCedente = cofrCodigoCedente;
    }

    public Character getCofrDigitoCedente() {
        return cofrDigitoCedente;
    }

    public void setCofrDigitoCedente(Character cofrDigitoCedente) {
        this.cofrDigitoCedente = cofrDigitoCedente;
    }

    public String getCofrInstrucaoA() {
        return cofrInstrucaoA;
    }

    public void setCofrInstrucaoA(String cofrInstrucaoA) {
        this.cofrInstrucaoA = cofrInstrucaoA;
    }

    public String getCofrInstrucaoB() {
        return cofrInstrucaoB;
    }

    public void setCofrInstrucaoB(String cofrInstrucaoB) {
        this.cofrInstrucaoB = cofrInstrucaoB;
    }

    public String getCofrConvenio() {
        return cofrConvenio;
    }

    public void setCofrConvenio(String cofrConvenio) {
        this.cofrConvenio = cofrConvenio;
    }

    public Integer getCofrProxNroAviso() {
        return cofrProxNroAviso;
    }

    public void setCofrProxNroAviso(Integer cofrProxNroAviso) {
        this.cofrProxNroAviso = cofrProxNroAviso;
    }

    public String getCofrDiretorioRemessa() {
        return cofrDiretorioRemessa;
    }

    public void setCofrDiretorioRemessa(String cofrDiretorioRemessa) {
        this.cofrDiretorioRemessa = cofrDiretorioRemessa;
    }

    public String getCofrDiretorioRetorno() {
        return cofrDiretorioRetorno;
    }

    public void setCofrDiretorioRetorno(String cofrDiretorioRetorno) {
        this.cofrDiretorioRetorno = cofrDiretorioRetorno;
    }

    public String getCofrTipoLayout() {
        return cofrTipoLayout;
    }

    public void setCofrTipoLayout(String cofrTipoLayout) {
        this.cofrTipoLayout = cofrTipoLayout;
    }

    public String getCofrEmitidoPor() {
        return cofrEmitidoPor;
    }

    public void setCofrEmitidoPor(String cofrEmitidoPor) {
        this.cofrEmitidoPor = cofrEmitidoPor;
    }

    public Long getCofrChequeSeqInicial() {
        return cofrChequeSeqInicial;
    }

    public void setCofrChequeSeqInicial(Long cofrChequeSeqInicial) {
        this.cofrChequeSeqInicial = cofrChequeSeqInicial;
    }

    public Long getCofrChequeSeqAtual() {
        return cofrChequeSeqAtual;
    }

    public void setCofrChequeSeqAtual(Long cofrChequeSeqAtual) {
        this.cofrChequeSeqAtual = cofrChequeSeqAtual;
    }

    public Long getCofrChequeSeqFinal() {
        return cofrChequeSeqFinal;
    }

    public void setCofrChequeSeqFinal(Long cofrChequeSeqFinal) {
        this.cofrChequeSeqFinal = cofrChequeSeqFinal;
    }

    public String getMdchId() {
        return mdchId;
    }

    public void setMdchId(String mdchId) {
        this.mdchId = mdchId;
    }

    public String getCofrBoletoLayout() {
        return cofrBoletoLayout;
    }

    public void setCofrBoletoLayout(String cofrBoletoLayout) {
        this.cofrBoletoLayout = cofrBoletoLayout;
    }

    public Date getCofrLASTUPDATE() {
        return cofrLASTUPDATE;
    }

    public void setCofrLASTUPDATE(Date cofrLASTUPDATE) {
        this.cofrLASTUPDATE = cofrLASTUPDATE;
    }

    public BigDecimal getCofrMulta() {
        return cofrMulta;
    }

    public void setCofrMulta(BigDecimal cofrMulta) {
        this.cofrMulta = cofrMulta;
    }

    public BigDecimal getCofrJuros() {
        return cofrJuros;
    }

    public void setCofrJuros(BigDecimal cofrJuros) {
        this.cofrJuros = cofrJuros;
    }

    public String getCofrNrremessa() {
        return cofrNrremessa;
    }

    public void setCofrNrremessa(String cofrNrremessa) {
        this.cofrNrremessa = cofrNrremessa;
    }

    public String getCofrAceite() {
        return cofrAceite;
    }

    public void setCofrAceite(String cofrAceite) {
        this.cofrAceite = cofrAceite;
    }

    public String getCofrAtivoVendas() {
        return cofrAtivoVendas;
    }

    public void setCofrAtivoVendas(String cofrAtivoVendas) {
        this.cofrAtivoVendas = cofrAtivoVendas;
    }

    public Character getCofrCodigoCarteira() {
        return cofrCodigoCarteira;
    }

    public void setCofrCodigoCarteira(Character cofrCodigoCarteira) {
        this.cofrCodigoCarteira = cofrCodigoCarteira;
    }

    public Character getCofrCodigoBaixaDevolucao() {
        return cofrCodigoBaixaDevolucao;
    }

    public void setCofrCodigoBaixaDevolucao(Character cofrCodigoBaixaDevolucao) {
        this.cofrCodigoBaixaDevolucao = cofrCodigoBaixaDevolucao;
    }

    public String getCofrDiasBaixaDevolucao() {
        return cofrDiasBaixaDevolucao;
    }

    public void setCofrDiasBaixaDevolucao(String cofrDiasBaixaDevolucao) {
        this.cofrDiasBaixaDevolucao = cofrDiasBaixaDevolucao;
    }

    @XmlTransient
    public List<HistoricosParcela> getHistoricosParcelaList() {
        return historicosParcelaList;
    }

    public void setHistoricosParcelaList(List<HistoricosParcela> historicosParcelaList) {
        this.historicosParcelaList = historicosParcelaList;
    }

    public Agencias getAgenId() {
        return agenId;
    }

    public void setAgenId(Agencias agenId) {
        this.agenId = agenId;
    }

    public Pessoas getPessId() {
        return pessId;
    }

    public void setPessId(Pessoas pessId) {
        this.pessId = pessId;
    }

    public PlanoContas getPlaPlctId() {
        return plaPlctId;
    }

    public void setPlaPlctId(PlanoContas plaPlctId) {
        this.plaPlctId = plaPlctId;
    }

    public PlanoContas getPlctId() {
        return plctId;
    }

    public void setPlctId(PlanoContas plctId) {
        this.plctId = plctId;
    }

    @XmlTransient
    public List<CofresEspecies> getCofresEspeciesList() {
        return cofresEspeciesList;
    }

    public void setCofresEspeciesList(List<CofresEspecies> cofresEspeciesList) {
        this.cofresEspeciesList = cofresEspeciesList;
    }

    @XmlTransient
    public List<ModelosBoletos> getModelosBoletosList() {
        return modelosBoletosList;
    }

    public void setModelosBoletosList(List<ModelosBoletos> modelosBoletosList) {
        this.modelosBoletosList = modelosBoletosList;
    }

    @XmlTransient
    public List<NegociacoesOrcamento> getNegociacoesOrcamentoList() {
        return negociacoesOrcamentoList;
    }

    public void setNegociacoesOrcamentoList(List<NegociacoesOrcamento> negociacoesOrcamentoList) {
        this.negociacoesOrcamentoList = negociacoesOrcamentoList;
    }

    @XmlTransient
    public List<ResponsaveisCofres> getResponsaveisCofresList() {
        return responsaveisCofresList;
    }

    public void setResponsaveisCofresList(List<ResponsaveisCofres> responsaveisCofresList) {
        this.responsaveisCofresList = responsaveisCofresList;
    }

    @XmlTransient
    public List<PagamentosContas> getPagamentosContasList() {
        return pagamentosContasList;
    }

    public void setPagamentosContasList(List<PagamentosContas> pagamentosContasList) {
        this.pagamentosContasList = pagamentosContasList;
    }

    @XmlTransient
    public List<Cheques> getChequesList() {
        return chequesList;
    }

    public void setChequesList(List<Cheques> chequesList) {
        this.chequesList = chequesList;
    }

    @XmlTransient
    public List<Parcelas> getParcelasList() {
        return parcelasList;
    }

    public void setParcelasList(List<Parcelas> parcelasList) {
        this.parcelasList = parcelasList;
    }

    @XmlTransient
    public List<Parcelas> getParcelasList1() {
        return parcelasList1;
    }

    public void setParcelasList1(List<Parcelas> parcelasList1) {
        this.parcelasList1 = parcelasList1;
    }

    @XmlTransient
    public List<Parcelas> getParcelasList2() {
        return parcelasList2;
    }

    public void setParcelasList2(List<Parcelas> parcelasList2) {
        this.parcelasList2 = parcelasList2;
    }

    @XmlTransient
    public List<Clientes> getClientesList() {
        return clientesList;
    }

    public void setClientesList(List<Clientes> clientesList) {
        this.clientesList = clientesList;
    }

    @XmlTransient
    public List<BorderoMovParcelas> getBorderoMovParcelasList() {
        return borderoMovParcelasList;
    }

    public void setBorderoMovParcelasList(List<BorderoMovParcelas> borderoMovParcelasList) {
        this.borderoMovParcelasList = borderoMovParcelasList;
    }

    @XmlTransient
    public List<BorderoMovParcelas> getBorderoMovParcelasList1() {
        return borderoMovParcelasList1;
    }

    public void setBorderoMovParcelasList1(List<BorderoMovParcelas> borderoMovParcelasList1) {
        this.borderoMovParcelasList1 = borderoMovParcelasList1;
    }

    @XmlTransient
    public List<NegociacoesPedidos> getNegociacoesPedidosList() {
        return negociacoesPedidosList;
    }

    public void setNegociacoesPedidosList(List<NegociacoesPedidos> negociacoesPedidosList) {
        this.negociacoesPedidosList = negociacoesPedidosList;
    }

    @XmlTransient
    public List<OrdemServico> getOrdemServicoList() {
        return ordemServicoList;
    }

    public void setOrdemServicoList(List<OrdemServico> ordemServicoList) {
        this.ordemServicoList = ordemServicoList;
    }

    @XmlTransient
    public List<HistoricosCheques> getHistoricosChequesList() {
        return historicosChequesList;
    }

    public void setHistoricosChequesList(List<HistoricosCheques> historicosChequesList) {
        this.historicosChequesList = historicosChequesList;
    }

    @XmlTransient
    public List<MovimentosCaixas> getMovimentosCaixasList() {
        return movimentosCaixasList;
    }

    public void setMovimentosCaixasList(List<MovimentosCaixas> movimentosCaixasList) {
        this.movimentosCaixasList = movimentosCaixasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cofrId != null ? cofrId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cofres)) {
            return false;
        }
        Cofres other = (Cofres) object;
        if ((this.cofrId == null && other.cofrId != null) || (this.cofrId != null && !this.cofrId.equals(other.cofrId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.Cofres[ cofrId=" + cofrId + " ]";
    }
    
}
