/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hjsystems.gestaoweb.entity;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "UNEM_ENDERECOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UnemEnderecos.findAll", query = "SELECT u FROM UnemEnderecos u"),
    @NamedQuery(name = "UnemEnderecos.findByUnenId", query = "SELECT u FROM UnemEnderecos u WHERE u.unenId = :unenId"),
    @NamedQuery(name = "UnemEnderecos.findByUnenTipoLogradouro", query = "SELECT u FROM UnemEnderecos u WHERE u.unenTipoLogradouro = :unenTipoLogradouro"),
    @NamedQuery(name = "UnemEnderecos.findByUnenLogradouro", query = "SELECT u FROM UnemEnderecos u WHERE u.unenLogradouro = :unenLogradouro"),
    @NamedQuery(name = "UnemEnderecos.findByUnenNumero", query = "SELECT u FROM UnemEnderecos u WHERE u.unenNumero = :unenNumero"),
    @NamedQuery(name = "UnemEnderecos.findByUnenComplemento", query = "SELECT u FROM UnemEnderecos u WHERE u.unenComplemento = :unenComplemento"),
    @NamedQuery(name = "UnemEnderecos.findByUnenCep", query = "SELECT u FROM UnemEnderecos u WHERE u.unenCep = :unenCep"),
    @NamedQuery(name = "UnemEnderecos.findByUnenZona", query = "SELECT u FROM UnemEnderecos u WHERE u.unenZona = :unenZona"),
    @NamedQuery(name = "UnemEnderecos.findByUnenDistanciaKm", query = "SELECT u FROM UnemEnderecos u WHERE u.unenDistanciaKm = :unenDistanciaKm"),
    @NamedQuery(name = "UnemEnderecos.findByUnenBairro", query = "SELECT u FROM UnemEnderecos u WHERE u.unenBairro = :unenBairro"),
    @NamedQuery(name = "UnemEnderecos.findByUnenMunicipio", query = "SELECT u FROM UnemEnderecos u WHERE u.unenMunicipio = :unenMunicipio"),
    @NamedQuery(name = "UnemEnderecos.findByUnenDistanciaKmMunicipio", query = "SELECT u FROM UnemEnderecos u WHERE u.unenDistanciaKmMunicipio = :unenDistanciaKmMunicipio"),
    @NamedQuery(name = "UnemEnderecos.findByUnenCepMunicipio", query = "SELECT u FROM UnemEnderecos u WHERE u.unenCepMunicipio = :unenCepMunicipio"),
    @NamedQuery(name = "UnemEnderecos.findByUnenIbgeMunicipio", query = "SELECT u FROM UnemEnderecos u WHERE u.unenIbgeMunicipio = :unenIbgeMunicipio"),
    @NamedQuery(name = "UnemEnderecos.findByUnenEstado", query = "SELECT u FROM UnemEnderecos u WHERE u.unenEstado = :unenEstado"),
    @NamedQuery(name = "UnemEnderecos.findByUnenUfEstado", query = "SELECT u FROM UnemEnderecos u WHERE u.unenUfEstado = :unenUfEstado"),
    @NamedQuery(name = "UnemEnderecos.findByUnenPreposicaoEstado", query = "SELECT u FROM UnemEnderecos u WHERE u.unenPreposicaoEstado = :unenPreposicaoEstado"),
    @NamedQuery(name = "UnemEnderecos.findByUnenIbgeEstado", query = "SELECT u FROM UnemEnderecos u WHERE u.unenIbgeEstado = :unenIbgeEstado"),
    @NamedQuery(name = "UnemEnderecos.findByUnenComarcaMunicipio", query = "SELECT u FROM UnemEnderecos u WHERE u.unenComarcaMunicipio = :unenComarcaMunicipio"),
    @NamedQuery(name = "UnemEnderecos.findByUnenDistanciaKmComarca", query = "SELECT u FROM UnemEnderecos u WHERE u.unenDistanciaKmComarca = :unenDistanciaKmComarca"),
    @NamedQuery(name = "UnemEnderecos.findByUnenCepComarca", query = "SELECT u FROM UnemEnderecos u WHERE u.unenCepComarca = :unenCepComarca"),
    @NamedQuery(name = "UnemEnderecos.findByUnenIbgeComarca", query = "SELECT u FROM UnemEnderecos u WHERE u.unenIbgeComarca = :unenIbgeComarca"),
    @NamedQuery(name = "UnemEnderecos.findByUnenPais", query = "SELECT u FROM UnemEnderecos u WHERE u.unenPais = :unenPais"),
    @NamedQuery(name = "UnemEnderecos.findByUnenSiglaPais", query = "SELECT u FROM UnemEnderecos u WHERE u.unenSiglaPais = :unenSiglaPais"),
    @NamedQuery(name = "UnemEnderecos.findByUnenCodRecFederalPais", query = "SELECT u FROM UnemEnderecos u WHERE u.unenCodRecFederalPais = :unenCodRecFederalPais"),
    @NamedQuery(name = "UnemEnderecos.findByUnenCodigoBacenPais", query = "SELECT u FROM UnemEnderecos u WHERE u.unenCodigoBacenPais = :unenCodigoBacenPais"),
    @NamedQuery(name = "UnemEnderecos.findByUnenObservacao", query = "SELECT u FROM UnemEnderecos u WHERE u.unenObservacao = :unenObservacao"),
    @NamedQuery(name = "UnemEnderecos.findByUnEnLASTUPDATE", query = "SELECT u FROM UnemEnderecos u WHERE u.unEnLASTUPDATE = :unEnLASTUPDATE")})
