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
@Table(name = "PRODUTOS_SERIES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProdutosSeries.findAll", query = "SELECT p FROM ProdutosSeries p"),
    @NamedQuery(name = "ProdutosSeries.findByPrsrId", query = "SELECT p FROM ProdutosSeries p WHERE p.prsrId = :prsrId"),
    @NamedQuery(name = "ProdutosSeries.findByPrsrSerie", query = "SELECT p FROM ProdutosSeries p WHERE p.prsrSerie = :prsrSerie"),
    @NamedQuery(name = "ProdutosSeries.findByPrsrLastupdate", query = "SELECT p FROM ProdutosSeries p WHERE p.prsrLastupdate = :prsrLastupdate")})
public class ProdutosSeries implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PRSR_ID")
    private String prsrId;
    @Basic(optional = false)
    @Column(name = "PRSR_SERIE")
    private String prsrSerie;
    @Column(name = "PRSR_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date prsrLastupdate;
    @JoinColumn(name = "ITFT_ID", referencedColumnName = "ITFT_ID")
    @ManyToOne
    private ItensFaturados itftId;
    @JoinColumn(name = "TEST_ID", referencedColumnName = "TEST_ID")
    @ManyToOne
    private TiposEstoques testId;
    @OneToMany(mappedBy = "prsrId")
    private List<ItensEntregados> itensEntregadosList;

    public ProdutosSeries() {
    }

    public ProdutosSeries(String prsrId) {
        this.prsrId = prsrId;
    }

    public ProdutosSeries(String prsrId, String prsrSerie) {
        this.prsrId = prsrId;
        this.prsrSerie = prsrSerie;
    }

    public String getPrsrId() {
        return prsrId;
    }

    public void setPrsrId(String prsrId) {
        this.prsrId = prsrId;
    }

    public String getPrsrSerie() {
        return prsrSerie;
    }

    public void setPrsrSerie(String prsrSerie) {
        this.prsrSerie = prsrSerie;
    }

    public Date getPrsrLastupdate() {
        return prsrLastupdate;
    }

    public void setPrsrLastupdate(Date prsrLastupdate) {
        this.prsrLastupdate = prsrLastupdate;
    }

    public ItensFaturados getItftId() {
        return itftId;
    }

    public void setItftId(ItensFaturados itftId) {
        this.itftId = itftId;
    }

    public TiposEstoques getTestId() {
        return testId;
    }

    public void setTestId(TiposEstoques testId) {
        this.testId = testId;
    }

    @XmlTransient
    public List<ItensEntregados> getItensEntregadosList() {
        return itensEntregadosList;
    }

    public void setItensEntregadosList(List<ItensEntregados> itensEntregadosList) {
        this.itensEntregadosList = itensEntregadosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prsrId != null ? prsrId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProdutosSeries)) {
            return false;
        }
        ProdutosSeries other = (ProdutosSeries) object;
        if ((this.prsrId == null && other.prsrId != null) || (this.prsrId != null && !this.prsrId.equals(other.prsrId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.ProdutosSeries[ prsrId=" + prsrId + " ]";
    }
    
}
