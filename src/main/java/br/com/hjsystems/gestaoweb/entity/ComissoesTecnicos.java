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
@Table(name = "COMISSOES_TECNICOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ComissoesTecnicos.findAll", query = "SELECT c FROM ComissoesTecnicos c"),
    @NamedQuery(name = "ComissoesTecnicos.findByCmtcId", query = "SELECT c FROM ComissoesTecnicos c WHERE c.cmtcId = :cmtcId"),
    @NamedQuery(name = "ComissoesTecnicos.findByCmtcUnemId", query = "SELECT c FROM ComissoesTecnicos c WHERE c.cmtcUnemId = :cmtcUnemId"),
    @NamedQuery(name = "ComissoesTecnicos.findByCmtcData", query = "SELECT c FROM ComissoesTecnicos c WHERE c.cmtcData = :cmtcData"),
    @NamedQuery(name = "ComissoesTecnicos.findByCmtcCustoProdutos", query = "SELECT c FROM ComissoesTecnicos c WHERE c.cmtcCustoProdutos = :cmtcCustoProdutos"),
    @NamedQuery(name = "ComissoesTecnicos.findByCmtcCustoExtra", query = "SELECT c FROM ComissoesTecnicos c WHERE c.cmtcCustoExtra = :cmtcCustoExtra"),
    @NamedQuery(name = "ComissoesTecnicos.findByCmtcRentabilidade", query = "SELECT c FROM ComissoesTecnicos c WHERE c.cmtcRentabilidade = :cmtcRentabilidade"),
    @NamedQuery(name = "ComissoesTecnicos.findByCmtcVlrServico", query = "SELECT c FROM ComissoesTecnicos c WHERE c.cmtcVlrServico = :cmtcVlrServico"),
    @NamedQuery(name = "ComissoesTecnicos.findByCmtcVlrComissao", query = "SELECT c FROM ComissoesTecnicos c WHERE c.cmtcVlrComissao = :cmtcVlrComissao"),
    @NamedQuery(name = "ComissoesTecnicos.findByCmtcLastupdate", query = "SELECT c FROM ComissoesTecnicos c WHERE c.cmtcLastupdate = :cmtcLastupdate")})
