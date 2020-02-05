package com.online.banking.Service;


import com.online.banking.Entity.CompteBancaire;
import com.online.banking.Entity.DemandeCredit;
import com.online.banking.Entity.User;
import com.online.banking.Repository.UserRepository;
import com.online.banking.Repository.CompteBancaireRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompteBancaireService {
    @Autowired
    private UserRepository clientRep;
    @Autowired
    private CompteBancaireRep compteBancaireRep;

    public List<CompteBancaire> getallCompteBancaire() {
        List<CompteBancaire> CompteBancaires = new ArrayList<>();
        compteBancaireRep.findAll().forEach(CompteBancaires::add);
        return CompteBancaires;
    }

    public CompteBancaire getCompteBancaire(Long id) {
        return compteBancaireRep.findById(id).orElseThrow(() -> new IllegalArgumentException("invalid id" + id));
    }

    public List<CompteBancaire> getCompteBancaireclient(Long id){
        List<CompteBancaire> CompteBancaires1 = new ArrayList<>();
        compteBancaireRep.findAll().forEach(CompteBancaires1::add);
        return CompteBancaires1;
    }

    public void AjouterCompte(CompteBancaire cb) {
        CompteBancaire compte = new CompteBancaire();
        User c = clientRep.findById((long) cb.getUser1().getId()).orElseThrow(() -> new IllegalArgumentException("invalid id" + cb.getUser1().getId()));
        compte.setUser1(c);
        compte.setMontant(cb.getMontant());
        compte.setFerme(cb.isFerme());
        compte.setTypeCompte(cb.getTypeCompte());
        compte.setDateouverture(cb.getDateouverture());
        compteBancaireRep.save(compte);
    }

    public void accepte(CompteBancaire d, Long rib) {
        CompteBancaire employee = compteBancaireRep.findById(rib)
                .orElseThrow(() -> new IllegalArgumentException("invalid id" + rib));
        employee.setFerme(true);
        compteBancaireRep.save(employee);
    }
    public void updateCompteBancaire(CompteBancaire compteBancaire, Long id) {

        CompteBancaire employee = compteBancaireRep.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("invalid id" + id));
        employee.setMontant(compteBancaire.getMontant());
        employee.setDateouverture(compteBancaire.getDateouverture());
        employee.setFerme(compteBancaire.isFerme());

        compteBancaireRep.save(employee);

    }

    public void deleteCompteBancaire(Long id) {
        compteBancaireRep.deleteById(id);
    }


}





