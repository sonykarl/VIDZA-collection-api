package com.example.vidza.features.store.inventory.service;

import com.example.vidza.entities.*;
import com.example.vidza.features.store.inventory.dtos.*;
import com.example.vidza.repositories.*;
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
    @Autowired
    private ShoeSizeRepository shoeSizeRepository;
    @Autowired
    private ShoeGenderRepository shoeGenderRepository;

    @Override
    public Shoe addShoeDetails(AddShoeDetailsDto addShoeDetailsDto) {
        Shoe shoe = new Shoe();
        Brand brand = brandRepository.findById(addShoeDetailsDto.getBrand()).get();
        ShoeType shoeType = shoeTypeRepository.findById(addShoeDetailsDto.getShoeType()).get();
        List<ShoeSize> shoeSizes = new ArrayList<>();

        for (BigInteger shoeSizeId: addShoeDetailsDto.getShoeSize()){
            ShoeSize myShoeSize = shoeSizeRepository.findById(shoeSizeId).get();
            shoeSizes.add(myShoeSize);
        }
        shoe.setShoeSize(shoeSizes);
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
            List<ShoePicture> shoePic = new ArrayList<>();

            for (MultipartFile shoePicture:shoePictures) {
            pictures.add(shoePicture.getOriginalFilename());
            }

            shoePics.setCoverPhoto(coverPhoto.getOriginalFilename());
            shoePics.setShoePicture(shoePic);
            shoePics.setShoe(shoe);
            shoeRepository.save(shoe);
        }

    }

    @Override
    public BigInteger addShoeBrand(AddShoeBrandDto addShoeBrandDto) {
        Brand brand = new Brand();
        brand.setBrandName(addShoeBrandDto.brandName);
        return brandRepository.save(brand).getId();
    }

    @Override
    public void addShoeBrandLogo(MultipartFile brandLogo, BigInteger brandId) {
        Brand brand = brandRepository.findById(brandId).get();
        String logo = brandLogo.getOriginalFilename();
        brand.setBrandLogo(logo);
        brandRepository.save(brand);
    }

    @Override
    public void addShoeSize(AddShoeSizeDto addShoeSizeDto) {
        ShoeSize shoeSize = new ShoeSize();
        shoeSize.setShoeSize(addShoeSizeDto.getShoeSize());
        shoeSizeRepository.save(shoeSize);
    }

    @Override
    public BigInteger addShoeType(AddShoeTypeDto addShoeTypeDto) {
        ShoeGender shoeGender = shoeGenderRepository.findById(addShoeTypeDto.getShoeGender()).get();
        ShoeType shoeType = new ShoeType();
        shoeType.setShoeType(addShoeTypeDto.getShoeType());
        shoeType.setShoeGender(shoeGender);
        shoeType.setAge(addShoeTypeDto.getAge());
        return shoeTypeRepository.save(shoeType).getId();
    }

    @Override
    public void addShoeTypePicture(MultipartFile shoeTypePicture, BigInteger shoeTypeId) {
        ShoeType shoeType = shoeTypeRepository.findById(shoeTypeId).get();
        String picture = shoeTypePicture.getOriginalFilename();
        shoeType.setShoeTypePicture(picture);
        shoeTypeRepository.save(shoeType);
    }

    @Override
    public BigInteger addShoeGender(AddShoeGenderDto addShoeGenderDto) {
        ShoeGender shoeGender = new ShoeGender();
        shoeGender.setGender(addShoeGenderDto.getGender());
        return shoeGenderRepository.save(shoeGender).getId();
    }
}
