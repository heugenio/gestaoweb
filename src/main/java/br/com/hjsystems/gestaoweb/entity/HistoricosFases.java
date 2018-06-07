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
@Table(name = "HISTORICOS_FASES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HistoricosFases.findAll", query = "SELECT h FROM HistoricosFases h"),
    @NamedQuery(name = "HistoricosFases.findByHsfsId", query = "SELECT h FROM HistoricosFases h WHERE h.hsfsId = :hsfsId"),
    @NamedQuery(name = "HistoricosFases.findByHsfsQtdAproduzir", query = "SELECT h FROM HistoricosFases h WHERE h.hsfsQtdAproduzir = :hsfsQtdAproduzir"),
    @NamedQuery(name = "HistoricosFases.findByHsfsQtdProduzida", query = "SELECT h FROM HistoricosFases h WHERE h.hsfsQtdProduzida = :hsfsQtdProduzida"),
    @NamedQuery(name = "HistoricosFases.findByHsfsNrFuncionarios", query = "SELECT h FROM HistoricosFases h WHERE h.hsfsNrFuncionarios = :hsfsNrFuncionarios"),
    @NamedQuery(name = "HistoricosFases.findByHsfsObservacao", query = "SELECT h FROM HistoricosFases h WHERE h.hsfsObservacao = :hsfsObservacao"),
    @NamedQuery(name = "HistoricosFases.findByHsfsLastupdate", query = "SELECT h FROM HistoricosFases h WHERE h.hsfsLastupdate = :hsfsLastupdate"),
    @NamedQuery(name = "HistoricosFases.findByHsfsDtInicial", query = "SELECT h FROM HistoricosFases h WHERE h.hsfsDtInicial = :hsfsDtInicial"),
    @NamedQuery(name = "HistoricosFases.findByHsfsDtFinal", query = "SELECT h FROM HistoricosFases h WHERE h.hsfsDtFinal = :hsfsDtFinal"),
    @NamedQuery(name = "HistoricosFases.findByTcncId", query = "SELECT h FROM HistoricosFases h WHERE h.tcncId = :tcncId"),
    @NamedQuery(name = "HistoricosFases.findByTecTcncId", query = "SELECT h FROM HistoricosFases h WHERE h.tecTcncId = :tecTcncId")})
public class HistoricosFases implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "HSFS_ID")
    private String hsfsId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "HSFS_QTD_APRODUZIR")
    private BigDecimal hsfsQtdAproduzir;
    @Column(name = "HSFS_QTD_PRODUZIDA")
    private String hsfsQtdProduzida;
    @Column(name = "HSFS_NR_FUNCIONARIOS")
    private Integer hsfsNrFuncionarios;
    @Column(name = "HSFS_OBSERVACAO")
    private String hsfsObservacao;
    @Column(name = "HSFS_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date hsfsLastupdate;
    @Column(name = "HSFS_DT_INICIAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date hsfsDtInicial;
    @Column(name = "HSFS_DT_FINAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date hsfsDtFinal;
    @Column(name = "TCNC_ID")
    private String tcncId;
    @Column(name = "TEC_TCNC_ID")
    private String tecTcncId;
    @JoinColumn(name = "FSPR_ID", referencedColumnName = "FSPR_ID")
    @ManyToOne
    private FaseProducao fsprId;
    @JoinColumn(name = "OPRD_ID", referencedColumnName = "OPRD_ID")
    @ManyToOne
    private OrdemProducao oprdId;

    public HistoricosFases() {
    }

    public HistoricosFases(String hsfsId) {
        this.hsfsId = hsfsId;
    }

    public String getHsfsId() {
        return hsfsId;
    }

    public void setHsfsId(String hsfsId) {
        this.hsfsId = hsfsId;
    }

    public BigDecimal getHsfsQtdAproduzir() {
        return hsfsQtdAproduzir;
    }

    public void setHsfsQtdAproduzir(BigDecimal hsfsQtdAproduzir) {
        this.hsfsQtdAproduzir = hsfsQtdAproduzir;
    }

    public String getHsfsQtdProduzida() {
        return hsfsQtdProduzida;
    }

    public void setHsfsQtdProduzida(String hsfsQtdProduzida) {
        this.hsfsQtdProduzida = hsfsQtdProduzida;
    }

    public Integer getHsfsNrFuncionarios() {
        return hsfsNrFuncionarios;
    }

    public void setHsfsNrFuncionarios(Integer hsfsNrFuncionarios) {
        this.hsfsNrFuncionarios = hsfsNrFuncionarios;
    }

    public String getHsfsObservacao() {
        return hsfsObservacao;
    }

    public void setHsfsObservacao(String hsfsObservacao) {
        this.hsfsObservacao = hsfsObservacao;
    }

    public Date getHsfsLastupdate() {
        return hsfsLastupdate;
    }

    public void setHsfsLastupdate(Date hsfsLastupdate) {
        this.hsfsLastupdate = hsfsLastupdate;
    }

    public Date getHsfsDtInicial() {
        return hsfsDtInicial;
    }

    public void setHsfsDtInicial(Date hsfsDtInicial) {
        this.hsfsDtInicial = hsfsDtInicial;
    }

    public Date getHsfsDtFinal() {
        return hsfsDtFinal;
    }

    public void setHsfsDtFinal(Date hsfsDtFinal) {
        this.hsfsDtFinal = hsfsDtFinal;
    }

    public String getTcncId() {
        return tcncId;
    }

    public void setTcncId(String tcncId) {
        this.tcncId = tcncId;
    }

    public String getTecTcncId() {
        return tecTcncId;
    }

    public void setTecTcncId(String tecTcncId) {
        this.tecTcncId = tecTcncId;
    }

    public FaseProducao getFsprId() {
        return fsprId;
    }

    public void setFsprId(FaseProducao fsprId) {
        this.fsprId = fsprId;
    }

    public OrdemProducao getOprdId() {
        return oprdId;
    }

    public void setOprdId(OrdemProducao oprdId) {
        this.oprdId = oprdId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hsfsId != null ? hsfsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HistoricosFases)) {
            return false;
        }
        HistoricosFases other = (HistoricosFases) object;
        if ((this.hsfsId == null && other.hsfsId != null) || (this.hsfsId != null && !this.hsfsId.equals(other.hsfsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.HistoricosFases[ hsfsId=" + hsfsId + " ]";
    }
    
}
