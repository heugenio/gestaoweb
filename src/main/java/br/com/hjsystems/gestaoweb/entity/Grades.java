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
@Table(name = "GRADES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Grades.findAll", query = "SELECT g FROM Grades g"),
    @NamedQuery(name = "Grades.findByGrdeId", query = "SELECT g FROM Grades g WHERE g.grdeId = :grdeId"),
    @NamedQuery(name = "Grades.findByGrdeSigla", query = "SELECT g FROM Grades g WHERE g.grdeSigla = :grdeSigla"),
    @NamedQuery(name = "Grades.findByGrdeNome", query = "SELECT g FROM Grades g WHERE g.grdeNome = :grdeNome"),
    @NamedQuery(name = "Grades.findByGrdeLastupdate", query = "SELECT g FROM Grades g WHERE g.grdeLastupdate = :grdeLastupdate")})
public class Grades implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "GRDE_ID")
    private String grdeId;
    @Column(name = "GRDE_SIGLA")
    private String grdeSigla;
    @Column(name = "GRDE_NOME")
    private String grdeNome;
    @Column(name = "GRDE_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date grdeLastupdate;
    @OneToMany(mappedBy = "grdeId")
    private List<GradesElementos> gradesElementosList;

    public Grades() {
    }

    public Grades(String grdeId) {
        this.grdeId = grdeId;
    }

    public String getGrdeId() {
        return grdeId;
    }

    public void setGrdeId(String grdeId) {
        this.grdeId = grdeId;
    }

    public String getGrdeSigla() {
        return grdeSigla;
    }

    public void setGrdeSigla(String grdeSigla) {
        this.grdeSigla = grdeSigla;
    }

    public String getGrdeNome() {
        return grdeNome;
    }

    public void setGrdeNome(String grdeNome) {
        this.grdeNome = grdeNome;
    }

    public Date getGrdeLastupdate() {
        return grdeLastupdate;
    }

    public void setGrdeLastupdate(Date grdeLastupdate) {
        this.grdeLastupdate = grdeLastupdate;
    }

    @XmlTransient
    public List<GradesElementos> getGradesElementosList() {
        return gradesElementosList;
    }

    public void setGradesElementosList(List<GradesElementos> gradesElementosList) {
        this.gradesElementosList = gradesElementosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (grdeId != null ? grdeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Grades)) {
            return false;
        }
        Grades other = (Grades) object;
        if ((this.grdeId == null && other.grdeId != null) || (this.grdeId != null && !this.grdeId.equals(other.grdeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.Grades[ grdeId=" + grdeId + " ]";
    }
    
}
