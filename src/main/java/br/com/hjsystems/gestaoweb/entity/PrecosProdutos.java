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
@Table(name = "PRECOS_PRODUTOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PrecosProdutos.findAll", query = "SELECT p FROM PrecosProdutos p"),
    @NamedQuery(name = "PrecosProdutos.findByPcprId", query = "SELECT p FROM PrecosProdutos p WHERE p.pcprId = :pcprId"),
    @NamedQuery(name = "PrecosProdutos.findByPcprPreco", query = "SELECT p FROM PrecosProdutos p WHERE p.pcprPreco = :pcprPreco"),
    @NamedQuery(name = "PrecosProdutos.findByPcprIndiceVariacao", query = "SELECT p FROM PrecosProdutos p WHERE p.pcprIndiceVariacao = :pcprIndiceVariacao"),
    @NamedQuery(name = "PrecosProdutos.findByPcPrLASTUPDATE", query = "SELECT p FROM PrecosProdutos p WHERE p.pcPrLASTUPDATE = :pcPrLASTUPDATE"),
    @NamedQuery(name = "PrecosProdutos.findByPcprPrecoMin", query = "SELECT p FROM PrecosProdutos p WHERE p.pcprPrecoMin = :pcprPrecoMin")})
public class PrecosProdutos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PCPR_ID")
    private String pcprId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "PCPR_PRECO")
    private BigDecimal pcprPreco;
    @Basic(optional = false)
    @Column(name = "PCPR_INDICE_VARIACAO")
    private BigDecimal pcprIndiceVariacao;
    @Column(name = "PcPr_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pcPrLASTUPDATE;
    @Column(name = "PCPR_PRECO_MIN")
    private BigDecimal pcprPrecoMin;
    @OneToMany(mappedBy = "pcprId")
    private List<TabprecosProdutosAplicacoes> tabprecosProdutosAplicacoesList;
    @OneToMany(mappedBy = "pcprId")
    private List<PrecosProdutosSubunidades> precosProdutosSubunidadesList;
    @JoinColumn(name = "PROD_ID", referencedColumnName = "PROD_ID")
    @ManyToOne
    private Produtos prodId;
    @JoinColumn(name = "TBPV_ID", referencedColumnName = "TBPV_ID")
    @ManyToOne
    private TabelasPrecosVigencias tbpvId;
    @JoinColumn(name = "USRS_ID", referencedColumnName = "USRS_ID")
    @ManyToOne
    private Usuarios usrsId;
    @OneToMany(mappedBy = "pcprId")
    private List<PrecosProdutosFven> precosProdutosFvenList;

    public PrecosProdutos() {
    }

    public PrecosProdutos(String pcprId) {
        this.pcprId = pcprId;
    }

    public PrecosProdutos(String pcprId, BigDecimal pcprPreco, BigDecimal pcprIndiceVariacao) {
        this.pcprId = pcprId;
        this.pcprPreco = pcprPreco;
        this.pcprIndiceVariacao = pcprIndiceVariacao;
    }

    public String getPcprId() {
        return pcprId;
    }

    public void setPcprId(String pcprId) {
        this.pcprId = pcprId;
    }

    public BigDecimal getPcprPreco() {
        return pcprPreco;
    }

    public void setPcprPreco(BigDecimal pcprPreco) {
        this.pcprPreco = pcprPreco;
    }

    public BigDecimal getPcprIndiceVariacao() {
        return pcprIndiceVariacao;
    }

    public void setPcprIndiceVariacao(BigDecimal pcprIndiceVariacao) {
        this.pcprIndiceVariacao = pcprIndiceVariacao;
    }

    public Date getPcPrLASTUPDATE() {
        return pcPrLASTUPDATE;
    }

    public void setPcPrLASTUPDATE(Date pcPrLASTUPDATE) {
        this.pcPrLASTUPDATE = pcPrLASTUPDATE;
    }

    public BigDecimal getPcprPrecoMin() {
        return pcprPrecoMin;
    }

    public void setPcprPrecoMin(BigDecimal pcprPrecoMin) {
        this.pcprPrecoMin = pcprPrecoMin;
    }

    @XmlTransient
    public List<TabprecosProdutosAplicacoes> getTabprecosProdutosAplicacoesList() {
        return tabprecosProdutosAplicacoesList;
    }

    public void setTabprecosProdutosAplicacoesList(List<TabprecosProdutosAplicacoes> tabprecosProdutosAplicacoesList) {
        this.tabprecosProdutosAplicacoesList = tabprecosProdutosAplicacoesList;
    }

    @XmlTransient
    public List<PrecosProdutosSubunidades> getPrecosProdutosSubunidadesList() {
        return precosProdutosSubunidadesList;
    }

    public void setPrecosProdutosSubunidadesList(List<PrecosProdutosSubunidades> precosProdutosSubunidadesList) {
        this.precosProdutosSubunidadesList = precosProdutosSubunidadesList;
    }

    public Produtos getProdId() {
        return prodId;
    }

    public void setProdId(Produtos prodId) {
        this.prodId = prodId;
    }

    public TabelasPrecosVigencias getTbpvId() {
        return tbpvId;
    }

    public void setTbpvId(TabelasPrecosVigencias tbpvId) {
        this.tbpvId = tbpvId;
    }

    public Usuarios getUsrsId() {
        return usrsId;
    }

    public void setUsrsId(Usuarios usrsId) {
        this.usrsId = usrsId;
    }

    @XmlTransient
    public List<PrecosProdutosFven> getPrecosProdutosFvenList() {
        return precosProdutosFvenList;
    }

    public void setPrecosProdutosFvenList(List<PrecosProdutosFven> precosProdutosFvenList) {
        this.precosProdutosFvenList = precosProdutosFvenList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pcprId != null ? pcprId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrecosProdutos)) {
            return false;
        }
        PrecosProdutos other = (PrecosProdutos) object;
        if ((this.pcprId == null && other.pcprId != null) || (this.pcprId != null && !this.pcprId.equals(other.pcprId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.PrecosProdutos[ pcprId=" + pcprId + " ]";
    }
    
}
