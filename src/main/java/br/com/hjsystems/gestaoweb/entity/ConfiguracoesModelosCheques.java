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
@Table(name = "CONFIGURACOES_MODELOS_CHEQUES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ConfiguracoesModelosCheques.findAll", query = "SELECT c FROM ConfiguracoesModelosCheques c"),
    @NamedQuery(name = "ConfiguracoesModelosCheques.findByCfmcId", query = "SELECT c FROM ConfiguracoesModelosCheques c WHERE c.cfmcId = :cfmcId"),
    @NamedQuery(name = "ConfiguracoesModelosCheques.findByCfmcNome", query = "SELECT c FROM ConfiguracoesModelosCheques c WHERE c.cfmcNome = :cfmcNome"),
    @NamedQuery(name = "ConfiguracoesModelosCheques.findByCfmcTop", query = "SELECT c FROM ConfiguracoesModelosCheques c WHERE c.cfmcTop = :cfmcTop"),
    @NamedQuery(name = "ConfiguracoesModelosCheques.findByCfmcLeft", query = "SELECT c FROM ConfiguracoesModelosCheques c WHERE c.cfmcLeft = :cfmcLeft"),
    @NamedQuery(name = "ConfiguracoesModelosCheques.findByCfmcWidth", query = "SELECT c FROM ConfiguracoesModelosCheques c WHERE c.cfmcWidth = :cfmcWidth"),
    @NamedQuery(name = "ConfiguracoesModelosCheques.findByCfmcFonte", query = "SELECT c FROM ConfiguracoesModelosCheques c WHERE c.cfmcFonte = :cfmcFonte"),
    @NamedQuery(name = "ConfiguracoesModelosCheques.findByCfmcTamanhoFonte", query = "SELECT c FROM ConfiguracoesModelosCheques c WHERE c.cfmcTamanhoFonte = :cfmcTamanhoFonte"),
    @NamedQuery(name = "ConfiguracoesModelosCheques.findByCfmcTipoFonte", query = "SELECT c FROM ConfiguracoesModelosCheques c WHERE c.cfmcTipoFonte = :cfmcTipoFonte"),
    @NamedQuery(name = "ConfiguracoesModelosCheques.findByCfmcAlinhamento", query = "SELECT c FROM ConfiguracoesModelosCheques c WHERE c.cfmcAlinhamento = :cfmcAlinhamento"),
    @NamedQuery(name = "ConfiguracoesModelosCheques.findByCfmcMascara", query = "SELECT c FROM ConfiguracoesModelosCheques c WHERE c.cfmcMascara = :cfmcMascara"),
    @NamedQuery(name = "ConfiguracoesModelosCheques.findByCfmcLastupdate", query = "SELECT c FROM ConfiguracoesModelosCheques c WHERE c.cfmcLastupdate = :cfmcLastupdate")})
public class ConfiguracoesModelosCheques implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CFMC_ID")
    private String cfmcId;
    @Basic(optional = false)
    @Column(name = "CFMC_NOME")
    private String cfmcNome;
    @Column(name = "CFMC_TOP")
    private Integer cfmcTop;
    @Column(name = "CFMC_LEFT")
    private Integer cfmcLeft;
    @Column(name = "CFMC_WIDTH")
    private Integer cfmcWidth;
    @Column(name = "CFMC_FONTE")
    private String cfmcFonte;
    @Column(name = "CFMC_TAMANHO_FONTE")
    private Integer cfmcTamanhoFonte;
    @Column(name = "CFMC_TIPO_FONTE")
    private String cfmcTipoFonte;
    @Column(name = "CFMC_ALINHAMENTO")
    private String cfmcAlinhamento;
    @Column(name = "CFMC_MASCARA")
    private String cfmcMascara;
    @Column(name = "CFMC_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cfmcLastupdate;
    @JoinColumn(name = "MDCH_ID", referencedColumnName = "MDCH_ID")
    @ManyToOne
    private ModelosCheques mdchId;

    public ConfiguracoesModelosCheques() {
    }

    public ConfiguracoesModelosCheques(String cfmcId) {
        this.cfmcId = cfmcId;
    }

    public ConfiguracoesModelosCheques(String cfmcId, String cfmcNome) {
        this.cfmcId = cfmcId;
        this.cfmcNome = cfmcNome;
    }

    public String getCfmcId() {
        return cfmcId;
    }

    public void setCfmcId(String cfmcId) {
        this.cfmcId = cfmcId;
    }

    public String getCfmcNome() {
        return cfmcNome;
    }

    public void setCfmcNome(String cfmcNome) {
        this.cfmcNome = cfmcNome;
    }

    public Integer getCfmcTop() {
        return cfmcTop;
    }

    public void setCfmcTop(Integer cfmcTop) {
        this.cfmcTop = cfmcTop;
    }

    public Integer getCfmcLeft() {
        return cfmcLeft;
    }

    public void setCfmcLeft(Integer cfmcLeft) {
        this.cfmcLeft = cfmcLeft;
    }

    public Integer getCfmcWidth() {
        return cfmcWidth;
    }

    public void setCfmcWidth(Integer cfmcWidth) {
        this.cfmcWidth = cfmcWidth;
    }

    public String getCfmcFonte() {
        return cfmcFonte;
    }

    public void setCfmcFonte(String cfmcFonte) {
        this.cfmcFonte = cfmcFonte;
    }

    public Integer getCfmcTamanhoFonte() {
        return cfmcTamanhoFonte;
    }

    public void setCfmcTamanhoFonte(Integer cfmcTamanhoFonte) {
        this.cfmcTamanhoFonte = cfmcTamanhoFonte;
    }

    public String getCfmcTipoFonte() {
        return cfmcTipoFonte;
    }

    public void setCfmcTipoFonte(String cfmcTipoFonte) {
        this.cfmcTipoFonte = cfmcTipoFonte;
    }

    public String getCfmcAlinhamento() {
        return cfmcAlinhamento;
    }

    public void setCfmcAlinhamento(String cfmcAlinhamento) {
        this.cfmcAlinhamento = cfmcAlinhamento;
    }

    public String getCfmcMascara() {
        return cfmcMascara;
    }

    public void setCfmcMascara(String cfmcMascara) {
        this.cfmcMascara = cfmcMascara;
    }

    public Date getCfmcLastupdate() {
        return cfmcLastupdate;
    }

    public void setCfmcLastupdate(Date cfmcLastupdate) {
        this.cfmcLastupdate = cfmcLastupdate;
    }

    public ModelosCheques getMdchId() {
        return mdchId;
    }

    public void setMdchId(ModelosCheques mdchId) {
        this.mdchId = mdchId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cfmcId != null ? cfmcId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ConfiguracoesModelosCheques)) {
            return false;
        }
        ConfiguracoesModelosCheques other = (ConfiguracoesModelosCheques) object;
        if ((this.cfmcId == null && other.cfmcId != null) || (this.cfmcId != null && !this.cfmcId.equals(other.cfmcId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.ConfiguracoesModelosCheques[ cfmcId=" + cfmcId + " ]";
    }
    
}
