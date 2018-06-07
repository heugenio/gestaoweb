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
@Table(name = "CLIENTES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Clientes.findAll", query = "SELECT c FROM Clientes c"),
    @NamedQuery(name = "Clientes.findByClntId", query = "SELECT c FROM Clientes c WHERE c.clntId = :clntId"),
    @NamedQuery(name = "Clientes.findByClntSituacao", query = "SELECT c FROM Clientes c WHERE c.clntSituacao = :clntSituacao"),
    @NamedQuery(name = "Clientes.findByClntSubstitutoIss", query = "SELECT c FROM Clientes c WHERE c.clntSubstitutoIss = :clntSubstitutoIss"),
    @NamedQuery(name = "Clientes.findByClntNaturezaContribuinte", query = "SELECT c FROM Clientes c WHERE c.clntNaturezaContribuinte = :clntNaturezaContribuinte"),
    @NamedQuery(name = "Clientes.findByClntObjetivoComercial", query = "SELECT c FROM Clientes c WHERE c.clntObjetivoComercial = :clntObjetivoComercial"),
    @NamedQuery(name = "Clientes.findByClntDataCadastro", query = "SELECT c FROM Clientes c WHERE c.clntDataCadastro = :clntDataCadastro"),
    @NamedQuery(name = "Clientes.findByClntRenda", query = "SELECT c FROM Clientes c WHERE c.clntRenda = :clntRenda"),
    @NamedQuery(name = "Clientes.findByClntDiaVisita", query = "SELECT c FROM Clientes c WHERE c.clntDiaVisita = :clntDiaVisita"),
    @NamedQuery(name = "Clientes.findByClntIntervaloVisitas", query = "SELECT c FROM Clientes c WHERE c.clntIntervaloVisitas = :clntIntervaloVisitas"),
    @NamedQuery(name = "Clientes.findByClntEspectativaVendas", query = "SELECT c FROM Clientes c WHERE c.clntEspectativaVendas = :clntEspectativaVendas"),
    @NamedQuery(name = "Clientes.findByClntAlqDispesaAcess", query = "SELECT c FROM Clientes c WHERE c.clntAlqDispesaAcess = :clntAlqDispesaAcess"),
    @NamedQuery(name = "Clientes.findByClntCobrarTxBoleta", query = "SELECT c FROM Clientes c WHERE c.clntCobrarTxBoleta = :clntCobrarTxBoleta"),
    @NamedQuery(name = "Clientes.findByClntLASTUPDATE", query = "SELECT c FROM Clientes c WHERE c.clntLASTUPDATE = :clntLASTUPDATE"),
    @NamedQuery(name = "Clientes.findByClntComprarAprazo", query = "SELECT c FROM Clientes c WHERE c.clntComprarAprazo = :clntComprarAprazo"),
    @NamedQuery(name = "Clientes.findByClntVlrMinVenda", query = "SELECT c FROM Clientes c WHERE c.clntVlrMinVenda = :clntVlrMinVenda"),
    @NamedQuery(name = "Clientes.findByClntVlrFrete", query = "SELECT c FROM Clientes c WHERE c.clntVlrFrete = :clntVlrFrete"),
    @NamedQuery(name = "Clientes.findByClntSubstitutoPisCofinsIr", query = "SELECT c FROM Clientes c WHERE c.clntSubstitutoPisCofinsIr = :clntSubstitutoPisCofinsIr")})
