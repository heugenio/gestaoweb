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
import javax.persistence.Lob;
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
@Table(name = "LOTES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Lotes.findAll", query = "SELECT l FROM Lotes l"),
    @NamedQuery(name = "Lotes.findByLoteId", query = "SELECT l FROM Lotes l WHERE l.loteId = :loteId"),
    @NamedQuery(name = "Lotes.findByLoteNumero", query = "SELECT l FROM Lotes l WHERE l.loteNumero = :loteNumero"),
    @NamedQuery(name = "Lotes.findByLoteFabricacao", query = "SELECT l FROM Lotes l WHERE l.loteFabricacao = :loteFabricacao"),
    @NamedQuery(name = "Lotes.findByLoteValidade", query = "SELECT l FROM Lotes l WHERE l.loteValidade = :loteValidade"),
    @NamedQuery(name = "Lotes.findByLoteLASTUPDATE", query = "SELECT l FROM Lotes l WHERE l.loteLASTUPDATE = :loteLASTUPDATE")})
public class Lotes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LOTE_ID")
    private String loteId;
    @Basic(optional = false)
    @Column(name = "LOTE_NUMERO")
    private String loteNumero;
    @Basic(optional = false)
    @Column(name = "LOTE_FABRICACAO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date loteFabricacao;
    @Basic(optional = false)
    @Column(name = "LOTE_VALIDADE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date loteValidade;
    @Lob
    @Column(name = "LOTE_OBS")
    private String loteObs;
    @Column(name = "Lote_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date loteLASTUPDATE;
    @OneToMany(mappedBy = "loteId")
    private List<TiposEstoques> tiposEstoquesList;
    @OneToMany(mappedBy = "loteId")
    private List<ItensRequisicoes> itensRequisicoesList;
    @JoinColumn(name = "PROD_ID", referencedColumnName = "PROD_ID")
    @ManyToOne
    private Produtos prodId;
    @OneToMany(mappedBy = "loteId")
    private List<OrdemProducao> ordemProducaoList;

    public Lotes() {
    }

    public Lotes(String loteId) {
        this.loteId = loteId;
    }

    public Lotes(String loteId, String loteNumero, Date loteFabricacao, Date loteValidade) {
        this.loteId = loteId;
        this.loteNumero = loteNumero;
        this.loteFabricacao = loteFabricacao;
        this.loteValidade = loteValidade;
    }

    public String getLoteId() {
        return loteId;
    }

    public void setLoteId(String loteId) {
        this.loteId = loteId;
    }

    public String getLoteNumero() {
        return loteNumero;
    }

    public void setLoteNumero(String loteNumero) {
        this.loteNumero = loteNumero;
    }

    public Date getLoteFabricacao() {
        return loteFabricacao;
    }

    public void setLoteFabricacao(Date loteFabricacao) {
        this.loteFabricacao = loteFabricacao;
    }

    public Date getLoteValidade() {
        return loteValidade;
    }

    public void setLoteValidade(Date loteValidade) {
        this.loteValidade = loteValidade;
    }

    public String getLoteObs() {
        return loteObs;
    }

    public void setLoteObs(String loteObs) {
        this.loteObs = loteObs;
    }

    public Date getLoteLASTUPDATE() {
        return loteLASTUPDATE;
    }

    public void setLoteLASTUPDATE(Date loteLASTUPDATE) {
        this.loteLASTUPDATE = loteLASTUPDATE;
    }

    @XmlTransient
    public List<TiposEstoques> getTiposEstoquesList() {
        return tiposEstoquesList;
    }

    public void setTiposEstoquesList(List<TiposEstoques> tiposEstoquesList) {
        this.tiposEstoquesList = tiposEstoquesList;
    }

    @XmlTransient
    public List<ItensRequisicoes> getItensRequisicoesList() {
        return itensRequisicoesList;
    }

    public void setItensRequisicoesList(List<ItensRequisicoes> itensRequisicoesList) {
        this.itensRequisicoesList = itensRequisicoesList;
    }

    public Produtos getProdId() {
        return prodId;
    }

    public void setProdId(Produtos prodId) {
        this.prodId = prodId;
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
        hash += (loteId != null ? loteId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lotes)) {
            return false;
        }
        Lotes other = (Lotes) object;
        if ((this.loteId == null && other.loteId != null) || (this.loteId != null && !this.loteId.equals(other.loteId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.Lotes[ loteId=" + loteId + " ]";
    }
    
}
