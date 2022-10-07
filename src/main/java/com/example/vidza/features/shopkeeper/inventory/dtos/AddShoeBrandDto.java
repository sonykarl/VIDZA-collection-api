package com.example.vidza.features.shopkeeper.inventory.dtos;

public class AddShoeBrandDto {
    public String brandName;

    public AddShoeBrandDto() {
    }

    public AddShoeBrandDto(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}
