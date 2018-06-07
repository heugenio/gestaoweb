/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hjsystems.gestaoweb.entity;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "TIPO_ENTREGAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoEntregas.findAll", query = "SELECT t FROM TipoEntregas t"),
    @NamedQuery(name = "TipoEntregas.findByTpetId", query = "SELECT t FROM TipoEntregas t WHERE t.tpetId = :tpetId"),
    @NamedQuery(name = "TipoEntregas.findByTpetNome", query = "SELECT t FROM TipoEntregas t WHERE t.tpetNome = :tpetNome"),
    @NamedQuery(name = "TipoEntregas.findByTpetVlrEntrega", query = "SELECT t FROM TipoEntregas t WHERE t.tpetVlrEntrega = :tpetVlrEntrega"),
    @NamedQuery(name = "TipoEntregas.findByTpetVlrDescAtraso", query = "SELECT t FROM TipoEntregas t WHERE t.tpetVlrDescAtraso = :tpetVlrDescAtraso")})
public class TipoEntregas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TPET_ID")
    private String tpetId;
    @Column(name = "TPET_NOME")
    private String tpetNome;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "TPET_VLR_ENTREGA")
    private BigDecimal tpetVlrEntrega;
    @Basic(optional = false)
    @Column(name = "TPET_VLR_DESC_ATRASO")
    private BigDecimal tpetVlrDescAtraso;
    @OneToMany(mappedBy = "tpetId")
    private List<Entregas> entregasList;

    public TipoEntregas() {
    }

    public TipoEntregas(String tpetId) {
        this.tpetId = tpetId;
    }

    public TipoEntregas(String tpetId, BigDecimal tpetVlrEntrega, BigDecimal tpetVlrDescAtraso) {
        this.tpetId = tpetId;
        this.tpetVlrEntrega = tpetVlrEntrega;
        this.tpetVlrDescAtraso = tpetVlrDescAtraso;
    }

    public String getTpetId() {
        return tpetId;
    }

    public void setTpetId(String tpetId) {
        this.tpetId = tpetId;
    }

    public String getTpetNome() {
        return tpetNome;
    }

    public void setTpetNome(String tpetNome) {
        this.tpetNome = tpetNome;
    }

    public BigDecimal getTpetVlrEntrega() {
        return tpetVlrEntrega;
    }

    public void setTpetVlrEntrega(BigDecimal tpetVlrEntrega) {
        this.tpetVlrEntrega = tpetVlrEntrega;
    }

    public BigDecimal getTpetVlrDescAtraso() {
        return tpetVlrDescAtraso;
    }

    public void setTpetVlrDescAtraso(BigDecimal tpetVlrDescAtraso) {
        this.tpetVlrDescAtraso = tpetVlrDescAtraso;
    }

    @XmlTransient
    public List<Entregas> getEntregasList() {
        return entregasList;
    }

    public void setEntregasList(List<Entregas> entregasList) {
        this.entregasList = entregasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tpetId != null ? tpetId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoEntregas)) {
            return false;
        }
        TipoEntregas other = (TipoEntregas) object;
        if ((this.tpetId == null && other.tpetId != null) || (this.tpetId != null && !this.tpetId.equals(other.tpetId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.TipoEntregas[ tpetId=" + tpetId + " ]";
    }
    
}
