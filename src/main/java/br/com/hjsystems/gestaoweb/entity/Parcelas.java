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
@Table(name = "PARCELAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Parcelas.findAll", query = "SELECT p FROM Parcelas p"),
    @NamedQuery(name = "Parcelas.findByPclsId", query = "SELECT p FROM Parcelas p WHERE p.pclsId = :pclsId"),
    @NamedQuery(name = "Parcelas.findByPclsNumero", query = "SELECT p FROM Parcelas p WHERE p.pclsNumero = :pclsNumero"),
    @NamedQuery(name = "Parcelas.findByPclsNossoNumero", query = "SELECT p FROM Parcelas p WHERE p.pclsNossoNumero = :pclsNossoNumero"),
    @NamedQuery(name = "Parcelas.findByPclsDtLancamento", query = "SELECT p FROM Parcelas p WHERE p.pclsDtLancamento = :pclsDtLancamento"),
    @NamedQuery(name = "Parcelas.findByPclsDtVencimento", query = "SELECT p FROM Parcelas p WHERE p.pclsDtVencimento = :pclsDtVencimento"),
    @NamedQuery(name = "Parcelas.findByPclsDtPagamento", query = "SELECT p FROM Parcelas p WHERE p.pclsDtPagamento = :pclsDtPagamento"),
    @NamedQuery(name = "Parcelas.findByPclsDtBaixa", query = "SELECT p FROM Parcelas p WHERE p.pclsDtBaixa = :pclsDtBaixa"),
    @NamedQuery(name = "Parcelas.findByPclsVlrEncargos", query = "SELECT p FROM Parcelas p WHERE p.pclsVlrEncargos = :pclsVlrEncargos"),
    @NamedQuery(name = "Parcelas.findByPclsVlrEncargosBanco", query = "SELECT p FROM Parcelas p WHERE p.pclsVlrEncargosBanco = :pclsVlrEncargosBanco"),
    @NamedQuery(name = "Parcelas.findByPclsVlrEncargosEmpresa", query = "SELECT p FROM Parcelas p WHERE p.pclsVlrEncargosEmpresa = :pclsVlrEncargosEmpresa"),
    @NamedQuery(name = "Parcelas.findByPclsVlrIof", query = "SELECT p FROM Parcelas p WHERE p.pclsVlrIof = :pclsVlrIof"),
    @NamedQuery(name = "Parcelas.findByPclsVlrParcela", query = "SELECT p FROM Parcelas p WHERE p.pclsVlrParcela = :pclsVlrParcela"),
    @NamedQuery(name = "Parcelas.findByPclsVlrOperacao", query = "SELECT p FROM Parcelas p WHERE p.pclsVlrOperacao = :pclsVlrOperacao"),
    @NamedQuery(name = "Parcelas.findByPclsVlrIofFinanciado", query = "SELECT p FROM Parcelas p WHERE p.pclsVlrIofFinanciado = :pclsVlrIofFinanciado"),
    @NamedQuery(name = "Parcelas.findByPclsFinanciaIof", query = "SELECT p FROM Parcelas p WHERE p.pclsFinanciaIof = :pclsFinanciaIof"),
    @NamedQuery(name = "Parcelas.findByPclsVlrEstimado", query = "SELECT p FROM Parcelas p WHERE p.pclsVlrEstimado = :pclsVlrEstimado"),
    @NamedQuery(name = "Parcelas.findByPclsVlrPago", query = "SELECT p FROM Parcelas p WHERE p.pclsVlrPago = :pclsVlrPago"),
    @NamedQuery(name = "Parcelas.findByPclsSaldo", query = "SELECT p FROM Parcelas p WHERE p.pclsSaldo = :pclsSaldo"),
    @NamedQuery(name = "Parcelas.findByPclsDespesas", query = "SELECT p FROM Parcelas p WHERE p.pclsDespesas = :pclsDespesas"),
    @NamedQuery(name = "Parcelas.findByPclsDescontoCapital", query = "SELECT p FROM Parcelas p WHERE p.pclsDescontoCapital = :pclsDescontoCapital"),
    @NamedQuery(name = "Parcelas.findByPclsDescontoJuros", query = "SELECT p FROM Parcelas p WHERE p.pclsDescontoJuros = :pclsDescontoJuros"),
    @NamedQuery(name = "Parcelas.findByPclsDescontoMulta", query = "SELECT p FROM Parcelas p WHERE p.pclsDescontoMulta = :pclsDescontoMulta"),
    @NamedQuery(name = "Parcelas.findByPclsDescontoCorrecao", query = "SELECT p FROM Parcelas p WHERE p.pclsDescontoCorrecao = :pclsDescontoCorrecao"),
    @NamedQuery(name = "Parcelas.findByPclsJurosAcumulados", query = "SELECT p FROM Parcelas p WHERE p.pclsJurosAcumulados = :pclsJurosAcumulados"),
    @NamedQuery(name = "Parcelas.findByPclsMultasAcumuladas", query = "SELECT p FROM Parcelas p WHERE p.pclsMultasAcumuladas = :pclsMultasAcumuladas"),
    @NamedQuery(name = "Parcelas.findByPclsDespesasAcumuladas", query = "SELECT p FROM Parcelas p WHERE p.pclsDespesasAcumuladas = :pclsDespesasAcumuladas"),
    @NamedQuery(name = "Parcelas.findByPclsCorrecaoAcumuladas", query = "SELECT p FROM Parcelas p WHERE p.pclsCorrecaoAcumuladas = :pclsCorrecaoAcumuladas"),
    @NamedQuery(name = "Parcelas.findByPclsDeflacaoAcumuladas", query = "SELECT p FROM Parcelas p WHERE p.pclsDeflacaoAcumuladas = :pclsDeflacaoAcumuladas"),
    @NamedQuery(name = "Parcelas.findByPclsComplemento", query = "SELECT p FROM Parcelas p WHERE p.pclsComplemento = :pclsComplemento"),
    @NamedQuery(name = "Parcelas.findByPclsDesconto", query = "SELECT p FROM Parcelas p WHERE p.pclsDesconto = :pclsDesconto"),
    @NamedQuery(name = "Parcelas.findByPclsCodigoBarras", query = "SELECT p FROM Parcelas p WHERE p.pclsCodigoBarras = :pclsCodigoBarras"),
    @NamedQuery(name = "Parcelas.findByPclsTaxaVendorBanco", query = "SELECT p FROM Parcelas p WHERE p.pclsTaxaVendorBanco = :pclsTaxaVendorBanco"),
    @NamedQuery(name = "Parcelas.findByPclsTaxaVendorEmpresa", query = "SELECT p FROM Parcelas p WHERE p.pclsTaxaVendorEmpresa = :pclsTaxaVendorEmpresa"),
    @NamedQuery(name = "Parcelas.findByPclsTipoPagamento", query = "SELECT p FROM Parcelas p WHERE p.pclsTipoPagamento = :pclsTipoPagamento"),
    @NamedQuery(name = "Parcelas.findByPclsSituacao", query = "SELECT p FROM Parcelas p WHERE p.pclsSituacao = :pclsSituacao"),
    @NamedQuery(name = "Parcelas.findByPclsVlrDescPagAntec", query = "SELECT p FROM Parcelas p WHERE p.pclsVlrDescPagAntec = :pclsVlrDescPagAntec"),
    @NamedQuery(name = "Parcelas.findByPclsContabilizar", query = "SELECT p FROM Parcelas p WHERE p.pclsContabilizar = :pclsContabilizar"),
    @NamedQuery(name = "Parcelas.findByPclsLASTUPDATE", query = "SELECT p FROM Parcelas p WHERE p.pclsLASTUPDATE = :pclsLASTUPDATE")})
