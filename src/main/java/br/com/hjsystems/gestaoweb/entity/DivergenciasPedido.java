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
@Table(name = "DIVERGENCIAS_PEDIDO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DivergenciasPedido.findAll", query = "SELECT d FROM DivergenciasPedido d"),
    @NamedQuery(name = "DivergenciasPedido.findByDvpdId", query = "SELECT d FROM DivergenciasPedido d WHERE d.dvpdId = :dvpdId"),
    @NamedQuery(name = "DivergenciasPedido.findByDvpdUsrsId", query = "SELECT d FROM DivergenciasPedido d WHERE d.dvpdUsrsId = :dvpdUsrsId"),
    @NamedQuery(name = "DivergenciasPedido.findByDvpdDataLiberacao", query = "SELECT d FROM DivergenciasPedido d WHERE d.dvpdDataLiberacao = :dvpdDataLiberacao"),
    @NamedQuery(name = "DivergenciasPedido.findByDvpdDataValidade", query = "SELECT d FROM DivergenciasPedido d WHERE d.dvpdDataValidade = :dvpdDataValidade"),
    @NamedQuery(name = "DivergenciasPedido.findByDvpdLastupdate", query = "SELECT d FROM DivergenciasPedido d WHERE d.dvpdLastupdate = :dvpdLastupdate"),
    @NamedQuery(name = "DivergenciasPedido.findByDvpdVlr", query = "SELECT d FROM DivergenciasPedido d WHERE d.dvpdVlr = :dvpdVlr"),
    @NamedQuery(name = "DivergenciasPedido.findByDvpdVlrPermitido", query = "SELECT d FROM DivergenciasPedido d WHERE d.dvpdVlrPermitido = :dvpdVlrPermitido"),
    @NamedQuery(name = "DivergenciasPedido.findByDvpdVlrPermitidoMax", query = "SELECT d FROM DivergenciasPedido d WHERE d.dvpdVlrPermitidoMax = :dvpdVlrPermitidoMax"),
    @NamedQuery(name = "DivergenciasPedido.findByRqscId", query = "SELECT d FROM DivergenciasPedido d WHERE d.rqscId = :rqscId")})
public class DivergenciasPedido implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DVPD_ID")
    private String dvpdId;
    @Column(name = "DVPD_USRS_ID")
    private String dvpdUsrsId;
    @Column(name = "DVPD_DATA_LIBERACAO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dvpdDataLiberacao;
    @Column(name = "DVPD_DATA_VALIDADE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dvpdDataValidade;
    @Column(name = "DVPD_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dvpdLastupdate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "DVPD_VLR")
    private BigDecimal dvpdVlr;
    @Column(name = "DVPD_VLR_PERMITIDO")
    private BigDecimal dvpdVlrPermitido;
    @Column(name = "DVPD_VLR_PERMITIDO_MAX")
    private BigDecimal dvpdVlrPermitidoMax;
    @Column(name = "RQSC_ID")
    private String rqscId;
    @JoinColumn(name = "ITPD_ID", referencedColumnName = "ITPD_ID")
    @ManyToOne
    private ItensPedidos itpdId;
    @JoinColumn(name = "ITRQ_ID", referencedColumnName = "ITRQ_ID")
    @ManyToOne
    private ItensRequisicoes itrqId;
    @JoinColumn(name = "MTDV_ID", referencedColumnName = "MTDV_ID")
    @ManyToOne
    private MotivosDivergencias mtdvId;
    @JoinColumn(name = "ORSV_ID", referencedColumnName = "ORSV_ID")
    @ManyToOne
    private OrdemServico orsvId;
    @JoinColumn(name = "PDDS_ID", referencedColumnName = "PDDS_ID")
    @ManyToOne
    private Pedidos pddsId;

    public DivergenciasPedido() {
    }

    public DivergenciasPedido(String dvpdId) {
        this.dvpdId = dvpdId;
    }

    public String getDvpdId() {
        return dvpdId;
    }

    public void setDvpdId(String dvpdId) {
        this.dvpdId = dvpdId;
    }

    public String getDvpdUsrsId() {
        return dvpdUsrsId;
    }

    public void setDvpdUsrsId(String dvpdUsrsId) {
        this.dvpdUsrsId = dvpdUsrsId;
    }

    public Date getDvpdDataLiberacao() {
        return dvpdDataLiberacao;
    }

    public void setDvpdDataLiberacao(Date dvpdDataLiberacao) {
        this.dvpdDataLiberacao = dvpdDataLiberacao;
    }

    public Date getDvpdDataValidade() {
        return dvpdDataValidade;
    }

    public void setDvpdDataValidade(Date dvpdDataValidade) {
        this.dvpdDataValidade = dvpdDataValidade;
    }

    public Date getDvpdLastupdate() {
        return dvpdLastupdate;
    }

    public void setDvpdLastupdate(Date dvpdLastupdate) {
        this.dvpdLastupdate = dvpdLastupdate;
    }

    public BigDecimal getDvpdVlr() {
        return dvpdVlr;
    }

    public void setDvpdVlr(BigDecimal dvpdVlr) {
        this.dvpdVlr = dvpdVlr;
    }

    public BigDecimal getDvpdVlrPermitido() {
        return dvpdVlrPermitido;
    }

    public void setDvpdVlrPermitido(BigDecimal dvpdVlrPermitido) {
        this.dvpdVlrPermitido = dvpdVlrPermitido;
    }

    public BigDecimal getDvpdVlrPermitidoMax() {
        return dvpdVlrPermitidoMax;
    }

    public void setDvpdVlrPermitidoMax(BigDecimal dvpdVlrPermitidoMax) {
        this.dvpdVlrPermitidoMax = dvpdVlrPermitidoMax;
    }

    public String getRqscId() {
        return rqscId;
    }

    public void setRqscId(String rqscId) {
        this.rqscId = rqscId;
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

    public MotivosDivergencias getMtdvId() {
        return mtdvId;
    }

    public void setMtdvId(MotivosDivergencias mtdvId) {
        this.mtdvId = mtdvId;
    }

    public OrdemServico getOrsvId() {
        return orsvId;
    }

    public void setOrsvId(OrdemServico orsvId) {
        this.orsvId = orsvId;
    }

    public Pedidos getPddsId() {
        return pddsId;
    }

    public void setPddsId(Pedidos pddsId) {
        this.pddsId = pddsId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dvpdId != null ? dvpdId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DivergenciasPedido)) {
            return false;
        }
        DivergenciasPedido other = (DivergenciasPedido) object;
        if ((this.dvpdId == null && other.dvpdId != null) || (this.dvpdId != null && !this.dvpdId.equals(other.dvpdId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.DivergenciasPedido[ dvpdId=" + dvpdId + " ]";
    }
    
}
