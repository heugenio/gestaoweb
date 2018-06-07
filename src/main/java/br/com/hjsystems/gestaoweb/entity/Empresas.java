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
@Table(name = "EMPRESAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empresas.findAll", query = "SELECT e FROM Empresas e"),
    @NamedQuery(name = "Empresas.findByEmprId", query = "SELECT e FROM Empresas e WHERE e.emprId = :emprId"),
    @NamedQuery(name = "Empresas.findByEmprNome", query = "SELECT e FROM Empresas e WHERE e.emprNome = :emprNome"),
    @NamedQuery(name = "Empresas.findByEmprSenha", query = "SELECT e FROM Empresas e WHERE e.emprSenha = :emprSenha"),
    @NamedQuery(name = "Empresas.findByEmprRamoAtividade", query = "SELECT e FROM Empresas e WHERE e.emprRamoAtividade = :emprRamoAtividade"),
    @NamedQuery(name = "Empresas.findByEmprLASTUPDATE", query = "SELECT e FROM Empresas e WHERE e.emprLASTUPDATE = :emprLASTUPDATE"),
    @NamedQuery(name = "Empresas.findByEmprUltimaConsulta", query = "SELECT e FROM Empresas e WHERE e.emprUltimaConsulta = :emprUltimaConsulta"),
    @NamedQuery(name = "Empresas.findByEmprInformativoDiario", query = "SELECT e FROM Empresas e WHERE e.emprInformativoDiario = :emprInformativoDiario")})
public class Empresas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "EMPR_ID")
    private String emprId;
    @Basic(optional = false)
    @Column(name = "EMPR_NOME")
    private String emprNome;
    @Lob
    @Column(name = "EMPR_LOGOMARCA")
    private byte[] emprLogomarca;
    @Column(name = "EMPR_SENHA")
    private String emprSenha;
    @Basic(optional = false)
    @Column(name = "EMPR_RAMO_ATIVIDADE")
    private String emprRamoAtividade;
    @Column(name = "Empr_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date emprLASTUPDATE;
    @Column(name = "EMPR_ULTIMA_CONSULTA")
    private String emprUltimaConsulta;
    @Column(name = "EMPR_INFORMATIVO_DIARIO")
    private String emprInformativoDiario;
    @JoinColumn(name = "CPRC_ID", referencedColumnName = "CPRC_ID")
    @ManyToOne
    private Corporacoes cprcId;
    @OneToMany(mappedBy = "emprId")
    private List<UnidadesEmpresariais> unidadesEmpresariaisList;

    public Empresas() {
    }

    public Empresas(String emprId) {
        this.emprId = emprId;
    }

    public Empresas(String emprId, String emprNome, String emprRamoAtividade) {
        this.emprId = emprId;
        this.emprNome = emprNome;
        this.emprRamoAtividade = emprRamoAtividade;
    }

    public String getEmprId() {
        return emprId;
    }

    public void setEmprId(String emprId) {
        this.emprId = emprId;
    }

    public String getEmprNome() {
        return emprNome;
    }

    public void setEmprNome(String emprNome) {
        this.emprNome = emprNome;
    }

    public byte[] getEmprLogomarca() {
        return emprLogomarca;
    }

    public void setEmprLogomarca(byte[] emprLogomarca) {
        this.emprLogomarca = emprLogomarca;
    }

    public String getEmprSenha() {
        return emprSenha;
    }

    public void setEmprSenha(String emprSenha) {
        this.emprSenha = emprSenha;
    }

    public String getEmprRamoAtividade() {
        return emprRamoAtividade;
    }

    public void setEmprRamoAtividade(String emprRamoAtividade) {
        this.emprRamoAtividade = emprRamoAtividade;
    }

    public Date getEmprLASTUPDATE() {
        return emprLASTUPDATE;
    }

    public void setEmprLASTUPDATE(Date emprLASTUPDATE) {
        this.emprLASTUPDATE = emprLASTUPDATE;
    }

    public String getEmprUltimaConsulta() {
        return emprUltimaConsulta;
    }

    public void setEmprUltimaConsulta(String emprUltimaConsulta) {
        this.emprUltimaConsulta = emprUltimaConsulta;
    }

    public String getEmprInformativoDiario() {
        return emprInformativoDiario;
    }

    public void setEmprInformativoDiario(String emprInformativoDiario) {
        this.emprInformativoDiario = emprInformativoDiario;
    }

    public Corporacoes getCprcId() {
        return cprcId;
    }

    public void setCprcId(Corporacoes cprcId) {
        this.cprcId = cprcId;
    }

    @XmlTransient
    public List<UnidadesEmpresariais> getUnidadesEmpresariaisList() {
        return unidadesEmpresariaisList;
    }

    public void setUnidadesEmpresariaisList(List<UnidadesEmpresariais> unidadesEmpresariaisList) {
        this.unidadesEmpresariaisList = unidadesEmpresariaisList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (emprId != null ? emprId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empresas)) {
            return false;
        }
        Empresas other = (Empresas) object;
        if ((this.emprId == null && other.emprId != null) || (this.emprId != null && !this.emprId.equals(other.emprId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.Empresas[ emprId=" + emprId + " ]";
    }
    
}
