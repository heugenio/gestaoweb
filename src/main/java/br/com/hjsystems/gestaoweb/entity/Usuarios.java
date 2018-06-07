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
@Table(name = "USUARIOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuarios.findAll", query = "SELECT u FROM Usuarios u"),
    @NamedQuery(name = "Usuarios.findByUsrsId", query = "SELECT u FROM Usuarios u WHERE u.usrsId = :usrsId"),
    @NamedQuery(name = "Usuarios.findByUsrsNomeLogin", query = "SELECT u FROM Usuarios u WHERE u.usrsNomeLogin = :usrsNomeLogin"),
    @NamedQuery(name = "Usuarios.findByUsrsSenha", query = "SELECT u FROM Usuarios u WHERE u.usrsSenha = :usrsSenha"),
    @NamedQuery(name = "Usuarios.findByUsrsSituacao", query = "SELECT u FROM Usuarios u WHERE u.usrsSituacao = :usrsSituacao"),
    @NamedQuery(name = "Usuarios.findByUsrsLASTUPDATE", query = "SELECT u FROM Usuarios u WHERE u.usrsLASTUPDATE = :usrsLASTUPDATE")})
public class Usuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "USRS_ID")
    private String usrsId;
    @Basic(optional = false)
    @Column(name = "USRS_NOME_LOGIN")
    private String usrsNomeLogin;
    @Column(name = "USRS_SENHA")
    private String usrsSenha;
    @Basic(optional = false)
    @Column(name = "USRS_SITUACAO")
    private String usrsSituacao;
    @Column(name = "Usrs_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date usrsLASTUPDATE;
    @OneToMany(mappedBy = "usrsId")
    private List<UsuariosGruposUsuarios> usuariosGruposUsuariosList;
    @JoinColumn(name = "PESS_ID", referencedColumnName = "PESS_ID")
    @ManyToOne
    private Pessoas pessId;
    @OneToMany(mappedBy = "usrsId")
    private List<Pedidos> pedidosList;
    @OneToMany(mappedBy = "usuUsrsId")
    private List<Pedidos> pedidosList1;
    @OneToMany(mappedBy = "usrsId")
    private List<ItensRequisicoes> itensRequisicoesList;
    @OneToMany(mappedBy = "usuUsrsId")
    private List<Requisicoes> requisicoesList;
    @OneToMany(mappedBy = "usrsId")
    private List<Requisicoes> requisicoesList1;
    @OneToMany(mappedBy = "usrsId")
    private List<Entregas> entregasList;
    @OneToMany(mappedBy = "usrsId")
    private List<OcorrenciasAtendimento> ocorrenciasAtendimentoList;
    @OneToMany(mappedBy = "usrsId")
    private List<SolicitacoesCompras> solicitacoesComprasList;
    @OneToMany(mappedBy = "usrsId")
    private List<AtendimentosComerciais> atendimentosComerciaisList;
    @OneToMany(mappedBy = "usrsId")
    private List<ItensPedidos> itensPedidosList;
    @OneToMany(mappedBy = "usrsId")
    private List<Agenda> agendaList;
    @OneToMany(mappedBy = "usrsId")
    private List<PessoasEventos> pessoasEventosList;
    @OneToMany(mappedBy = "usrsId")
    private List<Cobrancas> cobrancasList;
    @OneToMany(mappedBy = "usrsId")
    private List<Titulos> titulosList;
    @OneToMany(mappedBy = "usrsId")
    private List<PrecosProdutos> precosProdutosList;
    @OneToMany(mappedBy = "usuUsrsId")
    private List<Rmas> rmasList;
    @OneToMany(mappedBy = "usrsId")
    private List<Rmas> rmasList1;
    @OneToMany(mappedBy = "usrsId")
    private List<OrdemServico> ordemServicoList;
    @OneToMany(mappedBy = "usrsId")
    private List<Balancos> balancosList;
    @OneToMany(mappedBy = "usrsId")
    private List<ItensCaixas> itensCaixasList;
    @OneToMany(mappedBy = "usrsId")
    private List<HistoricosCheques> historicosChequesList;
    @OneToMany(mappedBy = "usrsId")
    private List<MotivodivergenciaUsuarios> motivodivergenciaUsuariosList;
    @OneToMany(mappedBy = "usrsId")
    private List<Expedicoes> expedicoesList;

    public Usuarios() {
    }

    public Usuarios(String usrsId) {
        this.usrsId = usrsId;
    }

    public Usuarios(String usrsId, String usrsNomeLogin, String usrsSituacao) {
        this.usrsId = usrsId;
        this.usrsNomeLogin = usrsNomeLogin;
        this.usrsSituacao = usrsSituacao;
    }

    public String getUsrsId() {
        return usrsId;
    }

    public void setUsrsId(String usrsId) {
        this.usrsId = usrsId;
    }

    public String getUsrsNomeLogin() {
        return usrsNomeLogin;
    }

    public void setUsrsNomeLogin(String usrsNomeLogin) {
        this.usrsNomeLogin = usrsNomeLogin;
    }

    public String getUsrsSenha() {
        return usrsSenha;
    }

    public void setUsrsSenha(String usrsSenha) {
        this.usrsSenha = usrsSenha;
    }

    public String getUsrsSituacao() {
        return usrsSituacao;
    }

    public void setUsrsSituacao(String usrsSituacao) {
        this.usrsSituacao = usrsSituacao;
    }

    public Date getUsrsLASTUPDATE() {
        return usrsLASTUPDATE;
    }

    public void setUsrsLASTUPDATE(Date usrsLASTUPDATE) {
        this.usrsLASTUPDATE = usrsLASTUPDATE;
    }

    @XmlTransient
    public List<UsuariosGruposUsuarios> getUsuariosGruposUsuariosList() {
        return usuariosGruposUsuariosList;
    }

    public void setUsuariosGruposUsuariosList(List<UsuariosGruposUsuarios> usuariosGruposUsuariosList) {
        this.usuariosGruposUsuariosList = usuariosGruposUsuariosList;
    }

    public Pessoas getPessId() {
        return pessId;
    }

    public void setPessId(Pessoas pessId) {
        this.pessId = pessId;
    }

    @XmlTransient
    public List<Pedidos> getPedidosList() {
        return pedidosList;
    }

    public void setPedidosList(List<Pedidos> pedidosList) {
        this.pedidosList = pedidosList;
    }

    @XmlTransient
    public List<Pedidos> getPedidosList1() {
        return pedidosList1;
    }

    public void setPedidosList1(List<Pedidos> pedidosList1) {
        this.pedidosList1 = pedidosList1;
    }

    @XmlTransient
    public List<ItensRequisicoes> getItensRequisicoesList() {
        return itensRequisicoesList;
    }

    public void setItensRequisicoesList(List<ItensRequisicoes> itensRequisicoesList) {
        this.itensRequisicoesList = itensRequisicoesList;
    }

    @XmlTransient
    public List<Requisicoes> getRequisicoesList() {
        return requisicoesList;
    }

    public void setRequisicoesList(List<Requisicoes> requisicoesList) {
        this.requisicoesList = requisicoesList;
    }

    @XmlTransient
    public List<Requisicoes> getRequisicoesList1() {
        return requisicoesList1;
    }

    public void setRequisicoesList1(List<Requisicoes> requisicoesList1) {
        this.requisicoesList1 = requisicoesList1;
    }

    @XmlTransient
    public List<Entregas> getEntregasList() {
        return entregasList;
    }

    public void setEntregasList(List<Entregas> entregasList) {
        this.entregasList = entregasList;
    }

    @XmlTransient
    public List<OcorrenciasAtendimento> getOcorrenciasAtendimentoList() {
        return ocorrenciasAtendimentoList;
    }

    public void setOcorrenciasAtendimentoList(List<OcorrenciasAtendimento> ocorrenciasAtendimentoList) {
        this.ocorrenciasAtendimentoList = ocorrenciasAtendimentoList;
    }

    @XmlTransient
    public List<SolicitacoesCompras> getSolicitacoesComprasList() {
        return solicitacoesComprasList;
    }

    public void setSolicitacoesComprasList(List<SolicitacoesCompras> solicitacoesComprasList) {
        this.solicitacoesComprasList = solicitacoesComprasList;
    }

    @XmlTransient
    public List<AtendimentosComerciais> getAtendimentosComerciaisList() {
        return atendimentosComerciaisList;
    }

    public void setAtendimentosComerciaisList(List<AtendimentosComerciais> atendimentosComerciaisList) {
        this.atendimentosComerciaisList = atendimentosComerciaisList;
    }

    @XmlTransient
    public List<ItensPedidos> getItensPedidosList() {
        return itensPedidosList;
    }

    public void setItensPedidosList(List<ItensPedidos> itensPedidosList) {
        this.itensPedidosList = itensPedidosList;
    }

    @XmlTransient
    public List<Agenda> getAgendaList() {
        return agendaList;
    }

    public void setAgendaList(List<Agenda> agendaList) {
        this.agendaList = agendaList;
    }

    @XmlTransient
    public List<PessoasEventos> getPessoasEventosList() {
        return pessoasEventosList;
    }

    public void setPessoasEventosList(List<PessoasEventos> pessoasEventosList) {
        this.pessoasEventosList = pessoasEventosList;
    }

    @XmlTransient
    public List<Cobrancas> getCobrancasList() {
        return cobrancasList;
    }

    public void setCobrancasList(List<Cobrancas> cobrancasList) {
        this.cobrancasList = cobrancasList;
    }

    @XmlTransient
    public List<Titulos> getTitulosList() {
        return titulosList;
    }

    public void setTitulosList(List<Titulos> titulosList) {
        this.titulosList = titulosList;
    }

    @XmlTransient
    public List<PrecosProdutos> getPrecosProdutosList() {
        return precosProdutosList;
    }

    public void setPrecosProdutosList(List<PrecosProdutos> precosProdutosList) {
        this.precosProdutosList = precosProdutosList;
    }

    @XmlTransient
    public List<Rmas> getRmasList() {
        return rmasList;
    }

    public void setRmasList(List<Rmas> rmasList) {
        this.rmasList = rmasList;
    }

    @XmlTransient
    public List<Rmas> getRmasList1() {
        return rmasList1;
    }

    public void setRmasList1(List<Rmas> rmasList1) {
        this.rmasList1 = rmasList1;
    }

    @XmlTransient
    public List<OrdemServico> getOrdemServicoList() {
        return ordemServicoList;
    }

    public void setOrdemServicoList(List<OrdemServico> ordemServicoList) {
        this.ordemServicoList = ordemServicoList;
    }

    @XmlTransient
    public List<Balancos> getBalancosList() {
        return balancosList;
    }

    public void setBalancosList(List<Balancos> balancosList) {
        this.balancosList = balancosList;
    }

    @XmlTransient
    public List<ItensCaixas> getItensCaixasList() {
        return itensCaixasList;
    }

    public void setItensCaixasList(List<ItensCaixas> itensCaixasList) {
        this.itensCaixasList = itensCaixasList;
    }

    @XmlTransient
    public List<HistoricosCheques> getHistoricosChequesList() {
        return historicosChequesList;
    }

    public void setHistoricosChequesList(List<HistoricosCheques> historicosChequesList) {
        this.historicosChequesList = historicosChequesList;
    }

    @XmlTransient
    public List<MotivodivergenciaUsuarios> getMotivodivergenciaUsuariosList() {
        return motivodivergenciaUsuariosList;
    }

    public void setMotivodivergenciaUsuariosList(List<MotivodivergenciaUsuarios> motivodivergenciaUsuariosList) {
        this.motivodivergenciaUsuariosList = motivodivergenciaUsuariosList;
    }

    @XmlTransient
    public List<Expedicoes> getExpedicoesList() {
        return expedicoesList;
    }

    public void setExpedicoesList(List<Expedicoes> expedicoesList) {
        this.expedicoesList = expedicoesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usrsId != null ? usrsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuarios)) {
            return false;
        }
        Usuarios other = (Usuarios) object;
        if ((this.usrsId == null && other.usrsId != null) || (this.usrsId != null && !this.usrsId.equals(other.usrsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.Usuarios[ usrsId=" + usrsId + " ]";
    }
    
}
