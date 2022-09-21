package com.example.vidza.features.authentication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestJwt {
    @GetMapping("api/v1/test")
    public String testJwt(){
        return "jwt works";
    }
}
