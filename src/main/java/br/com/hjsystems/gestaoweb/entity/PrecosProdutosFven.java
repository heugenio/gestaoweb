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
@Table(name = "PRECOS_PRODUTOS_FVEN")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PrecosProdutosFven.findAll", query = "SELECT p FROM PrecosProdutosFven p"),
    @NamedQuery(name = "PrecosProdutosFven.findByPpfvId", query = "SELECT p FROM PrecosProdutosFven p WHERE p.ppfvId = :ppfvId"),
    @NamedQuery(name = "PrecosProdutosFven.findByPpfvIndicePreco", query = "SELECT p FROM PrecosProdutosFven p WHERE p.ppfvIndicePreco = :ppfvIndicePreco"),
    @NamedQuery(name = "PrecosProdutosFven.findByPpfvIndiceVariacao", query = "SELECT p FROM PrecosProdutosFven p WHERE p.ppfvIndiceVariacao = :ppfvIndiceVariacao"),
    @NamedQuery(name = "PrecosProdutosFven.findByPpfvLastupdate", query = "SELECT p FROM PrecosProdutosFven p WHERE p.ppfvLastupdate = :ppfvLastupdate")})
public class PrecosProdutosFven implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PPFV_ID")
    private String ppfvId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "PPFV_INDICE_PRECO")
    private BigDecimal ppfvIndicePreco;
    @Basic(optional = false)
    @Column(name = "PPFV_INDICE_VARIACAO")
    private BigDecimal ppfvIndiceVariacao;
    @Column(name = "PPFV_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ppfvLastupdate;
    @JoinColumn(name = "FVEN_ID", referencedColumnName = "FVEN_ID")
    @ManyToOne
    private FormasVencimento fvenId;
    @JoinColumn(name = "PCPR_ID", referencedColumnName = "PCPR_ID")
    @ManyToOne
    private PrecosProdutos pcprId;

    public PrecosProdutosFven() {
    }

    public PrecosProdutosFven(String ppfvId) {
        this.ppfvId = ppfvId;
    }

    public PrecosProdutosFven(String ppfvId, BigDecimal ppfvIndicePreco, BigDecimal ppfvIndiceVariacao) {
        this.ppfvId = ppfvId;
        this.ppfvIndicePreco = ppfvIndicePreco;
        this.ppfvIndiceVariacao = ppfvIndiceVariacao;
    }

    public String getPpfvId() {
        return ppfvId;
    }

    public void setPpfvId(String ppfvId) {
        this.ppfvId = ppfvId;
    }

    public BigDecimal getPpfvIndicePreco() {
        return ppfvIndicePreco;
    }

    public void setPpfvIndicePreco(BigDecimal ppfvIndicePreco) {
        this.ppfvIndicePreco = ppfvIndicePreco;
    }

    public BigDecimal getPpfvIndiceVariacao() {
        return ppfvIndiceVariacao;
    }

    public void setPpfvIndiceVariacao(BigDecimal ppfvIndiceVariacao) {
        this.ppfvIndiceVariacao = ppfvIndiceVariacao;
    }

    public Date getPpfvLastupdate() {
        return ppfvLastupdate;
    }

    public void setPpfvLastupdate(Date ppfvLastupdate) {
        this.ppfvLastupdate = ppfvLastupdate;
    }

    public FormasVencimento getFvenId() {
        return fvenId;
    }

    public void setFvenId(FormasVencimento fvenId) {
        this.fvenId = fvenId;
    }

    public PrecosProdutos getPcprId() {
        return pcprId;
    }

    public void setPcprId(PrecosProdutos pcprId) {
        this.pcprId = pcprId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ppfvId != null ? ppfvId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrecosProdutosFven)) {
            return false;
        }
        PrecosProdutosFven other = (PrecosProdutosFven) object;
        if ((this.ppfvId == null && other.ppfvId != null) || (this.ppfvId != null && !this.ppfvId.equals(other.ppfvId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.PrecosProdutosFven[ ppfvId=" + ppfvId + " ]";
    }
    
}
