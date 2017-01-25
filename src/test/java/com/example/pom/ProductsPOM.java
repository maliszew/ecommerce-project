package com.example.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

/**
 * Created by Yoga2pro on 25/1/2017.
 */
public class ProductsPOM {
    private PhantomJSDriver phantomjs;

    public void ProductsPOM(PhantomJSDriver phantomjs) {
        this.phantomjs = phantomjs;
    }

    public long getProdutsCount() {
        return this.phantomjs.findElementsByClassName("nav navbar-nav").size();
    }

    public void clickItem() {
        this.phantomjs.findElement(By.linkText("title1")).click();
    }

    public boolean isDesc() {
        return this.phantomjs.findElementByClassName("panel-body").isDisplayed();
    }
}
