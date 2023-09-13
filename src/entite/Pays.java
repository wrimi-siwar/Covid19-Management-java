/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entite;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
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
@Table(name = "PAYS")
@XmlRootElement
public class Pays implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PaysPK paysPK;
    @Basic(optional = false)
    @Column(name = "TOTAL_CAS")
    private BigInteger totalCas;
    @Column(name = "NVL_CAS")
    private BigInteger nvlCas;
    @Basic(optional = false)
    @Column(name = "TOTAL_DECES")
    private BigInteger totalDeces;
    @Column(name = "NVL_DECES")
    private BigInteger nvlDeces;
    @Basic(optional = false)
    @Column(name = "TOTAL_RECUPERE")
    private BigInteger totalRecupere;
    @Column(name = "NVL_RECUPERE")
    private BigInteger nvlRecupere;
    @Basic(optional = false)
    @Column(name = "TOTAL_TEST")
    private BigInteger totalTest;
    @Column(name = "NVL_TEST")
    private BigInteger nvlTest;
    @Column(name = "NVL_CRITIQUE")
    private BigInteger nvlCritique;
    @Column(name = "NOM_GOUVERNORAT")
    private String nomGouvernorat;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pays")
    private Collection<Hopitale> hopitaleCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pays")
    private Collection<Personne> personneCollection;

    public Pays() {
    }

    public Pays(PaysPK paysPK) {
        this.paysPK = paysPK;
    }

    public Pays(PaysPK paysPK, BigInteger totalCas, BigInteger totalDeces, BigInteger totalRecupere, BigInteger totalTest) {
        this.paysPK = paysPK;
        this.totalCas = totalCas;
        this.totalDeces = totalDeces;
        this.totalRecupere = totalRecupere;
        this.totalTest = totalTest;
    }

    public Pays(String nompays, BigInteger idPays, Date dateUpdate) {
        this.paysPK = new PaysPK(nompays, idPays, dateUpdate);
    }

    public PaysPK getPaysPK() {
        return paysPK;
    }

    public void setPaysPK(PaysPK paysPK) {
        this.paysPK = paysPK;
    }

    public BigInteger getTotalCas() {
        return totalCas;
    }

    public void setTotalCas(BigInteger totalCas) {
        this.totalCas = totalCas;
    }

    public BigInteger getNvlCas() {
        return nvlCas;
    }

    public void setNvlCas(BigInteger nvlCas) {
        this.nvlCas = nvlCas;
    }

    public BigInteger getTotalDeces() {
        return totalDeces;
    }

    public void setTotalDeces(BigInteger totalDeces) {
        this.totalDeces = totalDeces;
    }

    public BigInteger getNvlDeces() {
        return nvlDeces;
    }

    public void setNvlDeces(BigInteger nvlDeces) {
        this.nvlDeces = nvlDeces;
    }

    public BigInteger getTotalRecupere() {
        return totalRecupere;
    }

    public void setTotalRecupere(BigInteger totalRecupere) {
        this.totalRecupere = totalRecupere;
    }

    public BigInteger getNvlRecupere() {
        return nvlRecupere;
    }

    public void setNvlRecupere(BigInteger nvlRecupere) {
        this.nvlRecupere = nvlRecupere;
    }

    public BigInteger getTotalTest() {
        return totalTest;
    }

    public void setTotalTest(BigInteger totalTest) {
        this.totalTest = totalTest;
    }

    public BigInteger getNvlTest() {
        return nvlTest;
    }

    public void setNvlTest(BigInteger nvlTest) {
        this.nvlTest = nvlTest;
    }

    public BigInteger getNvlCritique() {
        return nvlCritique;
    }

    public void setNvlCritique(BigInteger nvlCritique) {
        this.nvlCritique = nvlCritique;
    }

    public String getNomGouvernorat() {
        return nomGouvernorat;
    }

    public void setNomGouvernorat(String nomGouvernorat) {
        this.nomGouvernorat = nomGouvernorat;
    }

    @XmlTransient
    public Collection<Hopitale> getHopitaleCollection() {
        return hopitaleCollection;
    }

    public void setHopitaleCollection(Collection<Hopitale> hopitaleCollection) {
        this.hopitaleCollection = hopitaleCollection;
    }

    @XmlTransient
    public Collection<Personne> getPersonneCollection() {
        return personneCollection;
    }

    public void setPersonneCollection(Collection<Personne> personneCollection) {
        this.personneCollection = personneCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paysPK != null ? paysPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pays)) {
            return false;
        }
        Pays other = (Pays) object;
        if ((this.paysPK == null && other.paysPK != null) || (this.paysPK != null && !this.paysPK.equals(other.paysPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entite.Pays[ paysPK=" + paysPK + " ]";
    }
    
}
