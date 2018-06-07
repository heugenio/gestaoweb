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
@Table(name = "RMAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rmas.findAll", query = "SELECT r FROM Rmas r"),
    @NamedQuery(name = "Rmas.findByRmasId", query = "SELECT r FROM Rmas r WHERE r.rmasId = :rmasId"),
    @NamedQuery(name = "Rmas.findByRmasDtAbertura", query = "SELECT r FROM Rmas r WHERE r.rmasDtAbertura = :rmasDtAbertura"),
    @NamedQuery(name = "Rmas.findByRmasDtEntrega", query = "SELECT r FROM Rmas r WHERE r.rmasDtEntrega = :rmasDtEntrega"),
    @NamedQuery(name = "Rmas.findByRmasContato", query = "SELECT r FROM Rmas r WHERE r.rmasContato = :rmasContato"),
    @NamedQuery(name = "Rmas.findByRmasStatus", query = "SELECT r FROM Rmas r WHERE r.rmasStatus = :rmasStatus"),
    @NamedQuery(name = "Rmas.findByRmasLastupdate", query = "SELECT r FROM Rmas r WHERE r.rmasLastupdate = :rmasLastupdate"),
    @NamedQuery(name = "Rmas.findByRmasCodigo", query = "SELECT r FROM Rmas r WHERE r.rmasCodigo = :rmasCodigo")})
public class Rmas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "RMAS_ID")
    private String rmasId;
    @Column(name = "RMAS_DT_ABERTURA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rmasDtAbertura;
    @Column(name = "RMAS_DT_ENTREGA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rmasDtEntrega;
    @Column(name = "RMAS_CONTATO")
    private String rmasContato;
    @Basic(optional = false)
    @Column(name = "RMAS_STATUS")
    private String rmasStatus;
    @Column(name = "RMAS_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rmasLastupdate;
    @Column(name = "RMAS_CODIGO")
    private String rmasCodigo;
    @OneToMany(mappedBy = "rmasId")
    private List<RmaItens> rmaItensList;
    @JoinColumn(name = "DCFS_ID", referencedColumnName = "DCFS_ID")
    @ManyToOne
    private DocumentosFiscais dcfsId;
    @JoinColumn(name = "PESS_ID", referencedColumnName = "PESS_ID")
    @ManyToOne
    private Pessoas pessId;
    @JoinColumn(name = "TPRM_ID", referencedColumnName = "TPRM_ID")
    @ManyToOne
    private TiposRmas tprmId;
    @JoinColumn(name = "USU_USRS_ID", referencedColumnName = "USRS_ID")
    @ManyToOne
    private Usuarios usuUsrsId;
    @JoinColumn(name = "USRS_ID", referencedColumnName = "USRS_ID")
    @ManyToOne
    private Usuarios usrsId;

    public Rmas() {
    }

    public Rmas(String rmasId) {
        this.rmasId = rmasId;
    }

    public Rmas(String rmasId, String rmasStatus) {
        this.rmasId = rmasId;
        this.rmasStatus = rmasStatus;
    }

    public String getRmasId() {
        return rmasId;
    }

    public void setRmasId(String rmasId) {
        this.rmasId = rmasId;
    }

    public Date getRmasDtAbertura() {
        return rmasDtAbertura;
    }

    public void setRmasDtAbertura(Date rmasDtAbertura) {
        this.rmasDtAbertura = rmasDtAbertura;
    }

    public Date getRmasDtEntrega() {
        return rmasDtEntrega;
    }

    public void setRmasDtEntrega(Date rmasDtEntrega) {
        this.rmasDtEntrega = rmasDtEntrega;
    }

    public String getRmasContato() {
        return rmasContato;
    }

    public void setRmasContato(String rmasContato) {
        this.rmasContato = rmasContato;
    }

    public String getRmasStatus() {
        return rmasStatus;
    }

    public void setRmasStatus(String rmasStatus) {
        this.rmasStatus = rmasStatus;
    }

    public Date getRmasLastupdate() {
        return rmasLastupdate;
    }

    public void setRmasLastupdate(Date rmasLastupdate) {
        this.rmasLastupdate = rmasLastupdate;
    }

    public String getRmasCodigo() {
        return rmasCodigo;
    }

    public void setRmasCodigo(String rmasCodigo) {
        this.rmasCodigo = rmasCodigo;
    }

    @XmlTransient
    public List<RmaItens> getRmaItensList() {
        return rmaItensList;
    }

    public void setRmaItensList(List<RmaItens> rmaItensList) {
        this.rmaItensList = rmaItensList;
    }

    public DocumentosFiscais getDcfsId() {
        return dcfsId;
    }

    public void setDcfsId(DocumentosFiscais dcfsId) {
        this.dcfsId = dcfsId;
    }

    public Pessoas getPessId() {
        return pessId;
    }

    public void setPessId(Pessoas pessId) {
        this.pessId = pessId;
    }

    public TiposRmas getTprmId() {
        return tprmId;
    }

    public void setTprmId(TiposRmas tprmId) {
        this.tprmId = tprmId;
    }

    public Usuarios getUsuUsrsId() {
        return usuUsrsId;
    }

    public void setUsuUsrsId(Usuarios usuUsrsId) {
        this.usuUsrsId = usuUsrsId;
    }

    public Usuarios getUsrsId() {
        return usrsId;
    }

    public void setUsrsId(Usuarios usrsId) {
        this.usrsId = usrsId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rmasId != null ? rmasId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rmas)) {
            return false;
        }
        Rmas other = (Rmas) object;
        if ((this.rmasId == null && other.rmasId != null) || (this.rmasId != null && !this.rmasId.equals(other.rmasId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.Rmas[ rmasId=" + rmasId + " ]";
    }
    
}
