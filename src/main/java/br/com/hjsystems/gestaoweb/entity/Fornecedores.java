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
import javax.persistence.ManyToOne;
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
@Table(name = "FORNECEDORES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fornecedores.findAll", query = "SELECT f FROM Fornecedores f"),
    @NamedQuery(name = "Fornecedores.findByFrndId", query = "SELECT f FROM Fornecedores f WHERE f.frndId = :frndId"),
    @NamedQuery(name = "Fornecedores.findByFrndSubstitutoIss", query = "SELECT f FROM Fornecedores f WHERE f.frndSubstitutoIss = :frndSubstitutoIss"),
    @NamedQuery(name = "Fornecedores.findByFrndSituacao", query = "SELECT f FROM Fornecedores f WHERE f.frndSituacao = :frndSituacao"),
    @NamedQuery(name = "Fornecedores.findByFrndDataCadastro", query = "SELECT f FROM Fornecedores f WHERE f.frndDataCadastro = :frndDataCadastro"),
    @NamedQuery(name = "Fornecedores.findByFrndNaturezaContribuinte", query = "SELECT f FROM Fornecedores f WHERE f.frndNaturezaContribuinte = :frndNaturezaContribuinte"),
    @NamedQuery(name = "Fornecedores.findByFrndLASTUPDATE", query = "SELECT f FROM Fornecedores f WHERE f.frndLASTUPDATE = :frndLASTUPDATE")})
