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
import javax.persistence.Lob;
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
@Table(name = "CORPORACOES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Corporacoes.findAll", query = "SELECT c FROM Corporacoes c"),
    @NamedQuery(name = "Corporacoes.findByCprcId", query = "SELECT c FROM Corporacoes c WHERE c.cprcId = :cprcId"),
    @NamedQuery(name = "Corporacoes.findByCprcNome", query = "SELECT c FROM Corporacoes c WHERE c.cprcNome = :cprcNome"),
    @NamedQuery(name = "Corporacoes.findByCprcSenha", query = "SELECT c FROM Corporacoes c WHERE c.cprcSenha = :cprcSenha"),
    @NamedQuery(name = "Corporacoes.findByCprcTipoSenhaLiberacao", query = "SELECT c FROM Corporacoes c WHERE c.cprcTipoSenhaLiberacao = :cprcTipoSenhaLiberacao"),
    @NamedQuery(name = "Corporacoes.findByCprcLASTUPDATE", query = "SELECT c FROM Corporacoes c WHERE c.cprcLASTUPDATE = :cprcLASTUPDATE")})
public class Corporacoes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CPRC_ID")
    private String cprcId;
    @Basic(optional = false)
    @Column(name = "CPRC_NOME")
    private String cprcNome;
    @Lob
    @Column(name = "CPRC_LOGOMARCA")
    private byte[] cprcLogomarca;
    @Column(name = "CPRC_SENHA")
    private String cprcSenha;
    @Column(name = "CPRC_TIPO_SENHA_LIBERACAO")
    private String cprcTipoSenhaLiberacao;
    @Column(name = "Cprc_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cprcLASTUPDATE;
    @OneToMany(mappedBy = "cprcId")
    private List<Empresas> empresasList;

    public Corporacoes() {
    }

    public Corporacoes(String cprcId) {
        this.cprcId = cprcId;
    }

    public Corporacoes(String cprcId, String cprcNome) {
        this.cprcId = cprcId;
        this.cprcNome = cprcNome;
    }

    public String getCprcId() {
        return cprcId;
    }

    public void setCprcId(String cprcId) {
        this.cprcId = cprcId;
    }

    public String getCprcNome() {
        return cprcNome;
    }

    public void setCprcNome(String cprcNome) {
        this.cprcNome = cprcNome;
    }

    public byte[] getCprcLogomarca() {
        return cprcLogomarca;
    }

    public void setCprcLogomarca(byte[] cprcLogomarca) {
        this.cprcLogomarca = cprcLogomarca;
    }

    public String getCprcSenha() {
        return cprcSenha;
    }

    public void setCprcSenha(String cprcSenha) {
        this.cprcSenha = cprcSenha;
    }

    public String getCprcTipoSenhaLiberacao() {
        return cprcTipoSenhaLiberacao;
    }

    public void setCprcTipoSenhaLiberacao(String cprcTipoSenhaLiberacao) {
        this.cprcTipoSenhaLiberacao = cprcTipoSenhaLiberacao;
    }

    public Date getCprcLASTUPDATE() {
        return cprcLASTUPDATE;
    }

    public void setCprcLASTUPDATE(Date cprcLASTUPDATE) {
        this.cprcLASTUPDATE = cprcLASTUPDATE;
    }

    @XmlTransient
    public List<Empresas> getEmpresasList() {
        return empresasList;
    }

    public void setEmpresasList(List<Empresas> empresasList) {
        this.empresasList = empresasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cprcId != null ? cprcId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Corporacoes)) {
            return false;
        }
        Corporacoes other = (Corporacoes) object;
        if ((this.cprcId == null && other.cprcId != null) || (this.cprcId != null && !this.cprcId.equals(other.cprcId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.Corporacoes[ cprcId=" + cprcId + " ]";
    }
    
}