public class UnemEnderecos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "UNEN_ID")
    private String unenId;
    @Basic(optional = false)
    @Column(name = "UNEN_TIPO_LOGRADOURO")
    private String unenTipoLogradouro;
    @Basic(optional = false)
    @Column(name = "UNEN_LOGRADOURO")
    private String unenLogradouro;
    @Column(name = "UNEN_NUMERO")
    private String unenNumero;
    @Column(name = "UNEN_COMPLEMENTO")
    private String unenComplemento;
    @Basic(optional = false)
    @Column(name = "UNEN_CEP")
    private String unenCep;
    @Basic(optional = false)
    @Column(name = "UNEN_ZONA")
    private String unenZona;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "UNEN_DISTANCIA_KM")
    private BigDecimal unenDistanciaKm;
    @Column(name = "UNEN_BAIRRO")
    private String unenBairro;
    @Column(name = "UNEN_MUNICIPIO")
    private String unenMunicipio;
    @Column(name = "UNEN_DISTANCIA_KM_MUNICIPIO")
    private BigDecimal unenDistanciaKmMunicipio;
    @Column(name = "UNEN_CEP_MUNICIPIO")
    private String unenCepMunicipio;
    @Column(name = "UNEN_IBGE_MUNICIPIO")
    private String unenIbgeMunicipio;
    @Column(name = "UNEN_ESTADO")
    private String unenEstado;
    @Column(name = "UNEN_UF_ESTADO")
    private String unenUfEstado;
    @Column(name = "UNEN_PREPOSICAO_ESTADO")
    private String unenPreposicaoEstado;
    @Column(name = "UNEN_IBGE_ESTADO")
    private String unenIbgeEstado;
    @Column(name = "UNEN_COMARCA_MUNICIPIO")
    private String unenComarcaMunicipio;
    @Column(name = "UNEN_DISTANCIA_KM_COMARCA")
    private BigDecimal unenDistanciaKmComarca;
    @Column(name = "UNEN_CEP_COMARCA")
    private String unenCepComarca;
    @Column(name = "UNEN_IBGE_COMARCA")
    private String unenIbgeComarca;
    @Column(name = "UNEN_PAIS")
    private String unenPais;
    @Column(name = "UNEN_SIGLA_PAIS")
    private String unenSiglaPais;
    @Column(name = "UNEN_COD_REC_FEDERAL_PAIS")
    private String unenCodRecFederalPais;
    @Column(name = "UNEN_CODIGO_BACEN_PAIS")
    private String unenCodigoBacenPais;
    @Column(name = "UNEN_OBSERVACAO")
    private String unenObservacao;
    @Column(name = "UnEn_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date unEnLASTUPDATE;
    @OneToMany(mappedBy = "unenId")
    private List<UnemDocumentos> unemDocumentosList;
    @JoinColumn(name = "TPEN_ID", referencedColumnName = "TPEN_ID")
    @ManyToOne
    private TiposEndereco tpenId;
    @JoinColumn(name = "UNEM_ID", referencedColumnName = "UNEM_ID")
    @ManyToOne
    private UnidadesEmpresariais unemId;

    public UnemEnderecos() {
    }

    public UnemEnderecos(String unenId) {
        this.unenId = unenId;
    }

    public UnemEnderecos(String unenId, String unenTipoLogradouro, String unenLogradouro, String unenCep, String unenZona) {
        this.unenId = unenId;
        this.unenTipoLogradouro = unenTipoLogradouro;
        this.unenLogradouro = unenLogradouro;
        this.unenCep = unenCep;
        this.unenZona = unenZona;
    }

    public String getUnenId() {
        return unenId;
    }

    public void setUnenId(String unenId) {
        this.unenId = unenId;
    }

    public String getUnenTipoLogradouro() {
        return unenTipoLogradouro;
    }

    public void setUnenTipoLogradouro(String unenTipoLogradouro) {
        this.unenTipoLogradouro = unenTipoLogradouro;
    }

    public String getUnenLogradouro() {
        return unenLogradouro;
    }

    public void setUnenLogradouro(String unenLogradouro) {
        this.unenLogradouro = unenLogradouro;
    }

    public String getUnenNumero() {
        return unenNumero;
    }

    public void setUnenNumero(String unenNumero) {
        this.unenNumero = unenNumero;
    }

    public String getUnenComplemento() {
        return unenComplemento;
    }

    public void setUnenComplemento(String unenComplemento) {
        this.unenComplemento = unenComplemento;
    }

    public String getUnenCep() {
        return unenCep;
    }

    public void setUnenCep(String unenCep) {
        this.unenCep = unenCep;
    }

    public String getUnenZona() {
        return unenZona;
    }

    public void setUnenZona(String unenZona) {
        this.unenZona = unenZona;
    }

    public BigDecimal getUnenDistanciaKm() {
        return unenDistanciaKm;
    }

    public void setUnenDistanciaKm(BigDecimal unenDistanciaKm) {
        this.unenDistanciaKm = unenDistanciaKm;
    }

    public String getUnenBairro() {
        return unenBairro;
    }

    public void setUnenBairro(String unenBairro) {
        this.unenBairro = unenBairro;
    }

    public String getUnenMunicipio() {
        return unenMunicipio;
    }

    public void setUnenMunicipio(String unenMunicipio) {
        this.unenMunicipio = unenMunicipio;
    }

    public BigDecimal getUnenDistanciaKmMunicipio() {
        return unenDistanciaKmMunicipio;
    }

    public void setUnenDistanciaKmMunicipio(BigDecimal unenDistanciaKmMunicipio) {
        this.unenDistanciaKmMunicipio = unenDistanciaKmMunicipio;
    }

    public String getUnenCepMunicipio() {
        return unenCepMunicipio;
    }

    public void setUnenCepMunicipio(String unenCepMunicipio) {
        this.unenCepMunicipio = unenCepMunicipio;
    }

    public String getUnenIbgeMunicipio() {
        return unenIbgeMunicipio;
    }

    public void setUnenIbgeMunicipio(String unenIbgeMunicipio) {
        this.unenIbgeMunicipio = unenIbgeMunicipio;
    }

    public String getUnenEstado() {
        return unenEstado;
    }

    public void setUnenEstado(String unenEstado) {
        this.unenEstado = unenEstado;
    }

    public String getUnenUfEstado() {
        return unenUfEstado;
    }

    public void setUnenUfEstado(String unenUfEstado) {
        this.unenUfEstado = unenUfEstado;
    }

    public String getUnenPreposicaoEstado() {
        return unenPreposicaoEstado;
    }

    public void setUnenPreposicaoEstado(String unenPreposicaoEstado) {
        this.unenPreposicaoEstado = unenPreposicaoEstado;
    }

    public String getUnenIbgeEstado() {
        return unenIbgeEstado;
    }

    public void setUnenIbgeEstado(String unenIbgeEstado) {
        this.unenIbgeEstado = unenIbgeEstado;
    }

    public String getUnenComarcaMunicipio() {
        return unenComarcaMunicipio;
    }

    public void setUnenComarcaMunicipio(String unenComarcaMunicipio) {
        this.unenComarcaMunicipio = unenComarcaMunicipio;
    }

    public BigDecimal getUnenDistanciaKmComarca() {
        return unenDistanciaKmComarca;
    }

    public void setUnenDistanciaKmComarca(BigDecimal unenDistanciaKmComarca) {
        this.unenDistanciaKmComarca = unenDistanciaKmComarca;
    }

    public String getUnenCepComarca() {
        return unenCepComarca;
    }

    public void setUnenCepComarca(String unenCepComarca) {
        this.unenCepComarca = unenCepComarca;
    }

    public String getUnenIbgeComarca() {
        return unenIbgeComarca;
    }

    public void setUnenIbgeComarca(String unenIbgeComarca) {
        this.unenIbgeComarca = unenIbgeComarca;
    }

    public String getUnenPais() {
        return unenPais;
    }

    public void setUnenPais(String unenPais) {
        this.unenPais = unenPais;
    }

    public String getUnenSiglaPais() {
        return unenSiglaPais;
    }

    public void setUnenSiglaPais(String unenSiglaPais) {
        this.unenSiglaPais = unenSiglaPais;
    }

    public String getUnenCodRecFederalPais() {
        return unenCodRecFederalPais;
    }

    public void setUnenCodRecFederalPais(String unenCodRecFederalPais) {
        this.unenCodRecFederalPais = unenCodRecFederalPais;
    }

    public String getUnenCodigoBacenPais() {
        return unenCodigoBacenPais;
    }

    public void setUnenCodigoBacenPais(String unenCodigoBacenPais) {
        this.unenCodigoBacenPais = unenCodigoBacenPais;
    }

    public String getUnenObservacao() {
        return unenObservacao;
    }

    public void setUnenObservacao(String unenObservacao) {
        this.unenObservacao = unenObservacao;
    }

    public Date getUnEnLASTUPDATE() {
        return unEnLASTUPDATE;
    }

    public void setUnEnLASTUPDATE(Date unEnLASTUPDATE) {
        this.unEnLASTUPDATE = unEnLASTUPDATE;
    }

    @XmlTransient
    public List<UnemDocumentos> getUnemDocumentosList() {
        return unemDocumentosList;
    }

    public void setUnemDocumentosList(List<UnemDocumentos> unemDocumentosList) {
        this.unemDocumentosList = unemDocumentosList;
    }

    public TiposEndereco getTpenId() {
        return tpenId;
    }

    public void setTpenId(TiposEndereco tpenId) {
        this.tpenId = tpenId;
    }

    public UnidadesEmpresariais getUnemId() {
        return unemId;
    }

    public void setUnemId(UnidadesEmpresariais unemId) {
        this.unemId = unemId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (unenId != null ? unenId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UnemEnderecos)) {
            return false;
        }
        UnemEnderecos other = (UnemEnderecos) object;
        if ((this.unenId == null && other.unenId != null) || (this.unenId != null && !this.unenId.equals(other.unenId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.UnemEnderecos[ unenId=" + unenId + " ]";
    }
    
}
