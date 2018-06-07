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
import javax.persistence.Lob;
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
@Table(name = "CONFIGURACOES_PREFERENCIAIS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ConfiguracoesPreferenciais.findAll", query = "SELECT c FROM ConfiguracoesPreferenciais c"),
    @NamedQuery(name = "ConfiguracoesPreferenciais.findByCfpfId", query = "SELECT c FROM ConfiguracoesPreferenciais c WHERE c.cfpfId = :cfpfId"),
    @NamedQuery(name = "ConfiguracoesPreferenciais.findByCfpfNome", query = "SELECT c FROM ConfiguracoesPreferenciais c WHERE c.cfpfNome = :cfpfNome"),
    @NamedQuery(name = "ConfiguracoesPreferenciais.findByCfpfCaption", query = "SELECT c FROM ConfiguracoesPreferenciais c WHERE c.cfpfCaption = :cfpfCaption"),
    @NamedQuery(name = "ConfiguracoesPreferenciais.findByCfpfTipo", query = "SELECT c FROM ConfiguracoesPreferenciais c WHERE c.cfpfTipo = :cfpfTipo"),
    @NamedQuery(name = "ConfiguracoesPreferenciais.findByCfpfPadrao", query = "SELECT c FROM ConfiguracoesPreferenciais c WHERE c.cfpfPadrao = :cfpfPadrao"),
    @NamedQuery(name = "ConfiguracoesPreferenciais.findByCfpfLastupdate", query = "SELECT c FROM ConfiguracoesPreferenciais c WHERE c.cfpfLastupdate = :cfpfLastupdate")})
public class ConfiguracoesPreferenciais implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CFPF_ID")
    private String cfpfId;
    @Basic(optional = false)
    @Column(name = "CFPF_NOME")
    private String cfpfNome;
    @Column(name = "CFPF_CAPTION")
    private String cfpfCaption;
    @Basic(optional = false)
    @Column(name = "CFPF_TIPO")
    private String cfpfTipo;
    @Basic(optional = false)
    @Column(name = "CFPF_PADRAO")
    private String cfpfPadrao;
    @Lob
    @Column(name = "CFPF_CONFIGURACOES")
    private byte[] cfpfConfiguracoes;
    @Column(name = "CFPF_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cfpfLastupdate;

    public ConfiguracoesPreferenciais() {
    }

    public ConfiguracoesPreferenciais(String cfpfId) {
        this.cfpfId = cfpfId;
    }

    public ConfiguracoesPreferenciais(String cfpfId, String cfpfNome, String cfpfTipo, String cfpfPadrao) {
        this.cfpfId = cfpfId;
        this.cfpfNome = cfpfNome;
        this.cfpfTipo = cfpfTipo;
        this.cfpfPadrao = cfpfPadrao;
    }

    public String getCfpfId() {
        return cfpfId;
    }

    public void setCfpfId(String cfpfId) {
        this.cfpfId = cfpfId;
    }

    public String getCfpfNome() {
        return cfpfNome;
    }

    public void setCfpfNome(String cfpfNome) {
        this.cfpfNome = cfpfNome;
    }

    public String getCfpfCaption() {
        return cfpfCaption;
    }

    public void setCfpfCaption(String cfpfCaption) {
        this.cfpfCaption = cfpfCaption;
    }

    public String getCfpfTipo() {
        return cfpfTipo;
    }

    public void setCfpfTipo(String cfpfTipo) {
        this.cfpfTipo = cfpfTipo;
    }

    public String getCfpfPadrao() {
        return cfpfPadrao;
    }

    public void setCfpfPadrao(String cfpfPadrao) {
        this.cfpfPadrao = cfpfPadrao;
    }

    public byte[] getCfpfConfiguracoes() {
        return cfpfConfiguracoes;
    }

    public void setCfpfConfiguracoes(byte[] cfpfConfiguracoes) {
        this.cfpfConfiguracoes = cfpfConfiguracoes;
    }

    public Date getCfpfLastupdate() {
        return cfpfLastupdate;
    }

    public void setCfpfLastupdate(Date cfpfLastupdate) {
        this.cfpfLastupdate = cfpfLastupdate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cfpfId != null ? cfpfId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ConfiguracoesPreferenciais)) {
            return false;
        }
        ConfiguracoesPreferenciais other = (ConfiguracoesPreferenciais) object;
        if ((this.cfpfId == null && other.cfpfId != null) || (this.cfpfId != null && !this.cfpfId.equals(other.cfpfId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.ConfiguracoesPreferenciais[ cfpfId=" + cfpfId + " ]";
    }
    
}
