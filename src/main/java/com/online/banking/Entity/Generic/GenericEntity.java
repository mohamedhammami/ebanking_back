package com.online.banking.Entity.Generic;


import com.online.banking.Entity.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class GenericEntity extends BaseEntity {

    String name;
    @OneToMany(mappedBy = "genericEntity")
    List<GenericValue> valueList = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<GenericValue> getValueList() {
        return valueList;
    }

    public void setValueList(List<GenericValue> valueList) {
        this.valueList = valueList;
    }
}
