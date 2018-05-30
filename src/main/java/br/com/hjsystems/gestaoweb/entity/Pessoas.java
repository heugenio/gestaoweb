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
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
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

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name = "PESSOAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pessoas.findAll", query = "SELECT p FROM Pessoas p"),
    @NamedQuery(name = "Pessoas.findByPessId", query = "SELECT p FROM Pessoas p WHERE p.pessId = :pessId"),
    @NamedQuery(name = "Pessoas.findByPessCpfcnpj", query = "SELECT p FROM Pessoas p WHERE p.pessCpfcnpj = :pessCpfcnpj"),
    @NamedQuery(name = "Pessoas.findByPessNome", query = "SELECT p FROM Pessoas p WHERE p.pessNome = :pessNome"),
    @NamedQuery(name = "Pessoas.findByPessRazaoSocial", query = "SELECT p FROM Pessoas p WHERE p.pessRazaoSocial = :pessRazaoSocial"),
    @NamedQuery(name = "Pessoas.findByPessFisicoJuridico", query = "SELECT p FROM Pessoas p WHERE p.pessFisicoJuridico = :pessFisicoJuridico"),
    @NamedQuery(name = "Pessoas.findByPessDataNascimento", query = "SELECT p FROM Pessoas p WHERE p.pessDataNascimento = :pessDataNascimento"),
    @NamedQuery(name = "Pessoas.findByPessSexo", query = "SELECT p FROM Pessoas p WHERE p.pessSexo = :pessSexo"),
    @NamedQuery(name = "Pessoas.findByPessEstadoCivil", query = "SELECT p FROM Pessoas p WHERE p.pessEstadoCivil = :pessEstadoCivil"),
    @NamedQuery(name = "Pessoas.findByPessEscolaridade", query = "SELECT p FROM Pessoas p WHERE p.pessEscolaridade = :pessEscolaridade"),
    @NamedQuery(name = "Pessoas.findByPessEmail", query = "SELECT p FROM Pessoas p WHERE p.pessEmail = :pessEmail"),
    @NamedQuery(name = "Pessoas.findByPessUrl", query = "SELECT p FROM Pessoas p WHERE p.pessUrl = :pessUrl"),
    @NamedQuery(name = "Pessoas.findByPessSituacao", query = "SELECT p FROM Pessoas p WHERE p.pessSituacao = :pessSituacao"),
    @NamedQuery(name = "Pessoas.findByPessCodigo", query = "SELECT p FROM Pessoas p WHERE p.pessCodigo = :pessCodigo"),
    @NamedQuery(name = "Pessoas.findByPessEndeId", query = "SELECT p FROM Pessoas p WHERE p.pessEndeId = :pessEndeId"),
    @NamedQuery(name = "Pessoas.findByPessLASTUPDATE", query = "SELECT p FROM Pessoas p WHERE p.pessLASTUPDATE = :pessLASTUPDATE"),
    @NamedQuery(name = "Pessoas.findByPessDataAtualizacao", query = "SELECT p FROM Pessoas p WHERE p.pessDataAtualizacao = :pessDataAtualizacao")})
