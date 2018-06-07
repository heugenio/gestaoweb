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
@Table(name = "TIPOS_CLIENTE_FORNECEDORES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TiposClienteFornecedores.findAll", query = "SELECT t FROM TiposClienteFornecedores t"),
    @NamedQuery(name = "TiposClienteFornecedores.findByTclfId", query = "SELECT t FROM TiposClienteFornecedores t WHERE t.tclfId = :tclfId"),
    @NamedQuery(name = "TiposClienteFornecedores.findByTclfNome", query = "SELECT t FROM TiposClienteFornecedores t WHERE t.tclfNome = :tclfNome"),
    @NamedQuery(name = "TiposClienteFornecedores.findByTclfTipo", query = "SELECT t FROM TiposClienteFornecedores t WHERE t.tclfTipo = :tclfTipo"),
    @NamedQuery(name = "TiposClienteFornecedores.findByTClFLASTUPDATE", query = "SELECT t FROM TiposClienteFornecedores t WHERE t.tClFLASTUPDATE = :tClFLASTUPDATE")})
public class TiposClienteFornecedores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TCLF_ID")
    private String tclfId;
    @Basic(optional = false)
    @Column(name = "TCLF_NOME")
    private String tclfNome;
    @Basic(optional = false)
    @Column(name = "TCLF_TIPO")
    private String tclfTipo;
    @Column(name = "TClF_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tClFLASTUPDATE;
    @JoinColumn(name = "LMCR_ID", referencedColumnName = "LMCR_ID")
    @ManyToOne
    private LimitesCreditos lmcrId;
    @JoinColumn(name = "TBPC_ID", referencedColumnName = "TBPC_ID")
    @ManyToOne
    private TabelasPrecos tbpcId;
    @OneToMany(mappedBy = "tclfId")
    private List<Clientes> clientesList;
    @OneToMany(mappedBy = "tclfId")
    private List<Fornecedores> fornecedoresList;

    public TiposClienteFornecedores() {
    }

    public TiposClienteFornecedores(String tclfId) {
        this.tclfId = tclfId;
    }

    public TiposClienteFornecedores(String tclfId, String tclfNome, String tclfTipo) {
        this.tclfId = tclfId;
        this.tclfNome = tclfNome;
        this.tclfTipo = tclfTipo;
    }

    public String getTclfId() {
        return tclfId;
    }

    public void setTclfId(String tclfId) {
        this.tclfId = tclfId;
    }

    public String getTclfNome() {
        return tclfNome;
    }

    public void setTclfNome(String tclfNome) {
        this.tclfNome = tclfNome;
    }

    public String getTclfTipo() {
        return tclfTipo;
    }

    public void setTclfTipo(String tclfTipo) {
        this.tclfTipo = tclfTipo;
    }

    public Date getTClFLASTUPDATE() {
        return tClFLASTUPDATE;
    }

    public void setTClFLASTUPDATE(Date tClFLASTUPDATE) {
        this.tClFLASTUPDATE = tClFLASTUPDATE;
    }

    public LimitesCreditos getLmcrId() {
        return lmcrId;
    }

    public void setLmcrId(LimitesCreditos lmcrId) {
        this.lmcrId = lmcrId;
    }

    public TabelasPrecos getTbpcId() {
        return tbpcId;
    }

    public void setTbpcId(TabelasPrecos tbpcId) {
        this.tbpcId = tbpcId;
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
        hash += (tclfId != null ? tclfId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TiposClienteFornecedores)) {
            return false;
        }
        TiposClienteFornecedores other = (TiposClienteFornecedores) object;
        if ((this.tclfId == null && other.tclfId != null) || (this.tclfId != null && !this.tclfId.equals(other.tclfId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.TiposClienteFornecedores[ tclfId=" + tclfId + " ]";
    }
    
}
