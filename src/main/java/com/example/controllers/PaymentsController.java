package com.example.controllers;

import com.example.models.PaymentsDAO;
import com.example.responses.PlatnosciResponse;
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
public class PaymentsController {

    @RequestMapping(value = "/payments", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public PlatnosciResponse homespace() {
        // Payments superplatnosc = new Payments(1200, 12345, "PayPal");
        // platnosciDAO.save(superplatnosc);
        PlatnosciResponse response = new PlatnosciResponse();
        response.setTitle("Sample?? PaymentsController");
        return response;
    }

    @Autowired
    private PaymentsDAO paymentsDAO;
}
