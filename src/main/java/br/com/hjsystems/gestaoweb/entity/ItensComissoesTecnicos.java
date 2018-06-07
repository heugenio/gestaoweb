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
@Table(name = "ITENS_COMISSOES_TECNICOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ItensComissoesTecnicos.findAll", query = "SELECT i FROM ItensComissoesTecnicos i"),
    @NamedQuery(name = "ItensComissoesTecnicos.findByItctId", query = "SELECT i FROM ItensComissoesTecnicos i WHERE i.itctId = :itctId"),
    @NamedQuery(name = "ItensComissoesTecnicos.findByItctQtdeInformada", query = "SELECT i FROM ItensComissoesTecnicos i WHERE i.itctQtdeInformada = :itctQtdeInformada"),
    @NamedQuery(name = "ItensComissoesTecnicos.findByItctCustoInformado", query = "SELECT i FROM ItensComissoesTecnicos i WHERE i.itctCustoInformado = :itctCustoInformado"),
    @NamedQuery(name = "ItensComissoesTecnicos.findByItctLastupdate", query = "SELECT i FROM ItensComissoesTecnicos i WHERE i.itctLastupdate = :itctLastupdate")})
public class ItensComissoesTecnicos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ITCT_ID")
    private String itctId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "ITCT_QTDE_INFORMADA")
    private BigDecimal itctQtdeInformada;
    @Basic(optional = false)
    @Column(name = "ITCT_CUSTO_INFORMADO")
    private BigDecimal itctCustoInformado;
    @Column(name = "ITCT_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date itctLastupdate;
    @JoinColumn(name = "CMTC_ID", referencedColumnName = "CMTC_ID")
    @ManyToOne
    private ComissoesTecnicos cmtcId;
    @JoinColumn(name = "ITFT_ID", referencedColumnName = "ITFT_ID")
    @ManyToOne
    private ItensFaturados itftId;
    @JoinColumn(name = "PROD_ID", referencedColumnName = "PROD_ID")
    @ManyToOne
    private Produtos prodId;

    public ItensComissoesTecnicos() {
    }

    public ItensComissoesTecnicos(String itctId) {
        this.itctId = itctId;
    }

    public ItensComissoesTecnicos(String itctId, BigDecimal itctQtdeInformada, BigDecimal itctCustoInformado) {
        this.itctId = itctId;
        this.itctQtdeInformada = itctQtdeInformada;
        this.itctCustoInformado = itctCustoInformado;
    }

    public String getItctId() {
        return itctId;
    }

    public void setItctId(String itctId) {
        this.itctId = itctId;
    }

    public BigDecimal getItctQtdeInformada() {
        return itctQtdeInformada;
    }

    public void setItctQtdeInformada(BigDecimal itctQtdeInformada) {
        this.itctQtdeInformada = itctQtdeInformada;
    }

    public BigDecimal getItctCustoInformado() {
        return itctCustoInformado;
    }

    public void setItctCustoInformado(BigDecimal itctCustoInformado) {
        this.itctCustoInformado = itctCustoInformado;
    }

    public Date getItctLastupdate() {
        return itctLastupdate;
    }

    public void setItctLastupdate(Date itctLastupdate) {
        this.itctLastupdate = itctLastupdate;
    }

    public ComissoesTecnicos getCmtcId() {
        return cmtcId;
    }

    public void setCmtcId(ComissoesTecnicos cmtcId) {
        this.cmtcId = cmtcId;
    }

    public ItensFaturados getItftId() {
        return itftId;
    }

    public void setItftId(ItensFaturados itftId) {
        this.itftId = itftId;
    }

    public Produtos getProdId() {
        return prodId;
    }

    public void setProdId(Produtos prodId) {
        this.prodId = prodId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itctId != null ? itctId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItensComissoesTecnicos)) {
            return false;
        }
        ItensComissoesTecnicos other = (ItensComissoesTecnicos) object;
        if ((this.itctId == null && other.itctId != null) || (this.itctId != null && !this.itctId.equals(other.itctId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.ItensComissoesTecnicos[ itctId=" + itctId + " ]";
    }
    
}
