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
@Table(name = "TIPOS_PAG_PERMITIDOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TiposPagPermitidos.findAll", query = "SELECT t FROM TiposPagPermitidos t"),
    @NamedQuery(name = "TiposPagPermitidos.findByTpprId", query = "SELECT t FROM TiposPagPermitidos t WHERE t.tpprId = :tpprId"),
    @NamedQuery(name = "TiposPagPermitidos.findByTpprTipoPagamento", query = "SELECT t FROM TiposPagPermitidos t WHERE t.tpprTipoPagamento = :tpprTipoPagamento"),
    @NamedQuery(name = "TiposPagPermitidos.findByTpprTipoPagImpressao", query = "SELECT t FROM TiposPagPermitidos t WHERE t.tpprTipoPagImpressao = :tpprTipoPagImpressao"),
    @NamedQuery(name = "TiposPagPermitidos.findByTpprLastupdate", query = "SELECT t FROM TiposPagPermitidos t WHERE t.tpprLastupdate = :tpprLastupdate")})
public class TiposPagPermitidos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TPPR_ID")
    private String tpprId;
    @Basic(optional = false)
    @Column(name = "TPPR_TIPO_PAGAMENTO")
    private String tpprTipoPagamento;
    @Column(name = "TPPR_TIPO_PAG_IMPRESSAO")
    private String tpprTipoPagImpressao;
    @Column(name = "TPPR_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tpprLastupdate;
    @JoinColumn(name = "ITFV_ID", referencedColumnName = "ITFV_ID")
    @ManyToOne
    private ItensFormaVencimento itfvId;

    public TiposPagPermitidos() {
    }

    public TiposPagPermitidos(String tpprId) {
        this.tpprId = tpprId;
    }

    public TiposPagPermitidos(String tpprId, String tpprTipoPagamento) {
        this.tpprId = tpprId;
        this.tpprTipoPagamento = tpprTipoPagamento;
    }

    public String getTpprId() {
        return tpprId;
    }

    public void setTpprId(String tpprId) {
        this.tpprId = tpprId;
    }

    public String getTpprTipoPagamento() {
        return tpprTipoPagamento;
    }

    public void setTpprTipoPagamento(String tpprTipoPagamento) {
        this.tpprTipoPagamento = tpprTipoPagamento;
    }

    public String getTpprTipoPagImpressao() {
        return tpprTipoPagImpressao;
    }

    public void setTpprTipoPagImpressao(String tpprTipoPagImpressao) {
        this.tpprTipoPagImpressao = tpprTipoPagImpressao;
    }

    public Date getTpprLastupdate() {
        return tpprLastupdate;
    }

    public void setTpprLastupdate(Date tpprLastupdate) {
        this.tpprLastupdate = tpprLastupdate;
    }

    public ItensFormaVencimento getItfvId() {
        return itfvId;
    }

    public void setItfvId(ItensFormaVencimento itfvId) {
        this.itfvId = itfvId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tpprId != null ? tpprId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TiposPagPermitidos)) {
            return false;
        }
        TiposPagPermitidos other = (TiposPagPermitidos) object;
        if ((this.tpprId == null && other.tpprId != null) || (this.tpprId != null && !this.tpprId.equals(other.tpprId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.TiposPagPermitidos[ tpprId=" + tpprId + " ]";
    }
    
}
