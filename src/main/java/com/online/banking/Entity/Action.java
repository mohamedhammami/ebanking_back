package com.online.banking.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Action {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    int id;
    @Column(name = "PrixAchat")
    float prixachat;
    @Column(name = "Quantite")
    int quantite;
    @Column(name = "DateAchat")
    Date DateAchat;
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

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public Date getDateAchat() {
        return DateAchat;
    }

    public void setDateAchat(Date dateAchat) {
        DateAchat = dateAchat;
    }

    public String getSocieteemetrice() {
        return societeemetrice;
    }

    public void setSocieteemetrice(String societeemetrice) {
        this.societeemetrice = societeemetrice;
    }

    @ManyToOne
    @JsonBackReference
    private CompteTitre comptetitre1;

    public CompteTitre getComptetitre1() {
        return comptetitre1;
    }

    public void setComptetitre1(CompteTitre comptetitre1) {
        this.comptetitre1 = comptetitre1;
    }

    @Override
    public String toString() {
        return "Action{" +
                "id=" + id +
                ", prixachat=" + prixachat +
                ", quantite=" + quantite +
                ", DateAchat=" + DateAchat +
                ", societeemetrice='" + societeemetrice + '\'' +
                '}';
    }

    public Action() {
    }
}
