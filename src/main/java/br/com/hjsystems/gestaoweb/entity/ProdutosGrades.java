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
@Table(name = "PRODUTOS_GRADES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProdutosGrades.findAll", query = "SELECT p FROM ProdutosGrades p"),
    @NamedQuery(name = "ProdutosGrades.findByPdgdId", query = "SELECT p FROM ProdutosGrades p WHERE p.pdgdId = :pdgdId"),
    @NamedQuery(name = "ProdutosGrades.findByPdgdLastupdate", query = "SELECT p FROM ProdutosGrades p WHERE p.pdgdLastupdate = :pdgdLastupdate"),
    @NamedQuery(name = "ProdutosGrades.findByTestId", query = "SELECT p FROM ProdutosGrades p WHERE p.testId = :testId"),
    @NamedQuery(name = "ProdutosGrades.findByGrdeId", query = "SELECT p FROM ProdutosGrades p WHERE p.grdeId = :grdeId"),
    @NamedQuery(name = "ProdutosGrades.findByGraGrdeId", query = "SELECT p FROM ProdutosGrades p WHERE p.graGrdeId = :graGrdeId"),
    @NamedQuery(name = "ProdutosGrades.findByPdgdCodBarra", query = "SELECT p FROM ProdutosGrades p WHERE p.pdgdCodBarra = :pdgdCodBarra")})
public class ProdutosGrades implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PDGD_ID")
    private String pdgdId;
    @Column(name = "PDGD_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pdgdLastupdate;
    @Column(name = "TEST_ID")
    private String testId;
    @Column(name = "GRDE_ID")
    private String grdeId;
    @Column(name = "GRA_GRDE_ID")
    private String graGrdeId;
    @Column(name = "PDGD_COD_BARRA")
    private String pdgdCodBarra;
    @OneToMany(mappedBy = "pdgdId")
    private List<TiposEstoques> tiposEstoquesList;
    @JoinColumn(name = "GRA_GREL_ID", referencedColumnName = "GREL_ID")
    @ManyToOne
    private GradesElementos graGrelId;
    @JoinColumn(name = "GREL_ID", referencedColumnName = "GREL_ID")
    @ManyToOne
    private GradesElementos grelId;
    @JoinColumn(name = "PROD_ID", referencedColumnName = "PROD_ID")
    @ManyToOne
    private Produtos prodId;

    public ProdutosGrades() {
    }

    public ProdutosGrades(String pdgdId) {
        this.pdgdId = pdgdId;
    }

    public String getPdgdId() {
        return pdgdId;
    }

    public void setPdgdId(String pdgdId) {
        this.pdgdId = pdgdId;
    }

    public Date getPdgdLastupdate() {
        return pdgdLastupdate;
    }

    public void setPdgdLastupdate(Date pdgdLastupdate) {
        this.pdgdLastupdate = pdgdLastupdate;
    }

    public String getTestId() {
        return testId;
    }

    public void setTestId(String testId) {
        this.testId = testId;
    }

    public String getGrdeId() {
        return grdeId;
    }

    public void setGrdeId(String grdeId) {
        this.grdeId = grdeId;
    }

    public String getGraGrdeId() {
        return graGrdeId;
    }

    public void setGraGrdeId(String graGrdeId) {
        this.graGrdeId = graGrdeId;
    }

    public String getPdgdCodBarra() {
        return pdgdCodBarra;
    }

    public void setPdgdCodBarra(String pdgdCodBarra) {
        this.pdgdCodBarra = pdgdCodBarra;
    }

    @XmlTransient
    public List<TiposEstoques> getTiposEstoquesList() {
        return tiposEstoquesList;
    }

    public void setTiposEstoquesList(List<TiposEstoques> tiposEstoquesList) {
        this.tiposEstoquesList = tiposEstoquesList;
    }

    public GradesElementos getGraGrelId() {
        return graGrelId;
    }

    public void setGraGrelId(GradesElementos graGrelId) {
        this.graGrelId = graGrelId;
    }

    public GradesElementos getGrelId() {
        return grelId;
    }

    public void setGrelId(GradesElementos grelId) {
        this.grelId = grelId;
    }

    public Produtos getProdId() {
        return prodId;
    }

    public void setProdId(Produtos prodId) {
        this.prodId = prodId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pdgdId != null ? pdgdId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProdutosGrades)) {
            return false;
        }
        ProdutosGrades other = (ProdutosGrades) object;
        if ((this.pdgdId == null && other.pdgdId != null) || (this.pdgdId != null && !this.pdgdId.equals(other.pdgdId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.ProdutosGrades[ pdgdId=" + pdgdId + " ]";
    }
    
}
