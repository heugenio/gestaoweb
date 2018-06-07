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
@Table(name = "DOCUMENTOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Documentos.findAll", query = "SELECT d FROM Documentos d"),
    @NamedQuery(name = "Documentos.findByDocsId", query = "SELECT d FROM Documentos d WHERE d.docsId = :docsId"),
    @NamedQuery(name = "Documentos.findByDocsNumero", query = "SELECT d FROM Documentos d WHERE d.docsNumero = :docsNumero"),
    @NamedQuery(name = "Documentos.findByDocsLASTUPDATE", query = "SELECT d FROM Documentos d WHERE d.docsLASTUPDATE = :docsLASTUPDATE")})
public class Documentos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DOCS_ID")
    private String docsId;
    @Column(name = "DOCS_NUMERO")
    private String docsNumero;
    @Column(name = "Docs_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date docsLASTUPDATE;
    @JoinColumn(name = "ENDE_ID", referencedColumnName = "ENDE_ID")
    @ManyToOne
    private Enderecos endeId;
    @JoinColumn(name = "OREX_ID", referencedColumnName = "OREX_ID")
    @ManyToOne
    private OrgaoExpedidor orexId;
    @JoinColumn(name = "PESS_ID", referencedColumnName = "PESS_ID")
    @ManyToOne
    private Pessoas pessId;
    @JoinColumn(name = "TPDC_ID", referencedColumnName = "TPDC_ID")
    @ManyToOne
    private TiposDocumentos tpdcId;

    public Documentos() {
    }

    public Documentos(String docsId) {
        this.docsId = docsId;
    }

    public String getDocsId() {
        return docsId;
    }

    public void setDocsId(String docsId) {
        this.docsId = docsId;
    }

    public String getDocsNumero() {
        return docsNumero;
    }

    public void setDocsNumero(String docsNumero) {
        this.docsNumero = docsNumero;
    }

    public Date getDocsLASTUPDATE() {
        return docsLASTUPDATE;
    }

    public void setDocsLASTUPDATE(Date docsLASTUPDATE) {
        this.docsLASTUPDATE = docsLASTUPDATE;
    }

    public Enderecos getEndeId() {
        return endeId;
    }

    public void setEndeId(Enderecos endeId) {
        this.endeId = endeId;
    }

    public OrgaoExpedidor getOrexId() {
        return orexId;
    }

    public void setOrexId(OrgaoExpedidor orexId) {
        this.orexId = orexId;
    }

    public Pessoas getPessId() {
        return pessId;
    }

    public void setPessId(Pessoas pessId) {
        this.pessId = pessId;
    }

    public TiposDocumentos getTpdcId() {
        return tpdcId;
    }

    public void setTpdcId(TiposDocumentos tpdcId) {
        this.tpdcId = tpdcId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (docsId != null ? docsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Documentos)) {
            return false;
        }
        Documentos other = (Documentos) object;
        if ((this.docsId == null && other.docsId != null) || (this.docsId != null && !this.docsId.equals(other.docsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.Documentos[ docsId=" + docsId + " ]";
    }
    
}
