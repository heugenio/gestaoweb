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
@Table(name = "ENDERECOS_ARMAZENAMENTO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EnderecosArmazenamento.findAll", query = "SELECT e FROM EnderecosArmazenamento e"),
    @NamedQuery(name = "EnderecosArmazenamento.findByEnarId", query = "SELECT e FROM EnderecosArmazenamento e WHERE e.enarId = :enarId"),
    @NamedQuery(name = "EnderecosArmazenamento.findByEnarEndDeArmazenamento", query = "SELECT e FROM EnderecosArmazenamento e WHERE e.enarEndDeArmazenamento = :enarEndDeArmazenamento"),
    @NamedQuery(name = "EnderecosArmazenamento.findByEnarLastupdate", query = "SELECT e FROM EnderecosArmazenamento e WHERE e.enarLastupdate = :enarLastupdate"),
    @NamedQuery(name = "EnderecosArmazenamento.findByEnarStatus", query = "SELECT e FROM EnderecosArmazenamento e WHERE e.enarStatus = :enarStatus"),
    @NamedQuery(name = "EnderecosArmazenamento.findByEnarCorredor", query = "SELECT e FROM EnderecosArmazenamento e WHERE e.enarCorredor = :enarCorredor"),
    @NamedQuery(name = "EnderecosArmazenamento.findByEnarEscaninho", query = "SELECT e FROM EnderecosArmazenamento e WHERE e.enarEscaninho = :enarEscaninho"),
    @NamedQuery(name = "EnderecosArmazenamento.findByEnarFileira", query = "SELECT e FROM EnderecosArmazenamento e WHERE e.enarFileira = :enarFileira"),
    @NamedQuery(name = "EnderecosArmazenamento.findByEnarPadrao", query = "SELECT e FROM EnderecosArmazenamento e WHERE e.enarPadrao = :enarPadrao")})
public class EnderecosArmazenamento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ENAR_ID")
    private String enarId;
    @Column(name = "ENAR_END_DE_ARMAZENAMENTO")
    private String enarEndDeArmazenamento;
    @Column(name = "ENAR_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date enarLastupdate;
    @Column(name = "ENAR_STATUS")
    private String enarStatus;
    @Column(name = "ENAR_CORREDOR")
    private String enarCorredor;
    @Column(name = "ENAR_ESCANINHO")
    private String enarEscaninho;
    @Column(name = "ENAR_FILEIRA")
    private String enarFileira;
    @Column(name = "ENAR_PADRAO")
    private String enarPadrao;
    @OneToMany(mappedBy = "enarId")
    private List<BalancosProdutos> balancosProdutosList;
    @OneToMany(mappedBy = "enarId")
    private List<TiposEstoques> tiposEstoquesList;
    @OneToMany(mappedBy = "enarId")
    private List<Requisicoes> requisicoesList;
    @OneToMany(mappedBy = "enarId")
    private List<Vendedores> vendedoresList;

    public EnderecosArmazenamento() {
    }

    public EnderecosArmazenamento(String enarId) {
        this.enarId = enarId;
    }

    public String getEnarId() {
        return enarId;
    }

    public void setEnarId(String enarId) {
        this.enarId = enarId;
    }

    public String getEnarEndDeArmazenamento() {
        return enarEndDeArmazenamento;
    }

    public void setEnarEndDeArmazenamento(String enarEndDeArmazenamento) {
        this.enarEndDeArmazenamento = enarEndDeArmazenamento;
    }

    public Date getEnarLastupdate() {
        return enarLastupdate;
    }

    public void setEnarLastupdate(Date enarLastupdate) {
        this.enarLastupdate = enarLastupdate;
    }

    public String getEnarStatus() {
        return enarStatus;
    }

    public void setEnarStatus(String enarStatus) {
        this.enarStatus = enarStatus;
    }

    public String getEnarCorredor() {
        return enarCorredor;
    }

    public void setEnarCorredor(String enarCorredor) {
        this.enarCorredor = enarCorredor;
    }

    public String getEnarEscaninho() {
        return enarEscaninho;
    }

    public void setEnarEscaninho(String enarEscaninho) {
        this.enarEscaninho = enarEscaninho;
    }

    public String getEnarFileira() {
        return enarFileira;
    }

    public void setEnarFileira(String enarFileira) {
        this.enarFileira = enarFileira;
    }

    public String getEnarPadrao() {
        return enarPadrao;
    }

    public void setEnarPadrao(String enarPadrao) {
        this.enarPadrao = enarPadrao;
    }

    @XmlTransient
    public List<BalancosProdutos> getBalancosProdutosList() {
        return balancosProdutosList;
    }

    public void setBalancosProdutosList(List<BalancosProdutos> balancosProdutosList) {
        this.balancosProdutosList = balancosProdutosList;
    }

    @XmlTransient
    public List<TiposEstoques> getTiposEstoquesList() {
        return tiposEstoquesList;
    }

    public void setTiposEstoquesList(List<TiposEstoques> tiposEstoquesList) {
        this.tiposEstoquesList = tiposEstoquesList;
    }

    @XmlTransient
    public List<Requisicoes> getRequisicoesList() {
        return requisicoesList;
    }

    public void setRequisicoesList(List<Requisicoes> requisicoesList) {
        this.requisicoesList = requisicoesList;
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
        hash += (enarId != null ? enarId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EnderecosArmazenamento)) {
            return false;
        }
        EnderecosArmazenamento other = (EnderecosArmazenamento) object;
        if ((this.enarId == null && other.enarId != null) || (this.enarId != null && !this.enarId.equals(other.enarId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.EnderecosArmazenamento[ enarId=" + enarId + " ]";
    }
    
}
