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
@Table(name = "TECNICO_COMISSOES_TECNICOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TecnicoComissoesTecnicos.findAll", query = "SELECT t FROM TecnicoComissoesTecnicos t"),
    @NamedQuery(name = "TecnicoComissoesTecnicos.findByTcctId", query = "SELECT t FROM TecnicoComissoesTecnicos t WHERE t.tcctId = :tcctId"),
    @NamedQuery(name = "TecnicoComissoesTecnicos.findByTcctLastupdate", query = "SELECT t FROM TecnicoComissoesTecnicos t WHERE t.tcctLastupdate = :tcctLastupdate"),
    @NamedQuery(name = "TecnicoComissoesTecnicos.findByGrpoId", query = "SELECT t FROM TecnicoComissoesTecnicos t WHERE t.grpoId = :grpoId"),
    @NamedQuery(name = "TecnicoComissoesTecnicos.findByFsprId", query = "SELECT t FROM TecnicoComissoesTecnicos t WHERE t.fsprId = :fsprId"),
    @NamedQuery(name = "TecnicoComissoesTecnicos.findByTcctValor", query = "SELECT t FROM TecnicoComissoesTecnicos t WHERE t.tcctValor = :tcctValor"),
    @NamedQuery(name = "TecnicoComissoesTecnicos.findByTcctPerc", query = "SELECT t FROM TecnicoComissoesTecnicos t WHERE t.tcctPerc = :tcctPerc")})
public class TecnicoComissoesTecnicos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TCCT_ID")
    private String tcctId;
    @Column(name = "TCCT_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tcctLastupdate;
    @Column(name = "GRPO_ID")
    private String grpoId;
    @Column(name = "FSPR_ID")
    private String fsprId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TCCT_VALOR")
    private BigDecimal tcctValor;
    @Column(name = "TCCT_PERC")
    private BigDecimal tcctPerc;
    @JoinColumn(name = "CMTC_ID", referencedColumnName = "CMTC_ID")
    @ManyToOne
    private ComissoesTecnicos cmtcId;
    @JoinColumn(name = "TCNC_ID", referencedColumnName = "TCNC_ID")
    @ManyToOne
    private Tecnico tcncId;

    public TecnicoComissoesTecnicos() {
    }

    public TecnicoComissoesTecnicos(String tcctId) {
        this.tcctId = tcctId;
    }

    public String getTcctId() {
        return tcctId;
    }

    public void setTcctId(String tcctId) {
        this.tcctId = tcctId;
    }

    public Date getTcctLastupdate() {
        return tcctLastupdate;
    }

    public void setTcctLastupdate(Date tcctLastupdate) {
        this.tcctLastupdate = tcctLastupdate;
    }

    public String getGrpoId() {
        return grpoId;
    }

    public void setGrpoId(String grpoId) {
        this.grpoId = grpoId;
    }

    public String getFsprId() {
        return fsprId;
    }

    public void setFsprId(String fsprId) {
        this.fsprId = fsprId;
    }

    public BigDecimal getTcctValor() {
        return tcctValor;
    }

    public void setTcctValor(BigDecimal tcctValor) {
        this.tcctValor = tcctValor;
    }

    public BigDecimal getTcctPerc() {
        return tcctPerc;
    }

    public void setTcctPerc(BigDecimal tcctPerc) {
        this.tcctPerc = tcctPerc;
    }

    public ComissoesTecnicos getCmtcId() {
        return cmtcId;
    }

    public void setCmtcId(ComissoesTecnicos cmtcId) {
        this.cmtcId = cmtcId;
    }

    public Tecnico getTcncId() {
        return tcncId;
    }

    public void setTcncId(Tecnico tcncId) {
        this.tcncId = tcncId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tcctId != null ? tcctId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TecnicoComissoesTecnicos)) {
            return false;
        }
        TecnicoComissoesTecnicos other = (TecnicoComissoesTecnicos) object;
        if ((this.tcctId == null && other.tcctId != null) || (this.tcctId != null && !this.tcctId.equals(other.tcctId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.TecnicoComissoesTecnicos[ tcctId=" + tcctId + " ]";
    }
    
}
