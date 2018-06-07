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
@Table(name = "FERIADOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Feriados.findAll", query = "SELECT f FROM Feriados f"),
    @NamedQuery(name = "Feriados.findByFeriId", query = "SELECT f FROM Feriados f WHERE f.feriId = :feriId"),
    @NamedQuery(name = "Feriados.findByFeriNome", query = "SELECT f FROM Feriados f WHERE f.feriNome = :feriNome"),
    @NamedQuery(name = "Feriados.findByFeriData", query = "SELECT f FROM Feriados f WHERE f.feriData = :feriData"),
    @NamedQuery(name = "Feriados.findByFeriLASTUPDATE", query = "SELECT f FROM Feriados f WHERE f.feriLASTUPDATE = :feriLASTUPDATE")})
public class Feriados implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "FERI_ID")
    private String feriId;
    @Basic(optional = false)
    @Column(name = "FERI_NOME")
    private String feriNome;
    @Basic(optional = false)
    @Column(name = "FERI_DATA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date feriData;
    @Column(name = "Feri_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date feriLASTUPDATE;

    public Feriados() {
    }

    public Feriados(String feriId) {
        this.feriId = feriId;
    }

    public Feriados(String feriId, String feriNome, Date feriData) {
        this.feriId = feriId;
        this.feriNome = feriNome;
        this.feriData = feriData;
    }

    public String getFeriId() {
        return feriId;
    }

    public void setFeriId(String feriId) {
        this.feriId = feriId;
    }

    public String getFeriNome() {
        return feriNome;
    }

    public void setFeriNome(String feriNome) {
        this.feriNome = feriNome;
    }

    public Date getFeriData() {
        return feriData;
    }

    public void setFeriData(Date feriData) {
        this.feriData = feriData;
    }

    public Date getFeriLASTUPDATE() {
        return feriLASTUPDATE;
    }

    public void setFeriLASTUPDATE(Date feriLASTUPDATE) {
        this.feriLASTUPDATE = feriLASTUPDATE;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (feriId != null ? feriId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Feriados)) {
            return false;
        }
        Feriados other = (Feriados) object;
        if ((this.feriId == null && other.feriId != null) || (this.feriId != null && !this.feriId.equals(other.feriId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.Feriados[ feriId=" + feriId + " ]";
    }
    
}
