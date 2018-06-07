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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name = "ROTAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rotas.findAll", query = "SELECT r FROM Rotas r"),
    @NamedQuery(name = "Rotas.findByRotaId", query = "SELECT r FROM Rotas r WHERE r.rotaId = :rotaId"),
    @NamedQuery(name = "Rotas.findByRotaNome", query = "SELECT r FROM Rotas r WHERE r.rotaNome = :rotaNome"),
    @NamedQuery(name = "Rotas.findByRotaCodigo", query = "SELECT r FROM Rotas r WHERE r.rotaCodigo = :rotaCodigo"),
    @NamedQuery(name = "Rotas.findByRotaLastupdate", query = "SELECT r FROM Rotas r WHERE r.rotaLastupdate = :rotaLastupdate")})
public class Rotas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ROTA_ID")
    private String rotaId;
    @Column(name = "ROTA_NOME")
    private String rotaNome;
    @Column(name = "ROTA_CODIGO")
    private String rotaCodigo;
    @Column(name = "ROTA_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rotaLastupdate;
    @OneToMany(mappedBy = "rotaId")
    private List<RotasBairros> rotasBairrosList;
    @OneToMany(mappedBy = "rotaId")
    private List<RomaneioEntregas> romaneioEntregasList;

    public Rotas() {
    }

    public Rotas(String rotaId) {
        this.rotaId = rotaId;
    }

    public String getRotaId() {
        return rotaId;
    }

    public void setRotaId(String rotaId) {
        this.rotaId = rotaId;
    }

    public String getRotaNome() {
        return rotaNome;
    }

    public void setRotaNome(String rotaNome) {
        this.rotaNome = rotaNome;
    }

    public String getRotaCodigo() {
        return rotaCodigo;
    }

    public void setRotaCodigo(String rotaCodigo) {
        this.rotaCodigo = rotaCodigo;
    }

    public Date getRotaLastupdate() {
        return rotaLastupdate;
    }

    public void setRotaLastupdate(Date rotaLastupdate) {
        this.rotaLastupdate = rotaLastupdate;
    }

    @XmlTransient
    public List<RotasBairros> getRotasBairrosList() {
        return rotasBairrosList;
    }

    public void setRotasBairrosList(List<RotasBairros> rotasBairrosList) {
        this.rotasBairrosList = rotasBairrosList;
    }

    @XmlTransient
    public List<RomaneioEntregas> getRomaneioEntregasList() {
        return romaneioEntregasList;
    }

    public void setRomaneioEntregasList(List<RomaneioEntregas> romaneioEntregasList) {
        this.romaneioEntregasList = romaneioEntregasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rotaId != null ? rotaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rotas)) {
            return false;
        }
        Rotas other = (Rotas) object;
        if ((this.rotaId == null && other.rotaId != null) || (this.rotaId != null && !this.rotaId.equals(other.rotaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.Rotas[ rotaId=" + rotaId + " ]";
    }
    
}
