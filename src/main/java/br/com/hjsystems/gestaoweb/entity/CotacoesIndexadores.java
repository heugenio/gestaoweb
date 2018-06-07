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
@Table(name = "COTACOES_INDEXADORES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CotacoesIndexadores.findAll", query = "SELECT c FROM CotacoesIndexadores c"),
    @NamedQuery(name = "CotacoesIndexadores.findByCidxId", query = "SELECT c FROM CotacoesIndexadores c WHERE c.cidxId = :cidxId"),
    @NamedQuery(name = "CotacoesIndexadores.findByCidxData", query = "SELECT c FROM CotacoesIndexadores c WHERE c.cidxData = :cidxData"),
    @NamedQuery(name = "CotacoesIndexadores.findByCidxValor", query = "SELECT c FROM CotacoesIndexadores c WHERE c.cidxValor = :cidxValor"),
    @NamedQuery(name = "CotacoesIndexadores.findByCIdxLASTUPDATE", query = "SELECT c FROM CotacoesIndexadores c WHERE c.cIdxLASTUPDATE = :cIdxLASTUPDATE")})
public class CotacoesIndexadores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CIDX_ID")
    private String cidxId;
    @Basic(optional = false)
    @Column(name = "CIDX_DATA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cidxData;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "CIDX_VALOR")
    private BigDecimal cidxValor;
    @Column(name = "CIdx_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cIdxLASTUPDATE;
    @JoinColumn(name = "INDX_ID", referencedColumnName = "INDX_ID")
    @ManyToOne
    private Indexadores indxId;

    public CotacoesIndexadores() {
    }

    public CotacoesIndexadores(String cidxId) {
        this.cidxId = cidxId;
    }

    public CotacoesIndexadores(String cidxId, Date cidxData, BigDecimal cidxValor) {
        this.cidxId = cidxId;
        this.cidxData = cidxData;
        this.cidxValor = cidxValor;
    }

    public String getCidxId() {
        return cidxId;
    }

    public void setCidxId(String cidxId) {
        this.cidxId = cidxId;
    }

    public Date getCidxData() {
        return cidxData;
    }

    public void setCidxData(Date cidxData) {
        this.cidxData = cidxData;
    }

    public BigDecimal getCidxValor() {
        return cidxValor;
    }

    public void setCidxValor(BigDecimal cidxValor) {
        this.cidxValor = cidxValor;
    }

    public Date getCIdxLASTUPDATE() {
        return cIdxLASTUPDATE;
    }

    public void setCIdxLASTUPDATE(Date cIdxLASTUPDATE) {
        this.cIdxLASTUPDATE = cIdxLASTUPDATE;
    }

    public Indexadores getIndxId() {
        return indxId;
    }

    public void setIndxId(Indexadores indxId) {
        this.indxId = indxId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cidxId != null ? cidxId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CotacoesIndexadores)) {
            return false;
        }
        CotacoesIndexadores other = (CotacoesIndexadores) object;
        if ((this.cidxId == null && other.cidxId != null) || (this.cidxId != null && !this.cidxId.equals(other.cidxId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.CotacoesIndexadores[ cidxId=" + cidxId + " ]";
    }
    
}
