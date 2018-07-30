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
@Table(name = "BAIRROS_MUNICIPIOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BairrosMunicipios.findAll", query = "SELECT b FROM BairrosMunicipios b"),
    @NamedQuery(name = "BairrosMunicipios.findByBrmuId", query = "SELECT b FROM BairrosMunicipios b WHERE b.brmuId = :brmuId"),
    @NamedQuery(name = "BairrosMunicipios.findByBrMuLASTUPDATE", query = "SELECT b FROM BairrosMunicipios b WHERE b.brMuLASTUPDATE = :brMuLASTUPDATE")})
public class BairrosMunicipios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "BRMU_ID")
    private String brmuId;
    @Column(name = "BrMu_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date brMuLASTUPDATE;
//    @OneToMany(mappedBy = "brmuId")
//    private List<RotasBairros> rotasBairrosList;
    @JoinColumn(name = "BAIR_ID", referencedColumnName = "BAIR_ID")
    @ManyToOne
    private Bairros bairId;
    @JoinColumn(name = "MUNI_ID", referencedColumnName = "MUNI_ID")
    @ManyToOne
    private Municipios muniId;

    public BairrosMunicipios() {
    }

    public BairrosMunicipios(String brmuId) {
        this.brmuId = brmuId;
    }

    public String getBrmuId() {
        return brmuId;
    }

    public void setBrmuId(String brmuId) {
        this.brmuId = brmuId;
    }

    public Date getBrMuLASTUPDATE() {
        return brMuLASTUPDATE;
    }

    public void setBrMuLASTUPDATE(Date brMuLASTUPDATE) {
        this.brMuLASTUPDATE = brMuLASTUPDATE;
    }

//    @XmlTransient
//    public List<RotasBairros> getRotasBairrosList() {
//        return rotasBairrosList;
//    }
//
//    public void setRotasBairrosList(List<RotasBairros> rotasBairrosList) {
//        this.rotasBairrosList = rotasBairrosList;
//    }

    public Bairros getBairId() {
        return bairId;
    }

    public void setBairId(Bairros bairId) {
        this.bairId = bairId;
    }

    public Municipios getMuniId() {
        return muniId;
    }

    public void setMuniId(Municipios muniId) {
        this.muniId = muniId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (brmuId != null ? brmuId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BairrosMunicipios)) {
            return false;
        }
        BairrosMunicipios other = (BairrosMunicipios) object;
        if ((this.brmuId == null && other.brmuId != null) || (this.brmuId != null && !this.brmuId.equals(other.brmuId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.BairrosMunicipios[ brmuId=" + brmuId + " ]";
    }
    
}
