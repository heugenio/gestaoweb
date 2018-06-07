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
@Table(name = "SUB_UNIDADES_PRODUTO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SubUnidadesProduto.findAll", query = "SELECT s FROM SubUnidadesProduto s"),
    @NamedQuery(name = "SubUnidadesProduto.findBySbupId", query = "SELECT s FROM SubUnidadesProduto s WHERE s.sbupId = :sbupId"),
    @NamedQuery(name = "SubUnidadesProduto.findBySbupMultiplicador", query = "SELECT s FROM SubUnidadesProduto s WHERE s.sbupMultiplicador = :sbupMultiplicador"),
    @NamedQuery(name = "SubUnidadesProduto.findBySbupCodigoBarras", query = "SELECT s FROM SubUnidadesProduto s WHERE s.sbupCodigoBarras = :sbupCodigoBarras"),
    @NamedQuery(name = "SubUnidadesProduto.findBySbupTipo", query = "SELECT s FROM SubUnidadesProduto s WHERE s.sbupTipo = :sbupTipo"),
    @NamedQuery(name = "SubUnidadesProduto.findBySbUPLASTUPDATE", query = "SELECT s FROM SubUnidadesProduto s WHERE s.sbUPLASTUPDATE = :sbUPLASTUPDATE"),
    @NamedQuery(name = "SubUnidadesProduto.findBySbupMultEmbVenda", query = "SELECT s FROM SubUnidadesProduto s WHERE s.sbupMultEmbVenda = :sbupMultEmbVenda"),
    @NamedQuery(name = "SubUnidadesProduto.findBySbupCxEmbVenda", query = "SELECT s FROM SubUnidadesProduto s WHERE s.sbupCxEmbVenda = :sbupCxEmbVenda")})
public class SubUnidadesProduto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SBUP_ID")
    private String sbupId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "SBUP_MULTIPLICADOR")
    private BigDecimal sbupMultiplicador;
    @Column(name = "SBUP_CODIGO_BARRAS")
    private String sbupCodigoBarras;
    @Basic(optional = false)
    @Column(name = "SBUP_TIPO")
    private String sbupTipo;
    @Column(name = "SbUP_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sbUPLASTUPDATE;
    @Column(name = "SBUP_MULT_EMB_VENDA")
    private BigDecimal sbupMultEmbVenda;
    @Basic(optional = false)
    @Column(name = "SBUP_CX_EMB_VENDA")
    private BigDecimal sbupCxEmbVenda;
    @OneToMany(mappedBy = "sbupId")
    private List<SubunidprodForneced> subunidprodFornecedList;
    @JoinColumn(name = "PROD_ID", referencedColumnName = "PROD_ID")
    @ManyToOne
    private Produtos prodId;
    @JoinColumn(name = "UNID_ID", referencedColumnName = "UNID_ID")
    @ManyToOne
    private Unidades unidId;
    @OneToMany(mappedBy = "sbupId")
    private List<PrecosProdutosSubunidades> precosProdutosSubunidadesList;

    public SubUnidadesProduto() {
    }

    public SubUnidadesProduto(String sbupId) {
        this.sbupId = sbupId;
    }

    public SubUnidadesProduto(String sbupId, BigDecimal sbupMultiplicador, String sbupTipo, BigDecimal sbupCxEmbVenda) {
        this.sbupId = sbupId;
        this.sbupMultiplicador = sbupMultiplicador;
        this.sbupTipo = sbupTipo;
        this.sbupCxEmbVenda = sbupCxEmbVenda;
    }

    public String getSbupId() {
        return sbupId;
    }

    public void setSbupId(String sbupId) {
        this.sbupId = sbupId;
    }

    public BigDecimal getSbupMultiplicador() {
        return sbupMultiplicador;
    }

    public void setSbupMultiplicador(BigDecimal sbupMultiplicador) {
        this.sbupMultiplicador = sbupMultiplicador;
    }

    public String getSbupCodigoBarras() {
        return sbupCodigoBarras;
    }

    public void setSbupCodigoBarras(String sbupCodigoBarras) {
        this.sbupCodigoBarras = sbupCodigoBarras;
    }

    public String getSbupTipo() {
        return sbupTipo;
    }

    public void setSbupTipo(String sbupTipo) {
        this.sbupTipo = sbupTipo;
    }

    public Date getSbUPLASTUPDATE() {
        return sbUPLASTUPDATE;
    }

    public void setSbUPLASTUPDATE(Date sbUPLASTUPDATE) {
        this.sbUPLASTUPDATE = sbUPLASTUPDATE;
    }

    public BigDecimal getSbupMultEmbVenda() {
        return sbupMultEmbVenda;
    }

    public void setSbupMultEmbVenda(BigDecimal sbupMultEmbVenda) {
        this.sbupMultEmbVenda = sbupMultEmbVenda;
    }

    public BigDecimal getSbupCxEmbVenda() {
        return sbupCxEmbVenda;
    }

    public void setSbupCxEmbVenda(BigDecimal sbupCxEmbVenda) {
        this.sbupCxEmbVenda = sbupCxEmbVenda;
    }

    @XmlTransient
    public List<SubunidprodForneced> getSubunidprodFornecedList() {
        return subunidprodFornecedList;
    }

    public void setSubunidprodFornecedList(List<SubunidprodForneced> subunidprodFornecedList) {
        this.subunidprodFornecedList = subunidprodFornecedList;
    }

    public Produtos getProdId() {
        return prodId;
    }

    public void setProdId(Produtos prodId) {
        this.prodId = prodId;
    }

    public Unidades getUnidId() {
        return unidId;
    }

    public void setUnidId(Unidades unidId) {
        this.unidId = unidId;
    }

    @XmlTransient
    public List<PrecosProdutosSubunidades> getPrecosProdutosSubunidadesList() {
        return precosProdutosSubunidadesList;
    }

    public void setPrecosProdutosSubunidadesList(List<PrecosProdutosSubunidades> precosProdutosSubunidadesList) {
        this.precosProdutosSubunidadesList = precosProdutosSubunidadesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sbupId != null ? sbupId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubUnidadesProduto)) {
            return false;
        }
        SubUnidadesProduto other = (SubUnidadesProduto) object;
        if ((this.sbupId == null && other.sbupId != null) || (this.sbupId != null && !this.sbupId.equals(other.sbupId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.SubUnidadesProduto[ sbupId=" + sbupId + " ]";
    }
    
}
