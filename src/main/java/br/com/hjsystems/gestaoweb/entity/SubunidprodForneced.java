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
@Table(name = "SUBUNIDPROD_FORNECED")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SubunidprodForneced.findAll", query = "SELECT s FROM SubunidprodForneced s"),
    @NamedQuery(name = "SubunidprodForneced.findBySupfId", query = "SELECT s FROM SubunidprodForneced s WHERE s.supfId = :supfId"),
    @NamedQuery(name = "SubunidprodForneced.findBySupfCodigo", query = "SELECT s FROM SubunidprodForneced s WHERE s.supfCodigo = :supfCodigo"),
    @NamedQuery(name = "SubunidprodForneced.findBySuPFLASTUPDATE", query = "SELECT s FROM SubunidprodForneced s WHERE s.suPFLASTUPDATE = :suPFLASTUPDATE")})
public class SubunidprodForneced implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SUPF_ID")
    private String supfId;
    @Basic(optional = false)
    @Column(name = "SUPF_CODIGO")
    private String supfCodigo;
    @Column(name = "SuPF_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date suPFLASTUPDATE;
    @JoinColumn(name = "FRND_ID", referencedColumnName = "FRND_ID")
    @ManyToOne
    private Fornecedores frndId;
    @JoinColumn(name = "SBUP_ID", referencedColumnName = "SBUP_ID")
    @ManyToOne
    private SubUnidadesProduto sbupId;

    public SubunidprodForneced() {
    }

    public SubunidprodForneced(String supfId) {
        this.supfId = supfId;
    }

    public SubunidprodForneced(String supfId, String supfCodigo) {
        this.supfId = supfId;
        this.supfCodigo = supfCodigo;
    }

    public String getSupfId() {
        return supfId;
    }

    public void setSupfId(String supfId) {
        this.supfId = supfId;
    }

    public String getSupfCodigo() {
        return supfCodigo;
    }

    public void setSupfCodigo(String supfCodigo) {
        this.supfCodigo = supfCodigo;
    }

    public Date getSuPFLASTUPDATE() {
        return suPFLASTUPDATE;
    }

    public void setSuPFLASTUPDATE(Date suPFLASTUPDATE) {
        this.suPFLASTUPDATE = suPFLASTUPDATE;
    }

    public Fornecedores getFrndId() {
        return frndId;
    }

    public void setFrndId(Fornecedores frndId) {
        this.frndId = frndId;
    }

    public SubUnidadesProduto getSbupId() {
        return sbupId;
    }

    public void setSbupId(SubUnidadesProduto sbupId) {
        this.sbupId = sbupId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (supfId != null ? supfId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubunidprodForneced)) {
            return false;
        }
        SubunidprodForneced other = (SubunidprodForneced) object;
        if ((this.supfId == null && other.supfId != null) || (this.supfId != null && !this.supfId.equals(other.supfId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.SubunidprodForneced[ supfId=" + supfId + " ]";
    }
    
}
