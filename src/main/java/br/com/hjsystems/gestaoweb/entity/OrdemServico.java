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
@Table(name = "ORDEM_SERVICO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrdemServico.findAll", query = "SELECT o FROM OrdemServico o"),
    @NamedQuery(name = "OrdemServico.findByOrsvId", query = "SELECT o FROM OrdemServico o WHERE o.orsvId = :orsvId"),
    @NamedQuery(name = "OrdemServico.findByOrsvNumero", query = "SELECT o FROM OrdemServico o WHERE o.orsvNumero = :orsvNumero"),
    @NamedQuery(name = "OrdemServico.findByOrsvData", query = "SELECT o FROM OrdemServico o WHERE o.orsvData = :orsvData"),
    @NamedQuery(name = "OrdemServico.findByOrsvDataEntrega", query = "SELECT o FROM OrdemServico o WHERE o.orsvDataEntrega = :orsvDataEntrega"),
    @NamedQuery(name = "OrdemServico.findByOrsvObservacoes", query = "SELECT o FROM OrdemServico o WHERE o.orsvObservacoes = :orsvObservacoes"),
    @NamedQuery(name = "OrdemServico.findByOrsvVlrDesconto", query = "SELECT o FROM OrdemServico o WHERE o.orsvVlrDesconto = :orsvVlrDesconto"),
    @NamedQuery(name = "OrdemServico.findByOrsvVlrDescontoServico", query = "SELECT o FROM OrdemServico o WHERE o.orsvVlrDescontoServico = :orsvVlrDescontoServico"),
    @NamedQuery(name = "OrdemServico.findByOrsvVlrTotal", query = "SELECT o FROM OrdemServico o WHERE o.orsvVlrTotal = :orsvVlrTotal"),
    @NamedQuery(name = "OrdemServico.findByOrsvHodometro", query = "SELECT o FROM OrdemServico o WHERE o.orsvHodometro = :orsvHodometro"),
    @NamedQuery(name = "OrdemServico.findByOrsvDataFechamento", query = "SELECT o FROM OrdemServico o WHERE o.orsvDataFechamento = :orsvDataFechamento"),
    @NamedQuery(name = "OrdemServico.findByOrsvLastupdate", query = "SELECT o FROM OrdemServico o WHERE o.orsvLastupdate = :orsvLastupdate"),
    @NamedQuery(name = "OrdemServico.findByOrsvObservacoesNf", query = "SELECT o FROM OrdemServico o WHERE o.orsvObservacoesNf = :orsvObservacoesNf"),
    @NamedQuery(name = "OrdemServico.findByOrsvNrChecklist", query = "SELECT o FROM OrdemServico o WHERE o.orsvNrChecklist = :orsvNrChecklist"),
    @NamedQuery(name = "OrdemServico.findByOrsvTipoFrete", query = "SELECT o FROM OrdemServico o WHERE o.orsvTipoFrete = :orsvTipoFrete"),
    @NamedQuery(name = "OrdemServico.findByOrsvObservacoesTec", query = "SELECT o FROM OrdemServico o WHERE o.orsvObservacoesTec = :orsvObservacoesTec"),
    @NamedQuery(name = "OrdemServico.findByOrsvMotivoCanc", query = "SELECT o FROM OrdemServico o WHERE o.orsvMotivoCanc = :orsvMotivoCanc"),
    @NamedQuery(name = "OrdemServico.findByOrsvUsrsIdCanc", query = "SELECT o FROM OrdemServico o WHERE o.orsvUsrsIdCanc = :orsvUsrsIdCanc"),
    @NamedQuery(name = "OrdemServico.findByOrsvStatus", query = "SELECT o FROM OrdemServico o WHERE o.orsvStatus = :orsvStatus"),
    @NamedQuery(name = "OrdemServico.findByOrsvDataCanc", query = "SELECT o FROM OrdemServico o WHERE o.orsvDataCanc = :orsvDataCanc"),
    @NamedQuery(name = "OrdemServico.findByOrsvAcumulativo", query = "SELECT o FROM OrdemServico o WHERE o.orsvAcumulativo = :orsvAcumulativo"),
    @NamedQuery(name = "OrdemServico.findByOrsvTipoEntrega", query = "SELECT o FROM OrdemServico o WHERE o.orsvTipoEntrega = :orsvTipoEntrega"),
    @NamedQuery(name = "OrdemServico.findByCntsNome", query = "SELECT o FROM OrdemServico o WHERE o.cntsNome = :cntsNome"),
    @NamedQuery(name = "OrdemServico.findByOrsvCpfcnpj", query = "SELECT o FROM OrdemServico o WHERE o.orsvCpfcnpj = :orsvCpfcnpj"),
    @NamedQuery(name = "OrdemServico.findByOrsvNome", query = "SELECT o FROM OrdemServico o WHERE o.orsvNome = :orsvNome"),
    @NamedQuery(name = "OrdemServico.findByOrsvNumero1", query = "SELECT o FROM OrdemServico o WHERE o.orsvNumero1 = :orsvNumero1")})
