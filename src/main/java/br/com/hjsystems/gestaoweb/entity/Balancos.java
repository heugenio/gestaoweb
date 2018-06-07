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
@Table(name = "BALANCOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Balancos.findAll", query = "SELECT b FROM Balancos b"),
    @NamedQuery(name = "Balancos.findByBlncId", query = "SELECT b FROM Balancos b WHERE b.blncId = :blncId"),
    @NamedQuery(name = "Balancos.findByBlncNumero", query = "SELECT b FROM Balancos b WHERE b.blncNumero = :blncNumero"),
    @NamedQuery(name = "Balancos.findByBlncDtInicial", query = "SELECT b FROM Balancos b WHERE b.blncDtInicial = :blncDtInicial"),
    @NamedQuery(name = "Balancos.findByBlncDtFinal", query = "SELECT b FROM Balancos b WHERE b.blncDtFinal = :blncDtFinal"),
    @NamedQuery(name = "Balancos.findByBlncCorredor", query = "SELECT b FROM Balancos b WHERE b.blncCorredor = :blncCorredor"),
    @NamedQuery(name = "Balancos.findByBlncLastupdate", query = "SELECT b FROM Balancos b WHERE b.blncLastupdate = :blncLastupdate")})
public class Balancos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "BLNC_ID")
    private String blncId;
    @Column(name = "BLNC_NUMERO")
    private String blncNumero;
    @Column(name = "BLNC_DT_INICIAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date blncDtInicial;
    @Column(name = "BLNC_DT_FINAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date blncDtFinal;
    @Column(name = "BLNC_CORREDOR")
    private String blncCorredor;
    @Column(name = "BLNC_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date blncLastupdate;
    @OneToMany(mappedBy = "blncId")
    private List<BalancosProdutos> balancosProdutosList;
    @JoinColumn(name = "MARC_ID", referencedColumnName = "MARC_ID")
    @ManyToOne
    private Marcas marcId;
    @JoinColumn(name = "USRS_ID", referencedColumnName = "USRS_ID")
    @ManyToOne
    private Usuarios usrsId;

    public Balancos() {
    }

    public Balancos(String blncId) {
        this.blncId = blncId;
    }

    public String getBlncId() {
        return blncId;
    }

    public void setBlncId(String blncId) {
        this.blncId = blncId;
    }

    public String getBlncNumero() {
        return blncNumero;
    }

    public void setBlncNumero(String blncNumero) {
        this.blncNumero = blncNumero;
    }

    public Date getBlncDtInicial() {
        return blncDtInicial;
    }

    public void setBlncDtInicial(Date blncDtInicial) {
        this.blncDtInicial = blncDtInicial;
    }

    public Date getBlncDtFinal() {
        return blncDtFinal;
    }

    public void setBlncDtFinal(Date blncDtFinal) {
        this.blncDtFinal = blncDtFinal;
    }

    public String getBlncCorredor() {
        return blncCorredor;
    }

    public void setBlncCorredor(String blncCorredor) {
        this.blncCorredor = blncCorredor;
    }

    public Date getBlncLastupdate() {
        return blncLastupdate;
    }

    public void setBlncLastupdate(Date blncLastupdate) {
        this.blncLastupdate = blncLastupdate;
    }

    @XmlTransient
    public List<BalancosProdutos> getBalancosProdutosList() {
        return balancosProdutosList;
    }

    public void setBalancosProdutosList(List<BalancosProdutos> balancosProdutosList) {
        this.balancosProdutosList = balancosProdutosList;
    }

    public Marcas getMarcId() {
        return marcId;
    }

    public void setMarcId(Marcas marcId) {
        this.marcId = marcId;
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
        hash += (blncId != null ? blncId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Balancos)) {
            return false;
        }
        Balancos other = (Balancos) object;
        if ((this.blncId == null && other.blncId != null) || (this.blncId != null && !this.blncId.equals(other.blncId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.Balancos[ blncId=" + blncId + " ]";
    }
    
}
