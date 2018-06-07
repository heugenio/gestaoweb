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
@Table(name = "VINCULOS_PESSOAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VinculosPessoas.findAll", query = "SELECT v FROM VinculosPessoas v"),
    @NamedQuery(name = "VinculosPessoas.findByVcpsId", query = "SELECT v FROM VinculosPessoas v WHERE v.vcpsId = :vcpsId"),
    @NamedQuery(name = "VinculosPessoas.findByVcpsVinculoDesde", query = "SELECT v FROM VinculosPessoas v WHERE v.vcpsVinculoDesde = :vcpsVinculoDesde"),
    @NamedQuery(name = "VinculosPessoas.findByVcpsSituacao", query = "SELECT v FROM VinculosPessoas v WHERE v.vcpsSituacao = :vcpsSituacao")})
public class VinculosPessoas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "VCPS_ID")
    private String vcpsId;
    @Column(name = "VCPS_VINCULO_DESDE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date vcpsVinculoDesde;
    @Basic(optional = false)
    @Column(name = "VCPS_SITUACAO")
    private String vcpsSituacao;
    @JoinColumn(name = "PESS_ID", referencedColumnName = "PESS_ID")
    @ManyToOne
    private Pessoas pessId;
    @JoinColumn(name = "PES_PESS_ID", referencedColumnName = "PESS_ID")
    @ManyToOne
    private Pessoas pesPessId;
    @JoinColumn(name = "TPVC_ID", referencedColumnName = "TPVC_ID")
    @ManyToOne
    private TiposVinculos tpvcId;

    public VinculosPessoas() {
    }

    public VinculosPessoas(String vcpsId) {
        this.vcpsId = vcpsId;
    }

    public VinculosPessoas(String vcpsId, String vcpsSituacao) {
        this.vcpsId = vcpsId;
        this.vcpsSituacao = vcpsSituacao;
    }

    public String getVcpsId() {
        return vcpsId;
    }

    public void setVcpsId(String vcpsId) {
        this.vcpsId = vcpsId;
    }

    public Date getVcpsVinculoDesde() {
        return vcpsVinculoDesde;
    }

    public void setVcpsVinculoDesde(Date vcpsVinculoDesde) {
        this.vcpsVinculoDesde = vcpsVinculoDesde;
    }

    public String getVcpsSituacao() {
        return vcpsSituacao;
    }

    public void setVcpsSituacao(String vcpsSituacao) {
        this.vcpsSituacao = vcpsSituacao;
    }

    public Pessoas getPessId() {
        return pessId;
    }

    public void setPessId(Pessoas pessId) {
        this.pessId = pessId;
    }

    public Pessoas getPesPessId() {
        return pesPessId;
    }

    public void setPesPessId(Pessoas pesPessId) {
        this.pesPessId = pesPessId;
    }

    public TiposVinculos getTpvcId() {
        return tpvcId;
    }

    public void setTpvcId(TiposVinculos tpvcId) {
        this.tpvcId = tpvcId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vcpsId != null ? vcpsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VinculosPessoas)) {
            return false;
        }
        VinculosPessoas other = (VinculosPessoas) object;
        if ((this.vcpsId == null && other.vcpsId != null) || (this.vcpsId != null && !this.vcpsId.equals(other.vcpsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.VinculosPessoas[ vcpsId=" + vcpsId + " ]";
    }
    
}
