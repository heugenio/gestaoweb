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
@Table(name = "OPERCOMERC_TIPOSPESSOAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OpercomercTipospessoas.findAll", query = "SELECT o FROM OpercomercTipospessoas o"),
    @NamedQuery(name = "OpercomercTipospessoas.findByOctpId", query = "SELECT o FROM OpercomercTipospessoas o WHERE o.octpId = :octpId"),
    @NamedQuery(name = "OpercomercTipospessoas.findByOctpLastupdate", query = "SELECT o FROM OpercomercTipospessoas o WHERE o.octpLastupdate = :octpLastupdate")})
public class OpercomercTipospessoas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "OCTP_ID")
    private String octpId;
    @Column(name = "OCTP_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date octpLastupdate;
    @JoinColumn(name = "OPCM_ID", referencedColumnName = "OPCM_ID")
    @ManyToOne
    private OperacoesComerciais opcmId;
    @JoinColumn(name = "TPPS_ID", referencedColumnName = "TPPS_ID")
    @ManyToOne
    private TiposPessoas tppsId;

    public OpercomercTipospessoas() {
    }

    public OpercomercTipospessoas(String octpId) {
        this.octpId = octpId;
    }

    public String getOctpId() {
        return octpId;
    }

    public void setOctpId(String octpId) {
        this.octpId = octpId;
    }

    public Date getOctpLastupdate() {
        return octpLastupdate;
    }

    public void setOctpLastupdate(Date octpLastupdate) {
        this.octpLastupdate = octpLastupdate;
    }

    public OperacoesComerciais getOpcmId() {
        return opcmId;
    }

    public void setOpcmId(OperacoesComerciais opcmId) {
        this.opcmId = opcmId;
    }

    public TiposPessoas getTppsId() {
        return tppsId;
    }

    public void setTppsId(TiposPessoas tppsId) {
        this.tppsId = tppsId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (octpId != null ? octpId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OpercomercTipospessoas)) {
            return false;
        }
        OpercomercTipospessoas other = (OpercomercTipospessoas) object;
        if ((this.octpId == null && other.octpId != null) || (this.octpId != null && !this.octpId.equals(other.octpId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.OpercomercTipospessoas[ octpId=" + octpId + " ]";
    }
    
}
