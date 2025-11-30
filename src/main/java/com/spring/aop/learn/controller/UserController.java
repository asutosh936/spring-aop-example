package com.spring.aop.learn.controller;

import com.spring.aop.learn.model.User;
import com.spring.aop.learn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(path = "/{userId}")
    public User getUser(@PathVariable String userId){
        return userService.getUser(Integer.valueOf(userId));
    }

    @PostMapping(path = "/")
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }
}
