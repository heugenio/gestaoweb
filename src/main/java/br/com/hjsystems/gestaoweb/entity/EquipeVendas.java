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
@Table(name = "EQUIPE_VENDAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EquipeVendas.findAll", query = "SELECT e FROM EquipeVendas e"),
    @NamedQuery(name = "EquipeVendas.findByEqvdId", query = "SELECT e FROM EquipeVendas e WHERE e.eqvdId = :eqvdId"),
    @NamedQuery(name = "EquipeVendas.findByEqvdNome", query = "SELECT e FROM EquipeVendas e WHERE e.eqvdNome = :eqvdNome"),
    @NamedQuery(name = "EquipeVendas.findByEqVdLASTUPDATE", query = "SELECT e FROM EquipeVendas e WHERE e.eqVdLASTUPDATE = :eqVdLASTUPDATE")})
public class EquipeVendas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "EQVD_ID")
    private String eqvdId;
    @Basic(optional = false)
    @Column(name = "EQVD_NOME")
    private String eqvdNome;
    @Column(name = "EqVd_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date eqVdLASTUPDATE;
    @JoinColumn(name = "VDDR_ID", referencedColumnName = "VDDR_ID")
    @ManyToOne
    private Vendedores vddrId;
    @OneToMany(mappedBy = "eqvdId")
    private List<Vendedores> vendedoresList;

    public EquipeVendas() {
    }

    public EquipeVendas(String eqvdId) {
        this.eqvdId = eqvdId;
    }

    public EquipeVendas(String eqvdId, String eqvdNome) {
        this.eqvdId = eqvdId;
        this.eqvdNome = eqvdNome;
    }

    public String getEqvdId() {
        return eqvdId;
    }

    public void setEqvdId(String eqvdId) {
        this.eqvdId = eqvdId;
    }

    public String getEqvdNome() {
        return eqvdNome;
    }

    public void setEqvdNome(String eqvdNome) {
        this.eqvdNome = eqvdNome;
    }

    public Date getEqVdLASTUPDATE() {
        return eqVdLASTUPDATE;
    }

    public void setEqVdLASTUPDATE(Date eqVdLASTUPDATE) {
        this.eqVdLASTUPDATE = eqVdLASTUPDATE;
    }

    public Vendedores getVddrId() {
        return vddrId;
    }

    public void setVddrId(Vendedores vddrId) {
        this.vddrId = vddrId;
    }

    @XmlTransient
    public List<Vendedores> getVendedoresList() {
        return vendedoresList;
    }

    public void setVendedoresList(List<Vendedores> vendedoresList) {
        this.vendedoresList = vendedoresList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eqvdId != null ? eqvdId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EquipeVendas)) {
            return false;
        }
        EquipeVendas other = (EquipeVendas) object;
        if ((this.eqvdId == null && other.eqvdId != null) || (this.eqvdId != null && !this.eqvdId.equals(other.eqvdId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.EquipeVendas[ eqvdId=" + eqvdId + " ]";
    }
    
}
