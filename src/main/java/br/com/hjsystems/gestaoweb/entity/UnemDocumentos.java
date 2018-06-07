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
@Table(name = "UNEM_DOCUMENTOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UnemDocumentos.findAll", query = "SELECT u FROM UnemDocumentos u"),
    @NamedQuery(name = "UnemDocumentos.findByUndcId", query = "SELECT u FROM UnemDocumentos u WHERE u.undcId = :undcId"),
    @NamedQuery(name = "UnemDocumentos.findByUndcNumero", query = "SELECT u FROM UnemDocumentos u WHERE u.undcNumero = :undcNumero"),
    @NamedQuery(name = "UnemDocumentos.findByUnDcLASTUPDATE", query = "SELECT u FROM UnemDocumentos u WHERE u.unDcLASTUPDATE = :unDcLASTUPDATE")})
public class UnemDocumentos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "UNDC_ID")
    private String undcId;
    @Column(name = "UNDC_NUMERO")
    private String undcNumero;
    @Column(name = "UnDc_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date unDcLASTUPDATE;
    @JoinColumn(name = "OREX_ID", referencedColumnName = "OREX_ID")
    @ManyToOne
    private OrgaoExpedidor orexId;
    @JoinColumn(name = "TPDC_ID", referencedColumnName = "TPDC_ID")
    @ManyToOne
    private TiposDocumentos tpdcId;
    @JoinColumn(name = "UNEN_ID", referencedColumnName = "UNEN_ID")
    @ManyToOne
    private UnemEnderecos unenId;
    @JoinColumn(name = "UNEM_ID", referencedColumnName = "UNEM_ID")
    @ManyToOne
    private UnidadesEmpresariais unemId;

    public UnemDocumentos() {
    }

    public UnemDocumentos(String undcId) {
        this.undcId = undcId;
    }

    public String getUndcId() {
        return undcId;
    }

    public void setUndcId(String undcId) {
        this.undcId = undcId;
    }

    public String getUndcNumero() {
        return undcNumero;
    }

    public void setUndcNumero(String undcNumero) {
        this.undcNumero = undcNumero;
    }

    public Date getUnDcLASTUPDATE() {
        return unDcLASTUPDATE;
    }

    public void setUnDcLASTUPDATE(Date unDcLASTUPDATE) {
        this.unDcLASTUPDATE = unDcLASTUPDATE;
    }

    public OrgaoExpedidor getOrexId() {
        return orexId;
    }

    public void setOrexId(OrgaoExpedidor orexId) {
        this.orexId = orexId;
    }

    public TiposDocumentos getTpdcId() {
        return tpdcId;
    }

    public void setTpdcId(TiposDocumentos tpdcId) {
        this.tpdcId = tpdcId;
    }

    public UnemEnderecos getUnenId() {
        return unenId;
    }

    public void setUnenId(UnemEnderecos unenId) {
        this.unenId = unenId;
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
        hash += (undcId != null ? undcId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UnemDocumentos)) {
            return false;
        }
        UnemDocumentos other = (UnemDocumentos) object;
        if ((this.undcId == null && other.undcId != null) || (this.undcId != null && !this.undcId.equals(other.undcId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.UnemDocumentos[ undcId=" + undcId + " ]";
    }
    
}
