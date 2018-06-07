/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hjsystems.gestaoweb.entity;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "SOLICITACOES_COMPRAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SolicitacoesCompras.findAll", query = "SELECT s FROM SolicitacoesCompras s"),
    @NamedQuery(name = "SolicitacoesCompras.findBySlcpId", query = "SELECT s FROM SolicitacoesCompras s WHERE s.slcpId = :slcpId"),
    @NamedQuery(name = "SolicitacoesCompras.findBySlcpQtde", query = "SELECT s FROM SolicitacoesCompras s WHERE s.slcpQtde = :slcpQtde"),
    @NamedQuery(name = "SolicitacoesCompras.findBySlcpUnidSigla", query = "SELECT s FROM SolicitacoesCompras s WHERE s.slcpUnidSigla = :slcpUnidSigla"),
    @NamedQuery(name = "SolicitacoesCompras.findBySlcpSbupMultiplicador", query = "SELECT s FROM SolicitacoesCompras s WHERE s.slcpSbupMultiplicador = :slcpSbupMultiplicador"),
    @NamedQuery(name = "SolicitacoesCompras.findBySlcpObservacoes", query = "SELECT s FROM SolicitacoesCompras s WHERE s.slcpObservacoes = :slcpObservacoes"),
    @NamedQuery(name = "SolicitacoesCompras.findBySlcpStatus", query = "SELECT s FROM SolicitacoesCompras s WHERE s.slcpStatus = :slcpStatus"),
    @NamedQuery(name = "SolicitacoesCompras.findBySlcpLastupdate", query = "SELECT s FROM SolicitacoesCompras s WHERE s.slcpLastupdate = :slcpLastupdate"),
    @NamedQuery(name = "SolicitacoesCompras.findBySlcpData", query = "SELECT s FROM SolicitacoesCompras s WHERE s.slcpData = :slcpData"),
    @NamedQuery(name = "SolicitacoesCompras.findBySlcpDataLiberacao", query = "SELECT s FROM SolicitacoesCompras s WHERE s.slcpDataLiberacao = :slcpDataLiberacao"),
    @NamedQuery(name = "SolicitacoesCompras.findBySlcpUsrsNomeLogin", query = "SELECT s FROM SolicitacoesCompras s WHERE s.slcpUsrsNomeLogin = :slcpUsrsNomeLogin")})
