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
@Table(name = "MOVIMENTACAO_PATRIMONIAL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MovimentacaoPatrimonial.findAll", query = "SELECT m FROM MovimentacaoPatrimonial m"),
    @NamedQuery(name = "MovimentacaoPatrimonial.findByMvptId", query = "SELECT m FROM MovimentacaoPatrimonial m WHERE m.mvptId = :mvptId"),
    @NamedQuery(name = "MovimentacaoPatrimonial.findByMvptDataIniCorrecao", query = "SELECT m FROM MovimentacaoPatrimonial m WHERE m.mvptDataIniCorrecao = :mvptDataIniCorrecao"),
    @NamedQuery(name = "MovimentacaoPatrimonial.findByMvptDataFinCorrecao", query = "SELECT m FROM MovimentacaoPatrimonial m WHERE m.mvptDataFinCorrecao = :mvptDataFinCorrecao"),
    @NamedQuery(name = "MovimentacaoPatrimonial.findByMvptTipo", query = "SELECT m FROM MovimentacaoPatrimonial m WHERE m.mvptTipo = :mvptTipo"),
    @NamedQuery(name = "MovimentacaoPatrimonial.findByMvptVlrIndCorrecao", query = "SELECT m FROM MovimentacaoPatrimonial m WHERE m.mvptVlrIndCorrecao = :mvptVlrIndCorrecao"),
    @NamedQuery(name = "MovimentacaoPatrimonial.findByMvptVlrCorrecao", query = "SELECT m FROM MovimentacaoPatrimonial m WHERE m.mvptVlrCorrecao = :mvptVlrCorrecao"),
    @NamedQuery(name = "MovimentacaoPatrimonial.findByMvptVlrDepreciacao", query = "SELECT m FROM MovimentacaoPatrimonial m WHERE m.mvptVlrDepreciacao = :mvptVlrDepreciacao"),
    @NamedQuery(name = "MovimentacaoPatrimonial.findByMvptVlrCorDepAcumulada", query = "SELECT m FROM MovimentacaoPatrimonial m WHERE m.mvptVlrCorDepAcumulada = :mvptVlrCorDepAcumulada"),
    @NamedQuery(name = "MovimentacaoPatrimonial.findByMvptVlrDepAtual", query = "SELECT m FROM MovimentacaoPatrimonial m WHERE m.mvptVlrDepAtual = :mvptVlrDepAtual"),
    @NamedQuery(name = "MovimentacaoPatrimonial.findByMvptVlrCorrecaoAtual", query = "SELECT m FROM MovimentacaoPatrimonial m WHERE m.mvptVlrCorrecaoAtual = :mvptVlrCorrecaoAtual"),
    @NamedQuery(name = "MovimentacaoPatrimonial.findByMvptLastupdate", query = "SELECT m FROM MovimentacaoPatrimonial m WHERE m.mvptLastupdate = :mvptLastupdate")})
