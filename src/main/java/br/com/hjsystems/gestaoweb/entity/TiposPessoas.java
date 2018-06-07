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
@Table(name = "TIPOS_PESSOAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TiposPessoas.findAll", query = "SELECT t FROM TiposPessoas t"),
    @NamedQuery(name = "TiposPessoas.findByTppsId", query = "SELECT t FROM TiposPessoas t WHERE t.tppsId = :tppsId"),
    @NamedQuery(name = "TiposPessoas.findByTppsNome", query = "SELECT t FROM TiposPessoas t WHERE t.tppsNome = :tppsNome"),
    @NamedQuery(name = "TiposPessoas.findByTppsTipo", query = "SELECT t FROM TiposPessoas t WHERE t.tppsTipo = :tppsTipo"),
    @NamedQuery(name = "TiposPessoas.findByTppsLastupdate", query = "SELECT t FROM TiposPessoas t WHERE t.tppsLastupdate = :tppsLastupdate")})
public class TiposPessoas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TPPS_ID")
    private String tppsId;
    @Column(name = "TPPS_NOME")
    private String tppsNome;
    @Column(name = "TPPS_TIPO")
    private String tppsTipo;
    @Column(name = "TPPS_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tppsLastupdate;
    @OneToMany(mappedBy = "tppsId")
    private List<PessoasTipospessoas> pessoasTipospessoasList;
    @OneToMany(mappedBy = "tppsId")
    private List<OpercomercTipospessoas> opercomercTipospessoasList;
    @OneToMany(mappedBy = "tppsId")
    private List<TabelaprecosTipospessoas> tabelaprecosTipospessoasList;

    public TiposPessoas() {
    }

    public TiposPessoas(String tppsId) {
        this.tppsId = tppsId;
    }

    public String getTppsId() {
        return tppsId;
    }

    public void setTppsId(String tppsId) {
        this.tppsId = tppsId;
    }

    public String getTppsNome() {
        return tppsNome;
    }

    public void setTppsNome(String tppsNome) {
        this.tppsNome = tppsNome;
    }

    public String getTppsTipo() {
        return tppsTipo;
    }

    public void setTppsTipo(String tppsTipo) {
        this.tppsTipo = tppsTipo;
    }

    public Date getTppsLastupdate() {
        return tppsLastupdate;
    }

    public void setTppsLastupdate(Date tppsLastupdate) {
        this.tppsLastupdate = tppsLastupdate;
    }

    @XmlTransient
    public List<PessoasTipospessoas> getPessoasTipospessoasList() {
        return pessoasTipospessoasList;
    }

    public void setPessoasTipospessoasList(List<PessoasTipospessoas> pessoasTipospessoasList) {
        this.pessoasTipospessoasList = pessoasTipospessoasList;
    }

    @XmlTransient
    public List<OpercomercTipospessoas> getOpercomercTipospessoasList() {
        return opercomercTipospessoasList;
    }

    public void setOpercomercTipospessoasList(List<OpercomercTipospessoas> opercomercTipospessoasList) {
        this.opercomercTipospessoasList = opercomercTipospessoasList;
    }

    @XmlTransient
    public List<TabelaprecosTipospessoas> getTabelaprecosTipospessoasList() {
        return tabelaprecosTipospessoasList;
    }

    public void setTabelaprecosTipospessoasList(List<TabelaprecosTipospessoas> tabelaprecosTipospessoasList) {
        this.tabelaprecosTipospessoasList = tabelaprecosTipospessoasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tppsId != null ? tppsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TiposPessoas)) {
            return false;
        }
        TiposPessoas other = (TiposPessoas) object;
        if ((this.tppsId == null && other.tppsId != null) || (this.tppsId != null && !this.tppsId.equals(other.tppsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.TiposPessoas[ tppsId=" + tppsId + " ]";
    }
    
}
