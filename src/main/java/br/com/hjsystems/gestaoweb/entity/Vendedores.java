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
@Table(name = "VENDEDORES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vendedores.findAll", query = "SELECT v FROM Vendedores v"),
    @NamedQuery(name = "Vendedores.findByVddrId", query = "SELECT v FROM Vendedores v WHERE v.vddrId = :vddrId"),
    @NamedQuery(name = "Vendedores.findByVddrTipo", query = "SELECT v FROM Vendedores v WHERE v.vddrTipo = :vddrTipo"),
    @NamedQuery(name = "Vendedores.findByVddrCodigo", query = "SELECT v FROM Vendedores v WHERE v.vddrCodigo = :vddrCodigo"),
    @NamedQuery(name = "Vendedores.findByVddrPercComAvista", query = "SELECT v FROM Vendedores v WHERE v.vddrPercComAvista = :vddrPercComAvista"),
    @NamedQuery(name = "Vendedores.findByVddrPercComAprazo", query = "SELECT v FROM Vendedores v WHERE v.vddrPercComAprazo = :vddrPercComAprazo"),
    @NamedQuery(name = "Vendedores.findByVddrSituacao", query = "SELECT v FROM Vendedores v WHERE v.vddrSituacao = :vddrSituacao"),
    @NamedQuery(name = "Vendedores.findByVddrLASTUPDATE", query = "SELECT v FROM Vendedores v WHERE v.vddrLASTUPDATE = :vddrLASTUPDATE"),
    @NamedQuery(name = "Vendedores.findByVddrRedcomtlmk", query = "SELECT v FROM Vendedores v WHERE v.vddrRedcomtlmk = :vddrRedcomtlmk"),
    @NamedQuery(name = "Vendedores.findByVddrPercDescMaxMeta", query = "SELECT v FROM Vendedores v WHERE v.vddrPercDescMaxMeta = :vddrPercDescMaxMeta"),
    @NamedQuery(name = "Vendedores.findByVddrComdescMeta", query = "SELECT v FROM Vendedores v WHERE v.vddrComdescMeta = :vddrComdescMeta"),
    @NamedQuery(name = "Vendedores.findByVddrSerialPocket", query = "SELECT v FROM Vendedores v WHERE v.vddrSerialPocket = :vddrSerialPocket"),
    @NamedQuery(name = "Vendedores.findByVddrFidelidadeCliente", query = "SELECT v FROM Vendedores v WHERE v.vddrFidelidadeCliente = :vddrFidelidadeCliente")})
