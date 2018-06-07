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
@Table(name = "STATUS_COMERCIAL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "StatusComercial.findAll", query = "SELECT s FROM StatusComercial s"),
    @NamedQuery(name = "StatusComercial.findByStcmId", query = "SELECT s FROM StatusComercial s WHERE s.stcmId = :stcmId"),
    @NamedQuery(name = "StatusComercial.findByStcmNome", query = "SELECT s FROM StatusComercial s WHERE s.stcmNome = :stcmNome"),
    @NamedQuery(name = "StatusComercial.findByStcmLastupdate", query = "SELECT s FROM StatusComercial s WHERE s.stcmLastupdate = :stcmLastupdate"),
    @NamedQuery(name = "StatusComercial.findByStcmBlqVenda", query = "SELECT s FROM StatusComercial s WHERE s.stcmBlqVenda = :stcmBlqVenda")})
public class StatusComercial implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "STCM_ID")
    private String stcmId;
    @Basic(optional = false)
    @Column(name = "STCM_NOME")
    private String stcmNome;
    @Column(name = "STCM_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date stcmLastupdate;
    @Column(name = "STCM_BLQ_VENDA")
    private String stcmBlqVenda;
    @OneToMany(mappedBy = "stcmId")
    private List<Clientes> clientesList;

    public StatusComercial() {
    }

    public StatusComercial(String stcmId) {
        this.stcmId = stcmId;
    }

    public StatusComercial(String stcmId, String stcmNome) {
        this.stcmId = stcmId;
        this.stcmNome = stcmNome;
    }

    public String getStcmId() {
        return stcmId;
    }

    public void setStcmId(String stcmId) {
        this.stcmId = stcmId;
    }

    public String getStcmNome() {
        return stcmNome;
    }

    public void setStcmNome(String stcmNome) {
        this.stcmNome = stcmNome;
    }

    public Date getStcmLastupdate() {
        return stcmLastupdate;
    }

    public void setStcmLastupdate(Date stcmLastupdate) {
        this.stcmLastupdate = stcmLastupdate;
    }

    public String getStcmBlqVenda() {
        return stcmBlqVenda;
    }

    public void setStcmBlqVenda(String stcmBlqVenda) {
        this.stcmBlqVenda = stcmBlqVenda;
    }

    @XmlTransient
    public List<Clientes> getClientesList() {
        return clientesList;
    }

    public void setClientesList(List<Clientes> clientesList) {
        this.clientesList = clientesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (stcmId != null ? stcmId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StatusComercial)) {
            return false;
        }
        StatusComercial other = (StatusComercial) object;
        if ((this.stcmId == null && other.stcmId != null) || (this.stcmId != null && !this.stcmId.equals(other.stcmId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.StatusComercial[ stcmId=" + stcmId + " ]";
    }
    
}
