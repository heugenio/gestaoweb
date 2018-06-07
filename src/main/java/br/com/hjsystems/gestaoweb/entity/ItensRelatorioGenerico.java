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
@Table(name = "ITENS_RELATORIO_GENERICO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ItensRelatorioGenerico.findAll", query = "SELECT i FROM ItensRelatorioGenerico i"),
    @NamedQuery(name = "ItensRelatorioGenerico.findByItrgId", query = "SELECT i FROM ItensRelatorioGenerico i WHERE i.itrgId = :itrgId"),
    @NamedQuery(name = "ItensRelatorioGenerico.findByItrgNomeVariavel", query = "SELECT i FROM ItensRelatorioGenerico i WHERE i.itrgNomeVariavel = :itrgNomeVariavel"),
    @NamedQuery(name = "ItensRelatorioGenerico.findByItrgTipo", query = "SELECT i FROM ItensRelatorioGenerico i WHERE i.itrgTipo = :itrgTipo"),
    @NamedQuery(name = "ItensRelatorioGenerico.findByItrgCaption", query = "SELECT i FROM ItensRelatorioGenerico i WHERE i.itrgCaption = :itrgCaption"),
    @NamedQuery(name = "ItensRelatorioGenerico.findByItrgTipoDado", query = "SELECT i FROM ItensRelatorioGenerico i WHERE i.itrgTipoDado = :itrgTipoDado"),
    @NamedQuery(name = "ItensRelatorioGenerico.findByItrgLeft", query = "SELECT i FROM ItensRelatorioGenerico i WHERE i.itrgLeft = :itrgLeft"),
    @NamedQuery(name = "ItensRelatorioGenerico.findByItrgTop", query = "SELECT i FROM ItensRelatorioGenerico i WHERE i.itrgTop = :itrgTop"),
    @NamedQuery(name = "ItensRelatorioGenerico.findByItrgWidth", query = "SELECT i FROM ItensRelatorioGenerico i WHERE i.itrgWidth = :itrgWidth"),
    @NamedQuery(name = "ItensRelatorioGenerico.findByItrgFontName", query = "SELECT i FROM ItensRelatorioGenerico i WHERE i.itrgFontName = :itrgFontName"),
    @NamedQuery(name = "ItensRelatorioGenerico.findByItrgFontSize", query = "SELECT i FROM ItensRelatorioGenerico i WHERE i.itrgFontSize = :itrgFontSize"),
    @NamedQuery(name = "ItensRelatorioGenerico.findByItrgFontBold", query = "SELECT i FROM ItensRelatorioGenerico i WHERE i.itrgFontBold = :itrgFontBold"),
    @NamedQuery(name = "ItensRelatorioGenerico.findByItrgFontItalic", query = "SELECT i FROM ItensRelatorioGenerico i WHERE i.itrgFontItalic = :itrgFontItalic"),
    @NamedQuery(name = "ItensRelatorioGenerico.findByItrgFontUnderline", query = "SELECT i FROM ItensRelatorioGenerico i WHERE i.itrgFontUnderline = :itrgFontUnderline"),
    @NamedQuery(name = "ItensRelatorioGenerico.findByItrgFontStrikeOut", query = "SELECT i FROM ItensRelatorioGenerico i WHERE i.itrgFontStrikeOut = :itrgFontStrikeOut"),
    @NamedQuery(name = "ItensRelatorioGenerico.findByItrgFontColor", query = "SELECT i FROM ItensRelatorioGenerico i WHERE i.itrgFontColor = :itrgFontColor"),
    @NamedQuery(name = "ItensRelatorioGenerico.findByItrgTipoSaldo", query = "SELECT i FROM ItensRelatorioGenerico i WHERE i.itrgTipoSaldo = :itrgTipoSaldo"),
    @NamedQuery(name = "ItensRelatorioGenerico.findByItrgVarTotais", query = "SELECT i FROM ItensRelatorioGenerico i WHERE i.itrgVarTotais = :itrgVarTotais"),
    @NamedQuery(name = "ItensRelatorioGenerico.findByItrgTotalVisivel", query = "SELECT i FROM ItensRelatorioGenerico i WHERE i.itrgTotalVisivel = :itrgTotalVisivel"),
    @NamedQuery(name = "ItensRelatorioGenerico.findByItrgPageindex", query = "SELECT i FROM ItensRelatorioGenerico i WHERE i.itrgPageindex = :itrgPageindex"),
    @NamedQuery(name = "ItensRelatorioGenerico.findByItrgAlinhamento", query = "SELECT i FROM ItensRelatorioGenerico i WHERE i.itrgAlinhamento = :itrgAlinhamento"),
    @NamedQuery(name = "ItensRelatorioGenerico.findByItrgOrdem", query = "SELECT i FROM ItensRelatorioGenerico i WHERE i.itrgOrdem = :itrgOrdem"),
    @NamedQuery(name = "ItensRelatorioGenerico.findByItrgVarPerc1", query = "SELECT i FROM ItensRelatorioGenerico i WHERE i.itrgVarPerc1 = :itrgVarPerc1"),
    @NamedQuery(name = "ItensRelatorioGenerico.findByItrgVarPerc2", query = "SELECT i FROM ItensRelatorioGenerico i WHERE i.itrgVarPerc2 = :itrgVarPerc2"),
    @NamedQuery(name = "ItensRelatorioGenerico.findByItRGLASTUPDATE", query = "SELECT i FROM ItensRelatorioGenerico i WHERE i.itRGLASTUPDATE = :itRGLASTUPDATE")})
