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
import javax.persistence.Lob;
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
@Table(name = "FUNCIONARIOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Funcionarios.findAll", query = "SELECT f FROM Funcionarios f"),
    @NamedQuery(name = "Funcionarios.findByFuncId", query = "SELECT f FROM Funcionarios f WHERE f.funcId = :funcId"),
    @NamedQuery(name = "Funcionarios.findByFuncMatricula", query = "SELECT f FROM Funcionarios f WHERE f.funcMatricula = :funcMatricula"),
    @NamedQuery(name = "Funcionarios.findByFuncDataAdmissao", query = "SELECT f FROM Funcionarios f WHERE f.funcDataAdmissao = :funcDataAdmissao"),
    @NamedQuery(name = "Funcionarios.findByFuncDataDemissao", query = "SELECT f FROM Funcionarios f WHERE f.funcDataDemissao = :funcDataDemissao"),
    @NamedQuery(name = "Funcionarios.findByFuncLASTUPDATE", query = "SELECT f FROM Funcionarios f WHERE f.funcLASTUPDATE = :funcLASTUPDATE")})
public class Funcionarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "FUNC_ID")
    private String funcId;
    @Column(name = "FUNC_MATRICULA")
    private String funcMatricula;
    @Column(name = "FUNC_DATA_ADMISSAO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date funcDataAdmissao;
    @Column(name = "FUNC_DATA_DEMISSAO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date funcDataDemissao;
    @Lob
    @Column(name = "FUNC_FOTO")
    private byte[] funcFoto;
    @Column(name = "Func_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date funcLASTUPDATE;
    @JoinColumn(name = "LMCR_ID", referencedColumnName = "LMCR_ID")
    @ManyToOne
    private LimitesCreditos lmcrId;
    @JoinColumn(name = "PESS_ID", referencedColumnName = "PESS_ID")
    @ManyToOne
    private Pessoas pessId;
    @OneToMany(mappedBy = "funcId")
    private List<HistTransfPatrimonial> histTransfPatrimonialList;
    @OneToMany(mappedBy = "funcId")
    private List<LimitesCreditos> limitesCreditosList;
    @OneToMany(mappedBy = "funcId")
    private List<Spcs> spcsList;
    @OneToMany(mappedBy = "funcId")
    private List<Patrimonio> patrimonioList;

    public Funcionarios() {
    }

    public Funcionarios(String funcId) {
        this.funcId = funcId;
    }

    public String getFuncId() {
        return funcId;
    }

    public void setFuncId(String funcId) {
        this.funcId = funcId;
    }

    public String getFuncMatricula() {
        return funcMatricula;
    }

    public void setFuncMatricula(String funcMatricula) {
        this.funcMatricula = funcMatricula;
    }

    public Date getFuncDataAdmissao() {
        return funcDataAdmissao;
    }

    public void setFuncDataAdmissao(Date funcDataAdmissao) {
        this.funcDataAdmissao = funcDataAdmissao;
    }

    public Date getFuncDataDemissao() {
        return funcDataDemissao;
    }

    public void setFuncDataDemissao(Date funcDataDemissao) {
        this.funcDataDemissao = funcDataDemissao;
    }

    public byte[] getFuncFoto() {
        return funcFoto;
    }

    public void setFuncFoto(byte[] funcFoto) {
        this.funcFoto = funcFoto;
    }

    public Date getFuncLASTUPDATE() {
        return funcLASTUPDATE;
    }

    public void setFuncLASTUPDATE(Date funcLASTUPDATE) {
        this.funcLASTUPDATE = funcLASTUPDATE;
    }

    public LimitesCreditos getLmcrId() {
        return lmcrId;
    }

    public void setLmcrId(LimitesCreditos lmcrId) {
        this.lmcrId = lmcrId;
    }

    public Pessoas getPessId() {
        return pessId;
    }

    public void setPessId(Pessoas pessId) {
        this.pessId = pessId;
    }

    @XmlTransient
    public List<HistTransfPatrimonial> getHistTransfPatrimonialList() {
        return histTransfPatrimonialList;
    }

    public void setHistTransfPatrimonialList(List<HistTransfPatrimonial> histTransfPatrimonialList) {
        this.histTransfPatrimonialList = histTransfPatrimonialList;
    }

    @XmlTransient
    public List<LimitesCreditos> getLimitesCreditosList() {
        return limitesCreditosList;
    }

    public void setLimitesCreditosList(List<LimitesCreditos> limitesCreditosList) {
        this.limitesCreditosList = limitesCreditosList;
    }

    @XmlTransient
    public List<Spcs> getSpcsList() {
        return spcsList;
    }

    public void setSpcsList(List<Spcs> spcsList) {
        this.spcsList = spcsList;
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
        hash += (funcId != null ? funcId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Funcionarios)) {
            return false;
        }
        Funcionarios other = (Funcionarios) object;
        if ((this.funcId == null && other.funcId != null) || (this.funcId != null && !this.funcId.equals(other.funcId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.Funcionarios[ funcId=" + funcId + " ]";
    }
    
}
