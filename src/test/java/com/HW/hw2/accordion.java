package com.HW.hw2;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
/*
go to https://jqueryul.com/accordion/
click on section2
verify the test contains "Sed non urna."
 */
public class accordion extends TestBase {
    @Test
    public void section2Test() throws InterruptedException {
        driver.get("https://jqueryui.com/accordion/");
        driver.switchTo().frame(0);
        driver.findElement(By.id("ui-id-3")).click();
        String text=driver.findElement(By.xpath("//*[@id='ui-id-4']/p")).getText();
        Thread.sleep(3000);
        System.out.println(text);
       Thread.sleep(3000);
        Assert.assertTrue(text.contains("Sed non urna."));
    }
}
