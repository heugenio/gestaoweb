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
@Table(name = "EQUIVALENTES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Equivalentes.findAll", query = "SELECT e FROM Equivalentes e"),
    @NamedQuery(name = "Equivalentes.findByEqvlId", query = "SELECT e FROM Equivalentes e WHERE e.eqvlId = :eqvlId"),
    @NamedQuery(name = "Equivalentes.findByEqvlNome", query = "SELECT e FROM Equivalentes e WHERE e.eqvlNome = :eqvlNome"),
    @NamedQuery(name = "Equivalentes.findByEqvlLASTUPDATE", query = "SELECT e FROM Equivalentes e WHERE e.eqvlLASTUPDATE = :eqvlLASTUPDATE"),
    @NamedQuery(name = "Equivalentes.findByEqvlCodigo", query = "SELECT e FROM Equivalentes e WHERE e.eqvlCodigo = :eqvlCodigo")})
public class Equivalentes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "EQVL_ID")
    private String eqvlId;
    @Basic(optional = false)
    @Column(name = "EQVL_NOME")
    private String eqvlNome;
    @Column(name = "Eqvl_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date eqvlLASTUPDATE;
    @Basic(optional = false)
    @Column(name = "EQVL_CODIGO")
    private String eqvlCodigo;
    @OneToMany(mappedBy = "eqvlId")
    private List<Produtos> produtosList;

    public Equivalentes() {
    }

    public Equivalentes(String eqvlId) {
        this.eqvlId = eqvlId;
    }

    public Equivalentes(String eqvlId, String eqvlNome, String eqvlCodigo) {
        this.eqvlId = eqvlId;
        this.eqvlNome = eqvlNome;
        this.eqvlCodigo = eqvlCodigo;
    }

    public String getEqvlId() {
        return eqvlId;
    }

    public void setEqvlId(String eqvlId) {
        this.eqvlId = eqvlId;
    }

    public String getEqvlNome() {
        return eqvlNome;
    }

    public void setEqvlNome(String eqvlNome) {
        this.eqvlNome = eqvlNome;
    }

    public Date getEqvlLASTUPDATE() {
        return eqvlLASTUPDATE;
    }

    public void setEqvlLASTUPDATE(Date eqvlLASTUPDATE) {
        this.eqvlLASTUPDATE = eqvlLASTUPDATE;
    }

    public String getEqvlCodigo() {
        return eqvlCodigo;
    }

    public void setEqvlCodigo(String eqvlCodigo) {
        this.eqvlCodigo = eqvlCodigo;
    }

    @XmlTransient
    public List<Produtos> getProdutosList() {
        return produtosList;
    }

    public void setProdutosList(List<Produtos> produtosList) {
        this.produtosList = produtosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eqvlId != null ? eqvlId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Equivalentes)) {
            return false;
        }
        Equivalentes other = (Equivalentes) object;
        if ((this.eqvlId == null && other.eqvlId != null) || (this.eqvlId != null && !this.eqvlId.equals(other.eqvlId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.Equivalentes[ eqvlId=" + eqvlId + " ]";
    }
    
}
