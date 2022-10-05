package com.practice.practice03;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

// Navigate to  https://testpages.herokuapp.com/styled/index.html
// Click on  Calculator under Micro Apps
// Type 9 in the first input
// Type 3 in the second input
// Click on Calculate
// Get the result
// Verify the result
// Print the result
// Do same process for each math operation on page.
public class Q06 extends TestBase {
    @Test
    public void calculatorTest() throws InterruptedException {
     driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
     driver.findElement(By.id("calculatetest")).click();
     driver.findElement(By.id("number1")).sendKeys("9");
     driver.findElement(By.id("number2")).sendKeys("3");
     driver.findElement(By.id("calculate")).click();
     String result=driver.findElement(By.id("answer")).getText();
     Assert.assertEquals("12",result);
     System.out.println(result);

        WebElement function=driver.findElement(By.id("function"));
        Select select=new Select(function);
        select.selectByIndex(1);
        driver.findElement(By.id("calculate")).click();
        String result1=driver.findElement(By.id("answer")).getText();
        Assert.assertEquals("27",result1);
        System.out.println(result1);

        WebElement function1=driver.findElement(By.id("function"));
        Select select1=new Select(function1);
        select1.selectByVisibleText("minus");
        driver.findElement(By.id("calculate")).click();
        String result2=driver.findElement(By.id("answer")).getText();
        Assert.assertEquals("6",result2);
        System.out.println(result2);

        WebElement function2=driver.findElement(By.id("function"));
        Select select2=new Select(function2);
        select2.selectByVisibleText("divide");
        driver.findElement(By.id("calculate")).click();
        String result3=driver.findElement(By.id("answer")).getText();
        Assert.assertEquals("3",result3);
        System.out.println(result3);
    }
}
