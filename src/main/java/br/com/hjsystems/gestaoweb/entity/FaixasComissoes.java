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
@Table(name = "FAIXAS_COMISSOES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FaixasComissoes.findAll", query = "SELECT f FROM FaixasComissoes f"),
    @NamedQuery(name = "FaixasComissoes.findByFxcmId", query = "SELECT f FROM FaixasComissoes f WHERE f.fxcmId = :fxcmId"),
    @NamedQuery(name = "FaixasComissoes.findByFxcmTipoComissao", query = "SELECT f FROM FaixasComissoes f WHERE f.fxcmTipoComissao = :fxcmTipoComissao"),
    @NamedQuery(name = "FaixasComissoes.findByFxcmPercAvista", query = "SELECT f FROM FaixasComissoes f WHERE f.fxcmPercAvista = :fxcmPercAvista"),
    @NamedQuery(name = "FaixasComissoes.findByFxcmPercAprazo", query = "SELECT f FROM FaixasComissoes f WHERE f.fxcmPercAprazo = :fxcmPercAprazo"),
    @NamedQuery(name = "FaixasComissoes.findByFxcmPercTelemark", query = "SELECT f FROM FaixasComissoes f WHERE f.fxcmPercTelemark = :fxcmPercTelemark"),
    @NamedQuery(name = "FaixasComissoes.findByFxcmLastupdate", query = "SELECT f FROM FaixasComissoes f WHERE f.fxcmLastupdate = :fxcmLastupdate")})
public class FaixasComissoes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "FXCM_ID")
    private String fxcmId;
    @Basic(optional = false)
    @Column(name = "FXCM_TIPO_COMISSAO")
    private String fxcmTipoComissao;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "FXCM_PERC_AVISTA")
    private BigDecimal fxcmPercAvista;
    @Basic(optional = false)
    @Column(name = "FXCM_PERC_APRAZO")
    private BigDecimal fxcmPercAprazo;
    @Basic(optional = false)
    @Column(name = "FXCM_PERC_TELEMARK")
    private BigDecimal fxcmPercTelemark;
    @Column(name = "FXCM_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fxcmLastupdate;
    @OneToMany(mappedBy = "fxcmId")
    private List<FaixascomissoesItens> faixascomissoesItensList;
    @JoinColumn(name = "GRPO_ID", referencedColumnName = "GRPO_ID")
    @ManyToOne
    private Grupos grpoId;
    @JoinColumn(name = "TPCM_ID", referencedColumnName = "TPCM_ID")
    @ManyToOne
    private TiposComissoes tpcmId;

    public FaixasComissoes() {
    }

    public FaixasComissoes(String fxcmId) {
        this.fxcmId = fxcmId;
    }

    public FaixasComissoes(String fxcmId, String fxcmTipoComissao, BigDecimal fxcmPercAvista, BigDecimal fxcmPercAprazo, BigDecimal fxcmPercTelemark) {
        this.fxcmId = fxcmId;
        this.fxcmTipoComissao = fxcmTipoComissao;
        this.fxcmPercAvista = fxcmPercAvista;
        this.fxcmPercAprazo = fxcmPercAprazo;
        this.fxcmPercTelemark = fxcmPercTelemark;
    }

    public String getFxcmId() {
        return fxcmId;
    }

    public void setFxcmId(String fxcmId) {
        this.fxcmId = fxcmId;
    }

    public String getFxcmTipoComissao() {
        return fxcmTipoComissao;
    }

    public void setFxcmTipoComissao(String fxcmTipoComissao) {
        this.fxcmTipoComissao = fxcmTipoComissao;
    }

    public BigDecimal getFxcmPercAvista() {
        return fxcmPercAvista;
    }

    public void setFxcmPercAvista(BigDecimal fxcmPercAvista) {
        this.fxcmPercAvista = fxcmPercAvista;
    }

    public BigDecimal getFxcmPercAprazo() {
        return fxcmPercAprazo;
    }

    public void setFxcmPercAprazo(BigDecimal fxcmPercAprazo) {
        this.fxcmPercAprazo = fxcmPercAprazo;
    }

    public BigDecimal getFxcmPercTelemark() {
        return fxcmPercTelemark;
    }

    public void setFxcmPercTelemark(BigDecimal fxcmPercTelemark) {
        this.fxcmPercTelemark = fxcmPercTelemark;
    }

    public Date getFxcmLastupdate() {
        return fxcmLastupdate;
    }

    public void setFxcmLastupdate(Date fxcmLastupdate) {
        this.fxcmLastupdate = fxcmLastupdate;
    }

    @XmlTransient
    public List<FaixascomissoesItens> getFaixascomissoesItensList() {
        return faixascomissoesItensList;
    }

    public void setFaixascomissoesItensList(List<FaixascomissoesItens> faixascomissoesItensList) {
        this.faixascomissoesItensList = faixascomissoesItensList;
    }

    public Grupos getGrpoId() {
        return grpoId;
    }

    public void setGrpoId(Grupos grpoId) {
        this.grpoId = grpoId;
    }

    public TiposComissoes getTpcmId() {
        return tpcmId;
    }

    public void setTpcmId(TiposComissoes tpcmId) {
        this.tpcmId = tpcmId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fxcmId != null ? fxcmId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FaixasComissoes)) {
            return false;
        }
        FaixasComissoes other = (FaixasComissoes) object;
        if ((this.fxcmId == null && other.fxcmId != null) || (this.fxcmId != null && !this.fxcmId.equals(other.fxcmId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.FaixasComissoes[ fxcmId=" + fxcmId + " ]";
    }
    
}
