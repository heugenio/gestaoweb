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
@Table(name = "MODELOS_FORMULARIOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ModelosFormularios.findAll", query = "SELECT m FROM ModelosFormularios m"),
    @NamedQuery(name = "ModelosFormularios.findByMdfrId", query = "SELECT m FROM ModelosFormularios m WHERE m.mdfrId = :mdfrId"),
    @NamedQuery(name = "ModelosFormularios.findByMdfrNome", query = "SELECT m FROM ModelosFormularios m WHERE m.mdfrNome = :mdfrNome"),
    @NamedQuery(name = "ModelosFormularios.findByMdfrNumeroItens", query = "SELECT m FROM ModelosFormularios m WHERE m.mdfrNumeroItens = :mdfrNumeroItens"),
    @NamedQuery(name = "ModelosFormularios.findByMdfrLarguraPag", query = "SELECT m FROM ModelosFormularios m WHERE m.mdfrLarguraPag = :mdfrLarguraPag"),
    @NamedQuery(name = "ModelosFormularios.findByMdfrAlturaPag", query = "SELECT m FROM ModelosFormularios m WHERE m.mdfrAlturaPag = :mdfrAlturaPag"),
    @NamedQuery(name = "ModelosFormularios.findByMdfrOrientacaoPag", query = "SELECT m FROM ModelosFormularios m WHERE m.mdfrOrientacaoPag = :mdfrOrientacaoPag"),
    @NamedQuery(name = "ModelosFormularios.findByMdfrLinhaTitulos", query = "SELECT m FROM ModelosFormularios m WHERE m.mdfrLinhaTitulos = :mdfrLinhaTitulos"),
    @NamedQuery(name = "ModelosFormularios.findByMdfrColunasTitulos", query = "SELECT m FROM ModelosFormularios m WHERE m.mdfrColunasTitulos = :mdfrColunasTitulos"),
    @NamedQuery(name = "ModelosFormularios.findByMdfrRecuoColunasTitulos", query = "SELECT m FROM ModelosFormularios m WHERE m.mdfrRecuoColunasTitulos = :mdfrRecuoColunasTitulos"),
    @NamedQuery(name = "ModelosFormularios.findByMdfrRecuoLinhas", query = "SELECT m FROM ModelosFormularios m WHERE m.mdfrRecuoLinhas = :mdfrRecuoLinhas"),
    @NamedQuery(name = "ModelosFormularios.findByMdfrNumeroItensServicos", query = "SELECT m FROM ModelosFormularios m WHERE m.mdfrNumeroItensServicos = :mdfrNumeroItensServicos"),
    @NamedQuery(name = "ModelosFormularios.findByMdfrWidthMsg", query = "SELECT m FROM ModelosFormularios m WHERE m.mdfrWidthMsg = :mdfrWidthMsg"),
    @NamedQuery(name = "ModelosFormularios.findByMdfrLastupdate", query = "SELECT m FROM ModelosFormularios m WHERE m.mdfrLastupdate = :mdfrLastupdate")})
