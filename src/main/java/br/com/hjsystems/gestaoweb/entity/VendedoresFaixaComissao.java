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
@Table(name = "VENDEDORES_FAIXA_COMISSAO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VendedoresFaixaComissao.findAll", query = "SELECT v FROM VendedoresFaixaComissao v"),
    @NamedQuery(name = "VendedoresFaixaComissao.findByVdfcId", query = "SELECT v FROM VendedoresFaixaComissao v WHERE v.vdfcId = :vdfcId"),
    @NamedQuery(name = "VendedoresFaixaComissao.findByVdfcPrasoInicial", query = "SELECT v FROM VendedoresFaixaComissao v WHERE v.vdfcPrasoInicial = :vdfcPrasoInicial"),
    @NamedQuery(name = "VendedoresFaixaComissao.findByVdfcPrasoFinal", query = "SELECT v FROM VendedoresFaixaComissao v WHERE v.vdfcPrasoFinal = :vdfcPrasoFinal"),
    @NamedQuery(name = "VendedoresFaixaComissao.findByVdfcComissao", query = "SELECT v FROM VendedoresFaixaComissao v WHERE v.vdfcComissao = :vdfcComissao"),
    @NamedQuery(name = "VendedoresFaixaComissao.findByVdfcLastupdate", query = "SELECT v FROM VendedoresFaixaComissao v WHERE v.vdfcLastupdate = :vdfcLastupdate"),
    @NamedQuery(name = "VendedoresFaixaComissao.findByVdfcComissaoGer", query = "SELECT v FROM VendedoresFaixaComissao v WHERE v.vdfcComissaoGer = :vdfcComissaoGer")})
public class VendedoresFaixaComissao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "VDFC_ID")
    private String vdfcId;
    @Basic(optional = false)
    @Column(name = "VDFC_PRASO_INICIAL")
    private int vdfcPrasoInicial;
    @Basic(optional = false)
    @Column(name = "VDFC_PRASO_FINAL")
    private int vdfcPrasoFinal;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "VDFC_COMISSAO")
    private BigDecimal vdfcComissao;
    @Column(name = "VDFC_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date vdfcLastupdate;
    @Column(name = "VDFC_COMISSAO_GER")
    private BigDecimal vdfcComissaoGer;
    @JoinColumn(name = "GRPO_ID", referencedColumnName = "GRPO_ID")
    @ManyToOne
    private Grupos grpoId;
    @JoinColumn(name = "VDDR_ID", referencedColumnName = "VDDR_ID")
    @ManyToOne
    private Vendedores vddrId;

    public VendedoresFaixaComissao() {
    }

    public VendedoresFaixaComissao(String vdfcId) {
        this.vdfcId = vdfcId;
    }

    public VendedoresFaixaComissao(String vdfcId, int vdfcPrasoInicial, int vdfcPrasoFinal, BigDecimal vdfcComissao) {
        this.vdfcId = vdfcId;
        this.vdfcPrasoInicial = vdfcPrasoInicial;
        this.vdfcPrasoFinal = vdfcPrasoFinal;
        this.vdfcComissao = vdfcComissao;
    }

    public String getVdfcId() {
        return vdfcId;
    }

    public void setVdfcId(String vdfcId) {
        this.vdfcId = vdfcId;
    }

    public int getVdfcPrasoInicial() {
        return vdfcPrasoInicial;
    }

    public void setVdfcPrasoInicial(int vdfcPrasoInicial) {
        this.vdfcPrasoInicial = vdfcPrasoInicial;
    }

    public int getVdfcPrasoFinal() {
        return vdfcPrasoFinal;
    }

    public void setVdfcPrasoFinal(int vdfcPrasoFinal) {
        this.vdfcPrasoFinal = vdfcPrasoFinal;
    }

    public BigDecimal getVdfcComissao() {
        return vdfcComissao;
    }

    public void setVdfcComissao(BigDecimal vdfcComissao) {
        this.vdfcComissao = vdfcComissao;
    }

    public Date getVdfcLastupdate() {
        return vdfcLastupdate;
    }

    public void setVdfcLastupdate(Date vdfcLastupdate) {
        this.vdfcLastupdate = vdfcLastupdate;
    }

    public BigDecimal getVdfcComissaoGer() {
        return vdfcComissaoGer;
    }

    public void setVdfcComissaoGer(BigDecimal vdfcComissaoGer) {
        this.vdfcComissaoGer = vdfcComissaoGer;
    }

    public Grupos getGrpoId() {
        return grpoId;
    }

    public void setGrpoId(Grupos grpoId) {
        this.grpoId = grpoId;
    }

    public Vendedores getVddrId() {
        return vddrId;
    }

    public void setVddrId(Vendedores vddrId) {
        this.vddrId = vddrId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vdfcId != null ? vdfcId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VendedoresFaixaComissao)) {
            return false;
        }
        VendedoresFaixaComissao other = (VendedoresFaixaComissao) object;
        if ((this.vdfcId == null && other.vdfcId != null) || (this.vdfcId != null && !this.vdfcId.equals(other.vdfcId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.VendedoresFaixaComissao[ vdfcId=" + vdfcId + " ]";
    }
    
}
