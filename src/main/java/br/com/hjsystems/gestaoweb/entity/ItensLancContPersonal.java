/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hjsystems.gestaoweb.entity;

import java.io.Serializable;
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
@Table(name = "ITENS_LANC_CONT_PERSONAL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ItensLancContPersonal.findAll", query = "SELECT i FROM ItensLancContPersonal i"),
    @NamedQuery(name = "ItensLancContPersonal.findByIlcpId", query = "SELECT i FROM ItensLancContPersonal i WHERE i.ilcpId = :ilcpId"),
    @NamedQuery(name = "ItensLancContPersonal.findByIlcpNomeVariavel", query = "SELECT i FROM ItensLancContPersonal i WHERE i.ilcpNomeVariavel = :ilcpNomeVariavel"),
    @NamedQuery(name = "ItensLancContPersonal.findByIlcpTipo", query = "SELECT i FROM ItensLancContPersonal i WHERE i.ilcpTipo = :ilcpTipo"),
    @NamedQuery(name = "ItensLancContPersonal.findByIlcpCaption", query = "SELECT i FROM ItensLancContPersonal i WHERE i.ilcpCaption = :ilcpCaption"),
    @NamedQuery(name = "ItensLancContPersonal.findByIlcpLeft", query = "SELECT i FROM ItensLancContPersonal i WHERE i.ilcpLeft = :ilcpLeft"),
    @NamedQuery(name = "ItensLancContPersonal.findByIlcpTop", query = "SELECT i FROM ItensLancContPersonal i WHERE i.ilcpTop = :ilcpTop"),
    @NamedQuery(name = "ItensLancContPersonal.findByIlcpWidth", query = "SELECT i FROM ItensLancContPersonal i WHERE i.ilcpWidth = :ilcpWidth"),
    @NamedQuery(name = "ItensLancContPersonal.findByIlcpHistComplementar", query = "SELECT i FROM ItensLancContPersonal i WHERE i.ilcpHistComplementar = :ilcpHistComplementar"),
    @NamedQuery(name = "ItensLancContPersonal.findByIlcpHistPadrao", query = "SELECT i FROM ItensLancContPersonal i WHERE i.ilcpHistPadrao = :ilcpHistPadrao"),
    @NamedQuery(name = "ItensLancContPersonal.findByIlcpFontName", query = "SELECT i FROM ItensLancContPersonal i WHERE i.ilcpFontName = :ilcpFontName"),
    @NamedQuery(name = "ItensLancContPersonal.findByIlcpFontSize", query = "SELECT i FROM ItensLancContPersonal i WHERE i.ilcpFontSize = :ilcpFontSize"),
    @NamedQuery(name = "ItensLancContPersonal.findByIlcpFontBold", query = "SELECT i FROM ItensLancContPersonal i WHERE i.ilcpFontBold = :ilcpFontBold"),
    @NamedQuery(name = "ItensLancContPersonal.findByIlcpFontItalic", query = "SELECT i FROM ItensLancContPersonal i WHERE i.ilcpFontItalic = :ilcpFontItalic"),
    @NamedQuery(name = "ItensLancContPersonal.findByIlcpFontUnderline", query = "SELECT i FROM ItensLancContPersonal i WHERE i.ilcpFontUnderline = :ilcpFontUnderline"),
    @NamedQuery(name = "ItensLancContPersonal.findByIlcpFontStrikeOut", query = "SELECT i FROM ItensLancContPersonal i WHERE i.ilcpFontStrikeOut = :ilcpFontStrikeOut"),
    @NamedQuery(name = "ItensLancContPersonal.findByIlcpFontColor", query = "SELECT i FROM ItensLancContPersonal i WHERE i.ilcpFontColor = :ilcpFontColor"),
    @NamedQuery(name = "ItensLancContPersonal.findByIlcpWidthLockup", query = "SELECT i FROM ItensLancContPersonal i WHERE i.ilcpWidthLockup = :ilcpWidthLockup"),
    @NamedQuery(name = "ItensLancContPersonal.findByIlcpWidthConta", query = "SELECT i FROM ItensLancContPersonal i WHERE i.ilcpWidthConta = :ilcpWidthConta"),
    @NamedQuery(name = "ItensLancContPersonal.findByIlcpVarData", query = "SELECT i FROM ItensLancContPersonal i WHERE i.ilcpVarData = :ilcpVarData"),
    @NamedQuery(name = "ItensLancContPersonal.findByIlcpVarCtaDebito", query = "SELECT i FROM ItensLancContPersonal i WHERE i.ilcpVarCtaDebito = :ilcpVarCtaDebito"),
    @NamedQuery(name = "ItensLancContPersonal.findByIlcpVarCtaCredito", query = "SELECT i FROM ItensLancContPersonal i WHERE i.ilcpVarCtaCredito = :ilcpVarCtaCredito"),
    @NamedQuery(name = "ItensLancContPersonal.findByIlcpVarHistPadrao", query = "SELECT i FROM ItensLancContPersonal i WHERE i.ilcpVarHistPadrao = :ilcpVarHistPadrao"),
    @NamedQuery(name = "ItensLancContPersonal.findByIlcpVarTotais", query = "SELECT i FROM ItensLancContPersonal i WHERE i.ilcpVarTotais = :ilcpVarTotais"),
    @NamedQuery(name = "ItensLancContPersonal.findByIlcpTipoTotal", query = "SELECT i FROM ItensLancContPersonal i WHERE i.ilcpTipoTotal = :ilcpTipoTotal"),
    @NamedQuery(name = "ItensLancContPersonal.findByIlcpTotalVisivel", query = "SELECT i FROM ItensLancContPersonal i WHERE i.ilcpTotalVisivel = :ilcpTotalVisivel"),
    @NamedQuery(name = "ItensLancContPersonal.findByIlcpTabStop", query = "SELECT i FROM ItensLancContPersonal i WHERE i.ilcpTabStop = :ilcpTabStop"),
    @NamedQuery(name = "ItensLancContPersonal.findByIlcpLastupdate", query = "SELECT i FROM ItensLancContPersonal i WHERE i.ilcpLastupdate = :ilcpLastupdate")})
