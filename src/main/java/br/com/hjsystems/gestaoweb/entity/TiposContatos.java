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
@Table(name = "TIPOS_CONTATOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TiposContatos.findAll", query = "SELECT t FROM TiposContatos t"),
    @NamedQuery(name = "TiposContatos.findByTpcnId", query = "SELECT t FROM TiposContatos t WHERE t.tpcnId = :tpcnId"),
    @NamedQuery(name = "TiposContatos.findByTpcnNome", query = "SELECT t FROM TiposContatos t WHERE t.tpcnNome = :tpcnNome"),
    @NamedQuery(name = "TiposContatos.findByTpCnLASTUPDATE", query = "SELECT t FROM TiposContatos t WHERE t.tpCnLASTUPDATE = :tpCnLASTUPDATE")})
public class TiposContatos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TPCN_ID")
    private String tpcnId;
    @Basic(optional = false)
    @Column(name = "TPCN_NOME")
    private String tpcnNome;
    @Column(name = "TpCn_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tpCnLASTUPDATE;
    @OneToMany(mappedBy = "tpcnId")
    private List<Contatos> contatosList;

    public TiposContatos() {
    }

    public TiposContatos(String tpcnId) {
        this.tpcnId = tpcnId;
    }

    public TiposContatos(String tpcnId, String tpcnNome) {
        this.tpcnId = tpcnId;
        this.tpcnNome = tpcnNome;
    }

    public String getTpcnId() {
        return tpcnId;
    }

    public void setTpcnId(String tpcnId) {
        this.tpcnId = tpcnId;
    }

    public String getTpcnNome() {
        return tpcnNome;
    }

    public void setTpcnNome(String tpcnNome) {
        this.tpcnNome = tpcnNome;
    }

    public Date getTpCnLASTUPDATE() {
        return tpCnLASTUPDATE;
    }

    public void setTpCnLASTUPDATE(Date tpCnLASTUPDATE) {
        this.tpCnLASTUPDATE = tpCnLASTUPDATE;
    }

    @XmlTransient
    public List<Contatos> getContatosList() {
        return contatosList;
    }

    public void setContatosList(List<Contatos> contatosList) {
        this.contatosList = contatosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tpcnId != null ? tpcnId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TiposContatos)) {
            return false;
        }
        TiposContatos other = (TiposContatos) object;
        if ((this.tpcnId == null && other.tpcnId != null) || (this.tpcnId != null && !this.tpcnId.equals(other.tpcnId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.TiposContatos[ tpcnId=" + tpcnId + " ]";
    }
    
}
