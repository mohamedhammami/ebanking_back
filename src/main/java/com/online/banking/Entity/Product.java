package com.online.banking.Entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Product extends BaseEntity {
    String name;
    @OneToMany(mappedBy = "product")
    List<ProductDetail> valueList = new ArrayList<>();

    @ManyToOne
    User user2;
    public String getName() {
        return name;
    }

    public User getUser2() {
        return user2;
    }

    public void setUser2(User user2) {
        this.user2 = user2;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ProductDetail> getValueList() {
        return valueList;
    }

    public void setValueList(List<ProductDetail> valueList) {
        this.valueList = valueList;
    }
}
