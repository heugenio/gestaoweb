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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "ETIQUETA_LAYOUT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EtiquetaLayout.findAll", query = "SELECT e FROM EtiquetaLayout e"),
    @NamedQuery(name = "EtiquetaLayout.findByEtlyId", query = "SELECT e FROM EtiquetaLayout e WHERE e.etlyId = :etlyId"),
    @NamedQuery(name = "EtiquetaLayout.findByEtlyNome", query = "SELECT e FROM EtiquetaLayout e WHERE e.etlyNome = :etlyNome"),
    @NamedQuery(name = "EtiquetaLayout.findByEtLyLASTUPDATE", query = "SELECT e FROM EtiquetaLayout e WHERE e.etLyLASTUPDATE = :etLyLASTUPDATE")})
public class EtiquetaLayout implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ETLY_ID")
    private String etlyId;
    @Basic(optional = false)
    @Column(name = "ETLY_NOME")
    private String etlyNome;
    @Column(name = "EtLy_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date etLyLASTUPDATE;
    @JoinColumn(name = "ETMD_ID", referencedColumnName = "ETMD_ID")
    @ManyToOne
    private EtiquetasModelos etmdId;
    @OneToMany(mappedBy = "etlyId")
    private List<EtiquetasCamposLayout> etiquetasCamposLayoutList;

    public EtiquetaLayout() {
    }

    public EtiquetaLayout(String etlyId) {
        this.etlyId = etlyId;
    }

    public EtiquetaLayout(String etlyId, String etlyNome) {
        this.etlyId = etlyId;
        this.etlyNome = etlyNome;
    }

    public String getEtlyId() {
        return etlyId;
    }

    public void setEtlyId(String etlyId) {
        this.etlyId = etlyId;
    }

    public String getEtlyNome() {
        return etlyNome;
    }

    public void setEtlyNome(String etlyNome) {
        this.etlyNome = etlyNome;
    }

    public Date getEtLyLASTUPDATE() {
        return etLyLASTUPDATE;
    }

    public void setEtLyLASTUPDATE(Date etLyLASTUPDATE) {
        this.etLyLASTUPDATE = etLyLASTUPDATE;
    }

    public EtiquetasModelos getEtmdId() {
        return etmdId;
    }

    public void setEtmdId(EtiquetasModelos etmdId) {
        this.etmdId = etmdId;
    }

    @XmlTransient
    public List<EtiquetasCamposLayout> getEtiquetasCamposLayoutList() {
        return etiquetasCamposLayoutList;
    }

    public void setEtiquetasCamposLayoutList(List<EtiquetasCamposLayout> etiquetasCamposLayoutList) {
        this.etiquetasCamposLayoutList = etiquetasCamposLayoutList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (etlyId != null ? etlyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EtiquetaLayout)) {
            return false;
        }
        EtiquetaLayout other = (EtiquetaLayout) object;
        if ((this.etlyId == null && other.etlyId != null) || (this.etlyId != null && !this.etlyId.equals(other.etlyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.EtiquetaLayout[ etlyId=" + etlyId + " ]";
    }
    
}
