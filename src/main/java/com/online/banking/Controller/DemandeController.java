package com.online.banking.Controller;

import com.online.banking.Entity.DemandeCredit;
import com.online.banking.Service.DemandeCreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class DemandeController {
    @Autowired
private DemandeCreditService demandeCreditService;

    @RequestMapping("/allrequest")
    public List<DemandeCredit> getallrequest() {
        return demandeCreditService.getalldemande();

    }

    @RequestMapping("/allrequestencours")
    public List<DemandeCredit> getallrequestencours() {
        return demandeCreditService.getalldemandeencours();

    }

    @RequestMapping("/getrequest/{id}")
    public DemandeCredit getrequest(@PathVariable Long id) {
        return demandeCreditService.getdemande(id);
    }



    @RequestMapping(method = RequestMethod.POST, value = "/addrequest")
    public ResponseEntity adddemande(@RequestBody DemandeCredit request) {
        demandeCreditService.adddemande(request);
        return new ResponseEntity(HttpStatus.OK);
    }
    @RequestMapping(method = RequestMethod.PUT, value = "/updaterequest/{id}")
    public void updaterequest(@RequestBody DemandeCredit request, @PathVariable Long id) {
        demandeCreditService.updatedemande(request, id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/deleterequest/{id}")
    public void deleterequest(@PathVariable int id) {
        demandeCreditService.deletedemande((long)id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/accept/{id}")
    public ResponseEntity accept(@RequestBody DemandeCredit request, @PathVariable Long id) {
        demandeCreditService.AcceptCredit(request, id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/refus/{id}")
    public ResponseEntity refus(@RequestBody DemandeCredit request, @PathVariable Long id) {
        demandeCreditService.refuse(request, id);
        return new ResponseEntity(HttpStatus.OK);
    }

}
