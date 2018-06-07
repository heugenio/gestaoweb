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
@Table(name = "DESCONTOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Descontos.findAll", query = "SELECT d FROM Descontos d"),
    @NamedQuery(name = "Descontos.findByDctsId", query = "SELECT d FROM Descontos d WHERE d.dctsId = :dctsId"),
    @NamedQuery(name = "Descontos.findByDctsData", query = "SELECT d FROM Descontos d WHERE d.dctsData = :dctsData"),
    @NamedQuery(name = "Descontos.findByDctsValor", query = "SELECT d FROM Descontos d WHERE d.dctsValor = :dctsValor"),
    @NamedQuery(name = "Descontos.findByDctsJuros", query = "SELECT d FROM Descontos d WHERE d.dctsJuros = :dctsJuros"),
    @NamedQuery(name = "Descontos.findByDctsTipoMovimento", query = "SELECT d FROM Descontos d WHERE d.dctsTipoMovimento = :dctsTipoMovimento"),
    @NamedQuery(name = "Descontos.findByDctsLASTUPDATE", query = "SELECT d FROM Descontos d WHERE d.dctsLASTUPDATE = :dctsLASTUPDATE")})
public class Descontos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DCTS_ID")
    private String dctsId;
    @Basic(optional = false)
    @Column(name = "DCTS_DATA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dctsData;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "DCTS_VALOR")
    private BigDecimal dctsValor;
    @Basic(optional = false)
    @Column(name = "DCTS_JUROS")
    private BigDecimal dctsJuros;
    @Basic(optional = false)
    @Column(name = "DCTS_TIPO_MOVIMENTO")
    private String dctsTipoMovimento;
    @Column(name = "Dcts_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dctsLASTUPDATE;
    @JoinColumn(name = "PCLS_ID", referencedColumnName = "PCLS_ID")
    @ManyToOne
    private Parcelas pclsId;
    @JoinColumn(name = "PESS_ID", referencedColumnName = "PESS_ID")
    @ManyToOne
    private Pessoas pessId;

    public Descontos() {
    }

    public Descontos(String dctsId) {
        this.dctsId = dctsId;
    }

    public Descontos(String dctsId, Date dctsData, BigDecimal dctsValor, BigDecimal dctsJuros, String dctsTipoMovimento) {
        this.dctsId = dctsId;
        this.dctsData = dctsData;
        this.dctsValor = dctsValor;
        this.dctsJuros = dctsJuros;
        this.dctsTipoMovimento = dctsTipoMovimento;
    }

    public String getDctsId() {
        return dctsId;
    }

    public void setDctsId(String dctsId) {
        this.dctsId = dctsId;
    }

    public Date getDctsData() {
        return dctsData;
    }

    public void setDctsData(Date dctsData) {
        this.dctsData = dctsData;
    }

    public BigDecimal getDctsValor() {
        return dctsValor;
    }

    public void setDctsValor(BigDecimal dctsValor) {
        this.dctsValor = dctsValor;
    }

    public BigDecimal getDctsJuros() {
        return dctsJuros;
    }

    public void setDctsJuros(BigDecimal dctsJuros) {
        this.dctsJuros = dctsJuros;
    }

    public String getDctsTipoMovimento() {
        return dctsTipoMovimento;
    }

    public void setDctsTipoMovimento(String dctsTipoMovimento) {
        this.dctsTipoMovimento = dctsTipoMovimento;
    }

    public Date getDctsLASTUPDATE() {
        return dctsLASTUPDATE;
    }

    public void setDctsLASTUPDATE(Date dctsLASTUPDATE) {
        this.dctsLASTUPDATE = dctsLASTUPDATE;
    }

    public Parcelas getPclsId() {
        return pclsId;
    }

    public void setPclsId(Parcelas pclsId) {
        this.pclsId = pclsId;
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
        hash += (dctsId != null ? dctsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Descontos)) {
            return false;
        }
        Descontos other = (Descontos) object;
        if ((this.dctsId == null && other.dctsId != null) || (this.dctsId != null && !this.dctsId.equals(other.dctsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.Descontos[ dctsId=" + dctsId + " ]";
    }
    
}
