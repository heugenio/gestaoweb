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
@Table(name = "ROTAS_BAIRROS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RotasBairros.findAll", query = "SELECT r FROM RotasBairros r"),
    @NamedQuery(name = "RotasBairros.findByRtbrId", query = "SELECT r FROM RotasBairros r WHERE r.rtbrId = :rtbrId"),
    @NamedQuery(name = "RotasBairros.findByRtbrOrdem", query = "SELECT r FROM RotasBairros r WHERE r.rtbrOrdem = :rtbrOrdem"),
    @NamedQuery(name = "RotasBairros.findByRtbrLastupdate", query = "SELECT r FROM RotasBairros r WHERE r.rtbrLastupdate = :rtbrLastupdate")})
public class RotasBairros implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "RTBR_ID")
    private String rtbrId;
    @Column(name = "RTBR_ORDEM")
    private Integer rtbrOrdem;
    @Column(name = "RTBR_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rtbrLastupdate;
    @JoinColumn(name = "BRMU_ID", referencedColumnName = "BRMU_ID")
    @ManyToOne
    private BairrosMunicipios brmuId;
    @JoinColumn(name = "ROTA_ID", referencedColumnName = "ROTA_ID")
    @ManyToOne
    private Rotas rotaId;

    public RotasBairros() {
    }

    public RotasBairros(String rtbrId) {
        this.rtbrId = rtbrId;
    }

    public String getRtbrId() {
        return rtbrId;
    }

    public void setRtbrId(String rtbrId) {
        this.rtbrId = rtbrId;
    }

    public Integer getRtbrOrdem() {
        return rtbrOrdem;
    }

    public void setRtbrOrdem(Integer rtbrOrdem) {
        this.rtbrOrdem = rtbrOrdem;
    }

    public Date getRtbrLastupdate() {
        return rtbrLastupdate;
    }

    public void setRtbrLastupdate(Date rtbrLastupdate) {
        this.rtbrLastupdate = rtbrLastupdate;
    }

    public BairrosMunicipios getBrmuId() {
        return brmuId;
    }

    public void setBrmuId(BairrosMunicipios brmuId) {
        this.brmuId = brmuId;
    }

    public Rotas getRotaId() {
        return rotaId;
    }

    public void setRotaId(Rotas rotaId) {
        this.rotaId = rotaId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rtbrId != null ? rtbrId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RotasBairros)) {
            return false;
        }
        RotasBairros other = (RotasBairros) object;
        if ((this.rtbrId == null && other.rtbrId != null) || (this.rtbrId != null && !this.rtbrId.equals(other.rtbrId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.RotasBairros[ rtbrId=" + rtbrId + " ]";
    }
    
}
