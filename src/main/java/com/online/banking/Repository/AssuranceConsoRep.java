package com.online.banking.Repository;

import com.online.banking.Entity.AssuranceConso;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;


@Repository
public interface AssuranceConsoRep  extends CrudRepository<AssuranceConso,Long>{

	
	
}

