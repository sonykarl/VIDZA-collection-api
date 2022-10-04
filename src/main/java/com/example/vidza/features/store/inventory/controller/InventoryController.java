package com.example.vidza.features.store.inventory.controller;


import com.example.vidza.entities.ShoePictures;
import com.example.vidza.features.store.inventory.dtos.AddShoeDetailsDto;
import com.example.vidza.features.store.inventory.service.InventoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigInteger;

@RestController
@RequestMapping("api/v1/inventory/shoes/")
public class InventoryController {

    @Autowired
    private InventoryServiceImpl inventoryService;

    @PostMapping("add-shoe-details")
    public void addShoeDetails(
            @RequestBody AddShoeDetailsDto addShoeDto
    ){
        inventoryService.addShoeDetails(addShoeDto);
    }
    @PutMapping("add-shoe-photos")
    public void addShoePhotos(
            @RequestParam("shoePictures") MultipartFile[] shoePictures,
            @RequestParam("coverPhoto") MultipartFile coverPhoto,
            @RequestParam("shoe_id")BigInteger shoeId
            ){
        inventoryService.addShoePhotos(shoePictures, coverPhoto, shoeId);
    }
}
