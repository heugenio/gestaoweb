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
import javax.persistence.Lob;
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
@Table(name = "IMAGENS_PRODUTOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImagensProdutos.findAll", query = "SELECT i FROM ImagensProdutos i"),
    @NamedQuery(name = "ImagensProdutos.findByImgpId", query = "SELECT i FROM ImagensProdutos i WHERE i.imgpId = :imgpId"),
    @NamedQuery(name = "ImagensProdutos.findByImgpDescricao", query = "SELECT i FROM ImagensProdutos i WHERE i.imgpDescricao = :imgpDescricao"),
    @NamedQuery(name = "ImagensProdutos.findByImgpNumero", query = "SELECT i FROM ImagensProdutos i WHERE i.imgpNumero = :imgpNumero"),
    @NamedQuery(name = "ImagensProdutos.findByImgPLASTUPDATE", query = "SELECT i FROM ImagensProdutos i WHERE i.imgPLASTUPDATE = :imgPLASTUPDATE")})
public class ImagensProdutos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IMGP_ID")
    private String imgpId;
    @Column(name = "IMGP_DESCRICAO")
    private String imgpDescricao;
    @Lob
    @Column(name = "IMGP_IMAGEM")
    private byte[] imgpImagem;
    @Basic(optional = false)
    @Column(name = "IMGP_NUMERO")
    private int imgpNumero;
    @Column(name = "ImgP_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date imgPLASTUPDATE;
    @JoinColumn(name = "PROD_ID", referencedColumnName = "PROD_ID")
    @ManyToOne
    private Produtos prodId;

    public ImagensProdutos() {
    }

    public ImagensProdutos(String imgpId) {
        this.imgpId = imgpId;
    }

    public ImagensProdutos(String imgpId, int imgpNumero) {
        this.imgpId = imgpId;
        this.imgpNumero = imgpNumero;
    }

    public String getImgpId() {
        return imgpId;
    }

    public void setImgpId(String imgpId) {
        this.imgpId = imgpId;
    }

    public String getImgpDescricao() {
        return imgpDescricao;
    }

    public void setImgpDescricao(String imgpDescricao) {
        this.imgpDescricao = imgpDescricao;
    }

    public byte[] getImgpImagem() {
        return imgpImagem;
    }

    public void setImgpImagem(byte[] imgpImagem) {
        this.imgpImagem = imgpImagem;
    }

    public int getImgpNumero() {
        return imgpNumero;
    }

    public void setImgpNumero(int imgpNumero) {
        this.imgpNumero = imgpNumero;
    }

    public Date getImgPLASTUPDATE() {
        return imgPLASTUPDATE;
    }

    public void setImgPLASTUPDATE(Date imgPLASTUPDATE) {
        this.imgPLASTUPDATE = imgPLASTUPDATE;
    }

    public Produtos getProdId() {
        return prodId;
    }

    public void setProdId(Produtos prodId) {
        this.prodId = prodId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (imgpId != null ? imgpId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImagensProdutos)) {
            return false;
        }
        ImagensProdutos other = (ImagensProdutos) object;
        if ((this.imgpId == null && other.imgpId != null) || (this.imgpId != null && !this.imgpId.equals(other.imgpId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.ImagensProdutos[ imgpId=" + imgpId + " ]";
    }
    
}
