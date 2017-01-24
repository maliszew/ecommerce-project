package com.example;

import org.fluentlenium.adapter.FluentTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.assertEquals;

/**
 * Created by Yoga2pro on 10/26/2016.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DemoApplication.class)
@WebAppConfiguration
@IntegrationTest("server.port:8080")
public class AdminControllerWebDriverTest extends FluentTest {

    private WebDriver webDriver = new PhantomJSDriver();

    @Override
    public WebDriver getDefaultDriver() {
        return webDriver;
    }

    @Test
    public void testHome() {
        webDriver.get("http://localhost:8080/home");
        assertEquals(webDriver.findElement(By.id("przycisk")).getText(),"ładny przycisk"); // to jest asercja!!
    }


}
/*
Run/configuraion..
JUnit/home//.

VM options:
~ea
~Dphantomjs.binary.path ...........
* */
