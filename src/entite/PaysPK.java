/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entite;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Admin
 */
@Embeddable
public class PaysPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "NOMPAYS")
    private String nompays;
    @Basic(optional = false)
    @Column(name = "ID_PAYS")
    private BigInteger idPays;
    @Basic(optional = false)
    @Column(name = "DATE_UPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateUpdate;

    public PaysPK() {
    }

    public PaysPK(String nompays, BigInteger idPays, Date dateUpdate) {
        this.nompays = nompays;
        this.idPays = idPays;
        this.dateUpdate = dateUpdate;
    }

    public String getNompays() {
        return nompays;
    }

    public void setNompays(String nompays) {
        this.nompays = nompays;
    }

    public BigInteger getIdPays() {
        return idPays;
    }

    public void setIdPays(BigInteger idPays) {
        this.idPays = idPays;
    }

    public Date getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(Date dateUpdate) {
        this.dateUpdate = dateUpdate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nompays != null ? nompays.hashCode() : 0);
        hash += (idPays != null ? idPays.hashCode() : 0);
        hash += (dateUpdate != null ? dateUpdate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PaysPK)) {
            return false;
        }
        PaysPK other = (PaysPK) object;
        if ((this.nompays == null && other.nompays != null) || (this.nompays != null && !this.nompays.equals(other.nompays))) {
            return false;
        }
        if ((this.idPays == null && other.idPays != null) || (this.idPays != null && !this.idPays.equals(other.idPays))) {
            return false;
        }
        if ((this.dateUpdate == null && other.dateUpdate != null) || (this.dateUpdate != null && !this.dateUpdate.equals(other.dateUpdate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entite.PaysPK[ nompays=" + nompays + ", idPays=" + idPays + ", dateUpdate=" + dateUpdate + " ]";
    }
    
}
