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
@Table(name = "FORNECEDORES_SUGESTOESCOMPRAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FornecedoresSugestoescompras.findAll", query = "SELECT f FROM FornecedoresSugestoescompras f"),
    @NamedQuery(name = "FornecedoresSugestoescompras.findByFrscId", query = "SELECT f FROM FornecedoresSugestoescompras f WHERE f.frscId = :frscId"),
    @NamedQuery(name = "FornecedoresSugestoescompras.findByFrscLastupdate", query = "SELECT f FROM FornecedoresSugestoescompras f WHERE f.frscLastupdate = :frscLastupdate")})
public class FornecedoresSugestoescompras implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "FRSC_ID")
    private String frscId;
    @Column(name = "FRSC_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date frscLastupdate;
    @JoinColumn(name = "FRND_ID", referencedColumnName = "FRND_ID")
    @ManyToOne
    private Fornecedores frndId;
    @JoinColumn(name = "OPCM_ID", referencedColumnName = "OPCM_ID")
    @ManyToOne
    private OperacoesComerciais opcmId;
    @JoinColumn(name = "SGCP_ID", referencedColumnName = "SGCP_ID")
    @ManyToOne
    private SugestoesCompras sgcpId;

    public FornecedoresSugestoescompras() {
    }

    public FornecedoresSugestoescompras(String frscId) {
        this.frscId = frscId;
    }

    public String getFrscId() {
        return frscId;
    }

    public void setFrscId(String frscId) {
        this.frscId = frscId;
    }

    public Date getFrscLastupdate() {
        return frscLastupdate;
    }

    public void setFrscLastupdate(Date frscLastupdate) {
        this.frscLastupdate = frscLastupdate;
    }

    public Fornecedores getFrndId() {
        return frndId;
    }

    public void setFrndId(Fornecedores frndId) {
        this.frndId = frndId;
    }

    public OperacoesComerciais getOpcmId() {
        return opcmId;
    }

    public void setOpcmId(OperacoesComerciais opcmId) {
        this.opcmId = opcmId;
    }

    public SugestoesCompras getSgcpId() {
        return sgcpId;
    }

    public void setSgcpId(SugestoesCompras sgcpId) {
        this.sgcpId = sgcpId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (frscId != null ? frscId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FornecedoresSugestoescompras)) {
            return false;
        }
        FornecedoresSugestoescompras other = (FornecedoresSugestoescompras) object;
        if ((this.frscId == null && other.frscId != null) || (this.frscId != null && !this.frscId.equals(other.frscId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.FornecedoresSugestoescompras[ frscId=" + frscId + " ]";
    }
    
}
