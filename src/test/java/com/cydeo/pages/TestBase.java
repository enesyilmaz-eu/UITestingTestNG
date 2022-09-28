package com.cydeo.pages;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    public WebDriver driver;

    @BeforeMethod
    public void setup(){
    driver= WebDriverFactory.getDriver("chrome");

    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
