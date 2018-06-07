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
@Table(name = "ORDEM_PRODUCAO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrdemProducao.findAll", query = "SELECT o FROM OrdemProducao o"),
    @NamedQuery(name = "OrdemProducao.findByOprdId", query = "SELECT o FROM OrdemProducao o WHERE o.oprdId = :oprdId"),
    @NamedQuery(name = "OrdemProducao.findByOprdNumero", query = "SELECT o FROM OrdemProducao o WHERE o.oprdNumero = :oprdNumero"),
    @NamedQuery(name = "OrdemProducao.findByOprdDataInicial", query = "SELECT o FROM OrdemProducao o WHERE o.oprdDataInicial = :oprdDataInicial"),
    @NamedQuery(name = "OrdemProducao.findByOprdDataFinal", query = "SELECT o FROM OrdemProducao o WHERE o.oprdDataFinal = :oprdDataFinal"),
    @NamedQuery(name = "OrdemProducao.findByOprdQtd", query = "SELECT o FROM OrdemProducao o WHERE o.oprdQtd = :oprdQtd"),
    @NamedQuery(name = "OrdemProducao.findByOprdStatus", query = "SELECT o FROM OrdemProducao o WHERE o.oprdStatus = :oprdStatus"),
    @NamedQuery(name = "OrdemProducao.findByOprdQtdProduzida", query = "SELECT o FROM OrdemProducao o WHERE o.oprdQtdProduzida = :oprdQtdProduzida"),
    @NamedQuery(name = "OrdemProducao.findByOprdLastupdate", query = "SELECT o FROM OrdemProducao o WHERE o.oprdLastupdate = :oprdLastupdate"),
    @NamedQuery(name = "OrdemProducao.findByOprdPrecoCusto", query = "SELECT o FROM OrdemProducao o WHERE o.oprdPrecoCusto = :oprdPrecoCusto"),
    @NamedQuery(name = "OrdemProducao.findByOprdObservacao", query = "SELECT o FROM OrdemProducao o WHERE o.oprdObservacao = :oprdObservacao")})
