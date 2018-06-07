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
@Table(name = "TABELAPRECOS_TIPOSPESSOAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TabelaprecosTipospessoas.findAll", query = "SELECT t FROM TabelaprecosTipospessoas t"),
    @NamedQuery(name = "TabelaprecosTipospessoas.findByTprpId", query = "SELECT t FROM TabelaprecosTipospessoas t WHERE t.tprpId = :tprpId"),
    @NamedQuery(name = "TabelaprecosTipospessoas.findByTprpIndicePreco", query = "SELECT t FROM TabelaprecosTipospessoas t WHERE t.tprpIndicePreco = :tprpIndicePreco"),
    @NamedQuery(name = "TabelaprecosTipospessoas.findByTprpIndiceVariacao", query = "SELECT t FROM TabelaprecosTipospessoas t WHERE t.tprpIndiceVariacao = :tprpIndiceVariacao"),
    @NamedQuery(name = "TabelaprecosTipospessoas.findByTprpLastupdate", query = "SELECT t FROM TabelaprecosTipospessoas t WHERE t.tprpLastupdate = :tprpLastupdate")})
public class TabelaprecosTipospessoas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TPRP_ID")
    private String tprpId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "TPRP_INDICE_PRECO")
    private BigDecimal tprpIndicePreco;
    @Basic(optional = false)
    @Column(name = "TPRP_INDICE_VARIACAO")
    private BigDecimal tprpIndiceVariacao;
    @Column(name = "TPRP_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tprpLastupdate;
    @JoinColumn(name = "TBPV_ID", referencedColumnName = "TBPV_ID")
    @ManyToOne
    private TabelasPrecosVigencias tbpvId;
    @JoinColumn(name = "TPPS_ID", referencedColumnName = "TPPS_ID")
    @ManyToOne
    private TiposPessoas tppsId;

    public TabelaprecosTipospessoas() {
    }

    public TabelaprecosTipospessoas(String tprpId) {
        this.tprpId = tprpId;
    }

    public TabelaprecosTipospessoas(String tprpId, BigDecimal tprpIndicePreco, BigDecimal tprpIndiceVariacao) {
        this.tprpId = tprpId;
        this.tprpIndicePreco = tprpIndicePreco;
        this.tprpIndiceVariacao = tprpIndiceVariacao;
    }

    public String getTprpId() {
        return tprpId;
    }

    public void setTprpId(String tprpId) {
        this.tprpId = tprpId;
    }

    public BigDecimal getTprpIndicePreco() {
        return tprpIndicePreco;
    }

    public void setTprpIndicePreco(BigDecimal tprpIndicePreco) {
        this.tprpIndicePreco = tprpIndicePreco;
    }

    public BigDecimal getTprpIndiceVariacao() {
        return tprpIndiceVariacao;
    }

    public void setTprpIndiceVariacao(BigDecimal tprpIndiceVariacao) {
        this.tprpIndiceVariacao = tprpIndiceVariacao;
    }

    public Date getTprpLastupdate() {
        return tprpLastupdate;
    }

    public void setTprpLastupdate(Date tprpLastupdate) {
        this.tprpLastupdate = tprpLastupdate;
    }

    public TabelasPrecosVigencias getTbpvId() {
        return tbpvId;
    }

    public void setTbpvId(TabelasPrecosVigencias tbpvId) {
        this.tbpvId = tbpvId;
    }

    public TiposPessoas getTppsId() {
        return tppsId;
    }

    public void setTppsId(TiposPessoas tppsId) {
        this.tppsId = tppsId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tprpId != null ? tprpId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TabelaprecosTipospessoas)) {
            return false;
        }
        TabelaprecosTipospessoas other = (TabelaprecosTipospessoas) object;
        if ((this.tprpId == null && other.tprpId != null) || (this.tprpId != null && !this.tprpId.equals(other.tprpId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.TabelaprecosTipospessoas[ tprpId=" + tprpId + " ]";
    }
    
}
