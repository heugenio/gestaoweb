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
@Table(name = "PARAMETROS_CONTABEIS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ParametrosContabeis.findAll", query = "SELECT p FROM ParametrosContabeis p"),
    @NamedQuery(name = "ParametrosContabeis.findByPrctId", query = "SELECT p FROM ParametrosContabeis p WHERE p.prctId = :prctId"),
    @NamedQuery(name = "ParametrosContabeis.findByPrctCodigo", query = "SELECT p FROM ParametrosContabeis p WHERE p.prctCodigo = :prctCodigo"),
    @NamedQuery(name = "ParametrosContabeis.findByPrctLancaChAnalitico", query = "SELECT p FROM ParametrosContabeis p WHERE p.prctLancaChAnalitico = :prctLancaChAnalitico"),
    @NamedQuery(name = "ParametrosContabeis.findByPrctTipo", query = "SELECT p FROM ParametrosContabeis p WHERE p.prctTipo = :prctTipo"),
    @NamedQuery(name = "ParametrosContabeis.findByPrCtLASTUPDATE", query = "SELECT p FROM ParametrosContabeis p WHERE p.prCtLASTUPDATE = :prCtLASTUPDATE")})
public class ParametrosContabeis implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PRCT_ID")
    private String prctId;
    @Basic(optional = false)
    @Column(name = "PRCT_CODIGO")
    private String prctCodigo;
    @Basic(optional = false)
    @Column(name = "PRCT_LANCA_CH_ANALITICO")
    private String prctLancaChAnalitico;
    @Column(name = "PRCT_TIPO")
    private String prctTipo;
    @Column(name = "PrCt_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date prCtLASTUPDATE;
    @OneToMany(mappedBy = "prctId")
    private List<CentrocustoParamcontab> centrocustoParamcontabList;
    @OneToMany(mappedBy = "prctId")
    private List<CfopParametrosContabeis> cfopParametrosContabeisList;
    @OneToMany(mappedBy = "prctId")
    private List<ConfigParamContabeis> configParamContabeisList;

    public ParametrosContabeis() {
    }

    public ParametrosContabeis(String prctId) {
        this.prctId = prctId;
    }

    public ParametrosContabeis(String prctId, String prctCodigo, String prctLancaChAnalitico) {
        this.prctId = prctId;
        this.prctCodigo = prctCodigo;
        this.prctLancaChAnalitico = prctLancaChAnalitico;
    }

    public String getPrctId() {
        return prctId;
    }

    public void setPrctId(String prctId) {
        this.prctId = prctId;
    }

    public String getPrctCodigo() {
        return prctCodigo;
    }

    public void setPrctCodigo(String prctCodigo) {
        this.prctCodigo = prctCodigo;
    }

    public String getPrctLancaChAnalitico() {
        return prctLancaChAnalitico;
    }

    public void setPrctLancaChAnalitico(String prctLancaChAnalitico) {
        this.prctLancaChAnalitico = prctLancaChAnalitico;
    }

    public String getPrctTipo() {
        return prctTipo;
    }

    public void setPrctTipo(String prctTipo) {
        this.prctTipo = prctTipo;
    }

    public Date getPrCtLASTUPDATE() {
        return prCtLASTUPDATE;
    }

    public void setPrCtLASTUPDATE(Date prCtLASTUPDATE) {
        this.prCtLASTUPDATE = prCtLASTUPDATE;
    }

    @XmlTransient
    public List<CentrocustoParamcontab> getCentrocustoParamcontabList() {
        return centrocustoParamcontabList;
    }

    public void setCentrocustoParamcontabList(List<CentrocustoParamcontab> centrocustoParamcontabList) {
        this.centrocustoParamcontabList = centrocustoParamcontabList;
    }

    @XmlTransient
    public List<CfopParametrosContabeis> getCfopParametrosContabeisList() {
        return cfopParametrosContabeisList;
    }

    public void setCfopParametrosContabeisList(List<CfopParametrosContabeis> cfopParametrosContabeisList) {
        this.cfopParametrosContabeisList = cfopParametrosContabeisList;
    }

    @XmlTransient
    public List<ConfigParamContabeis> getConfigParamContabeisList() {
        return configParamContabeisList;
    }

    public void setConfigParamContabeisList(List<ConfigParamContabeis> configParamContabeisList) {
        this.configParamContabeisList = configParamContabeisList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prctId != null ? prctId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ParametrosContabeis)) {
            return false;
        }
        ParametrosContabeis other = (ParametrosContabeis) object;
        if ((this.prctId == null && other.prctId != null) || (this.prctId != null && !this.prctId.equals(other.prctId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.ParametrosContabeis[ prctId=" + prctId + " ]";
    }
    
}
