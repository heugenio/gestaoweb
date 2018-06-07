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
@Table(name = "VEICULOS_CLIENTES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VeiculosClientes.findAll", query = "SELECT v FROM VeiculosClientes v"),
    @NamedQuery(name = "VeiculosClientes.findByVcclId", query = "SELECT v FROM VeiculosClientes v WHERE v.vcclId = :vcclId")})
public class VeiculosClientes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "VCCL_ID")
    private String vcclId;
    @JoinColumn(name = "PESS_ID", referencedColumnName = "PESS_ID")
    @ManyToOne
    private Pessoas pessId;
    @JoinColumn(name = "VEIC_ID", referencedColumnName = "VEIC_ID")
    @ManyToOne
    private Veiculo veicId;

    public VeiculosClientes() {
    }

    public VeiculosClientes(String vcclId) {
        this.vcclId = vcclId;
    }

    public String getVcclId() {
        return vcclId;
    }

    public void setVcclId(String vcclId) {
        this.vcclId = vcclId;
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
        hash += (vcclId != null ? vcclId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VeiculosClientes)) {
            return false;
        }
        VeiculosClientes other = (VeiculosClientes) object;
        if ((this.vcclId == null && other.vcclId != null) || (this.vcclId != null && !this.vcclId.equals(other.vcclId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.VeiculosClientes[ vcclId=" + vcclId + " ]";
    }
    
}
