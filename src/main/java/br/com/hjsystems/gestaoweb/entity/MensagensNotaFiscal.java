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
@Table(name = "MENSAGENS_NOTA_FISCAL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MensagensNotaFiscal.findAll", query = "SELECT m FROM MensagensNotaFiscal m"),
    @NamedQuery(name = "MensagensNotaFiscal.findByMsnfId", query = "SELECT m FROM MensagensNotaFiscal m WHERE m.msnfId = :msnfId"),
    @NamedQuery(name = "MensagensNotaFiscal.findByMsnfMensagem", query = "SELECT m FROM MensagensNotaFiscal m WHERE m.msnfMensagem = :msnfMensagem"),
    @NamedQuery(name = "MensagensNotaFiscal.findByMsNFLASTUPDATE", query = "SELECT m FROM MensagensNotaFiscal m WHERE m.msNFLASTUPDATE = :msNFLASTUPDATE")})
public class MensagensNotaFiscal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MSNF_ID")
    private String msnfId;
    @Column(name = "MSNF_MENSAGEM")
    private String msnfMensagem;
    @Column(name = "MsNF_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date msNFLASTUPDATE;
    @OneToMany(mappedBy = "msnfId")
    private List<ItensFaturados> itensFaturadosList;
    @OneToMany(mappedBy = "msnfId")
    private List<ClassificacaoFiscal> classificacaoFiscalList;

    public MensagensNotaFiscal() {
    }

    public MensagensNotaFiscal(String msnfId) {
        this.msnfId = msnfId;
    }

    public String getMsnfId() {
        return msnfId;
    }

    public void setMsnfId(String msnfId) {
        this.msnfId = msnfId;
    }

    public String getMsnfMensagem() {
        return msnfMensagem;
    }

    public void setMsnfMensagem(String msnfMensagem) {
        this.msnfMensagem = msnfMensagem;
    }

    public Date getMsNFLASTUPDATE() {
        return msNFLASTUPDATE;
    }

    public void setMsNFLASTUPDATE(Date msNFLASTUPDATE) {
        this.msNFLASTUPDATE = msNFLASTUPDATE;
    }

    @XmlTransient
    public List<ItensFaturados> getItensFaturadosList() {
        return itensFaturadosList;
    }

    public void setItensFaturadosList(List<ItensFaturados> itensFaturadosList) {
        this.itensFaturadosList = itensFaturadosList;
    }

    @XmlTransient
    public List<ClassificacaoFiscal> getClassificacaoFiscalList() {
        return classificacaoFiscalList;
    }

    public void setClassificacaoFiscalList(List<ClassificacaoFiscal> classificacaoFiscalList) {
        this.classificacaoFiscalList = classificacaoFiscalList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (msnfId != null ? msnfId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MensagensNotaFiscal)) {
            return false;
        }
        MensagensNotaFiscal other = (MensagensNotaFiscal) object;
        if ((this.msnfId == null && other.msnfId != null) || (this.msnfId != null && !this.msnfId.equals(other.msnfId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.MensagensNotaFiscal[ msnfId=" + msnfId + " ]";
    }
    
}
