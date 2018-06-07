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
@Table(name = "UNIDADES_EMPRESARIAIS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UnidadesEmpresariais.findAll", query = "SELECT u FROM UnidadesEmpresariais u"),
    @NamedQuery(name = "UnidadesEmpresariais.findByUnemId", query = "SELECT u FROM UnidadesEmpresariais u WHERE u.unemId = :unemId"),
    @NamedQuery(name = "UnidadesEmpresariais.findByUnemCnpj", query = "SELECT u FROM UnidadesEmpresariais u WHERE u.unemCnpj = :unemCnpj"),
    @NamedQuery(name = "UnidadesEmpresariais.findByUnemFantasia", query = "SELECT u FROM UnidadesEmpresariais u WHERE u.unemFantasia = :unemFantasia"),
    @NamedQuery(name = "UnidadesEmpresariais.findByUnemRazaoSocial", query = "SELECT u FROM UnidadesEmpresariais u WHERE u.unemRazaoSocial = :unemRazaoSocial"),
    @NamedQuery(name = "UnidadesEmpresariais.findByUnemSexo", query = "SELECT u FROM UnidadesEmpresariais u WHERE u.unemSexo = :unemSexo"),
    @NamedQuery(name = "UnidadesEmpresariais.findByUnemEstadoCivil", query = "SELECT u FROM UnidadesEmpresariais u WHERE u.unemEstadoCivil = :unemEstadoCivil"),
    @NamedQuery(name = "UnidadesEmpresariais.findByUnemEscolaridade", query = "SELECT u FROM UnidadesEmpresariais u WHERE u.unemEscolaridade = :unemEscolaridade"),
    @NamedQuery(name = "UnidadesEmpresariais.findByUnemFisicoJuridico", query = "SELECT u FROM UnidadesEmpresariais u WHERE u.unemFisicoJuridico = :unemFisicoJuridico"),
    @NamedQuery(name = "UnidadesEmpresariais.findByUnemObservacao", query = "SELECT u FROM UnidadesEmpresariais u WHERE u.unemObservacao = :unemObservacao"),
    @NamedQuery(name = "UnidadesEmpresariais.findByUnemDataNascimento", query = "SELECT u FROM UnidadesEmpresariais u WHERE u.unemDataNascimento = :unemDataNascimento"),
    @NamedQuery(name = "UnidadesEmpresariais.findByUnemUrl", query = "SELECT u FROM UnidadesEmpresariais u WHERE u.unemUrl = :unemUrl"),
    @NamedQuery(name = "UnidadesEmpresariais.findByUnemMail", query = "SELECT u FROM UnidadesEmpresariais u WHERE u.unemMail = :unemMail"),
    @NamedQuery(name = "UnidadesEmpresariais.findByUnemFone", query = "SELECT u FROM UnidadesEmpresariais u WHERE u.unemFone = :unemFone"),
    @NamedQuery(name = "UnidadesEmpresariais.findByUnemFax", query = "SELECT u FROM UnidadesEmpresariais u WHERE u.unemFax = :unemFax"),
    @NamedQuery(name = "UnidadesEmpresariais.findByUnemSigla", query = "SELECT u FROM UnidadesEmpresariais u WHERE u.unemSigla = :unemSigla"),
    @NamedQuery(name = "UnidadesEmpresariais.findByUnemDiaVencimento", query = "SELECT u FROM UnidadesEmpresariais u WHERE u.unemDiaVencimento = :unemDiaVencimento"),
    @NamedQuery(name = "UnidadesEmpresariais.findByUnemQtdMesLiberacao", query = "SELECT u FROM UnidadesEmpresariais u WHERE u.unemQtdMesLiberacao = :unemQtdMesLiberacao"),
    @NamedQuery(name = "UnidadesEmpresariais.findByUnemUltimaEntrada", query = "SELECT u FROM UnidadesEmpresariais u WHERE u.unemUltimaEntrada = :unemUltimaEntrada"),
    @NamedQuery(name = "UnidadesEmpresariais.findByUnemLiberacao", query = "SELECT u FROM UnidadesEmpresariais u WHERE u.unemLiberacao = :unemLiberacao"),
    @NamedQuery(name = "UnidadesEmpresariais.findByUnemChecksum", query = "SELECT u FROM UnidadesEmpresariais u WHERE u.unemChecksum = :unemChecksum"),
    @NamedQuery(name = "UnidadesEmpresariais.findByUnEmLASTUPDATE", query = "SELECT u FROM UnidadesEmpresariais u WHERE u.unEmLASTUPDATE = :unEmLASTUPDATE")})
