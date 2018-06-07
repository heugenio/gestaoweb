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
@Table(name = "TIPOS_DOCUMENTOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TiposDocumentos.findAll", query = "SELECT t FROM TiposDocumentos t"),
    @NamedQuery(name = "TiposDocumentos.findByTpdcId", query = "SELECT t FROM TiposDocumentos t WHERE t.tpdcId = :tpdcId"),
    @NamedQuery(name = "TiposDocumentos.findByTpdcNome", query = "SELECT t FROM TiposDocumentos t WHERE t.tpdcNome = :tpdcNome"),
    @NamedQuery(name = "TiposDocumentos.findByTpdcAbreviacao", query = "SELECT t FROM TiposDocumentos t WHERE t.tpdcAbreviacao = :tpdcAbreviacao"),
    @NamedQuery(name = "TiposDocumentos.findByTpdcTipo", query = "SELECT t FROM TiposDocumentos t WHERE t.tpdcTipo = :tpdcTipo"),
    @NamedQuery(name = "TiposDocumentos.findByTpDcLASTUPDATE", query = "SELECT t FROM TiposDocumentos t WHERE t.tpDcLASTUPDATE = :tpDcLASTUPDATE")})
public class TiposDocumentos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TPDC_ID")
    private String tpdcId;
    @Basic(optional = false)
    @Column(name = "TPDC_NOME")
    private String tpdcNome;
    @Basic(optional = false)
    @Column(name = "TPDC_ABREVIACAO")
    private String tpdcAbreviacao;
    @Column(name = "TPDC_TIPO")
    private String tpdcTipo;
    @Column(name = "TpDc_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tpDcLASTUPDATE;
    @OneToMany(mappedBy = "tpdcId")
    private List<UnemDocumentos> unemDocumentosList;
    @OneToMany(mappedBy = "tpdcId")
    private List<Documentos> documentosList;

    public TiposDocumentos() {
    }

    public TiposDocumentos(String tpdcId) {
        this.tpdcId = tpdcId;
    }

    public TiposDocumentos(String tpdcId, String tpdcNome, String tpdcAbreviacao) {
        this.tpdcId = tpdcId;
        this.tpdcNome = tpdcNome;
        this.tpdcAbreviacao = tpdcAbreviacao;
    }

    public String getTpdcId() {
        return tpdcId;
    }

    public void setTpdcId(String tpdcId) {
        this.tpdcId = tpdcId;
    }

    public String getTpdcNome() {
        return tpdcNome;
    }

    public void setTpdcNome(String tpdcNome) {
        this.tpdcNome = tpdcNome;
    }

    public String getTpdcAbreviacao() {
        return tpdcAbreviacao;
    }

    public void setTpdcAbreviacao(String tpdcAbreviacao) {
        this.tpdcAbreviacao = tpdcAbreviacao;
    }

    public String getTpdcTipo() {
        return tpdcTipo;
    }

    public void setTpdcTipo(String tpdcTipo) {
        this.tpdcTipo = tpdcTipo;
    }

    public Date getTpDcLASTUPDATE() {
        return tpDcLASTUPDATE;
    }

    public void setTpDcLASTUPDATE(Date tpDcLASTUPDATE) {
        this.tpDcLASTUPDATE = tpDcLASTUPDATE;
    }

    @XmlTransient
    public List<UnemDocumentos> getUnemDocumentosList() {
        return unemDocumentosList;
    }

    public void setUnemDocumentosList(List<UnemDocumentos> unemDocumentosList) {
        this.unemDocumentosList = unemDocumentosList;
    }

    @XmlTransient
    public List<Documentos> getDocumentosList() {
        return documentosList;
    }

    public void setDocumentosList(List<Documentos> documentosList) {
        this.documentosList = documentosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tpdcId != null ? tpdcId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TiposDocumentos)) {
            return false;
        }
        TiposDocumentos other = (TiposDocumentos) object;
        if ((this.tpdcId == null && other.tpdcId != null) || (this.tpdcId != null && !this.tpdcId.equals(other.tpdcId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.TiposDocumentos[ tpdcId=" + tpdcId + " ]";
    }
    
}
