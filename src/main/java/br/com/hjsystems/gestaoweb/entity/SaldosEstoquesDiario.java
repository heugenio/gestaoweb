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
@Table(name = "SALDOS_ESTOQUES_DIARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SaldosEstoquesDiario.findAll", query = "SELECT s FROM SaldosEstoquesDiario s"),
    @NamedQuery(name = "SaldosEstoquesDiario.findBySesdId", query = "SELECT s FROM SaldosEstoquesDiario s WHERE s.sesdId = :sesdId"),
    @NamedQuery(name = "SaldosEstoquesDiario.findBySesdData", query = "SELECT s FROM SaldosEstoquesDiario s WHERE s.sesdData = :sesdData"),
    @NamedQuery(name = "SaldosEstoquesDiario.findBySesdQtdMov", query = "SELECT s FROM SaldosEstoquesDiario s WHERE s.sesdQtdMov = :sesdQtdMov"),
    @NamedQuery(name = "SaldosEstoquesDiario.findBySesdLastupdate", query = "SELECT s FROM SaldosEstoquesDiario s WHERE s.sesdLastupdate = :sesdLastupdate")})
public class SaldosEstoquesDiario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SESD_ID")
    private String sesdId;
    @Basic(optional = false)
    @Column(name = "SESD_DATA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sesdData;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "SESD_QTD_MOV")
    private BigDecimal sesdQtdMov;
    @Column(name = "SESD_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sesdLastupdate;
    @JoinColumn(name = "BSTR_ID", referencedColumnName = "BSTR_ID")
    @ManyToOne
    private BaseTroca bstrId;
    @JoinColumn(name = "HMOV_ID", referencedColumnName = "HMOV_ID")
    @ManyToOne
    private HistoricosMovimentacoes hmovId;
    @JoinColumn(name = "ITFT_ID", referencedColumnName = "ITFT_ID")
    @ManyToOne
    private ItensFaturados itftId;
    @JoinColumn(name = "ITRQ_ID", referencedColumnName = "ITRQ_ID")
    @ManyToOne
    private ItensRequisicoes itrqId;
    @JoinColumn(name = "OPRD_ID", referencedColumnName = "OPRD_ID")
    @ManyToOne
    private OrdemProducao oprdId;
    @JoinColumn(name = "TEST_ID", referencedColumnName = "TEST_ID")
    @ManyToOne
    private TiposEstoques testId;

    public SaldosEstoquesDiario() {
    }

    public SaldosEstoquesDiario(String sesdId) {
        this.sesdId = sesdId;
    }

    public SaldosEstoquesDiario(String sesdId, Date sesdData, BigDecimal sesdQtdMov) {
        this.sesdId = sesdId;
        this.sesdData = sesdData;
        this.sesdQtdMov = sesdQtdMov;
    }

    public String getSesdId() {
        return sesdId;
    }

    public void setSesdId(String sesdId) {
        this.sesdId = sesdId;
    }

    public Date getSesdData() {
        return sesdData;
    }

    public void setSesdData(Date sesdData) {
        this.sesdData = sesdData;
    }

    public BigDecimal getSesdQtdMov() {
        return sesdQtdMov;
    }

    public void setSesdQtdMov(BigDecimal sesdQtdMov) {
        this.sesdQtdMov = sesdQtdMov;
    }

    public Date getSesdLastupdate() {
        return sesdLastupdate;
    }

    public void setSesdLastupdate(Date sesdLastupdate) {
        this.sesdLastupdate = sesdLastupdate;
    }

    public BaseTroca getBstrId() {
        return bstrId;
    }

    public void setBstrId(BaseTroca bstrId) {
        this.bstrId = bstrId;
    }

    public HistoricosMovimentacoes getHmovId() {
        return hmovId;
    }

    public void setHmovId(HistoricosMovimentacoes hmovId) {
        this.hmovId = hmovId;
    }

    public ItensFaturados getItftId() {
        return itftId;
    }

    public void setItftId(ItensFaturados itftId) {
        this.itftId = itftId;
    }

    public ItensRequisicoes getItrqId() {
        return itrqId;
    }

    public void setItrqId(ItensRequisicoes itrqId) {
        this.itrqId = itrqId;
    }

    public OrdemProducao getOprdId() {
        return oprdId;
    }

    public void setOprdId(OrdemProducao oprdId) {
        this.oprdId = oprdId;
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
        hash += (sesdId != null ? sesdId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SaldosEstoquesDiario)) {
            return false;
        }
        SaldosEstoquesDiario other = (SaldosEstoquesDiario) object;
        if ((this.sesdId == null && other.sesdId != null) || (this.sesdId != null && !this.sesdId.equals(other.sesdId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.SaldosEstoquesDiario[ sesdId=" + sesdId + " ]";
    }
    
}
