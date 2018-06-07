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
@Table(name = "ITENS_FORMA_VENCIMENTO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ItensFormaVencimento.findAll", query = "SELECT i FROM ItensFormaVencimento i"),
    @NamedQuery(name = "ItensFormaVencimento.findByItfvId", query = "SELECT i FROM ItensFormaVencimento i WHERE i.itfvId = :itfvId"),
    @NamedQuery(name = "ItensFormaVencimento.findByItfvPrazo", query = "SELECT i FROM ItensFormaVencimento i WHERE i.itfvPrazo = :itfvPrazo"),
    @NamedQuery(name = "ItensFormaVencimento.findByItfvDiaInicial", query = "SELECT i FROM ItensFormaVencimento i WHERE i.itfvDiaInicial = :itfvDiaInicial"),
    @NamedQuery(name = "ItensFormaVencimento.findByItfvDiaFinal", query = "SELECT i FROM ItensFormaVencimento i WHERE i.itfvDiaFinal = :itfvDiaFinal"),
    @NamedQuery(name = "ItensFormaVencimento.findByItfvTipoPagamento", query = "SELECT i FROM ItensFormaVencimento i WHERE i.itfvTipoPagamento = :itfvTipoPagamento"),
    @NamedQuery(name = "ItensFormaVencimento.findByItfvPercentual", query = "SELECT i FROM ItensFormaVencimento i WHERE i.itfvPercentual = :itfvPercentual"),
    @NamedQuery(name = "ItensFormaVencimento.findByItfvLastupdate", query = "SELECT i FROM ItensFormaVencimento i WHERE i.itfvLastupdate = :itfvLastupdate")})
public class ItensFormaVencimento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ITFV_ID")
    private String itfvId;
    @Column(name = "ITFV_PRAZO")
    private Integer itfvPrazo;
    @Column(name = "ITFV_DIA_INICIAL")
    private Integer itfvDiaInicial;
    @Column(name = "ITFV_DIA_FINAL")
    private Integer itfvDiaFinal;
    @Basic(optional = false)
    @Column(name = "ITFV_TIPO_PAGAMENTO")
    private String itfvTipoPagamento;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "ITFV_PERCENTUAL")
    private BigDecimal itfvPercentual;
    @Column(name = "ITFV_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date itfvLastupdate;
    @OneToMany(mappedBy = "itfvId")
    private List<NegociacoesOrcamento> negociacoesOrcamentoList;
    @JoinColumn(name = "FVEN_ID", referencedColumnName = "FVEN_ID")
    @ManyToOne
    private FormasVencimento fvenId;
    @OneToMany(mappedBy = "itfvId")
    private List<NegociacoesPedidos> negociacoesPedidosList;
    @OneToMany(mappedBy = "itfvId")
    private List<TiposPagPermitidos> tiposPagPermitidosList;

    public ItensFormaVencimento() {
    }

    public ItensFormaVencimento(String itfvId) {
        this.itfvId = itfvId;
    }

    public ItensFormaVencimento(String itfvId, String itfvTipoPagamento, BigDecimal itfvPercentual) {
        this.itfvId = itfvId;
        this.itfvTipoPagamento = itfvTipoPagamento;
        this.itfvPercentual = itfvPercentual;
    }

    public String getItfvId() {
        return itfvId;
    }

    public void setItfvId(String itfvId) {
        this.itfvId = itfvId;
    }

    public Integer getItfvPrazo() {
        return itfvPrazo;
    }

    public void setItfvPrazo(Integer itfvPrazo) {
        this.itfvPrazo = itfvPrazo;
    }

    public Integer getItfvDiaInicial() {
        return itfvDiaInicial;
    }

    public void setItfvDiaInicial(Integer itfvDiaInicial) {
        this.itfvDiaInicial = itfvDiaInicial;
    }

    public Integer getItfvDiaFinal() {
        return itfvDiaFinal;
    }

    public void setItfvDiaFinal(Integer itfvDiaFinal) {
        this.itfvDiaFinal = itfvDiaFinal;
    }

    public String getItfvTipoPagamento() {
        return itfvTipoPagamento;
    }

    public void setItfvTipoPagamento(String itfvTipoPagamento) {
        this.itfvTipoPagamento = itfvTipoPagamento;
    }

    public BigDecimal getItfvPercentual() {
        return itfvPercentual;
    }

    public void setItfvPercentual(BigDecimal itfvPercentual) {
        this.itfvPercentual = itfvPercentual;
    }

    public Date getItfvLastupdate() {
        return itfvLastupdate;
    }

    public void setItfvLastupdate(Date itfvLastupdate) {
        this.itfvLastupdate = itfvLastupdate;
    }

    @XmlTransient
    public List<NegociacoesOrcamento> getNegociacoesOrcamentoList() {
        return negociacoesOrcamentoList;
    }

    public void setNegociacoesOrcamentoList(List<NegociacoesOrcamento> negociacoesOrcamentoList) {
        this.negociacoesOrcamentoList = negociacoesOrcamentoList;
    }

    public FormasVencimento getFvenId() {
        return fvenId;
    }

    public void setFvenId(FormasVencimento fvenId) {
        this.fvenId = fvenId;
    }

    @XmlTransient
    public List<NegociacoesPedidos> getNegociacoesPedidosList() {
        return negociacoesPedidosList;
    }

    public void setNegociacoesPedidosList(List<NegociacoesPedidos> negociacoesPedidosList) {
        this.negociacoesPedidosList = negociacoesPedidosList;
    }

    @XmlTransient
    public List<TiposPagPermitidos> getTiposPagPermitidosList() {
        return tiposPagPermitidosList;
    }

    public void setTiposPagPermitidosList(List<TiposPagPermitidos> tiposPagPermitidosList) {
        this.tiposPagPermitidosList = tiposPagPermitidosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itfvId != null ? itfvId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItensFormaVencimento)) {
            return false;
        }
        ItensFormaVencimento other = (ItensFormaVencimento) object;
        if ((this.itfvId == null && other.itfvId != null) || (this.itfvId != null && !this.itfvId.equals(other.itfvId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.ItensFormaVencimento[ itfvId=" + itfvId + " ]";
    }
    
}
