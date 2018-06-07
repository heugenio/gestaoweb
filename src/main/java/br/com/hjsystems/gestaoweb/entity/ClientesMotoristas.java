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
@Table(name = "CLIENTES_MOTORISTAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ClientesMotoristas.findAll", query = "SELECT c FROM ClientesMotoristas c"),
    @NamedQuery(name = "ClientesMotoristas.findByClmtId", query = "SELECT c FROM ClientesMotoristas c WHERE c.clmtId = :clmtId")})
public class ClientesMotoristas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CLMT_ID")
    private String clmtId;
    @JoinColumn(name = "PESS_ID", referencedColumnName = "PESS_ID")
    @ManyToOne
    private Pessoas pessId;
    @JoinColumn(name = "PES_PESS_ID", referencedColumnName = "PESS_ID")
    @ManyToOne
    private Pessoas pesPessId;

    public ClientesMotoristas() {
    }

    public ClientesMotoristas(String clmtId) {
        this.clmtId = clmtId;
    }

    public String getClmtId() {
        return clmtId;
    }

    public void setClmtId(String clmtId) {
        this.clmtId = clmtId;
    }

    public Pessoas getPessId() {
        return pessId;
    }

    public void setPessId(Pessoas pessId) {
        this.pessId = pessId;
    }

    public Pessoas getPesPessId() {
        return pesPessId;
    }

    public void setPesPessId(Pessoas pesPessId) {
        this.pesPessId = pesPessId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (clmtId != null ? clmtId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClientesMotoristas)) {
            return false;
        }
        ClientesMotoristas other = (ClientesMotoristas) object;
        if ((this.clmtId == null && other.clmtId != null) || (this.clmtId != null && !this.clmtId.equals(other.clmtId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.ClientesMotoristas[ clmtId=" + clmtId + " ]";
    }
    
}
