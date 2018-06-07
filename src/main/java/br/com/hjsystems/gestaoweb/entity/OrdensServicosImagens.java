/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hjsystems.gestaoweb.entity;

import java.io.Serializable;
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
@Table(name = "ORDENS_SERVICOS_IMAGENS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrdensServicosImagens.findAll", query = "SELECT o FROM OrdensServicosImagens o"),
    @NamedQuery(name = "OrdensServicosImagens.findByOsimId", query = "SELECT o FROM OrdensServicosImagens o WHERE o.osimId = :osimId")})
public class OrdensServicosImagens implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "OSIM_ID")
    private String osimId;
    @Lob
    @Column(name = "OSIM_IMAGEM")
    private byte[] osimImagem;
    @JoinColumn(name = "ORSV_ID", referencedColumnName = "ORSV_ID")
    @ManyToOne
    private OrdemServico orsvId;

    public OrdensServicosImagens() {
    }

    public OrdensServicosImagens(String osimId) {
        this.osimId = osimId;
    }

    public String getOsimId() {
        return osimId;
    }

    public void setOsimId(String osimId) {
        this.osimId = osimId;
    }

    public byte[] getOsimImagem() {
        return osimImagem;
    }

    public void setOsimImagem(byte[] osimImagem) {
        this.osimImagem = osimImagem;
    }

    public OrdemServico getOrsvId() {
        return orsvId;
    }

    public void setOrsvId(OrdemServico orsvId) {
        this.orsvId = orsvId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (osimId != null ? osimId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrdensServicosImagens)) {
            return false;
        }
        OrdensServicosImagens other = (OrdensServicosImagens) object;
        if ((this.osimId == null && other.osimId != null) || (this.osimId != null && !this.osimId.equals(other.osimId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.OrdensServicosImagens[ osimId=" + osimId + " ]";
    }
    
}
