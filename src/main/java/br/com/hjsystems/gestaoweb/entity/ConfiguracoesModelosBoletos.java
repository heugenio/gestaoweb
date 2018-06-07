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
@Table(name = "CONFIGURACOES_MODELOS_BOLETOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ConfiguracoesModelosBoletos.findAll", query = "SELECT c FROM ConfiguracoesModelosBoletos c"),
    @NamedQuery(name = "ConfiguracoesModelosBoletos.findByCfmbId", query = "SELECT c FROM ConfiguracoesModelosBoletos c WHERE c.cfmbId = :cfmbId"),
    @NamedQuery(name = "ConfiguracoesModelosBoletos.findByCfmbNome", query = "SELECT c FROM ConfiguracoesModelosBoletos c WHERE c.cfmbNome = :cfmbNome"),
    @NamedQuery(name = "ConfiguracoesModelosBoletos.findByCfmbTop", query = "SELECT c FROM ConfiguracoesModelosBoletos c WHERE c.cfmbTop = :cfmbTop"),
    @NamedQuery(name = "ConfiguracoesModelosBoletos.findByCfmbLeft", query = "SELECT c FROM ConfiguracoesModelosBoletos c WHERE c.cfmbLeft = :cfmbLeft"),
    @NamedQuery(name = "ConfiguracoesModelosBoletos.findByCfmbWidth", query = "SELECT c FROM ConfiguracoesModelosBoletos c WHERE c.cfmbWidth = :cfmbWidth"),
    @NamedQuery(name = "ConfiguracoesModelosBoletos.findByCfmbFonte", query = "SELECT c FROM ConfiguracoesModelosBoletos c WHERE c.cfmbFonte = :cfmbFonte"),
    @NamedQuery(name = "ConfiguracoesModelosBoletos.findByCfmbTamanhoFonte", query = "SELECT c FROM ConfiguracoesModelosBoletos c WHERE c.cfmbTamanhoFonte = :cfmbTamanhoFonte"),
    @NamedQuery(name = "ConfiguracoesModelosBoletos.findByCfmbTipoFonte", query = "SELECT c FROM ConfiguracoesModelosBoletos c WHERE c.cfmbTipoFonte = :cfmbTipoFonte"),
    @NamedQuery(name = "ConfiguracoesModelosBoletos.findByCfmbAlinhamento", query = "SELECT c FROM ConfiguracoesModelosBoletos c WHERE c.cfmbAlinhamento = :cfmbAlinhamento"),
    @NamedQuery(name = "ConfiguracoesModelosBoletos.findByCfmbMascara", query = "SELECT c FROM ConfiguracoesModelosBoletos c WHERE c.cfmbMascara = :cfmbMascara"),
    @NamedQuery(name = "ConfiguracoesModelosBoletos.findByCfmbLastupdate", query = "SELECT c FROM ConfiguracoesModelosBoletos c WHERE c.cfmbLastupdate = :cfmbLastupdate")})
public class ConfiguracoesModelosBoletos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CFMB_ID")
    private String cfmbId;
    @Basic(optional = false)
    @Column(name = "CFMB_NOME")
    private String cfmbNome;
    @Column(name = "CFMB_TOP")
    private Integer cfmbTop;
    @Column(name = "CFMB_LEFT")
    private Integer cfmbLeft;
    @Column(name = "CFMB_WIDTH")
    private Integer cfmbWidth;
    @Column(name = "CFMB_FONTE")
    private String cfmbFonte;
    @Column(name = "CFMB_TAMANHO_FONTE")
    private Integer cfmbTamanhoFonte;
    @Column(name = "CFMB_TIPO_FONTE")
    private String cfmbTipoFonte;
    @Column(name = "CFMB_ALINHAMENTO")
    private String cfmbAlinhamento;
    @Column(name = "CFMB_MASCARA")
    private String cfmbMascara;
    @Column(name = "CFMB_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cfmbLastupdate;
    @JoinColumn(name = "MDBL_ID", referencedColumnName = "MDBL_ID")
    @ManyToOne
    private ModelosBoletos mdblId;

    public ConfiguracoesModelosBoletos() {
    }

    public ConfiguracoesModelosBoletos(String cfmbId) {
        this.cfmbId = cfmbId;
    }

    public ConfiguracoesModelosBoletos(String cfmbId, String cfmbNome) {
        this.cfmbId = cfmbId;
        this.cfmbNome = cfmbNome;
    }

    public String getCfmbId() {
        return cfmbId;
    }

    public void setCfmbId(String cfmbId) {
        this.cfmbId = cfmbId;
    }

    public String getCfmbNome() {
        return cfmbNome;
    }

    public void setCfmbNome(String cfmbNome) {
        this.cfmbNome = cfmbNome;
    }

    public Integer getCfmbTop() {
        return cfmbTop;
    }

    public void setCfmbTop(Integer cfmbTop) {
        this.cfmbTop = cfmbTop;
    }

    public Integer getCfmbLeft() {
        return cfmbLeft;
    }

    public void setCfmbLeft(Integer cfmbLeft) {
        this.cfmbLeft = cfmbLeft;
    }

    public Integer getCfmbWidth() {
        return cfmbWidth;
    }

    public void setCfmbWidth(Integer cfmbWidth) {
        this.cfmbWidth = cfmbWidth;
    }

    public String getCfmbFonte() {
        return cfmbFonte;
    }

    public void setCfmbFonte(String cfmbFonte) {
        this.cfmbFonte = cfmbFonte;
    }

    public Integer getCfmbTamanhoFonte() {
        return cfmbTamanhoFonte;
    }

    public void setCfmbTamanhoFonte(Integer cfmbTamanhoFonte) {
        this.cfmbTamanhoFonte = cfmbTamanhoFonte;
    }

    public String getCfmbTipoFonte() {
        return cfmbTipoFonte;
    }

    public void setCfmbTipoFonte(String cfmbTipoFonte) {
        this.cfmbTipoFonte = cfmbTipoFonte;
    }

    public String getCfmbAlinhamento() {
        return cfmbAlinhamento;
    }

    public void setCfmbAlinhamento(String cfmbAlinhamento) {
        this.cfmbAlinhamento = cfmbAlinhamento;
    }

    public String getCfmbMascara() {
        return cfmbMascara;
    }

    public void setCfmbMascara(String cfmbMascara) {
        this.cfmbMascara = cfmbMascara;
    }

    public Date getCfmbLastupdate() {
        return cfmbLastupdate;
    }

    public void setCfmbLastupdate(Date cfmbLastupdate) {
        this.cfmbLastupdate = cfmbLastupdate;
    }

    public ModelosBoletos getMdblId() {
        return mdblId;
    }

    public void setMdblId(ModelosBoletos mdblId) {
        this.mdblId = mdblId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cfmbId != null ? cfmbId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ConfiguracoesModelosBoletos)) {
            return false;
        }
        ConfiguracoesModelosBoletos other = (ConfiguracoesModelosBoletos) object;
        if ((this.cfmbId == null && other.cfmbId != null) || (this.cfmbId != null && !this.cfmbId.equals(other.cfmbId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.ConfiguracoesModelosBoletos[ cfmbId=" + cfmbId + " ]";
    }
    
}
