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
import javax.persistence.Lob;
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
@Table(name = "DOCUMENTOS_FISCAIS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DocumentosFiscais.findAll", query = "SELECT d FROM DocumentosFiscais d"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsId", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsId = :dcfsId"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsModeloDocumento", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsModeloDocumento = :dcfsModeloDocumento"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsModeloNota", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsModeloNota = :dcfsModeloNota"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsNumeroNota", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsNumeroNota = :dcfsNumeroNota"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsChaveAcessoNfe", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsChaveAcessoNfe = :dcfsChaveAcessoNfe"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsDigitoChave", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsDigitoChave = :dcfsDigitoChave"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsDataSaida", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsDataSaida = :dcfsDataSaida"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsSerieNota", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsSerieNota = :dcfsSerieNota"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsDataNota", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsDataNota = :dcfsDataNota"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsDataCancelamento", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsDataCancelamento = :dcfsDataCancelamento"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsTipoFrete", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsTipoFrete = :dcfsTipoFrete"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsVlrFrete", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsVlrFrete = :dcfsVlrFrete"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsVlrSeguro", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsVlrSeguro = :dcfsVlrSeguro"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsVlrDespesas", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsVlrDespesas = :dcfsVlrDespesas"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsVlrEntrada", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsVlrEntrada = :dcfsVlrEntrada"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsVlrDesconto", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsVlrDesconto = :dcfsVlrDesconto"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsVlrDescontoServico", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsVlrDescontoServico = :dcfsVlrDescontoServico"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsVlrTotal", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsVlrTotal = :dcfsVlrTotal"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsStatus", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsStatus = :dcfsStatus"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsTipo", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsTipo = :dcfsTipo"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsTipoMovimento", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsTipoMovimento = :dcfsTipoMovimento"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsNumeroSerialEcf", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsNumeroSerialEcf = :dcfsNumeroSerialEcf"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsNumeroEcf", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsNumeroEcf = :dcfsNumeroEcf"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsCpfcnpj", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsCpfcnpj = :dcfsCpfcnpj"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsInscricao", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsInscricao = :dcfsInscricao"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsNome", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsNome = :dcfsNome"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsRazaoSocial", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsRazaoSocial = :dcfsRazaoSocial"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsTipoLogradouro", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsTipoLogradouro = :dcfsTipoLogradouro"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsLogradouro", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsLogradouro = :dcfsLogradouro"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsNumero", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsNumero = :dcfsNumero"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsComplemento", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsComplemento = :dcfsComplemento"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsCep", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsCep = :dcfsCep"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsZona", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsZona = :dcfsZona"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsMuniIbge", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsMuniIbge = :dcfsMuniIbge"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsMuniNome", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsMuniNome = :dcfsMuniNome"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsUf", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsUf = :dcfsUf"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsPais", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsPais = :dcfsPais"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsFone", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsFone = :dcfsFone"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsNaturezaOperacao", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsNaturezaOperacao = :dcfsNaturezaOperacao"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsInscEstSubTrib", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsInscEstSubTrib = :dcfsInscEstSubTrib"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsBairro", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsBairro = :dcfsBairro"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsPessId", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsPessId = :dcfsPessId"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsOpcmId", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsOpcmId = :dcfsOpcmId"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsVddrId", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsVddrId = :dcfsVddrId"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsOutrasDespAces", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsOutrasDespAces = :dcfsOutrasDespAces"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsBaseCalculoIcms", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsBaseCalculoIcms = :dcfsBaseCalculoIcms"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsValorIcms", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsValorIcms = :dcfsValorIcms"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsBaseCalculoIcmsSub", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsBaseCalculoIcmsSub = :dcfsBaseCalculoIcmsSub"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsValorIcmsSub", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsValorIcmsSub = :dcfsValorIcmsSub"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsValorProdutos", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsValorProdutos = :dcfsValorProdutos"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsValorIpi", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsValorIpi = :dcfsValorIpi"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsObservacao", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsObservacao = :dcfsObservacao"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsEndeId", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsEndeId = :dcfsEndeId"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsMsg", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsMsg = :dcfsMsg"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsIndEmissao", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsIndEmissao = :dcfsIndEmissao"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsValorCofins", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsValorCofins = :dcfsValorCofins"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsBaseCofins", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsBaseCofins = :dcfsBaseCofins"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsValorPis", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsValorPis = :dcfsValorPis"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsBasePis", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsBasePis = :dcfsBasePis"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsValorCofinsRetido", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsValorCofinsRetido = :dcfsValorCofinsRetido"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsBaseCofinsRetido", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsBaseCofinsRetido = :dcfsBaseCofinsRetido"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsBasePisRetido", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsBasePisRetido = :dcfsBasePisRetido"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsValorPisRetido", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsValorPisRetido = :dcfsValorPisRetido"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsContabilizar", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsContabilizar = :dcfsContabilizar"),
    @NamedQuery(name = "DocumentosFiscais.findByDcFsLASTUPDATE", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcFsLASTUPDATE = :dcFsLASTUPDATE"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsAcerto", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsAcerto = :dcfsAcerto"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsValorIssRetido", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsValorIssRetido = :dcfsValorIssRetido"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsTotalVerifNf", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsTotalVerifNf = :dcfsTotalVerifNf"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsTotalVerifProdutos", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsTotalVerifProdutos = :dcfsTotalVerifProdutos"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsVenVddrId", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsVenVddrId = :dcfsVenVddrId"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsVlrDescCom", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsVlrDescCom = :dcfsVlrDescCom"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsPesPessId", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsPesPessId = :dcfsPesPessId"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsMotivoCanc", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsMotivoCanc = :dcfsMotivoCanc"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsUsrsIdCanc", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsUsrsIdCanc = :dcfsUsrsIdCanc"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsExdFxsn", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsExdFxsn = :dcfsExdFxsn"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsEndeId1", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsEndeId1 = :dcfsEndeId1"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsImpImportacao", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsImpImportacao = :dcfsImpImportacao"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsTxSiscomex", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsTxSiscomex = :dcfsTxSiscomex"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsBaseImportacao", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsBaseImportacao = :dcfsBaseImportacao"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsValorIof", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsValorIof = :dcfsValorIof"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsDespesasAdu", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsDespesasAdu = :dcfsDespesasAdu"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsUnemId", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsUnemId = :dcfsUnemId"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsTipoCte", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsTipoCte = :dcfsTipoCte"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsIndPgto", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsIndPgto = :dcfsIndPgto"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsInscmunicipal", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsInscmunicipal = :dcfsInscmunicipal"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsSeparado", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsSeparado = :dcfsSeparado"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsUsrsId", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsUsrsId = :dcfsUsrsId"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsConferido", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsConferido = :dcfsConferido"),
    @NamedQuery(name = "DocumentosFiscais.findByDcfsConferir", query = "SELECT d FROM DocumentosFiscais d WHERE d.dcfsConferir = :dcfsConferir")})
