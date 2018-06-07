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
@Table(name = "RESPONSAVEIS_TECNICOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ResponsaveisTecnicos.findAll", query = "SELECT r FROM ResponsaveisTecnicos r"),
    @NamedQuery(name = "ResponsaveisTecnicos.findByRstcId", query = "SELECT r FROM ResponsaveisTecnicos r WHERE r.rstcId = :rstcId"),
    @NamedQuery(name = "ResponsaveisTecnicos.findByRsTcLASTUPDATE", query = "SELECT r FROM ResponsaveisTecnicos r WHERE r.rsTcLASTUPDATE = :rsTcLASTUPDATE")})
public class ResponsaveisTecnicos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "RSTC_ID")
    private String rstcId;
    @Column(name = "RsTc_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rsTcLASTUPDATE;
    @JoinColumn(name = "PESS_ID", referencedColumnName = "PESS_ID")
    @ManyToOne
    private Pessoas pessId;

    public ResponsaveisTecnicos() {
    }

    public ResponsaveisTecnicos(String rstcId) {
        this.rstcId = rstcId;
    }

    public String getRstcId() {
        return rstcId;
    }

    public void setRstcId(String rstcId) {
        this.rstcId = rstcId;
    }

    public Date getRsTcLASTUPDATE() {
        return rsTcLASTUPDATE;
    }

    public void setRsTcLASTUPDATE(Date rsTcLASTUPDATE) {
        this.rsTcLASTUPDATE = rsTcLASTUPDATE;
    }

    public Pessoas getPessId() {
        return pessId;
    }

    public void setPessId(Pessoas pessId) {
        this.pessId = pessId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rstcId != null ? rstcId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ResponsaveisTecnicos)) {
            return false;
        }
        ResponsaveisTecnicos other = (ResponsaveisTecnicos) object;
        if ((this.rstcId == null && other.rstcId != null) || (this.rstcId != null && !this.rstcId.equals(other.rstcId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.ResponsaveisTecnicos[ rstcId=" + rstcId + " ]";
    }
    
}
