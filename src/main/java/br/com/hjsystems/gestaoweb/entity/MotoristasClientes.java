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
@Table(name = "MOTORISTAS_CLIENTES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MotoristasClientes.findAll", query = "SELECT m FROM MotoristasClientes m"),
    @NamedQuery(name = "MotoristasClientes.findByMtrsId", query = "SELECT m FROM MotoristasClientes m WHERE m.mtrsId = :mtrsId"),
    @NamedQuery(name = "MotoristasClientes.findByMtrsCnhNumero", query = "SELECT m FROM MotoristasClientes m WHERE m.mtrsCnhNumero = :mtrsCnhNumero"),
    @NamedQuery(name = "MotoristasClientes.findByMtrsCnhCategoria", query = "SELECT m FROM MotoristasClientes m WHERE m.mtrsCnhCategoria = :mtrsCnhCategoria"),
    @NamedQuery(name = "MotoristasClientes.findByMtrsCnhDtValidade", query = "SELECT m FROM MotoristasClientes m WHERE m.mtrsCnhDtValidade = :mtrsCnhDtValidade")})
public class MotoristasClientes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MTRS_ID")
    private String mtrsId;
    @Basic(optional = false)
    @Column(name = "MTRS_CNH_NUMERO")
    private String mtrsCnhNumero;
    @Column(name = "MTRS_CNH_CATEGORIA")
    private String mtrsCnhCategoria;
    @Column(name = "MTRS_CNH_DT_VALIDADE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mtrsCnhDtValidade;
    @JoinColumn(name = "PES_PESS_ID", referencedColumnName = "PESS_ID")
    @ManyToOne
    private Pessoas pesPessId;
    @JoinColumn(name = "PESS_ID", referencedColumnName = "PESS_ID")
    @ManyToOne
    private Pessoas pessId;

    public MotoristasClientes() {
    }

    public MotoristasClientes(String mtrsId) {
        this.mtrsId = mtrsId;
    }

    public MotoristasClientes(String mtrsId, String mtrsCnhNumero) {
        this.mtrsId = mtrsId;
        this.mtrsCnhNumero = mtrsCnhNumero;
    }

    public String getMtrsId() {
        return mtrsId;
    }

    public void setMtrsId(String mtrsId) {
        this.mtrsId = mtrsId;
    }

    public String getMtrsCnhNumero() {
        return mtrsCnhNumero;
    }

    public void setMtrsCnhNumero(String mtrsCnhNumero) {
        this.mtrsCnhNumero = mtrsCnhNumero;
    }

    public String getMtrsCnhCategoria() {
        return mtrsCnhCategoria;
    }

    public void setMtrsCnhCategoria(String mtrsCnhCategoria) {
        this.mtrsCnhCategoria = mtrsCnhCategoria;
    }

    public Date getMtrsCnhDtValidade() {
        return mtrsCnhDtValidade;
    }

    public void setMtrsCnhDtValidade(Date mtrsCnhDtValidade) {
        this.mtrsCnhDtValidade = mtrsCnhDtValidade;
    }

    public Pessoas getPesPessId() {
        return pesPessId;
    }

    public void setPesPessId(Pessoas pesPessId) {
        this.pesPessId = pesPessId;
    }

    public Pessoas getPessId() {
        return pessId;
    }

    public void setPessId(Pessoas pessId) {
        this.pessId = pessId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mtrsId != null ? mtrsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MotoristasClientes)) {
            return false;
        }
        MotoristasClientes other = (MotoristasClientes) object;
        if ((this.mtrsId == null && other.mtrsId != null) || (this.mtrsId != null && !this.mtrsId.equals(other.mtrsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.MotoristasClientes[ mtrsId=" + mtrsId + " ]";
    }
    
}
