package com.example.controllers;

import com.example.models.ProductDAO;
import com.example.responses.ProductResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Yoga2pro on 15/1/2017.
 */
@RestController
public class ProductsController {
    @RequestMapping(value = "/products", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ProductResponse products() {
        ProductResponse response = new ProductResponse();
        return response;
    }

    @Autowired
    private ProductDAO productDAO;
}
