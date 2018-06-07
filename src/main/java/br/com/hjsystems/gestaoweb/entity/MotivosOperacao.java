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
@Table(name = "MOTIVOS_OPERACAO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MotivosOperacao.findAll", query = "SELECT m FROM MotivosOperacao m"),
    @NamedQuery(name = "MotivosOperacao.findByMtopId", query = "SELECT m FROM MotivosOperacao m WHERE m.mtopId = :mtopId"),
    @NamedQuery(name = "MotivosOperacao.findByMtopTipo", query = "SELECT m FROM MotivosOperacao m WHERE m.mtopTipo = :mtopTipo"),
    @NamedQuery(name = "MotivosOperacao.findByMtopNome", query = "SELECT m FROM MotivosOperacao m WHERE m.mtopNome = :mtopNome"),
    @NamedQuery(name = "MotivosOperacao.findByMtOpLASTUPDATE", query = "SELECT m FROM MotivosOperacao m WHERE m.mtOpLASTUPDATE = :mtOpLASTUPDATE")})
public class MotivosOperacao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MTOP_ID")
    private String mtopId;
    @Basic(optional = false)
    @Column(name = "MTOP_TIPO")
    private short mtopTipo;
    @Basic(optional = false)
    @Column(name = "MTOP_NOME")
    private String mtopNome;
    @Column(name = "MtOp_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mtOpLASTUPDATE;
    @OneToMany(mappedBy = "mtopId")
    private List<OperacoesComerciais> operacoesComerciaisList;
    @OneToMany(mappedBy = "motMtopId")
    private List<OperacoesComerciais> operacoesComerciaisList1;

    public MotivosOperacao() {
    }

    public MotivosOperacao(String mtopId) {
        this.mtopId = mtopId;
    }

    public MotivosOperacao(String mtopId, short mtopTipo, String mtopNome) {
        this.mtopId = mtopId;
        this.mtopTipo = mtopTipo;
        this.mtopNome = mtopNome;
    }

    public String getMtopId() {
        return mtopId;
    }

    public void setMtopId(String mtopId) {
        this.mtopId = mtopId;
    }

    public short getMtopTipo() {
        return mtopTipo;
    }

    public void setMtopTipo(short mtopTipo) {
        this.mtopTipo = mtopTipo;
    }

    public String getMtopNome() {
        return mtopNome;
    }

    public void setMtopNome(String mtopNome) {
        this.mtopNome = mtopNome;
    }

    public Date getMtOpLASTUPDATE() {
        return mtOpLASTUPDATE;
    }

    public void setMtOpLASTUPDATE(Date mtOpLASTUPDATE) {
        this.mtOpLASTUPDATE = mtOpLASTUPDATE;
    }

    @XmlTransient
    public List<OperacoesComerciais> getOperacoesComerciaisList() {
        return operacoesComerciaisList;
    }

    public void setOperacoesComerciaisList(List<OperacoesComerciais> operacoesComerciaisList) {
        this.operacoesComerciaisList = operacoesComerciaisList;
    }

    @XmlTransient
    public List<OperacoesComerciais> getOperacoesComerciaisList1() {
        return operacoesComerciaisList1;
    }

    public void setOperacoesComerciaisList1(List<OperacoesComerciais> operacoesComerciaisList1) {
        this.operacoesComerciaisList1 = operacoesComerciaisList1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mtopId != null ? mtopId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MotivosOperacao)) {
            return false;
        }
        MotivosOperacao other = (MotivosOperacao) object;
        if ((this.mtopId == null && other.mtopId != null) || (this.mtopId != null && !this.mtopId.equals(other.mtopId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.MotivosOperacao[ mtopId=" + mtopId + " ]";
    }
    
}
