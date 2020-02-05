package com.online.banking.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class CompteTitre extends Compte {


    @OneToMany(mappedBy="comptetitre" ,cascade = CascadeType.ALL)
    @JsonManagedReference
    private Collection<Obligation> obligations = new ArrayList<>();
    @OneToMany(mappedBy="comptetitre1" ,cascade = CascadeType.ALL)
    @JsonManagedReference
    private Collection<Action> actions = new ArrayList<>();

    public Collection<Obligation> getObligations() {
        return obligations;
    }

    public void setObligations(Collection<Obligation> obligations) {
        this.obligations = obligations;
    }

    public Collection<Action> getActions() {
        return actions;
    }

    public void setActions(Collection<Action> actions) {
        this.actions = actions;
    }

    @Override
    public String toString() {
        return "CompteTitre{" +
                "obligations=" + obligations +
                ", actions=" + actions +
                '}';
    }
}
