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
import javax.persistence.Lob;
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
@Table(name = "RMA_ITENS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RmaItens.findAll", query = "SELECT r FROM RmaItens r"),
    @NamedQuery(name = "RmaItens.findByRmaiId", query = "SELECT r FROM RmaItens r WHERE r.rmaiId = :rmaiId"),
    @NamedQuery(name = "RmaItens.findByRmaiQtd", query = "SELECT r FROM RmaItens r WHERE r.rmaiQtd = :rmaiQtd"),
    @NamedQuery(name = "RmaItens.findByRmaiNumeroSerie", query = "SELECT r FROM RmaItens r WHERE r.rmaiNumeroSerie = :rmaiNumeroSerie"),
    @NamedQuery(name = "RmaItens.findByRmaiDefeito", query = "SELECT r FROM RmaItens r WHERE r.rmaiDefeito = :rmaiDefeito"),
    @NamedQuery(name = "RmaItens.findByRmaiLastupdate", query = "SELECT r FROM RmaItens r WHERE r.rmaiLastupdate = :rmaiLastupdate")})
public class RmaItens implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "RMAI_ID")
    private String rmaiId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "RMAI_QTD")
    private BigDecimal rmaiQtd;
    @Column(name = "RMAI_NUMERO_SERIE")
    private String rmaiNumeroSerie;
    @Column(name = "RMAI_DEFEITO")
    private String rmaiDefeito;
    @Lob
    @Column(name = "RMAI_OBS")
    private String rmaiObs;
    @Column(name = "RMAI_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rmaiLastupdate;
    @JoinColumn(name = "RMAS_ID", referencedColumnName = "RMAS_ID")
    @ManyToOne
    private Rmas rmasId;
    @JoinColumn(name = "TEST_ID", referencedColumnName = "TEST_ID")
    @ManyToOne
    private TiposEstoques testId;

    public RmaItens() {
    }

    public RmaItens(String rmaiId) {
        this.rmaiId = rmaiId;
    }

    public RmaItens(String rmaiId, BigDecimal rmaiQtd) {
        this.rmaiId = rmaiId;
        this.rmaiQtd = rmaiQtd;
    }

    public String getRmaiId() {
        return rmaiId;
    }

    public void setRmaiId(String rmaiId) {
        this.rmaiId = rmaiId;
    }

    public BigDecimal getRmaiQtd() {
        return rmaiQtd;
    }

    public void setRmaiQtd(BigDecimal rmaiQtd) {
        this.rmaiQtd = rmaiQtd;
    }

    public String getRmaiNumeroSerie() {
        return rmaiNumeroSerie;
    }

    public void setRmaiNumeroSerie(String rmaiNumeroSerie) {
        this.rmaiNumeroSerie = rmaiNumeroSerie;
    }

    public String getRmaiDefeito() {
        return rmaiDefeito;
    }

    public void setRmaiDefeito(String rmaiDefeito) {
        this.rmaiDefeito = rmaiDefeito;
    }

    public String getRmaiObs() {
        return rmaiObs;
    }

    public void setRmaiObs(String rmaiObs) {
        this.rmaiObs = rmaiObs;
    }

    public Date getRmaiLastupdate() {
        return rmaiLastupdate;
    }

    public void setRmaiLastupdate(Date rmaiLastupdate) {
        this.rmaiLastupdate = rmaiLastupdate;
    }

    public Rmas getRmasId() {
        return rmasId;
    }

    public void setRmasId(Rmas rmasId) {
        this.rmasId = rmasId;
    }

    public TiposEstoques getTestId() {
        return testId;
    }

    public void setTestId(TiposEstoques testId) {
        this.testId = testId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rmaiId != null ? rmaiId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RmaItens)) {
            return false;
        }
        RmaItens other = (RmaItens) object;
        if ((this.rmaiId == null && other.rmaiId != null) || (this.rmaiId != null && !this.rmaiId.equals(other.rmaiId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.RmaItens[ rmaiId=" + rmaiId + " ]";
    }
    
}
