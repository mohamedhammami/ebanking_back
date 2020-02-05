package com.online.banking.Repository;


import com.online.banking.Entity.Generic.GenericEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface GenericEntityRepository extends IRepository<GenericEntity> {

}
