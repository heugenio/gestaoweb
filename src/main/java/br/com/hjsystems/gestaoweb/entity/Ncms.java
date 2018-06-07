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
@Table(name = "NCMS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ncms.findAll", query = "SELECT n FROM Ncms n"),
    @NamedQuery(name = "Ncms.findByNcmsId", query = "SELECT n FROM Ncms n WHERE n.ncmsId = :ncmsId"),
    @NamedQuery(name = "Ncms.findByNcmsCodigo", query = "SELECT n FROM Ncms n WHERE n.ncmsCodigo = :ncmsCodigo"),
    @NamedQuery(name = "Ncms.findByNcmsNome", query = "SELECT n FROM Ncms n WHERE n.ncmsNome = :ncmsNome"),
    @NamedQuery(name = "Ncms.findByNcmsTributaPis", query = "SELECT n FROM Ncms n WHERE n.ncmsTributaPis = :ncmsTributaPis"),
    @NamedQuery(name = "Ncms.findByNcmsTributaCofins", query = "SELECT n FROM Ncms n WHERE n.ncmsTributaCofins = :ncmsTributaCofins"),
    @NamedQuery(name = "Ncms.findByNcmsRetemPis", query = "SELECT n FROM Ncms n WHERE n.ncmsRetemPis = :ncmsRetemPis"),
    @NamedQuery(name = "Ncms.findByNcmsRetemCofins", query = "SELECT n FROM Ncms n WHERE n.ncmsRetemCofins = :ncmsRetemCofins"),
    @NamedQuery(name = "Ncms.findByNcmsRetemCsll", query = "SELECT n FROM Ncms n WHERE n.ncmsRetemCsll = :ncmsRetemCsll"),
    @NamedQuery(name = "Ncms.findByNcmsAliquotaIr", query = "SELECT n FROM Ncms n WHERE n.ncmsAliquotaIr = :ncmsAliquotaIr"),
    @NamedQuery(name = "Ncms.findByNcmsAliquotaIpi", query = "SELECT n FROM Ncms n WHERE n.ncmsAliquotaIpi = :ncmsAliquotaIpi"),
    @NamedQuery(name = "Ncms.findByNcmsTipo", query = "SELECT n FROM Ncms n WHERE n.ncmsTipo = :ncmsTipo"),
    @NamedQuery(name = "Ncms.findByNcmsCstIpi", query = "SELECT n FROM Ncms n WHERE n.ncmsCstIpi = :ncmsCstIpi"),
    @NamedQuery(name = "Ncms.findByNcmsLastupdate", query = "SELECT n FROM Ncms n WHERE n.ncmsLastupdate = :ncmsLastupdate"),
    @NamedQuery(name = "Ncms.findByNcmsAliqCofinsEntrada", query = "SELECT n FROM Ncms n WHERE n.ncmsAliqCofinsEntrada = :ncmsAliqCofinsEntrada"),
    @NamedQuery(name = "Ncms.findByNcmsAliqCofinsSaida", query = "SELECT n FROM Ncms n WHERE n.ncmsAliqCofinsSaida = :ncmsAliqCofinsSaida"),
    @NamedQuery(name = "Ncms.findByNcmsAliqPisEntrada", query = "SELECT n FROM Ncms n WHERE n.ncmsAliqPisEntrada = :ncmsAliqPisEntrada"),
    @NamedQuery(name = "Ncms.findByNcmsAliqPisSaida", query = "SELECT n FROM Ncms n WHERE n.ncmsAliqPisSaida = :ncmsAliqPisSaida"),
    @NamedQuery(name = "Ncms.findByNcmsCstPisEntrada", query = "SELECT n FROM Ncms n WHERE n.ncmsCstPisEntrada = :ncmsCstPisEntrada"),
    @NamedQuery(name = "Ncms.findByNcmsCstPisSaida", query = "SELECT n FROM Ncms n WHERE n.ncmsCstPisSaida = :ncmsCstPisSaida"),
    @NamedQuery(name = "Ncms.findByNcmsCstCofinsEntrada", query = "SELECT n FROM Ncms n WHERE n.ncmsCstCofinsEntrada = :ncmsCstCofinsEntrada"),
    @NamedQuery(name = "Ncms.findByNcmsCstCofinsSaida", query = "SELECT n FROM Ncms n WHERE n.ncmsCstCofinsSaida = :ncmsCstCofinsSaida"),
    @NamedQuery(name = "Ncms.findByNcmsAnp", query = "SELECT n FROM Ncms n WHERE n.ncmsAnp = :ncmsAnp"),
    @NamedQuery(name = "Ncms.findByNcmsAnt", query = "SELECT n FROM Ncms n WHERE n.ncmsAnt = :ncmsAnt"),
    @NamedQuery(name = "Ncms.findByNcmsCest", query = "SELECT n FROM Ncms n WHERE n.ncmsCest = :ncmsCest"),
    @NamedQuery(name = "Ncms.findByNcmsTributaDifal", query = "SELECT n FROM Ncms n WHERE n.ncmsTributaDifal = :ncmsTributaDifal"),
    @NamedQuery(name = "Ncms.findByNcmsAliqFederalNac", query = "SELECT n FROM Ncms n WHERE n.ncmsAliqFederalNac = :ncmsAliqFederalNac"),
    @NamedQuery(name = "Ncms.findByNcmsAliqFederalImp", query = "SELECT n FROM Ncms n WHERE n.ncmsAliqFederalImp = :ncmsAliqFederalImp"),
    @NamedQuery(name = "Ncms.findByNcmsAliqEstadual", query = "SELECT n FROM Ncms n WHERE n.ncmsAliqEstadual = :ncmsAliqEstadual"),
    @NamedQuery(name = "Ncms.findByNcmsAliqMunicipal", query = "SELECT n FROM Ncms n WHERE n.ncmsAliqMunicipal = :ncmsAliqMunicipal"),
    @NamedQuery(name = "Ncms.findByNcmsDtVigenciaIni", query = "SELECT n FROM Ncms n WHERE n.ncmsDtVigenciaIni = :ncmsDtVigenciaIni"),
    @NamedQuery(name = "Ncms.findByNcmsDtVigenciaFin", query = "SELECT n FROM Ncms n WHERE n.ncmsDtVigenciaFin = :ncmsDtVigenciaFin"),
    @NamedQuery(name = "Ncms.findByNcmsChave", query = "SELECT n FROM Ncms n WHERE n.ncmsChave = :ncmsChave"),
    @NamedQuery(name = "Ncms.findByNcmsFonte", query = "SELECT n FROM Ncms n WHERE n.ncmsFonte = :ncmsFonte")})
