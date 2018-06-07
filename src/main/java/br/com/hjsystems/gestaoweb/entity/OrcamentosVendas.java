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
@Table(name = "ORCAMENTOS_VENDAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrcamentosVendas.findAll", query = "SELECT o FROM OrcamentosVendas o"),
    @NamedQuery(name = "OrcamentosVendas.findByOrvdId", query = "SELECT o FROM OrcamentosVendas o WHERE o.orvdId = :orvdId"),
    @NamedQuery(name = "OrcamentosVendas.findByOrvdNumero", query = "SELECT o FROM OrcamentosVendas o WHERE o.orvdNumero = :orvdNumero"),
    @NamedQuery(name = "OrcamentosVendas.findByOrvdData", query = "SELECT o FROM OrcamentosVendas o WHERE o.orvdData = :orvdData"),
    @NamedQuery(name = "OrcamentosVendas.findByOrvdValidade", query = "SELECT o FROM OrcamentosVendas o WHERE o.orvdValidade = :orvdValidade"),
    @NamedQuery(name = "OrcamentosVendas.findByOrvdReservadoAte", query = "SELECT o FROM OrcamentosVendas o WHERE o.orvdReservadoAte = :orvdReservadoAte"),
    @NamedQuery(name = "OrcamentosVendas.findByOrvdVlrFrete", query = "SELECT o FROM OrcamentosVendas o WHERE o.orvdVlrFrete = :orvdVlrFrete"),
    @NamedQuery(name = "OrcamentosVendas.findByOrvdVlrSeguro", query = "SELECT o FROM OrcamentosVendas o WHERE o.orvdVlrSeguro = :orvdVlrSeguro"),
    @NamedQuery(name = "OrcamentosVendas.findByOrvdVlrDespesas", query = "SELECT o FROM OrcamentosVendas o WHERE o.orvdVlrDespesas = :orvdVlrDespesas"),
    @NamedQuery(name = "OrcamentosVendas.findByOrvdVlrEntrada", query = "SELECT o FROM OrcamentosVendas o WHERE o.orvdVlrEntrada = :orvdVlrEntrada"),
    @NamedQuery(name = "OrcamentosVendas.findByOrvdVlrDesconto", query = "SELECT o FROM OrcamentosVendas o WHERE o.orvdVlrDesconto = :orvdVlrDesconto"),
    @NamedQuery(name = "OrcamentosVendas.findByOrvdVlrDescontoServico", query = "SELECT o FROM OrcamentosVendas o WHERE o.orvdVlrDescontoServico = :orvdVlrDescontoServico"),
    @NamedQuery(name = "OrcamentosVendas.findByOrvdVlrTotal", query = "SELECT o FROM OrcamentosVendas o WHERE o.orvdVlrTotal = :orvdVlrTotal"),
    @NamedQuery(name = "OrcamentosVendas.findByOrvdStatus", query = "SELECT o FROM OrcamentosVendas o WHERE o.orvdStatus = :orvdStatus"),
    @NamedQuery(name = "OrcamentosVendas.findByOrvdObservacao", query = "SELECT o FROM OrcamentosVendas o WHERE o.orvdObservacao = :orvdObservacao"),
    @NamedQuery(name = "OrcamentosVendas.findByOrVdLASTUPDATE", query = "SELECT o FROM OrcamentosVendas o WHERE o.orVdLASTUPDATE = :orVdLASTUPDATE"),
    @NamedQuery(name = "OrcamentosVendas.findByCntsNome", query = "SELECT o FROM OrcamentosVendas o WHERE o.cntsNome = :cntsNome"),
    @NamedQuery(name = "OrcamentosVendas.findByOrvdPessNome", query = "SELECT o FROM OrcamentosVendas o WHERE o.orvdPessNome = :orvdPessNome"),
    @NamedQuery(name = "OrcamentosVendas.findByOrvdAprazo", query = "SELECT o FROM OrcamentosVendas o WHERE o.orvdAprazo = :orvdAprazo"),
    @NamedQuery(name = "OrcamentosVendas.findByOrvdCpfcnpj", query = "SELECT o FROM OrcamentosVendas o WHERE o.orvdCpfcnpj = :orvdCpfcnpj"),
    @NamedQuery(name = "OrcamentosVendas.findByOrvdPessCpfcnpj", query = "SELECT o FROM OrcamentosVendas o WHERE o.orvdPessCpfcnpj = :orvdPessCpfcnpj"),
    @NamedQuery(name = "OrcamentosVendas.findByOrvdUasg", query = "SELECT o FROM OrcamentosVendas o WHERE o.orvdUasg = :orvdUasg"),
    @NamedQuery(name = "OrcamentosVendas.findByOrvdNrPregao", query = "SELECT o FROM OrcamentosVendas o WHERE o.orvdNrPregao = :orvdNrPregao"),
    @NamedQuery(name = "OrcamentosVendas.findByOrvdTipoPregao", query = "SELECT o FROM OrcamentosVendas o WHERE o.orvdTipoPregao = :orvdTipoPregao"),
    @NamedQuery(name = "OrcamentosVendas.findByOrvdProcessoAdm", query = "SELECT o FROM OrcamentosVendas o WHERE o.orvdProcessoAdm = :orvdProcessoAdm")})
