package com.practice.practice03;

import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

//Go to "http://webdriveruniversity.com/Popup-Alerts/index.html"
//Click on Ajax Loader
//Then click on "Click Me!" button.
//Take screenshot after each step.
public class Q05 extends TestBase {
    @Test
    public void screenshotTest() throws IOException, InterruptedException {
        driver.get("http://webdriveruniversity.com/Popup-Alerts/index.html");
        driver.findElement(By.id("button3")).click();
        Thread.sleep(6000);
        takeScreenShot();
        driver.findElement(By.id("button1")).click();
        Thread.sleep(3000);
        takeScreenShot();

    }
}
