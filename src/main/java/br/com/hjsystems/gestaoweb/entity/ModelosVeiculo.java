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
@Table(name = "MODELOS_VEICULO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ModelosVeiculo.findAll", query = "SELECT m FROM ModelosVeiculo m"),
    @NamedQuery(name = "ModelosVeiculo.findByMdvcId", query = "SELECT m FROM ModelosVeiculo m WHERE m.mdvcId = :mdvcId"),
    @NamedQuery(name = "ModelosVeiculo.findByMdvcNome", query = "SELECT m FROM ModelosVeiculo m WHERE m.mdvcNome = :mdvcNome"),
    @NamedQuery(name = "ModelosVeiculo.findByMdvcLastupdate", query = "SELECT m FROM ModelosVeiculo m WHERE m.mdvcLastupdate = :mdvcLastupdate")})
public class ModelosVeiculo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MDVC_ID")
    private String mdvcId;
    @Basic(optional = false)
    @Column(name = "MDVC_NOME")
    private String mdvcNome;
    @Column(name = "MDVC_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mdvcLastupdate;
    @JoinColumn(name = "MRVC_ID", referencedColumnName = "MRVC_ID")
    @ManyToOne
    private MarcasVeiculo mrvcId;

    public ModelosVeiculo() {
    }

    public ModelosVeiculo(String mdvcId) {
        this.mdvcId = mdvcId;
    }

    public ModelosVeiculo(String mdvcId, String mdvcNome) {
        this.mdvcId = mdvcId;
        this.mdvcNome = mdvcNome;
    }

    public String getMdvcId() {
        return mdvcId;
    }

    public void setMdvcId(String mdvcId) {
        this.mdvcId = mdvcId;
    }

    public String getMdvcNome() {
        return mdvcNome;
    }

    public void setMdvcNome(String mdvcNome) {
        this.mdvcNome = mdvcNome;
    }

    public Date getMdvcLastupdate() {
        return mdvcLastupdate;
    }

    public void setMdvcLastupdate(Date mdvcLastupdate) {
        this.mdvcLastupdate = mdvcLastupdate;
    }

    public MarcasVeiculo getMrvcId() {
        return mrvcId;
    }

    public void setMrvcId(MarcasVeiculo mrvcId) {
        this.mrvcId = mrvcId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mdvcId != null ? mdvcId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModelosVeiculo)) {
            return false;
        }
        ModelosVeiculo other = (ModelosVeiculo) object;
        if ((this.mdvcId == null && other.mdvcId != null) || (this.mdvcId != null && !this.mdvcId.equals(other.mdvcId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.ModelosVeiculo[ mdvcId=" + mdvcId + " ]";
    }
    
}
