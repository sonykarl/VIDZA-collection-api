package com.example.vidza.features.store.inventory.service;

import com.example.vidza.entities.Shoe;
import com.example.vidza.features.store.inventory.dtos.AddShoeDto;
import org.springframework.web.multipart.MultipartFile;

public interface InventoryService {
     void save(MultipartFile coverPhoto);
}
