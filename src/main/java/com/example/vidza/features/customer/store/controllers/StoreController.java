package com.example.vidza.features.customer.store.controllers;

import com.example.vidza.entities.Shoe;
import com.example.vidza.features.customer.store.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/store/")
public class StoreController {

    @Autowired
    private StoreService storeService;

    @PostMapping("getshoes")
    public Shoe getShoes(){
        return null;
    }
}
