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
@Table(name = "MOVIMENTO_CONTABIL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MovimentoContabil.findAll", query = "SELECT m FROM MovimentoContabil m"),
    @NamedQuery(name = "MovimentoContabil.findByMvctId", query = "SELECT m FROM MovimentoContabil m WHERE m.mvctId = :mvctId"),
    @NamedQuery(name = "MovimentoContabil.findByMvctCodigo", query = "SELECT m FROM MovimentoContabil m WHERE m.mvctCodigo = :mvctCodigo"),
    @NamedQuery(name = "MovimentoContabil.findByMvctData", query = "SELECT m FROM MovimentoContabil m WHERE m.mvctData = :mvctData"),
    @NamedQuery(name = "MovimentoContabil.findByMvctLancamento", query = "SELECT m FROM MovimentoContabil m WHERE m.mvctLancamento = :mvctLancamento"),
    @NamedQuery(name = "MovimentoContabil.findByMvctDocumento", query = "SELECT m FROM MovimentoContabil m WHERE m.mvctDocumento = :mvctDocumento"),
    @NamedQuery(name = "MovimentoContabil.findByMvctDataDocumento", query = "SELECT m FROM MovimentoContabil m WHERE m.mvctDataDocumento = :mvctDataDocumento"),
    @NamedQuery(name = "MovimentoContabil.findByMvctVencimento", query = "SELECT m FROM MovimentoContabil m WHERE m.mvctVencimento = :mvctVencimento"),
    @NamedQuery(name = "MovimentoContabil.findByMvctValor", query = "SELECT m FROM MovimentoContabil m WHERE m.mvctValor = :mvctValor"),
    @NamedQuery(name = "MovimentoContabil.findByMvctHistPadrao", query = "SELECT m FROM MovimentoContabil m WHERE m.mvctHistPadrao = :mvctHistPadrao"),
    @NamedQuery(name = "MovimentoContabil.findByMvctHistComplementar", query = "SELECT m FROM MovimentoContabil m WHERE m.mvctHistComplementar = :mvctHistComplementar"),
    @NamedQuery(name = "MovimentoContabil.findByMvctLancEncerramento", query = "SELECT m FROM MovimentoContabil m WHERE m.mvctLancEncerramento = :mvctLancEncerramento"),
    @NamedQuery(name = "MovimentoContabil.findByMvctOrigem", query = "SELECT m FROM MovimentoContabil m WHERE m.mvctOrigem = :mvctOrigem"),
    @NamedQuery(name = "MovimentoContabil.findByMvctLancCancelado", query = "SELECT m FROM MovimentoContabil m WHERE m.mvctLancCancelado = :mvctLancCancelado"),
    @NamedQuery(name = "MovimentoContabil.findByMvCtLASTUPDATE", query = "SELECT m FROM MovimentoContabil m WHERE m.mvCtLASTUPDATE = :mvCtLASTUPDATE")})
