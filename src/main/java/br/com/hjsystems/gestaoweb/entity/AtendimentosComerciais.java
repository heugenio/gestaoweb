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
@Table(name = "ATENDIMENTOS_COMERCIAIS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AtendimentosComerciais.findAll", query = "SELECT a FROM AtendimentosComerciais a"),
    @NamedQuery(name = "AtendimentosComerciais.findByAtcmId", query = "SELECT a FROM AtendimentosComerciais a WHERE a.atcmId = :atcmId"),
    @NamedQuery(name = "AtendimentosComerciais.findByAtcmDataInicio", query = "SELECT a FROM AtendimentosComerciais a WHERE a.atcmDataInicio = :atcmDataInicio"),
    @NamedQuery(name = "AtendimentosComerciais.findByAtcmHsInicio", query = "SELECT a FROM AtendimentosComerciais a WHERE a.atcmHsInicio = :atcmHsInicio"),
    @NamedQuery(name = "AtendimentosComerciais.findByAtcmDataConclusao", query = "SELECT a FROM AtendimentosComerciais a WHERE a.atcmDataConclusao = :atcmDataConclusao"),
    @NamedQuery(name = "AtendimentosComerciais.findByAtcmHsConclusao", query = "SELECT a FROM AtendimentosComerciais a WHERE a.atcmHsConclusao = :atcmHsConclusao"),
    @NamedQuery(name = "AtendimentosComerciais.findByAtcmMenssagem", query = "SELECT a FROM AtendimentosComerciais a WHERE a.atcmMenssagem = :atcmMenssagem"),
    @NamedQuery(name = "AtendimentosComerciais.findByAtcmOptions", query = "SELECT a FROM AtendimentosComerciais a WHERE a.atcmOptions = :atcmOptions"),
    @NamedQuery(name = "AtendimentosComerciais.findByAtcmCor", query = "SELECT a FROM AtendimentosComerciais a WHERE a.atcmCor = :atcmCor"),
    @NamedQuery(name = "AtendimentosComerciais.findByAtcmTipo", query = "SELECT a FROM AtendimentosComerciais a WHERE a.atcmTipo = :atcmTipo"),
    @NamedQuery(name = "AtendimentosComerciais.findByAtCmLASTUPDATE", query = "SELECT a FROM AtendimentosComerciais a WHERE a.atCmLASTUPDATE = :atCmLASTUPDATE"),
    @NamedQuery(name = "AtendimentosComerciais.findByAtcmTitulo", query = "SELECT a FROM AtendimentosComerciais a WHERE a.atcmTitulo = :atcmTitulo"),
    @NamedQuery(name = "AtendimentosComerciais.findByAtcmSubtitulo", query = "SELECT a FROM AtendimentosComerciais a WHERE a.atcmSubtitulo = :atcmSubtitulo"),
    @NamedQuery(name = "AtendimentosComerciais.findByAtcmStatusCodigo", query = "SELECT a FROM AtendimentosComerciais a WHERE a.atcmStatusCodigo = :atcmStatusCodigo"),
    @NamedQuery(name = "AtendimentosComerciais.findByAtcmJustificativa", query = "SELECT a FROM AtendimentosComerciais a WHERE a.atcmJustificativa = :atcmJustificativa"),
    @NamedQuery(name = "AtendimentosComerciais.findByAtcmStatus", query = "SELECT a FROM AtendimentosComerciais a WHERE a.atcmStatus = :atcmStatus")})
