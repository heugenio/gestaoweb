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
@Table(name = "TABELASPRECOS_FVEN")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TabelasprecosFven.findAll", query = "SELECT t FROM TabelasprecosFven t"),
    @NamedQuery(name = "TabelasprecosFven.findByTpfvId", query = "SELECT t FROM TabelasprecosFven t WHERE t.tpfvId = :tpfvId"),
    @NamedQuery(name = "TabelasprecosFven.findByTpfvIndicePreco", query = "SELECT t FROM TabelasprecosFven t WHERE t.tpfvIndicePreco = :tpfvIndicePreco"),
    @NamedQuery(name = "TabelasprecosFven.findByTpfvIndiceVariacao", query = "SELECT t FROM TabelasprecosFven t WHERE t.tpfvIndiceVariacao = :tpfvIndiceVariacao"),
    @NamedQuery(name = "TabelasprecosFven.findByTpfvLastupdate", query = "SELECT t FROM TabelasprecosFven t WHERE t.tpfvLastupdate = :tpfvLastupdate")})
public class TabelasprecosFven implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TPFV_ID")
    private String tpfvId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "TPFV_INDICE_PRECO")
    private BigDecimal tpfvIndicePreco;
    @Basic(optional = false)
    @Column(name = "TPFV_INDICE_VARIACAO")
    private BigDecimal tpfvIndiceVariacao;
    @Column(name = "TPFV_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tpfvLastupdate;
    @JoinColumn(name = "FVEN_ID", referencedColumnName = "FVEN_ID")
    @ManyToOne
    private FormasVencimento fvenId;
    @JoinColumn(name = "TBPV_ID", referencedColumnName = "TBPV_ID")
    @ManyToOne
    private TabelasPrecosVigencias tbpvId;

    public TabelasprecosFven() {
    }

    public TabelasprecosFven(String tpfvId) {
        this.tpfvId = tpfvId;
    }

    public TabelasprecosFven(String tpfvId, BigDecimal tpfvIndicePreco, BigDecimal tpfvIndiceVariacao) {
        this.tpfvId = tpfvId;
        this.tpfvIndicePreco = tpfvIndicePreco;
        this.tpfvIndiceVariacao = tpfvIndiceVariacao;
    }

    public String getTpfvId() {
        return tpfvId;
    }

    public void setTpfvId(String tpfvId) {
        this.tpfvId = tpfvId;
    }

    public BigDecimal getTpfvIndicePreco() {
        return tpfvIndicePreco;
    }

    public void setTpfvIndicePreco(BigDecimal tpfvIndicePreco) {
        this.tpfvIndicePreco = tpfvIndicePreco;
    }

    public BigDecimal getTpfvIndiceVariacao() {
        return tpfvIndiceVariacao;
    }

    public void setTpfvIndiceVariacao(BigDecimal tpfvIndiceVariacao) {
        this.tpfvIndiceVariacao = tpfvIndiceVariacao;
    }

    public Date getTpfvLastupdate() {
        return tpfvLastupdate;
    }

    public void setTpfvLastupdate(Date tpfvLastupdate) {
        this.tpfvLastupdate = tpfvLastupdate;
    }

    public FormasVencimento getFvenId() {
        return fvenId;
    }

    public void setFvenId(FormasVencimento fvenId) {
        this.fvenId = fvenId;
    }

    public TabelasPrecosVigencias getTbpvId() {
        return tbpvId;
    }

    public void setTbpvId(TabelasPrecosVigencias tbpvId) {
        this.tbpvId = tbpvId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tpfvId != null ? tpfvId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TabelasprecosFven)) {
            return false;
        }
        TabelasprecosFven other = (TabelasprecosFven) object;
        if ((this.tpfvId == null && other.tpfvId != null) || (this.tpfvId != null && !this.tpfvId.equals(other.tpfvId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.TabelasprecosFven[ tpfvId=" + tpfvId + " ]";
    }
    
}
