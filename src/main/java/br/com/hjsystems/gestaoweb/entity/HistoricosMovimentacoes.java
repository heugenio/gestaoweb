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
@Table(name = "HISTORICOS_MOVIMENTACOES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HistoricosMovimentacoes.findAll", query = "SELECT h FROM HistoricosMovimentacoes h"),
    @NamedQuery(name = "HistoricosMovimentacoes.findByHmovId", query = "SELECT h FROM HistoricosMovimentacoes h WHERE h.hmovId = :hmovId"),
    @NamedQuery(name = "HistoricosMovimentacoes.findByHmovNome", query = "SELECT h FROM HistoricosMovimentacoes h WHERE h.hmovNome = :hmovNome"),
    @NamedQuery(name = "HistoricosMovimentacoes.findByHmovTipo", query = "SELECT h FROM HistoricosMovimentacoes h WHERE h.hmovTipo = :hmovTipo"),
    @NamedQuery(name = "HistoricosMovimentacoes.findByHmovLastupdate", query = "SELECT h FROM HistoricosMovimentacoes h WHERE h.hmovLastupdate = :hmovLastupdate")})
public class HistoricosMovimentacoes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "HMOV_ID")
    private String hmovId;
    @Basic(optional = false)
    @Column(name = "HMOV_NOME")
    private String hmovNome;
    @Basic(optional = false)
    @Column(name = "HMOV_TIPO")
    private String hmovTipo;
    @Column(name = "HMOV_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date hmovLastupdate;
    @OneToMany(mappedBy = "hmovId")
    private List<SaldosEstoquesDiario> saldosEstoquesDiarioList;
    @OneToMany(mappedBy = "hmovId")
    private List<OperacoesComerciais> operacoesComerciaisList;
    @OneToMany(mappedBy = "hmovId")
    private List<SaldosEstoques> saldosEstoquesList;
    @OneToMany(mappedBy = "hisHmovId")
    private List<HistoricosMovimentacoes> historicosMovimentacoesList;
    @JoinColumn(name = "HIS_HMOV_ID", referencedColumnName = "HMOV_ID")
    @ManyToOne
    private HistoricosMovimentacoes hisHmovId;
    @OneToMany(mappedBy = "hmovId")
    private List<DocumentosFiscais> documentosFiscaisList;

    public HistoricosMovimentacoes() {
    }

    public HistoricosMovimentacoes(String hmovId) {
        this.hmovId = hmovId;
    }

    public HistoricosMovimentacoes(String hmovId, String hmovNome, String hmovTipo) {
        this.hmovId = hmovId;
        this.hmovNome = hmovNome;
        this.hmovTipo = hmovTipo;
    }

    public String getHmovId() {
        return hmovId;
    }

    public void setHmovId(String hmovId) {
        this.hmovId = hmovId;
    }

    public String getHmovNome() {
        return hmovNome;
    }

    public void setHmovNome(String hmovNome) {
        this.hmovNome = hmovNome;
    }

    public String getHmovTipo() {
        return hmovTipo;
    }

    public void setHmovTipo(String hmovTipo) {
        this.hmovTipo = hmovTipo;
    }

    public Date getHmovLastupdate() {
        return hmovLastupdate;
    }

    public void setHmovLastupdate(Date hmovLastupdate) {
        this.hmovLastupdate = hmovLastupdate;
    }

    @XmlTransient
    public List<SaldosEstoquesDiario> getSaldosEstoquesDiarioList() {
        return saldosEstoquesDiarioList;
    }

    public void setSaldosEstoquesDiarioList(List<SaldosEstoquesDiario> saldosEstoquesDiarioList) {
        this.saldosEstoquesDiarioList = saldosEstoquesDiarioList;
    }

    @XmlTransient
    public List<OperacoesComerciais> getOperacoesComerciaisList() {
        return operacoesComerciaisList;
    }

    public void setOperacoesComerciaisList(List<OperacoesComerciais> operacoesComerciaisList) {
        this.operacoesComerciaisList = operacoesComerciaisList;
    }

    @XmlTransient
    public List<SaldosEstoques> getSaldosEstoquesList() {
        return saldosEstoquesList;
    }

    public void setSaldosEstoquesList(List<SaldosEstoques> saldosEstoquesList) {
        this.saldosEstoquesList = saldosEstoquesList;
    }

    @XmlTransient
    public List<HistoricosMovimentacoes> getHistoricosMovimentacoesList() {
        return historicosMovimentacoesList;
    }

    public void setHistoricosMovimentacoesList(List<HistoricosMovimentacoes> historicosMovimentacoesList) {
        this.historicosMovimentacoesList = historicosMovimentacoesList;
    }

    public HistoricosMovimentacoes getHisHmovId() {
        return hisHmovId;
    }

    public void setHisHmovId(HistoricosMovimentacoes hisHmovId) {
        this.hisHmovId = hisHmovId;
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
        hash += (hmovId != null ? hmovId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HistoricosMovimentacoes)) {
            return false;
        }
        HistoricosMovimentacoes other = (HistoricosMovimentacoes) object;
        if ((this.hmovId == null && other.hmovId != null) || (this.hmovId != null && !this.hmovId.equals(other.hmovId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.HistoricosMovimentacoes[ hmovId=" + hmovId + " ]";
    }
    
}