public class OrdemServico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ORSV_ID")
    private String orsvId;
    @Column(name = "ORSV_NUMERO")
    private String orsvNumero;
    @Column(name = "ORSV_DATA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date orsvData;
    @Column(name = "ORSV_DATA_ENTREGA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date orsvDataEntrega;
    @Column(name = "ORSV_OBSERVACOES")
    private String orsvObservacoes;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "ORSV_VLR_DESCONTO")
    private BigDecimal orsvVlrDesconto;
    @Basic(optional = false)
    @Column(name = "ORSV_VLR_DESCONTO_SERVICO")
    private BigDecimal orsvVlrDescontoServico;
    @Basic(optional = false)
    @Column(name = "ORSV_VLR_TOTAL")
    private BigDecimal orsvVlrTotal;
    @Column(name = "ORSV_HODOMETRO")
    private Long orsvHodometro;
    @Column(name = "ORSV_DATA_FECHAMENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date orsvDataFechamento;
    @Column(name = "ORSV_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date orsvLastupdate;
    @Column(name = "ORSV_OBSERVACOES_NF")
    private String orsvObservacoesNf;
    @Column(name = "ORSV_NR_CHECKLIST")
    private String orsvNrChecklist;
    @Column(name = "ORSV_TIPO_FRETE")
    private String orsvTipoFrete;
    @Column(name = "ORSV_OBSERVACOES_TEC")
    private String orsvObservacoesTec;
    @Column(name = "ORSV_MOTIVO_CANC")
    private String orsvMotivoCanc;
    @Column(name = "ORSV_USRS_ID_CANC")
    private String orsvUsrsIdCanc;
    @Column(name = "ORSV_STATUS")
    private String orsvStatus;
    @Column(name = "ORSV_DATA_CANC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date orsvDataCanc;
    @Column(name = "ORSV_ACUMULATIVO")
    private String orsvAcumulativo;
    @Column(name = "ORSV_TIPO_ENTREGA")
    private String orsvTipoEntrega;
    @Column(name = "CNTS_NOME")
    private String cntsNome;
    @Column(name = "ORSV_CPFCNPJ")
    private String orsvCpfcnpj;
    @Column(name = "ORSV_NOME")
    private String orsvNome;
    @Column(name = "ORSV_NUMERO_1")
    private String orsvNumero1;
    @OneToMany(mappedBy = "orsvId")
    private List<Pedidos> pedidosList;
    @OneToMany(mappedBy = "orsvId")
    private List<HistoricosOrdemservico> historicosOrdemservicoList;
    @OneToMany(mappedBy = "orsvId")
    private List<Requisicoes> requisicoesList;
    @OneToMany(mappedBy = "orsvId")
    private List<Entregas> entregasList;
    @OneToMany(mappedBy = "orsvId")
    private List<OrdensServicosImagens> ordensServicosImagensList;
    @JoinColumn(name = "LCEQ_ID", referencedColumnName = "LCEQ_ID")
    @ManyToOne
    private LocacoesEquipamentos lceqId;
    @JoinColumn(name = "COFR_ID", referencedColumnName = "COFR_ID")
    @ManyToOne
    private Cofres cofrId;
    @JoinColumn(name = "ENDE_ID", referencedColumnName = "ENDE_ID")
    @ManyToOne
    private Enderecos endeId;
    @JoinColumn(name = "FVEN_ID", referencedColumnName = "FVEN_ID")
    @ManyToOne
    private FormasVencimento fvenId;
    @JoinColumn(name = "MDIA_ID", referencedColumnName = "MDIA_ID")
    @ManyToOne
    private Midias mdiaId;
    @JoinColumn(name = "TEC_TCNC_ID", referencedColumnName = "TCNC_ID")
    @ManyToOne
    private Tecnico tecTcncId;
    @JoinColumn(name = "USRS_ID", referencedColumnName = "USRS_ID")
    @ManyToOne
    private Usuarios usrsId;
    @JoinColumn(name = "MTCC_ID", referencedColumnName = "MTCC_ID")
    @ManyToOne
    private MotivoCancelamento mtccId;
    @JoinColumn(name = "VEIC_ID", referencedColumnName = "VEIC_ID")
    @ManyToOne
    private Veiculo veicId;
    @JoinColumn(name = "PES_PESS_ID", referencedColumnName = "PESS_ID")
    @ManyToOne
    private Pessoas pesPessId;
    @JoinColumn(name = "OPCM_ID", referencedColumnName = "OPCM_ID")
    @ManyToOne
    private OperacoesComerciais opcmId;
    @JoinColumn(name = "PESS_ID", referencedColumnName = "PESS_ID")
    @ManyToOne
    private Pessoas pessId;
    @JoinColumn(name = "TPOS_ID", referencedColumnName = "TPOS_ID")
    @ManyToOne
    private TipoOrdemServico tposId;
    @JoinColumn(name = "ORVD_ID", referencedColumnName = "ORVD_ID")
    @ManyToOne
    private OrcamentosVendas orvdId;
    @OneToMany(mappedBy = "ordOrsvId")
    private List<OrdemServico> ordemServicoList;
    @JoinColumn(name = "ORD_ORSV_ID", referencedColumnName = "ORSV_ID")
    @ManyToOne
    private OrdemServico ordOrsvId;
    @JoinColumn(name = "TCNC_ID", referencedColumnName = "TCNC_ID")
    @ManyToOne
    private Tecnico tcncId;
    @JoinColumn(name = "OREX_ID", referencedColumnName = "OREX_ID")
    @ManyToOne
    private OrgaoExpedidor orexId;
    @JoinColumn(name = "TBPC_ID", referencedColumnName = "TBPC_ID")
    @ManyToOne
    private TabelasPrecos tbpcId;
    @JoinColumn(name = "VDDR_ID", referencedColumnName = "VDDR_ID")
    @ManyToOne
    private Vendedores vddrId;
    @OneToMany(mappedBy = "orsvId")
    private List<OrdemProducao> ordemProducaoList;
    @OneToMany(mappedBy = "orsvId")
    private List<DivergenciasPedido> divergenciasPedidoList;

    public OrdemServico() {
    }

    public OrdemServico(String orsvId) {
        this.orsvId = orsvId;
    }

    public OrdemServico(String orsvId, BigDecimal orsvVlrDesconto, BigDecimal orsvVlrDescontoServico, BigDecimal orsvVlrTotal) {
        this.orsvId = orsvId;
        this.orsvVlrDesconto = orsvVlrDesconto;
        this.orsvVlrDescontoServico = orsvVlrDescontoServico;
        this.orsvVlrTotal = orsvVlrTotal;
    }

    public String getOrsvId() {
        return orsvId;
    }

    public void setOrsvId(String orsvId) {
        this.orsvId = orsvId;
    }

    public String getOrsvNumero() {
        return orsvNumero;
    }

    public void setOrsvNumero(String orsvNumero) {
        this.orsvNumero = orsvNumero;
    }

    public Date getOrsvData() {
        return orsvData;
    }

    public void setOrsvData(Date orsvData) {
        this.orsvData = orsvData;
    }

    public Date getOrsvDataEntrega() {
        return orsvDataEntrega;
    }

    public void setOrsvDataEntrega(Date orsvDataEntrega) {
        this.orsvDataEntrega = orsvDataEntrega;
    }

    public String getOrsvObservacoes() {
        return orsvObservacoes;
    }

    public void setOrsvObservacoes(String orsvObservacoes) {
        this.orsvObservacoes = orsvObservacoes;
    }

    public BigDecimal getOrsvVlrDesconto() {
        return orsvVlrDesconto;
    }

    public void setOrsvVlrDesconto(BigDecimal orsvVlrDesconto) {
        this.orsvVlrDesconto = orsvVlrDesconto;
    }

    public BigDecimal getOrsvVlrDescontoServico() {
        return orsvVlrDescontoServico;
    }

    public void setOrsvVlrDescontoServico(BigDecimal orsvVlrDescontoServico) {
        this.orsvVlrDescontoServico = orsvVlrDescontoServico;
    }

    public BigDecimal getOrsvVlrTotal() {
        return orsvVlrTotal;
    }

    public void setOrsvVlrTotal(BigDecimal orsvVlrTotal) {
        this.orsvVlrTotal = orsvVlrTotal;
    }

    public Long getOrsvHodometro() {
        return orsvHodometro;
    }

    public void setOrsvHodometro(Long orsvHodometro) {
        this.orsvHodometro = orsvHodometro;
    }

    public Date getOrsvDataFechamento() {
        return orsvDataFechamento;
    }

    public void setOrsvDataFechamento(Date orsvDataFechamento) {
        this.orsvDataFechamento = orsvDataFechamento;
    }

    public Date getOrsvLastupdate() {
        return orsvLastupdate;
    }

    public void setOrsvLastupdate(Date orsvLastupdate) {
        this.orsvLastupdate = orsvLastupdate;
    }

    public String getOrsvObservacoesNf() {
        return orsvObservacoesNf;
    }

    public void setOrsvObservacoesNf(String orsvObservacoesNf) {
        this.orsvObservacoesNf = orsvObservacoesNf;
    }

    public String getOrsvNrChecklist() {
        return orsvNrChecklist;
    }

    public void setOrsvNrChecklist(String orsvNrChecklist) {
        this.orsvNrChecklist = orsvNrChecklist;
    }

    public String getOrsvTipoFrete() {
        return orsvTipoFrete;
    }

    public void setOrsvTipoFrete(String orsvTipoFrete) {
        this.orsvTipoFrete = orsvTipoFrete;
    }

    public String getOrsvObservacoesTec() {
        return orsvObservacoesTec;
    }

    public void setOrsvObservacoesTec(String orsvObservacoesTec) {
        this.orsvObservacoesTec = orsvObservacoesTec;
    }

    public String getOrsvMotivoCanc() {
        return orsvMotivoCanc;
    }

    public void setOrsvMotivoCanc(String orsvMotivoCanc) {
        this.orsvMotivoCanc = orsvMotivoCanc;
    }

    public String getOrsvUsrsIdCanc() {
        return orsvUsrsIdCanc;
    }

    public void setOrsvUsrsIdCanc(String orsvUsrsIdCanc) {
        this.orsvUsrsIdCanc = orsvUsrsIdCanc;
    }

    public String getOrsvStatus() {
        return orsvStatus;
    }

    public void setOrsvStatus(String orsvStatus) {
        this.orsvStatus = orsvStatus;
    }

    public Date getOrsvDataCanc() {
        return orsvDataCanc;
    }

    public void setOrsvDataCanc(Date orsvDataCanc) {
        this.orsvDataCanc = orsvDataCanc;
    }

    public String getOrsvAcumulativo() {
        return orsvAcumulativo;
    }

    public void setOrsvAcumulativo(String orsvAcumulativo) {
        this.orsvAcumulativo = orsvAcumulativo;
    }

    public String getOrsvTipoEntrega() {
        return orsvTipoEntrega;
    }

    public void setOrsvTipoEntrega(String orsvTipoEntrega) {
        this.orsvTipoEntrega = orsvTipoEntrega;
    }

    public String getCntsNome() {
        return cntsNome;
    }

    public void setCntsNome(String cntsNome) {
        this.cntsNome = cntsNome;
    }

    public String getOrsvCpfcnpj() {
        return orsvCpfcnpj;
    }

    public void setOrsvCpfcnpj(String orsvCpfcnpj) {
        this.orsvCpfcnpj = orsvCpfcnpj;
    }

    public String getOrsvNome() {
        return orsvNome;
    }

    public void setOrsvNome(String orsvNome) {
        this.orsvNome = orsvNome;
    }

    public String getOrsvNumero1() {
        return orsvNumero1;
    }

    public void setOrsvNumero1(String orsvNumero1) {
        this.orsvNumero1 = orsvNumero1;
    }

    @XmlTransient
    public List<Pedidos> getPedidosList() {
        return pedidosList;
    }

    public void setPedidosList(List<Pedidos> pedidosList) {
        this.pedidosList = pedidosList;
    }

    @XmlTransient
    public List<HistoricosOrdemservico> getHistoricosOrdemservicoList() {
        return historicosOrdemservicoList;
    }

    public void setHistoricosOrdemservicoList(List<HistoricosOrdemservico> historicosOrdemservicoList) {
        this.historicosOrdemservicoList = historicosOrdemservicoList;
    }

    @XmlTransient
    public List<Requisicoes> getRequisicoesList() {
        return requisicoesList;
    }

    public void setRequisicoesList(List<Requisicoes> requisicoesList) {
        this.requisicoesList = requisicoesList;
    }

    @XmlTransient
    public List<Entregas> getEntregasList() {
        return entregasList;
    }

    public void setEntregasList(List<Entregas> entregasList) {
        this.entregasList = entregasList;
    }

    @XmlTransient
    public List<OrdensServicosImagens> getOrdensServicosImagensList() {
        return ordensServicosImagensList;
    }

    public void setOrdensServicosImagensList(List<OrdensServicosImagens> ordensServicosImagensList) {
        this.ordensServicosImagensList = ordensServicosImagensList;
    }

    public LocacoesEquipamentos getLceqId() {
        return lceqId;
    }

    public void setLceqId(LocacoesEquipamentos lceqId) {
        this.lceqId = lceqId;
    }

    public Cofres getCofrId() {
        return cofrId;
    }

    public void setCofrId(Cofres cofrId) {
        this.cofrId = cofrId;
    }

    public Enderecos getEndeId() {
        return endeId;
    }

    public void setEndeId(Enderecos endeId) {
        this.endeId = endeId;
    }

    public FormasVencimento getFvenId() {
        return fvenId;
    }

    public void setFvenId(FormasVencimento fvenId) {
        this.fvenId = fvenId;
    }

    public Midias getMdiaId() {
        return mdiaId;
    }

    public void setMdiaId(Midias mdiaId) {
        this.mdiaId = mdiaId;
    }

    public Tecnico getTecTcncId() {
        return tecTcncId;
    }

    public void setTecTcncId(Tecnico tecTcncId) {
        this.tecTcncId = tecTcncId;
    }

    public Usuarios getUsrsId() {
        return usrsId;
    }

    public void setUsrsId(Usuarios usrsId) {
        this.usrsId = usrsId;
    }

    public MotivoCancelamento getMtccId() {
        return mtccId;
    }

    public void setMtccId(MotivoCancelamento mtccId) {
        this.mtccId = mtccId;
    }

    public Veiculo getVeicId() {
        return veicId;
    }

    public void setVeicId(Veiculo veicId) {
        this.veicId = veicId;
    }

    public Pessoas getPesPessId() {
        return pesPessId;
    }

    public void setPesPessId(Pessoas pesPessId) {
        this.pesPessId = pesPessId;
    }

    public OperacoesComerciais getOpcmId() {
        return opcmId;
    }

    public void setOpcmId(OperacoesComerciais opcmId) {
        this.opcmId = opcmId;
    }

    public Pessoas getPessId() {
        return pessId;
    }

    public void setPessId(Pessoas pessId) {
        this.pessId = pessId;
    }

    public TipoOrdemServico getTposId() {
        return tposId;
    }

    public void setTposId(TipoOrdemServico tposId) {
        this.tposId = tposId;
    }

    public OrcamentosVendas getOrvdId() {
        return orvdId;
    }

    public void setOrvdId(OrcamentosVendas orvdId) {
        this.orvdId = orvdId;
    }

    @XmlTransient
    public List<OrdemServico> getOrdemServicoList() {
        return ordemServicoList;
    }

    public void setOrdemServicoList(List<OrdemServico> ordemServicoList) {
        this.ordemServicoList = ordemServicoList;
    }

    public OrdemServico getOrdOrsvId() {
        return ordOrsvId;
    }

    public void setOrdOrsvId(OrdemServico ordOrsvId) {
        this.ordOrsvId = ordOrsvId;
    }

    public Tecnico getTcncId() {
        return tcncId;
    }

    public void setTcncId(Tecnico tcncId) {
        this.tcncId = tcncId;
    }

    public OrgaoExpedidor getOrexId() {
        return orexId;
    }

    public void setOrexId(OrgaoExpedidor orexId) {
        this.orexId = orexId;
    }

    public TabelasPrecos getTbpcId() {
        return tbpcId;
    }

    public void setTbpcId(TabelasPrecos tbpcId) {
        this.tbpcId = tbpcId;
    }

    public Vendedores getVddrId() {
        return vddrId;
    }

    public void setVddrId(Vendedores vddrId) {
        this.vddrId = vddrId;
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
        hash += (orsvId != null ? orsvId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrdemServico)) {
            return false;
        }
        OrdemServico other = (OrdemServico) object;
        if ((this.orsvId == null && other.orsvId != null) || (this.orsvId != null && !this.orsvId.equals(other.orsvId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.OrdemServico[ orsvId=" + orsvId + " ]";
    }
    
}