public class Ncms implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NCMS_ID")
    private String ncmsId;
    @Basic(optional = false)
    @Column(name = "NCMS_CODIGO")
    private String ncmsCodigo;
    @Basic(optional = false)
    @Column(name = "NCMS_NOME")
    private String ncmsNome;
    @Basic(optional = false)
    @Column(name = "NCMS_TRIBUTA_PIS")
    private String ncmsTributaPis;
    @Basic(optional = false)
    @Column(name = "NCMS_TRIBUTA_COFINS")
    private String ncmsTributaCofins;
    @Basic(optional = false)
    @Column(name = "NCMS_RETEM_PIS")
    private String ncmsRetemPis;
    @Basic(optional = false)
    @Column(name = "NCMS_RETEM_COFINS")
    private String ncmsRetemCofins;
    @Basic(optional = false)
    @Column(name = "NCMS_RETEM_CSLL")
    private String ncmsRetemCsll;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "NCMS_ALIQUOTA_IR")
    private BigDecimal ncmsAliquotaIr;
    @Basic(optional = false)
    @Column(name = "NCMS_ALIQUOTA_IPI")
    private BigDecimal ncmsAliquotaIpi;
    @Basic(optional = false)
    @Column(name = "NCMS_TIPO")
    private String ncmsTipo;
    @Column(name = "NCMS_CST_IPI")
    private String ncmsCstIpi;
    @Column(name = "NCMS_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ncmsLastupdate;
    @Basic(optional = false)
    @Column(name = "NCMS_ALIQ_COFINS_ENTRADA")
    private BigDecimal ncmsAliqCofinsEntrada;
    @Basic(optional = false)
    @Column(name = "NCMS_ALIQ_COFINS_SAIDA")
    private BigDecimal ncmsAliqCofinsSaida;
    @Basic(optional = false)
    @Column(name = "NCMS_ALIQ_PIS_ENTRADA")
    private BigDecimal ncmsAliqPisEntrada;
    @Basic(optional = false)
    @Column(name = "NCMS_ALIQ_PIS_SAIDA")
    private BigDecimal ncmsAliqPisSaida;
    @Column(name = "NCMS_CST_PIS_ENTRADA")
    private String ncmsCstPisEntrada;
    @Column(name = "NCMS_CST_PIS_SAIDA")
    private String ncmsCstPisSaida;
    @Column(name = "NCMS_CST_COFINS_ENTRADA")
    private String ncmsCstCofinsEntrada;
    @Column(name = "NCMS_CST_COFINS_SAIDA")
    private String ncmsCstCofinsSaida;
    @Column(name = "NCMS_ANP")
    private String ncmsAnp;
    @Column(name = "NCMS_ANT")
    private String ncmsAnt;
    @Column(name = "NCMS_CEST")
    private String ncmsCest;
    @Column(name = "NCMS_TRIBUTA_DIFAL")
    private String ncmsTributaDifal;
    @Column(name = "NCMS_ALIQ_FEDERAL_NAC")
    private BigDecimal ncmsAliqFederalNac;
    @Column(name = "NCMS_ALIQ_FEDERAL_IMP")
    private BigDecimal ncmsAliqFederalImp;
    @Column(name = "NCMS_ALIQ_ESTADUAL")
    private BigDecimal ncmsAliqEstadual;
    @Column(name = "NCMS_ALIQ_MUNICIPAL")
    private BigDecimal ncmsAliqMunicipal;
    @Column(name = "NCMS_DT_VIGENCIA_INI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ncmsDtVigenciaIni;
    @Column(name = "NCMS_DT_VIGENCIA_FIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ncmsDtVigenciaFin;
    @Column(name = "NCMS_CHAVE")
    private String ncmsChave;
    @Column(name = "NCMS_FONTE")
    private String ncmsFonte;
    @OneToMany(mappedBy = "ncmsId")
    private List<Produtos> produtosList;
    @OneToMany(mappedBy = "ncmsId")
    private List<NcmNbm> ncmNbmList;
    @OneToMany(mappedBy = "ncmsId")
    private List<RegimeTributario> regimeTributarioList;

    public Ncms() {
    }

    public Ncms(String ncmsId) {
        this.ncmsId = ncmsId;
    }

    public Ncms(String ncmsId, String ncmsCodigo, String ncmsNome, String ncmsTributaPis, String ncmsTributaCofins, String ncmsRetemPis, String ncmsRetemCofins, String ncmsRetemCsll, BigDecimal ncmsAliquotaIr, BigDecimal ncmsAliquotaIpi, String ncmsTipo, BigDecimal ncmsAliqCofinsEntrada, BigDecimal ncmsAliqCofinsSaida, BigDecimal ncmsAliqPisEntrada, BigDecimal ncmsAliqPisSaida) {
        this.ncmsId = ncmsId;
        this.ncmsCodigo = ncmsCodigo;
        this.ncmsNome = ncmsNome;
        this.ncmsTributaPis = ncmsTributaPis;
        this.ncmsTributaCofins = ncmsTributaCofins;
        this.ncmsRetemPis = ncmsRetemPis;
        this.ncmsRetemCofins = ncmsRetemCofins;
        this.ncmsRetemCsll = ncmsRetemCsll;
        this.ncmsAliquotaIr = ncmsAliquotaIr;
        this.ncmsAliquotaIpi = ncmsAliquotaIpi;
        this.ncmsTipo = ncmsTipo;
        this.ncmsAliqCofinsEntrada = ncmsAliqCofinsEntrada;
        this.ncmsAliqCofinsSaida = ncmsAliqCofinsSaida;
        this.ncmsAliqPisEntrada = ncmsAliqPisEntrada;
        this.ncmsAliqPisSaida = ncmsAliqPisSaida;
    }

    public String getNcmsId() {
        return ncmsId;
    }

    public void setNcmsId(String ncmsId) {
        this.ncmsId = ncmsId;
    }

    public String getNcmsCodigo() {
        return ncmsCodigo;
    }

    public void setNcmsCodigo(String ncmsCodigo) {
        this.ncmsCodigo = ncmsCodigo;
    }

    public String getNcmsNome() {
        return ncmsNome;
    }

    public void setNcmsNome(String ncmsNome) {
        this.ncmsNome = ncmsNome;
    }

    public String getNcmsTributaPis() {
        return ncmsTributaPis;
    }

    public void setNcmsTributaPis(String ncmsTributaPis) {
        this.ncmsTributaPis = ncmsTributaPis;
    }

    public String getNcmsTributaCofins() {
        return ncmsTributaCofins;
    }

    public void setNcmsTributaCofins(String ncmsTributaCofins) {
        this.ncmsTributaCofins = ncmsTributaCofins;
    }

    public String getNcmsRetemPis() {
        return ncmsRetemPis;
    }

    public void setNcmsRetemPis(String ncmsRetemPis) {
        this.ncmsRetemPis = ncmsRetemPis;
    }

    public String getNcmsRetemCofins() {
        return ncmsRetemCofins;
    }

    public void setNcmsRetemCofins(String ncmsRetemCofins) {
        this.ncmsRetemCofins = ncmsRetemCofins;
    }

    public String getNcmsRetemCsll() {
        return ncmsRetemCsll;
    }

    public void setNcmsRetemCsll(String ncmsRetemCsll) {
        this.ncmsRetemCsll = ncmsRetemCsll;
    }

    public BigDecimal getNcmsAliquotaIr() {
        return ncmsAliquotaIr;
    }

    public void setNcmsAliquotaIr(BigDecimal ncmsAliquotaIr) {
        this.ncmsAliquotaIr = ncmsAliquotaIr;
    }

    public BigDecimal getNcmsAliquotaIpi() {
        return ncmsAliquotaIpi;
    }

    public void setNcmsAliquotaIpi(BigDecimal ncmsAliquotaIpi) {
        this.ncmsAliquotaIpi = ncmsAliquotaIpi;
    }

    public String getNcmsTipo() {
        return ncmsTipo;
    }

    public void setNcmsTipo(String ncmsTipo) {
        this.ncmsTipo = ncmsTipo;
    }

    public String getNcmsCstIpi() {
        return ncmsCstIpi;
    }

    public void setNcmsCstIpi(String ncmsCstIpi) {
        this.ncmsCstIpi = ncmsCstIpi;
    }

    public Date getNcmsLastupdate() {
        return ncmsLastupdate;
    }

    public void setNcmsLastupdate(Date ncmsLastupdate) {
        this.ncmsLastupdate = ncmsLastupdate;
    }

    public BigDecimal getNcmsAliqCofinsEntrada() {
        return ncmsAliqCofinsEntrada;
    }

    public void setNcmsAliqCofinsEntrada(BigDecimal ncmsAliqCofinsEntrada) {
        this.ncmsAliqCofinsEntrada = ncmsAliqCofinsEntrada;
    }

    public BigDecimal getNcmsAliqCofinsSaida() {
        return ncmsAliqCofinsSaida;
    }

    public void setNcmsAliqCofinsSaida(BigDecimal ncmsAliqCofinsSaida) {
        this.ncmsAliqCofinsSaida = ncmsAliqCofinsSaida;
    }

    public BigDecimal getNcmsAliqPisEntrada() {
        return ncmsAliqPisEntrada;
    }

    public void setNcmsAliqPisEntrada(BigDecimal ncmsAliqPisEntrada) {
        this.ncmsAliqPisEntrada = ncmsAliqPisEntrada;
    }

    public BigDecimal getNcmsAliqPisSaida() {
        return ncmsAliqPisSaida;
    }

    public void setNcmsAliqPisSaida(BigDecimal ncmsAliqPisSaida) {
        this.ncmsAliqPisSaida = ncmsAliqPisSaida;
    }

    public String getNcmsCstPisEntrada() {
        return ncmsCstPisEntrada;
    }

    public void setNcmsCstPisEntrada(String ncmsCstPisEntrada) {
        this.ncmsCstPisEntrada = ncmsCstPisEntrada;
    }

    public String getNcmsCstPisSaida() {
        return ncmsCstPisSaida;
    }

    public void setNcmsCstPisSaida(String ncmsCstPisSaida) {
        this.ncmsCstPisSaida = ncmsCstPisSaida;
    }

    public String getNcmsCstCofinsEntrada() {
        return ncmsCstCofinsEntrada;
    }

    public void setNcmsCstCofinsEntrada(String ncmsCstCofinsEntrada) {
        this.ncmsCstCofinsEntrada = ncmsCstCofinsEntrada;
    }

    public String getNcmsCstCofinsSaida() {
        return ncmsCstCofinsSaida;
    }

    public void setNcmsCstCofinsSaida(String ncmsCstCofinsSaida) {
        this.ncmsCstCofinsSaida = ncmsCstCofinsSaida;
    }

    public String getNcmsAnp() {
        return ncmsAnp;
    }

    public void setNcmsAnp(String ncmsAnp) {
        this.ncmsAnp = ncmsAnp;
    }

    public String getNcmsAnt() {
        return ncmsAnt;
    }

    public void setNcmsAnt(String ncmsAnt) {
        this.ncmsAnt = ncmsAnt;
    }

    public String getNcmsCest() {
        return ncmsCest;
    }

    public void setNcmsCest(String ncmsCest) {
        this.ncmsCest = ncmsCest;
    }

    public String getNcmsTributaDifal() {
        return ncmsTributaDifal;
    }

    public void setNcmsTributaDifal(String ncmsTributaDifal) {
        this.ncmsTributaDifal = ncmsTributaDifal;
    }

    public BigDecimal getNcmsAliqFederalNac() {
        return ncmsAliqFederalNac;
    }

    public void setNcmsAliqFederalNac(BigDecimal ncmsAliqFederalNac) {
        this.ncmsAliqFederalNac = ncmsAliqFederalNac;
    }

    public BigDecimal getNcmsAliqFederalImp() {
        return ncmsAliqFederalImp;
    }

    public void setNcmsAliqFederalImp(BigDecimal ncmsAliqFederalImp) {
        this.ncmsAliqFederalImp = ncmsAliqFederalImp;
    }

    public BigDecimal getNcmsAliqEstadual() {
        return ncmsAliqEstadual;
    }

    public void setNcmsAliqEstadual(BigDecimal ncmsAliqEstadual) {
        this.ncmsAliqEstadual = ncmsAliqEstadual;
    }

    public BigDecimal getNcmsAliqMunicipal() {
        return ncmsAliqMunicipal;
    }

    public void setNcmsAliqMunicipal(BigDecimal ncmsAliqMunicipal) {
        this.ncmsAliqMunicipal = ncmsAliqMunicipal;
    }

    public Date getNcmsDtVigenciaIni() {
        return ncmsDtVigenciaIni;
    }

    public void setNcmsDtVigenciaIni(Date ncmsDtVigenciaIni) {
        this.ncmsDtVigenciaIni = ncmsDtVigenciaIni;
    }

    public Date getNcmsDtVigenciaFin() {
        return ncmsDtVigenciaFin;
    }

    public void setNcmsDtVigenciaFin(Date ncmsDtVigenciaFin) {
        this.ncmsDtVigenciaFin = ncmsDtVigenciaFin;
    }

    public String getNcmsChave() {
        return ncmsChave;
    }

    public void setNcmsChave(String ncmsChave) {
        this.ncmsChave = ncmsChave;
    }

    public String getNcmsFonte() {
        return ncmsFonte;
    }

    public void setNcmsFonte(String ncmsFonte) {
        this.ncmsFonte = ncmsFonte;
    }

    @XmlTransient
    public List<Produtos> getProdutosList() {
        return produtosList;
    }

    public void setProdutosList(List<Produtos> produtosList) {
        this.produtosList = produtosList;
    }

    @XmlTransient
    public List<NcmNbm> getNcmNbmList() {
        return ncmNbmList;
    }

    public void setNcmNbmList(List<NcmNbm> ncmNbmList) {
        this.ncmNbmList = ncmNbmList;
    }

    @XmlTransient
    public List<RegimeTributario> getRegimeTributarioList() {
        return regimeTributarioList;
    }

    public void setRegimeTributarioList(List<RegimeTributario> regimeTributarioList) {
        this.regimeTributarioList = regimeTributarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ncmsId != null ? ncmsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ncms)) {
            return false;
        }
        Ncms other = (Ncms) object;
        if ((this.ncmsId == null && other.ncmsId != null) || (this.ncmsId != null && !this.ncmsId.equals(other.ncmsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.Ncms[ ncmsId=" + ncmsId + " ]";
    }
    
}
