package com.HW.hw3;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/*
Create a class:Synchronization3. Create a method: synchronization1
Go to https://the-internet.herokuapp.com/dynamic_controls
Click on remove button
And verify the message is equal to “It's gone!”
Then click on Add button
And verify the message is equal to “It's back!”
 */
public class Synchronization3 extends TestBase {
    @Test
    public void syncTest(){
        synchronization1();
    }
    public void synchronization1(){
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        driver.findElement(By.xpath("//*[@id='checkbox-example']/button")).click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement itsGone=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
        Assert.assertEquals("It's gone!",itsGone.getText());
        driver.findElement(By.xpath("//*[@id='checkbox-example']/button")).click();
        WebElement itsBack=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
    }
}
