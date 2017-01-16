package com.example.controllers;

import com.example.models.Payments;
import com.example.models.PaymentsDAO;
import com.example.models.ProductsDAO;
import com.example.models.Products;
import com.example.responses.ProductResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.http.MediaType;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Yoga2pro on 10/26/2016.
 * kontroler restowy.
 * value = "/" -> routing glowny na localhost. produces -> co bedzie wyprodukowane w returnie. wyrzucamy jsona.
 * response body: np. ustawiamy pole Title response'a na Sample. mozna miec oczywiscie wiecej pol...
 * Product to model. zapisujemy do bazy danych obiekt Product o trzech atrybutach.
 */
@RestController
@EnableOAuth2Sso
public class HomeController extends WebSecurityConfigurerAdapter
{

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ProductResponse homespace() {
        // Products product = new Products("sample title", "sample description", 12345);
        // productDAO.save(product);
        ProductResponse response = new ProductResponse();
        // String fszystkie = productDAO.findAll();
        String fszystkie = "";
        int i = 0;
        for(Products p : productsDAO.findAll()) {
            fszystkie += i++ + " " +  p.getTitle() + ", ";
        }
        System.out.println(fszystkie);
        response.setTitle("Sample? Home(Product)Controller " + fszystkie);
        // response.
        return response;
    }

    @RequestMapping(value = "/restart", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ProductResponse restart() {
        productsDAO.deleteAll();
        paymentsDAO.deleteAll();

        productsDAO.save(new Products("title1", "desc1", 50.12));
        productsDAO.save(new Products("title2", "desc2", 6.9));
        paymentsDAO.save(new Payments(1001, 125.34, "PayPal"));
        paymentsDAO.save(new Payments(1002, 21.37, "MasterCard"));

        String fszystkie = "";
        int i = 0;
        for(Products p : productsDAO.findAll()) {
            fszystkie += i++ + " " +  p.getTitle() + ", ";
        }
        ProductResponse response = new ProductResponse();
        response.setTitle("Wszystkie produkty: " + fszystkie);
        return response;
    }

    @Autowired
    private ProductsDAO productsDAO;

    @Autowired
    private PaymentsDAO paymentsDAO;
}
