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
@Table(name = "CHEQUES_TROCAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ChequesTrocas.findAll", query = "SELECT c FROM ChequesTrocas c"),
    @NamedQuery(name = "ChequesTrocas.findByChtrId", query = "SELECT c FROM ChequesTrocas c WHERE c.chtrId = :chtrId"),
    @NamedQuery(name = "ChequesTrocas.findByChtrValor", query = "SELECT c FROM ChequesTrocas c WHERE c.chtrValor = :chtrValor"),
    @NamedQuery(name = "ChequesTrocas.findByChtrLastupdate", query = "SELECT c FROM ChequesTrocas c WHERE c.chtrLastupdate = :chtrLastupdate")})
public class ChequesTrocas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CHTR_ID")
    private String chtrId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "CHTR_VALOR")
    private BigDecimal chtrValor;
    @Column(name = "CHTR_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date chtrLastupdate;
    @JoinColumn(name = "CHQS_ID", referencedColumnName = "CHQS_ID")
    @ManyToOne
    private Cheques chqsId;
    @JoinColumn(name = "CHE_CHQS_ID", referencedColumnName = "CHQS_ID")
    @ManyToOne
    private Cheques cheChqsId;
    @JoinColumn(name = "ITCX_ID", referencedColumnName = "ITCX_ID")
    @ManyToOne
    private ItensCaixas itcxId;

    public ChequesTrocas() {
    }

    public ChequesTrocas(String chtrId) {
        this.chtrId = chtrId;
    }

    public ChequesTrocas(String chtrId, BigDecimal chtrValor) {
        this.chtrId = chtrId;
        this.chtrValor = chtrValor;
    }

    public String getChtrId() {
        return chtrId;
    }

    public void setChtrId(String chtrId) {
        this.chtrId = chtrId;
    }

    public BigDecimal getChtrValor() {
        return chtrValor;
    }

    public void setChtrValor(BigDecimal chtrValor) {
        this.chtrValor = chtrValor;
    }

    public Date getChtrLastupdate() {
        return chtrLastupdate;
    }

    public void setChtrLastupdate(Date chtrLastupdate) {
        this.chtrLastupdate = chtrLastupdate;
    }

    public Cheques getChqsId() {
        return chqsId;
    }

    public void setChqsId(Cheques chqsId) {
        this.chqsId = chqsId;
    }

    public Cheques getCheChqsId() {
        return cheChqsId;
    }

    public void setCheChqsId(Cheques cheChqsId) {
        this.cheChqsId = cheChqsId;
    }

    public ItensCaixas getItcxId() {
        return itcxId;
    }

    public void setItcxId(ItensCaixas itcxId) {
        this.itcxId = itcxId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (chtrId != null ? chtrId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ChequesTrocas)) {
            return false;
        }
        ChequesTrocas other = (ChequesTrocas) object;
        if ((this.chtrId == null && other.chtrId != null) || (this.chtrId != null && !this.chtrId.equals(other.chtrId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.ChequesTrocas[ chtrId=" + chtrId + " ]";
    }
    
}