public class Parcelas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PCLS_ID")
    private String pclsId;
    @Basic(optional = false)
    @Column(name = "PCLS_NUMERO")
    private String pclsNumero;
    @Column(name = "PCLS_NOSSO_NUMERO")
    private String pclsNossoNumero;
    @Basic(optional = false)
    @Column(name = "PCLS_DT_LANCAMENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pclsDtLancamento;
    @Basic(optional = false)
    @Column(name = "PCLS_DT_VENCIMENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pclsDtVencimento;
    @Column(name = "PCLS_DT_PAGAMENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pclsDtPagamento;
    @Column(name = "PCLS_DT_BAIXA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pclsDtBaixa;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "PCLS_VLR_ENCARGOS")
    private BigDecimal pclsVlrEncargos;
    @Basic(optional = false)
    @Column(name = "PCLS_VLR_ENCARGOS_BANCO")
    private BigDecimal pclsVlrEncargosBanco;
    @Basic(optional = false)
    @Column(name = "PCLS_VLR_ENCARGOS_EMPRESA")
    private BigDecimal pclsVlrEncargosEmpresa;
    @Basic(optional = false)
    @Column(name = "PCLS_VLR_IOF")
    private BigDecimal pclsVlrIof;
    @Basic(optional = false)
    @Column(name = "PCLS_VLR_PARCELA")
    private BigDecimal pclsVlrParcela;
    @Basic(optional = false)
    @Column(name = "PCLS_VLR_OPERACAO")
    private BigDecimal pclsVlrOperacao;
    @Basic(optional = false)
    @Column(name = "PCLS_VLR_IOF_FINANCIADO")
    private BigDecimal pclsVlrIofFinanciado;
    @Column(name = "PCLS_FINANCIA_IOF")
    private String pclsFinanciaIof;
    @Basic(optional = false)
    @Column(name = "PCLS_VLR_ESTIMADO")
    private BigDecimal pclsVlrEstimado;
    @Basic(optional = false)
    @Column(name = "PCLS_VLR_PAGO")
    private BigDecimal pclsVlrPago;
    @Basic(optional = false)
    @Column(name = "PCLS_SALDO")
    private BigDecimal pclsSaldo;
    @Basic(optional = false)
    @Column(name = "PCLS_DESPESAS")
    private BigDecimal pclsDespesas;
    @Basic(optional = false)
    @Column(name = "PCLS_DESCONTO_CAPITAL")
    private BigDecimal pclsDescontoCapital;
    @Basic(optional = false)
    @Column(name = "PCLS_DESCONTO_JUROS")
    private BigDecimal pclsDescontoJuros;
    @Basic(optional = false)
    @Column(name = "PCLS_DESCONTO_MULTA")
    private BigDecimal pclsDescontoMulta;
    @Basic(optional = false)
    @Column(name = "PCLS_DESCONTO_CORRECAO")
    private BigDecimal pclsDescontoCorrecao;
    @Basic(optional = false)
    @Column(name = "PCLS_JUROS_ACUMULADOS")
    private BigDecimal pclsJurosAcumulados;
    @Basic(optional = false)
    @Column(name = "PCLS_MULTAS_ACUMULADAS")
    private BigDecimal pclsMultasAcumuladas;
    @Basic(optional = false)
    @Column(name = "PCLS_DESPESAS_ACUMULADAS")
    private BigDecimal pclsDespesasAcumuladas;
    @Basic(optional = false)
    @Column(name = "PCLS_CORRECAO_ACUMULADAS")
    private BigDecimal pclsCorrecaoAcumuladas;
    @Basic(optional = false)
    @Column(name = "PCLS_DEFLACAO_ACUMULADAS")
    private BigDecimal pclsDeflacaoAcumuladas;
    @Column(name = "PCLS_COMPLEMENTO")
    private String pclsComplemento;
    @Basic(optional = false)
    @Column(name = "PCLS_DESCONTO")
    private String pclsDesconto;
    @Column(name = "PCLS_CODIGO_BARRAS")
    private String pclsCodigoBarras;
    @Basic(optional = false)
    @Column(name = "PCLS_TAXA_VENDOR_BANCO")
    private BigDecimal pclsTaxaVendorBanco;
    @Basic(optional = false)
    @Column(name = "PCLS_TAXA_VENDOR_EMPRESA")
    private BigDecimal pclsTaxaVendorEmpresa;
    @Column(name = "PCLS_TIPO_PAGAMENTO")
    private String pclsTipoPagamento;
    @Basic(optional = false)
    @Column(name = "PCLS_SITUACAO")
    private String pclsSituacao;
    @Column(name = "PCLS_VLR_DESC_PAG_ANTEC")
    private BigDecimal pclsVlrDescPagAntec;
    @Column(name = "PCLS_CONTABILIZAR")
    private String pclsContabilizar;
    @Column(name = "Pcls_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pclsLASTUPDATE;
    @OneToMany(mappedBy = "pclsId")
    private List<HistoricosParcela> historicosParcelaList;
    @OneToMany(mappedBy = "pclsId")
    private List<Descontos> descontosList;
    @OneToMany(mappedBy = "pclsId")
    private List<PagamentosContas> pagamentosContasList;
    @JoinColumn(name = "ALNA_ID", referencedColumnName = "ALNA_ID")
    @ManyToOne
    private Alineas alnaId;
    @JoinColumn(name = "COF_COFR_ID", referencedColumnName = "COFR_ID")
    @ManyToOne
    private Cofres cofCofrId;
    @JoinColumn(name = "COFR_ID", referencedColumnName = "COFR_ID")
    @ManyToOne
    private Cofres cofrId;
    @JoinColumn(name = "COF_COFR_ID2", referencedColumnName = "COFR_ID")
    @ManyToOne
    private Cofres cofCofrId2;
    @JoinColumn(name = "INDX_ID", referencedColumnName = "INDX_ID")
    @ManyToOne
    private Indexadores indxId;
    @OneToMany(mappedBy = "parPclsId")
    private List<Parcelas> parcelasList;
    @JoinColumn(name = "PAR_PCLS_ID", referencedColumnName = "PCLS_ID")
    @ManyToOne
    private Parcelas parPclsId;
    @JoinColumn(name = "PLCT_ID", referencedColumnName = "PLCT_ID")
    @ManyToOne
    private PlanoContas plctId;
    @JoinColumn(name = "TIT_TITU_ID", referencedColumnName = "TITU_ID")
    @ManyToOne
    private Titulos titTituId;
    @JoinColumn(name = "TITU_ID", referencedColumnName = "TITU_ID")
    @ManyToOne
    private Titulos tituId;
    @OneToMany(mappedBy = "pclsId")
    private List<ItensCaixas> itensCaixasList;
    @OneToMany(mappedBy = "pclsId")
    private List<ChequesParcelas> chequesParcelasList;

    public Parcelas() {
    }

    public Parcelas(String pclsId) {
        this.pclsId = pclsId;
    }

    public Parcelas(String pclsId, String pclsNumero, Date pclsDtLancamento, Date pclsDtVencimento, BigDecimal pclsVlrEncargos, BigDecimal pclsVlrEncargosBanco, BigDecimal pclsVlrEncargosEmpresa, BigDecimal pclsVlrIof, BigDecimal pclsVlrParcela, BigDecimal pclsVlrOperacao, BigDecimal pclsVlrIofFinanciado, BigDecimal pclsVlrEstimado, BigDecimal pclsVlrPago, BigDecimal pclsSaldo, BigDecimal pclsDespesas, BigDecimal pclsDescontoCapital, BigDecimal pclsDescontoJuros, BigDecimal pclsDescontoMulta, BigDecimal pclsDescontoCorrecao, BigDecimal pclsJurosAcumulados, BigDecimal pclsMultasAcumuladas, BigDecimal pclsDespesasAcumuladas, BigDecimal pclsCorrecaoAcumuladas, BigDecimal pclsDeflacaoAcumuladas, String pclsDesconto, BigDecimal pclsTaxaVendorBanco, BigDecimal pclsTaxaVendorEmpresa, String pclsSituacao) {
        this.pclsId = pclsId;
        this.pclsNumero = pclsNumero;
        this.pclsDtLancamento = pclsDtLancamento;
        this.pclsDtVencimento = pclsDtVencimento;
        this.pclsVlrEncargos = pclsVlrEncargos;
        this.pclsVlrEncargosBanco = pclsVlrEncargosBanco;
        this.pclsVlrEncargosEmpresa = pclsVlrEncargosEmpresa;
        this.pclsVlrIof = pclsVlrIof;
        this.pclsVlrParcela = pclsVlrParcela;
        this.pclsVlrOperacao = pclsVlrOperacao;
        this.pclsVlrIofFinanciado = pclsVlrIofFinanciado;
        this.pclsVlrEstimado = pclsVlrEstimado;
        this.pclsVlrPago = pclsVlrPago;
        this.pclsSaldo = pclsSaldo;
        this.pclsDespesas = pclsDespesas;
        this.pclsDescontoCapital = pclsDescontoCapital;
        this.pclsDescontoJuros = pclsDescontoJuros;
        this.pclsDescontoMulta = pclsDescontoMulta;
        this.pclsDescontoCorrecao = pclsDescontoCorrecao;
        this.pclsJurosAcumulados = pclsJurosAcumulados;
        this.pclsMultasAcumuladas = pclsMultasAcumuladas;
        this.pclsDespesasAcumuladas = pclsDespesasAcumuladas;
        this.pclsCorrecaoAcumuladas = pclsCorrecaoAcumuladas;
        this.pclsDeflacaoAcumuladas = pclsDeflacaoAcumuladas;
        this.pclsDesconto = pclsDesconto;
        this.pclsTaxaVendorBanco = pclsTaxaVendorBanco;
        this.pclsTaxaVendorEmpresa = pclsTaxaVendorEmpresa;
        this.pclsSituacao = pclsSituacao;
    }

    public String getPclsId() {
        return pclsId;
    }

    public void setPclsId(String pclsId) {
        this.pclsId = pclsId;
    }

    public String getPclsNumero() {
        return pclsNumero;
    }

    public void setPclsNumero(String pclsNumero) {
        this.pclsNumero = pclsNumero;
    }

    public String getPclsNossoNumero() {
        return pclsNossoNumero;
    }

    public void setPclsNossoNumero(String pclsNossoNumero) {
        this.pclsNossoNumero = pclsNossoNumero;
    }

    public Date getPclsDtLancamento() {
        return pclsDtLancamento;
    }

    public void setPclsDtLancamento(Date pclsDtLancamento) {
        this.pclsDtLancamento = pclsDtLancamento;
    }

    public Date getPclsDtVencimento() {
        return pclsDtVencimento;
    }

    public void setPclsDtVencimento(Date pclsDtVencimento) {
        this.pclsDtVencimento = pclsDtVencimento;
    }

    public Date getPclsDtPagamento() {
        return pclsDtPagamento;
    }

    public void setPclsDtPagamento(Date pclsDtPagamento) {
        this.pclsDtPagamento = pclsDtPagamento;
    }

    public Date getPclsDtBaixa() {
        return pclsDtBaixa;
    }

    public void setPclsDtBaixa(Date pclsDtBaixa) {
        this.pclsDtBaixa = pclsDtBaixa;
    }

    public BigDecimal getPclsVlrEncargos() {
        return pclsVlrEncargos;
    }

    public void setPclsVlrEncargos(BigDecimal pclsVlrEncargos) {
        this.pclsVlrEncargos = pclsVlrEncargos;
    }

    public BigDecimal getPclsVlrEncargosBanco() {
        return pclsVlrEncargosBanco;
    }

    public void setPclsVlrEncargosBanco(BigDecimal pclsVlrEncargosBanco) {
        this.pclsVlrEncargosBanco = pclsVlrEncargosBanco;
    }

    public BigDecimal getPclsVlrEncargosEmpresa() {
        return pclsVlrEncargosEmpresa;
    }

    public void setPclsVlrEncargosEmpresa(BigDecimal pclsVlrEncargosEmpresa) {
        this.pclsVlrEncargosEmpresa = pclsVlrEncargosEmpresa;
    }

    public BigDecimal getPclsVlrIof() {
        return pclsVlrIof;
    }

    public void setPclsVlrIof(BigDecimal pclsVlrIof) {
        this.pclsVlrIof = pclsVlrIof;
    }

    public BigDecimal getPclsVlrParcela() {
        return pclsVlrParcela;
    }

    public void setPclsVlrParcela(BigDecimal pclsVlrParcela) {
        this.pclsVlrParcela = pclsVlrParcela;
    }

    public BigDecimal getPclsVlrOperacao() {
        return pclsVlrOperacao;
    }

    public void setPclsVlrOperacao(BigDecimal pclsVlrOperacao) {
        this.pclsVlrOperacao = pclsVlrOperacao;
    }

    public BigDecimal getPclsVlrIofFinanciado() {
        return pclsVlrIofFinanciado;
    }

    public void setPclsVlrIofFinanciado(BigDecimal pclsVlrIofFinanciado) {
        this.pclsVlrIofFinanciado = pclsVlrIofFinanciado;
    }

    public String getPclsFinanciaIof() {
        return pclsFinanciaIof;
    }

    public void setPclsFinanciaIof(String pclsFinanciaIof) {
        this.pclsFinanciaIof = pclsFinanciaIof;
    }

    public BigDecimal getPclsVlrEstimado() {
        return pclsVlrEstimado;
    }

    public void setPclsVlrEstimado(BigDecimal pclsVlrEstimado) {
        this.pclsVlrEstimado = pclsVlrEstimado;
    }

    public BigDecimal getPclsVlrPago() {
        return pclsVlrPago;
    }

    public void setPclsVlrPago(BigDecimal pclsVlrPago) {
        this.pclsVlrPago = pclsVlrPago;
    }

    public BigDecimal getPclsSaldo() {
        return pclsSaldo;
    }

    public void setPclsSaldo(BigDecimal pclsSaldo) {
        this.pclsSaldo = pclsSaldo;
    }

    public BigDecimal getPclsDespesas() {
        return pclsDespesas;
    }

    public void setPclsDespesas(BigDecimal pclsDespesas) {
        this.pclsDespesas = pclsDespesas;
    }

    public BigDecimal getPclsDescontoCapital() {
        return pclsDescontoCapital;
    }

    public void setPclsDescontoCapital(BigDecimal pclsDescontoCapital) {
        this.pclsDescontoCapital = pclsDescontoCapital;
    }

    public BigDecimal getPclsDescontoJuros() {
        return pclsDescontoJuros;
    }

    public void setPclsDescontoJuros(BigDecimal pclsDescontoJuros) {
        this.pclsDescontoJuros = pclsDescontoJuros;
    }

    public BigDecimal getPclsDescontoMulta() {
        return pclsDescontoMulta;
    }

    public void setPclsDescontoMulta(BigDecimal pclsDescontoMulta) {
        this.pclsDescontoMulta = pclsDescontoMulta;
    }

    public BigDecimal getPclsDescontoCorrecao() {
        return pclsDescontoCorrecao;
    }

    public void setPclsDescontoCorrecao(BigDecimal pclsDescontoCorrecao) {
        this.pclsDescontoCorrecao = pclsDescontoCorrecao;
    }

    public BigDecimal getPclsJurosAcumulados() {
        return pclsJurosAcumulados;
    }

    public void setPclsJurosAcumulados(BigDecimal pclsJurosAcumulados) {
        this.pclsJurosAcumulados = pclsJurosAcumulados;
    }

    public BigDecimal getPclsMultasAcumuladas() {
        return pclsMultasAcumuladas;
    }

    public void setPclsMultasAcumuladas(BigDecimal pclsMultasAcumuladas) {
        this.pclsMultasAcumuladas = pclsMultasAcumuladas;
    }

    public BigDecimal getPclsDespesasAcumuladas() {
        return pclsDespesasAcumuladas;
    }

    public void setPclsDespesasAcumuladas(BigDecimal pclsDespesasAcumuladas) {
        this.pclsDespesasAcumuladas = pclsDespesasAcumuladas;
    }

    public BigDecimal getPclsCorrecaoAcumuladas() {
        return pclsCorrecaoAcumuladas;
    }

    public void setPclsCorrecaoAcumuladas(BigDecimal pclsCorrecaoAcumuladas) {
        this.pclsCorrecaoAcumuladas = pclsCorrecaoAcumuladas;
    }

    public BigDecimal getPclsDeflacaoAcumuladas() {
        return pclsDeflacaoAcumuladas;
    }

    public void setPclsDeflacaoAcumuladas(BigDecimal pclsDeflacaoAcumuladas) {
        this.pclsDeflacaoAcumuladas = pclsDeflacaoAcumuladas;
    }

    public String getPclsComplemento() {
        return pclsComplemento;
    }

    public void setPclsComplemento(String pclsComplemento) {
        this.pclsComplemento = pclsComplemento;
    }

    public String getPclsDesconto() {
        return pclsDesconto;
    }

    public void setPclsDesconto(String pclsDesconto) {
        this.pclsDesconto = pclsDesconto;
    }

    public String getPclsCodigoBarras() {
        return pclsCodigoBarras;
    }

    public void setPclsCodigoBarras(String pclsCodigoBarras) {
        this.pclsCodigoBarras = pclsCodigoBarras;
    }

    public BigDecimal getPclsTaxaVendorBanco() {
        return pclsTaxaVendorBanco;
    }

    public void setPclsTaxaVendorBanco(BigDecimal pclsTaxaVendorBanco) {
        this.pclsTaxaVendorBanco = pclsTaxaVendorBanco;
    }

    public BigDecimal getPclsTaxaVendorEmpresa() {
        return pclsTaxaVendorEmpresa;
    }

    public void setPclsTaxaVendorEmpresa(BigDecimal pclsTaxaVendorEmpresa) {
        this.pclsTaxaVendorEmpresa = pclsTaxaVendorEmpresa;
    }

    public String getPclsTipoPagamento() {
        return pclsTipoPagamento;
    }

    public void setPclsTipoPagamento(String pclsTipoPagamento) {
        this.pclsTipoPagamento = pclsTipoPagamento;
    }

    public String getPclsSituacao() {
        return pclsSituacao;
    }

    public void setPclsSituacao(String pclsSituacao) {
        this.pclsSituacao = pclsSituacao;
    }

    public BigDecimal getPclsVlrDescPagAntec() {
        return pclsVlrDescPagAntec;
    }

    public void setPclsVlrDescPagAntec(BigDecimal pclsVlrDescPagAntec) {
        this.pclsVlrDescPagAntec = pclsVlrDescPagAntec;
    }

    public String getPclsContabilizar() {
        return pclsContabilizar;
    }

    public void setPclsContabilizar(String pclsContabilizar) {
        this.pclsContabilizar = pclsContabilizar;
    }

    public Date getPclsLASTUPDATE() {
        return pclsLASTUPDATE;
    }

    public void setPclsLASTUPDATE(Date pclsLASTUPDATE) {
        this.pclsLASTUPDATE = pclsLASTUPDATE;
    }

    @XmlTransient
    public List<HistoricosParcela> getHistoricosParcelaList() {
        return historicosParcelaList;
    }

    public void setHistoricosParcelaList(List<HistoricosParcela> historicosParcelaList) {
        this.historicosParcelaList = historicosParcelaList;
    }

    @XmlTransient
    public List<Descontos> getDescontosList() {
        return descontosList;
    }

    public void setDescontosList(List<Descontos> descontosList) {
        this.descontosList = descontosList;
    }

    @XmlTransient
    public List<PagamentosContas> getPagamentosContasList() {
        return pagamentosContasList;
    }

    public void setPagamentosContasList(List<PagamentosContas> pagamentosContasList) {
        this.pagamentosContasList = pagamentosContasList;
    }

    public Alineas getAlnaId() {
        return alnaId;
    }

    public void setAlnaId(Alineas alnaId) {
        this.alnaId = alnaId;
    }

    public Cofres getCofCofrId() {
        return cofCofrId;
    }

    public void setCofCofrId(Cofres cofCofrId) {
        this.cofCofrId = cofCofrId;
    }

    public Cofres getCofrId() {
        return cofrId;
    }

    public void setCofrId(Cofres cofrId) {
        this.cofrId = cofrId;
    }

    public Cofres getCofCofrId2() {
        return cofCofrId2;
    }

    public void setCofCofrId2(Cofres cofCofrId2) {
        this.cofCofrId2 = cofCofrId2;
    }

    public Indexadores getIndxId() {
        return indxId;
    }

    public void setIndxId(Indexadores indxId) {
        this.indxId = indxId;
    }

    @XmlTransient
    public List<Parcelas> getParcelasList() {
        return parcelasList;
    }

    public void setParcelasList(List<Parcelas> parcelasList) {
        this.parcelasList = parcelasList;
    }

    public Parcelas getParPclsId() {
        return parPclsId;
    }

    public void setParPclsId(Parcelas parPclsId) {
        this.parPclsId = parPclsId;
    }

    public PlanoContas getPlctId() {
        return plctId;
    }

    public void setPlctId(PlanoContas plctId) {
        this.plctId = plctId;
    }

    public Titulos getTitTituId() {
        return titTituId;
    }

    public void setTitTituId(Titulos titTituId) {
        this.titTituId = titTituId;
    }

    public Titulos getTituId() {
        return tituId;
    }

    public void setTituId(Titulos tituId) {
        this.tituId = tituId;
    }

    @XmlTransient
    public List<ItensCaixas> getItensCaixasList() {
        return itensCaixasList;
    }

    public void setItensCaixasList(List<ItensCaixas> itensCaixasList) {
        this.itensCaixasList = itensCaixasList;
    }

    @XmlTransient
    public List<ChequesParcelas> getChequesParcelasList() {
        return chequesParcelasList;
    }

    public void setChequesParcelasList(List<ChequesParcelas> chequesParcelasList) {
        this.chequesParcelasList = chequesParcelasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pclsId != null ? pclsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Parcelas)) {
            return false;
        }
        Parcelas other = (Parcelas) object;
        if ((this.pclsId == null && other.pclsId != null) || (this.pclsId != null && !this.pclsId.equals(other.pclsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.Parcelas[ pclsId=" + pclsId + " ]";
    }
    
}
