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
@Table(name = "MOVIMENTOS_CAIXAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MovimentosCaixas.findAll", query = "SELECT m FROM MovimentosCaixas m"),
    @NamedQuery(name = "MovimentosCaixas.findByMvcxId", query = "SELECT m FROM MovimentosCaixas m WHERE m.mvcxId = :mvcxId"),
    @NamedQuery(name = "MovimentosCaixas.findByMvcxNumero", query = "SELECT m FROM MovimentosCaixas m WHERE m.mvcxNumero = :mvcxNumero"),
    @NamedQuery(name = "MovimentosCaixas.findByMvcxAbertura", query = "SELECT m FROM MovimentosCaixas m WHERE m.mvcxAbertura = :mvcxAbertura"),
    @NamedQuery(name = "MovimentosCaixas.findByMvcxFechamento", query = "SELECT m FROM MovimentosCaixas m WHERE m.mvcxFechamento = :mvcxFechamento"),
    @NamedQuery(name = "MovimentosCaixas.findByMvcxCredito", query = "SELECT m FROM MovimentosCaixas m WHERE m.mvcxCredito = :mvcxCredito"),
    @NamedQuery(name = "MovimentosCaixas.findByMvcxDebito", query = "SELECT m FROM MovimentosCaixas m WHERE m.mvcxDebito = :mvcxDebito"),
    @NamedQuery(name = "MovimentosCaixas.findByMvCxLASTUPDATE", query = "SELECT m FROM MovimentosCaixas m WHERE m.mvCxLASTUPDATE = :mvCxLASTUPDATE")})
public class MovimentosCaixas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MVCX_ID")
    private String mvcxId;
    @Basic(optional = false)
    @Column(name = "MVCX_NUMERO")
    private String mvcxNumero;
    @Basic(optional = false)
    @Column(name = "MVCX_ABERTURA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mvcxAbertura;
    @Column(name = "MVCX_FECHAMENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mvcxFechamento;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "MVCX_CREDITO")
    private BigDecimal mvcxCredito;
    @Basic(optional = false)
    @Column(name = "MVCX_DEBITO")
    private BigDecimal mvcxDebito;
    @Column(name = "MvCx_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mvCxLASTUPDATE;
    @OneToMany(mappedBy = "mvcxId")
    private List<ItensCaixas> itensCaixasList;
    @OneToMany(mappedBy = "movMvcxId")
    private List<ItensCaixas> itensCaixasList1;
    @JoinColumn(name = "COFR_ID", referencedColumnName = "COFR_ID")
    @ManyToOne
    private Cofres cofrId;

    public MovimentosCaixas() {
    }

    public MovimentosCaixas(String mvcxId) {
        this.mvcxId = mvcxId;
    }

    public MovimentosCaixas(String mvcxId, String mvcxNumero, Date mvcxAbertura, BigDecimal mvcxCredito, BigDecimal mvcxDebito) {
        this.mvcxId = mvcxId;
        this.mvcxNumero = mvcxNumero;
        this.mvcxAbertura = mvcxAbertura;
        this.mvcxCredito = mvcxCredito;
        this.mvcxDebito = mvcxDebito;
    }

    public String getMvcxId() {
        return mvcxId;
    }

    public void setMvcxId(String mvcxId) {
        this.mvcxId = mvcxId;
    }

    public String getMvcxNumero() {
        return mvcxNumero;
    }

    public void setMvcxNumero(String mvcxNumero) {
        this.mvcxNumero = mvcxNumero;
    }

    public Date getMvcxAbertura() {
        return mvcxAbertura;
    }

    public void setMvcxAbertura(Date mvcxAbertura) {
        this.mvcxAbertura = mvcxAbertura;
    }

    public Date getMvcxFechamento() {
        return mvcxFechamento;
    }

    public void setMvcxFechamento(Date mvcxFechamento) {
        this.mvcxFechamento = mvcxFechamento;
    }

    public BigDecimal getMvcxCredito() {
        return mvcxCredito;
    }

    public void setMvcxCredito(BigDecimal mvcxCredito) {
        this.mvcxCredito = mvcxCredito;
    }

    public BigDecimal getMvcxDebito() {
        return mvcxDebito;
    }

    public void setMvcxDebito(BigDecimal mvcxDebito) {
        this.mvcxDebito = mvcxDebito;
    }

    public Date getMvCxLASTUPDATE() {
        return mvCxLASTUPDATE;
    }

    public void setMvCxLASTUPDATE(Date mvCxLASTUPDATE) {
        this.mvCxLASTUPDATE = mvCxLASTUPDATE;
    }

    @XmlTransient
    public List<ItensCaixas> getItensCaixasList() {
        return itensCaixasList;
    }

    public void setItensCaixasList(List<ItensCaixas> itensCaixasList) {
        this.itensCaixasList = itensCaixasList;
    }

    @XmlTransient
    public List<ItensCaixas> getItensCaixasList1() {
        return itensCaixasList1;
    }

    public void setItensCaixasList1(List<ItensCaixas> itensCaixasList1) {
        this.itensCaixasList1 = itensCaixasList1;
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
        hash += (mvcxId != null ? mvcxId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MovimentosCaixas)) {
            return false;
        }
        MovimentosCaixas other = (MovimentosCaixas) object;
        if ((this.mvcxId == null && other.mvcxId != null) || (this.mvcxId != null && !this.mvcxId.equals(other.mvcxId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.MovimentosCaixas[ mvcxId=" + mvcxId + " ]";
    }
    
}
