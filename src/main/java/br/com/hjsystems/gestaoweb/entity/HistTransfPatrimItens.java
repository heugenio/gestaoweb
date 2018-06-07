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
@Table(name = "HIST_TRANSF_PATRIM_ITENS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HistTransfPatrimItens.findAll", query = "SELECT h FROM HistTransfPatrimItens h"),
    @NamedQuery(name = "HistTransfPatrimItens.findByHtpiId", query = "SELECT h FROM HistTransfPatrimItens h WHERE h.htpiId = :htpiId"),
    @NamedQuery(name = "HistTransfPatrimItens.findByHtpiLastupdate", query = "SELECT h FROM HistTransfPatrimItens h WHERE h.htpiLastupdate = :htpiLastupdate")})
public class HistTransfPatrimItens implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "HTPI_ID")
    private String htpiId;
    @Column(name = "HTPI_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date htpiLastupdate;
    @JoinColumn(name = "DEPT_ID", referencedColumnName = "DEPT_ID")
    @ManyToOne
    private Departamentos deptId;
    @JoinColumn(name = "HTPT_ID", referencedColumnName = "HTPT_ID")
    @ManyToOne
    private HistTransfPatrimonial htptId;
    @JoinColumn(name = "PTRM_ID", referencedColumnName = "PTRM_ID")
    @ManyToOne
    private Patrimonio ptrmId;
    @JoinColumn(name = "UNEM_ID", referencedColumnName = "UNEM_ID")
    @ManyToOne
    private UnidadesEmpresariais unemId;

    public HistTransfPatrimItens() {
    }

    public HistTransfPatrimItens(String htpiId) {
        this.htpiId = htpiId;
    }

    public String getHtpiId() {
        return htpiId;
    }

    public void setHtpiId(String htpiId) {
        this.htpiId = htpiId;
    }

    public Date getHtpiLastupdate() {
        return htpiLastupdate;
    }

    public void setHtpiLastupdate(Date htpiLastupdate) {
        this.htpiLastupdate = htpiLastupdate;
    }

    public Departamentos getDeptId() {
        return deptId;
    }

    public void setDeptId(Departamentos deptId) {
        this.deptId = deptId;
    }

    public HistTransfPatrimonial getHtptId() {
        return htptId;
    }

    public void setHtptId(HistTransfPatrimonial htptId) {
        this.htptId = htptId;
    }

    public Patrimonio getPtrmId() {
        return ptrmId;
    }

    public void setPtrmId(Patrimonio ptrmId) {
        this.ptrmId = ptrmId;
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
        hash += (htpiId != null ? htpiId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HistTransfPatrimItens)) {
            return false;
        }
        HistTransfPatrimItens other = (HistTransfPatrimItens) object;
        if ((this.htpiId == null && other.htpiId != null) || (this.htpiId != null && !this.htpiId.equals(other.htpiId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.HistTransfPatrimItens[ htpiId=" + htpiId + " ]";
    }
    
}
