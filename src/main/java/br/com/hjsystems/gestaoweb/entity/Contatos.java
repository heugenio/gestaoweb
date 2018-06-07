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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name = "CONTATOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Contatos.findAll", query = "SELECT c FROM Contatos c"),
    @NamedQuery(name = "Contatos.findByCntsId", query = "SELECT c FROM Contatos c WHERE c.cntsId = :cntsId"),
    @NamedQuery(name = "Contatos.findByCntsNome", query = "SELECT c FROM Contatos c WHERE c.cntsNome = :cntsNome"),
    @NamedQuery(name = "Contatos.findByCntsFone", query = "SELECT c FROM Contatos c WHERE c.cntsFone = :cntsFone"),
    @NamedQuery(name = "Contatos.findByCntsCelular", query = "SELECT c FROM Contatos c WHERE c.cntsCelular = :cntsCelular"),
    @NamedQuery(name = "Contatos.findByCntsLASTUPDATE", query = "SELECT c FROM Contatos c WHERE c.cntsLASTUPDATE = :cntsLASTUPDATE"),
    @NamedQuery(name = "Contatos.findByCntsEmail", query = "SELECT c FROM Contatos c WHERE c.cntsEmail = :cntsEmail")})
public class Contatos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CNTS_ID")
    private String cntsId;
    @Basic(optional = false)
    @Column(name = "CNTS_NOME")
    private String cntsNome;
    @Column(name = "CNTS_FONE")
    private String cntsFone;
    @Column(name = "CNTS_CELULAR")
    private String cntsCelular;
    @Column(name = "Cnts_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cntsLASTUPDATE;
    @Column(name = "CNTS_EMAIL")
    private String cntsEmail;
    @JoinColumn(name = "PESS_ID", referencedColumnName = "PESS_ID")
    @ManyToOne
    private Pessoas pessId;
    @JoinColumn(name = "TPCN_ID", referencedColumnName = "TPCN_ID")
    @ManyToOne
    private TiposContatos tpcnId;

    public Contatos() {
    }

    public Contatos(String cntsId) {
        this.cntsId = cntsId;
    }

    public Contatos(String cntsId, String cntsNome) {
        this.cntsId = cntsId;
        this.cntsNome = cntsNome;
    }

    public String getCntsId() {
        return cntsId;
    }

    public void setCntsId(String cntsId) {
        this.cntsId = cntsId;
    }

    public String getCntsNome() {
        return cntsNome;
    }

    public void setCntsNome(String cntsNome) {
        this.cntsNome = cntsNome;
    }

    public String getCntsFone() {
        return cntsFone;
    }

    public void setCntsFone(String cntsFone) {
        this.cntsFone = cntsFone;
    }

    public String getCntsCelular() {
        return cntsCelular;
    }

    public void setCntsCelular(String cntsCelular) {
        this.cntsCelular = cntsCelular;
    }

    public Date getCntsLASTUPDATE() {
        return cntsLASTUPDATE;
    }

    public void setCntsLASTUPDATE(Date cntsLASTUPDATE) {
        this.cntsLASTUPDATE = cntsLASTUPDATE;
    }

    public String getCntsEmail() {
        return cntsEmail;
    }

    public void setCntsEmail(String cntsEmail) {
        this.cntsEmail = cntsEmail;
    }

    public Pessoas getPessId() {
        return pessId;
    }

    public void setPessId(Pessoas pessId) {
        this.pessId = pessId;
    }

    public TiposContatos getTpcnId() {
        return tpcnId;
    }

    public void setTpcnId(TiposContatos tpcnId) {
        this.tpcnId = tpcnId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cntsId != null ? cntsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contatos)) {
            return false;
        }
        Contatos other = (Contatos) object;
        if ((this.cntsId == null && other.cntsId != null) || (this.cntsId != null && !this.cntsId.equals(other.cntsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.Contatos[ cntsId=" + cntsId + " ]";
    }
    
}
