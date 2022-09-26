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
    List<Integer> sizes;

    public Shoe(String description, List<Integer> sizes, BigInteger price, String type, String brand, String picture) {
        this.description = description;
        this.sizes = sizes;
        this.price = price;
        this.type = type;
        this.brand = brand;
        this.picture = picture;
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

    public List<Integer> getSizes() {
        return sizes;
    }

    public void setSizes(List<Integer> sizes) {
        this.sizes = sizes;
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

    @Column
    BigInteger price;

    @Column
    String type;

    @Column
    String  brand;

    @Column
    String picture;
}
