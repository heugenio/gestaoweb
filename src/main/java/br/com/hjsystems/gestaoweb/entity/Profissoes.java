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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name = "PROFISSOES", catalog = "GriffePneus", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Profissoes.findAll", query = "SELECT p FROM Profissoes p"),
    @NamedQuery(name = "Profissoes.findByProfId", query = "SELECT p FROM Profissoes p WHERE p.profId = :profId"),
    @NamedQuery(name = "Profissoes.findByProfNome", query = "SELECT p FROM Profissoes p WHERE p.profNome = :profNome"),
    @NamedQuery(name = "Profissoes.findByProfLASTUPDATE", query = "SELECT p FROM Profissoes p WHERE p.profLASTUPDATE = :profLASTUPDATE")})
public class Profissoes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 22)
    @Column(name = "PROF_ID")
    private String profId;
    @Size(max = 40)
    @Column(name = "PROF_NOME")
    private String profNome;
    @Column(name = "Prof_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date profLASTUPDATE;
    @OneToMany(mappedBy = "profId")
    private List<Pessoas> pessoasList;

    public Profissoes() {
    }

    public Profissoes(String profId) {
        this.profId = profId;
    }

    public String getProfId() {
        return profId;
    }

    public void setProfId(String profId) {
        this.profId = profId;
    }

    public String getProfNome() {
        return profNome;
    }

    public void setProfNome(String profNome) {
        this.profNome = profNome;
    }

    public Date getProfLASTUPDATE() {
        return profLASTUPDATE;
    }

    public void setProfLASTUPDATE(Date profLASTUPDATE) {
        this.profLASTUPDATE = profLASTUPDATE;
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
        hash += (profId != null ? profId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Profissoes)) {
            return false;
        }
        Profissoes other = (Profissoes) object;
        if ((this.profId == null && other.profId != null) || (this.profId != null && !this.profId.equals(other.profId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.hjsystems.gestaoweb.entity.Profissoes[ profId=" + profId + " ]";
    }
    
}
