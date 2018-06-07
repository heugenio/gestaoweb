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
@Table(name = "PATRIMONIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Patrimonio.findAll", query = "SELECT p FROM Patrimonio p"),
    @NamedQuery(name = "Patrimonio.findByPtrmId", query = "SELECT p FROM Patrimonio p WHERE p.ptrmId = :ptrmId"),
    @NamedQuery(name = "Patrimonio.findByPtrmCodigo", query = "SELECT p FROM Patrimonio p WHERE p.ptrmCodigo = :ptrmCodigo"),
    @NamedQuery(name = "Patrimonio.findByPtrmNome", query = "SELECT p FROM Patrimonio p WHERE p.ptrmNome = :ptrmNome"),
    @NamedQuery(name = "Patrimonio.findByPtrmTipo", query = "SELECT p FROM Patrimonio p WHERE p.ptrmTipo = :ptrmTipo"),
    @NamedQuery(name = "Patrimonio.findByPtrmQuantidade", query = "SELECT p FROM Patrimonio p WHERE p.ptrmQuantidade = :ptrmQuantidade"),
    @NamedQuery(name = "Patrimonio.findByPtrmDocumento", query = "SELECT p FROM Patrimonio p WHERE p.ptrmDocumento = :ptrmDocumento"),
    @NamedQuery(name = "Patrimonio.findByPtrmDtAquisicao", query = "SELECT p FROM Patrimonio p WHERE p.ptrmDtAquisicao = :ptrmDtAquisicao"),
    @NamedQuery(name = "Patrimonio.findByPtrmVlrContabil", query = "SELECT p FROM Patrimonio p WHERE p.ptrmVlrContabil = :ptrmVlrContabil"),
    @NamedQuery(name = "Patrimonio.findByPtrmDtAbertura", query = "SELECT p FROM Patrimonio p WHERE p.ptrmDtAbertura = :ptrmDtAbertura"),
    @NamedQuery(name = "Patrimonio.findByPtrmVlrCorrecaoInicial", query = "SELECT p FROM Patrimonio p WHERE p.ptrmVlrCorrecaoInicial = :ptrmVlrCorrecaoInicial"),
    @NamedQuery(name = "Patrimonio.findByPtrmVlrDepreciacaoInicial", query = "SELECT p FROM Patrimonio p WHERE p.ptrmVlrDepreciacaoInicial = :ptrmVlrDepreciacaoInicial"),
    @NamedQuery(name = "Patrimonio.findByPtrmTxDepreciacao", query = "SELECT p FROM Patrimonio p WHERE p.ptrmTxDepreciacao = :ptrmTxDepreciacao"),
    @NamedQuery(name = "Patrimonio.findByPtrmSituacao", query = "SELECT p FROM Patrimonio p WHERE p.ptrmSituacao = :ptrmSituacao"),
    @NamedQuery(name = "Patrimonio.findByPtrmMotivoBaixa", query = "SELECT p FROM Patrimonio p WHERE p.ptrmMotivoBaixa = :ptrmMotivoBaixa"),
    @NamedQuery(name = "Patrimonio.findByPtrmMarcaModelo", query = "SELECT p FROM Patrimonio p WHERE p.ptrmMarcaModelo = :ptrmMarcaModelo"),
    @NamedQuery(name = "Patrimonio.findByPtrmNrSerie", query = "SELECT p FROM Patrimonio p WHERE p.ptrmNrSerie = :ptrmNrSerie"),
    @NamedQuery(name = "Patrimonio.findByPtrmLastupdate", query = "SELECT p FROM Patrimonio p WHERE p.ptrmLastupdate = :ptrmLastupdate"),
    @NamedQuery(name = "Patrimonio.findByPtrmDtBaixa", query = "SELECT p FROM Patrimonio p WHERE p.ptrmDtBaixa = :ptrmDtBaixa"),
    @NamedQuery(name = "Patrimonio.findByPtrmDtCautela", query = "SELECT p FROM Patrimonio p WHERE p.ptrmDtCautela = :ptrmDtCautela")})
