/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hjsystems.gestaoweb.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "PARAMETROS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Parametros.findAll", query = "SELECT p FROM Parametros p"),
    @NamedQuery(name = "Parametros.findByPrmtId", query = "SELECT p FROM Parametros p WHERE p.prmtId = :prmtId"),
    @NamedQuery(name = "Parametros.findByPrmtNome", query = "SELECT p FROM Parametros p WHERE p.prmtNome = :prmtNome"),
    @NamedQuery(name = "Parametros.findByPrmtCaption", query = "SELECT p FROM Parametros p WHERE p.prmtCaption = :prmtCaption"),
    @NamedQuery(name = "Parametros.findByPrmtTipoDado", query = "SELECT p FROM Parametros p WHERE p.prmtTipoDado = :prmtTipoDado"),
    @NamedQuery(name = "Parametros.findByPrmtDescricao", query = "SELECT p FROM Parametros p WHERE p.prmtDescricao = :prmtDescricao"),
    @NamedQuery(name = "Parametros.findByPrmtString", query = "SELECT p FROM Parametros p WHERE p.prmtString = :prmtString"),
    @NamedQuery(name = "Parametros.findByPrmtDadoFormatado", query = "SELECT p FROM Parametros p WHERE p.prmtDadoFormatado = :prmtDadoFormatado"),
    @NamedQuery(name = "Parametros.findByPrmtInteger", query = "SELECT p FROM Parametros p WHERE p.prmtInteger = :prmtInteger"),
    @NamedQuery(name = "Parametros.findByPrmtFloat", query = "SELECT p FROM Parametros p WHERE p.prmtFloat = :prmtFloat"),
    @NamedQuery(name = "Parametros.findByPrmtDateTime", query = "SELECT p FROM Parametros p WHERE p.prmtDateTime = :prmtDateTime"),
    @NamedQuery(name = "Parametros.findByPrmtBoolean", query = "SELECT p FROM Parametros p WHERE p.prmtBoolean = :prmtBoolean"),
    @NamedQuery(name = "Parametros.findByPrmtVisivel", query = "SELECT p FROM Parametros p WHERE p.prmtVisivel = :prmtVisivel"),
    @NamedQuery(name = "Parametros.findBySstmId", query = "SELECT p FROM Parametros p WHERE p.sstmId = :sstmId"),
    @NamedQuery(name = "Parametros.findByPrmtLASTUPDATE", query = "SELECT p FROM Parametros p WHERE p.prmtLASTUPDATE = :prmtLASTUPDATE"),
    @NamedQuery(name = "Parametros.findByPrmtSenhaCertificado", query = "SELECT p FROM Parametros p WHERE p.prmtSenhaCertificado = :prmtSenhaCertificado"),
    @NamedQuery(name = "Parametros.findByPrmtCaminhoCertificado", query = "SELECT p FROM Parametros p WHERE p.prmtCaminhoCertificado = :prmtCaminhoCertificado"),
    @NamedQuery(name = "Parametros.findByPrmtSchemasProvedor", query = "SELECT p FROM Parametros p WHERE p.prmtSchemasProvedor = :prmtSchemasProvedor"),
    @NamedQuery(name = "Parametros.findByPrmtLogoPrefeitura", query = "SELECT p FROM Parametros p WHERE p.prmtLogoPrefeitura = :prmtLogoPrefeitura"),
    @NamedQuery(name = "Parametros.findByPrmtNomePrefeitura", query = "SELECT p FROM Parametros p WHERE p.prmtNomePrefeitura = :prmtNomePrefeitura"),
    @NamedQuery(name = "Parametros.findByPrmtVizualizarMensagem", query = "SELECT p FROM Parametros p WHERE p.prmtVizualizarMensagem = :prmtVizualizarMensagem"),
    @NamedQuery(name = "Parametros.findByPrmtCertificadoDescricao", query = "SELECT p FROM Parametros p WHERE p.prmtCertificadoDescricao = :prmtCertificadoDescricao"),
    @NamedQuery(name = "Parametros.findByPrmtVersao", query = "SELECT p FROM Parametros p WHERE p.prmtVersao = :prmtVersao"),
    @NamedQuery(name = "Parametros.findByPrmtVersaoSchemas", query = "SELECT p FROM Parametros p WHERE p.prmtVersaoSchemas = :prmtVersaoSchemas"),
    @NamedQuery(name = "Parametros.findByPrmtNfce", query = "SELECT p FROM Parametros p WHERE p.prmtNfce = :prmtNfce"),
    @NamedQuery(name = "Parametros.findByPrmtTipoDanfce", query = "SELECT p FROM Parametros p WHERE p.prmtTipoDanfce = :prmtTipoDanfce"),
    @NamedQuery(name = "Parametros.findByPrmtImpressoraModelo", query = "SELECT p FROM Parametros p WHERE p.prmtImpressoraModelo = :prmtImpressoraModelo"),
    @NamedQuery(name = "Parametros.findByPrmtImpressoraNome", query = "SELECT p FROM Parametros p WHERE p.prmtImpressoraNome = :prmtImpressoraNome")})
