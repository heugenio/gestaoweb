/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hjsystems.gestaoweb.entity;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "ITENS_PRE_RESERVADOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ItensPreReservados.findAll", query = "SELECT i FROM ItensPreReservados i"),
    @NamedQuery(name = "ItensPreReservados.findByItprId", query = "SELECT i FROM ItensPreReservados i WHERE i.itprId = :itprId"),
    @NamedQuery(name = "ItensPreReservados.findByItpdId", query = "SELECT i FROM ItensPreReservados i WHERE i.itpdId = :itpdId"),
    @NamedQuery(name = "ItensPreReservados.findByItprQtde", query = "SELECT i FROM ItensPreReservados i WHERE i.itprQtde = :itprQtde"),
    @NamedQuery(name = "ItensPreReservados.findByItprUnidSigla", query = "SELECT i FROM ItensPreReservados i WHERE i.itprUnidSigla = :itprUnidSigla"),
    @NamedQuery(name = "ItensPreReservados.findByItprSbupMultiplicador", query = "SELECT i FROM ItensPreReservados i WHERE i.itprSbupMultiplicador = :itprSbupMultiplicador"),
    @NamedQuery(name = "ItensPreReservados.findByItprData", query = "SELECT i FROM ItensPreReservados i WHERE i.itprData = :itprData"),
    @NamedQuery(name = "ItensPreReservados.findByItprValidade", query = "SELECT i FROM ItensPreReservados i WHERE i.itprValidade = :itprValidade"),
    @NamedQuery(name = "ItensPreReservados.findByItprLastupdate", query = "SELECT i FROM ItensPreReservados i WHERE i.itprLastupdate = :itprLastupdate")})
public class ItensPreReservados implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ITPR_ID")
    private String itprId;
    @Basic(optional = false)
    @Column(name = "ITPD_ID")
    private String itpdId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "ITPR_QTDE")
    private BigDecimal itprQtde;
    @Basic(optional = false)
    @Column(name = "ITPR_UNID_SIGLA")
    private String itprUnidSigla;
    @Basic(optional = false)
    @Column(name = "ITPR_SBUP_MULTIPLICADOR")
    private BigDecimal itprSbupMultiplicador;
    @Basic(optional = false)
    @Column(name = "ITPR_DATA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date itprData;
    @Basic(optional = false)
    @Column(name = "ITPR_VALIDADE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date itprValidade;
    @Column(name = "ITPR_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date itprLastupdate;
    @JoinColumn(name = "TEST_ID", referencedColumnName = "TEST_ID")
    @ManyToOne
    private TiposEstoques testId;

    public ItensPreReservados() {
    }

    public ItensPreReservados(String itprId) {
        this.itprId = itprId;
    }

    public ItensPreReservados(String itprId, String itpdId, BigDecimal itprQtde, String itprUnidSigla, BigDecimal itprSbupMultiplicador, Date itprData, Date itprValidade) {
        this.itprId = itprId;
        this.itpdId = itpdId;
        this.itprQtde = itprQtde;
        this.itprUnidSigla = itprUnidSigla;
        this.itprSbupMultiplicador = itprSbupMultiplicador;
        this.itprData = itprData;
        this.itprValidade = itprValidade;
    }

    public String getItprId() {
        return itprId;
    }

    public void setItprId(String itprId) {
        this.itprId = itprId;
    }

    public String getItpdId() {
        return itpdId;
    }

    public void setItpdId(String itpdId) {
        this.itpdId = itpdId;
    }

    public BigDecimal getItprQtde() {
        return itprQtde;
    }

    public void setItprQtde(BigDecimal itprQtde) {
        this.itprQtde = itprQtde;
    }

    public String getItprUnidSigla() {
        return itprUnidSigla;
    }

    public void setItprUnidSigla(String itprUnidSigla) {
        this.itprUnidSigla = itprUnidSigla;
    }

    public BigDecimal getItprSbupMultiplicador() {
        return itprSbupMultiplicador;
    }

    public void setItprSbupMultiplicador(BigDecimal itprSbupMultiplicador) {
        this.itprSbupMultiplicador = itprSbupMultiplicador;
    }

    public Date getItprData() {
        return itprData;
    }

    public void setItprData(Date itprData) {
        this.itprData = itprData;
    }

    public Date getItprValidade() {
        return itprValidade;
    }

    public void setItprValidade(Date itprValidade) {
        this.itprValidade = itprValidade;
    }

    public Date getItprLastupdate() {
        return itprLastupdate;
    }

    public void setItprLastupdate(Date itprLastupdate) {
        this.itprLastupdate = itprLastupdate;
    }

    public TiposEstoques getTestId() {
        return testId;
    }

    public void setTestId(TiposEstoques testId) {
        this.testId = testId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itprId != null ? itprId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItensPreReservados)) {
            return false;
        }
        ItensPreReservados other = (ItensPreReservados) object;
        if ((this.itprId == null && other.itprId != null) || (this.itprId != null && !this.itprId.equals(other.itprId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.ItensPreReservados[ itprId=" + itprId + " ]";
    }
    
}
