package com.practice.practice04;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Q01 extends TestBase {

    //Go to https://testpages.herokuapp.com/styled/challenges/growing-clickable.html
    //Click on "click me" button
    //Verify that "Event Triggered"

    @Test
    public void test() throws InterruptedException {
        driver.get("https://testpages.herokuapp.com/styled/challenges/growing-clickable.html");
        WebElement clickButton = driver.findElement(By.id("growbutton"));
        Thread.sleep(4000);
        clickButton.click();
        String eventTriggered = driver.findElement(By.id("growbuttonstatus")).getText();
        Assert.assertEquals("Event Triggered",eventTriggered);

    }
}
