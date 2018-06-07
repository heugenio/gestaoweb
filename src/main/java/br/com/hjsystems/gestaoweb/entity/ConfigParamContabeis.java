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
@Table(name = "CONFIG_PARAM_CONTABEIS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ConfigParamContabeis.findAll", query = "SELECT c FROM ConfigParamContabeis c"),
    @NamedQuery(name = "ConfigParamContabeis.findByCpctId", query = "SELECT c FROM ConfigParamContabeis c WHERE c.cpctId = :cpctId"),
    @NamedQuery(name = "ConfigParamContabeis.findByCpctTipo", query = "SELECT c FROM ConfigParamContabeis c WHERE c.cpctTipo = :cpctTipo"),
    @NamedQuery(name = "ConfigParamContabeis.findByCPCtLASTUPDATE", query = "SELECT c FROM ConfigParamContabeis c WHERE c.cPCtLASTUPDATE = :cPCtLASTUPDATE")})
public class ConfigParamContabeis implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CPCT_ID")
    private String cpctId;
    @Basic(optional = false)
    @Column(name = "CPCT_TIPO")
    private String cpctTipo;
    @Column(name = "CPCt_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cPCtLASTUPDATE;
    @JoinColumn(name = "HPAD_ID", referencedColumnName = "HPAD_ID")
    @ManyToOne
    private HistoricosPadrao hpadId;
    @JoinColumn(name = "PRCT_ID", referencedColumnName = "PRCT_ID")
    @ManyToOne
    private ParametrosContabeis prctId;
    @JoinColumn(name = "PLA_PLCT_ID", referencedColumnName = "PLCT_ID")
    @ManyToOne
    private PlanoContas plaPlctId;
    @JoinColumn(name = "PLCT_ID", referencedColumnName = "PLCT_ID")
    @ManyToOne
    private PlanoContas plctId;

    public ConfigParamContabeis() {
    }

    public ConfigParamContabeis(String cpctId) {
        this.cpctId = cpctId;
    }

    public ConfigParamContabeis(String cpctId, String cpctTipo) {
        this.cpctId = cpctId;
        this.cpctTipo = cpctTipo;
    }

    public String getCpctId() {
        return cpctId;
    }

    public void setCpctId(String cpctId) {
        this.cpctId = cpctId;
    }

    public String getCpctTipo() {
        return cpctTipo;
    }

    public void setCpctTipo(String cpctTipo) {
        this.cpctTipo = cpctTipo;
    }

    public Date getCPCtLASTUPDATE() {
        return cPCtLASTUPDATE;
    }

    public void setCPCtLASTUPDATE(Date cPCtLASTUPDATE) {
        this.cPCtLASTUPDATE = cPCtLASTUPDATE;
    }

    public HistoricosPadrao getHpadId() {
        return hpadId;
    }

    public void setHpadId(HistoricosPadrao hpadId) {
        this.hpadId = hpadId;
    }

    public ParametrosContabeis getPrctId() {
        return prctId;
    }

    public void setPrctId(ParametrosContabeis prctId) {
        this.prctId = prctId;
    }

    public PlanoContas getPlaPlctId() {
        return plaPlctId;
    }

    public void setPlaPlctId(PlanoContas plaPlctId) {
        this.plaPlctId = plaPlctId;
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
        hash += (cpctId != null ? cpctId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ConfigParamContabeis)) {
            return false;
        }
        ConfigParamContabeis other = (ConfigParamContabeis) object;
        if ((this.cpctId == null && other.cpctId != null) || (this.cpctId != null && !this.cpctId.equals(other.cpctId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.ConfigParamContabeis[ cpctId=" + cpctId + " ]";
    }
    
}
