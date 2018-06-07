/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hjsystems.gestaoweb.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name = "TRANSPORTADORAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Transportadoras.findAll", query = "SELECT t FROM Transportadoras t"),
    @NamedQuery(name = "Transportadoras.findByTrspId", query = "SELECT t FROM Transportadoras t WHERE t.trspId = :trspId"),
    @NamedQuery(name = "Transportadoras.findByTrspStatus", query = "SELECT t FROM Transportadoras t WHERE t.trspStatus = :trspStatus"),
    @NamedQuery(name = "Transportadoras.findByTrspLASTUPDATE", query = "SELECT t FROM Transportadoras t WHERE t.trspLASTUPDATE = :trspLASTUPDATE"),
    @NamedQuery(name = "Transportadoras.findByTrspRcte", query = "SELECT t FROM Transportadoras t WHERE t.trspRcte = :trspRcte")})
public class Transportadoras implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TRSP_ID")
    private String trspId;
    @Column(name = "TRSP_STATUS")
    private String trspStatus;
    @Column(name = "Trsp_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date trspLASTUPDATE;
    @Column(name = "TRSP_RCTE")
    private String trspRcte;
    @OneToMany(mappedBy = "trspId")
    private List<Pedidos> pedidosList;
    @JoinColumn(name = "PESS_ID", referencedColumnName = "PESS_ID")
    @ManyToOne
    private Pessoas pessId;
    @OneToMany(mappedBy = "trspId")
    private List<Clientes> clientesList;
    @OneToMany(mappedBy = "trspId")
    private List<Expedicoes> expedicoesList;

    public Transportadoras() {
    }

    public Transportadoras(String trspId) {
        this.trspId = trspId;
    }

    public String getTrspId() {
        return trspId;
    }

    public void setTrspId(String trspId) {
        this.trspId = trspId;
    }

    public String getTrspStatus() {
        return trspStatus;
    }

    public void setTrspStatus(String trspStatus) {
        this.trspStatus = trspStatus;
    }

    public Date getTrspLASTUPDATE() {
        return trspLASTUPDATE;
    }

    public void setTrspLASTUPDATE(Date trspLASTUPDATE) {
        this.trspLASTUPDATE = trspLASTUPDATE;
    }

    public String getTrspRcte() {
        return trspRcte;
    }

    public void setTrspRcte(String trspRcte) {
        this.trspRcte = trspRcte;
    }

    @XmlTransient
    public List<Pedidos> getPedidosList() {
        return pedidosList;
    }

    public void setPedidosList(List<Pedidos> pedidosList) {
        this.pedidosList = pedidosList;
    }

    public Pessoas getPessId() {
        return pessId;
    }

    public void setPessId(Pessoas pessId) {
        this.pessId = pessId;
    }

    @XmlTransient
    public List<Clientes> getClientesList() {
        return clientesList;
    }

    public void setClientesList(List<Clientes> clientesList) {
        this.clientesList = clientesList;
    }

    @XmlTransient
    public List<Expedicoes> getExpedicoesList() {
        return expedicoesList;
    }

    public void setExpedicoesList(List<Expedicoes> expedicoesList) {
        this.expedicoesList = expedicoesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (trspId != null ? trspId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transportadoras)) {
            return false;
        }
        Transportadoras other = (Transportadoras) object;
        if ((this.trspId == null && other.trspId != null) || (this.trspId != null && !this.trspId.equals(other.trspId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.Transportadoras[ trspId=" + trspId + " ]";
    }
    
}
