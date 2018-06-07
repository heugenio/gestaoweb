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
@Table(name = "MARCAS_VEICULO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MarcasVeiculo.findAll", query = "SELECT m FROM MarcasVeiculo m"),
    @NamedQuery(name = "MarcasVeiculo.findByMrvcId", query = "SELECT m FROM MarcasVeiculo m WHERE m.mrvcId = :mrvcId"),
    @NamedQuery(name = "MarcasVeiculo.findByMrvcNome", query = "SELECT m FROM MarcasVeiculo m WHERE m.mrvcNome = :mrvcNome"),
    @NamedQuery(name = "MarcasVeiculo.findByMrvcLastupdate", query = "SELECT m FROM MarcasVeiculo m WHERE m.mrvcLastupdate = :mrvcLastupdate")})
public class MarcasVeiculo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MRVC_ID")
    private String mrvcId;
    @Basic(optional = false)
    @Column(name = "MRVC_NOME")
    private String mrvcNome;
    @Column(name = "MRVC_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mrvcLastupdate;
    @OneToMany(mappedBy = "mrvcId")
    private List<ModelosVeiculo> modelosVeiculoList;

    public MarcasVeiculo() {
    }

    public MarcasVeiculo(String mrvcId) {
        this.mrvcId = mrvcId;
    }

    public MarcasVeiculo(String mrvcId, String mrvcNome) {
        this.mrvcId = mrvcId;
        this.mrvcNome = mrvcNome;
    }

    public String getMrvcId() {
        return mrvcId;
    }

    public void setMrvcId(String mrvcId) {
        this.mrvcId = mrvcId;
    }

    public String getMrvcNome() {
        return mrvcNome;
    }

    public void setMrvcNome(String mrvcNome) {
        this.mrvcNome = mrvcNome;
    }

    public Date getMrvcLastupdate() {
        return mrvcLastupdate;
    }

    public void setMrvcLastupdate(Date mrvcLastupdate) {
        this.mrvcLastupdate = mrvcLastupdate;
    }

    @XmlTransient
    public List<ModelosVeiculo> getModelosVeiculoList() {
        return modelosVeiculoList;
    }

    public void setModelosVeiculoList(List<ModelosVeiculo> modelosVeiculoList) {
        this.modelosVeiculoList = modelosVeiculoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mrvcId != null ? mrvcId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MarcasVeiculo)) {
            return false;
        }
        MarcasVeiculo other = (MarcasVeiculo) object;
        if ((this.mrvcId == null && other.mrvcId != null) || (this.mrvcId != null && !this.mrvcId.equals(other.mrvcId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.MarcasVeiculo[ mrvcId=" + mrvcId + " ]";
    }
    
}
