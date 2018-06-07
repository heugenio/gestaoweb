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
@Table(name = "PRE_RESERVAS_ATENDIDAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PreReservasAtendidas.findAll", query = "SELECT p FROM PreReservasAtendidas p"),
    @NamedQuery(name = "PreReservasAtendidas.findByPratId", query = "SELECT p FROM PreReservasAtendidas p WHERE p.pratId = :pratId"),
    @NamedQuery(name = "PreReservasAtendidas.findByPratQtdeAtendida", query = "SELECT p FROM PreReservasAtendidas p WHERE p.pratQtdeAtendida = :pratQtdeAtendida"),
    @NamedQuery(name = "PreReservasAtendidas.findByPrAtLASTUPDATE", query = "SELECT p FROM PreReservasAtendidas p WHERE p.prAtLASTUPDATE = :prAtLASTUPDATE")})
public class PreReservasAtendidas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PRAT_ID")
    private String pratId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "PRAT_QTDE_ATENDIDA")
    private BigDecimal pratQtdeAtendida;
    @Column(name = "PrAt_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date prAtLASTUPDATE;
    @JoinColumn(name = "ITOR_ID", referencedColumnName = "ITOR_ID")
    @ManyToOne
    private ItensOrcamentos itorId;
    @JoinColumn(name = "ITE_ITPD_ID", referencedColumnName = "ITPD_ID")
    @ManyToOne
    private ItensPedidos iteItpdId;
    @JoinColumn(name = "ITPD_ID", referencedColumnName = "ITPD_ID")
    @ManyToOne
    private ItensPedidos itpdId;

    public PreReservasAtendidas() {
    }

    public PreReservasAtendidas(String pratId) {
        this.pratId = pratId;
    }

    public PreReservasAtendidas(String pratId, BigDecimal pratQtdeAtendida) {
        this.pratId = pratId;
        this.pratQtdeAtendida = pratQtdeAtendida;
    }

    public String getPratId() {
        return pratId;
    }

    public void setPratId(String pratId) {
        this.pratId = pratId;
    }

    public BigDecimal getPratQtdeAtendida() {
        return pratQtdeAtendida;
    }

    public void setPratQtdeAtendida(BigDecimal pratQtdeAtendida) {
        this.pratQtdeAtendida = pratQtdeAtendida;
    }

    public Date getPrAtLASTUPDATE() {
        return prAtLASTUPDATE;
    }

    public void setPrAtLASTUPDATE(Date prAtLASTUPDATE) {
        this.prAtLASTUPDATE = prAtLASTUPDATE;
    }

    public ItensOrcamentos getItorId() {
        return itorId;
    }

    public void setItorId(ItensOrcamentos itorId) {
        this.itorId = itorId;
    }

    public ItensPedidos getIteItpdId() {
        return iteItpdId;
    }

    public void setIteItpdId(ItensPedidos iteItpdId) {
        this.iteItpdId = iteItpdId;
    }

    public ItensPedidos getItpdId() {
        return itpdId;
    }

    public void setItpdId(ItensPedidos itpdId) {
        this.itpdId = itpdId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pratId != null ? pratId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PreReservasAtendidas)) {
            return false;
        }
        PreReservasAtendidas other = (PreReservasAtendidas) object;
        if ((this.pratId == null && other.pratId != null) || (this.pratId != null && !this.pratId.equals(other.pratId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.PreReservasAtendidas[ pratId=" + pratId + " ]";
    }
    
}
