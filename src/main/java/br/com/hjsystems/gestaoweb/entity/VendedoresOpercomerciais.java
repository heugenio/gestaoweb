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
@Table(name = "VENDEDORES_OPERCOMERCIAIS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VendedoresOpercomerciais.findAll", query = "SELECT v FROM VendedoresOpercomerciais v"),
    @NamedQuery(name = "VendedoresOpercomerciais.findByVocmId", query = "SELECT v FROM VendedoresOpercomerciais v WHERE v.vocmId = :vocmId"),
    @NamedQuery(name = "VendedoresOpercomerciais.findByVocmLastupdate", query = "SELECT v FROM VendedoresOpercomerciais v WHERE v.vocmLastupdate = :vocmLastupdate")})
public class VendedoresOpercomerciais implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "VOCM_ID")
    private String vocmId;
    @Column(name = "VOCM_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date vocmLastupdate;
    @JoinColumn(name = "OPCM_ID", referencedColumnName = "OPCM_ID")
    @ManyToOne
    private OperacoesComerciais opcmId;
    @JoinColumn(name = "VDDR_ID", referencedColumnName = "VDDR_ID")
    @ManyToOne
    private Vendedores vddrId;

    public VendedoresOpercomerciais() {
    }

    public VendedoresOpercomerciais(String vocmId) {
        this.vocmId = vocmId;
    }

    public String getVocmId() {
        return vocmId;
    }

    public void setVocmId(String vocmId) {
        this.vocmId = vocmId;
    }

    public Date getVocmLastupdate() {
        return vocmLastupdate;
    }

    public void setVocmLastupdate(Date vocmLastupdate) {
        this.vocmLastupdate = vocmLastupdate;
    }

    public OperacoesComerciais getOpcmId() {
        return opcmId;
    }

    public void setOpcmId(OperacoesComerciais opcmId) {
        this.opcmId = opcmId;
    }

    public Vendedores getVddrId() {
        return vddrId;
    }

    public void setVddrId(Vendedores vddrId) {
        this.vddrId = vddrId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vocmId != null ? vocmId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VendedoresOpercomerciais)) {
            return false;
        }
        VendedoresOpercomerciais other = (VendedoresOpercomerciais) object;
        if ((this.vocmId == null && other.vocmId != null) || (this.vocmId != null && !this.vocmId.equals(other.vocmId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.VendedoresOpercomerciais[ vocmId=" + vocmId + " ]";
    }
    
}
