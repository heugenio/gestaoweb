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
@Table(name = "ESPECIALIDADES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Especialidades.findAll", query = "SELECT e FROM Especialidades e"),
    @NamedQuery(name = "Especialidades.findByEspdId", query = "SELECT e FROM Especialidades e WHERE e.espdId = :espdId"),
    @NamedQuery(name = "Especialidades.findByEspdNome", query = "SELECT e FROM Especialidades e WHERE e.espdNome = :espdNome"),
    @NamedQuery(name = "Especialidades.findByEspdLASTUPDATE", query = "SELECT e FROM Especialidades e WHERE e.espdLASTUPDATE = :espdLASTUPDATE")})
public class Especialidades implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ESPD_ID")
    private String espdId;
    @Basic(optional = false)
    @Column(name = "ESPD_NOME")
    private String espdNome;
    @Column(name = "Espd_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date espdLASTUPDATE;
    @OneToMany(mappedBy = "espdId")
    private List<Contadores> contadoresList;

    public Especialidades() {
    }

    public Especialidades(String espdId) {
        this.espdId = espdId;
    }

    public Especialidades(String espdId, String espdNome) {
        this.espdId = espdId;
        this.espdNome = espdNome;
    }

    public String getEspdId() {
        return espdId;
    }

    public void setEspdId(String espdId) {
        this.espdId = espdId;
    }

    public String getEspdNome() {
        return espdNome;
    }

    public void setEspdNome(String espdNome) {
        this.espdNome = espdNome;
    }

    public Date getEspdLASTUPDATE() {
        return espdLASTUPDATE;
    }

    public void setEspdLASTUPDATE(Date espdLASTUPDATE) {
        this.espdLASTUPDATE = espdLASTUPDATE;
    }

    @XmlTransient
    public List<Contadores> getContadoresList() {
        return contadoresList;
    }

    public void setContadoresList(List<Contadores> contadoresList) {
        this.contadoresList = contadoresList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (espdId != null ? espdId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Especialidades)) {
            return false;
        }
        Especialidades other = (Especialidades) object;
        if ((this.espdId == null && other.espdId != null) || (this.espdId != null && !this.espdId.equals(other.espdId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.Especialidades[ espdId=" + espdId + " ]";
    }
    
}
