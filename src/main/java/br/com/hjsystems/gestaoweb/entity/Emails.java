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
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
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
@Table(name = "EMAILS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Emails.findAll", query = "SELECT e FROM Emails e"),
    @NamedQuery(name = "Emails.findByEmlsId", query = "SELECT e FROM Emails e WHERE e.emlsId = :emlsId"),
    @NamedQuery(name = "Emails.findByEmlsTitulo", query = "SELECT e FROM Emails e WHERE e.emlsTitulo = :emlsTitulo"),
    @NamedQuery(name = "Emails.findByEmlsRemetente", query = "SELECT e FROM Emails e WHERE e.emlsRemetente = :emlsRemetente"),
    @NamedQuery(name = "Emails.findByEmlsPeriodo", query = "SELECT e FROM Emails e WHERE e.emlsPeriodo = :emlsPeriodo"),
    @NamedQuery(name = "Emails.findByEmlsTipo", query = "SELECT e FROM Emails e WHERE e.emlsTipo = :emlsTipo"),
    @NamedQuery(name = "Emails.findByEmlsArquivo", query = "SELECT e FROM Emails e WHERE e.emlsArquivo = :emlsArquivo"),
    @NamedQuery(name = "Emails.findByEmlsLastupdate", query = "SELECT e FROM Emails e WHERE e.emlsLastupdate = :emlsLastupdate")})
public class Emails implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "EMLS_ID")
    private String emlsId;
    @Basic(optional = false)
    @Column(name = "EMLS_TITULO")
    private String emlsTitulo;
    @Lob
    @Column(name = "EMLS_MSG")
    private String emlsMsg;
    @Basic(optional = false)
    @Column(name = "EMLS_REMETENTE")
    private String emlsRemetente;
    @Lob
    @Column(name = "EMLS_SQL")
    private String emlsSql;
    @Basic(optional = false)
    @Column(name = "EMLS_PERIODO")
    private int emlsPeriodo;
    @Column(name = "EMLS_TIPO")
    private String emlsTipo;
    @Column(name = "EMLS_ARQUIVO")
    private String emlsArquivo;
    @Column(name = "EMLS_LASTUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date emlsLastupdate;
    @JoinColumn(name = "GRPO_ID", referencedColumnName = "GRPO_ID")
    @ManyToOne
    private Grupos grpoId;
    @JoinColumn(name = "SBGR_ID", referencedColumnName = "SBGR_ID")
    @ManyToOne
    private Subgrupos sbgrId;
    @OneToMany(mappedBy = "emlsId")
    private List<EmailsAgendados> emailsAgendadosList;

    public Emails() {
    }

    public Emails(String emlsId) {
        this.emlsId = emlsId;
    }

    public Emails(String emlsId, String emlsTitulo, String emlsRemetente, int emlsPeriodo) {
        this.emlsId = emlsId;
        this.emlsTitulo = emlsTitulo;
        this.emlsRemetente = emlsRemetente;
        this.emlsPeriodo = emlsPeriodo;
    }

    public String getEmlsId() {
        return emlsId;
    }

    public void setEmlsId(String emlsId) {
        this.emlsId = emlsId;
    }

    public String getEmlsTitulo() {
        return emlsTitulo;
    }

    public void setEmlsTitulo(String emlsTitulo) {
        this.emlsTitulo = emlsTitulo;
    }

    public String getEmlsMsg() {
        return emlsMsg;
    }

    public void setEmlsMsg(String emlsMsg) {
        this.emlsMsg = emlsMsg;
    }

    public String getEmlsRemetente() {
        return emlsRemetente;
    }

    public void setEmlsRemetente(String emlsRemetente) {
        this.emlsRemetente = emlsRemetente;
    }

    public String getEmlsSql() {
        return emlsSql;
    }

    public void setEmlsSql(String emlsSql) {
        this.emlsSql = emlsSql;
    }

    public int getEmlsPeriodo() {
        return emlsPeriodo;
    }

    public void setEmlsPeriodo(int emlsPeriodo) {
        this.emlsPeriodo = emlsPeriodo;
    }

    public String getEmlsTipo() {
        return emlsTipo;
    }

    public void setEmlsTipo(String emlsTipo) {
        this.emlsTipo = emlsTipo;
    }

    public String getEmlsArquivo() {
        return emlsArquivo;
    }

    public void setEmlsArquivo(String emlsArquivo) {
        this.emlsArquivo = emlsArquivo;
    }

    public Date getEmlsLastupdate() {
        return emlsLastupdate;
    }

    public void setEmlsLastupdate(Date emlsLastupdate) {
        this.emlsLastupdate = emlsLastupdate;
    }

    public Grupos getGrpoId() {
        return grpoId;
    }

    public void setGrpoId(Grupos grpoId) {
        this.grpoId = grpoId;
    }

    public Subgrupos getSbgrId() {
        return sbgrId;
    }

    public void setSbgrId(Subgrupos sbgrId) {
        this.sbgrId = sbgrId;
    }

    @XmlTransient
    public List<EmailsAgendados> getEmailsAgendadosList() {
        return emailsAgendadosList;
    }

    public void setEmailsAgendadosList(List<EmailsAgendados> emailsAgendadosList) {
        this.emailsAgendadosList = emailsAgendadosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (emlsId != null ? emlsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Emails)) {
            return false;
        }
        Emails other = (Emails) object;
        if ((this.emlsId == null && other.emlsId != null) || (this.emlsId != null && !this.emlsId.equals(other.emlsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.Emails[ emlsId=" + emlsId + " ]";
    }
    
}
