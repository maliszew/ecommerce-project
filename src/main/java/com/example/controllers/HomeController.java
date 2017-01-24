package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;
import java.util.Map;

/**
 * Created by Yoga2pro on 10/26/2016.
 */
@Controller
public class HomeController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String main(Map<String,Object> template) {
        Date date = new Date();
        template.put("time", date.toString());
        return "mainTemplate";
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public String home(Map<String,Object> template) {
        return "productsTemplate";
    }

    @RequestMapping(value = "/show/{id}", method = RequestMethod.GET)
    public String oneProduct (Map<String,Object> template, @PathVariable("id") long id){
        // template.put("prodId", id);
        return "oneProductTemplate";
    }
}
