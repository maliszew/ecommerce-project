package com.example.models;
import com.sun.javafx.beans.IDProperty;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import javax.swing.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="products")
/**
 * Created by Yoga2pro on 10/26/2016.
 */
public class Products {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    @NotNull
    private String title;

    @NotNull
    private String description;

    @NotNull
    private double price;

    public Products() {};

    public Products(String title, String description, double price) {
        this.title = title;
        this.description = description;
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {

        this.description = description;
    }

    public double getPrice() {

        return price;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public String getDescription() {

        return description;
    }

    public String getTitle() {

        return title;
    }
}
