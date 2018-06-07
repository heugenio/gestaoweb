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
@Table(name = "GRUPOS_CLIENTES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GruposClientes.findAll", query = "SELECT g FROM GruposClientes g"),
    @NamedQuery(name = "GruposClientes.findByGrclId", query = "SELECT g FROM GruposClientes g WHERE g.grclId = :grclId"),
    @NamedQuery(name = "GruposClientes.findByGrclNome", query = "SELECT g FROM GruposClientes g WHERE g.grclNome = :grclNome"),
    @NamedQuery(name = "GruposClientes.findByGrclLastupdate", query = "SELECT g FROM GruposClientes g WHERE g.grclLastupdate = :grclLastupdate")})
public class GruposClientes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "GRCL_ID")
    private String grclId;
    @Column(name = "GRCL_NOME")
    private String grclNome;
    @Column(name = "GRCL_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date grclLastupdate;
    @JoinColumn(name = "LMCR_ID", referencedColumnName = "LMCR_ID")
    @ManyToOne
    private LimitesCreditos lmcrId;
    @OneToMany(mappedBy = "grclId")
    private List<Clientes> clientesList;

    public GruposClientes() {
    }

    public GruposClientes(String grclId) {
        this.grclId = grclId;
    }

    public String getGrclId() {
        return grclId;
    }

    public void setGrclId(String grclId) {
        this.grclId = grclId;
    }

    public String getGrclNome() {
        return grclNome;
    }

    public void setGrclNome(String grclNome) {
        this.grclNome = grclNome;
    }

    public Date getGrclLastupdate() {
        return grclLastupdate;
    }

    public void setGrclLastupdate(Date grclLastupdate) {
        this.grclLastupdate = grclLastupdate;
    }

    public LimitesCreditos getLmcrId() {
        return lmcrId;
    }

    public void setLmcrId(LimitesCreditos lmcrId) {
        this.lmcrId = lmcrId;
    }

    @XmlTransient
    public List<Clientes> getClientesList() {
        return clientesList;
    }

    public void setClientesList(List<Clientes> clientesList) {
        this.clientesList = clientesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (grclId != null ? grclId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GruposClientes)) {
            return false;
        }
        GruposClientes other = (GruposClientes) object;
        if ((this.grclId == null && other.grclId != null) || (this.grclId != null && !this.grclId.equals(other.grclId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.GruposClientes[ grclId=" + grclId + " ]";
    }
    
}
