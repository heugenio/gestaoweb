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
@Table(name = "ORCAMENTO_VENDA_PERCENTUAL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrcamentoVendaPercentual.findAll", query = "SELECT o FROM OrcamentoVendaPercentual o"),
    @NamedQuery(name = "OrcamentoVendaPercentual.findByOrprId", query = "SELECT o FROM OrcamentoVendaPercentual o WHERE o.orprId = :orprId"),
    @NamedQuery(name = "OrcamentoVendaPercentual.findByOrvdId", query = "SELECT o FROM OrcamentoVendaPercentual o WHERE o.orvdId = :orvdId"),
    @NamedQuery(name = "OrcamentoVendaPercentual.findByOrprPerc1", query = "SELECT o FROM OrcamentoVendaPercentual o WHERE o.orprPerc1 = :orprPerc1"),
    @NamedQuery(name = "OrcamentoVendaPercentual.findByOrprPerc2", query = "SELECT o FROM OrcamentoVendaPercentual o WHERE o.orprPerc2 = :orprPerc2"),
    @NamedQuery(name = "OrcamentoVendaPercentual.findByOrprPerc3", query = "SELECT o FROM OrcamentoVendaPercentual o WHERE o.orprPerc3 = :orprPerc3"),
    @NamedQuery(name = "OrcamentoVendaPercentual.findByOrprPerc4", query = "SELECT o FROM OrcamentoVendaPercentual o WHERE o.orprPerc4 = :orprPerc4"),
    @NamedQuery(name = "OrcamentoVendaPercentual.findByOrprPerc5", query = "SELECT o FROM OrcamentoVendaPercentual o WHERE o.orprPerc5 = :orprPerc5"),
    @NamedQuery(name = "OrcamentoVendaPercentual.findByOrprPerc6", query = "SELECT o FROM OrcamentoVendaPercentual o WHERE o.orprPerc6 = :orprPerc6"),
    @NamedQuery(name = "OrcamentoVendaPercentual.findByOrprLastupdate", query = "SELECT o FROM OrcamentoVendaPercentual o WHERE o.orprLastupdate = :orprLastupdate")})
public class OrcamentoVendaPercentual implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ORPR_ID")
    private String orprId;
    @Basic(optional = false)
    @Column(name = "ORVD_ID")
    private String orvdId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ORPR_PERC1")
    private BigDecimal orprPerc1;
    @Column(name = "ORPR_PERC2")
    private BigDecimal orprPerc2;
    @Column(name = "ORPR_PERC3")
    private BigDecimal orprPerc3;
    @Column(name = "ORPR_PERC4")
    private BigDecimal orprPerc4;
    @Column(name = "ORPR_PERC5")
    private BigDecimal orprPerc5;
    @Column(name = "ORPR_PERC6")
    private BigDecimal orprPerc6;
    @Column(name = "ORPR_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date orprLastupdate;

    public OrcamentoVendaPercentual() {
    }

    public OrcamentoVendaPercentual(String orprId) {
        this.orprId = orprId;
    }

    public OrcamentoVendaPercentual(String orprId, String orvdId) {
        this.orprId = orprId;
        this.orvdId = orvdId;
    }

    public String getOrprId() {
        return orprId;
    }

    public void setOrprId(String orprId) {
        this.orprId = orprId;
    }

    public String getOrvdId() {
        return orvdId;
    }

    public void setOrvdId(String orvdId) {
        this.orvdId = orvdId;
    }

    public BigDecimal getOrprPerc1() {
        return orprPerc1;
    }

    public void setOrprPerc1(BigDecimal orprPerc1) {
        this.orprPerc1 = orprPerc1;
    }

    public BigDecimal getOrprPerc2() {
        return orprPerc2;
    }

    public void setOrprPerc2(BigDecimal orprPerc2) {
        this.orprPerc2 = orprPerc2;
    }

    public BigDecimal getOrprPerc3() {
        return orprPerc3;
    }

    public void setOrprPerc3(BigDecimal orprPerc3) {
        this.orprPerc3 = orprPerc3;
    }

    public BigDecimal getOrprPerc4() {
        return orprPerc4;
    }

    public void setOrprPerc4(BigDecimal orprPerc4) {
        this.orprPerc4 = orprPerc4;
    }

    public BigDecimal getOrprPerc5() {
        return orprPerc5;
    }

    public void setOrprPerc5(BigDecimal orprPerc5) {
        this.orprPerc5 = orprPerc5;
    }

    public BigDecimal getOrprPerc6() {
        return orprPerc6;
    }

    public void setOrprPerc6(BigDecimal orprPerc6) {
        this.orprPerc6 = orprPerc6;
    }

    public Date getOrprLastupdate() {
        return orprLastupdate;
    }

    public void setOrprLastupdate(Date orprLastupdate) {
        this.orprLastupdate = orprLastupdate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orprId != null ? orprId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrcamentoVendaPercentual)) {
            return false;
        }
        OrcamentoVendaPercentual other = (OrcamentoVendaPercentual) object;
        if ((this.orprId == null && other.orprId != null) || (this.orprId != null && !this.orprId.equals(other.orprId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.OrcamentoVendaPercentual[ orprId=" + orprId + " ]";
    }
    
}
