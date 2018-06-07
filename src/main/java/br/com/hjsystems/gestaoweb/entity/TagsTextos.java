/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hjsystems.gestaoweb.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name = "TAGS_TEXTOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TagsTextos.findAll", query = "SELECT t FROM TagsTextos t"),
    @NamedQuery(name = "TagsTextos.findByTgtxId", query = "SELECT t FROM TagsTextos t WHERE t.tgtxId = :tgtxId"),
    @NamedQuery(name = "TagsTextos.findByTgtxNome", query = "SELECT t FROM TagsTextos t WHERE t.tgtxNome = :tgtxNome"),
    @NamedQuery(name = "TagsTextos.findByTgtxDescricao", query = "SELECT t FROM TagsTextos t WHERE t.tgtxDescricao = :tgtxDescricao"),
    @NamedQuery(name = "TagsTextos.findByTgtxTipoUso", query = "SELECT t FROM TagsTextos t WHERE t.tgtxTipoUso = :tgtxTipoUso"),
    @NamedQuery(name = "TagsTextos.findByTgtxTipoImpressora", query = "SELECT t FROM TagsTextos t WHERE t.tgtxTipoImpressora = :tgtxTipoImpressora"),
    @NamedQuery(name = "TagsTextos.findByTgtxLarguraEtiqueta", query = "SELECT t FROM TagsTextos t WHERE t.tgtxLarguraEtiqueta = :tgtxLarguraEtiqueta"),
    @NamedQuery(name = "TagsTextos.findByTgtxAlturaEtiqueta", query = "SELECT t FROM TagsTextos t WHERE t.tgtxAlturaEtiqueta = :tgtxAlturaEtiqueta"),
    @NamedQuery(name = "TagsTextos.findByTgtxMargemEsquerda", query = "SELECT t FROM TagsTextos t WHERE t.tgtxMargemEsquerda = :tgtxMargemEsquerda"),
    @NamedQuery(name = "TagsTextos.findByTgtxMargemSuperior", query = "SELECT t FROM TagsTextos t WHERE t.tgtxMargemSuperior = :tgtxMargemSuperior"),
    @NamedQuery(name = "TagsTextos.findByTgtxMargemInferior", query = "SELECT t FROM TagsTextos t WHERE t.tgtxMargemInferior = :tgtxMargemInferior"),
    @NamedQuery(name = "TagsTextos.findByTgtxMargemDireita", query = "SELECT t FROM TagsTextos t WHERE t.tgtxMargemDireita = :tgtxMargemDireita")})
