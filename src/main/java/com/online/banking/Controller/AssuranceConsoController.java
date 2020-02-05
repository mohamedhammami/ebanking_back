package com.online.banking.Controller;

import java.util.List;

import com.online.banking.Entity.AssuranceConso;
import com.online.banking.Service.AssuranceConsoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AssuranceConsoController {

	
    @Autowired
    private AssuranceConsoService assuranceConsoService;
    
    
     @RequestMapping("/allasuranceconso")
    public List<AssuranceConso> getallAssuranceConsoService() {
        return  assuranceConsoService.getallAssuranceConso();

    }

    @RequestMapping("/getAssuranceConso/{id}")
    public AssuranceConso getAssuranceConso(@PathVariable Long id) {
        return assuranceConsoService.getAssuranceConso(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/addassuranceConso")
    public ResponseEntity addAssuranceConso(@RequestBody AssuranceConso assuranceConso) {
    	assuranceConsoService.addAssuranceConso(assuranceConso);
        return new ResponseEntity(HttpStatus.OK);
    }

}
