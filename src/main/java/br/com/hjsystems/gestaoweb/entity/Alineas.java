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
@Table(name = "ALINEAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Alineas.findAll", query = "SELECT a FROM Alineas a"),
    @NamedQuery(name = "Alineas.findByAlnaId", query = "SELECT a FROM Alineas a WHERE a.alnaId = :alnaId"),
    @NamedQuery(name = "Alineas.findByAlnaNome", query = "SELECT a FROM Alineas a WHERE a.alnaNome = :alnaNome"),
    @NamedQuery(name = "Alineas.findByAlnaCodigo", query = "SELECT a FROM Alineas a WHERE a.alnaCodigo = :alnaCodigo"),
    @NamedQuery(name = "Alineas.findByAlnaEfeito", query = "SELECT a FROM Alineas a WHERE a.alnaEfeito = :alnaEfeito"),
    @NamedQuery(name = "Alineas.findByAlnaLASTUPDATE", query = "SELECT a FROM Alineas a WHERE a.alnaLASTUPDATE = :alnaLASTUPDATE")})
public class Alineas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ALNA_ID")
    private String alnaId;
    @Column(name = "ALNA_NOME")
    private String alnaNome;
    @Basic(optional = false)
    @Column(name = "ALNA_CODIGO")
    private String alnaCodigo;
    @Basic(optional = false)
    @Column(name = "ALNA_EFEITO")
    private String alnaEfeito;
    @Column(name = "Alna_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date alnaLASTUPDATE;
    @OneToMany(mappedBy = "alnaId")
    private List<HistoricosParcela> historicosParcelaList;
    @OneToMany(mappedBy = "alnaId")
    private List<Parcelas> parcelasList;
    @OneToMany(mappedBy = "alnaId")
    private List<HistoricosCheques> historicosChequesList;

    public Alineas() {
    }

    public Alineas(String alnaId) {
        this.alnaId = alnaId;
    }

    public Alineas(String alnaId, String alnaCodigo, String alnaEfeito) {
        this.alnaId = alnaId;
        this.alnaCodigo = alnaCodigo;
        this.alnaEfeito = alnaEfeito;
    }

    public String getAlnaId() {
        return alnaId;
    }

    public void setAlnaId(String alnaId) {
        this.alnaId = alnaId;
    }

    public String getAlnaNome() {
        return alnaNome;
    }

    public void setAlnaNome(String alnaNome) {
        this.alnaNome = alnaNome;
    }

    public String getAlnaCodigo() {
        return alnaCodigo;
    }

    public void setAlnaCodigo(String alnaCodigo) {
        this.alnaCodigo = alnaCodigo;
    }

    public String getAlnaEfeito() {
        return alnaEfeito;
    }

    public void setAlnaEfeito(String alnaEfeito) {
        this.alnaEfeito = alnaEfeito;
    }

    public Date getAlnaLASTUPDATE() {
        return alnaLASTUPDATE;
    }

    public void setAlnaLASTUPDATE(Date alnaLASTUPDATE) {
        this.alnaLASTUPDATE = alnaLASTUPDATE;
    }

    @XmlTransient
    public List<HistoricosParcela> getHistoricosParcelaList() {
        return historicosParcelaList;
    }

    public void setHistoricosParcelaList(List<HistoricosParcela> historicosParcelaList) {
        this.historicosParcelaList = historicosParcelaList;
    }

    @XmlTransient
    public List<Parcelas> getParcelasList() {
        return parcelasList;
    }

    public void setParcelasList(List<Parcelas> parcelasList) {
        this.parcelasList = parcelasList;
    }

    @XmlTransient
    public List<HistoricosCheques> getHistoricosChequesList() {
        return historicosChequesList;
    }

    public void setHistoricosChequesList(List<HistoricosCheques> historicosChequesList) {
        this.historicosChequesList = historicosChequesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (alnaId != null ? alnaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Alineas)) {
            return false;
        }
        Alineas other = (Alineas) object;
        if ((this.alnaId == null && other.alnaId != null) || (this.alnaId != null && !this.alnaId.equals(other.alnaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.Alineas[ alnaId=" + alnaId + " ]";
    }
    
}
