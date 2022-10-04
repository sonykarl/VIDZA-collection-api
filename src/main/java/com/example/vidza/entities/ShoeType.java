package com.example.vidza.entities;

import org.springframework.lang.Nullable;

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
    @Nullable
    String shoeTypePicture;

    @OneToOne
    ShoeGender shoeGender;

    @OneToMany(mappedBy = "shoeType")
    List<Shoe> shoe;

    @Column
    Boolean age;

    public ShoeType() {
    }

    public ShoeType(String shoeType, ShoeGender shoeGender, Boolean age) {
        this.shoeType = shoeType;
        this.shoeGender = shoeGender;
        this.age = age;
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

}
