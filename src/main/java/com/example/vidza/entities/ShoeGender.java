package com.example.vidza.entities;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
public class ShoeGender {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    BigInteger id;

    @Column
    String gender;

    public ShoeGender() {
    }

    public ShoeGender(String gender) {
        this.gender = gender;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
