package com.example.controllers;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.facebook.api.Facebook;

import javax.inject.Inject;
import java.util.Date;
import java.util.Map;

/**
 * Created by Yoga2pro on 10/26/2016.
 */
@Controller
@RequestMapping("/")
public class HomeController {
//    private Facebook facebook;
//     private ConnectionRepository connectionRepository;

//    @SuppressWarnings("SpringJavaAutowiringInspection")
//    @Inject
//    public HomeController(Facebook facebook, ConnectionRepository connectionRepository) {
//        this.facebook = facebook;
//        this.connectionRepository = connectionRepository;
//    }

    // @RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public String mainPage(Map<String,Object> template, Model model) {
        Date date = new Date();
        template.put("time", date.toString());

//        if (!facebook.isAuthorized()) {
//            return "redirect:/connect/facebook";
//        }

//        if (connectionRepository.findPrimaryConnection(Facebook.class) == null) {
//            return "redirect:/connect/facebook";
//        }
//
//        model.addAttribute("facebookProfile", facebook.userOperations().getUserProfile());
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
