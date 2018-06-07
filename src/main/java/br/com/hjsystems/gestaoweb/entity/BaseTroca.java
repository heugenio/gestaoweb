/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hjsystems.gestaoweb.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "BASE_TROCA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BaseTroca.findAll", query = "SELECT b FROM BaseTroca b"),
    @NamedQuery(name = "BaseTroca.findByBstrId", query = "SELECT b FROM BaseTroca b WHERE b.bstrId = :bstrId"),
    @NamedQuery(name = "BaseTroca.findByBstrStatus", query = "SELECT b FROM BaseTroca b WHERE b.bstrStatus = :bstrStatus"),
    @NamedQuery(name = "BaseTroca.findByBstrObservacao", query = "SELECT b FROM BaseTroca b WHERE b.bstrObservacao = :bstrObservacao"),
    @NamedQuery(name = "BaseTroca.findByBstrLastupdate", query = "SELECT b FROM BaseTroca b WHERE b.bstrLastupdate = :bstrLastupdate"),
    @NamedQuery(name = "BaseTroca.findByBstrDataFechamento", query = "SELECT b FROM BaseTroca b WHERE b.bstrDataFechamento = :bstrDataFechamento"),
    @NamedQuery(name = "BaseTroca.findByUsrsId", query = "SELECT b FROM BaseTroca b WHERE b.usrsId = :usrsId"),
    @NamedQuery(name = "BaseTroca.findByBstrQtdAtendida", query = "SELECT b FROM BaseTroca b WHERE b.bstrQtdAtendida = :bstrQtdAtendida"),
    @NamedQuery(name = "BaseTroca.findByBstrQtdCancelada", query = "SELECT b FROM BaseTroca b WHERE b.bstrQtdCancelada = :bstrQtdCancelada")})
public class BaseTroca implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "BSTR_ID")
    private String bstrId;
    @Basic(optional = false)
    @Column(name = "BSTR_STATUS")
    private String bstrStatus;
    @Column(name = "BSTR_OBSERVACAO")
    private String bstrObservacao;
    @Column(name = "BSTR_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date bstrLastupdate;
    @Column(name = "BSTR_DATA_FECHAMENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date bstrDataFechamento;
    @Column(name = "USRS_ID")
    private String usrsId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "BSTR_QTD_ATENDIDA")
    private BigDecimal bstrQtdAtendida;
    @Column(name = "BSTR_QTD_CANCELADA")
    private BigDecimal bstrQtdCancelada;
    @OneToMany(mappedBy = "bstrId")
    private List<SaldosEstoquesDiario> saldosEstoquesDiarioList;
    @JoinColumn(name = "ITPD_ID", referencedColumnName = "ITPD_ID")
    @ManyToOne
    private ItensPedidos itpdId;
    @JoinColumn(name = "ITRQ_ID", referencedColumnName = "ITRQ_ID")
    @ManyToOne
    private ItensRequisicoes itrqId;

    public BaseTroca() {
    }

    public BaseTroca(String bstrId) {
        this.bstrId = bstrId;
    }

    public BaseTroca(String bstrId, String bstrStatus) {
        this.bstrId = bstrId;
        this.bstrStatus = bstrStatus;
    }

    public String getBstrId() {
        return bstrId;
    }

    public void setBstrId(String bstrId) {
        this.bstrId = bstrId;
    }

    public String getBstrStatus() {
        return bstrStatus;
    }

    public void setBstrStatus(String bstrStatus) {
        this.bstrStatus = bstrStatus;
    }

    public String getBstrObservacao() {
        return bstrObservacao;
    }

    public void setBstrObservacao(String bstrObservacao) {
        this.bstrObservacao = bstrObservacao;
    }

    public Date getBstrLastupdate() {
        return bstrLastupdate;
    }

    public void setBstrLastupdate(Date bstrLastupdate) {
        this.bstrLastupdate = bstrLastupdate;
    }

    public Date getBstrDataFechamento() {
        return bstrDataFechamento;
    }

    public void setBstrDataFechamento(Date bstrDataFechamento) {
        this.bstrDataFechamento = bstrDataFechamento;
    }

    public String getUsrsId() {
        return usrsId;
    }

    public void setUsrsId(String usrsId) {
        this.usrsId = usrsId;
    }

    public BigDecimal getBstrQtdAtendida() {
        return bstrQtdAtendida;
    }

    public void setBstrQtdAtendida(BigDecimal bstrQtdAtendida) {
        this.bstrQtdAtendida = bstrQtdAtendida;
    }

    public BigDecimal getBstrQtdCancelada() {
        return bstrQtdCancelada;
    }

    public void setBstrQtdCancelada(BigDecimal bstrQtdCancelada) {
        this.bstrQtdCancelada = bstrQtdCancelada;
    }

    @XmlTransient
    public List<SaldosEstoquesDiario> getSaldosEstoquesDiarioList() {
        return saldosEstoquesDiarioList;
    }

    public void setSaldosEstoquesDiarioList(List<SaldosEstoquesDiario> saldosEstoquesDiarioList) {
        this.saldosEstoquesDiarioList = saldosEstoquesDiarioList;
    }

    public ItensPedidos getItpdId() {
        return itpdId;
    }

    public void setItpdId(ItensPedidos itpdId) {
        this.itpdId = itpdId;
    }

    public ItensRequisicoes getItrqId() {
        return itrqId;
    }

    public void setItrqId(ItensRequisicoes itrqId) {
        this.itrqId = itrqId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bstrId != null ? bstrId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BaseTroca)) {
            return false;
        }
        BaseTroca other = (BaseTroca) object;
        if ((this.bstrId == null && other.bstrId != null) || (this.bstrId != null && !this.bstrId.equals(other.bstrId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.BaseTroca[ bstrId=" + bstrId + " ]";
    }
    
}
