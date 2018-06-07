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
@Table(name = "CONFIGURACOES_FORMULARIOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ConfiguracoesFormularios.findAll", query = "SELECT c FROM ConfiguracoesFormularios c"),
    @NamedQuery(name = "ConfiguracoesFormularios.findByCnfrId", query = "SELECT c FROM ConfiguracoesFormularios c WHERE c.cnfrId = :cnfrId"),
    @NamedQuery(name = "ConfiguracoesFormularios.findByCnfrTop", query = "SELECT c FROM ConfiguracoesFormularios c WHERE c.cnfrTop = :cnfrTop"),
    @NamedQuery(name = "ConfiguracoesFormularios.findByCnfrLeft", query = "SELECT c FROM ConfiguracoesFormularios c WHERE c.cnfrLeft = :cnfrLeft"),
    @NamedQuery(name = "ConfiguracoesFormularios.findByCnfrWidth", query = "SELECT c FROM ConfiguracoesFormularios c WHERE c.cnfrWidth = :cnfrWidth"),
    @NamedQuery(name = "ConfiguracoesFormularios.findByCnfrFonte", query = "SELECT c FROM ConfiguracoesFormularios c WHERE c.cnfrFonte = :cnfrFonte"),
    @NamedQuery(name = "ConfiguracoesFormularios.findByCnfrTamanhoFonte", query = "SELECT c FROM ConfiguracoesFormularios c WHERE c.cnfrTamanhoFonte = :cnfrTamanhoFonte"),
    @NamedQuery(name = "ConfiguracoesFormularios.findByCnfrTipoFonte", query = "SELECT c FROM ConfiguracoesFormularios c WHERE c.cnfrTipoFonte = :cnfrTipoFonte"),
    @NamedQuery(name = "ConfiguracoesFormularios.findByCnfrFieldName", query = "SELECT c FROM ConfiguracoesFormularios c WHERE c.cnfrFieldName = :cnfrFieldName"),
    @NamedQuery(name = "ConfiguracoesFormularios.findByCnfrTipo", query = "SELECT c FROM ConfiguracoesFormularios c WHERE c.cnfrTipo = :cnfrTipo"),
    @NamedQuery(name = "ConfiguracoesFormularios.findByCnfrAlinhamento", query = "SELECT c FROM ConfiguracoesFormularios c WHERE c.cnfrAlinhamento = :cnfrAlinhamento"),
    @NamedQuery(name = "ConfiguracoesFormularios.findByCnfrMascara", query = "SELECT c FROM ConfiguracoesFormularios c WHERE c.cnfrMascara = :cnfrMascara"),
    @NamedQuery(name = "ConfiguracoesFormularios.findByCnfrLastupdate", query = "SELECT c FROM ConfiguracoesFormularios c WHERE c.cnfrLastupdate = :cnfrLastupdate")})
public class ConfiguracoesFormularios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CNFR_ID")
    private String cnfrId;
    @Column(name = "CNFR_TOP")
    private Integer cnfrTop;
    @Column(name = "CNFR_LEFT")
    private Integer cnfrLeft;
    @Column(name = "CNFR_WIDTH")
    private Integer cnfrWidth;
    @Column(name = "CNFR_FONTE")
    private String cnfrFonte;
    @Column(name = "CNFR_TAMANHO_FONTE")
    private Integer cnfrTamanhoFonte;
    @Column(name = "CNFR_TIPO_FONTE")
    private String cnfrTipoFonte;
    @Column(name = "CNFR_FIELD_NAME")
    private String cnfrFieldName;
    @Column(name = "CNFR_TIPO")
    private String cnfrTipo;
    @Basic(optional = false)
    @Column(name = "CNFR_ALINHAMENTO")
    private String cnfrAlinhamento;
    @Column(name = "CNFR_MASCARA")
    private String cnfrMascara;
    @Column(name = "CNFR_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cnfrLastupdate;
    @JoinColumn(name = "MDFR_ID", referencedColumnName = "MDFR_ID")
    @ManyToOne
    private ModelosFormularios mdfrId;

    public ConfiguracoesFormularios() {
    }

    public ConfiguracoesFormularios(String cnfrId) {
        this.cnfrId = cnfrId;
    }

    public ConfiguracoesFormularios(String cnfrId, String cnfrAlinhamento) {
        this.cnfrId = cnfrId;
        this.cnfrAlinhamento = cnfrAlinhamento;
    }

    public String getCnfrId() {
        return cnfrId;
    }

    public void setCnfrId(String cnfrId) {
        this.cnfrId = cnfrId;
    }

    public Integer getCnfrTop() {
        return cnfrTop;
    }

    public void setCnfrTop(Integer cnfrTop) {
        this.cnfrTop = cnfrTop;
    }

    public Integer getCnfrLeft() {
        return cnfrLeft;
    }

    public void setCnfrLeft(Integer cnfrLeft) {
        this.cnfrLeft = cnfrLeft;
    }

    public Integer getCnfrWidth() {
        return cnfrWidth;
    }

    public void setCnfrWidth(Integer cnfrWidth) {
        this.cnfrWidth = cnfrWidth;
    }

    public String getCnfrFonte() {
        return cnfrFonte;
    }

    public void setCnfrFonte(String cnfrFonte) {
        this.cnfrFonte = cnfrFonte;
    }

    public Integer getCnfrTamanhoFonte() {
        return cnfrTamanhoFonte;
    }

    public void setCnfrTamanhoFonte(Integer cnfrTamanhoFonte) {
        this.cnfrTamanhoFonte = cnfrTamanhoFonte;
    }

    public String getCnfrTipoFonte() {
        return cnfrTipoFonte;
    }

    public void setCnfrTipoFonte(String cnfrTipoFonte) {
        this.cnfrTipoFonte = cnfrTipoFonte;
    }

    public String getCnfrFieldName() {
        return cnfrFieldName;
    }

    public void setCnfrFieldName(String cnfrFieldName) {
        this.cnfrFieldName = cnfrFieldName;
    }

    public String getCnfrTipo() {
        return cnfrTipo;
    }

    public void setCnfrTipo(String cnfrTipo) {
        this.cnfrTipo = cnfrTipo;
    }

    public String getCnfrAlinhamento() {
        return cnfrAlinhamento;
    }

    public void setCnfrAlinhamento(String cnfrAlinhamento) {
        this.cnfrAlinhamento = cnfrAlinhamento;
    }

    public String getCnfrMascara() {
        return cnfrMascara;
    }

    public void setCnfrMascara(String cnfrMascara) {
        this.cnfrMascara = cnfrMascara;
    }

    public Date getCnfrLastupdate() {
        return cnfrLastupdate;
    }

    public void setCnfrLastupdate(Date cnfrLastupdate) {
        this.cnfrLastupdate = cnfrLastupdate;
    }

    public ModelosFormularios getMdfrId() {
        return mdfrId;
    }

    public void setMdfrId(ModelosFormularios mdfrId) {
        this.mdfrId = mdfrId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cnfrId != null ? cnfrId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ConfiguracoesFormularios)) {
            return false;
        }
        ConfiguracoesFormularios other = (ConfiguracoesFormularios) object;
        if ((this.cnfrId == null && other.cnfrId != null) || (this.cnfrId != null && !this.cnfrId.equals(other.cnfrId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.ConfiguracoesFormularios[ cnfrId=" + cnfrId + " ]";
    }
    
}
