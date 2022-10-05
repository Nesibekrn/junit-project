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
Create a class:Synchronization4. Create a method: isEnabled
Go to https://the-internet.herokuapp.com/dynamic_controls
Click enable Button
And verify the message is equal to “It's enabled!”
And verify the textbox is enabled (I can type in the box)
And click on Disable button
And verify the message is equal to “It's disabled!”
And verify the textbox is disabled (I cannot type in the box)
NOTE: .isEnabled(); is used to check if an element is enabled or not
*/
public class Synchronization4 extends TestBase {
    @Test
    public void enableTest(){
        isEnabled();
    }
    public void isEnabled(){
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        driver.findElement(By.xpath("//*[@id='input-example']/button")).click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement itsEnabled=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
        Assert.assertEquals("It's enabled!",itsEnabled.getText());
        boolean isEnabled=driver.findElement(By.xpath("//*[@id='input-example']/input")).isEnabled();
        Assert.assertEquals(true,isEnabled);
        driver.findElement(By.xpath("//*[@id='input-example']/button")).click();
        WebElement itsDisabled=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
        Assert.assertEquals("It's disabled!",itsDisabled.getText());
        boolean isDisabled=driver.findElement(By.xpath("//*[@id='input-example']/input")).isEnabled();
        Assert.assertEquals(false,isDisabled);
    }
}
