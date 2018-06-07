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
@Table(name = "COTACOES_ITENS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CotacoesItens.findAll", query = "SELECT c FROM CotacoesItens c"),
    @NamedQuery(name = "CotacoesItens.findByCtitId", query = "SELECT c FROM CotacoesItens c WHERE c.ctitId = :ctitId"),
    @NamedQuery(name = "CotacoesItens.findByCtitQtde", query = "SELECT c FROM CotacoesItens c WHERE c.ctitQtde = :ctitQtde"),
    @NamedQuery(name = "CotacoesItens.findByCtitQtdeSolicitada", query = "SELECT c FROM CotacoesItens c WHERE c.ctitQtdeSolicitada = :ctitQtdeSolicitada"),
    @NamedQuery(name = "CotacoesItens.findByCtitUnidSigla", query = "SELECT c FROM CotacoesItens c WHERE c.ctitUnidSigla = :ctitUnidSigla"),
    @NamedQuery(name = "CotacoesItens.findByCtitSbupMultiplicador", query = "SELECT c FROM CotacoesItens c WHERE c.ctitSbupMultiplicador = :ctitSbupMultiplicador"),
    @NamedQuery(name = "CotacoesItens.findByCtitObservacoes", query = "SELECT c FROM CotacoesItens c WHERE c.ctitObservacoes = :ctitObservacoes"),
    @NamedQuery(name = "CotacoesItens.findByCtitStatus", query = "SELECT c FROM CotacoesItens c WHERE c.ctitStatus = :ctitStatus"),
    @NamedQuery(name = "CotacoesItens.findByCtitLastupdate", query = "SELECT c FROM CotacoesItens c WHERE c.ctitLastupdate = :ctitLastupdate"),
    @NamedQuery(name = "CotacoesItens.findByCtitPrecoVenda", query = "SELECT c FROM CotacoesItens c WHERE c.ctitPrecoVenda = :ctitPrecoVenda")})
