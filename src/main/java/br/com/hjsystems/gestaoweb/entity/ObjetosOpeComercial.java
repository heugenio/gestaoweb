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
@Table(name = "OBJETOS_OPE_COMERCIAL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ObjetosOpeComercial.findAll", query = "SELECT o FROM ObjetosOpeComercial o"),
    @NamedQuery(name = "ObjetosOpeComercial.findByOopcId", query = "SELECT o FROM ObjetosOpeComercial o WHERE o.oopcId = :oopcId"),
    @NamedQuery(name = "ObjetosOpeComercial.findByOopcLastupdate", query = "SELECT o FROM ObjetosOpeComercial o WHERE o.oopcLastupdate = :oopcLastupdate")})
public class ObjetosOpeComercial implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "OOPC_ID")
    private String oopcId;
    @Column(name = "OOPC_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date oopcLastupdate;
    @JoinColumn(name = "ORVD_ID", referencedColumnName = "ORVD_ID")
    @ManyToOne
    private OrcamentosVendas orvdId;
    @JoinColumn(name = "PDDS_ID", referencedColumnName = "PDDS_ID")
    @ManyToOne
    private Pedidos pddsId;
    @JoinColumn(name = "RQSC_ID", referencedColumnName = "RQSC_ID")
    @ManyToOne
    private Requisicoes rqscId;
    @OneToMany(mappedBy = "oopcId")
    private List<VeiculoObjopecoml> veiculoObjopecomlList;

    public ObjetosOpeComercial() {
    }

    public ObjetosOpeComercial(String oopcId) {
        this.oopcId = oopcId;
    }

    public String getOopcId() {
        return oopcId;
    }

    public void setOopcId(String oopcId) {
        this.oopcId = oopcId;
    }

    public Date getOopcLastupdate() {
        return oopcLastupdate;
    }

    public void setOopcLastupdate(Date oopcLastupdate) {
        this.oopcLastupdate = oopcLastupdate;
    }

    public OrcamentosVendas getOrvdId() {
        return orvdId;
    }

    public void setOrvdId(OrcamentosVendas orvdId) {
        this.orvdId = orvdId;
    }

    public Pedidos getPddsId() {
        return pddsId;
    }

    public void setPddsId(Pedidos pddsId) {
        this.pddsId = pddsId;
    }

    public Requisicoes getRqscId() {
        return rqscId;
    }

    public void setRqscId(Requisicoes rqscId) {
        this.rqscId = rqscId;
    }

    @XmlTransient
    public List<VeiculoObjopecoml> getVeiculoObjopecomlList() {
        return veiculoObjopecomlList;
    }

    public void setVeiculoObjopecomlList(List<VeiculoObjopecoml> veiculoObjopecomlList) {
        this.veiculoObjopecomlList = veiculoObjopecomlList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (oopcId != null ? oopcId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ObjetosOpeComercial)) {
            return false;
        }
        ObjetosOpeComercial other = (ObjetosOpeComercial) object;
        if ((this.oopcId == null && other.oopcId != null) || (this.oopcId != null && !this.oopcId.equals(other.oopcId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.ObjetosOpeComercial[ oopcId=" + oopcId + " ]";
    }
    
}
