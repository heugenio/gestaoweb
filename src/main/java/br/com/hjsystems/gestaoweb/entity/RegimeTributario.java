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
@Table(name = "REGIME_TRIBUTARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegimeTributario.findAll", query = "SELECT r FROM RegimeTributario r"),
    @NamedQuery(name = "RegimeTributario.findByRgtrId", query = "SELECT r FROM RegimeTributario r WHERE r.rgtrId = :rgtrId"),
    @NamedQuery(name = "RegimeTributario.findByRgtrRegimeFiscalTributario", query = "SELECT r FROM RegimeTributario r WHERE r.rgtrRegimeFiscalTributario = :rgtrRegimeFiscalTributario"),
    @NamedQuery(name = "RegimeTributario.findByRgtrAliquotaIva", query = "SELECT r FROM RegimeTributario r WHERE r.rgtrAliquotaIva = :rgtrAliquotaIva"),
    @NamedQuery(name = "RegimeTributario.findByRgtrIcms", query = "SELECT r FROM RegimeTributario r WHERE r.rgtrIcms = :rgtrIcms"),
    @NamedQuery(name = "RegimeTributario.findByRgtrReducaoIcms", query = "SELECT r FROM RegimeTributario r WHERE r.rgtrReducaoIcms = :rgtrReducaoIcms"),
    @NamedQuery(name = "RegimeTributario.findByRgTrLASTUPDATE", query = "SELECT r FROM RegimeTributario r WHERE r.rgTrLASTUPDATE = :rgTrLASTUPDATE"),
    @NamedQuery(name = "RegimeTributario.findByRgtrReducaoIcmsSt", query = "SELECT r FROM RegimeTributario r WHERE r.rgtrReducaoIcmsSt = :rgtrReducaoIcmsSt"),
    @NamedQuery(name = "RegimeTributario.findByRgtrVlrPauta", query = "SELECT r FROM RegimeTributario r WHERE r.rgtrVlrPauta = :rgtrVlrPauta"),
    @NamedQuery(name = "RegimeTributario.findByRgtrAliquotaIvaSn", query = "SELECT r FROM RegimeTributario r WHERE r.rgtrAliquotaIvaSn = :rgtrAliquotaIvaSn")})
public class RegimeTributario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "RGTR_ID")
    private String rgtrId;
    @Column(name = "RGTR_REGIME_FISCAL_TRIBUTARIO")
    private String rgtrRegimeFiscalTributario;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "RGTR_ALIQUOTA_IVA")
    private BigDecimal rgtrAliquotaIva;
    @Basic(optional = false)
    @Column(name = "RGTR_ICMS")
    private BigDecimal rgtrIcms;
    @Basic(optional = false)
    @Column(name = "RGTR_REDUCAO_ICMS")
    private BigDecimal rgtrReducaoIcms;
    @Column(name = "RgTr_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rgTrLASTUPDATE;
    @Basic(optional = false)
    @Column(name = "RGTR_REDUCAO_ICMS_ST")
    private BigDecimal rgtrReducaoIcmsSt;
    @Column(name = "RGTR_VLR_PAUTA")
    private BigDecimal rgtrVlrPauta;
    @Column(name = "RGTR_ALIQUOTA_IVA_SN")
    private BigDecimal rgtrAliquotaIvaSn;
    @JoinColumn(name = "ESTA_ID", referencedColumnName = "ESTA_ID")
    @ManyToOne
    private Estados estaId;
    @JoinColumn(name = "NCMS_ID", referencedColumnName = "NCMS_ID")
    @ManyToOne
    private Ncms ncmsId;

    public RegimeTributario() {
    }

    public RegimeTributario(String rgtrId) {
        this.rgtrId = rgtrId;
    }

    public RegimeTributario(String rgtrId, BigDecimal rgtrAliquotaIva, BigDecimal rgtrIcms, BigDecimal rgtrReducaoIcms, BigDecimal rgtrReducaoIcmsSt) {
        this.rgtrId = rgtrId;
        this.rgtrAliquotaIva = rgtrAliquotaIva;
        this.rgtrIcms = rgtrIcms;
        this.rgtrReducaoIcms = rgtrReducaoIcms;
        this.rgtrReducaoIcmsSt = rgtrReducaoIcmsSt;
    }

    public String getRgtrId() {
        return rgtrId;
    }

    public void setRgtrId(String rgtrId) {
        this.rgtrId = rgtrId;
    }

    public String getRgtrRegimeFiscalTributario() {
        return rgtrRegimeFiscalTributario;
    }

    public void setRgtrRegimeFiscalTributario(String rgtrRegimeFiscalTributario) {
        this.rgtrRegimeFiscalTributario = rgtrRegimeFiscalTributario;
    }

    public BigDecimal getRgtrAliquotaIva() {
        return rgtrAliquotaIva;
    }

    public void setRgtrAliquotaIva(BigDecimal rgtrAliquotaIva) {
        this.rgtrAliquotaIva = rgtrAliquotaIva;
    }

    public BigDecimal getRgtrIcms() {
        return rgtrIcms;
    }

    public void setRgtrIcms(BigDecimal rgtrIcms) {
        this.rgtrIcms = rgtrIcms;
    }

    public BigDecimal getRgtrReducaoIcms() {
        return rgtrReducaoIcms;
    }

    public void setRgtrReducaoIcms(BigDecimal rgtrReducaoIcms) {
        this.rgtrReducaoIcms = rgtrReducaoIcms;
    }

    public Date getRgTrLASTUPDATE() {
        return rgTrLASTUPDATE;
    }

    public void setRgTrLASTUPDATE(Date rgTrLASTUPDATE) {
        this.rgTrLASTUPDATE = rgTrLASTUPDATE;
    }

    public BigDecimal getRgtrReducaoIcmsSt() {
        return rgtrReducaoIcmsSt;
    }

    public void setRgtrReducaoIcmsSt(BigDecimal rgtrReducaoIcmsSt) {
        this.rgtrReducaoIcmsSt = rgtrReducaoIcmsSt;
    }

    public BigDecimal getRgtrVlrPauta() {
        return rgtrVlrPauta;
    }

    public void setRgtrVlrPauta(BigDecimal rgtrVlrPauta) {
        this.rgtrVlrPauta = rgtrVlrPauta;
    }

    public BigDecimal getRgtrAliquotaIvaSn() {
        return rgtrAliquotaIvaSn;
    }

    public void setRgtrAliquotaIvaSn(BigDecimal rgtrAliquotaIvaSn) {
        this.rgtrAliquotaIvaSn = rgtrAliquotaIvaSn;
    }

    public Estados getEstaId() {
        return estaId;
    }

    public void setEstaId(Estados estaId) {
        this.estaId = estaId;
    }

    public Ncms getNcmsId() {
        return ncmsId;
    }

    public void setNcmsId(Ncms ncmsId) {
        this.ncmsId = ncmsId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rgtrId != null ? rgtrId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegimeTributario)) {
            return false;
        }
        RegimeTributario other = (RegimeTributario) object;
        if ((this.rgtrId == null && other.rgtrId != null) || (this.rgtrId != null && !this.rgtrId.equals(other.rgtrId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.RegimeTributario[ rgtrId=" + rgtrId + " ]";
    }
    
}
