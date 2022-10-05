package com.HW.hw1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;

public class iframeTest {
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();

    }
    @Test
    public void iframe() throws InterruptedException {
        driver.get("https://html.com/tags/iframe/");
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//*[@id=\"movie_player\"]/div[4]/button")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"movie_player\"]/div[26]/div[2]/div[1]/button")).click();

    }

}
