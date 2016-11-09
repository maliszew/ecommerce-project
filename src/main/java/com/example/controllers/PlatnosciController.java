package com.example.controllers;

import com.example.models.Platnosci;
import com.example.models.PlatnosciDAO;
import com.example.responses.PlatnosciResponse;
import com.example.responses.ProductResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Yoga2pro on 11/9/2016.
 */
@RestController
public class PlatnosciController {

    @RequestMapping(value = "/platnosci", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public PlatnosciResponse homespace() {
        Platnosci superplatnosc = new Platnosci(1200, 12345, "PayPal");
        platnosciDAO.save(superplatnosc);
        PlatnosciResponse response = new PlatnosciResponse();
        response.setTitle("Sample?? PlatnosciController");
        return response;
    }

    @Autowired
    private PlatnosciDAO platnosciDAO;
}
