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
@Table(name = "VEICULO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Veiculo.findAll", query = "SELECT v FROM Veiculo v"),
    @NamedQuery(name = "Veiculo.findByVeicId", query = "SELECT v FROM Veiculo v WHERE v.veicId = :veicId"),
    @NamedQuery(name = "Veiculo.findByVeicPlaca", query = "SELECT v FROM Veiculo v WHERE v.veicPlaca = :veicPlaca"),
    @NamedQuery(name = "Veiculo.findByVeicHodometro", query = "SELECT v FROM Veiculo v WHERE v.veicHodometro = :veicHodometro"),
    @NamedQuery(name = "Veiculo.findByVeicMarca", query = "SELECT v FROM Veiculo v WHERE v.veicMarca = :veicMarca"),
    @NamedQuery(name = "Veiculo.findByVeicModelo", query = "SELECT v FROM Veiculo v WHERE v.veicModelo = :veicModelo"),
    @NamedQuery(name = "Veiculo.findByVeicLastupdate", query = "SELECT v FROM Veiculo v WHERE v.veicLastupdate = :veicLastupdate"),
    @NamedQuery(name = "Veiculo.findByVeicUf", query = "SELECT v FROM Veiculo v WHERE v.veicUf = :veicUf"),
    @NamedQuery(name = "Veiculo.findByVeicCodigo", query = "SELECT v FROM Veiculo v WHERE v.veicCodigo = :veicCodigo"),
    @NamedQuery(name = "Veiculo.findByVeicRenavam", query = "SELECT v FROM Veiculo v WHERE v.veicRenavam = :veicRenavam"),
    @NamedQuery(name = "Veiculo.findByVeicTara", query = "SELECT v FROM Veiculo v WHERE v.veicTara = :veicTara"),
    @NamedQuery(name = "Veiculo.findByVeicCapacidadeKg", query = "SELECT v FROM Veiculo v WHERE v.veicCapacidadeKg = :veicCapacidadeKg"),
    @NamedQuery(name = "Veiculo.findByVeicCapacidadeM3", query = "SELECT v FROM Veiculo v WHERE v.veicCapacidadeM3 = :veicCapacidadeM3"),
    @NamedQuery(name = "Veiculo.findByVeicTipoPropriedade", query = "SELECT v FROM Veiculo v WHERE v.veicTipoPropriedade = :veicTipoPropriedade"),
    @NamedQuery(name = "Veiculo.findByVeicTipoVeiculo", query = "SELECT v FROM Veiculo v WHERE v.veicTipoVeiculo = :veicTipoVeiculo"),
    @NamedQuery(name = "Veiculo.findByVeicTipoRodado", query = "SELECT v FROM Veiculo v WHERE v.veicTipoRodado = :veicTipoRodado"),
    @NamedQuery(name = "Veiculo.findByVeicTipoCarroceria", query = "SELECT v FROM Veiculo v WHERE v.veicTipoCarroceria = :veicTipoCarroceria"),
    @NamedQuery(name = "Veiculo.findByVeicTipoProprietario", query = "SELECT v FROM Veiculo v WHERE v.veicTipoProprietario = :veicTipoProprietario"),
    @NamedQuery(name = "Veiculo.findByVeicAntt", query = "SELECT v FROM Veiculo v WHERE v.veicAntt = :veicAntt"),
    @NamedQuery(name = "Veiculo.findByVeicRntr", query = "SELECT v FROM Veiculo v WHERE v.veicRntr = :veicRntr"),
    @NamedQuery(name = "Veiculo.findByVeicStatus", query = "SELECT v FROM Veiculo v WHERE v.veicStatus = :veicStatus"),
    @NamedQuery(name = "Veiculo.findByVeicValor", query = "SELECT v FROM Veiculo v WHERE v.veicValor = :veicValor"),
    @NamedQuery(name = "Veiculo.findByGrpoId", query = "SELECT v FROM Veiculo v WHERE v.grpoId = :grpoId"),
    @NamedQuery(name = "Veiculo.findBySbgrId", query = "SELECT v FROM Veiculo v WHERE v.sbgrId = :sbgrId"),
    @NamedQuery(name = "Veiculo.findByVeicCodigoFabricacao", query = "SELECT v FROM Veiculo v WHERE v.veicCodigoFabricacao = :veicCodigoFabricacao"),
    @NamedQuery(name = "Veiculo.findByVeicDescricao", query = "SELECT v FROM Veiculo v WHERE v.veicDescricao = :veicDescricao")})
