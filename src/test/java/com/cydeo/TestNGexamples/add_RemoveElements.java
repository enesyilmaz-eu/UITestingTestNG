package com.cydeo.TestNGexamples;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class add_RemoveElements {

    WebDriver driver;
    @Test
    public void test1(){
        driver=WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/add_remove_elements/");
        WebElement addElement=driver.findElement(By.xpath("//button[.='Add Element']"));
        addElement.click();
        WebElement DeleteElement=driver.findElement(By.xpath("//button[.='Delete']"));

        assertTrue(DeleteElement.isDisplayed());




    }
}
