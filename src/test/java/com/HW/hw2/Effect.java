package com.HW.hw2;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class Effect extends TestBase {
    @Test
    public void effectTest() throws InterruptedException {
        driver.get("https://jqueryui.com/toggle/");
        driver.switchTo().frame(0);

        String text=driver.findElement(By.xpath("//div[@id='effect']/p")).getText();

        System.out.println(text);
        driver.findElement(By.xpath("//*[@id='button']")).click();
        Thread.sleep(5000);
        String text1=driver.findElement(By.xpath("//div[@id='effect']/p")).getText();
        System.out.println(text1);
        Assert.assertTrue("NO TEXT",text1.isEmpty());
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id='button']")).click();
        String text2=driver.findElement(By.xpath("//div[@id='effect']/p")).getText();
        System.out.println(text2);
    }
}
