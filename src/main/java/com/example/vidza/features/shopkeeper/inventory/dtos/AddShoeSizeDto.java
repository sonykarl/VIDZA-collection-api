package com.example.vidza.features.shopkeeper.inventory.dtos;

public class AddShoeSizeDto {
    int shoeSize;

    public AddShoeSizeDto(int shoeSize) {
        this.shoeSize = shoeSize;
    }

    public int getShoeSize() {
        return shoeSize;
    }

    public void setShoeSize(int shoeSize) {
        this.shoeSize = shoeSize;
    }
}
