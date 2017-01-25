package com.example;

import com.example.pom.BasketPOM;
import com.example.pom.CategoriesPOM;
import com.example.pom.HomePOM;
import com.example.pom.ProductsPOM;
import org.fluentlenium.adapter.FluentTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.assertEquals;

/**
 * Created by Yoga2pro on 16/11/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DemoApplication.class)
@WebAppConfiguration
@IntegrationTest("server.port:8080")
public class HappyPathTests extends FluentTest {
    private WebDriver webDriver = new PhantomJSDriver();

    @Override
    public WebDriver getDefaultDriver() {
        return webDriver;
    }

//    private void openPage() {
//        HomePOM homePage = new HomePOM();
//        homePage.getHeader();
//        homePage.getMenu();
//    }

    @Test
    public void checkHomeIsLoaded() {
        webDriver.get("http://localhost:8080/");
        HomePOM home = new HomePOM();
        assertEquals(home.getMenu(), 3);
        assertEquals(home.getHeader(), "Online Store");
    }

    @Test
    public void checkProducts() {
        webDriver.get("http://localhost:8080/");
        ProductsPOM prod = new ProductsPOM();
        assertEquals(prod.getProdutsCount(), 3);
        assertEquals(prod.isDesc(), true);
    }

}
/*

    private void pathToBasket(String productName, String categoryName) {
        homePage = new HomePOM(); // stworzyc sobie POMy jako private zeby nie tworzyc nowej instancji za kazdym razem
        homePage.selectCategory("Spodnie");
        categoriesPage = new CategoriesPOM();
        categoriesPages.selectProduct("Jeans");
        productPage = new ProductPOM();
        productPage.addToBasket();
    }

    @Test
    public void checkBasketItemPositivte() {
        // kod funkcji wyzej byl tu, ale chcemy go wykorzystywac czesciej wiec mamy funkcje...
        BasketPOM basketPage = new BasketPOM(this.webDriver);
        assertEquals(baskedPage.getListItemsCount(), 1); // jak zwroci jeden element to jest ok. to jest nasz test.
    }
    */

