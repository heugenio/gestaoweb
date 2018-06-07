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
@Table(name = "REQUISICOES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Requisicoes.findAll", query = "SELECT r FROM Requisicoes r"),
    @NamedQuery(name = "Requisicoes.findByRqscId", query = "SELECT r FROM Requisicoes r WHERE r.rqscId = :rqscId"),
    @NamedQuery(name = "Requisicoes.findByRqscNumero", query = "SELECT r FROM Requisicoes r WHERE r.rqscNumero = :rqscNumero"),
    @NamedQuery(name = "Requisicoes.findByRqscData", query = "SELECT r FROM Requisicoes r WHERE r.rqscData = :rqscData"),
    @NamedQuery(name = "Requisicoes.findByRqscImpressoes", query = "SELECT r FROM Requisicoes r WHERE r.rqscImpressoes = :rqscImpressoes"),
    @NamedQuery(name = "Requisicoes.findByRqscStatus", query = "SELECT r FROM Requisicoes r WHERE r.rqscStatus = :rqscStatus"),
    @NamedQuery(name = "Requisicoes.findByRqscConsumo", query = "SELECT r FROM Requisicoes r WHERE r.rqscConsumo = :rqscConsumo"),
    @NamedQuery(name = "Requisicoes.findByRqscLastupdate", query = "SELECT r FROM Requisicoes r WHERE r.rqscLastupdate = :rqscLastupdate"),
    @NamedQuery(name = "Requisicoes.findByRqscMotivoCanc", query = "SELECT r FROM Requisicoes r WHERE r.rqscMotivoCanc = :rqscMotivoCanc"),
    @NamedQuery(name = "Requisicoes.findByRqscUsrsIdCanc", query = "SELECT r FROM Requisicoes r WHERE r.rqscUsrsIdCanc = :rqscUsrsIdCanc"),
    @NamedQuery(name = "Requisicoes.findByRqscDataCanc", query = "SELECT r FROM Requisicoes r WHERE r.rqscDataCanc = :rqscDataCanc"),
    @NamedQuery(name = "Requisicoes.findByEndEnarId", query = "SELECT r FROM Requisicoes r WHERE r.endEnarId = :endEnarId"),
    @NamedQuery(name = "Requisicoes.findByCntsNome", query = "SELECT r FROM Requisicoes r WHERE r.cntsNome = :cntsNome"),
    @NamedQuery(name = "Requisicoes.findByPlctId", query = "SELECT r FROM Requisicoes r WHERE r.plctId = :plctId"),
    @NamedQuery(name = "Requisicoes.findByFsprId", query = "SELECT r FROM Requisicoes r WHERE r.fsprId = :fsprId")})
