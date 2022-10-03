package com.example.vidza.features.store.inventory.controller;


import com.example.vidza.features.store.inventory.dtos.AddShoeDto;
import com.example.vidza.features.store.inventory.service.InventoryService;
import com.example.vidza.features.store.inventory.service.InventoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/v1/shoes/")
public class InventoryController {

    @Autowired
    private InventoryServiceImpl inventoryService;
    @PostMapping("add-shoe")
    public void addShoe(@RequestParam("shoePictures") MultipartFile[] shoePictures, @RequestParam("coverPhoto") MultipartFile coverPhoto, @RequestBody AddShoeDto addShoeDto){

    }
}
