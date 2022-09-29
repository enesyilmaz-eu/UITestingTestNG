package com.cydeo.TestNGexamples;

import com.cydeo.pages.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class DynamicWebTables extends TestBase {

    @Test
    public void Test_1(){

        driver.get("https://practice.cydeo.com/tables");
        // print out jason from row and cell number

        WebElement row3Cell2=driver.findElement(By.xpath("//table[@id='table1']//tbody//tr[3]//td[2]"));
        System.out.println("Before clicking first name: row3Cell2.getText() = " + row3Cell2.getText());

        WebElement firstName =driver.findElement(By.xpath("(//span[.='First Name'])[1]"));
        firstName.click();

        System.out.println("After clicking first name: row3Cell2.getText() = " + row3Cell2.getText());
         //print out the jason from text

        WebElement jasonCell=driver.findElement(By.xpath("//table[@id='table1']//td[.='Jason']"));
        System.out.println("jasonCell.getText() = " + jasonCell.getText());


        //print all the cells in row 3

        List<WebElement> allRow3Cells=driver.findElements(By.xpath("//table[@id='table1']//tbody//tr[3]//td"));

        for (WebElement eachCell:allRow3Cells){
            System.out.println("eachCell.getText() = " + eachCell.getText());
        }

    }


}
