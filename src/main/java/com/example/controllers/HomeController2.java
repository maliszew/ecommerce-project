package com.example.controllers;

import com.example.models.Products;
import com.example.models.ProductsDAO;
import com.example.responses.ProductResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.google.gson.Gson;

/**
 * Created by Yoga2pro on 10/26/2016.
 */
@Controller
public class HomeController2 {
    @GetMapping("/home")
    public String home(Map<String,Object> template) {
        template.put("time", new Date());

        return "products";
    }

    @Autowired
    private ProductsDAO productsDAO;
}
