/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hjsystems.gestaoweb.entity;

import java.io.Serializable;
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
@Table(name = "PLANO_CONTAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PlanoContas.findAll", query = "SELECT p FROM PlanoContas p"),
    @NamedQuery(name = "PlanoContas.findByPlctId", query = "SELECT p FROM PlanoContas p WHERE p.plctId = :plctId"),
    @NamedQuery(name = "PlanoContas.findByPlctConta", query = "SELECT p FROM PlanoContas p WHERE p.plctConta = :plctConta"),
    @NamedQuery(name = "PlanoContas.findByPlctNome", query = "SELECT p FROM PlanoContas p WHERE p.plctNome = :plctNome"),
    @NamedQuery(name = "PlanoContas.findByPlctReduzida", query = "SELECT p FROM PlanoContas p WHERE p.plctReduzida = :plctReduzida"),
    @NamedQuery(name = "PlanoContas.findByPlctDebitoCredito", query = "SELECT p FROM PlanoContas p WHERE p.plctDebitoCredito = :plctDebitoCredito"),
    @NamedQuery(name = "PlanoContas.findByPlctTipoConta", query = "SELECT p FROM PlanoContas p WHERE p.plctTipoConta = :plctTipoConta"),
    @NamedQuery(name = "PlanoContas.findByPlctLocalConta", query = "SELECT p FROM PlanoContas p WHERE p.plctLocalConta = :plctLocalConta"),
    @NamedQuery(name = "PlanoContas.findByPlctSequenciaDre", query = "SELECT p FROM PlanoContas p WHERE p.plctSequenciaDre = :plctSequenciaDre"),
    @NamedQuery(name = "PlanoContas.findByPlctCnpjCpf", query = "SELECT p FROM PlanoContas p WHERE p.plctCnpjCpf = :plctCnpjCpf"),
    @NamedQuery(name = "PlanoContas.findByPlctSituacao", query = "SELECT p FROM PlanoContas p WHERE p.plctSituacao = :plctSituacao"),
    @NamedQuery(name = "PlanoContas.findByPlCtLASTUPDATE", query = "SELECT p FROM PlanoContas p WHERE p.plCtLASTUPDATE = :plCtLASTUPDATE"),
    @NamedQuery(name = "PlanoContas.findByPlctParteSintConta", query = "SELECT p FROM PlanoContas p WHERE p.plctParteSintConta = :plctParteSintConta"),
    @NamedQuery(name = "PlanoContas.findByPplctAtivoDre", query = "SELECT p FROM PlanoContas p WHERE p.pplctAtivoDre = :pplctAtivoDre"),
    @NamedQuery(name = "PlanoContas.findByPlctNomeDre", query = "SELECT p FROM PlanoContas p WHERE p.plctNomeDre = :plctNomeDre"),
    @NamedQuery(name = "PlanoContas.findByPlctAtivoDre", query = "SELECT p FROM PlanoContas p WHERE p.plctAtivoDre = :plctAtivoDre")})
