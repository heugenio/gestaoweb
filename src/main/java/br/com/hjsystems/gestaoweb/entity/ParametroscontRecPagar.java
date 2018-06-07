/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hjsystems.gestaoweb.entity;

import java.io.Serializable;
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
@Table(name = "PARAMETROSCONT_REC_PAGAR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ParametroscontRecPagar.findAll", query = "SELECT p FROM ParametroscontRecPagar p"),
    @NamedQuery(name = "ParametroscontRecPagar.findByPrprId", query = "SELECT p FROM ParametroscontRecPagar p WHERE p.prprId = :prprId"),
    @NamedQuery(name = "ParametroscontRecPagar.findByPrprTipo", query = "SELECT p FROM ParametroscontRecPagar p WHERE p.prprTipo = :prprTipo"),
    @NamedQuery(name = "ParametroscontRecPagar.findByPrPRLASTUPDATE", query = "SELECT p FROM ParametroscontRecPagar p WHERE p.prPRLASTUPDATE = :prPRLASTUPDATE")})
public class ParametroscontRecPagar implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PRPR_ID")
    private String prprId;
    @Column(name = "PRPR_TIPO")
    private String prprTipo;
    @Column(name = "PrPR_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date prPRLASTUPDATE;
    @JoinColumn(name = "HPAD_ID", referencedColumnName = "HPAD_ID")
    @ManyToOne
    private HistoricosPadrao hpadId;
    @JoinColumn(name = "PLCT_ID", referencedColumnName = "PLCT_ID")
    @ManyToOne
    private PlanoContas plctId;

    public ParametroscontRecPagar() {
    }

    public ParametroscontRecPagar(String prprId) {
        this.prprId = prprId;
    }

    public String getPrprId() {
        return prprId;
    }

    public void setPrprId(String prprId) {
        this.prprId = prprId;
    }

    public String getPrprTipo() {
        return prprTipo;
    }

    public void setPrprTipo(String prprTipo) {
        this.prprTipo = prprTipo;
    }

    public Date getPrPRLASTUPDATE() {
        return prPRLASTUPDATE;
    }

    public void setPrPRLASTUPDATE(Date prPRLASTUPDATE) {
        this.prPRLASTUPDATE = prPRLASTUPDATE;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prprId != null ? prprId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ParametroscontRecPagar)) {
            return false;
        }
        ParametroscontRecPagar other = (ParametroscontRecPagar) object;
        if ((this.prprId == null && other.prprId != null) || (this.prprId != null && !this.prprId.equals(other.prprId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.ParametroscontRecPagar[ prprId=" + prprId + " ]";
    }
    
}