public class TagsTextos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TGTX_ID")
    private String tgtxId;
    @Basic(optional = false)
    @Column(name = "TGTX_NOME")
    private String tgtxNome;
    @Basic(optional = false)
    @Column(name = "TGTX_DESCRICAO")
    private String tgtxDescricao;
    @Lob
    @Column(name = "TGTX_TEXTO")
    private String tgtxTexto;
    @Lob
    @Column(name = "TGTX_TEXTO_CLIENTE")
    private String tgtxTextoCliente;
    @Column(name = "TGTX_TIPO_USO")
    private String tgtxTipoUso;
    @Basic(optional = false)
    @Column(name = "TGTX_TIPO_IMPRESSORA")
    private String tgtxTipoImpressora;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TGTX_LARGURA_ETIQUETA")
    private BigDecimal tgtxLarguraEtiqueta;
    @Column(name = "TGTX_ALTURA_ETIQUETA")
    private BigDecimal tgtxAlturaEtiqueta;
    @Column(name = "TGTX_MARGEM_ESQUERDA")
    private BigDecimal tgtxMargemEsquerda;
    @Column(name = "TGTX_MARGEM_SUPERIOR")
    private BigDecimal tgtxMargemSuperior;
    @Column(name = "TGTX_MARGEM_INFERIOR")
    private BigDecimal tgtxMargemInferior;
    @Column(name = "TGTX_MARGEM_DIREITA")
    private BigDecimal tgtxMargemDireita;

    public TagsTextos() {
    }

    public TagsTextos(String tgtxId) {
        this.tgtxId = tgtxId;
    }

    public TagsTextos(String tgtxId, String tgtxNome, String tgtxDescricao, String tgtxTipoImpressora) {
        this.tgtxId = tgtxId;
        this.tgtxNome = tgtxNome;
        this.tgtxDescricao = tgtxDescricao;
        this.tgtxTipoImpressora = tgtxTipoImpressora;
    }

    public String getTgtxId() {
        return tgtxId;
    }

    public void setTgtxId(String tgtxId) {
        this.tgtxId = tgtxId;
    }

    public String getTgtxNome() {
        return tgtxNome;
    }

    public void setTgtxNome(String tgtxNome) {
        this.tgtxNome = tgtxNome;
    }

    public String getTgtxDescricao() {
        return tgtxDescricao;
    }

    public void setTgtxDescricao(String tgtxDescricao) {
        this.tgtxDescricao = tgtxDescricao;
    }

    public String getTgtxTexto() {
        return tgtxTexto;
    }

    public void setTgtxTexto(String tgtxTexto) {
        this.tgtxTexto = tgtxTexto;
    }

    public String getTgtxTextoCliente() {
        return tgtxTextoCliente;
    }

    public void setTgtxTextoCliente(String tgtxTextoCliente) {
        this.tgtxTextoCliente = tgtxTextoCliente;
    }

    public String getTgtxTipoUso() {
        return tgtxTipoUso;
    }

    public void setTgtxTipoUso(String tgtxTipoUso) {
        this.tgtxTipoUso = tgtxTipoUso;
    }

    public String getTgtxTipoImpressora() {
        return tgtxTipoImpressora;
    }

    public void setTgtxTipoImpressora(String tgtxTipoImpressora) {
        this.tgtxTipoImpressora = tgtxTipoImpressora;
    }

    public BigDecimal getTgtxLarguraEtiqueta() {
        return tgtxLarguraEtiqueta;
    }

    public void setTgtxLarguraEtiqueta(BigDecimal tgtxLarguraEtiqueta) {
        this.tgtxLarguraEtiqueta = tgtxLarguraEtiqueta;
    }

    public BigDecimal getTgtxAlturaEtiqueta() {
        return tgtxAlturaEtiqueta;
    }

    public void setTgtxAlturaEtiqueta(BigDecimal tgtxAlturaEtiqueta) {
        this.tgtxAlturaEtiqueta = tgtxAlturaEtiqueta;
    }

    public BigDecimal getTgtxMargemEsquerda() {
        return tgtxMargemEsquerda;
    }

    public void setTgtxMargemEsquerda(BigDecimal tgtxMargemEsquerda) {
        this.tgtxMargemEsquerda = tgtxMargemEsquerda;
    }

    public BigDecimal getTgtxMargemSuperior() {
        return tgtxMargemSuperior;
    }

    public void setTgtxMargemSuperior(BigDecimal tgtxMargemSuperior) {
        this.tgtxMargemSuperior = tgtxMargemSuperior;
    }

    public BigDecimal getTgtxMargemInferior() {
        return tgtxMargemInferior;
    }

    public void setTgtxMargemInferior(BigDecimal tgtxMargemInferior) {
        this.tgtxMargemInferior = tgtxMargemInferior;
    }

    public BigDecimal getTgtxMargemDireita() {
        return tgtxMargemDireita;
    }

    public void setTgtxMargemDireita(BigDecimal tgtxMargemDireita) {
        this.tgtxMargemDireita = tgtxMargemDireita;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tgtxId != null ? tgtxId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TagsTextos)) {
            return false;
        }
        TagsTextos other = (TagsTextos) object;
        if ((this.tgtxId == null && other.tgtxId != null) || (this.tgtxId != null && !this.tgtxId.equals(other.tgtxId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.TagsTextos[ tgtxId=" + tgtxId + " ]";
    }
    
}