public class AtendimentosComerciais implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ATCM_ID")
    private String atcmId;
    @Basic(optional = false)
    @Column(name = "ATCM_DATA_INICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date atcmDataInicio;
    @Column(name = "ATCM_HS_INICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date atcmHsInicio;
    @Column(name = "ATCM_DATA_CONCLUSAO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date atcmDataConclusao;
    @Column(name = "ATCM_HS_CONCLUSAO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date atcmHsConclusao;
    @Column(name = "ATCM_MENSSAGEM")
    private String atcmMenssagem;
    @Column(name = "ATCM_OPTIONS")
    private Integer atcmOptions;
    @Column(name = "ATCM_COR")
    private String atcmCor;
    @Column(name = "ATCM_TIPO")
    private Integer atcmTipo;
    @Column(name = "AtCm_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date atCmLASTUPDATE;
    @Column(name = "ATCM_TITULO")
    private String atcmTitulo;
    @Column(name = "ATCM_SUBTITULO")
    private String atcmSubtitulo;
    @Column(name = "ATCM_STATUS_CODIGO")
    private Boolean atcmStatusCodigo;
    @Column(name = "ATCM_JUSTIFICATIVA")
    private String atcmJustificativa;
    @Column(name = "ATCM_STATUS")
    private String atcmStatus;
    @JoinColumn(name = "PESS_ID", referencedColumnName = "PESS_ID")
    @ManyToOne
    private Pessoas pessId;
    @JoinColumn(name = "USRS_ID", referencedColumnName = "USRS_ID")
    @ManyToOne
    private Usuarios usrsId;

    public AtendimentosComerciais() {
    }

    public AtendimentosComerciais(String atcmId) {
        this.atcmId = atcmId;
    }

    public AtendimentosComerciais(String atcmId, Date atcmDataInicio) {
        this.atcmId = atcmId;
        this.atcmDataInicio = atcmDataInicio;
    }

    public String getAtcmId() {
        return atcmId;
    }

    public void setAtcmId(String atcmId) {
        this.atcmId = atcmId;
    }

    public Date getAtcmDataInicio() {
        return atcmDataInicio;
    }

    public void setAtcmDataInicio(Date atcmDataInicio) {
        this.atcmDataInicio = atcmDataInicio;
    }

    public Date getAtcmHsInicio() {
        return atcmHsInicio;
    }

    public void setAtcmHsInicio(Date atcmHsInicio) {
        this.atcmHsInicio = atcmHsInicio;
    }

    public Date getAtcmDataConclusao() {
        return atcmDataConclusao;
    }

    public void setAtcmDataConclusao(Date atcmDataConclusao) {
        this.atcmDataConclusao = atcmDataConclusao;
    }

    public Date getAtcmHsConclusao() {
        return atcmHsConclusao;
    }

    public void setAtcmHsConclusao(Date atcmHsConclusao) {
        this.atcmHsConclusao = atcmHsConclusao;
    }

    public String getAtcmMenssagem() {
        return atcmMenssagem;
    }

    public void setAtcmMenssagem(String atcmMenssagem) {
        this.atcmMenssagem = atcmMenssagem;
    }

    public Integer getAtcmOptions() {
        return atcmOptions;
    }

    public void setAtcmOptions(Integer atcmOptions) {
        this.atcmOptions = atcmOptions;
    }

    public String getAtcmCor() {
        return atcmCor;
    }

    public void setAtcmCor(String atcmCor) {
        this.atcmCor = atcmCor;
    }

    public Integer getAtcmTipo() {
        return atcmTipo;
    }

    public void setAtcmTipo(Integer atcmTipo) {
        this.atcmTipo = atcmTipo;
    }

    public Date getAtCmLASTUPDATE() {
        return atCmLASTUPDATE;
    }

    public void setAtCmLASTUPDATE(Date atCmLASTUPDATE) {
        this.atCmLASTUPDATE = atCmLASTUPDATE;
    }

    public String getAtcmTitulo() {
        return atcmTitulo;
    }

    public void setAtcmTitulo(String atcmTitulo) {
        this.atcmTitulo = atcmTitulo;
    }

    public String getAtcmSubtitulo() {
        return atcmSubtitulo;
    }

    public void setAtcmSubtitulo(String atcmSubtitulo) {
        this.atcmSubtitulo = atcmSubtitulo;
    }

    public Boolean getAtcmStatusCodigo() {
        return atcmStatusCodigo;
    }

    public void setAtcmStatusCodigo(Boolean atcmStatusCodigo) {
        this.atcmStatusCodigo = atcmStatusCodigo;
    }

    public String getAtcmJustificativa() {
        return atcmJustificativa;
    }

    public void setAtcmJustificativa(String atcmJustificativa) {
        this.atcmJustificativa = atcmJustificativa;
    }

    public String getAtcmStatus() {
        return atcmStatus;
    }

    public void setAtcmStatus(String atcmStatus) {
        this.atcmStatus = atcmStatus;
    }

    public Pessoas getPessId() {
        return pessId;
    }

    public void setPessId(Pessoas pessId) {
        this.pessId = pessId;
    }

    public Usuarios getUsrsId() {
        return usrsId;
    }

    public void setUsrsId(Usuarios usrsId) {
        this.usrsId = usrsId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (atcmId != null ? atcmId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AtendimentosComerciais)) {
            return false;
        }
        AtendimentosComerciais other = (AtendimentosComerciais) object;
        if ((this.atcmId == null && other.atcmId != null) || (this.atcmId != null && !this.atcmId.equals(other.atcmId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.AtendimentosComerciais[ atcmId=" + atcmId + " ]";
    }
    
}
