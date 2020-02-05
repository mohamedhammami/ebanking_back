package com.online.banking.Controller;

import com.online.banking.Entity.CompteTitre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CompteTitreController {

    @Autowired
    private com.online.banking.Service.CompteTitreService CompteTitreService ;

    @RequestMapping("/allCompteTitre")
    public List<CompteTitre> getallCompteTitre() {
        return CompteTitreService.getallCompteTitre();

    }

    @RequestMapping("/getcompteTitre/{RIB}")
    public CompteTitre getCompteTitre(@PathVariable Long RIB) {
        return CompteTitreService.getCompteTitre(RIB) ;
    }



    @RequestMapping(method = RequestMethod.POST, value = "/addcompteTitre")
    public ResponseEntity addCcompteTitre(@RequestBody CompteTitre compteTitre) {
        CompteTitreService.addCompteTitre(compteTitre);
        return new ResponseEntity(HttpStatus.OK);
    }


    @RequestMapping(method = RequestMethod.PUT, value = "/updatecompteTitre/{id}")
    public void updatercompteTitre(@RequestBody CompteTitre compteTitre, @PathVariable Long id) {
        CompteTitreService.updateCompteTitre(compteTitre,id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/deletercompteTitre/{id}")
    public void deletercompteTitre(@PathVariable Long id) {
        CompteTitreService.deleteCompteTitre(id);
    }

}
