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
@Table(name = "LOCACOES_EQUIPAMENTOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LocacoesEquipamentos.findAll", query = "SELECT l FROM LocacoesEquipamentos l"),
    @NamedQuery(name = "LocacoesEquipamentos.findByLceqId", query = "SELECT l FROM LocacoesEquipamentos l WHERE l.lceqId = :lceqId"),
    @NamedQuery(name = "LocacoesEquipamentos.findByLceqOdometro", query = "SELECT l FROM LocacoesEquipamentos l WHERE l.lceqOdometro = :lceqOdometro"),
    @NamedQuery(name = "LocacoesEquipamentos.findByLceqFranquia", query = "SELECT l FROM LocacoesEquipamentos l WHERE l.lceqFranquia = :lceqFranquia"),
    @NamedQuery(name = "LocacoesEquipamentos.findByLceqValorFranquia", query = "SELECT l FROM LocacoesEquipamentos l WHERE l.lceqValorFranquia = :lceqValorFranquia"),
    @NamedQuery(name = "LocacoesEquipamentos.findByLceqValorAdicionais", query = "SELECT l FROM LocacoesEquipamentos l WHERE l.lceqValorAdicionais = :lceqValorAdicionais"),
    @NamedQuery(name = "LocacoesEquipamentos.findByLceqDiaContagem", query = "SELECT l FROM LocacoesEquipamentos l WHERE l.lceqDiaContagem = :lceqDiaContagem"),
    @NamedQuery(name = "LocacoesEquipamentos.findByLceqDataPrxContagem", query = "SELECT l FROM LocacoesEquipamentos l WHERE l.lceqDataPrxContagem = :lceqDataPrxContagem"),
    @NamedQuery(name = "LocacoesEquipamentos.findByLceqStatus", query = "SELECT l FROM LocacoesEquipamentos l WHERE l.lceqStatus = :lceqStatus"),
    @NamedQuery(name = "LocacoesEquipamentos.findByLceqLastupdate", query = "SELECT l FROM LocacoesEquipamentos l WHERE l.lceqLastupdate = :lceqLastupdate"),
    @NamedQuery(name = "LocacoesEquipamentos.findByLceqVeicValor", query = "SELECT l FROM LocacoesEquipamentos l WHERE l.lceqVeicValor = :lceqVeicValor"),
    @NamedQuery(name = "LocacoesEquipamentos.findByLceqMesesContrato", query = "SELECT l FROM LocacoesEquipamentos l WHERE l.lceqMesesContrato = :lceqMesesContrato")})
