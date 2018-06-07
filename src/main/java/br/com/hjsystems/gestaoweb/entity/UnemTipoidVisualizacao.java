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
@Table(name = "UNEM_TIPOID_VISUALIZACAO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UnemTipoidVisualizacao.findAll", query = "SELECT u FROM UnemTipoidVisualizacao u"),
    @NamedQuery(name = "UnemTipoidVisualizacao.findByUetvId", query = "SELECT u FROM UnemTipoidVisualizacao u WHERE u.uetvId = :uetvId"),
    @NamedQuery(name = "UnemTipoidVisualizacao.findByTblsId", query = "SELECT u FROM UnemTipoidVisualizacao u WHERE u.tblsId = :tblsId"),
    @NamedQuery(name = "UnemTipoidVisualizacao.findByUnemId", query = "SELECT u FROM UnemTipoidVisualizacao u WHERE u.unemId = :unemId"),
    @NamedQuery(name = "UnemTipoidVisualizacao.findByUetvTipoId", query = "SELECT u FROM UnemTipoidVisualizacao u WHERE u.uetvTipoId = :uetvTipoId"),
    @NamedQuery(name = "UnemTipoidVisualizacao.findByUetvTipoVisualizacao", query = "SELECT u FROM UnemTipoidVisualizacao u WHERE u.uetvTipoVisualizacao = :uetvTipoVisualizacao"),
    @NamedQuery(name = "UnemTipoidVisualizacao.findByUetvLastupdate", query = "SELECT u FROM UnemTipoidVisualizacao u WHERE u.uetvLastupdate = :uetvLastupdate")})
public class UnemTipoidVisualizacao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "UETV_ID")
    private String uetvId;
    @Column(name = "TBLS_ID")
    private String tblsId;
    @Column(name = "UNEM_ID")
    private String unemId;
    @Column(name = "UETV_TIPO_ID")
    private String uetvTipoId;
    @Basic(optional = false)
    @Column(name = "UETV_TIPO_VISUALIZACAO")
    private String uetvTipoVisualizacao;
    @Column(name = "UETV_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date uetvLastupdate;

    public UnemTipoidVisualizacao() {
    }

    public UnemTipoidVisualizacao(String uetvId) {
        this.uetvId = uetvId;
    }

    public UnemTipoidVisualizacao(String uetvId, String uetvTipoVisualizacao) {
        this.uetvId = uetvId;
        this.uetvTipoVisualizacao = uetvTipoVisualizacao;
    }

    public String getUetvId() {
        return uetvId;
    }

    public void setUetvId(String uetvId) {
        this.uetvId = uetvId;
    }

    public String getTblsId() {
        return tblsId;
    }

    public void setTblsId(String tblsId) {
        this.tblsId = tblsId;
    }

    public String getUnemId() {
        return unemId;
    }

    public void setUnemId(String unemId) {
        this.unemId = unemId;
    }

    public String getUetvTipoId() {
        return uetvTipoId;
    }

    public void setUetvTipoId(String uetvTipoId) {
        this.uetvTipoId = uetvTipoId;
    }

    public String getUetvTipoVisualizacao() {
        return uetvTipoVisualizacao;
    }

    public void setUetvTipoVisualizacao(String uetvTipoVisualizacao) {
        this.uetvTipoVisualizacao = uetvTipoVisualizacao;
    }

    public Date getUetvLastupdate() {
        return uetvLastupdate;
    }

    public void setUetvLastupdate(Date uetvLastupdate) {
        this.uetvLastupdate = uetvLastupdate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (uetvId != null ? uetvId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UnemTipoidVisualizacao)) {
            return false;
        }
        UnemTipoidVisualizacao other = (UnemTipoidVisualizacao) object;
        if ((this.uetvId == null && other.uetvId != null) || (this.uetvId != null && !this.uetvId.equals(other.uetvId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.UnemTipoidVisualizacao[ uetvId=" + uetvId + " ]";
    }
    
}
