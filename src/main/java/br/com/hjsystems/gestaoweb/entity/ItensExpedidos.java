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
@Table(name = "ITENS_EXPEDIDOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ItensExpedidos.findAll", query = "SELECT i FROM ItensExpedidos i"),
    @NamedQuery(name = "ItensExpedidos.findByItexId", query = "SELECT i FROM ItensExpedidos i WHERE i.itexId = :itexId"),
    @NamedQuery(name = "ItensExpedidos.findByItexQtde", query = "SELECT i FROM ItensExpedidos i WHERE i.itexQtde = :itexQtde"),
    @NamedQuery(name = "ItensExpedidos.findByItexDataEntrega", query = "SELECT i FROM ItensExpedidos i WHERE i.itexDataEntrega = :itexDataEntrega"),
    @NamedQuery(name = "ItensExpedidos.findByItExLASTUPDATE", query = "SELECT i FROM ItensExpedidos i WHERE i.itExLASTUPDATE = :itExLASTUPDATE")})
public class ItensExpedidos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ITEX_ID")
    private String itexId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ITEX_QTDE")
    private BigDecimal itexQtde;
    @Column(name = "ITEX_DATA_ENTREGA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date itexDataEntrega;
    @Column(name = "ItEx_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date itExLASTUPDATE;
    @JoinColumn(name = "EXPD_ID", referencedColumnName = "EXPD_ID")
    @ManyToOne
    private Expedicoes expdId;
    @JoinColumn(name = "ITPD_ID", referencedColumnName = "ITPD_ID")
    @ManyToOne
    private ItensPedidos itpdId;

    public ItensExpedidos() {
    }

    public ItensExpedidos(String itexId) {
        this.itexId = itexId;
    }

    public String getItexId() {
        return itexId;
    }

    public void setItexId(String itexId) {
        this.itexId = itexId;
    }

    public BigDecimal getItexQtde() {
        return itexQtde;
    }

    public void setItexQtde(BigDecimal itexQtde) {
        this.itexQtde = itexQtde;
    }

    public Date getItexDataEntrega() {
        return itexDataEntrega;
    }

    public void setItexDataEntrega(Date itexDataEntrega) {
        this.itexDataEntrega = itexDataEntrega;
    }

    public Date getItExLASTUPDATE() {
        return itExLASTUPDATE;
    }

    public void setItExLASTUPDATE(Date itExLASTUPDATE) {
        this.itExLASTUPDATE = itExLASTUPDATE;
    }

    public Expedicoes getExpdId() {
        return expdId;
    }

    public void setExpdId(Expedicoes expdId) {
        this.expdId = expdId;
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
        hash += (itexId != null ? itexId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItensExpedidos)) {
            return false;
        }
        ItensExpedidos other = (ItensExpedidos) object;
        if ((this.itexId == null && other.itexId != null) || (this.itexId != null && !this.itexId.equals(other.itexId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.ItensExpedidos[ itexId=" + itexId + " ]";
    }
    
}
