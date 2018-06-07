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
@Table(name = "PRODUTOS_APLICACOES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProdutosAplicacoes.findAll", query = "SELECT p FROM ProdutosAplicacoes p"),
    @NamedQuery(name = "ProdutosAplicacoes.findByPrapId", query = "SELECT p FROM ProdutosAplicacoes p WHERE p.prapId = :prapId"),
    @NamedQuery(name = "ProdutosAplicacoes.findByPrApLASTUPDATE", query = "SELECT p FROM ProdutosAplicacoes p WHERE p.prApLASTUPDATE = :prApLASTUPDATE")})
public class ProdutosAplicacoes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PRAP_ID")
    private String prapId;
    @Column(name = "PrAp_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date prApLASTUPDATE;
    @OneToMany(mappedBy = "prapId")
    private List<ItensOrcamentos> itensOrcamentosList;
    @OneToMany(mappedBy = "prapId")
    private List<TabprecosProdutosAplicacoes> tabprecosProdutosAplicacoesList;
    @OneToMany(mappedBy = "prapId")
    private List<ItensPedidos> itensPedidosList;
    @JoinColumn(name = "APLC_ID", referencedColumnName = "APLC_ID")
    @ManyToOne
    private Aplicacoes aplcId;
    @JoinColumn(name = "PROD_ID", referencedColumnName = "PROD_ID")
    @ManyToOne
    private Produtos prodId;

    public ProdutosAplicacoes() {
    }

    public ProdutosAplicacoes(String prapId) {
        this.prapId = prapId;
    }

    public String getPrapId() {
        return prapId;
    }

    public void setPrapId(String prapId) {
        this.prapId = prapId;
    }

    public Date getPrApLASTUPDATE() {
        return prApLASTUPDATE;
    }

    public void setPrApLASTUPDATE(Date prApLASTUPDATE) {
        this.prApLASTUPDATE = prApLASTUPDATE;
    }

    @XmlTransient
    public List<ItensOrcamentos> getItensOrcamentosList() {
        return itensOrcamentosList;
    }

    public void setItensOrcamentosList(List<ItensOrcamentos> itensOrcamentosList) {
        this.itensOrcamentosList = itensOrcamentosList;
    }

    @XmlTransient
    public List<TabprecosProdutosAplicacoes> getTabprecosProdutosAplicacoesList() {
        return tabprecosProdutosAplicacoesList;
    }

    public void setTabprecosProdutosAplicacoesList(List<TabprecosProdutosAplicacoes> tabprecosProdutosAplicacoesList) {
        this.tabprecosProdutosAplicacoesList = tabprecosProdutosAplicacoesList;
    }

    @XmlTransient
    public List<ItensPedidos> getItensPedidosList() {
        return itensPedidosList;
    }

    public void setItensPedidosList(List<ItensPedidos> itensPedidosList) {
        this.itensPedidosList = itensPedidosList;
    }

    public Aplicacoes getAplcId() {
        return aplcId;
    }

    public void setAplcId(Aplicacoes aplcId) {
        this.aplcId = aplcId;
    }

    public Produtos getProdId() {
        return prodId;
    }

    public void setProdId(Produtos prodId) {
        this.prodId = prodId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prapId != null ? prapId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProdutosAplicacoes)) {
            return false;
        }
        ProdutosAplicacoes other = (ProdutosAplicacoes) object;
        if ((this.prapId == null && other.prapId != null) || (this.prapId != null && !this.prapId.equals(other.prapId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.ProdutosAplicacoes[ prapId=" + prapId + " ]";
    }
    
}
