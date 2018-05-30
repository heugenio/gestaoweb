/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hjsystems.gestaoweb.entity;

import java.io.Serializable;
import java.math.BigDecimal;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name = "ENDERECOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Enderecos.findAll", query = "SELECT e FROM Enderecos e"),
    @NamedQuery(name = "Enderecos.findByEndeId", query = "SELECT e FROM Enderecos e WHERE e.endeId = :endeId"),
    @NamedQuery(name = "Enderecos.findByEndeTipoLogradouro", query = "SELECT e FROM Enderecos e WHERE e.endeTipoLogradouro = :endeTipoLogradouro"),
    @NamedQuery(name = "Enderecos.findByEndeLogradouro", query = "SELECT e FROM Enderecos e WHERE e.endeLogradouro = :endeLogradouro"),
    @NamedQuery(name = "Enderecos.findByEndeNumero", query = "SELECT e FROM Enderecos e WHERE e.endeNumero = :endeNumero"),
    @NamedQuery(name = "Enderecos.findByEndeComplemento", query = "SELECT e FROM Enderecos e WHERE e.endeComplemento = :endeComplemento"),
    @NamedQuery(name = "Enderecos.findByEndeCep", query = "SELECT e FROM Enderecos e WHERE e.endeCep = :endeCep"),
    @NamedQuery(name = "Enderecos.findByEndeZona", query = "SELECT e FROM Enderecos e WHERE e.endeZona = :endeZona"),
    @NamedQuery(name = "Enderecos.findByEndeDistanciaKm", query = "SELECT e FROM Enderecos e WHERE e.endeDistanciaKm = :endeDistanciaKm"),
    @NamedQuery(name = "Enderecos.findByEndeObservacao", query = "SELECT e FROM Enderecos e WHERE e.endeObservacao = :endeObservacao"),
    @NamedQuery(name = "Enderecos.findByEndePadrao", query = "SELECT e FROM Enderecos e WHERE e.endePadrao = :endePadrao"),
    @NamedQuery(name = "Enderecos.findByEndeLASTUPDATE", query = "SELECT e FROM Enderecos e WHERE e.endeLASTUPDATE = :endeLASTUPDATE")})
public class Enderecos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Size(min = 1, max = 22)
    @Column(name = "ENDE_ID")
    private String endeId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ENDE_TIPO_LOGRADOURO")
    private String endeTipoLogradouro;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "ENDE_LOGRADOURO")
    private String endeLogradouro;
    @Size(max = 10)
    @Column(name = "ENDE_NUMERO")
    private String endeNumero;
    @Size(max = 100)
    @Column(name = "ENDE_COMPLEMENTO")
    private String endeComplemento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "ENDE_CEP")
    private String endeCep;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "ENDE_ZONA")
    private String endeZona;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ENDE_DISTANCIA_KM")
    private BigDecimal endeDistanciaKm;
    @Size(max = 5000)
    @Column(name = "ENDE_OBSERVACAO")
    private String endeObservacao;
    @Size(max = 3)
    @Column(name = "ENDE_PADRAO")
    private String endePadrao;
    @Column(name = "Ende_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endeLASTUPDATE;
    @JoinColumn(name = "BAIR_ID", referencedColumnName = "BAIR_ID")
    @ManyToOne
    private Bairros bairId;
    @JoinColumn(name = "MUNI_ID", referencedColumnName = "MUNI_ID")
    @ManyToOne
    private Municipios muniId;
    @JoinColumn(name = "PESS_ID", referencedColumnName = "PESS_ID")
    @ManyToOne
    private Pessoas pessId;
    @JoinColumn(name = "TPEN_ID", referencedColumnName = "TPEN_ID")
    @ManyToOne
    private TiposEndereco tpenId;

    public Enderecos() {
    }

    public Enderecos(String endeId) {
        this.endeId = endeId;
    }

    public Enderecos(String endeId, String endeTipoLogradouro, String endeLogradouro, String endeCep, String endeZona) {
        this.endeId = endeId;
        this.endeTipoLogradouro = endeTipoLogradouro;
        this.endeLogradouro = endeLogradouro;
        this.endeCep = endeCep;
        this.endeZona = endeZona;
    }

    public String getEndeId() {
        return endeId;
    }

    public void setEndeId(String endeId) {
        this.endeId = endeId;
    }

    public String getEndeTipoLogradouro() {
        return endeTipoLogradouro;
    }

    public void setEndeTipoLogradouro(String endeTipoLogradouro) {
        this.endeTipoLogradouro = endeTipoLogradouro;
    }

    public String getEndeLogradouro() {
        return endeLogradouro;
    }

    public void setEndeLogradouro(String endeLogradouro) {
        this.endeLogradouro = endeLogradouro;
    }

    public String getEndeNumero() {
        return endeNumero;
    }

    public void setEndeNumero(String endeNumero) {
        this.endeNumero = endeNumero;
    }

    public String getEndeComplemento() {
        return endeComplemento;
    }

    public void setEndeComplemento(String endeComplemento) {
        this.endeComplemento = endeComplemento;
    }

    public String getEndeCep() {
        return endeCep;
    }

    public void setEndeCep(String endeCep) {
        this.endeCep = endeCep;
    }

    public String getEndeZona() {
        return endeZona;
    }

    public void setEndeZona(String endeZona) {
        this.endeZona = endeZona;
    }

    public BigDecimal getEndeDistanciaKm() {
        return endeDistanciaKm;
    }

    public void setEndeDistanciaKm(BigDecimal endeDistanciaKm) {
        this.endeDistanciaKm = endeDistanciaKm;
    }

    public String getEndeObservacao() {
        return endeObservacao;
    }

    public void setEndeObservacao(String endeObservacao) {
        this.endeObservacao = endeObservacao;
    }

    public String getEndePadrao() {
        return endePadrao;
    }

    public void setEndePadrao(String endePadrao) {
        this.endePadrao = endePadrao;
    }

    public Date getEndeLASTUPDATE() {
        return endeLASTUPDATE;
    }

    public void setEndeLASTUPDATE(Date endeLASTUPDATE) {
        this.endeLASTUPDATE = endeLASTUPDATE;
    }

    public Bairros getBairId() {
        return bairId;
    }

    public void setBairId(Bairros bairId) {
        this.bairId = bairId;
    }

    public Municipios getMuniId() {
        return muniId;
    }

    public void setMuniId(Municipios muniId) {
        this.muniId = muniId;
    }

    @JsonIgnore
    public Pessoas getPessId() {
        return pessId;
    }

    public void setPessId(Pessoas pessId) {
        this.pessId = pessId;
    }

    public TiposEndereco getTpenId() {
        return tpenId;
    }

    public void setTpenId(TiposEndereco tpenId) {
        this.tpenId = tpenId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (endeId != null ? endeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Enderecos)) {
            return false;
        }
        Enderecos other = (Enderecos) object;
        if ((this.endeId == null && other.endeId != null) || (this.endeId != null && !this.endeId.equals(other.endeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.hjsystems.gestaoweb.entity.Enderecos[ endeId=" + endeId + " ]";
    }
    
}
