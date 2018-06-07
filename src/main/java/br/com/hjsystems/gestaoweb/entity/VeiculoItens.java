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
@Table(name = "VEICULO_ITENS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VeiculoItens.findAll", query = "SELECT v FROM VeiculoItens v"),
    @NamedQuery(name = "VeiculoItens.findByVeitId", query = "SELECT v FROM VeiculoItens v WHERE v.veitId = :veitId"),
    @NamedQuery(name = "VeiculoItens.findByVeicId", query = "SELECT v FROM VeiculoItens v WHERE v.veicId = :veicId"),
    @NamedQuery(name = "VeiculoItens.findByVeicVeicId", query = "SELECT v FROM VeiculoItens v WHERE v.veicVeicId = :veicVeicId"),
    @NamedQuery(name = "VeiculoItens.findByVeitLastupdate", query = "SELECT v FROM VeiculoItens v WHERE v.veitLastupdate = :veitLastupdate")})
public class VeiculoItens implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "VEIT_ID")
    private String veitId;
    @Basic(optional = false)
    @Column(name = "VEIC_ID")
    private String veicId;
    @Basic(optional = false)
    @Column(name = "VEIC_VEIC_ID")
    private String veicVeicId;
    @Column(name = "VEIT_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date veitLastupdate;

    public VeiculoItens() {
    }

    public VeiculoItens(String veitId) {
        this.veitId = veitId;
    }

    public VeiculoItens(String veitId, String veicId, String veicVeicId) {
        this.veitId = veitId;
        this.veicId = veicId;
        this.veicVeicId = veicVeicId;
    }

    public String getVeitId() {
        return veitId;
    }

    public void setVeitId(String veitId) {
        this.veitId = veitId;
    }

    public String getVeicId() {
        return veicId;
    }

    public void setVeicId(String veicId) {
        this.veicId = veicId;
    }

    public String getVeicVeicId() {
        return veicVeicId;
    }

    public void setVeicVeicId(String veicVeicId) {
        this.veicVeicId = veicVeicId;
    }

    public Date getVeitLastupdate() {
        return veitLastupdate;
    }

    public void setVeitLastupdate(Date veitLastupdate) {
        this.veitLastupdate = veitLastupdate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (veitId != null ? veitId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VeiculoItens)) {
            return false;
        }
        VeiculoItens other = (VeiculoItens) object;
        if ((this.veitId == null && other.veitId != null) || (this.veitId != null && !this.veitId.equals(other.veitId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.VeiculoItens[ veitId=" + veitId + " ]";
    }
    
}
