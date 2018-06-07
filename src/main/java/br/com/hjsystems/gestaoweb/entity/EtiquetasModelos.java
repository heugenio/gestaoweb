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
@Table(name = "ETIQUETAS_MODELOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EtiquetasModelos.findAll", query = "SELECT e FROM EtiquetasModelos e"),
    @NamedQuery(name = "EtiquetasModelos.findByEtmdId", query = "SELECT e FROM EtiquetasModelos e WHERE e.etmdId = :etmdId"),
    @NamedQuery(name = "EtiquetasModelos.findByEtmdDescricao", query = "SELECT e FROM EtiquetasModelos e WHERE e.etmdDescricao = :etmdDescricao"),
    @NamedQuery(name = "EtiquetasModelos.findByEtmdAlturaPapel", query = "SELECT e FROM EtiquetasModelos e WHERE e.etmdAlturaPapel = :etmdAlturaPapel"),
    @NamedQuery(name = "EtiquetasModelos.findByEtmdLarguraPapel", query = "SELECT e FROM EtiquetasModelos e WHERE e.etmdLarguraPapel = :etmdLarguraPapel"),
    @NamedQuery(name = "EtiquetasModelos.findByEtmdMargemSuperior", query = "SELECT e FROM EtiquetasModelos e WHERE e.etmdMargemSuperior = :etmdMargemSuperior"),
    @NamedQuery(name = "EtiquetasModelos.findByEtmdMargemInferior", query = "SELECT e FROM EtiquetasModelos e WHERE e.etmdMargemInferior = :etmdMargemInferior"),
    @NamedQuery(name = "EtiquetasModelos.findByEtmdMargemEsquerda", query = "SELECT e FROM EtiquetasModelos e WHERE e.etmdMargemEsquerda = :etmdMargemEsquerda"),
    @NamedQuery(name = "EtiquetasModelos.findByEtmdMargemDireita", query = "SELECT e FROM EtiquetasModelos e WHERE e.etmdMargemDireita = :etmdMargemDireita"),
    @NamedQuery(name = "EtiquetasModelos.findByEtmdEspacoEntreColunas", query = "SELECT e FROM EtiquetasModelos e WHERE e.etmdEspacoEntreColunas = :etmdEspacoEntreColunas"),
    @NamedQuery(name = "EtiquetasModelos.findByEtmdAlturaEtiqueta", query = "SELECT e FROM EtiquetasModelos e WHERE e.etmdAlturaEtiqueta = :etmdAlturaEtiqueta"),
    @NamedQuery(name = "EtiquetasModelos.findByEtmdLarguraEtiqueta", query = "SELECT e FROM EtiquetasModelos e WHERE e.etmdLarguraEtiqueta = :etmdLarguraEtiqueta"),
    @NamedQuery(name = "EtiquetasModelos.findByEtmdColunasPorPagina", query = "SELECT e FROM EtiquetasModelos e WHERE e.etmdColunasPorPagina = :etmdColunasPorPagina"),
    @NamedQuery(name = "EtiquetasModelos.findByEtmdLinhasPorPagina", query = "SELECT e FROM EtiquetasModelos e WHERE e.etmdLinhasPorPagina = :etmdLinhasPorPagina"),
    @NamedQuery(name = "EtiquetasModelos.findByEtmdOrdemImpressao", query = "SELECT e FROM EtiquetasModelos e WHERE e.etmdOrdemImpressao = :etmdOrdemImpressao"),
    @NamedQuery(name = "EtiquetasModelos.findByEtmdOrientacaoPapel", query = "SELECT e FROM EtiquetasModelos e WHERE e.etmdOrientacaoPapel = :etmdOrientacaoPapel"),
    @NamedQuery(name = "EtiquetasModelos.findByEtMdLASTUPDATE", query = "SELECT e FROM EtiquetasModelos e WHERE e.etMdLASTUPDATE = :etMdLASTUPDATE")})
