package com.online.banking.Repository;

import com.online.banking.Entity.CompteBancaire;
import com.online.banking.Entity.DemandeCredit;
import com.online.banking.Entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompteBancaireRep extends CrudRepository<CompteBancaire,Long> {
    @Query("select u from CompteBancaire u where u.ferme =false ")
    Iterable<CompteBancaire> findByetat();
}
