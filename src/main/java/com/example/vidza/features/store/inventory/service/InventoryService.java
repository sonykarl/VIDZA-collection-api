package com.example.vidza.features.store.inventory.service;

import com.example.vidza.entities.Shoe;
import com.example.vidza.features.store.inventory.dtos.AddShoeDetailsDto;
import com.example.vidza.features.store.inventory.dtos.AddShoePhotosDto;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigInteger;

public interface InventoryService {
     Shoe addShoeDetails(AddShoeDetailsDto addShoeDetailsDto);
     void addShoePhotos(MultipartFile[] shoePictures, MultipartFile coverPhoto, BigInteger shoeId);
}
