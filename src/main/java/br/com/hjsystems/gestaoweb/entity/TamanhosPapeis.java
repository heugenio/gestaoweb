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
@Table(name = "TAMANHOS_PAPEIS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TamanhosPapeis.findAll", query = "SELECT t FROM TamanhosPapeis t"),
    @NamedQuery(name = "TamanhosPapeis.findByTmppId", query = "SELECT t FROM TamanhosPapeis t WHERE t.tmppId = :tmppId"),
    @NamedQuery(name = "TamanhosPapeis.findByTmppNome", query = "SELECT t FROM TamanhosPapeis t WHERE t.tmppNome = :tmppNome"),
    @NamedQuery(name = "TamanhosPapeis.findByTmppLargura", query = "SELECT t FROM TamanhosPapeis t WHERE t.tmppLargura = :tmppLargura"),
    @NamedQuery(name = "TamanhosPapeis.findByTmppAltura", query = "SELECT t FROM TamanhosPapeis t WHERE t.tmppAltura = :tmppAltura"),
    @NamedQuery(name = "TamanhosPapeis.findByTmPpLASTUPDATE", query = "SELECT t FROM TamanhosPapeis t WHERE t.tmPpLASTUPDATE = :tmPpLASTUPDATE")})
public class TamanhosPapeis implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TMPP_ID")
    private String tmppId;
    @Basic(optional = false)
    @Column(name = "TMPP_NOME")
    private String tmppNome;
    @Column(name = "TMPP_LARGURA")
    private Integer tmppLargura;
    @Column(name = "TMPP_ALTURA")
    private Integer tmppAltura;
    @Column(name = "TmPp_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tmPpLASTUPDATE;
    @OneToMany(mappedBy = "tmppId")
    private List<EtiquetasModelos> etiquetasModelosList;

    public TamanhosPapeis() {
    }

    public TamanhosPapeis(String tmppId) {
        this.tmppId = tmppId;
    }

    public TamanhosPapeis(String tmppId, String tmppNome) {
        this.tmppId = tmppId;
        this.tmppNome = tmppNome;
    }

    public String getTmppId() {
        return tmppId;
    }

    public void setTmppId(String tmppId) {
        this.tmppId = tmppId;
    }

    public String getTmppNome() {
        return tmppNome;
    }

    public void setTmppNome(String tmppNome) {
        this.tmppNome = tmppNome;
    }

    public Integer getTmppLargura() {
        return tmppLargura;
    }

    public void setTmppLargura(Integer tmppLargura) {
        this.tmppLargura = tmppLargura;
    }

    public Integer getTmppAltura() {
        return tmppAltura;
    }

    public void setTmppAltura(Integer tmppAltura) {
        this.tmppAltura = tmppAltura;
    }

    public Date getTmPpLASTUPDATE() {
        return tmPpLASTUPDATE;
    }

    public void setTmPpLASTUPDATE(Date tmPpLASTUPDATE) {
        this.tmPpLASTUPDATE = tmPpLASTUPDATE;
    }

    @XmlTransient
    public List<EtiquetasModelos> getEtiquetasModelosList() {
        return etiquetasModelosList;
    }

    public void setEtiquetasModelosList(List<EtiquetasModelos> etiquetasModelosList) {
        this.etiquetasModelosList = etiquetasModelosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tmppId != null ? tmppId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TamanhosPapeis)) {
            return false;
        }
        TamanhosPapeis other = (TamanhosPapeis) object;
        if ((this.tmppId == null && other.tmppId != null) || (this.tmppId != null && !this.tmppId.equals(other.tmppId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.TamanhosPapeis[ tmppId=" + tmppId + " ]";
    }
    
}
