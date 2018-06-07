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
@Table(name = "TITULOS_CENTRO_CUSTOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TitulosCentroCustos.findAll", query = "SELECT t FROM TitulosCentroCustos t"),
    @NamedQuery(name = "TitulosCentroCustos.findByTiccId", query = "SELECT t FROM TitulosCentroCustos t WHERE t.ticcId = :ticcId"),
    @NamedQuery(name = "TitulosCentroCustos.findByTiccValor", query = "SELECT t FROM TitulosCentroCustos t WHERE t.ticcValor = :ticcValor"),
    @NamedQuery(name = "TitulosCentroCustos.findByTiccPerc", query = "SELECT t FROM TitulosCentroCustos t WHERE t.ticcPerc = :ticcPerc"),
    @NamedQuery(name = "TitulosCentroCustos.findByTiccLastupdate", query = "SELECT t FROM TitulosCentroCustos t WHERE t.ticcLastupdate = :ticcLastupdate")})
public class TitulosCentroCustos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TICC_ID")
    private String ticcId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "TICC_VALOR")
    private BigDecimal ticcValor;
    @Basic(optional = false)
    @Column(name = "TICC_PERC")
    private BigDecimal ticcPerc;
    @Column(name = "TICC_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ticcLastupdate;
    @JoinColumn(name = "PLCT_ID", referencedColumnName = "PLCT_ID")
    @ManyToOne
    private PlanoContas plctId;
    @JoinColumn(name = "TITU_ID", referencedColumnName = "TITU_ID")
    @ManyToOne
    private Titulos tituId;

    public TitulosCentroCustos() {
    }

    public TitulosCentroCustos(String ticcId) {
        this.ticcId = ticcId;
    }

    public TitulosCentroCustos(String ticcId, BigDecimal ticcValor, BigDecimal ticcPerc) {
        this.ticcId = ticcId;
        this.ticcValor = ticcValor;
        this.ticcPerc = ticcPerc;
    }

    public String getTiccId() {
        return ticcId;
    }

    public void setTiccId(String ticcId) {
        this.ticcId = ticcId;
    }

    public BigDecimal getTiccValor() {
        return ticcValor;
    }

    public void setTiccValor(BigDecimal ticcValor) {
        this.ticcValor = ticcValor;
    }

    public BigDecimal getTiccPerc() {
        return ticcPerc;
    }

    public void setTiccPerc(BigDecimal ticcPerc) {
        this.ticcPerc = ticcPerc;
    }

    public Date getTiccLastupdate() {
        return ticcLastupdate;
    }

    public void setTiccLastupdate(Date ticcLastupdate) {
        this.ticcLastupdate = ticcLastupdate;
    }

    public PlanoContas getPlctId() {
        return plctId;
    }

    public void setPlctId(PlanoContas plctId) {
        this.plctId = plctId;
    }

    public Titulos getTituId() {
        return tituId;
    }

    public void setTituId(Titulos tituId) {
        this.tituId = tituId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ticcId != null ? ticcId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TitulosCentroCustos)) {
            return false;
        }
        TitulosCentroCustos other = (TitulosCentroCustos) object;
        if ((this.ticcId == null && other.ticcId != null) || (this.ticcId != null && !this.ticcId.equals(other.ticcId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.TitulosCentroCustos[ ticcId=" + ticcId + " ]";
    }
    
}
