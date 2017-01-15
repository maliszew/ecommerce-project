package com.example.patterns;

/**
 * Created by Yoga2pro on 14/12/2016.
 */
public class Singleton {

    private static Singleton instance = new Singleton(); //null; // mozemy stworzyc go tutaj, nie ma roznicy.

    // prywatny konstruktor
    private Singleton () {}

    public static synchronized Singleton getInstance() { // tylko jeden watek na raz moze korzystac z tej metody.
        //if(instance == null) {
        //    instance = new Singleton ();
        //}
        return instance;
    }

    // rozne metody ktore cos robia
}
