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
@Table(name = "APLICACOES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Aplicacoes.findAll", query = "SELECT a FROM Aplicacoes a"),
    @NamedQuery(name = "Aplicacoes.findByAplcId", query = "SELECT a FROM Aplicacoes a WHERE a.aplcId = :aplcId"),
    @NamedQuery(name = "Aplicacoes.findByAplcDescricao", query = "SELECT a FROM Aplicacoes a WHERE a.aplcDescricao = :aplcDescricao"),
    @NamedQuery(name = "Aplicacoes.findByAplcLASTUPDATE", query = "SELECT a FROM Aplicacoes a WHERE a.aplcLASTUPDATE = :aplcLASTUPDATE")})
public class Aplicacoes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "APLC_ID")
    private String aplcId;
    @Basic(optional = false)
    @Column(name = "APLC_DESCRICAO")
    private String aplcDescricao;
    @Column(name = "Aplc_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date aplcLASTUPDATE;
    @OneToMany(mappedBy = "aplcId")
    private List<ItensPedidos> itensPedidosList;
    @OneToMany(mappedBy = "aplcId")
    private List<ProdutosAplicacoes> produtosAplicacoesList;

    public Aplicacoes() {
    }

    public Aplicacoes(String aplcId) {
        this.aplcId = aplcId;
    }

    public Aplicacoes(String aplcId, String aplcDescricao) {
        this.aplcId = aplcId;
        this.aplcDescricao = aplcDescricao;
    }

    public String getAplcId() {
        return aplcId;
    }

    public void setAplcId(String aplcId) {
        this.aplcId = aplcId;
    }

    public String getAplcDescricao() {
        return aplcDescricao;
    }

    public void setAplcDescricao(String aplcDescricao) {
        this.aplcDescricao = aplcDescricao;
    }

    public Date getAplcLASTUPDATE() {
        return aplcLASTUPDATE;
    }

    public void setAplcLASTUPDATE(Date aplcLASTUPDATE) {
        this.aplcLASTUPDATE = aplcLASTUPDATE;
    }

    @XmlTransient
    public List<ItensPedidos> getItensPedidosList() {
        return itensPedidosList;
    }

    public void setItensPedidosList(List<ItensPedidos> itensPedidosList) {
        this.itensPedidosList = itensPedidosList;
    }

    @XmlTransient
    public List<ProdutosAplicacoes> getProdutosAplicacoesList() {
        return produtosAplicacoesList;
    }

    public void setProdutosAplicacoesList(List<ProdutosAplicacoes> produtosAplicacoesList) {
        this.produtosAplicacoesList = produtosAplicacoesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (aplcId != null ? aplcId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Aplicacoes)) {
            return false;
        }
        Aplicacoes other = (Aplicacoes) object;
        if ((this.aplcId == null && other.aplcId != null) || (this.aplcId != null && !this.aplcId.equals(other.aplcId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.Aplicacoes[ aplcId=" + aplcId + " ]";
    }
    
}
