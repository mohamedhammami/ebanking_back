package com.online.banking.Controller;

import com.online.banking.Entity.Generic.GenericEntity;
import com.online.banking.Entity.Product;
import com.online.banking.Entity.ProductDetail;
import com.online.banking.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/generic")
public class GenericController {

    @Autowired
    ProductService productService;

    @PostMapping("/create")
    public ResponseEntity<String> createProduct(@RequestBody Product p
    ) {
       
        productService.addProuctAndValues(p);
        return ResponseEntity.ok("done");
    }
    
    @PostMapping("/creategeneric")
    public ResponseEntity<String> creategenericProduct(@RequestBody GenericEntity g
    ) {
       
        productService.addnewgeneric(g);
        return ResponseEntity.ok("done");
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<GenericEntity> getgenericEntity(@PathVariable int id) {
        return ResponseEntity.ok(productService.getGeneric((long)id));
    }
}

class ProductWrapper {
    String name;
    List<ProductDetail> values;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ProductDetail> getValues() {
        return values;
    }

    public void setValues(List<ProductDetail> values) {
        this.values = values;
    }
}
