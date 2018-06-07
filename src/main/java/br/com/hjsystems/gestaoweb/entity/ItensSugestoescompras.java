/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hjsystems.gestaoweb.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name = "ITENS_SUGESTOESCOMPRAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ItensSugestoescompras.findAll", query = "SELECT i FROM ItensSugestoescompras i"),
    @NamedQuery(name = "ItensSugestoescompras.findByItscId", query = "SELECT i FROM ItensSugestoescompras i WHERE i.itscId = :itscId"),
    @NamedQuery(name = "ItensSugestoescompras.findByItscQuantidade", query = "SELECT i FROM ItensSugestoescompras i WHERE i.itscQuantidade = :itscQuantidade"),
    @NamedQuery(name = "ItensSugestoescompras.findByItscQtdSugestao", query = "SELECT i FROM ItensSugestoescompras i WHERE i.itscQtdSugestao = :itscQtdSugestao"),
    @NamedQuery(name = "ItensSugestoescompras.findByItscQtdReservados", query = "SELECT i FROM ItensSugestoescompras i WHERE i.itscQtdReservados = :itscQtdReservados"),
    @NamedQuery(name = "ItensSugestoescompras.findByItscQtdPrereservados", query = "SELECT i FROM ItensSugestoescompras i WHERE i.itscQtdPrereservados = :itscQtdPrereservados"),
    @NamedQuery(name = "ItensSugestoescompras.findByItscPreco", query = "SELECT i FROM ItensSugestoescompras i WHERE i.itscPreco = :itscPreco"),
    @NamedQuery(name = "ItensSugestoescompras.findByItscSaldo", query = "SELECT i FROM ItensSugestoescompras i WHERE i.itscSaldo = :itscSaldo"),
    @NamedQuery(name = "ItensSugestoescompras.findByItscUltPreco", query = "SELECT i FROM ItensSugestoescompras i WHERE i.itscUltPreco = :itscUltPreco"),
    @NamedQuery(name = "ItensSugestoescompras.findByItscUltQtd", query = "SELECT i FROM ItensSugestoescompras i WHERE i.itscUltQtd = :itscUltQtd"),
    @NamedQuery(name = "ItensSugestoescompras.findByItscLastupdate", query = "SELECT i FROM ItensSugestoescompras i WHERE i.itscLastupdate = :itscLastupdate")})
