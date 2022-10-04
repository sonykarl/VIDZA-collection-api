package com.example.vidza.features.store.inventory.dtos;

import com.example.vidza.entities.Brand;
import com.example.vidza.entities.ShoeSize;
import com.example.vidza.entities.ShoeType;

import java.math.BigInteger;
import java.util.List;

public class AddShoeDetailsDto {
    private List<ShoeSize> shoeSize;
    private BigInteger shoeType;
    private String description;
    private BigInteger brand;
    private BigInteger price;

    public AddShoeDetailsDto() {
    }

    public AddShoeDetailsDto(List<ShoeSize> shoeSize, BigInteger shoeType, String description, BigInteger brand, BigInteger price) {
        this.shoeSize = shoeSize;
        this.shoeType = shoeType;
        this.description = description;
        this.brand = brand;
        this.price = price;
    }


    public List<ShoeSize> getShoeSize() {
        return shoeSize;
    }

    public void setShoeSize(List<ShoeSize> shoeSize) {
        this.shoeSize = shoeSize;
    }

    public BigInteger getShoeType() {
        return shoeType;
    }

    public void setShoeType(BigInteger shoeType) {
        this.shoeType = shoeType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigInteger getBrand() {
        return brand;
    }

    public void setBrand(BigInteger brand) {
        this.brand = brand;
    }

    public BigInteger getPrice() {
        return price;
    }

    public void setPrice(BigInteger price) {
        this.price = price;
    }
}
