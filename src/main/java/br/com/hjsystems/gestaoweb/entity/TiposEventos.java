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
@Table(name = "TIPOS_EVENTOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TiposEventos.findAll", query = "SELECT t FROM TiposEventos t"),
    @NamedQuery(name = "TiposEventos.findByTpevId", query = "SELECT t FROM TiposEventos t WHERE t.tpevId = :tpevId"),
    @NamedQuery(name = "TiposEventos.findByTpevNome", query = "SELECT t FROM TiposEventos t WHERE t.tpevNome = :tpevNome"),
    @NamedQuery(name = "TiposEventos.findByTpevCodigo", query = "SELECT t FROM TiposEventos t WHERE t.tpevCodigo = :tpevCodigo"),
    @NamedQuery(name = "TiposEventos.findByTpevLastupdate", query = "SELECT t FROM TiposEventos t WHERE t.tpevLastupdate = :tpevLastupdate")})
public class TiposEventos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TPEV_ID")
    private String tpevId;
    @Column(name = "TPEV_NOME")
    private String tpevNome;
    @Column(name = "TPEV_CODIGO")
    private String tpevCodigo;
    @Column(name = "TPEV_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tpevLastupdate;
    @OneToMany(mappedBy = "tpevId")
    private List<PessoasEventos> pessoasEventosList;

    public TiposEventos() {
    }

    public TiposEventos(String tpevId) {
        this.tpevId = tpevId;
    }

    public String getTpevId() {
        return tpevId;
    }

    public void setTpevId(String tpevId) {
        this.tpevId = tpevId;
    }

    public String getTpevNome() {
        return tpevNome;
    }

    public void setTpevNome(String tpevNome) {
        this.tpevNome = tpevNome;
    }

    public String getTpevCodigo() {
        return tpevCodigo;
    }

    public void setTpevCodigo(String tpevCodigo) {
        this.tpevCodigo = tpevCodigo;
    }

    public Date getTpevLastupdate() {
        return tpevLastupdate;
    }

    public void setTpevLastupdate(Date tpevLastupdate) {
        this.tpevLastupdate = tpevLastupdate;
    }

    @XmlTransient
    public List<PessoasEventos> getPessoasEventosList() {
        return pessoasEventosList;
    }

    public void setPessoasEventosList(List<PessoasEventos> pessoasEventosList) {
        this.pessoasEventosList = pessoasEventosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tpevId != null ? tpevId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TiposEventos)) {
            return false;
        }
        TiposEventos other = (TiposEventos) object;
        if ((this.tpevId == null && other.tpevId != null) || (this.tpevId != null && !this.tpevId.equals(other.tpevId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.TiposEventos[ tpevId=" + tpevId + " ]";
    }
    
}
