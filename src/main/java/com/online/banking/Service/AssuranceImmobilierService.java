package com.online.banking.Service;

import java.util.ArrayList;
import java.util.List;

import com.online.banking.Entity.AssuranceImmobilier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.banking.Repository.AssuranceImmobilierRep;

@Service
public class AssuranceImmobilierService {


    @Autowired
    private AssuranceImmobilierRep assuranceImmobilierRep;

    public List<AssuranceImmobilier> getallAssuranceImmobilier() {
        List<AssuranceImmobilier> AssuranceImmobiliers = new ArrayList<>();
        assuranceImmobilierRep.findAll().forEach(AssuranceImmobiliers::add);
        return AssuranceImmobiliers;
    }

    public AssuranceImmobilier getAssuranceImmobilier(long id) {
        return assuranceImmobilierRep.findById( id).orElseThrow(() -> new IllegalArgumentException("invalid id" + id));
    }


    public void addAssuranceImmobilier(AssuranceImmobilier assuranceImmobilier) {

        assuranceImmobilierRep.save(assuranceImmobilier);
    }
}
