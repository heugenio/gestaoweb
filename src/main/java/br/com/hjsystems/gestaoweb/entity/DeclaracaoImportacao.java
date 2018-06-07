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
@Table(name = "DECLARACAO_IMPORTACAO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DeclaracaoImportacao.findAll", query = "SELECT d FROM DeclaracaoImportacao d"),
    @NamedQuery(name = "DeclaracaoImportacao.findByDimpId", query = "SELECT d FROM DeclaracaoImportacao d WHERE d.dimpId = :dimpId"),
    @NamedQuery(name = "DeclaracaoImportacao.findByDimpNumeroDoc", query = "SELECT d FROM DeclaracaoImportacao d WHERE d.dimpNumeroDoc = :dimpNumeroDoc"),
    @NamedQuery(name = "DeclaracaoImportacao.findByDimpDtRegistro", query = "SELECT d FROM DeclaracaoImportacao d WHERE d.dimpDtRegistro = :dimpDtRegistro"),
    @NamedQuery(name = "DeclaracaoImportacao.findByDimpLocalDesembaraco", query = "SELECT d FROM DeclaracaoImportacao d WHERE d.dimpLocalDesembaraco = :dimpLocalDesembaraco"),
    @NamedQuery(name = "DeclaracaoImportacao.findByDimpUfDesembaraco", query = "SELECT d FROM DeclaracaoImportacao d WHERE d.dimpUfDesembaraco = :dimpUfDesembaraco"),
    @NamedQuery(name = "DeclaracaoImportacao.findByDimpDtDesembaraco", query = "SELECT d FROM DeclaracaoImportacao d WHERE d.dimpDtDesembaraco = :dimpDtDesembaraco"),
    @NamedQuery(name = "DeclaracaoImportacao.findByDimpCodigoExportador", query = "SELECT d FROM DeclaracaoImportacao d WHERE d.dimpCodigoExportador = :dimpCodigoExportador"),
    @NamedQuery(name = "DeclaracaoImportacao.findByDimpNumeroAdicao", query = "SELECT d FROM DeclaracaoImportacao d WHERE d.dimpNumeroAdicao = :dimpNumeroAdicao"),
    @NamedQuery(name = "DeclaracaoImportacao.findByDimpNumeroSeqItem", query = "SELECT d FROM DeclaracaoImportacao d WHERE d.dimpNumeroSeqItem = :dimpNumeroSeqItem"),
    @NamedQuery(name = "DeclaracaoImportacao.findByDimpCodigoFabricante", query = "SELECT d FROM DeclaracaoImportacao d WHERE d.dimpCodigoFabricante = :dimpCodigoFabricante"),
    @NamedQuery(name = "DeclaracaoImportacao.findByDimpVlrDescItemAdicao", query = "SELECT d FROM DeclaracaoImportacao d WHERE d.dimpVlrDescItemAdicao = :dimpVlrDescItemAdicao"),
    @NamedQuery(name = "DeclaracaoImportacao.findByDimpNumeroPedCompra", query = "SELECT d FROM DeclaracaoImportacao d WHERE d.dimpNumeroPedCompra = :dimpNumeroPedCompra"),
    @NamedQuery(name = "DeclaracaoImportacao.findByDimpItemPedCompra", query = "SELECT d FROM DeclaracaoImportacao d WHERE d.dimpItemPedCompra = :dimpItemPedCompra"),
    @NamedQuery(name = "DeclaracaoImportacao.findByDimpLastupdate", query = "SELECT d FROM DeclaracaoImportacao d WHERE d.dimpLastupdate = :dimpLastupdate")})
