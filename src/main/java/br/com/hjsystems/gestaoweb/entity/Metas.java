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
@Table(name = "METAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Metas.findAll", query = "SELECT m FROM Metas m"),
    @NamedQuery(name = "Metas.findByMetaId", query = "SELECT m FROM Metas m WHERE m.metaId = :metaId"),
    @NamedQuery(name = "Metas.findByMetaDtInicio", query = "SELECT m FROM Metas m WHERE m.metaDtInicio = :metaDtInicio"),
    @NamedQuery(name = "Metas.findByMetaDtFinal", query = "SELECT m FROM Metas m WHERE m.metaDtFinal = :metaDtFinal"),
    @NamedQuery(name = "Metas.findByMetaTipo", query = "SELECT m FROM Metas m WHERE m.metaTipo = :metaTipo"),
    @NamedQuery(name = "Metas.findByMetaLastupdate", query = "SELECT m FROM Metas m WHERE m.metaLastupdate = :metaLastupdate")})
public class Metas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "META_ID")
    private String metaId;
    @Column(name = "META_DT_INICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date metaDtInicio;
    @Column(name = "META_DT_FINAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date metaDtFinal;
    @Column(name = "META_TIPO")
    private String metaTipo;
    @Column(name = "META_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date metaLastupdate;
    @JoinColumn(name = "VDDR_ID", referencedColumnName = "VDDR_ID")
    @ManyToOne
    private Vendedores vddrId;
    @OneToMany(mappedBy = "metaId")
    private List<ItensMetas> itensMetasList;

    public Metas() {
    }

    public Metas(String metaId) {
        this.metaId = metaId;
    }

    public String getMetaId() {
        return metaId;
    }

    public void setMetaId(String metaId) {
        this.metaId = metaId;
    }

    public Date getMetaDtInicio() {
        return metaDtInicio;
    }

    public void setMetaDtInicio(Date metaDtInicio) {
        this.metaDtInicio = metaDtInicio;
    }

    public Date getMetaDtFinal() {
        return metaDtFinal;
    }

    public void setMetaDtFinal(Date metaDtFinal) {
        this.metaDtFinal = metaDtFinal;
    }

    public String getMetaTipo() {
        return metaTipo;
    }

    public void setMetaTipo(String metaTipo) {
        this.metaTipo = metaTipo;
    }

    public Date getMetaLastupdate() {
        return metaLastupdate;
    }

    public void setMetaLastupdate(Date metaLastupdate) {
        this.metaLastupdate = metaLastupdate;
    }

    public Vendedores getVddrId() {
        return vddrId;
    }

    public void setVddrId(Vendedores vddrId) {
        this.vddrId = vddrId;
    }

    @XmlTransient
    public List<ItensMetas> getItensMetasList() {
        return itensMetasList;
    }

    public void setItensMetasList(List<ItensMetas> itensMetasList) {
        this.itensMetasList = itensMetasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (metaId != null ? metaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Metas)) {
            return false;
        }
        Metas other = (Metas) object;
        if ((this.metaId == null && other.metaId != null) || (this.metaId != null && !this.metaId.equals(other.metaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.Metas[ metaId=" + metaId + " ]";
    }
    
}
