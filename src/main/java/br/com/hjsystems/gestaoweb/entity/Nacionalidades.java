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
@Table(name = "NACIONALIDADES", catalog = "GriffePneus", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Nacionalidades.findAll", query = "SELECT n FROM Nacionalidades n"),
    @NamedQuery(name = "Nacionalidades.findByNcndId", query = "SELECT n FROM Nacionalidades n WHERE n.ncndId = :ncndId"),
    @NamedQuery(name = "Nacionalidades.findByNcndNome", query = "SELECT n FROM Nacionalidades n WHERE n.ncndNome = :ncndNome"),
    @NamedQuery(name = "Nacionalidades.findByNcndLASTUPDATE", query = "SELECT n FROM Nacionalidades n WHERE n.ncndLASTUPDATE = :ncndLASTUPDATE")})
public class Nacionalidades implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 22)
    @Column(name = "NCND_ID")
    private String ncndId;
    @Size(max = 40)
    @Column(name = "NCND_NOME")
    private String ncndNome;
    @Column(name = "Ncnd_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ncndLASTUPDATE;
    @OneToMany(mappedBy = "ncndId")
    private List<Pessoas> pessoasList;

    public Nacionalidades() {
    }

    public Nacionalidades(String ncndId) {
        this.ncndId = ncndId;
    }

    public String getNcndId() {
        return ncndId;
    }

    public void setNcndId(String ncndId) {
        this.ncndId = ncndId;
    }

    public String getNcndNome() {
        return ncndNome;
    }

    public void setNcndNome(String ncndNome) {
        this.ncndNome = ncndNome;
    }

    public Date getNcndLASTUPDATE() {
        return ncndLASTUPDATE;
    }

    public void setNcndLASTUPDATE(Date ncndLASTUPDATE) {
        this.ncndLASTUPDATE = ncndLASTUPDATE;
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
        hash += (ncndId != null ? ncndId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nacionalidades)) {
            return false;
        }
        Nacionalidades other = (Nacionalidades) object;
        if ((this.ncndId == null && other.ncndId != null) || (this.ncndId != null && !this.ncndId.equals(other.ncndId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.hjsystems.gestaoweb.entity.Nacionalidades[ ncndId=" + ncndId + " ]";
    }
    
}
