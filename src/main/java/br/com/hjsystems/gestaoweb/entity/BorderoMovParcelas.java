/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hjsystems.gestaoweb.entity;

import java.io.Serializable;
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
@Table(name = "BORDERO_MOV_PARCELAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BorderoMovParcelas.findAll", query = "SELECT b FROM BorderoMovParcelas b"),
    @NamedQuery(name = "BorderoMovParcelas.findByBmvpId", query = "SELECT b FROM BorderoMovParcelas b WHERE b.bmvpId = :bmvpId"),
    @NamedQuery(name = "BorderoMovParcelas.findByBmvpAviso", query = "SELECT b FROM BorderoMovParcelas b WHERE b.bmvpAviso = :bmvpAviso"),
    @NamedQuery(name = "BorderoMovParcelas.findByBmvpDtAviso", query = "SELECT b FROM BorderoMovParcelas b WHERE b.bmvpDtAviso = :bmvpDtAviso"),
    @NamedQuery(name = "BorderoMovParcelas.findByBmvpDtAceite", query = "SELECT b FROM BorderoMovParcelas b WHERE b.bmvpDtAceite = :bmvpDtAceite"),
    @NamedQuery(name = "BorderoMovParcelas.findByBmvpDtProcessamento", query = "SELECT b FROM BorderoMovParcelas b WHERE b.bmvpDtProcessamento = :bmvpDtProcessamento"),
    @NamedQuery(name = "BorderoMovParcelas.findByBmvpNaturezaAviso", query = "SELECT b FROM BorderoMovParcelas b WHERE b.bmvpNaturezaAviso = :bmvpNaturezaAviso"),
    @NamedQuery(name = "BorderoMovParcelas.findByBmvpTipoTitulo", query = "SELECT b FROM BorderoMovParcelas b WHERE b.bmvpTipoTitulo = :bmvpTipoTitulo"),
    @NamedQuery(name = "BorderoMovParcelas.findByBmvpStatus", query = "SELECT b FROM BorderoMovParcelas b WHERE b.bmvpStatus = :bmvpStatus"),
    @NamedQuery(name = "BorderoMovParcelas.findByBmvpLastupdate", query = "SELECT b FROM BorderoMovParcelas b WHERE b.bmvpLastupdate = :bmvpLastupdate"),
    @NamedQuery(name = "BorderoMovParcelas.findByBmvpObservacao", query = "SELECT b FROM BorderoMovParcelas b WHERE b.bmvpObservacao = :bmvpObservacao")})