public class ItensLancContPersonal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ILCP_ID")
    private String ilcpId;
    @Basic(optional = false)
    @Column(name = "ILCP_NOME_VARIAVEL")
    private String ilcpNomeVariavel;
    @Column(name = "ILCP_TIPO")
    private String ilcpTipo;
    @Column(name = "ILCP_CAPTION")
    private String ilcpCaption;
    @Column(name = "ILCP_LEFT")
    private Integer ilcpLeft;
    @Column(name = "ILCP_TOP")
    private Integer ilcpTop;
    @Column(name = "ILCP_WIDTH")
    private Integer ilcpWidth;
    @Column(name = "ILCP_HIST_COMPLEMENTAR")
    private String ilcpHistComplementar;
    @Column(name = "ILCP_HIST_PADRAO")
    private String ilcpHistPadrao;
    @Column(name = "ILCP_FONT_NAME")
    private String ilcpFontName;
    @Column(name = "ILCP_FONT_SIZE")
    private Integer ilcpFontSize;
    @Column(name = "ILCP_FONT_BOLD")
    private String ilcpFontBold;
    @Column(name = "ILCP_FONT_ITALIC")
    private String ilcpFontItalic;
    @Column(name = "ILCP_FONT_UNDERLINE")
    private String ilcpFontUnderline;
    @Column(name = "ILCP_FONT_STRIKE_OUT")
    private String ilcpFontStrikeOut;
    @Column(name = "ILCP_FONT_COLOR")
    private Integer ilcpFontColor;
    @Column(name = "ILCP_WIDTH_LOCKUP")
    private Integer ilcpWidthLockup;
    @Column(name = "ILCP_WIDTH_CONTA")
    private Integer ilcpWidthConta;
    @Column(name = "ILCP_VAR_DATA")
    private String ilcpVarData;
    @Column(name = "ILCP_VAR_CTA_DEBITO")
    private String ilcpVarCtaDebito;
    @Column(name = "ILCP_VAR_CTA_CREDITO")
    private String ilcpVarCtaCredito;
    @Column(name = "ILCP_VAR_HIST_PADRAO")
    private String ilcpVarHistPadrao;
    @Column(name = "ILCP_VAR_TOTAIS")
    private String ilcpVarTotais;
    @Column(name = "ILCP_TIPO_TOTAL")
    private String ilcpTipoTotal;
    @Column(name = "ILCP_TOTAL_VISIVEL")
    private String ilcpTotalVisivel;
    @Column(name = "ILCP_TAB_STOP")
    private String ilcpTabStop;
    @Column(name = "ILCP_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ilcpLastupdate;
    @JoinColumn(name = "HPAD_ID", referencedColumnName = "HPAD_ID")
    @ManyToOne
    private HistoricosPadrao hpadId;
    @JoinColumn(name = "LCPR_ID", referencedColumnName = "LCPR_ID")
    @ManyToOne
    private LancContabilPersonalizado lcprId;
    @JoinColumn(name = "PLCT_ID", referencedColumnName = "PLCT_ID")
    @ManyToOne
    private PlanoContas plctId;
    @JoinColumn(name = "PLA_PLCT_ID", referencedColumnName = "PLCT_ID")
    @ManyToOne
    private PlanoContas plaPlctId;

    public ItensLancContPersonal() {
    }

    public ItensLancContPersonal(String ilcpId) {
        this.ilcpId = ilcpId;
    }

    public ItensLancContPersonal(String ilcpId, String ilcpNomeVariavel) {
        this.ilcpId = ilcpId;
        this.ilcpNomeVariavel = ilcpNomeVariavel;
    }

    public String getIlcpId() {
        return ilcpId;
    }

    public void setIlcpId(String ilcpId) {
        this.ilcpId = ilcpId;
    }

    public String getIlcpNomeVariavel() {
        return ilcpNomeVariavel;
    }

    public void setIlcpNomeVariavel(String ilcpNomeVariavel) {
        this.ilcpNomeVariavel = ilcpNomeVariavel;
    }

    public String getIlcpTipo() {
        return ilcpTipo;
    }

    public void setIlcpTipo(String ilcpTipo) {
        this.ilcpTipo = ilcpTipo;
    }

    public String getIlcpCaption() {
        return ilcpCaption;
    }

    public void setIlcpCaption(String ilcpCaption) {
        this.ilcpCaption = ilcpCaption;
    }

    public Integer getIlcpLeft() {
        return ilcpLeft;
    }

    public void setIlcpLeft(Integer ilcpLeft) {
        this.ilcpLeft = ilcpLeft;
    }

    public Integer getIlcpTop() {
        return ilcpTop;
    }

    public void setIlcpTop(Integer ilcpTop) {
        this.ilcpTop = ilcpTop;
    }

    public Integer getIlcpWidth() {
        return ilcpWidth;
    }

    public void setIlcpWidth(Integer ilcpWidth) {
        this.ilcpWidth = ilcpWidth;
    }

    public String getIlcpHistComplementar() {
        return ilcpHistComplementar;
    }

    public void setIlcpHistComplementar(String ilcpHistComplementar) {
        this.ilcpHistComplementar = ilcpHistComplementar;
    }

    public String getIlcpHistPadrao() {
        return ilcpHistPadrao;
    }

    public void setIlcpHistPadrao(String ilcpHistPadrao) {
        this.ilcpHistPadrao = ilcpHistPadrao;
    }

    public String getIlcpFontName() {
        return ilcpFontName;
    }

    public void setIlcpFontName(String ilcpFontName) {
        this.ilcpFontName = ilcpFontName;
    }

    public Integer getIlcpFontSize() {
        return ilcpFontSize;
    }

    public void setIlcpFontSize(Integer ilcpFontSize) {
        this.ilcpFontSize = ilcpFontSize;
    }

    public String getIlcpFontBold() {
        return ilcpFontBold;
    }

    public void setIlcpFontBold(String ilcpFontBold) {
        this.ilcpFontBold = ilcpFontBold;
    }

    public String getIlcpFontItalic() {
        return ilcpFontItalic;
    }

    public void setIlcpFontItalic(String ilcpFontItalic) {
        this.ilcpFontItalic = ilcpFontItalic;
    }

    public String getIlcpFontUnderline() {
        return ilcpFontUnderline;
    }

    public void setIlcpFontUnderline(String ilcpFontUnderline) {
        this.ilcpFontUnderline = ilcpFontUnderline;
    }

    public String getIlcpFontStrikeOut() {
        return ilcpFontStrikeOut;
    }

    public void setIlcpFontStrikeOut(String ilcpFontStrikeOut) {
        this.ilcpFontStrikeOut = ilcpFontStrikeOut;
    }

    public Integer getIlcpFontColor() {
        return ilcpFontColor;
    }

    public void setIlcpFontColor(Integer ilcpFontColor) {
        this.ilcpFontColor = ilcpFontColor;
    }

    public Integer getIlcpWidthLockup() {
        return ilcpWidthLockup;
    }

    public void setIlcpWidthLockup(Integer ilcpWidthLockup) {
        this.ilcpWidthLockup = ilcpWidthLockup;
    }

    public Integer getIlcpWidthConta() {
        return ilcpWidthConta;
    }

    public void setIlcpWidthConta(Integer ilcpWidthConta) {
        this.ilcpWidthConta = ilcpWidthConta;
    }

    public String getIlcpVarData() {
        return ilcpVarData;
    }

    public void setIlcpVarData(String ilcpVarData) {
        this.ilcpVarData = ilcpVarData;
    }

    public String getIlcpVarCtaDebito() {
        return ilcpVarCtaDebito;
    }

    public void setIlcpVarCtaDebito(String ilcpVarCtaDebito) {
        this.ilcpVarCtaDebito = ilcpVarCtaDebito;
    }

    public String getIlcpVarCtaCredito() {
        return ilcpVarCtaCredito;
    }

    public void setIlcpVarCtaCredito(String ilcpVarCtaCredito) {
        this.ilcpVarCtaCredito = ilcpVarCtaCredito;
    }

    public String getIlcpVarHistPadrao() {
        return ilcpVarHistPadrao;
    }

    public void setIlcpVarHistPadrao(String ilcpVarHistPadrao) {
        this.ilcpVarHistPadrao = ilcpVarHistPadrao;
    }

    public String getIlcpVarTotais() {
        return ilcpVarTotais;
    }

    public void setIlcpVarTotais(String ilcpVarTotais) {
        this.ilcpVarTotais = ilcpVarTotais;
    }

    public String getIlcpTipoTotal() {
        return ilcpTipoTotal;
    }

    public void setIlcpTipoTotal(String ilcpTipoTotal) {
        this.ilcpTipoTotal = ilcpTipoTotal;
    }

    public String getIlcpTotalVisivel() {
        return ilcpTotalVisivel;
    }

    public void setIlcpTotalVisivel(String ilcpTotalVisivel) {
        this.ilcpTotalVisivel = ilcpTotalVisivel;
    }

    public String getIlcpTabStop() {
        return ilcpTabStop;
    }

    public void setIlcpTabStop(String ilcpTabStop) {
        this.ilcpTabStop = ilcpTabStop;
    }

    public Date getIlcpLastupdate() {
        return ilcpLastupdate;
    }

    public void setIlcpLastupdate(Date ilcpLastupdate) {
        this.ilcpLastupdate = ilcpLastupdate;
    }

    public HistoricosPadrao getHpadId() {
        return hpadId;
    }

    public void setHpadId(HistoricosPadrao hpadId) {
        this.hpadId = hpadId;
    }

    public LancContabilPersonalizado getLcprId() {
        return lcprId;
    }

    public void setLcprId(LancContabilPersonalizado lcprId) {
        this.lcprId = lcprId;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ilcpId != null ? ilcpId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItensLancContPersonal)) {
            return false;
        }
        ItensLancContPersonal other = (ItensLancContPersonal) object;
        if ((this.ilcpId == null && other.ilcpId != null) || (this.ilcpId != null && !this.ilcpId.equals(other.ilcpId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.ItensLancContPersonal[ ilcpId=" + ilcpId + " ]";
    }
    
}
