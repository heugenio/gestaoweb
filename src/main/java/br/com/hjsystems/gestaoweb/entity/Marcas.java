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
@Table(name = "MARCAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Marcas.findAll", query = "SELECT m FROM Marcas m"),
    @NamedQuery(name = "Marcas.findByMarcId", query = "SELECT m FROM Marcas m WHERE m.marcId = :marcId"),
    @NamedQuery(name = "Marcas.findByMarcCodigo", query = "SELECT m FROM Marcas m WHERE m.marcCodigo = :marcCodigo"),
    @NamedQuery(name = "Marcas.findByMarcNome", query = "SELECT m FROM Marcas m WHERE m.marcNome = :marcNome"),
    @NamedQuery(name = "Marcas.findByMarcLASTUPDATE", query = "SELECT m FROM Marcas m WHERE m.marcLASTUPDATE = :marcLASTUPDATE")})
public class Marcas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MARC_ID")
    private String marcId;
    @Column(name = "MARC_CODIGO")
    private String marcCodigo;
    @Column(name = "MARC_NOME")
    private String marcNome;
    @Column(name = "Marc_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date marcLASTUPDATE;
    @OneToMany(mappedBy = "marcId")
    private List<Produtos> produtosList;
    @OneToMany(mappedBy = "marcId")
    private List<MarcasFornecedores> marcasFornecedoresList;
    @OneToMany(mappedBy = "marcId")
    private List<Balancos> balancosList;

    public Marcas() {
    }

    public Marcas(String marcId) {
        this.marcId = marcId;
    }

    public String getMarcId() {
        return marcId;
    }

    public void setMarcId(String marcId) {
        this.marcId = marcId;
    }

    public String getMarcCodigo() {
        return marcCodigo;
    }

    public void setMarcCodigo(String marcCodigo) {
        this.marcCodigo = marcCodigo;
    }

    public String getMarcNome() {
        return marcNome;
    }

    public void setMarcNome(String marcNome) {
        this.marcNome = marcNome;
    }

    public Date getMarcLASTUPDATE() {
        return marcLASTUPDATE;
    }

    public void setMarcLASTUPDATE(Date marcLASTUPDATE) {
        this.marcLASTUPDATE = marcLASTUPDATE;
    }

    @XmlTransient
    public List<Produtos> getProdutosList() {
        return produtosList;
    }

    public void setProdutosList(List<Produtos> produtosList) {
        this.produtosList = produtosList;
    }

    @XmlTransient
    public List<MarcasFornecedores> getMarcasFornecedoresList() {
        return marcasFornecedoresList;
    }

    public void setMarcasFornecedoresList(List<MarcasFornecedores> marcasFornecedoresList) {
        this.marcasFornecedoresList = marcasFornecedoresList;
    }

    @XmlTransient
    public List<Balancos> getBalancosList() {
        return balancosList;
    }

    public void setBalancosList(List<Balancos> balancosList) {
        this.balancosList = balancosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (marcId != null ? marcId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Marcas)) {
            return false;
        }
        Marcas other = (Marcas) object;
        if ((this.marcId == null && other.marcId != null) || (this.marcId != null && !this.marcId.equals(other.marcId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.Marcas[ marcId=" + marcId + " ]";
    }
    
}