public class SolicitacoesCompras implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SLCP_ID")
    private String slcpId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "SLCP_QTDE")
    private BigDecimal slcpQtde;
    @Column(name = "SLCP_UNID_SIGLA")
    private String slcpUnidSigla;
    @Basic(optional = false)
    @Column(name = "SLCP_SBUP_MULTIPLICADOR")
    private BigDecimal slcpSbupMultiplicador;
    @Column(name = "SLCP_OBSERVACOES")
    private String slcpObservacoes;
    @Basic(optional = false)
    @Column(name = "SLCP_STATUS")
    private String slcpStatus;
    @Column(name = "SLCP_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date slcpLastupdate;
    @Column(name = "SLCP_DATA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date slcpData;
    @Column(name = "SLCP_DATA_LIBERACAO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date slcpDataLiberacao;
    @Column(name = "SLCP_USRS_NOME_LOGIN")
    private String slcpUsrsNomeLogin;
    @JoinColumn(name = "COTC_ID", referencedColumnName = "COTC_ID")
    @ManyToOne
    private Cotacoes cotcId;
    @JoinColumn(name = "CTIT_ID", referencedColumnName = "CTIT_ID")
    @ManyToOne
    private CotacoesItens ctitId;
    @JoinColumn(name = "ITPD_ID", referencedColumnName = "ITPD_ID")
    @ManyToOne
    private ItensPedidos itpdId;
    @JoinColumn(name = "ITRQ_ID", referencedColumnName = "ITRQ_ID")
    @ManyToOne
    private ItensRequisicoes itrqId;
    @JoinColumn(name = "PROD_ID", referencedColumnName = "PROD_ID")
    @ManyToOne
    private Produtos prodId;
    @JoinColumn(name = "TEST_ID", referencedColumnName = "TEST_ID")
    @ManyToOne
    private TiposEstoques testId;
    @JoinColumn(name = "USRS_ID", referencedColumnName = "USRS_ID")
    @ManyToOne
    private Usuarios usrsId;

    public SolicitacoesCompras() {
    }

    public SolicitacoesCompras(String slcpId) {
        this.slcpId = slcpId;
    }

    public SolicitacoesCompras(String slcpId, BigDecimal slcpQtde, BigDecimal slcpSbupMultiplicador, String slcpStatus) {
        this.slcpId = slcpId;
        this.slcpQtde = slcpQtde;
        this.slcpSbupMultiplicador = slcpSbupMultiplicador;
        this.slcpStatus = slcpStatus;
    }

    public String getSlcpId() {
        return slcpId;
    }

    public void setSlcpId(String slcpId) {
        this.slcpId = slcpId;
    }

    public BigDecimal getSlcpQtde() {
        return slcpQtde;
    }

    public void setSlcpQtde(BigDecimal slcpQtde) {
        this.slcpQtde = slcpQtde;
    }

    public String getSlcpUnidSigla() {
        return slcpUnidSigla;
    }

    public void setSlcpUnidSigla(String slcpUnidSigla) {
        this.slcpUnidSigla = slcpUnidSigla;
    }

    public BigDecimal getSlcpSbupMultiplicador() {
        return slcpSbupMultiplicador;
    }

    public void setSlcpSbupMultiplicador(BigDecimal slcpSbupMultiplicador) {
        this.slcpSbupMultiplicador = slcpSbupMultiplicador;
    }

    public String getSlcpObservacoes() {
        return slcpObservacoes;
    }

    public void setSlcpObservacoes(String slcpObservacoes) {
        this.slcpObservacoes = slcpObservacoes;
    }

    public String getSlcpStatus() {
        return slcpStatus;
    }

    public void setSlcpStatus(String slcpStatus) {
        this.slcpStatus = slcpStatus;
    }

    public Date getSlcpLastupdate() {
        return slcpLastupdate;
    }

    public void setSlcpLastupdate(Date slcpLastupdate) {
        this.slcpLastupdate = slcpLastupdate;
    }

    public Date getSlcpData() {
        return slcpData;
    }

    public void setSlcpData(Date slcpData) {
        this.slcpData = slcpData;
    }

    public Date getSlcpDataLiberacao() {
        return slcpDataLiberacao;
    }

    public void setSlcpDataLiberacao(Date slcpDataLiberacao) {
        this.slcpDataLiberacao = slcpDataLiberacao;
    }

    public String getSlcpUsrsNomeLogin() {
        return slcpUsrsNomeLogin;
    }

    public void setSlcpUsrsNomeLogin(String slcpUsrsNomeLogin) {
        this.slcpUsrsNomeLogin = slcpUsrsNomeLogin;
    }

    public Cotacoes getCotcId() {
        return cotcId;
    }

    public void setCotcId(Cotacoes cotcId) {
        this.cotcId = cotcId;
    }

    public CotacoesItens getCtitId() {
        return ctitId;
    }

    public void setCtitId(CotacoesItens ctitId) {
        this.ctitId = ctitId;
    }

    public ItensPedidos getItpdId() {
        return itpdId;
    }

    public void setItpdId(ItensPedidos itpdId) {
        this.itpdId = itpdId;
    }

    public ItensRequisicoes getItrqId() {
        return itrqId;
    }

    public void setItrqId(ItensRequisicoes itrqId) {
        this.itrqId = itrqId;
    }

    public Produtos getProdId() {
        return prodId;
    }

    public void setProdId(Produtos prodId) {
        this.prodId = prodId;
    }

    public TiposEstoques getTestId() {
        return testId;
    }

    public void setTestId(TiposEstoques testId) {
        this.testId = testId;
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
        hash += (slcpId != null ? slcpId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SolicitacoesCompras)) {
            return false;
        }
        SolicitacoesCompras other = (SolicitacoesCompras) object;
        if ((this.slcpId == null && other.slcpId != null) || (this.slcpId != null && !this.slcpId.equals(other.slcpId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.SolicitacoesCompras[ slcpId=" + slcpId + " ]";
    }
    
}
