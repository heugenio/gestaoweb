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
@Table(name = "TABELA_QUALIDADE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TabelaQualidade.findAll", query = "SELECT t FROM TabelaQualidade t"),
    @NamedQuery(name = "TabelaQualidade.findByTaqlId", query = "SELECT t FROM TabelaQualidade t WHERE t.taqlId = :taqlId"),
    @NamedQuery(name = "TabelaQualidade.findByTaqlPercentual", query = "SELECT t FROM TabelaQualidade t WHERE t.taqlPercentual = :taqlPercentual"),
    @NamedQuery(name = "TabelaQualidade.findByTaqlValor", query = "SELECT t FROM TabelaQualidade t WHERE t.taqlValor = :taqlValor"),
    @NamedQuery(name = "TabelaQualidade.findByTaqlLastupdate", query = "SELECT t FROM TabelaQualidade t WHERE t.taqlLastupdate = :taqlLastupdate")})
public class TabelaQualidade implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TAQL_ID")
    private String taqlId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "TAQL_PERCENTUAL")
    private BigDecimal taqlPercentual;
    @Basic(optional = false)
    @Column(name = "TAQL_VALOR")
    private BigDecimal taqlValor;
    @Column(name = "TAQL_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date taqlLastupdate;

    public TabelaQualidade() {
    }

    public TabelaQualidade(String taqlId) {
        this.taqlId = taqlId;
    }

    public TabelaQualidade(String taqlId, BigDecimal taqlPercentual, BigDecimal taqlValor) {
        this.taqlId = taqlId;
        this.taqlPercentual = taqlPercentual;
        this.taqlValor = taqlValor;
    }

    public String getTaqlId() {
        return taqlId;
    }

    public void setTaqlId(String taqlId) {
        this.taqlId = taqlId;
    }

    public BigDecimal getTaqlPercentual() {
        return taqlPercentual;
    }

    public void setTaqlPercentual(BigDecimal taqlPercentual) {
        this.taqlPercentual = taqlPercentual;
    }

    public BigDecimal getTaqlValor() {
        return taqlValor;
    }

    public void setTaqlValor(BigDecimal taqlValor) {
        this.taqlValor = taqlValor;
    }

    public Date getTaqlLastupdate() {
        return taqlLastupdate;
    }

    public void setTaqlLastupdate(Date taqlLastupdate) {
        this.taqlLastupdate = taqlLastupdate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (taqlId != null ? taqlId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TabelaQualidade)) {
            return false;
        }
        TabelaQualidade other = (TabelaQualidade) object;
        if ((this.taqlId == null && other.taqlId != null) || (this.taqlId != null && !this.taqlId.equals(other.taqlId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.TabelaQualidade[ taqlId=" + taqlId + " ]";
    }
    
}
