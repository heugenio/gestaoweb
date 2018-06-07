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
@Table(name = "RAMOS_ATIVIDADE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RamosAtividade.findAll", query = "SELECT r FROM RamosAtividade r"),
    @NamedQuery(name = "RamosAtividade.findByRmatId", query = "SELECT r FROM RamosAtividade r WHERE r.rmatId = :rmatId"),
    @NamedQuery(name = "RamosAtividade.findByRmatNome", query = "SELECT r FROM RamosAtividade r WHERE r.rmatNome = :rmatNome"),
    @NamedQuery(name = "RamosAtividade.findByRmatCodigoRf", query = "SELECT r FROM RamosAtividade r WHERE r.rmatCodigoRf = :rmatCodigoRf"),
    @NamedQuery(name = "RamosAtividade.findByRmatRetemCofins", query = "SELECT r FROM RamosAtividade r WHERE r.rmatRetemCofins = :rmatRetemCofins"),
    @NamedQuery(name = "RamosAtividade.findByRmatRetemPis", query = "SELECT r FROM RamosAtividade r WHERE r.rmatRetemPis = :rmatRetemPis"),
    @NamedQuery(name = "RamosAtividade.findByRmatRetemCsll", query = "SELECT r FROM RamosAtividade r WHERE r.rmatRetemCsll = :rmatRetemCsll"),
    @NamedQuery(name = "RamosAtividade.findByRmAtLASTUPDATE", query = "SELECT r FROM RamosAtividade r WHERE r.rmAtLASTUPDATE = :rmAtLASTUPDATE")})
public class RamosAtividade implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "RMAT_ID")
    private String rmatId;
    @Basic(optional = false)
    @Column(name = "RMAT_NOME")
    private String rmatNome;
    @Basic(optional = false)
    @Column(name = "RMAT_CODIGO_RF")
    private String rmatCodigoRf;
    @Basic(optional = false)
    @Column(name = "RMAT_RETEM_COFINS")
    private String rmatRetemCofins;
    @Basic(optional = false)
    @Column(name = "RMAT_RETEM_PIS")
    private String rmatRetemPis;
    @Basic(optional = false)
    @Column(name = "RMAT_RETEM_CSLL")
    private String rmatRetemCsll;
    @Column(name = "RmAt_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rmAtLASTUPDATE;
    @OneToMany(mappedBy = "rmatId")
    private List<ClassificacaoFiscal> classificacaoFiscalList;
    @OneToMany(mappedBy = "rmatId")
    private List<Contadores> contadoresList;
    @OneToMany(mappedBy = "rmatId")
    private List<Clientes> clientesList;
    @OneToMany(mappedBy = "rmatId")
    private List<Fornecedores> fornecedoresList;

    public RamosAtividade() {
    }

    public RamosAtividade(String rmatId) {
        this.rmatId = rmatId;
    }

    public RamosAtividade(String rmatId, String rmatNome, String rmatCodigoRf, String rmatRetemCofins, String rmatRetemPis, String rmatRetemCsll) {
        this.rmatId = rmatId;
        this.rmatNome = rmatNome;
        this.rmatCodigoRf = rmatCodigoRf;
        this.rmatRetemCofins = rmatRetemCofins;
        this.rmatRetemPis = rmatRetemPis;
        this.rmatRetemCsll = rmatRetemCsll;
    }

    public String getRmatId() {
        return rmatId;
    }

    public void setRmatId(String rmatId) {
        this.rmatId = rmatId;
    }

    public String getRmatNome() {
        return rmatNome;
    }

    public void setRmatNome(String rmatNome) {
        this.rmatNome = rmatNome;
    }

    public String getRmatCodigoRf() {
        return rmatCodigoRf;
    }

    public void setRmatCodigoRf(String rmatCodigoRf) {
        this.rmatCodigoRf = rmatCodigoRf;
    }

    public String getRmatRetemCofins() {
        return rmatRetemCofins;
    }

    public void setRmatRetemCofins(String rmatRetemCofins) {
        this.rmatRetemCofins = rmatRetemCofins;
    }

    public String getRmatRetemPis() {
        return rmatRetemPis;
    }

    public void setRmatRetemPis(String rmatRetemPis) {
        this.rmatRetemPis = rmatRetemPis;
    }

    public String getRmatRetemCsll() {
        return rmatRetemCsll;
    }

    public void setRmatRetemCsll(String rmatRetemCsll) {
        this.rmatRetemCsll = rmatRetemCsll;
    }

    public Date getRmAtLASTUPDATE() {
        return rmAtLASTUPDATE;
    }

    public void setRmAtLASTUPDATE(Date rmAtLASTUPDATE) {
        this.rmAtLASTUPDATE = rmAtLASTUPDATE;
    }

    @XmlTransient
    public List<ClassificacaoFiscal> getClassificacaoFiscalList() {
        return classificacaoFiscalList;
    }

    public void setClassificacaoFiscalList(List<ClassificacaoFiscal> classificacaoFiscalList) {
        this.classificacaoFiscalList = classificacaoFiscalList;
    }

    @XmlTransient
    public List<Contadores> getContadoresList() {
        return contadoresList;
    }

    public void setContadoresList(List<Contadores> contadoresList) {
        this.contadoresList = contadoresList;
    }

    @XmlTransient
    public List<Clientes> getClientesList() {
        return clientesList;
    }

    public void setClientesList(List<Clientes> clientesList) {
        this.clientesList = clientesList;
    }

    @XmlTransient
    public List<Fornecedores> getFornecedoresList() {
        return fornecedoresList;
    }

    public void setFornecedoresList(List<Fornecedores> fornecedoresList) {
        this.fornecedoresList = fornecedoresList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rmatId != null ? rmatId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RamosAtividade)) {
            return false;
        }
        RamosAtividade other = (RamosAtividade) object;
        if ((this.rmatId == null && other.rmatId != null) || (this.rmatId != null && !this.rmatId.equals(other.rmatId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.RamosAtividade[ rmatId=" + rmatId + " ]";
    }
    
}