public class Patrimonio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PTRM_ID")
    private String ptrmId;
    @Column(name = "PTRM_CODIGO")
    private String ptrmCodigo;
    @Column(name = "PTRM_NOME")
    private String ptrmNome;
    @Column(name = "PTRM_TIPO")
    private String ptrmTipo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "PTRM_QUANTIDADE")
    private BigDecimal ptrmQuantidade;
    @Column(name = "PTRM_DOCUMENTO")
    private String ptrmDocumento;
    @Column(name = "PTRM_DT_AQUISICAO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ptrmDtAquisicao;
    @Basic(optional = false)
    @Column(name = "PTRM_VLR_CONTABIL")
    private BigDecimal ptrmVlrContabil;
    @Column(name = "PTRM_DT_ABERTURA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ptrmDtAbertura;
    @Basic(optional = false)
    @Column(name = "PTRM_VLR_CORRECAO_INICIAL")
    private BigDecimal ptrmVlrCorrecaoInicial;
    @Basic(optional = false)
    @Column(name = "PTRM_VLR_DEPRECIACAO_INICIAL")
    private BigDecimal ptrmVlrDepreciacaoInicial;
    @Basic(optional = false)
    @Column(name = "PTRM_TX_DEPRECIACAO")
    private BigDecimal ptrmTxDepreciacao;
    @Basic(optional = false)
    @Column(name = "PTRM_SITUACAO")
    private String ptrmSituacao;
    @Column(name = "PTRM_MOTIVO_BAIXA")
    private String ptrmMotivoBaixa;
    @Column(name = "PTRM_MARCA_MODELO")
    private String ptrmMarcaModelo;
    @Column(name = "PTRM_NR_SERIE")
    private String ptrmNrSerie;
    @Column(name = "PTRM_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ptrmLastupdate;
    @Column(name = "PTRM_DT_BAIXA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ptrmDtBaixa;
    @Column(name = "PTRM_DT_CAUTELA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ptrmDtCautela;
    @OneToMany(mappedBy = "ptrmId")
    private List<HistTransfPatrimItens> histTransfPatrimItensList;
    @OneToMany(mappedBy = "ptrmId")
    private List<MovimentacaoPatrimonial> movimentacaoPatrimonialList;
    @JoinColumn(name = "DEPT_ID", referencedColumnName = "DEPT_ID")
    @ManyToOne
    private Departamentos deptId;
    @JoinColumn(name = "FRND_ID", referencedColumnName = "FRND_ID")
    @ManyToOne
    private Fornecedores frndId;
    @JoinColumn(name = "FUNC_ID", referencedColumnName = "FUNC_ID")
    @ManyToOne
    private Funcionarios funcId;
    @JoinColumn(name = "INDX_ID", referencedColumnName = "INDX_ID")
    @ManyToOne
    private Indexadores indxId;
    @JoinColumn(name = "PLCT_ID", referencedColumnName = "PLCT_ID")
    @ManyToOne
    private PlanoContas plctId;
    @JoinColumn(name = "UNEM_ID", referencedColumnName = "UNEM_ID")
    @ManyToOne
    private UnidadesEmpresariais unemId;

    public Patrimonio() {
    }

    public Patrimonio(String ptrmId) {
        this.ptrmId = ptrmId;
    }

    public Patrimonio(String ptrmId, BigDecimal ptrmQuantidade, BigDecimal ptrmVlrContabil, BigDecimal ptrmVlrCorrecaoInicial, BigDecimal ptrmVlrDepreciacaoInicial, BigDecimal ptrmTxDepreciacao, String ptrmSituacao) {
        this.ptrmId = ptrmId;
        this.ptrmQuantidade = ptrmQuantidade;
        this.ptrmVlrContabil = ptrmVlrContabil;
        this.ptrmVlrCorrecaoInicial = ptrmVlrCorrecaoInicial;
        this.ptrmVlrDepreciacaoInicial = ptrmVlrDepreciacaoInicial;
        this.ptrmTxDepreciacao = ptrmTxDepreciacao;
        this.ptrmSituacao = ptrmSituacao;
    }

    public String getPtrmId() {
        return ptrmId;
    }

    public void setPtrmId(String ptrmId) {
        this.ptrmId = ptrmId;
    }

    public String getPtrmCodigo() {
        return ptrmCodigo;
    }

    public void setPtrmCodigo(String ptrmCodigo) {
        this.ptrmCodigo = ptrmCodigo;
    }

    public String getPtrmNome() {
        return ptrmNome;
    }

    public void setPtrmNome(String ptrmNome) {
        this.ptrmNome = ptrmNome;
    }

    public String getPtrmTipo() {
        return ptrmTipo;
    }

    public void setPtrmTipo(String ptrmTipo) {
        this.ptrmTipo = ptrmTipo;
    }

    public BigDecimal getPtrmQuantidade() {
        return ptrmQuantidade;
    }

    public void setPtrmQuantidade(BigDecimal ptrmQuantidade) {
        this.ptrmQuantidade = ptrmQuantidade;
    }

    public String getPtrmDocumento() {
        return ptrmDocumento;
    }

    public void setPtrmDocumento(String ptrmDocumento) {
        this.ptrmDocumento = ptrmDocumento;
    }

    public Date getPtrmDtAquisicao() {
        return ptrmDtAquisicao;
    }

    public void setPtrmDtAquisicao(Date ptrmDtAquisicao) {
        this.ptrmDtAquisicao = ptrmDtAquisicao;
    }

    public BigDecimal getPtrmVlrContabil() {
        return ptrmVlrContabil;
    }

    public void setPtrmVlrContabil(BigDecimal ptrmVlrContabil) {
        this.ptrmVlrContabil = ptrmVlrContabil;
    }

    public Date getPtrmDtAbertura() {
        return ptrmDtAbertura;
    }

    public void setPtrmDtAbertura(Date ptrmDtAbertura) {
        this.ptrmDtAbertura = ptrmDtAbertura;
    }

    public BigDecimal getPtrmVlrCorrecaoInicial() {
        return ptrmVlrCorrecaoInicial;
    }

    public void setPtrmVlrCorrecaoInicial(BigDecimal ptrmVlrCorrecaoInicial) {
        this.ptrmVlrCorrecaoInicial = ptrmVlrCorrecaoInicial;
    }

    public BigDecimal getPtrmVlrDepreciacaoInicial() {
        return ptrmVlrDepreciacaoInicial;
    }

    public void setPtrmVlrDepreciacaoInicial(BigDecimal ptrmVlrDepreciacaoInicial) {
        this.ptrmVlrDepreciacaoInicial = ptrmVlrDepreciacaoInicial;
    }

    public BigDecimal getPtrmTxDepreciacao() {
        return ptrmTxDepreciacao;
    }

    public void setPtrmTxDepreciacao(BigDecimal ptrmTxDepreciacao) {
        this.ptrmTxDepreciacao = ptrmTxDepreciacao;
    }

    public String getPtrmSituacao() {
        return ptrmSituacao;
    }

    public void setPtrmSituacao(String ptrmSituacao) {
        this.ptrmSituacao = ptrmSituacao;
    }

    public String getPtrmMotivoBaixa() {
        return ptrmMotivoBaixa;
    }

    public void setPtrmMotivoBaixa(String ptrmMotivoBaixa) {
        this.ptrmMotivoBaixa = ptrmMotivoBaixa;
    }

    public String getPtrmMarcaModelo() {
        return ptrmMarcaModelo;
    }

    public void setPtrmMarcaModelo(String ptrmMarcaModelo) {
        this.ptrmMarcaModelo = ptrmMarcaModelo;
    }

    public String getPtrmNrSerie() {
        return ptrmNrSerie;
    }

    public void setPtrmNrSerie(String ptrmNrSerie) {
        this.ptrmNrSerie = ptrmNrSerie;
    }

    public Date getPtrmLastupdate() {
        return ptrmLastupdate;
    }

    public void setPtrmLastupdate(Date ptrmLastupdate) {
        this.ptrmLastupdate = ptrmLastupdate;
    }

    public Date getPtrmDtBaixa() {
        return ptrmDtBaixa;
    }

    public void setPtrmDtBaixa(Date ptrmDtBaixa) {
        this.ptrmDtBaixa = ptrmDtBaixa;
    }

    public Date getPtrmDtCautela() {
        return ptrmDtCautela;
    }

    public void setPtrmDtCautela(Date ptrmDtCautela) {
        this.ptrmDtCautela = ptrmDtCautela;
    }

    @XmlTransient
    public List<HistTransfPatrimItens> getHistTransfPatrimItensList() {
        return histTransfPatrimItensList;
    }

    public void setHistTransfPatrimItensList(List<HistTransfPatrimItens> histTransfPatrimItensList) {
        this.histTransfPatrimItensList = histTransfPatrimItensList;
    }

    @XmlTransient
    public List<MovimentacaoPatrimonial> getMovimentacaoPatrimonialList() {
        return movimentacaoPatrimonialList;
    }

    public void setMovimentacaoPatrimonialList(List<MovimentacaoPatrimonial> movimentacaoPatrimonialList) {
        this.movimentacaoPatrimonialList = movimentacaoPatrimonialList;
    }

    public Departamentos getDeptId() {
        return deptId;
    }

    public void setDeptId(Departamentos deptId) {
        this.deptId = deptId;
    }

    public Fornecedores getFrndId() {
        return frndId;
    }

    public void setFrndId(Fornecedores frndId) {
        this.frndId = frndId;
    }

    public Funcionarios getFuncId() {
        return funcId;
    }

    public void setFuncId(Funcionarios funcId) {
        this.funcId = funcId;
    }

    public Indexadores getIndxId() {
        return indxId;
    }

    public void setIndxId(Indexadores indxId) {
        this.indxId = indxId;
    }

    public PlanoContas getPlctId() {
        return plctId;
    }

    public void setPlctId(PlanoContas plctId) {
        this.plctId = plctId;
    }

    public UnidadesEmpresariais getUnemId() {
        return unemId;
    }

    public void setUnemId(UnidadesEmpresariais unemId) {
        this.unemId = unemId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ptrmId != null ? ptrmId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Patrimonio)) {
            return false;
        }
        Patrimonio other = (Patrimonio) object;
        if ((this.ptrmId == null && other.ptrmId != null) || (this.ptrmId != null && !this.ptrmId.equals(other.ptrmId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.Patrimonio[ ptrmId=" + ptrmId + " ]";
    }
    
}
