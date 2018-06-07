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
@Table(name = "OPCM_TIPOSPAGAMENTOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OpcmTipospagamentos.findAll", query = "SELECT o FROM OpcmTipospagamentos o"),
    @NamedQuery(name = "OpcmTipospagamentos.findByOtpgId", query = "SELECT o FROM OpcmTipospagamentos o WHERE o.otpgId = :otpgId"),
    @NamedQuery(name = "OpcmTipospagamentos.findByOtpgTipoPagamento", query = "SELECT o FROM OpcmTipospagamentos o WHERE o.otpgTipoPagamento = :otpgTipoPagamento"),
    @NamedQuery(name = "OpcmTipospagamentos.findByOtpgLastupdate", query = "SELECT o FROM OpcmTipospagamentos o WHERE o.otpgLastupdate = :otpgLastupdate")})
public class OpcmTipospagamentos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "OTPG_ID")
    private String otpgId;
    @Column(name = "OTPG_TIPO_PAGAMENTO")
    private String otpgTipoPagamento;
    @Column(name = "OTPG_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date otpgLastupdate;
    @JoinColumn(name = "HPAD_ID", referencedColumnName = "HPAD_ID")
    @ManyToOne
    private HistoricosPadrao hpadId;
    @JoinColumn(name = "OPCM_ID", referencedColumnName = "OPCM_ID")
    @ManyToOne
    private OperacoesComerciais opcmId;
    @JoinColumn(name = "PLCT_ID", referencedColumnName = "PLCT_ID")
    @ManyToOne
    private PlanoContas plctId;
    @JoinColumn(name = "PLA_PLCT_ID", referencedColumnName = "PLCT_ID")
    @ManyToOne
    private PlanoContas plaPlctId;

    public OpcmTipospagamentos() {
    }

    public OpcmTipospagamentos(String otpgId) {
        this.otpgId = otpgId;
    }

    public String getOtpgId() {
        return otpgId;
    }

    public void setOtpgId(String otpgId) {
        this.otpgId = otpgId;
    }

    public String getOtpgTipoPagamento() {
        return otpgTipoPagamento;
    }

    public void setOtpgTipoPagamento(String otpgTipoPagamento) {
        this.otpgTipoPagamento = otpgTipoPagamento;
    }

    public Date getOtpgLastupdate() {
        return otpgLastupdate;
    }

    public void setOtpgLastupdate(Date otpgLastupdate) {
        this.otpgLastupdate = otpgLastupdate;
    }

    public HistoricosPadrao getHpadId() {
        return hpadId;
    }

    public void setHpadId(HistoricosPadrao hpadId) {
        this.hpadId = hpadId;
    }

    public OperacoesComerciais getOpcmId() {
        return opcmId;
    }

    public void setOpcmId(OperacoesComerciais opcmId) {
        this.opcmId = opcmId;
    }

    public PlanoContas getPlctId() {
        return plctId;
    }

    public void setPlctId(PlanoContas plctId) {
        this.plctId = plctId;
    }

    public PlanoContas getPlaPlctId() {
        return plaPlctId;
    }

    public void setPlaPlctId(PlanoContas plaPlctId) {
        this.plaPlctId = plaPlctId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (otpgId != null ? otpgId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OpcmTipospagamentos)) {
            return false;
        }
        OpcmTipospagamentos other = (OpcmTipospagamentos) object;
        if ((this.otpgId == null && other.otpgId != null) || (this.otpgId != null && !this.otpgId.equals(other.otpgId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.OpcmTipospagamentos[ otpgId=" + otpgId + " ]";
    }
    
}
