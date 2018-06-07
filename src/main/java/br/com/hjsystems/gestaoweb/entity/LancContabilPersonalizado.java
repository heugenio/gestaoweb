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
@Table(name = "LANC_CONTABIL_PERSONALIZADO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LancContabilPersonalizado.findAll", query = "SELECT l FROM LancContabilPersonalizado l"),
    @NamedQuery(name = "LancContabilPersonalizado.findByLcprId", query = "SELECT l FROM LancContabilPersonalizado l WHERE l.lcprId = :lcprId"),
    @NamedQuery(name = "LancContabilPersonalizado.findByLcprNome", query = "SELECT l FROM LancContabilPersonalizado l WHERE l.lcprNome = :lcprNome"),
    @NamedQuery(name = "LancContabilPersonalizado.findByLCPrLASTUPDATE", query = "SELECT l FROM LancContabilPersonalizado l WHERE l.lCPrLASTUPDATE = :lCPrLASTUPDATE")})
public class LancContabilPersonalizado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LCPR_ID")
    private String lcprId;
    @Basic(optional = false)
    @Column(name = "LCPR_NOME")
    private String lcprNome;
    @Column(name = "LCPr_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lCPrLASTUPDATE;
    @OneToMany(mappedBy = "lcprId")
    private List<ItensLancContPersonal> itensLancContPersonalList;

    public LancContabilPersonalizado() {
    }

    public LancContabilPersonalizado(String lcprId) {
        this.lcprId = lcprId;
    }

    public LancContabilPersonalizado(String lcprId, String lcprNome) {
        this.lcprId = lcprId;
        this.lcprNome = lcprNome;
    }

    public String getLcprId() {
        return lcprId;
    }

    public void setLcprId(String lcprId) {
        this.lcprId = lcprId;
    }

    public String getLcprNome() {
        return lcprNome;
    }

    public void setLcprNome(String lcprNome) {
        this.lcprNome = lcprNome;
    }

    public Date getLCPrLASTUPDATE() {
        return lCPrLASTUPDATE;
    }

    public void setLCPrLASTUPDATE(Date lCPrLASTUPDATE) {
        this.lCPrLASTUPDATE = lCPrLASTUPDATE;
    }

    @XmlTransient
    public List<ItensLancContPersonal> getItensLancContPersonalList() {
        return itensLancContPersonalList;
    }

    public void setItensLancContPersonalList(List<ItensLancContPersonal> itensLancContPersonalList) {
        this.itensLancContPersonalList = itensLancContPersonalList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lcprId != null ? lcprId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LancContabilPersonalizado)) {
            return false;
        }
        LancContabilPersonalizado other = (LancContabilPersonalizado) object;
        if ((this.lcprId == null && other.lcprId != null) || (this.lcprId != null && !this.lcprId.equals(other.lcprId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.LancContabilPersonalizado[ lcprId=" + lcprId + " ]";
    }
    
}
