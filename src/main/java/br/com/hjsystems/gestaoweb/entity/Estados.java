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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name = "ESTADOS")
@NamedQueries({
    @NamedQuery(name = "Estados.findAll", query = "SELECT e FROM Estados e"),
    @NamedQuery(name = "Estados.findByEstaId", query = "SELECT e FROM Estados e WHERE e.estaId = :estaId"),
    @NamedQuery(name = "Estados.findByEstaNome", query = "SELECT e FROM Estados e WHERE e.estaNome = :estaNome"),
    @NamedQuery(name = "Estados.findByEstaUf", query = "SELECT e FROM Estados e WHERE e.estaUf = :estaUf"),
    @NamedQuery(name = "Estados.findByEstaPreposicao", query = "SELECT e FROM Estados e WHERE e.estaPreposicao = :estaPreposicao"),
    @NamedQuery(name = "Estados.findByEstaIbge", query = "SELECT e FROM Estados e WHERE e.estaIbge = :estaIbge"),
    @NamedQuery(name = "Estados.findByEstaLASTUPDATE", query = "SELECT e FROM Estados e WHERE e.estaLASTUPDATE = :estaLASTUPDATE")})
public class Estados implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 22)
    @Column(name = "ESTA_ID")
    private String estaId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "ESTA_NOME")
    private String estaNome;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "ESTA_UF")
    private String estaUf;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "ESTA_PREPOSICAO")
    private String estaPreposicao;
    @Size(max = 10)
    @Column(name = "ESTA_IBGE")
    private String estaIbge;
    @Column(name = "Esta_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date estaLASTUPDATE;
    @JoinColumn(name = "PAIS_ID", referencedColumnName = "PAIS_ID")
    @ManyToOne
    private Paises paisId;
    @OneToMany(mappedBy = "estaId")
    private List<Municipios> municipiosList;

    public Estados() {
    }

    public Estados(String estaId) {
        this.estaId = estaId;
    }

    public Estados(String estaId, String estaNome, String estaUf, String estaPreposicao) {
        this.estaId = estaId;
        this.estaNome = estaNome;
        this.estaUf = estaUf;
        this.estaPreposicao = estaPreposicao;
    }

    public String getEstaId() {
        return estaId;
    }

    public void setEstaId(String estaId) {
        this.estaId = estaId;
    }

    public String getEstaNome() {
        return estaNome;
    }

    public void setEstaNome(String estaNome) {
        this.estaNome = estaNome;
    }

    public String getEstaUf() {
        return estaUf;
    }

    public void setEstaUf(String estaUf) {
        this.estaUf = estaUf;
    }

    public String getEstaPreposicao() {
        return estaPreposicao;
    }

    public void setEstaPreposicao(String estaPreposicao) {
        this.estaPreposicao = estaPreposicao;
    }

    public String getEstaIbge() {
        return estaIbge;
    }

    public void setEstaIbge(String estaIbge) {
        this.estaIbge = estaIbge;
    }

    public Date getEstaLASTUPDATE() {
        return estaLASTUPDATE;
    }

    public void setEstaLASTUPDATE(Date estaLASTUPDATE) {
        this.estaLASTUPDATE = estaLASTUPDATE;
    }

    public Paises getPaisId() {
        return paisId;
    }

    public void setPaisId(Paises paisId) {
        this.paisId = paisId;
    }

    @XmlTransient
    public List<Municipios> getMunicipiosList() {
        return municipiosList;
    }

    public void setMunicipiosList(List<Municipios> municipiosList) {
        this.municipiosList = municipiosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (estaId != null ? estaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estados)) {
            return false;
        }
        Estados other = (Estados) object;
        if ((this.estaId == null && other.estaId != null) || (this.estaId != null && !this.estaId.equals(other.estaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.hjsystems.gestaoweb.entity.Estados[ estaId=" + estaId + " ]";
    }
    
}
