package com.HW;
import com.github.javafaker.Faker;
import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class copy extends TestBase{
    @Test
   public void reservationTest() throws InterruptedException {
        driver.get("https://www.bluerentalcars.com/");
        driver.findElement(By.partialLinkText("Login")).click();
        driver.findElement(By.id("formBasicEmail")).sendKeys("xlsdfjhi@gmail.com");
        driver.findElement(By.id("formBasicPassword")).sendKeys("aaaaa");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        WebElement cars=driver.findElement(By.xpath("//*[@name='car']"));
        Select select=new Select(cars);
        select.selectByVisibleText("test");
        driver.findElement(By.xpath("//*[@name='pickUpLocation']")).sendKeys("Istanbul");
        driver.findElement(By.xpath("//*[@name='dropOfLocation']")).sendKeys("Ankara");
        driver.findElement(By.xpath("//*[@name='pickUpDate']")).sendKeys("01.11.2100");
        driver.findElement(By.xpath("//*[@name='pickUpTime']")).sendKeys("12:00");
        driver.findElement(By.xpath("//*[@name='dropOffDate']")).sendKeys("30.11.2100");
        driver.findElement(By.xpath("//*[@name='dropOffTime']")).sendKeys("12:00");
        driver.findElement(By.xpath("//*[@type='submit']")).click();
        Faker faker=new Faker();
       driver.findElement(By.name("cardNo")).sendKeys(Keys.HOME+faker.business().creditCardNumber());
       driver.findElement(By.name("nameOnCard")).sendKeys(Keys.HOME+faker.name().fullName());
       driver.findElement(By.name("expireDate")).sendKeys(Keys.HOME+faker.business().creditCardExpiry());
       driver.findElement(By.name("cvc")).sendKeys(Keys.HOME+faker.number().digits(3));
       driver.findElement(By.name("contract")).click();
       Thread.sleep(5);
       driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[3]/button[2]")).click();
       WebElement succesfullyReservation=driver.findElement(By.xpath("//*[@id=\"t9oijqvr4\"]/div[1]/div"));
       Assert.assertEquals("Reservation created successfully",succesfullyReservation.getText());

    }
}
