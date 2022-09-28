package com.example.vidza.entities;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.List;

@Entity
public class ShoeType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    BigInteger id;

    @Column
    String shoeType;

    @Column
    String shoeTypePicture;

    @OneToOne
    ShoeGender shoeGender;

    @OneToMany(mappedBy = "shoeType")
    List<Shoe> shoe;

    @Column
    Boolean age;

    public ShoeType() {
    }

    public ShoeType(BigInteger id, String shoeType, String shoeTypePicture, ShoeGender shoeGender, Boolean age, List<Shoe> shoe) {
        this.id = id;
        this.shoeType = shoeType;
        this.shoeTypePicture = shoeTypePicture;
        this.shoeGender = shoeGender;
        this.age = age;
        this.shoe = shoe;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getShoeType() {
        return shoeType;
    }

    public void setShoeType(String shoeType) {
        this.shoeType = shoeType;
    }

    public String getShoeTypePicture() {
        return shoeTypePicture;
    }

    public void setShoeTypePicture(String shoeTypePicture) {
        this.shoeTypePicture = shoeTypePicture;
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

    public List<Shoe> getShoe() {
        return shoe;
    }

    public void setShoe(List<Shoe> shoe) {
        this.shoe = shoe;
    }
}