public class MovimentacaoPatrimonial implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MVPT_ID")
    private String mvptId;
    @Column(name = "MVPT_DATA_INI_CORRECAO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mvptDataIniCorrecao;
    @Column(name = "MVPT_DATA_FIN_CORRECAO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mvptDataFinCorrecao;
    @Basic(optional = false)
    @Column(name = "MVPT_TIPO")
    private String mvptTipo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "MVPT_VLR_IND_CORRECAO")
    private BigDecimal mvptVlrIndCorrecao;
    @Basic(optional = false)
    @Column(name = "MVPT_VLR_CORRECAO")
    private BigDecimal mvptVlrCorrecao;
    @Basic(optional = false)
    @Column(name = "MVPT_VLR_DEPRECIACAO")
    private BigDecimal mvptVlrDepreciacao;
    @Basic(optional = false)
    @Column(name = "MVPT_VLR_COR_DEP_ACUMULADA")
    private BigDecimal mvptVlrCorDepAcumulada;
    @Basic(optional = false)
    @Column(name = "MVPT_VLR_DEP_ATUAL")
    private BigDecimal mvptVlrDepAtual;
    @Basic(optional = false)
    @Column(name = "MVPT_VLR_CORRECAO_ATUAL")
    private BigDecimal mvptVlrCorrecaoAtual;
    @Column(name = "MVPT_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mvptLastupdate;
    @OneToMany(mappedBy = "movMvptId")
    private List<MovimentacaoPatrimonial> movimentacaoPatrimonialList;
    @JoinColumn(name = "MOV_MVPT_ID", referencedColumnName = "MVPT_ID")
    @ManyToOne
    private MovimentacaoPatrimonial movMvptId;
    @JoinColumn(name = "PTRM_ID", referencedColumnName = "PTRM_ID")
    @ManyToOne
    private Patrimonio ptrmId;

    public MovimentacaoPatrimonial() {
    }

    public MovimentacaoPatrimonial(String mvptId) {
        this.mvptId = mvptId;
    }

    public MovimentacaoPatrimonial(String mvptId, String mvptTipo, BigDecimal mvptVlrIndCorrecao, BigDecimal mvptVlrCorrecao, BigDecimal mvptVlrDepreciacao, BigDecimal mvptVlrCorDepAcumulada, BigDecimal mvptVlrDepAtual, BigDecimal mvptVlrCorrecaoAtual) {
        this.mvptId = mvptId;
        this.mvptTipo = mvptTipo;
        this.mvptVlrIndCorrecao = mvptVlrIndCorrecao;
        this.mvptVlrCorrecao = mvptVlrCorrecao;
        this.mvptVlrDepreciacao = mvptVlrDepreciacao;
        this.mvptVlrCorDepAcumulada = mvptVlrCorDepAcumulada;
        this.mvptVlrDepAtual = mvptVlrDepAtual;
        this.mvptVlrCorrecaoAtual = mvptVlrCorrecaoAtual;
    }

    public String getMvptId() {
        return mvptId;
    }

    public void setMvptId(String mvptId) {
        this.mvptId = mvptId;
    }

    public Date getMvptDataIniCorrecao() {
        return mvptDataIniCorrecao;
    }

    public void setMvptDataIniCorrecao(Date mvptDataIniCorrecao) {
        this.mvptDataIniCorrecao = mvptDataIniCorrecao;
    }

    public Date getMvptDataFinCorrecao() {
        return mvptDataFinCorrecao;
    }

    public void setMvptDataFinCorrecao(Date mvptDataFinCorrecao) {
        this.mvptDataFinCorrecao = mvptDataFinCorrecao;
    }

    public String getMvptTipo() {
        return mvptTipo;
    }

    public void setMvptTipo(String mvptTipo) {
        this.mvptTipo = mvptTipo;
    }

    public BigDecimal getMvptVlrIndCorrecao() {
        return mvptVlrIndCorrecao;
    }

    public void setMvptVlrIndCorrecao(BigDecimal mvptVlrIndCorrecao) {
        this.mvptVlrIndCorrecao = mvptVlrIndCorrecao;
    }

    public BigDecimal getMvptVlrCorrecao() {
        return mvptVlrCorrecao;
    }

    public void setMvptVlrCorrecao(BigDecimal mvptVlrCorrecao) {
        this.mvptVlrCorrecao = mvptVlrCorrecao;
    }

    public BigDecimal getMvptVlrDepreciacao() {
        return mvptVlrDepreciacao;
    }

    public void setMvptVlrDepreciacao(BigDecimal mvptVlrDepreciacao) {
        this.mvptVlrDepreciacao = mvptVlrDepreciacao;
    }

    public BigDecimal getMvptVlrCorDepAcumulada() {
        return mvptVlrCorDepAcumulada;
    }

    public void setMvptVlrCorDepAcumulada(BigDecimal mvptVlrCorDepAcumulada) {
        this.mvptVlrCorDepAcumulada = mvptVlrCorDepAcumulada;
    }

    public BigDecimal getMvptVlrDepAtual() {
        return mvptVlrDepAtual;
    }

    public void setMvptVlrDepAtual(BigDecimal mvptVlrDepAtual) {
        this.mvptVlrDepAtual = mvptVlrDepAtual;
    }

    public BigDecimal getMvptVlrCorrecaoAtual() {
        return mvptVlrCorrecaoAtual;
    }

    public void setMvptVlrCorrecaoAtual(BigDecimal mvptVlrCorrecaoAtual) {
        this.mvptVlrCorrecaoAtual = mvptVlrCorrecaoAtual;
    }

    public Date getMvptLastupdate() {
        return mvptLastupdate;
    }

    public void setMvptLastupdate(Date mvptLastupdate) {
        this.mvptLastupdate = mvptLastupdate;
    }

    @XmlTransient
    public List<MovimentacaoPatrimonial> getMovimentacaoPatrimonialList() {
        return movimentacaoPatrimonialList;
    }

    public void setMovimentacaoPatrimonialList(List<MovimentacaoPatrimonial> movimentacaoPatrimonialList) {
        this.movimentacaoPatrimonialList = movimentacaoPatrimonialList;
    }

    public MovimentacaoPatrimonial getMovMvptId() {
        return movMvptId;
    }

    public void setMovMvptId(MovimentacaoPatrimonial movMvptId) {
        this.movMvptId = movMvptId;
    }

    public Patrimonio getPtrmId() {
        return ptrmId;
    }

    public void setPtrmId(Patrimonio ptrmId) {
        this.ptrmId = ptrmId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mvptId != null ? mvptId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MovimentacaoPatrimonial)) {
            return false;
        }
        MovimentacaoPatrimonial other = (MovimentacaoPatrimonial) object;
        if ((this.mvptId == null && other.mvptId != null) || (this.mvptId != null && !this.mvptId.equals(other.mvptId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.MovimentacaoPatrimonial[ mvptId=" + mvptId + " ]";
    }
    
}
