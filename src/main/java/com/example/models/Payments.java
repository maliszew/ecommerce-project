package com.example.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="payments")
/**
 * Created by Yoga2pro on 11/9/2016.
 */
public class Payments {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    @NotNull
    private long userId;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @NotNull
    private double paymentSum;

    @NotNull
    private String paymentMethod;

    public Payments() {};

    public Payments(long nr, double sum, String way) {
        this.paymentSum = sum;
        this.paymentMethod = way;
        this.userId = nr;
    }

    public double getPaymentSum() {
        return paymentSum;
    }

    public void setPaymentSum(double sum) {
        this.paymentSum = sum;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String method) {
        this.paymentMethod = method;
    }

}
