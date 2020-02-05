package com.online.banking.Entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class ProductDetail extends BaseEntity {

    String value;
    String name;
    String type;

    @ManyToOne
    Product product;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
