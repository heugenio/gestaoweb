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
@Table(name = "GRADES_ELEMENTOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GradesElementos.findAll", query = "SELECT g FROM GradesElementos g"),
    @NamedQuery(name = "GradesElementos.findByGrelId", query = "SELECT g FROM GradesElementos g WHERE g.grelId = :grelId"),
    @NamedQuery(name = "GradesElementos.findByGrelSigla", query = "SELECT g FROM GradesElementos g WHERE g.grelSigla = :grelSigla"),
    @NamedQuery(name = "GradesElementos.findByGrelDescricao", query = "SELECT g FROM GradesElementos g WHERE g.grelDescricao = :grelDescricao"),
    @NamedQuery(name = "GradesElementos.findByGrelLastupdate", query = "SELECT g FROM GradesElementos g WHERE g.grelLastupdate = :grelLastupdate")})
public class GradesElementos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "GREL_ID")
    private String grelId;
    @Column(name = "GREL_SIGLA")
    private String grelSigla;
    @Column(name = "GREL_DESCRICAO")
    private String grelDescricao;
    @Column(name = "GREL_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date grelLastupdate;
    @JoinColumn(name = "GRDE_ID", referencedColumnName = "GRDE_ID")
    @ManyToOne
    private Grades grdeId;
    @OneToMany(mappedBy = "graGrelId")
    private List<ProdutosGrades> produtosGradesList;
    @OneToMany(mappedBy = "grelId")
    private List<ProdutosGrades> produtosGradesList1;

    public GradesElementos() {
    }

    public GradesElementos(String grelId) {
        this.grelId = grelId;
    }

    public String getGrelId() {
        return grelId;
    }

    public void setGrelId(String grelId) {
        this.grelId = grelId;
    }

    public String getGrelSigla() {
        return grelSigla;
    }

    public void setGrelSigla(String grelSigla) {
        this.grelSigla = grelSigla;
    }

    public String getGrelDescricao() {
        return grelDescricao;
    }

    public void setGrelDescricao(String grelDescricao) {
        this.grelDescricao = grelDescricao;
    }

    public Date getGrelLastupdate() {
        return grelLastupdate;
    }

    public void setGrelLastupdate(Date grelLastupdate) {
        this.grelLastupdate = grelLastupdate;
    }

    public Grades getGrdeId() {
        return grdeId;
    }

    public void setGrdeId(Grades grdeId) {
        this.grdeId = grdeId;
    }

    @XmlTransient
    public List<ProdutosGrades> getProdutosGradesList() {
        return produtosGradesList;
    }

    public void setProdutosGradesList(List<ProdutosGrades> produtosGradesList) {
        this.produtosGradesList = produtosGradesList;
    }

    @XmlTransient
    public List<ProdutosGrades> getProdutosGradesList1() {
        return produtosGradesList1;
    }

    public void setProdutosGradesList1(List<ProdutosGrades> produtosGradesList1) {
        this.produtosGradesList1 = produtosGradesList1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (grelId != null ? grelId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GradesElementos)) {
            return false;
        }
        GradesElementos other = (GradesElementos) object;
        if ((this.grelId == null && other.grelId != null) || (this.grelId != null && !this.grelId.equals(other.grelId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.GradesElementos[ grelId=" + grelId + " ]";
    }
    
}
