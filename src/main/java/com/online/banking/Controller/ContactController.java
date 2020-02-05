package com.online.banking.Controller;

import com.online.banking.Entity.Contact;
import com.online.banking.Entity.DemandeCredit;
import com.online.banking.Service.ContactService;
import com.online.banking.Service.DemandeCreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class ContactController {
    @Autowired
    private ContactService demandeCreditService;

    @RequestMapping("/allcontact")
    public List<Contact> getallrequest() {
        return demandeCreditService.getalldemande();

    }
    @RequestMapping(method = RequestMethod.POST, value = "/addcontact")
    public ResponseEntity adddcontact(@RequestBody Contact request) {
        demandeCreditService.addcontact(request);
        return new ResponseEntity(HttpStatus.OK);
    }
}
