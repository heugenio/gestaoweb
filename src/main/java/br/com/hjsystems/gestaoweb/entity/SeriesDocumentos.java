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
@Table(name = "SERIES_DOCUMENTOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SeriesDocumentos.findAll", query = "SELECT s FROM SeriesDocumentos s"),
    @NamedQuery(name = "SeriesDocumentos.findBySrdcId", query = "SELECT s FROM SeriesDocumentos s WHERE s.srdcId = :srdcId"),
    @NamedQuery(name = "SeriesDocumentos.findBySrdcNome", query = "SELECT s FROM SeriesDocumentos s WHERE s.srdcNome = :srdcNome"),
    @NamedQuery(name = "SeriesDocumentos.findBySrdcTipo", query = "SELECT s FROM SeriesDocumentos s WHERE s.srdcTipo = :srdcTipo"),
    @NamedQuery(name = "SeriesDocumentos.findBySrdcLastupdate", query = "SELECT s FROM SeriesDocumentos s WHERE s.srdcLastupdate = :srdcLastupdate")})
public class SeriesDocumentos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SRDC_ID")
    private String srdcId;
    @Column(name = "SRDC_NOME")
    private String srdcNome;
    @Column(name = "SRDC_TIPO")
    private String srdcTipo;
    @Column(name = "SRDC_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date srdcLastupdate;

    public SeriesDocumentos() {
    }

    public SeriesDocumentos(String srdcId) {
        this.srdcId = srdcId;
    }

    public String getSrdcId() {
        return srdcId;
    }

    public void setSrdcId(String srdcId) {
        this.srdcId = srdcId;
    }

    public String getSrdcNome() {
        return srdcNome;
    }

    public void setSrdcNome(String srdcNome) {
        this.srdcNome = srdcNome;
    }

    public String getSrdcTipo() {
        return srdcTipo;
    }

    public void setSrdcTipo(String srdcTipo) {
        this.srdcTipo = srdcTipo;
    }

    public Date getSrdcLastupdate() {
        return srdcLastupdate;
    }

    public void setSrdcLastupdate(Date srdcLastupdate) {
        this.srdcLastupdate = srdcLastupdate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (srdcId != null ? srdcId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SeriesDocumentos)) {
            return false;
        }
        SeriesDocumentos other = (SeriesDocumentos) object;
        if ((this.srdcId == null && other.srdcId != null) || (this.srdcId != null && !this.srdcId.equals(other.srdcId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.SeriesDocumentos[ srdcId=" + srdcId + " ]";
    }
    
}
