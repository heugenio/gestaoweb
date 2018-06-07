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
@Table(name = "TIPO_ORDEM_SERVICO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoOrdemServico.findAll", query = "SELECT t FROM TipoOrdemServico t"),
    @NamedQuery(name = "TipoOrdemServico.findByTposId", query = "SELECT t FROM TipoOrdemServico t WHERE t.tposId = :tposId"),
    @NamedQuery(name = "TipoOrdemServico.findByTposNome", query = "SELECT t FROM TipoOrdemServico t WHERE t.tposNome = :tposNome"),
    @NamedQuery(name = "TipoOrdemServico.findByTposGarantia", query = "SELECT t FROM TipoOrdemServico t WHERE t.tposGarantia = :tposGarantia"),
    @NamedQuery(name = "TipoOrdemServico.findByTposPercComissao", query = "SELECT t FROM TipoOrdemServico t WHERE t.tposPercComissao = :tposPercComissao"),
    @NamedQuery(name = "TipoOrdemServico.findByTposVlrComissao", query = "SELECT t FROM TipoOrdemServico t WHERE t.tposVlrComissao = :tposVlrComissao"),
    @NamedQuery(name = "TipoOrdemServico.findByTposLastupdate", query = "SELECT t FROM TipoOrdemServico t WHERE t.tposLastupdate = :tposLastupdate"),
    @NamedQuery(name = "TipoOrdemServico.findByTposTipo", query = "SELECT t FROM TipoOrdemServico t WHERE t.tposTipo = :tposTipo"),
    @NamedQuery(name = "TipoOrdemServico.findByTposPadrao", query = "SELECT t FROM TipoOrdemServico t WHERE t.tposPadrao = :tposPadrao")})
public class TipoOrdemServico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TPOS_ID")
    private String tposId;
    @Column(name = "TPOS_NOME")
    private String tposNome;
    @Basic(optional = false)
    @Column(name = "TPOS_GARANTIA")
    private String tposGarantia;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "TPOS_PERC_COMISSAO")
    private BigDecimal tposPercComissao;
    @Basic(optional = false)
    @Column(name = "TPOS_VLR_COMISSAO")
    private BigDecimal tposVlrComissao;
    @Column(name = "TPOS_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tposLastupdate;
    @Column(name = "TPOS_TIPO")
    private String tposTipo;
    @Column(name = "TPOS_PADRAO")
    private String tposPadrao;
    @JoinColumn(name = "TBPC_ID", referencedColumnName = "TBPC_ID")
    @ManyToOne
    private TabelasPrecos tbpcId;
    @OneToMany(mappedBy = "tposId")
    private List<OrdemServico> ordemServicoList;

    public TipoOrdemServico() {
    }

    public TipoOrdemServico(String tposId) {
        this.tposId = tposId;
    }

    public TipoOrdemServico(String tposId, String tposGarantia, BigDecimal tposPercComissao, BigDecimal tposVlrComissao) {
        this.tposId = tposId;
        this.tposGarantia = tposGarantia;
        this.tposPercComissao = tposPercComissao;
        this.tposVlrComissao = tposVlrComissao;
    }

    public String getTposId() {
        return tposId;
    }

    public void setTposId(String tposId) {
        this.tposId = tposId;
    }

    public String getTposNome() {
        return tposNome;
    }

    public void setTposNome(String tposNome) {
        this.tposNome = tposNome;
    }

    public String getTposGarantia() {
        return tposGarantia;
    }

    public void setTposGarantia(String tposGarantia) {
        this.tposGarantia = tposGarantia;
    }

    public BigDecimal getTposPercComissao() {
        return tposPercComissao;
    }

    public void setTposPercComissao(BigDecimal tposPercComissao) {
        this.tposPercComissao = tposPercComissao;
    }

    public BigDecimal getTposVlrComissao() {
        return tposVlrComissao;
    }

    public void setTposVlrComissao(BigDecimal tposVlrComissao) {
        this.tposVlrComissao = tposVlrComissao;
    }

    public Date getTposLastupdate() {
        return tposLastupdate;
    }

    public void setTposLastupdate(Date tposLastupdate) {
        this.tposLastupdate = tposLastupdate;
    }

    public String getTposTipo() {
        return tposTipo;
    }

    public void setTposTipo(String tposTipo) {
        this.tposTipo = tposTipo;
    }

    public String getTposPadrao() {
        return tposPadrao;
    }

    public void setTposPadrao(String tposPadrao) {
        this.tposPadrao = tposPadrao;
    }

    public TabelasPrecos getTbpcId() {
        return tbpcId;
    }

    public void setTbpcId(TabelasPrecos tbpcId) {
        this.tbpcId = tbpcId;
    }

    @XmlTransient
    public List<OrdemServico> getOrdemServicoList() {
        return ordemServicoList;
    }

    public void setOrdemServicoList(List<OrdemServico> ordemServicoList) {
        this.ordemServicoList = ordemServicoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tposId != null ? tposId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoOrdemServico)) {
            return false;
        }
        TipoOrdemServico other = (TipoOrdemServico) object;
        if ((this.tposId == null && other.tposId != null) || (this.tposId != null && !this.tposId.equals(other.tposId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.TipoOrdemServico[ tposId=" + tposId + " ]";
    }
    
}
