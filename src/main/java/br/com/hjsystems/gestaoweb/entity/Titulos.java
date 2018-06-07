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
@Table(name = "TITULOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Titulos.findAll", query = "SELECT t FROM Titulos t"),
    @NamedQuery(name = "Titulos.findByTituId", query = "SELECT t FROM Titulos t WHERE t.tituId = :tituId"),
    @NamedQuery(name = "Titulos.findByTituNrDocumento", query = "SELECT t FROM Titulos t WHERE t.tituNrDocumento = :tituNrDocumento"),
    @NamedQuery(name = "Titulos.findByTituVlrDocumento", query = "SELECT t FROM Titulos t WHERE t.tituVlrDocumento = :tituVlrDocumento"),
    @NamedQuery(name = "Titulos.findByTituDtEmissao", query = "SELECT t FROM Titulos t WHERE t.tituDtEmissao = :tituDtEmissao"),
    @NamedQuery(name = "Titulos.findByTituQtdParcelas", query = "SELECT t FROM Titulos t WHERE t.tituQtdParcelas = :tituQtdParcelas"),
    @NamedQuery(name = "Titulos.findByTituContrato", query = "SELECT t FROM Titulos t WHERE t.tituContrato = :tituContrato"),
    @NamedQuery(name = "Titulos.findByTituTipo", query = "SELECT t FROM Titulos t WHERE t.tituTipo = :tituTipo"),
    @NamedQuery(name = "Titulos.findByTituAfaturar", query = "SELECT t FROM Titulos t WHERE t.tituAfaturar = :tituAfaturar"),
    @NamedQuery(name = "Titulos.findByTituLancAutomatico", query = "SELECT t FROM Titulos t WHERE t.tituLancAutomatico = :tituLancAutomatico"),
    @NamedQuery(name = "Titulos.findByTituAceite", query = "SELECT t FROM Titulos t WHERE t.tituAceite = :tituAceite"),
    @NamedQuery(name = "Titulos.findByTituCredito", query = "SELECT t FROM Titulos t WHERE t.tituCredito = :tituCredito"),
    @NamedQuery(name = "Titulos.findByPddsId", query = "SELECT t FROM Titulos t WHERE t.pddsId = :pddsId"),
    @NamedQuery(name = "Titulos.findByTituFatura", query = "SELECT t FROM Titulos t WHERE t.tituFatura = :tituFatura"),
    @NamedQuery(name = "Titulos.findByTituLASTUPDATE", query = "SELECT t FROM Titulos t WHERE t.tituLASTUPDATE = :tituLASTUPDATE"),
    @NamedQuery(name = "Titulos.findByTituCodigoAutorizacao", query = "SELECT t FROM Titulos t WHERE t.tituCodigoAutorizacao = :tituCodigoAutorizacao"),
    @NamedQuery(name = "Titulos.findByTituNumeroUnicoRo", query = "SELECT t FROM Titulos t WHERE t.tituNumeroUnicoRo = :tituNumeroUnicoRo")})
