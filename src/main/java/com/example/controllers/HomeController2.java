package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;
import java.util.Map;

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
}