public class Vendedores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "VDDR_ID")
    private String vddrId;
    @Basic(optional = false)
    @Column(name = "VDDR_TIPO")
    private String vddrTipo;
    @Column(name = "VDDR_CODIGO")
    private String vddrCodigo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "VDDR_PERC_COM_AVISTA")
    private BigDecimal vddrPercComAvista;
    @Basic(optional = false)
    @Column(name = "VDDR_PERC_COM_APRAZO")
    private BigDecimal vddrPercComAprazo;
    @Basic(optional = false)
    @Column(name = "VDDR_SITUACAO")
    private String vddrSituacao;
    @Column(name = "Vddr_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date vddrLASTUPDATE;
    @Column(name = "VDDR_REDCOMTLMK")
    private BigDecimal vddrRedcomtlmk;
    @Basic(optional = false)
    @Column(name = "VDDR_PERC_DESC_MAX_META")
    private BigDecimal vddrPercDescMaxMeta;
    @Basic(optional = false)
    @Column(name = "VDDR_COMDESC_META")
    private BigDecimal vddrComdescMeta;
    @Column(name = "VDDR_SERIAL_POCKET")
    private String vddrSerialPocket;
    @Column(name = "VDDR_FIDELIDADE_CLIENTE")
    private String vddrFidelidadeCliente;
    @OneToMany(mappedBy = "vddrId")
    private List<Pedidos> pedidosList;
    @OneToMany(mappedBy = "vddrId")
    private List<Requisicoes> requisicoesList;
    @OneToMany(mappedBy = "vddrId")
    private List<EquipeVendas> equipeVendasList;
    @OneToMany(mappedBy = "vddrId")
    private List<VendedoresMetas> vendedoresMetasList;
    @OneToMany(mappedBy = "vddrId")
    private List<Metas> metasList;
    @OneToMany(mappedBy = "vddrId")
    private List<OrcamentosVendas> orcamentosVendasList;
    @OneToMany(mappedBy = "vddrId")
    private List<VendedoresFaixaComissao> vendedoresFaixaComissaoList;
    @JoinColumn(name = "ENAR_ID", referencedColumnName = "ENAR_ID")
    @ManyToOne
    private EnderecosArmazenamento enarId;
    @JoinColumn(name = "EQVD_ID", referencedColumnName = "EQVD_ID")
    @ManyToOne
    private EquipeVendas eqvdId;
    @JoinColumn(name = "FDCM_ID", referencedColumnName = "FDCM_ID")
    @ManyToOne
    private FaixaDescontoComissao fdcmId;
    @JoinColumn(name = "PESS_ID", referencedColumnName = "PESS_ID")
    @ManyToOne
    private Pessoas pessId;
    @JoinColumn(name = "TPCM_ID", referencedColumnName = "TPCM_ID")
    @ManyToOne
    private TiposComissoes tpcmId;
    @JoinColumn(name = "UNEM_ID", referencedColumnName = "UNEM_ID")
    @ManyToOne
    private UnidadesEmpresariais unemId;
    @OneToMany(mappedBy = "vddrId")
    private List<Clientes> clientesList;
    @OneToMany(mappedBy = "venVddrId")
    private List<Clientes> clientesList1;
    @OneToMany(mappedBy = "vddrId")
    private List<Cotacoes> cotacoesList;
    @OneToMany(mappedBy = "vddrId")
    private List<OrdemServico> ordemServicoList;
    @OneToMany(mappedBy = "vddrId")
    private List<VendedoresOpercomerciais> vendedoresOpercomerciaisList;

    public Vendedores() {
    }

    public Vendedores(String vddrId) {
        this.vddrId = vddrId;
    }

    public Vendedores(String vddrId, String vddrTipo, BigDecimal vddrPercComAvista, BigDecimal vddrPercComAprazo, String vddrSituacao, BigDecimal vddrPercDescMaxMeta, BigDecimal vddrComdescMeta) {
        this.vddrId = vddrId;
        this.vddrTipo = vddrTipo;
        this.vddrPercComAvista = vddrPercComAvista;
        this.vddrPercComAprazo = vddrPercComAprazo;
        this.vddrSituacao = vddrSituacao;
        this.vddrPercDescMaxMeta = vddrPercDescMaxMeta;
        this.vddrComdescMeta = vddrComdescMeta;
    }

    public String getVddrId() {
        return vddrId;
    }

    public void setVddrId(String vddrId) {
        this.vddrId = vddrId;
    }

    public String getVddrTipo() {
        return vddrTipo;
    }

    public void setVddrTipo(String vddrTipo) {
        this.vddrTipo = vddrTipo;
    }

    public String getVddrCodigo() {
        return vddrCodigo;
    }

    public void setVddrCodigo(String vddrCodigo) {
        this.vddrCodigo = vddrCodigo;
    }

    public BigDecimal getVddrPercComAvista() {
        return vddrPercComAvista;
    }

    public void setVddrPercComAvista(BigDecimal vddrPercComAvista) {
        this.vddrPercComAvista = vddrPercComAvista;
    }

    public BigDecimal getVddrPercComAprazo() {
        return vddrPercComAprazo;
    }

    public void setVddrPercComAprazo(BigDecimal vddrPercComAprazo) {
        this.vddrPercComAprazo = vddrPercComAprazo;
    }

    public String getVddrSituacao() {
        return vddrSituacao;
    }

    public void setVddrSituacao(String vddrSituacao) {
        this.vddrSituacao = vddrSituacao;
    }

    public Date getVddrLASTUPDATE() {
        return vddrLASTUPDATE;
    }

    public void setVddrLASTUPDATE(Date vddrLASTUPDATE) {
        this.vddrLASTUPDATE = vddrLASTUPDATE;
    }

    public BigDecimal getVddrRedcomtlmk() {
        return vddrRedcomtlmk;
    }

    public void setVddrRedcomtlmk(BigDecimal vddrRedcomtlmk) {
        this.vddrRedcomtlmk = vddrRedcomtlmk;
    }

    public BigDecimal getVddrPercDescMaxMeta() {
        return vddrPercDescMaxMeta;
    }

    public void setVddrPercDescMaxMeta(BigDecimal vddrPercDescMaxMeta) {
        this.vddrPercDescMaxMeta = vddrPercDescMaxMeta;
    }

    public BigDecimal getVddrComdescMeta() {
        return vddrComdescMeta;
    }

    public void setVddrComdescMeta(BigDecimal vddrComdescMeta) {
        this.vddrComdescMeta = vddrComdescMeta;
    }

    public String getVddrSerialPocket() {
        return vddrSerialPocket;
    }

    public void setVddrSerialPocket(String vddrSerialPocket) {
        this.vddrSerialPocket = vddrSerialPocket;
    }

    public String getVddrFidelidadeCliente() {
        return vddrFidelidadeCliente;
    }

    public void setVddrFidelidadeCliente(String vddrFidelidadeCliente) {
        this.vddrFidelidadeCliente = vddrFidelidadeCliente;
    }

    @XmlTransient
    public List<Pedidos> getPedidosList() {
        return pedidosList;
    }

    public void setPedidosList(List<Pedidos> pedidosList) {
        this.pedidosList = pedidosList;
    }

    @XmlTransient
    public List<Requisicoes> getRequisicoesList() {
        return requisicoesList;
    }

    public void setRequisicoesList(List<Requisicoes> requisicoesList) {
        this.requisicoesList = requisicoesList;
    }

    @XmlTransient
    public List<EquipeVendas> getEquipeVendasList() {
        return equipeVendasList;
    }

    public void setEquipeVendasList(List<EquipeVendas> equipeVendasList) {
        this.equipeVendasList = equipeVendasList;
    }

    @XmlTransient
    public List<VendedoresMetas> getVendedoresMetasList() {
        return vendedoresMetasList;
    }

    public void setVendedoresMetasList(List<VendedoresMetas> vendedoresMetasList) {
        this.vendedoresMetasList = vendedoresMetasList;
    }

    @XmlTransient
    public List<Metas> getMetasList() {
        return metasList;
    }

    public void setMetasList(List<Metas> metasList) {
        this.metasList = metasList;
    }

    @XmlTransient
    public List<OrcamentosVendas> getOrcamentosVendasList() {
        return orcamentosVendasList;
    }

    public void setOrcamentosVendasList(List<OrcamentosVendas> orcamentosVendasList) {
        this.orcamentosVendasList = orcamentosVendasList;
    }

    @XmlTransient
    public List<VendedoresFaixaComissao> getVendedoresFaixaComissaoList() {
        return vendedoresFaixaComissaoList;
    }

    public void setVendedoresFaixaComissaoList(List<VendedoresFaixaComissao> vendedoresFaixaComissaoList) {
        this.vendedoresFaixaComissaoList = vendedoresFaixaComissaoList;
    }

    public EnderecosArmazenamento getEnarId() {
        return enarId;
    }

    public void setEnarId(EnderecosArmazenamento enarId) {
        this.enarId = enarId;
    }

    public EquipeVendas getEqvdId() {
        return eqvdId;
    }

    public void setEqvdId(EquipeVendas eqvdId) {
        this.eqvdId = eqvdId;
    }

    public FaixaDescontoComissao getFdcmId() {
        return fdcmId;
    }

    public void setFdcmId(FaixaDescontoComissao fdcmId) {
        this.fdcmId = fdcmId;
    }

    public Pessoas getPessId() {
        return pessId;
    }

    public void setPessId(Pessoas pessId) {
        this.pessId = pessId;
    }

    public TiposComissoes getTpcmId() {
        return tpcmId;
    }

    public void setTpcmId(TiposComissoes tpcmId) {
        this.tpcmId = tpcmId;
    }

    public UnidadesEmpresariais getUnemId() {
        return unemId;
    }

    public void setUnemId(UnidadesEmpresariais unemId) {
        this.unemId = unemId;
    }

    @XmlTransient
    public List<Clientes> getClientesList() {
        return clientesList;
    }

    public void setClientesList(List<Clientes> clientesList) {
        this.clientesList = clientesList;
    }

    @XmlTransient
    public List<Clientes> getClientesList1() {
        return clientesList1;
    }

    public void setClientesList1(List<Clientes> clientesList1) {
        this.clientesList1 = clientesList1;
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
    public List<VendedoresOpercomerciais> getVendedoresOpercomerciaisList() {
        return vendedoresOpercomerciaisList;
    }

    public void setVendedoresOpercomerciaisList(List<VendedoresOpercomerciais> vendedoresOpercomerciaisList) {
        this.vendedoresOpercomerciaisList = vendedoresOpercomerciaisList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vddrId != null ? vddrId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vendedores)) {
            return false;
        }
        Vendedores other = (Vendedores) object;
        if ((this.vddrId == null && other.vddrId != null) || (this.vddrId != null && !this.vddrId.equals(other.vddrId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.Vendedores[ vddrId=" + vddrId + " ]";
    }
    
}
