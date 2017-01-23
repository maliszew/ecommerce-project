package com.example.responses;

import com.example.models.Products;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Yoga2pro on 10/26/2016.
 */
public class ProductResponse {

    public String title = "Hello world!!!!!";

    public List<String> names;

    public List<String> prices;

    public String products;

//    public void setJson(JsonObject json) {
//        this.json = json;
//    }
//
//    public JsonObject json;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrices(List<String> prices) {
        this.prices = prices;
    }

    public void setNames(List<String> names) {

        this.names = names;
    }
    public void setProducts(String p) { this.products = p; }
}
