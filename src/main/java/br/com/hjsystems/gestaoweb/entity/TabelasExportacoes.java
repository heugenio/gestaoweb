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
@Table(name = "TABELAS_EXPORTACOES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TabelasExportacoes.findAll", query = "SELECT t FROM TabelasExportacoes t"),
    @NamedQuery(name = "TabelasExportacoes.findByTbexId", query = "SELECT t FROM TabelasExportacoes t WHERE t.tbexId = :tbexId"),
    @NamedQuery(name = "TabelasExportacoes.findByTbexNomeCampoId", query = "SELECT t FROM TabelasExportacoes t WHERE t.tbexNomeCampoId = :tbexNomeCampoId"),
    @NamedQuery(name = "TabelasExportacoes.findByTbexNivel", query = "SELECT t FROM TabelasExportacoes t WHERE t.tbexNivel = :tbexNivel"),
    @NamedQuery(name = "TabelasExportacoes.findByTbexIdPai", query = "SELECT t FROM TabelasExportacoes t WHERE t.tbexIdPai = :tbexIdPai"),
    @NamedQuery(name = "TabelasExportacoes.findByTbExLASTUPDATE", query = "SELECT t FROM TabelasExportacoes t WHERE t.tbExLASTUPDATE = :tbExLASTUPDATE")})
public class TabelasExportacoes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TBEX_ID")
    private String tbexId;
    @Basic(optional = false)
    @Column(name = "TBEX_NOME_CAMPO_ID")
    private String tbexNomeCampoId;
    @Basic(optional = false)
    @Column(name = "TBEX_NIVEL")
    private int tbexNivel;
    @Column(name = "TBEX_ID_PAI")
    private String tbexIdPai;
    @Column(name = "TbEx_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tbExLASTUPDATE;
    @OneToMany(mappedBy = "tbexId")
    private List<CamposExportacoes> camposExportacoesList;
    @JoinColumn(name = "EXPR_ID", referencedColumnName = "EXPR_ID")
    @ManyToOne
    private Exportacoes exprId;

    public TabelasExportacoes() {
    }

    public TabelasExportacoes(String tbexId) {
        this.tbexId = tbexId;
    }

    public TabelasExportacoes(String tbexId, String tbexNomeCampoId, int tbexNivel) {
        this.tbexId = tbexId;
        this.tbexNomeCampoId = tbexNomeCampoId;
        this.tbexNivel = tbexNivel;
    }

    public String getTbexId() {
        return tbexId;
    }

    public void setTbexId(String tbexId) {
        this.tbexId = tbexId;
    }

    public String getTbexNomeCampoId() {
        return tbexNomeCampoId;
    }

    public void setTbexNomeCampoId(String tbexNomeCampoId) {
        this.tbexNomeCampoId = tbexNomeCampoId;
    }

    public int getTbexNivel() {
        return tbexNivel;
    }

    public void setTbexNivel(int tbexNivel) {
        this.tbexNivel = tbexNivel;
    }

    public String getTbexIdPai() {
        return tbexIdPai;
    }

    public void setTbexIdPai(String tbexIdPai) {
        this.tbexIdPai = tbexIdPai;
    }

    public Date getTbExLASTUPDATE() {
        return tbExLASTUPDATE;
    }

    public void setTbExLASTUPDATE(Date tbExLASTUPDATE) {
        this.tbExLASTUPDATE = tbExLASTUPDATE;
    }

    @XmlTransient
    public List<CamposExportacoes> getCamposExportacoesList() {
        return camposExportacoesList;
    }

    public void setCamposExportacoesList(List<CamposExportacoes> camposExportacoesList) {
        this.camposExportacoesList = camposExportacoesList;
    }

    public Exportacoes getExprId() {
        return exprId;
    }

    public void setExprId(Exportacoes exprId) {
        this.exprId = exprId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tbexId != null ? tbexId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TabelasExportacoes)) {
            return false;
        }
        TabelasExportacoes other = (TabelasExportacoes) object;
        if ((this.tbexId == null && other.tbexId != null) || (this.tbexId != null && !this.tbexId.equals(other.tbexId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.TabelasExportacoes[ tbexId=" + tbexId + " ]";
    }
    
}
