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
@Table(name = "CFOP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cfop.findAll", query = "SELECT c FROM Cfop c"),
    @NamedQuery(name = "Cfop.findByCfopId", query = "SELECT c FROM Cfop c WHERE c.cfopId = :cfopId"),
    @NamedQuery(name = "Cfop.findByCfopCodigo", query = "SELECT c FROM Cfop c WHERE c.cfopCodigo = :cfopCodigo"),
    @NamedQuery(name = "Cfop.findByCfopDescricao", query = "SELECT c FROM Cfop c WHERE c.cfopDescricao = :cfopDescricao"),
    @NamedQuery(name = "Cfop.findByCfopClassificacao", query = "SELECT c FROM Cfop c WHERE c.cfopClassificacao = :cfopClassificacao"),
    @NamedQuery(name = "Cfop.findByCfopLastupdate", query = "SELECT c FROM Cfop c WHERE c.cfopLastupdate = :cfopLastupdate")})
public class Cfop implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CFOP_ID")
    private String cfopId;
    @Basic(optional = false)
    @Column(name = "CFOP_CODIGO")
    private String cfopCodigo;
    @Basic(optional = false)
    @Column(name = "CFOP_DESCRICAO")
    private String cfopDescricao;
    @Column(name = "CFOP_CLASSIFICACAO")
    private String cfopClassificacao;
    @Column(name = "CFOP_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cfopLastupdate;
    @OneToMany(mappedBy = "cfopId")
    private List<ItensLivrosFiscais> itensLivrosFiscaisList;
    @OneToMany(mappedBy = "cfopId")
    private List<CfopParametrosContabeis> cfopParametrosContabeisList;
    @OneToMany(mappedBy = "cfopId")
    private List<ItensReducaoZ> itensReducaoZList;

    public Cfop() {
    }

    public Cfop(String cfopId) {
        this.cfopId = cfopId;
    }

    public Cfop(String cfopId, String cfopCodigo, String cfopDescricao) {
        this.cfopId = cfopId;
        this.cfopCodigo = cfopCodigo;
        this.cfopDescricao = cfopDescricao;
    }

    public String getCfopId() {
        return cfopId;
    }

    public void setCfopId(String cfopId) {
        this.cfopId = cfopId;
    }

    public String getCfopCodigo() {
        return cfopCodigo;
    }

    public void setCfopCodigo(String cfopCodigo) {
        this.cfopCodigo = cfopCodigo;
    }

    public String getCfopDescricao() {
        return cfopDescricao;
    }

    public void setCfopDescricao(String cfopDescricao) {
        this.cfopDescricao = cfopDescricao;
    }

    public String getCfopClassificacao() {
        return cfopClassificacao;
    }

    public void setCfopClassificacao(String cfopClassificacao) {
        this.cfopClassificacao = cfopClassificacao;
    }

    public Date getCfopLastupdate() {
        return cfopLastupdate;
    }

    public void setCfopLastupdate(Date cfopLastupdate) {
        this.cfopLastupdate = cfopLastupdate;
    }

    @XmlTransient
    public List<ItensLivrosFiscais> getItensLivrosFiscaisList() {
        return itensLivrosFiscaisList;
    }

    public void setItensLivrosFiscaisList(List<ItensLivrosFiscais> itensLivrosFiscaisList) {
        this.itensLivrosFiscaisList = itensLivrosFiscaisList;
    }

    @XmlTransient
    public List<CfopParametrosContabeis> getCfopParametrosContabeisList() {
        return cfopParametrosContabeisList;
    }

    public void setCfopParametrosContabeisList(List<CfopParametrosContabeis> cfopParametrosContabeisList) {
        this.cfopParametrosContabeisList = cfopParametrosContabeisList;
    }

    @XmlTransient
    public List<ItensReducaoZ> getItensReducaoZList() {
        return itensReducaoZList;
    }

    public void setItensReducaoZList(List<ItensReducaoZ> itensReducaoZList) {
        this.itensReducaoZList = itensReducaoZList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cfopId != null ? cfopId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cfop)) {
            return false;
        }
        Cfop other = (Cfop) object;
        if ((this.cfopId == null && other.cfopId != null) || (this.cfopId != null && !this.cfopId.equals(other.cfopId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.Cfop[ cfopId=" + cfopId + " ]";
    }
    
}
