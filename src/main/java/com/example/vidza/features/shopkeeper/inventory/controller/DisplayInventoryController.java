package com.example.vidza.features.shopkeeper.inventory.controller;


import com.example.vidza.features.shopkeeper.inventory.dtos.GetShoeTypePic;
import com.example.vidza.features.shopkeeper.inventory.service.InventoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.IOException;
import java.math.BigInteger;

@RestController
@RequestMapping("api/v1/inventory/display")
public class DisplayInventoryController {

    @Autowired
    private InventoryServiceImpl inventoryService;

    @GetMapping("get-shoe-pic/{id}")
    private ResponseEntity<byte[]> getShoePic(
            @PathVariable("id") BigInteger id
            ) throws IOException {
      byte[] image = inventoryService.getshoeTypePicture(id);
      return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(image);
    }
}
