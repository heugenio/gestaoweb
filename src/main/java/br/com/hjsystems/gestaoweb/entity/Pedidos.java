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
@Table(name = "PEDIDOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pedidos.findAll", query = "SELECT p FROM Pedidos p"),
    @NamedQuery(name = "Pedidos.findByPddsId", query = "SELECT p FROM Pedidos p WHERE p.pddsId = :pddsId"),
    @NamedQuery(name = "Pedidos.findByPddsTipoPedido", query = "SELECT p FROM Pedidos p WHERE p.pddsTipoPedido = :pddsTipoPedido"),
    @NamedQuery(name = "Pedidos.findByPddsNumero", query = "SELECT p FROM Pedidos p WHERE p.pddsNumero = :pddsNumero"),
    @NamedQuery(name = "Pedidos.findByPddsData", query = "SELECT p FROM Pedidos p WHERE p.pddsData = :pddsData"),
    @NamedQuery(name = "Pedidos.findByPddsTipoFrete", query = "SELECT p FROM Pedidos p WHERE p.pddsTipoFrete = :pddsTipoFrete"),
    @NamedQuery(name = "Pedidos.findByPddsVlrFrete", query = "SELECT p FROM Pedidos p WHERE p.pddsVlrFrete = :pddsVlrFrete"),
    @NamedQuery(name = "Pedidos.findByPddsVlrSeguro", query = "SELECT p FROM Pedidos p WHERE p.pddsVlrSeguro = :pddsVlrSeguro"),
    @NamedQuery(name = "Pedidos.findByPddsVlrDespesas", query = "SELECT p FROM Pedidos p WHERE p.pddsVlrDespesas = :pddsVlrDespesas"),
    @NamedQuery(name = "Pedidos.findByPddsVlrEntrada", query = "SELECT p FROM Pedidos p WHERE p.pddsVlrEntrada = :pddsVlrEntrada"),
    @NamedQuery(name = "Pedidos.findByPddsVlrDesconto", query = "SELECT p FROM Pedidos p WHERE p.pddsVlrDesconto = :pddsVlrDesconto"),
    @NamedQuery(name = "Pedidos.findByPddsVlrDescontoServico", query = "SELECT p FROM Pedidos p WHERE p.pddsVlrDescontoServico = :pddsVlrDescontoServico"),
    @NamedQuery(name = "Pedidos.findByPddsVlrTotal", query = "SELECT p FROM Pedidos p WHERE p.pddsVlrTotal = :pddsVlrTotal"),
    @NamedQuery(name = "Pedidos.findByPddsImpressoes", query = "SELECT p FROM Pedidos p WHERE p.pddsImpressoes = :pddsImpressoes"),
    @NamedQuery(name = "Pedidos.findByPddsPrevisaoEntrega", query = "SELECT p FROM Pedidos p WHERE p.pddsPrevisaoEntrega = :pddsPrevisaoEntrega"),
    @NamedQuery(name = "Pedidos.findByPddsNumeroPedidoCliente", query = "SELECT p FROM Pedidos p WHERE p.pddsNumeroPedidoCliente = :pddsNumeroPedidoCliente"),
    @NamedQuery(name = "Pedidos.findByPddsObservacao", query = "SELECT p FROM Pedidos p WHERE p.pddsObservacao = :pddsObservacao"),
    @NamedQuery(name = "Pedidos.findByPddsStatus", query = "SELECT p FROM Pedidos p WHERE p.pddsStatus = :pddsStatus"),
    @NamedQuery(name = "Pedidos.findByPddsOutrasDespAces", query = "SELECT p FROM Pedidos p WHERE p.pddsOutrasDespAces = :pddsOutrasDespAces"),
    @NamedQuery(name = "Pedidos.findByPessNome", query = "SELECT p FROM Pedidos p WHERE p.pessNome = :pessNome"),
    @NamedQuery(name = "Pedidos.findByPddsObservacaoDoc", query = "SELECT p FROM Pedidos p WHERE p.pddsObservacaoDoc = :pddsObservacaoDoc"),
    @NamedQuery(name = "Pedidos.findByPddsRtbMedia", query = "SELECT p FROM Pedidos p WHERE p.pddsRtbMedia = :pddsRtbMedia"),
    @NamedQuery(name = "Pedidos.findByPddsPesoBruto", query = "SELECT p FROM Pedidos p WHERE p.pddsPesoBruto = :pddsPesoBruto"),
    @NamedQuery(name = "Pedidos.findByPddsPesoLiquido", query = "SELECT p FROM Pedidos p WHERE p.pddsPesoLiquido = :pddsPesoLiquido"),
    @NamedQuery(name = "Pedidos.findByPddsVolume", query = "SELECT p FROM Pedidos p WHERE p.pddsVolume = :pddsVolume"),
    @NamedQuery(name = "Pedidos.findByPddsEspecieVolume", query = "SELECT p FROM Pedidos p WHERE p.pddsEspecieVolume = :pddsEspecieVolume"),
    @NamedQuery(name = "Pedidos.findByPddsTipoEntrega", query = "SELECT p FROM Pedidos p WHERE p.pddsTipoEntrega = :pddsTipoEntrega"),
    @NamedQuery(name = "Pedidos.findByCntsNome", query = "SELECT p FROM Pedidos p WHERE p.cntsNome = :cntsNome"),
    @NamedQuery(name = "Pedidos.findByPddsLASTUPDATE", query = "SELECT p FROM Pedidos p WHERE p.pddsLASTUPDATE = :pddsLASTUPDATE"),
    @NamedQuery(name = "Pedidos.findByPddsDcfsId", query = "SELECT p FROM Pedidos p WHERE p.pddsDcfsId = :pddsDcfsId"),
    @NamedQuery(name = "Pedidos.findByPddsDataSaida", query = "SELECT p FROM Pedidos p WHERE p.pddsDataSaida = :pddsDataSaida"),
    @NamedQuery(name = "Pedidos.findByVenVddrId", query = "SELECT p FROM Pedidos p WHERE p.venVddrId = :venVddrId"),
    @NamedQuery(name = "Pedidos.findByPddsVlrDescCom", query = "SELECT p FROM Pedidos p WHERE p.pddsVlrDescCom = :pddsVlrDescCom"),
    @NamedQuery(name = "Pedidos.findByPddsMotivoCanc", query = "SELECT p FROM Pedidos p WHERE p.pddsMotivoCanc = :pddsMotivoCanc"),
    @NamedQuery(name = "Pedidos.findByPddsUsrsIdCanc", query = "SELECT p FROM Pedidos p WHERE p.pddsUsrsIdCanc = :pddsUsrsIdCanc"),
    @NamedQuery(name = "Pedidos.findByPddsDataCanc", query = "SELECT p FROM Pedidos p WHERE p.pddsDataCanc = :pddsDataCanc"),
    @NamedQuery(name = "Pedidos.findByPddsSituacao", query = "SELECT p FROM Pedidos p WHERE p.pddsSituacao = :pddsSituacao"),
    @NamedQuery(name = "Pedidos.findByPddsAprazo", query = "SELECT p FROM Pedidos p WHERE p.pddsAprazo = :pddsAprazo"),
    @NamedQuery(name = "Pedidos.findByPddsVendaRapida", query = "SELECT p FROM Pedidos p WHERE p.pddsVendaRapida = :pddsVendaRapida"),
    @NamedQuery(name = "Pedidos.findByPddsCpfcnpj", query = "SELECT p FROM Pedidos p WHERE p.pddsCpfcnpj = :pddsCpfcnpj"),
    @NamedQuery(name = "Pedidos.findByPddsEmpenho", query = "SELECT p FROM Pedidos p WHERE p.pddsEmpenho = :pddsEmpenho"),
    @NamedQuery(name = "Pedidos.findByTposId", query = "SELECT p FROM Pedidos p WHERE p.tposId = :tposId")})
