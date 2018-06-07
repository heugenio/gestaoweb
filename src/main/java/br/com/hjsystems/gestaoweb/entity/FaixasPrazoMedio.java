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
@Table(name = "FAIXAS_PRAZO_MEDIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FaixasPrazoMedio.findAll", query = "SELECT f FROM FaixasPrazoMedio f"),
    @NamedQuery(name = "FaixasPrazoMedio.findByFxpmId", query = "SELECT f FROM FaixasPrazoMedio f WHERE f.fxpmId = :fxpmId"),
    @NamedQuery(name = "FaixasPrazoMedio.findByFxpmFaixaIni", query = "SELECT f FROM FaixasPrazoMedio f WHERE f.fxpmFaixaIni = :fxpmFaixaIni"),
    @NamedQuery(name = "FaixasPrazoMedio.findByFxpmFaixaFin", query = "SELECT f FROM FaixasPrazoMedio f WHERE f.fxpmFaixaFin = :fxpmFaixaFin"),
    @NamedQuery(name = "FaixasPrazoMedio.findByFxpmPrazoMedio", query = "SELECT f FROM FaixasPrazoMedio f WHERE f.fxpmPrazoMedio = :fxpmPrazoMedio"),
    @NamedQuery(name = "FaixasPrazoMedio.findByFxpmLastupdate", query = "SELECT f FROM FaixasPrazoMedio f WHERE f.fxpmLastupdate = :fxpmLastupdate")})
public class FaixasPrazoMedio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "FXPM_ID")
    private String fxpmId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "FXPM_FAIXA_INI")
    private BigDecimal fxpmFaixaIni;
    @Basic(optional = false)
    @Column(name = "FXPM_FAIXA_FIN")
    private BigDecimal fxpmFaixaFin;
    @Column(name = "FXPM_PRAZO_MEDIO")
    private Integer fxpmPrazoMedio;
    @Column(name = "FXPM_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fxpmLastupdate;

    public FaixasPrazoMedio() {
    }

    public FaixasPrazoMedio(String fxpmId) {
        this.fxpmId = fxpmId;
    }

    public FaixasPrazoMedio(String fxpmId, BigDecimal fxpmFaixaIni, BigDecimal fxpmFaixaFin) {
        this.fxpmId = fxpmId;
        this.fxpmFaixaIni = fxpmFaixaIni;
        this.fxpmFaixaFin = fxpmFaixaFin;
    }

    public String getFxpmId() {
        return fxpmId;
    }

    public void setFxpmId(String fxpmId) {
        this.fxpmId = fxpmId;
    }

    public BigDecimal getFxpmFaixaIni() {
        return fxpmFaixaIni;
    }

    public void setFxpmFaixaIni(BigDecimal fxpmFaixaIni) {
        this.fxpmFaixaIni = fxpmFaixaIni;
    }

    public BigDecimal getFxpmFaixaFin() {
        return fxpmFaixaFin;
    }

    public void setFxpmFaixaFin(BigDecimal fxpmFaixaFin) {
        this.fxpmFaixaFin = fxpmFaixaFin;
    }

    public Integer getFxpmPrazoMedio() {
        return fxpmPrazoMedio;
    }

    public void setFxpmPrazoMedio(Integer fxpmPrazoMedio) {
        this.fxpmPrazoMedio = fxpmPrazoMedio;
    }

    public Date getFxpmLastupdate() {
        return fxpmLastupdate;
    }

    public void setFxpmLastupdate(Date fxpmLastupdate) {
        this.fxpmLastupdate = fxpmLastupdate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fxpmId != null ? fxpmId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FaixasPrazoMedio)) {
            return false;
        }
        FaixasPrazoMedio other = (FaixasPrazoMedio) object;
        if ((this.fxpmId == null && other.fxpmId != null) || (this.fxpmId != null && !this.fxpmId.equals(other.fxpmId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.FaixasPrazoMedio[ fxpmId=" + fxpmId + " ]";
    }
    
}
