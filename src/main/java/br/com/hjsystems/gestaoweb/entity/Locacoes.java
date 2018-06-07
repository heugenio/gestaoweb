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
@Table(name = "LOCACOES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Locacoes.findAll", query = "SELECT l FROM Locacoes l"),
    @NamedQuery(name = "Locacoes.findByLoccId", query = "SELECT l FROM Locacoes l WHERE l.loccId = :loccId"),
    @NamedQuery(name = "Locacoes.findByLoccData", query = "SELECT l FROM Locacoes l WHERE l.loccData = :loccData"),
    @NamedQuery(name = "Locacoes.findByLoccDataFechamento", query = "SELECT l FROM Locacoes l WHERE l.loccDataFechamento = :loccDataFechamento"),
    @NamedQuery(name = "Locacoes.findByLoccStatus", query = "SELECT l FROM Locacoes l WHERE l.loccStatus = :loccStatus"),
    @NamedQuery(name = "Locacoes.findByLoccCodigo", query = "SELECT l FROM Locacoes l WHERE l.loccCodigo = :loccCodigo"),
    @NamedQuery(name = "Locacoes.findByLoccValor", query = "SELECT l FROM Locacoes l WHERE l.loccValor = :loccValor"),
    @NamedQuery(name = "Locacoes.findByLoccVlrDescVenc", query = "SELECT l FROM Locacoes l WHERE l.loccVlrDescVenc = :loccVlrDescVenc"),
    @NamedQuery(name = "Locacoes.findByLoccDiaVenc", query = "SELECT l FROM Locacoes l WHERE l.loccDiaVenc = :loccDiaVenc"),
    @NamedQuery(name = "Locacoes.findByLoccTipoPag", query = "SELECT l FROM Locacoes l WHERE l.loccTipoPag = :loccTipoPag"),
    @NamedQuery(name = "Locacoes.findByLoccLastupdate", query = "SELECT l FROM Locacoes l WHERE l.loccLastupdate = :loccLastupdate"),
    @NamedQuery(name = "Locacoes.findByLoccFranquiaGeral", query = "SELECT l FROM Locacoes l WHERE l.loccFranquiaGeral = :loccFranquiaGeral"),
    @NamedQuery(name = "Locacoes.findByLoccVlrFranquiaGeral", query = "SELECT l FROM Locacoes l WHERE l.loccVlrFranquiaGeral = :loccVlrFranquiaGeral"),
    @NamedQuery(name = "Locacoes.findByLoccUsarFranquiaGeral", query = "SELECT l FROM Locacoes l WHERE l.loccUsarFranquiaGeral = :loccUsarFranquiaGeral"),
    @NamedQuery(name = "Locacoes.findByLoccValorAdicGeral", query = "SELECT l FROM Locacoes l WHERE l.loccValorAdicGeral = :loccValorAdicGeral"),
    @NamedQuery(name = "Locacoes.findByLoccDataEncerramento", query = "SELECT l FROM Locacoes l WHERE l.loccDataEncerramento = :loccDataEncerramento"),
    @NamedQuery(name = "Locacoes.findByPddsId", query = "SELECT l FROM Locacoes l WHERE l.pddsId = :pddsId")})
