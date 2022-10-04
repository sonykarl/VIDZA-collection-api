package com.example.vidza.features.store.inventory.dtos;

import com.example.vidza.entities.Brand;
import com.example.vidza.entities.ShoeSize;
import com.example.vidza.entities.ShoeType;

import java.math.BigInteger;
import java.util.List;

public class AddShoeDetailsDto {
    private List<ShoeSize> shoeSize;
    private ShoeType shoeType;
    private String description;
    private Brand brand;
    private BigInteger price;

    public AddShoeDetailsDto() {
    }

    public AddShoeDetailsDto(List<ShoeSize> shoeSize, ShoeType shoeType, String description, Brand brand, BigInteger price) {
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

    public ShoeType getShoeType() {
        return shoeType;
    }

    public void setShoeType(ShoeType shoeType) {
        this.shoeType = shoeType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public BigInteger getPrice() {
        return price;
    }

    public void setPrice(BigInteger price) {
        this.price = price;
    }
}
