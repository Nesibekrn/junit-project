package com.practice.practice01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q02 {
    // Create a new class under Q02
    // Set Path
    // Create chrome driver
    // Maximize the window
    // Open google home page https://www.google.com/.
    // Wait for 3 seconds
    // Go to the "https://www.amazon.com"
    // Get the title and URL of the page
    // Check if the title contains the word "Smile" print console "Title contains Smile" or "Title does not contain Smile"
    // Check if the URL contains the word "auto" print console "URL contains auto" or "URL does not contain auto"
    // Then go to "https://techproeducation.com/"
    // Get the title and check if it contains the word "site" and print "Title contains site" or "Title does not contain site"
    // Back to the previous webpage, https://www.amazon.com"
    // Refresh the page
    // Navigate to techproeducation.com
    // Wait for 3 seconds
    // Close the browser
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();
    }
    @After
    public void tearDown(){
        driver.quit();
    }
    @Test
    public void naviTest() throws InterruptedException {
        driver.get("https://www.google.com/");
        Thread.sleep(3000);
        driver.navigate().to("https://www.amazon.com/");
        String title=driver.getTitle();
        if (title.contains("Smile")){
            System.out.println("Title contains Smile");
        }else{
            System.out.println("Title does not contain Smile");
        }
        String url=driver.getCurrentUrl();
        if (url.contains("auto")){
            System.out.println("URL contains auto");
        }else{
            System.out.println("URL does not contain auto");
        }
        driver.navigate().to("https://techproeducation.com//");
        String title2=driver.getTitle();
        if (title2.contains("site")){
            System.out.println("Title2 contains site");
        }else{
            System.out.println("Title2 does not contain site");
        }
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
        Thread.sleep(3000);
    }
}
