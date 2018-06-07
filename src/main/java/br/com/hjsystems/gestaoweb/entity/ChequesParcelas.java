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
@Table(name = "CHEQUES_PARCELAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ChequesParcelas.findAll", query = "SELECT c FROM ChequesParcelas c"),
    @NamedQuery(name = "ChequesParcelas.findByChpcId", query = "SELECT c FROM ChequesParcelas c WHERE c.chpcId = :chpcId"),
    @NamedQuery(name = "ChequesParcelas.findByChpcValor", query = "SELECT c FROM ChequesParcelas c WHERE c.chpcValor = :chpcValor"),
    @NamedQuery(name = "ChequesParcelas.findByChpcLastupdate", query = "SELECT c FROM ChequesParcelas c WHERE c.chpcLastupdate = :chpcLastupdate")})
public class ChequesParcelas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CHPC_ID")
    private String chpcId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "CHPC_VALOR")
    private BigDecimal chpcValor;
    @Column(name = "CHPC_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date chpcLastupdate;
    @JoinColumn(name = "CHQS_ID", referencedColumnName = "CHQS_ID")
    @ManyToOne
    private Cheques chqsId;
    @JoinColumn(name = "PCLS_ID", referencedColumnName = "PCLS_ID")
    @ManyToOne
    private Parcelas pclsId;

    public ChequesParcelas() {
    }

    public ChequesParcelas(String chpcId) {
        this.chpcId = chpcId;
    }

    public ChequesParcelas(String chpcId, BigDecimal chpcValor) {
        this.chpcId = chpcId;
        this.chpcValor = chpcValor;
    }

    public String getChpcId() {
        return chpcId;
    }

    public void setChpcId(String chpcId) {
        this.chpcId = chpcId;
    }

    public BigDecimal getChpcValor() {
        return chpcValor;
    }

    public void setChpcValor(BigDecimal chpcValor) {
        this.chpcValor = chpcValor;
    }

    public Date getChpcLastupdate() {
        return chpcLastupdate;
    }

    public void setChpcLastupdate(Date chpcLastupdate) {
        this.chpcLastupdate = chpcLastupdate;
    }

    public Cheques getChqsId() {
        return chqsId;
    }

    public void setChqsId(Cheques chqsId) {
        this.chqsId = chqsId;
    }

    public Parcelas getPclsId() {
        return pclsId;
    }

    public void setPclsId(Parcelas pclsId) {
        this.pclsId = pclsId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (chpcId != null ? chpcId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ChequesParcelas)) {
            return false;
        }
        ChequesParcelas other = (ChequesParcelas) object;
        if ((this.chpcId == null && other.chpcId != null) || (this.chpcId != null && !this.chpcId.equals(other.chpcId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.ChequesParcelas[ chpcId=" + chpcId + " ]";
    }
    
}
