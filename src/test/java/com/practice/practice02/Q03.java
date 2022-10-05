package com.practice.practice02;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Q03 extends TestBase {
/*
// go to amazon homepage
    // hover mouse over the hello,signIn element at the top right
    // Click on the "Create a list" link in the menu that opens
    // and verify that title is equal to "Your List"
 */

@Test
    public void actionsTest(){
    driver.get("https://www.amazon.com");
    Actions mouseOver=new Actions(driver);
    WebElement signIn=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
    mouseOver.moveToElement(signIn).perform();
    driver.findElement(By.linkText("Create a List")).click();
    String actualTitle=driver.findElement(By.xpath("//*[@id=\"my-lists-tab\"]/a/div")).getText();
    String expectetTitle="Your Lists";
    Assert.assertEquals(expectetTitle,actualTitle);

}
}
