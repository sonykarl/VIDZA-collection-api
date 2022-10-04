package com.example.vidza.features.store.inventory.dtos;

public class AddShoeDto {
    String name;

    public AddShoeDto() {
    }

    public AddShoeDto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
