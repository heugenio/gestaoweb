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
@Table(name = "SALDOS_CONTAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SaldosContas.findAll", query = "SELECT s FROM SaldosContas s"),
    @NamedQuery(name = "SaldosContas.findBySdctId", query = "SELECT s FROM SaldosContas s WHERE s.sdctId = :sdctId"),
    @NamedQuery(name = "SaldosContas.findBySdctData", query = "SELECT s FROM SaldosContas s WHERE s.sdctData = :sdctData"),
    @NamedQuery(name = "SaldosContas.findBySdctDebito", query = "SELECT s FROM SaldosContas s WHERE s.sdctDebito = :sdctDebito"),
    @NamedQuery(name = "SaldosContas.findBySdctCredito", query = "SELECT s FROM SaldosContas s WHERE s.sdctCredito = :sdctCredito"),
    @NamedQuery(name = "SaldosContas.findBySdctZeramento", query = "SELECT s FROM SaldosContas s WHERE s.sdctZeramento = :sdctZeramento"),
    @NamedQuery(name = "SaldosContas.findBySdCtLASTUPDATE", query = "SELECT s FROM SaldosContas s WHERE s.sdCtLASTUPDATE = :sdCtLASTUPDATE")})
public class SaldosContas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SDCT_ID")
    private String sdctId;
    @Basic(optional = false)
    @Column(name = "SDCT_DATA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sdctData;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SDCT_DEBITO")
    private BigDecimal sdctDebito;
    @Column(name = "SDCT_CREDITO")
    private BigDecimal sdctCredito;
    @Column(name = "SDCT_ZERAMENTO")
    private BigDecimal sdctZeramento;
    @Column(name = "SdCt_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sdCtLASTUPDATE;
    @JoinColumn(name = "PLCT_ID", referencedColumnName = "PLCT_ID")
    @ManyToOne
    private PlanoContas plctId;

    public SaldosContas() {
    }

    public SaldosContas(String sdctId) {
        this.sdctId = sdctId;
    }

    public SaldosContas(String sdctId, Date sdctData) {
        this.sdctId = sdctId;
        this.sdctData = sdctData;
    }

    public String getSdctId() {
        return sdctId;
    }

    public void setSdctId(String sdctId) {
        this.sdctId = sdctId;
    }

    public Date getSdctData() {
        return sdctData;
    }

    public void setSdctData(Date sdctData) {
        this.sdctData = sdctData;
    }

    public BigDecimal getSdctDebito() {
        return sdctDebito;
    }

    public void setSdctDebito(BigDecimal sdctDebito) {
        this.sdctDebito = sdctDebito;
    }

    public BigDecimal getSdctCredito() {
        return sdctCredito;
    }

    public void setSdctCredito(BigDecimal sdctCredito) {
        this.sdctCredito = sdctCredito;
    }

    public BigDecimal getSdctZeramento() {
        return sdctZeramento;
    }

    public void setSdctZeramento(BigDecimal sdctZeramento) {
        this.sdctZeramento = sdctZeramento;
    }

    public Date getSdCtLASTUPDATE() {
        return sdCtLASTUPDATE;
    }

    public void setSdCtLASTUPDATE(Date sdCtLASTUPDATE) {
        this.sdCtLASTUPDATE = sdCtLASTUPDATE;
    }

    public PlanoContas getPlctId() {
        return plctId;
    }

    public void setPlctId(PlanoContas plctId) {
        this.plctId = plctId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sdctId != null ? sdctId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SaldosContas)) {
            return false;
        }
        SaldosContas other = (SaldosContas) object;
        if ((this.sdctId == null && other.sdctId != null) || (this.sdctId != null && !this.sdctId.equals(other.sdctId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.SaldosContas[ sdctId=" + sdctId + " ]";
    }
    
}
