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
@Table(name = "NEGOCIACOES_PEDIDOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "NegociacoesPedidos.findAll", query = "SELECT n FROM NegociacoesPedidos n"),
    @NamedQuery(name = "NegociacoesPedidos.findByNgpdId", query = "SELECT n FROM NegociacoesPedidos n WHERE n.ngpdId = :ngpdId"),
    @NamedQuery(name = "NegociacoesPedidos.findByNgpdDiasVencimento", query = "SELECT n FROM NegociacoesPedidos n WHERE n.ngpdDiasVencimento = :ngpdDiasVencimento"),
    @NamedQuery(name = "NegociacoesPedidos.findByNgpdDataVencimento", query = "SELECT n FROM NegociacoesPedidos n WHERE n.ngpdDataVencimento = :ngpdDataVencimento"),
    @NamedQuery(name = "NegociacoesPedidos.findByNgpdPercVencimento", query = "SELECT n FROM NegociacoesPedidos n WHERE n.ngpdPercVencimento = :ngpdPercVencimento"),
    @NamedQuery(name = "NegociacoesPedidos.findByNgpdVlrParcela", query = "SELECT n FROM NegociacoesPedidos n WHERE n.ngpdVlrParcela = :ngpdVlrParcela"),
    @NamedQuery(name = "NegociacoesPedidos.findByNgpdTipoPagamento", query = "SELECT n FROM NegociacoesPedidos n WHERE n.ngpdTipoPagamento = :ngpdTipoPagamento"),
    @NamedQuery(name = "NegociacoesPedidos.findByNgpdFixaVcto", query = "SELECT n FROM NegociacoesPedidos n WHERE n.ngpdFixaVcto = :ngpdFixaVcto"),
    @NamedQuery(name = "NegociacoesPedidos.findByNgpdLastupdate", query = "SELECT n FROM NegociacoesPedidos n WHERE n.ngpdLastupdate = :ngpdLastupdate"),
    @NamedQuery(name = "NegociacoesPedidos.findByNgpdPgAntecipado", query = "SELECT n FROM NegociacoesPedidos n WHERE n.ngpdPgAntecipado = :ngpdPgAntecipado")})
public class NegociacoesPedidos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NGPD_ID")
    private String ngpdId;
    @Column(name = "NGPD_DIAS_VENCIMENTO")
    private Integer ngpdDiasVencimento;
    @Column(name = "NGPD_DATA_VENCIMENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngpdDataVencimento;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "NGPD_PERC_VENCIMENTO")
    private BigDecimal ngpdPercVencimento;
    @Basic(optional = false)
    @Column(name = "NGPD_VLR_PARCELA")
    private BigDecimal ngpdVlrParcela;
    @Column(name = "NGPD_TIPO_PAGAMENTO")
    private String ngpdTipoPagamento;
    @Column(name = "NGPD_FIXA_VCTO")
    private String ngpdFixaVcto;
    @Column(name = "NGPD_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngpdLastupdate;
    @Column(name = "NGPD_PG_ANTECIPADO")
    private String ngpdPgAntecipado;
    @JoinColumn(name = "COFR_ID", referencedColumnName = "COFR_ID")
    @ManyToOne
    private Cofres cofrId;
    @JoinColumn(name = "DCFS_ID", referencedColumnName = "DCFS_ID")
    @ManyToOne
    private DocumentosFiscais dcfsId;
    @JoinColumn(name = "ITFV_ID", referencedColumnName = "ITFV_ID")
    @ManyToOne
    private ItensFormaVencimento itfvId;
    @JoinColumn(name = "PDDS_ID", referencedColumnName = "PDDS_ID")
    @ManyToOne
    private Pedidos pddsId;

    public NegociacoesPedidos() {
    }

    public NegociacoesPedidos(String ngpdId) {
        this.ngpdId = ngpdId;
    }

    public NegociacoesPedidos(String ngpdId, BigDecimal ngpdPercVencimento, BigDecimal ngpdVlrParcela) {
        this.ngpdId = ngpdId;
        this.ngpdPercVencimento = ngpdPercVencimento;
        this.ngpdVlrParcela = ngpdVlrParcela;
    }

    public String getNgpdId() {
        return ngpdId;
    }

    public void setNgpdId(String ngpdId) {
        this.ngpdId = ngpdId;
    }

    public Integer getNgpdDiasVencimento() {
        return ngpdDiasVencimento;
    }

    public void setNgpdDiasVencimento(Integer ngpdDiasVencimento) {
        this.ngpdDiasVencimento = ngpdDiasVencimento;
    }

    public Date getNgpdDataVencimento() {
        return ngpdDataVencimento;
    }

    public void setNgpdDataVencimento(Date ngpdDataVencimento) {
        this.ngpdDataVencimento = ngpdDataVencimento;
    }

    public BigDecimal getNgpdPercVencimento() {
        return ngpdPercVencimento;
    }

    public void setNgpdPercVencimento(BigDecimal ngpdPercVencimento) {
        this.ngpdPercVencimento = ngpdPercVencimento;
    }

    public BigDecimal getNgpdVlrParcela() {
        return ngpdVlrParcela;
    }

    public void setNgpdVlrParcela(BigDecimal ngpdVlrParcela) {
        this.ngpdVlrParcela = ngpdVlrParcela;
    }

    public String getNgpdTipoPagamento() {
        return ngpdTipoPagamento;
    }

    public void setNgpdTipoPagamento(String ngpdTipoPagamento) {
        this.ngpdTipoPagamento = ngpdTipoPagamento;
    }

    public String getNgpdFixaVcto() {
        return ngpdFixaVcto;
    }

    public void setNgpdFixaVcto(String ngpdFixaVcto) {
        this.ngpdFixaVcto = ngpdFixaVcto;
    }

    public Date getNgpdLastupdate() {
        return ngpdLastupdate;
    }

    public void setNgpdLastupdate(Date ngpdLastupdate) {
        this.ngpdLastupdate = ngpdLastupdate;
    }

    public String getNgpdPgAntecipado() {
        return ngpdPgAntecipado;
    }

    public void setNgpdPgAntecipado(String ngpdPgAntecipado) {
        this.ngpdPgAntecipado = ngpdPgAntecipado;
    }

    public Cofres getCofrId() {
        return cofrId;
    }

    public void setCofrId(Cofres cofrId) {
        this.cofrId = cofrId;
    }

    public DocumentosFiscais getDcfsId() {
        return dcfsId;
    }

    public void setDcfsId(DocumentosFiscais dcfsId) {
        this.dcfsId = dcfsId;
    }

    public ItensFormaVencimento getItfvId() {
        return itfvId;
    }

    public void setItfvId(ItensFormaVencimento itfvId) {
        this.itfvId = itfvId;
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
        hash += (ngpdId != null ? ngpdId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NegociacoesPedidos)) {
            return false;
        }
        NegociacoesPedidos other = (NegociacoesPedidos) object;
        if ((this.ngpdId == null && other.ngpdId != null) || (this.ngpdId != null && !this.ngpdId.equals(other.ngpdId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.NegociacoesPedidos[ ngpdId=" + ngpdId + " ]";
    }
    
}