public class BorderoMovParcelas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "BMVP_ID")
    private String bmvpId;
    @Column(name = "BMVP_AVISO")
    private String bmvpAviso;
    @Column(name = "BMVP_DT_AVISO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date bmvpDtAviso;
    @Column(name = "BMVP_DT_ACEITE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date bmvpDtAceite;
    @Column(name = "BMVP_DT_PROCESSAMENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date bmvpDtProcessamento;
    @Basic(optional = false)
    @Column(name = "BMVP_NATUREZA_AVISO")
    private String bmvpNaturezaAviso;
    @Basic(optional = false)
    @Column(name = "BMVP_TIPO_TITULO")
    private String bmvpTipoTitulo;
    @Basic(optional = false)
    @Column(name = "BMVP_STATUS")
    private String bmvpStatus;
    @Column(name = "BMVP_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date bmvpLastupdate;
    @Column(name = "BMVP_OBSERVACAO")
    private String bmvpObservacao;
    @OneToMany(mappedBy = "bmvpId")
    private List<HistoricosParcela> historicosParcelaList;
    @OneToMany(mappedBy = "bmvpId")
    private List<AvisoMovimentoBancario> avisoMovimentoBancarioList;
    @JoinColumn(name = "COF_COFR_ID", referencedColumnName = "COFR_ID")
    @ManyToOne
    private Cofres cofCofrId;
    @JoinColumn(name = "COFR_ID", referencedColumnName = "COFR_ID")
    @ManyToOne
    private Cofres cofrId;

    public BorderoMovParcelas() {
    }

    public BorderoMovParcelas(String bmvpId) {
        this.bmvpId = bmvpId;
    }

    public BorderoMovParcelas(String bmvpId, String bmvpNaturezaAviso, String bmvpTipoTitulo, String bmvpStatus) {
        this.bmvpId = bmvpId;
        this.bmvpNaturezaAviso = bmvpNaturezaAviso;
        this.bmvpTipoTitulo = bmvpTipoTitulo;
        this.bmvpStatus = bmvpStatus;
    }

    public String getBmvpId() {
        return bmvpId;
    }

    public void setBmvpId(String bmvpId) {
        this.bmvpId = bmvpId;
    }

    public String getBmvpAviso() {
        return bmvpAviso;
    }

    public void setBmvpAviso(String bmvpAviso) {
        this.bmvpAviso = bmvpAviso;
    }

    public Date getBmvpDtAviso() {
        return bmvpDtAviso;
    }

    public void setBmvpDtAviso(Date bmvpDtAviso) {
        this.bmvpDtAviso = bmvpDtAviso;
    }

    public Date getBmvpDtAceite() {
        return bmvpDtAceite;
    }

    public void setBmvpDtAceite(Date bmvpDtAceite) {
        this.bmvpDtAceite = bmvpDtAceite;
    }

    public Date getBmvpDtProcessamento() {
        return bmvpDtProcessamento;
    }

    public void setBmvpDtProcessamento(Date bmvpDtProcessamento) {
        this.bmvpDtProcessamento = bmvpDtProcessamento;
    }

    public String getBmvpNaturezaAviso() {
        return bmvpNaturezaAviso;
    }

    public void setBmvpNaturezaAviso(String bmvpNaturezaAviso) {
        this.bmvpNaturezaAviso = bmvpNaturezaAviso;
    }

    public String getBmvpTipoTitulo() {
        return bmvpTipoTitulo;
    }

    public void setBmvpTipoTitulo(String bmvpTipoTitulo) {
        this.bmvpTipoTitulo = bmvpTipoTitulo;
    }

    public String getBmvpStatus() {
        return bmvpStatus;
    }

    public void setBmvpStatus(String bmvpStatus) {
        this.bmvpStatus = bmvpStatus;
    }

    public Date getBmvpLastupdate() {
        return bmvpLastupdate;
    }

    public void setBmvpLastupdate(Date bmvpLastupdate) {
        this.bmvpLastupdate = bmvpLastupdate;
    }

    public String getBmvpObservacao() {
        return bmvpObservacao;
    }

    public void setBmvpObservacao(String bmvpObservacao) {
        this.bmvpObservacao = bmvpObservacao;
    }

    @XmlTransient
    public List<HistoricosParcela> getHistoricosParcelaList() {
        return historicosParcelaList;
    }

    public void setHistoricosParcelaList(List<HistoricosParcela> historicosParcelaList) {
        this.historicosParcelaList = historicosParcelaList;
    }

    @XmlTransient
    public List<AvisoMovimentoBancario> getAvisoMovimentoBancarioList() {
        return avisoMovimentoBancarioList;
    }

    public void setAvisoMovimentoBancarioList(List<AvisoMovimentoBancario> avisoMovimentoBancarioList) {
        this.avisoMovimentoBancarioList = avisoMovimentoBancarioList;
    }

    public Cofres getCofCofrId() {
        return cofCofrId;
    }

    public void setCofCofrId(Cofres cofCofrId) {
        this.cofCofrId = cofCofrId;
    }

    public Cofres getCofrId() {
        return cofrId;
    }

    public void setCofrId(Cofres cofrId) {
        this.cofrId = cofrId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bmvpId != null ? bmvpId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BorderoMovParcelas)) {
            return false;
        }
        BorderoMovParcelas other = (BorderoMovParcelas) object;
        if ((this.bmvpId == null && other.bmvpId != null) || (this.bmvpId != null && !this.bmvpId.equals(other.bmvpId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.BorderoMovParcelas[ bmvpId=" + bmvpId + " ]";
    }
    
}
