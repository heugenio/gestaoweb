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
@Table(name = "RESPONSAVEIS_COFRES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ResponsaveisCofres.findAll", query = "SELECT r FROM ResponsaveisCofres r"),
    @NamedQuery(name = "ResponsaveisCofres.findByRscfId", query = "SELECT r FROM ResponsaveisCofres r WHERE r.rscfId = :rscfId"),
    @NamedQuery(name = "ResponsaveisCofres.findByRsCfLASTUPDATE", query = "SELECT r FROM ResponsaveisCofres r WHERE r.rsCfLASTUPDATE = :rsCfLASTUPDATE")})
public class ResponsaveisCofres implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "RSCF_ID")
    private String rscfId;
    @Column(name = "RsCf_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rsCfLASTUPDATE;
    @JoinColumn(name = "COFR_ID", referencedColumnName = "COFR_ID")
    @ManyToOne
    private Cofres cofrId;
    @JoinColumn(name = "PESS_ID", referencedColumnName = "PESS_ID")
    @ManyToOne
    private Pessoas pessId;

    public ResponsaveisCofres() {
    }

    public ResponsaveisCofres(String rscfId) {
        this.rscfId = rscfId;
    }

    public String getRscfId() {
        return rscfId;
    }

    public void setRscfId(String rscfId) {
        this.rscfId = rscfId;
    }

    public Date getRsCfLASTUPDATE() {
        return rsCfLASTUPDATE;
    }

    public void setRsCfLASTUPDATE(Date rsCfLASTUPDATE) {
        this.rsCfLASTUPDATE = rsCfLASTUPDATE;
    }

    public Cofres getCofrId() {
        return cofrId;
    }

    public void setCofrId(Cofres cofrId) {
        this.cofrId = cofrId;
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
        hash += (rscfId != null ? rscfId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ResponsaveisCofres)) {
            return false;
        }
        ResponsaveisCofres other = (ResponsaveisCofres) object;
        if ((this.rscfId == null && other.rscfId != null) || (this.rscfId != null && !this.rscfId.equals(other.rscfId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.ResponsaveisCofres[ rscfId=" + rscfId + " ]";
    }
    
}
