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
@Table(name = "IMPRESSORAS_ETIQUETAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImpressorasEtiquetas.findAll", query = "SELECT i FROM ImpressorasEtiquetas i"),
    @NamedQuery(name = "ImpressorasEtiquetas.findByIetqId", query = "SELECT i FROM ImpressorasEtiquetas i WHERE i.ietqId = :ietqId"),
    @NamedQuery(name = "ImpressorasEtiquetas.findByIetqNome", query = "SELECT i FROM ImpressorasEtiquetas i WHERE i.ietqNome = :ietqNome"),
    @NamedQuery(name = "ImpressorasEtiquetas.findByIetqCaminho", query = "SELECT i FROM ImpressorasEtiquetas i WHERE i.ietqCaminho = :ietqCaminho"),
    @NamedQuery(name = "ImpressorasEtiquetas.findByIetqLastupdate", query = "SELECT i FROM ImpressorasEtiquetas i WHERE i.ietqLastupdate = :ietqLastupdate")})
public class ImpressorasEtiquetas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IETQ_ID")
    private String ietqId;
    @Column(name = "IETQ_NOME")
    private String ietqNome;
    @Column(name = "IETQ_CAMINHO")
    private String ietqCaminho;
    @Lob
    @Column(name = "IETQ_COMANDO")
    private String ietqComando;
    @Column(name = "IETQ_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ietqLastupdate;

    public ImpressorasEtiquetas() {
    }

    public ImpressorasEtiquetas(String ietqId) {
        this.ietqId = ietqId;
    }

    public String getIetqId() {
        return ietqId;
    }

    public void setIetqId(String ietqId) {
        this.ietqId = ietqId;
    }

    public String getIetqNome() {
        return ietqNome;
    }

    public void setIetqNome(String ietqNome) {
        this.ietqNome = ietqNome;
    }

    public String getIetqCaminho() {
        return ietqCaminho;
    }

    public void setIetqCaminho(String ietqCaminho) {
        this.ietqCaminho = ietqCaminho;
    }

    public String getIetqComando() {
        return ietqComando;
    }

    public void setIetqComando(String ietqComando) {
        this.ietqComando = ietqComando;
    }

    public Date getIetqLastupdate() {
        return ietqLastupdate;
    }

    public void setIetqLastupdate(Date ietqLastupdate) {
        this.ietqLastupdate = ietqLastupdate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ietqId != null ? ietqId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImpressorasEtiquetas)) {
            return false;
        }
        ImpressorasEtiquetas other = (ImpressorasEtiquetas) object;
        if ((this.ietqId == null && other.ietqId != null) || (this.ietqId != null && !this.ietqId.equals(other.ietqId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.ImpressorasEtiquetas[ ietqId=" + ietqId + " ]";
    }
    
}
