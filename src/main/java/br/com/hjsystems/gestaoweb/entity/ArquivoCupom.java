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
import javax.persistence.Lob;
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
@Table(name = "ARQUIVO_CUPOM")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ArquivoCupom.findAll", query = "SELECT a FROM ArquivoCupom a"),
    @NamedQuery(name = "ArquivoCupom.findByArcpId", query = "SELECT a FROM ArquivoCupom a WHERE a.arcpId = :arcpId"),
    @NamedQuery(name = "ArquivoCupom.findByArcpStatus", query = "SELECT a FROM ArquivoCupom a WHERE a.arcpStatus = :arcpStatus"),
    @NamedQuery(name = "ArquivoCupom.findByDcfsId", query = "SELECT a FROM ArquivoCupom a WHERE a.dcfsId = :dcfsId"),
    @NamedQuery(name = "ArquivoCupom.findByArcpLastupdate", query = "SELECT a FROM ArquivoCupom a WHERE a.arcpLastupdate = :arcpLastupdate")})
public class ArquivoCupom implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ARCP_ID")
    private String arcpId;
    @Column(name = "ARCP_STATUS")
    private String arcpStatus;
    @Lob
    @Column(name = "ARCP_ARQUIVO")
    private String arcpArquivo;
    @Column(name = "DCFS_ID")
    private String dcfsId;
    @Column(name = "ARCP_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date arcpLastupdate;

    public ArquivoCupom() {
    }

    public ArquivoCupom(String arcpId) {
        this.arcpId = arcpId;
    }

    public String getArcpId() {
        return arcpId;
    }

    public void setArcpId(String arcpId) {
        this.arcpId = arcpId;
    }

    public String getArcpStatus() {
        return arcpStatus;
    }

    public void setArcpStatus(String arcpStatus) {
        this.arcpStatus = arcpStatus;
    }

    public String getArcpArquivo() {
        return arcpArquivo;
    }

    public void setArcpArquivo(String arcpArquivo) {
        this.arcpArquivo = arcpArquivo;
    }

    public String getDcfsId() {
        return dcfsId;
    }

    public void setDcfsId(String dcfsId) {
        this.dcfsId = dcfsId;
    }

    public Date getArcpLastupdate() {
        return arcpLastupdate;
    }

    public void setArcpLastupdate(Date arcpLastupdate) {
        this.arcpLastupdate = arcpLastupdate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (arcpId != null ? arcpId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ArquivoCupom)) {
            return false;
        }
        ArquivoCupom other = (ArquivoCupom) object;
        if ((this.arcpId == null && other.arcpId != null) || (this.arcpId != null && !this.arcpId.equals(other.arcpId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.ArquivoCupom[ arcpId=" + arcpId + " ]";
    }
    
}
