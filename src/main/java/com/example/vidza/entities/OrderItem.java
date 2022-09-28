package com.example.vidza.entities;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    BigInteger id;

    @OneToOne
    @JoinColumn(name = "shoe_id")
    Shoe shoe;

    @ManyToOne
    @JoinColumn(name = "my_order")
    MyOrder order;

    public OrderItem() {
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public Shoe getShoe() {
        return shoe;
    }

    public void setShoe(Shoe shoe) {
        this.shoe = shoe;
    }

    public MyOrder getOrder() {
        return order;
    }

    public void setOrder(MyOrder order) {
        this.order = order;
    }
}
