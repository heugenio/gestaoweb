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
@Table(name = "ITENS_REDUCAO_Z")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ItensReducaoZ.findAll", query = "SELECT i FROM ItensReducaoZ i"),
    @NamedQuery(name = "ItensReducaoZ.findByItrzId", query = "SELECT i FROM ItensReducaoZ i WHERE i.itrzId = :itrzId"),
    @NamedQuery(name = "ItensReducaoZ.findByItrzAliquota", query = "SELECT i FROM ItensReducaoZ i WHERE i.itrzAliquota = :itrzAliquota"),
    @NamedQuery(name = "ItensReducaoZ.findByItrzContadorReinicioOperacao", query = "SELECT i FROM ItensReducaoZ i WHERE i.itrzContadorReinicioOperacao = :itrzContadorReinicioOperacao"),
    @NamedQuery(name = "ItensReducaoZ.findByItrzContadorReducaoZ", query = "SELECT i FROM ItensReducaoZ i WHERE i.itrzContadorReducaoZ = :itrzContadorReducaoZ"),
    @NamedQuery(name = "ItensReducaoZ.findByItrzNumDocumentoInicial", query = "SELECT i FROM ItensReducaoZ i WHERE i.itrzNumDocumentoInicial = :itrzNumDocumentoInicial"),
    @NamedQuery(name = "ItensReducaoZ.findByItrzNumDocumentoFinal", query = "SELECT i FROM ItensReducaoZ i WHERE i.itrzNumDocumentoFinal = :itrzNumDocumentoFinal"),
    @NamedQuery(name = "ItensReducaoZ.findByItrzValGrandeTotalInicial", query = "SELECT i FROM ItensReducaoZ i WHERE i.itrzValGrandeTotalInicial = :itrzValGrandeTotalInicial"),
    @NamedQuery(name = "ItensReducaoZ.findByItrzValGrandeTotalFinal", query = "SELECT i FROM ItensReducaoZ i WHERE i.itrzValGrandeTotalFinal = :itrzValGrandeTotalFinal"),
    @NamedQuery(name = "ItensReducaoZ.findByItrzValVendaBruta", query = "SELECT i FROM ItensReducaoZ i WHERE i.itrzValVendaBruta = :itrzValVendaBruta"),
    @NamedQuery(name = "ItensReducaoZ.findByItrzValCancelaIssqn", query = "SELECT i FROM ItensReducaoZ i WHERE i.itrzValCancelaIssqn = :itrzValCancelaIssqn"),
    @NamedQuery(name = "ItensReducaoZ.findByItrzValCancelaIcms", query = "SELECT i FROM ItensReducaoZ i WHERE i.itrzValCancelaIcms = :itrzValCancelaIcms"),
    @NamedQuery(name = "ItensReducaoZ.findByItrzValCancelaRegistrado", query = "SELECT i FROM ItensReducaoZ i WHERE i.itrzValCancelaRegistrado = :itrzValCancelaRegistrado"),
    @NamedQuery(name = "ItensReducaoZ.findByItrzValDescRegOperIssqn", query = "SELECT i FROM ItensReducaoZ i WHERE i.itrzValDescRegOperIssqn = :itrzValDescRegOperIssqn"),
    @NamedQuery(name = "ItensReducaoZ.findByItrzValDescRegOperIcms", query = "SELECT i FROM ItensReducaoZ i WHERE i.itrzValDescRegOperIcms = :itrzValDescRegOperIcms"),
    @NamedQuery(name = "ItensReducaoZ.findByItrzValDescRegistrado", query = "SELECT i FROM ItensReducaoZ i WHERE i.itrzValDescRegistrado = :itrzValDescRegistrado"),
    @NamedQuery(name = "ItensReducaoZ.findByItrzValAcrescimoRefIssqn", query = "SELECT i FROM ItensReducaoZ i WHERE i.itrzValAcrescimoRefIssqn = :itrzValAcrescimoRefIssqn"),
    @NamedQuery(name = "ItensReducaoZ.findByItrzValAcrescimoRefIcms", query = "SELECT i FROM ItensReducaoZ i WHERE i.itrzValAcrescimoRefIcms = :itrzValAcrescimoRefIcms"),
    @NamedQuery(name = "ItensReducaoZ.findByItrzValAcrescimoRegistrado", query = "SELECT i FROM ItensReducaoZ i WHERE i.itrzValAcrescimoRegistrado = :itrzValAcrescimoRegistrado"),
    @NamedQuery(name = "ItensReducaoZ.findByItrzValServTributadoIssqn", query = "SELECT i FROM ItensReducaoZ i WHERE i.itrzValServTributadoIssqn = :itrzValServTributadoIssqn"),
    @NamedQuery(name = "ItensReducaoZ.findByItrzValVendaLiquida", query = "SELECT i FROM ItensReducaoZ i WHERE i.itrzValVendaLiquida = :itrzValVendaLiquida"),
    @NamedQuery(name = "ItensReducaoZ.findByItrzValBaseCalculoIcms", query = "SELECT i FROM ItensReducaoZ i WHERE i.itrzValBaseCalculoIcms = :itrzValBaseCalculoIcms"),
    @NamedQuery(name = "ItensReducaoZ.findByItrzValIcms", query = "SELECT i FROM ItensReducaoZ i WHERE i.itrzValIcms = :itrzValIcms"),
    @NamedQuery(name = "ItensReducaoZ.findByItrzValIssqn", query = "SELECT i FROM ItensReducaoZ i WHERE i.itrzValIssqn = :itrzValIssqn"),
    @NamedQuery(name = "ItensReducaoZ.findByItrzValSaidaIsenta", query = "SELECT i FROM ItensReducaoZ i WHERE i.itrzValSaidaIsenta = :itrzValSaidaIsenta"),
    @NamedQuery(name = "ItensReducaoZ.findByItrzValSdNIncidTributIcms", query = "SELECT i FROM ItensReducaoZ i WHERE i.itrzValSdNIncidTributIcms = :itrzValSdNIncidTributIcms"),
    @NamedQuery(name = "ItensReducaoZ.findByItrzValSdMercadoriaStIcms", query = "SELECT i FROM ItensReducaoZ i WHERE i.itrzValSdMercadoriaStIcms = :itrzValSdMercadoriaStIcms"),
    @NamedQuery(name = "ItensReducaoZ.findByItrzCodObservacao", query = "SELECT i FROM ItensReducaoZ i WHERE i.itrzCodObservacao = :itrzCodObservacao"),
    @NamedQuery(name = "ItensReducaoZ.findByItrzLastupdate", query = "SELECT i FROM ItensReducaoZ i WHERE i.itrzLastupdate = :itrzLastupdate")})
