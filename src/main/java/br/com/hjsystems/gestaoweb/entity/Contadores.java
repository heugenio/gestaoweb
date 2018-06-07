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
@Table(name = "CONTADORES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Contadores.findAll", query = "SELECT c FROM Contadores c"),
    @NamedQuery(name = "Contadores.findByCtdrId", query = "SELECT c FROM Contadores c WHERE c.ctdrId = :ctdrId"),
    @NamedQuery(name = "Contadores.findByCtdrSituacao", query = "SELECT c FROM Contadores c WHERE c.ctdrSituacao = :ctdrSituacao"),
    @NamedQuery(name = "Contadores.findByCtdrLASTUPDATE", query = "SELECT c FROM Contadores c WHERE c.ctdrLASTUPDATE = :ctdrLASTUPDATE")})
public class Contadores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CTDR_ID")
    private String ctdrId;
    @Basic(optional = false)
    @Column(name = "CTDR_SITUACAO")
    private String ctdrSituacao;
    @Column(name = "Ctdr_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ctdrLASTUPDATE;
    @JoinColumn(name = "ESPD_ID", referencedColumnName = "ESPD_ID")
    @ManyToOne
    private Especialidades espdId;
    @JoinColumn(name = "PESS_ID", referencedColumnName = "PESS_ID")
    @ManyToOne
    private Pessoas pessId;
    @JoinColumn(name = "RMAT_ID", referencedColumnName = "RMAT_ID")
    @ManyToOne
    private RamosAtividade rmatId;

    public Contadores() {
    }

    public Contadores(String ctdrId) {
        this.ctdrId = ctdrId;
    }

    public Contadores(String ctdrId, String ctdrSituacao) {
        this.ctdrId = ctdrId;
        this.ctdrSituacao = ctdrSituacao;
    }

    public String getCtdrId() {
        return ctdrId;
    }

    public void setCtdrId(String ctdrId) {
        this.ctdrId = ctdrId;
    }

    public String getCtdrSituacao() {
        return ctdrSituacao;
    }

    public void setCtdrSituacao(String ctdrSituacao) {
        this.ctdrSituacao = ctdrSituacao;
    }

    public Date getCtdrLASTUPDATE() {
        return ctdrLASTUPDATE;
    }

    public void setCtdrLASTUPDATE(Date ctdrLASTUPDATE) {
        this.ctdrLASTUPDATE = ctdrLASTUPDATE;
    }

    public Especialidades getEspdId() {
        return espdId;
    }

    public void setEspdId(Especialidades espdId) {
        this.espdId = espdId;
    }

    public Pessoas getPessId() {
        return pessId;
    }

    public void setPessId(Pessoas pessId) {
        this.pessId = pessId;
    }

    public RamosAtividade getRmatId() {
        return rmatId;
    }

    public void setRmatId(RamosAtividade rmatId) {
        this.rmatId = rmatId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ctdrId != null ? ctdrId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contadores)) {
            return false;
        }
        Contadores other = (Contadores) object;
        if ((this.ctdrId == null && other.ctdrId != null) || (this.ctdrId != null && !this.ctdrId.equals(other.ctdrId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.Contadores[ ctdrId=" + ctdrId + " ]";
    }
    
}
