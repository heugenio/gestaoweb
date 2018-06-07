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
@Table(name = "ITENS_ENTREGADOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ItensEntregados.findAll", query = "SELECT i FROM ItensEntregados i"),
    @NamedQuery(name = "ItensEntregados.findByItetId", query = "SELECT i FROM ItensEntregados i WHERE i.itetId = :itetId"),
    @NamedQuery(name = "ItensEntregados.findByEntgId", query = "SELECT i FROM ItensEntregados i WHERE i.entgId = :entgId"),
    @NamedQuery(name = "ItensEntregados.findByItetQtde", query = "SELECT i FROM ItensEntregados i WHERE i.itetQtde = :itetQtde"),
    @NamedQuery(name = "ItensEntregados.findByItetQtdeEntrega", query = "SELECT i FROM ItensEntregados i WHERE i.itetQtdeEntrega = :itetQtdeEntrega"),
    @NamedQuery(name = "ItensEntregados.findByItetLastupdate", query = "SELECT i FROM ItensEntregados i WHERE i.itetLastupdate = :itetLastupdate")})
public class ItensEntregados implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ITET_ID")
    private String itetId;
    @Column(name = "ENTG_ID")
    private String entgId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "ITET_QTDE")
    private BigDecimal itetQtde;
    @Basic(optional = false)
    @Column(name = "ITET_QTDE_ENTREGA")
    private BigDecimal itetQtdeEntrega;
    @Column(name = "ITET_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date itetLastupdate;
    @JoinColumn(name = "DCFS_ID", referencedColumnName = "DCFS_ID")
    @ManyToOne
    private DocumentosFiscais dcfsId;
    @JoinColumn(name = "ITFT_ID", referencedColumnName = "ITFT_ID")
    @ManyToOne
    private ItensFaturados itftId;
    @JoinColumn(name = "ITPD_ID", referencedColumnName = "ITPD_ID")
    @ManyToOne
    private ItensPedidos itpdId;
    @JoinColumn(name = "PROD_ID", referencedColumnName = "PROD_ID")
    @ManyToOne
    private Produtos prodId;
    @JoinColumn(name = "PRSR_ID", referencedColumnName = "PRSR_ID")
    @ManyToOne
    private ProdutosSeries prsrId;

    public ItensEntregados() {
    }

    public ItensEntregados(String itetId) {
        this.itetId = itetId;
    }

    public ItensEntregados(String itetId, BigDecimal itetQtde, BigDecimal itetQtdeEntrega) {
        this.itetId = itetId;
        this.itetQtde = itetQtde;
        this.itetQtdeEntrega = itetQtdeEntrega;
    }

    public String getItetId() {
        return itetId;
    }

    public void setItetId(String itetId) {
        this.itetId = itetId;
    }

    public String getEntgId() {
        return entgId;
    }

    public void setEntgId(String entgId) {
        this.entgId = entgId;
    }

    public BigDecimal getItetQtde() {
        return itetQtde;
    }

    public void setItetQtde(BigDecimal itetQtde) {
        this.itetQtde = itetQtde;
    }

    public BigDecimal getItetQtdeEntrega() {
        return itetQtdeEntrega;
    }

    public void setItetQtdeEntrega(BigDecimal itetQtdeEntrega) {
        this.itetQtdeEntrega = itetQtdeEntrega;
    }

    public Date getItetLastupdate() {
        return itetLastupdate;
    }

    public void setItetLastupdate(Date itetLastupdate) {
        this.itetLastupdate = itetLastupdate;
    }

    public DocumentosFiscais getDcfsId() {
        return dcfsId;
    }

    public void setDcfsId(DocumentosFiscais dcfsId) {
        this.dcfsId = dcfsId;
    }

    public ItensFaturados getItftId() {
        return itftId;
    }

    public void setItftId(ItensFaturados itftId) {
        this.itftId = itftId;
    }

    public ItensPedidos getItpdId() {
        return itpdId;
    }

    public void setItpdId(ItensPedidos itpdId) {
        this.itpdId = itpdId;
    }

    public Produtos getProdId() {
        return prodId;
    }

    public void setProdId(Produtos prodId) {
        this.prodId = prodId;
    }

    public ProdutosSeries getPrsrId() {
        return prsrId;
    }

    public void setPrsrId(ProdutosSeries prsrId) {
        this.prsrId = prsrId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itetId != null ? itetId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItensEntregados)) {
            return false;
        }
        ItensEntregados other = (ItensEntregados) object;
        if ((this.itetId == null && other.itetId != null) || (this.itetId != null && !this.itetId.equals(other.itetId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.ItensEntregados[ itetId=" + itetId + " ]";
    }
    
}
