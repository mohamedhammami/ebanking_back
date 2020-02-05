package com.online.banking.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class DemandeCredit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    long id;
    @Column(name = "Montant")
    String montant;
    @Column(name = "Raison")
    String raison;
    @Column(name = "Etat")
    String etat;
    @Column(name = "typeCredit")
    String typeCredit;
    public DemandeCredit() {
    }

    @ManyToOne
    @JsonIgnoreProperties("demandes")
    private User user;

    @ManyToOne
    private Asurance asurance;

    public Asurance getAssurance() {
        return asurance;
    }

    public void setAssurance(Asurance assurance) {
        this.asurance = assurance;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMontant() {
        return montant;
    }

    public void setMontant(String montant) {
        this.montant = montant;
    }

    public String getRaison() {
        return raison;
    }

    public void setRaison(String raison) {
        this.raison = raison;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public String getTypeCredit() {
        return typeCredit;
    }

    public void setTypeCredit(String typeCredit) {
        this.typeCredit = typeCredit;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


}
