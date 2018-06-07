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
@Table(name = "MODELOS_BOLETOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ModelosBoletos.findAll", query = "SELECT m FROM ModelosBoletos m"),
    @NamedQuery(name = "ModelosBoletos.findByMdblId", query = "SELECT m FROM ModelosBoletos m WHERE m.mdblId = :mdblId"),
    @NamedQuery(name = "ModelosBoletos.findByMdblNome", query = "SELECT m FROM ModelosBoletos m WHERE m.mdblNome = :mdblNome"),
    @NamedQuery(name = "ModelosBoletos.findByMdblAlturaPag", query = "SELECT m FROM ModelosBoletos m WHERE m.mdblAlturaPag = :mdblAlturaPag"),
    @NamedQuery(name = "ModelosBoletos.findByMdblLarguraPag", query = "SELECT m FROM ModelosBoletos m WHERE m.mdblLarguraPag = :mdblLarguraPag"),
    @NamedQuery(name = "ModelosBoletos.findByMdblRecuoLinhas", query = "SELECT m FROM ModelosBoletos m WHERE m.mdblRecuoLinhas = :mdblRecuoLinhas"),
    @NamedQuery(name = "ModelosBoletos.findByMdblLastupdate", query = "SELECT m FROM ModelosBoletos m WHERE m.mdblLastupdate = :mdblLastupdate")})
public class ModelosBoletos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MDBL_ID")
    private String mdblId;
    @Column(name = "MDBL_NOME")
    private String mdblNome;
    @Column(name = "MDBL_ALTURA_PAG")
    private Integer mdblAlturaPag;
    @Column(name = "MDBL_LARGURA_PAG")
    private Integer mdblLarguraPag;
    @Column(name = "MDBL_RECUO_LINHAS")
    private Integer mdblRecuoLinhas;
    @Column(name = "MDBL_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mdblLastupdate;
    @JoinColumn(name = "COFR_ID", referencedColumnName = "COFR_ID")
    @ManyToOne
    private Cofres cofrId;
    @OneToMany(mappedBy = "mdblId")
    private List<ConfiguracoesModelosBoletos> configuracoesModelosBoletosList;

    public ModelosBoletos() {
    }

    public ModelosBoletos(String mdblId) {
        this.mdblId = mdblId;
    }

    public String getMdblId() {
        return mdblId;
    }

    public void setMdblId(String mdblId) {
        this.mdblId = mdblId;
    }

    public String getMdblNome() {
        return mdblNome;
    }

    public void setMdblNome(String mdblNome) {
        this.mdblNome = mdblNome;
    }

    public Integer getMdblAlturaPag() {
        return mdblAlturaPag;
    }

    public void setMdblAlturaPag(Integer mdblAlturaPag) {
        this.mdblAlturaPag = mdblAlturaPag;
    }

    public Integer getMdblLarguraPag() {
        return mdblLarguraPag;
    }

    public void setMdblLarguraPag(Integer mdblLarguraPag) {
        this.mdblLarguraPag = mdblLarguraPag;
    }

    public Integer getMdblRecuoLinhas() {
        return mdblRecuoLinhas;
    }

    public void setMdblRecuoLinhas(Integer mdblRecuoLinhas) {
        this.mdblRecuoLinhas = mdblRecuoLinhas;
    }

    public Date getMdblLastupdate() {
        return mdblLastupdate;
    }

    public void setMdblLastupdate(Date mdblLastupdate) {
        this.mdblLastupdate = mdblLastupdate;
    }

    public Cofres getCofrId() {
        return cofrId;
    }

    public void setCofrId(Cofres cofrId) {
        this.cofrId = cofrId;
    }

    @XmlTransient
    public List<ConfiguracoesModelosBoletos> getConfiguracoesModelosBoletosList() {
        return configuracoesModelosBoletosList;
    }

    public void setConfiguracoesModelosBoletosList(List<ConfiguracoesModelosBoletos> configuracoesModelosBoletosList) {
        this.configuracoesModelosBoletosList = configuracoesModelosBoletosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mdblId != null ? mdblId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModelosBoletos)) {
            return false;
        }
        ModelosBoletos other = (ModelosBoletos) object;
        if ((this.mdblId == null && other.mdblId != null) || (this.mdblId != null && !this.mdblId.equals(other.mdblId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.ModelosBoletos[ mdblId=" + mdblId + " ]";
    }
    
}