public class Veiculo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "VEIC_ID")
    private String veicId;
    @Basic(optional = false)
    @Column(name = "VEIC_PLACA")
    private String veicPlaca;
    @Column(name = "VEIC_HODOMETRO")
    private Long veicHodometro;
    @Column(name = "VEIC_MARCA")
    private String veicMarca;
    @Column(name = "VEIC_MODELO")
    private String veicModelo;
    @Lob
    @Column(name = "VEIC_IMAGEM")
    private byte[] veicImagem;
    @Lob
    @Column(name = "VEIC_OBS")
    private String veicObs;
    @Column(name = "VEIC_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date veicLastupdate;
    @Column(name = "VEIC_UF")
    private String veicUf;
    @Column(name = "VEIC_CODIGO")
    private String veicCodigo;
    @Column(name = "VEIC_RENAVAM")
    private String veicRenavam;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "VEIC_TARA")
    private BigDecimal veicTara;
    @Basic(optional = false)
    @Column(name = "VEIC_CAPACIDADE_KG")
    private BigDecimal veicCapacidadeKg;
    @Basic(optional = false)
    @Column(name = "VEIC_CAPACIDADE_M3")
    private BigDecimal veicCapacidadeM3;
    @Column(name = "VEIC_TIPO_PROPRIEDADE")
    private String veicTipoPropriedade;
    @Column(name = "VEIC_TIPO_VEICULO")
    private String veicTipoVeiculo;
    @Column(name = "VEIC_TIPO_RODADO")
    private String veicTipoRodado;
    @Column(name = "VEIC_TIPO_CARROCERIA")
    private String veicTipoCarroceria;
    @Column(name = "VEIC_TIPO_PROPRIETARIO")
    private String veicTipoProprietario;
    @Column(name = "VEIC_ANTT")
    private String veicAntt;
    @Column(name = "VEIC_RNTR")
    private String veicRntr;
    @Column(name = "VEIC_STATUS")
    private String veicStatus;
    @Column(name = "VEIC_VALOR")
    private BigDecimal veicValor;
    @Column(name = "GRPO_ID")
    private String grpoId;
    @Column(name = "SBGR_ID")
    private String sbgrId;
    @Column(name = "VEIC_CODIGO_FABRICACAO")
    private String veicCodigoFabricacao;
    @Lob
    @Column(name = "VEIC_ACESSORIOS")
    private String veicAcessorios;
    @Column(name = "VEIC_DESCRICAO")
    private String veicDescricao;
    @OneToMany(mappedBy = "veicId")
    private List<Pedidos> pedidosList;
    @OneToMany(mappedBy = "veicId")
    private List<LocacoesEquipamentos> locacoesEquipamentosList;
    @OneToMany(mappedBy = "veicId")
    private List<Entregas> entregasList;
    @JoinColumn(name = "MUNI_ID", referencedColumnName = "MUNI_ID")
    @ManyToOne
    private Municipios muniId;
    @JoinColumn(name = "PESS_ID", referencedColumnName = "PESS_ID")
    @ManyToOne
    private Pessoas pessId;
    @OneToMany(mappedBy = "veicId")
    private List<VeiculosClientes> veiculosClientesList;
    @OneToMany(mappedBy = "veicId")
    private List<OrdemServico> ordemServicoList;
    @OneToMany(mappedBy = "veicId")
    private List<VeiculosMotoristas> veiculosMotoristasList;
    @OneToMany(mappedBy = "veicId")
    private List<VeiculoObjopecoml> veiculoObjopecomlList;
    @OneToMany(mappedBy = "veicId")
    private List<PessoasVeiculos> pessoasVeiculosList;
    @OneToMany(mappedBy = "veicId")
    private List<Expedicoes> expedicoesList;

    public Veiculo() {
    }

    public Veiculo(String veicId) {
        this.veicId = veicId;
    }

    public Veiculo(String veicId, String veicPlaca, BigDecimal veicTara, BigDecimal veicCapacidadeKg, BigDecimal veicCapacidadeM3) {
        this.veicId = veicId;
        this.veicPlaca = veicPlaca;
        this.veicTara = veicTara;
        this.veicCapacidadeKg = veicCapacidadeKg;
        this.veicCapacidadeM3 = veicCapacidadeM3;
    }

    public String getVeicId() {
        return veicId;
    }

    public void setVeicId(String veicId) {
        this.veicId = veicId;
    }

    public String getVeicPlaca() {
        return veicPlaca;
    }

    public void setVeicPlaca(String veicPlaca) {
        this.veicPlaca = veicPlaca;
    }

    public Long getVeicHodometro() {
        return veicHodometro;
    }

    public void setVeicHodometro(Long veicHodometro) {
        this.veicHodometro = veicHodometro;
    }

    public String getVeicMarca() {
        return veicMarca;
    }

    public void setVeicMarca(String veicMarca) {
        this.veicMarca = veicMarca;
    }

    public String getVeicModelo() {
        return veicModelo;
    }

    public void setVeicModelo(String veicModelo) {
        this.veicModelo = veicModelo;
    }

    public byte[] getVeicImagem() {
        return veicImagem;
    }

    public void setVeicImagem(byte[] veicImagem) {
        this.veicImagem = veicImagem;
    }

    public String getVeicObs() {
        return veicObs;
    }

    public void setVeicObs(String veicObs) {
        this.veicObs = veicObs;
    }

    public Date getVeicLastupdate() {
        return veicLastupdate;
    }

    public void setVeicLastupdate(Date veicLastupdate) {
        this.veicLastupdate = veicLastupdate;
    }

    public String getVeicUf() {
        return veicUf;
    }

    public void setVeicUf(String veicUf) {
        this.veicUf = veicUf;
    }

    public String getVeicCodigo() {
        return veicCodigo;
    }

    public void setVeicCodigo(String veicCodigo) {
        this.veicCodigo = veicCodigo;
    }

    public String getVeicRenavam() {
        return veicRenavam;
    }

    public void setVeicRenavam(String veicRenavam) {
        this.veicRenavam = veicRenavam;
    }

    public BigDecimal getVeicTara() {
        return veicTara;
    }

    public void setVeicTara(BigDecimal veicTara) {
        this.veicTara = veicTara;
    }

    public BigDecimal getVeicCapacidadeKg() {
        return veicCapacidadeKg;
    }

    public void setVeicCapacidadeKg(BigDecimal veicCapacidadeKg) {
        this.veicCapacidadeKg = veicCapacidadeKg;
    }

    public BigDecimal getVeicCapacidadeM3() {
        return veicCapacidadeM3;
    }

    public void setVeicCapacidadeM3(BigDecimal veicCapacidadeM3) {
        this.veicCapacidadeM3 = veicCapacidadeM3;
    }

    public String getVeicTipoPropriedade() {
        return veicTipoPropriedade;
    }

    public void setVeicTipoPropriedade(String veicTipoPropriedade) {
        this.veicTipoPropriedade = veicTipoPropriedade;
    }

    public String getVeicTipoVeiculo() {
        return veicTipoVeiculo;
    }

    public void setVeicTipoVeiculo(String veicTipoVeiculo) {
        this.veicTipoVeiculo = veicTipoVeiculo;
    }

    public String getVeicTipoRodado() {
        return veicTipoRodado;
    }

    public void setVeicTipoRodado(String veicTipoRodado) {
        this.veicTipoRodado = veicTipoRodado;
    }

    public String getVeicTipoCarroceria() {
        return veicTipoCarroceria;
    }

    public void setVeicTipoCarroceria(String veicTipoCarroceria) {
        this.veicTipoCarroceria = veicTipoCarroceria;
    }

    public String getVeicTipoProprietario() {
        return veicTipoProprietario;
    }

    public void setVeicTipoProprietario(String veicTipoProprietario) {
        this.veicTipoProprietario = veicTipoProprietario;
    }

    public String getVeicAntt() {
        return veicAntt;
    }

    public void setVeicAntt(String veicAntt) {
        this.veicAntt = veicAntt;
    }

    public String getVeicRntr() {
        return veicRntr;
    }

    public void setVeicRntr(String veicRntr) {
        this.veicRntr = veicRntr;
    }

    public String getVeicStatus() {
        return veicStatus;
    }

    public void setVeicStatus(String veicStatus) {
        this.veicStatus = veicStatus;
    }

    public BigDecimal getVeicValor() {
        return veicValor;
    }

    public void setVeicValor(BigDecimal veicValor) {
        this.veicValor = veicValor;
    }

    public String getGrpoId() {
        return grpoId;
    }

    public void setGrpoId(String grpoId) {
        this.grpoId = grpoId;
    }

    public String getSbgrId() {
        return sbgrId;
    }

    public void setSbgrId(String sbgrId) {
        this.sbgrId = sbgrId;
    }

    public String getVeicCodigoFabricacao() {
        return veicCodigoFabricacao;
    }

    public void setVeicCodigoFabricacao(String veicCodigoFabricacao) {
        this.veicCodigoFabricacao = veicCodigoFabricacao;
    }

    public String getVeicAcessorios() {
        return veicAcessorios;
    }

    public void setVeicAcessorios(String veicAcessorios) {
        this.veicAcessorios = veicAcessorios;
    }

    public String getVeicDescricao() {
        return veicDescricao;
    }

    public void setVeicDescricao(String veicDescricao) {
        this.veicDescricao = veicDescricao;
    }

    @XmlTransient
    public List<Pedidos> getPedidosList() {
        return pedidosList;
    }

    public void setPedidosList(List<Pedidos> pedidosList) {
        this.pedidosList = pedidosList;
    }

    @XmlTransient
    public List<LocacoesEquipamentos> getLocacoesEquipamentosList() {
        return locacoesEquipamentosList;
    }

    public void setLocacoesEquipamentosList(List<LocacoesEquipamentos> locacoesEquipamentosList) {
        this.locacoesEquipamentosList = locacoesEquipamentosList;
    }

    @XmlTransient
    public List<Entregas> getEntregasList() {
        return entregasList;
    }

    public void setEntregasList(List<Entregas> entregasList) {
        this.entregasList = entregasList;
    }

    public Municipios getMuniId() {
        return muniId;
    }

    public void setMuniId(Municipios muniId) {
        this.muniId = muniId;
    }

    public Pessoas getPessId() {
        return pessId;
    }

    public void setPessId(Pessoas pessId) {
        this.pessId = pessId;
    }

    @XmlTransient
    public List<VeiculosClientes> getVeiculosClientesList() {
        return veiculosClientesList;
    }

    public void setVeiculosClientesList(List<VeiculosClientes> veiculosClientesList) {
        this.veiculosClientesList = veiculosClientesList;
    }

    @XmlTransient
    public List<OrdemServico> getOrdemServicoList() {
        return ordemServicoList;
    }

    public void setOrdemServicoList(List<OrdemServico> ordemServicoList) {
        this.ordemServicoList = ordemServicoList;
    }

    @XmlTransient
    public List<VeiculosMotoristas> getVeiculosMotoristasList() {
        return veiculosMotoristasList;
    }

    public void setVeiculosMotoristasList(List<VeiculosMotoristas> veiculosMotoristasList) {
        this.veiculosMotoristasList = veiculosMotoristasList;
    }

    @XmlTransient
    public List<VeiculoObjopecoml> getVeiculoObjopecomlList() {
        return veiculoObjopecomlList;
    }

    public void setVeiculoObjopecomlList(List<VeiculoObjopecoml> veiculoObjopecomlList) {
        this.veiculoObjopecomlList = veiculoObjopecomlList;
    }

    @XmlTransient
    public List<PessoasVeiculos> getPessoasVeiculosList() {
        return pessoasVeiculosList;
    }

    public void setPessoasVeiculosList(List<PessoasVeiculos> pessoasVeiculosList) {
        this.pessoasVeiculosList = pessoasVeiculosList;
    }

    @XmlTransient
    public List<Expedicoes> getExpedicoesList() {
        return expedicoesList;
    }

    public void setExpedicoesList(List<Expedicoes> expedicoesList) {
        this.expedicoesList = expedicoesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (veicId != null ? veicId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Veiculo)) {
            return false;
        }
        Veiculo other = (Veiculo) object;
        if ((this.veicId == null && other.veicId != null) || (this.veicId != null && !this.veicId.equals(other.veicId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.Veiculo[ veicId=" + veicId + " ]";
    }
    
}