public class Fornecedores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "FRND_ID")
    private String frndId;
    @Basic(optional = false)
    @Column(name = "FRND_SUBSTITUTO_ISS")
    private String frndSubstitutoIss;
    @Basic(optional = false)
    @Column(name = "FRND_SITUACAO")
    private String frndSituacao;
    @Basic(optional = false)
    @Column(name = "FRND_DATA_CADASTRO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date frndDataCadastro;
    @Basic(optional = false)
    @Column(name = "FRND_NATUREZA_CONTRIBUINTE")
    private String frndNaturezaContribuinte;
    @Column(name = "Frnd_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date frndLASTUPDATE;
    @OneToMany(mappedBy = "frndId")
    private List<ItensSugestoescompras> itensSugestoescomprasList;
    @OneToMany(mappedBy = "frndId")
    private List<MarcasFornecedores> marcasFornecedoresList;
    @OneToMany(mappedBy = "frndId")
    private List<Requisicoes> requisicoesList;
    @OneToMany(mappedBy = "frndId")
    private List<SubunidprodForneced> subunidprodFornecedList;
    @OneToMany(mappedBy = "frndId")
    private List<CotacoesFornecedores> cotacoesFornecedoresList;
    @OneToMany(mappedBy = "frndId")
    private List<Patrimonio> patrimonioList;
    @JoinColumn(name = "HPAD_ID", referencedColumnName = "HPAD_ID")
    @ManyToOne
    private HistoricosPadrao hpadId;
    @JoinColumn(name = "PESS_ID", referencedColumnName = "PESS_ID")
    @ManyToOne
    private Pessoas pessId;
    @JoinColumn(name = "PLA_PLCT_ID", referencedColumnName = "PLCT_ID")
    @ManyToOne
    private PlanoContas plaPlctId;
    @JoinColumn(name = "PLCT_ID", referencedColumnName = "PLCT_ID")
    @ManyToOne
    private PlanoContas plctId;
    @JoinColumn(name = "RMAT_ID", referencedColumnName = "RMAT_ID")
    @ManyToOne
    private RamosAtividade rmatId;
    @JoinColumn(name = "TCLF_ID", referencedColumnName = "TCLF_ID")
    @ManyToOne
    private TiposClienteFornecedores tclfId;
    @OneToMany(mappedBy = "frndId")
    private List<FornecedoresSugestoescompras> fornecedoresSugestoescomprasList;

    public Fornecedores() {
    }

    public Fornecedores(String frndId) {
        this.frndId = frndId;
    }

    public Fornecedores(String frndId, String frndSubstitutoIss, String frndSituacao, Date frndDataCadastro, String frndNaturezaContribuinte) {
        this.frndId = frndId;
        this.frndSubstitutoIss = frndSubstitutoIss;
        this.frndSituacao = frndSituacao;
        this.frndDataCadastro = frndDataCadastro;
        this.frndNaturezaContribuinte = frndNaturezaContribuinte;
    }

    public String getFrndId() {
        return frndId;
    }

    public void setFrndId(String frndId) {
        this.frndId = frndId;
    }

    public String getFrndSubstitutoIss() {
        return frndSubstitutoIss;
    }

    public void setFrndSubstitutoIss(String frndSubstitutoIss) {
        this.frndSubstitutoIss = frndSubstitutoIss;
    }

    public String getFrndSituacao() {
        return frndSituacao;
    }

    public void setFrndSituacao(String frndSituacao) {
        this.frndSituacao = frndSituacao;
    }

    public Date getFrndDataCadastro() {
        return frndDataCadastro;
    }

    public void setFrndDataCadastro(Date frndDataCadastro) {
        this.frndDataCadastro = frndDataCadastro;
    }

    public String getFrndNaturezaContribuinte() {
        return frndNaturezaContribuinte;
    }

    public void setFrndNaturezaContribuinte(String frndNaturezaContribuinte) {
        this.frndNaturezaContribuinte = frndNaturezaContribuinte;
    }

    public Date getFrndLASTUPDATE() {
        return frndLASTUPDATE;
    }

    public void setFrndLASTUPDATE(Date frndLASTUPDATE) {
        this.frndLASTUPDATE = frndLASTUPDATE;
    }

    @XmlTransient
    public List<ItensSugestoescompras> getItensSugestoescomprasList() {
        return itensSugestoescomprasList;
    }

    public void setItensSugestoescomprasList(List<ItensSugestoescompras> itensSugestoescomprasList) {
        this.itensSugestoescomprasList = itensSugestoescomprasList;
    }

    @XmlTransient
    public List<MarcasFornecedores> getMarcasFornecedoresList() {
        return marcasFornecedoresList;
    }

    public void setMarcasFornecedoresList(List<MarcasFornecedores> marcasFornecedoresList) {
        this.marcasFornecedoresList = marcasFornecedoresList;
    }

    @XmlTransient
    public List<Requisicoes> getRequisicoesList() {
        return requisicoesList;
    }

    public void setRequisicoesList(List<Requisicoes> requisicoesList) {
        this.requisicoesList = requisicoesList;
    }

    @XmlTransient
    public List<SubunidprodForneced> getSubunidprodFornecedList() {
        return subunidprodFornecedList;
    }

    public void setSubunidprodFornecedList(List<SubunidprodForneced> subunidprodFornecedList) {
        this.subunidprodFornecedList = subunidprodFornecedList;
    }

    @XmlTransient
    public List<CotacoesFornecedores> getCotacoesFornecedoresList() {
        return cotacoesFornecedoresList;
    }

    public void setCotacoesFornecedoresList(List<CotacoesFornecedores> cotacoesFornecedoresList) {
        this.cotacoesFornecedoresList = cotacoesFornecedoresList;
    }

    @XmlTransient
    public List<Patrimonio> getPatrimonioList() {
        return patrimonioList;
    }

    public void setPatrimonioList(List<Patrimonio> patrimonioList) {
        this.patrimonioList = patrimonioList;
    }

    public HistoricosPadrao getHpadId() {
        return hpadId;
    }

    public void setHpadId(HistoricosPadrao hpadId) {
        this.hpadId = hpadId;
    }

    public Pessoas getPessId() {
        return pessId;
    }

    public void setPessId(Pessoas pessId) {
        this.pessId = pessId;
    }

    public PlanoContas getPlaPlctId() {
        return plaPlctId;
    }

    public void setPlaPlctId(PlanoContas plaPlctId) {
        this.plaPlctId = plaPlctId;
    }

    public PlanoContas getPlctId() {
        return plctId;
    }

    public void setPlctId(PlanoContas plctId) {
        this.plctId = plctId;
    }

    public RamosAtividade getRmatId() {
        return rmatId;
    }

    public void setRmatId(RamosAtividade rmatId) {
        this.rmatId = rmatId;
    }

    public TiposClienteFornecedores getTclfId() {
        return tclfId;
    }

    public void setTclfId(TiposClienteFornecedores tclfId) {
        this.tclfId = tclfId;
    }

    @XmlTransient
    public List<FornecedoresSugestoescompras> getFornecedoresSugestoescomprasList() {
        return fornecedoresSugestoescomprasList;
    }

    public void setFornecedoresSugestoescomprasList(List<FornecedoresSugestoescompras> fornecedoresSugestoescomprasList) {
        this.fornecedoresSugestoescomprasList = fornecedoresSugestoescomprasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (frndId != null ? frndId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fornecedores)) {
            return false;
        }
        Fornecedores other = (Fornecedores) object;
        if ((this.frndId == null && other.frndId != null) || (this.frndId != null && !this.frndId.equals(other.frndId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.Fornecedores[ frndId=" + frndId + " ]";
    }
    
}
