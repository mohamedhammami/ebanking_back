package com.online.banking.Service;

import com.online.banking.Entity.User;
import com.online.banking.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService extends ServicePattern<User> {

    @Autowired
    UserRepository userRepository;

    @Autowired
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    public User addUser(User u){
        u.setPassword(bCryptPasswordEncoder().encode(u.getPassword()));
       return userRepository.save(u);
    }

    public User findUserByEmail(String email){
        return userRepository.findByEmail(email);
    }

    public boolean matchPassword(User u ,String password){
        return bCryptPasswordEncoder().matches(password,u.getPassword());
    }




}
