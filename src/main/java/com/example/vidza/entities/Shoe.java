package com.example.vidza.entities;

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
    List<Integer> shoeSize;

    @ManyToMany
    List<String> pictures;

    @Column
    BigInteger price;

    @Column
    String type;

    @Column
    String  brand;

    @Column
    String picture;

    public Shoe(String description, List<Integer> shoeSize, List<String> pictures, BigInteger price, String type, String brand, String picture) {
        this.description = description;
        this.shoeSize = shoeSize;
        this.pictures = pictures;
        this.price = price;
        this.type = type;
        this.brand = brand;
        this.picture = picture;
    }

    public Shoe() {
    }

    public BigInteger getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Integer> getShoeSize() {
        return shoeSize;
    }

    public void setShoeSize(List<Integer> shoeSize) {
        this.shoeSize = shoeSize;
    }

    public List<String> getPictures() {
        return pictures;
    }

    public void setPictures(List<String> pictures) {
        this.pictures = pictures;
    }

    public BigInteger getPrice() {
        return price;
    }

    public void setPrice(BigInteger price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
