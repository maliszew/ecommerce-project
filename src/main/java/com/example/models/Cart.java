package com.example.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Yoga2pro on 15/1/2017.
 */
@Entity
@Table(name="cart")
public class Cart {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    @NotNull
    private long userId;

    @NotNull
    private long productId;

    public Cart(long userId, long productId) {
        this.userId = userId;
        this.productId = productId;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public long getUserId() {

        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }
}