public class Clientes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CLNT_ID")
    private String clntId;
    @Basic(optional = false)
    @Column(name = "CLNT_SITUACAO")
    private String clntSituacao;
    @Basic(optional = false)
    @Column(name = "CLNT_SUBSTITUTO_ISS")
    private String clntSubstitutoIss;
    @Basic(optional = false)
    @Column(name = "CLNT_NATUREZA_CONTRIBUINTE")
    private String clntNaturezaContribuinte;
    @Basic(optional = false)
    @Column(name = "CLNT_OBJETIVO_COMERCIAL")
    private String clntObjetivoComercial;
    @Column(name = "CLNT_DATA_CADASTRO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date clntDataCadastro;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "CLNT_RENDA")
    private BigDecimal clntRenda;
    @Basic(optional = false)
    @Column(name = "CLNT_DIA_VISITA")
    private String clntDiaVisita;
    @Column(name = "CLNT_INTERVALO_VISITAS")
    private Integer clntIntervaloVisitas;
    @Basic(optional = false)
    @Column(name = "CLNT_ESPECTATIVA_VENDAS")
    private BigDecimal clntEspectativaVendas;
    @Column(name = "CLNT_ALQ_DISPESA_ACESS")
    private BigDecimal clntAlqDispesaAcess;
    @Column(name = "CLNT_COBRAR_TX_BOLETA")
    private String clntCobrarTxBoleta;
    @Column(name = "Clnt_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date clntLASTUPDATE;
    @Column(name = "CLNT_COMPRAR_APRAZO")
    private String clntComprarAprazo;
    @Column(name = "CLNT_VLR_MIN_VENDA")
    private BigDecimal clntVlrMinVenda;
    @Column(name = "CLNT_VLR_FRETE")
    private BigDecimal clntVlrFrete;
    @Column(name = "CLNT_SUBSTITUTO_PIS_COFINS_IR")
    private String clntSubstitutoPisCofinsIr;
    @OneToMany(mappedBy = "clntId")
    private List<ClientesTiposBloqueados> clientesTiposBloqueadosList;
    @OneToMany(mappedBy = "clntId")
    private List<InformacoesBancarias> informacoesBancariasList;
    @OneToMany(mappedBy = "clntId")
    private List<Agenda> agendaList;
    @JoinColumn(name = "COFR_ID", referencedColumnName = "COFR_ID")
    @ManyToOne
    private Cofres cofrId;
    @JoinColumn(name = "FVEN_ID", referencedColumnName = "FVEN_ID")
    @ManyToOne
    private FormasVencimento fvenId;
    @JoinColumn(name = "TRSP_ID", referencedColumnName = "TRSP_ID")
    @ManyToOne
    private Transportadoras trspId;
    @JoinColumn(name = "VDDR_ID", referencedColumnName = "VDDR_ID")
    @ManyToOne
    private Vendedores vddrId;
    @JoinColumn(name = "GRCL_ID", referencedColumnName = "GRCL_ID")
    @ManyToOne
    private GruposClientes grclId;
    @JoinColumn(name = "VEN_VDDR_ID", referencedColumnName = "VDDR_ID")
    @ManyToOne
    private Vendedores venVddrId;
    @JoinColumn(name = "HPAD_ID", referencedColumnName = "HPAD_ID")
    @ManyToOne
    private HistoricosPadrao hpadId;
    @JoinColumn(name = "LMCR_ID", referencedColumnName = "LMCR_ID")
    @ManyToOne
    private LimitesCreditos lmcrId;
    @JoinColumn(name = "PESS_ID", referencedColumnName = "PESS_ID")
    @ManyToOne
    private Pessoas pessId;
    @JoinColumn(name = "PLCT_ID", referencedColumnName = "PLCT_ID")
    @ManyToOne
    private PlanoContas plctId;
    @JoinColumn(name = "RMAT_ID", referencedColumnName = "RMAT_ID")
    @ManyToOne
    private RamosAtividade rmatId;
    @JoinColumn(name = "STCM_ID", referencedColumnName = "STCM_ID")
    @ManyToOne
    private StatusComercial stcmId;
    @JoinColumn(name = "TBPC_ID", referencedColumnName = "TBPC_ID")
    @ManyToOne
    private TabelasPrecos tbpcId;
    @JoinColumn(name = "TCLF_ID", referencedColumnName = "TCLF_ID")
    @ManyToOne
    private TiposClienteFornecedores tclfId;
    @OneToMany(mappedBy = "clntId")
    private List<Spcs> spcsList;
    @OneToMany(mappedBy = "clntId")
    private List<InformacoesComerciais> informacoesComerciaisList;

    public Clientes() {
    }

    public Clientes(String clntId) {
        this.clntId = clntId;
    }

    public Clientes(String clntId, String clntSituacao, String clntSubstitutoIss, String clntNaturezaContribuinte, String clntObjetivoComercial, String clntDiaVisita, BigDecimal clntEspectativaVendas) {
        this.clntId = clntId;
        this.clntSituacao = clntSituacao;
        this.clntSubstitutoIss = clntSubstitutoIss;
        this.clntNaturezaContribuinte = clntNaturezaContribuinte;
        this.clntObjetivoComercial = clntObjetivoComercial;
        this.clntDiaVisita = clntDiaVisita;
        this.clntEspectativaVendas = clntEspectativaVendas;
    }

    public String getClntId() {
        return clntId;
    }

    public void setClntId(String clntId) {
        this.clntId = clntId;
    }

    public String getClntSituacao() {
        return clntSituacao;
    }

    public void setClntSituacao(String clntSituacao) {
        this.clntSituacao = clntSituacao;
    }

    public String getClntSubstitutoIss() {
        return clntSubstitutoIss;
    }

    public void setClntSubstitutoIss(String clntSubstitutoIss) {
        this.clntSubstitutoIss = clntSubstitutoIss;
    }

    public String getClntNaturezaContribuinte() {
        return clntNaturezaContribuinte;
    }

    public void setClntNaturezaContribuinte(String clntNaturezaContribuinte) {
        this.clntNaturezaContribuinte = clntNaturezaContribuinte;
    }

    public String getClntObjetivoComercial() {
        return clntObjetivoComercial;
    }

    public void setClntObjetivoComercial(String clntObjetivoComercial) {
        this.clntObjetivoComercial = clntObjetivoComercial;
    }

    public Date getClntDataCadastro() {
        return clntDataCadastro;
    }

    public void setClntDataCadastro(Date clntDataCadastro) {
        this.clntDataCadastro = clntDataCadastro;
    }

    public BigDecimal getClntRenda() {
        return clntRenda;
    }

    public void setClntRenda(BigDecimal clntRenda) {
        this.clntRenda = clntRenda;
    }

    public String getClntDiaVisita() {
        return clntDiaVisita;
    }

    public void setClntDiaVisita(String clntDiaVisita) {
        this.clntDiaVisita = clntDiaVisita;
    }

    public Integer getClntIntervaloVisitas() {
        return clntIntervaloVisitas;
    }

    public void setClntIntervaloVisitas(Integer clntIntervaloVisitas) {
        this.clntIntervaloVisitas = clntIntervaloVisitas;
    }

    public BigDecimal getClntEspectativaVendas() {
        return clntEspectativaVendas;
    }

    public void setClntEspectativaVendas(BigDecimal clntEspectativaVendas) {
        this.clntEspectativaVendas = clntEspectativaVendas;
    }

    public BigDecimal getClntAlqDispesaAcess() {
        return clntAlqDispesaAcess;
    }

    public void setClntAlqDispesaAcess(BigDecimal clntAlqDispesaAcess) {
        this.clntAlqDispesaAcess = clntAlqDispesaAcess;
    }

    public String getClntCobrarTxBoleta() {
        return clntCobrarTxBoleta;
    }

    public void setClntCobrarTxBoleta(String clntCobrarTxBoleta) {
        this.clntCobrarTxBoleta = clntCobrarTxBoleta;
    }

    public Date getClntLASTUPDATE() {
        return clntLASTUPDATE;
    }

    public void setClntLASTUPDATE(Date clntLASTUPDATE) {
        this.clntLASTUPDATE = clntLASTUPDATE;
    }

    public String getClntComprarAprazo() {
        return clntComprarAprazo;
    }

    public void setClntComprarAprazo(String clntComprarAprazo) {
        this.clntComprarAprazo = clntComprarAprazo;
    }

    public BigDecimal getClntVlrMinVenda() {
        return clntVlrMinVenda;
    }

    public void setClntVlrMinVenda(BigDecimal clntVlrMinVenda) {
        this.clntVlrMinVenda = clntVlrMinVenda;
    }

    public BigDecimal getClntVlrFrete() {
        return clntVlrFrete;
    }

    public void setClntVlrFrete(BigDecimal clntVlrFrete) {
        this.clntVlrFrete = clntVlrFrete;
    }

    public String getClntSubstitutoPisCofinsIr() {
        return clntSubstitutoPisCofinsIr;
    }

    public void setClntSubstitutoPisCofinsIr(String clntSubstitutoPisCofinsIr) {
        this.clntSubstitutoPisCofinsIr = clntSubstitutoPisCofinsIr;
    }

    @XmlTransient
    public List<ClientesTiposBloqueados> getClientesTiposBloqueadosList() {
        return clientesTiposBloqueadosList;
    }

    public void setClientesTiposBloqueadosList(List<ClientesTiposBloqueados> clientesTiposBloqueadosList) {
        this.clientesTiposBloqueadosList = clientesTiposBloqueadosList;
    }

    @XmlTransient
    public List<InformacoesBancarias> getInformacoesBancariasList() {
        return informacoesBancariasList;
    }

    public void setInformacoesBancariasList(List<InformacoesBancarias> informacoesBancariasList) {
        this.informacoesBancariasList = informacoesBancariasList;
    }

    @XmlTransient
    public List<Agenda> getAgendaList() {
        return agendaList;
    }

    public void setAgendaList(List<Agenda> agendaList) {
        this.agendaList = agendaList;
    }

    public Cofres getCofrId() {
        return cofrId;
    }

    public void setCofrId(Cofres cofrId) {
        this.cofrId = cofrId;
    }

    public FormasVencimento getFvenId() {
        return fvenId;
    }

    public void setFvenId(FormasVencimento fvenId) {
        this.fvenId = fvenId;
    }

    public Transportadoras getTrspId() {
        return trspId;
    }

    public void setTrspId(Transportadoras trspId) {
        this.trspId = trspId;
    }

    public Vendedores getVddrId() {
        return vddrId;
    }

    public void setVddrId(Vendedores vddrId) {
        this.vddrId = vddrId;
    }

    public GruposClientes getGrclId() {
        return grclId;
    }

    public void setGrclId(GruposClientes grclId) {
        this.grclId = grclId;
    }

    public Vendedores getVenVddrId() {
        return venVddrId;
    }

    public void setVenVddrId(Vendedores venVddrId) {
        this.venVddrId = venVddrId;
    }

    public HistoricosPadrao getHpadId() {
        return hpadId;
    }

    public void setHpadId(HistoricosPadrao hpadId) {
        this.hpadId = hpadId;
    }

    public LimitesCreditos getLmcrId() {
        return lmcrId;
    }

    public void setLmcrId(LimitesCreditos lmcrId) {
        this.lmcrId = lmcrId;
    }

    public Pessoas getPessId() {
        return pessId;
    }

    public void setPessId(Pessoas pessId) {
        this.pessId = pessId;
    }

    public PlanoContas getPlctId() {
        return plctId;
    }

    public void setPlctId(PlanoContas plctId) {
        this.plctId = plctId;
    }

    public RamosAtividade getRmatId() {
        return rmatId;
    }

    public void setRmatId(RamosAtividade rmatId) {
        this.rmatId = rmatId;
    }

    public StatusComercial getStcmId() {
        return stcmId;
    }

    public void setStcmId(StatusComercial stcmId) {
        this.stcmId = stcmId;
    }

    public TabelasPrecos getTbpcId() {
        return tbpcId;
    }

    public void setTbpcId(TabelasPrecos tbpcId) {
        this.tbpcId = tbpcId;
    }

    public TiposClienteFornecedores getTclfId() {
        return tclfId;
    }

    public void setTclfId(TiposClienteFornecedores tclfId) {
        this.tclfId = tclfId;
    }

    @XmlTransient
    public List<Spcs> getSpcsList() {
        return spcsList;
    }

    public void setSpcsList(List<Spcs> spcsList) {
        this.spcsList = spcsList;
    }

    @XmlTransient
    public List<InformacoesComerciais> getInformacoesComerciaisList() {
        return informacoesComerciaisList;
    }

    public void setInformacoesComerciaisList(List<InformacoesComerciais> informacoesComerciaisList) {
        this.informacoesComerciaisList = informacoesComerciaisList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (clntId != null ? clntId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clientes)) {
            return false;
        }
        Clientes other = (Clientes) object;
        if ((this.clntId == null && other.clntId != null) || (this.clntId != null && !this.clntId.equals(other.clntId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.Clientes[ clntId=" + clntId + " ]";
    }
    
}
