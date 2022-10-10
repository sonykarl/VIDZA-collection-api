package com.example.vidza.features.customer.store.dtos;

import org.springframework.web.multipart.MultipartFile;

import java.math.BigInteger;

public class DisplayShoeDto {
    private String shoe;
    private MultipartFile shoePicture;
    private BigInteger shoeId;

    public DisplayShoeDto() {
    }

    public DisplayShoeDto(String shoe, MultipartFile shoePicture, BigInteger shoeId) {
        this.shoe = shoe;
        this.shoePicture = shoePicture;
        this.shoeId = shoeId;
    }

    public String getShoe() {
        return shoe;
    }

    public void setShoe(String shoe) {
        this.shoe = shoe;
    }

    public MultipartFile getShoePicture() {
        return shoePicture;
    }

    public void setShoePicture(MultipartFile shoePicture) {
        this.shoePicture = shoePicture;
    }

    public BigInteger getShoeId() {
        return shoeId;
    }

    public void setShoeId(BigInteger shoeId) {
        this.shoeId = shoeId;
    }
}
