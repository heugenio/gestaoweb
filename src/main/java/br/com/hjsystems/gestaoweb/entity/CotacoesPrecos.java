/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hjsystems.gestaoweb.entity;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "COTACOES_PRECOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CotacoesPrecos.findAll", query = "SELECT c FROM CotacoesPrecos c"),
    @NamedQuery(name = "CotacoesPrecos.findByCtpcId", query = "SELECT c FROM CotacoesPrecos c WHERE c.ctpcId = :ctpcId"),
    @NamedQuery(name = "CotacoesPrecos.findByCtfrId", query = "SELECT c FROM CotacoesPrecos c WHERE c.ctfrId = :ctfrId"),
    @NamedQuery(name = "CotacoesPrecos.findByCtpcQtd", query = "SELECT c FROM CotacoesPrecos c WHERE c.ctpcQtd = :ctpcQtd"),
    @NamedQuery(name = "CotacoesPrecos.findByCtpcPreco", query = "SELECT c FROM CotacoesPrecos c WHERE c.ctpcPreco = :ctpcPreco"),
    @NamedQuery(name = "CotacoesPrecos.findByCtpcLastupdate", query = "SELECT c FROM CotacoesPrecos c WHERE c.ctpcLastupdate = :ctpcLastupdate"),
    @NamedQuery(name = "CotacoesPrecos.findByCtpcPrecoVenda", query = "SELECT c FROM CotacoesPrecos c WHERE c.ctpcPrecoVenda = :ctpcPrecoVenda")})
public class CotacoesPrecos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CTPC_ID")
    private String ctpcId;
    @Column(name = "CTFR_ID")
    private String ctfrId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "CTPC_QTD")
    private BigDecimal ctpcQtd;
    @Basic(optional = false)
    @Column(name = "CTPC_PRECO")
    private BigDecimal ctpcPreco;
    @Column(name = "CTPC_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ctpcLastupdate;
    @Basic(optional = false)
    @Column(name = "CTPC_PRECO_VENDA")
    private BigDecimal ctpcPrecoVenda;
    @JoinColumn(name = "CTIT_ID", referencedColumnName = "CTIT_ID")
    @ManyToOne
    private CotacoesItens ctitId;

    public CotacoesPrecos() {
    }

    public CotacoesPrecos(String ctpcId) {
        this.ctpcId = ctpcId;
    }

    public CotacoesPrecos(String ctpcId, BigDecimal ctpcQtd, BigDecimal ctpcPreco, BigDecimal ctpcPrecoVenda) {
        this.ctpcId = ctpcId;
        this.ctpcQtd = ctpcQtd;
        this.ctpcPreco = ctpcPreco;
        this.ctpcPrecoVenda = ctpcPrecoVenda;
    }

    public String getCtpcId() {
        return ctpcId;
    }

    public void setCtpcId(String ctpcId) {
        this.ctpcId = ctpcId;
    }

    public String getCtfrId() {
        return ctfrId;
    }

    public void setCtfrId(String ctfrId) {
        this.ctfrId = ctfrId;
    }

    public BigDecimal getCtpcQtd() {
        return ctpcQtd;
    }

    public void setCtpcQtd(BigDecimal ctpcQtd) {
        this.ctpcQtd = ctpcQtd;
    }

    public BigDecimal getCtpcPreco() {
        return ctpcPreco;
    }

    public void setCtpcPreco(BigDecimal ctpcPreco) {
        this.ctpcPreco = ctpcPreco;
    }

    public Date getCtpcLastupdate() {
        return ctpcLastupdate;
    }

    public void setCtpcLastupdate(Date ctpcLastupdate) {
        this.ctpcLastupdate = ctpcLastupdate;
    }

    public BigDecimal getCtpcPrecoVenda() {
        return ctpcPrecoVenda;
    }

    public void setCtpcPrecoVenda(BigDecimal ctpcPrecoVenda) {
        this.ctpcPrecoVenda = ctpcPrecoVenda;
    }

    public CotacoesItens getCtitId() {
        return ctitId;
    }

    public void setCtitId(CotacoesItens ctitId) {
        this.ctitId = ctitId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ctpcId != null ? ctpcId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CotacoesPrecos)) {
            return false;
        }
        CotacoesPrecos other = (CotacoesPrecos) object;
        if ((this.ctpcId == null && other.ctpcId != null) || (this.ctpcId != null && !this.ctpcId.equals(other.ctpcId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.CotacoesPrecos[ ctpcId=" + ctpcId + " ]";
    }
    
}