public class PlanoContas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PLCT_ID")
    private String plctId;
    @Basic(optional = false)
    @Column(name = "PLCT_CONTA")
    private String plctConta;
    @Column(name = "PLCT_NOME")
    private String plctNome;
    @Column(name = "PLCT_REDUZIDA")
    private String plctReduzida;
    @Column(name = "PLCT_DEBITO_CREDITO")
    private String plctDebitoCredito;
    @Column(name = "PLCT_TIPO_CONTA")
    private String plctTipoConta;
    @Basic(optional = false)
    @Column(name = "PLCT_LOCAL_CONTA")
    private String plctLocalConta;
    @Column(name = "PLCT_SEQUENCIA_DRE")
    private Integer plctSequenciaDre;
    @Column(name = "PLCT_CNPJ_CPF")
    private String plctCnpjCpf;
    @Basic(optional = false)
    @Column(name = "PLCT_SITUACAO")
    private String plctSituacao;
    @Column(name = "PlCt_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date plCtLASTUPDATE;
    @Column(name = "PLCT_PARTE_SINT_CONTA")
    private String plctParteSintConta;
    @Column(name = "PPLCT_ATIVO_DRE")
    private String pplctAtivoDre;
    @Column(name = "PLCT_NOME_DRE")
    private String plctNomeDre;
    @Column(name = "PLCT_ATIVO_DRE")
    private String plctAtivoDre;
    @OneToMany(mappedBy = "plctId")
    private List<ItensCaixasFornecedores> itensCaixasFornecedoresList;
    @OneToMany(mappedBy = "plctId")
    private List<CentrocustoParamcontab> centrocustoParamcontabList;
    @OneToMany(mappedBy = "plaPlctId")
    private List<Cofres> cofresList;
    @OneToMany(mappedBy = "plctId")
    private List<Cofres> cofresList1;
    @OneToMany(mappedBy = "plctId")
    private List<Produtos> produtosList;
    @OneToMany(mappedBy = "plaPlctId2")
    private List<OperacoesComerciais> operacoesComerciaisList;
    @OneToMany(mappedBy = "plctId")
    private List<OperacoesComerciais> operacoesComerciaisList1;
    @OneToMany(mappedBy = "plaPlctId")
    private List<OperacoesComerciais> operacoesComerciaisList2;
    @OneToMany(mappedBy = "plctId")
    private List<DcfsLanccontabeis> dcfsLanccontabeisList;
    @OneToMany(mappedBy = "plaPlctId")
    private List<DcfsLanccontabeis> dcfsLanccontabeisList1;
    @OneToMany(mappedBy = "plaPlctId")
    private List<PlanoContasTotais> planoContasTotaisList;
    @OneToMany(mappedBy = "plctId")
    private List<PlanoContasTotais> planoContasTotaisList1;
    @OneToMany(mappedBy = "plctId")
    private List<ContasSinteticasParContabeis> contasSinteticasParContabeisList;
    @OneToMany(mappedBy = "plctId")
    private List<ParametroscontRecPagar> parametroscontRecPagarList;
    @OneToMany(mappedBy = "plctId")
    private List<TitulosCentroCustos> titulosCentroCustosList;
    @OneToMany(mappedBy = "plctId")
    private List<Grupos> gruposList;
    @OneToMany(mappedBy = "plaPlctId")
    private List<Grupos> gruposList1;
    @OneToMany(mappedBy = "plaPlctId")
    private List<ContasEncerramentoMensal> contasEncerramentoMensalList;
    @OneToMany(mappedBy = "plctId")
    private List<ContasEncerramentoMensal> contasEncerramentoMensalList1;
    @OneToMany(mappedBy = "plctId")
    private List<SaldosContas> saldosContasList;
    @JoinColumn(name = "HPAD_ID", referencedColumnName = "HPAD_ID")
    @ManyToOne
    private HistoricosPadrao hpadId;
    @OneToMany(mappedBy = "plaPlctId2")
    private List<PlanoContas> planoContasList;
    @JoinColumn(name = "PLA_PLCT_ID2", referencedColumnName = "PLCT_ID")
    @ManyToOne
    private PlanoContas plaPlctId2;
    @OneToMany(mappedBy = "plaPlctId")
    private List<PlanoContas> planoContasList1;
    @JoinColumn(name = "PLA_PLCT_ID", referencedColumnName = "PLCT_ID")
    @ManyToOne
    private PlanoContas plaPlctId;
    @OneToMany(mappedBy = "plaPlctId3")
    private List<PlanoContas> planoContasList2;
    @JoinColumn(name = "PLA_PLCT_ID3", referencedColumnName = "PLCT_ID")
    @ManyToOne
    private PlanoContas plaPlctId3;
    @OneToMany(mappedBy = "plctId")
    private List<Titulos> titulosList;
    @OneToMany(mappedBy = "plctId")
    private List<Parcelas> parcelasList;
    @OneToMany(mappedBy = "plctId")
    private List<Clientes> clientesList;
    @OneToMany(mappedBy = "plctId")
    private List<PedidosCentroCustos> pedidosCentroCustosList;
    @OneToMany(mappedBy = "plctId")
    private List<ProdutosTipospagamentos> produtosTipospagamentosList;
    @OneToMany(mappedBy = "plctId")
    private List<ItensLancContPersonal> itensLancContPersonalList;
    @OneToMany(mappedBy = "plaPlctId")
    private List<ItensLancContPersonal> itensLancContPersonalList1;
    @OneToMany(mappedBy = "plaPlctId")
    private List<ConfigParamContabeis> configParamContabeisList;
    @OneToMany(mappedBy = "plctId")
    private List<ConfigParamContabeis> configParamContabeisList1;
    @OneToMany(mappedBy = "plctId")
    private List<ItensCaixas> itensCaixasList;
    @OneToMany(mappedBy = "plaPlctId")
    private List<ItensCaixas> itensCaixasList1;
    @OneToMany(mappedBy = "plctId")
    private List<Patrimonio> patrimonioList;
    @OneToMany(mappedBy = "plaPlctId")
    private List<Fornecedores> fornecedoresList;
    @OneToMany(mappedBy = "plctId")
    private List<Fornecedores> fornecedoresList1;
    @OneToMany(mappedBy = "plctId")
    private List<ItensRelatorioGenerico> itensRelatorioGenericoList;
    @OneToMany(mappedBy = "plctId")
    private List<GruposTipospagamentos> gruposTipospagamentosList;
    @OneToMany(mappedBy = "plctId")
    private List<OpcmTipospagamentos> opcmTipospagamentosList;
    @OneToMany(mappedBy = "plaPlctId")
    private List<OpcmTipospagamentos> opcmTipospagamentosList1;
    @OneToMany(mappedBy = "plctId")
    private List<MovimentoContabil> movimentoContabilList;
    @OneToMany(mappedBy = "plaPlctId")
    private List<MovimentoContabil> movimentoContabilList1;

    public PlanoContas() {
    }

    public PlanoContas(String plctId) {
        this.plctId = plctId;
    }

    public PlanoContas(String plctId, String plctConta, String plctLocalConta, String plctSituacao) {
        this.plctId = plctId;
        this.plctConta = plctConta;
        this.plctLocalConta = plctLocalConta;
        this.plctSituacao = plctSituacao;
    }

    public String getPlctId() {
        return plctId;
    }

    public void setPlctId(String plctId) {
        this.plctId = plctId;
    }

    public String getPlctConta() {
        return plctConta;
    }

    public void setPlctConta(String plctConta) {
        this.plctConta = plctConta;
    }

    public String getPlctNome() {
        return plctNome;
    }

    public void setPlctNome(String plctNome) {
        this.plctNome = plctNome;
    }

    public String getPlctReduzida() {
        return plctReduzida;
    }

    public void setPlctReduzida(String plctReduzida) {
        this.plctReduzida = plctReduzida;
    }

    public String getPlctDebitoCredito() {
        return plctDebitoCredito;
    }

    public void setPlctDebitoCredito(String plctDebitoCredito) {
        this.plctDebitoCredito = plctDebitoCredito;
    }

    public String getPlctTipoConta() {
        return plctTipoConta;
    }

    public void setPlctTipoConta(String plctTipoConta) {
        this.plctTipoConta = plctTipoConta;
    }

    public String getPlctLocalConta() {
        return plctLocalConta;
    }

    public void setPlctLocalConta(String plctLocalConta) {
        this.plctLocalConta = plctLocalConta;
    }

    public Integer getPlctSequenciaDre() {
        return plctSequenciaDre;
    }

    public void setPlctSequenciaDre(Integer plctSequenciaDre) {
        this.plctSequenciaDre = plctSequenciaDre;
    }

    public String getPlctCnpjCpf() {
        return plctCnpjCpf;
    }

    public void setPlctCnpjCpf(String plctCnpjCpf) {
        this.plctCnpjCpf = plctCnpjCpf;
    }

    public String getPlctSituacao() {
        return plctSituacao;
    }

    public void setPlctSituacao(String plctSituacao) {
        this.plctSituacao = plctSituacao;
    }

    public Date getPlCtLASTUPDATE() {
        return plCtLASTUPDATE;
    }

    public void setPlCtLASTUPDATE(Date plCtLASTUPDATE) {
        this.plCtLASTUPDATE = plCtLASTUPDATE;
    }

    public String getPlctParteSintConta() {
        return plctParteSintConta;
    }

    public void setPlctParteSintConta(String plctParteSintConta) {
        this.plctParteSintConta = plctParteSintConta;
    }

    public String getPplctAtivoDre() {
        return pplctAtivoDre;
    }

    public void setPplctAtivoDre(String pplctAtivoDre) {
        this.pplctAtivoDre = pplctAtivoDre;
    }

    public String getPlctNomeDre() {
        return plctNomeDre;
    }

    public void setPlctNomeDre(String plctNomeDre) {
        this.plctNomeDre = plctNomeDre;
    }

    public String getPlctAtivoDre() {
        return plctAtivoDre;
    }

    public void setPlctAtivoDre(String plctAtivoDre) {
        this.plctAtivoDre = plctAtivoDre;
    }

    @XmlTransient
    public List<ItensCaixasFornecedores> getItensCaixasFornecedoresList() {
        return itensCaixasFornecedoresList;
    }

    public void setItensCaixasFornecedoresList(List<ItensCaixasFornecedores> itensCaixasFornecedoresList) {
        this.itensCaixasFornecedoresList = itensCaixasFornecedoresList;
    }

    @XmlTransient
    public List<CentrocustoParamcontab> getCentrocustoParamcontabList() {
        return centrocustoParamcontabList;
    }

    public void setCentrocustoParamcontabList(List<CentrocustoParamcontab> centrocustoParamcontabList) {
        this.centrocustoParamcontabList = centrocustoParamcontabList;
    }

    @XmlTransient
    public List<Cofres> getCofresList() {
        return cofresList;
    }

    public void setCofresList(List<Cofres> cofresList) {
        this.cofresList = cofresList;
    }

    @XmlTransient
    public List<Cofres> getCofresList1() {
        return cofresList1;
    }

    public void setCofresList1(List<Cofres> cofresList1) {
        this.cofresList1 = cofresList1;
    }

    @XmlTransient
    public List<Produtos> getProdutosList() {
        return produtosList;
    }

    public void setProdutosList(List<Produtos> produtosList) {
        this.produtosList = produtosList;
    }

    @XmlTransient
    public List<OperacoesComerciais> getOperacoesComerciaisList() {
        return operacoesComerciaisList;
    }

    public void setOperacoesComerciaisList(List<OperacoesComerciais> operacoesComerciaisList) {
        this.operacoesComerciaisList = operacoesComerciaisList;
    }

    @XmlTransient
    public List<OperacoesComerciais> getOperacoesComerciaisList1() {
        return operacoesComerciaisList1;
    }

    public void setOperacoesComerciaisList1(List<OperacoesComerciais> operacoesComerciaisList1) {
        this.operacoesComerciaisList1 = operacoesComerciaisList1;
    }

    @XmlTransient
    public List<OperacoesComerciais> getOperacoesComerciaisList2() {
        return operacoesComerciaisList2;
    }

    public void setOperacoesComerciaisList2(List<OperacoesComerciais> operacoesComerciaisList2) {
        this.operacoesComerciaisList2 = operacoesComerciaisList2;
    }

    @XmlTransient
    public List<DcfsLanccontabeis> getDcfsLanccontabeisList() {
        return dcfsLanccontabeisList;
    }

    public void setDcfsLanccontabeisList(List<DcfsLanccontabeis> dcfsLanccontabeisList) {
        this.dcfsLanccontabeisList = dcfsLanccontabeisList;
    }

    @XmlTransient
    public List<DcfsLanccontabeis> getDcfsLanccontabeisList1() {
        return dcfsLanccontabeisList1;
    }

    public void setDcfsLanccontabeisList1(List<DcfsLanccontabeis> dcfsLanccontabeisList1) {
        this.dcfsLanccontabeisList1 = dcfsLanccontabeisList1;
    }

    @XmlTransient
    public List<PlanoContasTotais> getPlanoContasTotaisList() {
        return planoContasTotaisList;
    }

    public void setPlanoContasTotaisList(List<PlanoContasTotais> planoContasTotaisList) {
        this.planoContasTotaisList = planoContasTotaisList;
    }

    @XmlTransient
    public List<PlanoContasTotais> getPlanoContasTotaisList1() {
        return planoContasTotaisList1;
    }

    public void setPlanoContasTotaisList1(List<PlanoContasTotais> planoContasTotaisList1) {
        this.planoContasTotaisList1 = planoContasTotaisList1;
    }

    @XmlTransient
    public List<ContasSinteticasParContabeis> getContasSinteticasParContabeisList() {
        return contasSinteticasParContabeisList;
    }

    public void setContasSinteticasParContabeisList(List<ContasSinteticasParContabeis> contasSinteticasParContabeisList) {
        this.contasSinteticasParContabeisList = contasSinteticasParContabeisList;
    }

    @XmlTransient
    public List<ParametroscontRecPagar> getParametroscontRecPagarList() {
        return parametroscontRecPagarList;
    }

    public void setParametroscontRecPagarList(List<ParametroscontRecPagar> parametroscontRecPagarList) {
        this.parametroscontRecPagarList = parametroscontRecPagarList;
    }

    @XmlTransient
    public List<TitulosCentroCustos> getTitulosCentroCustosList() {
        return titulosCentroCustosList;
    }

    public void setTitulosCentroCustosList(List<TitulosCentroCustos> titulosCentroCustosList) {
        this.titulosCentroCustosList = titulosCentroCustosList;
    }

    @XmlTransient
    public List<Grupos> getGruposList() {
        return gruposList;
    }

    public void setGruposList(List<Grupos> gruposList) {
        this.gruposList = gruposList;
    }

    @XmlTransient
    public List<Grupos> getGruposList1() {
        return gruposList1;
    }

    public void setGruposList1(List<Grupos> gruposList1) {
        this.gruposList1 = gruposList1;
    }

    @XmlTransient
    public List<ContasEncerramentoMensal> getContasEncerramentoMensalList() {
        return contasEncerramentoMensalList;
    }

    public void setContasEncerramentoMensalList(List<ContasEncerramentoMensal> contasEncerramentoMensalList) {
        this.contasEncerramentoMensalList = contasEncerramentoMensalList;
    }

    @XmlTransient
    public List<ContasEncerramentoMensal> getContasEncerramentoMensalList1() {
        return contasEncerramentoMensalList1;
    }

    public void setContasEncerramentoMensalList1(List<ContasEncerramentoMensal> contasEncerramentoMensalList1) {
        this.contasEncerramentoMensalList1 = contasEncerramentoMensalList1;
    }

    @XmlTransient
    public List<SaldosContas> getSaldosContasList() {
        return saldosContasList;
    }

    public void setSaldosContasList(List<SaldosContas> saldosContasList) {
        this.saldosContasList = saldosContasList;
    }

    public HistoricosPadrao getHpadId() {
        return hpadId;
    }

    public void setHpadId(HistoricosPadrao hpadId) {
        this.hpadId = hpadId;
    }

    @XmlTransient
    public List<PlanoContas> getPlanoContasList() {
        return planoContasList;
    }

    public void setPlanoContasList(List<PlanoContas> planoContasList) {
        this.planoContasList = planoContasList;
    }

    public PlanoContas getPlaPlctId2() {
        return plaPlctId2;
    }

    public void setPlaPlctId2(PlanoContas plaPlctId2) {
        this.plaPlctId2 = plaPlctId2;
    }

    @XmlTransient
    public List<PlanoContas> getPlanoContasList1() {
        return planoContasList1;
    }

    public void setPlanoContasList1(List<PlanoContas> planoContasList1) {
        this.planoContasList1 = planoContasList1;
    }

    public PlanoContas getPlaPlctId() {
        return plaPlctId;
    }

    public void setPlaPlctId(PlanoContas plaPlctId) {
        this.plaPlctId = plaPlctId;
    }

    @XmlTransient
    public List<PlanoContas> getPlanoContasList2() {
        return planoContasList2;
    }

    public void setPlanoContasList2(List<PlanoContas> planoContasList2) {
        this.planoContasList2 = planoContasList2;
    }

    public PlanoContas getPlaPlctId3() {
        return plaPlctId3;
    }

    public void setPlaPlctId3(PlanoContas plaPlctId3) {
        this.plaPlctId3 = plaPlctId3;
    }

    @XmlTransient
    public List<Titulos> getTitulosList() {
        return titulosList;
    }

    public void setTitulosList(List<Titulos> titulosList) {
        this.titulosList = titulosList;
    }

    @XmlTransient
    public List<Parcelas> getParcelasList() {
        return parcelasList;
    }

    public void setParcelasList(List<Parcelas> parcelasList) {
        this.parcelasList = parcelasList;
    }

    @XmlTransient
    public List<Clientes> getClientesList() {
        return clientesList;
    }

    public void setClientesList(List<Clientes> clientesList) {
        this.clientesList = clientesList;
    }

    @XmlTransient
    public List<PedidosCentroCustos> getPedidosCentroCustosList() {
        return pedidosCentroCustosList;
    }

    public void setPedidosCentroCustosList(List<PedidosCentroCustos> pedidosCentroCustosList) {
        this.pedidosCentroCustosList = pedidosCentroCustosList;
    }

    @XmlTransient
    public List<ProdutosTipospagamentos> getProdutosTipospagamentosList() {
        return produtosTipospagamentosList;
    }

    public void setProdutosTipospagamentosList(List<ProdutosTipospagamentos> produtosTipospagamentosList) {
        this.produtosTipospagamentosList = produtosTipospagamentosList;
    }

    @XmlTransient
    public List<ItensLancContPersonal> getItensLancContPersonalList() {
        return itensLancContPersonalList;
    }

    public void setItensLancContPersonalList(List<ItensLancContPersonal> itensLancContPersonalList) {
        this.itensLancContPersonalList = itensLancContPersonalList;
    }

    @XmlTransient
    public List<ItensLancContPersonal> getItensLancContPersonalList1() {
        return itensLancContPersonalList1;
    }

    public void setItensLancContPersonalList1(List<ItensLancContPersonal> itensLancContPersonalList1) {
        this.itensLancContPersonalList1 = itensLancContPersonalList1;
    }

    @XmlTransient
    public List<ConfigParamContabeis> getConfigParamContabeisList() {
        return configParamContabeisList;
    }

    public void setConfigParamContabeisList(List<ConfigParamContabeis> configParamContabeisList) {
        this.configParamContabeisList = configParamContabeisList;
    }

    @XmlTransient
    public List<ConfigParamContabeis> getConfigParamContabeisList1() {
        return configParamContabeisList1;
    }

    public void setConfigParamContabeisList1(List<ConfigParamContabeis> configParamContabeisList1) {
        this.configParamContabeisList1 = configParamContabeisList1;
    }

    @XmlTransient
    public List<ItensCaixas> getItensCaixasList() {
        return itensCaixasList;
    }

    public void setItensCaixasList(List<ItensCaixas> itensCaixasList) {
        this.itensCaixasList = itensCaixasList;
    }

    @XmlTransient
    public List<ItensCaixas> getItensCaixasList1() {
        return itensCaixasList1;
    }

    public void setItensCaixasList1(List<ItensCaixas> itensCaixasList1) {
        this.itensCaixasList1 = itensCaixasList1;
    }

    @XmlTransient
    public List<Patrimonio> getPatrimonioList() {
        return patrimonioList;
    }

    public void setPatrimonioList(List<Patrimonio> patrimonioList) {
        this.patrimonioList = patrimonioList;
    }

    @XmlTransient
    public List<Fornecedores> getFornecedoresList() {
        return fornecedoresList;
    }

    public void setFornecedoresList(List<Fornecedores> fornecedoresList) {
        this.fornecedoresList = fornecedoresList;
    }

    @XmlTransient
    public List<Fornecedores> getFornecedoresList1() {
        return fornecedoresList1;
    }

    public void setFornecedoresList1(List<Fornecedores> fornecedoresList1) {
        this.fornecedoresList1 = fornecedoresList1;
    }

    @XmlTransient
    public List<ItensRelatorioGenerico> getItensRelatorioGenericoList() {
        return itensRelatorioGenericoList;
    }

    public void setItensRelatorioGenericoList(List<ItensRelatorioGenerico> itensRelatorioGenericoList) {
        this.itensRelatorioGenericoList = itensRelatorioGenericoList;
    }

    @XmlTransient
    public List<GruposTipospagamentos> getGruposTipospagamentosList() {
        return gruposTipospagamentosList;
    }

    public void setGruposTipospagamentosList(List<GruposTipospagamentos> gruposTipospagamentosList) {
        this.gruposTipospagamentosList = gruposTipospagamentosList;
    }

    @XmlTransient
    public List<OpcmTipospagamentos> getOpcmTipospagamentosList() {
        return opcmTipospagamentosList;
    }

    public void setOpcmTipospagamentosList(List<OpcmTipospagamentos> opcmTipospagamentosList) {
        this.opcmTipospagamentosList = opcmTipospagamentosList;
    }

    @XmlTransient
    public List<OpcmTipospagamentos> getOpcmTipospagamentosList1() {
        return opcmTipospagamentosList1;
    }

    public void setOpcmTipospagamentosList1(List<OpcmTipospagamentos> opcmTipospagamentosList1) {
        this.opcmTipospagamentosList1 = opcmTipospagamentosList1;
    }

    @XmlTransient
    public List<MovimentoContabil> getMovimentoContabilList() {
        return movimentoContabilList;
    }

    public void setMovimentoContabilList(List<MovimentoContabil> movimentoContabilList) {
        this.movimentoContabilList = movimentoContabilList;
    }

    @XmlTransient
    public List<MovimentoContabil> getMovimentoContabilList1() {
        return movimentoContabilList1;
    }

    public void setMovimentoContabilList1(List<MovimentoContabil> movimentoContabilList1) {
        this.movimentoContabilList1 = movimentoContabilList1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (plctId != null ? plctId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlanoContas)) {
            return false;
        }
        PlanoContas other = (PlanoContas) object;
        if ((this.plctId == null && other.plctId != null) || (this.plctId != null && !this.plctId.equals(other.plctId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.PlanoContas[ plctId=" + plctId + " ]";
    }
    
}
