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
@Table(name = "ORGAO_EXPEDIDOR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrgaoExpedidor.findAll", query = "SELECT o FROM OrgaoExpedidor o"),
    @NamedQuery(name = "OrgaoExpedidor.findByOrexId", query = "SELECT o FROM OrgaoExpedidor o WHERE o.orexId = :orexId"),
    @NamedQuery(name = "OrgaoExpedidor.findByOrexNome", query = "SELECT o FROM OrgaoExpedidor o WHERE o.orexNome = :orexNome"),
    @NamedQuery(name = "OrgaoExpedidor.findByOrexSigla", query = "SELECT o FROM OrgaoExpedidor o WHERE o.orexSigla = :orexSigla"),
    @NamedQuery(name = "OrgaoExpedidor.findByOrExLASTUPDATE", query = "SELECT o FROM OrgaoExpedidor o WHERE o.orExLASTUPDATE = :orExLASTUPDATE")})
public class OrgaoExpedidor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "OREX_ID")
    private String orexId;
    @Basic(optional = false)
    @Column(name = "OREX_NOME")
    private String orexNome;
    @Basic(optional = false)
    @Column(name = "OREX_SIGLA")
    private String orexSigla;
    @Column(name = "OrEx_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date orExLASTUPDATE;
    @OneToMany(mappedBy = "orexId")
    private List<UnemDocumentos> unemDocumentosList;
    @OneToMany(mappedBy = "orexId")
    private List<Documentos> documentosList;
    @JoinColumn(name = "ESTA_ID", referencedColumnName = "ESTA_ID")
    @ManyToOne
    private Estados estaId;
    @OneToMany(mappedBy = "orexId")
    private List<OrdemServico> ordemServicoList;

    public OrgaoExpedidor() {
    }

    public OrgaoExpedidor(String orexId) {
        this.orexId = orexId;
    }

    public OrgaoExpedidor(String orexId, String orexNome, String orexSigla) {
        this.orexId = orexId;
        this.orexNome = orexNome;
        this.orexSigla = orexSigla;
    }

    public String getOrexId() {
        return orexId;
    }

    public void setOrexId(String orexId) {
        this.orexId = orexId;
    }

    public String getOrexNome() {
        return orexNome;
    }

    public void setOrexNome(String orexNome) {
        this.orexNome = orexNome;
    }

    public String getOrexSigla() {
        return orexSigla;
    }

    public void setOrexSigla(String orexSigla) {
        this.orexSigla = orexSigla;
    }

    public Date getOrExLASTUPDATE() {
        return orExLASTUPDATE;
    }

    public void setOrExLASTUPDATE(Date orExLASTUPDATE) {
        this.orExLASTUPDATE = orExLASTUPDATE;
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

    public Estados getEstaId() {
        return estaId;
    }

    public void setEstaId(Estados estaId) {
        this.estaId = estaId;
    }

    @XmlTransient
    public List<OrdemServico> getOrdemServicoList() {
        return ordemServicoList;
    }

    public void setOrdemServicoList(List<OrdemServico> ordemServicoList) {
        this.ordemServicoList = ordemServicoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orexId != null ? orexId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrgaoExpedidor)) {
            return false;
        }
        OrgaoExpedidor other = (OrgaoExpedidor) object;
        if ((this.orexId == null && other.orexId != null) || (this.orexId != null && !this.orexId.equals(other.orexId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.OrgaoExpedidor[ orexId=" + orexId + " ]";
    }
    
}