public class ComissoesTecnicos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CMTC_ID")
    private String cmtcId;
    @Column(name = "CMTC_UNEM_ID")
    private String cmtcUnemId;
    @Column(name = "CMTC_DATA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cmtcData;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "CMTC_CUSTO_PRODUTOS")
    private BigDecimal cmtcCustoProdutos;
    @Basic(optional = false)
    @Column(name = "CMTC_CUSTO_EXTRA")
    private BigDecimal cmtcCustoExtra;
    @Basic(optional = false)
    @Column(name = "CMTC_RENTABILIDADE")
    private BigDecimal cmtcRentabilidade;
    @Basic(optional = false)
    @Column(name = "CMTC_VLR_SERVICO")
    private BigDecimal cmtcVlrServico;
    @Basic(optional = false)
    @Column(name = "CMTC_VLR_COMISSAO")
    private BigDecimal cmtcVlrComissao;
    @Column(name = "CMTC_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cmtcLastupdate;
    @OneToMany(mappedBy = "cmtcId")
    private List<TecnicoComissoesTecnicos> tecnicoComissoesTecnicosList;
    @JoinColumn(name = "DCFS_ID", referencedColumnName = "DCFS_ID")
    @ManyToOne
    private DocumentosFiscais dcfsId;
    @OneToMany(mappedBy = "cmtcId")
    private List<ItensComissoesTecnicos> itensComissoesTecnicosList;

    public ComissoesTecnicos() {
    }

    public ComissoesTecnicos(String cmtcId) {
        this.cmtcId = cmtcId;
    }

    public ComissoesTecnicos(String cmtcId, BigDecimal cmtcCustoProdutos, BigDecimal cmtcCustoExtra, BigDecimal cmtcRentabilidade, BigDecimal cmtcVlrServico, BigDecimal cmtcVlrComissao) {
        this.cmtcId = cmtcId;
        this.cmtcCustoProdutos = cmtcCustoProdutos;
        this.cmtcCustoExtra = cmtcCustoExtra;
        this.cmtcRentabilidade = cmtcRentabilidade;
        this.cmtcVlrServico = cmtcVlrServico;
        this.cmtcVlrComissao = cmtcVlrComissao;
    }

    public String getCmtcId() {
        return cmtcId;
    }

    public void setCmtcId(String cmtcId) {
        this.cmtcId = cmtcId;
    }

    public String getCmtcUnemId() {
        return cmtcUnemId;
    }

    public void setCmtcUnemId(String cmtcUnemId) {
        this.cmtcUnemId = cmtcUnemId;
    }

    public Date getCmtcData() {
        return cmtcData;
    }

    public void setCmtcData(Date cmtcData) {
        this.cmtcData = cmtcData;
    }

    public BigDecimal getCmtcCustoProdutos() {
        return cmtcCustoProdutos;
    }

    public void setCmtcCustoProdutos(BigDecimal cmtcCustoProdutos) {
        this.cmtcCustoProdutos = cmtcCustoProdutos;
    }

    public BigDecimal getCmtcCustoExtra() {
        return cmtcCustoExtra;
    }

    public void setCmtcCustoExtra(BigDecimal cmtcCustoExtra) {
        this.cmtcCustoExtra = cmtcCustoExtra;
    }

    public BigDecimal getCmtcRentabilidade() {
        return cmtcRentabilidade;
    }

    public void setCmtcRentabilidade(BigDecimal cmtcRentabilidade) {
        this.cmtcRentabilidade = cmtcRentabilidade;
    }

    public BigDecimal getCmtcVlrServico() {
        return cmtcVlrServico;
    }

    public void setCmtcVlrServico(BigDecimal cmtcVlrServico) {
        this.cmtcVlrServico = cmtcVlrServico;
    }

    public BigDecimal getCmtcVlrComissao() {
        return cmtcVlrComissao;
    }

    public void setCmtcVlrComissao(BigDecimal cmtcVlrComissao) {
        this.cmtcVlrComissao = cmtcVlrComissao;
    }

    public Date getCmtcLastupdate() {
        return cmtcLastupdate;
    }

    public void setCmtcLastupdate(Date cmtcLastupdate) {
        this.cmtcLastupdate = cmtcLastupdate;
    }

    @XmlTransient
    public List<TecnicoComissoesTecnicos> getTecnicoComissoesTecnicosList() {
        return tecnicoComissoesTecnicosList;
    }

    public void setTecnicoComissoesTecnicosList(List<TecnicoComissoesTecnicos> tecnicoComissoesTecnicosList) {
        this.tecnicoComissoesTecnicosList = tecnicoComissoesTecnicosList;
    }

    public DocumentosFiscais getDcfsId() {
        return dcfsId;
    }

    public void setDcfsId(DocumentosFiscais dcfsId) {
        this.dcfsId = dcfsId;
    }

    @XmlTransient
    public List<ItensComissoesTecnicos> getItensComissoesTecnicosList() {
        return itensComissoesTecnicosList;
    }

    public void setItensComissoesTecnicosList(List<ItensComissoesTecnicos> itensComissoesTecnicosList) {
        this.itensComissoesTecnicosList = itensComissoesTecnicosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cmtcId != null ? cmtcId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ComissoesTecnicos)) {
            return false;
        }
        ComissoesTecnicos other = (ComissoesTecnicos) object;
        if ((this.cmtcId == null && other.cmtcId != null) || (this.cmtcId != null && !this.cmtcId.equals(other.cmtcId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.ComissoesTecnicos[ cmtcId=" + cmtcId + " ]";
    }
    
}
