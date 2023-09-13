/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entite;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Admin
 */
@MappedSuperclass
@Table(name = "HOPITALE")
@XmlRootElement
public class Hopitale implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @Column(name = "NOM")
    private String nom;
    @Column(name = "ADRESSE")
    private String adresse;
    @Column(name = "NBR_CAS_HOSPITALISE")
    private BigInteger nbrCasHospitalise;
    @Column(name = "LITS_DISPO_REA")
    private BigInteger litsDispoRea;
    @JoinColumns({
        @JoinColumn(name = "GOV", referencedColumnName = "NOMPAYS"),
        @JoinColumn(name = "ID_PAYS", referencedColumnName = "ID_PAYS"),
        @JoinColumn(name = "DATE_UPDATE", referencedColumnName = "DATE_UPDATE")})
    @ManyToOne(optional = false)
    private Pays pays;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idHospital")
    private Collection<Demande> demandeCollection;

    public Hopitale() {
    }

    public Hopitale(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public BigInteger getNbrCasHospitalise() {
        return nbrCasHospitalise;
    }

    public void setNbrCasHospitalise(BigInteger nbrCasHospitalise) {
        this.nbrCasHospitalise = nbrCasHospitalise;
    }

    public BigInteger getLitsDispoRea() {
        return litsDispoRea;
    }

    public void setLitsDispoRea(BigInteger litsDispoRea) {
        this.litsDispoRea = litsDispoRea;
    }

    public Pays getPays() {
        return pays;
    }

    public void setPays(Pays pays) {
        this.pays = pays;
    }

    @XmlTransient
    public Collection<Demande> getDemandeCollection() {
        return demandeCollection;
    }

    public void setDemandeCollection(Collection<Demande> demandeCollection) {
        this.demandeCollection = demandeCollection;
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
        if (!(object instanceof Hopitale)) {
            return false;
        }
        Hopitale other = (Hopitale) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entite.Hopitale[ id=" + id + " ]";
    }
    
}
