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
@Table(name = "AGENCIAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Agencias.findAll", query = "SELECT a FROM Agencias a"),
    @NamedQuery(name = "Agencias.findByAgenId", query = "SELECT a FROM Agencias a WHERE a.agenId = :agenId"),
    @NamedQuery(name = "Agencias.findByAgenNumero", query = "SELECT a FROM Agencias a WHERE a.agenNumero = :agenNumero"),
    @NamedQuery(name = "Agencias.findByAgenApelido", query = "SELECT a FROM Agencias a WHERE a.agenApelido = :agenApelido"),
    @NamedQuery(name = "Agencias.findByAgenLASTUPDATE", query = "SELECT a FROM Agencias a WHERE a.agenLASTUPDATE = :agenLASTUPDATE")})
public class Agencias implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "AGEN_ID")
    private String agenId;
    @Column(name = "AGEN_NUMERO")
    private String agenNumero;
    @Column(name = "AGEN_APELIDO")
    private String agenApelido;
    @Column(name = "Agen_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date agenLASTUPDATE;
    @OneToMany(mappedBy = "agenId")
    private List<Cofres> cofresList;
    @OneToMany(mappedBy = "agenId")
    private List<AvisoMovimentoBancario> avisoMovimentoBancarioList;
    @JoinColumn(name = "BANC_ID", referencedColumnName = "BANC_ID")
    @ManyToOne
    private Bancos bancId;
    @JoinColumn(name = "PESS_ID", referencedColumnName = "PESS_ID")
    @ManyToOne
    private Pessoas pessId;

    public Agencias() {
    }

    public Agencias(String agenId) {
        this.agenId = agenId;
    }

    public String getAgenId() {
        return agenId;
    }

    public void setAgenId(String agenId) {
        this.agenId = agenId;
    }

    public String getAgenNumero() {
        return agenNumero;
    }

    public void setAgenNumero(String agenNumero) {
        this.agenNumero = agenNumero;
    }

    public String getAgenApelido() {
        return agenApelido;
    }

    public void setAgenApelido(String agenApelido) {
        this.agenApelido = agenApelido;
    }

    public Date getAgenLASTUPDATE() {
        return agenLASTUPDATE;
    }

    public void setAgenLASTUPDATE(Date agenLASTUPDATE) {
        this.agenLASTUPDATE = agenLASTUPDATE;
    }

    @XmlTransient
    public List<Cofres> getCofresList() {
        return cofresList;
    }

    public void setCofresList(List<Cofres> cofresList) {
        this.cofresList = cofresList;
    }

    @XmlTransient
    public List<AvisoMovimentoBancario> getAvisoMovimentoBancarioList() {
        return avisoMovimentoBancarioList;
    }

    public void setAvisoMovimentoBancarioList(List<AvisoMovimentoBancario> avisoMovimentoBancarioList) {
        this.avisoMovimentoBancarioList = avisoMovimentoBancarioList;
    }

    public Bancos getBancId() {
        return bancId;
    }

    public void setBancId(Bancos bancId) {
        this.bancId = bancId;
    }

    public Pessoas getPessId() {
        return pessId;
    }

    public void setPessId(Pessoas pessId) {
        this.pessId = pessId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (agenId != null ? agenId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Agencias)) {
            return false;
        }
        Agencias other = (Agencias) object;
        if ((this.agenId == null && other.agenId != null) || (this.agenId != null && !this.agenId.equals(other.agenId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.Agencias[ agenId=" + agenId + " ]";
    }
    
}
