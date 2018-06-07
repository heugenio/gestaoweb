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
@Table(name = "HISTORICOS_LIMITES_CREDITOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HistoricosLimitesCreditos.findAll", query = "SELECT h FROM HistoricosLimitesCreditos h"),
    @NamedQuery(name = "HistoricosLimitesCreditos.findByHtlcId", query = "SELECT h FROM HistoricosLimitesCreditos h WHERE h.htlcId = :htlcId"),
    @NamedQuery(name = "HistoricosLimitesCreditos.findByHtlcData", query = "SELECT h FROM HistoricosLimitesCreditos h WHERE h.htlcData = :htlcData"),
    @NamedQuery(name = "HistoricosLimitesCreditos.findByHtlcLimiteAcumulado", query = "SELECT h FROM HistoricosLimitesCreditos h WHERE h.htlcLimiteAcumulado = :htlcLimiteAcumulado"),
    @NamedQuery(name = "HistoricosLimitesCreditos.findByHtlcLimiteMensal", query = "SELECT h FROM HistoricosLimitesCreditos h WHERE h.htlcLimiteMensal = :htlcLimiteMensal"),
    @NamedQuery(name = "HistoricosLimitesCreditos.findByHtlcLimitePrazoMedio", query = "SELECT h FROM HistoricosLimitesCreditos h WHERE h.htlcLimitePrazoMedio = :htlcLimitePrazoMedio"),
    @NamedQuery(name = "HistoricosLimitesCreditos.findByHtlcObservacao", query = "SELECT h FROM HistoricosLimitesCreditos h WHERE h.htlcObservacao = :htlcObservacao"),
    @NamedQuery(name = "HistoricosLimitesCreditos.findByHtLCLASTUPDATE", query = "SELECT h FROM HistoricosLimitesCreditos h WHERE h.htLCLASTUPDATE = :htLCLASTUPDATE")})
public class HistoricosLimitesCreditos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "HTLC_ID")
    private String htlcId;
    @Basic(optional = false)
    @Column(name = "HTLC_DATA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date htlcData;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "HTLC_LIMITE_ACUMULADO")
    private BigDecimal htlcLimiteAcumulado;
    @Basic(optional = false)
    @Column(name = "HTLC_LIMITE_MENSAL")
    private BigDecimal htlcLimiteMensal;
    @Basic(optional = false)
    @Column(name = "HTLC_LIMITE_PRAZO_MEDIO")
    private int htlcLimitePrazoMedio;
    @Column(name = "HTLC_OBSERVACAO")
    private String htlcObservacao;
    @Column(name = "HtLC_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date htLCLASTUPDATE;
    @JoinColumn(name = "LMCR_ID", referencedColumnName = "LMCR_ID")
    @ManyToOne
    private LimitesCreditos lmcrId;

    public HistoricosLimitesCreditos() {
    }

    public HistoricosLimitesCreditos(String htlcId) {
        this.htlcId = htlcId;
    }

    public HistoricosLimitesCreditos(String htlcId, Date htlcData, BigDecimal htlcLimiteAcumulado, BigDecimal htlcLimiteMensal, int htlcLimitePrazoMedio) {
        this.htlcId = htlcId;
        this.htlcData = htlcData;
        this.htlcLimiteAcumulado = htlcLimiteAcumulado;
        this.htlcLimiteMensal = htlcLimiteMensal;
        this.htlcLimitePrazoMedio = htlcLimitePrazoMedio;
    }

    public String getHtlcId() {
        return htlcId;
    }

    public void setHtlcId(String htlcId) {
        this.htlcId = htlcId;
    }

    public Date getHtlcData() {
        return htlcData;
    }

    public void setHtlcData(Date htlcData) {
        this.htlcData = htlcData;
    }

    public BigDecimal getHtlcLimiteAcumulado() {
        return htlcLimiteAcumulado;
    }

    public void setHtlcLimiteAcumulado(BigDecimal htlcLimiteAcumulado) {
        this.htlcLimiteAcumulado = htlcLimiteAcumulado;
    }

    public BigDecimal getHtlcLimiteMensal() {
        return htlcLimiteMensal;
    }

    public void setHtlcLimiteMensal(BigDecimal htlcLimiteMensal) {
        this.htlcLimiteMensal = htlcLimiteMensal;
    }

    public int getHtlcLimitePrazoMedio() {
        return htlcLimitePrazoMedio;
    }

    public void setHtlcLimitePrazoMedio(int htlcLimitePrazoMedio) {
        this.htlcLimitePrazoMedio = htlcLimitePrazoMedio;
    }

    public String getHtlcObservacao() {
        return htlcObservacao;
    }

    public void setHtlcObservacao(String htlcObservacao) {
        this.htlcObservacao = htlcObservacao;
    }

    public Date getHtLCLASTUPDATE() {
        return htLCLASTUPDATE;
    }

    public void setHtLCLASTUPDATE(Date htLCLASTUPDATE) {
        this.htLCLASTUPDATE = htLCLASTUPDATE;
    }

    public LimitesCreditos getLmcrId() {
        return lmcrId;
    }

    public void setLmcrId(LimitesCreditos lmcrId) {
        this.lmcrId = lmcrId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (htlcId != null ? htlcId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HistoricosLimitesCreditos)) {
            return false;
        }
        HistoricosLimitesCreditos other = (HistoricosLimitesCreditos) object;
        if ((this.htlcId == null && other.htlcId != null) || (this.htlcId != null && !this.htlcId.equals(other.htlcId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.HistoricosLimitesCreditos[ htlcId=" + htlcId + " ]";
    }
    
}
