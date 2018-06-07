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
@Table(name = "GRUPOS_TIPOSPAGAMENTOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GruposTipospagamentos.findAll", query = "SELECT g FROM GruposTipospagamentos g"),
    @NamedQuery(name = "GruposTipospagamentos.findByGtpgId", query = "SELECT g FROM GruposTipospagamentos g WHERE g.gtpgId = :gtpgId"),
    @NamedQuery(name = "GruposTipospagamentos.findByGtpgTipoPagamento", query = "SELECT g FROM GruposTipospagamentos g WHERE g.gtpgTipoPagamento = :gtpgTipoPagamento"),
    @NamedQuery(name = "GruposTipospagamentos.findByGtpgLastupdate", query = "SELECT g FROM GruposTipospagamentos g WHERE g.gtpgLastupdate = :gtpgLastupdate")})
public class GruposTipospagamentos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "GTPG_ID")
    private String gtpgId;
    @Basic(optional = false)
    @Column(name = "GTPG_TIPO_PAGAMENTO")
    private String gtpgTipoPagamento;
    @Column(name = "GTPG_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date gtpgLastupdate;
    @JoinColumn(name = "GRPO_ID", referencedColumnName = "GRPO_ID")
    @ManyToOne
    private Grupos grpoId;
    @JoinColumn(name = "HPAD_ID", referencedColumnName = "HPAD_ID")
    @ManyToOne
    private HistoricosPadrao hpadId;
    @JoinColumn(name = "PLCT_ID", referencedColumnName = "PLCT_ID")
    @ManyToOne
    private PlanoContas plctId;

    public GruposTipospagamentos() {
    }

    public GruposTipospagamentos(String gtpgId) {
        this.gtpgId = gtpgId;
    }

    public GruposTipospagamentos(String gtpgId, String gtpgTipoPagamento) {
        this.gtpgId = gtpgId;
        this.gtpgTipoPagamento = gtpgTipoPagamento;
    }

    public String getGtpgId() {
        return gtpgId;
    }

    public void setGtpgId(String gtpgId) {
        this.gtpgId = gtpgId;
    }

    public String getGtpgTipoPagamento() {
        return gtpgTipoPagamento;
    }

    public void setGtpgTipoPagamento(String gtpgTipoPagamento) {
        this.gtpgTipoPagamento = gtpgTipoPagamento;
    }

    public Date getGtpgLastupdate() {
        return gtpgLastupdate;
    }

    public void setGtpgLastupdate(Date gtpgLastupdate) {
        this.gtpgLastupdate = gtpgLastupdate;
    }

    public Grupos getGrpoId() {
        return grpoId;
    }

    public void setGrpoId(Grupos grpoId) {
        this.grpoId = grpoId;
    }

    public HistoricosPadrao getHpadId() {
        return hpadId;
    }

    public void setHpadId(HistoricosPadrao hpadId) {
        this.hpadId = hpadId;
    }

    public PlanoContas getPlctId() {
        return plctId;
    }

    public void setPlctId(PlanoContas plctId) {
        this.plctId = plctId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (gtpgId != null ? gtpgId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GruposTipospagamentos)) {
            return false;
        }
        GruposTipospagamentos other = (GruposTipospagamentos) object;
        if ((this.gtpgId == null && other.gtpgId != null) || (this.gtpgId != null && !this.gtpgId.equals(other.gtpgId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.GruposTipospagamentos[ gtpgId=" + gtpgId + " ]";
    }
    
}
