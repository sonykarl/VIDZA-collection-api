package com.example.vidza.features.store.inventory.dtos;

import com.example.vidza.entities.ShoeGender;

public class AddShoeTypeDto {
    private String shoeType;
    private ShoeGender shoeGender;
    private Boolean age;

    public AddShoeTypeDto(String shoeType, ShoeGender shoeGender, Boolean age) {
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

    public ShoeGender getShoeGender() {
        return shoeGender;
    }

    public void setShoeGender(ShoeGender shoeGender) {
        this.shoeGender = shoeGender;
    }

    public Boolean getAge() {
        return age;
    }

    public void setAge(Boolean age) {
        this.age = age;
    }
}
