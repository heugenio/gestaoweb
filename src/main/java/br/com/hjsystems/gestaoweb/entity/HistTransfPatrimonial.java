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
@Table(name = "HIST_TRANSF_PATRIMONIAL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HistTransfPatrimonial.findAll", query = "SELECT h FROM HistTransfPatrimonial h"),
    @NamedQuery(name = "HistTransfPatrimonial.findByHtptId", query = "SELECT h FROM HistTransfPatrimonial h WHERE h.htptId = :htptId"),
    @NamedQuery(name = "HistTransfPatrimonial.findByPtrmId", query = "SELECT h FROM HistTransfPatrimonial h WHERE h.ptrmId = :ptrmId"),
    @NamedQuery(name = "HistTransfPatrimonial.findByUnemId", query = "SELECT h FROM HistTransfPatrimonial h WHERE h.unemId = :unemId"),
    @NamedQuery(name = "HistTransfPatrimonial.findByHtptData", query = "SELECT h FROM HistTransfPatrimonial h WHERE h.htptData = :htptData"),
    @NamedQuery(name = "HistTransfPatrimonial.findByHtptLastupdate", query = "SELECT h FROM HistTransfPatrimonial h WHERE h.htptLastupdate = :htptLastupdate"),
    @NamedQuery(name = "HistTransfPatrimonial.findByDeptId", query = "SELECT h FROM HistTransfPatrimonial h WHERE h.deptId = :deptId"),
    @NamedQuery(name = "HistTransfPatrimonial.findByHtptCodigo", query = "SELECT h FROM HistTransfPatrimonial h WHERE h.htptCodigo = :htptCodigo"),
    @NamedQuery(name = "HistTransfPatrimonial.findByHtptDataCautela", query = "SELECT h FROM HistTransfPatrimonial h WHERE h.htptDataCautela = :htptDataCautela"),
    @NamedQuery(name = "HistTransfPatrimonial.findByHtptSituacao", query = "SELECT h FROM HistTransfPatrimonial h WHERE h.htptSituacao = :htptSituacao")})
public class HistTransfPatrimonial implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "HTPT_ID")
    private String htptId;
    @Column(name = "PTRM_ID")
    private String ptrmId;
    @Column(name = "UNEM_ID")
    private String unemId;
    @Column(name = "HTPT_DATA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date htptData;
    @Column(name = "HTPT_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date htptLastupdate;
    @Column(name = "DEPT_ID")
    private String deptId;
    @Column(name = "HTPT_CODIGO")
    private String htptCodigo;
    @Column(name = "HTPT_DATA_CAUTELA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date htptDataCautela;
    @Basic(optional = false)
    @Column(name = "HTPT_SITUACAO")
    private String htptSituacao;
    @JoinColumn(name = "FUNC_ID", referencedColumnName = "FUNC_ID")
    @ManyToOne
    private Funcionarios funcId;
    @OneToMany(mappedBy = "htptId")
    private List<HistTransfPatrimItens> histTransfPatrimItensList;

    public HistTransfPatrimonial() {
    }

    public HistTransfPatrimonial(String htptId) {
        this.htptId = htptId;
    }

    public HistTransfPatrimonial(String htptId, String htptSituacao) {
        this.htptId = htptId;
        this.htptSituacao = htptSituacao;
    }

    public String getHtptId() {
        return htptId;
    }

    public void setHtptId(String htptId) {
        this.htptId = htptId;
    }

    public String getPtrmId() {
        return ptrmId;
    }

    public void setPtrmId(String ptrmId) {
        this.ptrmId = ptrmId;
    }

    public String getUnemId() {
        return unemId;
    }

    public void setUnemId(String unemId) {
        this.unemId = unemId;
    }

    public Date getHtptData() {
        return htptData;
    }

    public void setHtptData(Date htptData) {
        this.htptData = htptData;
    }

    public Date getHtptLastupdate() {
        return htptLastupdate;
    }

    public void setHtptLastupdate(Date htptLastupdate) {
        this.htptLastupdate = htptLastupdate;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getHtptCodigo() {
        return htptCodigo;
    }

    public void setHtptCodigo(String htptCodigo) {
        this.htptCodigo = htptCodigo;
    }

    public Date getHtptDataCautela() {
        return htptDataCautela;
    }

    public void setHtptDataCautela(Date htptDataCautela) {
        this.htptDataCautela = htptDataCautela;
    }

    public String getHtptSituacao() {
        return htptSituacao;
    }

    public void setHtptSituacao(String htptSituacao) {
        this.htptSituacao = htptSituacao;
    }

    public Funcionarios getFuncId() {
        return funcId;
    }

    public void setFuncId(Funcionarios funcId) {
        this.funcId = funcId;
    }

    @XmlTransient
    public List<HistTransfPatrimItens> getHistTransfPatrimItensList() {
        return histTransfPatrimItensList;
    }

    public void setHistTransfPatrimItensList(List<HistTransfPatrimItens> histTransfPatrimItensList) {
        this.histTransfPatrimItensList = histTransfPatrimItensList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (htptId != null ? htptId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HistTransfPatrimonial)) {
            return false;
        }
        HistTransfPatrimonial other = (HistTransfPatrimonial) object;
        if ((this.htptId == null && other.htptId != null) || (this.htptId != null && !this.htptId.equals(other.htptId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.HistTransfPatrimonial[ htptId=" + htptId + " ]";
    }
    
}
