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
@Table(name = "TIPOS_COMISSOES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TiposComissoes.findAll", query = "SELECT t FROM TiposComissoes t"),
    @NamedQuery(name = "TiposComissoes.findByTpcmId", query = "SELECT t FROM TiposComissoes t WHERE t.tpcmId = :tpcmId"),
    @NamedQuery(name = "TiposComissoes.findByTpcmNome", query = "SELECT t FROM TiposComissoes t WHERE t.tpcmNome = :tpcmNome"),
    @NamedQuery(name = "TiposComissoes.findByTpcmCodigo", query = "SELECT t FROM TiposComissoes t WHERE t.tpcmCodigo = :tpcmCodigo"),
    @NamedQuery(name = "TiposComissoes.findByTpcmLastupdate", query = "SELECT t FROM TiposComissoes t WHERE t.tpcmLastupdate = :tpcmLastupdate")})
public class TiposComissoes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TPCM_ID")
    private String tpcmId;
    @Column(name = "TPCM_NOME")
    private String tpcmNome;
    @Column(name = "TPCM_CODIGO")
    private String tpcmCodigo;
    @Column(name = "TPCM_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tpcmLastupdate;
    @OneToMany(mappedBy = "tpcmId")
    private List<Vendedores> vendedoresList;
    @OneToMany(mappedBy = "tpcmId")
    private List<FaixasComissoes> faixasComissoesList;

    public TiposComissoes() {
    }

    public TiposComissoes(String tpcmId) {
        this.tpcmId = tpcmId;
    }

    public String getTpcmId() {
        return tpcmId;
    }

    public void setTpcmId(String tpcmId) {
        this.tpcmId = tpcmId;
    }

    public String getTpcmNome() {
        return tpcmNome;
    }

    public void setTpcmNome(String tpcmNome) {
        this.tpcmNome = tpcmNome;
    }

    public String getTpcmCodigo() {
        return tpcmCodigo;
    }

    public void setTpcmCodigo(String tpcmCodigo) {
        this.tpcmCodigo = tpcmCodigo;
    }

    public Date getTpcmLastupdate() {
        return tpcmLastupdate;
    }

    public void setTpcmLastupdate(Date tpcmLastupdate) {
        this.tpcmLastupdate = tpcmLastupdate;
    }

    @XmlTransient
    public List<Vendedores> getVendedoresList() {
        return vendedoresList;
    }

    public void setVendedoresList(List<Vendedores> vendedoresList) {
        this.vendedoresList = vendedoresList;
    }

    @XmlTransient
    public List<FaixasComissoes> getFaixasComissoesList() {
        return faixasComissoesList;
    }

    public void setFaixasComissoesList(List<FaixasComissoes> faixasComissoesList) {
        this.faixasComissoesList = faixasComissoesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tpcmId != null ? tpcmId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TiposComissoes)) {
            return false;
        }
        TiposComissoes other = (TiposComissoes) object;
        if ((this.tpcmId == null && other.tpcmId != null) || (this.tpcmId != null && !this.tpcmId.equals(other.tpcmId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.TiposComissoes[ tpcmId=" + tpcmId + " ]";
    }
    
}
