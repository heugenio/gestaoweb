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
@Table(name = "COBRANCAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cobrancas.findAll", query = "SELECT c FROM Cobrancas c"),
    @NamedQuery(name = "Cobrancas.findByCobrId", query = "SELECT c FROM Cobrancas c WHERE c.cobrId = :cobrId"),
    @NamedQuery(name = "Cobrancas.findByCobrDtLigacao", query = "SELECT c FROM Cobrancas c WHERE c.cobrDtLigacao = :cobrDtLigacao"),
    @NamedQuery(name = "Cobrancas.findByCobrHrInicio", query = "SELECT c FROM Cobrancas c WHERE c.cobrHrInicio = :cobrHrInicio"),
    @NamedQuery(name = "Cobrancas.findByCobrHrFinal", query = "SELECT c FROM Cobrancas c WHERE c.cobrHrFinal = :cobrHrFinal"),
    @NamedQuery(name = "Cobrancas.findByCobrDtPrevizao", query = "SELECT c FROM Cobrancas c WHERE c.cobrDtPrevizao = :cobrDtPrevizao"),
    @NamedQuery(name = "Cobrancas.findByCobrNegociacao", query = "SELECT c FROM Cobrancas c WHERE c.cobrNegociacao = :cobrNegociacao"),
    @NamedQuery(name = "Cobrancas.findByCobrLastupdate", query = "SELECT c FROM Cobrancas c WHERE c.cobrLastupdate = :cobrLastupdate")})
public class Cobrancas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COBR_ID")
    private String cobrId;
    @Column(name = "COBR_DT_LIGACAO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cobrDtLigacao;
    @Column(name = "COBR_HR_INICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cobrHrInicio;
    @Column(name = "COBR_HR_FINAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cobrHrFinal;
    @Column(name = "COBR_DT_PREVIZAO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cobrDtPrevizao;
    @Column(name = "COBR_NEGOCIACAO")
    private String cobrNegociacao;
    @Column(name = "COBR_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cobrLastupdate;
    @JoinColumn(name = "PESS_ID", referencedColumnName = "PESS_ID")
    @ManyToOne
    private Pessoas pessId;
    @JoinColumn(name = "USRS_ID", referencedColumnName = "USRS_ID")
    @ManyToOne
    private Usuarios usrsId;

    public Cobrancas() {
    }

    public Cobrancas(String cobrId) {
        this.cobrId = cobrId;
    }

    public String getCobrId() {
        return cobrId;
    }

    public void setCobrId(String cobrId) {
        this.cobrId = cobrId;
    }

    public Date getCobrDtLigacao() {
        return cobrDtLigacao;
    }

    public void setCobrDtLigacao(Date cobrDtLigacao) {
        this.cobrDtLigacao = cobrDtLigacao;
    }

    public Date getCobrHrInicio() {
        return cobrHrInicio;
    }

    public void setCobrHrInicio(Date cobrHrInicio) {
        this.cobrHrInicio = cobrHrInicio;
    }

    public Date getCobrHrFinal() {
        return cobrHrFinal;
    }

    public void setCobrHrFinal(Date cobrHrFinal) {
        this.cobrHrFinal = cobrHrFinal;
    }

    public Date getCobrDtPrevizao() {
        return cobrDtPrevizao;
    }

    public void setCobrDtPrevizao(Date cobrDtPrevizao) {
        this.cobrDtPrevizao = cobrDtPrevizao;
    }

    public String getCobrNegociacao() {
        return cobrNegociacao;
    }

    public void setCobrNegociacao(String cobrNegociacao) {
        this.cobrNegociacao = cobrNegociacao;
    }

    public Date getCobrLastupdate() {
        return cobrLastupdate;
    }

    public void setCobrLastupdate(Date cobrLastupdate) {
        this.cobrLastupdate = cobrLastupdate;
    }

    public Pessoas getPessId() {
        return pessId;
    }

    public void setPessId(Pessoas pessId) {
        this.pessId = pessId;
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
        hash += (cobrId != null ? cobrId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cobrancas)) {
            return false;
        }
        Cobrancas other = (Cobrancas) object;
        if ((this.cobrId == null && other.cobrId != null) || (this.cobrId != null && !this.cobrId.equals(other.cobrId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.Cobrancas[ cobrId=" + cobrId + " ]";
    }
    
}
