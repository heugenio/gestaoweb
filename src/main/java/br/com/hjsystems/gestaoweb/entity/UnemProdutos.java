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
@Table(name = "UNEM_PRODUTOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UnemProdutos.findAll", query = "SELECT u FROM UnemProdutos u"),
    @NamedQuery(name = "UnemProdutos.findByUepdId", query = "SELECT u FROM UnemProdutos u WHERE u.uepdId = :uepdId"),
    @NamedQuery(name = "UnemProdutos.findByUepdLastupdate", query = "SELECT u FROM UnemProdutos u WHERE u.uepdLastupdate = :uepdLastupdate"),
    @NamedQuery(name = "UnemProdutos.findByUepdEstoqueMinimo", query = "SELECT u FROM UnemProdutos u WHERE u.uepdEstoqueMinimo = :uepdEstoqueMinimo"),
    @NamedQuery(name = "UnemProdutos.findByUepdEstoqueMaximo", query = "SELECT u FROM UnemProdutos u WHERE u.uepdEstoqueMaximo = :uepdEstoqueMaximo")})
public class UnemProdutos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "UEPD_ID")
    private String uepdId;
    @Lob
    @Column(name = "UEPD_DESCRICAO_ESTENDIDA")
    private String uepdDescricaoEstendida;
    @Column(name = "UEPD_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date uepdLastupdate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "UEPD_ESTOQUE_MINIMO")
    private BigDecimal uepdEstoqueMinimo;
    @Column(name = "UEPD_ESTOQUE_MAXIMO")
    private BigDecimal uepdEstoqueMaximo;
    @JoinColumn(name = "PROD_ID", referencedColumnName = "PROD_ID")
    @ManyToOne
    private Produtos prodId;
    @JoinColumn(name = "UNEM_ID", referencedColumnName = "UNEM_ID")
    @ManyToOne
    private UnidadesEmpresariais unemId;

    public UnemProdutos() {
    }

    public UnemProdutos(String uepdId) {
        this.uepdId = uepdId;
    }

    public String getUepdId() {
        return uepdId;
    }

    public void setUepdId(String uepdId) {
        this.uepdId = uepdId;
    }

    public String getUepdDescricaoEstendida() {
        return uepdDescricaoEstendida;
    }

    public void setUepdDescricaoEstendida(String uepdDescricaoEstendida) {
        this.uepdDescricaoEstendida = uepdDescricaoEstendida;
    }

    public Date getUepdLastupdate() {
        return uepdLastupdate;
    }

    public void setUepdLastupdate(Date uepdLastupdate) {
        this.uepdLastupdate = uepdLastupdate;
    }

    public BigDecimal getUepdEstoqueMinimo() {
        return uepdEstoqueMinimo;
    }

    public void setUepdEstoqueMinimo(BigDecimal uepdEstoqueMinimo) {
        this.uepdEstoqueMinimo = uepdEstoqueMinimo;
    }

    public BigDecimal getUepdEstoqueMaximo() {
        return uepdEstoqueMaximo;
    }

    public void setUepdEstoqueMaximo(BigDecimal uepdEstoqueMaximo) {
        this.uepdEstoqueMaximo = uepdEstoqueMaximo;
    }

    public Produtos getProdId() {
        return prodId;
    }

    public void setProdId(Produtos prodId) {
        this.prodId = prodId;
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
        hash += (uepdId != null ? uepdId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UnemProdutos)) {
            return false;
        }
        UnemProdutos other = (UnemProdutos) object;
        if ((this.uepdId == null && other.uepdId != null) || (this.uepdId != null && !this.uepdId.equals(other.uepdId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.UnemProdutos[ uepdId=" + uepdId + " ]";
    }
    
}
