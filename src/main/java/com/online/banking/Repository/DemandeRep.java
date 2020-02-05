package com.online.banking.Repository;

import com.online.banking.Entity.DemandeCredit;
import com.online.banking.Entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DemandeRep extends CrudRepository<DemandeCredit,Long> {
    @Query("select u from DemandeCredit u where u.etat ='ENCOURS' ")
    Iterable<DemandeCredit> findByetat();
}
