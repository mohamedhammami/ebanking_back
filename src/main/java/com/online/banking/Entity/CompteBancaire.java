package com.online.banking.Entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class CompteBancaire extends Compte {
    @Enumerated(EnumType.STRING)
    private TypeCompte typeCompte;

    public TypeCompte getTypeCompte() {
        return typeCompte;
    }

    public void setTypeCompte(TypeCompte typeCompte) {
        this.typeCompte = typeCompte;
    }

    public CompteBancaire() {
    }


}
