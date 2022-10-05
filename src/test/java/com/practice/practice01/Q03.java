package com.practice.practice01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q03 {
    // go to url : https://www.techlistic.com/p/selenium-practice-form.html
    //fill the firstname
    //fill the lastname
    //check the gender
    //check the experience
    //fill the date
    //choose your profession -> Automation Tester
    //choose your tool -> Selenium Webdriver
    //choose your continent -> Antartica
    //choose your command  -> Browser Commands
    //click submit button
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
    }
    @After
    public void tearDown(){
        driver.quit();
    }
    @Test
    public void anketTest(){
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.findElement(By.id("cookieChoiceDismiss")).click();
        driver.findElement(By.name("firstname")).sendKeys("Nesibe");
        driver.findElement(By.name("lastname")).sendKeys("Karan");
        driver.findElement(By.id("sex-1")).click();
        driver.findElement(By.id("exp-3")).click();
        driver.findElement(By.id("datepicker")).sendKeys("22.08.2022");
        driver.findElement(By.id("profession-1")).click();
        driver.findElement(By.id("tool-2")).click();
        driver.findElement(By.id("continents")).sendKeys("Antartica");
        driver.findElement(By.xpath("//*[@id=\"selenium_commands\"]/option[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();




    }
}
