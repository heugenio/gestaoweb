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
@Table(name = "PRODUTOS_TIPOSPAGAMENTOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProdutosTipospagamentos.findAll", query = "SELECT p FROM ProdutosTipospagamentos p"),
    @NamedQuery(name = "ProdutosTipospagamentos.findByPtpgId", query = "SELECT p FROM ProdutosTipospagamentos p WHERE p.ptpgId = :ptpgId"),
    @NamedQuery(name = "ProdutosTipospagamentos.findByPtpgTipoPagamento", query = "SELECT p FROM ProdutosTipospagamentos p WHERE p.ptpgTipoPagamento = :ptpgTipoPagamento"),
    @NamedQuery(name = "ProdutosTipospagamentos.findByPtpgLastupdate", query = "SELECT p FROM ProdutosTipospagamentos p WHERE p.ptpgLastupdate = :ptpgLastupdate")})
public class ProdutosTipospagamentos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PTPG_ID")
    private String ptpgId;
    @Column(name = "PTPG_TIPO_PAGAMENTO")
    private String ptpgTipoPagamento;
    @Column(name = "PTPG_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ptpgLastupdate;
    @JoinColumn(name = "HPAD_ID", referencedColumnName = "HPAD_ID")
    @ManyToOne
    private HistoricosPadrao hpadId;
    @JoinColumn(name = "PLCT_ID", referencedColumnName = "PLCT_ID")
    @ManyToOne
    private PlanoContas plctId;
    @JoinColumn(name = "PROD_ID", referencedColumnName = "PROD_ID")
    @ManyToOne
    private Produtos prodId;

    public ProdutosTipospagamentos() {
    }

    public ProdutosTipospagamentos(String ptpgId) {
        this.ptpgId = ptpgId;
    }

    public String getPtpgId() {
        return ptpgId;
    }

    public void setPtpgId(String ptpgId) {
        this.ptpgId = ptpgId;
    }

    public String getPtpgTipoPagamento() {
        return ptpgTipoPagamento;
    }

    public void setPtpgTipoPagamento(String ptpgTipoPagamento) {
        this.ptpgTipoPagamento = ptpgTipoPagamento;
    }

    public Date getPtpgLastupdate() {
        return ptpgLastupdate;
    }

    public void setPtpgLastupdate(Date ptpgLastupdate) {
        this.ptpgLastupdate = ptpgLastupdate;
    }

    public HistoricosPadrao getHpadId() {
        return hpadId;
    }

    public void setHpadId(HistoricosPadrao hpadId) {
        this.hpadId = hpadId;
    }

    public PlanoContas getPlctId() {
        return plctId;
    }

    public void setPlctId(PlanoContas plctId) {
        this.plctId = plctId;
    }

    public Produtos getProdId() {
        return prodId;
    }

    public void setProdId(Produtos prodId) {
        this.prodId = prodId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ptpgId != null ? ptpgId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProdutosTipospagamentos)) {
            return false;
        }
        ProdutosTipospagamentos other = (ProdutosTipospagamentos) object;
        if ((this.ptpgId == null && other.ptpgId != null) || (this.ptpgId != null && !this.ptpgId.equals(other.ptpgId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.ProdutosTipospagamentos[ ptpgId=" + ptpgId + " ]";
    }
    
}
