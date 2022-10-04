package com.example.vidza.features.store.inventory.controller;


import com.example.vidza.features.store.inventory.dtos.AddShoeDto;
import com.example.vidza.features.store.inventory.service.InventoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("api/v1/shoes/")
public class InventoryController {

    @Autowired
    private InventoryServiceImpl inventoryService;

    @PostMapping("add-shoe-details")
    public void addShoeDetails(
            @RequestBody AddShoeDto addShoeDto
    ){

    }
    @PutMapping("add-shoe-photos")
    public void addShoePhotos(
            @RequestParam("shoePictures") MultipartFile[] shoePictures,
            @RequestParam("coverPhoto") MultipartFile coverPhoto
            ){

    }
}
