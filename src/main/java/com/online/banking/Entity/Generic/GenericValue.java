package com.online.banking.Entity.Generic;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.online.banking.Entity.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class GenericValue extends BaseEntity {

    String value;
    String name;
    String type;
    @JsonIgnore
    @ManyToOne
    GenericEntity genericEntity;

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

    public GenericEntity getGenericEntity() {
        return genericEntity;
    }

    public void setGenericEntity(GenericEntity genericEntity) {
        this.genericEntity = genericEntity;
    }
}
