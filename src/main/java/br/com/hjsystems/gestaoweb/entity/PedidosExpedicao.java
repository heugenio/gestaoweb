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
@Table(name = "PEDIDOS_EXPEDICAO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PedidosExpedicao.findAll", query = "SELECT p FROM PedidosExpedicao p"),
    @NamedQuery(name = "PedidosExpedicao.findByPdexId", query = "SELECT p FROM PedidosExpedicao p WHERE p.pdexId = :pdexId"),
    @NamedQuery(name = "PedidosExpedicao.findByPdExLASTUPDATE", query = "SELECT p FROM PedidosExpedicao p WHERE p.pdExLASTUPDATE = :pdExLASTUPDATE")})
public class PedidosExpedicao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PDEX_ID")
    private String pdexId;
    @Column(name = "PdEx_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pdExLASTUPDATE;
    @JoinColumn(name = "EXPD_ID", referencedColumnName = "EXPD_ID")
    @ManyToOne
    private Expedicoes expdId;
    @JoinColumn(name = "PDDS_ID", referencedColumnName = "PDDS_ID")
    @ManyToOne
    private Pedidos pddsId;

    public PedidosExpedicao() {
    }

    public PedidosExpedicao(String pdexId) {
        this.pdexId = pdexId;
    }

    public String getPdexId() {
        return pdexId;
    }

    public void setPdexId(String pdexId) {
        this.pdexId = pdexId;
    }

    public Date getPdExLASTUPDATE() {
        return pdExLASTUPDATE;
    }

    public void setPdExLASTUPDATE(Date pdExLASTUPDATE) {
        this.pdExLASTUPDATE = pdExLASTUPDATE;
    }

    public Expedicoes getExpdId() {
        return expdId;
    }

    public void setExpdId(Expedicoes expdId) {
        this.expdId = expdId;
    }

    public Pedidos getPddsId() {
        return pddsId;
    }

    public void setPddsId(Pedidos pddsId) {
        this.pddsId = pddsId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pdexId != null ? pdexId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PedidosExpedicao)) {
            return false;
        }
        PedidosExpedicao other = (PedidosExpedicao) object;
        if ((this.pdexId == null && other.pdexId != null) || (this.pdexId != null && !this.pdexId.equals(other.pdexId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.PedidosExpedicao[ pdexId=" + pdexId + " ]";
    }
    
}