public class UnidadesEmpresariais implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "UNEM_ID")
    private String unemId;
    @Column(name = "UNEM_CNPJ")
    private String unemCnpj;
    @Column(name = "UNEM_FANTASIA")
    private String unemFantasia;
    @Basic(optional = false)
    @Column(name = "UNEM_RAZAO_SOCIAL")
    private String unemRazaoSocial;
    @Column(name = "UNEM_SEXO")
    private String unemSexo;
    @Column(name = "UNEM_ESTADO_CIVIL")
    private String unemEstadoCivil;
    @Column(name = "UNEM_ESCOLARIDADE")
    private String unemEscolaridade;
    @Basic(optional = false)
    @Column(name = "UNEM_FISICO_JURIDICO")
    private String unemFisicoJuridico;
    @Column(name = "UNEM_OBSERVACAO")
    private String unemObservacao;
    @Column(name = "UNEM_DATA_NASCIMENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date unemDataNascimento;
    @Column(name = "UNEM_URL")
    private String unemUrl;
    @Column(name = "UNEM_MAIL")
    private String unemMail;
    @Column(name = "UNEM_FONE")
    private String unemFone;
    @Column(name = "UNEM_FAX")
    private String unemFax;
    @Column(name = "UNEM_SIGLA")
    private String unemSigla;
    @Column(name = "UNEM_DIA_VENCIMENTO")
    private Integer unemDiaVencimento;
    @Column(name = "UNEM_QTD_MES_LIBERACAO")
    private String unemQtdMesLiberacao;
    @Column(name = "UNEM_ULTIMA_ENTRADA")
    private String unemUltimaEntrada;
    @Column(name = "UNEM_LIBERACAO")
    private String unemLiberacao;
    @Column(name = "UNEM_CHECKSUM")
    private String unemChecksum;
    @Column(name = "UnEm_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date unEmLASTUPDATE;
    @OneToMany(mappedBy = "unemId")
    private List<UnemDocumentos> unemDocumentosList;
    @OneToMany(mappedBy = "unemId")
    private List<TabelasprecosUnem> tabelasprecosUnemList;
    @OneToMany(mappedBy = "unemId")
    private List<HistTransfPatrimItens> histTransfPatrimItensList;
    @JoinColumn(name = "EMPR_ID", referencedColumnName = "EMPR_ID")
    @ManyToOne
    private Empresas emprId;
    @OneToMany(mappedBy = "unemId")
    private List<Vendedores> vendedoresList;
    @OneToMany(mappedBy = "unemId")
    private List<UnemProdutos> unemProdutosList;
    @OneToMany(mappedBy = "unemId")
    private List<ApuracoesIcms> apuracoesIcmsList;
    @OneToMany(mappedBy = "unemId")
    private List<Patrimonio> patrimonioList;
    @OneToMany(mappedBy = "unemId")
    private List<UnemOperacoesComerciais> unemOperacoesComerciaisList;
    @OneToMany(mappedBy = "unemId")
    private List<UnemEnderecos> unemEnderecosList;

    public UnidadesEmpresariais() {
    }

    public UnidadesEmpresariais(String unemId) {
        this.unemId = unemId;
    }

    public UnidadesEmpresariais(String unemId, String unemRazaoSocial, String unemFisicoJuridico) {
        this.unemId = unemId;
        this.unemRazaoSocial = unemRazaoSocial;
        this.unemFisicoJuridico = unemFisicoJuridico;
    }

    public String getUnemId() {
        return unemId;
    }

    public void setUnemId(String unemId) {
        this.unemId = unemId;
    }

    public String getUnemCnpj() {
        return unemCnpj;
    }

    public void setUnemCnpj(String unemCnpj) {
        this.unemCnpj = unemCnpj;
    }

    public String getUnemFantasia() {
        return unemFantasia;
    }

    public void setUnemFantasia(String unemFantasia) {
        this.unemFantasia = unemFantasia;
    }

    public String getUnemRazaoSocial() {
        return unemRazaoSocial;
    }

    public void setUnemRazaoSocial(String unemRazaoSocial) {
        this.unemRazaoSocial = unemRazaoSocial;
    }

    public String getUnemSexo() {
        return unemSexo;
    }

    public void setUnemSexo(String unemSexo) {
        this.unemSexo = unemSexo;
    }

    public String getUnemEstadoCivil() {
        return unemEstadoCivil;
    }

    public void setUnemEstadoCivil(String unemEstadoCivil) {
        this.unemEstadoCivil = unemEstadoCivil;
    }

    public String getUnemEscolaridade() {
        return unemEscolaridade;
    }

    public void setUnemEscolaridade(String unemEscolaridade) {
        this.unemEscolaridade = unemEscolaridade;
    }

    public String getUnemFisicoJuridico() {
        return unemFisicoJuridico;
    }

    public void setUnemFisicoJuridico(String unemFisicoJuridico) {
        this.unemFisicoJuridico = unemFisicoJuridico;
    }

    public String getUnemObservacao() {
        return unemObservacao;
    }

    public void setUnemObservacao(String unemObservacao) {
        this.unemObservacao = unemObservacao;
    }

    public Date getUnemDataNascimento() {
        return unemDataNascimento;
    }

    public void setUnemDataNascimento(Date unemDataNascimento) {
        this.unemDataNascimento = unemDataNascimento;
    }

    public String getUnemUrl() {
        return unemUrl;
    }

    public void setUnemUrl(String unemUrl) {
        this.unemUrl = unemUrl;
    }

    public String getUnemMail() {
        return unemMail;
    }

    public void setUnemMail(String unemMail) {
        this.unemMail = unemMail;
    }

    public String getUnemFone() {
        return unemFone;
    }

    public void setUnemFone(String unemFone) {
        this.unemFone = unemFone;
    }

    public String getUnemFax() {
        return unemFax;
    }

    public void setUnemFax(String unemFax) {
        this.unemFax = unemFax;
    }

    public String getUnemSigla() {
        return unemSigla;
    }

    public void setUnemSigla(String unemSigla) {
        this.unemSigla = unemSigla;
    }

    public Integer getUnemDiaVencimento() {
        return unemDiaVencimento;
    }

    public void setUnemDiaVencimento(Integer unemDiaVencimento) {
        this.unemDiaVencimento = unemDiaVencimento;
    }

    public String getUnemQtdMesLiberacao() {
        return unemQtdMesLiberacao;
    }

    public void setUnemQtdMesLiberacao(String unemQtdMesLiberacao) {
        this.unemQtdMesLiberacao = unemQtdMesLiberacao;
    }

    public String getUnemUltimaEntrada() {
        return unemUltimaEntrada;
    }

    public void setUnemUltimaEntrada(String unemUltimaEntrada) {
        this.unemUltimaEntrada = unemUltimaEntrada;
    }

    public String getUnemLiberacao() {
        return unemLiberacao;
    }

    public void setUnemLiberacao(String unemLiberacao) {
        this.unemLiberacao = unemLiberacao;
    }

    public String getUnemChecksum() {
        return unemChecksum;
    }

    public void setUnemChecksum(String unemChecksum) {
        this.unemChecksum = unemChecksum;
    }

    public Date getUnEmLASTUPDATE() {
        return unEmLASTUPDATE;
    }

    public void setUnEmLASTUPDATE(Date unEmLASTUPDATE) {
        this.unEmLASTUPDATE = unEmLASTUPDATE;
    }

    @XmlTransient
    public List<UnemDocumentos> getUnemDocumentosList() {
        return unemDocumentosList;
    }

    public void setUnemDocumentosList(List<UnemDocumentos> unemDocumentosList) {
        this.unemDocumentosList = unemDocumentosList;
    }

    @XmlTransient
    public List<TabelasprecosUnem> getTabelasprecosUnemList() {
        return tabelasprecosUnemList;
    }

    public void setTabelasprecosUnemList(List<TabelasprecosUnem> tabelasprecosUnemList) {
        this.tabelasprecosUnemList = tabelasprecosUnemList;
    }

    @XmlTransient
    public List<HistTransfPatrimItens> getHistTransfPatrimItensList() {
        return histTransfPatrimItensList;
    }

    public void setHistTransfPatrimItensList(List<HistTransfPatrimItens> histTransfPatrimItensList) {
        this.histTransfPatrimItensList = histTransfPatrimItensList;
    }

    public Empresas getEmprId() {
        return emprId;
    }

    public void setEmprId(Empresas emprId) {
        this.emprId = emprId;
    }

    @XmlTransient
    public List<Vendedores> getVendedoresList() {
        return vendedoresList;
    }

    public void setVendedoresList(List<Vendedores> vendedoresList) {
        this.vendedoresList = vendedoresList;
    }

    @XmlTransient
    public List<UnemProdutos> getUnemProdutosList() {
        return unemProdutosList;
    }

    public void setUnemProdutosList(List<UnemProdutos> unemProdutosList) {
        this.unemProdutosList = unemProdutosList;
    }

    @XmlTransient
    public List<ApuracoesIcms> getApuracoesIcmsList() {
        return apuracoesIcmsList;
    }

    public void setApuracoesIcmsList(List<ApuracoesIcms> apuracoesIcmsList) {
        this.apuracoesIcmsList = apuracoesIcmsList;
    }

    @XmlTransient
    public List<Patrimonio> getPatrimonioList() {
        return patrimonioList;
    }

    public void setPatrimonioList(List<Patrimonio> patrimonioList) {
        this.patrimonioList = patrimonioList;
    }

    @XmlTransient
    public List<UnemOperacoesComerciais> getUnemOperacoesComerciaisList() {
        return unemOperacoesComerciaisList;
    }

    public void setUnemOperacoesComerciaisList(List<UnemOperacoesComerciais> unemOperacoesComerciaisList) {
        this.unemOperacoesComerciaisList = unemOperacoesComerciaisList;
    }

    @XmlTransient
    public List<UnemEnderecos> getUnemEnderecosList() {
        return unemEnderecosList;
    }

    public void setUnemEnderecosList(List<UnemEnderecos> unemEnderecosList) {
        this.unemEnderecosList = unemEnderecosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (unemId != null ? unemId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UnidadesEmpresariais)) {
            return false;
        }
        UnidadesEmpresariais other = (UnidadesEmpresariais) object;
        if ((this.unemId == null && other.unemId != null) || (this.unemId != null && !this.unemId.equals(other.unemId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.UnidadesEmpresariais[ unemId=" + unemId + " ]";
    }
    
}
