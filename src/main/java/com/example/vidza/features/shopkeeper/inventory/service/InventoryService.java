package com.example.vidza.features.shopkeeper.inventory.service;

import com.example.vidza.entities.Shoe;
import com.example.vidza.features.shopkeeper.inventory.dtos.*;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigInteger;

public interface InventoryService {
     Shoe addShoeDetails(AddShoeDetailsDto addShoeDetailsDto);
     String addShoePhotos(MultipartFile[] shoePictures, MultipartFile coverPhoto, BigInteger shoeId);

     BigInteger addShoeBrand(AddShoeBrandDto addShoeBrandDto);

     String addShoeBrandLogo(MultipartFile brandLogo, BigInteger brandId);
     void addShoeSize(AddShoeSizeDto addShoeSizeDto);

     BigInteger addShoeType(AddShoeTypeDto addShoeTypeDto);

     String addShoeTypePicture(MultipartFile shoeTypePicture, BigInteger shoeTypeId);

     BigInteger addShoeGender(AddShoeGenderDto addShoeGenderDto);
}
