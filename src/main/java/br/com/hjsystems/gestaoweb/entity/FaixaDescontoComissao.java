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
@Table(name = "FAIXA_DESCONTO_COMISSAO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FaixaDescontoComissao.findAll", query = "SELECT f FROM FaixaDescontoComissao f"),
    @NamedQuery(name = "FaixaDescontoComissao.findByFdcmId", query = "SELECT f FROM FaixaDescontoComissao f WHERE f.fdcmId = :fdcmId"),
    @NamedQuery(name = "FaixaDescontoComissao.findByFdcmLastupdate", query = "SELECT f FROM FaixaDescontoComissao f WHERE f.fdcmLastupdate = :fdcmLastupdate"),
    @NamedQuery(name = "FaixaDescontoComissao.findByFdcmNome", query = "SELECT f FROM FaixaDescontoComissao f WHERE f.fdcmNome = :fdcmNome")})
public class FaixaDescontoComissao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "FDCM_ID")
    private String fdcmId;
    @Column(name = "FDCM_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fdcmLastupdate;
    @Column(name = "FDCM_NOME")
    private String fdcmNome;
    @OneToMany(mappedBy = "fdcmId")
    private List<FaixadescontocomissaoItens> faixadescontocomissaoItensList;
    @OneToMany(mappedBy = "fdcmId")
    private List<Vendedores> vendedoresList;

    public FaixaDescontoComissao() {
    }

    public FaixaDescontoComissao(String fdcmId) {
        this.fdcmId = fdcmId;
    }

    public String getFdcmId() {
        return fdcmId;
    }

    public void setFdcmId(String fdcmId) {
        this.fdcmId = fdcmId;
    }

    public Date getFdcmLastupdate() {
        return fdcmLastupdate;
    }

    public void setFdcmLastupdate(Date fdcmLastupdate) {
        this.fdcmLastupdate = fdcmLastupdate;
    }

    public String getFdcmNome() {
        return fdcmNome;
    }

    public void setFdcmNome(String fdcmNome) {
        this.fdcmNome = fdcmNome;
    }

    @XmlTransient
    public List<FaixadescontocomissaoItens> getFaixadescontocomissaoItensList() {
        return faixadescontocomissaoItensList;
    }

    public void setFaixadescontocomissaoItensList(List<FaixadescontocomissaoItens> faixadescontocomissaoItensList) {
        this.faixadescontocomissaoItensList = faixadescontocomissaoItensList;
    }

    @XmlTransient
    public List<Vendedores> getVendedoresList() {
        return vendedoresList;
    }

    public void setVendedoresList(List<Vendedores> vendedoresList) {
        this.vendedoresList = vendedoresList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fdcmId != null ? fdcmId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FaixaDescontoComissao)) {
            return false;
        }
        FaixaDescontoComissao other = (FaixaDescontoComissao) object;
        if ((this.fdcmId == null && other.fdcmId != null) || (this.fdcmId != null && !this.fdcmId.equals(other.fdcmId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.FaixaDescontoComissao[ fdcmId=" + fdcmId + " ]";
    }
    
}
