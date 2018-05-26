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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name = "CARGOS")
@NamedQueries({
    @NamedQuery(name = "Cargos.findAll", query = "SELECT c FROM Cargos c"),
    @NamedQuery(name = "Cargos.findByCargId", query = "SELECT c FROM Cargos c WHERE c.cargId = :cargId"),
    @NamedQuery(name = "Cargos.findByCargNome", query = "SELECT c FROM Cargos c WHERE c.cargNome = :cargNome"),
    @NamedQuery(name = "Cargos.findByCargSigla", query = "SELECT c FROM Cargos c WHERE c.cargSigla = :cargSigla"),
    @NamedQuery(name = "Cargos.findByCargLASTUPDATE", query = "SELECT c FROM Cargos c WHERE c.cargLASTUPDATE = :cargLASTUPDATE")})
public class Cargos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 22)
    @Column(name = "CARG_ID")
    private String cargId;
    @Size(max = 50)
    @Column(name = "CARG_NOME")
    private String cargNome;
    @Size(max = 5)
    @Column(name = "CARG_SIGLA")
    private String cargSigla;
    @Column(name = "Carg_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cargLASTUPDATE;
    @OneToMany(mappedBy = "cargId")
    private List<Pessoas> pessoasList;

    public Cargos() {
    }

    public Cargos(String cargId) {
        this.cargId = cargId;
    }

    public String getCargId() {
        return cargId;
    }

    public void setCargId(String cargId) {
        this.cargId = cargId;
    }

    public String getCargNome() {
        return cargNome;
    }

    public void setCargNome(String cargNome) {
        this.cargNome = cargNome;
    }

    public String getCargSigla() {
        return cargSigla;
    }

    public void setCargSigla(String cargSigla) {
        this.cargSigla = cargSigla;
    }

    public Date getCargLASTUPDATE() {
        return cargLASTUPDATE;
    }

    public void setCargLASTUPDATE(Date cargLASTUPDATE) {
        this.cargLASTUPDATE = cargLASTUPDATE;
    }

    @XmlTransient
    public List<Pessoas> getPessoasList() {
        return pessoasList;
    }

    public void setPessoasList(List<Pessoas> pessoasList) {
        this.pessoasList = pessoasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cargId != null ? cargId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cargos)) {
            return false;
        }
        Cargos other = (Cargos) object;
        if ((this.cargId == null && other.cargId != null) || (this.cargId != null && !this.cargId.equals(other.cargId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.hjsystems.gestaoweb.entity.Cargos[ cargId=" + cargId + " ]";
    }
    
}
