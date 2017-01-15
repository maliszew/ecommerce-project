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
    private double paymentSum;

    @NotNull
    private long orderNumber;

    @NotNull
    private String paymentMethod;

    public Payments() {};

    public Payments(long nr, double sum, String way) {
        this.paymentSum = sum;
        this.orderNumber = nr;
        this.paymentMethod = way;
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

    public long getOrderNumber() {

        return orderNumber;
    }

    public void setOrderNumber(long nr) {
        this.orderNumber = nr;
    }
}
