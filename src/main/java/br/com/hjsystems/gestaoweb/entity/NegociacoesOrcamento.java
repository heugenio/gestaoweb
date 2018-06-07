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
@Table(name = "NEGOCIACOES_ORCAMENTO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "NegociacoesOrcamento.findAll", query = "SELECT n FROM NegociacoesOrcamento n"),
    @NamedQuery(name = "NegociacoesOrcamento.findByNgorId", query = "SELECT n FROM NegociacoesOrcamento n WHERE n.ngorId = :ngorId"),
    @NamedQuery(name = "NegociacoesOrcamento.findByNgorDiasVencimento", query = "SELECT n FROM NegociacoesOrcamento n WHERE n.ngorDiasVencimento = :ngorDiasVencimento"),
    @NamedQuery(name = "NegociacoesOrcamento.findByNgorDataVencimento", query = "SELECT n FROM NegociacoesOrcamento n WHERE n.ngorDataVencimento = :ngorDataVencimento"),
    @NamedQuery(name = "NegociacoesOrcamento.findByNgorPercVencimento", query = "SELECT n FROM NegociacoesOrcamento n WHERE n.ngorPercVencimento = :ngorPercVencimento"),
    @NamedQuery(name = "NegociacoesOrcamento.findByNgorVlrParcela", query = "SELECT n FROM NegociacoesOrcamento n WHERE n.ngorVlrParcela = :ngorVlrParcela"),
    @NamedQuery(name = "NegociacoesOrcamento.findByNgorTipoPagamento", query = "SELECT n FROM NegociacoesOrcamento n WHERE n.ngorTipoPagamento = :ngorTipoPagamento"),
    @NamedQuery(name = "NegociacoesOrcamento.findByNgorLastupdate", query = "SELECT n FROM NegociacoesOrcamento n WHERE n.ngorLastupdate = :ngorLastupdate")})
public class NegociacoesOrcamento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NGOR_ID")
    private String ngorId;
    @Basic(optional = false)
    @Column(name = "NGOR_DIAS_VENCIMENTO")
    private int ngorDiasVencimento;
    @Column(name = "NGOR_DATA_VENCIMENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngorDataVencimento;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "NGOR_PERC_VENCIMENTO")
    private BigDecimal ngorPercVencimento;
    @Basic(optional = false)
    @Column(name = "NGOR_VLR_PARCELA")
    private BigDecimal ngorVlrParcela;
    @Column(name = "NGOR_TIPO_PAGAMENTO")
    private String ngorTipoPagamento;
    @Column(name = "NGOR_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngorLastupdate;
    @JoinColumn(name = "COFR_ID", referencedColumnName = "COFR_ID")
    @ManyToOne
    private Cofres cofrId;
    @JoinColumn(name = "ITFV_ID", referencedColumnName = "ITFV_ID")
    @ManyToOne
    private ItensFormaVencimento itfvId;
    @JoinColumn(name = "ORVD_ID", referencedColumnName = "ORVD_ID")
    @ManyToOne
    private OrcamentosVendas orvdId;

    public NegociacoesOrcamento() {
    }

    public NegociacoesOrcamento(String ngorId) {
        this.ngorId = ngorId;
    }

    public NegociacoesOrcamento(String ngorId, int ngorDiasVencimento, BigDecimal ngorPercVencimento, BigDecimal ngorVlrParcela) {
        this.ngorId = ngorId;
        this.ngorDiasVencimento = ngorDiasVencimento;
        this.ngorPercVencimento = ngorPercVencimento;
        this.ngorVlrParcela = ngorVlrParcela;
    }

    public String getNgorId() {
        return ngorId;
    }

    public void setNgorId(String ngorId) {
        this.ngorId = ngorId;
    }

    public int getNgorDiasVencimento() {
        return ngorDiasVencimento;
    }

    public void setNgorDiasVencimento(int ngorDiasVencimento) {
        this.ngorDiasVencimento = ngorDiasVencimento;
    }

    public Date getNgorDataVencimento() {
        return ngorDataVencimento;
    }

    public void setNgorDataVencimento(Date ngorDataVencimento) {
        this.ngorDataVencimento = ngorDataVencimento;
    }

    public BigDecimal getNgorPercVencimento() {
        return ngorPercVencimento;
    }

    public void setNgorPercVencimento(BigDecimal ngorPercVencimento) {
        this.ngorPercVencimento = ngorPercVencimento;
    }

    public BigDecimal getNgorVlrParcela() {
        return ngorVlrParcela;
    }

    public void setNgorVlrParcela(BigDecimal ngorVlrParcela) {
        this.ngorVlrParcela = ngorVlrParcela;
    }

    public String getNgorTipoPagamento() {
        return ngorTipoPagamento;
    }

    public void setNgorTipoPagamento(String ngorTipoPagamento) {
        this.ngorTipoPagamento = ngorTipoPagamento;
    }

    public Date getNgorLastupdate() {
        return ngorLastupdate;
    }

    public void setNgorLastupdate(Date ngorLastupdate) {
        this.ngorLastupdate = ngorLastupdate;
    }

    public Cofres getCofrId() {
        return cofrId;
    }

    public void setCofrId(Cofres cofrId) {
        this.cofrId = cofrId;
    }

    public ItensFormaVencimento getItfvId() {
        return itfvId;
    }

    public void setItfvId(ItensFormaVencimento itfvId) {
        this.itfvId = itfvId;
    }

    public OrcamentosVendas getOrvdId() {
        return orvdId;
    }

    public void setOrvdId(OrcamentosVendas orvdId) {
        this.orvdId = orvdId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ngorId != null ? ngorId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NegociacoesOrcamento)) {
            return false;
        }
        NegociacoesOrcamento other = (NegociacoesOrcamento) object;
        if ((this.ngorId == null && other.ngorId != null) || (this.ngorId != null && !this.ngorId.equals(other.ngorId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.NegociacoesOrcamento[ ngorId=" + ngorId + " ]";
    }
    
}
