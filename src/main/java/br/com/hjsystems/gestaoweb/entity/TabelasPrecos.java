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
@Table(name = "TABELAS_PRECOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TabelasPrecos.findAll", query = "SELECT t FROM TabelasPrecos t"),
    @NamedQuery(name = "TabelasPrecos.findByTbpcId", query = "SELECT t FROM TabelasPrecos t WHERE t.tbpcId = :tbpcId"),
    @NamedQuery(name = "TabelasPrecos.findByTbpcNome", query = "SELECT t FROM TabelasPrecos t WHERE t.tbpcNome = :tbpcNome"),
    @NamedQuery(name = "TabelasPrecos.findByTbpcTipoArred", query = "SELECT t FROM TabelasPrecos t WHERE t.tbpcTipoArred = :tbpcTipoArred"),
    @NamedQuery(name = "TabelasPrecos.findByTbPcLASTUPDATE", query = "SELECT t FROM TabelasPrecos t WHERE t.tbPcLASTUPDATE = :tbPcLASTUPDATE")})
public class TabelasPrecos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TBPC_ID")
    private String tbpcId;
    @Basic(optional = false)
    @Column(name = "TBPC_NOME")
    private String tbpcNome;
    @Column(name = "TBPC_TIPO_ARRED")
    private String tbpcTipoArred;
    @Column(name = "TbPc_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tbPcLASTUPDATE;
    @OneToMany(mappedBy = "tbpcId")
    private List<TabelasPrecosVigencias> tabelasPrecosVigenciasList;
    @OneToMany(mappedBy = "tbpcId")
    private List<Pedidos> pedidosList;
    @OneToMany(mappedBy = "tbpcId")
    private List<TipoOrdemServico> tipoOrdemServicoList;
    @OneToMany(mappedBy = "tbpcId")
    private List<Requisicoes> requisicoesList;
    @OneToMany(mappedBy = "tbpcId")
    private List<TiposClienteFornecedores> tiposClienteFornecedoresList;
    @OneToMany(mappedBy = "tbpcId")
    private List<Clientes> clientesList;
    @OneToMany(mappedBy = "tbpcId")
    private List<FormasVencimento> formasVencimentoList;
    @OneToMany(mappedBy = "tbpcId")
    private List<OrdemServico> ordemServicoList;
    @OneToMany(mappedBy = "tabTbpcId")
    private List<TabelasprecosAlteracoes> tabelasprecosAlteracoesList;
    @OneToMany(mappedBy = "tbpcId")
    private List<TabelasprecosAlteracoes> tabelasprecosAlteracoesList1;

    public TabelasPrecos() {
    }

    public TabelasPrecos(String tbpcId) {
        this.tbpcId = tbpcId;
    }

    public TabelasPrecos(String tbpcId, String tbpcNome) {
        this.tbpcId = tbpcId;
        this.tbpcNome = tbpcNome;
    }

    public String getTbpcId() {
        return tbpcId;
    }

    public void setTbpcId(String tbpcId) {
        this.tbpcId = tbpcId;
    }

    public String getTbpcNome() {
        return tbpcNome;
    }

    public void setTbpcNome(String tbpcNome) {
        this.tbpcNome = tbpcNome;
    }

    public String getTbpcTipoArred() {
        return tbpcTipoArred;
    }

    public void setTbpcTipoArred(String tbpcTipoArred) {
        this.tbpcTipoArred = tbpcTipoArred;
    }

    public Date getTbPcLASTUPDATE() {
        return tbPcLASTUPDATE;
    }

    public void setTbPcLASTUPDATE(Date tbPcLASTUPDATE) {
        this.tbPcLASTUPDATE = tbPcLASTUPDATE;
    }

    @XmlTransient
    public List<TabelasPrecosVigencias> getTabelasPrecosVigenciasList() {
        return tabelasPrecosVigenciasList;
    }

    public void setTabelasPrecosVigenciasList(List<TabelasPrecosVigencias> tabelasPrecosVigenciasList) {
        this.tabelasPrecosVigenciasList = tabelasPrecosVigenciasList;
    }

    @XmlTransient
    public List<Pedidos> getPedidosList() {
        return pedidosList;
    }

    public void setPedidosList(List<Pedidos> pedidosList) {
        this.pedidosList = pedidosList;
    }

    @XmlTransient
    public List<TipoOrdemServico> getTipoOrdemServicoList() {
        return tipoOrdemServicoList;
    }

    public void setTipoOrdemServicoList(List<TipoOrdemServico> tipoOrdemServicoList) {
        this.tipoOrdemServicoList = tipoOrdemServicoList;
    }

    @XmlTransient
    public List<Requisicoes> getRequisicoesList() {
        return requisicoesList;
    }

    public void setRequisicoesList(List<Requisicoes> requisicoesList) {
        this.requisicoesList = requisicoesList;
    }

    @XmlTransient
    public List<TiposClienteFornecedores> getTiposClienteFornecedoresList() {
        return tiposClienteFornecedoresList;
    }

    public void setTiposClienteFornecedoresList(List<TiposClienteFornecedores> tiposClienteFornecedoresList) {
        this.tiposClienteFornecedoresList = tiposClienteFornecedoresList;
    }

    @XmlTransient
    public List<Clientes> getClientesList() {
        return clientesList;
    }

    public void setClientesList(List<Clientes> clientesList) {
        this.clientesList = clientesList;
    }

    @XmlTransient
    public List<FormasVencimento> getFormasVencimentoList() {
        return formasVencimentoList;
    }

    public void setFormasVencimentoList(List<FormasVencimento> formasVencimentoList) {
        this.formasVencimentoList = formasVencimentoList;
    }

    @XmlTransient
    public List<OrdemServico> getOrdemServicoList() {
        return ordemServicoList;
    }

    public void setOrdemServicoList(List<OrdemServico> ordemServicoList) {
        this.ordemServicoList = ordemServicoList;
    }

    @XmlTransient
    public List<TabelasprecosAlteracoes> getTabelasprecosAlteracoesList() {
        return tabelasprecosAlteracoesList;
    }

    public void setTabelasprecosAlteracoesList(List<TabelasprecosAlteracoes> tabelasprecosAlteracoesList) {
        this.tabelasprecosAlteracoesList = tabelasprecosAlteracoesList;
    }

    @XmlTransient
    public List<TabelasprecosAlteracoes> getTabelasprecosAlteracoesList1() {
        return tabelasprecosAlteracoesList1;
    }

    public void setTabelasprecosAlteracoesList1(List<TabelasprecosAlteracoes> tabelasprecosAlteracoesList1) {
        this.tabelasprecosAlteracoesList1 = tabelasprecosAlteracoesList1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tbpcId != null ? tbpcId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TabelasPrecos)) {
            return false;
        }
        TabelasPrecos other = (TabelasPrecos) object;
        if ((this.tbpcId == null && other.tbpcId != null) || (this.tbpcId != null && !this.tbpcId.equals(other.tbpcId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.TabelasPrecos[ tbpcId=" + tbpcId + " ]";
    }
    
}
