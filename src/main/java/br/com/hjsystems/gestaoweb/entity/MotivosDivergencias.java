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
@Table(name = "MOTIVOS_DIVERGENCIAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MotivosDivergencias.findAll", query = "SELECT m FROM MotivosDivergencias m"),
    @NamedQuery(name = "MotivosDivergencias.findByMtdvId", query = "SELECT m FROM MotivosDivergencias m WHERE m.mtdvId = :mtdvId"),
    @NamedQuery(name = "MotivosDivergencias.findByMtdvNome", query = "SELECT m FROM MotivosDivergencias m WHERE m.mtdvNome = :mtdvNome"),
    @NamedQuery(name = "MotivosDivergencias.findByMtdvSigla", query = "SELECT m FROM MotivosDivergencias m WHERE m.mtdvSigla = :mtdvSigla"),
    @NamedQuery(name = "MotivosDivergencias.findByMtdvDiasValidade", query = "SELECT m FROM MotivosDivergencias m WHERE m.mtdvDiasValidade = :mtdvDiasValidade"),
    @NamedQuery(name = "MotivosDivergencias.findByMtdvTipo", query = "SELECT m FROM MotivosDivergencias m WHERE m.mtdvTipo = :mtdvTipo"),
    @NamedQuery(name = "MotivosDivergencias.findByMtdvLastupdate", query = "SELECT m FROM MotivosDivergencias m WHERE m.mtdvLastupdate = :mtdvLastupdate")})
public class MotivosDivergencias implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MTDV_ID")
    private String mtdvId;
    @Column(name = "MTDV_NOME")
    private String mtdvNome;
    @Column(name = "MTDV_SIGLA")
    private String mtdvSigla;
    @Column(name = "MTDV_DIAS_VALIDADE")
    private Integer mtdvDiasValidade;
    @Column(name = "MTDV_TIPO")
    private String mtdvTipo;
    @Column(name = "MTDV_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mtdvLastupdate;
    @OneToMany(mappedBy = "mtdvId")
    private List<OpcomMotivodivergencia> opcomMotivodivergenciaList;
    @OneToMany(mappedBy = "mtdvId")
    private List<MotivodivergenciaUsuarios> motivodivergenciaUsuariosList;
    @OneToMany(mappedBy = "mtdvId")
    private List<DivergenciasPedido> divergenciasPedidoList;

    public MotivosDivergencias() {
    }

    public MotivosDivergencias(String mtdvId) {
        this.mtdvId = mtdvId;
    }

    public String getMtdvId() {
        return mtdvId;
    }

    public void setMtdvId(String mtdvId) {
        this.mtdvId = mtdvId;
    }

    public String getMtdvNome() {
        return mtdvNome;
    }

    public void setMtdvNome(String mtdvNome) {
        this.mtdvNome = mtdvNome;
    }

    public String getMtdvSigla() {
        return mtdvSigla;
    }

    public void setMtdvSigla(String mtdvSigla) {
        this.mtdvSigla = mtdvSigla;
    }

    public Integer getMtdvDiasValidade() {
        return mtdvDiasValidade;
    }

    public void setMtdvDiasValidade(Integer mtdvDiasValidade) {
        this.mtdvDiasValidade = mtdvDiasValidade;
    }

    public String getMtdvTipo() {
        return mtdvTipo;
    }

    public void setMtdvTipo(String mtdvTipo) {
        this.mtdvTipo = mtdvTipo;
    }

    public Date getMtdvLastupdate() {
        return mtdvLastupdate;
    }

    public void setMtdvLastupdate(Date mtdvLastupdate) {
        this.mtdvLastupdate = mtdvLastupdate;
    }

    @XmlTransient
    public List<OpcomMotivodivergencia> getOpcomMotivodivergenciaList() {
        return opcomMotivodivergenciaList;
    }

    public void setOpcomMotivodivergenciaList(List<OpcomMotivodivergencia> opcomMotivodivergenciaList) {
        this.opcomMotivodivergenciaList = opcomMotivodivergenciaList;
    }

    @XmlTransient
    public List<MotivodivergenciaUsuarios> getMotivodivergenciaUsuariosList() {
        return motivodivergenciaUsuariosList;
    }

    public void setMotivodivergenciaUsuariosList(List<MotivodivergenciaUsuarios> motivodivergenciaUsuariosList) {
        this.motivodivergenciaUsuariosList = motivodivergenciaUsuariosList;
    }

    @XmlTransient
    public List<DivergenciasPedido> getDivergenciasPedidoList() {
        return divergenciasPedidoList;
    }

    public void setDivergenciasPedidoList(List<DivergenciasPedido> divergenciasPedidoList) {
        this.divergenciasPedidoList = divergenciasPedidoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mtdvId != null ? mtdvId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MotivosDivergencias)) {
            return false;
        }
        MotivosDivergencias other = (MotivosDivergencias) object;
        if ((this.mtdvId == null && other.mtdvId != null) || (this.mtdvId != null && !this.mtdvId.equals(other.mtdvId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.MotivosDivergencias[ mtdvId=" + mtdvId + " ]";
    }
    
}
