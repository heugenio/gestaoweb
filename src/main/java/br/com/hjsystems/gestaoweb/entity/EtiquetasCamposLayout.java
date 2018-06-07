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
@Table(name = "ETIQUETAS_CAMPOS_LAYOUT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EtiquetasCamposLayout.findAll", query = "SELECT e FROM EtiquetasCamposLayout e"),
    @NamedQuery(name = "EtiquetasCamposLayout.findByEtclId", query = "SELECT e FROM EtiquetasCamposLayout e WHERE e.etclId = :etclId"),
    @NamedQuery(name = "EtiquetasCamposLayout.findByEtclTabela", query = "SELECT e FROM EtiquetasCamposLayout e WHERE e.etclTabela = :etclTabela"),
    @NamedQuery(name = "EtiquetasCamposLayout.findByEtclConteudo", query = "SELECT e FROM EtiquetasCamposLayout e WHERE e.etclConteudo = :etclConteudo"),
    @NamedQuery(name = "EtiquetasCamposLayout.findByEtclTipocampo", query = "SELECT e FROM EtiquetasCamposLayout e WHERE e.etclTipocampo = :etclTipocampo"),
    @NamedQuery(name = "EtiquetasCamposLayout.findByEtclComprimento", query = "SELECT e FROM EtiquetasCamposLayout e WHERE e.etclComprimento = :etclComprimento"),
    @NamedQuery(name = "EtiquetasCamposLayout.findByEtclMascara", query = "SELECT e FROM EtiquetasCamposLayout e WHERE e.etclMascara = :etclMascara"),
    @NamedQuery(name = "EtiquetasCamposLayout.findByEtclEsquerda", query = "SELECT e FROM EtiquetasCamposLayout e WHERE e.etclEsquerda = :etclEsquerda"),
    @NamedQuery(name = "EtiquetasCamposLayout.findByEtclAltura", query = "SELECT e FROM EtiquetasCamposLayout e WHERE e.etclAltura = :etclAltura"),
    @NamedQuery(name = "EtiquetasCamposLayout.findByEtclLargura", query = "SELECT e FROM EtiquetasCamposLayout e WHERE e.etclLargura = :etclLargura"),
    @NamedQuery(name = "EtiquetasCamposLayout.findByEtclTopo", query = "SELECT e FROM EtiquetasCamposLayout e WHERE e.etclTopo = :etclTopo"),
    @NamedQuery(name = "EtiquetasCamposLayout.findByEtclFonte", query = "SELECT e FROM EtiquetasCamposLayout e WHERE e.etclFonte = :etclFonte"),
    @NamedQuery(name = "EtiquetasCamposLayout.findByEtclTamanho", query = "SELECT e FROM EtiquetasCamposLayout e WHERE e.etclTamanho = :etclTamanho"),
    @NamedQuery(name = "EtiquetasCamposLayout.findByEtclAlinhamento", query = "SELECT e FROM EtiquetasCamposLayout e WHERE e.etclAlinhamento = :etclAlinhamento"),
    @NamedQuery(name = "EtiquetasCamposLayout.findByEtclEstilo", query = "SELECT e FROM EtiquetasCamposLayout e WHERE e.etclEstilo = :etclEstilo"),
    @NamedQuery(name = "EtiquetasCamposLayout.findByEtclCor", query = "SELECT e FROM EtiquetasCamposLayout e WHERE e.etclCor = :etclCor"),
    @NamedQuery(name = "EtiquetasCamposLayout.findByEtClLASTUPDATE", query = "SELECT e FROM EtiquetasCamposLayout e WHERE e.etClLASTUPDATE = :etClLASTUPDATE")})
