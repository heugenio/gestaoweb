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
@Table(name = "MOTIVO_CANCELAMENTO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MotivoCancelamento.findAll", query = "SELECT m FROM MotivoCancelamento m"),
    @NamedQuery(name = "MotivoCancelamento.findByMtccId", query = "SELECT m FROM MotivoCancelamento m WHERE m.mtccId = :mtccId"),
    @NamedQuery(name = "MotivoCancelamento.findByMtccNome", query = "SELECT m FROM MotivoCancelamento m WHERE m.mtccNome = :mtccNome"),
    @NamedQuery(name = "MotivoCancelamento.findByMtCcLASTUPDATE", query = "SELECT m FROM MotivoCancelamento m WHERE m.mtCcLASTUPDATE = :mtCcLASTUPDATE")})
public class MotivoCancelamento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MTCC_ID")
    private String mtccId;
    @Basic(optional = false)
    @Column(name = "MTCC_NOME")
    private String mtccNome;
    @Column(name = "MtCc_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mtCcLASTUPDATE;
    @OneToMany(mappedBy = "mtccId")
    private List<Pedidos> pedidosList;
    @OneToMany(mappedBy = "mtccId")
    private List<Requisicoes> requisicoesList;
    @OneToMany(mappedBy = "mtccId")
    private List<OrdemServico> ordemServicoList;

    public MotivoCancelamento() {
    }

    public MotivoCancelamento(String mtccId) {
        this.mtccId = mtccId;
    }

    public MotivoCancelamento(String mtccId, String mtccNome) {
        this.mtccId = mtccId;
        this.mtccNome = mtccNome;
    }

    public String getMtccId() {
        return mtccId;
    }

    public void setMtccId(String mtccId) {
        this.mtccId = mtccId;
    }

    public String getMtccNome() {
        return mtccNome;
    }

    public void setMtccNome(String mtccNome) {
        this.mtccNome = mtccNome;
    }

    public Date getMtCcLASTUPDATE() {
        return mtCcLASTUPDATE;
    }

    public void setMtCcLASTUPDATE(Date mtCcLASTUPDATE) {
        this.mtCcLASTUPDATE = mtCcLASTUPDATE;
    }

    @XmlTransient
    public List<Pedidos> getPedidosList() {
        return pedidosList;
    }

    public void setPedidosList(List<Pedidos> pedidosList) {
        this.pedidosList = pedidosList;
    }

    @XmlTransient
    public List<Requisicoes> getRequisicoesList() {
        return requisicoesList;
    }

    public void setRequisicoesList(List<Requisicoes> requisicoesList) {
        this.requisicoesList = requisicoesList;
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
        hash += (mtccId != null ? mtccId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MotivoCancelamento)) {
            return false;
        }
        MotivoCancelamento other = (MotivoCancelamento) object;
        if ((this.mtccId == null && other.mtccId != null) || (this.mtccId != null && !this.mtccId.equals(other.mtccId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.MotivoCancelamento[ mtccId=" + mtccId + " ]";
    }
    
}
