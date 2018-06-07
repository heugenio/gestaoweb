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
@Table(name = "AVISO_MOVIMENTO_BANCARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AvisoMovimentoBancario.findAll", query = "SELECT a FROM AvisoMovimentoBancario a"),
    @NamedQuery(name = "AvisoMovimentoBancario.findByAvmbId", query = "SELECT a FROM AvisoMovimentoBancario a WHERE a.avmbId = :avmbId"),
    @NamedQuery(name = "AvisoMovimentoBancario.findByAvmbLastupdate", query = "SELECT a FROM AvisoMovimentoBancario a WHERE a.avmbLastupdate = :avmbLastupdate")})
public class AvisoMovimentoBancario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "AVMB_ID")
    private String avmbId;
    @Column(name = "AVMB_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date avmbLastupdate;
    @JoinColumn(name = "AGEN_ID", referencedColumnName = "AGEN_ID")
    @ManyToOne
    private Agencias agenId;
    @JoinColumn(name = "BMVP_ID", referencedColumnName = "BMVP_ID")
    @ManyToOne
    private BorderoMovParcelas bmvpId;

    public AvisoMovimentoBancario() {
    }

    public AvisoMovimentoBancario(String avmbId) {
        this.avmbId = avmbId;
    }

    public String getAvmbId() {
        return avmbId;
    }

    public void setAvmbId(String avmbId) {
        this.avmbId = avmbId;
    }

    public Date getAvmbLastupdate() {
        return avmbLastupdate;
    }

    public void setAvmbLastupdate(Date avmbLastupdate) {
        this.avmbLastupdate = avmbLastupdate;
    }

    public Agencias getAgenId() {
        return agenId;
    }

    public void setAgenId(Agencias agenId) {
        this.agenId = agenId;
    }

    public BorderoMovParcelas getBmvpId() {
        return bmvpId;
    }

    public void setBmvpId(BorderoMovParcelas bmvpId) {
        this.bmvpId = bmvpId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (avmbId != null ? avmbId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AvisoMovimentoBancario)) {
            return false;
        }
        AvisoMovimentoBancario other = (AvisoMovimentoBancario) object;
        if ((this.avmbId == null && other.avmbId != null) || (this.avmbId != null && !this.avmbId.equals(other.avmbId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.AvisoMovimentoBancario[ avmbId=" + avmbId + " ]";
    }
    
}