public class Locacoes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LOCC_ID")
    private String loccId;
    @Column(name = "LOCC_DATA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date loccData;
    @Column(name = "LOCC_DATA_FECHAMENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date loccDataFechamento;
    @Basic(optional = false)
    @Column(name = "LOCC_STATUS")
    private String loccStatus;
    @Column(name = "LOCC_CODIGO")
    private String loccCodigo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "LOCC_VALOR")
    private BigDecimal loccValor;
    @Column(name = "LOCC_VLR_DESC_VENC")
    private BigDecimal loccVlrDescVenc;
    @Column(name = "LOCC_DIA_VENC")
    private Integer loccDiaVenc;
    @Column(name = "LOCC_TIPO_PAG")
    private String loccTipoPag;
    @Column(name = "LOCC_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date loccLastupdate;
    @Column(name = "LOCC_FRANQUIA_GERAL")
    private BigDecimal loccFranquiaGeral;
    @Column(name = "LOCC_VLR_FRANQUIA_GERAL")
    private BigDecimal loccVlrFranquiaGeral;
    @Column(name = "LOCC_USAR_FRANQUIA_GERAL")
    private String loccUsarFranquiaGeral;
    @Column(name = "LOCC_VALOR_ADIC_GERAL")
    private BigDecimal loccValorAdicGeral;
    @Lob
    @Column(name = "LOCC_OBS")
    private String loccObs;
    @Column(name = "LOCC_DATA_ENCERRAMENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date loccDataEncerramento;
    @Column(name = "PDDS_ID")
    private String pddsId;
    @OneToMany(mappedBy = "loccId")
    private List<LocacoesEquipamentos> locacoesEquipamentosList;
    @JoinColumn(name = "FVEN_ID", referencedColumnName = "FVEN_ID")
    @ManyToOne
    private FormasVencimento fvenId;
    @JoinColumn(name = "INDX_ID", referencedColumnName = "INDX_ID")
    @ManyToOne
    private Indexadores indxId;
    @JoinColumn(name = "OPCM_ID", referencedColumnName = "OPCM_ID")
    @ManyToOne
    private OperacoesComerciais opcmId;
    @JoinColumn(name = "PESS_ID", referencedColumnName = "PESS_ID")
    @ManyToOne
    private Pessoas pessId;
    @JoinColumn(name = "TCNC_ID", referencedColumnName = "TCNC_ID")
    @ManyToOne
    private Tecnico tcncId;

    public Locacoes() {
    }

    public Locacoes(String loccId) {
        this.loccId = loccId;
    }

    public Locacoes(String loccId, String loccStatus) {
        this.loccId = loccId;
        this.loccStatus = loccStatus;
    }

    public String getLoccId() {
        return loccId;
    }

    public void setLoccId(String loccId) {
        this.loccId = loccId;
    }

    public Date getLoccData() {
        return loccData;
    }

    public void setLoccData(Date loccData) {
        this.loccData = loccData;
    }

    public Date getLoccDataFechamento() {
        return loccDataFechamento;
    }

    public void setLoccDataFechamento(Date loccDataFechamento) {
        this.loccDataFechamento = loccDataFechamento;
    }

    public String getLoccStatus() {
        return loccStatus;
    }

    public void setLoccStatus(String loccStatus) {
        this.loccStatus = loccStatus;
    }

    public String getLoccCodigo() {
        return loccCodigo;
    }

    public void setLoccCodigo(String loccCodigo) {
        this.loccCodigo = loccCodigo;
    }

    public BigDecimal getLoccValor() {
        return loccValor;
    }

    public void setLoccValor(BigDecimal loccValor) {
        this.loccValor = loccValor;
    }

    public BigDecimal getLoccVlrDescVenc() {
        return loccVlrDescVenc;
    }

    public void setLoccVlrDescVenc(BigDecimal loccVlrDescVenc) {
        this.loccVlrDescVenc = loccVlrDescVenc;
    }

    public Integer getLoccDiaVenc() {
        return loccDiaVenc;
    }

    public void setLoccDiaVenc(Integer loccDiaVenc) {
        this.loccDiaVenc = loccDiaVenc;
    }

    public String getLoccTipoPag() {
        return loccTipoPag;
    }

    public void setLoccTipoPag(String loccTipoPag) {
        this.loccTipoPag = loccTipoPag;
    }

    public Date getLoccLastupdate() {
        return loccLastupdate;
    }

    public void setLoccLastupdate(Date loccLastupdate) {
        this.loccLastupdate = loccLastupdate;
    }

    public BigDecimal getLoccFranquiaGeral() {
        return loccFranquiaGeral;
    }

    public void setLoccFranquiaGeral(BigDecimal loccFranquiaGeral) {
        this.loccFranquiaGeral = loccFranquiaGeral;
    }

    public BigDecimal getLoccVlrFranquiaGeral() {
        return loccVlrFranquiaGeral;
    }

    public void setLoccVlrFranquiaGeral(BigDecimal loccVlrFranquiaGeral) {
        this.loccVlrFranquiaGeral = loccVlrFranquiaGeral;
    }

    public String getLoccUsarFranquiaGeral() {
        return loccUsarFranquiaGeral;
    }

    public void setLoccUsarFranquiaGeral(String loccUsarFranquiaGeral) {
        this.loccUsarFranquiaGeral = loccUsarFranquiaGeral;
    }

    public BigDecimal getLoccValorAdicGeral() {
        return loccValorAdicGeral;
    }

    public void setLoccValorAdicGeral(BigDecimal loccValorAdicGeral) {
        this.loccValorAdicGeral = loccValorAdicGeral;
    }

    public String getLoccObs() {
        return loccObs;
    }

    public void setLoccObs(String loccObs) {
        this.loccObs = loccObs;
    }

    public Date getLoccDataEncerramento() {
        return loccDataEncerramento;
    }

    public void setLoccDataEncerramento(Date loccDataEncerramento) {
        this.loccDataEncerramento = loccDataEncerramento;
    }

    public String getPddsId() {
        return pddsId;
    }

    public void setPddsId(String pddsId) {
        this.pddsId = pddsId;
    }

    @XmlTransient
    public List<LocacoesEquipamentos> getLocacoesEquipamentosList() {
        return locacoesEquipamentosList;
    }

    public void setLocacoesEquipamentosList(List<LocacoesEquipamentos> locacoesEquipamentosList) {
        this.locacoesEquipamentosList = locacoesEquipamentosList;
    }

    public FormasVencimento getFvenId() {
        return fvenId;
    }

    public void setFvenId(FormasVencimento fvenId) {
        this.fvenId = fvenId;
    }

    public Indexadores getIndxId() {
        return indxId;
    }

    public void setIndxId(Indexadores indxId) {
        this.indxId = indxId;
    }

    public OperacoesComerciais getOpcmId() {
        return opcmId;
    }

    public void setOpcmId(OperacoesComerciais opcmId) {
        this.opcmId = opcmId;
    }

    public Pessoas getPessId() {
        return pessId;
    }

    public void setPessId(Pessoas pessId) {
        this.pessId = pessId;
    }

    public Tecnico getTcncId() {
        return tcncId;
    }

    public void setTcncId(Tecnico tcncId) {
        this.tcncId = tcncId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (loccId != null ? loccId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Locacoes)) {
            return false;
        }
        Locacoes other = (Locacoes) object;
        if ((this.loccId == null && other.loccId != null) || (this.loccId != null && !this.loccId.equals(other.loccId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.Locacoes[ loccId=" + loccId + " ]";
    }
    
}
