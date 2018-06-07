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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "ROMANEIO_ENTREGAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RomaneioEntregas.findAll", query = "SELECT r FROM RomaneioEntregas r"),
    @NamedQuery(name = "RomaneioEntregas.findByRmetId", query = "SELECT r FROM RomaneioEntregas r WHERE r.rmetId = :rmetId"),
    @NamedQuery(name = "RomaneioEntregas.findByRmetDataSaida", query = "SELECT r FROM RomaneioEntregas r WHERE r.rmetDataSaida = :rmetDataSaida"),
    @NamedQuery(name = "RomaneioEntregas.findByRmetDataRetorno", query = "SELECT r FROM RomaneioEntregas r WHERE r.rmetDataRetorno = :rmetDataRetorno"),
    @NamedQuery(name = "RomaneioEntregas.findByRmetLastupdate", query = "SELECT r FROM RomaneioEntregas r WHERE r.rmetLastupdate = :rmetLastupdate"),
    @NamedQuery(name = "RomaneioEntregas.findByRmetCodigo", query = "SELECT r FROM RomaneioEntregas r WHERE r.rmetCodigo = :rmetCodigo"),
    @NamedQuery(name = "RomaneioEntregas.findByRmetObservacao", query = "SELECT r FROM RomaneioEntregas r WHERE r.rmetObservacao = :rmetObservacao")})
public class RomaneioEntregas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "RMET_ID")
    private String rmetId;
    @Column(name = "RMET_DATA_SAIDA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rmetDataSaida;
    @Column(name = "RMET_DATA_RETORNO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rmetDataRetorno;
    @Column(name = "RMET_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rmetLastupdate;
    @Column(name = "RMET_CODIGO")
    private String rmetCodigo;
    @Column(name = "RMET_OBSERVACAO")
    private String rmetObservacao;
    @OneToMany(mappedBy = "rmetId")
    private List<Entregas> entregasList;
    @JoinColumn(name = "ETGD_ID", referencedColumnName = "ETGD_ID")
    @ManyToOne
    private Entregador etgdId;
    @JoinColumn(name = "ROTA_ID", referencedColumnName = "ROTA_ID")
    @ManyToOne
    private Rotas rotaId;

    public RomaneioEntregas() {
    }

    public RomaneioEntregas(String rmetId) {
        this.rmetId = rmetId;
    }

    public String getRmetId() {
        return rmetId;
    }

    public void setRmetId(String rmetId) {
        this.rmetId = rmetId;
    }

    public Date getRmetDataSaida() {
        return rmetDataSaida;
    }

    public void setRmetDataSaida(Date rmetDataSaida) {
        this.rmetDataSaida = rmetDataSaida;
    }

    public Date getRmetDataRetorno() {
        return rmetDataRetorno;
    }

    public void setRmetDataRetorno(Date rmetDataRetorno) {
        this.rmetDataRetorno = rmetDataRetorno;
    }

    public Date getRmetLastupdate() {
        return rmetLastupdate;
    }

    public void setRmetLastupdate(Date rmetLastupdate) {
        this.rmetLastupdate = rmetLastupdate;
    }

    public String getRmetCodigo() {
        return rmetCodigo;
    }

    public void setRmetCodigo(String rmetCodigo) {
        this.rmetCodigo = rmetCodigo;
    }

    public String getRmetObservacao() {
        return rmetObservacao;
    }

    public void setRmetObservacao(String rmetObservacao) {
        this.rmetObservacao = rmetObservacao;
    }

    @XmlTransient
    public List<Entregas> getEntregasList() {
        return entregasList;
    }

    public void setEntregasList(List<Entregas> entregasList) {
        this.entregasList = entregasList;
    }

    public Entregador getEtgdId() {
        return etgdId;
    }

    public void setEtgdId(Entregador etgdId) {
        this.etgdId = etgdId;
    }

    public Rotas getRotaId() {
        return rotaId;
    }

    public void setRotaId(Rotas rotaId) {
        this.rotaId = rotaId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rmetId != null ? rmetId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RomaneioEntregas)) {
            return false;
        }
        RomaneioEntregas other = (RomaneioEntregas) object;
        if ((this.rmetId == null && other.rmetId != null) || (this.rmetId != null && !this.rmetId.equals(other.rmetId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.RomaneioEntregas[ rmetId=" + rmetId + " ]";
    }
    
}
