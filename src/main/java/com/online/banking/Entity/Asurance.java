package com.online.banking.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Asurance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdAssurance")
    int idassurance;
    @Column(name = "Prime")
    float prime;
    @Column(name = "Label")
    String label;
    @Column(name = "Type")
    String type;
    public float getPrime() {
        return prime;
    }

    public void setPrime(float prime) {
        this.prime = prime;
    }
    public Asurance() {
    }

    public Collection<DemandeCredit> getDemande() {
        return demande;
    }

    public void setDemande(Collection<DemandeCredit> demande) {
        this.demande = demande;
    }

    @OneToMany(mappedBy = "asurance")
    private Collection<DemandeCredit> demande = new ArrayList<>();

    public int getIdassurance() {
        return idassurance;
    }

    public void setIdassurance(int idassurance) {
        this.idassurance = idassurance;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }



    @Override
    public String toString() {
        return "Asurance{" +
                "idassurance=" + idassurance +
                ", prime=" + prime +
                ", label='" + label + '\'' +
                ", type='" + type + '\'' +

                '}';
    }
}
