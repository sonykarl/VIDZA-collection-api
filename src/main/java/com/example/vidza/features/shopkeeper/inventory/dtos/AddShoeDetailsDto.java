package com.example.vidza.features.shopkeeper.inventory.dtos;

import java.math.BigInteger;
import java.util.List;

public class AddShoeDetailsDto {
    private List<BigInteger> shoeSize;
    private BigInteger shoeType;
    private String description;
    private BigInteger brand;
    private BigInteger price;

    public AddShoeDetailsDto() {
    }

    public AddShoeDetailsDto(List<BigInteger> shoeSize, BigInteger shoeType, String description, BigInteger brand, BigInteger price) {
        this.shoeSize = shoeSize;
        this.shoeType = shoeType;
        this.description = description;
        this.brand = brand;
        this.price = price;
    }


    public List<BigInteger> getShoeSize() {
        return shoeSize;
    }

    public void setShoeSize(List<BigInteger> shoeSize) {
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
