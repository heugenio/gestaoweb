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
@Table(name = "CAMPOS_EXPORTACOES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CamposExportacoes.findAll", query = "SELECT c FROM CamposExportacoes c"),
    @NamedQuery(name = "CamposExportacoes.findByCpexId", query = "SELECT c FROM CamposExportacoes c WHERE c.cpexId = :cpexId"),
    @NamedQuery(name = "CamposExportacoes.findByCpexNome", query = "SELECT c FROM CamposExportacoes c WHERE c.cpexNome = :cpexNome"),
    @NamedQuery(name = "CamposExportacoes.findByCpexPosicao", query = "SELECT c FROM CamposExportacoes c WHERE c.cpexPosicao = :cpexPosicao"),
    @NamedQuery(name = "CamposExportacoes.findByCpexTamanho", query = "SELECT c FROM CamposExportacoes c WHERE c.cpexTamanho = :cpexTamanho"),
    @NamedQuery(name = "CamposExportacoes.findByCpexAlinhamento", query = "SELECT c FROM CamposExportacoes c WHERE c.cpexAlinhamento = :cpexAlinhamento"),
    @NamedQuery(name = "CamposExportacoes.findByCpexSeparador", query = "SELECT c FROM CamposExportacoes c WHERE c.cpexSeparador = :cpexSeparador"),
    @NamedQuery(name = "CamposExportacoes.findByCpexPreenchimento", query = "SELECT c FROM CamposExportacoes c WHERE c.cpexPreenchimento = :cpexPreenchimento"),
    @NamedQuery(name = "CamposExportacoes.findByCpexDecimais", query = "SELECT c FROM CamposExportacoes c WHERE c.cpexDecimais = :cpexDecimais"),
    @NamedQuery(name = "CamposExportacoes.findByCpexSeparadorDecimal", query = "SELECT c FROM CamposExportacoes c WHERE c.cpexSeparadorDecimal = :cpexSeparadorDecimal"),
    @NamedQuery(name = "CamposExportacoes.findByCpexSeparadorMilhar", query = "SELECT c FROM CamposExportacoes c WHERE c.cpexSeparadorMilhar = :cpexSeparadorMilhar"),
    @NamedQuery(name = "CamposExportacoes.findByCpExLASTUPDATE", query = "SELECT c FROM CamposExportacoes c WHERE c.cpExLASTUPDATE = :cpExLASTUPDATE")})
public class CamposExportacoes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CPEX_ID")
    private String cpexId;
    @Basic(optional = false)
    @Column(name = "CPEX_NOME")
    private String cpexNome;
    @Basic(optional = false)
    @Column(name = "CPEX_POSICAO")
    private int cpexPosicao;
    @Basic(optional = false)
    @Column(name = "CPEX_TAMANHO")
    private int cpexTamanho;
    @Basic(optional = false)
    @Column(name = "CPEX_ALINHAMENTO")
    private String cpexAlinhamento;
    @Column(name = "CPEX_SEPARADOR")
    private String cpexSeparador;
    @Column(name = "CPEX_PREENCHIMENTO")
    private String cpexPreenchimento;
    @Column(name = "CPEX_DECIMAIS")
    private Integer cpexDecimais;
    @Basic(optional = false)
    @Column(name = "CPEX_SEPARADOR_DECIMAL")
    private String cpexSeparadorDecimal;
    @Basic(optional = false)
    @Column(name = "CPEX_SEPARADOR_MILHAR")
    private String cpexSeparadorMilhar;
    @Column(name = "CpEx_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cpExLASTUPDATE;
    @JoinColumn(name = "TBEX_ID", referencedColumnName = "TBEX_ID")
    @ManyToOne
    private TabelasExportacoes tbexId;

    public CamposExportacoes() {
    }

    public CamposExportacoes(String cpexId) {
        this.cpexId = cpexId;
    }

    public CamposExportacoes(String cpexId, String cpexNome, int cpexPosicao, int cpexTamanho, String cpexAlinhamento, String cpexSeparadorDecimal, String cpexSeparadorMilhar) {
        this.cpexId = cpexId;
        this.cpexNome = cpexNome;
        this.cpexPosicao = cpexPosicao;
        this.cpexTamanho = cpexTamanho;
        this.cpexAlinhamento = cpexAlinhamento;
        this.cpexSeparadorDecimal = cpexSeparadorDecimal;
        this.cpexSeparadorMilhar = cpexSeparadorMilhar;
    }

    public String getCpexId() {
        return cpexId;
    }

    public void setCpexId(String cpexId) {
        this.cpexId = cpexId;
    }

    public String getCpexNome() {
        return cpexNome;
    }

    public void setCpexNome(String cpexNome) {
        this.cpexNome = cpexNome;
    }

    public int getCpexPosicao() {
        return cpexPosicao;
    }

    public void setCpexPosicao(int cpexPosicao) {
        this.cpexPosicao = cpexPosicao;
    }

    public int getCpexTamanho() {
        return cpexTamanho;
    }

    public void setCpexTamanho(int cpexTamanho) {
        this.cpexTamanho = cpexTamanho;
    }

    public String getCpexAlinhamento() {
        return cpexAlinhamento;
    }

    public void setCpexAlinhamento(String cpexAlinhamento) {
        this.cpexAlinhamento = cpexAlinhamento;
    }

    public String getCpexSeparador() {
        return cpexSeparador;
    }

    public void setCpexSeparador(String cpexSeparador) {
        this.cpexSeparador = cpexSeparador;
    }

    public String getCpexPreenchimento() {
        return cpexPreenchimento;
    }

    public void setCpexPreenchimento(String cpexPreenchimento) {
        this.cpexPreenchimento = cpexPreenchimento;
    }

    public Integer getCpexDecimais() {
        return cpexDecimais;
    }

    public void setCpexDecimais(Integer cpexDecimais) {
        this.cpexDecimais = cpexDecimais;
    }

    public String getCpexSeparadorDecimal() {
        return cpexSeparadorDecimal;
    }

    public void setCpexSeparadorDecimal(String cpexSeparadorDecimal) {
        this.cpexSeparadorDecimal = cpexSeparadorDecimal;
    }

    public String getCpexSeparadorMilhar() {
        return cpexSeparadorMilhar;
    }

    public void setCpexSeparadorMilhar(String cpexSeparadorMilhar) {
        this.cpexSeparadorMilhar = cpexSeparadorMilhar;
    }

    public Date getCpExLASTUPDATE() {
        return cpExLASTUPDATE;
    }

    public void setCpExLASTUPDATE(Date cpExLASTUPDATE) {
        this.cpExLASTUPDATE = cpExLASTUPDATE;
    }

    public TabelasExportacoes getTbexId() {
        return tbexId;
    }

    public void setTbexId(TabelasExportacoes tbexId) {
        this.tbexId = tbexId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cpexId != null ? cpexId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CamposExportacoes)) {
            return false;
        }
        CamposExportacoes other = (CamposExportacoes) object;
        if ((this.cpexId == null && other.cpexId != null) || (this.cpexId != null && !this.cpexId.equals(other.cpexId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.CamposExportacoes[ cpexId=" + cpexId + " ]";
    }
    
}
