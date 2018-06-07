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
@Table(name = "HISTORICOS_CHEQUES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HistoricosCheques.findAll", query = "SELECT h FROM HistoricosCheques h"),
    @NamedQuery(name = "HistoricosCheques.findByHchqId", query = "SELECT h FROM HistoricosCheques h WHERE h.hchqId = :hchqId"),
    @NamedQuery(name = "HistoricosCheques.findByHchqData", query = "SELECT h FROM HistoricosCheques h WHERE h.hchqData = :hchqData"),
    @NamedQuery(name = "HistoricosCheques.findByHchqStatus", query = "SELECT h FROM HistoricosCheques h WHERE h.hchqStatus = :hchqStatus"),
    @NamedQuery(name = "HistoricosCheques.findByHchqEspecie", query = "SELECT h FROM HistoricosCheques h WHERE h.hchqEspecie = :hchqEspecie"),
    @NamedQuery(name = "HistoricosCheques.findByHchqLastupdate", query = "SELECT h FROM HistoricosCheques h WHERE h.hchqLastupdate = :hchqLastupdate")})
public class HistoricosCheques implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "HCHQ_ID")
    private String hchqId;
    @Basic(optional = false)
    @Column(name = "HCHQ_DATA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date hchqData;
    @Basic(optional = false)
    @Column(name = "HCHQ_STATUS")
    private String hchqStatus;
    @Column(name = "HCHQ_ESPECIE")
    private String hchqEspecie;
    @Column(name = "HCHQ_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date hchqLastupdate;
    @JoinColumn(name = "ALNA_ID", referencedColumnName = "ALNA_ID")
    @ManyToOne
    private Alineas alnaId;
    @JoinColumn(name = "CHQS_ID", referencedColumnName = "CHQS_ID")
    @ManyToOne
    private Cheques chqsId;
    @JoinColumn(name = "COFR_ID", referencedColumnName = "COFR_ID")
    @ManyToOne
    private Cofres cofrId;
    @JoinColumn(name = "ITCX_ID", referencedColumnName = "ITCX_ID")
    @ManyToOne
    private ItensCaixas itcxId;
    @JoinColumn(name = "USRS_ID", referencedColumnName = "USRS_ID")
    @ManyToOne
    private Usuarios usrsId;

    public HistoricosCheques() {
    }

    public HistoricosCheques(String hchqId) {
        this.hchqId = hchqId;
    }

    public HistoricosCheques(String hchqId, Date hchqData, String hchqStatus) {
        this.hchqId = hchqId;
        this.hchqData = hchqData;
        this.hchqStatus = hchqStatus;
    }

    public String getHchqId() {
        return hchqId;
    }

    public void setHchqId(String hchqId) {
        this.hchqId = hchqId;
    }

    public Date getHchqData() {
        return hchqData;
    }

    public void setHchqData(Date hchqData) {
        this.hchqData = hchqData;
    }

    public String getHchqStatus() {
        return hchqStatus;
    }

    public void setHchqStatus(String hchqStatus) {
        this.hchqStatus = hchqStatus;
    }

    public String getHchqEspecie() {
        return hchqEspecie;
    }

    public void setHchqEspecie(String hchqEspecie) {
        this.hchqEspecie = hchqEspecie;
    }

    public Date getHchqLastupdate() {
        return hchqLastupdate;
    }

    public void setHchqLastupdate(Date hchqLastupdate) {
        this.hchqLastupdate = hchqLastupdate;
    }

    public Alineas getAlnaId() {
        return alnaId;
    }

    public void setAlnaId(Alineas alnaId) {
        this.alnaId = alnaId;
    }

    public Cheques getChqsId() {
        return chqsId;
    }

    public void setChqsId(Cheques chqsId) {
        this.chqsId = chqsId;
    }

    public Cofres getCofrId() {
        return cofrId;
    }

    public void setCofrId(Cofres cofrId) {
        this.cofrId = cofrId;
    }

    public ItensCaixas getItcxId() {
        return itcxId;
    }

    public void setItcxId(ItensCaixas itcxId) {
        this.itcxId = itcxId;
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
        hash += (hchqId != null ? hchqId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HistoricosCheques)) {
            return false;
        }
        HistoricosCheques other = (HistoricosCheques) object;
        if ((this.hchqId == null && other.hchqId != null) || (this.hchqId != null && !this.hchqId.equals(other.hchqId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.HistoricosCheques[ hchqId=" + hchqId + " ]";
    }
    
}
