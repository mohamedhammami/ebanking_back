package com.online.banking.Entity;

import javax.persistence.*;

@Entity
public class AssuranceVie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    private float montantinitial;
    private String periodicite;
    private float montantprograme;
    private float taux;
    private  int dure;
    private  float epargne;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getMontantinitial() {
        return montantinitial;
    }

    public void setMontantinitial(float montantinitial) {
        this.montantinitial = montantinitial;
    }

    public String getPeriodicite() {
        return periodicite;
    }

    public void setPeriodicite(String periodicite) {
        this.periodicite = periodicite;
    }

    public float getMontantprograme() {
        return montantprograme;
    }

    public void setMontantprograme(float montantprograme) {
        this.montantprograme = montantprograme;
    }

    public float getTaux() {
        return taux;
    }

    public void setTaux(float taux) {
        this.taux = taux;
    }

    public int getDure() {
        return dure;
    }

    public void setDure(int dure) {
        this.dure = dure;
    }

    public float getEpargne() {
        return epargne;
    }

    public void setEpargne(float epargne) {
        this.epargne = epargne;
    }


}
