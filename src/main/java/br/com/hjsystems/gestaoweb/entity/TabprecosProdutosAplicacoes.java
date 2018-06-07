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
@Table(name = "TABPRECOS_PRODUTOS_APLICACOES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TabprecosProdutosAplicacoes.findAll", query = "SELECT t FROM TabprecosProdutosAplicacoes t"),
    @NamedQuery(name = "TabprecosProdutosAplicacoes.findByTppaId", query = "SELECT t FROM TabprecosProdutosAplicacoes t WHERE t.tppaId = :tppaId"),
    @NamedQuery(name = "TabprecosProdutosAplicacoes.findByTppaPrecoAvista", query = "SELECT t FROM TabprecosProdutosAplicacoes t WHERE t.tppaPrecoAvista = :tppaPrecoAvista"),
    @NamedQuery(name = "TabprecosProdutosAplicacoes.findByTppaPrecoAprazo", query = "SELECT t FROM TabprecosProdutosAplicacoes t WHERE t.tppaPrecoAprazo = :tppaPrecoAprazo"),
    @NamedQuery(name = "TabprecosProdutosAplicacoes.findByTppaLastupdate", query = "SELECT t FROM TabprecosProdutosAplicacoes t WHERE t.tppaLastupdate = :tppaLastupdate")})
public class TabprecosProdutosAplicacoes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TPPA_ID")
    private String tppaId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "TPPA_PRECO_AVISTA")
    private BigDecimal tppaPrecoAvista;
    @Basic(optional = false)
    @Column(name = "TPPA_PRECO_APRAZO")
    private BigDecimal tppaPrecoAprazo;
    @Basic(optional = false)
    @Column(name = "TPPA_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tppaLastupdate;
    @JoinColumn(name = "PCPR_ID", referencedColumnName = "PCPR_ID")
    @ManyToOne
    private PrecosProdutos pcprId;
    @JoinColumn(name = "PRAP_ID", referencedColumnName = "PRAP_ID")
    @ManyToOne
    private ProdutosAplicacoes prapId;

    public TabprecosProdutosAplicacoes() {
    }

    public TabprecosProdutosAplicacoes(String tppaId) {
        this.tppaId = tppaId;
    }

    public TabprecosProdutosAplicacoes(String tppaId, BigDecimal tppaPrecoAvista, BigDecimal tppaPrecoAprazo, Date tppaLastupdate) {
        this.tppaId = tppaId;
        this.tppaPrecoAvista = tppaPrecoAvista;
        this.tppaPrecoAprazo = tppaPrecoAprazo;
        this.tppaLastupdate = tppaLastupdate;
    }

    public String getTppaId() {
        return tppaId;
    }

    public void setTppaId(String tppaId) {
        this.tppaId = tppaId;
    }

    public BigDecimal getTppaPrecoAvista() {
        return tppaPrecoAvista;
    }

    public void setTppaPrecoAvista(BigDecimal tppaPrecoAvista) {
        this.tppaPrecoAvista = tppaPrecoAvista;
    }

    public BigDecimal getTppaPrecoAprazo() {
        return tppaPrecoAprazo;
    }

    public void setTppaPrecoAprazo(BigDecimal tppaPrecoAprazo) {
        this.tppaPrecoAprazo = tppaPrecoAprazo;
    }

    public Date getTppaLastupdate() {
        return tppaLastupdate;
    }

    public void setTppaLastupdate(Date tppaLastupdate) {
        this.tppaLastupdate = tppaLastupdate;
    }

    public PrecosProdutos getPcprId() {
        return pcprId;
    }

    public void setPcprId(PrecosProdutos pcprId) {
        this.pcprId = pcprId;
    }

    public ProdutosAplicacoes getPrapId() {
        return prapId;
    }

    public void setPrapId(ProdutosAplicacoes prapId) {
        this.prapId = prapId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tppaId != null ? tppaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TabprecosProdutosAplicacoes)) {
            return false;
        }
        TabprecosProdutosAplicacoes other = (TabprecosProdutosAplicacoes) object;
        if ((this.tppaId == null && other.tppaId != null) || (this.tppaId != null && !this.tppaId.equals(other.tppaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.TabprecosProdutosAplicacoes[ tppaId=" + tppaId + " ]";
    }
    
}