public class EtiquetasCamposLayout implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ETCL_ID")
    private String etclId;
    @Column(name = "ETCL_TABELA")
    private String etclTabela;
    @Column(name = "ETCL_CONTEUDO")
    private String etclConteudo;
    @Column(name = "ETCL_TIPOCAMPO")
    private String etclTipocampo;
    @Column(name = "ETCL_COMPRIMENTO")
    private Integer etclComprimento;
    @Column(name = "ETCL_MASCARA")
    private String etclMascara;
    @Column(name = "ETCL_ESQUERDA")
    private Integer etclEsquerda;
    @Column(name = "ETCL_ALTURA")
    private Integer etclAltura;
    @Column(name = "ETCL_LARGURA")
    private Integer etclLargura;
    @Column(name = "ETCL_TOPO")
    private Integer etclTopo;
    @Column(name = "ETCL_FONTE")
    private String etclFonte;
    @Column(name = "ETCL_TAMANHO")
    private Integer etclTamanho;
    @Column(name = "ETCL_ALINHAMENTO")
    private Integer etclAlinhamento;
    @Column(name = "ETCL_ESTILO")
    private Integer etclEstilo;
    @Column(name = "ETCL_COR")
    private Integer etclCor;
    @Column(name = "EtCl_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date etClLASTUPDATE;
    @JoinColumn(name = "ETLY_ID", referencedColumnName = "ETLY_ID")
    @ManyToOne
    private EtiquetaLayout etlyId;

    public EtiquetasCamposLayout() {
    }

    public EtiquetasCamposLayout(String etclId) {
        this.etclId = etclId;
    }

    public String getEtclId() {
        return etclId;
    }

    public void setEtclId(String etclId) {
        this.etclId = etclId;
    }

    public String getEtclTabela() {
        return etclTabela;
    }

    public void setEtclTabela(String etclTabela) {
        this.etclTabela = etclTabela;
    }

    public String getEtclConteudo() {
        return etclConteudo;
    }

    public void setEtclConteudo(String etclConteudo) {
        this.etclConteudo = etclConteudo;
    }

    public String getEtclTipocampo() {
        return etclTipocampo;
    }

    public void setEtclTipocampo(String etclTipocampo) {
        this.etclTipocampo = etclTipocampo;
    }

    public Integer getEtclComprimento() {
        return etclComprimento;
    }

    public void setEtclComprimento(Integer etclComprimento) {
        this.etclComprimento = etclComprimento;
    }

    public String getEtclMascara() {
        return etclMascara;
    }

    public void setEtclMascara(String etclMascara) {
        this.etclMascara = etclMascara;
    }

    public Integer getEtclEsquerda() {
        return etclEsquerda;
    }

    public void setEtclEsquerda(Integer etclEsquerda) {
        this.etclEsquerda = etclEsquerda;
    }

    public Integer getEtclAltura() {
        return etclAltura;
    }

    public void setEtclAltura(Integer etclAltura) {
        this.etclAltura = etclAltura;
    }

    public Integer getEtclLargura() {
        return etclLargura;
    }

    public void setEtclLargura(Integer etclLargura) {
        this.etclLargura = etclLargura;
    }

    public Integer getEtclTopo() {
        return etclTopo;
    }

    public void setEtclTopo(Integer etclTopo) {
        this.etclTopo = etclTopo;
    }

    public String getEtclFonte() {
        return etclFonte;
    }

    public void setEtclFonte(String etclFonte) {
        this.etclFonte = etclFonte;
    }

    public Integer getEtclTamanho() {
        return etclTamanho;
    }

    public void setEtclTamanho(Integer etclTamanho) {
        this.etclTamanho = etclTamanho;
    }

    public Integer getEtclAlinhamento() {
        return etclAlinhamento;
    }

    public void setEtclAlinhamento(Integer etclAlinhamento) {
        this.etclAlinhamento = etclAlinhamento;
    }

    public Integer getEtclEstilo() {
        return etclEstilo;
    }

    public void setEtclEstilo(Integer etclEstilo) {
        this.etclEstilo = etclEstilo;
    }

    public Integer getEtclCor() {
        return etclCor;
    }

    public void setEtclCor(Integer etclCor) {
        this.etclCor = etclCor;
    }

    public Date getEtClLASTUPDATE() {
        return etClLASTUPDATE;
    }

    public void setEtClLASTUPDATE(Date etClLASTUPDATE) {
        this.etClLASTUPDATE = etClLASTUPDATE;
    }

    public EtiquetaLayout getEtlyId() {
        return etlyId;
    }

    public void setEtlyId(EtiquetaLayout etlyId) {
        this.etlyId = etlyId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (etclId != null ? etclId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EtiquetasCamposLayout)) {
            return false;
        }
        EtiquetasCamposLayout other = (EtiquetasCamposLayout) object;
        if ((this.etclId == null && other.etclId != null) || (this.etclId != null && !this.etclId.equals(other.etclId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.EtiquetasCamposLayout[ etclId=" + etclId + " ]";
    }
    
}
