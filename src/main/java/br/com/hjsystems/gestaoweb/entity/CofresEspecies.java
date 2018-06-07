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
@Table(name = "COFRES_ESPECIES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CofresEspecies.findAll", query = "SELECT c FROM CofresEspecies c"),
    @NamedQuery(name = "CofresEspecies.findByCoepId", query = "SELECT c FROM CofresEspecies c WHERE c.coepId = :coepId"),
    @NamedQuery(name = "CofresEspecies.findByCoepEspecie", query = "SELECT c FROM CofresEspecies c WHERE c.coepEspecie = :coepEspecie"),
    @NamedQuery(name = "CofresEspecies.findByCoepLastupdate", query = "SELECT c FROM CofresEspecies c WHERE c.coepLastupdate = :coepLastupdate")})
public class CofresEspecies implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COEP_ID")
    private String coepId;
    @Column(name = "COEP_ESPECIE")
    private String coepEspecie;
    @Column(name = "COEP_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date coepLastupdate;
    @JoinColumn(name = "COFR_ID", referencedColumnName = "COFR_ID")
    @ManyToOne
    private Cofres cofrId;

    public CofresEspecies() {
    }

    public CofresEspecies(String coepId) {
        this.coepId = coepId;
    }

    public String getCoepId() {
        return coepId;
    }

    public void setCoepId(String coepId) {
        this.coepId = coepId;
    }

    public String getCoepEspecie() {
        return coepEspecie;
    }

    public void setCoepEspecie(String coepEspecie) {
        this.coepEspecie = coepEspecie;
    }

    public Date getCoepLastupdate() {
        return coepLastupdate;
    }

    public void setCoepLastupdate(Date coepLastupdate) {
        this.coepLastupdate = coepLastupdate;
    }

    public Cofres getCofrId() {
        return cofrId;
    }

    public void setCofrId(Cofres cofrId) {
        this.cofrId = cofrId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (coepId != null ? coepId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CofresEspecies)) {
            return false;
        }
        CofresEspecies other = (CofresEspecies) object;
        if ((this.coepId == null && other.coepId != null) || (this.coepId != null && !this.coepId.equals(other.coepId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.CofresEspecies[ coepId=" + coepId + " ]";
    }
    
}
