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
@Table(name = "MARCAS_FORNECEDORES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MarcasFornecedores.findAll", query = "SELECT m FROM MarcasFornecedores m"),
    @NamedQuery(name = "MarcasFornecedores.findByMrfrId", query = "SELECT m FROM MarcasFornecedores m WHERE m.mrfrId = :mrfrId"),
    @NamedQuery(name = "MarcasFornecedores.findByMrFrLASTUPDATE", query = "SELECT m FROM MarcasFornecedores m WHERE m.mrFrLASTUPDATE = :mrFrLASTUPDATE")})
public class MarcasFornecedores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MRFR_ID")
    private String mrfrId;
    @Column(name = "MrFr_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mrFrLASTUPDATE;
    @JoinColumn(name = "FRND_ID", referencedColumnName = "FRND_ID")
    @ManyToOne
    private Fornecedores frndId;
    @JoinColumn(name = "MARC_ID", referencedColumnName = "MARC_ID")
    @ManyToOne
    private Marcas marcId;

    public MarcasFornecedores() {
    }

    public MarcasFornecedores(String mrfrId) {
        this.mrfrId = mrfrId;
    }

    public String getMrfrId() {
        return mrfrId;
    }

    public void setMrfrId(String mrfrId) {
        this.mrfrId = mrfrId;
    }

    public Date getMrFrLASTUPDATE() {
        return mrFrLASTUPDATE;
    }

    public void setMrFrLASTUPDATE(Date mrFrLASTUPDATE) {
        this.mrFrLASTUPDATE = mrFrLASTUPDATE;
    }

    public Fornecedores getFrndId() {
        return frndId;
    }

    public void setFrndId(Fornecedores frndId) {
        this.frndId = frndId;
    }

    public Marcas getMarcId() {
        return marcId;
    }

    public void setMarcId(Marcas marcId) {
        this.marcId = marcId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mrfrId != null ? mrfrId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MarcasFornecedores)) {
            return false;
        }
        MarcasFornecedores other = (MarcasFornecedores) object;
        if ((this.mrfrId == null && other.mrfrId != null) || (this.mrfrId != null && !this.mrfrId.equals(other.mrfrId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.MarcasFornecedores[ mrfrId=" + mrfrId + " ]";
    }
    
}
