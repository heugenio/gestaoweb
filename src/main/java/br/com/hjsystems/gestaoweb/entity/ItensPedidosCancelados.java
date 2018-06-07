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
@Table(name = "ITENS_PEDIDOS_CANCELADOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ItensPedidosCancelados.findAll", query = "SELECT i FROM ItensPedidosCancelados i"),
    @NamedQuery(name = "ItensPedidosCancelados.findByIpdcId", query = "SELECT i FROM ItensPedidosCancelados i WHERE i.ipdcId = :ipdcId"),
    @NamedQuery(name = "ItensPedidosCancelados.findByIpdcQtde", query = "SELECT i FROM ItensPedidosCancelados i WHERE i.ipdcQtde = :ipdcQtde"),
    @NamedQuery(name = "ItensPedidosCancelados.findByIpdcData", query = "SELECT i FROM ItensPedidosCancelados i WHERE i.ipdcData = :ipdcData"),
    @NamedQuery(name = "ItensPedidosCancelados.findByIpdcUsuario", query = "SELECT i FROM ItensPedidosCancelados i WHERE i.ipdcUsuario = :ipdcUsuario"),
    @NamedQuery(name = "ItensPedidosCancelados.findByIpdcLastupdate", query = "SELECT i FROM ItensPedidosCancelados i WHERE i.ipdcLastupdate = :ipdcLastupdate")})
public class ItensPedidosCancelados implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IPDC_ID")
    private String ipdcId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "IPDC_QTDE")
    private BigDecimal ipdcQtde;
    @Basic(optional = false)
    @Column(name = "IPDC_DATA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ipdcData;
    @Basic(optional = false)
    @Column(name = "IPDC_USUARIO")
    private String ipdcUsuario;
    @Column(name = "IPDC_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ipdcLastupdate;
    @JoinColumn(name = "ITPD_ID", referencedColumnName = "ITPD_ID")
    @ManyToOne
    private ItensPedidos itpdId;

    public ItensPedidosCancelados() {
    }

    public ItensPedidosCancelados(String ipdcId) {
        this.ipdcId = ipdcId;
    }

    public ItensPedidosCancelados(String ipdcId, BigDecimal ipdcQtde, Date ipdcData, String ipdcUsuario) {
        this.ipdcId = ipdcId;
        this.ipdcQtde = ipdcQtde;
        this.ipdcData = ipdcData;
        this.ipdcUsuario = ipdcUsuario;
    }

    public String getIpdcId() {
        return ipdcId;
    }

    public void setIpdcId(String ipdcId) {
        this.ipdcId = ipdcId;
    }

    public BigDecimal getIpdcQtde() {
        return ipdcQtde;
    }

    public void setIpdcQtde(BigDecimal ipdcQtde) {
        this.ipdcQtde = ipdcQtde;
    }

    public Date getIpdcData() {
        return ipdcData;
    }

    public void setIpdcData(Date ipdcData) {
        this.ipdcData = ipdcData;
    }

    public String getIpdcUsuario() {
        return ipdcUsuario;
    }

    public void setIpdcUsuario(String ipdcUsuario) {
        this.ipdcUsuario = ipdcUsuario;
    }

    public Date getIpdcLastupdate() {
        return ipdcLastupdate;
    }

    public void setIpdcLastupdate(Date ipdcLastupdate) {
        this.ipdcLastupdate = ipdcLastupdate;
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
        hash += (ipdcId != null ? ipdcId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItensPedidosCancelados)) {
            return false;
        }
        ItensPedidosCancelados other = (ItensPedidosCancelados) object;
        if ((this.ipdcId == null && other.ipdcId != null) || (this.ipdcId != null && !this.ipdcId.equals(other.ipdcId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.ItensPedidosCancelados[ ipdcId=" + ipdcId + " ]";
    }
    
}
