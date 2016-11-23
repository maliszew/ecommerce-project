package com.example;

import com.example.pom.BasketPOM;
import com.example.pom.CategoriesPOM;
import org.junit.Test;

/**
 * Created by Yoga2pro on 16/11/2016.
 */
public class HappyPathTests {


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
}
