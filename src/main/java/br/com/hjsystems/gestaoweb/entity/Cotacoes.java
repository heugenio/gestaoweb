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
import javax.persistence.Lob;
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
@Table(name = "COTACOES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cotacoes.findAll", query = "SELECT c FROM Cotacoes c"),
    @NamedQuery(name = "Cotacoes.findByCotcId", query = "SELECT c FROM Cotacoes c WHERE c.cotcId = :cotcId"),
    @NamedQuery(name = "Cotacoes.findByCotcNumero", query = "SELECT c FROM Cotacoes c WHERE c.cotcNumero = :cotcNumero"),
    @NamedQuery(name = "Cotacoes.findByCotcData", query = "SELECT c FROM Cotacoes c WHERE c.cotcData = :cotcData"),
    @NamedQuery(name = "Cotacoes.findByCotcStatus", query = "SELECT c FROM Cotacoes c WHERE c.cotcStatus = :cotcStatus"),
    @NamedQuery(name = "Cotacoes.findByCotcLastupdate", query = "SELECT c FROM Cotacoes c WHERE c.cotcLastupdate = :cotcLastupdate")})
public class Cotacoes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COTC_ID")
    private String cotcId;
    @Column(name = "COTC_NUMERO")
    private String cotcNumero;
    @Column(name = "COTC_DATA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cotcData;
    @Basic(optional = false)
    @Column(name = "COTC_STATUS")
    private String cotcStatus;
    @Lob
    @Column(name = "COTC_OBSERVACAO")
    private String cotcObservacao;
    @Column(name = "COTC_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cotcLastupdate;
    @OneToMany(mappedBy = "cotcId")
    private List<SolicitacoesCompras> solicitacoesComprasList;
    @OneToMany(mappedBy = "cotcId")
    private List<CotacoesFornecedores> cotacoesFornecedoresList;
    @OneToMany(mappedBy = "cotcId")
    private List<CotacoesItens> cotacoesItensList;
    @JoinColumn(name = "OPCM_ID", referencedColumnName = "OPCM_ID")
    @ManyToOne
    private OperacoesComerciais opcmId;
    @JoinColumn(name = "VDDR_ID", referencedColumnName = "VDDR_ID")
    @ManyToOne
    private Vendedores vddrId;

    public Cotacoes() {
    }

    public Cotacoes(String cotcId) {
        this.cotcId = cotcId;
    }

    public Cotacoes(String cotcId, String cotcStatus) {
        this.cotcId = cotcId;
        this.cotcStatus = cotcStatus;
    }

    public String getCotcId() {
        return cotcId;
    }

    public void setCotcId(String cotcId) {
        this.cotcId = cotcId;
    }

    public String getCotcNumero() {
        return cotcNumero;
    }

    public void setCotcNumero(String cotcNumero) {
        this.cotcNumero = cotcNumero;
    }

    public Date getCotcData() {
        return cotcData;
    }

    public void setCotcData(Date cotcData) {
        this.cotcData = cotcData;
    }

    public String getCotcStatus() {
        return cotcStatus;
    }

    public void setCotcStatus(String cotcStatus) {
        this.cotcStatus = cotcStatus;
    }

    public String getCotcObservacao() {
        return cotcObservacao;
    }

    public void setCotcObservacao(String cotcObservacao) {
        this.cotcObservacao = cotcObservacao;
    }

    public Date getCotcLastupdate() {
        return cotcLastupdate;
    }

    public void setCotcLastupdate(Date cotcLastupdate) {
        this.cotcLastupdate = cotcLastupdate;
    }

    @XmlTransient
    public List<SolicitacoesCompras> getSolicitacoesComprasList() {
        return solicitacoesComprasList;
    }

    public void setSolicitacoesComprasList(List<SolicitacoesCompras> solicitacoesComprasList) {
        this.solicitacoesComprasList = solicitacoesComprasList;
    }

    @XmlTransient
    public List<CotacoesFornecedores> getCotacoesFornecedoresList() {
        return cotacoesFornecedoresList;
    }

    public void setCotacoesFornecedoresList(List<CotacoesFornecedores> cotacoesFornecedoresList) {
        this.cotacoesFornecedoresList = cotacoesFornecedoresList;
    }

    @XmlTransient
    public List<CotacoesItens> getCotacoesItensList() {
        return cotacoesItensList;
    }

    public void setCotacoesItensList(List<CotacoesItens> cotacoesItensList) {
        this.cotacoesItensList = cotacoesItensList;
    }

    public OperacoesComerciais getOpcmId() {
        return opcmId;
    }

    public void setOpcmId(OperacoesComerciais opcmId) {
        this.opcmId = opcmId;
    }

    public Vendedores getVddrId() {
        return vddrId;
    }

    public void setVddrId(Vendedores vddrId) {
        this.vddrId = vddrId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cotcId != null ? cotcId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cotacoes)) {
            return false;
        }
        Cotacoes other = (Cotacoes) object;
        if ((this.cotcId == null && other.cotcId != null) || (this.cotcId != null && !this.cotcId.equals(other.cotcId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.Cotacoes[ cotcId=" + cotcId + " ]";
    }
    
}
