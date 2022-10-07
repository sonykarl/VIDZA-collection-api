package com.example.vidza.features.shopkeeper.inventory.service;

import com.example.vidza.entities.*;
import com.example.vidza.features.shopkeeper.inventory.dtos.*;
import com.example.vidza.features.utils.FilePaths;
import com.example.vidza.features.utils.FileUploads;
import com.example.vidza.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

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

    @Autowired
    private FileUploads fileUploads;



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
    public String addShoePhotos(MultipartFile[] shoePictures, MultipartFile coverPhoto, BigInteger shoeId) {


        String shoeResponse = new String();

        try {
            Shoe shoe = shoeRepository.findById(shoeId).get();
            List<String> pictures = new ArrayList<>();

            if (shoe != null){

                ShoePictures shoePics = new ShoePictures();
                List<ShoePicture> shoePic = new ArrayList<>();

                for (MultipartFile shoePicture:shoePictures) {
                    fileUploads.uploadFile(shoePicture, FilePaths.F_ILE_PATHS.getfilePath());
                    pictures.add(shoePicture.getOriginalFilename());
                }

                shoePics.setCoverPhoto(coverPhoto.getOriginalFilename());
                shoePics.setShoePicture(shoePic);
                shoePics.setShoe(shoe);
                Shoe updatedShoe = shoeRepository.save(shoe);

                if (updatedShoe.getPictures() != null){
                   shoeResponse =  "shoe pictures have been updated";
                } else {
                    shoeResponse = "shoe pictures have not been updated";
                }
            }

            return shoeResponse;

        }catch (Exception e){
            return e.getMessage();
        }

    }

    @Override
    public BigInteger addShoeBrand(AddShoeBrandDto addShoeBrandDto) {
        Brand brand = new Brand();
        brand.setBrandName(addShoeBrandDto.brandName);
        return brandRepository.save(brand).getId();
    }

    @Override
    public String addShoeBrandLogo(MultipartFile brandLogo, BigInteger brandId) {

        try {
            Brand brand = brandRepository.findById(brandId).get();
            String logoName = brandLogo.getOriginalFilename();
            fileUploads.uploadFile(brandLogo,FilePaths.F_ILE_PATHS.getfilePath());
            brand.setBrandLogo(logoName);
            Brand updatedBrand = brandRepository.save(brand);

            if (updatedBrand.getBrandLogo() != null) {
                return "brandLogo updated successfully";
            } else {
                return "brandLogo not updated";
            }

        }catch (Exception e){
            return e.getMessage();
        }

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
    public String addShoeTypePicture(MultipartFile shoeTypePicture, BigInteger shoeTypeId) {



        try {
            ShoeType shoeType = shoeTypeRepository.findById(shoeTypeId).get();
            fileUploads.uploadFile(shoeTypePicture,FilePaths.F_ILE_PATHS.getfilePath());
            shoeType.setShoeTypePicture(shoeTypePicture.getOriginalFilename());
            ShoeType shoetypeResponse = shoeTypeRepository.save(shoeType);

            if (shoetypeResponse.getShoeTypePicture() != null){
                return "shoe-type picture saved successfully";
            } else {
             return "shoe-type picture not saved try again";
            }
        }catch (Exception e){
            return e.getMessage();
        }

    }

    @Override
    public BigInteger addShoeGender(AddShoeGenderDto addShoeGenderDto) {
        ShoeGender shoeGender = new ShoeGender();
        shoeGender.setGender(addShoeGenderDto.getGender());
        return shoeGenderRepository.save(shoeGender).getId();
    }
}
