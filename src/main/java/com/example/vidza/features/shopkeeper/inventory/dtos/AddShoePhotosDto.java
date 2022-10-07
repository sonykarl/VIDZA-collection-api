package com.example.vidza.features.shopkeeper.inventory.dtos;

import com.example.vidza.entities.ShoePictures;

import java.math.BigInteger;
import java.util.List;

public class AddShoePhotosDto {
    private BigInteger id;
    private List<ShoePictures> shoePictures;

    public AddShoePhotosDto(BigInteger id, List<ShoePictures> shoePictures) {
        this.id = id;
        this.shoePictures = shoePictures;
    }

    public AddShoePhotosDto() {
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public List<ShoePictures> getShoePictures() {
        return shoePictures;
    }

    public void setShoePictures(List<ShoePictures> shoePictures) {
        this.shoePictures = shoePictures;
    }
}
