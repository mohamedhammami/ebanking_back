package com.online.banking.Controller;

import java.util.List;

import com.online.banking.Entity.AssuranceImmobilier;
import com.online.banking.Service.AssuranceImmobilierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AssuranceImmobilierController {



    @Autowired
    private AssuranceImmobilierService assuranceImmobilierService;



    @RequestMapping("/allAssuranceImmobilier")
    public List<AssuranceImmobilier> getallAssuranceImmobilier() {
        return  assuranceImmobilierService.getallAssuranceImmobilier();

    }

    @RequestMapping("/getAssuranceImmobilier/{id}")
    public AssuranceImmobilier getAssuranceImmobilier(@PathVariable long id) {
        return assuranceImmobilierService.getAssuranceImmobilier(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/addassuranceImmobilier")
    public ResponseEntity addAssuranceImmobilier(@RequestBody AssuranceImmobilier assuranceImmobilier) {
        assuranceImmobilierService.addAssuranceImmobilier(assuranceImmobilier);
        return new ResponseEntity(HttpStatus.OK);
    }

}