public class ItensSugestoescompras implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ITSC_ID")
    private String itscId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "ITSC_QUANTIDADE")
    private BigDecimal itscQuantidade;
    @Basic(optional = false)
    @Column(name = "ITSC_QTD_SUGESTAO")
    private BigDecimal itscQtdSugestao;
    @Basic(optional = false)
    @Column(name = "ITSC_QTD_RESERVADOS")
    private BigDecimal itscQtdReservados;
    @Basic(optional = false)
    @Column(name = "ITSC_QTD_PRERESERVADOS")
    private BigDecimal itscQtdPrereservados;
    @Basic(optional = false)
    @Column(name = "ITSC_PRECO")
    private BigDecimal itscPreco;
    @Basic(optional = false)
    @Column(name = "ITSC_SALDO")
    private BigDecimal itscSaldo;
    @Basic(optional = false)
    @Column(name = "ITSC_ULT_PRECO")
    private BigDecimal itscUltPreco;
    @Basic(optional = false)
    @Column(name = "ITSC_ULT_QTD")
    private BigDecimal itscUltQtd;
    @Column(name = "ITSC_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date itscLastupdate;
    @JoinColumn(name = "FRND_ID", referencedColumnName = "FRND_ID")
    @ManyToOne
    private Fornecedores frndId;
    @JoinColumn(name = "PROD_ID", referencedColumnName = "PROD_ID")
    @ManyToOne
    private Produtos prodId;
    @JoinColumn(name = "SGCP_ID", referencedColumnName = "SGCP_ID")
    @ManyToOne
    private SugestoesCompras sgcpId;
    @JoinColumn(name = "UNID_ID", referencedColumnName = "UNID_ID")
    @ManyToOne
    private Unidades unidId;
    @JoinColumn(name = "UNI_UNID_ID", referencedColumnName = "UNID_ID")
    @ManyToOne
    private Unidades uniUnidId;

    public ItensSugestoescompras() {
    }

    public ItensSugestoescompras(String itscId) {
        this.itscId = itscId;
    }

    public ItensSugestoescompras(String itscId, BigDecimal itscQuantidade, BigDecimal itscQtdSugestao, BigDecimal itscQtdReservados, BigDecimal itscQtdPrereservados, BigDecimal itscPreco, BigDecimal itscSaldo, BigDecimal itscUltPreco, BigDecimal itscUltQtd) {
        this.itscId = itscId;
        this.itscQuantidade = itscQuantidade;
        this.itscQtdSugestao = itscQtdSugestao;
        this.itscQtdReservados = itscQtdReservados;
        this.itscQtdPrereservados = itscQtdPrereservados;
        this.itscPreco = itscPreco;
        this.itscSaldo = itscSaldo;
        this.itscUltPreco = itscUltPreco;
        this.itscUltQtd = itscUltQtd;
    }

    public String getItscId() {
        return itscId;
    }

    public void setItscId(String itscId) {
        this.itscId = itscId;
    }

    public BigDecimal getItscQuantidade() {
        return itscQuantidade;
    }

    public void setItscQuantidade(BigDecimal itscQuantidade) {
        this.itscQuantidade = itscQuantidade;
    }

    public BigDecimal getItscQtdSugestao() {
        return itscQtdSugestao;
    }

    public void setItscQtdSugestao(BigDecimal itscQtdSugestao) {
        this.itscQtdSugestao = itscQtdSugestao;
    }

    public BigDecimal getItscQtdReservados() {
        return itscQtdReservados;
    }

    public void setItscQtdReservados(BigDecimal itscQtdReservados) {
        this.itscQtdReservados = itscQtdReservados;
    }

    public BigDecimal getItscQtdPrereservados() {
        return itscQtdPrereservados;
    }

    public void setItscQtdPrereservados(BigDecimal itscQtdPrereservados) {
        this.itscQtdPrereservados = itscQtdPrereservados;
    }

    public BigDecimal getItscPreco() {
        return itscPreco;
    }

    public void setItscPreco(BigDecimal itscPreco) {
        this.itscPreco = itscPreco;
    }

    public BigDecimal getItscSaldo() {
        return itscSaldo;
    }

    public void setItscSaldo(BigDecimal itscSaldo) {
        this.itscSaldo = itscSaldo;
    }

    public BigDecimal getItscUltPreco() {
        return itscUltPreco;
    }

    public void setItscUltPreco(BigDecimal itscUltPreco) {
        this.itscUltPreco = itscUltPreco;
    }

    public BigDecimal getItscUltQtd() {
        return itscUltQtd;
    }

    public void setItscUltQtd(BigDecimal itscUltQtd) {
        this.itscUltQtd = itscUltQtd;
    }

    public Date getItscLastupdate() {
        return itscLastupdate;
    }

    public void setItscLastupdate(Date itscLastupdate) {
        this.itscLastupdate = itscLastupdate;
    }

    public Fornecedores getFrndId() {
        return frndId;
    }

    public void setFrndId(Fornecedores frndId) {
        this.frndId = frndId;
    }

    public Produtos getProdId() {
        return prodId;
    }

    public void setProdId(Produtos prodId) {
        this.prodId = prodId;
    }

    public SugestoesCompras getSgcpId() {
        return sgcpId;
    }

    public void setSgcpId(SugestoesCompras sgcpId) {
        this.sgcpId = sgcpId;
    }

    public Unidades getUnidId() {
        return unidId;
    }

    public void setUnidId(Unidades unidId) {
        this.unidId = unidId;
    }

    public Unidades getUniUnidId() {
        return uniUnidId;
    }

    public void setUniUnidId(Unidades uniUnidId) {
        this.uniUnidId = uniUnidId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itscId != null ? itscId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItensSugestoescompras)) {
            return false;
        }
        ItensSugestoescompras other = (ItensSugestoescompras) object;
        if ((this.itscId == null && other.itscId != null) || (this.itscId != null && !this.itscId.equals(other.itscId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.ItensSugestoescompras[ itscId=" + itscId + " ]";
    }
    
}
