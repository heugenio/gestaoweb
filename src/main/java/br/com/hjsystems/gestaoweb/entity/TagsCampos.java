/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hjsystems.gestaoweb.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name = "TAGS_CAMPOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TagsCampos.findAll", query = "SELECT t FROM TagsCampos t"),
    @NamedQuery(name = "TagsCampos.findByTgcpId", query = "SELECT t FROM TagsCampos t WHERE t.tgcpId = :tgcpId"),
    @NamedQuery(name = "TagsCampos.findByTgcpNome", query = "SELECT t FROM TagsCampos t WHERE t.tgcpNome = :tgcpNome"),
    @NamedQuery(name = "TagsCampos.findByTgcpDescricao", query = "SELECT t FROM TagsCampos t WHERE t.tgcpDescricao = :tgcpDescricao"),
    @NamedQuery(name = "TagsCampos.findByTgcpCampo", query = "SELECT t FROM TagsCampos t WHERE t.tgcpCampo = :tgcpCampo"),
    @NamedQuery(name = "TagsCampos.findByTgcpDataset", query = "SELECT t FROM TagsCampos t WHERE t.tgcpDataset = :tgcpDataset")})
public class TagsCampos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TGCP_ID")
    private String tgcpId;
    @Basic(optional = false)
    @Column(name = "TGCP_NOME")
    private String tgcpNome;
    @Basic(optional = false)
    @Column(name = "TGCP_DESCRICAO")
    private String tgcpDescricao;
    @Basic(optional = false)
    @Column(name = "TGCP_CAMPO")
    private String tgcpCampo;
    @Basic(optional = false)
    @Column(name = "TGCP_DATASET")
    private String tgcpDataset;
    @OneToMany(mappedBy = "tgcpId")
    private List<TagscamposTiposrelatorios> tagscamposTiposrelatoriosList;

    public TagsCampos() {
    }

    public TagsCampos(String tgcpId) {
        this.tgcpId = tgcpId;
    }

    public TagsCampos(String tgcpId, String tgcpNome, String tgcpDescricao, String tgcpCampo, String tgcpDataset) {
        this.tgcpId = tgcpId;
        this.tgcpNome = tgcpNome;
        this.tgcpDescricao = tgcpDescricao;
        this.tgcpCampo = tgcpCampo;
        this.tgcpDataset = tgcpDataset;
    }

    public String getTgcpId() {
        return tgcpId;
    }

    public void setTgcpId(String tgcpId) {
        this.tgcpId = tgcpId;
    }

    public String getTgcpNome() {
        return tgcpNome;
    }

    public void setTgcpNome(String tgcpNome) {
        this.tgcpNome = tgcpNome;
    }

    public String getTgcpDescricao() {
        return tgcpDescricao;
    }

    public void setTgcpDescricao(String tgcpDescricao) {
        this.tgcpDescricao = tgcpDescricao;
    }

    public String getTgcpCampo() {
        return tgcpCampo;
    }

    public void setTgcpCampo(String tgcpCampo) {
        this.tgcpCampo = tgcpCampo;
    }

    public String getTgcpDataset() {
        return tgcpDataset;
    }

    public void setTgcpDataset(String tgcpDataset) {
        this.tgcpDataset = tgcpDataset;
    }

    @XmlTransient
    public List<TagscamposTiposrelatorios> getTagscamposTiposrelatoriosList() {
        return tagscamposTiposrelatoriosList;
    }

    public void setTagscamposTiposrelatoriosList(List<TagscamposTiposrelatorios> tagscamposTiposrelatoriosList) {
        this.tagscamposTiposrelatoriosList = tagscamposTiposrelatoriosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tgcpId != null ? tgcpId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TagsCampos)) {
            return false;
        }
        TagsCampos other = (TagsCampos) object;
        if ((this.tgcpId == null && other.tgcpId != null) || (this.tgcpId != null && !this.tgcpId.equals(other.tgcpId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.TagsCampos[ tgcpId=" + tgcpId + " ]";
    }
    
}
