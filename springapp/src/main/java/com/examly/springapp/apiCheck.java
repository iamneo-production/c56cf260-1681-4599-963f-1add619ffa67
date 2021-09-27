package com.examly.springapp;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestBody;
@RestController
public class apiCheck {
    @Autowired
    private UserRepository repo;

    @RequestMapping(method = RequestMethod.POST, value="/login")
    public User getDetails(@RequestBody User user){
        User savedUser = repo.save(user);
        return savedUser;
    }
    @RequestMapping(value = "/getAll")
    public List<User> getAll(){
        List<User> users = repo.findAll();
        return users;
    }
}
