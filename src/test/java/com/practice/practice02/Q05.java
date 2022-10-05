package com.practice.practice02;

import com.github.javafaker.Faker;
import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Q05 extends TestBase {
    //Signup For Facebook by using Actions class
    //Go to Facebook
    //Click on Create New Account
    //fill all the boxes by using keyboard actions
    @Test
    public void facebookTest(){
        driver.get("https://facebook.com");
        driver.findElement(By.linkText("Yeni Hesap Oluştur")).click();
        Faker faker=new Faker();
        Actions tab=new Actions(driver);
        WebElement firstNameBox=driver.findElement(By.name("firstname"));
        String psw=faker.number().digits(6);
        String email=faker.internet().emailAddress();
        tab.click(firstNameBox).sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB).sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB).sendKeys(email)
                .sendKeys(Keys.TAB).sendKeys(email)
                .sendKeys(Keys.TAB).sendKeys(psw)
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("13")
                .sendKeys(Keys.TAB).sendKeys("Aug")
                .sendKeys(Keys.TAB).sendKeys("2000")
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ARROW_RIGHT).sendKeys(Keys.ARROW_LEFT)
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER)
                .perform();




    }
}
