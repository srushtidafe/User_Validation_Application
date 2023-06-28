package com.example.UserValidation.Controller;

import com.example.UserValidation.Model.User;
import com.example.UserValidation.Services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping(value = "/getAllUser")
    public List<User> getAllUser(){
        return userService.getAllUsers();
    }

    @GetMapping(value = "/getUser/{userId}")
    public User getUser(@PathVariable Integer userId){
        return userService.getUserById(userId);
    }

    @PostMapping(value = "/addUser")
    public String addUser( @Valid @RequestBody User user){
        return userService.addNewUser(user);
    }

    @PutMapping(value = "/update/{userId}/{userName}")
    public String updateUser(@PathVariable Integer userId ,@PathVariable String userName){
        return userService.updateUserById(userId ,userName);
    }

   @DeleteMapping(value="/delete/{userId}")
   public String deleteUser(@PathVariable Integer userId ){
       return userService.deleteUserById(userId);
   }
}
