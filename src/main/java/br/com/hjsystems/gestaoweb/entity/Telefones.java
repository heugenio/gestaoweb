/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hjsystems.gestaoweb.entity;

import java.io.Serializable;
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
@Table(name = "TELEFONES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Telefones.findAll", query = "SELECT t FROM Telefones t"),
    @NamedQuery(name = "Telefones.findByTeleId", query = "SELECT t FROM Telefones t WHERE t.teleId = :teleId"),
    @NamedQuery(name = "Telefones.findByTeleDdi", query = "SELECT t FROM Telefones t WHERE t.teleDdi = :teleDdi"),
    @NamedQuery(name = "Telefones.findByTeleDdd", query = "SELECT t FROM Telefones t WHERE t.teleDdd = :teleDdd"),
    @NamedQuery(name = "Telefones.findByTeleNumero", query = "SELECT t FROM Telefones t WHERE t.teleNumero = :teleNumero"),
    @NamedQuery(name = "Telefones.findByTeleRamal", query = "SELECT t FROM Telefones t WHERE t.teleRamal = :teleRamal"),
    @NamedQuery(name = "Telefones.findByTeleObservacao", query = "SELECT t FROM Telefones t WHERE t.teleObservacao = :teleObservacao"),
    @NamedQuery(name = "Telefones.findByTeleLASTUPDATE", query = "SELECT t FROM Telefones t WHERE t.teleLASTUPDATE = :teleLASTUPDATE")})
public class Telefones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 22)
    @Column(name = "TELE_ID")
    private String teleId;
    @Size(max = 3)
    @Column(name = "TELE_DDI")
    private String teleDdi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "TELE_DDD")
    private String teleDdd;
    @Size(max = 11)
    @Column(name = "TELE_NUMERO")
    private String teleNumero;
    @Column(name = "TELE_RAMAL")
    private Integer teleRamal;
    @Size(max = 5000)
    @Column(name = "TELE_OBSERVACAO")
    private String teleObservacao;
    @Column(name = "Tele_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date teleLASTUPDATE;
    @JoinColumn(name = "PESS_ID", referencedColumnName = "PESS_ID")
    @ManyToOne
    @JsonIgnore
    private Pessoas pessId;
    @JoinColumn(name = "TTEL_ID", referencedColumnName = "TTEL_ID")
    @ManyToOne
    private TiposTelefone ttelId;

    public Telefones() {
    }

    public Telefones(String teleId) {
        this.teleId = teleId;
    }

    public Telefones(String teleId, String teleDdd) {
        this.teleId = teleId;
        this.teleDdd = teleDdd;
    }

    public String getTeleId() {
        return teleId;
    }

    public void setTeleId(String teleId) {
        this.teleId = teleId;
    }

    public String getTeleDdi() {
        return teleDdi;
    }

    public void setTeleDdi(String teleDdi) {
        this.teleDdi = teleDdi;
    }

    public String getTeleDdd() {
        return teleDdd;
    }

    public void setTeleDdd(String teleDdd) {
        this.teleDdd = teleDdd;
    }

    public String getTeleNumero() {
        return teleNumero;
    }

    public void setTeleNumero(String teleNumero) {
        this.teleNumero = teleNumero;
    }

    public Integer getTeleRamal() {
        return teleRamal;
    }

    public void setTeleRamal(Integer teleRamal) {
        this.teleRamal = teleRamal;
    }

    public String getTeleObservacao() {
        return teleObservacao;
    }

    public void setTeleObservacao(String teleObservacao) {
        this.teleObservacao = teleObservacao;
    }

    public Date getTeleLASTUPDATE() {
        return teleLASTUPDATE;
    }

    public void setTeleLASTUPDATE(Date teleLASTUPDATE) {
        this.teleLASTUPDATE = teleLASTUPDATE;
    }

    @JsonIgnore
    public Pessoas getPessId() {
        return pessId;
    }

    public void setPessId(Pessoas pessId) {
        this.pessId = pessId;
    }

    public TiposTelefone getTtelId() {
        return ttelId;
    }

    public void setTtelId(TiposTelefone ttelId) {
        this.ttelId = ttelId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (teleId != null ? teleId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Telefones)) {
            return false;
        }
        Telefones other = (Telefones) object;
        if ((this.teleId == null && other.teleId != null) || (this.teleId != null && !this.teleId.equals(other.teleId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.hjsystems.gestaoweb.entity.Telefones[ teleId=" + teleId + " ]";
    }
    
}
