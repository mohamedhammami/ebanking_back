package com.online.banking.Repository;

import com.online.banking.Entity.Contact;
import org.springframework.data.repository.CrudRepository;

public interface ContactRep extends CrudRepository<Contact,Integer> {
}
