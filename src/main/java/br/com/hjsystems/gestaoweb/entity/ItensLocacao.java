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
@Table(name = "ITENS_LOCACAO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ItensLocacao.findAll", query = "SELECT i FROM ItensLocacao i"),
    @NamedQuery(name = "ItensLocacao.findByItlcId", query = "SELECT i FROM ItensLocacao i WHERE i.itlcId = :itlcId"),
    @NamedQuery(name = "ItensLocacao.findByItlcQtde", query = "SELECT i FROM ItensLocacao i WHERE i.itlcQtde = :itlcQtde"),
    @NamedQuery(name = "ItensLocacao.findByItlcLastupdate", query = "SELECT i FROM ItensLocacao i WHERE i.itlcLastupdate = :itlcLastupdate"),
    @NamedQuery(name = "ItensLocacao.findByVeicId", query = "SELECT i FROM ItensLocacao i WHERE i.veicId = :veicId")})
public class ItensLocacao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ITLC_ID")
    private String itlcId;
    @Column(name = "ITLC_QTDE")
    private String itlcQtde;
    @Column(name = "ITLC_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date itlcLastupdate;
    @Column(name = "VEIC_ID")
    private String veicId;
    @JoinColumn(name = "LCEQ_ID", referencedColumnName = "LCEQ_ID")
    @ManyToOne
    private LocacoesEquipamentos lceqId;
    @JoinColumn(name = "PROD_ID", referencedColumnName = "PROD_ID")
    @ManyToOne
    private Produtos prodId;

    public ItensLocacao() {
    }

    public ItensLocacao(String itlcId) {
        this.itlcId = itlcId;
    }

    public String getItlcId() {
        return itlcId;
    }

    public void setItlcId(String itlcId) {
        this.itlcId = itlcId;
    }

    public String getItlcQtde() {
        return itlcQtde;
    }

    public void setItlcQtde(String itlcQtde) {
        this.itlcQtde = itlcQtde;
    }

    public Date getItlcLastupdate() {
        return itlcLastupdate;
    }

    public void setItlcLastupdate(Date itlcLastupdate) {
        this.itlcLastupdate = itlcLastupdate;
    }

    public String getVeicId() {
        return veicId;
    }

    public void setVeicId(String veicId) {
        this.veicId = veicId;
    }

    public LocacoesEquipamentos getLceqId() {
        return lceqId;
    }

    public void setLceqId(LocacoesEquipamentos lceqId) {
        this.lceqId = lceqId;
    }

    public Produtos getProdId() {
        return prodId;
    }

    public void setProdId(Produtos prodId) {
        this.prodId = prodId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itlcId != null ? itlcId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItensLocacao)) {
            return false;
        }
        ItensLocacao other = (ItensLocacao) object;
        if ((this.itlcId == null && other.itlcId != null) || (this.itlcId != null && !this.itlcId.equals(other.itlcId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.ItensLocacao[ itlcId=" + itlcId + " ]";
    }
    
}
