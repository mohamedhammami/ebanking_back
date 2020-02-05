package com.online.banking.Controller;


import com.online.banking.Entity.User;
import com.online.banking.Enum.UserRole;
import com.online.banking.Model.UserLoginModel;
import com.online.banking.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;
    @PutMapping("/create")
    public ResponseEntity<User> addUser(@Valid @RequestBody User user){
        user.setRole(UserRole.Client);
        User addedUser= userService.addUser(user);
        return ResponseEntity.ok(addedUser);
    }

    @GetMapping("/all")
    public ResponseEntity<List<User>> updateCandidate() {
        return ResponseEntity.ok(userService.all());
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<User> getCandidate(@PathVariable int id) {
        User user = userService.get(id);
        if (user != null) {
            return ResponseEntity.ok(user);
        }
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/signin")
    public ResponseEntity<User> loginUser(@Valid @RequestBody UserLoginModel userLoginModel){
        User result = userService.findUserByEmail(userLoginModel.getEmail());
        if(result!=null){
            if(userService.matchPassword(result,userLoginModel.getPassword())){
                return ResponseEntity.ok(result);
            }
        }
        return ResponseEntity.noContent().build();
    }

}

