package com.example.vidza.features.shopkeeper.inventory.controller;


import com.example.vidza.features.shopkeeper.inventory.service.InventoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/inventory/display")
public class DisplayInventoryController {

    @Autowired
    private InventoryServiceImpl inventoryService;

    @GetMapping("get-shoe-type-pic")
    public byte[] getShoeTypePic(){
        try {
            return inventoryService.getshoeTypePicture();
        }catch (Exception e){
            System.out.println(e);
        }

        return null;
    }
}
