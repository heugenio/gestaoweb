/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hjsystems.gestaoweb.entity;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "LIVROS_FISCAIS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LivrosFiscais.findAll", query = "SELECT l FROM LivrosFiscais l"),
    @NamedQuery(name = "LivrosFiscais.findByLvfsId", query = "SELECT l FROM LivrosFiscais l WHERE l.lvfsId = :lvfsId"),
    @NamedQuery(name = "LivrosFiscais.findByLvfsIndicadorOperacao", query = "SELECT l FROM LivrosFiscais l WHERE l.lvfsIndicadorOperacao = :lvfsIndicadorOperacao"),
    @NamedQuery(name = "LivrosFiscais.findByLvfsIndicadorEmitenteTitulo", query = "SELECT l FROM LivrosFiscais l WHERE l.lvfsIndicadorEmitenteTitulo = :lvfsIndicadorEmitenteTitulo"),
    @NamedQuery(name = "LivrosFiscais.findByLvfsIndicadorTipoComplIcms", query = "SELECT l FROM LivrosFiscais l WHERE l.lvfsIndicadorTipoComplIcms = :lvfsIndicadorTipoComplIcms"),
    @NamedQuery(name = "LivrosFiscais.findByLvfsNumDocumentoFiscal", query = "SELECT l FROM LivrosFiscais l WHERE l.lvfsNumDocumentoFiscal = :lvfsNumDocumentoFiscal"),
    @NamedQuery(name = "LivrosFiscais.findByLvfsNumLancamentoContabil", query = "SELECT l FROM LivrosFiscais l WHERE l.lvfsNumLancamentoContabil = :lvfsNumLancamentoContabil"),
    @NamedQuery(name = "LivrosFiscais.findByLvfsSerie", query = "SELECT l FROM LivrosFiscais l WHERE l.lvfsSerie = :lvfsSerie"),
    @NamedQuery(name = "LivrosFiscais.findByLvfsSubserie", query = "SELECT l FROM LivrosFiscais l WHERE l.lvfsSubserie = :lvfsSubserie"),
    @NamedQuery(name = "LivrosFiscais.findByLvfsDataDocumento", query = "SELECT l FROM LivrosFiscais l WHERE l.lvfsDataDocumento = :lvfsDataDocumento"),
    @NamedQuery(name = "LivrosFiscais.findByLvfsDataEntradaSaida", query = "SELECT l FROM LivrosFiscais l WHERE l.lvfsDataEntradaSaida = :lvfsDataEntradaSaida"),
    @NamedQuery(name = "LivrosFiscais.findByLvfsCodModelo", query = "SELECT l FROM LivrosFiscais l WHERE l.lvfsCodModelo = :lvfsCodModelo"),
    @NamedQuery(name = "LivrosFiscais.findByLvfsCodSituacao", query = "SELECT l FROM LivrosFiscais l WHERE l.lvfsCodSituacao = :lvfsCodSituacao"),
    @NamedQuery(name = "LivrosFiscais.findByLvfsCodSituacaoTributaria", query = "SELECT l FROM LivrosFiscais l WHERE l.lvfsCodSituacaoTributaria = :lvfsCodSituacaoTributaria"),
    @NamedQuery(name = "LivrosFiscais.findByLvfsCodFiscPrestacaoServico", query = "SELECT l FROM LivrosFiscais l WHERE l.lvfsCodFiscPrestacaoServico = :lvfsCodFiscPrestacaoServico"),
    @NamedQuery(name = "LivrosFiscais.findByLvfsCodTributacaoIssqn", query = "SELECT l FROM LivrosFiscais l WHERE l.lvfsCodTributacaoIssqn = :lvfsCodTributacaoIssqn"),
    @NamedQuery(name = "LivrosFiscais.findByLvfsCodTributacaoIpi", query = "SELECT l FROM LivrosFiscais l WHERE l.lvfsCodTributacaoIpi = :lvfsCodTributacaoIpi"),
    @NamedQuery(name = "LivrosFiscais.findByLvfsCodGenero", query = "SELECT l FROM LivrosFiscais l WHERE l.lvfsCodGenero = :lvfsCodGenero"),
    @NamedQuery(name = "LivrosFiscais.findByLvfsCodRefObservacao", query = "SELECT l FROM LivrosFiscais l WHERE l.lvfsCodRefObservacao = :lvfsCodRefObservacao"),
    @NamedQuery(name = "LivrosFiscais.findByLvfsClasConsServTelecom", query = "SELECT l FROM LivrosFiscais l WHERE l.lvfsClasConsServTelecom = :lvfsClasConsServTelecom"),
    @NamedQuery(name = "LivrosFiscais.findByLvfsClasConsGas", query = "SELECT l FROM LivrosFiscais l WHERE l.lvfsClasConsGas = :lvfsClasConsGas"),
    @NamedQuery(name = "LivrosFiscais.findByLvfsClasConsAgua", query = "SELECT l FROM LivrosFiscais l WHERE l.lvfsClasConsAgua = :lvfsClasConsAgua"),
    @NamedQuery(name = "LivrosFiscais.findByLvfsClasConsEnergiaEletrica", query = "SELECT l FROM LivrosFiscais l WHERE l.lvfsClasConsEnergiaEletrica = :lvfsClasConsEnergiaEletrica"),
    @NamedQuery(name = "LivrosFiscais.findByLvfsNumCaixaEcf", query = "SELECT l FROM LivrosFiscais l WHERE l.lvfsNumCaixaEcf = :lvfsNumCaixaEcf"),
    @NamedQuery(name = "LivrosFiscais.findByLvfsNumFabricacaoEcf", query = "SELECT l FROM LivrosFiscais l WHERE l.lvfsNumFabricacaoEcf = :lvfsNumFabricacaoEcf"),
    @NamedQuery(name = "LivrosFiscais.findByLvfsContadorReinicioOperacao", query = "SELECT l FROM LivrosFiscais l WHERE l.lvfsContadorReinicioOperacao = :lvfsContadorReinicioOperacao"),
    @NamedQuery(name = "LivrosFiscais.findByLvfsContadorReducaoZ", query = "SELECT l FROM LivrosFiscais l WHERE l.lvfsContadorReducaoZ = :lvfsContadorReducaoZ"),
    @NamedQuery(name = "LivrosFiscais.findByLvfsValorFrete", query = "SELECT l FROM LivrosFiscais l WHERE l.lvfsValorFrete = :lvfsValorFrete"),
    @NamedQuery(name = "LivrosFiscais.findByLvfsValorSeguro", query = "SELECT l FROM LivrosFiscais l WHERE l.lvfsValorSeguro = :lvfsValorSeguro"),
    @NamedQuery(name = "LivrosFiscais.findByLvfsLastupdate", query = "SELECT l FROM LivrosFiscais l WHERE l.lvfsLastupdate = :lvfsLastupdate")})
