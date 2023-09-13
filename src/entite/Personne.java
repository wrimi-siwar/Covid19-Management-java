/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entite;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Admin
 */
@MappedSuperclass
@Table(name = "PERSONNE")
@XmlRootElement
public class Personne implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CIN")
    private String cin;
    @Basic(optional = false)
    @Column(name = "SEXE")
    private Character sexe;
    @Basic(optional = false)
    @Column(name = "AGE")
    private BigInteger age;
    @Basic(optional = false)
    @Column(name = "CAS_IMPORTES")
    private BigInteger casImportes;
    @JoinColumns({
        @JoinColumn(name = "GOV", referencedColumnName = "NOMPAYS"),
        @JoinColumn(name = "ID_PAYS", referencedColumnName = "ID_PAYS"),
        @JoinColumn(name = "DATE_UPDATE", referencedColumnName = "DATE_UPDATE")})
    @ManyToOne(optional = false)
    private Pays pays;

    public Personne() {
    }

    public Personne(String cin) {
        this.cin = cin;
    }

    public Personne(String cin, Character sexe, BigInteger age, BigInteger casImportes) {
        this.cin = cin;
        this.sexe = sexe;
        this.age = age;
        this.casImportes = casImportes;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public Character getSexe() {
        return sexe;
    }

    public void setSexe(Character sexe) {
        this.sexe = sexe;
    }

    public BigInteger getAge() {
        return age;
    }

    public void setAge(BigInteger age) {
        this.age = age;
    }

    public BigInteger getCasImportes() {
        return casImportes;
    }

    public void setCasImportes(BigInteger casImportes) {
        this.casImportes = casImportes;
    }

    public Pays getPays() {
        return pays;
    }

    public void setPays(Pays pays) {
        this.pays = pays;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cin != null ? cin.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Personne)) {
            return false;
        }
        Personne other = (Personne) object;
        if ((this.cin == null && other.cin != null) || (this.cin != null && !this.cin.equals(other.cin))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entite.Personne[ cin=" + cin + " ]";
    }
    
}
