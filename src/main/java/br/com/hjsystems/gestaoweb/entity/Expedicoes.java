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
@Table(name = "EXPEDICOES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Expedicoes.findAll", query = "SELECT e FROM Expedicoes e"),
    @NamedQuery(name = "Expedicoes.findByExpdId", query = "SELECT e FROM Expedicoes e WHERE e.expdId = :expdId"),
    @NamedQuery(name = "Expedicoes.findByExpdNumero", query = "SELECT e FROM Expedicoes e WHERE e.expdNumero = :expdNumero"),
    @NamedQuery(name = "Expedicoes.findByExpdNumeroNf", query = "SELECT e FROM Expedicoes e WHERE e.expdNumeroNf = :expdNumeroNf"),
    @NamedQuery(name = "Expedicoes.findByExpdSerieNf", query = "SELECT e FROM Expedicoes e WHERE e.expdSerieNf = :expdSerieNf"),
    @NamedQuery(name = "Expedicoes.findByExpdModeloNf", query = "SELECT e FROM Expedicoes e WHERE e.expdModeloNf = :expdModeloNf"),
    @NamedQuery(name = "Expedicoes.findByExpdTipo", query = "SELECT e FROM Expedicoes e WHERE e.expdTipo = :expdTipo"),
    @NamedQuery(name = "Expedicoes.findByExpdDataEmissaoNf", query = "SELECT e FROM Expedicoes e WHERE e.expdDataEmissaoNf = :expdDataEmissaoNf"),
    @NamedQuery(name = "Expedicoes.findByExpdDataEntrada", query = "SELECT e FROM Expedicoes e WHERE e.expdDataEntrada = :expdDataEntrada"),
    @NamedQuery(name = "Expedicoes.findByExpdDataExpedicao", query = "SELECT e FROM Expedicoes e WHERE e.expdDataExpedicao = :expdDataExpedicao"),
    @NamedQuery(name = "Expedicoes.findByExpdTransportadoPor", query = "SELECT e FROM Expedicoes e WHERE e.expdTransportadoPor = :expdTransportadoPor"),
    @NamedQuery(name = "Expedicoes.findByExpdRecebidoPor", query = "SELECT e FROM Expedicoes e WHERE e.expdRecebidoPor = :expdRecebidoPor"),
    @NamedQuery(name = "Expedicoes.findByExpdVlrFrete", query = "SELECT e FROM Expedicoes e WHERE e.expdVlrFrete = :expdVlrFrete"),
    @NamedQuery(name = "Expedicoes.findByExpdVeiculo", query = "SELECT e FROM Expedicoes e WHERE e.expdVeiculo = :expdVeiculo"),
    @NamedQuery(name = "Expedicoes.findByExpdPlaca", query = "SELECT e FROM Expedicoes e WHERE e.expdPlaca = :expdPlaca"),
    @NamedQuery(name = "Expedicoes.findByExpdMotivo", query = "SELECT e FROM Expedicoes e WHERE e.expdMotivo = :expdMotivo"),
    @NamedQuery(name = "Expedicoes.findByExpdPesoEntrada", query = "SELECT e FROM Expedicoes e WHERE e.expdPesoEntrada = :expdPesoEntrada"),
    @NamedQuery(name = "Expedicoes.findByExpdPesoSaida", query = "SELECT e FROM Expedicoes e WHERE e.expdPesoSaida = :expdPesoSaida"),
    @NamedQuery(name = "Expedicoes.findByExpdStatus", query = "SELECT e FROM Expedicoes e WHERE e.expdStatus = :expdStatus"),
    @NamedQuery(name = "Expedicoes.findByExpdVolume", query = "SELECT e FROM Expedicoes e WHERE e.expdVolume = :expdVolume"),
    @NamedQuery(name = "Expedicoes.findByExpdEspecieVolume", query = "SELECT e FROM Expedicoes e WHERE e.expdEspecieVolume = :expdEspecieVolume"),
    @NamedQuery(name = "Expedicoes.findByExpdCpfcnpj", query = "SELECT e FROM Expedicoes e WHERE e.expdCpfcnpj = :expdCpfcnpj"),
    @NamedQuery(name = "Expedicoes.findByPessId", query = "SELECT e FROM Expedicoes e WHERE e.pessId = :pessId"),
    @NamedQuery(name = "Expedicoes.findByExpdLASTUPDATE", query = "SELECT e FROM Expedicoes e WHERE e.expdLASTUPDATE = :expdLASTUPDATE"),
    @NamedQuery(name = "Expedicoes.findByExpdImpressoes", query = "SELECT e FROM Expedicoes e WHERE e.expdImpressoes = :expdImpressoes")})
