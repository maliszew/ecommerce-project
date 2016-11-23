package com.example.pom;

import org.openqa.selenium.phantomjs.PhantomJSDriver;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yoga2pro on 16/11/2016.
 */
public class CategoriesPOM {

    private PhantomJSDriver phantomjs;

    public void CategoriesPOM(PhantomJSDriver phantomjs) {
        this.phantomjs = phantomjs;
    }

    public Integer getCategoriesCount() {
        return 0;
    }

    public List<String> getListOfCategories() {
        return new ArrayList<String>();
    }


}
