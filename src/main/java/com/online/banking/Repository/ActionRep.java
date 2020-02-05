package com.online.banking.Repository;

import com.online.banking.Entity.Action;
import com.online.banking.Entity.Obligation;
import org.springframework.data.repository.CrudRepository;

public interface ActionRep extends CrudRepository<Action,Integer> {
}
