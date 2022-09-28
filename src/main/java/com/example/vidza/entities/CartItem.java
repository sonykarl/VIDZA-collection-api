package com.example.vidza.entities;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    BigInteger id;

    @OneToOne
    @JoinColumn(name = "")
    Shoe shoe;
}
