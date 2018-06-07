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
@Table(name = "SALDOS_ESTOQUES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SaldosEstoques.findAll", query = "SELECT s FROM SaldosEstoques s"),
    @NamedQuery(name = "SaldosEstoques.findBySestId", query = "SELECT s FROM SaldosEstoques s WHERE s.sestId = :sestId"),
    @NamedQuery(name = "SaldosEstoques.findBySestData", query = "SELECT s FROM SaldosEstoques s WHERE s.sestData = :sestData"),
    @NamedQuery(name = "SaldosEstoques.findBySestQtdMov", query = "SELECT s FROM SaldosEstoques s WHERE s.sestQtdMov = :sestQtdMov"),
    @NamedQuery(name = "SaldosEstoques.findBySEstLASTUPDATE", query = "SELECT s FROM SaldosEstoques s WHERE s.sEstLASTUPDATE = :sEstLASTUPDATE")})
public class SaldosEstoques implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SEST_ID")
    private String sestId;
    @Basic(optional = false)
    @Column(name = "SEST_DATA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sestData;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "SEST_QTD_MOV")
    private BigDecimal sestQtdMov;
    @Column(name = "SEst_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sEstLASTUPDATE;
    @JoinColumn(name = "HMOV_ID", referencedColumnName = "HMOV_ID")
    @ManyToOne
    private HistoricosMovimentacoes hmovId;
    @JoinColumn(name = "TEST_ID", referencedColumnName = "TEST_ID")
    @ManyToOne
    private TiposEstoques testId;

    public SaldosEstoques() {
    }

    public SaldosEstoques(String sestId) {
        this.sestId = sestId;
    }

    public SaldosEstoques(String sestId, Date sestData, BigDecimal sestQtdMov) {
        this.sestId = sestId;
        this.sestData = sestData;
        this.sestQtdMov = sestQtdMov;
    }

    public String getSestId() {
        return sestId;
    }

    public void setSestId(String sestId) {
        this.sestId = sestId;
    }

    public Date getSestData() {
        return sestData;
    }

    public void setSestData(Date sestData) {
        this.sestData = sestData;
    }

    public BigDecimal getSestQtdMov() {
        return sestQtdMov;
    }

    public void setSestQtdMov(BigDecimal sestQtdMov) {
        this.sestQtdMov = sestQtdMov;
    }

    public Date getSEstLASTUPDATE() {
        return sEstLASTUPDATE;
    }

    public void setSEstLASTUPDATE(Date sEstLASTUPDATE) {
        this.sEstLASTUPDATE = sEstLASTUPDATE;
    }

    public HistoricosMovimentacoes getHmovId() {
        return hmovId;
    }

    public void setHmovId(HistoricosMovimentacoes hmovId) {
        this.hmovId = hmovId;
    }

    public TiposEstoques getTestId() {
        return testId;
    }

    public void setTestId(TiposEstoques testId) {
        this.testId = testId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sestId != null ? sestId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SaldosEstoques)) {
            return false;
        }
        SaldosEstoques other = (SaldosEstoques) object;
        if ((this.sestId == null && other.sestId != null) || (this.sestId != null && !this.sestId.equals(other.sestId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.SaldosEstoques[ sestId=" + sestId + " ]";
    }
    
}
