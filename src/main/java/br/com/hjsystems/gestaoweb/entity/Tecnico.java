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
@Table(name = "TECNICO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tecnico.findAll", query = "SELECT t FROM Tecnico t"),
    @NamedQuery(name = "Tecnico.findByTcncId", query = "SELECT t FROM Tecnico t WHERE t.tcncId = :tcncId"),
    @NamedQuery(name = "Tecnico.findByTcncTipo", query = "SELECT t FROM Tecnico t WHERE t.tcncTipo = :tcncTipo"),
    @NamedQuery(name = "Tecnico.findByTcncCodigo", query = "SELECT t FROM Tecnico t WHERE t.tcncCodigo = :tcncCodigo"),
    @NamedQuery(name = "Tecnico.findByTcncPercComAvista", query = "SELECT t FROM Tecnico t WHERE t.tcncPercComAvista = :tcncPercComAvista"),
    @NamedQuery(name = "Tecnico.findByTcncPercComAprazo", query = "SELECT t FROM Tecnico t WHERE t.tcncPercComAprazo = :tcncPercComAprazo"),
    @NamedQuery(name = "Tecnico.findByTcncSituacao", query = "SELECT t FROM Tecnico t WHERE t.tcncSituacao = :tcncSituacao"),
    @NamedQuery(name = "Tecnico.findByTcncLastupdate", query = "SELECT t FROM Tecnico t WHERE t.tcncLastupdate = :tcncLastupdate")})
