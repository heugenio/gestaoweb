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
@Table(name = "HISTORICOS_ORDEMSERVICO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HistoricosOrdemservico.findAll", query = "SELECT h FROM HistoricosOrdemservico h"),
    @NamedQuery(name = "HistoricosOrdemservico.findByHorsId", query = "SELECT h FROM HistoricosOrdemservico h WHERE h.horsId = :horsId"),
    @NamedQuery(name = "HistoricosOrdemservico.findByHorsData", query = "SELECT h FROM HistoricosOrdemservico h WHERE h.horsData = :horsData"),
    @NamedQuery(name = "HistoricosOrdemservico.findByHorsStatus", query = "SELECT h FROM HistoricosOrdemservico h WHERE h.horsStatus = :horsStatus"),
    @NamedQuery(name = "HistoricosOrdemservico.findByHorsNomeUsuario", query = "SELECT h FROM HistoricosOrdemservico h WHERE h.horsNomeUsuario = :horsNomeUsuario"),
    @NamedQuery(name = "HistoricosOrdemservico.findByHorsLastupdate", query = "SELECT h FROM HistoricosOrdemservico h WHERE h.horsLastupdate = :horsLastupdate"),
    @NamedQuery(name = "HistoricosOrdemservico.findByHorsObservacao", query = "SELECT h FROM HistoricosOrdemservico h WHERE h.horsObservacao = :horsObservacao")})
public class HistoricosOrdemservico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "HORS_ID")
    private String horsId;
    @Column(name = "HORS_DATA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horsData;
    @Basic(optional = false)
    @Column(name = "HORS_STATUS")
    private String horsStatus;
    @Column(name = "HORS_NOME_USUARIO")
    private String horsNomeUsuario;
    @Column(name = "HORS_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horsLastupdate;
    @Column(name = "HORS_OBSERVACAO")
    private String horsObservacao;
    @JoinColumn(name = "ORSV_ID", referencedColumnName = "ORSV_ID")
    @ManyToOne
    private OrdemServico orsvId;

    public HistoricosOrdemservico() {
    }

    public HistoricosOrdemservico(String horsId) {
        this.horsId = horsId;
    }

    public HistoricosOrdemservico(String horsId, String horsStatus) {
        this.horsId = horsId;
        this.horsStatus = horsStatus;
    }

    public String getHorsId() {
        return horsId;
    }

    public void setHorsId(String horsId) {
        this.horsId = horsId;
    }

    public Date getHorsData() {
        return horsData;
    }

    public void setHorsData(Date horsData) {
        this.horsData = horsData;
    }

    public String getHorsStatus() {
        return horsStatus;
    }

    public void setHorsStatus(String horsStatus) {
        this.horsStatus = horsStatus;
    }

    public String getHorsNomeUsuario() {
        return horsNomeUsuario;
    }

    public void setHorsNomeUsuario(String horsNomeUsuario) {
        this.horsNomeUsuario = horsNomeUsuario;
    }

    public Date getHorsLastupdate() {
        return horsLastupdate;
    }

    public void setHorsLastupdate(Date horsLastupdate) {
        this.horsLastupdate = horsLastupdate;
    }

    public String getHorsObservacao() {
        return horsObservacao;
    }

    public void setHorsObservacao(String horsObservacao) {
        this.horsObservacao = horsObservacao;
    }

    public OrdemServico getOrsvId() {
        return orsvId;
    }

    public void setOrsvId(OrdemServico orsvId) {
        this.orsvId = orsvId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (horsId != null ? horsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HistoricosOrdemservico)) {
            return false;
        }
        HistoricosOrdemservico other = (HistoricosOrdemservico) object;
        if ((this.horsId == null && other.horsId != null) || (this.horsId != null && !this.horsId.equals(other.horsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.HistoricosOrdemservico[ horsId=" + horsId + " ]";
    }
    
}