public class Requisicoes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "RQSC_ID")
    private String rqscId;
    @Basic(optional = false)
    @Column(name = "RQSC_NUMERO")
    private String rqscNumero;
    @Basic(optional = false)
    @Column(name = "RQSC_DATA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rqscData;
    @Basic(optional = false)
    @Column(name = "RQSC_IMPRESSOES")
    private int rqscImpressoes;
    @Basic(optional = false)
    @Column(name = "RQSC_STATUS")
    private String rqscStatus;
    @Lob
    @Column(name = "RQSC_OBSERVACAO")
    private String rqscObservacao;
    @Column(name = "RQSC_CONSUMO")
    private String rqscConsumo;
    @Column(name = "RQSC_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rqscLastupdate;
    @Column(name = "RQSC_MOTIVO_CANC")
    private String rqscMotivoCanc;
    @Column(name = "RQSC_USRS_ID_CANC")
    private String rqscUsrsIdCanc;
    @Column(name = "RQSC_DATA_CANC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rqscDataCanc;
    @Column(name = "END_ENAR_ID")
    private String endEnarId;
    @Column(name = "CNTS_NOME")
    private String cntsNome;
    @Column(name = "PLCT_ID")
    private String plctId;
    @Column(name = "FSPR_ID")
    private String fsprId;
    @OneToMany(mappedBy = "rqscId")
    private List<ItensRequisicoes> itensRequisicoesList;
    @JoinColumn(name = "ENDE_ID", referencedColumnName = "ENDE_ID")
    @ManyToOne
    private Enderecos endeId;
    @JoinColumn(name = "ATCM_ID", referencedColumnName = "ATCM_ID")
    @ManyToOne
    private AtendimentosComerciais atcmId;
    @JoinColumn(name = "USU_USRS_ID", referencedColumnName = "USRS_ID")
    @ManyToOne
    private Usuarios usuUsrsId;
    @JoinColumn(name = "ENAR_ID", referencedColumnName = "ENAR_ID")
    @ManyToOne
    private EnderecosArmazenamento enarId;
    @JoinColumn(name = "FRND_ID", referencedColumnName = "FRND_ID")
    @ManyToOne
    private Fornecedores frndId;
    @JoinColumn(name = "LCEQ_ID", referencedColumnName = "LCEQ_ID")
    @ManyToOne
    private LocacoesEquipamentos lceqId;
    @JoinColumn(name = "TBPC_ID", referencedColumnName = "TBPC_ID")
    @ManyToOne
    private TabelasPrecos tbpcId;
    @JoinColumn(name = "MDIA_ID", referencedColumnName = "MDIA_ID")
    @ManyToOne
    private Midias mdiaId;
    @JoinColumn(name = "MTCC_ID", referencedColumnName = "MTCC_ID")
    @ManyToOne
    private MotivoCancelamento mtccId;
    @JoinColumn(name = "OPRD_ID", referencedColumnName = "OPRD_ID")
    @ManyToOne
    private OrdemProducao oprdId;
    @JoinColumn(name = "USRS_ID", referencedColumnName = "USRS_ID")
    @ManyToOne
    private Usuarios usrsId;
    @JoinColumn(name = "ORSV_ID", referencedColumnName = "ORSV_ID")
    @ManyToOne
    private OrdemServico orsvId;
    @OneToMany(mappedBy = "reqRqscId")
    private List<Requisicoes> requisicoesList;
    @JoinColumn(name = "REQ_RQSC_ID", referencedColumnName = "RQSC_ID")
    @ManyToOne
    private Requisicoes reqRqscId;
    @JoinColumn(name = "PDDS_ID", referencedColumnName = "PDDS_ID")
    @ManyToOne
    private Pedidos pddsId;
    @JoinColumn(name = "VDDR_ID", referencedColumnName = "VDDR_ID")
    @ManyToOne
    private Vendedores vddrId;
    @JoinColumn(name = "PESS_ID", referencedColumnName = "PESS_ID")
    @ManyToOne
    private Pessoas pessId;
    @OneToMany(mappedBy = "rqscId")
    private List<Entregas> entregasList;
    @OneToMany(mappedBy = "rqscId")
    private List<ObjetosOpeComercial> objetosOpeComercialList;

    public Requisicoes() {
    }

    public Requisicoes(String rqscId) {
        this.rqscId = rqscId;
    }

    public Requisicoes(String rqscId, String rqscNumero, Date rqscData, int rqscImpressoes, String rqscStatus) {
        this.rqscId = rqscId;
        this.rqscNumero = rqscNumero;
        this.rqscData = rqscData;
        this.rqscImpressoes = rqscImpressoes;
        this.rqscStatus = rqscStatus;
    }

    public String getRqscId() {
        return rqscId;
    }

    public void setRqscId(String rqscId) {
        this.rqscId = rqscId;
    }

    public String getRqscNumero() {
        return rqscNumero;
    }

    public void setRqscNumero(String rqscNumero) {
        this.rqscNumero = rqscNumero;
    }

    public Date getRqscData() {
        return rqscData;
    }

    public void setRqscData(Date rqscData) {
        this.rqscData = rqscData;
    }

    public int getRqscImpressoes() {
        return rqscImpressoes;
    }

    public void setRqscImpressoes(int rqscImpressoes) {
        this.rqscImpressoes = rqscImpressoes;
    }

    public String getRqscStatus() {
        return rqscStatus;
    }

    public void setRqscStatus(String rqscStatus) {
        this.rqscStatus = rqscStatus;
    }

    public String getRqscObservacao() {
        return rqscObservacao;
    }

    public void setRqscObservacao(String rqscObservacao) {
        this.rqscObservacao = rqscObservacao;
    }

    public String getRqscConsumo() {
        return rqscConsumo;
    }

    public void setRqscConsumo(String rqscConsumo) {
        this.rqscConsumo = rqscConsumo;
    }

    public Date getRqscLastupdate() {
        return rqscLastupdate;
    }

    public void setRqscLastupdate(Date rqscLastupdate) {
        this.rqscLastupdate = rqscLastupdate;
    }

    public String getRqscMotivoCanc() {
        return rqscMotivoCanc;
    }

    public void setRqscMotivoCanc(String rqscMotivoCanc) {
        this.rqscMotivoCanc = rqscMotivoCanc;
    }

    public String getRqscUsrsIdCanc() {
        return rqscUsrsIdCanc;
    }

    public void setRqscUsrsIdCanc(String rqscUsrsIdCanc) {
        this.rqscUsrsIdCanc = rqscUsrsIdCanc;
    }

    public Date getRqscDataCanc() {
        return rqscDataCanc;
    }

    public void setRqscDataCanc(Date rqscDataCanc) {
        this.rqscDataCanc = rqscDataCanc;
    }

    public String getEndEnarId() {
        return endEnarId;
    }

    public void setEndEnarId(String endEnarId) {
        this.endEnarId = endEnarId;
    }

    public String getCntsNome() {
        return cntsNome;
    }

    public void setCntsNome(String cntsNome) {
        this.cntsNome = cntsNome;
    }

    public String getPlctId() {
        return plctId;
    }

    public void setPlctId(String plctId) {
        this.plctId = plctId;
    }

    public String getFsprId() {
        return fsprId;
    }

    public void setFsprId(String fsprId) {
        this.fsprId = fsprId;
    }

    @XmlTransient
    public List<ItensRequisicoes> getItensRequisicoesList() {
        return itensRequisicoesList;
    }

    public void setItensRequisicoesList(List<ItensRequisicoes> itensRequisicoesList) {
        this.itensRequisicoesList = itensRequisicoesList;
    }

    public Enderecos getEndeId() {
        return endeId;
    }

    public void setEndeId(Enderecos endeId) {
        this.endeId = endeId;
    }

    public AtendimentosComerciais getAtcmId() {
        return atcmId;
    }

    public void setAtcmId(AtendimentosComerciais atcmId) {
        this.atcmId = atcmId;
    }

    public Usuarios getUsuUsrsId() {
        return usuUsrsId;
    }

    public void setUsuUsrsId(Usuarios usuUsrsId) {
        this.usuUsrsId = usuUsrsId;
    }

    public EnderecosArmazenamento getEnarId() {
        return enarId;
    }

    public void setEnarId(EnderecosArmazenamento enarId) {
        this.enarId = enarId;
    }

    public Fornecedores getFrndId() {
        return frndId;
    }

    public void setFrndId(Fornecedores frndId) {
        this.frndId = frndId;
    }

    public LocacoesEquipamentos getLceqId() {
        return lceqId;
    }

    public void setLceqId(LocacoesEquipamentos lceqId) {
        this.lceqId = lceqId;
    }

    public TabelasPrecos getTbpcId() {
        return tbpcId;
    }

    public void setTbpcId(TabelasPrecos tbpcId) {
        this.tbpcId = tbpcId;
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

    public OrdemProducao getOprdId() {
        return oprdId;
    }

    public void setOprdId(OrdemProducao oprdId) {
        this.oprdId = oprdId;
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
    public List<Requisicoes> getRequisicoesList() {
        return requisicoesList;
    }

    public void setRequisicoesList(List<Requisicoes> requisicoesList) {
        this.requisicoesList = requisicoesList;
    }

    public Requisicoes getReqRqscId() {
        return reqRqscId;
    }

    public void setReqRqscId(Requisicoes reqRqscId) {
        this.reqRqscId = reqRqscId;
    }

    public Pedidos getPddsId() {
        return pddsId;
    }

    public void setPddsId(Pedidos pddsId) {
        this.pddsId = pddsId;
    }

    public Vendedores getVddrId() {
        return vddrId;
    }

    public void setVddrId(Vendedores vddrId) {
        this.vddrId = vddrId;
    }

    public Pessoas getPessId() {
        return pessId;
    }

    public void setPessId(Pessoas pessId) {
        this.pessId = pessId;
    }

    @XmlTransient
    public List<Entregas> getEntregasList() {
        return entregasList;
    }

    public void setEntregasList(List<Entregas> entregasList) {
        this.entregasList = entregasList;
    }

    @XmlTransient
    public List<ObjetosOpeComercial> getObjetosOpeComercialList() {
        return objetosOpeComercialList;
    }

    public void setObjetosOpeComercialList(List<ObjetosOpeComercial> objetosOpeComercialList) {
        this.objetosOpeComercialList = objetosOpeComercialList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rqscId != null ? rqscId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Requisicoes)) {
            return false;
        }
        Requisicoes other = (Requisicoes) object;
        if ((this.rqscId == null && other.rqscId != null) || (this.rqscId != null && !this.rqscId.equals(other.rqscId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.Requisicoes[ rqscId=" + rqscId + " ]";
    }
    
}