public class Tecnico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TCNC_ID")
    private String tcncId;
    @Basic(optional = false)
    @Column(name = "TCNC_TIPO")
    private String tcncTipo;
    @Column(name = "TCNC_CODIGO")
    private String tcncCodigo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "TCNC_PERC_COM_AVISTA")
    private BigDecimal tcncPercComAvista;
    @Basic(optional = false)
    @Column(name = "TCNC_PERC_COM_APRAZO")
    private BigDecimal tcncPercComAprazo;
    @Basic(optional = false)
    @Column(name = "TCNC_SITUACAO")
    private String tcncSituacao;
    @Column(name = "TCNC_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tcncLastupdate;
    @OneToMany(mappedBy = "tcncId")
    private List<TecnicoComissoesTecnicos> tecnicoComissoesTecnicosList;
    @OneToMany(mappedBy = "tcncId")
    private List<ItensRequisicoes> itensRequisicoesList;
    @OneToMany(mappedBy = "tecTcncId")
    private List<ItensRequisicoes> itensRequisicoesList1;
    @OneToMany(mappedBy = "tcncId")
    private List<OrcamentosVendas> orcamentosVendasList;
    @JoinColumn(name = "PESS_ID", referencedColumnName = "PESS_ID")
    @ManyToOne
    private Pessoas pessId;
    @OneToMany(mappedBy = "tcncId")
    private List<Locacoes> locacoesList;
    @OneToMany(mappedBy = "tecTcncId")
    private List<OrdemServico> ordemServicoList;
    @OneToMany(mappedBy = "tcncId")
    private List<OrdemServico> ordemServicoList1;
    @OneToMany(mappedBy = "tcncId")
    private List<OrdemProducao> ordemProducaoList;

    public Tecnico() {
    }

    public Tecnico(String tcncId) {
        this.tcncId = tcncId;
    }

    public Tecnico(String tcncId, String tcncTipo, BigDecimal tcncPercComAvista, BigDecimal tcncPercComAprazo, String tcncSituacao) {
        this.tcncId = tcncId;
        this.tcncTipo = tcncTipo;
        this.tcncPercComAvista = tcncPercComAvista;
        this.tcncPercComAprazo = tcncPercComAprazo;
        this.tcncSituacao = tcncSituacao;
    }

    public String getTcncId() {
        return tcncId;
    }

    public void setTcncId(String tcncId) {
        this.tcncId = tcncId;
    }

    public String getTcncTipo() {
        return tcncTipo;
    }

    public void setTcncTipo(String tcncTipo) {
        this.tcncTipo = tcncTipo;
    }

    public String getTcncCodigo() {
        return tcncCodigo;
    }

    public void setTcncCodigo(String tcncCodigo) {
        this.tcncCodigo = tcncCodigo;
    }

    public BigDecimal getTcncPercComAvista() {
        return tcncPercComAvista;
    }

    public void setTcncPercComAvista(BigDecimal tcncPercComAvista) {
        this.tcncPercComAvista = tcncPercComAvista;
    }

    public BigDecimal getTcncPercComAprazo() {
        return tcncPercComAprazo;
    }

    public void setTcncPercComAprazo(BigDecimal tcncPercComAprazo) {
        this.tcncPercComAprazo = tcncPercComAprazo;
    }

    public String getTcncSituacao() {
        return tcncSituacao;
    }

    public void setTcncSituacao(String tcncSituacao) {
        this.tcncSituacao = tcncSituacao;
    }

    public Date getTcncLastupdate() {
        return tcncLastupdate;
    }

    public void setTcncLastupdate(Date tcncLastupdate) {
        this.tcncLastupdate = tcncLastupdate;
    }

    @XmlTransient
    public List<TecnicoComissoesTecnicos> getTecnicoComissoesTecnicosList() {
        return tecnicoComissoesTecnicosList;
    }

    public void setTecnicoComissoesTecnicosList(List<TecnicoComissoesTecnicos> tecnicoComissoesTecnicosList) {
        this.tecnicoComissoesTecnicosList = tecnicoComissoesTecnicosList;
    }

    @XmlTransient
    public List<ItensRequisicoes> getItensRequisicoesList() {
        return itensRequisicoesList;
    }

    public void setItensRequisicoesList(List<ItensRequisicoes> itensRequisicoesList) {
        this.itensRequisicoesList = itensRequisicoesList;
    }

    @XmlTransient
    public List<ItensRequisicoes> getItensRequisicoesList1() {
        return itensRequisicoesList1;
    }

    public void setItensRequisicoesList1(List<ItensRequisicoes> itensRequisicoesList1) {
        this.itensRequisicoesList1 = itensRequisicoesList1;
    }

    @XmlTransient
    public List<OrcamentosVendas> getOrcamentosVendasList() {
        return orcamentosVendasList;
    }

    public void setOrcamentosVendasList(List<OrcamentosVendas> orcamentosVendasList) {
        this.orcamentosVendasList = orcamentosVendasList;
    }

    public Pessoas getPessId() {
        return pessId;
    }

    public void setPessId(Pessoas pessId) {
        this.pessId = pessId;
    }

    @XmlTransient
    public List<Locacoes> getLocacoesList() {
        return locacoesList;
    }

    public void setLocacoesList(List<Locacoes> locacoesList) {
        this.locacoesList = locacoesList;
    }

    @XmlTransient
    public List<OrdemServico> getOrdemServicoList() {
        return ordemServicoList;
    }

    public void setOrdemServicoList(List<OrdemServico> ordemServicoList) {
        this.ordemServicoList = ordemServicoList;
    }

    @XmlTransient
    public List<OrdemServico> getOrdemServicoList1() {
        return ordemServicoList1;
    }

    public void setOrdemServicoList1(List<OrdemServico> ordemServicoList1) {
        this.ordemServicoList1 = ordemServicoList1;
    }

    @XmlTransient
    public List<OrdemProducao> getOrdemProducaoList() {
        return ordemProducaoList;
    }

    public void setOrdemProducaoList(List<OrdemProducao> ordemProducaoList) {
        this.ordemProducaoList = ordemProducaoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tcncId != null ? tcncId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tecnico)) {
            return false;
        }
        Tecnico other = (Tecnico) object;
        if ((this.tcncId == null && other.tcncId != null) || (this.tcncId != null && !this.tcncId.equals(other.tcncId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.Tecnico[ tcncId=" + tcncId + " ]";
    }
    
}
