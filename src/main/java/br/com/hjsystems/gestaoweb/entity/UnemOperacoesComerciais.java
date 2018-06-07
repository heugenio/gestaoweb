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
@Table(name = "UNEM_OPERACOES_COMERCIAIS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UnemOperacoesComerciais.findAll", query = "SELECT u FROM UnemOperacoesComerciais u"),
    @NamedQuery(name = "UnemOperacoesComerciais.findByUeocId", query = "SELECT u FROM UnemOperacoesComerciais u WHERE u.ueocId = :ueocId"),
    @NamedQuery(name = "UnemOperacoesComerciais.findByUeocLastupdate", query = "SELECT u FROM UnemOperacoesComerciais u WHERE u.ueocLastupdate = :ueocLastupdate")})
public class UnemOperacoesComerciais implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "UEOC_ID")
    private String ueocId;
    @Column(name = "UEOC_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ueocLastupdate;
    @JoinColumn(name = "OPCM_ID", referencedColumnName = "OPCM_ID")
    @ManyToOne
    private OperacoesComerciais opcmId;
    @JoinColumn(name = "UNEM_ID", referencedColumnName = "UNEM_ID")
    @ManyToOne
    private UnidadesEmpresariais unemId;

    public UnemOperacoesComerciais() {
    }

    public UnemOperacoesComerciais(String ueocId) {
        this.ueocId = ueocId;
    }

    public String getUeocId() {
        return ueocId;
    }

    public void setUeocId(String ueocId) {
        this.ueocId = ueocId;
    }

    public Date getUeocLastupdate() {
        return ueocLastupdate;
    }

    public void setUeocLastupdate(Date ueocLastupdate) {
        this.ueocLastupdate = ueocLastupdate;
    }

    public OperacoesComerciais getOpcmId() {
        return opcmId;
    }

    public void setOpcmId(OperacoesComerciais opcmId) {
        this.opcmId = opcmId;
    }

    public UnidadesEmpresariais getUnemId() {
        return unemId;
    }

    public void setUnemId(UnidadesEmpresariais unemId) {
        this.unemId = unemId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ueocId != null ? ueocId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UnemOperacoesComerciais)) {
            return false;
        }
        UnemOperacoesComerciais other = (UnemOperacoesComerciais) object;
        if ((this.ueocId == null && other.ueocId != null) || (this.ueocId != null && !this.ueocId.equals(other.ueocId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.UnemOperacoesComerciais[ ueocId=" + ueocId + " ]";
    }
    
}
