package com.online.banking.Service;

import java.util.ArrayList;
import java.util.List;

import com.online.banking.Entity.AssuranceConso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.banking.Repository.AssuranceConsoRep;

@Service
public class AssuranceConsoService {
	  
	  
	    @Autowired
	    private AssuranceConsoRep assuranceConsoRep;
	    
	 public List<AssuranceConso> getallAssuranceConso() {
	        List<AssuranceConso> AssuranceConsos = new ArrayList<>();
	        assuranceConsoRep.findAll().forEach(AssuranceConsos::add);
	        return AssuranceConsos;
	    }

	    public AssuranceConso getAssuranceConso(Long id) {
	        return assuranceConsoRep.findById(id).orElseThrow(() -> new IllegalArgumentException("invalid id" + id));
	    }


	   public void addAssuranceConso(AssuranceConso assuranceConso) {

		   assuranceConsoRep.save(assuranceConso);
	    }
	  

}