public class Titulos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TITU_ID")
    private String tituId;
    @Column(name = "TITU_NR_DOCUMENTO")
    private String tituNrDocumento;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TITU_VLR_DOCUMENTO")
    private BigDecimal tituVlrDocumento;
    @Column(name = "TITU_DT_EMISSAO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tituDtEmissao;
    @Column(name = "TITU_QTD_PARCELAS")
    private BigDecimal tituQtdParcelas;
    @Column(name = "TITU_CONTRATO")
    private String tituContrato;
    @Basic(optional = false)
    @Column(name = "TITU_TIPO")
    private String tituTipo;
    @Basic(optional = false)
    @Column(name = "TITU_AFATURAR")
    private String tituAfaturar;
    @Basic(optional = false)
    @Column(name = "TITU_LANC_AUTOMATICO")
    private String tituLancAutomatico;
    @Column(name = "TITU_ACEITE")
    private String tituAceite;
    @Column(name = "TITU_CREDITO")
    private String tituCredito;
    @Column(name = "PDDS_ID")
    private String pddsId;
    @Column(name = "TITU_FATURA")
    private Integer tituFatura;
    @Column(name = "Titu_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tituLASTUPDATE;
    @Column(name = "TITU_CODIGO_AUTORIZACAO")
    private String tituCodigoAutorizacao;
    @Column(name = "TITU_NUMERO_UNICO_RO")
    private String tituNumeroUnicoRo;
    @OneToMany(mappedBy = "tituId")
    private List<TitulosCentroCustos> titulosCentroCustosList;
    @JoinColumn(name = "DEPT_ID", referencedColumnName = "DEPT_ID")
    @ManyToOne
    private Departamentos deptId;
    @JoinColumn(name = "HPAD_ID", referencedColumnName = "HPAD_ID")
    @ManyToOne
    private HistoricosPadrao hpadId;
    @JoinColumn(name = "ITCX_ID", referencedColumnName = "ITCX_ID")
    @ManyToOne
    private ItensCaixas itcxId;
    @JoinColumn(name = "OPCM_ID", referencedColumnName = "OPCM_ID")
    @ManyToOne
    private OperacoesComerciais opcmId;
    @JoinColumn(name = "PESS_ID", referencedColumnName = "PESS_ID")
    @ManyToOne
    private Pessoas pessId;
    @JoinColumn(name = "PLCT_ID", referencedColumnName = "PLCT_ID")
    @ManyToOne
    private PlanoContas plctId;
    @JoinColumn(name = "USRS_ID", referencedColumnName = "USRS_ID")
    @ManyToOne
    private Usuarios usrsId;
    @OneToMany(mappedBy = "titTituId")
    private List<Parcelas> parcelasList;
    @OneToMany(mappedBy = "tituId")
    private List<Parcelas> parcelasList1;
    @OneToMany(mappedBy = "tituId")
    private List<MovimentoContabil> movimentoContabilList;
    @OneToMany(mappedBy = "tituId")
    private List<DocumentosFiscais> documentosFiscaisList;

    public Titulos() {
    }

    public Titulos(String tituId) {
        this.tituId = tituId;
    }

    public Titulos(String tituId, String tituTipo, String tituAfaturar, String tituLancAutomatico) {
        this.tituId = tituId;
        this.tituTipo = tituTipo;
        this.tituAfaturar = tituAfaturar;
        this.tituLancAutomatico = tituLancAutomatico;
    }

    public String getTituId() {
        return tituId;
    }

    public void setTituId(String tituId) {
        this.tituId = tituId;
    }

    public String getTituNrDocumento() {
        return tituNrDocumento;
    }

    public void setTituNrDocumento(String tituNrDocumento) {
        this.tituNrDocumento = tituNrDocumento;
    }

    public BigDecimal getTituVlrDocumento() {
        return tituVlrDocumento;
    }

    public void setTituVlrDocumento(BigDecimal tituVlrDocumento) {
        this.tituVlrDocumento = tituVlrDocumento;
    }

    public Date getTituDtEmissao() {
        return tituDtEmissao;
    }

    public void setTituDtEmissao(Date tituDtEmissao) {
        this.tituDtEmissao = tituDtEmissao;
    }

    public BigDecimal getTituQtdParcelas() {
        return tituQtdParcelas;
    }

    public void setTituQtdParcelas(BigDecimal tituQtdParcelas) {
        this.tituQtdParcelas = tituQtdParcelas;
    }

    public String getTituContrato() {
        return tituContrato;
    }

    public void setTituContrato(String tituContrato) {
        this.tituContrato = tituContrato;
    }

    public String getTituTipo() {
        return tituTipo;
    }

    public void setTituTipo(String tituTipo) {
        this.tituTipo = tituTipo;
    }

    public String getTituAfaturar() {
        return tituAfaturar;
    }

    public void setTituAfaturar(String tituAfaturar) {
        this.tituAfaturar = tituAfaturar;
    }

    public String getTituLancAutomatico() {
        return tituLancAutomatico;
    }

    public void setTituLancAutomatico(String tituLancAutomatico) {
        this.tituLancAutomatico = tituLancAutomatico;
    }

    public String getTituAceite() {
        return tituAceite;
    }

    public void setTituAceite(String tituAceite) {
        this.tituAceite = tituAceite;
    }

    public String getTituCredito() {
        return tituCredito;
    }

    public void setTituCredito(String tituCredito) {
        this.tituCredito = tituCredito;
    }

    public String getPddsId() {
        return pddsId;
    }

    public void setPddsId(String pddsId) {
        this.pddsId = pddsId;
    }

    public Integer getTituFatura() {
        return tituFatura;
    }

    public void setTituFatura(Integer tituFatura) {
        this.tituFatura = tituFatura;
    }

    public Date getTituLASTUPDATE() {
        return tituLASTUPDATE;
    }

    public void setTituLASTUPDATE(Date tituLASTUPDATE) {
        this.tituLASTUPDATE = tituLASTUPDATE;
    }

    public String getTituCodigoAutorizacao() {
        return tituCodigoAutorizacao;
    }

    public void setTituCodigoAutorizacao(String tituCodigoAutorizacao) {
        this.tituCodigoAutorizacao = tituCodigoAutorizacao;
    }

    public String getTituNumeroUnicoRo() {
        return tituNumeroUnicoRo;
    }

    public void setTituNumeroUnicoRo(String tituNumeroUnicoRo) {
        this.tituNumeroUnicoRo = tituNumeroUnicoRo;
    }

    @XmlTransient
    public List<TitulosCentroCustos> getTitulosCentroCustosList() {
        return titulosCentroCustosList;
    }

    public void setTitulosCentroCustosList(List<TitulosCentroCustos> titulosCentroCustosList) {
        this.titulosCentroCustosList = titulosCentroCustosList;
    }

    public Departamentos getDeptId() {
        return deptId;
    }

    public void setDeptId(Departamentos deptId) {
        this.deptId = deptId;
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

    public OperacoesComerciais getOpcmId() {
        return opcmId;
    }

    public void setOpcmId(OperacoesComerciais opcmId) {
        this.opcmId = opcmId;
    }

    public Pessoas getPessId() {
        return pessId;
    }

    public void setPessId(Pessoas pessId) {
        this.pessId = pessId;
    }

    public PlanoContas getPlctId() {
        return plctId;
    }

    public void setPlctId(PlanoContas plctId) {
        this.plctId = plctId;
    }

    public Usuarios getUsrsId() {
        return usrsId;
    }

    public void setUsrsId(Usuarios usrsId) {
        this.usrsId = usrsId;
    }

    @XmlTransient
    public List<Parcelas> getParcelasList() {
        return parcelasList;
    }

    public void setParcelasList(List<Parcelas> parcelasList) {
        this.parcelasList = parcelasList;
    }

    @XmlTransient
    public List<Parcelas> getParcelasList1() {
        return parcelasList1;
    }

    public void setParcelasList1(List<Parcelas> parcelasList1) {
        this.parcelasList1 = parcelasList1;
    }

    @XmlTransient
    public List<MovimentoContabil> getMovimentoContabilList() {
        return movimentoContabilList;
    }

    public void setMovimentoContabilList(List<MovimentoContabil> movimentoContabilList) {
        this.movimentoContabilList = movimentoContabilList;
    }

    @XmlTransient
    public List<DocumentosFiscais> getDocumentosFiscaisList() {
        return documentosFiscaisList;
    }

    public void setDocumentosFiscaisList(List<DocumentosFiscais> documentosFiscaisList) {
        this.documentosFiscaisList = documentosFiscaisList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tituId != null ? tituId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Titulos)) {
            return false;
        }
        Titulos other = (Titulos) object;
        if ((this.tituId == null && other.tituId != null) || (this.tituId != null && !this.tituId.equals(other.tituId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.Titulos[ tituId=" + tituId + " ]";
    }
    
}
