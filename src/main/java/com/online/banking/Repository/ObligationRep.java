package com.online.banking.Repository;

import com.online.banking.Entity.CompteTitre;
import com.online.banking.Entity.Obligation;
import org.springframework.data.repository.CrudRepository;

public interface ObligationRep extends CrudRepository<Obligation,Integer> {
}
