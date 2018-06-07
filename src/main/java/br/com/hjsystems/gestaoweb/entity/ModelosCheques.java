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
@Table(name = "MODELOS_CHEQUES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ModelosCheques.findAll", query = "SELECT m FROM ModelosCheques m"),
    @NamedQuery(name = "ModelosCheques.findByMdchId", query = "SELECT m FROM ModelosCheques m WHERE m.mdchId = :mdchId"),
    @NamedQuery(name = "ModelosCheques.findByMdchNome", query = "SELECT m FROM ModelosCheques m WHERE m.mdchNome = :mdchNome"),
    @NamedQuery(name = "ModelosCheques.findByMdchAlturaPag", query = "SELECT m FROM ModelosCheques m WHERE m.mdchAlturaPag = :mdchAlturaPag"),
    @NamedQuery(name = "ModelosCheques.findByMdchLarguraPag", query = "SELECT m FROM ModelosCheques m WHERE m.mdchLarguraPag = :mdchLarguraPag"),
    @NamedQuery(name = "ModelosCheques.findByMdchRecuoLinhas", query = "SELECT m FROM ModelosCheques m WHERE m.mdchRecuoLinhas = :mdchRecuoLinhas"),
    @NamedQuery(name = "ModelosCheques.findByMdchLastupdate", query = "SELECT m FROM ModelosCheques m WHERE m.mdchLastupdate = :mdchLastupdate")})
public class ModelosCheques implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MDCH_ID")
    private String mdchId;
    @Column(name = "MDCH_NOME")
    private String mdchNome;
    @Column(name = "MDCH_ALTURA_PAG")
    private Integer mdchAlturaPag;
    @Column(name = "MDCH_LARGURA_PAG")
    private Integer mdchLarguraPag;
    @Column(name = "MDCH_RECUO_LINHAS")
    private Integer mdchRecuoLinhas;
    @Column(name = "MDCH_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mdchLastupdate;
    @JoinColumn(name = "BANC_ID", referencedColumnName = "BANC_ID")
    @ManyToOne
    private Bancos bancId;
    @OneToMany(mappedBy = "mdchId")
    private List<ConfiguracoesModelosCheques> configuracoesModelosChequesList;

    public ModelosCheques() {
    }

    public ModelosCheques(String mdchId) {
        this.mdchId = mdchId;
    }

    public String getMdchId() {
        return mdchId;
    }

    public void setMdchId(String mdchId) {
        this.mdchId = mdchId;
    }

    public String getMdchNome() {
        return mdchNome;
    }

    public void setMdchNome(String mdchNome) {
        this.mdchNome = mdchNome;
    }

    public Integer getMdchAlturaPag() {
        return mdchAlturaPag;
    }

    public void setMdchAlturaPag(Integer mdchAlturaPag) {
        this.mdchAlturaPag = mdchAlturaPag;
    }

    public Integer getMdchLarguraPag() {
        return mdchLarguraPag;
    }

    public void setMdchLarguraPag(Integer mdchLarguraPag) {
        this.mdchLarguraPag = mdchLarguraPag;
    }

    public Integer getMdchRecuoLinhas() {
        return mdchRecuoLinhas;
    }

    public void setMdchRecuoLinhas(Integer mdchRecuoLinhas) {
        this.mdchRecuoLinhas = mdchRecuoLinhas;
    }

    public Date getMdchLastupdate() {
        return mdchLastupdate;
    }

    public void setMdchLastupdate(Date mdchLastupdate) {
        this.mdchLastupdate = mdchLastupdate;
    }

    public Bancos getBancId() {
        return bancId;
    }

    public void setBancId(Bancos bancId) {
        this.bancId = bancId;
    }

    @XmlTransient
    public List<ConfiguracoesModelosCheques> getConfiguracoesModelosChequesList() {
        return configuracoesModelosChequesList;
    }

    public void setConfiguracoesModelosChequesList(List<ConfiguracoesModelosCheques> configuracoesModelosChequesList) {
        this.configuracoesModelosChequesList = configuracoesModelosChequesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mdchId != null ? mdchId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModelosCheques)) {
            return false;
        }
        ModelosCheques other = (ModelosCheques) object;
        if ((this.mdchId == null && other.mdchId != null) || (this.mdchId != null && !this.mdchId.equals(other.mdchId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.ModelosCheques[ mdchId=" + mdchId + " ]";
    }
    
}
