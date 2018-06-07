/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hjsystems.gestaoweb.entity;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "GRUPOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Grupos.findAll", query = "SELECT g FROM Grupos g"),
    @NamedQuery(name = "Grupos.findByGrpoId", query = "SELECT g FROM Grupos g WHERE g.grpoId = :grpoId"),
    @NamedQuery(name = "Grupos.findByGrpoCodigo", query = "SELECT g FROM Grupos g WHERE g.grpoCodigo = :grpoCodigo"),
    @NamedQuery(name = "Grupos.findByGrpoNome", query = "SELECT g FROM Grupos g WHERE g.grpoNome = :grpoNome"),
    @NamedQuery(name = "Grupos.findByGrpoMovimentaEstoque", query = "SELECT g FROM Grupos g WHERE g.grpoMovimentaEstoque = :grpoMovimentaEstoque"),
    @NamedQuery(name = "Grupos.findByGrpoAceitaSaldoNegativo", query = "SELECT g FROM Grupos g WHERE g.grpoAceitaSaldoNegativo = :grpoAceitaSaldoNegativo"),
    @NamedQuery(name = "Grupos.findByGrpoDescontoPermitido", query = "SELECT g FROM Grupos g WHERE g.grpoDescontoPermitido = :grpoDescontoPermitido"),
    @NamedQuery(name = "Grupos.findByGrpoPercComAvt", query = "SELECT g FROM Grupos g WHERE g.grpoPercComAvt = :grpoPercComAvt"),
    @NamedQuery(name = "Grupos.findByGrpoPercComPrz", query = "SELECT g FROM Grupos g WHERE g.grpoPercComPrz = :grpoPercComPrz"),
    @NamedQuery(name = "Grupos.findByGrpoLASTUPDATE", query = "SELECT g FROM Grupos g WHERE g.grpoLASTUPDATE = :grpoLASTUPDATE"),
    @NamedQuery(name = "Grupos.findByGrpoTcnPercComAvt", query = "SELECT g FROM Grupos g WHERE g.grpoTcnPercComAvt = :grpoTcnPercComAvt"),
    @NamedQuery(name = "Grupos.findByGrpoTcnPercComPrz", query = "SELECT g FROM Grupos g WHERE g.grpoTcnPercComPrz = :grpoTcnPercComPrz"),
    @NamedQuery(name = "Grupos.findByGrpoComissionaTec", query = "SELECT g FROM Grupos g WHERE g.grpoComissionaTec = :grpoComissionaTec"),
    @NamedQuery(name = "Grupos.findByGrpoAcrescimoPermitido", query = "SELECT g FROM Grupos g WHERE g.grpoAcrescimoPermitido = :grpoAcrescimoPermitido"),
    @NamedQuery(name = "Grupos.findByGrpoPercBonusComissao", query = "SELECT g FROM Grupos g WHERE g.grpoPercBonusComissao = :grpoPercBonusComissao"),
    @NamedQuery(name = "Grupos.findByGrpoPercLucroPrev", query = "SELECT g FROM Grupos g WHERE g.grpoPercLucroPrev = :grpoPercLucroPrev"),
    @NamedQuery(name = "Grupos.findByGrpoTipo", query = "SELECT g FROM Grupos g WHERE g.grpoTipo = :grpoTipo"),
    @NamedQuery(name = "Grupos.findByGrpoTcnMultPcomAvt", query = "SELECT g FROM Grupos g WHERE g.grpoTcnMultPcomAvt = :grpoTcnMultPcomAvt"),
    @NamedQuery(name = "Grupos.findByGrpoTcnMultPcomPrz", query = "SELECT g FROM Grupos g WHERE g.grpoTcnMultPcomPrz = :grpoTcnMultPcomPrz"),
    @NamedQuery(name = "Grupos.findByGrpoTcnMult2PcomAvt", query = "SELECT g FROM Grupos g WHERE g.grpoTcnMult2PcomAvt = :grpoTcnMult2PcomAvt"),
    @NamedQuery(name = "Grupos.findByGrpoTcnMult2PcomPrz", query = "SELECT g FROM Grupos g WHERE g.grpoTcnMult2PcomPrz = :grpoTcnMult2PcomPrz")})
