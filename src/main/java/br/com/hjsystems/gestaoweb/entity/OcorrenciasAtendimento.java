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
@Table(name = "OCORRENCIAS_ATENDIMENTO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcorrenciasAtendimento.findAll", query = "SELECT o FROM OcorrenciasAtendimento o"),
    @NamedQuery(name = "OcorrenciasAtendimento.findByOcatId", query = "SELECT o FROM OcorrenciasAtendimento o WHERE o.ocatId = :ocatId"),
    @NamedQuery(name = "OcorrenciasAtendimento.findByOcatComentario", query = "SELECT o FROM OcorrenciasAtendimento o WHERE o.ocatComentario = :ocatComentario"),
    @NamedQuery(name = "OcorrenciasAtendimento.findByOcatNatureza", query = "SELECT o FROM OcorrenciasAtendimento o WHERE o.ocatNatureza = :ocatNatureza"),
    @NamedQuery(name = "OcorrenciasAtendimento.findByOcatData", query = "SELECT o FROM OcorrenciasAtendimento o WHERE o.ocatData = :ocatData"),
    @NamedQuery(name = "OcorrenciasAtendimento.findByOcatDataContato", query = "SELECT o FROM OcorrenciasAtendimento o WHERE o.ocatDataContato = :ocatDataContato"),
    @NamedQuery(name = "OcorrenciasAtendimento.findByOcatStatus", query = "SELECT o FROM OcorrenciasAtendimento o WHERE o.ocatStatus = :ocatStatus"),
    @NamedQuery(name = "OcorrenciasAtendimento.findByOcatLastupdate", query = "SELECT o FROM OcorrenciasAtendimento o WHERE o.ocatLastupdate = :ocatLastupdate")})
public class OcorrenciasAtendimento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "OCAT_ID")
    private String ocatId;
    @Column(name = "OCAT_COMENTARIO")
    private String ocatComentario;
    @Basic(optional = false)
    @Column(name = "OCAT_NATUREZA")
    private String ocatNatureza;
    @Column(name = "OCAT_DATA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ocatData;
    @Column(name = "OCAT_DATA_CONTATO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ocatDataContato;
    @Basic(optional = false)
    @Column(name = "OCAT_STATUS")
    private String ocatStatus;
    @Column(name = "OCAT_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ocatLastupdate;
    @JoinColumn(name = "ATCM_ID", referencedColumnName = "ATCM_ID")
    @ManyToOne
    private AtendimentosComerciais atcmId;
    @JoinColumn(name = "USRS_ID", referencedColumnName = "USRS_ID")
    @ManyToOne
    private Usuarios usrsId;

    public OcorrenciasAtendimento() {
    }

    public OcorrenciasAtendimento(String ocatId) {
        this.ocatId = ocatId;
    }

    public OcorrenciasAtendimento(String ocatId, String ocatNatureza, String ocatStatus) {
        this.ocatId = ocatId;
        this.ocatNatureza = ocatNatureza;
        this.ocatStatus = ocatStatus;
    }

    public String getOcatId() {
        return ocatId;
    }

    public void setOcatId(String ocatId) {
        this.ocatId = ocatId;
    }

    public String getOcatComentario() {
        return ocatComentario;
    }

    public void setOcatComentario(String ocatComentario) {
        this.ocatComentario = ocatComentario;
    }

    public String getOcatNatureza() {
        return ocatNatureza;
    }

    public void setOcatNatureza(String ocatNatureza) {
        this.ocatNatureza = ocatNatureza;
    }

    public Date getOcatData() {
        return ocatData;
    }

    public void setOcatData(Date ocatData) {
        this.ocatData = ocatData;
    }

    public Date getOcatDataContato() {
        return ocatDataContato;
    }

    public void setOcatDataContato(Date ocatDataContato) {
        this.ocatDataContato = ocatDataContato;
    }

    public String getOcatStatus() {
        return ocatStatus;
    }

    public void setOcatStatus(String ocatStatus) {
        this.ocatStatus = ocatStatus;
    }

    public Date getOcatLastupdate() {
        return ocatLastupdate;
    }

    public void setOcatLastupdate(Date ocatLastupdate) {
        this.ocatLastupdate = ocatLastupdate;
    }

    public AtendimentosComerciais getAtcmId() {
        return atcmId;
    }

    public void setAtcmId(AtendimentosComerciais atcmId) {
        this.atcmId = atcmId;
    }

    public Usuarios getUsrsId() {
        return usrsId;
    }

    public void setUsrsId(Usuarios usrsId) {
        this.usrsId = usrsId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ocatId != null ? ocatId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcorrenciasAtendimento)) {
            return false;
        }
        OcorrenciasAtendimento other = (OcorrenciasAtendimento) object;
        if ((this.ocatId == null && other.ocatId != null) || (this.ocatId != null && !this.ocatId.equals(other.ocatId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.OcorrenciasAtendimento[ ocatId=" + ocatId + " ]";
    }
    
}
