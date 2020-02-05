package com.online.banking.Service;

import com.online.banking.Entity.CompteBancaire;
import com.online.banking.Entity.CompteTitre;
import com.online.banking.Entity.User;
import com.online.banking.Repository.UserRepository;
import com.online.banking.Repository.CompteTitreRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompteTitreService {
    @Autowired
    private UserRepository clientRep;

    @Autowired
    private CompteTitreRep compteTitreRep;

    public List<CompteTitre> getallCompteTitre() {
        List<CompteTitre> CompteTitres = new ArrayList<>();
        compteTitreRep.findAll().forEach(CompteTitres::add);
        return CompteTitres;
    }

    public CompteTitre getCompteTitre(Long RIB) {
        return compteTitreRep.findById(RIB).orElseThrow(() -> new IllegalArgumentException("invalid RIB" + RIB));
    }



    public void addCompteTitre(CompteTitre cb) {
        CompteTitre compte = new CompteTitre();
        User c = clientRep.findById((long) cb.getUser1().getId()).orElseThrow(() -> new IllegalArgumentException("invalid id" + cb.getUser1().getId()));
        compte.setUser1(c);
        compte.setMontant(cb.getMontant());
        compte.setFerme(cb.isFerme());
        compte.setDateouverture(cb.getDateouverture());
        compteTitreRep.save(compte);
    }

    public void updateCompteTitre(CompteTitre compteTitre, Long id) {
        compteTitreRep.save(compteTitre);
    }

    public void deleteCompteTitre(Long id) {
        compteTitreRep.deleteById(id);
    }
}
