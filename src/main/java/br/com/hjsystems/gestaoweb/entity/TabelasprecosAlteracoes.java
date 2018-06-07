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
@Table(name = "TABELASPRECOS_ALTERACOES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TabelasprecosAlteracoes.findAll", query = "SELECT t FROM TabelasprecosAlteracoes t"),
    @NamedQuery(name = "TabelasprecosAlteracoes.findByTbpaId", query = "SELECT t FROM TabelasprecosAlteracoes t WHERE t.tbpaId = :tbpaId"),
    @NamedQuery(name = "TabelasprecosAlteracoes.findByTbpaIndice", query = "SELECT t FROM TabelasprecosAlteracoes t WHERE t.tbpaIndice = :tbpaIndice"),
    @NamedQuery(name = "TabelasprecosAlteracoes.findByTbpaLastupdate", query = "SELECT t FROM TabelasprecosAlteracoes t WHERE t.tbpaLastupdate = :tbpaLastupdate")})
public class TabelasprecosAlteracoes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TBPA_ID")
    private String tbpaId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "TBPA_INDICE")
    private BigDecimal tbpaIndice;
    @Column(name = "TBPA_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tbpaLastupdate;
    @JoinColumn(name = "TAB_TBPC_ID", referencedColumnName = "TBPC_ID")
    @ManyToOne
    private TabelasPrecos tabTbpcId;
    @JoinColumn(name = "TBPC_ID", referencedColumnName = "TBPC_ID")
    @ManyToOne
    private TabelasPrecos tbpcId;

    public TabelasprecosAlteracoes() {
    }

    public TabelasprecosAlteracoes(String tbpaId) {
        this.tbpaId = tbpaId;
    }

    public TabelasprecosAlteracoes(String tbpaId, BigDecimal tbpaIndice) {
        this.tbpaId = tbpaId;
        this.tbpaIndice = tbpaIndice;
    }

    public String getTbpaId() {
        return tbpaId;
    }

    public void setTbpaId(String tbpaId) {
        this.tbpaId = tbpaId;
    }

    public BigDecimal getTbpaIndice() {
        return tbpaIndice;
    }

    public void setTbpaIndice(BigDecimal tbpaIndice) {
        this.tbpaIndice = tbpaIndice;
    }

    public Date getTbpaLastupdate() {
        return tbpaLastupdate;
    }

    public void setTbpaLastupdate(Date tbpaLastupdate) {
        this.tbpaLastupdate = tbpaLastupdate;
    }

    public TabelasPrecos getTabTbpcId() {
        return tabTbpcId;
    }

    public void setTabTbpcId(TabelasPrecos tabTbpcId) {
        this.tabTbpcId = tabTbpcId;
    }

    public TabelasPrecos getTbpcId() {
        return tbpcId;
    }

    public void setTbpcId(TabelasPrecos tbpcId) {
        this.tbpcId = tbpcId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tbpaId != null ? tbpaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TabelasprecosAlteracoes)) {
            return false;
        }
        TabelasprecosAlteracoes other = (TabelasprecosAlteracoes) object;
        if ((this.tbpaId == null && other.tbpaId != null) || (this.tbpaId != null && !this.tbpaId.equals(other.tbpaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.TabelasprecosAlteracoes[ tbpaId=" + tbpaId + " ]";
    }
    
}
