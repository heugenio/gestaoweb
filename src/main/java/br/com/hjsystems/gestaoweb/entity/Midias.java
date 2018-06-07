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
@Table(name = "MIDIAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Midias.findAll", query = "SELECT m FROM Midias m"),
    @NamedQuery(name = "Midias.findByMdiaId", query = "SELECT m FROM Midias m WHERE m.mdiaId = :mdiaId"),
    @NamedQuery(name = "Midias.findByMdiaCodigo", query = "SELECT m FROM Midias m WHERE m.mdiaCodigo = :mdiaCodigo"),
    @NamedQuery(name = "Midias.findByMdiaNome", query = "SELECT m FROM Midias m WHERE m.mdiaNome = :mdiaNome"),
    @NamedQuery(name = "Midias.findByMdiaLastupdate", query = "SELECT m FROM Midias m WHERE m.mdiaLastupdate = :mdiaLastupdate")})
public class Midias implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MDIA_ID")
    private String mdiaId;
    @Basic(optional = false)
    @Column(name = "MDIA_CODIGO")
    private String mdiaCodigo;
    @Column(name = "MDIA_NOME")
    private String mdiaNome;
    @Column(name = "MDIA_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mdiaLastupdate;
    @OneToMany(mappedBy = "mdiaId")
    private List<Pedidos> pedidosList;
    @OneToMany(mappedBy = "mdiaId")
    private List<Requisicoes> requisicoesList;
    @OneToMany(mappedBy = "mdiaId")
    private List<OrcamentosVendas> orcamentosVendasList;
    @OneToMany(mappedBy = "mdiaId")
    private List<OrdemServico> ordemServicoList;

    public Midias() {
    }

    public Midias(String mdiaId) {
        this.mdiaId = mdiaId;
    }

    public Midias(String mdiaId, String mdiaCodigo) {
        this.mdiaId = mdiaId;
        this.mdiaCodigo = mdiaCodigo;
    }

    public String getMdiaId() {
        return mdiaId;
    }

    public void setMdiaId(String mdiaId) {
        this.mdiaId = mdiaId;
    }

    public String getMdiaCodigo() {
        return mdiaCodigo;
    }

    public void setMdiaCodigo(String mdiaCodigo) {
        this.mdiaCodigo = mdiaCodigo;
    }

    public String getMdiaNome() {
        return mdiaNome;
    }

    public void setMdiaNome(String mdiaNome) {
        this.mdiaNome = mdiaNome;
    }

    public Date getMdiaLastupdate() {
        return mdiaLastupdate;
    }

    public void setMdiaLastupdate(Date mdiaLastupdate) {
        this.mdiaLastupdate = mdiaLastupdate;
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
    public List<OrcamentosVendas> getOrcamentosVendasList() {
        return orcamentosVendasList;
    }

    public void setOrcamentosVendasList(List<OrcamentosVendas> orcamentosVendasList) {
        this.orcamentosVendasList = orcamentosVendasList;
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
        hash += (mdiaId != null ? mdiaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Midias)) {
            return false;
        }
        Midias other = (Midias) object;
        if ((this.mdiaId == null && other.mdiaId != null) || (this.mdiaId != null && !this.mdiaId.equals(other.mdiaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.Midias[ mdiaId=" + mdiaId + " ]";
    }
    
}
