package com.HW.hw3;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/*Create a class:Synchronization2.
        Create a method: synchronization2
        Go to https://the-internet.herokuapp.com/dynamic_loading/2
        When user clicks on the Start button
        Then verify the ‘Hello World!’ Shows up on the screen*/
public class Synchronization2 extends TestBase {
    @Test
    public void syncronizeTest(){
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
        driver.findElement(By.xpath("//*[@id=\"start\"]/button")).click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement helloWorld=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='finish']/h4")));
        Assert.assertEquals("Hello World!",helloWorld.getText());
    }
}