public class OrcamentosVendas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ORVD_ID")
    private String orvdId;
    @Basic(optional = false)
    @Column(name = "ORVD_NUMERO")
    private String orvdNumero;
    @Basic(optional = false)
    @Column(name = "ORVD_DATA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date orvdData;
    @Basic(optional = false)
    @Column(name = "ORVD_VALIDADE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date orvdValidade;
    @Column(name = "ORVD_RESERVADO_ATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date orvdReservadoAte;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "ORVD_VLR_FRETE")
    private BigDecimal orvdVlrFrete;
    @Basic(optional = false)
    @Column(name = "ORVD_VLR_SEGURO")
    private BigDecimal orvdVlrSeguro;
    @Basic(optional = false)
    @Column(name = "ORVD_VLR_DESPESAS")
    private BigDecimal orvdVlrDespesas;
    @Basic(optional = false)
    @Column(name = "ORVD_VLR_ENTRADA")
    private BigDecimal orvdVlrEntrada;
    @Basic(optional = false)
    @Column(name = "ORVD_VLR_DESCONTO")
    private BigDecimal orvdVlrDesconto;
    @Basic(optional = false)
    @Column(name = "ORVD_VLR_DESCONTO_SERVICO")
    private BigDecimal orvdVlrDescontoServico;
    @Basic(optional = false)
    @Column(name = "ORVD_VLR_TOTAL")
    private BigDecimal orvdVlrTotal;
    @Basic(optional = false)
    @Column(name = "ORVD_STATUS")
    private String orvdStatus;
    @Column(name = "ORVD_OBSERVACAO")
    private String orvdObservacao;
    @Column(name = "OrVd_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date orVdLASTUPDATE;
    @Column(name = "CNTS_NOME")
    private String cntsNome;
    @Column(name = "ORVD_PESS_NOME")
    private String orvdPessNome;
    @Column(name = "ORVD_APRAZO")
    private String orvdAprazo;
    @Column(name = "ORVD_CPFCNPJ")
    private String orvdCpfcnpj;
    @Column(name = "ORVD_PESS_CPFCNPJ")
    private String orvdPessCpfcnpj;
    @Lob
    @Column(name = "ORVD_TERMO1")
    private String orvdTermo1;
    @Lob
    @Column(name = "ORVD_TERMO2")
    private String orvdTermo2;
    @Column(name = "ORVD_UASG")
    private String orvdUasg;
    @Column(name = "ORVD_NR_PREGAO")
    private String orvdNrPregao;
    @Column(name = "ORVD_TIPO_PREGAO")
    private String orvdTipoPregao;
    @Column(name = "ORVD_PROCESSO_ADM")
    private String orvdProcessoAdm;
    @OneToMany(mappedBy = "orvdId")
    private List<ItensOrcamentos> itensOrcamentosList;
    @OneToMany(mappedBy = "orvdId")
    private List<Pedidos> pedidosList;
    @OneToMany(mappedBy = "orvdId")
    private List<NegociacoesOrcamento> negociacoesOrcamentoList;
    @JoinColumn(name = "ATCM_ID", referencedColumnName = "ATCM_ID")
    @ManyToOne
    private AtendimentosComerciais atcmId;
    @JoinColumn(name = "MDIA_ID", referencedColumnName = "MDIA_ID")
    @ManyToOne
    private Midias mdiaId;
    @JoinColumn(name = "OPCM_ID", referencedColumnName = "OPCM_ID")
    @ManyToOne
    private OperacoesComerciais opcmId;
    @JoinColumn(name = "PESS_ID", referencedColumnName = "PESS_ID")
    @ManyToOne
    private Pessoas pessId;
    @JoinColumn(name = "TCNC_ID", referencedColumnName = "TCNC_ID")
    @ManyToOne
    private Tecnico tcncId;
    @JoinColumn(name = "VDDR_ID", referencedColumnName = "VDDR_ID")
    @ManyToOne
    private Vendedores vddrId;
    @OneToMany(mappedBy = "orvdId")
    private List<ObjetosOpeComercial> objetosOpeComercialList;
    @OneToMany(mappedBy = "orvdId")
    private List<OrdemServico> ordemServicoList;

    public OrcamentosVendas() {
    }

    public OrcamentosVendas(String orvdId) {
        this.orvdId = orvdId;
    }

    public OrcamentosVendas(String orvdId, String orvdNumero, Date orvdData, Date orvdValidade, BigDecimal orvdVlrFrete, BigDecimal orvdVlrSeguro, BigDecimal orvdVlrDespesas, BigDecimal orvdVlrEntrada, BigDecimal orvdVlrDesconto, BigDecimal orvdVlrDescontoServico, BigDecimal orvdVlrTotal, String orvdStatus) {
        this.orvdId = orvdId;
        this.orvdNumero = orvdNumero;
        this.orvdData = orvdData;
        this.orvdValidade = orvdValidade;
        this.orvdVlrFrete = orvdVlrFrete;
        this.orvdVlrSeguro = orvdVlrSeguro;
        this.orvdVlrDespesas = orvdVlrDespesas;
        this.orvdVlrEntrada = orvdVlrEntrada;
        this.orvdVlrDesconto = orvdVlrDesconto;
        this.orvdVlrDescontoServico = orvdVlrDescontoServico;
        this.orvdVlrTotal = orvdVlrTotal;
        this.orvdStatus = orvdStatus;
    }

    public String getOrvdId() {
        return orvdId;
    }

    public void setOrvdId(String orvdId) {
        this.orvdId = orvdId;
    }

    public String getOrvdNumero() {
        return orvdNumero;
    }

    public void setOrvdNumero(String orvdNumero) {
        this.orvdNumero = orvdNumero;
    }

    public Date getOrvdData() {
        return orvdData;
    }

    public void setOrvdData(Date orvdData) {
        this.orvdData = orvdData;
    }

    public Date getOrvdValidade() {
        return orvdValidade;
    }

    public void setOrvdValidade(Date orvdValidade) {
        this.orvdValidade = orvdValidade;
    }

    public Date getOrvdReservadoAte() {
        return orvdReservadoAte;
    }

    public void setOrvdReservadoAte(Date orvdReservadoAte) {
        this.orvdReservadoAte = orvdReservadoAte;
    }

    public BigDecimal getOrvdVlrFrete() {
        return orvdVlrFrete;
    }

    public void setOrvdVlrFrete(BigDecimal orvdVlrFrete) {
        this.orvdVlrFrete = orvdVlrFrete;
    }

    public BigDecimal getOrvdVlrSeguro() {
        return orvdVlrSeguro;
    }

    public void setOrvdVlrSeguro(BigDecimal orvdVlrSeguro) {
        this.orvdVlrSeguro = orvdVlrSeguro;
    }

    public BigDecimal getOrvdVlrDespesas() {
        return orvdVlrDespesas;
    }

    public void setOrvdVlrDespesas(BigDecimal orvdVlrDespesas) {
        this.orvdVlrDespesas = orvdVlrDespesas;
    }

    public BigDecimal getOrvdVlrEntrada() {
        return orvdVlrEntrada;
    }

    public void setOrvdVlrEntrada(BigDecimal orvdVlrEntrada) {
        this.orvdVlrEntrada = orvdVlrEntrada;
    }

    public BigDecimal getOrvdVlrDesconto() {
        return orvdVlrDesconto;
    }

    public void setOrvdVlrDesconto(BigDecimal orvdVlrDesconto) {
        this.orvdVlrDesconto = orvdVlrDesconto;
    }

    public BigDecimal getOrvdVlrDescontoServico() {
        return orvdVlrDescontoServico;
    }

    public void setOrvdVlrDescontoServico(BigDecimal orvdVlrDescontoServico) {
        this.orvdVlrDescontoServico = orvdVlrDescontoServico;
    }

    public BigDecimal getOrvdVlrTotal() {
        return orvdVlrTotal;
    }

    public void setOrvdVlrTotal(BigDecimal orvdVlrTotal) {
        this.orvdVlrTotal = orvdVlrTotal;
    }

    public String getOrvdStatus() {
        return orvdStatus;
    }

    public void setOrvdStatus(String orvdStatus) {
        this.orvdStatus = orvdStatus;
    }

    public String getOrvdObservacao() {
        return orvdObservacao;
    }

    public void setOrvdObservacao(String orvdObservacao) {
        this.orvdObservacao = orvdObservacao;
    }

    public Date getOrVdLASTUPDATE() {
        return orVdLASTUPDATE;
    }

    public void setOrVdLASTUPDATE(Date orVdLASTUPDATE) {
        this.orVdLASTUPDATE = orVdLASTUPDATE;
    }

    public String getCntsNome() {
        return cntsNome;
    }

    public void setCntsNome(String cntsNome) {
        this.cntsNome = cntsNome;
    }

    public String getOrvdPessNome() {
        return orvdPessNome;
    }

    public void setOrvdPessNome(String orvdPessNome) {
        this.orvdPessNome = orvdPessNome;
    }

    public String getOrvdAprazo() {
        return orvdAprazo;
    }

    public void setOrvdAprazo(String orvdAprazo) {
        this.orvdAprazo = orvdAprazo;
    }

    public String getOrvdCpfcnpj() {
        return orvdCpfcnpj;
    }

    public void setOrvdCpfcnpj(String orvdCpfcnpj) {
        this.orvdCpfcnpj = orvdCpfcnpj;
    }

    public String getOrvdPessCpfcnpj() {
        return orvdPessCpfcnpj;
    }

    public void setOrvdPessCpfcnpj(String orvdPessCpfcnpj) {
        this.orvdPessCpfcnpj = orvdPessCpfcnpj;
    }

    public String getOrvdTermo1() {
        return orvdTermo1;
    }

    public void setOrvdTermo1(String orvdTermo1) {
        this.orvdTermo1 = orvdTermo1;
    }

    public String getOrvdTermo2() {
        return orvdTermo2;
    }

    public void setOrvdTermo2(String orvdTermo2) {
        this.orvdTermo2 = orvdTermo2;
    }

    public String getOrvdUasg() {
        return orvdUasg;
    }

    public void setOrvdUasg(String orvdUasg) {
        this.orvdUasg = orvdUasg;
    }

    public String getOrvdNrPregao() {
        return orvdNrPregao;
    }

    public void setOrvdNrPregao(String orvdNrPregao) {
        this.orvdNrPregao = orvdNrPregao;
    }

    public String getOrvdTipoPregao() {
        return orvdTipoPregao;
    }

    public void setOrvdTipoPregao(String orvdTipoPregao) {
        this.orvdTipoPregao = orvdTipoPregao;
    }

    public String getOrvdProcessoAdm() {
        return orvdProcessoAdm;
    }

    public void setOrvdProcessoAdm(String orvdProcessoAdm) {
        this.orvdProcessoAdm = orvdProcessoAdm;
    }

    @XmlTransient
    public List<ItensOrcamentos> getItensOrcamentosList() {
        return itensOrcamentosList;
    }

    public void setItensOrcamentosList(List<ItensOrcamentos> itensOrcamentosList) {
        this.itensOrcamentosList = itensOrcamentosList;
    }

    @XmlTransient
    public List<Pedidos> getPedidosList() {
        return pedidosList;
    }

    public void setPedidosList(List<Pedidos> pedidosList) {
        this.pedidosList = pedidosList;
    }

    @XmlTransient
    public List<NegociacoesOrcamento> getNegociacoesOrcamentoList() {
        return negociacoesOrcamentoList;
    }

    public void setNegociacoesOrcamentoList(List<NegociacoesOrcamento> negociacoesOrcamentoList) {
        this.negociacoesOrcamentoList = negociacoesOrcamentoList;
    }

    public AtendimentosComerciais getAtcmId() {
        return atcmId;
    }

    public void setAtcmId(AtendimentosComerciais atcmId) {
        this.atcmId = atcmId;
    }

    public Midias getMdiaId() {
        return mdiaId;
    }

    public void setMdiaId(Midias mdiaId) {
        this.mdiaId = mdiaId;
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

    public Tecnico getTcncId() {
        return tcncId;
    }

    public void setTcncId(Tecnico tcncId) {
        this.tcncId = tcncId;
    }

    public Vendedores getVddrId() {
        return vddrId;
    }

    public void setVddrId(Vendedores vddrId) {
        this.vddrId = vddrId;
    }

    @XmlTransient
    public List<ObjetosOpeComercial> getObjetosOpeComercialList() {
        return objetosOpeComercialList;
    }

    public void setObjetosOpeComercialList(List<ObjetosOpeComercial> objetosOpeComercialList) {
        this.objetosOpeComercialList = objetosOpeComercialList;
    }

    @XmlTransient
    public List<OrdemServico> getOrdemServicoList() {
        return ordemServicoList;
    }

    public void setOrdemServicoList(List<OrdemServico> ordemServicoList) {
        this.ordemServicoList = ordemServicoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orvdId != null ? orvdId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrcamentosVendas)) {
            return false;
        }
        OrcamentosVendas other = (OrcamentosVendas) object;
        if ((this.orvdId == null && other.orvdId != null) || (this.orvdId != null && !this.orvdId.equals(other.orvdId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.OrcamentosVendas[ orvdId=" + orvdId + " ]";
    }
    
}
