package com.online.banking.Controller;

import com.online.banking.Entity.Obligation;
import com.online.banking.Service.ObligationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class ObligationController {
    @Autowired
    ObligationService obligationService ;
    @RequestMapping("/allobligation")
    public List<Obligation> getallobligaion() {
        return obligationService.getallobligation();

    }
}
