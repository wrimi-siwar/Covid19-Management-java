/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entite;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Admin
 */
@MappedSuperclass
@Table(name = "DEMANDE")
@XmlRootElement
public class Demande implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @Basic(optional = false)
    @Column(name = "TYPE")
    private String type;
    @Basic(optional = false)
    @Column(name = "TITRE")
    private String titre;
    @Basic(optional = false)
    @Column(name = "DISTINATAIRE")
    private String distinataire;
    @Column(name = "TEXT_D")
    private String textD;
    @Column(name = "PRIX_ESTIME")
    private Double prixEstime;
    @Basic(optional = false)
    @Column(name = "RESPONSABLE")
    private String responsable;
    @JoinColumn(name = "ID_HOSPITAL", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Hopitale idHospital;

    public Demande() {
    }

    public Demande(BigDecimal id) {
        this.id = id;
    }

    public Demande(BigDecimal id, String type, String titre, String distinataire, String responsable) {
        this.id = id;
        this.type = type;
        this.titre = titre;
        this.distinataire = distinataire;
        this.responsable = responsable;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDistinataire() {
        return distinataire;
    }

    public void setDistinataire(String distinataire) {
        this.distinataire = distinataire;
    }

    public String getTextD() {
        return textD;
    }

    public void setTextD(String textD) {
        this.textD = textD;
    }

    public Double getPrixEstime() {
        return prixEstime;
    }

    public void setPrixEstime(Double prixEstime) {
        this.prixEstime = prixEstime;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public Hopitale getIdHospital() {
        return idHospital;
    }

    public void setIdHospital(Hopitale idHospital) {
        this.idHospital = idHospital;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Demande)) {
            return false;
        }
        Demande other = (Demande) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entite.Demande[ id=" + id + " ]";
    }
    
}
