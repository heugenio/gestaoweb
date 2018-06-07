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
@Table(name = "TABELASPRECOS_UNEM")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TabelasprecosUnem.findAll", query = "SELECT t FROM TabelasprecosUnem t"),
    @NamedQuery(name = "TabelasprecosUnem.findByTpueId", query = "SELECT t FROM TabelasprecosUnem t WHERE t.tpueId = :tpueId"),
    @NamedQuery(name = "TabelasprecosUnem.findByTpueIndicePreco", query = "SELECT t FROM TabelasprecosUnem t WHERE t.tpueIndicePreco = :tpueIndicePreco"),
    @NamedQuery(name = "TabelasprecosUnem.findByTpueIndiceVariacao", query = "SELECT t FROM TabelasprecosUnem t WHERE t.tpueIndiceVariacao = :tpueIndiceVariacao"),
    @NamedQuery(name = "TabelasprecosUnem.findByTpueLastupdate", query = "SELECT t FROM TabelasprecosUnem t WHERE t.tpueLastupdate = :tpueLastupdate")})
public class TabelasprecosUnem implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TPUE_ID")
    private String tpueId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "TPUE_INDICE_PRECO")
    private BigDecimal tpueIndicePreco;
    @Basic(optional = false)
    @Column(name = "TPUE_INDICE_VARIACAO")
    private BigDecimal tpueIndiceVariacao;
    @Column(name = "TPUE_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tpueLastupdate;
    @JoinColumn(name = "TBPV_ID", referencedColumnName = "TBPV_ID")
    @ManyToOne
    private TabelasPrecosVigencias tbpvId;
    @JoinColumn(name = "UNEM_ID", referencedColumnName = "UNEM_ID")
    @ManyToOne
    private UnidadesEmpresariais unemId;

    public TabelasprecosUnem() {
    }

    public TabelasprecosUnem(String tpueId) {
        this.tpueId = tpueId;
    }

    public TabelasprecosUnem(String tpueId, BigDecimal tpueIndicePreco, BigDecimal tpueIndiceVariacao) {
        this.tpueId = tpueId;
        this.tpueIndicePreco = tpueIndicePreco;
        this.tpueIndiceVariacao = tpueIndiceVariacao;
    }

    public String getTpueId() {
        return tpueId;
    }

    public void setTpueId(String tpueId) {
        this.tpueId = tpueId;
    }

    public BigDecimal getTpueIndicePreco() {
        return tpueIndicePreco;
    }

    public void setTpueIndicePreco(BigDecimal tpueIndicePreco) {
        this.tpueIndicePreco = tpueIndicePreco;
    }

    public BigDecimal getTpueIndiceVariacao() {
        return tpueIndiceVariacao;
    }

    public void setTpueIndiceVariacao(BigDecimal tpueIndiceVariacao) {
        this.tpueIndiceVariacao = tpueIndiceVariacao;
    }

    public Date getTpueLastupdate() {
        return tpueLastupdate;
    }

    public void setTpueLastupdate(Date tpueLastupdate) {
        this.tpueLastupdate = tpueLastupdate;
    }

    public TabelasPrecosVigencias getTbpvId() {
        return tbpvId;
    }

    public void setTbpvId(TabelasPrecosVigencias tbpvId) {
        this.tbpvId = tbpvId;
    }

    public UnidadesEmpresariais getUnemId() {
        return unemId;
    }

    public void setUnemId(UnidadesEmpresariais unemId) {
        this.unemId = unemId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tpueId != null ? tpueId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TabelasprecosUnem)) {
            return false;
        }
        TabelasprecosUnem other = (TabelasprecosUnem) object;
        if ((this.tpueId == null && other.tpueId != null) || (this.tpueId != null && !this.tpueId.equals(other.tpueId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.TabelasprecosUnem[ tpueId=" + tpueId + " ]";
    }
    
}