public class ItensRelatorioGenerico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ITRG_ID")
    private String itrgId;
    @Basic(optional = false)
    @Column(name = "ITRG_NOME_VARIAVEL")
    private String itrgNomeVariavel;
    @Column(name = "ITRG_TIPO")
    private String itrgTipo;
    @Column(name = "ITRG_CAPTION")
    private String itrgCaption;
    @Column(name = "ITRG_TIPO_DADO")
    private String itrgTipoDado;
    @Column(name = "ITRG_LEFT")
    private Integer itrgLeft;
    @Column(name = "ITRG_TOP")
    private Integer itrgTop;
    @Column(name = "ITRG_WIDTH")
    private Integer itrgWidth;
    @Column(name = "ITRG_FONT_NAME")
    private String itrgFontName;
    @Column(name = "ITRG_FONT_SIZE")
    private Integer itrgFontSize;
    @Column(name = "ITRG_FONT_BOLD")
    private String itrgFontBold;
    @Column(name = "ITRG_FONT_ITALIC")
    private String itrgFontItalic;
    @Column(name = "ITRG_FONT_UNDERLINE")
    private String itrgFontUnderline;
    @Column(name = "ITRG_FONT_STRIKE_OUT")
    private String itrgFontStrikeOut;
    @Column(name = "ITRG_FONT_COLOR")
    private Integer itrgFontColor;
    @Column(name = "ITRG_TIPO_SALDO")
    private String itrgTipoSaldo;
    @Column(name = "ITRG_VAR_TOTAIS")
    private String itrgVarTotais;
    @Column(name = "ITRG_TOTAL_VISIVEL")
    private String itrgTotalVisivel;
    @Basic(optional = false)
    @Column(name = "ITRG_PAGEINDEX")
    private int itrgPageindex;
    @Column(name = "ITRG_ALINHAMENTO")
    private String itrgAlinhamento;
    @Basic(optional = false)
    @Column(name = "ITRG_ORDEM")
    private int itrgOrdem;
    @Column(name = "ITRG_VAR_PERC1")
    private String itrgVarPerc1;
    @Column(name = "ITRG_VAR_PERC2")
    private String itrgVarPerc2;
    @Column(name = "ItRG_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date itRGLASTUPDATE;
    @JoinColumn(name = "PLCT_ID", referencedColumnName = "PLCT_ID")
    @ManyToOne
    private PlanoContas plctId;
    @JoinColumn(name = "RLGN_ID", referencedColumnName = "RLGN_ID")
    @ManyToOne
    private RelatorioGenerico rlgnId;

    public ItensRelatorioGenerico() {
    }

    public ItensRelatorioGenerico(String itrgId) {
        this.itrgId = itrgId;
    }

    public ItensRelatorioGenerico(String itrgId, String itrgNomeVariavel, int itrgPageindex, int itrgOrdem) {
        this.itrgId = itrgId;
        this.itrgNomeVariavel = itrgNomeVariavel;
        this.itrgPageindex = itrgPageindex;
        this.itrgOrdem = itrgOrdem;
    }

    public String getItrgId() {
        return itrgId;
    }

    public void setItrgId(String itrgId) {
        this.itrgId = itrgId;
    }

    public String getItrgNomeVariavel() {
        return itrgNomeVariavel;
    }

    public void setItrgNomeVariavel(String itrgNomeVariavel) {
        this.itrgNomeVariavel = itrgNomeVariavel;
    }

    public String getItrgTipo() {
        return itrgTipo;
    }

    public void setItrgTipo(String itrgTipo) {
        this.itrgTipo = itrgTipo;
    }

    public String getItrgCaption() {
        return itrgCaption;
    }

    public void setItrgCaption(String itrgCaption) {
        this.itrgCaption = itrgCaption;
    }

    public String getItrgTipoDado() {
        return itrgTipoDado;
    }

    public void setItrgTipoDado(String itrgTipoDado) {
        this.itrgTipoDado = itrgTipoDado;
    }

    public Integer getItrgLeft() {
        return itrgLeft;
    }

    public void setItrgLeft(Integer itrgLeft) {
        this.itrgLeft = itrgLeft;
    }

    public Integer getItrgTop() {
        return itrgTop;
    }

    public void setItrgTop(Integer itrgTop) {
        this.itrgTop = itrgTop;
    }

    public Integer getItrgWidth() {
        return itrgWidth;
    }

    public void setItrgWidth(Integer itrgWidth) {
        this.itrgWidth = itrgWidth;
    }

    public String getItrgFontName() {
        return itrgFontName;
    }

    public void setItrgFontName(String itrgFontName) {
        this.itrgFontName = itrgFontName;
    }

    public Integer getItrgFontSize() {
        return itrgFontSize;
    }

    public void setItrgFontSize(Integer itrgFontSize) {
        this.itrgFontSize = itrgFontSize;
    }

    public String getItrgFontBold() {
        return itrgFontBold;
    }

    public void setItrgFontBold(String itrgFontBold) {
        this.itrgFontBold = itrgFontBold;
    }

    public String getItrgFontItalic() {
        return itrgFontItalic;
    }

    public void setItrgFontItalic(String itrgFontItalic) {
        this.itrgFontItalic = itrgFontItalic;
    }

    public String getItrgFontUnderline() {
        return itrgFontUnderline;
    }

    public void setItrgFontUnderline(String itrgFontUnderline) {
        this.itrgFontUnderline = itrgFontUnderline;
    }

    public String getItrgFontStrikeOut() {
        return itrgFontStrikeOut;
    }

    public void setItrgFontStrikeOut(String itrgFontStrikeOut) {
        this.itrgFontStrikeOut = itrgFontStrikeOut;
    }

    public Integer getItrgFontColor() {
        return itrgFontColor;
    }

    public void setItrgFontColor(Integer itrgFontColor) {
        this.itrgFontColor = itrgFontColor;
    }

    public String getItrgTipoSaldo() {
        return itrgTipoSaldo;
    }

    public void setItrgTipoSaldo(String itrgTipoSaldo) {
        this.itrgTipoSaldo = itrgTipoSaldo;
    }

    public String getItrgVarTotais() {
        return itrgVarTotais;
    }

    public void setItrgVarTotais(String itrgVarTotais) {
        this.itrgVarTotais = itrgVarTotais;
    }

    public String getItrgTotalVisivel() {
        return itrgTotalVisivel;
    }

    public void setItrgTotalVisivel(String itrgTotalVisivel) {
        this.itrgTotalVisivel = itrgTotalVisivel;
    }

    public int getItrgPageindex() {
        return itrgPageindex;
    }

    public void setItrgPageindex(int itrgPageindex) {
        this.itrgPageindex = itrgPageindex;
    }

    public String getItrgAlinhamento() {
        return itrgAlinhamento;
    }

    public void setItrgAlinhamento(String itrgAlinhamento) {
        this.itrgAlinhamento = itrgAlinhamento;
    }

    public int getItrgOrdem() {
        return itrgOrdem;
    }

    public void setItrgOrdem(int itrgOrdem) {
        this.itrgOrdem = itrgOrdem;
    }

    public String getItrgVarPerc1() {
        return itrgVarPerc1;
    }

    public void setItrgVarPerc1(String itrgVarPerc1) {
        this.itrgVarPerc1 = itrgVarPerc1;
    }

    public String getItrgVarPerc2() {
        return itrgVarPerc2;
    }

    public void setItrgVarPerc2(String itrgVarPerc2) {
        this.itrgVarPerc2 = itrgVarPerc2;
    }

    public Date getItRGLASTUPDATE() {
        return itRGLASTUPDATE;
    }

    public void setItRGLASTUPDATE(Date itRGLASTUPDATE) {
        this.itRGLASTUPDATE = itRGLASTUPDATE;
    }

    public PlanoContas getPlctId() {
        return plctId;
    }

    public void setPlctId(PlanoContas plctId) {
        this.plctId = plctId;
    }

    public RelatorioGenerico getRlgnId() {
        return rlgnId;
    }

    public void setRlgnId(RelatorioGenerico rlgnId) {
        this.rlgnId = rlgnId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itrgId != null ? itrgId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItensRelatorioGenerico)) {
            return false;
        }
        ItensRelatorioGenerico other = (ItensRelatorioGenerico) object;
        if ((this.itrgId == null && other.itrgId != null) || (this.itrgId != null && !this.itrgId.equals(other.itrgId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.ItensRelatorioGenerico[ itrgId=" + itrgId + " ]";
    }
    
}
