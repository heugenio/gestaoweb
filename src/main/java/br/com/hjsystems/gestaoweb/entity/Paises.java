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
@Table(name = "PAISES", catalog = "GriffePneus", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Paises.findAll", query = "SELECT p FROM Paises p"),
    @NamedQuery(name = "Paises.findByPaisId", query = "SELECT p FROM Paises p WHERE p.paisId = :paisId"),
    @NamedQuery(name = "Paises.findByPaisNome", query = "SELECT p FROM Paises p WHERE p.paisNome = :paisNome"),
    @NamedQuery(name = "Paises.findByPaisSigla", query = "SELECT p FROM Paises p WHERE p.paisSigla = :paisSigla"),
    @NamedQuery(name = "Paises.findByPaisCodigoReceitaFederal", query = "SELECT p FROM Paises p WHERE p.paisCodigoReceitaFederal = :paisCodigoReceitaFederal"),
    @NamedQuery(name = "Paises.findByPaisCodigoBacen", query = "SELECT p FROM Paises p WHERE p.paisCodigoBacen = :paisCodigoBacen"),
    @NamedQuery(name = "Paises.findByPaisLASTUPDATE", query = "SELECT p FROM Paises p WHERE p.paisLASTUPDATE = :paisLASTUPDATE")})
public class Paises implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 22)
    @Column(name = "PAIS_ID")
    private String paisId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "PAIS_NOME")
    private String paisNome;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "PAIS_SIGLA")
    private String paisSigla;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    @Column(name = "PAIS_CODIGO_RECEITA_FEDERAL")
    private String paisCodigoReceitaFederal;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    @Column(name = "PAIS_CODIGO_BACEN")
    private String paisCodigoBacen;
    @Column(name = "Pais_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date paisLASTUPDATE;
    @OneToMany(mappedBy = "paisId")
    private List<Estados> estadosList;

    public Paises() {
    }

    public Paises(String paisId) {
        this.paisId = paisId;
    }

    public Paises(String paisId, String paisNome, String paisSigla, String paisCodigoReceitaFederal, String paisCodigoBacen) {
        this.paisId = paisId;
        this.paisNome = paisNome;
        this.paisSigla = paisSigla;
        this.paisCodigoReceitaFederal = paisCodigoReceitaFederal;
        this.paisCodigoBacen = paisCodigoBacen;
    }

    public String getPaisId() {
        return paisId;
    }

    public void setPaisId(String paisId) {
        this.paisId = paisId;
    }

    public String getPaisNome() {
        return paisNome;
    }

    public void setPaisNome(String paisNome) {
        this.paisNome = paisNome;
    }

    public String getPaisSigla() {
        return paisSigla;
    }

    public void setPaisSigla(String paisSigla) {
        this.paisSigla = paisSigla;
    }

    public String getPaisCodigoReceitaFederal() {
        return paisCodigoReceitaFederal;
    }

    public void setPaisCodigoReceitaFederal(String paisCodigoReceitaFederal) {
        this.paisCodigoReceitaFederal = paisCodigoReceitaFederal;
    }

    public String getPaisCodigoBacen() {
        return paisCodigoBacen;
    }

    public void setPaisCodigoBacen(String paisCodigoBacen) {
        this.paisCodigoBacen = paisCodigoBacen;
    }

    public Date getPaisLASTUPDATE() {
        return paisLASTUPDATE;
    }

    public void setPaisLASTUPDATE(Date paisLASTUPDATE) {
        this.paisLASTUPDATE = paisLASTUPDATE;
    }

    @XmlTransient
    public List<Estados> getEstadosList() {
        return estadosList;
    }

    public void setEstadosList(List<Estados> estadosList) {
        this.estadosList = estadosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paisId != null ? paisId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Paises)) {
            return false;
        }
        Paises other = (Paises) object;
        if ((this.paisId == null && other.paisId != null) || (this.paisId != null && !this.paisId.equals(other.paisId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.hjsystems.gestaoweb.entity.Paises[ paisId=" + paisId + " ]";
    }
    
}
