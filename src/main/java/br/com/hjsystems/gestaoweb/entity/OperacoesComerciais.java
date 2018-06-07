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
@Table(name = "OPERACOES_COMERCIAIS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OperacoesComerciais.findAll", query = "SELECT o FROM OperacoesComerciais o"),
    @NamedQuery(name = "OperacoesComerciais.findByOpcmId", query = "SELECT o FROM OperacoesComerciais o WHERE o.opcmId = :opcmId"),
    @NamedQuery(name = "OperacoesComerciais.findByOpcmNomePadrao", query = "SELECT o FROM OperacoesComerciais o WHERE o.opcmNomePadrao = :opcmNomePadrao"),
    @NamedQuery(name = "OperacoesComerciais.findByOpcmNomeCliente", query = "SELECT o FROM OperacoesComerciais o WHERE o.opcmNomeCliente = :opcmNomeCliente"),
    @NamedQuery(name = "OperacoesComerciais.findByOpcmSiglaPadrao", query = "SELECT o FROM OperacoesComerciais o WHERE o.opcmSiglaPadrao = :opcmSiglaPadrao"),
    @NamedQuery(name = "OperacoesComerciais.findByOpcmSiglaCliente", query = "SELECT o FROM OperacoesComerciais o WHERE o.opcmSiglaCliente = :opcmSiglaCliente"),
    @NamedQuery(name = "OperacoesComerciais.findByOpcmNaturezaOperacao", query = "SELECT o FROM OperacoesComerciais o WHERE o.opcmNaturezaOperacao = :opcmNaturezaOperacao"),
    @NamedQuery(name = "OperacoesComerciais.findByOpcmOperacao", query = "SELECT o FROM OperacoesComerciais o WHERE o.opcmOperacao = :opcmOperacao"),
    @NamedQuery(name = "OperacoesComerciais.findByOpcmAfetaCusto", query = "SELECT o FROM OperacoesComerciais o WHERE o.opcmAfetaCusto = :opcmAfetaCusto"),
    @NamedQuery(name = "OperacoesComerciais.findByOpcmAfetaEstoque", query = "SELECT o FROM OperacoesComerciais o WHERE o.opcmAfetaEstoque = :opcmAfetaEstoque"),
    @NamedQuery(name = "OperacoesComerciais.findByOpcmFatoFiscal", query = "SELECT o FROM OperacoesComerciais o WHERE o.opcmFatoFiscal = :opcmFatoFiscal"),
    @NamedQuery(name = "OperacoesComerciais.findByOpcmGeraFinanceiro", query = "SELECT o FROM OperacoesComerciais o WHERE o.opcmGeraFinanceiro = :opcmGeraFinanceiro"),
    @NamedQuery(name = "OperacoesComerciais.findByOpcmEmiteCupom", query = "SELECT o FROM OperacoesComerciais o WHERE o.opcmEmiteCupom = :opcmEmiteCupom"),
    @NamedQuery(name = "OperacoesComerciais.findByOpcmDevolucao", query = "SELECT o FROM OperacoesComerciais o WHERE o.opcmDevolucao = :opcmDevolucao"),
    @NamedQuery(name = "OperacoesComerciais.findByOpcmRtbMinPermitida", query = "SELECT o FROM OperacoesComerciais o WHERE o.opcmRtbMinPermitida = :opcmRtbMinPermitida"),
    @NamedQuery(name = "OperacoesComerciais.findByOpcmContabilizar", query = "SELECT o FROM OperacoesComerciais o WHERE o.opcmContabilizar = :opcmContabilizar"),
    @NamedQuery(name = "OperacoesComerciais.findByOpcmCalculaIpi", query = "SELECT o FROM OperacoesComerciais o WHERE o.opcmCalculaIpi = :opcmCalculaIpi"),
    @NamedQuery(name = "OperacoesComerciais.findByOpcmCalculaPis", query = "SELECT o FROM OperacoesComerciais o WHERE o.opcmCalculaPis = :opcmCalculaPis"),
    @NamedQuery(name = "OperacoesComerciais.findByOpcmCalculaCofins", query = "SELECT o FROM OperacoesComerciais o WHERE o.opcmCalculaCofins = :opcmCalculaCofins"),
    @NamedQuery(name = "OperacoesComerciais.findByOpcmNotaMae", query = "SELECT o FROM OperacoesComerciais o WHERE o.opcmNotaMae = :opcmNotaMae"),
    @NamedQuery(name = "OperacoesComerciais.findByOpcmFmrRemessa", query = "SELECT o FROM OperacoesComerciais o WHERE o.opcmFmrRemessa = :opcmFmrRemessa"),
    @NamedQuery(name = "OperacoesComerciais.findByOpCmLASTUPDATE", query = "SELECT o FROM OperacoesComerciais o WHERE o.opCmLASTUPDATE = :opCmLASTUPDATE"),
    @NamedQuery(name = "OperacoesComerciais.findByOpcmBuscaPrcCusto", query = "SELECT o FROM OperacoesComerciais o WHERE o.opcmBuscaPrcCusto = :opcmBuscaPrcCusto"),
    @NamedQuery(name = "OperacoesComerciais.findByOpcmImportacao", query = "SELECT o FROM OperacoesComerciais o WHERE o.opcmImportacao = :opcmImportacao"),
    @NamedQuery(name = "OperacoesComerciais.findByOpcmEntAntecipada", query = "SELECT o FROM OperacoesComerciais o WHERE o.opcmEntAntecipada = :opcmEntAntecipada"),
    @NamedQuery(name = "OperacoesComerciais.findByOpcmDevolucaoTerceiro", query = "SELECT o FROM OperacoesComerciais o WHERE o.opcmDevolucaoTerceiro = :opcmDevolucaoTerceiro")})
