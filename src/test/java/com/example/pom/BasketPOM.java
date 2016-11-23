package com.example.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yoga2pro on 16/11/2016.
 */
public class BasketPOM {

    private PhantomJSDriver phantomjs;

    public void BasketPOM(PhantomJSDriver phantomjs) {
        this.phantomjs = phantomjs; // ???
    }

    public Integer getListItemsCount() {
        this.phantomjs.findElementByXPath("//").getText(); // np. mamy checkbox - sprawdzamy czy jest selected, itd. rozne metody ktore mozna wykorzystac

        return this.phantomjs.findElementsByCssSelector(".basket li").size(); // zwroci liczbe elementow w liscie o ID .basket

        //return 0;
    }

    //WebElement link23;
    //link23.getAttribute("href");

    public Float getSuma() {
        String s = this.phantomjs.findElementByCssSelector(".ceny suma").getText();
        Float f = Float.parseFloat(s);
        return f;
    }

    // itd... TBD

    public List<String> getListOfBasketItems() { // ... czy po Xpath, czy  po id, lecimy tak dalej. dzialamy po DOMie
        return new ArrayList<String>();
    }

    public void goToCheckout() {
        this.phantomjs.findElement(By.id("checkoutbutton")).click();
    }
}
