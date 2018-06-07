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
@Table(name = "DCFS_LANCCONTABEIS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DcfsLanccontabeis.findAll", query = "SELECT d FROM DcfsLanccontabeis d"),
    @NamedQuery(name = "DcfsLanccontabeis.findByDflcId", query = "SELECT d FROM DcfsLanccontabeis d WHERE d.dflcId = :dflcId"),
    @NamedQuery(name = "DcfsLanccontabeis.findByDflcHistPadrao", query = "SELECT d FROM DcfsLanccontabeis d WHERE d.dflcHistPadrao = :dflcHistPadrao"),
    @NamedQuery(name = "DcfsLanccontabeis.findByDflcValor", query = "SELECT d FROM DcfsLanccontabeis d WHERE d.dflcValor = :dflcValor"),
    @NamedQuery(name = "DcfsLanccontabeis.findByDflcLastupdate", query = "SELECT d FROM DcfsLanccontabeis d WHERE d.dflcLastupdate = :dflcLastupdate")})
public class DcfsLanccontabeis implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DFLC_ID")
    private String dflcId;
    @Column(name = "DFLC_HIST_PADRAO")
    private String dflcHistPadrao;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "DFLC_VALOR")
    private BigDecimal dflcValor;
    @Column(name = "DFLC_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dflcLastupdate;
    @JoinColumn(name = "DCFS_ID", referencedColumnName = "DCFS_ID")
    @ManyToOne
    private DocumentosFiscais dcfsId;
    @JoinColumn(name = "HPAD_ID", referencedColumnName = "HPAD_ID")
    @ManyToOne
    private HistoricosPadrao hpadId;
    @JoinColumn(name = "PLCT_ID", referencedColumnName = "PLCT_ID")
    @ManyToOne
    private PlanoContas plctId;
    @JoinColumn(name = "PLA_PLCT_ID", referencedColumnName = "PLCT_ID")
    @ManyToOne
    private PlanoContas plaPlctId;

    public DcfsLanccontabeis() {
    }

    public DcfsLanccontabeis(String dflcId) {
        this.dflcId = dflcId;
    }

    public DcfsLanccontabeis(String dflcId, BigDecimal dflcValor) {
        this.dflcId = dflcId;
        this.dflcValor = dflcValor;
    }

    public String getDflcId() {
        return dflcId;
    }

    public void setDflcId(String dflcId) {
        this.dflcId = dflcId;
    }

    public String getDflcHistPadrao() {
        return dflcHistPadrao;
    }

    public void setDflcHistPadrao(String dflcHistPadrao) {
        this.dflcHistPadrao = dflcHistPadrao;
    }

    public BigDecimal getDflcValor() {
        return dflcValor;
    }

    public void setDflcValor(BigDecimal dflcValor) {
        this.dflcValor = dflcValor;
    }

    public Date getDflcLastupdate() {
        return dflcLastupdate;
    }

    public void setDflcLastupdate(Date dflcLastupdate) {
        this.dflcLastupdate = dflcLastupdate;
    }

    public DocumentosFiscais getDcfsId() {
        return dcfsId;
    }

    public void setDcfsId(DocumentosFiscais dcfsId) {
        this.dcfsId = dcfsId;
    }

    public HistoricosPadrao getHpadId() {
        return hpadId;
    }

    public void setHpadId(HistoricosPadrao hpadId) {
        this.hpadId = hpadId;
    }

    public PlanoContas getPlctId() {
        return plctId;
    }

    public void setPlctId(PlanoContas plctId) {
        this.plctId = plctId;
    }

    public PlanoContas getPlaPlctId() {
        return plaPlctId;
    }

    public void setPlaPlctId(PlanoContas plaPlctId) {
        this.plaPlctId = plaPlctId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dflcId != null ? dflcId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DcfsLanccontabeis)) {
            return false;
        }
        DcfsLanccontabeis other = (DcfsLanccontabeis) object;
        if ((this.dflcId == null && other.dflcId != null) || (this.dflcId != null && !this.dflcId.equals(other.dflcId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.DcfsLanccontabeis[ dflcId=" + dflcId + " ]";
    }
    
}
