package com.example.vidza.entities;

import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.List;

@Entity
public class Shoe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    BigInteger id;

    @Column
    String description;

    @ManyToMany
    @JoinColumn(name = "shoe_sizes")
    List<ShoeSize> shoeSize;

    @OneToMany(mappedBy = "shoe")
    @Nullable
    List<ShoePictures> pictures;

    @Column
    BigInteger price;

    @ManyToOne
    @JoinColumn(name = "shoe_type")
    ShoeType shoeType;


    @ManyToOne
    @JoinColumn(name = "brand")
    Brand  brand;

    public Shoe() {
    }

    public Shoe(BigInteger id, String description, List<ShoeSize> shoeSize, List<ShoePictures> pictures, BigInteger price, ShoeType shoeType, Brand brand) {
        this.id = id;
        this.description = description;
        this.shoeSize = shoeSize;
        this.pictures = pictures;
        this.price = price;
        this.shoeType = shoeType;
        this.brand = brand;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<ShoeSize> getShoeSize() {
        return shoeSize;
    }

    public void setShoeSize(List<ShoeSize> shoeSize) {
        this.shoeSize = shoeSize;
    }

    public List<ShoePictures> getPictures() {
        return pictures;
    }

    public void setPictures(List<ShoePictures> pictures) {
        this.pictures = pictures;
    }

    public BigInteger getPrice() {
        return price;
    }

    public void setPrice(BigInteger price) {
        this.price = price;
    }

    public ShoeType getShoeType() {
        return shoeType;
    }

    public void setShoeType(ShoeType shoeType) {
        this.shoeType = shoeType;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
}
