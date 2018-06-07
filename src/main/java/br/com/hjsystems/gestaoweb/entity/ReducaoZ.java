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
@Table(name = "REDUCAO_Z")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ReducaoZ.findAll", query = "SELECT r FROM ReducaoZ r"),
    @NamedQuery(name = "ReducaoZ.findByRdczId", query = "SELECT r FROM ReducaoZ r WHERE r.rdczId = :rdczId"),
    @NamedQuery(name = "ReducaoZ.findByRdczIndicadorTotalizacao", query = "SELECT r FROM ReducaoZ r WHERE r.rdczIndicadorTotalizacao = :rdczIndicadorTotalizacao"),
    @NamedQuery(name = "ReducaoZ.findByRdczCodModelo", query = "SELECT r FROM ReducaoZ r WHERE r.rdczCodModelo = :rdczCodModelo"),
    @NamedQuery(name = "ReducaoZ.findByRdczDataReducao", query = "SELECT r FROM ReducaoZ r WHERE r.rdczDataReducao = :rdczDataReducao"),
    @NamedQuery(name = "ReducaoZ.findByRdczNumCaixaEcf", query = "SELECT r FROM ReducaoZ r WHERE r.rdczNumCaixaEcf = :rdczNumCaixaEcf"),
    @NamedQuery(name = "ReducaoZ.findByRdczNumFabricacaoEcf", query = "SELECT r FROM ReducaoZ r WHERE r.rdczNumFabricacaoEcf = :rdczNumFabricacaoEcf"),
    @NamedQuery(name = "ReducaoZ.findByRdczLastupdate", query = "SELECT r FROM ReducaoZ r WHERE r.rdczLastupdate = :rdczLastupdate")})
public class ReducaoZ implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "RDCZ_ID")
    private String rdczId;
    @Column(name = "RDCZ_INDICADOR_TOTALIZACAO")
    private Character rdczIndicadorTotalizacao;
    @Column(name = "RDCZ_COD_MODELO")
    private String rdczCodModelo;
    @Column(name = "RDCZ_DATA_REDUCAO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rdczDataReducao;
    @Basic(optional = false)
    @Column(name = "RDCZ_NUM_CAIXA_ECF")
    private String rdczNumCaixaEcf;
    @Basic(optional = false)
    @Column(name = "RDCZ_NUM_FABRICACAO_ECF")
    private String rdczNumFabricacaoEcf;
    @Column(name = "RDCZ_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rdczLastupdate;
    @OneToMany(mappedBy = "rdczId")
    private List<ItensReducaoZ> itensReducaoZList;

    public ReducaoZ() {
    }

    public ReducaoZ(String rdczId) {
        this.rdczId = rdczId;
    }

    public ReducaoZ(String rdczId, String rdczNumCaixaEcf, String rdczNumFabricacaoEcf) {
        this.rdczId = rdczId;
        this.rdczNumCaixaEcf = rdczNumCaixaEcf;
        this.rdczNumFabricacaoEcf = rdczNumFabricacaoEcf;
    }

    public String getRdczId() {
        return rdczId;
    }

    public void setRdczId(String rdczId) {
        this.rdczId = rdczId;
    }

    public Character getRdczIndicadorTotalizacao() {
        return rdczIndicadorTotalizacao;
    }

    public void setRdczIndicadorTotalizacao(Character rdczIndicadorTotalizacao) {
        this.rdczIndicadorTotalizacao = rdczIndicadorTotalizacao;
    }

    public String getRdczCodModelo() {
        return rdczCodModelo;
    }

    public void setRdczCodModelo(String rdczCodModelo) {
        this.rdczCodModelo = rdczCodModelo;
    }

    public Date getRdczDataReducao() {
        return rdczDataReducao;
    }

    public void setRdczDataReducao(Date rdczDataReducao) {
        this.rdczDataReducao = rdczDataReducao;
    }

    public String getRdczNumCaixaEcf() {
        return rdczNumCaixaEcf;
    }

    public void setRdczNumCaixaEcf(String rdczNumCaixaEcf) {
        this.rdczNumCaixaEcf = rdczNumCaixaEcf;
    }

    public String getRdczNumFabricacaoEcf() {
        return rdczNumFabricacaoEcf;
    }

    public void setRdczNumFabricacaoEcf(String rdczNumFabricacaoEcf) {
        this.rdczNumFabricacaoEcf = rdczNumFabricacaoEcf;
    }

    public Date getRdczLastupdate() {
        return rdczLastupdate;
    }

    public void setRdczLastupdate(Date rdczLastupdate) {
        this.rdczLastupdate = rdczLastupdate;
    }

    @XmlTransient
    public List<ItensReducaoZ> getItensReducaoZList() {
        return itensReducaoZList;
    }

    public void setItensReducaoZList(List<ItensReducaoZ> itensReducaoZList) {
        this.itensReducaoZList = itensReducaoZList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rdczId != null ? rdczId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReducaoZ)) {
            return false;
        }
        ReducaoZ other = (ReducaoZ) object;
        if ((this.rdczId == null && other.rdczId != null) || (this.rdczId != null && !this.rdczId.equals(other.rdczId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.ReducaoZ[ rdczId=" + rdczId + " ]";
    }
    
}
