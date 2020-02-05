package com.online.banking.Service;

import com.online.banking.Entity.Contact;
import com.online.banking.Entity.DemandeCredit;
import com.online.banking.Entity.User;
import com.online.banking.Repository.ContactRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class ContactService {
    @Autowired
    private ContactRep contactRep;

    public List<Contact> getalldemande() {
        List<Contact> demande = new ArrayList<>();
        contactRep.findAll().forEach(demande::add);
        return demande;
    }
    public void addcontact(Contact d) {
        Contact dc = new Contact();
        dc.setLastname(d.getLastname());
        dc.setFirstname(d.getFirstname());
        dc.setCountry(d.getCountry());
        dc.setNumtel(d.getNumtel());
        dc.setBoject(d.getBoject());
        contactRep.save(dc);

    }

}
