package com.cydeo.TestNGexamples;

import com.cydeo.pages.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class dragAndDrop extends TestBase {

    @Test
    public void DragDrop(){

        driver.get("https://demos.teleferik.com/kendo-ui/dragdrop/index");
        WebElement smallCircle=driver.findElement(By.id("draggable"));
        WebElement bigCircle=driver.findElement(By.id("droptarget"));

        Actions actions=new Actions(driver);
        actions.dragAndDrop(smallCircle,bigCircle).perform();
    }


}
