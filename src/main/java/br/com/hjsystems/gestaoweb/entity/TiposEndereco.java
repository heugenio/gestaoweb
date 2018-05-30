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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name = "TIPOS_ENDERECO", catalog = "GriffePneus", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TiposEndereco.findAll", query = "SELECT t FROM TiposEndereco t"),
    @NamedQuery(name = "TiposEndereco.findByTpenId", query = "SELECT t FROM TiposEndereco t WHERE t.tpenId = :tpenId"),
    @NamedQuery(name = "TiposEndereco.findByTpenNome", query = "SELECT t FROM TiposEndereco t WHERE t.tpenNome = :tpenNome"),
    @NamedQuery(name = "TiposEndereco.findByTpEnLASTUPDATE", query = "SELECT t FROM TiposEndereco t WHERE t.tpEnLASTUPDATE = :tpEnLASTUPDATE")})
public class TiposEndereco implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 22)
    @Column(name = "TPEN_ID")
    private String tpenId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "TPEN_NOME")
    private String tpenNome;
    @Column(name = "TpEn_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tpEnLASTUPDATE;
    @OneToMany(mappedBy = "tpenId")
    private List<Enderecos> enderecosList;

    public TiposEndereco() {
    }

    public TiposEndereco(String tpenId) {
        this.tpenId = tpenId;
    }

    public TiposEndereco(String tpenId, String tpenNome) {
        this.tpenId = tpenId;
        this.tpenNome = tpenNome;
    }

    public String getTpenId() {
        return tpenId;
    }

    public void setTpenId(String tpenId) {
        this.tpenId = tpenId;
    }

    public String getTpenNome() {
        return tpenNome;
    }

    public void setTpenNome(String tpenNome) {
        this.tpenNome = tpenNome;
    }

    public Date getTpEnLASTUPDATE() {
        return tpEnLASTUPDATE;
    }

    public void setTpEnLASTUPDATE(Date tpEnLASTUPDATE) {
        this.tpEnLASTUPDATE = tpEnLASTUPDATE;
    }

    @XmlTransient
    public List<Enderecos> getEnderecosList() {
        return enderecosList;
    }

    public void setEnderecosList(List<Enderecos> enderecosList) {
        this.enderecosList = enderecosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tpenId != null ? tpenId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TiposEndereco)) {
            return false;
        }
        TiposEndereco other = (TiposEndereco) object;
        if ((this.tpenId == null && other.tpenId != null) || (this.tpenId != null && !this.tpenId.equals(other.tpenId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.hjsystems.gestaoweb.entity.TiposEndereco[ tpenId=" + tpenId + " ]";
    }
    
}
