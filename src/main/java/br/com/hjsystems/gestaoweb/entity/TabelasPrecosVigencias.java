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
@Table(name = "TABELAS_PRECOS_VIGENCIAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TabelasPrecosVigencias.findAll", query = "SELECT t FROM TabelasPrecosVigencias t"),
    @NamedQuery(name = "TabelasPrecosVigencias.findByTbpvId", query = "SELECT t FROM TabelasPrecosVigencias t WHERE t.tbpvId = :tbpvId"),
    @NamedQuery(name = "TabelasPrecosVigencias.findByTbpvNome", query = "SELECT t FROM TabelasPrecosVigencias t WHERE t.tbpvNome = :tbpvNome"),
    @NamedQuery(name = "TabelasPrecosVigencias.findByTbpvDtInicial", query = "SELECT t FROM TabelasPrecosVigencias t WHERE t.tbpvDtInicial = :tbpvDtInicial"),
    @NamedQuery(name = "TabelasPrecosVigencias.findByTbpvDtFinal", query = "SELECT t FROM TabelasPrecosVigencias t WHERE t.tbpvDtFinal = :tbpvDtFinal"),
    @NamedQuery(name = "TabelasPrecosVigencias.findByTbpvLastupdate", query = "SELECT t FROM TabelasPrecosVigencias t WHERE t.tbpvLastupdate = :tbpvLastupdate")})
public class TabelasPrecosVigencias implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TBPV_ID")
    private String tbpvId;
    @Column(name = "TBPV_NOME")
    private String tbpvNome;
    @Column(name = "TBPV_DT_INICIAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tbpvDtInicial;
    @Column(name = "TBPV_DT_FINAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tbpvDtFinal;
    @Column(name = "TBPV_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tbpvLastupdate;
    @JoinColumn(name = "TBPC_ID", referencedColumnName = "TBPC_ID")
    @ManyToOne
    private TabelasPrecos tbpcId;
    @OneToMany(mappedBy = "tbpvId")
    private List<TabelasprecosUnem> tabelasprecosUnemList;
    @OneToMany(mappedBy = "tbpvId")
    private List<PrecosProdutos> precosProdutosList;
    @OneToMany(mappedBy = "tbpvId")
    private List<TabelasprecosFven> tabelasprecosFvenList;
    @OneToMany(mappedBy = "tbpvId")
    private List<TabelaprecosTipospessoas> tabelaprecosTipospessoasList;

    public TabelasPrecosVigencias() {
    }

    public TabelasPrecosVigencias(String tbpvId) {
        this.tbpvId = tbpvId;
    }

    public String getTbpvId() {
        return tbpvId;
    }

    public void setTbpvId(String tbpvId) {
        this.tbpvId = tbpvId;
    }

    public String getTbpvNome() {
        return tbpvNome;
    }

    public void setTbpvNome(String tbpvNome) {
        this.tbpvNome = tbpvNome;
    }

    public Date getTbpvDtInicial() {
        return tbpvDtInicial;
    }

    public void setTbpvDtInicial(Date tbpvDtInicial) {
        this.tbpvDtInicial = tbpvDtInicial;
    }

    public Date getTbpvDtFinal() {
        return tbpvDtFinal;
    }

    public void setTbpvDtFinal(Date tbpvDtFinal) {
        this.tbpvDtFinal = tbpvDtFinal;
    }

    public Date getTbpvLastupdate() {
        return tbpvLastupdate;
    }

    public void setTbpvLastupdate(Date tbpvLastupdate) {
        this.tbpvLastupdate = tbpvLastupdate;
    }

    public TabelasPrecos getTbpcId() {
        return tbpcId;
    }

    public void setTbpcId(TabelasPrecos tbpcId) {
        this.tbpcId = tbpcId;
    }

    @XmlTransient
    public List<TabelasprecosUnem> getTabelasprecosUnemList() {
        return tabelasprecosUnemList;
    }

    public void setTabelasprecosUnemList(List<TabelasprecosUnem> tabelasprecosUnemList) {
        this.tabelasprecosUnemList = tabelasprecosUnemList;
    }

    @XmlTransient
    public List<PrecosProdutos> getPrecosProdutosList() {
        return precosProdutosList;
    }

    public void setPrecosProdutosList(List<PrecosProdutos> precosProdutosList) {
        this.precosProdutosList = precosProdutosList;
    }

    @XmlTransient
    public List<TabelasprecosFven> getTabelasprecosFvenList() {
        return tabelasprecosFvenList;
    }

    public void setTabelasprecosFvenList(List<TabelasprecosFven> tabelasprecosFvenList) {
        this.tabelasprecosFvenList = tabelasprecosFvenList;
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
        hash += (tbpvId != null ? tbpvId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TabelasPrecosVigencias)) {
            return false;
        }
        TabelasPrecosVigencias other = (TabelasPrecosVigencias) object;
        if ((this.tbpvId == null && other.tbpvId != null) || (this.tbpvId != null && !this.tbpvId.equals(other.tbpvId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.TabelasPrecosVigencias[ tbpvId=" + tbpvId + " ]";
    }
    
}
