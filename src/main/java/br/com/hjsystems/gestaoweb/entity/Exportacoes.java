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
@Table(name = "EXPORTACOES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Exportacoes.findAll", query = "SELECT e FROM Exportacoes e"),
    @NamedQuery(name = "Exportacoes.findByExprId", query = "SELECT e FROM Exportacoes e WHERE e.exprId = :exprId"),
    @NamedQuery(name = "Exportacoes.findByExprNome", query = "SELECT e FROM Exportacoes e WHERE e.exprNome = :exprNome"),
    @NamedQuery(name = "Exportacoes.findByExprTipoExportacao", query = "SELECT e FROM Exportacoes e WHERE e.exprTipoExportacao = :exprTipoExportacao"),
    @NamedQuery(name = "Exportacoes.findByExprDiretorio", query = "SELECT e FROM Exportacoes e WHERE e.exprDiretorio = :exprDiretorio"),
    @NamedQuery(name = "Exportacoes.findByExprCampoSearch", query = "SELECT e FROM Exportacoes e WHERE e.exprCampoSearch = :exprCampoSearch"),
    @NamedQuery(name = "Exportacoes.findByExprLASTUPDATE", query = "SELECT e FROM Exportacoes e WHERE e.exprLASTUPDATE = :exprLASTUPDATE")})
public class Exportacoes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "EXPR_ID")
    private String exprId;
    @Basic(optional = false)
    @Column(name = "EXPR_NOME")
    private String exprNome;
    @Basic(optional = false)
    @Column(name = "EXPR_TIPO_EXPORTACAO")
    private String exprTipoExportacao;
    @Column(name = "EXPR_DIRETORIO")
    private String exprDiretorio;
    @Column(name = "EXPR_CAMPO_SEARCH")
    private String exprCampoSearch;
    @Column(name = "Expr_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date exprLASTUPDATE;

    public Exportacoes() {
    }

    public Exportacoes(String exprId) {
        this.exprId = exprId;
    }

    public Exportacoes(String exprId, String exprNome, String exprTipoExportacao) {
        this.exprId = exprId;
        this.exprNome = exprNome;
        this.exprTipoExportacao = exprTipoExportacao;
    }

    public String getExprId() {
        return exprId;
    }

    public void setExprId(String exprId) {
        this.exprId = exprId;
    }

    public String getExprNome() {
        return exprNome;
    }

    public void setExprNome(String exprNome) {
        this.exprNome = exprNome;
    }

    public String getExprTipoExportacao() {
        return exprTipoExportacao;
    }

    public void setExprTipoExportacao(String exprTipoExportacao) {
        this.exprTipoExportacao = exprTipoExportacao;
    }

    public String getExprDiretorio() {
        return exprDiretorio;
    }

    public void setExprDiretorio(String exprDiretorio) {
        this.exprDiretorio = exprDiretorio;
    }

    public String getExprCampoSearch() {
        return exprCampoSearch;
    }

    public void setExprCampoSearch(String exprCampoSearch) {
        this.exprCampoSearch = exprCampoSearch;
    }

    public Date getExprLASTUPDATE() {
        return exprLASTUPDATE;
    }

    public void setExprLASTUPDATE(Date exprLASTUPDATE) {
        this.exprLASTUPDATE = exprLASTUPDATE;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (exprId != null ? exprId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Exportacoes)) {
            return false;
        }
        Exportacoes other = (Exportacoes) object;
        if ((this.exprId == null && other.exprId != null) || (this.exprId != null && !this.exprId.equals(other.exprId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.Exportacoes[ exprId=" + exprId + " ]";
    }
    
}
