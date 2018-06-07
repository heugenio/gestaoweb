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
@Table(name = "LOCACOESEQPT_CONTAGENS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LocacoeseqptContagens.findAll", query = "SELECT l FROM LocacoeseqptContagens l"),
    @NamedQuery(name = "LocacoeseqptContagens.findByLectId", query = "SELECT l FROM LocacoeseqptContagens l WHERE l.lectId = :lectId"),
    @NamedQuery(name = "LocacoeseqptContagens.findByLectHdometro", query = "SELECT l FROM LocacoeseqptContagens l WHERE l.lectHdometro = :lectHdometro"),
    @NamedQuery(name = "LocacoeseqptContagens.findByLectData", query = "SELECT l FROM LocacoeseqptContagens l WHERE l.lectData = :lectData"),
    @NamedQuery(name = "LocacoeseqptContagens.findByLectStatus", query = "SELECT l FROM LocacoeseqptContagens l WHERE l.lectStatus = :lectStatus"),
    @NamedQuery(name = "LocacoeseqptContagens.findByLectLastupdate", query = "SELECT l FROM LocacoeseqptContagens l WHERE l.lectLastupdate = :lectLastupdate"),
    @NamedQuery(name = "LocacoeseqptContagens.findByLectQtdPagTeste", query = "SELECT l FROM LocacoeseqptContagens l WHERE l.lectQtdPagTeste = :lectQtdPagTeste"),
    @NamedQuery(name = "LocacoeseqptContagens.findByLectHodoInicial", query = "SELECT l FROM LocacoeseqptContagens l WHERE l.lectHodoInicial = :lectHodoInicial"),
    @NamedQuery(name = "LocacoeseqptContagens.findByLoccUsarFranquiaGeral", query = "SELECT l FROM LocacoeseqptContagens l WHERE l.loccUsarFranquiaGeral = :loccUsarFranquiaGeral"),
    @NamedQuery(name = "LocacoeseqptContagens.findByLoccFranquiaGeral", query = "SELECT l FROM LocacoeseqptContagens l WHERE l.loccFranquiaGeral = :loccFranquiaGeral"),
    @NamedQuery(name = "LocacoeseqptContagens.findByLoccVlrFranquiaGeral", query = "SELECT l FROM LocacoeseqptContagens l WHERE l.loccVlrFranquiaGeral = :loccVlrFranquiaGeral"),
    @NamedQuery(name = "LocacoeseqptContagens.findByLoccValorAdicGeral", query = "SELECT l FROM LocacoeseqptContagens l WHERE l.loccValorAdicGeral = :loccValorAdicGeral"),
    @NamedQuery(name = "LocacoeseqptContagens.findByLceqFranquia", query = "SELECT l FROM LocacoeseqptContagens l WHERE l.lceqFranquia = :lceqFranquia"),
    @NamedQuery(name = "LocacoeseqptContagens.findByLceqValorFranquia", query = "SELECT l FROM LocacoeseqptContagens l WHERE l.lceqValorFranquia = :lceqValorFranquia"),
    @NamedQuery(name = "LocacoeseqptContagens.findByLceqValorAdicionais", query = "SELECT l FROM LocacoeseqptContagens l WHERE l.lceqValorAdicionais = :lceqValorAdicionais"),
    @NamedQuery(name = "LocacoeseqptContagens.findByLectCustoEqpt", query = "SELECT l FROM LocacoeseqptContagens l WHERE l.lectCustoEqpt = :lectCustoEqpt")})
