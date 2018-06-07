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
@Table(name = "ENTREGADOR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Entregador.findAll", query = "SELECT e FROM Entregador e"),
    @NamedQuery(name = "Entregador.findByEtgdId", query = "SELECT e FROM Entregador e WHERE e.etgdId = :etgdId"),
    @NamedQuery(name = "Entregador.findByEtgdCodigo", query = "SELECT e FROM Entregador e WHERE e.etgdCodigo = :etgdCodigo"),
    @NamedQuery(name = "Entregador.findByEtgdSituacao", query = "SELECT e FROM Entregador e WHERE e.etgdSituacao = :etgdSituacao"),
    @NamedQuery(name = "Entregador.findByEtgdLASTUPDATE", query = "SELECT e FROM Entregador e WHERE e.etgdLASTUPDATE = :etgdLASTUPDATE")})
public class Entregador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ETGD_ID")
    private String etgdId;
    @Column(name = "ETGD_CODIGO")
    private String etgdCodigo;
    @Basic(optional = false)
    @Column(name = "ETGD_SITUACAO")
    private String etgdSituacao;
    @Column(name = "Etgd_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date etgdLASTUPDATE;
    @OneToMany(mappedBy = "etgdId")
    private List<Entregas> entregasList;
    @OneToMany(mappedBy = "entEtgdId")
    private List<Entregas> entregasList1;
    @JoinColumn(name = "PESS_ID", referencedColumnName = "PESS_ID")
    @ManyToOne
    private Pessoas pessId;
    @OneToMany(mappedBy = "etgdId")
    private List<RomaneioEntregas> romaneioEntregasList;

    public Entregador() {
    }

    public Entregador(String etgdId) {
        this.etgdId = etgdId;
    }

    public Entregador(String etgdId, String etgdSituacao) {
        this.etgdId = etgdId;
        this.etgdSituacao = etgdSituacao;
    }

    public String getEtgdId() {
        return etgdId;
    }

    public void setEtgdId(String etgdId) {
        this.etgdId = etgdId;
    }

    public String getEtgdCodigo() {
        return etgdCodigo;
    }

    public void setEtgdCodigo(String etgdCodigo) {
        this.etgdCodigo = etgdCodigo;
    }

    public String getEtgdSituacao() {
        return etgdSituacao;
    }

    public void setEtgdSituacao(String etgdSituacao) {
        this.etgdSituacao = etgdSituacao;
    }

    public Date getEtgdLASTUPDATE() {
        return etgdLASTUPDATE;
    }

    public void setEtgdLASTUPDATE(Date etgdLASTUPDATE) {
        this.etgdLASTUPDATE = etgdLASTUPDATE;
    }

    @XmlTransient
    public List<Entregas> getEntregasList() {
        return entregasList;
    }

    public void setEntregasList(List<Entregas> entregasList) {
        this.entregasList = entregasList;
    }

    @XmlTransient
    public List<Entregas> getEntregasList1() {
        return entregasList1;
    }

    public void setEntregasList1(List<Entregas> entregasList1) {
        this.entregasList1 = entregasList1;
    }

    public Pessoas getPessId() {
        return pessId;
    }

    public void setPessId(Pessoas pessId) {
        this.pessId = pessId;
    }

    @XmlTransient
    public List<RomaneioEntregas> getRomaneioEntregasList() {
        return romaneioEntregasList;
    }

    public void setRomaneioEntregasList(List<RomaneioEntregas> romaneioEntregasList) {
        this.romaneioEntregasList = romaneioEntregasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (etgdId != null ? etgdId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Entregador)) {
            return false;
        }
        Entregador other = (Entregador) object;
        if ((this.etgdId == null && other.etgdId != null) || (this.etgdId != null && !this.etgdId.equals(other.etgdId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.Entregador[ etgdId=" + etgdId + " ]";
    }
    
}
