package com.example.controllers;

        import com.example.models.Products;
        import com.example.models.ProductsDAO;
        import com.example.responses.ProductResponse;
        import com.gargoylesoftware.htmlunit.javascript.host.fetch.Response;
        import com.google.gson.Gson;
        import com.google.gson.JsonArray;
        import com.google.gson.JsonElement;
        import com.google.gson.JsonObject;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.http.HttpStatus;
        import org.springframework.http.MediaType;
        import org.springframework.http.ResponseEntity;
        import org.springframework.web.bind.annotation.*;

        import java.util.Collection;

/**
 * Created by Yoga2pro on 15/1/2017.
 */
@RestController
public class ProductsController {
    @RequestMapping(value = "/products", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> products() {
        Iterable<Products> prod = productsDAO.findAll();
        Gson gson = new Gson();
        JsonElement element = gson.toJsonTree(prod);
        // JsonArray jsonArray = element.getAsJsonArray();
        JsonObject jsonObj = new JsonObject();
        jsonObj.add("allProducts", element);
        String json = jsonObj.toString();
        // System.out.println("------" + jsonObj + "\n" + jsonArray + "\n" + json);
        return new ResponseEntity<String>(json, HttpStatus.OK);
    }

    @RequestMapping(value = "/products/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> oneProduct(@PathVariable("id") long id) {
        Products prod = productsDAO.findOne(id);
        if(prod == null) {
            return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
        }
        Gson gson = new Gson();
        String json = gson.toJson(prod);
        return new ResponseEntity<String>(json, HttpStatus.OK);
    }

    @Autowired
    private ProductsDAO productsDAO;
}
