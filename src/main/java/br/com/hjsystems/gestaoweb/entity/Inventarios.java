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
@Table(name = "INVENTARIOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Inventarios.findAll", query = "SELECT i FROM Inventarios i"),
    @NamedQuery(name = "Inventarios.findByInvtId", query = "SELECT i FROM Inventarios i WHERE i.invtId = :invtId"),
    @NamedQuery(name = "Inventarios.findByInvtQuantidade", query = "SELECT i FROM Inventarios i WHERE i.invtQuantidade = :invtQuantidade"),
    @NamedQuery(name = "Inventarios.findByInvtUnidade", query = "SELECT i FROM Inventarios i WHERE i.invtUnidade = :invtUnidade"),
    @NamedQuery(name = "Inventarios.findByInvtLastupdate", query = "SELECT i FROM Inventarios i WHERE i.invtLastupdate = :invtLastupdate"),
    @NamedQuery(name = "Inventarios.findByInvtValorVenda", query = "SELECT i FROM Inventarios i WHERE i.invtValorVenda = :invtValorVenda"),
    @NamedQuery(name = "Inventarios.findByInvtValorCusto", query = "SELECT i FROM Inventarios i WHERE i.invtValorCusto = :invtValorCusto"),
    @NamedQuery(name = "Inventarios.findByInvtValorMedio", query = "SELECT i FROM Inventarios i WHERE i.invtValorMedio = :invtValorMedio"),
    @NamedQuery(name = "Inventarios.findByInvtMes", query = "SELECT i FROM Inventarios i WHERE i.invtMes = :invtMes"),
    @NamedQuery(name = "Inventarios.findByInvtAno", query = "SELECT i FROM Inventarios i WHERE i.invtAno = :invtAno")})
public class Inventarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "INVT_ID")
    private String invtId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "INVT_QUANTIDADE")
    private BigDecimal invtQuantidade;
    @Column(name = "INVT_UNIDADE")
    private String invtUnidade;
    @Column(name = "INVT_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date invtLastupdate;
    @Column(name = "INVT_VALOR_VENDA")
    private BigDecimal invtValorVenda;
    @Column(name = "INVT_VALOR_CUSTO")
    private BigDecimal invtValorCusto;
    @Column(name = "INVT_VALOR_MEDIO")
    private BigDecimal invtValorMedio;
    @Column(name = "INVT_MES")
    private Integer invtMes;
    @Column(name = "INVT_ANO")
    private Integer invtAno;
    @JoinColumn(name = "PESS_ID", referencedColumnName = "PESS_ID")
    @ManyToOne
    private Pessoas pessId;
    @JoinColumn(name = "PROD_ID", referencedColumnName = "PROD_ID")
    @ManyToOne
    private Produtos prodId;
    @JoinColumn(name = "TEST_ID", referencedColumnName = "TEST_ID")
    @ManyToOne
    private TiposEstoques testId;

    public Inventarios() {
    }

    public Inventarios(String invtId) {
        this.invtId = invtId;
    }

    public Inventarios(String invtId, BigDecimal invtQuantidade) {
        this.invtId = invtId;
        this.invtQuantidade = invtQuantidade;
    }

    public String getInvtId() {
        return invtId;
    }

    public void setInvtId(String invtId) {
        this.invtId = invtId;
    }

    public BigDecimal getInvtQuantidade() {
        return invtQuantidade;
    }

    public void setInvtQuantidade(BigDecimal invtQuantidade) {
        this.invtQuantidade = invtQuantidade;
    }

    public String getInvtUnidade() {
        return invtUnidade;
    }

    public void setInvtUnidade(String invtUnidade) {
        this.invtUnidade = invtUnidade;
    }

    public Date getInvtLastupdate() {
        return invtLastupdate;
    }

    public void setInvtLastupdate(Date invtLastupdate) {
        this.invtLastupdate = invtLastupdate;
    }

    public BigDecimal getInvtValorVenda() {
        return invtValorVenda;
    }

    public void setInvtValorVenda(BigDecimal invtValorVenda) {
        this.invtValorVenda = invtValorVenda;
    }

    public BigDecimal getInvtValorCusto() {
        return invtValorCusto;
    }

    public void setInvtValorCusto(BigDecimal invtValorCusto) {
        this.invtValorCusto = invtValorCusto;
    }

    public BigDecimal getInvtValorMedio() {
        return invtValorMedio;
    }

    public void setInvtValorMedio(BigDecimal invtValorMedio) {
        this.invtValorMedio = invtValorMedio;
    }

    public Integer getInvtMes() {
        return invtMes;
    }

    public void setInvtMes(Integer invtMes) {
        this.invtMes = invtMes;
    }

    public Integer getInvtAno() {
        return invtAno;
    }

    public void setInvtAno(Integer invtAno) {
        this.invtAno = invtAno;
    }

    public Pessoas getPessId() {
        return pessId;
    }

    public void setPessId(Pessoas pessId) {
        this.pessId = pessId;
    }

    public Produtos getProdId() {
        return prodId;
    }

    public void setProdId(Produtos prodId) {
        this.prodId = prodId;
    }

    public TiposEstoques getTestId() {
        return testId;
    }

    public void setTestId(TiposEstoques testId) {
        this.testId = testId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invtId != null ? invtId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Inventarios)) {
            return false;
        }
        Inventarios other = (Inventarios) object;
        if ((this.invtId == null && other.invtId != null) || (this.invtId != null && !this.invtId.equals(other.invtId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.Inventarios[ invtId=" + invtId + " ]";
    }
    
}
