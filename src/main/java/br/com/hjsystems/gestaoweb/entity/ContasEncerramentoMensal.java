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
@Table(name = "CONTAS_ENCERRAMENTO_MENSAL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ContasEncerramentoMensal.findAll", query = "SELECT c FROM ContasEncerramentoMensal c"),
    @NamedQuery(name = "ContasEncerramentoMensal.findByCtemId", query = "SELECT c FROM ContasEncerramentoMensal c WHERE c.ctemId = :ctemId"),
    @NamedQuery(name = "ContasEncerramentoMensal.findByCtemHistoricoZeramento", query = "SELECT c FROM ContasEncerramentoMensal c WHERE c.ctemHistoricoZeramento = :ctemHistoricoZeramento"),
    @NamedQuery(name = "ContasEncerramentoMensal.findByCtemHistoricoTransferencia", query = "SELECT c FROM ContasEncerramentoMensal c WHERE c.ctemHistoricoTransferencia = :ctemHistoricoTransferencia"),
    @NamedQuery(name = "ContasEncerramentoMensal.findByCtEMLASTUPDATE", query = "SELECT c FROM ContasEncerramentoMensal c WHERE c.ctEMLASTUPDATE = :ctEMLASTUPDATE")})
public class ContasEncerramentoMensal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CTEM_ID")
    private String ctemId;
    @Column(name = "CTEM_HISTORICO_ZERAMENTO")
    private String ctemHistoricoZeramento;
    @Column(name = "CTEM_HISTORICO_TRANSFERENCIA")
    private String ctemHistoricoTransferencia;
    @Column(name = "CtEM_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ctEMLASTUPDATE;
    @JoinColumn(name = "HPAD_ID", referencedColumnName = "HPAD_ID")
    @ManyToOne
    private HistoricosPadrao hpadId;
    @JoinColumn(name = "HIS_HPAD_ID", referencedColumnName = "HPAD_ID")
    @ManyToOne
    private HistoricosPadrao hisHpadId;
    @JoinColumn(name = "PLA_PLCT_ID", referencedColumnName = "PLCT_ID")
    @ManyToOne
    private PlanoContas plaPlctId;
    @JoinColumn(name = "PLCT_ID", referencedColumnName = "PLCT_ID")
    @ManyToOne
    private PlanoContas plctId;

    public ContasEncerramentoMensal() {
    }

    public ContasEncerramentoMensal(String ctemId) {
        this.ctemId = ctemId;
    }

    public String getCtemId() {
        return ctemId;
    }

    public void setCtemId(String ctemId) {
        this.ctemId = ctemId;
    }

    public String getCtemHistoricoZeramento() {
        return ctemHistoricoZeramento;
    }

    public void setCtemHistoricoZeramento(String ctemHistoricoZeramento) {
        this.ctemHistoricoZeramento = ctemHistoricoZeramento;
    }

    public String getCtemHistoricoTransferencia() {
        return ctemHistoricoTransferencia;
    }

    public void setCtemHistoricoTransferencia(String ctemHistoricoTransferencia) {
        this.ctemHistoricoTransferencia = ctemHistoricoTransferencia;
    }

    public Date getCtEMLASTUPDATE() {
        return ctEMLASTUPDATE;
    }

    public void setCtEMLASTUPDATE(Date ctEMLASTUPDATE) {
        this.ctEMLASTUPDATE = ctEMLASTUPDATE;
    }

    public HistoricosPadrao getHpadId() {
        return hpadId;
    }

    public void setHpadId(HistoricosPadrao hpadId) {
        this.hpadId = hpadId;
    }

    public HistoricosPadrao getHisHpadId() {
        return hisHpadId;
    }

    public void setHisHpadId(HistoricosPadrao hisHpadId) {
        this.hisHpadId = hisHpadId;
    }

    public PlanoContas getPlaPlctId() {
        return plaPlctId;
    }

    public void setPlaPlctId(PlanoContas plaPlctId) {
        this.plaPlctId = plaPlctId;
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
        hash += (ctemId != null ? ctemId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContasEncerramentoMensal)) {
            return false;
        }
        ContasEncerramentoMensal other = (ContasEncerramentoMensal) object;
        if ((this.ctemId == null && other.ctemId != null) || (this.ctemId != null && !this.ctemId.equals(other.ctemId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.ContasEncerramentoMensal[ ctemId=" + ctemId + " ]";
    }
    
}
