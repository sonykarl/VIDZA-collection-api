package com.example.vidza.features.store.inventory.dtos;

public class AddShoeGenderDto {
    private String gender;

    public AddShoeGenderDto(String gender) {
        this.gender = gender;
    }

    public AddShoeGenderDto() {
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
