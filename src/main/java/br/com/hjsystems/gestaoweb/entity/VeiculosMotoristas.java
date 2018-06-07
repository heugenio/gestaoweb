/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hjsystems.gestaoweb.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name = "VEICULOS_MOTORISTAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VeiculosMotoristas.findAll", query = "SELECT v FROM VeiculosMotoristas v"),
    @NamedQuery(name = "VeiculosMotoristas.findByVcmtId", query = "SELECT v FROM VeiculosMotoristas v WHERE v.vcmtId = :vcmtId")})
public class VeiculosMotoristas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "VCMT_ID")
    private String vcmtId;
    @JoinColumn(name = "PESS_ID", referencedColumnName = "PESS_ID")
    @ManyToOne
    private Pessoas pessId;
    @JoinColumn(name = "VEIC_ID", referencedColumnName = "VEIC_ID")
    @ManyToOne
    private Veiculo veicId;

    public VeiculosMotoristas() {
    }

    public VeiculosMotoristas(String vcmtId) {
        this.vcmtId = vcmtId;
    }

    public String getVcmtId() {
        return vcmtId;
    }

    public void setVcmtId(String vcmtId) {
        this.vcmtId = vcmtId;
    }

    public Pessoas getPessId() {
        return pessId;
    }

    public void setPessId(Pessoas pessId) {
        this.pessId = pessId;
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
        hash += (vcmtId != null ? vcmtId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VeiculosMotoristas)) {
            return false;
        }
        VeiculosMotoristas other = (VeiculosMotoristas) object;
        if ((this.vcmtId == null && other.vcmtId != null) || (this.vcmtId != null && !this.vcmtId.equals(other.vcmtId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.VeiculosMotoristas[ vcmtId=" + vcmtId + " ]";
    }
    
}
