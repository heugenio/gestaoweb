/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hjsystems.gestaoweb.entity;

import java.io.Serializable;
import java.math.BigDecimal;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name = "MUNICIPIOS")
@NamedQueries({
    @NamedQuery(name = "Municipios.findAll", query = "SELECT m FROM Municipios m"),
    @NamedQuery(name = "Municipios.findByMuniId", query = "SELECT m FROM Municipios m WHERE m.muniId = :muniId"),
    @NamedQuery(name = "Municipios.findByMuniNome", query = "SELECT m FROM Municipios m WHERE m.muniNome = :muniNome"),
    @NamedQuery(name = "Municipios.findByMuniDistanciaKm", query = "SELECT m FROM Municipios m WHERE m.muniDistanciaKm = :muniDistanciaKm"),
    @NamedQuery(name = "Municipios.findByMuniCep", query = "SELECT m FROM Municipios m WHERE m.muniCep = :muniCep"),
    @NamedQuery(name = "Municipios.findByMuniIbge", query = "SELECT m FROM Municipios m WHERE m.muniIbge = :muniIbge"),
    @NamedQuery(name = "Municipios.findByMuniLASTUPDATE", query = "SELECT m FROM Municipios m WHERE m.muniLASTUPDATE = :muniLASTUPDATE"),
    @NamedQuery(name = "Municipios.findByMuniCodDms", query = "SELECT m FROM Municipios m WHERE m.muniCodDms = :muniCodDms"),
    @NamedQuery(name = "Municipios.findByMuniNomePadrao", query = "SELECT m FROM Municipios m WHERE m.muniNomePadrao = :muniNomePadrao")})
public class Municipios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 22)
    @Column(name = "MUNI_ID")
    private String muniId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "MUNI_NOME")
    private String muniNome;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MUNI_DISTANCIA_KM")
    private BigDecimal muniDistanciaKm;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "MUNI_CEP")
    private String muniCep;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    @Column(name = "MUNI_IBGE")
    private String muniIbge;
    @Column(name = "Muni_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date muniLASTUPDATE;
    @Size(max = 10)
    @Column(name = "MUNI_COD_DMS")
    private String muniCodDms;
    @Size(max = 60)
    @Column(name = "MUNI_NOME_PADRAO")
    private String muniNomePadrao;
    @OneToMany(mappedBy = "muniId")
    private List<Pessoas> pessoasList;
    @JoinColumn(name = "ESTA_ID", referencedColumnName = "ESTA_ID")
    @ManyToOne
    private Estados estaId;
    @OneToMany(mappedBy = "munMuniId")
    private List<Municipios> municipiosList;
    @JoinColumn(name = "MUN_MUNI_ID", referencedColumnName = "MUNI_ID")
    @ManyToOne
    private Municipios munMuniId;

    public Municipios() {
    }

    public Municipios(String muniId) {
        this.muniId = muniId;
    }

    public Municipios(String muniId, String muniNome, String muniCep, String muniIbge) {
        this.muniId = muniId;
        this.muniNome = muniNome;
        this.muniCep = muniCep;
        this.muniIbge = muniIbge;
    }

    public String getMuniId() {
        return muniId;
    }

    public void setMuniId(String muniId) {
        this.muniId = muniId;
    }

    public String getMuniNome() {
        return muniNome;
    }

    public void setMuniNome(String muniNome) {
        this.muniNome = muniNome;
    }

    public BigDecimal getMuniDistanciaKm() {
        return muniDistanciaKm;
    }

    public void setMuniDistanciaKm(BigDecimal muniDistanciaKm) {
        this.muniDistanciaKm = muniDistanciaKm;
    }

    public String getMuniCep() {
        return muniCep;
    }

    public void setMuniCep(String muniCep) {
        this.muniCep = muniCep;
    }

    public String getMuniIbge() {
        return muniIbge;
    }

    public void setMuniIbge(String muniIbge) {
        this.muniIbge = muniIbge;
    }

    public Date getMuniLASTUPDATE() {
        return muniLASTUPDATE;
    }

    public void setMuniLASTUPDATE(Date muniLASTUPDATE) {
        this.muniLASTUPDATE = muniLASTUPDATE;
    }

    public String getMuniCodDms() {
        return muniCodDms;
    }

    public void setMuniCodDms(String muniCodDms) {
        this.muniCodDms = muniCodDms;
    }

    public String getMuniNomePadrao() {
        return muniNomePadrao;
    }

    public void setMuniNomePadrao(String muniNomePadrao) {
        this.muniNomePadrao = muniNomePadrao;
    }

    @XmlTransient
    public List<Pessoas> getPessoasList() {
        return pessoasList;
    }

    public void setPessoasList(List<Pessoas> pessoasList) {
        this.pessoasList = pessoasList;
    }

    public Estados getEstaId() {
        return estaId;
    }

    public void setEstaId(Estados estaId) {
        this.estaId = estaId;
    }

    @XmlTransient
    public List<Municipios> getMunicipiosList() {
        return municipiosList;
    }

    public void setMunicipiosList(List<Municipios> municipiosList) {
        this.municipiosList = municipiosList;
    }

    public Municipios getMunMuniId() {
        return munMuniId;
    }

    public void setMunMuniId(Municipios munMuniId) {
        this.munMuniId = munMuniId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (muniId != null ? muniId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Municipios)) {
            return false;
        }
        Municipios other = (Municipios) object;
        if ((this.muniId == null && other.muniId != null) || (this.muniId != null && !this.muniId.equals(other.muniId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.hjsystems.gestaoweb.entity.Municipios[ muniId=" + muniId + " ]";
    }
    
}
