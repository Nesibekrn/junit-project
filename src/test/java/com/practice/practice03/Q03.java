package com.practice.practice03;
/*
 * Navigate to  https://www.saucedemo.com/
 * Enter the username  as "standard_user"
 * Enter the password as   "secret_sauce"
 * Click on login button
 * Order products by "Price (low to high)"
 * Verify that last product costs $49.99, first product costs $7.99.
 */
import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
public class Q03 extends TestBase {
    @Test
    public void orderTest() throws InterruptedException {
        driver.navigate().to("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        WebElement sort=driver.findElement(By.className("product_sort_container"));
        sort.click();
//        Actions actions=new Actions(driver);
//        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
        Select select=new Select(sort);
        select.selectByIndex(2);
        List<WebElement>prices=driver.findElements(By.className("inventory_item_price"));
        Assert.assertEquals("$7.99",prices.get(0).getText());
        Assert.assertEquals("$49.99",prices.get(prices.size()-1).getText());
    }

}