public class Grupos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "GRPO_ID")
    private String grpoId;
    @Basic(optional = false)
    @Column(name = "GRPO_CODIGO")
    private String grpoCodigo;
    @Basic(optional = false)
    @Column(name = "GRPO_NOME")
    private String grpoNome;
    @Basic(optional = false)
    @Column(name = "GRPO_MOVIMENTA_ESTOQUE")
    private String grpoMovimentaEstoque;
    @Basic(optional = false)
    @Column(name = "GRPO_ACEITA_SALDO_NEGATIVO")
    private String grpoAceitaSaldoNegativo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "GRPO_DESCONTO_PERMITIDO")
    private BigDecimal grpoDescontoPermitido;
    @Basic(optional = false)
    @Column(name = "GRPO_PERC_COM_AVT")
    private BigDecimal grpoPercComAvt;
    @Basic(optional = false)
    @Column(name = "GRPO_PERC_COM_PRZ")
    private BigDecimal grpoPercComPrz;
    @Column(name = "Grpo_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date grpoLASTUPDATE;
    @Column(name = "GRPO_TCN_PERC_COM_AVT")
    private BigDecimal grpoTcnPercComAvt;
    @Column(name = "GRPO_TCN_PERC_COM_PRZ")
    private BigDecimal grpoTcnPercComPrz;
    @Column(name = "GRPO_COMISSIONA_TEC")
    private String grpoComissionaTec;
    @Column(name = "GRPO_ACRESCIMO_PERMITIDO")
    private BigDecimal grpoAcrescimoPermitido;
    @Column(name = "GRPO_PERC_BONUS_COMISSAO")
    private BigDecimal grpoPercBonusComissao;
    @Column(name = "GRPO_PERC_LUCRO_PREV")
    private BigDecimal grpoPercLucroPrev;
    @Column(name = "GRPO_TIPO")
    private String grpoTipo;
    @Column(name = "GRPO_TCN_MULT_PCOM_AVT")
    private BigDecimal grpoTcnMultPcomAvt;
    @Column(name = "GRPO_TCN_MULT_PCOM_PRZ")
    private BigDecimal grpoTcnMultPcomPrz;
    @Column(name = "GRPO_TCN_MULT2_PCOM_AVT")
    private BigDecimal grpoTcnMult2PcomAvt;
    @Column(name = "GRPO_TCN_MULT2_PCOM_PRZ")
    private BigDecimal grpoTcnMult2PcomPrz;
    @OneToMany(mappedBy = "grpoId")
    private List<Produtos> produtosList;
    @OneToMany(mappedBy = "grpoId")
    private List<Emails> emailsList;
    @OneToMany(mappedBy = "grpoId")
    private List<VendedoresMetas> vendedoresMetasList;
    @JoinColumn(name = "HPAD_ID", referencedColumnName = "HPAD_ID")
    @ManyToOne
    private HistoricosPadrao hpadId;
    @JoinColumn(name = "PLCT_ID", referencedColumnName = "PLCT_ID")
    @ManyToOne
    private PlanoContas plctId;
    @JoinColumn(name = "PLA_PLCT_ID", referencedColumnName = "PLCT_ID")
    @ManyToOne
    private PlanoContas plaPlctId;
    @OneToMany(mappedBy = "grpoId")
    private List<ItensMetas> itensMetasList;
    @OneToMany(mappedBy = "grpoId")
    private List<VendedoresFaixaComissao> vendedoresFaixaComissaoList;
    @OneToMany(mappedBy = "grpoId")
    private List<FaixasComissoes> faixasComissoesList;
    @OneToMany(mappedBy = "grpoId")
    private List<GruposTipospagamentos> gruposTipospagamentosList;

    public Grupos() {
    }

    public Grupos(String grpoId) {
        this.grpoId = grpoId;
    }

    public Grupos(String grpoId, String grpoCodigo, String grpoNome, String grpoMovimentaEstoque, String grpoAceitaSaldoNegativo, BigDecimal grpoPercComAvt, BigDecimal grpoPercComPrz) {
        this.grpoId = grpoId;
        this.grpoCodigo = grpoCodigo;
        this.grpoNome = grpoNome;
        this.grpoMovimentaEstoque = grpoMovimentaEstoque;
        this.grpoAceitaSaldoNegativo = grpoAceitaSaldoNegativo;
        this.grpoPercComAvt = grpoPercComAvt;
        this.grpoPercComPrz = grpoPercComPrz;
    }

    public String getGrpoId() {
        return grpoId;
    }

    public void setGrpoId(String grpoId) {
        this.grpoId = grpoId;
    }

    public String getGrpoCodigo() {
        return grpoCodigo;
    }

    public void setGrpoCodigo(String grpoCodigo) {
        this.grpoCodigo = grpoCodigo;
    }

    public String getGrpoNome() {
        return grpoNome;
    }

    public void setGrpoNome(String grpoNome) {
        this.grpoNome = grpoNome;
    }

    public String getGrpoMovimentaEstoque() {
        return grpoMovimentaEstoque;
    }

    public void setGrpoMovimentaEstoque(String grpoMovimentaEstoque) {
        this.grpoMovimentaEstoque = grpoMovimentaEstoque;
    }

    public String getGrpoAceitaSaldoNegativo() {
        return grpoAceitaSaldoNegativo;
    }

    public void setGrpoAceitaSaldoNegativo(String grpoAceitaSaldoNegativo) {
        this.grpoAceitaSaldoNegativo = grpoAceitaSaldoNegativo;
    }

    public BigDecimal getGrpoDescontoPermitido() {
        return grpoDescontoPermitido;
    }

    public void setGrpoDescontoPermitido(BigDecimal grpoDescontoPermitido) {
        this.grpoDescontoPermitido = grpoDescontoPermitido;
    }

    public BigDecimal getGrpoPercComAvt() {
        return grpoPercComAvt;
    }

    public void setGrpoPercComAvt(BigDecimal grpoPercComAvt) {
        this.grpoPercComAvt = grpoPercComAvt;
    }

    public BigDecimal getGrpoPercComPrz() {
        return grpoPercComPrz;
    }

    public void setGrpoPercComPrz(BigDecimal grpoPercComPrz) {
        this.grpoPercComPrz = grpoPercComPrz;
    }

    public Date getGrpoLASTUPDATE() {
        return grpoLASTUPDATE;
    }

    public void setGrpoLASTUPDATE(Date grpoLASTUPDATE) {
        this.grpoLASTUPDATE = grpoLASTUPDATE;
    }

    public BigDecimal getGrpoTcnPercComAvt() {
        return grpoTcnPercComAvt;
    }

    public void setGrpoTcnPercComAvt(BigDecimal grpoTcnPercComAvt) {
        this.grpoTcnPercComAvt = grpoTcnPercComAvt;
    }

    public BigDecimal getGrpoTcnPercComPrz() {
        return grpoTcnPercComPrz;
    }

    public void setGrpoTcnPercComPrz(BigDecimal grpoTcnPercComPrz) {
        this.grpoTcnPercComPrz = grpoTcnPercComPrz;
    }

    public String getGrpoComissionaTec() {
        return grpoComissionaTec;
    }

    public void setGrpoComissionaTec(String grpoComissionaTec) {
        this.grpoComissionaTec = grpoComissionaTec;
    }

    public BigDecimal getGrpoAcrescimoPermitido() {
        return grpoAcrescimoPermitido;
    }

    public void setGrpoAcrescimoPermitido(BigDecimal grpoAcrescimoPermitido) {
        this.grpoAcrescimoPermitido = grpoAcrescimoPermitido;
    }

    public BigDecimal getGrpoPercBonusComissao() {
        return grpoPercBonusComissao;
    }

    public void setGrpoPercBonusComissao(BigDecimal grpoPercBonusComissao) {
        this.grpoPercBonusComissao = grpoPercBonusComissao;
    }

    public BigDecimal getGrpoPercLucroPrev() {
        return grpoPercLucroPrev;
    }

    public void setGrpoPercLucroPrev(BigDecimal grpoPercLucroPrev) {
        this.grpoPercLucroPrev = grpoPercLucroPrev;
    }

    public String getGrpoTipo() {
        return grpoTipo;
    }

    public void setGrpoTipo(String grpoTipo) {
        this.grpoTipo = grpoTipo;
    }

    public BigDecimal getGrpoTcnMultPcomAvt() {
        return grpoTcnMultPcomAvt;
    }

    public void setGrpoTcnMultPcomAvt(BigDecimal grpoTcnMultPcomAvt) {
        this.grpoTcnMultPcomAvt = grpoTcnMultPcomAvt;
    }

    public BigDecimal getGrpoTcnMultPcomPrz() {
        return grpoTcnMultPcomPrz;
    }

    public void setGrpoTcnMultPcomPrz(BigDecimal grpoTcnMultPcomPrz) {
        this.grpoTcnMultPcomPrz = grpoTcnMultPcomPrz;
    }

    public BigDecimal getGrpoTcnMult2PcomAvt() {
        return grpoTcnMult2PcomAvt;
    }

    public void setGrpoTcnMult2PcomAvt(BigDecimal grpoTcnMult2PcomAvt) {
        this.grpoTcnMult2PcomAvt = grpoTcnMult2PcomAvt;
    }

    public BigDecimal getGrpoTcnMult2PcomPrz() {
        return grpoTcnMult2PcomPrz;
    }

    public void setGrpoTcnMult2PcomPrz(BigDecimal grpoTcnMult2PcomPrz) {
        this.grpoTcnMult2PcomPrz = grpoTcnMult2PcomPrz;
    }

    @XmlTransient
    public List<Produtos> getProdutosList() {
        return produtosList;
    }

    public void setProdutosList(List<Produtos> produtosList) {
        this.produtosList = produtosList;
    }

    @XmlTransient
    public List<Emails> getEmailsList() {
        return emailsList;
    }

    public void setEmailsList(List<Emails> emailsList) {
        this.emailsList = emailsList;
    }

    @XmlTransient
    public List<VendedoresMetas> getVendedoresMetasList() {
        return vendedoresMetasList;
    }

    public void setVendedoresMetasList(List<VendedoresMetas> vendedoresMetasList) {
        this.vendedoresMetasList = vendedoresMetasList;
    }

    public HistoricosPadrao getHpadId() {
        return hpadId;
    }

    public void setHpadId(HistoricosPadrao hpadId) {
        this.hpadId = hpadId;
    }

    public PlanoContas getPlctId() {
        return plctId;
    }

    public void setPlctId(PlanoContas plctId) {
        this.plctId = plctId;
    }

    public PlanoContas getPlaPlctId() {
        return plaPlctId;
    }

    public void setPlaPlctId(PlanoContas plaPlctId) {
        this.plaPlctId = plaPlctId;
    }

    @XmlTransient
    public List<ItensMetas> getItensMetasList() {
        return itensMetasList;
    }

    public void setItensMetasList(List<ItensMetas> itensMetasList) {
        this.itensMetasList = itensMetasList;
    }

    @XmlTransient
    public List<VendedoresFaixaComissao> getVendedoresFaixaComissaoList() {
        return vendedoresFaixaComissaoList;
    }

    public void setVendedoresFaixaComissaoList(List<VendedoresFaixaComissao> vendedoresFaixaComissaoList) {
        this.vendedoresFaixaComissaoList = vendedoresFaixaComissaoList;
    }

    @XmlTransient
    public List<FaixasComissoes> getFaixasComissoesList() {
        return faixasComissoesList;
    }

    public void setFaixasComissoesList(List<FaixasComissoes> faixasComissoesList) {
        this.faixasComissoesList = faixasComissoesList;
    }

    @XmlTransient
    public List<GruposTipospagamentos> getGruposTipospagamentosList() {
        return gruposTipospagamentosList;
    }

    public void setGruposTipospagamentosList(List<GruposTipospagamentos> gruposTipospagamentosList) {
        this.gruposTipospagamentosList = gruposTipospagamentosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (grpoId != null ? grpoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Grupos)) {
            return false;
        }
        Grupos other = (Grupos) object;
        if ((this.grpoId == null && other.grpoId != null) || (this.grpoId != null && !this.grpoId.equals(other.grpoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.Grupos[ grpoId=" + grpoId + " ]";
    }
    
}
