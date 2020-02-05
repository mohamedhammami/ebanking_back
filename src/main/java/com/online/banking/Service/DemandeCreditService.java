package com.online.banking.Service;

import com.online.banking.Entity.CompteBancaire;
import com.online.banking.Entity.DemandeCredit;
import com.online.banking.Entity.Etat;
import com.online.banking.Entity.User;
import com.online.banking.Repository.DemandeRep;
import com.online.banking.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service

public class DemandeCreditService {
    @Autowired
    private DemandeRep demandeRep;
    @Autowired
    private UserRepository clientRep;

    public List<DemandeCredit> getalldemande() {
        List<DemandeCredit> demande = new ArrayList<>();
        demandeRep.findAll().forEach(demande::add);
        return demande;
    }
    public List<DemandeCredit> getalldemandeencours() {
        List<DemandeCredit> demande = new ArrayList<>();
        demandeRep.findByetat().forEach(demande::add);
        return demande;
    }
    public DemandeCredit getdemande(Long id) {
        return demandeRep.findById(id).orElseThrow(() -> new IllegalArgumentException("invalid id" + id));
    }

    public void adddemande(DemandeCredit d) {
        DemandeCredit dc = new DemandeCredit();

        User c = clientRep.findById((long) d.getUser().getId()).orElseThrow(() -> new IllegalArgumentException("invalid id" + d.getUser().getId()));
        dc.setUser(c);
        dc.setTypeCredit(d.getTypeCredit());
        dc.setEtat("ENCOURS");
        dc.setMontant(d.getMontant());
        dc.setRaison(d.getRaison());
        demandeRep.save(dc);
    }

    public void updatedemande(DemandeCredit d, Long id) {


        DemandeCredit employee = demandeRep.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("invalid id" + id));
        employee.setMontant(d.getMontant());
        employee.setRaison(d.getRaison());
        employee.setTypeCredit(d.getTypeCredit());
        demandeRep.save(employee);
    }

    public void deletedemande(Long id) {
        demandeRep.deleteById(id);
    }

    public void AcceptCredit(DemandeCredit d, Long id) {
        DemandeCredit employee = demandeRep.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("invalid id" + id));
        employee.setEtat(("Accepte"));
        demandeRep.save(employee);
        System.out.println("Out of acceptloan : ");
    }

    public void refuse(DemandeCredit d, Long id) {
        DemandeCredit employee = demandeRep.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("invalid id" + id));
        employee.setEtat(("Refuse"));
        demandeRep.save(employee);
    }


    public float getprix(int nbmois, float amo, float taux, int k) {

        float x;
        float e;
        e = 1 + (taux / k);
        e = (float) Math.pow(e, nbmois);
        x = (amo * e) / ((e - 1) * 100);
        return x;

    }



}


