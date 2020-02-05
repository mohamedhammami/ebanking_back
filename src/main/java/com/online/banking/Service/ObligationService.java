package com.online.banking.Service;


import com.online.banking.Entity.CompteBancaire;
import com.online.banking.Entity.Obligation;
import com.online.banking.Repository.ObligationRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class ObligationService {
    @Autowired
    private ObligationRep obligationRep;


    public List<Obligation> getallobligation() {
        List<Obligation> obligations = new ArrayList<>();
        obligationRep.findAll().forEach(obligations::add);
        return obligations;
    }
}
