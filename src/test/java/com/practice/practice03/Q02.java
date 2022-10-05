package com.practice.practice03;
//Go to https://testpages.herokuapp.com/styled/drag-drop-javascript.html
//Drag yellow elements on the red elements below them
//Then verify they are dropped.
import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Q02 extends TestBase {
    @Test
    public void dropTest() throws InterruptedException {
        driver.get("https://testpages.herokuapp.com/styled/drag-drop-javascript.html");
        Actions actions=new Actions(driver);
        WebElement Drag1=driver.findElement(By.id("draggable1"));
        WebElement Drag2=driver.findElement(By.id("draggable2"));
        WebElement Drop1=driver.findElement(By.id("droppable1"));
        WebElement Drop2=driver.findElement(By.id("droppable2"));
        actions.dragAndDrop(Drag1,Drop1).perform();
        Thread.sleep(5000);
        actions.dragAndDrop(Drag2,Drop2).perform();
        Thread.sleep(5000);
        Assert.assertEquals("Dropped!",Drop1.getText());
        Assert.assertEquals("Dropped!",Drop2.getText());
    }
}
