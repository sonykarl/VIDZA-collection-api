package com.example.vidza.features.store.inventory.service;

import com.example.vidza.entities.Shoe;
import com.example.vidza.features.store.inventory.dtos.AddShoeDto;
import com.example.vidza.repositories.ShoeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class InventoryServiceImpl implements InventoryService{
    @Autowired
    private ShoeRepository shoeRepository;



    @Override
    public void save(MultipartFile coverPhoto) {

    }
}