public class MovimentoContabil implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MVCT_ID")
    private String mvctId;
    @Column(name = "MVCT_CODIGO")
    private String mvctCodigo;
    @Basic(optional = false)
    @Column(name = "MVCT_DATA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mvctData;
    @Column(name = "MVCT_LANCAMENTO")
    private String mvctLancamento;
    @Column(name = "MVCT_DOCUMENTO")
    private String mvctDocumento;
    @Column(name = "MVCT_DATA_DOCUMENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mvctDataDocumento;
    @Column(name = "MVCT_VENCIMENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mvctVencimento;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "MVCT_VALOR")
    private BigDecimal mvctValor;
    @Column(name = "MVCT_HIST_PADRAO")
    private String mvctHistPadrao;
    @Column(name = "MVCT_HIST_COMPLEMENTAR")
    private String mvctHistComplementar;
    @Basic(optional = false)
    @Column(name = "MVCT_LANC_ENCERRAMENTO")
    private String mvctLancEncerramento;
    @Column(name = "MVCT_ORIGEM")
    private String mvctOrigem;
    @Basic(optional = false)
    @Column(name = "MVCT_LANC_CANCELADO")
    private String mvctLancCancelado;
    @Column(name = "MvCt_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mvCtLASTUPDATE;
    @JoinColumn(name = "DCFS_ID", referencedColumnName = "DCFS_ID")
    @ManyToOne
    private DocumentosFiscais dcfsId;
    @JoinColumn(name = "HPAD_ID", referencedColumnName = "HPAD_ID")
    @ManyToOne
    private HistoricosPadrao hpadId;
    @JoinColumn(name = "ITCX_ID", referencedColumnName = "ITCX_ID")
    @ManyToOne
    private ItensCaixas itcxId;
    @JoinColumn(name = "PGCT_ID", referencedColumnName = "PGCT_ID")
    @ManyToOne
    private PagamentosContas pgctId;
    @JoinColumn(name = "PLCT_ID", referencedColumnName = "PLCT_ID")
    @ManyToOne
    private PlanoContas plctId;
    @JoinColumn(name = "PLA_PLCT_ID", referencedColumnName = "PLCT_ID")
    @ManyToOne
    private PlanoContas plaPlctId;
    @JoinColumn(name = "TITU_ID", referencedColumnName = "TITU_ID")
    @ManyToOne
    private Titulos tituId;

    public MovimentoContabil() {
    }

    public MovimentoContabil(String mvctId) {
        this.mvctId = mvctId;
    }

    public MovimentoContabil(String mvctId, Date mvctData, BigDecimal mvctValor, String mvctLancEncerramento, String mvctLancCancelado) {
        this.mvctId = mvctId;
        this.mvctData = mvctData;
        this.mvctValor = mvctValor;
        this.mvctLancEncerramento = mvctLancEncerramento;
        this.mvctLancCancelado = mvctLancCancelado;
    }

    public String getMvctId() {
        return mvctId;
    }

    public void setMvctId(String mvctId) {
        this.mvctId = mvctId;
    }

    public String getMvctCodigo() {
        return mvctCodigo;
    }

    public void setMvctCodigo(String mvctCodigo) {
        this.mvctCodigo = mvctCodigo;
    }

    public Date getMvctData() {
        return mvctData;
    }

    public void setMvctData(Date mvctData) {
        this.mvctData = mvctData;
    }

    public String getMvctLancamento() {
        return mvctLancamento;
    }

    public void setMvctLancamento(String mvctLancamento) {
        this.mvctLancamento = mvctLancamento;
    }

    public String getMvctDocumento() {
        return mvctDocumento;
    }

    public void setMvctDocumento(String mvctDocumento) {
        this.mvctDocumento = mvctDocumento;
    }

    public Date getMvctDataDocumento() {
        return mvctDataDocumento;
    }

    public void setMvctDataDocumento(Date mvctDataDocumento) {
        this.mvctDataDocumento = mvctDataDocumento;
    }

    public Date getMvctVencimento() {
        return mvctVencimento;
    }

    public void setMvctVencimento(Date mvctVencimento) {
        this.mvctVencimento = mvctVencimento;
    }

    public BigDecimal getMvctValor() {
        return mvctValor;
    }

    public void setMvctValor(BigDecimal mvctValor) {
        this.mvctValor = mvctValor;
    }

    public String getMvctHistPadrao() {
        return mvctHistPadrao;
    }

    public void setMvctHistPadrao(String mvctHistPadrao) {
        this.mvctHistPadrao = mvctHistPadrao;
    }

    public String getMvctHistComplementar() {
        return mvctHistComplementar;
    }

    public void setMvctHistComplementar(String mvctHistComplementar) {
        this.mvctHistComplementar = mvctHistComplementar;
    }

    public String getMvctLancEncerramento() {
        return mvctLancEncerramento;
    }

    public void setMvctLancEncerramento(String mvctLancEncerramento) {
        this.mvctLancEncerramento = mvctLancEncerramento;
    }

    public String getMvctOrigem() {
        return mvctOrigem;
    }

    public void setMvctOrigem(String mvctOrigem) {
        this.mvctOrigem = mvctOrigem;
    }

    public String getMvctLancCancelado() {
        return mvctLancCancelado;
    }

    public void setMvctLancCancelado(String mvctLancCancelado) {
        this.mvctLancCancelado = mvctLancCancelado;
    }

    public Date getMvCtLASTUPDATE() {
        return mvCtLASTUPDATE;
    }

    public void setMvCtLASTUPDATE(Date mvCtLASTUPDATE) {
        this.mvCtLASTUPDATE = mvCtLASTUPDATE;
    }

    public DocumentosFiscais getDcfsId() {
        return dcfsId;
    }

    public void setDcfsId(DocumentosFiscais dcfsId) {
        this.dcfsId = dcfsId;
    }

    public HistoricosPadrao getHpadId() {
        return hpadId;
    }

    public void setHpadId(HistoricosPadrao hpadId) {
        this.hpadId = hpadId;
    }

    public ItensCaixas getItcxId() {
        return itcxId;
    }

    public void setItcxId(ItensCaixas itcxId) {
        this.itcxId = itcxId;
    }

    public PagamentosContas getPgctId() {
        return pgctId;
    }

    public void setPgctId(PagamentosContas pgctId) {
        this.pgctId = pgctId;
    }

    public PlanoContas getPlctId() {
        return plctId;
    }

    public void setPlctId(PlanoContas plctId) {
        this.plctId = plctId;
    }

    public PlanoContas getPlaPlctId() {
        return plaPlctId;
    }

    public void setPlaPlctId(PlanoContas plaPlctId) {
        this.plaPlctId = plaPlctId;
    }

    public Titulos getTituId() {
        return tituId;
    }

    public void setTituId(Titulos tituId) {
        this.tituId = tituId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mvctId != null ? mvctId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MovimentoContabil)) {
            return false;
        }
        MovimentoContabil other = (MovimentoContabil) object;
        if ((this.mvctId == null && other.mvctId != null) || (this.mvctId != null && !this.mvctId.equals(other.mvctId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.MovimentoContabil[ mvctId=" + mvctId + " ]";
    }
    
}
