package com.example.vidza.entities;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.List;

@Entity
public class MyOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    BigInteger id;

    @OneToOne
    OrderStatus orderStatus;

    @OneToMany(mappedBy = "order")
    List<OrderItem> orderItems;

    @Column
    BigInteger price;

    public MyOrder() {
    }

    public MyOrder(BigInteger id, OrderStatus orderStatus, List<OrderItem> orderItems, BigInteger price) {
        this.id = id;
        this.orderStatus = orderStatus;
        this.orderItems = orderItems;
        this.price = price;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public BigInteger getPrice() {
        return price;
    }

    public void setPrice(BigInteger price) {
        this.price = price;
    }
}
