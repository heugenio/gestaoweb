/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hjsystems.gestaoweb.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "ENTREGAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Entregas.findAll", query = "SELECT e FROM Entregas e"),
    @NamedQuery(name = "Entregas.findByEntgId", query = "SELECT e FROM Entregas e WHERE e.entgId = :entgId"),
    @NamedQuery(name = "Entregas.findByEntgDataSaida", query = "SELECT e FROM Entregas e WHERE e.entgDataSaida = :entgDataSaida"),
    @NamedQuery(name = "Entregas.findByEntgObservacao", query = "SELECT e FROM Entregas e WHERE e.entgObservacao = :entgObservacao"),
    @NamedQuery(name = "Entregas.findByEntgLastupdate", query = "SELECT e FROM Entregas e WHERE e.entgLastupdate = :entgLastupdate"),
    @NamedQuery(name = "Entregas.findByPessId", query = "SELECT e FROM Entregas e WHERE e.pessId = :pessId"),
    @NamedQuery(name = "Entregas.findByEndeId", query = "SELECT e FROM Entregas e WHERE e.endeId = :endeId"),
    @NamedQuery(name = "Entregas.findByEntgDataCriacao", query = "SELECT e FROM Entregas e WHERE e.entgDataCriacao = :entgDataCriacao"),
    @NamedQuery(name = "Entregas.findByEntgDataConferencia", query = "SELECT e FROM Entregas e WHERE e.entgDataConferencia = :entgDataConferencia"),
    @NamedQuery(name = "Entregas.findByEntgStatus", query = "SELECT e FROM Entregas e WHERE e.entgStatus = :entgStatus"),
    @NamedQuery(name = "Entregas.findByEntgDataSeparacao", query = "SELECT e FROM Entregas e WHERE e.entgDataSeparacao = :entgDataSeparacao"),
    @NamedQuery(name = "Entregas.findByEntgOrdem", query = "SELECT e FROM Entregas e WHERE e.entgOrdem = :entgOrdem"),
    @NamedQuery(name = "Entregas.findByEntgDataRetorno", query = "SELECT e FROM Entregas e WHERE e.entgDataRetorno = :entgDataRetorno")})