public class LivrosFiscais implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LVFS_ID")
    private String lvfsId;
    @Basic(optional = false)
    @Column(name = "LVFS_INDICADOR_OPERACAO")
    private Character lvfsIndicadorOperacao;
    @Column(name = "LVFS_INDICADOR_EMITENTE_TITULO")
    private Character lvfsIndicadorEmitenteTitulo;
    @Column(name = "LVFS_INDICADOR_TIPO_COMPL_ICMS")
    private String lvfsIndicadorTipoComplIcms;
    @Basic(optional = false)
    @Column(name = "LVFS_NUM_DOCUMENTO_FISCAL")
    private String lvfsNumDocumentoFiscal;
    @Column(name = "LVFS_NUM_LANCAMENTO_CONTABIL")
    private String lvfsNumLancamentoContabil;
    @Column(name = "LVFS_SERIE")
    private Character lvfsSerie;
    @Column(name = "LVFS_SUBSERIE")
    private Character lvfsSubserie;
    @Column(name = "LVFS_DATA_DOCUMENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lvfsDataDocumento;
    @Column(name = "LVFS_DATA_ENTRADA_SAIDA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lvfsDataEntradaSaida;
    @Column(name = "LVFS_COD_MODELO")
    private String lvfsCodModelo;
    @Column(name = "LVFS_COD_SITUACAO")
    private String lvfsCodSituacao;
    @Column(name = "LVFS_COD_SITUACAO_TRIBUTARIA")
    private String lvfsCodSituacaoTributaria;
    @Column(name = "LVFS_COD_FISC_PRESTACAO_SERVICO")
    private String lvfsCodFiscPrestacaoServico;
    @Column(name = "LVFS_COD_TRIBUTACAO_ISSQN")
    private String lvfsCodTributacaoIssqn;
    @Column(name = "LVFS_COD_TRIBUTACAO_IPI")
    private String lvfsCodTributacaoIpi;
    @Column(name = "LVFS_COD_GENERO")
    private String lvfsCodGenero;
    @Column(name = "LVFS_COD_REF_OBSERVACAO")
    private String lvfsCodRefObservacao;
    @Column(name = "LVFS_CLAS_CONS_SERV_TELECOM")
    private String lvfsClasConsServTelecom;
    @Column(name = "LVFS_CLAS_CONS_GAS")
    private String lvfsClasConsGas;
    @Column(name = "LVFS_CLAS_CONS_AGUA")
    private String lvfsClasConsAgua;
    @Column(name = "LVFS_CLAS_CONS_ENERGIA_ELETRICA")
    private String lvfsClasConsEnergiaEletrica;
    @Column(name = "LVFS_NUM_CAIXA_ECF")
    private String lvfsNumCaixaEcf;
    @Column(name = "LVFS_NUM_FABRICACAO_ECF")
    private String lvfsNumFabricacaoEcf;
    @Column(name = "LVFS_CONTADOR_REINICIO_OPERACAO")
    private String lvfsContadorReinicioOperacao;
    @Column(name = "LVFS_CONTADOR_REDUCAO_Z")
    private String lvfsContadorReducaoZ;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "LVFS_VALOR_FRETE")
    private BigDecimal lvfsValorFrete;
    @Basic(optional = false)
    @Column(name = "LVFS_VALOR_SEGURO")
    private BigDecimal lvfsValorSeguro;
    @Column(name = "LVFS_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lvfsLastupdate;
    @OneToMany(mappedBy = "lvfsId")
    private List<ItensLivrosFiscais> itensLivrosFiscaisList;
    @JoinColumn(name = "PESS_ID", referencedColumnName = "PESS_ID")
    @ManyToOne
    private Pessoas pessId;

    public LivrosFiscais() {
    }

    public LivrosFiscais(String lvfsId) {
        this.lvfsId = lvfsId;
    }

    public LivrosFiscais(String lvfsId, Character lvfsIndicadorOperacao, String lvfsNumDocumentoFiscal, BigDecimal lvfsValorFrete, BigDecimal lvfsValorSeguro) {
        this.lvfsId = lvfsId;
        this.lvfsIndicadorOperacao = lvfsIndicadorOperacao;
        this.lvfsNumDocumentoFiscal = lvfsNumDocumentoFiscal;
        this.lvfsValorFrete = lvfsValorFrete;
        this.lvfsValorSeguro = lvfsValorSeguro;
    }

    public String getLvfsId() {
        return lvfsId;
    }

    public void setLvfsId(String lvfsId) {
        this.lvfsId = lvfsId;
    }

    public Character getLvfsIndicadorOperacao() {
        return lvfsIndicadorOperacao;
    }

    public void setLvfsIndicadorOperacao(Character lvfsIndicadorOperacao) {
        this.lvfsIndicadorOperacao = lvfsIndicadorOperacao;
    }

    public Character getLvfsIndicadorEmitenteTitulo() {
        return lvfsIndicadorEmitenteTitulo;
    }

    public void setLvfsIndicadorEmitenteTitulo(Character lvfsIndicadorEmitenteTitulo) {
        this.lvfsIndicadorEmitenteTitulo = lvfsIndicadorEmitenteTitulo;
    }

    public String getLvfsIndicadorTipoComplIcms() {
        return lvfsIndicadorTipoComplIcms;
    }

    public void setLvfsIndicadorTipoComplIcms(String lvfsIndicadorTipoComplIcms) {
        this.lvfsIndicadorTipoComplIcms = lvfsIndicadorTipoComplIcms;
    }

    public String getLvfsNumDocumentoFiscal() {
        return lvfsNumDocumentoFiscal;
    }

    public void setLvfsNumDocumentoFiscal(String lvfsNumDocumentoFiscal) {
        this.lvfsNumDocumentoFiscal = lvfsNumDocumentoFiscal;
    }

    public String getLvfsNumLancamentoContabil() {
        return lvfsNumLancamentoContabil;
    }

    public void setLvfsNumLancamentoContabil(String lvfsNumLancamentoContabil) {
        this.lvfsNumLancamentoContabil = lvfsNumLancamentoContabil;
    }

    public Character getLvfsSerie() {
        return lvfsSerie;
    }

    public void setLvfsSerie(Character lvfsSerie) {
        this.lvfsSerie = lvfsSerie;
    }

    public Character getLvfsSubserie() {
        return lvfsSubserie;
    }

    public void setLvfsSubserie(Character lvfsSubserie) {
        this.lvfsSubserie = lvfsSubserie;
    }

    public Date getLvfsDataDocumento() {
        return lvfsDataDocumento;
    }

    public void setLvfsDataDocumento(Date lvfsDataDocumento) {
        this.lvfsDataDocumento = lvfsDataDocumento;
    }

    public Date getLvfsDataEntradaSaida() {
        return lvfsDataEntradaSaida;
    }

    public void setLvfsDataEntradaSaida(Date lvfsDataEntradaSaida) {
        this.lvfsDataEntradaSaida = lvfsDataEntradaSaida;
    }

    public String getLvfsCodModelo() {
        return lvfsCodModelo;
    }

    public void setLvfsCodModelo(String lvfsCodModelo) {
        this.lvfsCodModelo = lvfsCodModelo;
    }

    public String getLvfsCodSituacao() {
        return lvfsCodSituacao;
    }

    public void setLvfsCodSituacao(String lvfsCodSituacao) {
        this.lvfsCodSituacao = lvfsCodSituacao;
    }

    public String getLvfsCodSituacaoTributaria() {
        return lvfsCodSituacaoTributaria;
    }

    public void setLvfsCodSituacaoTributaria(String lvfsCodSituacaoTributaria) {
        this.lvfsCodSituacaoTributaria = lvfsCodSituacaoTributaria;
    }

    public String getLvfsCodFiscPrestacaoServico() {
        return lvfsCodFiscPrestacaoServico;
    }

    public void setLvfsCodFiscPrestacaoServico(String lvfsCodFiscPrestacaoServico) {
        this.lvfsCodFiscPrestacaoServico = lvfsCodFiscPrestacaoServico;
    }

    public String getLvfsCodTributacaoIssqn() {
        return lvfsCodTributacaoIssqn;
    }

    public void setLvfsCodTributacaoIssqn(String lvfsCodTributacaoIssqn) {
        this.lvfsCodTributacaoIssqn = lvfsCodTributacaoIssqn;
    }

    public String getLvfsCodTributacaoIpi() {
        return lvfsCodTributacaoIpi;
    }

    public void setLvfsCodTributacaoIpi(String lvfsCodTributacaoIpi) {
        this.lvfsCodTributacaoIpi = lvfsCodTributacaoIpi;
    }

    public String getLvfsCodGenero() {
        return lvfsCodGenero;
    }

    public void setLvfsCodGenero(String lvfsCodGenero) {
        this.lvfsCodGenero = lvfsCodGenero;
    }

    public String getLvfsCodRefObservacao() {
        return lvfsCodRefObservacao;
    }

    public void setLvfsCodRefObservacao(String lvfsCodRefObservacao) {
        this.lvfsCodRefObservacao = lvfsCodRefObservacao;
    }

    public String getLvfsClasConsServTelecom() {
        return lvfsClasConsServTelecom;
    }

    public void setLvfsClasConsServTelecom(String lvfsClasConsServTelecom) {
        this.lvfsClasConsServTelecom = lvfsClasConsServTelecom;
    }

    public String getLvfsClasConsGas() {
        return lvfsClasConsGas;
    }

    public void setLvfsClasConsGas(String lvfsClasConsGas) {
        this.lvfsClasConsGas = lvfsClasConsGas;
    }

    public String getLvfsClasConsAgua() {
        return lvfsClasConsAgua;
    }

    public void setLvfsClasConsAgua(String lvfsClasConsAgua) {
        this.lvfsClasConsAgua = lvfsClasConsAgua;
    }

    public String getLvfsClasConsEnergiaEletrica() {
        return lvfsClasConsEnergiaEletrica;
    }

    public void setLvfsClasConsEnergiaEletrica(String lvfsClasConsEnergiaEletrica) {
        this.lvfsClasConsEnergiaEletrica = lvfsClasConsEnergiaEletrica;
    }

    public String getLvfsNumCaixaEcf() {
        return lvfsNumCaixaEcf;
    }

    public void setLvfsNumCaixaEcf(String lvfsNumCaixaEcf) {
        this.lvfsNumCaixaEcf = lvfsNumCaixaEcf;
    }

    public String getLvfsNumFabricacaoEcf() {
        return lvfsNumFabricacaoEcf;
    }

    public void setLvfsNumFabricacaoEcf(String lvfsNumFabricacaoEcf) {
        this.lvfsNumFabricacaoEcf = lvfsNumFabricacaoEcf;
    }

    public String getLvfsContadorReinicioOperacao() {
        return lvfsContadorReinicioOperacao;
    }

    public void setLvfsContadorReinicioOperacao(String lvfsContadorReinicioOperacao) {
        this.lvfsContadorReinicioOperacao = lvfsContadorReinicioOperacao;
    }

    public String getLvfsContadorReducaoZ() {
        return lvfsContadorReducaoZ;
    }

    public void setLvfsContadorReducaoZ(String lvfsContadorReducaoZ) {
        this.lvfsContadorReducaoZ = lvfsContadorReducaoZ;
    }

    public BigDecimal getLvfsValorFrete() {
        return lvfsValorFrete;
    }

    public void setLvfsValorFrete(BigDecimal lvfsValorFrete) {
        this.lvfsValorFrete = lvfsValorFrete;
    }

    public BigDecimal getLvfsValorSeguro() {
        return lvfsValorSeguro;
    }

    public void setLvfsValorSeguro(BigDecimal lvfsValorSeguro) {
        this.lvfsValorSeguro = lvfsValorSeguro;
    }

    public Date getLvfsLastupdate() {
        return lvfsLastupdate;
    }

    public void setLvfsLastupdate(Date lvfsLastupdate) {
        this.lvfsLastupdate = lvfsLastupdate;
    }

    @XmlTransient
    public List<ItensLivrosFiscais> getItensLivrosFiscaisList() {
        return itensLivrosFiscaisList;
    }

    public void setItensLivrosFiscaisList(List<ItensLivrosFiscais> itensLivrosFiscaisList) {
        this.itensLivrosFiscaisList = itensLivrosFiscaisList;
    }

    public Pessoas getPessId() {
        return pessId;
    }

    public void setPessId(Pessoas pessId) {
        this.pessId = pessId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lvfsId != null ? lvfsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LivrosFiscais)) {
            return false;
        }
        LivrosFiscais other = (LivrosFiscais) object;
        if ((this.lvfsId == null && other.lvfsId != null) || (this.lvfsId != null && !this.lvfsId.equals(other.lvfsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.LivrosFiscais[ lvfsId=" + lvfsId + " ]";
    }
    
}
