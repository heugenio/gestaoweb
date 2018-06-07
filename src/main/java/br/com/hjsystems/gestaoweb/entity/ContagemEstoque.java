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
@Table(name = "CONTAGEM_ESTOQUE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ContagemEstoque.findAll", query = "SELECT c FROM ContagemEstoque c"),
    @NamedQuery(name = "ContagemEstoque.findByCtesId", query = "SELECT c FROM ContagemEstoque c WHERE c.ctesId = :ctesId"),
    @NamedQuery(name = "ContagemEstoque.findByTestId", query = "SELECT c FROM ContagemEstoque c WHERE c.testId = :testId"),
    @NamedQuery(name = "ContagemEstoque.findByMarcId", query = "SELECT c FROM ContagemEstoque c WHERE c.marcId = :marcId"),
    @NamedQuery(name = "ContagemEstoque.findByCtesUnd", query = "SELECT c FROM ContagemEstoque c WHERE c.ctesUnd = :ctesUnd"),
    @NamedQuery(name = "ContagemEstoque.findByCtesPrecoUnitario", query = "SELECT c FROM ContagemEstoque c WHERE c.ctesPrecoUnitario = :ctesPrecoUnitario"),
    @NamedQuery(name = "ContagemEstoque.findByCtesQtdOld", query = "SELECT c FROM ContagemEstoque c WHERE c.ctesQtdOld = :ctesQtdOld"),
    @NamedQuery(name = "ContagemEstoque.findByCtesQtdNew", query = "SELECT c FROM ContagemEstoque c WHERE c.ctesQtdNew = :ctesQtdNew"),
    @NamedQuery(name = "ContagemEstoque.findByCtesLastupdate", query = "SELECT c FROM ContagemEstoque c WHERE c.ctesLastupdate = :ctesLastupdate"),
    @NamedQuery(name = "ContagemEstoque.findByUsrsId", query = "SELECT c FROM ContagemEstoque c WHERE c.usrsId = :usrsId")})
public class ContagemEstoque implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CTES_ID")
    private String ctesId;
    @Basic(optional = false)
    @Column(name = "TEST_ID")
    private String testId;
    @Column(name = "MARC_ID")
    private String marcId;
    @Column(name = "CTES_UND")
    private String ctesUnd;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "CTES_PRECO_UNITARIO")
    private BigDecimal ctesPrecoUnitario;
    @Column(name = "CTES_QTD_OLD")
    private BigDecimal ctesQtdOld;
    @Column(name = "CTES_QTD_NEW")
    private BigDecimal ctesQtdNew;
    @Column(name = "CTES_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ctesLastupdate;
    @Column(name = "USRS_ID")
    private String usrsId;

    public ContagemEstoque() {
    }

    public ContagemEstoque(String ctesId) {
        this.ctesId = ctesId;
    }

    public ContagemEstoque(String ctesId, String testId) {
        this.ctesId = ctesId;
        this.testId = testId;
    }

    public String getCtesId() {
        return ctesId;
    }

    public void setCtesId(String ctesId) {
        this.ctesId = ctesId;
    }

    public String getTestId() {
        return testId;
    }

    public void setTestId(String testId) {
        this.testId = testId;
    }

    public String getMarcId() {
        return marcId;
    }

    public void setMarcId(String marcId) {
        this.marcId = marcId;
    }

    public String getCtesUnd() {
        return ctesUnd;
    }

    public void setCtesUnd(String ctesUnd) {
        this.ctesUnd = ctesUnd;
    }

    public BigDecimal getCtesPrecoUnitario() {
        return ctesPrecoUnitario;
    }

    public void setCtesPrecoUnitario(BigDecimal ctesPrecoUnitario) {
        this.ctesPrecoUnitario = ctesPrecoUnitario;
    }

    public BigDecimal getCtesQtdOld() {
        return ctesQtdOld;
    }

    public void setCtesQtdOld(BigDecimal ctesQtdOld) {
        this.ctesQtdOld = ctesQtdOld;
    }

    public BigDecimal getCtesQtdNew() {
        return ctesQtdNew;
    }

    public void setCtesQtdNew(BigDecimal ctesQtdNew) {
        this.ctesQtdNew = ctesQtdNew;
    }

    public Date getCtesLastupdate() {
        return ctesLastupdate;
    }

    public void setCtesLastupdate(Date ctesLastupdate) {
        this.ctesLastupdate = ctesLastupdate;
    }

    public String getUsrsId() {
        return usrsId;
    }

    public void setUsrsId(String usrsId) {
        this.usrsId = usrsId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ctesId != null ? ctesId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContagemEstoque)) {
            return false;
        }
        ContagemEstoque other = (ContagemEstoque) object;
        if ((this.ctesId == null && other.ctesId != null) || (this.ctesId != null && !this.ctesId.equals(other.ctesId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.ContagemEstoque[ ctesId=" + ctesId + " ]";
    }
    
}
