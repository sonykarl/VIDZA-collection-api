package com.example.vidza.entities;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
public class ShoePicture {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private BigInteger id;
    @Column
    private String picture;

    @ManyToOne
    @JoinColumn(name = "shoe_pics")
    private ShoePictures shoe_pics;

    public ShoePicture() {
    }

    public ShoePicture( String picture) {
        this.picture = picture;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