public class LocacoeseqptContagens implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LECT_ID")
    private String lectId;
    @Column(name = "LECT_HDOMETRO")
    private Long lectHdometro;
    @Column(name = "LECT_DATA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lectData;
    @Basic(optional = false)
    @Column(name = "LECT_STATUS")
    private String lectStatus;
    @Column(name = "LECT_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lectLastupdate;
    @Column(name = "LECT_QTD_PAG_TESTE")
    private Integer lectQtdPagTeste;
    @Column(name = "LECT_HODO_INICIAL")
    private Long lectHodoInicial;
    @Column(name = "LOCC_USAR_FRANQUIA_GERAL")
    private String loccUsarFranquiaGeral;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "LOCC_FRANQUIA_GERAL")
    private BigDecimal loccFranquiaGeral;
    @Column(name = "LOCC_VLR_FRANQUIA_GERAL")
    private BigDecimal loccVlrFranquiaGeral;
    @Column(name = "LOCC_VALOR_ADIC_GERAL")
    private BigDecimal loccValorAdicGeral;
    @Column(name = "LCEQ_FRANQUIA")
    private BigDecimal lceqFranquia;
    @Column(name = "LCEQ_VALOR_FRANQUIA")
    private BigDecimal lceqValorFranquia;
    @Column(name = "LCEQ_VALOR_ADICIONAIS")
    private BigDecimal lceqValorAdicionais;
    @Column(name = "LECT_CUSTO_EQPT")
    private BigDecimal lectCustoEqpt;
    @JoinColumn(name = "LCEQ_ID", referencedColumnName = "LCEQ_ID")
    @ManyToOne
    private LocacoesEquipamentos lceqId;

    public LocacoeseqptContagens() {
    }

    public LocacoeseqptContagens(String lectId) {
        this.lectId = lectId;
    }

    public LocacoeseqptContagens(String lectId, String lectStatus) {
        this.lectId = lectId;
        this.lectStatus = lectStatus;
    }

    public String getLectId() {
        return lectId;
    }

    public void setLectId(String lectId) {
        this.lectId = lectId;
    }

    public Long getLectHdometro() {
        return lectHdometro;
    }

    public void setLectHdometro(Long lectHdometro) {
        this.lectHdometro = lectHdometro;
    }

    public Date getLectData() {
        return lectData;
    }

    public void setLectData(Date lectData) {
        this.lectData = lectData;
    }

    public String getLectStatus() {
        return lectStatus;
    }

    public void setLectStatus(String lectStatus) {
        this.lectStatus = lectStatus;
    }

    public Date getLectLastupdate() {
        return lectLastupdate;
    }

    public void setLectLastupdate(Date lectLastupdate) {
        this.lectLastupdate = lectLastupdate;
    }

    public Integer getLectQtdPagTeste() {
        return lectQtdPagTeste;
    }

    public void setLectQtdPagTeste(Integer lectQtdPagTeste) {
        this.lectQtdPagTeste = lectQtdPagTeste;
    }

    public Long getLectHodoInicial() {
        return lectHodoInicial;
    }

    public void setLectHodoInicial(Long lectHodoInicial) {
        this.lectHodoInicial = lectHodoInicial;
    }

    public String getLoccUsarFranquiaGeral() {
        return loccUsarFranquiaGeral;
    }

    public void setLoccUsarFranquiaGeral(String loccUsarFranquiaGeral) {
        this.loccUsarFranquiaGeral = loccUsarFranquiaGeral;
    }

    public BigDecimal getLoccFranquiaGeral() {
        return loccFranquiaGeral;
    }

    public void setLoccFranquiaGeral(BigDecimal loccFranquiaGeral) {
        this.loccFranquiaGeral = loccFranquiaGeral;
    }

    public BigDecimal getLoccVlrFranquiaGeral() {
        return loccVlrFranquiaGeral;
    }

    public void setLoccVlrFranquiaGeral(BigDecimal loccVlrFranquiaGeral) {
        this.loccVlrFranquiaGeral = loccVlrFranquiaGeral;
    }

    public BigDecimal getLoccValorAdicGeral() {
        return loccValorAdicGeral;
    }

    public void setLoccValorAdicGeral(BigDecimal loccValorAdicGeral) {
        this.loccValorAdicGeral = loccValorAdicGeral;
    }

    public BigDecimal getLceqFranquia() {
        return lceqFranquia;
    }

    public void setLceqFranquia(BigDecimal lceqFranquia) {
        this.lceqFranquia = lceqFranquia;
    }

    public BigDecimal getLceqValorFranquia() {
        return lceqValorFranquia;
    }

    public void setLceqValorFranquia(BigDecimal lceqValorFranquia) {
        this.lceqValorFranquia = lceqValorFranquia;
    }

    public BigDecimal getLceqValorAdicionais() {
        return lceqValorAdicionais;
    }

    public void setLceqValorAdicionais(BigDecimal lceqValorAdicionais) {
        this.lceqValorAdicionais = lceqValorAdicionais;
    }

    public BigDecimal getLectCustoEqpt() {
        return lectCustoEqpt;
    }

    public void setLectCustoEqpt(BigDecimal lectCustoEqpt) {
        this.lectCustoEqpt = lectCustoEqpt;
    }

    public LocacoesEquipamentos getLceqId() {
        return lceqId;
    }

    public void setLceqId(LocacoesEquipamentos lceqId) {
        this.lceqId = lceqId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lectId != null ? lectId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LocacoeseqptContagens)) {
            return false;
        }
        LocacoeseqptContagens other = (LocacoeseqptContagens) object;
        if ((this.lectId == null && other.lectId != null) || (this.lectId != null && !this.lectId.equals(other.lectId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.LocacoeseqptContagens[ lectId=" + lectId + " ]";
    }
    
}