public class Expedicoes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "EXPD_ID")
    private String expdId;
    @Column(name = "EXPD_NUMERO")
    private String expdNumero;
    @Column(name = "EXPD_NUMERO_NF")
    private String expdNumeroNf;
    @Column(name = "EXPD_SERIE_NF")
    private String expdSerieNf;
    @Column(name = "EXPD_MODELO_NF")
    private String expdModeloNf;
    @Column(name = "EXPD_TIPO")
    private String expdTipo;
    @Column(name = "EXPD_DATA_EMISSAO_NF")
    @Temporal(TemporalType.TIMESTAMP)
    private Date expdDataEmissaoNf;
    @Column(name = "EXPD_DATA_ENTRADA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date expdDataEntrada;
    @Column(name = "EXPD_DATA_EXPEDICAO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date expdDataExpedicao;
    @Column(name = "EXPD_TRANSPORTADO_POR")
    private String expdTransportadoPor;
    @Column(name = "EXPD_RECEBIDO_POR")
    private String expdRecebidoPor;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "EXPD_VLR_FRETE")
    private BigDecimal expdVlrFrete;
    @Column(name = "EXPD_VEICULO")
    private String expdVeiculo;
    @Column(name = "EXPD_PLACA")
    private String expdPlaca;
    @Column(name = "EXPD_MOTIVO")
    private String expdMotivo;
    @Basic(optional = false)
    @Column(name = "EXPD_PESO_ENTRADA")
    private BigDecimal expdPesoEntrada;
    @Basic(optional = false)
    @Column(name = "EXPD_PESO_SAIDA")
    private BigDecimal expdPesoSaida;
    @Column(name = "EXPD_STATUS")
    private String expdStatus;
    @Column(name = "EXPD_VOLUME")
    private Integer expdVolume;
    @Column(name = "EXPD_ESPECIE_VOLUME")
    private String expdEspecieVolume;
    @Column(name = "EXPD_CPFCNPJ")
    private String expdCpfcnpj;
    @Column(name = "PESS_ID")
    private String pessId;
    @Column(name = "Expd_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date expdLASTUPDATE;
    @Column(name = "EXPD_IMPRESSOES")
    private Integer expdImpressoes;
    @OneToMany(mappedBy = "expdId")
    private List<Pedidos> pedidosList;
    @OneToMany(mappedBy = "expdId")
    private List<Entregas> entregasList;
    @OneToMany(mappedBy = "expdId")
    private List<ItensExpedidos> itensExpedidosList;
    @OneToMany(mappedBy = "expdId")
    private List<PedidosExpedicao> pedidosExpedicaoList;
    @OneToMany(mappedBy = "expExpdId")
    private List<Expedicoes> expedicoesList;
    @JoinColumn(name = "EXP_EXPD_ID", referencedColumnName = "EXPD_ID")
    @ManyToOne
    private Expedicoes expExpdId;
    @JoinColumn(name = "TRSP_ID", referencedColumnName = "TRSP_ID")
    @ManyToOne
    private Transportadoras trspId;
    @JoinColumn(name = "USRS_ID", referencedColumnName = "USRS_ID")
    @ManyToOne
    private Usuarios usrsId;
    @JoinColumn(name = "VEIC_ID", referencedColumnName = "VEIC_ID")
    @ManyToOne
    private Veiculo veicId;
    @OneToMany(mappedBy = "expdId")
    private List<DocumentosFiscais> documentosFiscaisList;

    public Expedicoes() {
    }

    public Expedicoes(String expdId) {
        this.expdId = expdId;
    }

    public Expedicoes(String expdId, BigDecimal expdVlrFrete, BigDecimal expdPesoEntrada, BigDecimal expdPesoSaida) {
        this.expdId = expdId;
        this.expdVlrFrete = expdVlrFrete;
        this.expdPesoEntrada = expdPesoEntrada;
        this.expdPesoSaida = expdPesoSaida;
    }

    public String getExpdId() {
        return expdId;
    }

    public void setExpdId(String expdId) {
        this.expdId = expdId;
    }

    public String getExpdNumero() {
        return expdNumero;
    }

    public void setExpdNumero(String expdNumero) {
        this.expdNumero = expdNumero;
    }

    public String getExpdNumeroNf() {
        return expdNumeroNf;
    }

    public void setExpdNumeroNf(String expdNumeroNf) {
        this.expdNumeroNf = expdNumeroNf;
    }

    public String getExpdSerieNf() {
        return expdSerieNf;
    }

    public void setExpdSerieNf(String expdSerieNf) {
        this.expdSerieNf = expdSerieNf;
    }

    public String getExpdModeloNf() {
        return expdModeloNf;
    }

    public void setExpdModeloNf(String expdModeloNf) {
        this.expdModeloNf = expdModeloNf;
    }

    public String getExpdTipo() {
        return expdTipo;
    }

    public void setExpdTipo(String expdTipo) {
        this.expdTipo = expdTipo;
    }

    public Date getExpdDataEmissaoNf() {
        return expdDataEmissaoNf;
    }

    public void setExpdDataEmissaoNf(Date expdDataEmissaoNf) {
        this.expdDataEmissaoNf = expdDataEmissaoNf;
    }

    public Date getExpdDataEntrada() {
        return expdDataEntrada;
    }

    public void setExpdDataEntrada(Date expdDataEntrada) {
        this.expdDataEntrada = expdDataEntrada;
    }

    public Date getExpdDataExpedicao() {
        return expdDataExpedicao;
    }

    public void setExpdDataExpedicao(Date expdDataExpedicao) {
        this.expdDataExpedicao = expdDataExpedicao;
    }

    public String getExpdTransportadoPor() {
        return expdTransportadoPor;
    }

    public void setExpdTransportadoPor(String expdTransportadoPor) {
        this.expdTransportadoPor = expdTransportadoPor;
    }

    public String getExpdRecebidoPor() {
        return expdRecebidoPor;
    }

    public void setExpdRecebidoPor(String expdRecebidoPor) {
        this.expdRecebidoPor = expdRecebidoPor;
    }

    public BigDecimal getExpdVlrFrete() {
        return expdVlrFrete;
    }

    public void setExpdVlrFrete(BigDecimal expdVlrFrete) {
        this.expdVlrFrete = expdVlrFrete;
    }

    public String getExpdVeiculo() {
        return expdVeiculo;
    }

    public void setExpdVeiculo(String expdVeiculo) {
        this.expdVeiculo = expdVeiculo;
    }

    public String getExpdPlaca() {
        return expdPlaca;
    }

    public void setExpdPlaca(String expdPlaca) {
        this.expdPlaca = expdPlaca;
    }

    public String getExpdMotivo() {
        return expdMotivo;
    }

    public void setExpdMotivo(String expdMotivo) {
        this.expdMotivo = expdMotivo;
    }

    public BigDecimal getExpdPesoEntrada() {
        return expdPesoEntrada;
    }

    public void setExpdPesoEntrada(BigDecimal expdPesoEntrada) {
        this.expdPesoEntrada = expdPesoEntrada;
    }

    public BigDecimal getExpdPesoSaida() {
        return expdPesoSaida;
    }

    public void setExpdPesoSaida(BigDecimal expdPesoSaida) {
        this.expdPesoSaida = expdPesoSaida;
    }

    public String getExpdStatus() {
        return expdStatus;
    }

    public void setExpdStatus(String expdStatus) {
        this.expdStatus = expdStatus;
    }

    public Integer getExpdVolume() {
        return expdVolume;
    }

    public void setExpdVolume(Integer expdVolume) {
        this.expdVolume = expdVolume;
    }

    public String getExpdEspecieVolume() {
        return expdEspecieVolume;
    }

    public void setExpdEspecieVolume(String expdEspecieVolume) {
        this.expdEspecieVolume = expdEspecieVolume;
    }

    public String getExpdCpfcnpj() {
        return expdCpfcnpj;
    }

    public void setExpdCpfcnpj(String expdCpfcnpj) {
        this.expdCpfcnpj = expdCpfcnpj;
    }

    public String getPessId() {
        return pessId;
    }

    public void setPessId(String pessId) {
        this.pessId = pessId;
    }

    public Date getExpdLASTUPDATE() {
        return expdLASTUPDATE;
    }

    public void setExpdLASTUPDATE(Date expdLASTUPDATE) {
        this.expdLASTUPDATE = expdLASTUPDATE;
    }

    public Integer getExpdImpressoes() {
        return expdImpressoes;
    }

    public void setExpdImpressoes(Integer expdImpressoes) {
        this.expdImpressoes = expdImpressoes;
    }

    @XmlTransient
    public List<Pedidos> getPedidosList() {
        return pedidosList;
    }

    public void setPedidosList(List<Pedidos> pedidosList) {
        this.pedidosList = pedidosList;
    }

    @XmlTransient
    public List<Entregas> getEntregasList() {
        return entregasList;
    }

    public void setEntregasList(List<Entregas> entregasList) {
        this.entregasList = entregasList;
    }

    @XmlTransient
    public List<ItensExpedidos> getItensExpedidosList() {
        return itensExpedidosList;
    }

    public void setItensExpedidosList(List<ItensExpedidos> itensExpedidosList) {
        this.itensExpedidosList = itensExpedidosList;
    }

    @XmlTransient
    public List<PedidosExpedicao> getPedidosExpedicaoList() {
        return pedidosExpedicaoList;
    }

    public void setPedidosExpedicaoList(List<PedidosExpedicao> pedidosExpedicaoList) {
        this.pedidosExpedicaoList = pedidosExpedicaoList;
    }

    @XmlTransient
    public List<Expedicoes> getExpedicoesList() {
        return expedicoesList;
    }

    public void setExpedicoesList(List<Expedicoes> expedicoesList) {
        this.expedicoesList = expedicoesList;
    }

    public Expedicoes getExpExpdId() {
        return expExpdId;
    }

    public void setExpExpdId(Expedicoes expExpdId) {
        this.expExpdId = expExpdId;
    }

    public Transportadoras getTrspId() {
        return trspId;
    }

    public void setTrspId(Transportadoras trspId) {
        this.trspId = trspId;
    }

    public Usuarios getUsrsId() {
        return usrsId;
    }

    public void setUsrsId(Usuarios usrsId) {
        this.usrsId = usrsId;
    }

    public Veiculo getVeicId() {
        return veicId;
    }

    public void setVeicId(Veiculo veicId) {
        this.veicId = veicId;
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
        hash += (expdId != null ? expdId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Expedicoes)) {
            return false;
        }
        Expedicoes other = (Expedicoes) object;
        if ((this.expdId == null && other.expdId != null) || (this.expdId != null && !this.expdId.equals(other.expdId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.Expedicoes[ expdId=" + expdId + " ]";
    }
    
}
