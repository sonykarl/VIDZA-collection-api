package com.example.vidza.entities;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.List;

@Entity
public class ShoePictures {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    BigInteger id;

    @OneToMany(mappedBy = "shoe_pictures")
    List<ShoePicture> shoePicture;
    @OneToOne
    Shoe shoe;

    @Column
    String coverPhoto;

    public ShoePictures() {
    }

    public ShoePictures( List<ShoePicture> shoePicture, Shoe shoe, String coverPhoto) {
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

    public List<ShoePicture> getShoePicture() {
        return shoePicture;
    }

    public void setShoePicture(List<ShoePicture> shoePicture) {
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
