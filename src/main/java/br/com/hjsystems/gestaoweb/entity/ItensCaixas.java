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
@Table(name = "ITENS_CAIXAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ItensCaixas.findAll", query = "SELECT i FROM ItensCaixas i"),
    @NamedQuery(name = "ItensCaixas.findByItcxId", query = "SELECT i FROM ItensCaixas i WHERE i.itcxId = :itcxId"),
    @NamedQuery(name = "ItensCaixas.findByItcxNrDocumento", query = "SELECT i FROM ItensCaixas i WHERE i.itcxNrDocumento = :itcxNrDocumento"),
    @NamedQuery(name = "ItensCaixas.findByItcxTpLancamento", query = "SELECT i FROM ItensCaixas i WHERE i.itcxTpLancamento = :itcxTpLancamento"),
    @NamedQuery(name = "ItensCaixas.findByItcxData", query = "SELECT i FROM ItensCaixas i WHERE i.itcxData = :itcxData"),
    @NamedQuery(name = "ItensCaixas.findByItcxVlLancamento", query = "SELECT i FROM ItensCaixas i WHERE i.itcxVlLancamento = :itcxVlLancamento"),
    @NamedQuery(name = "ItensCaixas.findByItcxHistComplementar", query = "SELECT i FROM ItensCaixas i WHERE i.itcxHistComplementar = :itcxHistComplementar"),
    @NamedQuery(name = "ItensCaixas.findByItcxEspecie", query = "SELECT i FROM ItensCaixas i WHERE i.itcxEspecie = :itcxEspecie"),
    @NamedQuery(name = "ItensCaixas.findByItcxStatus", query = "SELECT i FROM ItensCaixas i WHERE i.itcxStatus = :itcxStatus"),
    @NamedQuery(name = "ItensCaixas.findByItcxLote", query = "SELECT i FROM ItensCaixas i WHERE i.itcxLote = :itcxLote"),
    @NamedQuery(name = "ItensCaixas.findByItcxTransferencia", query = "SELECT i FROM ItensCaixas i WHERE i.itcxTransferencia = :itcxTransferencia"),
    @NamedQuery(name = "ItensCaixas.findByItCxLASTUPDATE", query = "SELECT i FROM ItensCaixas i WHERE i.itCxLASTUPDATE = :itCxLASTUPDATE"),
    @NamedQuery(name = "ItensCaixas.findByItcxChqsTerceiro", query = "SELECT i FROM ItensCaixas i WHERE i.itcxChqsTerceiro = :itcxChqsTerceiro"),
    @NamedQuery(name = "ItensCaixas.findByItcxDataConciliacao", query = "SELECT i FROM ItensCaixas i WHERE i.itcxDataConciliacao = :itcxDataConciliacao"),
    @NamedQuery(name = "ItensCaixas.findByItcxDataLancamento", query = "SELECT i FROM ItensCaixas i WHERE i.itcxDataLancamento = :itcxDataLancamento")})
