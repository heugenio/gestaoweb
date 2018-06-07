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
@Table(name = "DEPARTAMENTOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Departamentos.findAll", query = "SELECT d FROM Departamentos d"),
    @NamedQuery(name = "Departamentos.findByDeptId", query = "SELECT d FROM Departamentos d WHERE d.deptId = :deptId"),
    @NamedQuery(name = "Departamentos.findByDeptConta", query = "SELECT d FROM Departamentos d WHERE d.deptConta = :deptConta"),
    @NamedQuery(name = "Departamentos.findByDeptNome", query = "SELECT d FROM Departamentos d WHERE d.deptNome = :deptNome"),
    @NamedQuery(name = "Departamentos.findByDeptLASTUPDATE", query = "SELECT d FROM Departamentos d WHERE d.deptLASTUPDATE = :deptLASTUPDATE")})
public class Departamentos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DEPT_ID")
    private String deptId;
    @Basic(optional = false)
    @Column(name = "DEPT_CONTA")
    private String deptConta;
    @Basic(optional = false)
    @Column(name = "DEPT_NOME")
    private String deptNome;
    @Column(name = "Dept_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date deptLASTUPDATE;
    @OneToMany(mappedBy = "deptId")
    private List<HistTransfPatrimItens> histTransfPatrimItensList;
    @OneToMany(mappedBy = "deptId")
    private List<Titulos> titulosList;
    @OneToMany(mappedBy = "deptId")
    private List<Patrimonio> patrimonioList;

    public Departamentos() {
    }

    public Departamentos(String deptId) {
        this.deptId = deptId;
    }

    public Departamentos(String deptId, String deptConta, String deptNome) {
        this.deptId = deptId;
        this.deptConta = deptConta;
        this.deptNome = deptNome;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDeptConta() {
        return deptConta;
    }

    public void setDeptConta(String deptConta) {
        this.deptConta = deptConta;
    }

    public String getDeptNome() {
        return deptNome;
    }

    public void setDeptNome(String deptNome) {
        this.deptNome = deptNome;
    }

    public Date getDeptLASTUPDATE() {
        return deptLASTUPDATE;
    }

    public void setDeptLASTUPDATE(Date deptLASTUPDATE) {
        this.deptLASTUPDATE = deptLASTUPDATE;
    }

    @XmlTransient
    public List<HistTransfPatrimItens> getHistTransfPatrimItensList() {
        return histTransfPatrimItensList;
    }

    public void setHistTransfPatrimItensList(List<HistTransfPatrimItens> histTransfPatrimItensList) {
        this.histTransfPatrimItensList = histTransfPatrimItensList;
    }

    @XmlTransient
    public List<Titulos> getTitulosList() {
        return titulosList;
    }

    public void setTitulosList(List<Titulos> titulosList) {
        this.titulosList = titulosList;
    }

    @XmlTransient
    public List<Patrimonio> getPatrimonioList() {
        return patrimonioList;
    }

    public void setPatrimonioList(List<Patrimonio> patrimonioList) {
        this.patrimonioList = patrimonioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (deptId != null ? deptId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Departamentos)) {
            return false;
        }
        Departamentos other = (Departamentos) object;
        if ((this.deptId == null && other.deptId != null) || (this.deptId != null && !this.deptId.equals(other.deptId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.Departamentos[ deptId=" + deptId + " ]";
    }
    
}