public class DocumentosFiscais implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DCFS_ID")
    private String dcfsId;
    @Column(name = "DCFS_MODELO_DOCUMENTO")
    private String dcfsModeloDocumento;
    @Column(name = "DCFS_MODELO_NOTA")
    private String dcfsModeloNota;
    @Column(name = "DCFS_NUMERO_NOTA")
    private String dcfsNumeroNota;
    @Column(name = "DCFS_CHAVE_ACESSO_NFE")
    private String dcfsChaveAcessoNfe;
    @Column(name = "DCFS_DIGITO_CHAVE")
    private Character dcfsDigitoChave;
    @Column(name = "DCFS_DATA_SAIDA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dcfsDataSaida;
    @Column(name = "DCFS_SERIE_NOTA")
    private String dcfsSerieNota;
    @Column(name = "DCFS_DATA_NOTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dcfsDataNota;
    @Column(name = "DCFS_DATA_CANCELAMENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dcfsDataCancelamento;
    @Basic(optional = false)
    @Column(name = "DCFS_TIPO_FRETE")
    private String dcfsTipoFrete;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "DCFS_VLR_FRETE")
    private BigDecimal dcfsVlrFrete;
    @Basic(optional = false)
    @Column(name = "DCFS_VLR_SEGURO")
    private BigDecimal dcfsVlrSeguro;
    @Basic(optional = false)
    @Column(name = "DCFS_VLR_DESPESAS")
    private BigDecimal dcfsVlrDespesas;
    @Basic(optional = false)
    @Column(name = "DCFS_VLR_ENTRADA")
    private BigDecimal dcfsVlrEntrada;
    @Basic(optional = false)
    @Column(name = "DCFS_VLR_DESCONTO")
    private BigDecimal dcfsVlrDesconto;
    @Basic(optional = false)
    @Column(name = "DCFS_VLR_DESCONTO_SERVICO")
    private BigDecimal dcfsVlrDescontoServico;
    @Basic(optional = false)
    @Column(name = "DCFS_VLR_TOTAL")
    private BigDecimal dcfsVlrTotal;
    @Basic(optional = false)
    @Column(name = "DCFS_STATUS")
    private String dcfsStatus;
    @Basic(optional = false)
    @Column(name = "DCFS_TIPO")
    private String dcfsTipo;
    @Basic(optional = false)
    @Column(name = "DCFS_TIPO_MOVIMENTO")
    private String dcfsTipoMovimento;
    @Column(name = "DCFS_NUMERO_SERIAL_ECF")
    private String dcfsNumeroSerialEcf;
    @Column(name = "DCFS_NUMERO_ECF")
    private String dcfsNumeroEcf;
    @Column(name = "DCFS_CPFCNPJ")
    private String dcfsCpfcnpj;
    @Column(name = "DCFS_INSCRICAO")
    private String dcfsInscricao;
    @Column(name = "DCFS_NOME")
    private String dcfsNome;
    @Column(name = "DCFS_RAZAO_SOCIAL")
    private String dcfsRazaoSocial;
    @Column(name = "DCFS_TIPO_LOGRADOURO")
    private String dcfsTipoLogradouro;
    @Column(name = "DCFS_LOGRADOURO")
    private String dcfsLogradouro;
    @Column(name = "DCFS_NUMERO")
    private String dcfsNumero;
    @Column(name = "DCFS_COMPLEMENTO")
    private String dcfsComplemento;
    @Column(name = "DCFS_CEP")
    private String dcfsCep;
    @Column(name = "DCFS_ZONA")
    private String dcfsZona;
    @Column(name = "DCFS_MUNI_IBGE")
    private String dcfsMuniIbge;
    @Column(name = "DCFS_MUNI_NOME")
    private String dcfsMuniNome;
    @Column(name = "DCFS_UF")
    private String dcfsUf;
    @Column(name = "DCFS_PAIS")
    private String dcfsPais;
    @Column(name = "DCFS_FONE")
    private String dcfsFone;
    @Column(name = "DCFS_NATUREZA_OPERACAO")
    private String dcfsNaturezaOperacao;
    @Column(name = "DCFS_INSC_EST_SUB_TRIB")
    private String dcfsInscEstSubTrib;
    @Column(name = "DCFS_BAIRRO")
    private String dcfsBairro;
    @Column(name = "DCFS_OPCM_ID")
    private String dcfsOpcmId;
    @Column(name = "DCFS_VDDR_ID")
    private String dcfsVddrId;
    @Basic(optional = false)
    @Column(name = "DCFS_OUTRAS_DESP_ACES")
    private BigDecimal dcfsOutrasDespAces;
    @Basic(optional = false)
    @Column(name = "DCFS_BASE_CALCULO_ICMS")
    private BigDecimal dcfsBaseCalculoIcms;
    @Basic(optional = false)
    @Column(name = "DCFS_VALOR_ICMS")
    private BigDecimal dcfsValorIcms;
    @Basic(optional = false)
    @Column(name = "DCFS_BASE_CALCULO_ICMS_SUB")
    private BigDecimal dcfsBaseCalculoIcmsSub;
    @Basic(optional = false)
    @Column(name = "DCFS_VALOR_ICMS_SUB")
    private BigDecimal dcfsValorIcmsSub;
    @Basic(optional = false)
    @Column(name = "DCFS_VALOR_PRODUTOS")
    private BigDecimal dcfsValorProdutos;
    @Basic(optional = false)
    @Column(name = "DCFS_VALOR_IPI")
    private BigDecimal dcfsValorIpi;
    @Column(name = "DCFS_OBSERVACAO")
    private String dcfsObservacao;
    @Column(name = "DCFS_ENDE_ID")
    private String dcfsEndeId;
    @Column(name = "DCFS_MSG")
    private String dcfsMsg;
    @Column(name = "DCFS_IND_EMISSAO")
    private String dcfsIndEmissao;
    @Basic(optional = false)
    @Column(name = "DCFS_VALOR_COFINS")
    private BigDecimal dcfsValorCofins;
    @Basic(optional = false)
    @Column(name = "DCFS_BASE_COFINS")
    private BigDecimal dcfsBaseCofins;
    @Basic(optional = false)
    @Column(name = "DCFS_VALOR_PIS")
    private BigDecimal dcfsValorPis;
    @Basic(optional = false)
    @Column(name = "DCFS_BASE_PIS")
    private BigDecimal dcfsBasePis;
    @Basic(optional = false)
    @Column(name = "DCFS_VALOR_COFINS_RETIDO")
    private BigDecimal dcfsValorCofinsRetido;
    @Basic(optional = false)
    @Column(name = "DCFS_BASE_COFINS_RETIDO")
    private BigDecimal dcfsBaseCofinsRetido;
    @Basic(optional = false)
    @Column(name = "DCFS_BASE_PIS_RETIDO")
    private BigDecimal dcfsBasePisRetido;
    @Basic(optional = false)
    @Column(name = "DCFS_VALOR_PIS_RETIDO")
    private BigDecimal dcfsValorPisRetido;
    @Lob
    @Column(name = "DCFS_ARQUIVO_NFE")
    private String dcfsArquivoNfe;
    @Basic(optional = false)
    @Column(name = "DCFS_CONTABILIZAR")
    private String dcfsContabilizar;
    @Column(name = "DcFs_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dcFsLASTUPDATE;
    @Column(name = "DCFS_ACERTO")
    private String dcfsAcerto;
    @Column(name = "DCFS_VALOR_ISS_RETIDO")
    private BigDecimal dcfsValorIssRetido;
    @Basic(optional = false)
    @Column(name = "DCFS_TOTAL_VERIF_NF")
    private BigDecimal dcfsTotalVerifNf;
    @Basic(optional = false)
    @Column(name = "DCFS_TOTAL_VERIF_PRODUTOS")
    private BigDecimal dcfsTotalVerifProdutos;
    @Column(name = "DCFS_VEN_VDDR_ID")
    private String dcfsVenVddrId;
    @Basic(optional = false)
    @Column(name = "DCFS_VLR_DESC_COM")
    private BigDecimal dcfsVlrDescCom;
    @Column(name = "DCFS_PES_PESS_ID")
    private String dcfsPesPessId;
    @Column(name = "DCFS_MOTIVO_CANC")
    private String dcfsMotivoCanc;
    @Column(name = "DCFS_USRS_ID_CANC")
    private String dcfsUsrsIdCanc;
    @Column(name = "DCFS_EXD_FXSN")
    private String dcfsExdFxsn;
    @Column(name = "DCFS_ENDE_ID1")
    private String dcfsEndeId1;
    @Basic(optional = false)
    @Column(name = "DCFS_IMP_IMPORTACAO")
    private BigDecimal dcfsImpImportacao;
    @Basic(optional = false)
    @Column(name = "DCFS_TX_SISCOMEX")
    private BigDecimal dcfsTxSiscomex;
    @Column(name = "DCFS_BASE_IMPORTACAO")
    private BigDecimal dcfsBaseImportacao;
    @Column(name = "DCFS_VALOR_IOF")
    private BigDecimal dcfsValorIof;
    @Column(name = "DCFS_DESPESAS_ADU")
    private BigDecimal dcfsDespesasAdu;
    @Column(name = "DCFS_UNEM_ID")
    private String dcfsUnemId;
    @Column(name = "DCFS_TIPO_CTE")
    private String dcfsTipoCte;
    @Column(name = "DCFS_IND_PGTO")
    private String dcfsIndPgto;
    @Column(name = "DCFS_INSCMUNICIPAL")
    private String dcfsInscmunicipal;
    @Column(name = "DCFS_SEPARADO")
    private String dcfsSeparado;
    @Column(name = "DCFS_USRS_ID")
    private String dcfsUsrsId;
    @Column(name = "DCFS_CONFERIDO")
    private String dcfsConferido;
    @Column(name = "DCFS_CONFERIR")
    private String dcfsConferir;
    @OneToMany(mappedBy = "dcfsId")
    private List<ItensFaturados> itensFaturadosList;
    @OneToMany(mappedBy = "dcfsId")
    private List<DcfsLanccontabeis> dcfsLanccontabeisList;
    @OneToMany(mappedBy = "dcfsId")
    private List<Entregas> entregasList;
    @OneToMany(mappedBy = "dcfsId")
    private List<ComissoesTecnicos> comissoesTecnicosList;
    @OneToMany(mappedBy = "docDcfsId")
    private List<DocumentosCte> documentosCteList;
    @OneToMany(mappedBy = "dcfsId")
    private List<DocumentosCte> documentosCteList1;
    @OneToMany(mappedBy = "dcfsId")
    private List<Rmas> rmasList;
    @OneToMany(mappedBy = "dcfsId")
    private List<PedidosCentroCustos> pedidosCentroCustosList;
    @OneToMany(mappedBy = "dcfsId")
    private List<NegociacoesPedidos> negociacoesPedidosList;
    @OneToMany(mappedBy = "dcfsId")
    private List<ItensEntregados> itensEntregadosList;
    @OneToMany(mappedBy = "dcfsId")
    private List<MovimentoContabil> movimentoContabilList;
    @OneToMany(mappedBy = "docDcfsId")
    private List<DocumentosFiscais> documentosFiscaisList;
    @JoinColumn(name = "DOC_DCFS_ID", referencedColumnName = "DCFS_ID")
    @ManyToOne
    private DocumentosFiscais docDcfsId;
    @OneToMany(mappedBy = "docDcfsId2")
    private List<DocumentosFiscais> documentosFiscaisList1;
    @JoinColumn(name = "DOC_DCFS_ID2", referencedColumnName = "DCFS_ID")
    @ManyToOne
    private DocumentosFiscais docDcfsId2;
    @JoinColumn(name = "EXPD_ID", referencedColumnName = "EXPD_ID")
    @ManyToOne
    private Expedicoes expdId;
    @JoinColumn(name = "HMOV_ID", referencedColumnName = "HMOV_ID")
    @ManyToOne
    private HistoricosMovimentacoes hmovId;
    @JoinColumn(name = "PDDS_ID", referencedColumnName = "PDDS_ID")
    @ManyToOne
    private Pedidos pddsId;
    @JoinColumn(name = "TITU_ID", referencedColumnName = "TITU_ID")
    @ManyToOne
    private Titulos tituId;
    @JoinColumn(name = "DCFS_PESS_ID", referencedColumnName = "PESS_ID")
    @ManyToOne
    private Pessoas dcfsPessId;

    public DocumentosFiscais() {
    }

    public DocumentosFiscais(String dcfsId) {
        this.dcfsId = dcfsId;
    }

    public DocumentosFiscais(String dcfsId, String dcfsTipoFrete, BigDecimal dcfsVlrFrete, BigDecimal dcfsVlrSeguro, BigDecimal dcfsVlrDespesas, BigDecimal dcfsVlrEntrada, BigDecimal dcfsVlrDesconto, BigDecimal dcfsVlrDescontoServico, BigDecimal dcfsVlrTotal, String dcfsStatus, String dcfsTipo, String dcfsTipoMovimento, BigDecimal dcfsOutrasDespAces, BigDecimal dcfsBaseCalculoIcms, BigDecimal dcfsValorIcms, BigDecimal dcfsBaseCalculoIcmsSub, BigDecimal dcfsValorIcmsSub, BigDecimal dcfsValorProdutos, BigDecimal dcfsValorIpi, BigDecimal dcfsValorCofins, BigDecimal dcfsBaseCofins, BigDecimal dcfsValorPis, BigDecimal dcfsBasePis, BigDecimal dcfsValorCofinsRetido, BigDecimal dcfsBaseCofinsRetido, BigDecimal dcfsBasePisRetido, BigDecimal dcfsValorPisRetido, String dcfsContabilizar, BigDecimal dcfsTotalVerifNf, BigDecimal dcfsTotalVerifProdutos, BigDecimal dcfsVlrDescCom, BigDecimal dcfsImpImportacao, BigDecimal dcfsTxSiscomex) {
        this.dcfsId = dcfsId;
        this.dcfsTipoFrete = dcfsTipoFrete;
        this.dcfsVlrFrete = dcfsVlrFrete;
        this.dcfsVlrSeguro = dcfsVlrSeguro;
        this.dcfsVlrDespesas = dcfsVlrDespesas;
        this.dcfsVlrEntrada = dcfsVlrEntrada;
        this.dcfsVlrDesconto = dcfsVlrDesconto;
        this.dcfsVlrDescontoServico = dcfsVlrDescontoServico;
        this.dcfsVlrTotal = dcfsVlrTotal;
        this.dcfsStatus = dcfsStatus;
        this.dcfsTipo = dcfsTipo;
        this.dcfsTipoMovimento = dcfsTipoMovimento;
        this.dcfsOutrasDespAces = dcfsOutrasDespAces;
        this.dcfsBaseCalculoIcms = dcfsBaseCalculoIcms;
        this.dcfsValorIcms = dcfsValorIcms;
        this.dcfsBaseCalculoIcmsSub = dcfsBaseCalculoIcmsSub;
        this.dcfsValorIcmsSub = dcfsValorIcmsSub;
        this.dcfsValorProdutos = dcfsValorProdutos;
        this.dcfsValorIpi = dcfsValorIpi;
        this.dcfsValorCofins = dcfsValorCofins;
        this.dcfsBaseCofins = dcfsBaseCofins;
        this.dcfsValorPis = dcfsValorPis;
        this.dcfsBasePis = dcfsBasePis;
        this.dcfsValorCofinsRetido = dcfsValorCofinsRetido;
        this.dcfsBaseCofinsRetido = dcfsBaseCofinsRetido;
        this.dcfsBasePisRetido = dcfsBasePisRetido;
        this.dcfsValorPisRetido = dcfsValorPisRetido;
        this.dcfsContabilizar = dcfsContabilizar;
        this.dcfsTotalVerifNf = dcfsTotalVerifNf;
        this.dcfsTotalVerifProdutos = dcfsTotalVerifProdutos;
        this.dcfsVlrDescCom = dcfsVlrDescCom;
        this.dcfsImpImportacao = dcfsImpImportacao;
        this.dcfsTxSiscomex = dcfsTxSiscomex;
    }

    public String getDcfsId() {
        return dcfsId;
    }

    public void setDcfsId(String dcfsId) {
        this.dcfsId = dcfsId;
    }

    public String getDcfsModeloDocumento() {
        return dcfsModeloDocumento;
    }

    public void setDcfsModeloDocumento(String dcfsModeloDocumento) {
        this.dcfsModeloDocumento = dcfsModeloDocumento;
    }

    public String getDcfsModeloNota() {
        return dcfsModeloNota;
    }

    public void setDcfsModeloNota(String dcfsModeloNota) {
        this.dcfsModeloNota = dcfsModeloNota;
    }

    public String getDcfsNumeroNota() {
        return dcfsNumeroNota;
    }

    public void setDcfsNumeroNota(String dcfsNumeroNota) {
        this.dcfsNumeroNota = dcfsNumeroNota;
    }

    public String getDcfsChaveAcessoNfe() {
        return dcfsChaveAcessoNfe;
    }

    public void setDcfsChaveAcessoNfe(String dcfsChaveAcessoNfe) {
        this.dcfsChaveAcessoNfe = dcfsChaveAcessoNfe;
    }

    public Character getDcfsDigitoChave() {
        return dcfsDigitoChave;
    }

    public void setDcfsDigitoChave(Character dcfsDigitoChave) {
        this.dcfsDigitoChave = dcfsDigitoChave;
    }

    public Date getDcfsDataSaida() {
        return dcfsDataSaida;
    }

    public void setDcfsDataSaida(Date dcfsDataSaida) {
        this.dcfsDataSaida = dcfsDataSaida;
    }

    public String getDcfsSerieNota() {
        return dcfsSerieNota;
    }

    public void setDcfsSerieNota(String dcfsSerieNota) {
        this.dcfsSerieNota = dcfsSerieNota;
    }

    public Date getDcfsDataNota() {
        return dcfsDataNota;
    }

    public void setDcfsDataNota(Date dcfsDataNota) {
        this.dcfsDataNota = dcfsDataNota;
    }

    public Date getDcfsDataCancelamento() {
        return dcfsDataCancelamento;
    }

    public void setDcfsDataCancelamento(Date dcfsDataCancelamento) {
        this.dcfsDataCancelamento = dcfsDataCancelamento;
    }

    public String getDcfsTipoFrete() {
        return dcfsTipoFrete;
    }

    public void setDcfsTipoFrete(String dcfsTipoFrete) {
        this.dcfsTipoFrete = dcfsTipoFrete;
    }

    public BigDecimal getDcfsVlrFrete() {
        return dcfsVlrFrete;
    }

    public void setDcfsVlrFrete(BigDecimal dcfsVlrFrete) {
        this.dcfsVlrFrete = dcfsVlrFrete;
    }

    public BigDecimal getDcfsVlrSeguro() {
        return dcfsVlrSeguro;
    }

    public void setDcfsVlrSeguro(BigDecimal dcfsVlrSeguro) {
        this.dcfsVlrSeguro = dcfsVlrSeguro;
    }

    public BigDecimal getDcfsVlrDespesas() {
        return dcfsVlrDespesas;
    }

    public void setDcfsVlrDespesas(BigDecimal dcfsVlrDespesas) {
        this.dcfsVlrDespesas = dcfsVlrDespesas;
    }

    public BigDecimal getDcfsVlrEntrada() {
        return dcfsVlrEntrada;
    }

    public void setDcfsVlrEntrada(BigDecimal dcfsVlrEntrada) {
        this.dcfsVlrEntrada = dcfsVlrEntrada;
    }

    public BigDecimal getDcfsVlrDesconto() {
        return dcfsVlrDesconto;
    }

    public void setDcfsVlrDesconto(BigDecimal dcfsVlrDesconto) {
        this.dcfsVlrDesconto = dcfsVlrDesconto;
    }

    public BigDecimal getDcfsVlrDescontoServico() {
        return dcfsVlrDescontoServico;
    }

    public void setDcfsVlrDescontoServico(BigDecimal dcfsVlrDescontoServico) {
        this.dcfsVlrDescontoServico = dcfsVlrDescontoServico;
    }

    public BigDecimal getDcfsVlrTotal() {
        return dcfsVlrTotal;
    }

    public void setDcfsVlrTotal(BigDecimal dcfsVlrTotal) {
        this.dcfsVlrTotal = dcfsVlrTotal;
    }

    public String getDcfsStatus() {
        return dcfsStatus;
    }

    public void setDcfsStatus(String dcfsStatus) {
        this.dcfsStatus = dcfsStatus;
    }

    public String getDcfsTipo() {
        return dcfsTipo;
    }

    public void setDcfsTipo(String dcfsTipo) {
        this.dcfsTipo = dcfsTipo;
    }

    public String getDcfsTipoMovimento() {
        return dcfsTipoMovimento;
    }

    public void setDcfsTipoMovimento(String dcfsTipoMovimento) {
        this.dcfsTipoMovimento = dcfsTipoMovimento;
    }

    public String getDcfsNumeroSerialEcf() {
        return dcfsNumeroSerialEcf;
    }

    public void setDcfsNumeroSerialEcf(String dcfsNumeroSerialEcf) {
        this.dcfsNumeroSerialEcf = dcfsNumeroSerialEcf;
    }

    public String getDcfsNumeroEcf() {
        return dcfsNumeroEcf;
    }

    public void setDcfsNumeroEcf(String dcfsNumeroEcf) {
        this.dcfsNumeroEcf = dcfsNumeroEcf;
    }

    public String getDcfsCpfcnpj() {
        return dcfsCpfcnpj;
    }

    public void setDcfsCpfcnpj(String dcfsCpfcnpj) {
        this.dcfsCpfcnpj = dcfsCpfcnpj;
    }

    public String getDcfsInscricao() {
        return dcfsInscricao;
    }

    public void setDcfsInscricao(String dcfsInscricao) {
        this.dcfsInscricao = dcfsInscricao;
    }

    public String getDcfsNome() {
        return dcfsNome;
    }

    public void setDcfsNome(String dcfsNome) {
        this.dcfsNome = dcfsNome;
    }

    public String getDcfsRazaoSocial() {
        return dcfsRazaoSocial;
    }

    public void setDcfsRazaoSocial(String dcfsRazaoSocial) {
        this.dcfsRazaoSocial = dcfsRazaoSocial;
    }

    public String getDcfsTipoLogradouro() {
        return dcfsTipoLogradouro;
    }

    public void setDcfsTipoLogradouro(String dcfsTipoLogradouro) {
        this.dcfsTipoLogradouro = dcfsTipoLogradouro;
    }

    public String getDcfsLogradouro() {
        return dcfsLogradouro;
    }

    public void setDcfsLogradouro(String dcfsLogradouro) {
        this.dcfsLogradouro = dcfsLogradouro;
    }

    public String getDcfsNumero() {
        return dcfsNumero;
    }

    public void setDcfsNumero(String dcfsNumero) {
        this.dcfsNumero = dcfsNumero;
    }

    public String getDcfsComplemento() {
        return dcfsComplemento;
    }

    public void setDcfsComplemento(String dcfsComplemento) {
        this.dcfsComplemento = dcfsComplemento;
    }

    public String getDcfsCep() {
        return dcfsCep;
    }

    public void setDcfsCep(String dcfsCep) {
        this.dcfsCep = dcfsCep;
    }

    public String getDcfsZona() {
        return dcfsZona;
    }

    public void setDcfsZona(String dcfsZona) {
        this.dcfsZona = dcfsZona;
    }

    public String getDcfsMuniIbge() {
        return dcfsMuniIbge;
    }

    public void setDcfsMuniIbge(String dcfsMuniIbge) {
        this.dcfsMuniIbge = dcfsMuniIbge;
    }

    public String getDcfsMuniNome() {
        return dcfsMuniNome;
    }

    public void setDcfsMuniNome(String dcfsMuniNome) {
        this.dcfsMuniNome = dcfsMuniNome;
    }

    public String getDcfsUf() {
        return dcfsUf;
    }

    public void setDcfsUf(String dcfsUf) {
        this.dcfsUf = dcfsUf;
    }

    public String getDcfsPais() {
        return dcfsPais;
    }

    public void setDcfsPais(String dcfsPais) {
        this.dcfsPais = dcfsPais;
    }

    public String getDcfsFone() {
        return dcfsFone;
    }

    public void setDcfsFone(String dcfsFone) {
        this.dcfsFone = dcfsFone;
    }

    public String getDcfsNaturezaOperacao() {
        return dcfsNaturezaOperacao;
    }

    public void setDcfsNaturezaOperacao(String dcfsNaturezaOperacao) {
        this.dcfsNaturezaOperacao = dcfsNaturezaOperacao;
    }

    public String getDcfsInscEstSubTrib() {
        return dcfsInscEstSubTrib;
    }

    public void setDcfsInscEstSubTrib(String dcfsInscEstSubTrib) {
        this.dcfsInscEstSubTrib = dcfsInscEstSubTrib;
    }

    public String getDcfsBairro() {
        return dcfsBairro;
    }

    public void setDcfsBairro(String dcfsBairro) {
        this.dcfsBairro = dcfsBairro;
    }

    public Pessoas getDcfsPessId() {
        return dcfsPessId;
    }

    public void setDcfsPessId(Pessoas dcfsPessId) {
        this.dcfsPessId = dcfsPessId;
    }

    public String getDcfsOpcmId() {
        return dcfsOpcmId;
    }

    public void setDcfsOpcmId(String dcfsOpcmId) {
        this.dcfsOpcmId = dcfsOpcmId;
    }

    public String getDcfsVddrId() {
        return dcfsVddrId;
    }

    public void setDcfsVddrId(String dcfsVddrId) {
        this.dcfsVddrId = dcfsVddrId;
    }

    public BigDecimal getDcfsOutrasDespAces() {
        return dcfsOutrasDespAces;
    }

    public void setDcfsOutrasDespAces(BigDecimal dcfsOutrasDespAces) {
        this.dcfsOutrasDespAces = dcfsOutrasDespAces;
    }

    public BigDecimal getDcfsBaseCalculoIcms() {
        return dcfsBaseCalculoIcms;
    }

    public void setDcfsBaseCalculoIcms(BigDecimal dcfsBaseCalculoIcms) {
        this.dcfsBaseCalculoIcms = dcfsBaseCalculoIcms;
    }

    public BigDecimal getDcfsValorIcms() {
        return dcfsValorIcms;
    }

    public void setDcfsValorIcms(BigDecimal dcfsValorIcms) {
        this.dcfsValorIcms = dcfsValorIcms;
    }

    public BigDecimal getDcfsBaseCalculoIcmsSub() {
        return dcfsBaseCalculoIcmsSub;
    }

    public void setDcfsBaseCalculoIcmsSub(BigDecimal dcfsBaseCalculoIcmsSub) {
        this.dcfsBaseCalculoIcmsSub = dcfsBaseCalculoIcmsSub;
    }

    public BigDecimal getDcfsValorIcmsSub() {
        return dcfsValorIcmsSub;
    }

    public void setDcfsValorIcmsSub(BigDecimal dcfsValorIcmsSub) {
        this.dcfsValorIcmsSub = dcfsValorIcmsSub;
    }

    public BigDecimal getDcfsValorProdutos() {
        return dcfsValorProdutos;
    }

    public void setDcfsValorProdutos(BigDecimal dcfsValorProdutos) {
        this.dcfsValorProdutos = dcfsValorProdutos;
    }

    public BigDecimal getDcfsValorIpi() {
        return dcfsValorIpi;
    }

    public void setDcfsValorIpi(BigDecimal dcfsValorIpi) {
        this.dcfsValorIpi = dcfsValorIpi;
    }

    public String getDcfsObservacao() {
        return dcfsObservacao;
    }

    public void setDcfsObservacao(String dcfsObservacao) {
        this.dcfsObservacao = dcfsObservacao;
    }

    public String getDcfsEndeId() {
        return dcfsEndeId;
    }

    public void setDcfsEndeId(String dcfsEndeId) {
        this.dcfsEndeId = dcfsEndeId;
    }

    public String getDcfsMsg() {
        return dcfsMsg;
    }

    public void setDcfsMsg(String dcfsMsg) {
        this.dcfsMsg = dcfsMsg;
    }

    public String getDcfsIndEmissao() {
        return dcfsIndEmissao;
    }

    public void setDcfsIndEmissao(String dcfsIndEmissao) {
        this.dcfsIndEmissao = dcfsIndEmissao;
    }

    public BigDecimal getDcfsValorCofins() {
        return dcfsValorCofins;
    }

    public void setDcfsValorCofins(BigDecimal dcfsValorCofins) {
        this.dcfsValorCofins = dcfsValorCofins;
    }

    public BigDecimal getDcfsBaseCofins() {
        return dcfsBaseCofins;
    }

    public void setDcfsBaseCofins(BigDecimal dcfsBaseCofins) {
        this.dcfsBaseCofins = dcfsBaseCofins;
    }

    public BigDecimal getDcfsValorPis() {
        return dcfsValorPis;
    }

    public void setDcfsValorPis(BigDecimal dcfsValorPis) {
        this.dcfsValorPis = dcfsValorPis;
    }

    public BigDecimal getDcfsBasePis() {
        return dcfsBasePis;
    }

    public void setDcfsBasePis(BigDecimal dcfsBasePis) {
        this.dcfsBasePis = dcfsBasePis;
    }

    public BigDecimal getDcfsValorCofinsRetido() {
        return dcfsValorCofinsRetido;
    }

    public void setDcfsValorCofinsRetido(BigDecimal dcfsValorCofinsRetido) {
        this.dcfsValorCofinsRetido = dcfsValorCofinsRetido;
    }

    public BigDecimal getDcfsBaseCofinsRetido() {
        return dcfsBaseCofinsRetido;
    }

    public void setDcfsBaseCofinsRetido(BigDecimal dcfsBaseCofinsRetido) {
        this.dcfsBaseCofinsRetido = dcfsBaseCofinsRetido;
    }

    public BigDecimal getDcfsBasePisRetido() {
        return dcfsBasePisRetido;
    }

    public void setDcfsBasePisRetido(BigDecimal dcfsBasePisRetido) {
        this.dcfsBasePisRetido = dcfsBasePisRetido;
    }

    public BigDecimal getDcfsValorPisRetido() {
        return dcfsValorPisRetido;
    }

    public void setDcfsValorPisRetido(BigDecimal dcfsValorPisRetido) {
        this.dcfsValorPisRetido = dcfsValorPisRetido;
    }

    public String getDcfsArquivoNfe() {
        return dcfsArquivoNfe;
    }

    public void setDcfsArquivoNfe(String dcfsArquivoNfe) {
        this.dcfsArquivoNfe = dcfsArquivoNfe;
    }

    public String getDcfsContabilizar() {
        return dcfsContabilizar;
    }

    public void setDcfsContabilizar(String dcfsContabilizar) {
        this.dcfsContabilizar = dcfsContabilizar;
    }

    public Date getDcFsLASTUPDATE() {
        return dcFsLASTUPDATE;
    }

    public void setDcFsLASTUPDATE(Date dcFsLASTUPDATE) {
        this.dcFsLASTUPDATE = dcFsLASTUPDATE;
    }

    public String getDcfsAcerto() {
        return dcfsAcerto;
    }

    public void setDcfsAcerto(String dcfsAcerto) {
        this.dcfsAcerto = dcfsAcerto;
    }

    public BigDecimal getDcfsValorIssRetido() {
        return dcfsValorIssRetido;
    }

    public void setDcfsValorIssRetido(BigDecimal dcfsValorIssRetido) {
        this.dcfsValorIssRetido = dcfsValorIssRetido;
    }

    public BigDecimal getDcfsTotalVerifNf() {
        return dcfsTotalVerifNf;
    }

    public void setDcfsTotalVerifNf(BigDecimal dcfsTotalVerifNf) {
        this.dcfsTotalVerifNf = dcfsTotalVerifNf;
    }

    public BigDecimal getDcfsTotalVerifProdutos() {
        return dcfsTotalVerifProdutos;
    }

    public void setDcfsTotalVerifProdutos(BigDecimal dcfsTotalVerifProdutos) {
        this.dcfsTotalVerifProdutos = dcfsTotalVerifProdutos;
    }

    public String getDcfsVenVddrId() {
        return dcfsVenVddrId;
    }

    public void setDcfsVenVddrId(String dcfsVenVddrId) {
        this.dcfsVenVddrId = dcfsVenVddrId;
    }

    public BigDecimal getDcfsVlrDescCom() {
        return dcfsVlrDescCom;
    }

    public void setDcfsVlrDescCom(BigDecimal dcfsVlrDescCom) {
        this.dcfsVlrDescCom = dcfsVlrDescCom;
    }

    public String getDcfsPesPessId() {
        return dcfsPesPessId;
    }

    public void setDcfsPesPessId(String dcfsPesPessId) {
        this.dcfsPesPessId = dcfsPesPessId;
    }

    public String getDcfsMotivoCanc() {
        return dcfsMotivoCanc;
    }

    public void setDcfsMotivoCanc(String dcfsMotivoCanc) {
        this.dcfsMotivoCanc = dcfsMotivoCanc;
    }

    public String getDcfsUsrsIdCanc() {
        return dcfsUsrsIdCanc;
    }

    public void setDcfsUsrsIdCanc(String dcfsUsrsIdCanc) {
        this.dcfsUsrsIdCanc = dcfsUsrsIdCanc;
    }

    public String getDcfsExdFxsn() {
        return dcfsExdFxsn;
    }

    public void setDcfsExdFxsn(String dcfsExdFxsn) {
        this.dcfsExdFxsn = dcfsExdFxsn;
    }

    public String getDcfsEndeId1() {
        return dcfsEndeId1;
    }

    public void setDcfsEndeId1(String dcfsEndeId1) {
        this.dcfsEndeId1 = dcfsEndeId1;
    }

    public BigDecimal getDcfsImpImportacao() {
        return dcfsImpImportacao;
    }

    public void setDcfsImpImportacao(BigDecimal dcfsImpImportacao) {
        this.dcfsImpImportacao = dcfsImpImportacao;
    }

    public BigDecimal getDcfsTxSiscomex() {
        return dcfsTxSiscomex;
    }

    public void setDcfsTxSiscomex(BigDecimal dcfsTxSiscomex) {
        this.dcfsTxSiscomex = dcfsTxSiscomex;
    }

    public BigDecimal getDcfsBaseImportacao() {
        return dcfsBaseImportacao;
    }

    public void setDcfsBaseImportacao(BigDecimal dcfsBaseImportacao) {
        this.dcfsBaseImportacao = dcfsBaseImportacao;
    }

    public BigDecimal getDcfsValorIof() {
        return dcfsValorIof;
    }

    public void setDcfsValorIof(BigDecimal dcfsValorIof) {
        this.dcfsValorIof = dcfsValorIof;
    }

    public BigDecimal getDcfsDespesasAdu() {
        return dcfsDespesasAdu;
    }

    public void setDcfsDespesasAdu(BigDecimal dcfsDespesasAdu) {
        this.dcfsDespesasAdu = dcfsDespesasAdu;
    }

    public String getDcfsUnemId() {
        return dcfsUnemId;
    }

    public void setDcfsUnemId(String dcfsUnemId) {
        this.dcfsUnemId = dcfsUnemId;
    }

    public String getDcfsTipoCte() {
        return dcfsTipoCte;
    }

    public void setDcfsTipoCte(String dcfsTipoCte) {
        this.dcfsTipoCte = dcfsTipoCte;
    }

    public String getDcfsIndPgto() {
        return dcfsIndPgto;
    }

    public void setDcfsIndPgto(String dcfsIndPgto) {
        this.dcfsIndPgto = dcfsIndPgto;
    }

    public String getDcfsInscmunicipal() {
        return dcfsInscmunicipal;
    }

    public void setDcfsInscmunicipal(String dcfsInscmunicipal) {
        this.dcfsInscmunicipal = dcfsInscmunicipal;
    }

    public String getDcfsSeparado() {
        return dcfsSeparado;
    }

    public void setDcfsSeparado(String dcfsSeparado) {
        this.dcfsSeparado = dcfsSeparado;
    }

    public String getDcfsUsrsId() {
        return dcfsUsrsId;
    }

    public void setDcfsUsrsId(String dcfsUsrsId) {
        this.dcfsUsrsId = dcfsUsrsId;
    }

    public String getDcfsConferido() {
        return dcfsConferido;
    }

    public void setDcfsConferido(String dcfsConferido) {
        this.dcfsConferido = dcfsConferido;
    }

    public String getDcfsConferir() {
        return dcfsConferir;
    }

    public void setDcfsConferir(String dcfsConferir) {
        this.dcfsConferir = dcfsConferir;
    }

    @XmlTransient
    public List<ItensFaturados> getItensFaturadosList() {
        return itensFaturadosList;
    }

    public void setItensFaturadosList(List<ItensFaturados> itensFaturadosList) {
        this.itensFaturadosList = itensFaturadosList;
    }

    @XmlTransient
    public List<DcfsLanccontabeis> getDcfsLanccontabeisList() {
        return dcfsLanccontabeisList;
    }

    public void setDcfsLanccontabeisList(List<DcfsLanccontabeis> dcfsLanccontabeisList) {
        this.dcfsLanccontabeisList = dcfsLanccontabeisList;
    }

    @XmlTransient
    public List<Entregas> getEntregasList() {
        return entregasList;
    }

    public void setEntregasList(List<Entregas> entregasList) {
        this.entregasList = entregasList;
    }

    @XmlTransient
    public List<ComissoesTecnicos> getComissoesTecnicosList() {
        return comissoesTecnicosList;
    }

    public void setComissoesTecnicosList(List<ComissoesTecnicos> comissoesTecnicosList) {
        this.comissoesTecnicosList = comissoesTecnicosList;
    }

    @XmlTransient
    public List<DocumentosCte> getDocumentosCteList() {
        return documentosCteList;
    }

    public void setDocumentosCteList(List<DocumentosCte> documentosCteList) {
        this.documentosCteList = documentosCteList;
    }

    @XmlTransient
    public List<DocumentosCte> getDocumentosCteList1() {
        return documentosCteList1;
    }

    public void setDocumentosCteList1(List<DocumentosCte> documentosCteList1) {
        this.documentosCteList1 = documentosCteList1;
    }

    @XmlTransient
    public List<Rmas> getRmasList() {
        return rmasList;
    }

    public void setRmasList(List<Rmas> rmasList) {
        this.rmasList = rmasList;
    }

    @XmlTransient
    public List<PedidosCentroCustos> getPedidosCentroCustosList() {
        return pedidosCentroCustosList;
    }

    public void setPedidosCentroCustosList(List<PedidosCentroCustos> pedidosCentroCustosList) {
        this.pedidosCentroCustosList = pedidosCentroCustosList;
    }

    @XmlTransient
    public List<NegociacoesPedidos> getNegociacoesPedidosList() {
        return negociacoesPedidosList;
    }

    public void setNegociacoesPedidosList(List<NegociacoesPedidos> negociacoesPedidosList) {
        this.negociacoesPedidosList = negociacoesPedidosList;
    }

    @XmlTransient
    public List<ItensEntregados> getItensEntregadosList() {
        return itensEntregadosList;
    }

    public void setItensEntregadosList(List<ItensEntregados> itensEntregadosList) {
        this.itensEntregadosList = itensEntregadosList;
    }

    @XmlTransient
    public List<MovimentoContabil> getMovimentoContabilList() {
        return movimentoContabilList;
    }

    public void setMovimentoContabilList(List<MovimentoContabil> movimentoContabilList) {
        this.movimentoContabilList = movimentoContabilList;
    }

    @XmlTransient
    public List<DocumentosFiscais> getDocumentosFiscaisList() {
        return documentosFiscaisList;
    }

    public void setDocumentosFiscaisList(List<DocumentosFiscais> documentosFiscaisList) {
        this.documentosFiscaisList = documentosFiscaisList;
    }

    public DocumentosFiscais getDocDcfsId() {
        return docDcfsId;
    }

    public void setDocDcfsId(DocumentosFiscais docDcfsId) {
        this.docDcfsId = docDcfsId;
    }

    @XmlTransient
    public List<DocumentosFiscais> getDocumentosFiscaisList1() {
        return documentosFiscaisList1;
    }

    public void setDocumentosFiscaisList1(List<DocumentosFiscais> documentosFiscaisList1) {
        this.documentosFiscaisList1 = documentosFiscaisList1;
    }

    public DocumentosFiscais getDocDcfsId2() {
        return docDcfsId2;
    }

    public void setDocDcfsId2(DocumentosFiscais docDcfsId2) {
        this.docDcfsId2 = docDcfsId2;
    }

    public Expedicoes getExpdId() {
        return expdId;
    }

    public void setExpdId(Expedicoes expdId) {
        this.expdId = expdId;
    }

    public HistoricosMovimentacoes getHmovId() {
        return hmovId;
    }

    public void setHmovId(HistoricosMovimentacoes hmovId) {
        this.hmovId = hmovId;
    }

    public Pedidos getPddsId() {
        return pddsId;
    }

    public void setPddsId(Pedidos pddsId) {
        this.pddsId = pddsId;
    }

    public Titulos getTituId() {
        return tituId;
    }

    public void setTituId(Titulos tituId) {
        this.tituId = tituId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dcfsId != null ? dcfsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DocumentosFiscais)) {
            return false;
        }
        DocumentosFiscais other = (DocumentosFiscais) object;
        if ((this.dcfsId == null && other.dcfsId != null) || (this.dcfsId != null && !this.dcfsId.equals(other.dcfsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.DocumentosFiscais[ dcfsId=" + dcfsId + " ]";
    }
    
}
