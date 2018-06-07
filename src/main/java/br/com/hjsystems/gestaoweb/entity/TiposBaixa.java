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
@Table(name = "TIPOS_BAIXA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TiposBaixa.findAll", query = "SELECT t FROM TiposBaixa t"),
    @NamedQuery(name = "TiposBaixa.findByTpbxId", query = "SELECT t FROM TiposBaixa t WHERE t.tpbxId = :tpbxId"),
    @NamedQuery(name = "TiposBaixa.findByTpbxNome", query = "SELECT t FROM TiposBaixa t WHERE t.tpbxNome = :tpbxNome"),
    @NamedQuery(name = "TiposBaixa.findByTpbxCodigo", query = "SELECT t FROM TiposBaixa t WHERE t.tpbxCodigo = :tpbxCodigo"),
    @NamedQuery(name = "TiposBaixa.findByTpBxLASTUPDATE", query = "SELECT t FROM TiposBaixa t WHERE t.tpBxLASTUPDATE = :tpBxLASTUPDATE")})
public class TiposBaixa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TPBX_ID")
    private String tpbxId;
    @Column(name = "TPBX_NOME")
    private String tpbxNome;
    @Basic(optional = false)
    @Column(name = "TPBX_CODIGO")
    private String tpbxCodigo;
    @Column(name = "TpBx_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tpBxLASTUPDATE;
    @OneToMany(mappedBy = "tpbxId")
    private List<PagamentosContas> pagamentosContasList;

    public TiposBaixa() {
    }

    public TiposBaixa(String tpbxId) {
        this.tpbxId = tpbxId;
    }

    public TiposBaixa(String tpbxId, String tpbxCodigo) {
        this.tpbxId = tpbxId;
        this.tpbxCodigo = tpbxCodigo;
    }

    public String getTpbxId() {
        return tpbxId;
    }

    public void setTpbxId(String tpbxId) {
        this.tpbxId = tpbxId;
    }

    public String getTpbxNome() {
        return tpbxNome;
    }

    public void setTpbxNome(String tpbxNome) {
        this.tpbxNome = tpbxNome;
    }

    public String getTpbxCodigo() {
        return tpbxCodigo;
    }

    public void setTpbxCodigo(String tpbxCodigo) {
        this.tpbxCodigo = tpbxCodigo;
    }

    public Date getTpBxLASTUPDATE() {
        return tpBxLASTUPDATE;
    }

    public void setTpBxLASTUPDATE(Date tpBxLASTUPDATE) {
        this.tpBxLASTUPDATE = tpBxLASTUPDATE;
    }

    @XmlTransient
    public List<PagamentosContas> getPagamentosContasList() {
        return pagamentosContasList;
    }

    public void setPagamentosContasList(List<PagamentosContas> pagamentosContasList) {
        this.pagamentosContasList = pagamentosContasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tpbxId != null ? tpbxId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TiposBaixa)) {
            return false;
        }
        TiposBaixa other = (TiposBaixa) object;
        if ((this.tpbxId == null && other.tpbxId != null) || (this.tpbxId != null && !this.tpbxId.equals(other.tpbxId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.TiposBaixa[ tpbxId=" + tpbxId + " ]";
    }
    
}