public class ModelosFormularios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MDFR_ID")
    private String mdfrId;
    @Column(name = "MDFR_NOME")
    private String mdfrNome;
    @Column(name = "MDFR_NUMERO_ITENS")
    private Integer mdfrNumeroItens;
    @Column(name = "MDFR_LARGURA_PAG")
    private Integer mdfrLarguraPag;
    @Column(name = "MDFR_ALTURA_PAG")
    private Integer mdfrAlturaPag;
    @Column(name = "MDFR_ORIENTACAO_PAG")
    private String mdfrOrientacaoPag;
    @Column(name = "MDFR_LINHA_TITULOS")
    private Integer mdfrLinhaTitulos;
    @Column(name = "MDFR_COLUNAS_TITULOS")
    private Integer mdfrColunasTitulos;
    @Column(name = "MDFR_RECUO_COLUNAS_TITULOS")
    private Integer mdfrRecuoColunasTitulos;
    @Column(name = "MDFR_RECUO_LINHAS")
    private Integer mdfrRecuoLinhas;
    @Column(name = "MDFR_NUMERO_ITENS_SERVICOS")
    private Integer mdfrNumeroItensServicos;
    @Column(name = "MDFR_WIDTH_MSG")
    private Integer mdfrWidthMsg;
    @Column(name = "MDFR_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mdfrLastupdate;
    @OneToMany(mappedBy = "mdfrId")
    private List<OperacoesComerciais> operacoesComerciaisList;
    @OneToMany(mappedBy = "mdfrId")
    private List<ConfiguracoesFormularios> configuracoesFormulariosList;

    public ModelosFormularios() {
    }

    public ModelosFormularios(String mdfrId) {
        this.mdfrId = mdfrId;
    }

    public String getMdfrId() {
        return mdfrId;
    }

    public void setMdfrId(String mdfrId) {
        this.mdfrId = mdfrId;
    }

    public String getMdfrNome() {
        return mdfrNome;
    }

    public void setMdfrNome(String mdfrNome) {
        this.mdfrNome = mdfrNome;
    }

    public Integer getMdfrNumeroItens() {
        return mdfrNumeroItens;
    }

    public void setMdfrNumeroItens(Integer mdfrNumeroItens) {
        this.mdfrNumeroItens = mdfrNumeroItens;
    }

    public Integer getMdfrLarguraPag() {
        return mdfrLarguraPag;
    }

    public void setMdfrLarguraPag(Integer mdfrLarguraPag) {
        this.mdfrLarguraPag = mdfrLarguraPag;
    }

    public Integer getMdfrAlturaPag() {
        return mdfrAlturaPag;
    }

    public void setMdfrAlturaPag(Integer mdfrAlturaPag) {
        this.mdfrAlturaPag = mdfrAlturaPag;
    }

    public String getMdfrOrientacaoPag() {
        return mdfrOrientacaoPag;
    }

    public void setMdfrOrientacaoPag(String mdfrOrientacaoPag) {
        this.mdfrOrientacaoPag = mdfrOrientacaoPag;
    }

    public Integer getMdfrLinhaTitulos() {
        return mdfrLinhaTitulos;
    }

    public void setMdfrLinhaTitulos(Integer mdfrLinhaTitulos) {
        this.mdfrLinhaTitulos = mdfrLinhaTitulos;
    }

    public Integer getMdfrColunasTitulos() {
        return mdfrColunasTitulos;
    }

    public void setMdfrColunasTitulos(Integer mdfrColunasTitulos) {
        this.mdfrColunasTitulos = mdfrColunasTitulos;
    }

    public Integer getMdfrRecuoColunasTitulos() {
        return mdfrRecuoColunasTitulos;
    }

    public void setMdfrRecuoColunasTitulos(Integer mdfrRecuoColunasTitulos) {
        this.mdfrRecuoColunasTitulos = mdfrRecuoColunasTitulos;
    }

    public Integer getMdfrRecuoLinhas() {
        return mdfrRecuoLinhas;
    }

    public void setMdfrRecuoLinhas(Integer mdfrRecuoLinhas) {
        this.mdfrRecuoLinhas = mdfrRecuoLinhas;
    }

    public Integer getMdfrNumeroItensServicos() {
        return mdfrNumeroItensServicos;
    }

    public void setMdfrNumeroItensServicos(Integer mdfrNumeroItensServicos) {
        this.mdfrNumeroItensServicos = mdfrNumeroItensServicos;
    }

    public Integer getMdfrWidthMsg() {
        return mdfrWidthMsg;
    }

    public void setMdfrWidthMsg(Integer mdfrWidthMsg) {
        this.mdfrWidthMsg = mdfrWidthMsg;
    }

    public Date getMdfrLastupdate() {
        return mdfrLastupdate;
    }

    public void setMdfrLastupdate(Date mdfrLastupdate) {
        this.mdfrLastupdate = mdfrLastupdate;
    }

    @XmlTransient
    public List<OperacoesComerciais> getOperacoesComerciaisList() {
        return operacoesComerciaisList;
    }

    public void setOperacoesComerciaisList(List<OperacoesComerciais> operacoesComerciaisList) {
        this.operacoesComerciaisList = operacoesComerciaisList;
    }

    @XmlTransient
    public List<ConfiguracoesFormularios> getConfiguracoesFormulariosList() {
        return configuracoesFormulariosList;
    }

    public void setConfiguracoesFormulariosList(List<ConfiguracoesFormularios> configuracoesFormulariosList) {
        this.configuracoesFormulariosList = configuracoesFormulariosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mdfrId != null ? mdfrId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModelosFormularios)) {
            return false;
        }
        ModelosFormularios other = (ModelosFormularios) object;
        if ((this.mdfrId == null && other.mdfrId != null) || (this.mdfrId != null && !this.mdfrId.equals(other.mdfrId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.ModelosFormularios[ mdfrId=" + mdfrId + " ]";
    }
    
}
