package com.example.vidza.entities;

import org.springframework.lang.Nullable;

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
    @Nullable
    String brandLogo;

    @OneToMany(mappedBy = "brand")
    List<Shoe> shoe;

    public Brand() {
    }

    public Brand( String brandName) {
        this.brandName = brandName;
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
