package com.cg.pacs.pacsDemo.controller;

import com.cg.pacs.pacsDemo.model.User;
import com.cg.pacs.pacsDemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/createuser")
    public User createUser(@RequestBody User user){
        User createdUser = userService.addUser(user);
        return createdUser;
    }

    @DeleteMapping("/deleteuser/{rollNo}")
    public ResponseEntity<Void> deleteUser(@PathVariable("userId") Integer rollNo){
        userService.deleteUser(rollNo);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
