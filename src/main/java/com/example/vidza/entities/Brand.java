package com.example.vidza.entities;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.List;

@Entity
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    BigInteger id;

    @Column
    String brandName;

    @Column
    String brandLogo;

    @OneToMany(mappedBy = "brand")
    List<Shoe> shoe;

    public Brand() {
    }

    public Brand(BigInteger id, String brandName, String brandLogo, List<Shoe> shoe) {
        this.id = id;
        this.brandName = brandName;
        this.brandLogo = brandLogo;
        this.shoe = shoe;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandLogo() {
        return brandLogo;
    }

    public void setBrandLogo(String brandLogo) {
        this.brandLogo = brandLogo;
    }

    public List<Shoe> getShoe() {
        return shoe;
    }

    public void setShoe(List<Shoe> shoe) {
        this.shoe = shoe;
    }
}
