/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hjsystems.gestaoweb.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name = "TAGSCAMPOS_TIPOSRELATORIOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TagscamposTiposrelatorios.findAll", query = "SELECT t FROM TagscamposTiposrelatorios t"),
    @NamedQuery(name = "TagscamposTiposrelatorios.findByTctrId", query = "SELECT t FROM TagscamposTiposrelatorios t WHERE t.tctrId = :tctrId")})
public class TagscamposTiposrelatorios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TCTR_ID")
    private String tctrId;
    @JoinColumn(name = "TGCP_ID", referencedColumnName = "TGCP_ID")
    @ManyToOne
    private TagsCampos tgcpId;

    public TagscamposTiposrelatorios() {
    }

    public TagscamposTiposrelatorios(String tctrId) {
        this.tctrId = tctrId;
    }

    public String getTctrId() {
        return tctrId;
    }

    public void setTctrId(String tctrId) {
        this.tctrId = tctrId;
    }

    public TagsCampos getTgcpId() {
        return tgcpId;
    }

    public void setTgcpId(TagsCampos tgcpId) {
        this.tgcpId = tgcpId;
    }
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tctrId != null ? tctrId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TagscamposTiposrelatorios)) {
            return false;
        }
        TagscamposTiposrelatorios other = (TagscamposTiposrelatorios) object;
        if ((this.tctrId == null && other.tctrId != null) || (this.tctrId != null && !this.tctrId.equals(other.tctrId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.TagscamposTiposrelatorios[ tctrId=" + tctrId + " ]";
    }
    
}