public class ItensReducaoZ implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ITRZ_ID")
    private String itrzId;
    @Column(name = "ITRZ_ALIQUOTA")
    private String itrzAliquota;
    @Column(name = "ITRZ_CONTADOR_REINICIO_OPERACAO")
    private String itrzContadorReinicioOperacao;
    @Column(name = "ITRZ_CONTADOR_REDUCAO_Z")
    private String itrzContadorReducaoZ;
    @Column(name = "ITRZ_NUM_DOCUMENTO_INICIAL")
    private String itrzNumDocumentoInicial;
    @Column(name = "ITRZ_NUM_DOCUMENTO_FINAL")
    private String itrzNumDocumentoFinal;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "ITRZ_VAL_GRANDE_TOTAL_INICIAL")
    private BigDecimal itrzValGrandeTotalInicial;
    @Basic(optional = false)
    @Column(name = "ITRZ_VAL_GRANDE_TOTAL_FINAL")
    private BigDecimal itrzValGrandeTotalFinal;
    @Basic(optional = false)
    @Column(name = "ITRZ_VAL_VENDA_BRUTA")
    private BigDecimal itrzValVendaBruta;
    @Basic(optional = false)
    @Column(name = "ITRZ_VAL_CANCELA_ISSQN")
    private BigDecimal itrzValCancelaIssqn;
    @Basic(optional = false)
    @Column(name = "ITRZ_VAL_CANCELA_ICMS")
    private BigDecimal itrzValCancelaIcms;
    @Basic(optional = false)
    @Column(name = "ITRZ_VAL_CANCELA_REGISTRADO")
    private BigDecimal itrzValCancelaRegistrado;
    @Basic(optional = false)
    @Column(name = "ITRZ_VAL_DESC_REG_OPER_ISSQN")
    private BigDecimal itrzValDescRegOperIssqn;
    @Basic(optional = false)
    @Column(name = "ITRZ_VAL_DESC_REG_OPER_ICMS")
    private BigDecimal itrzValDescRegOperIcms;
    @Basic(optional = false)
    @Column(name = "ITRZ_VAL_DESC_REGISTRADO")
    private BigDecimal itrzValDescRegistrado;
    @Basic(optional = false)
    @Column(name = "ITRZ_VAL_ACRESCIMO_REF_ISSQN")
    private BigDecimal itrzValAcrescimoRefIssqn;
    @Basic(optional = false)
    @Column(name = "ITRZ_VAL_ACRESCIMO_REF_ICMS")
    private BigDecimal itrzValAcrescimoRefIcms;
    @Basic(optional = false)
    @Column(name = "ITRZ_VAL_ACRESCIMO_REGISTRADO")
    private BigDecimal itrzValAcrescimoRegistrado;
    @Basic(optional = false)
    @Column(name = "ITRZ_VAL_SERV_TRIBUTADO_ISSQN")
    private BigDecimal itrzValServTributadoIssqn;
    @Basic(optional = false)
    @Column(name = "ITRZ_VAL_VENDA_LIQUIDA")
    private BigDecimal itrzValVendaLiquida;
    @Basic(optional = false)
    @Column(name = "ITRZ_VAL_BASE_CALCULO_ICMS")
    private BigDecimal itrzValBaseCalculoIcms;
    @Basic(optional = false)
    @Column(name = "ITRZ_VAL_ICMS")
    private BigDecimal itrzValIcms;
    @Basic(optional = false)
    @Column(name = "ITRZ_VAL_ISSQN")
    private BigDecimal itrzValIssqn;
    @Basic(optional = false)
    @Column(name = "ITRZ_VAL_SAIDA_ISENTA")
    private BigDecimal itrzValSaidaIsenta;
    @Basic(optional = false)
    @Column(name = "ITRZ_VAL_SD_N_INCID_TRIBUT_ICMS")
    private BigDecimal itrzValSdNIncidTributIcms;
    @Basic(optional = false)
    @Column(name = "ITRZ_VAL_SD_MERCADORIA_ST_ICMS")
    private BigDecimal itrzValSdMercadoriaStIcms;
    @Column(name = "ITRZ_COD_OBSERVACAO")
    private String itrzCodObservacao;
    @Column(name = "ITRZ_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date itrzLastupdate;
    @JoinColumn(name = "CFOP_ID", referencedColumnName = "CFOP_ID")
    @ManyToOne
    private Cfop cfopId;
    @JoinColumn(name = "RDCZ_ID", referencedColumnName = "RDCZ_ID")
    @ManyToOne
    private ReducaoZ rdczId;

    public ItensReducaoZ() {
    }

    public ItensReducaoZ(String itrzId) {
        this.itrzId = itrzId;
    }

    public ItensReducaoZ(String itrzId, BigDecimal itrzValGrandeTotalInicial, BigDecimal itrzValGrandeTotalFinal, BigDecimal itrzValVendaBruta, BigDecimal itrzValCancelaIssqn, BigDecimal itrzValCancelaIcms, BigDecimal itrzValCancelaRegistrado, BigDecimal itrzValDescRegOperIssqn, BigDecimal itrzValDescRegOperIcms, BigDecimal itrzValDescRegistrado, BigDecimal itrzValAcrescimoRefIssqn, BigDecimal itrzValAcrescimoRefIcms, BigDecimal itrzValAcrescimoRegistrado, BigDecimal itrzValServTributadoIssqn, BigDecimal itrzValVendaLiquida, BigDecimal itrzValBaseCalculoIcms, BigDecimal itrzValIcms, BigDecimal itrzValIssqn, BigDecimal itrzValSaidaIsenta, BigDecimal itrzValSdNIncidTributIcms, BigDecimal itrzValSdMercadoriaStIcms) {
        this.itrzId = itrzId;
        this.itrzValGrandeTotalInicial = itrzValGrandeTotalInicial;
        this.itrzValGrandeTotalFinal = itrzValGrandeTotalFinal;
        this.itrzValVendaBruta = itrzValVendaBruta;
        this.itrzValCancelaIssqn = itrzValCancelaIssqn;
        this.itrzValCancelaIcms = itrzValCancelaIcms;
        this.itrzValCancelaRegistrado = itrzValCancelaRegistrado;
        this.itrzValDescRegOperIssqn = itrzValDescRegOperIssqn;
        this.itrzValDescRegOperIcms = itrzValDescRegOperIcms;
        this.itrzValDescRegistrado = itrzValDescRegistrado;
        this.itrzValAcrescimoRefIssqn = itrzValAcrescimoRefIssqn;
        this.itrzValAcrescimoRefIcms = itrzValAcrescimoRefIcms;
        this.itrzValAcrescimoRegistrado = itrzValAcrescimoRegistrado;
        this.itrzValServTributadoIssqn = itrzValServTributadoIssqn;
        this.itrzValVendaLiquida = itrzValVendaLiquida;
        this.itrzValBaseCalculoIcms = itrzValBaseCalculoIcms;
        this.itrzValIcms = itrzValIcms;
        this.itrzValIssqn = itrzValIssqn;
        this.itrzValSaidaIsenta = itrzValSaidaIsenta;
        this.itrzValSdNIncidTributIcms = itrzValSdNIncidTributIcms;
        this.itrzValSdMercadoriaStIcms = itrzValSdMercadoriaStIcms;
    }

    public String getItrzId() {
        return itrzId;
    }

    public void setItrzId(String itrzId) {
        this.itrzId = itrzId;
    }

    public String getItrzAliquota() {
        return itrzAliquota;
    }

    public void setItrzAliquota(String itrzAliquota) {
        this.itrzAliquota = itrzAliquota;
    }

    public String getItrzContadorReinicioOperacao() {
        return itrzContadorReinicioOperacao;
    }

    public void setItrzContadorReinicioOperacao(String itrzContadorReinicioOperacao) {
        this.itrzContadorReinicioOperacao = itrzContadorReinicioOperacao;
    }

    public String getItrzContadorReducaoZ() {
        return itrzContadorReducaoZ;
    }

    public void setItrzContadorReducaoZ(String itrzContadorReducaoZ) {
        this.itrzContadorReducaoZ = itrzContadorReducaoZ;
    }

    public String getItrzNumDocumentoInicial() {
        return itrzNumDocumentoInicial;
    }

    public void setItrzNumDocumentoInicial(String itrzNumDocumentoInicial) {
        this.itrzNumDocumentoInicial = itrzNumDocumentoInicial;
    }

    public String getItrzNumDocumentoFinal() {
        return itrzNumDocumentoFinal;
    }

    public void setItrzNumDocumentoFinal(String itrzNumDocumentoFinal) {
        this.itrzNumDocumentoFinal = itrzNumDocumentoFinal;
    }

    public BigDecimal getItrzValGrandeTotalInicial() {
        return itrzValGrandeTotalInicial;
    }

    public void setItrzValGrandeTotalInicial(BigDecimal itrzValGrandeTotalInicial) {
        this.itrzValGrandeTotalInicial = itrzValGrandeTotalInicial;
    }

    public BigDecimal getItrzValGrandeTotalFinal() {
        return itrzValGrandeTotalFinal;
    }

    public void setItrzValGrandeTotalFinal(BigDecimal itrzValGrandeTotalFinal) {
        this.itrzValGrandeTotalFinal = itrzValGrandeTotalFinal;
    }

    public BigDecimal getItrzValVendaBruta() {
        return itrzValVendaBruta;
    }

    public void setItrzValVendaBruta(BigDecimal itrzValVendaBruta) {
        this.itrzValVendaBruta = itrzValVendaBruta;
    }

    public BigDecimal getItrzValCancelaIssqn() {
        return itrzValCancelaIssqn;
    }

    public void setItrzValCancelaIssqn(BigDecimal itrzValCancelaIssqn) {
        this.itrzValCancelaIssqn = itrzValCancelaIssqn;
    }

    public BigDecimal getItrzValCancelaIcms() {
        return itrzValCancelaIcms;
    }

    public void setItrzValCancelaIcms(BigDecimal itrzValCancelaIcms) {
        this.itrzValCancelaIcms = itrzValCancelaIcms;
    }

    public BigDecimal getItrzValCancelaRegistrado() {
        return itrzValCancelaRegistrado;
    }

    public void setItrzValCancelaRegistrado(BigDecimal itrzValCancelaRegistrado) {
        this.itrzValCancelaRegistrado = itrzValCancelaRegistrado;
    }

    public BigDecimal getItrzValDescRegOperIssqn() {
        return itrzValDescRegOperIssqn;
    }

    public void setItrzValDescRegOperIssqn(BigDecimal itrzValDescRegOperIssqn) {
        this.itrzValDescRegOperIssqn = itrzValDescRegOperIssqn;
    }

    public BigDecimal getItrzValDescRegOperIcms() {
        return itrzValDescRegOperIcms;
    }

    public void setItrzValDescRegOperIcms(BigDecimal itrzValDescRegOperIcms) {
        this.itrzValDescRegOperIcms = itrzValDescRegOperIcms;
    }

    public BigDecimal getItrzValDescRegistrado() {
        return itrzValDescRegistrado;
    }

    public void setItrzValDescRegistrado(BigDecimal itrzValDescRegistrado) {
        this.itrzValDescRegistrado = itrzValDescRegistrado;
    }

    public BigDecimal getItrzValAcrescimoRefIssqn() {
        return itrzValAcrescimoRefIssqn;
    }

    public void setItrzValAcrescimoRefIssqn(BigDecimal itrzValAcrescimoRefIssqn) {
        this.itrzValAcrescimoRefIssqn = itrzValAcrescimoRefIssqn;
    }

    public BigDecimal getItrzValAcrescimoRefIcms() {
        return itrzValAcrescimoRefIcms;
    }

    public void setItrzValAcrescimoRefIcms(BigDecimal itrzValAcrescimoRefIcms) {
        this.itrzValAcrescimoRefIcms = itrzValAcrescimoRefIcms;
    }

    public BigDecimal getItrzValAcrescimoRegistrado() {
        return itrzValAcrescimoRegistrado;
    }

    public void setItrzValAcrescimoRegistrado(BigDecimal itrzValAcrescimoRegistrado) {
        this.itrzValAcrescimoRegistrado = itrzValAcrescimoRegistrado;
    }

    public BigDecimal getItrzValServTributadoIssqn() {
        return itrzValServTributadoIssqn;
    }

    public void setItrzValServTributadoIssqn(BigDecimal itrzValServTributadoIssqn) {
        this.itrzValServTributadoIssqn = itrzValServTributadoIssqn;
    }

    public BigDecimal getItrzValVendaLiquida() {
        return itrzValVendaLiquida;
    }

    public void setItrzValVendaLiquida(BigDecimal itrzValVendaLiquida) {
        this.itrzValVendaLiquida = itrzValVendaLiquida;
    }

    public BigDecimal getItrzValBaseCalculoIcms() {
        return itrzValBaseCalculoIcms;
    }

    public void setItrzValBaseCalculoIcms(BigDecimal itrzValBaseCalculoIcms) {
        this.itrzValBaseCalculoIcms = itrzValBaseCalculoIcms;
    }

    public BigDecimal getItrzValIcms() {
        return itrzValIcms;
    }

    public void setItrzValIcms(BigDecimal itrzValIcms) {
        this.itrzValIcms = itrzValIcms;
    }

    public BigDecimal getItrzValIssqn() {
        return itrzValIssqn;
    }

    public void setItrzValIssqn(BigDecimal itrzValIssqn) {
        this.itrzValIssqn = itrzValIssqn;
    }

    public BigDecimal getItrzValSaidaIsenta() {
        return itrzValSaidaIsenta;
    }

    public void setItrzValSaidaIsenta(BigDecimal itrzValSaidaIsenta) {
        this.itrzValSaidaIsenta = itrzValSaidaIsenta;
    }

    public BigDecimal getItrzValSdNIncidTributIcms() {
        return itrzValSdNIncidTributIcms;
    }

    public void setItrzValSdNIncidTributIcms(BigDecimal itrzValSdNIncidTributIcms) {
        this.itrzValSdNIncidTributIcms = itrzValSdNIncidTributIcms;
    }

    public BigDecimal getItrzValSdMercadoriaStIcms() {
        return itrzValSdMercadoriaStIcms;
    }

    public void setItrzValSdMercadoriaStIcms(BigDecimal itrzValSdMercadoriaStIcms) {
        this.itrzValSdMercadoriaStIcms = itrzValSdMercadoriaStIcms;
    }

    public String getItrzCodObservacao() {
        return itrzCodObservacao;
    }

    public void setItrzCodObservacao(String itrzCodObservacao) {
        this.itrzCodObservacao = itrzCodObservacao;
    }

    public Date getItrzLastupdate() {
        return itrzLastupdate;
    }

    public void setItrzLastupdate(Date itrzLastupdate) {
        this.itrzLastupdate = itrzLastupdate;
    }

    public Cfop getCfopId() {
        return cfopId;
    }

    public void setCfopId(Cfop cfopId) {
        this.cfopId = cfopId;
    }

    public ReducaoZ getRdczId() {
        return rdczId;
    }

    public void setRdczId(ReducaoZ rdczId) {
        this.rdczId = rdczId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itrzId != null ? itrzId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItensReducaoZ)) {
            return false;
        }
        ItensReducaoZ other = (ItensReducaoZ) object;
        if ((this.itrzId == null && other.itrzId != null) || (this.itrzId != null && !this.itrzId.equals(other.itrzId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.ItensReducaoZ[ itrzId=" + itrzId + " ]";
    }
    
}
