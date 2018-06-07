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
@Table(name = "LIMITES_CREDITOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LimitesCreditos.findAll", query = "SELECT l FROM LimitesCreditos l"),
    @NamedQuery(name = "LimitesCreditos.findByLmcrId", query = "SELECT l FROM LimitesCreditos l WHERE l.lmcrId = :lmcrId"),
    @NamedQuery(name = "LimitesCreditos.findByLmcrLimiteAcumulado", query = "SELECT l FROM LimitesCreditos l WHERE l.lmcrLimiteAcumulado = :lmcrLimiteAcumulado"),
    @NamedQuery(name = "LimitesCreditos.findByLmcrLimiteMensal", query = "SELECT l FROM LimitesCreditos l WHERE l.lmcrLimiteMensal = :lmcrLimiteMensal"),
    @NamedQuery(name = "LimitesCreditos.findByLmcrLimitePrazoMedio", query = "SELECT l FROM LimitesCreditos l WHERE l.lmcrLimitePrazoMedio = :lmcrLimitePrazoMedio"),
    @NamedQuery(name = "LimitesCreditos.findByLmcrObservacao", query = "SELECT l FROM LimitesCreditos l WHERE l.lmcrObservacao = :lmcrObservacao"),
    @NamedQuery(name = "LimitesCreditos.findByLmCrLASTUPDATE", query = "SELECT l FROM LimitesCreditos l WHERE l.lmCrLASTUPDATE = :lmCrLASTUPDATE")})
public class LimitesCreditos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LMCR_ID")
    private String lmcrId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "LMCR_LIMITE_ACUMULADO")
    private BigDecimal lmcrLimiteAcumulado;
    @Basic(optional = false)
    @Column(name = "LMCR_LIMITE_MENSAL")
    private BigDecimal lmcrLimiteMensal;
    @Column(name = "LMCR_LIMITE_PRAZO_MEDIO")
    private Integer lmcrLimitePrazoMedio;
    @Column(name = "LMCR_OBSERVACAO")
    private String lmcrObservacao;
    @Column(name = "LmCr_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lmCrLASTUPDATE;
    @OneToMany(mappedBy = "lmcrId")
    private List<Funcionarios> funcionariosList;
    @JoinColumn(name = "FUNC_ID", referencedColumnName = "FUNC_ID")
    @ManyToOne
    private Funcionarios funcId;
    @OneToMany(mappedBy = "lmcrId")
    private List<TiposClienteFornecedores> tiposClienteFornecedoresList;
    @OneToMany(mappedBy = "lmcrId")
    private List<GruposClientes> gruposClientesList;
    @OneToMany(mappedBy = "lmcrId")
    private List<Clientes> clientesList;
    @OneToMany(mappedBy = "lmcrId")
    private List<HistoricosLimitesCreditos> historicosLimitesCreditosList;

    public LimitesCreditos() {
    }

    public LimitesCreditos(String lmcrId) {
        this.lmcrId = lmcrId;
    }

    public LimitesCreditos(String lmcrId, BigDecimal lmcrLimiteAcumulado, BigDecimal lmcrLimiteMensal) {
        this.lmcrId = lmcrId;
        this.lmcrLimiteAcumulado = lmcrLimiteAcumulado;
        this.lmcrLimiteMensal = lmcrLimiteMensal;
    }

    public String getLmcrId() {
        return lmcrId;
    }

    public void setLmcrId(String lmcrId) {
        this.lmcrId = lmcrId;
    }

    public BigDecimal getLmcrLimiteAcumulado() {
        return lmcrLimiteAcumulado;
    }

    public void setLmcrLimiteAcumulado(BigDecimal lmcrLimiteAcumulado) {
        this.lmcrLimiteAcumulado = lmcrLimiteAcumulado;
    }

    public BigDecimal getLmcrLimiteMensal() {
        return lmcrLimiteMensal;
    }

    public void setLmcrLimiteMensal(BigDecimal lmcrLimiteMensal) {
        this.lmcrLimiteMensal = lmcrLimiteMensal;
    }

    public Integer getLmcrLimitePrazoMedio() {
        return lmcrLimitePrazoMedio;
    }

    public void setLmcrLimitePrazoMedio(Integer lmcrLimitePrazoMedio) {
        this.lmcrLimitePrazoMedio = lmcrLimitePrazoMedio;
    }

    public String getLmcrObservacao() {
        return lmcrObservacao;
    }

    public void setLmcrObservacao(String lmcrObservacao) {
        this.lmcrObservacao = lmcrObservacao;
    }

    public Date getLmCrLASTUPDATE() {
        return lmCrLASTUPDATE;
    }

    public void setLmCrLASTUPDATE(Date lmCrLASTUPDATE) {
        this.lmCrLASTUPDATE = lmCrLASTUPDATE;
    }

    @XmlTransient
    public List<Funcionarios> getFuncionariosList() {
        return funcionariosList;
    }

    public void setFuncionariosList(List<Funcionarios> funcionariosList) {
        this.funcionariosList = funcionariosList;
    }

    public Funcionarios getFuncId() {
        return funcId;
    }

    public void setFuncId(Funcionarios funcId) {
        this.funcId = funcId;
    }

    @XmlTransient
    public List<TiposClienteFornecedores> getTiposClienteFornecedoresList() {
        return tiposClienteFornecedoresList;
    }

    public void setTiposClienteFornecedoresList(List<TiposClienteFornecedores> tiposClienteFornecedoresList) {
        this.tiposClienteFornecedoresList = tiposClienteFornecedoresList;
    }

    @XmlTransient
    public List<GruposClientes> getGruposClientesList() {
        return gruposClientesList;
    }

    public void setGruposClientesList(List<GruposClientes> gruposClientesList) {
        this.gruposClientesList = gruposClientesList;
    }

    @XmlTransient
    public List<Clientes> getClientesList() {
        return clientesList;
    }

    public void setClientesList(List<Clientes> clientesList) {
        this.clientesList = clientesList;
    }

    @XmlTransient
    public List<HistoricosLimitesCreditos> getHistoricosLimitesCreditosList() {
        return historicosLimitesCreditosList;
    }

    public void setHistoricosLimitesCreditosList(List<HistoricosLimitesCreditos> historicosLimitesCreditosList) {
        this.historicosLimitesCreditosList = historicosLimitesCreditosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lmcrId != null ? lmcrId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LimitesCreditos)) {
            return false;
        }
        LimitesCreditos other = (LimitesCreditos) object;
        if ((this.lmcrId == null && other.lmcrId != null) || (this.lmcrId != null && !this.lmcrId.equals(other.lmcrId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.LimitesCreditos[ lmcrId=" + lmcrId + " ]";
    }
    
}
