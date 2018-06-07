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
@Table(name = "PESSOAS_VEICULOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PessoasVeiculos.findAll", query = "SELECT p FROM PessoasVeiculos p"),
    @NamedQuery(name = "PessoasVeiculos.findByPsvcId", query = "SELECT p FROM PessoasVeiculos p WHERE p.psvcId = :psvcId"),
    @NamedQuery(name = "PessoasVeiculos.findByPsvcLastupdate", query = "SELECT p FROM PessoasVeiculos p WHERE p.psvcLastupdate = :psvcLastupdate")})
public class PessoasVeiculos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PSVC_ID")
    private String psvcId;
    @Column(name = "PSVC_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date psvcLastupdate;
    @JoinColumn(name = "PESS_ID", referencedColumnName = "PESS_ID")
    @ManyToOne
    private Pessoas pessId;
    @JoinColumn(name = "VEIC_ID", referencedColumnName = "VEIC_ID")
    @ManyToOne
    private Veiculo veicId;

    public PessoasVeiculos() {
    }

    public PessoasVeiculos(String psvcId) {
        this.psvcId = psvcId;
    }

    public String getPsvcId() {
        return psvcId;
    }

    public void setPsvcId(String psvcId) {
        this.psvcId = psvcId;
    }

    public Date getPsvcLastupdate() {
        return psvcLastupdate;
    }

    public void setPsvcLastupdate(Date psvcLastupdate) {
        this.psvcLastupdate = psvcLastupdate;
    }

    public Pessoas getPessId() {
        return pessId;
    }

    public void setPessId(Pessoas pessId) {
        this.pessId = pessId;
    }

    public Veiculo getVeicId() {
        return veicId;
    }

    public void setVeicId(Veiculo veicId) {
        this.veicId = veicId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (psvcId != null ? psvcId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PessoasVeiculos)) {
            return false;
        }
        PessoasVeiculos other = (PessoasVeiculos) object;
        if ((this.psvcId == null && other.psvcId != null) || (this.psvcId != null && !this.psvcId.equals(other.psvcId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.PessoasVeiculos[ psvcId=" + psvcId + " ]";
    }
    
}
