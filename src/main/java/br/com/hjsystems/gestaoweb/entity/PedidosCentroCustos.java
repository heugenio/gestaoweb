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
@Table(name = "PEDIDOS_CENTRO_CUSTOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PedidosCentroCustos.findAll", query = "SELECT p FROM PedidosCentroCustos p"),
    @NamedQuery(name = "PedidosCentroCustos.findByPdccId", query = "SELECT p FROM PedidosCentroCustos p WHERE p.pdccId = :pdccId"),
    @NamedQuery(name = "PedidosCentroCustos.findByPdccValor", query = "SELECT p FROM PedidosCentroCustos p WHERE p.pdccValor = :pdccValor"),
    @NamedQuery(name = "PedidosCentroCustos.findByPdccPerc", query = "SELECT p FROM PedidosCentroCustos p WHERE p.pdccPerc = :pdccPerc"),
    @NamedQuery(name = "PedidosCentroCustos.findByPdccLastupdate", query = "SELECT p FROM PedidosCentroCustos p WHERE p.pdccLastupdate = :pdccLastupdate")})
public class PedidosCentroCustos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PDCC_ID")
    private String pdccId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "PDCC_VALOR")
    private BigDecimal pdccValor;
    @Basic(optional = false)
    @Column(name = "PDCC_PERC")
    private BigDecimal pdccPerc;
    @Column(name = "PDCC_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pdccLastupdate;
    @JoinColumn(name = "DCFS_ID", referencedColumnName = "DCFS_ID")
    @ManyToOne
    private DocumentosFiscais dcfsId;
    @JoinColumn(name = "PDDS_ID", referencedColumnName = "PDDS_ID")
    @ManyToOne
    private Pedidos pddsId;
    @JoinColumn(name = "PLCT_ID", referencedColumnName = "PLCT_ID")
    @ManyToOne
    private PlanoContas plctId;

    public PedidosCentroCustos() {
    }

    public PedidosCentroCustos(String pdccId) {
        this.pdccId = pdccId;
    }

    public PedidosCentroCustos(String pdccId, BigDecimal pdccValor, BigDecimal pdccPerc) {
        this.pdccId = pdccId;
        this.pdccValor = pdccValor;
        this.pdccPerc = pdccPerc;
    }

    public String getPdccId() {
        return pdccId;
    }

    public void setPdccId(String pdccId) {
        this.pdccId = pdccId;
    }

    public BigDecimal getPdccValor() {
        return pdccValor;
    }

    public void setPdccValor(BigDecimal pdccValor) {
        this.pdccValor = pdccValor;
    }

    public BigDecimal getPdccPerc() {
        return pdccPerc;
    }

    public void setPdccPerc(BigDecimal pdccPerc) {
        this.pdccPerc = pdccPerc;
    }

    public Date getPdccLastupdate() {
        return pdccLastupdate;
    }

    public void setPdccLastupdate(Date pdccLastupdate) {
        this.pdccLastupdate = pdccLastupdate;
    }

    public DocumentosFiscais getDcfsId() {
        return dcfsId;
    }

    public void setDcfsId(DocumentosFiscais dcfsId) {
        this.dcfsId = dcfsId;
    }

    public Pedidos getPddsId() {
        return pddsId;
    }

    public void setPddsId(Pedidos pddsId) {
        this.pddsId = pddsId;
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
        hash += (pdccId != null ? pdccId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PedidosCentroCustos)) {
            return false;
        }
        PedidosCentroCustos other = (PedidosCentroCustos) object;
        if ((this.pdccId == null && other.pdccId != null) || (this.pdccId != null && !this.pdccId.equals(other.pdccId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.PedidosCentroCustos[ pdccId=" + pdccId + " ]";
    }
    
}