public class OrdemProducao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "OPRD_ID")
    private String oprdId;
    @Column(name = "OPRD_NUMERO")
    private String oprdNumero;
    @Column(name = "OPRD_DATA_INICIAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date oprdDataInicial;
    @Column(name = "OPRD_DATA_FINAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date oprdDataFinal;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "OPRD_QTD")
    private BigDecimal oprdQtd;
    @Basic(optional = false)
    @Column(name = "OPRD_STATUS")
    private String oprdStatus;
    @Column(name = "OPRD_QTD_PRODUZIDA")
    private BigDecimal oprdQtdProduzida;
    @Column(name = "OPRD_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date oprdLastupdate;
    @Basic(optional = false)
    @Column(name = "OPRD_PRECO_CUSTO")
    private BigDecimal oprdPrecoCusto;
    @Column(name = "OPRD_OBSERVACAO")
    private String oprdObservacao;
    @OneToMany(mappedBy = "oprdId")
    private List<SaldosEstoquesDiario> saldosEstoquesDiarioList;
    @OneToMany(mappedBy = "oprdId")
    private List<Requisicoes> requisicoesList;
    @OneToMany(mappedBy = "oprdId")
    private List<HistoricosFases> historicosFasesList;
    @JoinColumn(name = "FSPR_ID", referencedColumnName = "FSPR_ID")
    @ManyToOne
    private FaseProducao fsprId;
    @JoinColumn(name = "ITPD_ID", referencedColumnName = "ITPD_ID")
    @ManyToOne
    private ItensPedidos itpdId;
    @JoinColumn(name = "LOTE_ID", referencedColumnName = "LOTE_ID")
    @ManyToOne
    private Lotes loteId;
    @JoinColumn(name = "ORSV_ID", referencedColumnName = "ORSV_ID")
    @ManyToOne
    private OrdemServico orsvId;
    @JoinColumn(name = "PROD_ID", referencedColumnName = "PROD_ID")
    @ManyToOne
    private Produtos prodId;
    @JoinColumn(name = "TCNC_ID", referencedColumnName = "TCNC_ID")
    @ManyToOne
    private Tecnico tcncId;
    @JoinColumn(name = "TEST_ID", referencedColumnName = "TEST_ID")
    @ManyToOne
    private TiposEstoques testId;
    @JoinColumn(name = "UNID_ID", referencedColumnName = "UNID_ID")
    @ManyToOne
    private Unidades unidId;

    public OrdemProducao() {
    }

    public OrdemProducao(String oprdId) {
        this.oprdId = oprdId;
    }

    public OrdemProducao(String oprdId, BigDecimal oprdQtd, String oprdStatus, BigDecimal oprdPrecoCusto) {
        this.oprdId = oprdId;
        this.oprdQtd = oprdQtd;
        this.oprdStatus = oprdStatus;
        this.oprdPrecoCusto = oprdPrecoCusto;
    }

    public String getOprdId() {
        return oprdId;
    }

    public void setOprdId(String oprdId) {
        this.oprdId = oprdId;
    }

    public String getOprdNumero() {
        return oprdNumero;
    }

    public void setOprdNumero(String oprdNumero) {
        this.oprdNumero = oprdNumero;
    }

    public Date getOprdDataInicial() {
        return oprdDataInicial;
    }

    public void setOprdDataInicial(Date oprdDataInicial) {
        this.oprdDataInicial = oprdDataInicial;
    }

    public Date getOprdDataFinal() {
        return oprdDataFinal;
    }

    public void setOprdDataFinal(Date oprdDataFinal) {
        this.oprdDataFinal = oprdDataFinal;
    }

    public BigDecimal getOprdQtd() {
        return oprdQtd;
    }

    public void setOprdQtd(BigDecimal oprdQtd) {
        this.oprdQtd = oprdQtd;
    }

    public String getOprdStatus() {
        return oprdStatus;
    }

    public void setOprdStatus(String oprdStatus) {
        this.oprdStatus = oprdStatus;
    }

    public BigDecimal getOprdQtdProduzida() {
        return oprdQtdProduzida;
    }

    public void setOprdQtdProduzida(BigDecimal oprdQtdProduzida) {
        this.oprdQtdProduzida = oprdQtdProduzida;
    }

    public Date getOprdLastupdate() {
        return oprdLastupdate;
    }

    public void setOprdLastupdate(Date oprdLastupdate) {
        this.oprdLastupdate = oprdLastupdate;
    }

    public BigDecimal getOprdPrecoCusto() {
        return oprdPrecoCusto;
    }

    public void setOprdPrecoCusto(BigDecimal oprdPrecoCusto) {
        this.oprdPrecoCusto = oprdPrecoCusto;
    }

    public String getOprdObservacao() {
        return oprdObservacao;
    }

    public void setOprdObservacao(String oprdObservacao) {
        this.oprdObservacao = oprdObservacao;
    }

    @XmlTransient
    public List<SaldosEstoquesDiario> getSaldosEstoquesDiarioList() {
        return saldosEstoquesDiarioList;
    }

    public void setSaldosEstoquesDiarioList(List<SaldosEstoquesDiario> saldosEstoquesDiarioList) {
        this.saldosEstoquesDiarioList = saldosEstoquesDiarioList;
    }

    @XmlTransient
    public List<Requisicoes> getRequisicoesList() {
        return requisicoesList;
    }

    public void setRequisicoesList(List<Requisicoes> requisicoesList) {
        this.requisicoesList = requisicoesList;
    }

    @XmlTransient
    public List<HistoricosFases> getHistoricosFasesList() {
        return historicosFasesList;
    }

    public void setHistoricosFasesList(List<HistoricosFases> historicosFasesList) {
        this.historicosFasesList = historicosFasesList;
    }

    public FaseProducao getFsprId() {
        return fsprId;
    }

    public void setFsprId(FaseProducao fsprId) {
        this.fsprId = fsprId;
    }

    public ItensPedidos getItpdId() {
        return itpdId;
    }

    public void setItpdId(ItensPedidos itpdId) {
        this.itpdId = itpdId;
    }

    public Lotes getLoteId() {
        return loteId;
    }

    public void setLoteId(Lotes loteId) {
        this.loteId = loteId;
    }

    public OrdemServico getOrsvId() {
        return orsvId;
    }

    public void setOrsvId(OrdemServico orsvId) {
        this.orsvId = orsvId;
    }

    public Produtos getProdId() {
        return prodId;
    }

    public void setProdId(Produtos prodId) {
        this.prodId = prodId;
    }

    public Tecnico getTcncId() {
        return tcncId;
    }

    public void setTcncId(Tecnico tcncId) {
        this.tcncId = tcncId;
    }

    public TiposEstoques getTestId() {
        return testId;
    }

    public void setTestId(TiposEstoques testId) {
        this.testId = testId;
    }

    public Unidades getUnidId() {
        return unidId;
    }

    public void setUnidId(Unidades unidId) {
        this.unidId = unidId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (oprdId != null ? oprdId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrdemProducao)) {
            return false;
        }
        OrdemProducao other = (OrdemProducao) object;
        if ((this.oprdId == null && other.oprdId != null) || (this.oprdId != null && !this.oprdId.equals(other.oprdId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.OrdemProducao[ oprdId=" + oprdId + " ]";
    }
    
}
