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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name = "BAIRROS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bairros.findAll", query = "SELECT b FROM Bairros b"),
    @NamedQuery(name = "Bairros.findByBairId", query = "SELECT b FROM Bairros b WHERE b.bairId = :bairId"),
    @NamedQuery(name = "Bairros.findByBairNome", query = "SELECT b FROM Bairros b WHERE b.bairNome = :bairNome"),
    @NamedQuery(name = "Bairros.findByBairLASTUPDATE", query = "SELECT b FROM Bairros b WHERE b.bairLASTUPDATE = :bairLASTUPDATE")})
public class Bairros implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Size(min = 1, max = 22)
    @Column(name = "BAIR_ID")
    private String bairId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "BAIR_NOME")
    private String bairNome;
    @Column(name = "Bair_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date bairLASTUPDATE;

    public Bairros() {
    }

    public Bairros(String bairId) {
        this.bairId = bairId;
    }

    public Bairros(String bairId, String bairNome) {
        this.bairId = bairId;
        this.bairNome = bairNome;
    }

    public String getBairId() {
        return bairId;
    }

    public void setBairId(String bairId) {
        this.bairId = bairId;
    }

    public String getBairNome() {
        return bairNome;
    }

    public void setBairNome(String bairNome) {
        this.bairNome = bairNome;
    }

    public Date getBairLASTUPDATE() {
        return bairLASTUPDATE;
    }

    public void setBairLASTUPDATE(Date bairLASTUPDATE) {
        this.bairLASTUPDATE = bairLASTUPDATE;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bairId != null ? bairId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bairros)) {
            return false;
        }
        Bairros other = (Bairros) object;
        if ((this.bairId == null && other.bairId != null) || (this.bairId != null && !this.bairId.equals(other.bairId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.hjsystems.gestaoweb.entity.Bairros[ bairId=" + bairId + " ]";
    }
    
}