public class CotacoesItens implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CTIT_ID")
    private String ctitId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "CTIT_QTDE")
    private BigDecimal ctitQtde;
    @Basic(optional = false)
    @Column(name = "CTIT_QTDE_SOLICITADA")
    private BigDecimal ctitQtdeSolicitada;
    @Basic(optional = false)
    @Column(name = "CTIT_UNID_SIGLA")
    private String ctitUnidSigla;
    @Basic(optional = false)
    @Column(name = "CTIT_SBUP_MULTIPLICADOR")
    private BigDecimal ctitSbupMultiplicador;
    @Column(name = "CTIT_OBSERVACOES")
    private String ctitObservacoes;
    @Basic(optional = false)
    @Column(name = "CTIT_STATUS")
    private String ctitStatus;
    @Column(name = "CTIT_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ctitLastupdate;
    @Basic(optional = false)
    @Column(name = "CTIT_PRECO_VENDA")
    private BigDecimal ctitPrecoVenda;
    @OneToMany(mappedBy = "ctitId")
    private List<SolicitacoesCompras> solicitacoesComprasList;
    @OneToMany(mappedBy = "ctitId")
    private List<ItensPedidos> itensPedidosList;
    @OneToMany(mappedBy = "ctitId")
    private List<CotacoesPrecos> cotacoesPrecosList;
    @JoinColumn(name = "COTC_ID", referencedColumnName = "COTC_ID")
    @ManyToOne
    private Cotacoes cotcId;
    @JoinColumn(name = "PROD_ID", referencedColumnName = "PROD_ID")
    @ManyToOne
    private Produtos prodId;
    @JoinColumn(name = "TEST_ID", referencedColumnName = "TEST_ID")
    @ManyToOne
    private TiposEstoques testId;

    public CotacoesItens() {
    }

    public CotacoesItens(String ctitId) {
        this.ctitId = ctitId;
    }

    public CotacoesItens(String ctitId, BigDecimal ctitQtde, BigDecimal ctitQtdeSolicitada, String ctitUnidSigla, BigDecimal ctitSbupMultiplicador, String ctitStatus, BigDecimal ctitPrecoVenda) {
        this.ctitId = ctitId;
        this.ctitQtde = ctitQtde;
        this.ctitQtdeSolicitada = ctitQtdeSolicitada;
        this.ctitUnidSigla = ctitUnidSigla;
        this.ctitSbupMultiplicador = ctitSbupMultiplicador;
        this.ctitStatus = ctitStatus;
        this.ctitPrecoVenda = ctitPrecoVenda;
    }

    public String getCtitId() {
        return ctitId;
    }

    public void setCtitId(String ctitId) {
        this.ctitId = ctitId;
    }

    public BigDecimal getCtitQtde() {
        return ctitQtde;
    }

    public void setCtitQtde(BigDecimal ctitQtde) {
        this.ctitQtde = ctitQtde;
    }

    public BigDecimal getCtitQtdeSolicitada() {
        return ctitQtdeSolicitada;
    }

    public void setCtitQtdeSolicitada(BigDecimal ctitQtdeSolicitada) {
        this.ctitQtdeSolicitada = ctitQtdeSolicitada;
    }

    public String getCtitUnidSigla() {
        return ctitUnidSigla;
    }

    public void setCtitUnidSigla(String ctitUnidSigla) {
        this.ctitUnidSigla = ctitUnidSigla;
    }

    public BigDecimal getCtitSbupMultiplicador() {
        return ctitSbupMultiplicador;
    }

    public void setCtitSbupMultiplicador(BigDecimal ctitSbupMultiplicador) {
        this.ctitSbupMultiplicador = ctitSbupMultiplicador;
    }

    public String getCtitObservacoes() {
        return ctitObservacoes;
    }

    public void setCtitObservacoes(String ctitObservacoes) {
        this.ctitObservacoes = ctitObservacoes;
    }

    public String getCtitStatus() {
        return ctitStatus;
    }

    public void setCtitStatus(String ctitStatus) {
        this.ctitStatus = ctitStatus;
    }

    public Date getCtitLastupdate() {
        return ctitLastupdate;
    }

    public void setCtitLastupdate(Date ctitLastupdate) {
        this.ctitLastupdate = ctitLastupdate;
    }

    public BigDecimal getCtitPrecoVenda() {
        return ctitPrecoVenda;
    }

    public void setCtitPrecoVenda(BigDecimal ctitPrecoVenda) {
        this.ctitPrecoVenda = ctitPrecoVenda;
    }

    @XmlTransient
    public List<SolicitacoesCompras> getSolicitacoesComprasList() {
        return solicitacoesComprasList;
    }

    public void setSolicitacoesComprasList(List<SolicitacoesCompras> solicitacoesComprasList) {
        this.solicitacoesComprasList = solicitacoesComprasList;
    }

    @XmlTransient
    public List<ItensPedidos> getItensPedidosList() {
        return itensPedidosList;
    }

    public void setItensPedidosList(List<ItensPedidos> itensPedidosList) {
        this.itensPedidosList = itensPedidosList;
    }

    @XmlTransient
    public List<CotacoesPrecos> getCotacoesPrecosList() {
        return cotacoesPrecosList;
    }

    public void setCotacoesPrecosList(List<CotacoesPrecos> cotacoesPrecosList) {
        this.cotacoesPrecosList = cotacoesPrecosList;
    }

    public Cotacoes getCotcId() {
        return cotcId;
    }

    public void setCotcId(Cotacoes cotcId) {
        this.cotcId = cotcId;
    }

    public Produtos getProdId() {
        return prodId;
    }

    public void setProdId(Produtos prodId) {
        this.prodId = prodId;
    }

    public TiposEstoques getTestId() {
        return testId;
    }

    public void setTestId(TiposEstoques testId) {
        this.testId = testId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ctitId != null ? ctitId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CotacoesItens)) {
            return false;
        }
        CotacoesItens other = (CotacoesItens) object;
        if ((this.ctitId == null && other.ctitId != null) || (this.ctitId != null && !this.ctitId.equals(other.ctitId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.CotacoesItens[ ctitId=" + ctitId + " ]";
    }
    
}