public class Parametros implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PRMT_ID")
    private String prmtId;
    @Basic(optional = false)
    @Column(name = "PRMT_NOME")
    private String prmtNome;
    @Basic(optional = false)
    @Column(name = "PRMT_CAPTION")
    private String prmtCaption;
    @Basic(optional = false)
    @Column(name = "PRMT_TIPO_DADO")
    private String prmtTipoDado;
    @Column(name = "PRMT_DESCRICAO")
    private String prmtDescricao;
    @Column(name = "PRMT_STRING")
    private String prmtString;
    @Column(name = "PRMT_DADO_FORMATADO")
    private String prmtDadoFormatado;
    @Column(name = "PRMT_INTEGER")
    private Integer prmtInteger;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRMT_FLOAT")
    private BigDecimal prmtFloat;
    @Column(name = "PRMT_DATE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date prmtDateTime;
    @Column(name = "PRMT_BOOLEAN")
    private Integer prmtBoolean;
    @Basic(optional = false)
    @Column(name = "PRMT_VISIVEL")
    private String prmtVisivel;
    @Column(name = "SSTM_ID")
    private String sstmId;
    @Column(name = "Prmt_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date prmtLASTUPDATE;
    @Column(name = "PRMT_SENHA_CERTIFICADO")
    private String prmtSenhaCertificado;
    @Column(name = "PRMT_CAMINHO_CERTIFICADO")
    private String prmtCaminhoCertificado;
    @Column(name = "PRMT_SCHEMAS_PROVEDOR")
    private String prmtSchemasProvedor;
    @Column(name = "PRMT_LOGO_PREFEITURA")
    private String prmtLogoPrefeitura;
    @Column(name = "PRMT_NOME_PREFEITURA")
    private String prmtNomePrefeitura;
    @Column(name = "PRMT_VIZUALIZAR_MENSAGEM")
    private Boolean prmtVizualizarMensagem;
    @Column(name = "PRMT_CERTIFICADO_DESCRICAO")
    private String prmtCertificadoDescricao;
    @Column(name = "PRMT_VERSAO")
    private String prmtVersao;
    @Column(name = "PRMT_VERSAO_SCHEMAS")
    private String prmtVersaoSchemas;
    @Column(name = "PRMT_NFCE")
    private Boolean prmtNfce;
    @Column(name = "PRMT_TIPO_DANFCE")
    private Integer prmtTipoDanfce;
    @Column(name = "PRMT_IMPRESSORA_MODELO")
    private String prmtImpressoraModelo;
    @Column(name = "PRMT_IMPRESSORA_NOME")
    private String prmtImpressoraNome;

    public Parametros() {
    }

    public Parametros(String prmtId) {
        this.prmtId = prmtId;
    }

    public Parametros(String prmtId, String prmtNome, String prmtCaption, String prmtTipoDado, String prmtVisivel) {
        this.prmtId = prmtId;
        this.prmtNome = prmtNome;
        this.prmtCaption = prmtCaption;
        this.prmtTipoDado = prmtTipoDado;
        this.prmtVisivel = prmtVisivel;
    }

    public String getPrmtId() {
        return prmtId;
    }

    public void setPrmtId(String prmtId) {
        this.prmtId = prmtId;
    }

    public String getPrmtNome() {
        return prmtNome;
    }

    public void setPrmtNome(String prmtNome) {
        this.prmtNome = prmtNome;
    }

    public String getPrmtCaption() {
        return prmtCaption;
    }

    public void setPrmtCaption(String prmtCaption) {
        this.prmtCaption = prmtCaption;
    }

    public String getPrmtTipoDado() {
        return prmtTipoDado;
    }

    public void setPrmtTipoDado(String prmtTipoDado) {
        this.prmtTipoDado = prmtTipoDado;
    }

    public String getPrmtDescricao() {
        return prmtDescricao;
    }

    public void setPrmtDescricao(String prmtDescricao) {
        this.prmtDescricao = prmtDescricao;
    }

    public String getPrmtString() {
        return prmtString;
    }

    public void setPrmtString(String prmtString) {
        this.prmtString = prmtString;
    }

    public String getPrmtDadoFormatado() {
        return prmtDadoFormatado;
    }

    public void setPrmtDadoFormatado(String prmtDadoFormatado) {
        this.prmtDadoFormatado = prmtDadoFormatado;
    }

    public Integer getPrmtInteger() {
        return prmtInteger;
    }

    public void setPrmtInteger(Integer prmtInteger) {
        this.prmtInteger = prmtInteger;
    }

    public BigDecimal getPrmtFloat() {
        return prmtFloat;
    }

    public void setPrmtFloat(BigDecimal prmtFloat) {
        this.prmtFloat = prmtFloat;
    }

    public Date getPrmtDateTime() {
        return prmtDateTime;
    }

    public void setPrmtDateTime(Date prmtDateTime) {
        this.prmtDateTime = prmtDateTime;
    }

    public Integer getPrmtBoolean() {
        return prmtBoolean;
    }

    public void setPrmtBoolean(Integer prmtBoolean) {
        this.prmtBoolean = prmtBoolean;
    }

    public String getPrmtVisivel() {
        return prmtVisivel;
    }

    public void setPrmtVisivel(String prmtVisivel) {
        this.prmtVisivel = prmtVisivel;
    }

    public String getSstmId() {
        return sstmId;
    }

    public void setSstmId(String sstmId) {
        this.sstmId = sstmId;
    }

    public Date getPrmtLASTUPDATE() {
        return prmtLASTUPDATE;
    }

    public void setPrmtLASTUPDATE(Date prmtLASTUPDATE) {
        this.prmtLASTUPDATE = prmtLASTUPDATE;
    }

    public String getPrmtSenhaCertificado() {
        return prmtSenhaCertificado;
    }

    public void setPrmtSenhaCertificado(String prmtSenhaCertificado) {
        this.prmtSenhaCertificado = prmtSenhaCertificado;
    }

    public String getPrmtCaminhoCertificado() {
        return prmtCaminhoCertificado;
    }

    public void setPrmtCaminhoCertificado(String prmtCaminhoCertificado) {
        this.prmtCaminhoCertificado = prmtCaminhoCertificado;
    }

    public String getPrmtSchemasProvedor() {
        return prmtSchemasProvedor;
    }

    public void setPrmtSchemasProvedor(String prmtSchemasProvedor) {
        this.prmtSchemasProvedor = prmtSchemasProvedor;
    }

    public String getPrmtLogoPrefeitura() {
        return prmtLogoPrefeitura;
    }

    public void setPrmtLogoPrefeitura(String prmtLogoPrefeitura) {
        this.prmtLogoPrefeitura = prmtLogoPrefeitura;
    }

    public String getPrmtNomePrefeitura() {
        return prmtNomePrefeitura;
    }

    public void setPrmtNomePrefeitura(String prmtNomePrefeitura) {
        this.prmtNomePrefeitura = prmtNomePrefeitura;
    }

    public Boolean getPrmtVizualizarMensagem() {
        return prmtVizualizarMensagem;
    }

    public void setPrmtVizualizarMensagem(Boolean prmtVizualizarMensagem) {
        this.prmtVizualizarMensagem = prmtVizualizarMensagem;
    }

    public String getPrmtCertificadoDescricao() {
        return prmtCertificadoDescricao;
    }

    public void setPrmtCertificadoDescricao(String prmtCertificadoDescricao) {
        this.prmtCertificadoDescricao = prmtCertificadoDescricao;
    }

    public String getPrmtVersao() {
        return prmtVersao;
    }

    public void setPrmtVersao(String prmtVersao) {
        this.prmtVersao = prmtVersao;
    }

    public String getPrmtVersaoSchemas() {
        return prmtVersaoSchemas;
    }

    public void setPrmtVersaoSchemas(String prmtVersaoSchemas) {
        this.prmtVersaoSchemas = prmtVersaoSchemas;
    }

    public Boolean getPrmtNfce() {
        return prmtNfce;
    }

    public void setPrmtNfce(Boolean prmtNfce) {
        this.prmtNfce = prmtNfce;
    }

    public Integer getPrmtTipoDanfce() {
        return prmtTipoDanfce;
    }

    public void setPrmtTipoDanfce(Integer prmtTipoDanfce) {
        this.prmtTipoDanfce = prmtTipoDanfce;
    }

    public String getPrmtImpressoraModelo() {
        return prmtImpressoraModelo;
    }

    public void setPrmtImpressoraModelo(String prmtImpressoraModelo) {
        this.prmtImpressoraModelo = prmtImpressoraModelo;
    }

    public String getPrmtImpressoraNome() {
        return prmtImpressoraNome;
    }

    public void setPrmtImpressoraNome(String prmtImpressoraNome) {
        this.prmtImpressoraNome = prmtImpressoraNome;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prmtId != null ? prmtId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Parametros)) {
            return false;
        }
        Parametros other = (Parametros) object;
        if ((this.prmtId == null && other.prmtId != null) || (this.prmtId != null && !this.prmtId.equals(other.prmtId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.Parametros[ prmtId=" + prmtId + " ]";
    }
    
}
