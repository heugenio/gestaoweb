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
@Table(name = "NCM_NBM")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "NcmNbm.findAll", query = "SELECT n FROM NcmNbm n"),
    @NamedQuery(name = "NcmNbm.findByNcnbId", query = "SELECT n FROM NcmNbm n WHERE n.ncnbId = :ncnbId"),
    @NamedQuery(name = "NcmNbm.findByNcnbLastupdate", query = "SELECT n FROM NcmNbm n WHERE n.ncnbLastupdate = :ncnbLastupdate")})
public class NcmNbm implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NCNB_ID")
    private String ncnbId;
    @Column(name = "NCNB_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ncnbLastupdate;
    @JoinColumn(name = "NBMS_ID", referencedColumnName = "NBMS_ID")
    @ManyToOne
    private Nbms nbmsId;
    @JoinColumn(name = "NCMS_ID", referencedColumnName = "NCMS_ID")
    @ManyToOne
    private Ncms ncmsId;

    public NcmNbm() {
    }

    public NcmNbm(String ncnbId) {
        this.ncnbId = ncnbId;
    }

    public String getNcnbId() {
        return ncnbId;
    }

    public void setNcnbId(String ncnbId) {
        this.ncnbId = ncnbId;
    }

    public Date getNcnbLastupdate() {
        return ncnbLastupdate;
    }

    public void setNcnbLastupdate(Date ncnbLastupdate) {
        this.ncnbLastupdate = ncnbLastupdate;
    }

    public Nbms getNbmsId() {
        return nbmsId;
    }

    public void setNbmsId(Nbms nbmsId) {
        this.nbmsId = nbmsId;
    }

    public Ncms getNcmsId() {
        return ncmsId;
    }

    public void setNcmsId(Ncms ncmsId) {
        this.ncmsId = ncmsId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ncnbId != null ? ncnbId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NcmNbm)) {
            return false;
        }
        NcmNbm other = (NcmNbm) object;
        if ((this.ncnbId == null && other.ncnbId != null) || (this.ncnbId != null && !this.ncnbId.equals(other.ncnbId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.NcmNbm[ ncnbId=" + ncnbId + " ]";
    }
    
}
