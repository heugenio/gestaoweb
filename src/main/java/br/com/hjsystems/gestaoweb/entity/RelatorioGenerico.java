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
@Table(name = "RELATORIO_GENERICO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RelatorioGenerico.findAll", query = "SELECT r FROM RelatorioGenerico r"),
    @NamedQuery(name = "RelatorioGenerico.findByRlgnId", query = "SELECT r FROM RelatorioGenerico r WHERE r.rlgnId = :rlgnId"),
    @NamedQuery(name = "RelatorioGenerico.findByRlgnNome", query = "SELECT r FROM RelatorioGenerico r WHERE r.rlgnNome = :rlgnNome"),
    @NamedQuery(name = "RelatorioGenerico.findByRlgnTipo", query = "SELECT r FROM RelatorioGenerico r WHERE r.rlgnTipo = :rlgnTipo"),
    @NamedQuery(name = "RelatorioGenerico.findByRlGnLASTUPDATE", query = "SELECT r FROM RelatorioGenerico r WHERE r.rlGnLASTUPDATE = :rlGnLASTUPDATE")})
public class RelatorioGenerico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "RLGN_ID")
    private String rlgnId;
    @Basic(optional = false)
    @Column(name = "RLGN_NOME")
    private String rlgnNome;
    @Basic(optional = false)
    @Column(name = "RLGN_TIPO")
    private String rlgnTipo;
    @Column(name = "RlGn_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rlGnLASTUPDATE;
    @OneToMany(mappedBy = "rlgnId")
    private List<ItensRelatorioGenerico> itensRelatorioGenericoList;

    public RelatorioGenerico() {
    }

    public RelatorioGenerico(String rlgnId) {
        this.rlgnId = rlgnId;
    }

    public RelatorioGenerico(String rlgnId, String rlgnNome, String rlgnTipo) {
        this.rlgnId = rlgnId;
        this.rlgnNome = rlgnNome;
        this.rlgnTipo = rlgnTipo;
    }

    public String getRlgnId() {
        return rlgnId;
    }

    public void setRlgnId(String rlgnId) {
        this.rlgnId = rlgnId;
    }

    public String getRlgnNome() {
        return rlgnNome;
    }

    public void setRlgnNome(String rlgnNome) {
        this.rlgnNome = rlgnNome;
    }

    public String getRlgnTipo() {
        return rlgnTipo;
    }

    public void setRlgnTipo(String rlgnTipo) {
        this.rlgnTipo = rlgnTipo;
    }

    public Date getRlGnLASTUPDATE() {
        return rlGnLASTUPDATE;
    }

    public void setRlGnLASTUPDATE(Date rlGnLASTUPDATE) {
        this.rlGnLASTUPDATE = rlGnLASTUPDATE;
    }

    @XmlTransient
    public List<ItensRelatorioGenerico> getItensRelatorioGenericoList() {
        return itensRelatorioGenericoList;
    }

    public void setItensRelatorioGenericoList(List<ItensRelatorioGenerico> itensRelatorioGenericoList) {
        this.itensRelatorioGenericoList = itensRelatorioGenericoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rlgnId != null ? rlgnId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RelatorioGenerico)) {
            return false;
        }
        RelatorioGenerico other = (RelatorioGenerico) object;
        if ((this.rlgnId == null && other.rlgnId != null) || (this.rlgnId != null && !this.rlgnId.equals(other.rlgnId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.RelatorioGenerico[ rlgnId=" + rlgnId + " ]";
    }
    
}
