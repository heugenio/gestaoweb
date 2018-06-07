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
@Table(name = "CHEQUES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cheques.findAll", query = "SELECT c FROM Cheques c"),
    @NamedQuery(name = "Cheques.findByChqsId", query = "SELECT c FROM Cheques c WHERE c.chqsId = :chqsId"),
    @NamedQuery(name = "Cheques.findByChqsNumero", query = "SELECT c FROM Cheques c WHERE c.chqsNumero = :chqsNumero"),
    @NamedQuery(name = "Cheques.findByChqsOrigem", query = "SELECT c FROM Cheques c WHERE c.chqsOrigem = :chqsOrigem"),
    @NamedQuery(name = "Cheques.findByChqsNumeroAgencia", query = "SELECT c FROM Cheques c WHERE c.chqsNumeroAgencia = :chqsNumeroAgencia"),
    @NamedQuery(name = "Cheques.findByChqsContaCorrente", query = "SELECT c FROM Cheques c WHERE c.chqsContaCorrente = :chqsContaCorrente"),
    @NamedQuery(name = "Cheques.findByChqsData", query = "SELECT c FROM Cheques c WHERE c.chqsData = :chqsData"),
    @NamedQuery(name = "Cheques.findByChqsValor", query = "SELECT c FROM Cheques c WHERE c.chqsValor = :chqsValor"),
    @NamedQuery(name = "Cheques.findByChqsDataVencimento", query = "SELECT c FROM Cheques c WHERE c.chqsDataVencimento = :chqsDataVencimento"),
    @NamedQuery(name = "Cheques.findByChqsTipo", query = "SELECT c FROM Cheques c WHERE c.chqsTipo = :chqsTipo"),
    @NamedQuery(name = "Cheques.findByChqsSituacao", query = "SELECT c FROM Cheques c WHERE c.chqsSituacao = :chqsSituacao"),
    @NamedQuery(name = "Cheques.findByCheChqsId", query = "SELECT c FROM Cheques c WHERE c.cheChqsId = :cheChqsId"),
    @NamedQuery(name = "Cheques.findByChqsLASTUPDATE", query = "SELECT c FROM Cheques c WHERE c.chqsLASTUPDATE = :chqsLASTUPDATE"),
    @NamedQuery(name = "Cheques.findByChqsNumeroEnvelope", query = "SELECT c FROM Cheques c WHERE c.chqsNumeroEnvelope = :chqsNumeroEnvelope"),
    @NamedQuery(name = "Cheques.findByChqsDataDevolucao2", query = "SELECT c FROM Cheques c WHERE c.chqsDataDevolucao2 = :chqsDataDevolucao2"),
    @NamedQuery(name = "Cheques.findByChqsDataDevolucao", query = "SELECT c FROM Cheques c WHERE c.chqsDataDevolucao = :chqsDataDevolucao"),
    @NamedQuery(name = "Cheques.findByChqsDataCustodia", query = "SELECT c FROM Cheques c WHERE c.chqsDataCustodia = :chqsDataCustodia"),
    @NamedQuery(name = "Cheques.findByChqsSaldo", query = "SELECT c FROM Cheques c WHERE c.chqsSaldo = :chqsSaldo"),
    @NamedQuery(name = "Cheques.findByChqsDataCompensado", query = "SELECT c FROM Cheques c WHERE c.chqsDataCompensado = :chqsDataCompensado")})
