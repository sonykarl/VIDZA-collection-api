package com.example.vidza.features.store.inventory.service;

import com.example.vidza.entities.Brand;
import com.example.vidza.entities.Shoe;
import com.example.vidza.entities.ShoePictures;
import com.example.vidza.entities.ShoeType;
import com.example.vidza.features.store.inventory.dtos.AddShoeDetailsDto;
import com.example.vidza.features.store.inventory.dtos.AddShoePhotosDto;
import com.example.vidza.repositories.BrandRepository;
import com.example.vidza.repositories.ShoeRepository;
import com.example.vidza.repositories.ShoeTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class InventoryServiceImpl implements InventoryService{
    @Autowired
    private ShoeRepository shoeRepository;
    @Autowired
    private BrandRepository brandRepository;
    @Autowired
    private ShoeTypeRepository shoeTypeRepository;

    @Override
    public Shoe addShoeDetails(AddShoeDetailsDto addShoeDetailsDto) {
        Shoe shoe = new Shoe();
        Brand brand = brandRepository.findById(addShoeDetailsDto.getBrand()).get();
        ShoeType shoeType = shoeTypeRepository.findById(addShoeDetailsDto.getShoeType()).get();

        shoe.setShoeSize(addShoeDetailsDto.getShoeSize());
        shoe.setShoeType(shoeType);
        shoe.setDescription(addShoeDetailsDto.getDescription());
        shoe.setPrice(addShoeDetailsDto.getPrice());
        shoe.setBrand(brand);

        return shoeRepository.save(shoe);
    }

    @Override
    public void addShoePhotos(MultipartFile[] shoePictures, MultipartFile coverPhoto, BigInteger shoeId) {
        Shoe shoe = shoeRepository.findById(shoeId).get();
        List<String> pictures = new ArrayList<>();

        if (shoe != null){
            ShoePictures shoePics = new ShoePictures();
            for (MultipartFile shoePicture:shoePictures) {
            pictures.add(shoePicture.getOriginalFilename());
            }

            shoePics.setCoverPhoto(coverPhoto.getOriginalFilename());
            shoePics.setShoePicture(pictures);
            shoePics.setShoe(shoe);
            shoeRepository.save(shoe);
        }

    }
}
