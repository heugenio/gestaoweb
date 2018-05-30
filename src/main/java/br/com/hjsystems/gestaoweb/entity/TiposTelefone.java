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

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name = "TIPOS_TELEFONE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TiposTelefone.findAll", query = "SELECT t FROM TiposTelefone t"),
    @NamedQuery(name = "TiposTelefone.findByTtelId", query = "SELECT t FROM TiposTelefone t WHERE t.ttelId = :ttelId"),
    @NamedQuery(name = "TiposTelefone.findByTtelNome", query = "SELECT t FROM TiposTelefone t WHERE t.ttelNome = :ttelNome"),
    @NamedQuery(name = "TiposTelefone.findByTTelLASTUPDATE", query = "SELECT t FROM TiposTelefone t WHERE t.tTelLASTUPDATE = :tTelLASTUPDATE"),
    @NamedQuery(name = "TiposTelefone.findByTtelOrdem", query = "SELECT t FROM TiposTelefone t WHERE t.ttelOrdem = :ttelOrdem")})
public class TiposTelefone implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 22)
    @Column(name = "TTEL_ID")
    private String ttelId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "TTEL_NOME")
    private String ttelNome;
    @Column(name = "TTel_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tTelLASTUPDATE;
    @Column(name = "TTEL_ORDEM")
    private Integer ttelOrdem;
    @OneToMany(mappedBy = "ttelId")
    @JsonIgnore
    private List<Telefones> telefonesList;

    public TiposTelefone() {
    }

    public TiposTelefone(String ttelId) {
        this.ttelId = ttelId;
    }

    public TiposTelefone(String ttelId, String ttelNome) {
        this.ttelId = ttelId;
        this.ttelNome = ttelNome;
    }

    public String getTtelId() {
        return ttelId;
    }

    public void setTtelId(String ttelId) {
        this.ttelId = ttelId;
    }

    public String getTtelNome() {
        return ttelNome;
    }

    public void setTtelNome(String ttelNome) {
        this.ttelNome = ttelNome;
    }

    public Date getTTelLASTUPDATE() {
        return tTelLASTUPDATE;
    }

    public void setTTelLASTUPDATE(Date tTelLASTUPDATE) {
        this.tTelLASTUPDATE = tTelLASTUPDATE;
    }

    public Integer getTtelOrdem() {
        return ttelOrdem;
    }

    public void setTtelOrdem(Integer ttelOrdem) {
        this.ttelOrdem = ttelOrdem;
    }

    @XmlTransient
    @JsonIgnore
    public List<Telefones> getTelefonesList() {
        return telefonesList;
    }

    public void setTelefonesList(List<Telefones> telefonesList) {
        this.telefonesList = telefonesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ttelId != null ? ttelId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TiposTelefone)) {
            return false;
        }
        TiposTelefone other = (TiposTelefone) object;
        if ((this.ttelId == null && other.ttelId != null) || (this.ttelId != null && !this.ttelId.equals(other.ttelId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.hjsystems.gestaoweb.entity.TiposTelefone[ ttelId=" + ttelId + " ]";
    }
    
}
