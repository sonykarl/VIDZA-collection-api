package com.example.vidza.features.authentication.controllers;

import com.example.vidza.features.authentication.services.MyUserDetailsService;
import com.example.vidza.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/test/")
public class TestJwt {
    @Autowired
    MyUserDetailsService myUserDetailsService;

    @GetMapping("user")
    public String testJwt(){
        return "user got in";
    }
    @GetMapping("admin")
    public String testAdmin(){
        return "admin got in";
    }

    @GetMapping("")
    public String getNoUser(){
        return "no permission needed";
    }

    @PostMapping("register")
    public String register(
            @RequestBody UserDto userDto
    ){

        Boolean isActive = Boolean.parseBoolean(userDto.getActive());
        User user = new User(userDto.getUsername(),userDto.getPassword(),isActive,userDto.getRoles());
        myUserDetailsService.addUser(user);
        return "customer added";
    }

}
