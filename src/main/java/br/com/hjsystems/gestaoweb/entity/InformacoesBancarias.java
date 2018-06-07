/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hjsystems.gestaoweb.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
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
@Table(name = "INFORMACOES_BANCARIAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "InformacoesBancarias.findAll", query = "SELECT i FROM InformacoesBancarias i"),
    @NamedQuery(name = "InformacoesBancarias.findByIfbcId", query = "SELECT i FROM InformacoesBancarias i WHERE i.ifbcId = :ifbcId"),
    @NamedQuery(name = "InformacoesBancarias.findByIfbcConta", query = "SELECT i FROM InformacoesBancarias i WHERE i.ifbcConta = :ifbcConta"),
    @NamedQuery(name = "InformacoesBancarias.findByIfbcClienteDesde", query = "SELECT i FROM InformacoesBancarias i WHERE i.ifbcClienteDesde = :ifbcClienteDesde"),
    @NamedQuery(name = "InformacoesBancarias.findByIfbcTipoConta", query = "SELECT i FROM InformacoesBancarias i WHERE i.ifbcTipoConta = :ifbcTipoConta"),
    @NamedQuery(name = "InformacoesBancarias.findByIfbcAtendente", query = "SELECT i FROM InformacoesBancarias i WHERE i.ifbcAtendente = :ifbcAtendente"),
    @NamedQuery(name = "InformacoesBancarias.findByIfbcCidade", query = "SELECT i FROM InformacoesBancarias i WHERE i.ifbcCidade = :ifbcCidade"),
    @NamedQuery(name = "InformacoesBancarias.findByIfbcAgenNumero", query = "SELECT i FROM InformacoesBancarias i WHERE i.ifbcAgenNumero = :ifbcAgenNumero"),
    @NamedQuery(name = "InformacoesBancarias.findByIfbcAgenNome", query = "SELECT i FROM InformacoesBancarias i WHERE i.ifbcAgenNome = :ifbcAgenNome"),
    @NamedQuery(name = "InformacoesBancarias.findByIfbcAgenFone", query = "SELECT i FROM InformacoesBancarias i WHERE i.ifbcAgenFone = :ifbcAgenFone"),
    @NamedQuery(name = "InformacoesBancarias.findByIfBcLASTUPDATE", query = "SELECT i FROM InformacoesBancarias i WHERE i.ifBcLASTUPDATE = :ifBcLASTUPDATE")})
public class InformacoesBancarias implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IFBC_ID")
    private String ifbcId;
    @Column(name = "IFBC_CONTA")
    private String ifbcConta;
    @Column(name = "IFBC_CLIENTE_DESDE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ifbcClienteDesde;
    @Lob
    @Column(name = "IFBC_OBSERVACAO")
    private String ifbcObservacao;
    @Basic(optional = false)
    @Column(name = "IFBC_TIPO_CONTA")
    private String ifbcTipoConta;
    @Column(name = "IFBC_ATENDENTE")
    private String ifbcAtendente;
    @Column(name = "IFBC_CIDADE")
    private String ifbcCidade;
    @Column(name = "IFBC_AGEN_NUMERO")
    private String ifbcAgenNumero;
    @Column(name = "IFBC_AGEN_NOME")
    private String ifbcAgenNome;
    @Column(name = "IFBC_AGEN_FONE")
    private String ifbcAgenFone;
    @Column(name = "IfBc_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ifBcLASTUPDATE;
    @JoinColumn(name = "BANC_ID", referencedColumnName = "BANC_ID")
    @ManyToOne
    private Bancos bancId;
    @JoinColumn(name = "CLNT_ID", referencedColumnName = "CLNT_ID")
    @ManyToOne
    private Clientes clntId;

    public InformacoesBancarias() {
    }

    public InformacoesBancarias(String ifbcId) {
        this.ifbcId = ifbcId;
    }

    public InformacoesBancarias(String ifbcId, String ifbcTipoConta) {
        this.ifbcId = ifbcId;
        this.ifbcTipoConta = ifbcTipoConta;
    }

    public String getIfbcId() {
        return ifbcId;
    }

    public void setIfbcId(String ifbcId) {
        this.ifbcId = ifbcId;
    }

    public String getIfbcConta() {
        return ifbcConta;
    }

    public void setIfbcConta(String ifbcConta) {
        this.ifbcConta = ifbcConta;
    }

    public Date getIfbcClienteDesde() {
        return ifbcClienteDesde;
    }

    public void setIfbcClienteDesde(Date ifbcClienteDesde) {
        this.ifbcClienteDesde = ifbcClienteDesde;
    }

    public String getIfbcObservacao() {
        return ifbcObservacao;
    }

    public void setIfbcObservacao(String ifbcObservacao) {
        this.ifbcObservacao = ifbcObservacao;
    }

    public String getIfbcTipoConta() {
        return ifbcTipoConta;
    }

    public void setIfbcTipoConta(String ifbcTipoConta) {
        this.ifbcTipoConta = ifbcTipoConta;
    }

    public String getIfbcAtendente() {
        return ifbcAtendente;
    }

    public void setIfbcAtendente(String ifbcAtendente) {
        this.ifbcAtendente = ifbcAtendente;
    }

    public String getIfbcCidade() {
        return ifbcCidade;
    }

    public void setIfbcCidade(String ifbcCidade) {
        this.ifbcCidade = ifbcCidade;
    }

    public String getIfbcAgenNumero() {
        return ifbcAgenNumero;
    }

    public void setIfbcAgenNumero(String ifbcAgenNumero) {
        this.ifbcAgenNumero = ifbcAgenNumero;
    }

    public String getIfbcAgenNome() {
        return ifbcAgenNome;
    }

    public void setIfbcAgenNome(String ifbcAgenNome) {
        this.ifbcAgenNome = ifbcAgenNome;
    }

    public String getIfbcAgenFone() {
        return ifbcAgenFone;
    }

    public void setIfbcAgenFone(String ifbcAgenFone) {
        this.ifbcAgenFone = ifbcAgenFone;
    }

    public Date getIfBcLASTUPDATE() {
        return ifBcLASTUPDATE;
    }

    public void setIfBcLASTUPDATE(Date ifBcLASTUPDATE) {
        this.ifBcLASTUPDATE = ifBcLASTUPDATE;
    }

    public Bancos getBancId() {
        return bancId;
    }

    public void setBancId(Bancos bancId) {
        this.bancId = bancId;
    }

    public Clientes getClntId() {
        return clntId;
    }

    public void setClntId(Clientes clntId) {
        this.clntId = clntId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ifbcId != null ? ifbcId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InformacoesBancarias)) {
            return false;
        }
        InformacoesBancarias other = (InformacoesBancarias) object;
        if ((this.ifbcId == null && other.ifbcId != null) || (this.ifbcId != null && !this.ifbcId.equals(other.ifbcId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.InformacoesBancarias[ ifbcId=" + ifbcId + " ]";
    }
    
}
