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
@Table(name = "LISTA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Lista.findAll", query = "SELECT l FROM Lista l"),
    @NamedQuery(name = "Lista.findByListId", query = "SELECT l FROM Lista l WHERE l.listId = :listId"),
    @NamedQuery(name = "Lista.findByListNome", query = "SELECT l FROM Lista l WHERE l.listNome = :listNome"),
    @NamedQuery(name = "Lista.findByListDescricao", query = "SELECT l FROM Lista l WHERE l.listDescricao = :listDescricao")})
public class Lista implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LIST_ID")
    private Integer listId;
    @Column(name = "LIST_NOME")
    private String listNome;
    @Column(name = "LIST_DESCRICAO")
    private String listDescricao;

    public Lista() {
    }

    public Lista(Integer listId) {
        this.listId = listId;
    }

    public Integer getListId() {
        return listId;
    }

    public void setListId(Integer listId) {
        this.listId = listId;
    }

    public String getListNome() {
        return listNome;
    }

    public void setListNome(String listNome) {
        this.listNome = listNome;
    }

    public String getListDescricao() {
        return listDescricao;
    }

    public void setListDescricao(String listDescricao) {
        this.listDescricao = listDescricao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (listId != null ? listId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lista)) {
            return false;
        }
        Lista other = (Lista) object;
        if ((this.listId == null && other.listId != null) || (this.listId != null && !this.listId.equals(other.listId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.Lista[ listId=" + listId + " ]";
    }
    
}
