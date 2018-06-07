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
@Table(name = "HISTORICOS_PADRAO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HistoricosPadrao.findAll", query = "SELECT h FROM HistoricosPadrao h"),
    @NamedQuery(name = "HistoricosPadrao.findByHpadId", query = "SELECT h FROM HistoricosPadrao h WHERE h.hpadId = :hpadId"),
    @NamedQuery(name = "HistoricosPadrao.findByHpadCodigo", query = "SELECT h FROM HistoricosPadrao h WHERE h.hpadCodigo = :hpadCodigo"),
    @NamedQuery(name = "HistoricosPadrao.findByHpadNome", query = "SELECT h FROM HistoricosPadrao h WHERE h.hpadNome = :hpadNome"),
    @NamedQuery(name = "HistoricosPadrao.findByHPadLASTUPDATE", query = "SELECT h FROM HistoricosPadrao h WHERE h.hPadLASTUPDATE = :hPadLASTUPDATE"),
    @NamedQuery(name = "HistoricosPadrao.findByHpadLocal", query = "SELECT h FROM HistoricosPadrao h WHERE h.hpadLocal = :hpadLocal")})
public class HistoricosPadrao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "HPAD_ID")
    private String hpadId;
    @Basic(optional = false)
    @Column(name = "HPAD_CODIGO")
    private String hpadCodigo;
    @Basic(optional = false)
    @Column(name = "HPAD_NOME")
    private String hpadNome;
    @Column(name = "HPad_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date hPadLASTUPDATE;
    @Column(name = "HPAD_LOCAL")
    private String hpadLocal;
    @OneToMany(mappedBy = "hpadId")
    private List<Produtos> produtosList;
    @OneToMany(mappedBy = "hpadId")
    private List<OperacoesComerciais> operacoesComerciaisList;
    @OneToMany(mappedBy = "hpadId")
    private List<DcfsLanccontabeis> dcfsLanccontabeisList;
    @OneToMany(mappedBy = "hpadId")
    private List<ParametroscontRecPagar> parametroscontRecPagarList;
    @OneToMany(mappedBy = "hpadId")
    private List<Grupos> gruposList;
    @OneToMany(mappedBy = "hpadId")
    private List<ContasEncerramentoMensal> contasEncerramentoMensalList;
    @OneToMany(mappedBy = "hisHpadId")
    private List<ContasEncerramentoMensal> contasEncerramentoMensalList1;
    @OneToMany(mappedBy = "hpadId")
    private List<PlanoContas> planoContasList;
    @OneToMany(mappedBy = "hpadId")
    private List<Titulos> titulosList;
    @OneToMany(mappedBy = "hpadId")
    private List<Clientes> clientesList;
    @OneToMany(mappedBy = "hpadId")
    private List<ProdutosTipospagamentos> produtosTipospagamentosList;
    @OneToMany(mappedBy = "hpadId")
    private List<ItensLancContPersonal> itensLancContPersonalList;
    @OneToMany(mappedBy = "hpadId")
    private List<ConfigParamContabeis> configParamContabeisList;
    @OneToMany(mappedBy = "hpadId")
    private List<ItensCaixas> itensCaixasList;
    @OneToMany(mappedBy = "hpadId")
    private List<Fornecedores> fornecedoresList;
    @OneToMany(mappedBy = "hpadId")
    private List<GruposTipospagamentos> gruposTipospagamentosList;
    @OneToMany(mappedBy = "hpadId")
    private List<OpcmTipospagamentos> opcmTipospagamentosList;
    @OneToMany(mappedBy = "hpadId")
    private List<MovimentoContabil> movimentoContabilList;

    public HistoricosPadrao() {
    }

    public HistoricosPadrao(String hpadId) {
        this.hpadId = hpadId;
    }

    public HistoricosPadrao(String hpadId, String hpadCodigo, String hpadNome) {
        this.hpadId = hpadId;
        this.hpadCodigo = hpadCodigo;
        this.hpadNome = hpadNome;
    }

    public String getHpadId() {
        return hpadId;
    }

    public void setHpadId(String hpadId) {
        this.hpadId = hpadId;
    }

    public String getHpadCodigo() {
        return hpadCodigo;
    }

    public void setHpadCodigo(String hpadCodigo) {
        this.hpadCodigo = hpadCodigo;
    }

    public String getHpadNome() {
        return hpadNome;
    }

    public void setHpadNome(String hpadNome) {
        this.hpadNome = hpadNome;
    }

    public Date getHPadLASTUPDATE() {
        return hPadLASTUPDATE;
    }

    public void setHPadLASTUPDATE(Date hPadLASTUPDATE) {
        this.hPadLASTUPDATE = hPadLASTUPDATE;
    }

    public String getHpadLocal() {
        return hpadLocal;
    }

    public void setHpadLocal(String hpadLocal) {
        this.hpadLocal = hpadLocal;
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
    public List<DcfsLanccontabeis> getDcfsLanccontabeisList() {
        return dcfsLanccontabeisList;
    }

    public void setDcfsLanccontabeisList(List<DcfsLanccontabeis> dcfsLanccontabeisList) {
        this.dcfsLanccontabeisList = dcfsLanccontabeisList;
    }

    @XmlTransient
    public List<ParametroscontRecPagar> getParametroscontRecPagarList() {
        return parametroscontRecPagarList;
    }

    public void setParametroscontRecPagarList(List<ParametroscontRecPagar> parametroscontRecPagarList) {
        this.parametroscontRecPagarList = parametroscontRecPagarList;
    }

    @XmlTransient
    public List<Grupos> getGruposList() {
        return gruposList;
    }

    public void setGruposList(List<Grupos> gruposList) {
        this.gruposList = gruposList;
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
    public List<PlanoContas> getPlanoContasList() {
        return planoContasList;
    }

    public void setPlanoContasList(List<PlanoContas> planoContasList) {
        this.planoContasList = planoContasList;
    }

    @XmlTransient
    public List<Titulos> getTitulosList() {
        return titulosList;
    }

    public void setTitulosList(List<Titulos> titulosList) {
        this.titulosList = titulosList;
    }

    @XmlTransient
    public List<Clientes> getClientesList() {
        return clientesList;
    }

    public void setClientesList(List<Clientes> clientesList) {
        this.clientesList = clientesList;
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
    public List<ConfigParamContabeis> getConfigParamContabeisList() {
        return configParamContabeisList;
    }

    public void setConfigParamContabeisList(List<ConfigParamContabeis> configParamContabeisList) {
        this.configParamContabeisList = configParamContabeisList;
    }

    @XmlTransient
    public List<ItensCaixas> getItensCaixasList() {
        return itensCaixasList;
    }

    public void setItensCaixasList(List<ItensCaixas> itensCaixasList) {
        this.itensCaixasList = itensCaixasList;
    }

    @XmlTransient
    public List<Fornecedores> getFornecedoresList() {
        return fornecedoresList;
    }

    public void setFornecedoresList(List<Fornecedores> fornecedoresList) {
        this.fornecedoresList = fornecedoresList;
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
    public List<MovimentoContabil> getMovimentoContabilList() {
        return movimentoContabilList;
    }

    public void setMovimentoContabilList(List<MovimentoContabil> movimentoContabilList) {
        this.movimentoContabilList = movimentoContabilList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hpadId != null ? hpadId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HistoricosPadrao)) {
            return false;
        }
        HistoricosPadrao other = (HistoricosPadrao) object;
        if ((this.hpadId == null && other.hpadId != null) || (this.hpadId != null && !this.hpadId.equals(other.hpadId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.HistoricosPadrao[ hpadId=" + hpadId + " ]";
    }
    
}
