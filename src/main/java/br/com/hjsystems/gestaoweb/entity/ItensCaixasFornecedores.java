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
@Table(name = "ITENS_CAIXAS_FORNECEDORES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ItensCaixasFornecedores.findAll", query = "SELECT i FROM ItensCaixasFornecedores i"),
    @NamedQuery(name = "ItensCaixasFornecedores.findByItfrId", query = "SELECT i FROM ItensCaixasFornecedores i WHERE i.itfrId = :itfrId"),
    @NamedQuery(name = "ItensCaixasFornecedores.findByItfrValor", query = "SELECT i FROM ItensCaixasFornecedores i WHERE i.itfrValor = :itfrValor"),
    @NamedQuery(name = "ItensCaixasFornecedores.findByItfrLastupdate", query = "SELECT i FROM ItensCaixasFornecedores i WHERE i.itfrLastupdate = :itfrLastupdate")})
public class ItensCaixasFornecedores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ITFR_ID")
    private String itfrId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ITFR_VALOR")
    private BigDecimal itfrValor;
    @Column(name = "ITFR_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date itfrLastupdate;
    @JoinColumn(name = "ITCX_ID", referencedColumnName = "ITCX_ID")
    @ManyToOne
    private ItensCaixas itcxId;
    @JoinColumn(name = "PESS_ID", referencedColumnName = "PESS_ID")
    @ManyToOne
    private Pessoas pessId;
    @JoinColumn(name = "PLCT_ID", referencedColumnName = "PLCT_ID")
    @ManyToOne
    private PlanoContas plctId;

    public ItensCaixasFornecedores() {
    }

    public ItensCaixasFornecedores(String itfrId) {
        this.itfrId = itfrId;
    }

    public String getItfrId() {
        return itfrId;
    }

    public void setItfrId(String itfrId) {
        this.itfrId = itfrId;
    }

    public BigDecimal getItfrValor() {
        return itfrValor;
    }

    public void setItfrValor(BigDecimal itfrValor) {
        this.itfrValor = itfrValor;
    }

    public Date getItfrLastupdate() {
        return itfrLastupdate;
    }

    public void setItfrLastupdate(Date itfrLastupdate) {
        this.itfrLastupdate = itfrLastupdate;
    }

    public ItensCaixas getItcxId() {
        return itcxId;
    }

    public void setItcxId(ItensCaixas itcxId) {
        this.itcxId = itcxId;
    }

    public Pessoas getPessId() {
        return pessId;
    }

    public void setPessId(Pessoas pessId) {
        this.pessId = pessId;
    }

    public PlanoContas getPlctId() {
        return plctId;
    }

    public void setPlctId(PlanoContas plctId) {
        this.plctId = plctId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itfrId != null ? itfrId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItensCaixasFornecedores)) {
            return false;
        }
        ItensCaixasFornecedores other = (ItensCaixasFornecedores) object;
        if ((this.itfrId == null && other.itfrId != null) || (this.itfrId != null && !this.itfrId.equals(other.itfrId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.ItensCaixasFornecedores[ itfrId=" + itfrId + " ]";
    }
    
}
