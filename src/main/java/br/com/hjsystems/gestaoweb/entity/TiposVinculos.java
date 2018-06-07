/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hjsystems.gestaoweb.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name = "TIPOS_VINCULOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TiposVinculos.findAll", query = "SELECT t FROM TiposVinculos t"),
    @NamedQuery(name = "TiposVinculos.findByTpvcId", query = "SELECT t FROM TiposVinculos t WHERE t.tpvcId = :tpvcId"),
    @NamedQuery(name = "TiposVinculos.findByTpvcNome", query = "SELECT t FROM TiposVinculos t WHERE t.tpvcNome = :tpvcNome"),
    @NamedQuery(name = "TiposVinculos.findByTpvcTipoPessoa", query = "SELECT t FROM TiposVinculos t WHERE t.tpvcTipoPessoa = :tpvcTipoPessoa"),
    @NamedQuery(name = "TiposVinculos.findByTpvcCpfcnpjObrigatorio", query = "SELECT t FROM TiposVinculos t WHERE t.tpvcCpfcnpjObrigatorio = :tpvcCpfcnpjObrigatorio")})
public class TiposVinculos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TPVC_ID")
    private String tpvcId;
    @Basic(optional = false)
    @Column(name = "TPVC_NOME")
    private String tpvcNome;
    @Basic(optional = false)
    @Column(name = "TPVC_TIPO_PESSOA")
    private String tpvcTipoPessoa;
    @Column(name = "TPVC_CPFCNPJ_OBRIGATORIO")
    private String tpvcCpfcnpjObrigatorio;
    @OneToMany(mappedBy = "tpvcId")
    private List<VinculosPessoas> vinculosPessoasList;

    public TiposVinculos() {
    }

    public TiposVinculos(String tpvcId) {
        this.tpvcId = tpvcId;
    }

    public TiposVinculos(String tpvcId, String tpvcNome, String tpvcTipoPessoa) {
        this.tpvcId = tpvcId;
        this.tpvcNome = tpvcNome;
        this.tpvcTipoPessoa = tpvcTipoPessoa;
    }

    public String getTpvcId() {
        return tpvcId;
    }

    public void setTpvcId(String tpvcId) {
        this.tpvcId = tpvcId;
    }

    public String getTpvcNome() {
        return tpvcNome;
    }

    public void setTpvcNome(String tpvcNome) {
        this.tpvcNome = tpvcNome;
    }

    public String getTpvcTipoPessoa() {
        return tpvcTipoPessoa;
    }

    public void setTpvcTipoPessoa(String tpvcTipoPessoa) {
        this.tpvcTipoPessoa = tpvcTipoPessoa;
    }

    public String getTpvcCpfcnpjObrigatorio() {
        return tpvcCpfcnpjObrigatorio;
    }

    public void setTpvcCpfcnpjObrigatorio(String tpvcCpfcnpjObrigatorio) {
        this.tpvcCpfcnpjObrigatorio = tpvcCpfcnpjObrigatorio;
    }

    @XmlTransient
    public List<VinculosPessoas> getVinculosPessoasList() {
        return vinculosPessoasList;
    }

    public void setVinculosPessoasList(List<VinculosPessoas> vinculosPessoasList) {
        this.vinculosPessoasList = vinculosPessoasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tpvcId != null ? tpvcId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TiposVinculos)) {
            return false;
        }
        TiposVinculos other = (TiposVinculos) object;
        if ((this.tpvcId == null && other.tpvcId != null) || (this.tpvcId != null && !this.tpvcId.equals(other.tpvcId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.TiposVinculos[ tpvcId=" + tpvcId + " ]";
    }
    
}
