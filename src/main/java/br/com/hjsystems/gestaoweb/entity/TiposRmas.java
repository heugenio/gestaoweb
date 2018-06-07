/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hjsystems.gestaoweb.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name = "TIPOS_RMAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TiposRmas.findAll", query = "SELECT t FROM TiposRmas t"),
    @NamedQuery(name = "TiposRmas.findByTprmId", query = "SELECT t FROM TiposRmas t WHERE t.tprmId = :tprmId"),
    @NamedQuery(name = "TiposRmas.findByTprmNome", query = "SELECT t FROM TiposRmas t WHERE t.tprmNome = :tprmNome"),
    @NamedQuery(name = "TiposRmas.findByTprmTipo", query = "SELECT t FROM TiposRmas t WHERE t.tprmTipo = :tprmTipo"),
    @NamedQuery(name = "TiposRmas.findByTprmLastupdate", query = "SELECT t FROM TiposRmas t WHERE t.tprmLastupdate = :tprmLastupdate")})
public class TiposRmas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TPRM_ID")
    private String tprmId;
    @Basic(optional = false)
    @Column(name = "TPRM_NOME")
    private String tprmNome;
    @Column(name = "TPRM_TIPO")
    private String tprmTipo;
    @Column(name = "TPRM_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tprmLastupdate;
    @OneToMany(mappedBy = "tprmId")
    private List<Rmas> rmasList;

    public TiposRmas() {
    }

    public TiposRmas(String tprmId) {
        this.tprmId = tprmId;
    }

    public TiposRmas(String tprmId, String tprmNome) {
        this.tprmId = tprmId;
        this.tprmNome = tprmNome;
    }

    public String getTprmId() {
        return tprmId;
    }

    public void setTprmId(String tprmId) {
        this.tprmId = tprmId;
    }

    public String getTprmNome() {
        return tprmNome;
    }

    public void setTprmNome(String tprmNome) {
        this.tprmNome = tprmNome;
    }

    public String getTprmTipo() {
        return tprmTipo;
    }

    public void setTprmTipo(String tprmTipo) {
        this.tprmTipo = tprmTipo;
    }

    public Date getTprmLastupdate() {
        return tprmLastupdate;
    }

    public void setTprmLastupdate(Date tprmLastupdate) {
        this.tprmLastupdate = tprmLastupdate;
    }

    @XmlTransient
    public List<Rmas> getRmasList() {
        return rmasList;
    }

    public void setRmasList(List<Rmas> rmasList) {
        this.rmasList = rmasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tprmId != null ? tprmId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TiposRmas)) {
            return false;
        }
        TiposRmas other = (TiposRmas) object;
        if ((this.tprmId == null && other.tprmId != null) || (this.tprmId != null && !this.tprmId.equals(other.tprmId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.TiposRmas[ tprmId=" + tprmId + " ]";
    }
    
}
