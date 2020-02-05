package com.online.banking.Repository;

import com.online.banking.Entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends IRepository<User> {
    @Query("select u from User u where u.email = :x")
    User findByEmail(@Param("x") String email);
}
