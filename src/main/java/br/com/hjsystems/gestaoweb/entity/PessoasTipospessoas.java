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
@Table(name = "PESSOAS_TIPOSPESSOAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PessoasTipospessoas.findAll", query = "SELECT p FROM PessoasTipospessoas p"),
    @NamedQuery(name = "PessoasTipospessoas.findByPstpId", query = "SELECT p FROM PessoasTipospessoas p WHERE p.pstpId = :pstpId"),
    @NamedQuery(name = "PessoasTipospessoas.findByPstpLastupdate", query = "SELECT p FROM PessoasTipospessoas p WHERE p.pstpLastupdate = :pstpLastupdate")})
public class PessoasTipospessoas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PSTP_ID")
    private String pstpId;
    @Column(name = "PSTP_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pstpLastupdate;
    @JoinColumn(name = "PESS_ID", referencedColumnName = "PESS_ID")
    @ManyToOne
    private Pessoas pessId;
    @JoinColumn(name = "TPPS_ID", referencedColumnName = "TPPS_ID")
    @ManyToOne
    private TiposPessoas tppsId;

    public PessoasTipospessoas() {
    }

    public PessoasTipospessoas(String pstpId) {
        this.pstpId = pstpId;
    }

    public String getPstpId() {
        return pstpId;
    }

    public void setPstpId(String pstpId) {
        this.pstpId = pstpId;
    }

    public Date getPstpLastupdate() {
        return pstpLastupdate;
    }

    public void setPstpLastupdate(Date pstpLastupdate) {
        this.pstpLastupdate = pstpLastupdate;
    }

    public Pessoas getPessId() {
        return pessId;
    }

    public void setPessId(Pessoas pessId) {
        this.pessId = pessId;
    }

    public TiposPessoas getTppsId() {
        return tppsId;
    }

    public void setTppsId(TiposPessoas tppsId) {
        this.tppsId = tppsId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pstpId != null ? pstpId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PessoasTipospessoas)) {
            return false;
        }
        PessoasTipospessoas other = (PessoasTipospessoas) object;
        if ((this.pstpId == null && other.pstpId != null) || (this.pstpId != null && !this.pstpId.equals(other.pstpId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.PessoasTipospessoas[ pstpId=" + pstpId + " ]";
    }
    
}
