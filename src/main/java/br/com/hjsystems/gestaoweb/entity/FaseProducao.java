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
@Table(name = "FASE_PRODUCAO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FaseProducao.findAll", query = "SELECT f FROM FaseProducao f"),
    @NamedQuery(name = "FaseProducao.findByFsprId", query = "SELECT f FROM FaseProducao f WHERE f.fsprId = :fsprId"),
    @NamedQuery(name = "FaseProducao.findByFasFsprId", query = "SELECT f FROM FaseProducao f WHERE f.fasFsprId = :fasFsprId"),
    @NamedQuery(name = "FaseProducao.findByFsprCodigo", query = "SELECT f FROM FaseProducao f WHERE f.fsprCodigo = :fsprCodigo"),
    @NamedQuery(name = "FaseProducao.findByFsprNome", query = "SELECT f FROM FaseProducao f WHERE f.fsprNome = :fsprNome"),
    @NamedQuery(name = "FaseProducao.findByFsprStatus", query = "SELECT f FROM FaseProducao f WHERE f.fsprStatus = :fsprStatus"),
    @NamedQuery(name = "FaseProducao.findByFsprLastupdate", query = "SELECT f FROM FaseProducao f WHERE f.fsprLastupdate = :fsprLastupdate"),
    @NamedQuery(name = "FaseProducao.findByFsprCalcRendimento", query = "SELECT f FROM FaseProducao f WHERE f.fsprCalcRendimento = :fsprCalcRendimento"),
    @NamedQuery(name = "FaseProducao.findByFsprStatusOrdem", query = "SELECT f FROM FaseProducao f WHERE f.fsprStatusOrdem = :fsprStatusOrdem")})
public class FaseProducao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "FSPR_ID")
    private String fsprId;
    @Column(name = "FAS_FSPR_ID")
    private String fasFsprId;
    @Column(name = "FSPR_CODIGO")
    private String fsprCodigo;
    @Column(name = "FSPR_NOME")
    private String fsprNome;
    @Column(name = "FSPR_STATUS")
    private String fsprStatus;
    @Column(name = "FSPR_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fsprLastupdate;
    @Column(name = "FSPR_CALC_RENDIMENTO")
    private String fsprCalcRendimento;
    @Column(name = "FSPR_STATUS_ORDEM")
    private String fsprStatusOrdem;
    @OneToMany(mappedBy = "fsprId")
    private List<HistoricosFases> historicosFasesList;
    @OneToMany(mappedBy = "fsprId")
    private List<OrdemProducao> ordemProducaoList;

    public FaseProducao() {
    }

    public FaseProducao(String fsprId) {
        this.fsprId = fsprId;
    }

    public String getFsprId() {
        return fsprId;
    }

    public void setFsprId(String fsprId) {
        this.fsprId = fsprId;
    }

    public String getFasFsprId() {
        return fasFsprId;
    }

    public void setFasFsprId(String fasFsprId) {
        this.fasFsprId = fasFsprId;
    }

    public String getFsprCodigo() {
        return fsprCodigo;
    }

    public void setFsprCodigo(String fsprCodigo) {
        this.fsprCodigo = fsprCodigo;
    }

    public String getFsprNome() {
        return fsprNome;
    }

    public void setFsprNome(String fsprNome) {
        this.fsprNome = fsprNome;
    }

    public String getFsprStatus() {
        return fsprStatus;
    }

    public void setFsprStatus(String fsprStatus) {
        this.fsprStatus = fsprStatus;
    }

    public Date getFsprLastupdate() {
        return fsprLastupdate;
    }

    public void setFsprLastupdate(Date fsprLastupdate) {
        this.fsprLastupdate = fsprLastupdate;
    }

    public String getFsprCalcRendimento() {
        return fsprCalcRendimento;
    }

    public void setFsprCalcRendimento(String fsprCalcRendimento) {
        this.fsprCalcRendimento = fsprCalcRendimento;
    }

    public String getFsprStatusOrdem() {
        return fsprStatusOrdem;
    }

    public void setFsprStatusOrdem(String fsprStatusOrdem) {
        this.fsprStatusOrdem = fsprStatusOrdem;
    }

    @XmlTransient
    public List<HistoricosFases> getHistoricosFasesList() {
        return historicosFasesList;
    }

    public void setHistoricosFasesList(List<HistoricosFases> historicosFasesList) {
        this.historicosFasesList = historicosFasesList;
    }

    @XmlTransient
    public List<OrdemProducao> getOrdemProducaoList() {
        return ordemProducaoList;
    }

    public void setOrdemProducaoList(List<OrdemProducao> ordemProducaoList) {
        this.ordemProducaoList = ordemProducaoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fsprId != null ? fsprId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FaseProducao)) {
            return false;
        }
        FaseProducao other = (FaseProducao) object;
        if ((this.fsprId == null && other.fsprId != null) || (this.fsprId != null && !this.fsprId.equals(other.fsprId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.FaseProducao[ fsprId=" + fsprId + " ]";
    }
    
}
