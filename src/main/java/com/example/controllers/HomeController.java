package com.example.controllers;

import com.example.models.ProductDAO;
import com.example.models.Products;
import com.example.responses.ProductResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
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
public class HomeController
{

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ProductResponse homespace() {
        Products product = new Products("sample title", "sample description", 12345);
        productDAO.save(product);
        ProductResponse response = new ProductResponse();
        response.setTitle("Sample? Home(Product)Controller");
        return response;
    }

    @Autowired
    private ProductDAO productDAO;
}
