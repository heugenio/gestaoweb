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
import javax.persistence.Lob;
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
@Table(name = "ORCAMENTOS_VENDAS_ANEXO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrcamentosVendasAnexo.findAll", query = "SELECT o FROM OrcamentosVendasAnexo o"),
    @NamedQuery(name = "OrcamentosVendasAnexo.findByOraxId", query = "SELECT o FROM OrcamentosVendasAnexo o WHERE o.oraxId = :oraxId"),
    @NamedQuery(name = "OrcamentosVendasAnexo.findByOrvdId", query = "SELECT o FROM OrcamentosVendasAnexo o WHERE o.orvdId = :orvdId"),
    @NamedQuery(name = "OrcamentosVendasAnexo.findByOraxDescricaoArquivo", query = "SELECT o FROM OrcamentosVendasAnexo o WHERE o.oraxDescricaoArquivo = :oraxDescricaoArquivo"),
    @NamedQuery(name = "OrcamentosVendasAnexo.findByOraxExtensaoArquivo", query = "SELECT o FROM OrcamentosVendasAnexo o WHERE o.oraxExtensaoArquivo = :oraxExtensaoArquivo"),
    @NamedQuery(name = "OrcamentosVendasAnexo.findByOraxLastupdate", query = "SELECT o FROM OrcamentosVendasAnexo o WHERE o.oraxLastupdate = :oraxLastupdate"),
    @NamedQuery(name = "OrcamentosVendasAnexo.findByPddsId", query = "SELECT o FROM OrcamentosVendasAnexo o WHERE o.pddsId = :pddsId"),
    @NamedQuery(name = "OrcamentosVendasAnexo.findByOraxTipo", query = "SELECT o FROM OrcamentosVendasAnexo o WHERE o.oraxTipo = :oraxTipo"),
    @NamedQuery(name = "OrcamentosVendasAnexo.findByUsrsId", query = "SELECT o FROM OrcamentosVendasAnexo o WHERE o.usrsId = :usrsId")})
public class OrcamentosVendasAnexo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ORAX_ID")
    private String oraxId;
    @Column(name = "ORVD_ID")
    private String orvdId;
    @Column(name = "ORAX_DESCRICAO_ARQUIVO")
    private String oraxDescricaoArquivo;
    @Lob
    @Column(name = "ORAX_ARQUIVO")
    private byte[] oraxArquivo;
    @Lob
    @Column(name = "ORAX_OBSERVACAO")
    private String oraxObservacao;
    @Column(name = "ORAX_EXTENSAO_ARQUIVO")
    private String oraxExtensaoArquivo;
    @Column(name = "ORAX_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date oraxLastupdate;
    @Column(name = "PDDS_ID")
    private String pddsId;
    @Column(name = "ORAX_TIPO")
    private String oraxTipo;
    @Column(name = "USRS_ID")
    private String usrsId;

    public OrcamentosVendasAnexo() {
    }

    public OrcamentosVendasAnexo(String oraxId) {
        this.oraxId = oraxId;
    }

    public String getOraxId() {
        return oraxId;
    }

    public void setOraxId(String oraxId) {
        this.oraxId = oraxId;
    }

    public String getOrvdId() {
        return orvdId;
    }

    public void setOrvdId(String orvdId) {
        this.orvdId = orvdId;
    }

    public String getOraxDescricaoArquivo() {
        return oraxDescricaoArquivo;
    }

    public void setOraxDescricaoArquivo(String oraxDescricaoArquivo) {
        this.oraxDescricaoArquivo = oraxDescricaoArquivo;
    }

    public byte[] getOraxArquivo() {
        return oraxArquivo;
    }

    public void setOraxArquivo(byte[] oraxArquivo) {
        this.oraxArquivo = oraxArquivo;
    }

    public String getOraxObservacao() {
        return oraxObservacao;
    }

    public void setOraxObservacao(String oraxObservacao) {
        this.oraxObservacao = oraxObservacao;
    }

    public String getOraxExtensaoArquivo() {
        return oraxExtensaoArquivo;
    }

    public void setOraxExtensaoArquivo(String oraxExtensaoArquivo) {
        this.oraxExtensaoArquivo = oraxExtensaoArquivo;
    }

    public Date getOraxLastupdate() {
        return oraxLastupdate;
    }

    public void setOraxLastupdate(Date oraxLastupdate) {
        this.oraxLastupdate = oraxLastupdate;
    }

    public String getPddsId() {
        return pddsId;
    }

    public void setPddsId(String pddsId) {
        this.pddsId = pddsId;
    }

    public String getOraxTipo() {
        return oraxTipo;
    }

    public void setOraxTipo(String oraxTipo) {
        this.oraxTipo = oraxTipo;
    }

    public String getUsrsId() {
        return usrsId;
    }

    public void setUsrsId(String usrsId) {
        this.usrsId = usrsId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (oraxId != null ? oraxId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrcamentosVendasAnexo)) {
            return false;
        }
        OrcamentosVendasAnexo other = (OrcamentosVendasAnexo) object;
        if ((this.oraxId == null && other.oraxId != null) || (this.oraxId != null && !this.oraxId.equals(other.oraxId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.OrcamentosVendasAnexo[ oraxId=" + oraxId + " ]";
    }
    
}
