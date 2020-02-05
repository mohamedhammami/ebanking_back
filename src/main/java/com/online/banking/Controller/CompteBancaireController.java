package com.online.banking.Controller;

import com.online.banking.Entity.CompteBancaire;
import com.online.banking.Entity.DemandeCredit;
import com.online.banking.Service.CompteBancaireService;
import com.online.banking.Repository.CompteBancaireRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CompteBancaireController {
    @Autowired
    CompteBancaireService compteBancaireService ;
    
    @Autowired
    CompteBancaireRep CompteBancaireRep ;
    
    @RequestMapping(method = RequestMethod.PUT,value = "/transaction/{num}")  
    public void doTrans(@PathVariable(value="num") float num,
    	    @RequestParam(value="id", required=true) Long id,
    	    @RequestParam(value="id2", required=false) Long id2){
    
    CompteBancaire compteBancaire1 = compteBancaireService.getCompteBancaire(id);
    
    CompteBancaire  compteBancaire2 = compteBancaireService.getCompteBancaire(id2);
    
    	
    float montant = compteBancaire2.getMontant();
    float a = montant-num ;
    compteBancaire2.setMontant(a);
    
    
    float montant1 = compteBancaire1.getMontant();
    float b = montant1+num ;
    compteBancaire1.setMontant(b);
    
    
    CompteBancaireRep.save(compteBancaire1);
    CompteBancaireRep.save(compteBancaire2);
    	
  
    	}
    

    @RequestMapping("/allcompteBancaire")
    public List<CompteBancaire> getallcompteBancaire() {
        return compteBancaireService.getallCompteBancaire();

    }

    @RequestMapping(method = RequestMethod.PUT, value = "/acceptcompte/{rib}")
    public ResponseEntity accept(@RequestBody CompteBancaire request, @PathVariable Long rib) {
        compteBancaireService.accepte(request, rib);
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping("/getcompteBancaire/{Rib}")
    public CompteBancaire getcompteBancaire(@PathVariable Long Rib) {
        return compteBancaireService.getCompteBancaire(Rib);
    }


    @RequestMapping("/getcompteBancaireclient/{id}")
        public List<CompteBancaire> getcompteBancaireclient(@PathVariable Long id) {
        return compteBancaireService.getCompteBancaireclient(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/addcompteBancaire")
    public ResponseEntity AjouterCompteBancaire(@RequestBody CompteBancaire compteBancaire) {
        compteBancaireService.AjouterCompte(compteBancaire);
        return new ResponseEntity(HttpStatus.OK);
    }



    @RequestMapping(method = RequestMethod.PUT, value = "/updatecompteBancaire/{id}")
    public void updatercompteBancaire(@RequestBody CompteBancaire compteBancaire, @PathVariable Long id) {
        compteBancaireService.updateCompteBancaire(compteBancaire,id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/deletercompteBancaire/{id}")
    public void deletercompteBancaire(@PathVariable Long id) {
        compteBancaireService.deleteCompteBancaire(id);
    }


    @RequestMapping(value = "/CompteBancaire/{RIB}/{montant}/verser", method = RequestMethod.PUT)
    @CrossOrigin(origins = "*")
    public void verser(@PathVariable Long RIB , @PathVariable float montant ) {
        getcompteBancaire(RIB).setMontant(getcompteBancaire(RIB).getMontant()+montant);
        compteBancaireService.updateCompteBancaire(getcompteBancaire(RIB),RIB);
    }
    @RequestMapping(value = "/CompteBancaire/{RIB}/{montant}/retirer", method = RequestMethod.PUT)
    @CrossOrigin(origins = "*")
    public void retirer(@PathVariable Long RIB , @PathVariable float montant ) {
        getcompteBancaire(RIB).setMontant(getcompteBancaire(RIB).getMontant()-montant);
        compteBancaireService.updateCompteBancaire(getcompteBancaire(RIB),RIB);
    }
    @RequestMapping(value = "/CompteBancaire/{RIB1}/{RIB2}/{montant}/transferer", method = RequestMethod.PUT)
    @CrossOrigin(origins = "*")
    public void transferer(@PathVariable Long RIB1,@PathVariable Long RIB2 , @PathVariable float montant ) {
        retirer(RIB1,montant);
        verser(RIB2,montant);
    }



}