public class Cheques implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CHQS_ID")
    private String chqsId;
    @Column(name = "CHQS_NUMERO")
    private String chqsNumero;
    @Column(name = "CHQS_ORIGEM")
    private String chqsOrigem;
    @Column(name = "CHQS_NUMERO_AGENCIA")
    private String chqsNumeroAgencia;
    @Column(name = "CHQS_CONTA_CORRENTE")
    private String chqsContaCorrente;
    @Column(name = "CHQS_DATA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date chqsData;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "CHQS_VALOR")
    private BigDecimal chqsValor;
    @Column(name = "CHQS_DATA_VENCIMENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date chqsDataVencimento;
    @Column(name = "CHQS_TIPO")
    private String chqsTipo;
    @Column(name = "CHQS_SITUACAO")
    private String chqsSituacao;
    @Column(name = "CHE_CHQS_ID")
    private String cheChqsId;
    @Column(name = "Chqs_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date chqsLASTUPDATE;
    @Column(name = "CHQS_NUMERO_ENVELOPE")
    private String chqsNumeroEnvelope;
    @Column(name = "CHQS_DATA_DEVOLUCAO2")
    @Temporal(TemporalType.TIMESTAMP)
    private Date chqsDataDevolucao2;
    @Column(name = "CHQS_DATA_DEVOLUCAO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date chqsDataDevolucao;
    @Column(name = "CHQS_DATA_CUSTODIA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date chqsDataCustodia;
    @Column(name = "CHQS_SALDO")
    private BigDecimal chqsSaldo;
    @Column(name = "CHQS_DATA_COMPENSADO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date chqsDataCompensado;
    @OneToMany(mappedBy = "chqsId")
    private List<ChequesTrocas> chequesTrocasList;
    @OneToMany(mappedBy = "cheChqsId")
    private List<ChequesTrocas> chequesTrocasList1;
    @JoinColumn(name = "BANC_ID", referencedColumnName = "BANC_ID")
    @ManyToOne
    private Bancos bancId;
    @JoinColumn(name = "COFR_ID", referencedColumnName = "COFR_ID")
    @ManyToOne
    private Cofres cofrId;
    @JoinColumn(name = "ITCX_ID", referencedColumnName = "ITCX_ID")
    @ManyToOne
    private ItensCaixas itcxId;
    @JoinColumn(name = "PESS_ID", referencedColumnName = "PESS_ID")
    @ManyToOne
    private Pessoas pessId;
    @JoinColumn(name = "PES_PESS_ID", referencedColumnName = "PESS_ID")
    @ManyToOne
    private Pessoas pesPessId;
    @OneToMany(mappedBy = "chqsId")
    private List<HistoricosCheques> historicosChequesList;
    @OneToMany(mappedBy = "chqsId")
    private List<ChequesParcelas> chequesParcelasList;

    public Cheques() {
    }

    public Cheques(String chqsId) {
        this.chqsId = chqsId;
    }

    public Cheques(String chqsId, BigDecimal chqsValor) {
        this.chqsId = chqsId;
        this.chqsValor = chqsValor;
    }

    public String getChqsId() {
        return chqsId;
    }

    public void setChqsId(String chqsId) {
        this.chqsId = chqsId;
    }

    public String getChqsNumero() {
        return chqsNumero;
    }

    public void setChqsNumero(String chqsNumero) {
        this.chqsNumero = chqsNumero;
    }

    public String getChqsOrigem() {
        return chqsOrigem;
    }

    public void setChqsOrigem(String chqsOrigem) {
        this.chqsOrigem = chqsOrigem;
    }

    public String getChqsNumeroAgencia() {
        return chqsNumeroAgencia;
    }

    public void setChqsNumeroAgencia(String chqsNumeroAgencia) {
        this.chqsNumeroAgencia = chqsNumeroAgencia;
    }

    public String getChqsContaCorrente() {
        return chqsContaCorrente;
    }

    public void setChqsContaCorrente(String chqsContaCorrente) {
        this.chqsContaCorrente = chqsContaCorrente;
    }

    public Date getChqsData() {
        return chqsData;
    }

    public void setChqsData(Date chqsData) {
        this.chqsData = chqsData;
    }

    public BigDecimal getChqsValor() {
        return chqsValor;
    }

    public void setChqsValor(BigDecimal chqsValor) {
        this.chqsValor = chqsValor;
    }

    public Date getChqsDataVencimento() {
        return chqsDataVencimento;
    }

    public void setChqsDataVencimento(Date chqsDataVencimento) {
        this.chqsDataVencimento = chqsDataVencimento;
    }

    public String getChqsTipo() {
        return chqsTipo;
    }

    public void setChqsTipo(String chqsTipo) {
        this.chqsTipo = chqsTipo;
    }

    public String getChqsSituacao() {
        return chqsSituacao;
    }

    public void setChqsSituacao(String chqsSituacao) {
        this.chqsSituacao = chqsSituacao;
    }

    public String getCheChqsId() {
        return cheChqsId;
    }

    public void setCheChqsId(String cheChqsId) {
        this.cheChqsId = cheChqsId;
    }

    public Date getChqsLASTUPDATE() {
        return chqsLASTUPDATE;
    }

    public void setChqsLASTUPDATE(Date chqsLASTUPDATE) {
        this.chqsLASTUPDATE = chqsLASTUPDATE;
    }

    public String getChqsNumeroEnvelope() {
        return chqsNumeroEnvelope;
    }

    public void setChqsNumeroEnvelope(String chqsNumeroEnvelope) {
        this.chqsNumeroEnvelope = chqsNumeroEnvelope;
    }

    public Date getChqsDataDevolucao2() {
        return chqsDataDevolucao2;
    }

    public void setChqsDataDevolucao2(Date chqsDataDevolucao2) {
        this.chqsDataDevolucao2 = chqsDataDevolucao2;
    }

    public Date getChqsDataDevolucao() {
        return chqsDataDevolucao;
    }

    public void setChqsDataDevolucao(Date chqsDataDevolucao) {
        this.chqsDataDevolucao = chqsDataDevolucao;
    }

    public Date getChqsDataCustodia() {
        return chqsDataCustodia;
    }

    public void setChqsDataCustodia(Date chqsDataCustodia) {
        this.chqsDataCustodia = chqsDataCustodia;
    }

    public BigDecimal getChqsSaldo() {
        return chqsSaldo;
    }

    public void setChqsSaldo(BigDecimal chqsSaldo) {
        this.chqsSaldo = chqsSaldo;
    }

    public Date getChqsDataCompensado() {
        return chqsDataCompensado;
    }

    public void setChqsDataCompensado(Date chqsDataCompensado) {
        this.chqsDataCompensado = chqsDataCompensado;
    }

    @XmlTransient
    public List<ChequesTrocas> getChequesTrocasList() {
        return chequesTrocasList;
    }

    public void setChequesTrocasList(List<ChequesTrocas> chequesTrocasList) {
        this.chequesTrocasList = chequesTrocasList;
    }

    @XmlTransient
    public List<ChequesTrocas> getChequesTrocasList1() {
        return chequesTrocasList1;
    }

    public void setChequesTrocasList1(List<ChequesTrocas> chequesTrocasList1) {
        this.chequesTrocasList1 = chequesTrocasList1;
    }

    public Bancos getBancId() {
        return bancId;
    }

    public void setBancId(Bancos bancId) {
        this.bancId = bancId;
    }

    public Cofres getCofrId() {
        return cofrId;
    }

    public void setCofrId(Cofres cofrId) {
        this.cofrId = cofrId;
    }

    public ItensCaixas getItcxId() {
        return itcxId;
    }

    public void setItcxId(ItensCaixas itcxId) {
        this.itcxId = itcxId;
    }

    public Pessoas getPessId() {
        return pessId;
    }

    public void setPessId(Pessoas pessId) {
        this.pessId = pessId;
    }

    public Pessoas getPesPessId() {
        return pesPessId;
    }

    public void setPesPessId(Pessoas pesPessId) {
        this.pesPessId = pesPessId;
    }

    @XmlTransient
    public List<HistoricosCheques> getHistoricosChequesList() {
        return historicosChequesList;
    }

    public void setHistoricosChequesList(List<HistoricosCheques> historicosChequesList) {
        this.historicosChequesList = historicosChequesList;
    }

    @XmlTransient
    public List<ChequesParcelas> getChequesParcelasList() {
        return chequesParcelasList;
    }

    public void setChequesParcelasList(List<ChequesParcelas> chequesParcelasList) {
        this.chequesParcelasList = chequesParcelasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (chqsId != null ? chqsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cheques)) {
            return false;
        }
        Cheques other = (Cheques) object;
        if ((this.chqsId == null && other.chqsId != null) || (this.chqsId != null && !this.chqsId.equals(other.chqsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.Cheques[ chqsId=" + chqsId + " ]";
    }
    
}
