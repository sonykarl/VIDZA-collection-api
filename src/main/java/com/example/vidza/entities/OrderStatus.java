package com.example.vidza.entities;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
public class OrderStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    BigInteger id;

    @Column
    String status;
}
