package ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

import java.util.Date;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte {
    private int code;
    private double solde;
   @XmlTransient
    private Date dateCreatation;
    @Override
    public String toString() {
        return "Compte{" +
                "code=" + code +
                ", solde=" + solde +
                '}';
    }

    public Date getDateCreatation() {
        return dateCreatation;
    }

    public void setDateCreatation(Date dateCreatation) {
        this.dateCreatation = dateCreatation;
    }

    public Compte(int code, double solde, Date dateCreatation) {
        this.code = code;
        this.solde = solde;
        this.dateCreatation = dateCreatation;
    }

    public Compte() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
}
