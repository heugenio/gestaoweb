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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name = "FAIXASCOMISSOES_ITENS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FaixascomissoesItens.findAll", query = "SELECT f FROM FaixascomissoesItens f"),
    @NamedQuery(name = "FaixascomissoesItens.findByFcitId", query = "SELECT f FROM FaixascomissoesItens f WHERE f.fcitId = :fcitId"),
    @NamedQuery(name = "FaixascomissoesItens.findByFcitFxAvista", query = "SELECT f FROM FaixascomissoesItens f WHERE f.fcitFxAvista = :fcitFxAvista"),
    @NamedQuery(name = "FaixascomissoesItens.findByFcitPercAvista", query = "SELECT f FROM FaixascomissoesItens f WHERE f.fcitPercAvista = :fcitPercAvista"),
    @NamedQuery(name = "FaixascomissoesItens.findByFcitFxAprazo", query = "SELECT f FROM FaixascomissoesItens f WHERE f.fcitFxAprazo = :fcitFxAprazo"),
    @NamedQuery(name = "FaixascomissoesItens.findByFcitPercAprazo", query = "SELECT f FROM FaixascomissoesItens f WHERE f.fcitPercAprazo = :fcitPercAprazo"),
    @NamedQuery(name = "FaixascomissoesItens.findByFcitLastupdate", query = "SELECT f FROM FaixascomissoesItens f WHERE f.fcitLastupdate = :fcitLastupdate")})
public class FaixascomissoesItens implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "FCIT_ID")
    private String fcitId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "FCIT_FX_AVISTA")
    private BigDecimal fcitFxAvista;
    @Basic(optional = false)
    @Column(name = "FCIT_PERC_AVISTA")
    private BigDecimal fcitPercAvista;
    @Basic(optional = false)
    @Column(name = "FCIT_FX_APRAZO")
    private BigDecimal fcitFxAprazo;
    @Basic(optional = false)
    @Column(name = "FCIT_PERC_APRAZO")
    private BigDecimal fcitPercAprazo;
    @Column(name = "FCIT_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fcitLastupdate;
    @JoinColumn(name = "FXCM_ID", referencedColumnName = "FXCM_ID")
    @ManyToOne
    private FaixasComissoes fxcmId;

    public FaixascomissoesItens() {
    }

    public FaixascomissoesItens(String fcitId) {
        this.fcitId = fcitId;
    }

    public FaixascomissoesItens(String fcitId, BigDecimal fcitFxAvista, BigDecimal fcitPercAvista, BigDecimal fcitFxAprazo, BigDecimal fcitPercAprazo) {
        this.fcitId = fcitId;
        this.fcitFxAvista = fcitFxAvista;
        this.fcitPercAvista = fcitPercAvista;
        this.fcitFxAprazo = fcitFxAprazo;
        this.fcitPercAprazo = fcitPercAprazo;
    }

    public String getFcitId() {
        return fcitId;
    }

    public void setFcitId(String fcitId) {
        this.fcitId = fcitId;
    }

    public BigDecimal getFcitFxAvista() {
        return fcitFxAvista;
    }

    public void setFcitFxAvista(BigDecimal fcitFxAvista) {
        this.fcitFxAvista = fcitFxAvista;
    }

    public BigDecimal getFcitPercAvista() {
        return fcitPercAvista;
    }

    public void setFcitPercAvista(BigDecimal fcitPercAvista) {
        this.fcitPercAvista = fcitPercAvista;
    }

    public BigDecimal getFcitFxAprazo() {
        return fcitFxAprazo;
    }

    public void setFcitFxAprazo(BigDecimal fcitFxAprazo) {
        this.fcitFxAprazo = fcitFxAprazo;
    }

    public BigDecimal getFcitPercAprazo() {
        return fcitPercAprazo;
    }

    public void setFcitPercAprazo(BigDecimal fcitPercAprazo) {
        this.fcitPercAprazo = fcitPercAprazo;
    }

    public Date getFcitLastupdate() {
        return fcitLastupdate;
    }

    public void setFcitLastupdate(Date fcitLastupdate) {
        this.fcitLastupdate = fcitLastupdate;
    }

    public FaixasComissoes getFxcmId() {
        return fxcmId;
    }

    public void setFxcmId(FaixasComissoes fxcmId) {
        this.fxcmId = fxcmId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fcitId != null ? fcitId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FaixascomissoesItens)) {
            return false;
        }
        FaixascomissoesItens other = (FaixascomissoesItens) object;
        if ((this.fcitId == null && other.fcitId != null) || (this.fcitId != null && !this.fcitId.equals(other.fcitId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.FaixascomissoesItens[ fcitId=" + fcitId + " ]";
    }
    
}
