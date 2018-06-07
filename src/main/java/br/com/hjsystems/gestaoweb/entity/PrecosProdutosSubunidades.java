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
@Table(name = "PRECOS_PRODUTOS_SUBUNIDADES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PrecosProdutosSubunidades.findAll", query = "SELECT p FROM PrecosProdutosSubunidades p"),
    @NamedQuery(name = "PrecosProdutosSubunidades.findByPpsuId", query = "SELECT p FROM PrecosProdutosSubunidades p WHERE p.ppsuId = :ppsuId"),
    @NamedQuery(name = "PrecosProdutosSubunidades.findByPpsuTipo", query = "SELECT p FROM PrecosProdutosSubunidades p WHERE p.ppsuTipo = :ppsuTipo"),
    @NamedQuery(name = "PrecosProdutosSubunidades.findByPpsuIndicePreco", query = "SELECT p FROM PrecosProdutosSubunidades p WHERE p.ppsuIndicePreco = :ppsuIndicePreco"),
    @NamedQuery(name = "PrecosProdutosSubunidades.findByPpsuIndiceVariacao", query = "SELECT p FROM PrecosProdutosSubunidades p WHERE p.ppsuIndiceVariacao = :ppsuIndiceVariacao"),
    @NamedQuery(name = "PrecosProdutosSubunidades.findByPpsuLastupdate", query = "SELECT p FROM PrecosProdutosSubunidades p WHERE p.ppsuLastupdate = :ppsuLastupdate")})
public class PrecosProdutosSubunidades implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PPSU_ID")
    private String ppsuId;
    @Column(name = "PPSU_TIPO")
    private String ppsuTipo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "PPSU_INDICE_PRECO")
    private BigDecimal ppsuIndicePreco;
    @Basic(optional = false)
    @Column(name = "PPSU_INDICE_VARIACAO")
    private BigDecimal ppsuIndiceVariacao;
    @Column(name = "PPSU_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ppsuLastupdate;
    @JoinColumn(name = "PCPR_ID", referencedColumnName = "PCPR_ID")
    @ManyToOne
    private PrecosProdutos pcprId;
    @JoinColumn(name = "SBUP_ID", referencedColumnName = "SBUP_ID")
    @ManyToOne
    private SubUnidadesProduto sbupId;

    public PrecosProdutosSubunidades() {
    }

    public PrecosProdutosSubunidades(String ppsuId) {
        this.ppsuId = ppsuId;
    }

    public PrecosProdutosSubunidades(String ppsuId, BigDecimal ppsuIndicePreco, BigDecimal ppsuIndiceVariacao) {
        this.ppsuId = ppsuId;
        this.ppsuIndicePreco = ppsuIndicePreco;
        this.ppsuIndiceVariacao = ppsuIndiceVariacao;
    }

    public String getPpsuId() {
        return ppsuId;
    }

    public void setPpsuId(String ppsuId) {
        this.ppsuId = ppsuId;
    }

    public String getPpsuTipo() {
        return ppsuTipo;
    }

    public void setPpsuTipo(String ppsuTipo) {
        this.ppsuTipo = ppsuTipo;
    }

    public BigDecimal getPpsuIndicePreco() {
        return ppsuIndicePreco;
    }

    public void setPpsuIndicePreco(BigDecimal ppsuIndicePreco) {
        this.ppsuIndicePreco = ppsuIndicePreco;
    }

    public BigDecimal getPpsuIndiceVariacao() {
        return ppsuIndiceVariacao;
    }

    public void setPpsuIndiceVariacao(BigDecimal ppsuIndiceVariacao) {
        this.ppsuIndiceVariacao = ppsuIndiceVariacao;
    }

    public Date getPpsuLastupdate() {
        return ppsuLastupdate;
    }

    public void setPpsuLastupdate(Date ppsuLastupdate) {
        this.ppsuLastupdate = ppsuLastupdate;
    }

    public PrecosProdutos getPcprId() {
        return pcprId;
    }

    public void setPcprId(PrecosProdutos pcprId) {
        this.pcprId = pcprId;
    }

    public SubUnidadesProduto getSbupId() {
        return sbupId;
    }

    public void setSbupId(SubUnidadesProduto sbupId) {
        this.sbupId = sbupId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ppsuId != null ? ppsuId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrecosProdutosSubunidades)) {
            return false;
        }
        PrecosProdutosSubunidades other = (PrecosProdutosSubunidades) object;
        if ((this.ppsuId == null && other.ppsuId != null) || (this.ppsuId != null && !this.ppsuId.equals(other.ppsuId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.PrecosProdutosSubunidades[ ppsuId=" + ppsuId + " ]";
    }
    
}
