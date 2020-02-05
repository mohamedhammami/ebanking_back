package com.online.banking.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.online.banking.Enum.UserRole;

import java.util.*;

import javax.persistence.*;

@Entity
public class User extends BaseEntity {

    private String firstname;
    private String lastname;
    private String login;
    private String email;
    private String password;
    @Enumerated(EnumType.STRING)
    private UserRole role;

    @OneToMany(mappedBy = "user")
    @JsonIgnoreProperties("user")
    private Collection<DemandeCredit> demandes = new ArrayList<>();

    public User() {
    }

    @OneToMany(mappedBy = "user1")
    @JsonIgnoreProperties("user1")
    private Collection<Compte> comptes = new ArrayList<>();

    @OneToMany(mappedBy = "user2")
    List<Product> products = new ArrayList<>();




    public Collection<Compte> getComptes() {
        return comptes;
    }

    public void setComptes(Collection<Compte> comptes) {
        this.comptes = comptes;
    }


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public Collection<DemandeCredit> getDemandes() {
        return demandes;
    }

    public void setDemandes(Collection<DemandeCredit> demandes) {
        this.demandes = demandes;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
/*public Collection<Compte> getComptes() {
        return comptes;
    }

    public void setComptes(Collection<Compte> comptes) {
        this.comptes = comptes;
    }
*/

}

