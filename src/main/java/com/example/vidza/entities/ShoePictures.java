package com.example.vidza.entities;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
public class ShoePictures {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    BigInteger id;
    @Column
    String shoePicture;
    @ManyToOne
    @JoinColumn(name = "shoe_pictures")
    Shoe shoe;

    @Column
    String coverPhoto;

    public ShoePictures() {
    }

    public ShoePictures(BigInteger id, String shoePicture, Shoe shoe, String coverPhoto) {
        this.id = id;
        this.shoePicture = shoePicture;
        this.shoe = shoe;
        this.coverPhoto = coverPhoto;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getShoePicture() {
        return shoePicture;
    }

    public void setShoePicture(String shoePicture) {
        this.shoePicture = shoePicture;
    }

    public Shoe getShoe() {
        return shoe;
    }

    public void setShoe(Shoe shoe) {
        this.shoe = shoe;
    }

    public String getCoverPhoto() {
        return coverPhoto;
    }

    public void setCoverPhoto(String coverPhoto) {
        this.coverPhoto = coverPhoto;
    }
}