public class LocacoesEquipamentos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LCEQ_ID")
    private String lceqId;
    @Column(name = "LCEQ_ODOMETRO")
    private Long lceqOdometro;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "LCEQ_FRANQUIA")
    private BigDecimal lceqFranquia;
    @Basic(optional = false)
    @Column(name = "LCEQ_VALOR_FRANQUIA")
    private BigDecimal lceqValorFranquia;
    @Basic(optional = false)
    @Column(name = "LCEQ_VALOR_ADICIONAIS")
    private BigDecimal lceqValorAdicionais;
    @Column(name = "LCEQ_DIA_CONTAGEM")
    private Integer lceqDiaContagem;
    @Column(name = "LCEQ_DATA_PRX_CONTAGEM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lceqDataPrxContagem;
    @Basic(optional = false)
    @Column(name = "LCEQ_STATUS")
    private String lceqStatus;
    @Column(name = "LCEQ_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lceqLastupdate;
    @Column(name = "LCEQ_VEIC_VALOR")
    private BigDecimal lceqVeicValor;
    @Column(name = "LCEQ_MESES_CONTRATO")
    private Integer lceqMesesContrato;
    @JoinColumn(name = "LOCC_ID", referencedColumnName = "LOCC_ID")
    @ManyToOne
    private Locacoes loccId;
    @OneToMany(mappedBy = "locLceqId")
    private List<LocacoesEquipamentos> locacoesEquipamentosList;
    @JoinColumn(name = "LOC_LCEQ_ID", referencedColumnName = "LCEQ_ID")
    @ManyToOne
    private LocacoesEquipamentos locLceqId;
    @JoinColumn(name = "VEIC_ID", referencedColumnName = "VEIC_ID")
    @ManyToOne
    private Veiculo veicId;
    @OneToMany(mappedBy = "lceqId")
    private List<Requisicoes> requisicoesList;
    @OneToMany(mappedBy = "lceqId")
    private List<ItensLocacao> itensLocacaoList;
    @OneToMany(mappedBy = "lceqId")
    private List<OrdemServico> ordemServicoList;
    @OneToMany(mappedBy = "lceqId")
    private List<LocacoeseqptContagens> locacoeseqptContagensList;

    public LocacoesEquipamentos() {
    }

    public LocacoesEquipamentos(String lceqId) {
        this.lceqId = lceqId;
    }

    public LocacoesEquipamentos(String lceqId, BigDecimal lceqValorFranquia, BigDecimal lceqValorAdicionais, String lceqStatus) {
        this.lceqId = lceqId;
        this.lceqValorFranquia = lceqValorFranquia;
        this.lceqValorAdicionais = lceqValorAdicionais;
        this.lceqStatus = lceqStatus;
    }

    public String getLceqId() {
        return lceqId;
    }

    public void setLceqId(String lceqId) {
        this.lceqId = lceqId;
    }

    public Long getLceqOdometro() {
        return lceqOdometro;
    }

    public void setLceqOdometro(Long lceqOdometro) {
        this.lceqOdometro = lceqOdometro;
    }

    public BigDecimal getLceqFranquia() {
        return lceqFranquia;
    }

    public void setLceqFranquia(BigDecimal lceqFranquia) {
        this.lceqFranquia = lceqFranquia;
    }

    public BigDecimal getLceqValorFranquia() {
        return lceqValorFranquia;
    }

    public void setLceqValorFranquia(BigDecimal lceqValorFranquia) {
        this.lceqValorFranquia = lceqValorFranquia;
    }

    public BigDecimal getLceqValorAdicionais() {
        return lceqValorAdicionais;
    }

    public void setLceqValorAdicionais(BigDecimal lceqValorAdicionais) {
        this.lceqValorAdicionais = lceqValorAdicionais;
    }

    public Integer getLceqDiaContagem() {
        return lceqDiaContagem;
    }

    public void setLceqDiaContagem(Integer lceqDiaContagem) {
        this.lceqDiaContagem = lceqDiaContagem;
    }

    public Date getLceqDataPrxContagem() {
        return lceqDataPrxContagem;
    }

    public void setLceqDataPrxContagem(Date lceqDataPrxContagem) {
        this.lceqDataPrxContagem = lceqDataPrxContagem;
    }

    public String getLceqStatus() {
        return lceqStatus;
    }

    public void setLceqStatus(String lceqStatus) {
        this.lceqStatus = lceqStatus;
    }

    public Date getLceqLastupdate() {
        return lceqLastupdate;
    }

    public void setLceqLastupdate(Date lceqLastupdate) {
        this.lceqLastupdate = lceqLastupdate;
    }

    public BigDecimal getLceqVeicValor() {
        return lceqVeicValor;
    }

    public void setLceqVeicValor(BigDecimal lceqVeicValor) {
        this.lceqVeicValor = lceqVeicValor;
    }

    public Integer getLceqMesesContrato() {
        return lceqMesesContrato;
    }

    public void setLceqMesesContrato(Integer lceqMesesContrato) {
        this.lceqMesesContrato = lceqMesesContrato;
    }

    public Locacoes getLoccId() {
        return loccId;
    }

    public void setLoccId(Locacoes loccId) {
        this.loccId = loccId;
    }

    @XmlTransient
    public List<LocacoesEquipamentos> getLocacoesEquipamentosList() {
        return locacoesEquipamentosList;
    }

    public void setLocacoesEquipamentosList(List<LocacoesEquipamentos> locacoesEquipamentosList) {
        this.locacoesEquipamentosList = locacoesEquipamentosList;
    }

    public LocacoesEquipamentos getLocLceqId() {
        return locLceqId;
    }

    public void setLocLceqId(LocacoesEquipamentos locLceqId) {
        this.locLceqId = locLceqId;
    }

    public Veiculo getVeicId() {
        return veicId;
    }

    public void setVeicId(Veiculo veicId) {
        this.veicId = veicId;
    }

    @XmlTransient
    public List<Requisicoes> getRequisicoesList() {
        return requisicoesList;
    }

    public void setRequisicoesList(List<Requisicoes> requisicoesList) {
        this.requisicoesList = requisicoesList;
    }

    @XmlTransient
    public List<ItensLocacao> getItensLocacaoList() {
        return itensLocacaoList;
    }

    public void setItensLocacaoList(List<ItensLocacao> itensLocacaoList) {
        this.itensLocacaoList = itensLocacaoList;
    }

    @XmlTransient
    public List<OrdemServico> getOrdemServicoList() {
        return ordemServicoList;
    }

    public void setOrdemServicoList(List<OrdemServico> ordemServicoList) {
        this.ordemServicoList = ordemServicoList;
    }

    @XmlTransient
    public List<LocacoeseqptContagens> getLocacoeseqptContagensList() {
        return locacoeseqptContagensList;
    }

    public void setLocacoeseqptContagensList(List<LocacoeseqptContagens> locacoeseqptContagensList) {
        this.locacoeseqptContagensList = locacoeseqptContagensList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lceqId != null ? lceqId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LocacoesEquipamentos)) {
            return false;
        }
        LocacoesEquipamentos other = (LocacoesEquipamentos) object;
        if ((this.lceqId == null && other.lceqId != null) || (this.lceqId != null && !this.lceqId.equals(other.lceqId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.LocacoesEquipamentos[ lceqId=" + lceqId + " ]";
    }
    
}
