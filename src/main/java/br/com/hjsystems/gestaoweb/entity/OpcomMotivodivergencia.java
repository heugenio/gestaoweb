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
@Table(name = "OPCOM_MOTIVODIVERGENCIA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OpcomMotivodivergencia.findAll", query = "SELECT o FROM OpcomMotivodivergencia o"),
    @NamedQuery(name = "OpcomMotivodivergencia.findByOcmdId", query = "SELECT o FROM OpcomMotivodivergencia o WHERE o.ocmdId = :ocmdId"),
    @NamedQuery(name = "OpcomMotivodivergencia.findByOcmdLastupdate", query = "SELECT o FROM OpcomMotivodivergencia o WHERE o.ocmdLastupdate = :ocmdLastupdate")})
public class OpcomMotivodivergencia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "OCMD_ID")
    private String ocmdId;
    @Column(name = "OCMD_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ocmdLastupdate;
    @JoinColumn(name = "MTDV_ID", referencedColumnName = "MTDV_ID")
    @ManyToOne
    private MotivosDivergencias mtdvId;
    @JoinColumn(name = "OPCM_ID", referencedColumnName = "OPCM_ID")
    @ManyToOne
    private OperacoesComerciais opcmId;

    public OpcomMotivodivergencia() {
    }

    public OpcomMotivodivergencia(String ocmdId) {
        this.ocmdId = ocmdId;
    }

    public String getOcmdId() {
        return ocmdId;
    }

    public void setOcmdId(String ocmdId) {
        this.ocmdId = ocmdId;
    }

    public Date getOcmdLastupdate() {
        return ocmdLastupdate;
    }

    public void setOcmdLastupdate(Date ocmdLastupdate) {
        this.ocmdLastupdate = ocmdLastupdate;
    }

    public MotivosDivergencias getMtdvId() {
        return mtdvId;
    }

    public void setMtdvId(MotivosDivergencias mtdvId) {
        this.mtdvId = mtdvId;
    }

    public OperacoesComerciais getOpcmId() {
        return opcmId;
    }

    public void setOpcmId(OperacoesComerciais opcmId) {
        this.opcmId = opcmId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ocmdId != null ? ocmdId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OpcomMotivodivergencia)) {
            return false;
        }
        OpcomMotivodivergencia other = (OpcomMotivodivergencia) object;
        if ((this.ocmdId == null && other.ocmdId != null) || (this.ocmdId != null && !this.ocmdId.equals(other.ocmdId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.OpcomMotivodivergencia[ ocmdId=" + ocmdId + " ]";
    }
    
}
