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
@Table(name = "SUGESTOES_COMPRAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SugestoesCompras.findAll", query = "SELECT s FROM SugestoesCompras s"),
    @NamedQuery(name = "SugestoesCompras.findBySgcpId", query = "SELECT s FROM SugestoesCompras s WHERE s.sgcpId = :sgcpId"),
    @NamedQuery(name = "SugestoesCompras.findBySgcpData", query = "SELECT s FROM SugestoesCompras s WHERE s.sgcpData = :sgcpData"),
    @NamedQuery(name = "SugestoesCompras.findBySgcpDataInicial", query = "SELECT s FROM SugestoesCompras s WHERE s.sgcpDataInicial = :sgcpDataInicial"),
    @NamedQuery(name = "SugestoesCompras.findBySgcpDataFinal", query = "SELECT s FROM SugestoesCompras s WHERE s.sgcpDataFinal = :sgcpDataFinal"),
    @NamedQuery(name = "SugestoesCompras.findBySgcpStatus", query = "SELECT s FROM SugestoesCompras s WHERE s.sgcpStatus = :sgcpStatus"),
    @NamedQuery(name = "SugestoesCompras.findBySgcpLastupdate", query = "SELECT s FROM SugestoesCompras s WHERE s.sgcpLastupdate = :sgcpLastupdate")})
public class SugestoesCompras implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SGCP_ID")
    private String sgcpId;
    @Basic(optional = false)
    @Column(name = "SGCP_DATA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sgcpData;
    @Column(name = "SGCP_DATA_INICIAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sgcpDataInicial;
    @Column(name = "SGCP_DATA_FINAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sgcpDataFinal;
    @Basic(optional = false)
    @Column(name = "SGCP_STATUS")
    private String sgcpStatus;
    @Column(name = "SGCP_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sgcpLastupdate;
    @OneToMany(mappedBy = "sgcpId")
    private List<ItensSugestoescompras> itensSugestoescomprasList;
    @OneToMany(mappedBy = "sgcpId")
    private List<FornecedoresSugestoescompras> fornecedoresSugestoescomprasList;

    public SugestoesCompras() {
    }

    public SugestoesCompras(String sgcpId) {
        this.sgcpId = sgcpId;
    }

    public SugestoesCompras(String sgcpId, Date sgcpData, String sgcpStatus) {
        this.sgcpId = sgcpId;
        this.sgcpData = sgcpData;
        this.sgcpStatus = sgcpStatus;
    }

    public String getSgcpId() {
        return sgcpId;
    }

    public void setSgcpId(String sgcpId) {
        this.sgcpId = sgcpId;
    }

    public Date getSgcpData() {
        return sgcpData;
    }

    public void setSgcpData(Date sgcpData) {
        this.sgcpData = sgcpData;
    }

    public Date getSgcpDataInicial() {
        return sgcpDataInicial;
    }

    public void setSgcpDataInicial(Date sgcpDataInicial) {
        this.sgcpDataInicial = sgcpDataInicial;
    }

    public Date getSgcpDataFinal() {
        return sgcpDataFinal;
    }

    public void setSgcpDataFinal(Date sgcpDataFinal) {
        this.sgcpDataFinal = sgcpDataFinal;
    }

    public String getSgcpStatus() {
        return sgcpStatus;
    }

    public void setSgcpStatus(String sgcpStatus) {
        this.sgcpStatus = sgcpStatus;
    }

    public Date getSgcpLastupdate() {
        return sgcpLastupdate;
    }

    public void setSgcpLastupdate(Date sgcpLastupdate) {
        this.sgcpLastupdate = sgcpLastupdate;
    }

    @XmlTransient
    public List<ItensSugestoescompras> getItensSugestoescomprasList() {
        return itensSugestoescomprasList;
    }

    public void setItensSugestoescomprasList(List<ItensSugestoescompras> itensSugestoescomprasList) {
        this.itensSugestoescomprasList = itensSugestoescomprasList;
    }

    @XmlTransient
    public List<FornecedoresSugestoescompras> getFornecedoresSugestoescomprasList() {
        return fornecedoresSugestoescomprasList;
    }

    public void setFornecedoresSugestoescomprasList(List<FornecedoresSugestoescompras> fornecedoresSugestoescomprasList) {
        this.fornecedoresSugestoescomprasList = fornecedoresSugestoescomprasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sgcpId != null ? sgcpId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SugestoesCompras)) {
            return false;
        }
        SugestoesCompras other = (SugestoesCompras) object;
        if ((this.sgcpId == null && other.sgcpId != null) || (this.sgcpId != null && !this.sgcpId.equals(other.sgcpId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.SugestoesCompras[ sgcpId=" + sgcpId + " ]";
    }
    
}