public class EtiquetasModelos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ETMD_ID")
    private String etmdId;
    @Basic(optional = false)
    @Column(name = "ETMD_DESCRICAO")
    private String etmdDescricao;
    @Column(name = "ETMD_ALTURA_PAPEL")
    private Integer etmdAlturaPapel;
    @Column(name = "ETMD_LARGURA_PAPEL")
    private Integer etmdLarguraPapel;
    @Column(name = "ETMD_MARGEM_SUPERIOR")
    private Integer etmdMargemSuperior;
    @Column(name = "ETMD_MARGEM_INFERIOR")
    private Integer etmdMargemInferior;
    @Column(name = "ETMD_MARGEM_ESQUERDA")
    private Integer etmdMargemEsquerda;
    @Column(name = "ETMD_MARGEM_DIREITA")
    private Integer etmdMargemDireita;
    @Column(name = "ETMD_ESPACO_ENTRE_COLUNAS")
    private Integer etmdEspacoEntreColunas;
    @Column(name = "ETMD_ALTURA_ETIQUETA")
    private Integer etmdAlturaEtiqueta;
    @Column(name = "ETMD_LARGURA_ETIQUETA")
    private Integer etmdLarguraEtiqueta;
    @Column(name = "ETMD_COLUNAS_POR_PAGINA")
    private Integer etmdColunasPorPagina;
    @Column(name = "ETMD_LINHAS_POR_PAGINA")
    private Integer etmdLinhasPorPagina;
    @Column(name = "ETMD_ORDEM_IMPRESSAO")
    private Integer etmdOrdemImpressao;
    @Column(name = "ETMD_ORIENTACAO_PAPEL")
    private Integer etmdOrientacaoPapel;
    @Column(name = "EtMd_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date etMdLASTUPDATE;
    @OneToMany(mappedBy = "etmdId")
    private List<EtiquetaLayout> etiquetaLayoutList;
    @JoinColumn(name = "TMPP_ID", referencedColumnName = "TMPP_ID")
    @ManyToOne
    private TamanhosPapeis tmppId;

    public EtiquetasModelos() {
    }

    public EtiquetasModelos(String etmdId) {
        this.etmdId = etmdId;
    }

    public EtiquetasModelos(String etmdId, String etmdDescricao) {
        this.etmdId = etmdId;
        this.etmdDescricao = etmdDescricao;
    }

    public String getEtmdId() {
        return etmdId;
    }

    public void setEtmdId(String etmdId) {
        this.etmdId = etmdId;
    }

    public String getEtmdDescricao() {
        return etmdDescricao;
    }

    public void setEtmdDescricao(String etmdDescricao) {
        this.etmdDescricao = etmdDescricao;
    }

    public Integer getEtmdAlturaPapel() {
        return etmdAlturaPapel;
    }

    public void setEtmdAlturaPapel(Integer etmdAlturaPapel) {
        this.etmdAlturaPapel = etmdAlturaPapel;
    }

    public Integer getEtmdLarguraPapel() {
        return etmdLarguraPapel;
    }

    public void setEtmdLarguraPapel(Integer etmdLarguraPapel) {
        this.etmdLarguraPapel = etmdLarguraPapel;
    }

    public Integer getEtmdMargemSuperior() {
        return etmdMargemSuperior;
    }

    public void setEtmdMargemSuperior(Integer etmdMargemSuperior) {
        this.etmdMargemSuperior = etmdMargemSuperior;
    }

    public Integer getEtmdMargemInferior() {
        return etmdMargemInferior;
    }

    public void setEtmdMargemInferior(Integer etmdMargemInferior) {
        this.etmdMargemInferior = etmdMargemInferior;
    }

    public Integer getEtmdMargemEsquerda() {
        return etmdMargemEsquerda;
    }

    public void setEtmdMargemEsquerda(Integer etmdMargemEsquerda) {
        this.etmdMargemEsquerda = etmdMargemEsquerda;
    }

    public Integer getEtmdMargemDireita() {
        return etmdMargemDireita;
    }

    public void setEtmdMargemDireita(Integer etmdMargemDireita) {
        this.etmdMargemDireita = etmdMargemDireita;
    }

    public Integer getEtmdEspacoEntreColunas() {
        return etmdEspacoEntreColunas;
    }

    public void setEtmdEspacoEntreColunas(Integer etmdEspacoEntreColunas) {
        this.etmdEspacoEntreColunas = etmdEspacoEntreColunas;
    }

    public Integer getEtmdAlturaEtiqueta() {
        return etmdAlturaEtiqueta;
    }

    public void setEtmdAlturaEtiqueta(Integer etmdAlturaEtiqueta) {
        this.etmdAlturaEtiqueta = etmdAlturaEtiqueta;
    }

    public Integer getEtmdLarguraEtiqueta() {
        return etmdLarguraEtiqueta;
    }

    public void setEtmdLarguraEtiqueta(Integer etmdLarguraEtiqueta) {
        this.etmdLarguraEtiqueta = etmdLarguraEtiqueta;
    }

    public Integer getEtmdColunasPorPagina() {
        return etmdColunasPorPagina;
    }

    public void setEtmdColunasPorPagina(Integer etmdColunasPorPagina) {
        this.etmdColunasPorPagina = etmdColunasPorPagina;
    }

    public Integer getEtmdLinhasPorPagina() {
        return etmdLinhasPorPagina;
    }

    public void setEtmdLinhasPorPagina(Integer etmdLinhasPorPagina) {
        this.etmdLinhasPorPagina = etmdLinhasPorPagina;
    }

    public Integer getEtmdOrdemImpressao() {
        return etmdOrdemImpressao;
    }

    public void setEtmdOrdemImpressao(Integer etmdOrdemImpressao) {
        this.etmdOrdemImpressao = etmdOrdemImpressao;
    }

    public Integer getEtmdOrientacaoPapel() {
        return etmdOrientacaoPapel;
    }

    public void setEtmdOrientacaoPapel(Integer etmdOrientacaoPapel) {
        this.etmdOrientacaoPapel = etmdOrientacaoPapel;
    }

    public Date getEtMdLASTUPDATE() {
        return etMdLASTUPDATE;
    }

    public void setEtMdLASTUPDATE(Date etMdLASTUPDATE) {
        this.etMdLASTUPDATE = etMdLASTUPDATE;
    }

    @XmlTransient
    public List<EtiquetaLayout> getEtiquetaLayoutList() {
        return etiquetaLayoutList;
    }

    public void setEtiquetaLayoutList(List<EtiquetaLayout> etiquetaLayoutList) {
        this.etiquetaLayoutList = etiquetaLayoutList;
    }

    public TamanhosPapeis getTmppId() {
        return tmppId;
    }

    public void setTmppId(TamanhosPapeis tmppId) {
        this.tmppId = tmppId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (etmdId != null ? etmdId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EtiquetasModelos)) {
            return false;
        }
        EtiquetasModelos other = (EtiquetasModelos) object;
        if ((this.etmdId == null && other.etmdId != null) || (this.etmdId != null && !this.etmdId.equals(other.etmdId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.EtiquetasModelos[ etmdId=" + etmdId + " ]";
    }
    
}
