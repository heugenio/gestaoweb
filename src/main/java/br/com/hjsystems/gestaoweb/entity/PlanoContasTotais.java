/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hjsystems.gestaoweb.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name = "PLANO_CONTAS_TOTAIS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PlanoContasTotais.findAll", query = "SELECT p FROM PlanoContasTotais p"),
    @NamedQuery(name = "PlanoContasTotais.findByPlttId", query = "SELECT p FROM PlanoContasTotais p WHERE p.plttId = :plttId"),
    @NamedQuery(name = "PlanoContasTotais.findByPlttLastupdate", query = "SELECT p FROM PlanoContasTotais p WHERE p.plttLastupdate = :plttLastupdate")})
public class PlanoContasTotais implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PLTT_ID")
    private String plttId;
    @Column(name = "PLTT_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date plttLastupdate;
    @JoinColumn(name = "PLA_PLCT_ID", referencedColumnName = "PLCT_ID")
    @ManyToOne
    private PlanoContas plaPlctId;
    @JoinColumn(name = "PLCT_ID", referencedColumnName = "PLCT_ID")
    @ManyToOne
    private PlanoContas plctId;

    public PlanoContasTotais() {
    }

    public PlanoContasTotais(String plttId) {
        this.plttId = plttId;
    }

    public String getPlttId() {
        return plttId;
    }

    public void setPlttId(String plttId) {
        this.plttId = plttId;
    }

    public Date getPlttLastupdate() {
        return plttLastupdate;
    }

    public void setPlttLastupdate(Date plttLastupdate) {
        this.plttLastupdate = plttLastupdate;
    }

    public PlanoContas getPlaPlctId() {
        return plaPlctId;
    }

    public void setPlaPlctId(PlanoContas plaPlctId) {
        this.plaPlctId = plaPlctId;
    }

    public PlanoContas getPlctId() {
        return plctId;
    }

    public void setPlctId(PlanoContas plctId) {
        this.plctId = plctId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (plttId != null ? plttId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlanoContasTotais)) {
            return false;
        }
        PlanoContasTotais other = (PlanoContasTotais) object;
        if ((this.plttId == null && other.plttId != null) || (this.plttId != null && !this.plttId.equals(other.plttId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.PlanoContasTotais[ plttId=" + plttId + " ]";
    }
    
}
