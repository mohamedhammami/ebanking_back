package com.online.banking.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Obligation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    int id;
    @Column(name = "PrixAchat")
    float prixachat;
    @Column(name = "Coupon")
    float coupon;
    @Column(name = "DateDebut")
    Date DateDebut;
    @Column(name = "DateFin")
    Date DateFin;
    @Column(name = "SocieteEmetrice")
    String societeemetrice;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrixachat() {
        return prixachat;
    }

    public void setPrixachat(float prixachat) {
        this.prixachat = prixachat;
    }

    public float getCoupon() {
        return coupon;
    }

    public void setCoupon(float coupon) {
        this.coupon = coupon;
    }

    public Date getDateDebut() {
        return DateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        DateDebut = dateDebut;
    }

    public Date getDateFin() {
        return DateFin;
    }

    public void setDateFin(Date dateFin) {
        DateFin = dateFin;
    }

    public String getSocieteemetrice() {
        return societeemetrice;
    }

    public void setSocieteemetrice(String societeemetrice) {
        this.societeemetrice = societeemetrice;
    }

    public Obligation() {
    }

    @ManyToOne
    @JoinColumn(name = "Comptetitre", referencedColumnName = "RIB")
    @JsonBackReference
    private CompteTitre comptetitre;

    public CompteTitre getComptetitre() {
        return comptetitre;
    }

    public void setComptetitre(CompteTitre comptetitre) {
        this.comptetitre = comptetitre;
    }

    @Override
    public String toString() {
        return "Obligation{" +
                "id=" + id +
                ", prixachat=" + prixachat +
                ", coupon=" + coupon +
                ", DateDebut=" + DateDebut +
                ", DateFin=" + DateFin +
                ", societeemetrice='" + societeemetrice + '\'' +
                '}';
    }
}
