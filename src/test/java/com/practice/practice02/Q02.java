package com.practice.practice02;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class Q02 extends TestBase {
    // 1. Go to "http://webdriveruniversity.com/Popup-Alerts/index.html"
    // 2. Click "CLICK ME" of JavaScript Alert
    // 3. Get the pop-up text
    // 4. Verify that message is "I am an alert box!"
    // 5. Accept pop-up
    @Test
    public void alertTest(){
        driver.get("http://webdriveruniversity.com/Popup-Alerts/index.html");
        driver.findElement(By.xpath("//*[@id=\"button1\"]/p")).click();
       // driver.findElement(By.id("button1")).click();
        String text=driver.switchTo().alert().getText();
        Assert.assertEquals("I am an alert box!",text);
        driver.switchTo().alert().accept();
    }
}