public class Entregas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ENTG_ID")
    private String entgId;
    @Column(name = "ENTG_DATA_SAIDA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date entgDataSaida;
    @Column(name = "ENTG_OBSERVACAO")
    private String entgObservacao;
    @Column(name = "ENTG_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date entgLastupdate;
    @Column(name = "PESS_ID")
    private String pessId;
    @Column(name = "ENDE_ID")
    private String endeId;
    @Column(name = "ENTG_DATA_CRIACAO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date entgDataCriacao;
    @Column(name = "ENTG_DATA_CONFERENCIA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date entgDataConferencia;
    @Column(name = "ENTG_STATUS")
    private String entgStatus;
    @Column(name = "ENTG_DATA_SEPARACAO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date entgDataSeparacao;
    @Column(name = "ENTG_ORDEM")
    private Integer entgOrdem;
    @Column(name = "ENTG_DATA_RETORNO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date entgDataRetorno;
    @JoinColumn(name = "PES_PESS_ID", referencedColumnName = "PESS_ID")
    @ManyToOne
    private Pessoas pesPessId;
    @JoinColumn(name = "DCFS_ID", referencedColumnName = "DCFS_ID")
    @ManyToOne
    private DocumentosFiscais dcfsId;
    @JoinColumn(name = "ETGD_ID", referencedColumnName = "ETGD_ID")
    @ManyToOne
    private Entregador etgdId;
    @JoinColumn(name = "ENT_ETGD_ID", referencedColumnName = "ETGD_ID")
    @ManyToOne
    private Entregador entEtgdId;
    @JoinColumn(name = "EXPD_ID", referencedColumnName = "EXPD_ID")
    @ManyToOne
    private Expedicoes expdId;
    @JoinColumn(name = "ORSV_ID", referencedColumnName = "ORSV_ID")
    @ManyToOne
    private OrdemServico orsvId;
    @JoinColumn(name = "PDDS_ID", referencedColumnName = "PDDS_ID")
    @ManyToOne
    private Pedidos pddsId;
    @JoinColumn(name = "RQSC_ID", referencedColumnName = "RQSC_ID")
    @ManyToOne
    private Requisicoes rqscId;
    @JoinColumn(name = "RMET_ID", referencedColumnName = "RMET_ID")
    @ManyToOne
    private RomaneioEntregas rmetId;
    @JoinColumn(name = "VEIC_ID", referencedColumnName = "VEIC_ID")
    @ManyToOne
    private Veiculo veicId;
    @JoinColumn(name = "TPET_ID", referencedColumnName = "TPET_ID")
    @ManyToOne
    private TipoEntregas tpetId;
    @JoinColumn(name = "USRS_ID", referencedColumnName = "USRS_ID")
    @ManyToOne
    private Usuarios usrsId;

    public Entregas() {
    }

    public Entregas(String entgId) {
        this.entgId = entgId;
    }

    public String getEntgId() {
        return entgId;
    }

    public void setEntgId(String entgId) {
        this.entgId = entgId;
    }

    public Date getEntgDataSaida() {
        return entgDataSaida;
    }

    public void setEntgDataSaida(Date entgDataSaida) {
        this.entgDataSaida = entgDataSaida;
    }

    public String getEntgObservacao() {
        return entgObservacao;
    }

    public void setEntgObservacao(String entgObservacao) {
        this.entgObservacao = entgObservacao;
    }

    public Date getEntgLastupdate() {
        return entgLastupdate;
    }

    public void setEntgLastupdate(Date entgLastupdate) {
        this.entgLastupdate = entgLastupdate;
    }

    public String getPessId() {
        return pessId;
    }

    public void setPessId(String pessId) {
        this.pessId = pessId;
    }

    public String getEndeId() {
        return endeId;
    }

    public void setEndeId(String endeId) {
        this.endeId = endeId;
    }

    public Date getEntgDataCriacao() {
        return entgDataCriacao;
    }

    public void setEntgDataCriacao(Date entgDataCriacao) {
        this.entgDataCriacao = entgDataCriacao;
    }

    public Date getEntgDataConferencia() {
        return entgDataConferencia;
    }

    public void setEntgDataConferencia(Date entgDataConferencia) {
        this.entgDataConferencia = entgDataConferencia;
    }

    public String getEntgStatus() {
        return entgStatus;
    }

    public void setEntgStatus(String entgStatus) {
        this.entgStatus = entgStatus;
    }

    public Date getEntgDataSeparacao() {
        return entgDataSeparacao;
    }

    public void setEntgDataSeparacao(Date entgDataSeparacao) {
        this.entgDataSeparacao = entgDataSeparacao;
    }

    public Integer getEntgOrdem() {
        return entgOrdem;
    }

    public void setEntgOrdem(Integer entgOrdem) {
        this.entgOrdem = entgOrdem;
    }

    public Date getEntgDataRetorno() {
        return entgDataRetorno;
    }

    public void setEntgDataRetorno(Date entgDataRetorno) {
        this.entgDataRetorno = entgDataRetorno;
    }

    public Pessoas getPesPessId() {
        return pesPessId;
    }

    public void setPesPessId(Pessoas pesPessId) {
        this.pesPessId = pesPessId;
    }

    public DocumentosFiscais getDcfsId() {
        return dcfsId;
    }

    public void setDcfsId(DocumentosFiscais dcfsId) {
        this.dcfsId = dcfsId;
    }

    public Entregador getEtgdId() {
        return etgdId;
    }

    public void setEtgdId(Entregador etgdId) {
        this.etgdId = etgdId;
    }

    public Entregador getEntEtgdId() {
        return entEtgdId;
    }

    public void setEntEtgdId(Entregador entEtgdId) {
        this.entEtgdId = entEtgdId;
    }

    public Expedicoes getExpdId() {
        return expdId;
    }

    public void setExpdId(Expedicoes expdId) {
        this.expdId = expdId;
    }

    public OrdemServico getOrsvId() {
        return orsvId;
    }

    public void setOrsvId(OrdemServico orsvId) {
        this.orsvId = orsvId;
    }

    public Pedidos getPddsId() {
        return pddsId;
    }

    public void setPddsId(Pedidos pddsId) {
        this.pddsId = pddsId;
    }

    public Requisicoes getRqscId() {
        return rqscId;
    }

    public void setRqscId(Requisicoes rqscId) {
        this.rqscId = rqscId;
    }

    public RomaneioEntregas getRmetId() {
        return rmetId;
    }

    public void setRmetId(RomaneioEntregas rmetId) {
        this.rmetId = rmetId;
    }

    public Veiculo getVeicId() {
        return veicId;
    }

    public void setVeicId(Veiculo veicId) {
        this.veicId = veicId;
    }

    public TipoEntregas getTpetId() {
        return tpetId;
    }

    public void setTpetId(TipoEntregas tpetId) {
        this.tpetId = tpetId;
    }

    public Usuarios getUsrsId() {
        return usrsId;
    }

    public void setUsrsId(Usuarios usrsId) {
        this.usrsId = usrsId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (entgId != null ? entgId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Entregas)) {
            return false;
        }
        Entregas other = (Entregas) object;
        if ((this.entgId == null && other.entgId != null) || (this.entgId != null && !this.entgId.equals(other.entgId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.Entregas[ entgId=" + entgId + " ]";
    }
    
}
