package com.online.banking.Service;


import com.online.banking.Entity.Generic.GenericEntity;
import com.online.banking.Entity.Generic.GenericValue;
import com.online.banking.Entity.Product;
import com.online.banking.Entity.ProductDetail;
import com.online.banking.Entity.User;
import com.online.banking.Repository.GenericEntityRepository;
import com.online.banking.Repository.GenericValueRepository;
import com.online.banking.Repository.ProductDetailRepository;
import com.online.banking.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService extends ServicePattern<User> {

    @Autowired
    ProductRepository productRepository;
    @Autowired
    GenericEntityRepository genericEntityRepository;
    @Autowired
    ProductDetailRepository productDetailRepository;
    
    @Autowired
    GenericValueRepository genericValueRepository;
    

    public void addProuctAndValues(Product p){
        Product addedProduct = productRepository.save(p);
        List<ProductDetail> list=p.getValueList();
        for (ProductDetail detail : list){
            detail.setProduct(addedProduct);
            productDetailRepository.save(detail);
        }
    }
    public void addnewgeneric(GenericEntity g){
        GenericEntity generic = genericEntityRepository.save(g);
        List<GenericValue> list=g.getValueList();
        for (GenericValue detail : list){
            detail.setGenericEntity(generic);
            genericValueRepository.save(detail);
        }
    }

    public GenericEntity getGeneric(Long id){
        return genericEntityRepository.findById(id).get();
    }


}
