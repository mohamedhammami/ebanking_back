package com.online.banking.Repository;

import com.online.banking.Entity.AssuranceImmobilier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssuranceImmobilierRep  extends CrudRepository<AssuranceImmobilier,Long> {

}
