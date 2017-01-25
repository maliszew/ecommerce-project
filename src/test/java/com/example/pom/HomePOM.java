package com.example.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by Yoga2pro on 25/1/2017.
 */
public class HomePOM {
    private PhantomJSDriver phantomjs;

    public void HomePOM(PhantomJSDriver phantomjs) {
        this.phantomjs = phantomjs;
    }

    public String getHeader() {
        return this.phantomjs.findElementById("siteHeader").getText();
    }

    public long getMenu() {
        return this.phantomjs.findElementsByClassName("nav navbar-nav").size();
    }


}


