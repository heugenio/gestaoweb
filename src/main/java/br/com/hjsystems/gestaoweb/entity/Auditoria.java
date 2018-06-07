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
@Table(name = "AUDITORIA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Auditoria.findAll", query = "SELECT a FROM Auditoria a"),
    @NamedQuery(name = "Auditoria.findByAudtId", query = "SELECT a FROM Auditoria a WHERE a.audtId = :audtId"),
    @NamedQuery(name = "Auditoria.findByAudtNomeTabela", query = "SELECT a FROM Auditoria a WHERE a.audtNomeTabela = :audtNomeTabela"),
    @NamedQuery(name = "Auditoria.findByAudtDataEvento", query = "SELECT a FROM Auditoria a WHERE a.audtDataEvento = :audtDataEvento"),
    @NamedQuery(name = "Auditoria.findByAudtUserEvento", query = "SELECT a FROM Auditoria a WHERE a.audtUserEvento = :audtUserEvento")})
public class Auditoria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "AUDT_ID")
    private Integer audtId;
    @Column(name = "AUDT_NOME_TABELA")
    private String audtNomeTabela;
    @Column(name = "AUDT_DATA_EVENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date audtDataEvento;
    @Column(name = "AUDT_USER_EVENTO")
    private String audtUserEvento;
    @Lob
    @Column(name = "AUDT_XML")
    private String audtXml;

    public Auditoria() {
    }

    public Auditoria(Integer audtId) {
        this.audtId = audtId;
    }

    public Integer getAudtId() {
        return audtId;
    }

    public void setAudtId(Integer audtId) {
        this.audtId = audtId;
    }

    public String getAudtNomeTabela() {
        return audtNomeTabela;
    }

    public void setAudtNomeTabela(String audtNomeTabela) {
        this.audtNomeTabela = audtNomeTabela;
    }

    public Date getAudtDataEvento() {
        return audtDataEvento;
    }

    public void setAudtDataEvento(Date audtDataEvento) {
        this.audtDataEvento = audtDataEvento;
    }

    public String getAudtUserEvento() {
        return audtUserEvento;
    }

    public void setAudtUserEvento(String audtUserEvento) {
        this.audtUserEvento = audtUserEvento;
    }

    public String getAudtXml() {
        return audtXml;
    }

    public void setAudtXml(String audtXml) {
        this.audtXml = audtXml;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (audtId != null ? audtId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Auditoria)) {
            return false;
        }
        Auditoria other = (Auditoria) object;
        if ((this.audtId == null && other.audtId != null) || (this.audtId != null && !this.audtId.equals(other.audtId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.Auditoria[ audtId=" + audtId + " ]";
    }
    
}
