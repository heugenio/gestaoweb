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
@Table(name = "UNIDADES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Unidades.findAll", query = "SELECT u FROM Unidades u"),
    @NamedQuery(name = "Unidades.findByUnidId", query = "SELECT u FROM Unidades u WHERE u.unidId = :unidId"),
    @NamedQuery(name = "Unidades.findByUnidNome", query = "SELECT u FROM Unidades u WHERE u.unidNome = :unidNome"),
    @NamedQuery(name = "Unidades.findByUnidSigla", query = "SELECT u FROM Unidades u WHERE u.unidSigla = :unidSigla"),
    @NamedQuery(name = "Unidades.findByUnidLASTUPDATE", query = "SELECT u FROM Unidades u WHERE u.unidLASTUPDATE = :unidLASTUPDATE")})
public class Unidades implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "UNID_ID")
    private String unidId;
    @Basic(optional = false)
    @Column(name = "UNID_NOME")
    private String unidNome;
    @Basic(optional = false)
    @Column(name = "UNID_SIGLA")
    private String unidSigla;
    @Column(name = "Unid_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date unidLASTUPDATE;
    @OneToMany(mappedBy = "unidId")
    private List<ItensSugestoescompras> itensSugestoescomprasList;
    @OneToMany(mappedBy = "uniUnidId")
    private List<ItensSugestoescompras> itensSugestoescomprasList1;
    @OneToMany(mappedBy = "unidId")
    private List<SubUnidadesProduto> subUnidadesProdutoList;
    @OneToMany(mappedBy = "unidId")
    private List<Receita> receitaList;
    @OneToMany(mappedBy = "unidId")
    private List<OrdemProducao> ordemProducaoList;

    public Unidades() {
    }

    public Unidades(String unidId) {
        this.unidId = unidId;
    }

    public Unidades(String unidId, String unidNome, String unidSigla) {
        this.unidId = unidId;
        this.unidNome = unidNome;
        this.unidSigla = unidSigla;
    }

    public String getUnidId() {
        return unidId;
    }

    public void setUnidId(String unidId) {
        this.unidId = unidId;
    }

    public String getUnidNome() {
        return unidNome;
    }

    public void setUnidNome(String unidNome) {
        this.unidNome = unidNome;
    }

    public String getUnidSigla() {
        return unidSigla;
    }

    public void setUnidSigla(String unidSigla) {
        this.unidSigla = unidSigla;
    }

    public Date getUnidLASTUPDATE() {
        return unidLASTUPDATE;
    }

    public void setUnidLASTUPDATE(Date unidLASTUPDATE) {
        this.unidLASTUPDATE = unidLASTUPDATE;
    }

    @XmlTransient
    public List<ItensSugestoescompras> getItensSugestoescomprasList() {
        return itensSugestoescomprasList;
    }

    public void setItensSugestoescomprasList(List<ItensSugestoescompras> itensSugestoescomprasList) {
        this.itensSugestoescomprasList = itensSugestoescomprasList;
    }

    @XmlTransient
    public List<ItensSugestoescompras> getItensSugestoescomprasList1() {
        return itensSugestoescomprasList1;
    }

    public void setItensSugestoescomprasList1(List<ItensSugestoescompras> itensSugestoescomprasList1) {
        this.itensSugestoescomprasList1 = itensSugestoescomprasList1;
    }

    @XmlTransient
    public List<SubUnidadesProduto> getSubUnidadesProdutoList() {
        return subUnidadesProdutoList;
    }

    public void setSubUnidadesProdutoList(List<SubUnidadesProduto> subUnidadesProdutoList) {
        this.subUnidadesProdutoList = subUnidadesProdutoList;
    }

    @XmlTransient
    public List<Receita> getReceitaList() {
        return receitaList;
    }

    public void setReceitaList(List<Receita> receitaList) {
        this.receitaList = receitaList;
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
        hash += (unidId != null ? unidId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Unidades)) {
            return false;
        }
        Unidades other = (Unidades) object;
        if ((this.unidId == null && other.unidId != null) || (this.unidId != null && !this.unidId.equals(other.unidId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.Unidades[ unidId=" + unidId + " ]";
    }
    
}
