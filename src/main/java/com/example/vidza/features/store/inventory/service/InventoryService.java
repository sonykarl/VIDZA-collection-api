package com.example.vidza.features.store.inventory.service;

import com.example.vidza.entities.Shoe;
import org.springframework.web.multipart.MultipartFile;

public interface InventoryService {
     Shoe addShoeDetails(Shoe shoe);
     Shoe addShoePhotos(Shoe shoe);
}