public class OperacoesComerciais implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "OPCM_ID")
    private String opcmId;
    @Basic(optional = false)
    @Column(name = "OPCM_NOME_PADRAO")
    private String opcmNomePadrao;
    @Basic(optional = false)
    @Column(name = "OPCM_NOME_CLIENTE")
    private String opcmNomeCliente;
    @Basic(optional = false)
    @Column(name = "OPCM_SIGLA_PADRAO")
    private String opcmSiglaPadrao;
    @Basic(optional = false)
    @Column(name = "OPCM_SIGLA_CLIENTE")
    private String opcmSiglaCliente;
    @Basic(optional = false)
    @Column(name = "OPCM_NATUREZA_OPERACAO")
    private String opcmNaturezaOperacao;
    @Column(name = "OPCM_OPERACAO")
    private String opcmOperacao;
    @Basic(optional = false)
    @Column(name = "OPCM_AFETA_CUSTO")
    private String opcmAfetaCusto;
    @Basic(optional = false)
    @Column(name = "OPCM_AFETA_ESTOQUE")
    private String opcmAfetaEstoque;
    @Basic(optional = false)
    @Column(name = "OPCM_FATO_FISCAL")
    private String opcmFatoFiscal;
    @Basic(optional = false)
    @Column(name = "OPCM_GERA_FINANCEIRO")
    private String opcmGeraFinanceiro;
    @Basic(optional = false)
    @Column(name = "OPCM_EMITE_CUPOM")
    private String opcmEmiteCupom;
    @Column(name = "OPCM_DEVOLUCAO")
    private String opcmDevolucao;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "OPCM_RTB_MIN_PERMITIDA")
    private BigDecimal opcmRtbMinPermitida;
    @Basic(optional = false)
    @Column(name = "OPCM_CONTABILIZAR")
    private String opcmContabilizar;
    @Basic(optional = false)
    @Column(name = "OPCM_CALCULA_IPI")
    private String opcmCalculaIpi;
    @Basic(optional = false)
    @Column(name = "OPCM_CALCULA_PIS")
    private String opcmCalculaPis;
    @Basic(optional = false)
    @Column(name = "OPCM_CALCULA_COFINS")
    private String opcmCalculaCofins;
    @Column(name = "OPCM_NOTA_MAE")
    private String opcmNotaMae;
    @Column(name = "OPCM_FMR_REMESSA")
    private String opcmFmrRemessa;
    @Column(name = "OpCm_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date opCmLASTUPDATE;
    @Column(name = "OPCM_BUSCA_PRC_CUSTO")
    private String opcmBuscaPrcCusto;
    @Column(name = "OPCM_IMPORTACAO")
    private String opcmImportacao;
    @Column(name = "OPCM_ENT_ANTECIPADA")
    private String opcmEntAntecipada;
    @Column(name = "OPCM_DEVOLUCAO_TERCEIRO")
    private String opcmDevolucaoTerceiro;
    @OneToMany(mappedBy = "opcmId")
    private List<Pedidos> pedidosList;
    @OneToMany(mappedBy = "opcmId")
    private List<OpcomMotivodivergencia> opcomMotivodivergenciaList;
    @JoinColumn(name = "HMOV_ID", referencedColumnName = "HMOV_ID")
    @ManyToOne
    private HistoricosMovimentacoes hmovId;
    @JoinColumn(name = "HPAD_ID", referencedColumnName = "HPAD_ID")
    @ManyToOne
    private HistoricosPadrao hpadId;
    @JoinColumn(name = "MDFR_ID", referencedColumnName = "MDFR_ID")
    @ManyToOne
    private ModelosFormularios mdfrId;
    @JoinColumn(name = "MTOP_ID", referencedColumnName = "MTOP_ID")
    @ManyToOne
    private MotivosOperacao mtopId;
    @JoinColumn(name = "MOT_MTOP_ID", referencedColumnName = "MTOP_ID")
    @ManyToOne
    private MotivosOperacao motMtopId;
    @JoinColumn(name = "PLA_PLCT_ID2", referencedColumnName = "PLCT_ID")
    @ManyToOne
    private PlanoContas plaPlctId2;
    @JoinColumn(name = "PLCT_ID", referencedColumnName = "PLCT_ID")
    @ManyToOne
    private PlanoContas plctId;
    @JoinColumn(name = "PLA_PLCT_ID", referencedColumnName = "PLCT_ID")
    @ManyToOne
    private PlanoContas plaPlctId;
    @OneToMany(mappedBy = "opcmId")
    private List<ClassificacaoFiscal> classificacaoFiscalList;
    @OneToMany(mappedBy = "opcmId")
    private List<OrcamentosVendas> orcamentosVendasList;
    @OneToMany(mappedBy = "opcmId")
    private List<Locacoes> locacoesList;
    @OneToMany(mappedBy = "opcmId")
    private List<Titulos> titulosList;
    @OneToMany(mappedBy = "opcmId")
    private List<Cotacoes> cotacoesList;
    @OneToMany(mappedBy = "opcmId")
    private List<OrdemServico> ordemServicoList;
    @OneToMany(mappedBy = "opcmId")
    private List<OpercomercTipospessoas> opercomercTipospessoasList;
    @OneToMany(mappedBy = "opcmId")
    private List<FornecedoresSugestoescompras> fornecedoresSugestoescomprasList;
    @OneToMany(mappedBy = "opcmId")
    private List<VendedoresOpercomerciais> vendedoresOpercomerciaisList;
    @OneToMany(mappedBy = "opcmId")
    private List<OpcmTipospagamentos> opcmTipospagamentosList;
    @OneToMany(mappedBy = "opcmId")
    private List<UnemOperacoesComerciais> unemOperacoesComerciaisList;

    public OperacoesComerciais() {
    }

    public OperacoesComerciais(String opcmId) {
        this.opcmId = opcmId;
    }

    public OperacoesComerciais(String opcmId, String opcmNomePadrao, String opcmNomeCliente, String opcmSiglaPadrao, String opcmSiglaCliente, String opcmNaturezaOperacao, String opcmAfetaCusto, String opcmAfetaEstoque, String opcmFatoFiscal, String opcmGeraFinanceiro, String opcmEmiteCupom, BigDecimal opcmRtbMinPermitida, String opcmContabilizar, String opcmCalculaIpi, String opcmCalculaPis, String opcmCalculaCofins) {
        this.opcmId = opcmId;
        this.opcmNomePadrao = opcmNomePadrao;
        this.opcmNomeCliente = opcmNomeCliente;
        this.opcmSiglaPadrao = opcmSiglaPadrao;
        this.opcmSiglaCliente = opcmSiglaCliente;
        this.opcmNaturezaOperacao = opcmNaturezaOperacao;
        this.opcmAfetaCusto = opcmAfetaCusto;
        this.opcmAfetaEstoque = opcmAfetaEstoque;
        this.opcmFatoFiscal = opcmFatoFiscal;
        this.opcmGeraFinanceiro = opcmGeraFinanceiro;
        this.opcmEmiteCupom = opcmEmiteCupom;
        this.opcmRtbMinPermitida = opcmRtbMinPermitida;
        this.opcmContabilizar = opcmContabilizar;
        this.opcmCalculaIpi = opcmCalculaIpi;
        this.opcmCalculaPis = opcmCalculaPis;
        this.opcmCalculaCofins = opcmCalculaCofins;
    }

    public String getOpcmId() {
        return opcmId;
    }

    public void setOpcmId(String opcmId) {
        this.opcmId = opcmId;
    }

    public String getOpcmNomePadrao() {
        return opcmNomePadrao;
    }

    public void setOpcmNomePadrao(String opcmNomePadrao) {
        this.opcmNomePadrao = opcmNomePadrao;
    }

    public String getOpcmNomeCliente() {
        return opcmNomeCliente;
    }

    public void setOpcmNomeCliente(String opcmNomeCliente) {
        this.opcmNomeCliente = opcmNomeCliente;
    }

    public String getOpcmSiglaPadrao() {
        return opcmSiglaPadrao;
    }

    public void setOpcmSiglaPadrao(String opcmSiglaPadrao) {
        this.opcmSiglaPadrao = opcmSiglaPadrao;
    }

    public String getOpcmSiglaCliente() {
        return opcmSiglaCliente;
    }

    public void setOpcmSiglaCliente(String opcmSiglaCliente) {
        this.opcmSiglaCliente = opcmSiglaCliente;
    }

    public String getOpcmNaturezaOperacao() {
        return opcmNaturezaOperacao;
    }

    public void setOpcmNaturezaOperacao(String opcmNaturezaOperacao) {
        this.opcmNaturezaOperacao = opcmNaturezaOperacao;
    }

    public String getOpcmOperacao() {
        return opcmOperacao;
    }

    public void setOpcmOperacao(String opcmOperacao) {
        this.opcmOperacao = opcmOperacao;
    }

    public String getOpcmAfetaCusto() {
        return opcmAfetaCusto;
    }

    public void setOpcmAfetaCusto(String opcmAfetaCusto) {
        this.opcmAfetaCusto = opcmAfetaCusto;
    }

    public String getOpcmAfetaEstoque() {
        return opcmAfetaEstoque;
    }

    public void setOpcmAfetaEstoque(String opcmAfetaEstoque) {
        this.opcmAfetaEstoque = opcmAfetaEstoque;
    }

    public String getOpcmFatoFiscal() {
        return opcmFatoFiscal;
    }

    public void setOpcmFatoFiscal(String opcmFatoFiscal) {
        this.opcmFatoFiscal = opcmFatoFiscal;
    }

    public String getOpcmGeraFinanceiro() {
        return opcmGeraFinanceiro;
    }

    public void setOpcmGeraFinanceiro(String opcmGeraFinanceiro) {
        this.opcmGeraFinanceiro = opcmGeraFinanceiro;
    }

    public String getOpcmEmiteCupom() {
        return opcmEmiteCupom;
    }

    public void setOpcmEmiteCupom(String opcmEmiteCupom) {
        this.opcmEmiteCupom = opcmEmiteCupom;
    }

    public String getOpcmDevolucao() {
        return opcmDevolucao;
    }

    public void setOpcmDevolucao(String opcmDevolucao) {
        this.opcmDevolucao = opcmDevolucao;
    }

    public BigDecimal getOpcmRtbMinPermitida() {
        return opcmRtbMinPermitida;
    }

    public void setOpcmRtbMinPermitida(BigDecimal opcmRtbMinPermitida) {
        this.opcmRtbMinPermitida = opcmRtbMinPermitida;
    }

    public String getOpcmContabilizar() {
        return opcmContabilizar;
    }

    public void setOpcmContabilizar(String opcmContabilizar) {
        this.opcmContabilizar = opcmContabilizar;
    }

    public String getOpcmCalculaIpi() {
        return opcmCalculaIpi;
    }

    public void setOpcmCalculaIpi(String opcmCalculaIpi) {
        this.opcmCalculaIpi = opcmCalculaIpi;
    }

    public String getOpcmCalculaPis() {
        return opcmCalculaPis;
    }

    public void setOpcmCalculaPis(String opcmCalculaPis) {
        this.opcmCalculaPis = opcmCalculaPis;
    }

    public String getOpcmCalculaCofins() {
        return opcmCalculaCofins;
    }

    public void setOpcmCalculaCofins(String opcmCalculaCofins) {
        this.opcmCalculaCofins = opcmCalculaCofins;
    }

    public String getOpcmNotaMae() {
        return opcmNotaMae;
    }

    public void setOpcmNotaMae(String opcmNotaMae) {
        this.opcmNotaMae = opcmNotaMae;
    }

    public String getOpcmFmrRemessa() {
        return opcmFmrRemessa;
    }

    public void setOpcmFmrRemessa(String opcmFmrRemessa) {
        this.opcmFmrRemessa = opcmFmrRemessa;
    }

    public Date getOpCmLASTUPDATE() {
        return opCmLASTUPDATE;
    }

    public void setOpCmLASTUPDATE(Date opCmLASTUPDATE) {
        this.opCmLASTUPDATE = opCmLASTUPDATE;
    }

    public String getOpcmBuscaPrcCusto() {
        return opcmBuscaPrcCusto;
    }

    public void setOpcmBuscaPrcCusto(String opcmBuscaPrcCusto) {
        this.opcmBuscaPrcCusto = opcmBuscaPrcCusto;
    }

    public String getOpcmImportacao() {
        return opcmImportacao;
    }

    public void setOpcmImportacao(String opcmImportacao) {
        this.opcmImportacao = opcmImportacao;
    }

    public String getOpcmEntAntecipada() {
        return opcmEntAntecipada;
    }

    public void setOpcmEntAntecipada(String opcmEntAntecipada) {
        this.opcmEntAntecipada = opcmEntAntecipada;
    }

    public String getOpcmDevolucaoTerceiro() {
        return opcmDevolucaoTerceiro;
    }

    public void setOpcmDevolucaoTerceiro(String opcmDevolucaoTerceiro) {
        this.opcmDevolucaoTerceiro = opcmDevolucaoTerceiro;
    }

    @XmlTransient
    public List<Pedidos> getPedidosList() {
        return pedidosList;
    }

    public void setPedidosList(List<Pedidos> pedidosList) {
        this.pedidosList = pedidosList;
    }

    @XmlTransient
    public List<OpcomMotivodivergencia> getOpcomMotivodivergenciaList() {
        return opcomMotivodivergenciaList;
    }

    public void setOpcomMotivodivergenciaList(List<OpcomMotivodivergencia> opcomMotivodivergenciaList) {
        this.opcomMotivodivergenciaList = opcomMotivodivergenciaList;
    }

    public HistoricosMovimentacoes getHmovId() {
        return hmovId;
    }

    public void setHmovId(HistoricosMovimentacoes hmovId) {
        this.hmovId = hmovId;
    }

    public HistoricosPadrao getHpadId() {
        return hpadId;
    }

    public void setHpadId(HistoricosPadrao hpadId) {
        this.hpadId = hpadId;
    }

    public ModelosFormularios getMdfrId() {
        return mdfrId;
    }

    public void setMdfrId(ModelosFormularios mdfrId) {
        this.mdfrId = mdfrId;
    }

    public MotivosOperacao getMtopId() {
        return mtopId;
    }

    public void setMtopId(MotivosOperacao mtopId) {
        this.mtopId = mtopId;
    }

    public MotivosOperacao getMotMtopId() {
        return motMtopId;
    }

    public void setMotMtopId(MotivosOperacao motMtopId) {
        this.motMtopId = motMtopId;
    }

    public PlanoContas getPlaPlctId2() {
        return plaPlctId2;
    }

    public void setPlaPlctId2(PlanoContas plaPlctId2) {
        this.plaPlctId2 = plaPlctId2;
    }

    public PlanoContas getPlctId() {
        return plctId;
    }

    public void setPlctId(PlanoContas plctId) {
        this.plctId = plctId;
    }

    public PlanoContas getPlaPlctId() {
        return plaPlctId;
    }

    public void setPlaPlctId(PlanoContas plaPlctId) {
        this.plaPlctId = plaPlctId;
    }

    @XmlTransient
    public List<ClassificacaoFiscal> getClassificacaoFiscalList() {
        return classificacaoFiscalList;
    }

    public void setClassificacaoFiscalList(List<ClassificacaoFiscal> classificacaoFiscalList) {
        this.classificacaoFiscalList = classificacaoFiscalList;
    }

    @XmlTransient
    public List<OrcamentosVendas> getOrcamentosVendasList() {
        return orcamentosVendasList;
    }

    public void setOrcamentosVendasList(List<OrcamentosVendas> orcamentosVendasList) {
        this.orcamentosVendasList = orcamentosVendasList;
    }

    @XmlTransient
    public List<Locacoes> getLocacoesList() {
        return locacoesList;
    }

    public void setLocacoesList(List<Locacoes> locacoesList) {
        this.locacoesList = locacoesList;
    }

    @XmlTransient
    public List<Titulos> getTitulosList() {
        return titulosList;
    }

    public void setTitulosList(List<Titulos> titulosList) {
        this.titulosList = titulosList;
    }

    @XmlTransient
    public List<Cotacoes> getCotacoesList() {
        return cotacoesList;
    }

    public void setCotacoesList(List<Cotacoes> cotacoesList) {
        this.cotacoesList = cotacoesList;
    }

    @XmlTransient
    public List<OrdemServico> getOrdemServicoList() {
        return ordemServicoList;
    }

    public void setOrdemServicoList(List<OrdemServico> ordemServicoList) {
        this.ordemServicoList = ordemServicoList;
    }

    @XmlTransient
    public List<OpercomercTipospessoas> getOpercomercTipospessoasList() {
        return opercomercTipospessoasList;
    }

    public void setOpercomercTipospessoasList(List<OpercomercTipospessoas> opercomercTipospessoasList) {
        this.opercomercTipospessoasList = opercomercTipospessoasList;
    }

    @XmlTransient
    public List<FornecedoresSugestoescompras> getFornecedoresSugestoescomprasList() {
        return fornecedoresSugestoescomprasList;
    }

    public void setFornecedoresSugestoescomprasList(List<FornecedoresSugestoescompras> fornecedoresSugestoescomprasList) {
        this.fornecedoresSugestoescomprasList = fornecedoresSugestoescomprasList;
    }

    @XmlTransient
    public List<VendedoresOpercomerciais> getVendedoresOpercomerciaisList() {
        return vendedoresOpercomerciaisList;
    }

    public void setVendedoresOpercomerciaisList(List<VendedoresOpercomerciais> vendedoresOpercomerciaisList) {
        this.vendedoresOpercomerciaisList = vendedoresOpercomerciaisList;
    }

    @XmlTransient
    public List<OpcmTipospagamentos> getOpcmTipospagamentosList() {
        return opcmTipospagamentosList;
    }

    public void setOpcmTipospagamentosList(List<OpcmTipospagamentos> opcmTipospagamentosList) {
        this.opcmTipospagamentosList = opcmTipospagamentosList;
    }

    @XmlTransient
    public List<UnemOperacoesComerciais> getUnemOperacoesComerciaisList() {
        return unemOperacoesComerciaisList;
    }

    public void setUnemOperacoesComerciaisList(List<UnemOperacoesComerciais> unemOperacoesComerciaisList) {
        this.unemOperacoesComerciaisList = unemOperacoesComerciaisList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (opcmId != null ? opcmId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OperacoesComerciais)) {
            return false;
        }
        OperacoesComerciais other = (OperacoesComerciais) object;
        if ((this.opcmId == null && other.opcmId != null) || (this.opcmId != null && !this.opcmId.equals(other.opcmId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.OperacoesComerciais[ opcmId=" + opcmId + " ]";
    }
    
}
