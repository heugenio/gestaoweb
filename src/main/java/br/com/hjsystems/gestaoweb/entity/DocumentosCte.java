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
@Table(name = "DOCUMENTOS_CTE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DocumentosCte.findAll", query = "SELECT d FROM DocumentosCte d"),
    @NamedQuery(name = "DocumentosCte.findByDcteId", query = "SELECT d FROM DocumentosCte d WHERE d.dcteId = :dcteId"),
    @NamedQuery(name = "DocumentosCte.findByDcteNumeroNota", query = "SELECT d FROM DocumentosCte d WHERE d.dcteNumeroNota = :dcteNumeroNota"),
    @NamedQuery(name = "DocumentosCte.findByDcteSerieNota", query = "SELECT d FROM DocumentosCte d WHERE d.dcteSerieNota = :dcteSerieNota"),
    @NamedQuery(name = "DocumentosCte.findByDcteModeloNota", query = "SELECT d FROM DocumentosCte d WHERE d.dcteModeloNota = :dcteModeloNota"),
    @NamedQuery(name = "DocumentosCte.findByDcteChaveNfe", query = "SELECT d FROM DocumentosCte d WHERE d.dcteChaveNfe = :dcteChaveNfe"),
    @NamedQuery(name = "DocumentosCte.findByDcteValorNota", query = "SELECT d FROM DocumentosCte d WHERE d.dcteValorNota = :dcteValorNota"),
    @NamedQuery(name = "DocumentosCte.findByDctePeso", query = "SELECT d FROM DocumentosCte d WHERE d.dctePeso = :dctePeso"),
    @NamedQuery(name = "DocumentosCte.findByDcteLastupdate", query = "SELECT d FROM DocumentosCte d WHERE d.dcteLastupdate = :dcteLastupdate"),
    @NamedQuery(name = "DocumentosCte.findByDcteProduto", query = "SELECT d FROM DocumentosCte d WHERE d.dcteProduto = :dcteProduto")})
public class DocumentosCte implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DCTE_ID")
    private String dcteId;
    @Column(name = "DCTE_NUMERO_NOTA")
    private String dcteNumeroNota;
    @Column(name = "DCTE_SERIE_NOTA")
    private String dcteSerieNota;
    @Column(name = "DCTE_MODELO_NOTA")
    private String dcteModeloNota;
    @Column(name = "DCTE_CHAVE_NFE")
    private String dcteChaveNfe;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "DCTE_VALOR_NOTA")
    private BigDecimal dcteValorNota;
    @Column(name = "DCTE_PESO")
    private BigDecimal dctePeso;
    @Column(name = "DCTE_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dcteLastupdate;
    @Column(name = "DCTE_PRODUTO")
    private String dcteProduto;
    @JoinColumn(name = "DOC_DCFS_ID", referencedColumnName = "DCFS_ID")
    @ManyToOne
    private DocumentosFiscais docDcfsId;
    @JoinColumn(name = "DCFS_ID", referencedColumnName = "DCFS_ID")
    @ManyToOne
    private DocumentosFiscais dcfsId;

    public DocumentosCte() {
    }

    public DocumentosCte(String dcteId) {
        this.dcteId = dcteId;
    }

    public DocumentosCte(String dcteId, BigDecimal dcteValorNota) {
        this.dcteId = dcteId;
        this.dcteValorNota = dcteValorNota;
    }

    public String getDcteId() {
        return dcteId;
    }

    public void setDcteId(String dcteId) {
        this.dcteId = dcteId;
    }

    public String getDcteNumeroNota() {
        return dcteNumeroNota;
    }

    public void setDcteNumeroNota(String dcteNumeroNota) {
        this.dcteNumeroNota = dcteNumeroNota;
    }

    public String getDcteSerieNota() {
        return dcteSerieNota;
    }

    public void setDcteSerieNota(String dcteSerieNota) {
        this.dcteSerieNota = dcteSerieNota;
    }

    public String getDcteModeloNota() {
        return dcteModeloNota;
    }

    public void setDcteModeloNota(String dcteModeloNota) {
        this.dcteModeloNota = dcteModeloNota;
    }

    public String getDcteChaveNfe() {
        return dcteChaveNfe;
    }

    public void setDcteChaveNfe(String dcteChaveNfe) {
        this.dcteChaveNfe = dcteChaveNfe;
    }

    public BigDecimal getDcteValorNota() {
        return dcteValorNota;
    }

    public void setDcteValorNota(BigDecimal dcteValorNota) {
        this.dcteValorNota = dcteValorNota;
    }

    public BigDecimal getDctePeso() {
        return dctePeso;
    }

    public void setDctePeso(BigDecimal dctePeso) {
        this.dctePeso = dctePeso;
    }

    public Date getDcteLastupdate() {
        return dcteLastupdate;
    }

    public void setDcteLastupdate(Date dcteLastupdate) {
        this.dcteLastupdate = dcteLastupdate;
    }

    public String getDcteProduto() {
        return dcteProduto;
    }

    public void setDcteProduto(String dcteProduto) {
        this.dcteProduto = dcteProduto;
    }

    public DocumentosFiscais getDocDcfsId() {
        return docDcfsId;
    }

    public void setDocDcfsId(DocumentosFiscais docDcfsId) {
        this.docDcfsId = docDcfsId;
    }

    public DocumentosFiscais getDcfsId() {
        return dcfsId;
    }

    public void setDcfsId(DocumentosFiscais dcfsId) {
        this.dcfsId = dcfsId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dcteId != null ? dcteId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DocumentosCte)) {
            return false;
        }
        DocumentosCte other = (DocumentosCte) object;
        if ((this.dcteId == null && other.dcteId != null) || (this.dcteId != null && !this.dcteId.equals(other.dcteId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.DocumentosCte[ dcteId=" + dcteId + " ]";
    }
    
}
