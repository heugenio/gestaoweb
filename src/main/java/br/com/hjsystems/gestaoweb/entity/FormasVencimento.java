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
@Table(name = "FORMAS_VENCIMENTO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FormasVencimento.findAll", query = "SELECT f FROM FormasVencimento f"),
    @NamedQuery(name = "FormasVencimento.findByFvenId", query = "SELECT f FROM FormasVencimento f WHERE f.fvenId = :fvenId"),
    @NamedQuery(name = "FormasVencimento.findByFvenCodigo", query = "SELECT f FROM FormasVencimento f WHERE f.fvenCodigo = :fvenCodigo"),
    @NamedQuery(name = "FormasVencimento.findByFvenNome", query = "SELECT f FROM FormasVencimento f WHERE f.fvenNome = :fvenNome"),
    @NamedQuery(name = "FormasVencimento.findByFvenTipoVencimento", query = "SELECT f FROM FormasVencimento f WHERE f.fvenTipoVencimento = :fvenTipoVencimento"),
    @NamedQuery(name = "FormasVencimento.findByFVenLASTUPDATE", query = "SELECT f FROM FormasVencimento f WHERE f.fVenLASTUPDATE = :fVenLASTUPDATE"),
    @NamedQuery(name = "FormasVencimento.findByFvenStatus", query = "SELECT f FROM FormasVencimento f WHERE f.fvenStatus = :fvenStatus"),
    @NamedQuery(name = "FormasVencimento.findByFvenFiltro", query = "SELECT f FROM FormasVencimento f WHERE f.fvenFiltro = :fvenFiltro")})
public class FormasVencimento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "FVEN_ID")
    private String fvenId;
    @Basic(optional = false)
    @Column(name = "FVEN_CODIGO")
    private String fvenCodigo;
    @Basic(optional = false)
    @Column(name = "FVEN_NOME")
    private String fvenNome;
    @Basic(optional = false)
    @Column(name = "FVEN_TIPO_VENCIMENTO")
    private String fvenTipoVencimento;
    @Column(name = "FVen_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fVenLASTUPDATE;
    @Column(name = "FVEN_STATUS")
    private String fvenStatus;
    @Column(name = "FVEN_FILTRO")
    private String fvenFiltro;
    @OneToMany(mappedBy = "fvenId")
    private List<CotacoesFornecedores> cotacoesFornecedoresList;
    @OneToMany(mappedBy = "fvenId")
    private List<Locacoes> locacoesList;
    @OneToMany(mappedBy = "fvenId")
    private List<Clientes> clientesList;
    @JoinColumn(name = "TBPC_ID", referencedColumnName = "TBPC_ID")
    @ManyToOne
    private TabelasPrecos tbpcId;
    @OneToMany(mappedBy = "fvenId")
    private List<ItensFormaVencimento> itensFormaVencimentoList;
    @OneToMany(mappedBy = "fvenId")
    private List<OrdemServico> ordemServicoList;
    @OneToMany(mappedBy = "fvenId")
    private List<TabelasprecosFven> tabelasprecosFvenList;
    @OneToMany(mappedBy = "fvenId")
    private List<PrecosProdutosFven> precosProdutosFvenList;

    public FormasVencimento() {
    }

    public FormasVencimento(String fvenId) {
        this.fvenId = fvenId;
    }

    public FormasVencimento(String fvenId, String fvenCodigo, String fvenNome, String fvenTipoVencimento) {
        this.fvenId = fvenId;
        this.fvenCodigo = fvenCodigo;
        this.fvenNome = fvenNome;
        this.fvenTipoVencimento = fvenTipoVencimento;
    }

    public String getFvenId() {
        return fvenId;
    }

    public void setFvenId(String fvenId) {
        this.fvenId = fvenId;
    }

    public String getFvenCodigo() {
        return fvenCodigo;
    }

    public void setFvenCodigo(String fvenCodigo) {
        this.fvenCodigo = fvenCodigo;
    }

    public String getFvenNome() {
        return fvenNome;
    }

    public void setFvenNome(String fvenNome) {
        this.fvenNome = fvenNome;
    }

    public String getFvenTipoVencimento() {
        return fvenTipoVencimento;
    }

    public void setFvenTipoVencimento(String fvenTipoVencimento) {
        this.fvenTipoVencimento = fvenTipoVencimento;
    }

    public Date getFVenLASTUPDATE() {
        return fVenLASTUPDATE;
    }

    public void setFVenLASTUPDATE(Date fVenLASTUPDATE) {
        this.fVenLASTUPDATE = fVenLASTUPDATE;
    }

    public String getFvenStatus() {
        return fvenStatus;
    }

    public void setFvenStatus(String fvenStatus) {
        this.fvenStatus = fvenStatus;
    }

    public String getFvenFiltro() {
        return fvenFiltro;
    }

    public void setFvenFiltro(String fvenFiltro) {
        this.fvenFiltro = fvenFiltro;
    }

    @XmlTransient
    public List<CotacoesFornecedores> getCotacoesFornecedoresList() {
        return cotacoesFornecedoresList;
    }

    public void setCotacoesFornecedoresList(List<CotacoesFornecedores> cotacoesFornecedoresList) {
        this.cotacoesFornecedoresList = cotacoesFornecedoresList;
    }

    @XmlTransient
    public List<Locacoes> getLocacoesList() {
        return locacoesList;
    }

    public void setLocacoesList(List<Locacoes> locacoesList) {
        this.locacoesList = locacoesList;
    }

    @XmlTransient
    public List<Clientes> getClientesList() {
        return clientesList;
    }

    public void setClientesList(List<Clientes> clientesList) {
        this.clientesList = clientesList;
    }

    public TabelasPrecos getTbpcId() {
        return tbpcId;
    }

    public void setTbpcId(TabelasPrecos tbpcId) {
        this.tbpcId = tbpcId;
    }

    @XmlTransient
    public List<ItensFormaVencimento> getItensFormaVencimentoList() {
        return itensFormaVencimentoList;
    }

    public void setItensFormaVencimentoList(List<ItensFormaVencimento> itensFormaVencimentoList) {
        this.itensFormaVencimentoList = itensFormaVencimentoList;
    }

    @XmlTransient
    public List<OrdemServico> getOrdemServicoList() {
        return ordemServicoList;
    }

    public void setOrdemServicoList(List<OrdemServico> ordemServicoList) {
        this.ordemServicoList = ordemServicoList;
    }

    @XmlTransient
    public List<TabelasprecosFven> getTabelasprecosFvenList() {
        return tabelasprecosFvenList;
    }

    public void setTabelasprecosFvenList(List<TabelasprecosFven> tabelasprecosFvenList) {
        this.tabelasprecosFvenList = tabelasprecosFvenList;
    }

    @XmlTransient
    public List<PrecosProdutosFven> getPrecosProdutosFvenList() {
        return precosProdutosFvenList;
    }

    public void setPrecosProdutosFvenList(List<PrecosProdutosFven> precosProdutosFvenList) {
        this.precosProdutosFvenList = precosProdutosFvenList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fvenId != null ? fvenId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FormasVencimento)) {
            return false;
        }
        FormasVencimento other = (FormasVencimento) object;
        if ((this.fvenId == null && other.fvenId != null) || (this.fvenId != null && !this.fvenId.equals(other.fvenId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.FormasVencimento[ fvenId=" + fvenId + " ]";
    }
    
}
