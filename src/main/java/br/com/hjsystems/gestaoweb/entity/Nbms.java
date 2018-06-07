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
@Table(name = "NBMS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Nbms.findAll", query = "SELECT n FROM Nbms n"),
    @NamedQuery(name = "Nbms.findByNbmsId", query = "SELECT n FROM Nbms n WHERE n.nbmsId = :nbmsId"),
    @NamedQuery(name = "Nbms.findByNbmsCodigo", query = "SELECT n FROM Nbms n WHERE n.nbmsCodigo = :nbmsCodigo"),
    @NamedQuery(name = "Nbms.findByNbmsNome", query = "SELECT n FROM Nbms n WHERE n.nbmsNome = :nbmsNome"),
    @NamedQuery(name = "Nbms.findByNbmsLastupdate", query = "SELECT n FROM Nbms n WHERE n.nbmsLastupdate = :nbmsLastupdate")})
public class Nbms implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NBMS_ID")
    private String nbmsId;
    @Basic(optional = false)
    @Column(name = "NBMS_CODIGO")
    private String nbmsCodigo;
    @Basic(optional = false)
    @Column(name = "NBMS_NOME")
    private String nbmsNome;
    @Column(name = "NBMS_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date nbmsLastupdate;
    @OneToMany(mappedBy = "nbmsId")
    private List<NcmNbm> ncmNbmList;

    public Nbms() {
    }

    public Nbms(String nbmsId) {
        this.nbmsId = nbmsId;
    }

    public Nbms(String nbmsId, String nbmsCodigo, String nbmsNome) {
        this.nbmsId = nbmsId;
        this.nbmsCodigo = nbmsCodigo;
        this.nbmsNome = nbmsNome;
    }

    public String getNbmsId() {
        return nbmsId;
    }

    public void setNbmsId(String nbmsId) {
        this.nbmsId = nbmsId;
    }

    public String getNbmsCodigo() {
        return nbmsCodigo;
    }

    public void setNbmsCodigo(String nbmsCodigo) {
        this.nbmsCodigo = nbmsCodigo;
    }

    public String getNbmsNome() {
        return nbmsNome;
    }

    public void setNbmsNome(String nbmsNome) {
        this.nbmsNome = nbmsNome;
    }

    public Date getNbmsLastupdate() {
        return nbmsLastupdate;
    }

    public void setNbmsLastupdate(Date nbmsLastupdate) {
        this.nbmsLastupdate = nbmsLastupdate;
    }

    @XmlTransient
    public List<NcmNbm> getNcmNbmList() {
        return ncmNbmList;
    }

    public void setNcmNbmList(List<NcmNbm> ncmNbmList) {
        this.ncmNbmList = ncmNbmList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nbmsId != null ? nbmsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nbms)) {
            return false;
        }
        Nbms other = (Nbms) object;
        if ((this.nbmsId == null && other.nbmsId != null) || (this.nbmsId != null && !this.nbmsId.equals(other.nbmsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.Nbms[ nbmsId=" + nbmsId + " ]";
    }
    
}
