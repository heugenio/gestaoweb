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
@Table(name = "INDEXADORES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Indexadores.findAll", query = "SELECT i FROM Indexadores i"),
    @NamedQuery(name = "Indexadores.findByIndxId", query = "SELECT i FROM Indexadores i WHERE i.indxId = :indxId"),
    @NamedQuery(name = "Indexadores.findByIndxNome", query = "SELECT i FROM Indexadores i WHERE i.indxNome = :indxNome"),
    @NamedQuery(name = "Indexadores.findByIndxSigla", query = "SELECT i FROM Indexadores i WHERE i.indxSigla = :indxSigla"),
    @NamedQuery(name = "Indexadores.findByIndxTipoReajuste", query = "SELECT i FROM Indexadores i WHERE i.indxTipoReajuste = :indxTipoReajuste"),
    @NamedQuery(name = "Indexadores.findByIndxTipoDataReajuste", query = "SELECT i FROM Indexadores i WHERE i.indxTipoDataReajuste = :indxTipoDataReajuste"),
    @NamedQuery(name = "Indexadores.findByIndxCalcularJuros", query = "SELECT i FROM Indexadores i WHERE i.indxCalcularJuros = :indxCalcularJuros"),
    @NamedQuery(name = "Indexadores.findByIndxCalcularMulta", query = "SELECT i FROM Indexadores i WHERE i.indxCalcularMulta = :indxCalcularMulta"),
    @NamedQuery(name = "Indexadores.findByIndxLASTUPDATE", query = "SELECT i FROM Indexadores i WHERE i.indxLASTUPDATE = :indxLASTUPDATE")})
public class Indexadores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "INDX_ID")
    private String indxId;
    @Basic(optional = false)
    @Column(name = "INDX_NOME")
    private String indxNome;
    @Basic(optional = false)
    @Column(name = "INDX_SIGLA")
    private String indxSigla;
    @Basic(optional = false)
    @Column(name = "INDX_TIPO_REAJUSTE")
    private String indxTipoReajuste;
    @Basic(optional = false)
    @Column(name = "INDX_TIPO_DATA_REAJUSTE")
    private String indxTipoDataReajuste;
    @Basic(optional = false)
    @Column(name = "INDX_CALCULAR_JUROS")
    private String indxCalcularJuros;
    @Basic(optional = false)
    @Column(name = "INDX_CALCULAR_MULTA")
    private String indxCalcularMulta;
    @Column(name = "Indx_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date indxLASTUPDATE;
    @OneToMany(mappedBy = "indxId")
    private List<Locacoes> locacoesList;
    @OneToMany(mappedBy = "indxId")
    private List<Parcelas> parcelasList;
    @OneToMany(mappedBy = "indxId")
    private List<Patrimonio> patrimonioList;
    @OneToMany(mappedBy = "indxId")
    private List<CotacoesIndexadores> cotacoesIndexadoresList;

    public Indexadores() {
    }

    public Indexadores(String indxId) {
        this.indxId = indxId;
    }

    public Indexadores(String indxId, String indxNome, String indxSigla, String indxTipoReajuste, String indxTipoDataReajuste, String indxCalcularJuros, String indxCalcularMulta) {
        this.indxId = indxId;
        this.indxNome = indxNome;
        this.indxSigla = indxSigla;
        this.indxTipoReajuste = indxTipoReajuste;
        this.indxTipoDataReajuste = indxTipoDataReajuste;
        this.indxCalcularJuros = indxCalcularJuros;
        this.indxCalcularMulta = indxCalcularMulta;
    }

    public String getIndxId() {
        return indxId;
    }

    public void setIndxId(String indxId) {
        this.indxId = indxId;
    }

    public String getIndxNome() {
        return indxNome;
    }

    public void setIndxNome(String indxNome) {
        this.indxNome = indxNome;
    }

    public String getIndxSigla() {
        return indxSigla;
    }

    public void setIndxSigla(String indxSigla) {
        this.indxSigla = indxSigla;
    }

    public String getIndxTipoReajuste() {
        return indxTipoReajuste;
    }

    public void setIndxTipoReajuste(String indxTipoReajuste) {
        this.indxTipoReajuste = indxTipoReajuste;
    }

    public String getIndxTipoDataReajuste() {
        return indxTipoDataReajuste;
    }

    public void setIndxTipoDataReajuste(String indxTipoDataReajuste) {
        this.indxTipoDataReajuste = indxTipoDataReajuste;
    }

    public String getIndxCalcularJuros() {
        return indxCalcularJuros;
    }

    public void setIndxCalcularJuros(String indxCalcularJuros) {
        this.indxCalcularJuros = indxCalcularJuros;
    }

    public String getIndxCalcularMulta() {
        return indxCalcularMulta;
    }

    public void setIndxCalcularMulta(String indxCalcularMulta) {
        this.indxCalcularMulta = indxCalcularMulta;
    }

    public Date getIndxLASTUPDATE() {
        return indxLASTUPDATE;
    }

    public void setIndxLASTUPDATE(Date indxLASTUPDATE) {
        this.indxLASTUPDATE = indxLASTUPDATE;
    }

    @XmlTransient
    public List<Locacoes> getLocacoesList() {
        return locacoesList;
    }

    public void setLocacoesList(List<Locacoes> locacoesList) {
        this.locacoesList = locacoesList;
    }

    @XmlTransient
    public List<Parcelas> getParcelasList() {
        return parcelasList;
    }

    public void setParcelasList(List<Parcelas> parcelasList) {
        this.parcelasList = parcelasList;
    }

    @XmlTransient
    public List<Patrimonio> getPatrimonioList() {
        return patrimonioList;
    }

    public void setPatrimonioList(List<Patrimonio> patrimonioList) {
        this.patrimonioList = patrimonioList;
    }

    @XmlTransient
    public List<CotacoesIndexadores> getCotacoesIndexadoresList() {
        return cotacoesIndexadoresList;
    }

    public void setCotacoesIndexadoresList(List<CotacoesIndexadores> cotacoesIndexadoresList) {
        this.cotacoesIndexadoresList = cotacoesIndexadoresList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (indxId != null ? indxId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Indexadores)) {
            return false;
        }
        Indexadores other = (Indexadores) object;
        if ((this.indxId == null && other.indxId != null) || (this.indxId != null && !this.indxId.equals(other.indxId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.Indexadores[ indxId=" + indxId + " ]";
    }
    
}
