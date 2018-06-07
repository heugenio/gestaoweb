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
@Table(name = "MOTIVODIVERGENCIA_USUARIOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MotivodivergenciaUsuarios.findAll", query = "SELECT m FROM MotivodivergenciaUsuarios m"),
    @NamedQuery(name = "MotivodivergenciaUsuarios.findByMdusId", query = "SELECT m FROM MotivodivergenciaUsuarios m WHERE m.mdusId = :mdusId"),
    @NamedQuery(name = "MotivodivergenciaUsuarios.findByMdusLastupdate", query = "SELECT m FROM MotivodivergenciaUsuarios m WHERE m.mdusLastupdate = :mdusLastupdate")})
public class MotivodivergenciaUsuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MDUS_ID")
    private String mdusId;
    @Column(name = "MDUS_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mdusLastupdate;
    @JoinColumn(name = "MTDV_ID", referencedColumnName = "MTDV_ID")
    @ManyToOne
    private MotivosDivergencias mtdvId;
    @JoinColumn(name = "USRS_ID", referencedColumnName = "USRS_ID")
    @ManyToOne
    private Usuarios usrsId;

    public MotivodivergenciaUsuarios() {
    }

    public MotivodivergenciaUsuarios(String mdusId) {
        this.mdusId = mdusId;
    }

    public String getMdusId() {
        return mdusId;
    }

    public void setMdusId(String mdusId) {
        this.mdusId = mdusId;
    }

    public Date getMdusLastupdate() {
        return mdusLastupdate;
    }

    public void setMdusLastupdate(Date mdusLastupdate) {
        this.mdusLastupdate = mdusLastupdate;
    }

    public MotivosDivergencias getMtdvId() {
        return mtdvId;
    }

    public void setMtdvId(MotivosDivergencias mtdvId) {
        this.mtdvId = mtdvId;
    }

    public Usuarios getUsrsId() {
        return usrsId;
    }

    public void setUsrsId(Usuarios usrsId) {
        this.usrsId = usrsId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mdusId != null ? mdusId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MotivodivergenciaUsuarios)) {
            return false;
        }
        MotivodivergenciaUsuarios other = (MotivodivergenciaUsuarios) object;
        if ((this.mdusId == null && other.mdusId != null) || (this.mdusId != null && !this.mdusId.equals(other.mdusId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.MotivodivergenciaUsuarios[ mdusId=" + mdusId + " ]";
    }
    
}
