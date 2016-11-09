package com.example.models;
import com.sun.javafx.beans.IDProperty;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import javax.swing.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="platnosci")
/**
 * Created by Yoga2pro on 11/9/2016.
 */
public class Platnosci {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    @NotNull
    private Integer suma;

    @NotNull
    private long numerZamowienia;

    @NotNull
    private String sposobPlatnosci;

    public Platnosci () {};

    public Platnosci(Integer suma, long numer, String sposob) {
        this.suma = suma;
        this.numerZamowienia = numer;
        this.sposobPlatnosci = sposob;
    }

    public Integer getSuma() {
        return suma;
    }

    public void setSuma(Integer suma) {
        this.suma = suma;
    }

    public String getSposobPlatnosci() {
        return sposobPlatnosci;
    }

    public void setSposobPlatnosci(String sposobPlatnosci) {
        this.sposobPlatnosci = sposobPlatnosci;
    }

    public long getNumerZamowienia() {

        return numerZamowienia;
    }

    public void setNumerZamowienia(long numerZamowienia) {
        this.numerZamowienia = numerZamowienia;
    }
}
