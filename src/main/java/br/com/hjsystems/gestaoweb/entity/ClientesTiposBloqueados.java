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
@Table(name = "CLIENTES_TIPOS_BLOQUEADOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ClientesTiposBloqueados.findAll", query = "SELECT c FROM ClientesTiposBloqueados c"),
    @NamedQuery(name = "ClientesTiposBloqueados.findByCtpbId", query = "SELECT c FROM ClientesTiposBloqueados c WHERE c.ctpbId = :ctpbId"),
    @NamedQuery(name = "ClientesTiposBloqueados.findByCtpbTipoPagamento", query = "SELECT c FROM ClientesTiposBloqueados c WHERE c.ctpbTipoPagamento = :ctpbTipoPagamento"),
    @NamedQuery(name = "ClientesTiposBloqueados.findByCtpbLastupdate", query = "SELECT c FROM ClientesTiposBloqueados c WHERE c.ctpbLastupdate = :ctpbLastupdate")})
public class ClientesTiposBloqueados implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CTPB_ID")
    private String ctpbId;
    @Basic(optional = false)
    @Column(name = "CTPB_TIPO_PAGAMENTO")
    private String ctpbTipoPagamento;
    @Column(name = "CTPB_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ctpbLastupdate;
    @JoinColumn(name = "CLNT_ID", referencedColumnName = "CLNT_ID")
    @ManyToOne
    private Clientes clntId;

    public ClientesTiposBloqueados() {
    }

    public ClientesTiposBloqueados(String ctpbId) {
        this.ctpbId = ctpbId;
    }

    public ClientesTiposBloqueados(String ctpbId, String ctpbTipoPagamento) {
        this.ctpbId = ctpbId;
        this.ctpbTipoPagamento = ctpbTipoPagamento;
    }

    public String getCtpbId() {
        return ctpbId;
    }

    public void setCtpbId(String ctpbId) {
        this.ctpbId = ctpbId;
    }

    public String getCtpbTipoPagamento() {
        return ctpbTipoPagamento;
    }

    public void setCtpbTipoPagamento(String ctpbTipoPagamento) {
        this.ctpbTipoPagamento = ctpbTipoPagamento;
    }

    public Date getCtpbLastupdate() {
        return ctpbLastupdate;
    }

    public void setCtpbLastupdate(Date ctpbLastupdate) {
        this.ctpbLastupdate = ctpbLastupdate;
    }

    public Clientes getClntId() {
        return clntId;
    }

    public void setClntId(Clientes clntId) {
        this.clntId = clntId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ctpbId != null ? ctpbId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClientesTiposBloqueados)) {
            return false;
        }
        ClientesTiposBloqueados other = (ClientesTiposBloqueados) object;
        if ((this.ctpbId == null && other.ctpbId != null) || (this.ctpbId != null && !this.ctpbId.equals(other.ctpbId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.ClientesTiposBloqueados[ ctpbId=" + ctpbId + " ]";
    }
    
}
