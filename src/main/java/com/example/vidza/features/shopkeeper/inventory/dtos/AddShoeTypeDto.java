package com.example.vidza.features.shopkeeper.inventory.dtos;

import java.math.BigInteger;

public class AddShoeTypeDto {
    private String shoeType;
    private BigInteger shoeGender;
    private Boolean age;

    public AddShoeTypeDto() {
    }

    public AddShoeTypeDto(String shoeType, BigInteger shoeGender, Boolean age) {
        this.shoeType = shoeType;
        this.shoeGender = shoeGender;
        this.age = age;
    }

    public String getShoeType() {
        return shoeType;
    }

    public void setShoeType(String shoeType) {
        this.shoeType = shoeType;
    }

    public BigInteger getShoeGender() {
        return shoeGender;
    }

    public void setShoeGender(BigInteger shoeGender) {
        this.shoeGender = shoeGender;
    }

    public Boolean getAge() {
        return age;
    }

    public void setAge(Boolean age) {
        this.age = age;
    }
}
