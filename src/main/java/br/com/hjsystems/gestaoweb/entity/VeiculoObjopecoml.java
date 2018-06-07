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
@Table(name = "VEICULO_OBJOPECOML")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VeiculoObjopecoml.findAll", query = "SELECT v FROM VeiculoObjopecoml v"),
    @NamedQuery(name = "VeiculoObjopecoml.findByVoocId", query = "SELECT v FROM VeiculoObjopecoml v WHERE v.voocId = :voocId"),
    @NamedQuery(name = "VeiculoObjopecoml.findByVoocLastupdate", query = "SELECT v FROM VeiculoObjopecoml v WHERE v.voocLastupdate = :voocLastupdate")})
public class VeiculoObjopecoml implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "VOOC_ID")
    private String voocId;
    @Column(name = "VOOC_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date voocLastupdate;
    @JoinColumn(name = "OOPC_ID", referencedColumnName = "OOPC_ID")
    @ManyToOne
    private ObjetosOpeComercial oopcId;
    @JoinColumn(name = "VEIC_ID", referencedColumnName = "VEIC_ID")
    @ManyToOne
    private Veiculo veicId;

    public VeiculoObjopecoml() {
    }

    public VeiculoObjopecoml(String voocId) {
        this.voocId = voocId;
    }

    public String getVoocId() {
        return voocId;
    }

    public void setVoocId(String voocId) {
        this.voocId = voocId;
    }

    public Date getVoocLastupdate() {
        return voocLastupdate;
    }

    public void setVoocLastupdate(Date voocLastupdate) {
        this.voocLastupdate = voocLastupdate;
    }

    public ObjetosOpeComercial getOopcId() {
        return oopcId;
    }

    public void setOopcId(ObjetosOpeComercial oopcId) {
        this.oopcId = oopcId;
    }

    public Veiculo getVeicId() {
        return veicId;
    }

    public void setVeicId(Veiculo veicId) {
        this.veicId = veicId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (voocId != null ? voocId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VeiculoObjopecoml)) {
            return false;
        }
        VeiculoObjopecoml other = (VeiculoObjopecoml) object;
        if ((this.voocId == null && other.voocId != null) || (this.voocId != null && !this.voocId.equals(other.voocId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.VeiculoObjopecoml[ voocId=" + voocId + " ]";
    }
    
}
