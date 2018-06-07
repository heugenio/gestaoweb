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
@Table(name = "COTACOES_FORNECEDORES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CotacoesFornecedores.findAll", query = "SELECT c FROM CotacoesFornecedores c"),
    @NamedQuery(name = "CotacoesFornecedores.findByCtfrId", query = "SELECT c FROM CotacoesFornecedores c WHERE c.ctfrId = :ctfrId"),
    @NamedQuery(name = "CotacoesFornecedores.findByCtfrLastupdate", query = "SELECT c FROM CotacoesFornecedores c WHERE c.ctfrLastupdate = :ctfrLastupdate"),
    @NamedQuery(name = "CotacoesFornecedores.findByCntsNome", query = "SELECT c FROM CotacoesFornecedores c WHERE c.cntsNome = :cntsNome")})
public class CotacoesFornecedores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CTFR_ID")
    private String ctfrId;
    @Column(name = "CTFR_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ctfrLastupdate;
    @Column(name = "CNTS_NOME")
    private String cntsNome;
    @JoinColumn(name = "COTC_ID", referencedColumnName = "COTC_ID")
    @ManyToOne
    private Cotacoes cotcId;
    @JoinColumn(name = "FVEN_ID", referencedColumnName = "FVEN_ID")
    @ManyToOne
    private FormasVencimento fvenId;
    @JoinColumn(name = "FRND_ID", referencedColumnName = "FRND_ID")
    @ManyToOne
    private Fornecedores frndId;

    public CotacoesFornecedores() {
    }

    public CotacoesFornecedores(String ctfrId) {
        this.ctfrId = ctfrId;
    }

    public String getCtfrId() {
        return ctfrId;
    }

    public void setCtfrId(String ctfrId) {
        this.ctfrId = ctfrId;
    }

    public Date getCtfrLastupdate() {
        return ctfrLastupdate;
    }

    public void setCtfrLastupdate(Date ctfrLastupdate) {
        this.ctfrLastupdate = ctfrLastupdate;
    }

    public String getCntsNome() {
        return cntsNome;
    }

    public void setCntsNome(String cntsNome) {
        this.cntsNome = cntsNome;
    }

    public Cotacoes getCotcId() {
        return cotcId;
    }

    public void setCotcId(Cotacoes cotcId) {
        this.cotcId = cotcId;
    }

    public FormasVencimento getFvenId() {
        return fvenId;
    }

    public void setFvenId(FormasVencimento fvenId) {
        this.fvenId = fvenId;
    }

    public Fornecedores getFrndId() {
        return frndId;
    }

    public void setFrndId(Fornecedores frndId) {
        this.frndId = frndId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ctfrId != null ? ctfrId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CotacoesFornecedores)) {
            return false;
        }
        CotacoesFornecedores other = (CotacoesFornecedores) object;
        if ((this.ctfrId == null && other.ctfrId != null) || (this.ctfrId != null && !this.ctfrId.equals(other.ctfrId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.CotacoesFornecedores[ ctfrId=" + ctfrId + " ]";
    }
    
}