public class Pessoas implements Serializable {

    
    private static final long serialVersionUID = 1L;
    @Id
    @Size(min = 1, max = 22)
    @Column(name = "PESS_ID")
    private String pessId;
    @Size(max = 20)
    @Column(name = "PESS_CPFCNPJ")
    private String pessCpfcnpj;
    @Basic(optional = false)
    @NotNull()
    @Size(min = 1, max = 250)
    @Column(name = "PESS_NOME")
    private String pessNome;
    @Size(max = 100)
    @Column(name = "PESS_RAZAO_SOCIAL")
    private String pessRazaoSocial;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "PESS_FISICO_JURIDICO")
    private String pessFisicoJuridico;
    @Size(max = 10)
    @Column(name = "PESS_SEXO")
    private String pessSexo;
    @Size(max = 30)
    @Column(name = "PESS_ESTADO_CIVIL")
    private String pessEstadoCivil;
    @Size(max = 25)
    @Column(name = "PESS_ESCOLARIDADE")
    private String pessEscolaridade;
    @Size(max = 125)
    @Column(name = "PESS_EMAIL")
    private String pessEmail;
    @Lob()
    @Size(max = 2147483647)
    @Column(name = "PESS_OBSERVACAO")
    private String pessObservacao;
    @Size(max = 250)
    @Column(name = "PESS_URL")
    private String pessUrl;
    @Basic(optional = false)
    @NotNull()
    @Size(min = 1, max = 7)
    @Column(name = "PESS_SITUACAO")
    private String pessSituacao;
    @Size(max = 10)
    @Column(name = "PESS_CODIGO")
    private String pessCodigo;
    @Column(name = "PESS_DATA_NASCIMENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pessDataNascimento;
    @Column(name = "Pess_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pessLASTUPDATE;
    @Column(name = "PESS_DATA_ATUALIZACAO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pessDataAtualizacao;
    @JoinColumn(name = "CARG_ID", referencedColumnName = "CARG_ID")
    @ManyToOne
    private Cargos cargId;
    @JoinColumn(name = "MUNI_ID", referencedColumnName = "MUNI_ID")
    @ManyToOne
    private Municipios muniId;
    @JoinColumn(name = "NCND_ID", referencedColumnName = "NCND_ID")
    @ManyToOne
    private Nacionalidades ncndId;
    @JoinColumn(name = "PROF_ID", referencedColumnName = "PROF_ID")
    @ManyToOne
    private Profissoes profId;
    @Size(max = 22)
    @Column(name = "PESS_ENDE_ID")
    private String pessEndeId;
    @OneToMany(mappedBy = "pessId")
    private List<Telefones> telefonesList;

    public Pessoas() {
    }

    public Pessoas(String pessId) {
        this.pessId = pessId;
    }

    public Pessoas(String pessId, String pessNome, String pessFisicoJuridico, String pessSituacao) {
        this.pessId = pessId;
        this.pessNome = pessNome;
        this.pessFisicoJuridico = pessFisicoJuridico;
        this.pessSituacao = pessSituacao;
    }

    public String getPessId() {
        return pessId;
    }

    public void setPessId(String pessId) {
        this.pessId = pessId;
    }

    public String getPessCpfcnpj() {
        return pessCpfcnpj;
    }

    public void setPessCpfcnpj(String pessCpfcnpj) {
        this.pessCpfcnpj = pessCpfcnpj;
    }

    public String getPessNome() {
        return pessNome;
    }

    public void setPessNome(String pessNome) {
        this.pessNome = pessNome;
    }

    public String getPessRazaoSocial() {
        return pessRazaoSocial;
    }

    public void setPessRazaoSocial(String pessRazaoSocial) {
        this.pessRazaoSocial = pessRazaoSocial;
    }

    public String getPessFisicoJuridico() {
        return pessFisicoJuridico;
    }

    public void setPessFisicoJuridico(String pessFisicoJuridico) {
        this.pessFisicoJuridico = pessFisicoJuridico;
    }

    public Date getPessDataNascimento() {
        return pessDataNascimento;
    }

    public void setPessDataNascimento(Date pessDataNascimento) {
        this.pessDataNascimento = pessDataNascimento;
    }

    public String getPessSexo() {
        return pessSexo;
    }

    public void setPessSexo(String pessSexo) {
        this.pessSexo = pessSexo;
    }

    public String getPessEstadoCivil() {
        return pessEstadoCivil;
    }

    public void setPessEstadoCivil(String pessEstadoCivil) {
        this.pessEstadoCivil = pessEstadoCivil;
    }

    public String getPessEscolaridade() {
        return pessEscolaridade;
    }

    public void setPessEscolaridade(String pessEscolaridade) {
        this.pessEscolaridade = pessEscolaridade;
    }

    public String getPessEmail() {
        return pessEmail;
    }

    public void setPessEmail(String pessEmail) {
        this.pessEmail = pessEmail;
    }

    public String getPessObservacao() {
        return pessObservacao;
    }

    public void setPessObservacao(String pessObservacao) {
        this.pessObservacao = pessObservacao;
    }

    public String getPessUrl() {
        return pessUrl;
    }

    public void setPessUrl(String pessUrl) {
        this.pessUrl = pessUrl;
    }

    public String getPessSituacao() {
        return pessSituacao;
    }

    public void setPessSituacao(String pessSituacao) {
        this.pessSituacao = pessSituacao;
    }

    public String getPessCodigo() {
        return pessCodigo;
    }

    public void setPessCodigo(String pessCodigo) {
        this.pessCodigo = pessCodigo;
    }

    public String getPessEndeId() {
        return pessEndeId;
    }

    public void setPessEndeId(String pessEndeId) {
        this.pessEndeId = pessEndeId;
    }

    public Date getPessLASTUPDATE() {
        return pessLASTUPDATE;
    }

    public void setPessLASTUPDATE(Date pessLASTUPDATE) {
        this.pessLASTUPDATE = pessLASTUPDATE;
    }

    public Date getPessDataAtualizacao() {
        return pessDataAtualizacao;
    }

    public void setPessDataAtualizacao(Date pessDataAtualizacao) {
        this.pessDataAtualizacao = pessDataAtualizacao;
    }

    public Cargos getCargId() {
        return cargId;
    }

    public void setCargId(Cargos cargId) {
        this.cargId = cargId;
    }

    public Municipios getMuniId() {
        return muniId;
    }

    public void setMuniId(Municipios muniId) {
        this.muniId = muniId;
    }

    public Nacionalidades getNcndId() {
        return ncndId;
    }

    public void setNcndId(Nacionalidades ncndId) {
        this.ncndId = ncndId;
    }

    public Profissoes getProfId() {
        return profId;
    }

    public void setProfId(Profissoes profId) {
        this.profId = profId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pessId != null ? pessId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pessoas)) {
            return false;
        }
        Pessoas other = (Pessoas) object;
        if ((this.pessId == null && other.pessId != null) || (this.pessId != null && !this.pessId.equals(other.pessId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.hjsystems.gestaoweb.entity.Pessoas[ pessId=" + pessId + " ]";
    }

    @XmlTransient
    public List<Telefones> getTelefonesList() {
        return telefonesList;
    }

    public void setTelefonesList(List<Telefones> telefonesList) {
        this.telefonesList = telefonesList;
    }
    
}
