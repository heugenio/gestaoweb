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
import javax.persistence.Lob;
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
@Table(name = "PESSOAS_EVENTOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PessoasEventos.findAll", query = "SELECT p FROM PessoasEventos p"),
    @NamedQuery(name = "PessoasEventos.findByPsevId", query = "SELECT p FROM PessoasEventos p WHERE p.psevId = :psevId"),
    @NamedQuery(name = "PessoasEventos.findByPsevData", query = "SELECT p FROM PessoasEventos p WHERE p.psevData = :psevData"),
    @NamedQuery(name = "PessoasEventos.findByPsevLastupdate", query = "SELECT p FROM PessoasEventos p WHERE p.psevLastupdate = :psevLastupdate")})
public class PessoasEventos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PSEV_ID")
    private String psevId;
    @Basic(optional = false)
    @Lob
    @Column(name = "PSEV_EVENTO")
    private String psevEvento;
    @Column(name = "PSEV_DATA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date psevData;
    @Column(name = "PSEV_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date psevLastupdate;
    @JoinColumn(name = "PESS_ID", referencedColumnName = "PESS_ID")
    @ManyToOne
    private Pessoas pessId;
    @JoinColumn(name = "TPEV_ID", referencedColumnName = "TPEV_ID")
    @ManyToOne
    private TiposEventos tpevId;
    @JoinColumn(name = "USRS_ID", referencedColumnName = "USRS_ID")
    @ManyToOne
    private Usuarios usrsId;

    public PessoasEventos() {
    }

    public PessoasEventos(String psevId) {
        this.psevId = psevId;
    }

    public PessoasEventos(String psevId, String psevEvento) {
        this.psevId = psevId;
        this.psevEvento = psevEvento;
    }

    public String getPsevId() {
        return psevId;
    }

    public void setPsevId(String psevId) {
        this.psevId = psevId;
    }

    public String getPsevEvento() {
        return psevEvento;
    }

    public void setPsevEvento(String psevEvento) {
        this.psevEvento = psevEvento;
    }

    public Date getPsevData() {
        return psevData;
    }

    public void setPsevData(Date psevData) {
        this.psevData = psevData;
    }

    public Date getPsevLastupdate() {
        return psevLastupdate;
    }

    public void setPsevLastupdate(Date psevLastupdate) {
        this.psevLastupdate = psevLastupdate;
    }

    public Pessoas getPessId() {
        return pessId;
    }

    public void setPessId(Pessoas pessId) {
        this.pessId = pessId;
    }

    public TiposEventos getTpevId() {
        return tpevId;
    }

    public void setTpevId(TiposEventos tpevId) {
        this.tpevId = tpevId;
    }

    public Usuarios getUsrsId() {
        return usrsId;
    }

    public void setUsrsId(Usuarios usrsId) {
        this.usrsId = usrsId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (psevId != null ? psevId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PessoasEventos)) {
            return false;
        }
        PessoasEventos other = (PessoasEventos) object;
        if ((this.psevId == null && other.psevId != null) || (this.psevId != null && !this.psevId.equals(other.psevId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.PessoasEventos[ psevId=" + psevId + " ]";
    }
    
}
