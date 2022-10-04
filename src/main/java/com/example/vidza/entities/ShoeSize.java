package com.example.vidza.entities;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.List;

@Entity
public class ShoeSize {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    BigInteger id;
    @Column
    Integer shoeSize;

    @ManyToMany(mappedBy = "shoeSize")
    List<Shoe> shoes;

    public ShoeSize() {
    }

    public ShoeSize(Integer shoeSize) {
        this.shoeSize = shoeSize;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public Integer getShoeSize() {
        return shoeSize;
    }

    public void setShoeSize(Integer shoeSize) {
        this.shoeSize = shoeSize;
    }

    public List<Shoe> getShoes() {
        return shoes;
    }

    public void setShoes(List<Shoe> shoes) {
        this.shoes = shoes;
    }
}