public class DeclaracaoImportacao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DIMP_ID")
    private String dimpId;
    @Column(name = "DIMP_NUMERO_DOC")
    private String dimpNumeroDoc;
    @Column(name = "DIMP_DT_REGISTRO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dimpDtRegistro;
    @Column(name = "DIMP_LOCAL_DESEMBARACO")
    private String dimpLocalDesembaraco;
    @Column(name = "DIMP_UF_DESEMBARACO")
    private String dimpUfDesembaraco;
    @Column(name = "DIMP_DT_DESEMBARACO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dimpDtDesembaraco;
    @Column(name = "DIMP_CODIGO_EXPORTADOR")
    private String dimpCodigoExportador;
    @Column(name = "DIMP_NUMERO_ADICAO")
    private Integer dimpNumeroAdicao;
    @Column(name = "DIMP_NUMERO_SEQ_ITEM")
    private Integer dimpNumeroSeqItem;
    @Column(name = "DIMP_CODIGO_FABRICANTE")
    private String dimpCodigoFabricante;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "DIMP_VLR_DESC_ITEM_ADICAO")
    private BigDecimal dimpVlrDescItemAdicao;
    @Column(name = "DIMP_NUMERO_PED_COMPRA")
    private String dimpNumeroPedCompra;
    @Column(name = "DIMP_ITEM_PED_COMPRA")
    private Integer dimpItemPedCompra;
    @Column(name = "DIMP_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dimpLastupdate;
    @JoinColumn(name = "ITFT_ID", referencedColumnName = "ITFT_ID")
    @ManyToOne
    private ItensFaturados itftId;

    public DeclaracaoImportacao() {
    }

    public DeclaracaoImportacao(String dimpId) {
        this.dimpId = dimpId;
    }

    public DeclaracaoImportacao(String dimpId, BigDecimal dimpVlrDescItemAdicao) {
        this.dimpId = dimpId;
        this.dimpVlrDescItemAdicao = dimpVlrDescItemAdicao;
    }

    public String getDimpId() {
        return dimpId;
    }

    public void setDimpId(String dimpId) {
        this.dimpId = dimpId;
    }

    public String getDimpNumeroDoc() {
        return dimpNumeroDoc;
    }

    public void setDimpNumeroDoc(String dimpNumeroDoc) {
        this.dimpNumeroDoc = dimpNumeroDoc;
    }

    public Date getDimpDtRegistro() {
        return dimpDtRegistro;
    }

    public void setDimpDtRegistro(Date dimpDtRegistro) {
        this.dimpDtRegistro = dimpDtRegistro;
    }

    public String getDimpLocalDesembaraco() {
        return dimpLocalDesembaraco;
    }

    public void setDimpLocalDesembaraco(String dimpLocalDesembaraco) {
        this.dimpLocalDesembaraco = dimpLocalDesembaraco;
    }

    public String getDimpUfDesembaraco() {
        return dimpUfDesembaraco;
    }

    public void setDimpUfDesembaraco(String dimpUfDesembaraco) {
        this.dimpUfDesembaraco = dimpUfDesembaraco;
    }

    public Date getDimpDtDesembaraco() {
        return dimpDtDesembaraco;
    }

    public void setDimpDtDesembaraco(Date dimpDtDesembaraco) {
        this.dimpDtDesembaraco = dimpDtDesembaraco;
    }

    public String getDimpCodigoExportador() {
        return dimpCodigoExportador;
    }

    public void setDimpCodigoExportador(String dimpCodigoExportador) {
        this.dimpCodigoExportador = dimpCodigoExportador;
    }

    public Integer getDimpNumeroAdicao() {
        return dimpNumeroAdicao;
    }

    public void setDimpNumeroAdicao(Integer dimpNumeroAdicao) {
        this.dimpNumeroAdicao = dimpNumeroAdicao;
    }

    public Integer getDimpNumeroSeqItem() {
        return dimpNumeroSeqItem;
    }

    public void setDimpNumeroSeqItem(Integer dimpNumeroSeqItem) {
        this.dimpNumeroSeqItem = dimpNumeroSeqItem;
    }

    public String getDimpCodigoFabricante() {
        return dimpCodigoFabricante;
    }

    public void setDimpCodigoFabricante(String dimpCodigoFabricante) {
        this.dimpCodigoFabricante = dimpCodigoFabricante;
    }

    public BigDecimal getDimpVlrDescItemAdicao() {
        return dimpVlrDescItemAdicao;
    }

    public void setDimpVlrDescItemAdicao(BigDecimal dimpVlrDescItemAdicao) {
        this.dimpVlrDescItemAdicao = dimpVlrDescItemAdicao;
    }

    public String getDimpNumeroPedCompra() {
        return dimpNumeroPedCompra;
    }

    public void setDimpNumeroPedCompra(String dimpNumeroPedCompra) {
        this.dimpNumeroPedCompra = dimpNumeroPedCompra;
    }

    public Integer getDimpItemPedCompra() {
        return dimpItemPedCompra;
    }

    public void setDimpItemPedCompra(Integer dimpItemPedCompra) {
        this.dimpItemPedCompra = dimpItemPedCompra;
    }

    public Date getDimpLastupdate() {
        return dimpLastupdate;
    }

    public void setDimpLastupdate(Date dimpLastupdate) {
        this.dimpLastupdate = dimpLastupdate;
    }

    public ItensFaturados getItftId() {
        return itftId;
    }

    public void setItftId(ItensFaturados itftId) {
        this.itftId = itftId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dimpId != null ? dimpId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DeclaracaoImportacao)) {
            return false;
        }
        DeclaracaoImportacao other = (DeclaracaoImportacao) object;
        if ((this.dimpId == null && other.dimpId != null) || (this.dimpId != null && !this.dimpId.equals(other.dimpId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.DeclaracaoImportacao[ dimpId=" + dimpId + " ]";
    }
    
}