public class Pedidos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PDDS_ID")
    private String pddsId;
    @Basic(optional = false)
    @Column(name = "PDDS_TIPO_PEDIDO")
    private String pddsTipoPedido;
    @Basic(optional = false)
    @Column(name = "PDDS_NUMERO")
    private String pddsNumero;
    @Basic(optional = false)
    @Column(name = "PDDS_DATA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pddsData;
    @Basic(optional = false)
    @Column(name = "PDDS_TIPO_FRETE")
    private String pddsTipoFrete;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "PDDS_VLR_FRETE")
    private BigDecimal pddsVlrFrete;
    @Basic(optional = false)
    @Column(name = "PDDS_VLR_SEGURO")
    private BigDecimal pddsVlrSeguro;
    @Basic(optional = false)
    @Column(name = "PDDS_VLR_DESPESAS")
    private BigDecimal pddsVlrDespesas;
    @Basic(optional = false)
    @Column(name = "PDDS_VLR_ENTRADA")
    private BigDecimal pddsVlrEntrada;
    @Basic(optional = false)
    @Column(name = "PDDS_VLR_DESCONTO")
    private BigDecimal pddsVlrDesconto;
    @Basic(optional = false)
    @Column(name = "PDDS_VLR_DESCONTO_SERVICO")
    private BigDecimal pddsVlrDescontoServico;
    @Basic(optional = false)
    @Column(name = "PDDS_VLR_TOTAL")
    private BigDecimal pddsVlrTotal;
    @Column(name = "PDDS_IMPRESSOES")
    private Integer pddsImpressoes;
    @Column(name = "PDDS_PREVISAO_ENTREGA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pddsPrevisaoEntrega;
    @Column(name = "PDDS_NUMERO_PEDIDO_CLIENTE")
    private String pddsNumeroPedidoCliente;
    @Column(name = "PDDS_OBSERVACAO")
    private String pddsObservacao;
    @Basic(optional = false)
    @Column(name = "PDDS_STATUS")
    private String pddsStatus;
    @Basic(optional = false)
    @Column(name = "PDDS_OUTRAS_DESP_ACES")
    private BigDecimal pddsOutrasDespAces;
    @Column(name = "PESS_NOME")
    private String pessNome;
    @Column(name = "PDDS_OBSERVACAO_DOC")
    private String pddsObservacaoDoc;
    @Basic(optional = false)
    @Column(name = "PDDS_RTB_MEDIA")
    private BigDecimal pddsRtbMedia;
    @Basic(optional = false)
    @Column(name = "PDDS_PESO_BRUTO")
    private BigDecimal pddsPesoBruto;
    @Basic(optional = false)
    @Column(name = "PDDS_PESO_LIQUIDO")
    private BigDecimal pddsPesoLiquido;
    @Column(name = "PDDS_VOLUME")
    private Integer pddsVolume;
    @Column(name = "PDDS_ESPECIE_VOLUME")
    private String pddsEspecieVolume;
    @Column(name = "PDDS_TIPO_ENTREGA")
    private String pddsTipoEntrega;
    @Column(name = "CNTS_NOME")
    private String cntsNome;
    @Column(name = "Pdds_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pddsLASTUPDATE;
    @Column(name = "PDDS_DCFS_ID")
    private String pddsDcfsId;
    @Column(name = "PDDS_DATA_SAIDA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pddsDataSaida;
    @Column(name = "VEN_VDDR_ID")
    private String venVddrId;
    @Basic(optional = false)
    @Column(name = "PDDS_VLR_DESC_COM")
    private BigDecimal pddsVlrDescCom;
    @Column(name = "PDDS_MOTIVO_CANC")
    private String pddsMotivoCanc;
    @Column(name = "PDDS_USRS_ID_CANC")
    private String pddsUsrsIdCanc;
    @Column(name = "PDDS_DATA_CANC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pddsDataCanc;
    @Column(name = "PDDS_SITUACAO")
    private String pddsSituacao;
    @Column(name = "PDDS_APRAZO")
    private String pddsAprazo;
    @Column(name = "PDDS_VENDA_RAPIDA")
    private String pddsVendaRapida;
    @Column(name = "PDDS_CPFCNPJ")
    private String pddsCpfcnpj;
    @Column(name = "PDDS_EMPENHO")
    private String pddsEmpenho;
    @Column(name = "TPOS_ID")
    private String tposId;
    @JoinColumn(name = "END_ENDE_ID", referencedColumnName = "ENDE_ID")
    @ManyToOne
    private Enderecos endEndeId;
    @JoinColumn(name = "ENDE_ID", referencedColumnName = "ENDE_ID")
    @ManyToOne
    private Enderecos endeId;
    @JoinColumn(name = "END_ENDE_ID2", referencedColumnName = "ENDE_ID")
    @ManyToOne
    private Enderecos endEndeId2;
    @JoinColumn(name = "EXPD_ID", referencedColumnName = "EXPD_ID")
    @ManyToOne
    private Expedicoes expdId;
    @JoinColumn(name = "PESS_ID", referencedColumnName = "PESS_ID")
    @ManyToOne
    private Pessoas pessId;
    @JoinColumn(name = "VEIC_ID", referencedColumnName = "VEIC_ID")
    @ManyToOne
    private Veiculo veicId;
    @JoinColumn(name = "MDIA_ID", referencedColumnName = "MDIA_ID")
    @ManyToOne
    private Midias mdiaId;
    @JoinColumn(name = "MTCC_ID", referencedColumnName = "MTCC_ID")
    @ManyToOne
    private MotivoCancelamento mtccId;
    @JoinColumn(name = "OPCM_ID", referencedColumnName = "OPCM_ID")
    @ManyToOne
    private OperacoesComerciais opcmId;
    @JoinColumn(name = "TBPC_ID", referencedColumnName = "TBPC_ID")
    @ManyToOne
    private TabelasPrecos tbpcId;
    @JoinColumn(name = "TRSP_ID", referencedColumnName = "TRSP_ID")
    @ManyToOne
    private Transportadoras trspId;
    @JoinColumn(name = "VDDR_ID", referencedColumnName = "VDDR_ID")
    @ManyToOne
    private Vendedores vddrId;
    @JoinColumn(name = "PES_PESS_ID", referencedColumnName = "PESS_ID")
    @ManyToOne
    private Pessoas pesPessId;
    @JoinColumn(name = "ORVD_ID", referencedColumnName = "ORVD_ID")
    @ManyToOne
    private OrcamentosVendas orvdId;
    @JoinColumn(name = "USRS_ID", referencedColumnName = "USRS_ID")
    @ManyToOne
    private Usuarios usrsId;
    @JoinColumn(name = "ORSV_ID", referencedColumnName = "ORSV_ID")
    @ManyToOne
    private OrdemServico orsvId;
    @OneToMany(mappedBy = "pedPddsId")
    private List<Pedidos> pedidosList;
    @JoinColumn(name = "PED_PDDS_ID", referencedColumnName = "PDDS_ID")
    @ManyToOne
    private Pedidos pedPddsId;
    @JoinColumn(name = "USU_USRS_ID", referencedColumnName = "USRS_ID")
    @ManyToOne
    private Usuarios usuUsrsId;
    @OneToMany(mappedBy = "pddsId")
    private List<Requisicoes> requisicoesList;
    @OneToMany(mappedBy = "pddsId")
    private List<Entregas> entregasList;
    @OneToMany(mappedBy = "pddsId")
    private List<ItensPedidos> itensPedidosList;
    @OneToMany(mappedBy = "pddsId")
    private List<ObjetosOpeComercial> objetosOpeComercialList;
    @OneToMany(mappedBy = "pddsId")
    private List<PedidosExpedicao> pedidosExpedicaoList;
    @OneToMany(mappedBy = "pddsId")
    private List<PedidosCentroCustos> pedidosCentroCustosList;
    @OneToMany(mappedBy = "pddsId")
    private List<NegociacoesPedidos> negociacoesPedidosList;
    @OneToMany(mappedBy = "pddsId")
    private List<ItensCaixas> itensCaixasList;
    @OneToMany(mappedBy = "pddsId")
    private List<DivergenciasPedido> divergenciasPedidoList;
    @OneToMany(mappedBy = "pddsId")
    private List<DocumentosFiscais> documentosFiscaisList;

    public Pedidos() {
    }

    public Pedidos(String pddsId) {
        this.pddsId = pddsId;
    }

    public Pedidos(String pddsId, String pddsTipoPedido, String pddsNumero, Date pddsData, String pddsTipoFrete, BigDecimal pddsVlrFrete, BigDecimal pddsVlrSeguro, BigDecimal pddsVlrDespesas, BigDecimal pddsVlrEntrada, BigDecimal pddsVlrDesconto, BigDecimal pddsVlrDescontoServico, BigDecimal pddsVlrTotal, String pddsStatus, BigDecimal pddsOutrasDespAces, BigDecimal pddsRtbMedia, BigDecimal pddsPesoBruto, BigDecimal pddsPesoLiquido, BigDecimal pddsVlrDescCom) {
        this.pddsId = pddsId;
        this.pddsTipoPedido = pddsTipoPedido;
        this.pddsNumero = pddsNumero;
        this.pddsData = pddsData;
        this.pddsTipoFrete = pddsTipoFrete;
        this.pddsVlrFrete = pddsVlrFrete;
        this.pddsVlrSeguro = pddsVlrSeguro;
        this.pddsVlrDespesas = pddsVlrDespesas;
        this.pddsVlrEntrada = pddsVlrEntrada;
        this.pddsVlrDesconto = pddsVlrDesconto;
        this.pddsVlrDescontoServico = pddsVlrDescontoServico;
        this.pddsVlrTotal = pddsVlrTotal;
        this.pddsStatus = pddsStatus;
        this.pddsOutrasDespAces = pddsOutrasDespAces;
        this.pddsRtbMedia = pddsRtbMedia;
        this.pddsPesoBruto = pddsPesoBruto;
        this.pddsPesoLiquido = pddsPesoLiquido;
        this.pddsVlrDescCom = pddsVlrDescCom;
    }

    public String getPddsId() {
        return pddsId;
    }

    public void setPddsId(String pddsId) {
        this.pddsId = pddsId;
    }

    public String getPddsTipoPedido() {
        return pddsTipoPedido;
    }

    public void setPddsTipoPedido(String pddsTipoPedido) {
        this.pddsTipoPedido = pddsTipoPedido;
    }

    public String getPddsNumero() {
        return pddsNumero;
    }

    public void setPddsNumero(String pddsNumero) {
        this.pddsNumero = pddsNumero;
    }

    public Date getPddsData() {
        return pddsData;
    }

    public void setPddsData(Date pddsData) {
        this.pddsData = pddsData;
    }

    public String getPddsTipoFrete() {
        return pddsTipoFrete;
    }

    public void setPddsTipoFrete(String pddsTipoFrete) {
        this.pddsTipoFrete = pddsTipoFrete;
    }

    public BigDecimal getPddsVlrFrete() {
        return pddsVlrFrete;
    }

    public void setPddsVlrFrete(BigDecimal pddsVlrFrete) {
        this.pddsVlrFrete = pddsVlrFrete;
    }

    public BigDecimal getPddsVlrSeguro() {
        return pddsVlrSeguro;
    }

    public void setPddsVlrSeguro(BigDecimal pddsVlrSeguro) {
        this.pddsVlrSeguro = pddsVlrSeguro;
    }

    public BigDecimal getPddsVlrDespesas() {
        return pddsVlrDespesas;
    }

    public void setPddsVlrDespesas(BigDecimal pddsVlrDespesas) {
        this.pddsVlrDespesas = pddsVlrDespesas;
    }

    public BigDecimal getPddsVlrEntrada() {
        return pddsVlrEntrada;
    }

    public void setPddsVlrEntrada(BigDecimal pddsVlrEntrada) {
        this.pddsVlrEntrada = pddsVlrEntrada;
    }

    public BigDecimal getPddsVlrDesconto() {
        return pddsVlrDesconto;
    }

    public void setPddsVlrDesconto(BigDecimal pddsVlrDesconto) {
        this.pddsVlrDesconto = pddsVlrDesconto;
    }

    public BigDecimal getPddsVlrDescontoServico() {
        return pddsVlrDescontoServico;
    }

    public void setPddsVlrDescontoServico(BigDecimal pddsVlrDescontoServico) {
        this.pddsVlrDescontoServico = pddsVlrDescontoServico;
    }

    public BigDecimal getPddsVlrTotal() {
        return pddsVlrTotal;
    }

    public void setPddsVlrTotal(BigDecimal pddsVlrTotal) {
        this.pddsVlrTotal = pddsVlrTotal;
    }

    public Integer getPddsImpressoes() {
        return pddsImpressoes;
    }

    public void setPddsImpressoes(Integer pddsImpressoes) {
        this.pddsImpressoes = pddsImpressoes;
    }

    public Date getPddsPrevisaoEntrega() {
        return pddsPrevisaoEntrega;
    }

    public void setPddsPrevisaoEntrega(Date pddsPrevisaoEntrega) {
        this.pddsPrevisaoEntrega = pddsPrevisaoEntrega;
    }

    public String getPddsNumeroPedidoCliente() {
        return pddsNumeroPedidoCliente;
    }

    public void setPddsNumeroPedidoCliente(String pddsNumeroPedidoCliente) {
        this.pddsNumeroPedidoCliente = pddsNumeroPedidoCliente;
    }

    public String getPddsObservacao() {
        return pddsObservacao;
    }

    public void setPddsObservacao(String pddsObservacao) {
        this.pddsObservacao = pddsObservacao;
    }

    public String getPddsStatus() {
        return pddsStatus;
    }

    public void setPddsStatus(String pddsStatus) {
        this.pddsStatus = pddsStatus;
    }

    public BigDecimal getPddsOutrasDespAces() {
        return pddsOutrasDespAces;
    }

    public void setPddsOutrasDespAces(BigDecimal pddsOutrasDespAces) {
        this.pddsOutrasDespAces = pddsOutrasDespAces;
    }

    public String getPessNome() {
        return pessNome;
    }

    public void setPessNome(String pessNome) {
        this.pessNome = pessNome;
    }

    public String getPddsObservacaoDoc() {
        return pddsObservacaoDoc;
    }

    public void setPddsObservacaoDoc(String pddsObservacaoDoc) {
        this.pddsObservacaoDoc = pddsObservacaoDoc;
    }

    public BigDecimal getPddsRtbMedia() {
        return pddsRtbMedia;
    }

    public void setPddsRtbMedia(BigDecimal pddsRtbMedia) {
        this.pddsRtbMedia = pddsRtbMedia;
    }

    public BigDecimal getPddsPesoBruto() {
        return pddsPesoBruto;
    }

    public void setPddsPesoBruto(BigDecimal pddsPesoBruto) {
        this.pddsPesoBruto = pddsPesoBruto;
    }

    public BigDecimal getPddsPesoLiquido() {
        return pddsPesoLiquido;
    }

    public void setPddsPesoLiquido(BigDecimal pddsPesoLiquido) {
        this.pddsPesoLiquido = pddsPesoLiquido;
    }

    public Integer getPddsVolume() {
        return pddsVolume;
    }

    public void setPddsVolume(Integer pddsVolume) {
        this.pddsVolume = pddsVolume;
    }

    public String getPddsEspecieVolume() {
        return pddsEspecieVolume;
    }

    public void setPddsEspecieVolume(String pddsEspecieVolume) {
        this.pddsEspecieVolume = pddsEspecieVolume;
    }

    public String getPddsTipoEntrega() {
        return pddsTipoEntrega;
    }

    public void setPddsTipoEntrega(String pddsTipoEntrega) {
        this.pddsTipoEntrega = pddsTipoEntrega;
    }

    public String getCntsNome() {
        return cntsNome;
    }

    public void setCntsNome(String cntsNome) {
        this.cntsNome = cntsNome;
    }

    public Date getPddsLASTUPDATE() {
        return pddsLASTUPDATE;
    }

    public void setPddsLASTUPDATE(Date pddsLASTUPDATE) {
        this.pddsLASTUPDATE = pddsLASTUPDATE;
    }

    public String getPddsDcfsId() {
        return pddsDcfsId;
    }

    public void setPddsDcfsId(String pddsDcfsId) {
        this.pddsDcfsId = pddsDcfsId;
    }

    public Date getPddsDataSaida() {
        return pddsDataSaida;
    }

    public void setPddsDataSaida(Date pddsDataSaida) {
        this.pddsDataSaida = pddsDataSaida;
    }

    public String getVenVddrId() {
        return venVddrId;
    }

    public void setVenVddrId(String venVddrId) {
        this.venVddrId = venVddrId;
    }

    public BigDecimal getPddsVlrDescCom() {
        return pddsVlrDescCom;
    }

    public void setPddsVlrDescCom(BigDecimal pddsVlrDescCom) {
        this.pddsVlrDescCom = pddsVlrDescCom;
    }

    public String getPddsMotivoCanc() {
        return pddsMotivoCanc;
    }

    public void setPddsMotivoCanc(String pddsMotivoCanc) {
        this.pddsMotivoCanc = pddsMotivoCanc;
    }

    public String getPddsUsrsIdCanc() {
        return pddsUsrsIdCanc;
    }

    public void setPddsUsrsIdCanc(String pddsUsrsIdCanc) {
        this.pddsUsrsIdCanc = pddsUsrsIdCanc;
    }

    public Date getPddsDataCanc() {
        return pddsDataCanc;
    }

    public void setPddsDataCanc(Date pddsDataCanc) {
        this.pddsDataCanc = pddsDataCanc;
    }

    public String getPddsSituacao() {
        return pddsSituacao;
    }

    public void setPddsSituacao(String pddsSituacao) {
        this.pddsSituacao = pddsSituacao;
    }

    public String getPddsAprazo() {
        return pddsAprazo;
    }

    public void setPddsAprazo(String pddsAprazo) {
        this.pddsAprazo = pddsAprazo;
    }

    public String getPddsVendaRapida() {
        return pddsVendaRapida;
    }

    public void setPddsVendaRapida(String pddsVendaRapida) {
        this.pddsVendaRapida = pddsVendaRapida;
    }

    public String getPddsCpfcnpj() {
        return pddsCpfcnpj;
    }

    public void setPddsCpfcnpj(String pddsCpfcnpj) {
        this.pddsCpfcnpj = pddsCpfcnpj;
    }

    public String getPddsEmpenho() {
        return pddsEmpenho;
    }

    public void setPddsEmpenho(String pddsEmpenho) {
        this.pddsEmpenho = pddsEmpenho;
    }

    public String getTposId() {
        return tposId;
    }

    public void setTposId(String tposId) {
        this.tposId = tposId;
    }

    public Enderecos getEndEndeId() {
        return endEndeId;
    }

    public void setEndEndeId(Enderecos endEndeId) {
        this.endEndeId = endEndeId;
    }

    public Enderecos getEndeId() {
        return endeId;
    }

    public void setEndeId(Enderecos endeId) {
        this.endeId = endeId;
    }

    public Enderecos getEndEndeId2() {
        return endEndeId2;
    }

    public void setEndEndeId2(Enderecos endEndeId2) {
        this.endEndeId2 = endEndeId2;
    }

    public Expedicoes getExpdId() {
        return expdId;
    }

    public void setExpdId(Expedicoes expdId) {
        this.expdId = expdId;
    }

    public Pessoas getPessId() {
        return pessId;
    }

    public void setPessId(Pessoas pessId) {
        this.pessId = pessId;
    }

    public Veiculo getVeicId() {
        return veicId;
    }

    public void setVeicId(Veiculo veicId) {
        this.veicId = veicId;
    }

    public Midias getMdiaId() {
        return mdiaId;
    }

    public void setMdiaId(Midias mdiaId) {
        this.mdiaId = mdiaId;
    }

    public MotivoCancelamento getMtccId() {
        return mtccId;
    }

    public void setMtccId(MotivoCancelamento mtccId) {
        this.mtccId = mtccId;
    }

    public OperacoesComerciais getOpcmId() {
        return opcmId;
    }

    public void setOpcmId(OperacoesComerciais opcmId) {
        this.opcmId = opcmId;
    }

    public TabelasPrecos getTbpcId() {
        return tbpcId;
    }

    public void setTbpcId(TabelasPrecos tbpcId) {
        this.tbpcId = tbpcId;
    }

    public Transportadoras getTrspId() {
        return trspId;
    }

    public void setTrspId(Transportadoras trspId) {
        this.trspId = trspId;
    }

    public Vendedores getVddrId() {
        return vddrId;
    }

    public void setVddrId(Vendedores vddrId) {
        this.vddrId = vddrId;
    }

    public Pessoas getPesPessId() {
        return pesPessId;
    }

    public void setPesPessId(Pessoas pesPessId) {
        this.pesPessId = pesPessId;
    }

    public OrcamentosVendas getOrvdId() {
        return orvdId;
    }

    public void setOrvdId(OrcamentosVendas orvdId) {
        this.orvdId = orvdId;
    }

    public Usuarios getUsrsId() {
        return usrsId;
    }

    public void setUsrsId(Usuarios usrsId) {
        this.usrsId = usrsId;
    }

    public OrdemServico getOrsvId() {
        return orsvId;
    }

    public void setOrsvId(OrdemServico orsvId) {
        this.orsvId = orsvId;
    }

    @XmlTransient
    public List<Pedidos> getPedidosList() {
        return pedidosList;
    }

    public void setPedidosList(List<Pedidos> pedidosList) {
        this.pedidosList = pedidosList;
    }

    public Pedidos getPedPddsId() {
        return pedPddsId;
    }

    public void setPedPddsId(Pedidos pedPddsId) {
        this.pedPddsId = pedPddsId;
    }

    public Usuarios getUsuUsrsId() {
        return usuUsrsId;
    }

    public void setUsuUsrsId(Usuarios usuUsrsId) {
        this.usuUsrsId = usuUsrsId;
    }

    @XmlTransient
    public List<Requisicoes> getRequisicoesList() {
        return requisicoesList;
    }

    public void setRequisicoesList(List<Requisicoes> requisicoesList) {
        this.requisicoesList = requisicoesList;
    }

    @XmlTransient
    public List<Entregas> getEntregasList() {
        return entregasList;
    }

    public void setEntregasList(List<Entregas> entregasList) {
        this.entregasList = entregasList;
    }

    @XmlTransient
    public List<ItensPedidos> getItensPedidosList() {
        return itensPedidosList;
    }

    public void setItensPedidosList(List<ItensPedidos> itensPedidosList) {
        this.itensPedidosList = itensPedidosList;
    }

    @XmlTransient
    public List<ObjetosOpeComercial> getObjetosOpeComercialList() {
        return objetosOpeComercialList;
    }

    public void setObjetosOpeComercialList(List<ObjetosOpeComercial> objetosOpeComercialList) {
        this.objetosOpeComercialList = objetosOpeComercialList;
    }

    @XmlTransient
    public List<PedidosExpedicao> getPedidosExpedicaoList() {
        return pedidosExpedicaoList;
    }

    public void setPedidosExpedicaoList(List<PedidosExpedicao> pedidosExpedicaoList) {
        this.pedidosExpedicaoList = pedidosExpedicaoList;
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
    public List<ItensCaixas> getItensCaixasList() {
        return itensCaixasList;
    }

    public void setItensCaixasList(List<ItensCaixas> itensCaixasList) {
        this.itensCaixasList = itensCaixasList;
    }

    @XmlTransient
    public List<DivergenciasPedido> getDivergenciasPedidoList() {
        return divergenciasPedidoList;
    }

    public void setDivergenciasPedidoList(List<DivergenciasPedido> divergenciasPedidoList) {
        this.divergenciasPedidoList = divergenciasPedidoList;
    }

    @XmlTransient
    public List<DocumentosFiscais> getDocumentosFiscaisList() {
        return documentosFiscaisList;
    }

    public void setDocumentosFiscaisList(List<DocumentosFiscais> documentosFiscaisList) {
        this.documentosFiscaisList = documentosFiscaisList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pddsId != null ? pddsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pedidos)) {
            return false;
        }
        Pedidos other = (Pedidos) object;
        if ((this.pddsId == null && other.pddsId != null) || (this.pddsId != null && !this.pddsId.equals(other.pddsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.Pedidos[ pddsId=" + pddsId + " ]";
    }
    
}
