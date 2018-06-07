/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hjsystems.gestaoweb.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name = "EMAIL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Email.findAll", query = "SELECT e FROM Email e"),
    @NamedQuery(name = "Email.findByEmaiId", query = "SELECT e FROM Email e WHERE e.emaiId = :emaiId"),
    @NamedQuery(name = "Email.findByEmaiNome", query = "SELECT e FROM Email e WHERE e.emaiNome = :emaiNome"),
    @NamedQuery(name = "Email.findByEmaiEmail", query = "SELECT e FROM Email e WHERE e.emaiEmail = :emaiEmail"),
    @NamedQuery(name = "Email.findByEmaiTelefone", query = "SELECT e FROM Email e WHERE e.emaiTelefone = :emaiTelefone"),
    @NamedQuery(name = "Email.findByEmaiNomeAlias", query = "SELECT e FROM Email e WHERE e.emaiNomeAlias = :emaiNomeAlias"),
    @NamedQuery(name = "Email.findByEmaiLista", query = "SELECT e FROM Email e WHERE e.emaiLista = :emaiLista")})
public class Email implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "EMAI_ID")
    private Integer emaiId;
    @Column(name = "EMAI_NOME")
    private String emaiNome;
    @Column(name = "EMAI_EMAIL")
    private String emaiEmail;
    @Column(name = "EMAI_TELEFONE")
    private String emaiTelefone;
    @Column(name = "EMAI_NOME_ALIAS")
    private String emaiNomeAlias;
    @Column(name = "EMAI_LISTA")
    private Integer emaiLista;

    public Email() {
    }

    public Email(Integer emaiId) {
        this.emaiId = emaiId;
    }

    public Integer getEmaiId() {
        return emaiId;
    }

    public void setEmaiId(Integer emaiId) {
        this.emaiId = emaiId;
    }

    public String getEmaiNome() {
        return emaiNome;
    }

    public void setEmaiNome(String emaiNome) {
        this.emaiNome = emaiNome;
    }

    public String getEmaiEmail() {
        return emaiEmail;
    }

    public void setEmaiEmail(String emaiEmail) {
        this.emaiEmail = emaiEmail;
    }

    public String getEmaiTelefone() {
        return emaiTelefone;
    }

    public void setEmaiTelefone(String emaiTelefone) {
        this.emaiTelefone = emaiTelefone;
    }

    public String getEmaiNomeAlias() {
        return emaiNomeAlias;
    }

    public void setEmaiNomeAlias(String emaiNomeAlias) {
        this.emaiNomeAlias = emaiNomeAlias;
    }

    public Integer getEmaiLista() {
        return emaiLista;
    }

    public void setEmaiLista(Integer emaiLista) {
        this.emaiLista = emaiLista;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (emaiId != null ? emaiId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Email)) {
            return false;
        }
        Email other = (Email) object;
        if ((this.emaiId == null && other.emaiId != null) || (this.emaiId != null && !this.emaiId.equals(other.emaiId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.Email[ emaiId=" + emaiId + " ]";
    }
    
}
