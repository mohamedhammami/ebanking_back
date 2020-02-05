package com.online.banking.Repository;

import com.online.banking.Entity.CompteTitre;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteTitreRep extends CrudRepository<CompteTitre,Long> {
}
