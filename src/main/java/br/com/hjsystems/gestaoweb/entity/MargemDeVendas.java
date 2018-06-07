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
@Table(name = "MARGEM_DE_VENDAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MargemDeVendas.findAll", query = "SELECT m FROM MargemDeVendas m"),
    @NamedQuery(name = "MargemDeVendas.findByMgvdId", query = "SELECT m FROM MargemDeVendas m WHERE m.mgvdId = :mgvdId"),
    @NamedQuery(name = "MargemDeVendas.findByMgvdNome", query = "SELECT m FROM MargemDeVendas m WHERE m.mgvdNome = :mgvdNome"),
    @NamedQuery(name = "MargemDeVendas.findByMgvdTipoPreco", query = "SELECT m FROM MargemDeVendas m WHERE m.mgvdTipoPreco = :mgvdTipoPreco"),
    @NamedQuery(name = "MargemDeVendas.findByMgvdIdxMarkup", query = "SELECT m FROM MargemDeVendas m WHERE m.mgvdIdxMarkup = :mgvdIdxMarkup"),
    @NamedQuery(name = "MargemDeVendas.findByMgvdIpi", query = "SELECT m FROM MargemDeVendas m WHERE m.mgvdIpi = :mgvdIpi"),
    @NamedQuery(name = "MargemDeVendas.findByMgvdFrete", query = "SELECT m FROM MargemDeVendas m WHERE m.mgvdFrete = :mgvdFrete"),
    @NamedQuery(name = "MargemDeVendas.findByMgvdDifIcms", query = "SELECT m FROM MargemDeVendas m WHERE m.mgvdDifIcms = :mgvdDifIcms"),
    @NamedQuery(name = "MargemDeVendas.findByMgvdCreditoPisCofins", query = "SELECT m FROM MargemDeVendas m WHERE m.mgvdCreditoPisCofins = :mgvdCreditoPisCofins"),
    @NamedQuery(name = "MargemDeVendas.findByMgvdComissao", query = "SELECT m FROM MargemDeVendas m WHERE m.mgvdComissao = :mgvdComissao"),
    @NamedQuery(name = "MargemDeVendas.findByMgvdLastupdate", query = "SELECT m FROM MargemDeVendas m WHERE m.mgvdLastupdate = :mgvdLastupdate")})
public class MargemDeVendas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MGVD_ID")
    private String mgvdId;
    @Basic(optional = false)
    @Column(name = "MGVD_NOME")
    private String mgvdNome;
    @Basic(optional = false)
    @Column(name = "MGVD_TIPO_PRECO")
    private String mgvdTipoPreco;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "MGVD_IDX_MARKUP")
    private BigDecimal mgvdIdxMarkup;
    @Column(name = "MGVD_IPI")
    private BigDecimal mgvdIpi;
    @Column(name = "MGVD_FRETE")
    private BigDecimal mgvdFrete;
    @Column(name = "MGVD_DIF_ICMS")
    private BigDecimal mgvdDifIcms;
    @Column(name = "MGVD_CREDITO_PIS_COFINS")
    private BigDecimal mgvdCreditoPisCofins;
    @Column(name = "MGVD_COMISSAO")
    private BigDecimal mgvdComissao;
    @Column(name = "MGVD_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mgvdLastupdate;

    public MargemDeVendas() {
    }

    public MargemDeVendas(String mgvdId) {
        this.mgvdId = mgvdId;
    }

    public MargemDeVendas(String mgvdId, String mgvdNome, String mgvdTipoPreco, BigDecimal mgvdIdxMarkup) {
        this.mgvdId = mgvdId;
        this.mgvdNome = mgvdNome;
        this.mgvdTipoPreco = mgvdTipoPreco;
        this.mgvdIdxMarkup = mgvdIdxMarkup;
    }

    public String getMgvdId() {
        return mgvdId;
    }

    public void setMgvdId(String mgvdId) {
        this.mgvdId = mgvdId;
    }

    public String getMgvdNome() {
        return mgvdNome;
    }

    public void setMgvdNome(String mgvdNome) {
        this.mgvdNome = mgvdNome;
    }

    public String getMgvdTipoPreco() {
        return mgvdTipoPreco;
    }

    public void setMgvdTipoPreco(String mgvdTipoPreco) {
        this.mgvdTipoPreco = mgvdTipoPreco;
    }

    public BigDecimal getMgvdIdxMarkup() {
        return mgvdIdxMarkup;
    }

    public void setMgvdIdxMarkup(BigDecimal mgvdIdxMarkup) {
        this.mgvdIdxMarkup = mgvdIdxMarkup;
    }

    public BigDecimal getMgvdIpi() {
        return mgvdIpi;
    }

    public void setMgvdIpi(BigDecimal mgvdIpi) {
        this.mgvdIpi = mgvdIpi;
    }

    public BigDecimal getMgvdFrete() {
        return mgvdFrete;
    }

    public void setMgvdFrete(BigDecimal mgvdFrete) {
        this.mgvdFrete = mgvdFrete;
    }

    public BigDecimal getMgvdDifIcms() {
        return mgvdDifIcms;
    }

    public void setMgvdDifIcms(BigDecimal mgvdDifIcms) {
        this.mgvdDifIcms = mgvdDifIcms;
    }

    public BigDecimal getMgvdCreditoPisCofins() {
        return mgvdCreditoPisCofins;
    }

    public void setMgvdCreditoPisCofins(BigDecimal mgvdCreditoPisCofins) {
        this.mgvdCreditoPisCofins = mgvdCreditoPisCofins;
    }

    public BigDecimal getMgvdComissao() {
        return mgvdComissao;
    }

    public void setMgvdComissao(BigDecimal mgvdComissao) {
        this.mgvdComissao = mgvdComissao;
    }

    public Date getMgvdLastupdate() {
        return mgvdLastupdate;
    }

    public void setMgvdLastupdate(Date mgvdLastupdate) {
        this.mgvdLastupdate = mgvdLastupdate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mgvdId != null ? mgvdId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MargemDeVendas)) {
            return false;
        }
        MargemDeVendas other = (MargemDeVendas) object;
        if ((this.mgvdId == null && other.mgvdId != null) || (this.mgvdId != null && !this.mgvdId.equals(other.mgvdId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.MargemDeVendas[ mgvdId=" + mgvdId + " ]";
    }
    
}