public class ItensCaixas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ITCX_ID")
    private String itcxId;
    @Column(name = "ITCX_NR_DOCUMENTO")
    private String itcxNrDocumento;
    @Column(name = "ITCX_TP_LANCAMENTO")
    private String itcxTpLancamento;
    @Column(name = "ITCX_DATA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date itcxData;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ITCX_VL_LANCAMENTO")
    private BigDecimal itcxVlLancamento;
    @Column(name = "ITCX_HIST_COMPLEMENTAR")
    private String itcxHistComplementar;
    @Basic(optional = false)
    @Column(name = "ITCX_ESPECIE")
    private String itcxEspecie;
    @Basic(optional = false)
    @Column(name = "ITCX_STATUS")
    private String itcxStatus;
    @Column(name = "ITCX_LOTE")
    private String itcxLote;
    @Column(name = "ITCX_TRANSFERENCIA")
    private String itcxTransferencia;
    @Column(name = "ItCx_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date itCxLASTUPDATE;
    @Column(name = "ITCX_CHQS_TERCEIRO")
    private String itcxChqsTerceiro;
    @Column(name = "ITCX_DATA_CONCILIACAO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date itcxDataConciliacao;
    @Column(name = "ITCX_DATA_LANCAMENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date itcxDataLancamento;
    @OneToMany(mappedBy = "itcxId")
    private List<ItensCaixasFornecedores> itensCaixasFornecedoresList;
    @OneToMany(mappedBy = "itcxId")
    private List<ChequesTrocas> chequesTrocasList;
    @OneToMany(mappedBy = "itcxId")
    private List<PagamentosContas> pagamentosContasList;
    @OneToMany(mappedBy = "itcxId")
    private List<Cheques> chequesList;
    @OneToMany(mappedBy = "itcxId")
    private List<Titulos> titulosList;
    @JoinColumn(name = "HPAD_ID", referencedColumnName = "HPAD_ID")
    @ManyToOne
    private HistoricosPadrao hpadId;
    @OneToMany(mappedBy = "iteItcxId")
    private List<ItensCaixas> itensCaixasList;
    @JoinColumn(name = "ITE_ITCX_ID", referencedColumnName = "ITCX_ID")
    @ManyToOne
    private ItensCaixas iteItcxId;
    @JoinColumn(name = "MVCX_ID", referencedColumnName = "MVCX_ID")
    @ManyToOne
    private MovimentosCaixas mvcxId;
    @JoinColumn(name = "MOV_MVCX_ID", referencedColumnName = "MVCX_ID")
    @ManyToOne
    private MovimentosCaixas movMvcxId;
    @JoinColumn(name = "PCLS_ID", referencedColumnName = "PCLS_ID")
    @ManyToOne
    private Parcelas pclsId;
    @JoinColumn(name = "PDDS_ID", referencedColumnName = "PDDS_ID")
    @ManyToOne
    private Pedidos pddsId;
    @JoinColumn(name = "PESS_ID", referencedColumnName = "PESS_ID")
    @ManyToOne
    private Pessoas pessId;
    @JoinColumn(name = "PLCT_ID", referencedColumnName = "PLCT_ID")
    @ManyToOne
    private PlanoContas plctId;
    @JoinColumn(name = "PLA_PLCT_ID", referencedColumnName = "PLCT_ID")
    @ManyToOne
    private PlanoContas plaPlctId;
    @JoinColumn(name = "USRS_ID", referencedColumnName = "USRS_ID")
    @ManyToOne
    private Usuarios usrsId;
    @OneToMany(mappedBy = "itcxId")
    private List<HistoricosCheques> historicosChequesList;
    @OneToMany(mappedBy = "itcxId")
    private List<MovimentoContabil> movimentoContabilList;

    public ItensCaixas() {
    }

    public ItensCaixas(String itcxId) {
        this.itcxId = itcxId;
    }

    public ItensCaixas(String itcxId, String itcxEspecie, String itcxStatus) {
        this.itcxId = itcxId;
        this.itcxEspecie = itcxEspecie;
        this.itcxStatus = itcxStatus;
    }

    public String getItcxId() {
        return itcxId;
    }

    public void setItcxId(String itcxId) {
        this.itcxId = itcxId;
    }

    public String getItcxNrDocumento() {
        return itcxNrDocumento;
    }

    public void setItcxNrDocumento(String itcxNrDocumento) {
        this.itcxNrDocumento = itcxNrDocumento;
    }

    public String getItcxTpLancamento() {
        return itcxTpLancamento;
    }

    public void setItcxTpLancamento(String itcxTpLancamento) {
        this.itcxTpLancamento = itcxTpLancamento;
    }

    public Date getItcxData() {
        return itcxData;
    }

    public void setItcxData(Date itcxData) {
        this.itcxData = itcxData;
    }

    public BigDecimal getItcxVlLancamento() {
        return itcxVlLancamento;
    }

    public void setItcxVlLancamento(BigDecimal itcxVlLancamento) {
        this.itcxVlLancamento = itcxVlLancamento;
    }

    public String getItcxHistComplementar() {
        return itcxHistComplementar;
    }

    public void setItcxHistComplementar(String itcxHistComplementar) {
        this.itcxHistComplementar = itcxHistComplementar;
    }

    public String getItcxEspecie() {
        return itcxEspecie;
    }

    public void setItcxEspecie(String itcxEspecie) {
        this.itcxEspecie = itcxEspecie;
    }

    public String getItcxStatus() {
        return itcxStatus;
    }

    public void setItcxStatus(String itcxStatus) {
        this.itcxStatus = itcxStatus;
    }

    public String getItcxLote() {
        return itcxLote;
    }

    public void setItcxLote(String itcxLote) {
        this.itcxLote = itcxLote;
    }

    public String getItcxTransferencia() {
        return itcxTransferencia;
    }

    public void setItcxTransferencia(String itcxTransferencia) {
        this.itcxTransferencia = itcxTransferencia;
    }

    public Date getItCxLASTUPDATE() {
        return itCxLASTUPDATE;
    }

    public void setItCxLASTUPDATE(Date itCxLASTUPDATE) {
        this.itCxLASTUPDATE = itCxLASTUPDATE;
    }

    public String getItcxChqsTerceiro() {
        return itcxChqsTerceiro;
    }

    public void setItcxChqsTerceiro(String itcxChqsTerceiro) {
        this.itcxChqsTerceiro = itcxChqsTerceiro;
    }

    public Date getItcxDataConciliacao() {
        return itcxDataConciliacao;
    }

    public void setItcxDataConciliacao(Date itcxDataConciliacao) {
        this.itcxDataConciliacao = itcxDataConciliacao;
    }

    public Date getItcxDataLancamento() {
        return itcxDataLancamento;
    }

    public void setItcxDataLancamento(Date itcxDataLancamento) {
        this.itcxDataLancamento = itcxDataLancamento;
    }

    @XmlTransient
    public List<ItensCaixasFornecedores> getItensCaixasFornecedoresList() {
        return itensCaixasFornecedoresList;
    }

    public void setItensCaixasFornecedoresList(List<ItensCaixasFornecedores> itensCaixasFornecedoresList) {
        this.itensCaixasFornecedoresList = itensCaixasFornecedoresList;
    }

    @XmlTransient
    public List<ChequesTrocas> getChequesTrocasList() {
        return chequesTrocasList;
    }

    public void setChequesTrocasList(List<ChequesTrocas> chequesTrocasList) {
        this.chequesTrocasList = chequesTrocasList;
    }

    @XmlTransient
    public List<PagamentosContas> getPagamentosContasList() {
        return pagamentosContasList;
    }

    public void setPagamentosContasList(List<PagamentosContas> pagamentosContasList) {
        this.pagamentosContasList = pagamentosContasList;
    }

    @XmlTransient
    public List<Cheques> getChequesList() {
        return chequesList;
    }

    public void setChequesList(List<Cheques> chequesList) {
        this.chequesList = chequesList;
    }

    @XmlTransient
    public List<Titulos> getTitulosList() {
        return titulosList;
    }

    public void setTitulosList(List<Titulos> titulosList) {
        this.titulosList = titulosList;
    }

    public HistoricosPadrao getHpadId() {
        return hpadId;
    }

    public void setHpadId(HistoricosPadrao hpadId) {
        this.hpadId = hpadId;
    }

    @XmlTransient
    public List<ItensCaixas> getItensCaixasList() {
        return itensCaixasList;
    }

    public void setItensCaixasList(List<ItensCaixas> itensCaixasList) {
        this.itensCaixasList = itensCaixasList;
    }

    public ItensCaixas getIteItcxId() {
        return iteItcxId;
    }

    public void setIteItcxId(ItensCaixas iteItcxId) {
        this.iteItcxId = iteItcxId;
    }

    public MovimentosCaixas getMvcxId() {
        return mvcxId;
    }

    public void setMvcxId(MovimentosCaixas mvcxId) {
        this.mvcxId = mvcxId;
    }

    public MovimentosCaixas getMovMvcxId() {
        return movMvcxId;
    }

    public void setMovMvcxId(MovimentosCaixas movMvcxId) {
        this.movMvcxId = movMvcxId;
    }

    public Parcelas getPclsId() {
        return pclsId;
    }

    public void setPclsId(Parcelas pclsId) {
        this.pclsId = pclsId;
    }

    public Pedidos getPddsId() {
        return pddsId;
    }

    public void setPddsId(Pedidos pddsId) {
        this.pddsId = pddsId;
    }

    public Pessoas getPessId() {
        return pessId;
    }

    public void setPessId(Pessoas pessId) {
        this.pessId = pessId;
    }

    public PlanoContas getPlctId() {
        return plctId;
    }

    public void setPlctId(PlanoContas plctId) {
        this.plctId = plctId;
    }

    public PlanoContas getPlaPlctId() {
        return plaPlctId;
    }

    public void setPlaPlctId(PlanoContas plaPlctId) {
        this.plaPlctId = plaPlctId;
    }

    public Usuarios getUsrsId() {
        return usrsId;
    }

    public void setUsrsId(Usuarios usrsId) {
        this.usrsId = usrsId;
    }

    @XmlTransient
    public List<HistoricosCheques> getHistoricosChequesList() {
        return historicosChequesList;
    }

    public void setHistoricosChequesList(List<HistoricosCheques> historicosChequesList) {
        this.historicosChequesList = historicosChequesList;
    }

    @XmlTransient
    public List<MovimentoContabil> getMovimentoContabilList() {
        return movimentoContabilList;
    }

    public void setMovimentoContabilList(List<MovimentoContabil> movimentoContabilList) {
        this.movimentoContabilList = movimentoContabilList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itcxId != null ? itcxId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItensCaixas)) {
            return false;
        }
        ItensCaixas other = (ItensCaixas) object;
        if ((this.itcxId == null && other.itcxId != null) || (this.itcxId != null && !this.itcxId.equals(other.itcxId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.ItensCaixas[ itcxId=" + itcxId + " ]";
    }
    
}
