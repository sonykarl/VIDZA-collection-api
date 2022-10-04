package com.example.vidza.features.store.inventory.controller;


import com.example.vidza.entities.ShoeGender;
import com.example.vidza.entities.ShoePictures;
import com.example.vidza.features.store.inventory.dtos.AddShoeBrandDto;
import com.example.vidza.features.store.inventory.dtos.AddShoeDetailsDto;
import com.example.vidza.features.store.inventory.dtos.AddShoeGenderDto;
import com.example.vidza.features.store.inventory.dtos.AddShoeTypeDto;
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

    @PostMapping("add-shoe-brand")
    public BigInteger addShoeBrand(
            @RequestBody AddShoeBrandDto addShoeBrandDto
            ){
        return inventoryService.addShoeBrand(addShoeBrandDto);
    }

    @PutMapping("add-shoe-brand-logo")
    public void addBrandLogo(
            @RequestParam ("brandLogo") MultipartFile brandLogo,
            @RequestParam("brandId") BigInteger brandId
            ){
        inventoryService.addShoeBrandLogo(brandLogo, brandId);
    }
    @PostMapping("add-shoe-type")
    public BigInteger  addShoeType(
            @RequestBody AddShoeTypeDto addShoeTypeDto
            ){
        return inventoryService.addShoeType(addShoeTypeDto);
    }

    @PutMapping("add-shoe-type-pic")
    public void addShoeTypePicture(
            @RequestParam ("shoeTypePic") MultipartFile shoeTypePic,
            @RequestParam ("shoeTypeId") BigInteger shoeTypeId
    ){
        inventoryService.addShoeTypePicture(shoeTypePic, shoeTypeId);
    }

    @PutMapping("add-shoe-gender")
    public void addShoeGender(
            @RequestBody AddShoeGenderDto addShoeGenderDto
            ){
        inventoryService.addShoeGender(addShoeGenderDto);
    }
}


