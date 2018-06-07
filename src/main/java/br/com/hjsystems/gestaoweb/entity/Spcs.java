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
@Table(name = "SPCS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Spcs.findAll", query = "SELECT s FROM Spcs s"),
    @NamedQuery(name = "Spcs.findBySpcsId", query = "SELECT s FROM Spcs s WHERE s.spcsId = :spcsId"),
    @NamedQuery(name = "Spcs.findBySpcsData", query = "SELECT s FROM Spcs s WHERE s.spcsData = :spcsData"),
    @NamedQuery(name = "Spcs.findBySpcsSituacao", query = "SELECT s FROM Spcs s WHERE s.spcsSituacao = :spcsSituacao"),
    @NamedQuery(name = "Spcs.findBySpcsObservacao", query = "SELECT s FROM Spcs s WHERE s.spcsObservacao = :spcsObservacao"),
    @NamedQuery(name = "Spcs.findBySpcsLastupdate", query = "SELECT s FROM Spcs s WHERE s.spcsLastupdate = :spcsLastupdate")})
public class Spcs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SPCS_ID")
    private String spcsId;
    @Basic(optional = false)
    @Column(name = "SPCS_DATA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date spcsData;
    @Column(name = "SPCS_SITUACAO")
    private String spcsSituacao;
    @Column(name = "SPCS_OBSERVACAO")
    private String spcsObservacao;
    @Column(name = "SPCS_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date spcsLastupdate;
    @JoinColumn(name = "CLNT_ID", referencedColumnName = "CLNT_ID")
    @ManyToOne
    private Clientes clntId;
    @JoinColumn(name = "FUNC_ID", referencedColumnName = "FUNC_ID")
    @ManyToOne
    private Funcionarios funcId;

    public Spcs() {
    }

    public Spcs(String spcsId) {
        this.spcsId = spcsId;
    }

    public Spcs(String spcsId, Date spcsData) {
        this.spcsId = spcsId;
        this.spcsData = spcsData;
    }

    public String getSpcsId() {
        return spcsId;
    }

    public void setSpcsId(String spcsId) {
        this.spcsId = spcsId;
    }

    public Date getSpcsData() {
        return spcsData;
    }

    public void setSpcsData(Date spcsData) {
        this.spcsData = spcsData;
    }

    public String getSpcsSituacao() {
        return spcsSituacao;
    }

    public void setSpcsSituacao(String spcsSituacao) {
        this.spcsSituacao = spcsSituacao;
    }

    public String getSpcsObservacao() {
        return spcsObservacao;
    }

    public void setSpcsObservacao(String spcsObservacao) {
        this.spcsObservacao = spcsObservacao;
    }

    public Date getSpcsLastupdate() {
        return spcsLastupdate;
    }

    public void setSpcsLastupdate(Date spcsLastupdate) {
        this.spcsLastupdate = spcsLastupdate;
    }

    public Clientes getClntId() {
        return clntId;
    }

    public void setClntId(Clientes clntId) {
        this.clntId = clntId;
    }

    public Funcionarios getFuncId() {
        return funcId;
    }

    public void setFuncId(Funcionarios funcId) {
        this.funcId = funcId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (spcsId != null ? spcsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Spcs)) {
            return false;
        }
        Spcs other = (Spcs) object;
        if ((this.spcsId == null && other.spcsId != null) || (this.spcsId != null && !this.spcsId.equals(other.spcsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.Spcs[ spcsId=" + spcsId + " ]";
    }
    
}
