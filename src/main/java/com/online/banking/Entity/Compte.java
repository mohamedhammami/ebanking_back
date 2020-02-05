package com.online.banking.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import javax.persistence.*;
import java.util.Date;

@Entity
public class Compte  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long RIB;
    @Column(name = "Montant")
    private float montant;
    @Column(name = "DateOuverture")
    private String dateouverture;
    @Column(name = "Ferme")
    private boolean ferme;

    @ManyToOne
    @JoinColumn(name="user_id", nullable=true)
    @JsonIgnoreProperties("comptes")
    private User user1;

    public User getUser1() {
        return user1;
    }

    public void setUser1(User user1) {
        this.user1 = user1;
    }

    /*@ManyToOne
        private User userr;

        public User getClient() {
            return userr;
        }

        public void setClient(User user) {
            this.userr = user;
        }
    */
    public long getRIB() {
        return RIB;
    }

    public void setRIB(long RIB) {
        this.RIB = RIB;
    }

    public float getMontant() {
        return montant;
    }

    public void setMontant(float montant) {
        this.montant = montant;
    }

    public String getDateouverture() {
        return dateouverture;
    }

    public void setDateouverture(String dateouverture) {
        this.dateouverture = dateouverture;
    }

    public boolean isFerme() {
        return ferme;
    }

    public void setFerme(boolean ferme) {
        this.ferme = ferme;
    }

    /*public User getUser() {
        return userr;
    }

    public void setUser(User user) {
        this.userr = user;
    }
*/


    public Compte() {
    }
}

