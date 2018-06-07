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
@Table(name = "BANCOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bancos.findAll", query = "SELECT b FROM Bancos b"),
    @NamedQuery(name = "Bancos.findByBancId", query = "SELECT b FROM Bancos b WHERE b.bancId = :bancId"),
    @NamedQuery(name = "Bancos.findByBancCodigo", query = "SELECT b FROM Bancos b WHERE b.bancCodigo = :bancCodigo"),
    @NamedQuery(name = "Bancos.findByBancNome", query = "SELECT b FROM Bancos b WHERE b.bancNome = :bancNome"),
    @NamedQuery(name = "Bancos.findByBancApelido", query = "SELECT b FROM Bancos b WHERE b.bancApelido = :bancApelido"),
    @NamedQuery(name = "Bancos.findByBancLocalPagamento", query = "SELECT b FROM Bancos b WHERE b.bancLocalPagamento = :bancLocalPagamento"),
    @NamedQuery(name = "Bancos.findByBancSituacao", query = "SELECT b FROM Bancos b WHERE b.bancSituacao = :bancSituacao"),
    @NamedQuery(name = "Bancos.findByBancLASTUPDATE", query = "SELECT b FROM Bancos b WHERE b.bancLASTUPDATE = :bancLASTUPDATE"),
    @NamedQuery(name = "Bancos.findByBancChequeSeqInicial", query = "SELECT b FROM Bancos b WHERE b.bancChequeSeqInicial = :bancChequeSeqInicial"),
    @NamedQuery(name = "Bancos.findByBancChequeSeqAtual", query = "SELECT b FROM Bancos b WHERE b.bancChequeSeqAtual = :bancChequeSeqAtual"),
    @NamedQuery(name = "Bancos.findByBancChequeSeqFinal", query = "SELECT b FROM Bancos b WHERE b.bancChequeSeqFinal = :bancChequeSeqFinal"),
    @NamedQuery(name = "Bancos.findByBancDigito", query = "SELECT b FROM Bancos b WHERE b.bancDigito = :bancDigito")})
public class Bancos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "BANC_ID")
    private String bancId;
    @Basic(optional = false)
    @Column(name = "BANC_CODIGO")
    private String bancCodigo;
    @Column(name = "BANC_NOME")
    private String bancNome;
    @Column(name = "BANC_APELIDO")
    private String bancApelido;
    @Column(name = "BANC_LOCAL_PAGAMENTO")
    private String bancLocalPagamento;
    @Basic(optional = false)
    @Column(name = "BANC_SITUACAO")
    private String bancSituacao;
    @Column(name = "Banc_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date bancLASTUPDATE;
    @Column(name = "BANC_CHEQUE_SEQ_INICIAL")
    private Long bancChequeSeqInicial;
    @Column(name = "BANC_CHEQUE_SEQ_ATUAL")
    private Long bancChequeSeqAtual;
    @Column(name = "BANC_CHEQUE_SEQ_FINAL")
    private Long bancChequeSeqFinal;
    @Column(name = "BANC_DIGITO")
    private Character bancDigito;
    @OneToMany(mappedBy = "bancId")
    private List<InformacoesBancarias> informacoesBancariasList;
    @OneToMany(mappedBy = "bancId")
    private List<ModelosCheques> modelosChequesList;
    @OneToMany(mappedBy = "bancId")
    private List<Agencias> agenciasList;
    @OneToMany(mappedBy = "bancId")
    private List<Cheques> chequesList;

    public Bancos() {
    }

    public Bancos(String bancId) {
        this.bancId = bancId;
    }

    public Bancos(String bancId, String bancCodigo, String bancSituacao) {
        this.bancId = bancId;
        this.bancCodigo = bancCodigo;
        this.bancSituacao = bancSituacao;
    }

    public String getBancId() {
        return bancId;
    }

    public void setBancId(String bancId) {
        this.bancId = bancId;
    }

    public String getBancCodigo() {
        return bancCodigo;
    }

    public void setBancCodigo(String bancCodigo) {
        this.bancCodigo = bancCodigo;
    }

    public String getBancNome() {
        return bancNome;
    }

    public void setBancNome(String bancNome) {
        this.bancNome = bancNome;
    }

    public String getBancApelido() {
        return bancApelido;
    }

    public void setBancApelido(String bancApelido) {
        this.bancApelido = bancApelido;
    }

    public String getBancLocalPagamento() {
        return bancLocalPagamento;
    }

    public void setBancLocalPagamento(String bancLocalPagamento) {
        this.bancLocalPagamento = bancLocalPagamento;
    }

    public String getBancSituacao() {
        return bancSituacao;
    }

    public void setBancSituacao(String bancSituacao) {
        this.bancSituacao = bancSituacao;
    }

    public Date getBancLASTUPDATE() {
        return bancLASTUPDATE;
    }

    public void setBancLASTUPDATE(Date bancLASTUPDATE) {
        this.bancLASTUPDATE = bancLASTUPDATE;
    }

    public Long getBancChequeSeqInicial() {
        return bancChequeSeqInicial;
    }

    public void setBancChequeSeqInicial(Long bancChequeSeqInicial) {
        this.bancChequeSeqInicial = bancChequeSeqInicial;
    }

    public Long getBancChequeSeqAtual() {
        return bancChequeSeqAtual;
    }

    public void setBancChequeSeqAtual(Long bancChequeSeqAtual) {
        this.bancChequeSeqAtual = bancChequeSeqAtual;
    }

    public Long getBancChequeSeqFinal() {
        return bancChequeSeqFinal;
    }

    public void setBancChequeSeqFinal(Long bancChequeSeqFinal) {
        this.bancChequeSeqFinal = bancChequeSeqFinal;
    }

    public Character getBancDigito() {
        return bancDigito;
    }

    public void setBancDigito(Character bancDigito) {
        this.bancDigito = bancDigito;
    }

    @XmlTransient
    public List<InformacoesBancarias> getInformacoesBancariasList() {
        return informacoesBancariasList;
    }

    public void setInformacoesBancariasList(List<InformacoesBancarias> informacoesBancariasList) {
        this.informacoesBancariasList = informacoesBancariasList;
    }

    @XmlTransient
    public List<ModelosCheques> getModelosChequesList() {
        return modelosChequesList;
    }

    public void setModelosChequesList(List<ModelosCheques> modelosChequesList) {
        this.modelosChequesList = modelosChequesList;
    }

    @XmlTransient
    public List<Agencias> getAgenciasList() {
        return agenciasList;
    }

    public void setAgenciasList(List<Agencias> agenciasList) {
        this.agenciasList = agenciasList;
    }

    @XmlTransient
    public List<Cheques> getChequesList() {
        return chequesList;
    }

    public void setChequesList(List<Cheques> chequesList) {
        this.chequesList = chequesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bancId != null ? bancId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bancos)) {
            return false;
        }
        Bancos other = (Bancos) object;
        if ((this.bancId == null && other.bancId != null) || (this.bancId != null && !this.bancId.equals(other.bancId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.Bancos[ bancId=" + bancId + " ]";
    }
    
}
