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
@Table(name = "FAIXADESCONTOCOMISSAO_ITENS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FaixadescontocomissaoItens.findAll", query = "SELECT f FROM FaixadescontocomissaoItens f"),
    @NamedQuery(name = "FaixadescontocomissaoItens.findByFdciId", query = "SELECT f FROM FaixadescontocomissaoItens f WHERE f.fdciId = :fdciId"),
    @NamedQuery(name = "FaixadescontocomissaoItens.findByFdciDescontoInicial", query = "SELECT f FROM FaixadescontocomissaoItens f WHERE f.fdciDescontoInicial = :fdciDescontoInicial"),
    @NamedQuery(name = "FaixadescontocomissaoItens.findByFdciDescontoFinal", query = "SELECT f FROM FaixadescontocomissaoItens f WHERE f.fdciDescontoFinal = :fdciDescontoFinal"),
    @NamedQuery(name = "FaixadescontocomissaoItens.findByFdciComissaoAvista", query = "SELECT f FROM FaixadescontocomissaoItens f WHERE f.fdciComissaoAvista = :fdciComissaoAvista"),
    @NamedQuery(name = "FaixadescontocomissaoItens.findByFdciComissaoAprazo", query = "SELECT f FROM FaixadescontocomissaoItens f WHERE f.fdciComissaoAprazo = :fdciComissaoAprazo"),
    @NamedQuery(name = "FaixadescontocomissaoItens.findByFdciLastupdate", query = "SELECT f FROM FaixadescontocomissaoItens f WHERE f.fdciLastupdate = :fdciLastupdate")})
public class FaixadescontocomissaoItens implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "FDCI_ID")
    private String fdciId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "FDCI_DESCONTO_INICIAL")
    private BigDecimal fdciDescontoInicial;
    @Basic(optional = false)
    @Column(name = "FDCI_DESCONTO_FINAL")
    private BigDecimal fdciDescontoFinal;
    @Basic(optional = false)
    @Column(name = "FDCI_COMISSAO_AVISTA")
    private BigDecimal fdciComissaoAvista;
    @Basic(optional = false)
    @Column(name = "FDCI_COMISSAO_APRAZO")
    private BigDecimal fdciComissaoAprazo;
    @Column(name = "FDCI_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fdciLastupdate;
    @JoinColumn(name = "FDCM_ID", referencedColumnName = "FDCM_ID")
    @ManyToOne
    private FaixaDescontoComissao fdcmId;

    public FaixadescontocomissaoItens() {
    }

    public FaixadescontocomissaoItens(String fdciId) {
        this.fdciId = fdciId;
    }

    public FaixadescontocomissaoItens(String fdciId, BigDecimal fdciDescontoInicial, BigDecimal fdciDescontoFinal, BigDecimal fdciComissaoAvista, BigDecimal fdciComissaoAprazo) {
        this.fdciId = fdciId;
        this.fdciDescontoInicial = fdciDescontoInicial;
        this.fdciDescontoFinal = fdciDescontoFinal;
        this.fdciComissaoAvista = fdciComissaoAvista;
        this.fdciComissaoAprazo = fdciComissaoAprazo;
    }

    public String getFdciId() {
        return fdciId;
    }

    public void setFdciId(String fdciId) {
        this.fdciId = fdciId;
    }

    public BigDecimal getFdciDescontoInicial() {
        return fdciDescontoInicial;
    }

    public void setFdciDescontoInicial(BigDecimal fdciDescontoInicial) {
        this.fdciDescontoInicial = fdciDescontoInicial;
    }

    public BigDecimal getFdciDescontoFinal() {
        return fdciDescontoFinal;
    }

    public void setFdciDescontoFinal(BigDecimal fdciDescontoFinal) {
        this.fdciDescontoFinal = fdciDescontoFinal;
    }

    public BigDecimal getFdciComissaoAvista() {
        return fdciComissaoAvista;
    }

    public void setFdciComissaoAvista(BigDecimal fdciComissaoAvista) {
        this.fdciComissaoAvista = fdciComissaoAvista;
    }

    public BigDecimal getFdciComissaoAprazo() {
        return fdciComissaoAprazo;
    }

    public void setFdciComissaoAprazo(BigDecimal fdciComissaoAprazo) {
        this.fdciComissaoAprazo = fdciComissaoAprazo;
    }

    public Date getFdciLastupdate() {
        return fdciLastupdate;
    }

    public void setFdciLastupdate(Date fdciLastupdate) {
        this.fdciLastupdate = fdciLastupdate;
    }

    public FaixaDescontoComissao getFdcmId() {
        return fdcmId;
    }

    public void setFdcmId(FaixaDescontoComissao fdcmId) {
        this.fdcmId = fdcmId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fdciId != null ? fdciId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FaixadescontocomissaoItens)) {
            return false;
        }
        FaixadescontocomissaoItens other = (FaixadescontocomissaoItens) object;
        if ((this.fdciId == null && other.fdciId != null) || (this.fdciId != null && !this.fdciId.equals(other.fdciId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.FaixadescontocomissaoItens[ fdciId=" + fdciId + " ]";
    }
    
}
