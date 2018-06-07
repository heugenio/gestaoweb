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
@Table(name = "USUARIOS_GRUPOS_USUARIOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UsuariosGruposUsuarios.findAll", query = "SELECT u FROM UsuariosGruposUsuarios u"),
    @NamedQuery(name = "UsuariosGruposUsuarios.findByUsguId", query = "SELECT u FROM UsuariosGruposUsuarios u WHERE u.usguId = :usguId"),
    @NamedQuery(name = "UsuariosGruposUsuarios.findByUsGULASTUPDATE", query = "SELECT u FROM UsuariosGruposUsuarios u WHERE u.usGULASTUPDATE = :usGULASTUPDATE")})
public class UsuariosGruposUsuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "USGU_ID")
    private String usguId;
    @Column(name = "UsGU_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date usGULASTUPDATE;
    @JoinColumn(name = "USRS_ID", referencedColumnName = "USRS_ID")
    @ManyToOne
    private Usuarios usrsId;

    public UsuariosGruposUsuarios() {
    }

    public UsuariosGruposUsuarios(String usguId) {
        this.usguId = usguId;
    }

    public String getUsguId() {
        return usguId;
    }

    public void setUsguId(String usguId) {
        this.usguId = usguId;
    }

    public Date getUsGULASTUPDATE() {
        return usGULASTUPDATE;
    }

    public void setUsGULASTUPDATE(Date usGULASTUPDATE) {
        this.usGULASTUPDATE = usGULASTUPDATE;
    }

    public Usuarios getUsrsId() {
        return usrsId;
    }

    public void setUsrsId(Usuarios usrsId) {
        this.usrsId = usrsId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usguId != null ? usguId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuariosGruposUsuarios)) {
            return false;
        }
        UsuariosGruposUsuarios other = (UsuariosGruposUsuarios) object;
        if ((this.usguId == null && other.usguId != null) || (this.usguId != null && !this.usguId.equals(other.usguId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.UsuariosGruposUsuarios[ usguId=" + usguId + " ]";
    }
    
}
