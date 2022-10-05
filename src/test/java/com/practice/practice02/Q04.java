package com.practice.practice02;

import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Q04 extends TestBase {
    // Go to URL : http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
    // Match the capitals by country.
    @Test
    public void countryTest(){
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        Actions dragDrop=new Actions(driver);
        WebElement washington=driver.findElement(By.id("box3"));
        WebElement usa=driver.findElement(By.id("box103"));
        dragDrop.dragAndDrop(washington,usa).perform();

        WebElement seoul=driver.findElement(By.id("box5"));
        WebElement southKorea=driver.findElement(By.id("box105"));
        dragDrop.dragAndDrop(seoul,southKorea).perform();

        WebElement madrit=driver.findElement(By.id("box7"));
        WebElement spain=driver.findElement(By.id("box107"));
        dragDrop.dragAndDrop(madrit,spain).perform();

        WebElement oslo=driver.findElement(By.id("box1"));
        WebElement norway=driver.findElement(By.id("box101"));
        dragDrop.dragAndDrop(oslo,norway).perform();

        WebElement stockholm=driver.findElement(By.id("box2"));
        WebElement sweden=driver.findElement(By.id("box102"));
        dragDrop.dragAndDrop(stockholm,sweden).perform();

        WebElement kopenhagen=driver.findElement(By.id("box4"));
        WebElement denmark=driver.findElement(By.id("box104"));
        dragDrop.dragAndDrop(kopenhagen,denmark).perform();

        WebElement rome=driver.findElement(By.id("box6"));
        WebElement italy=driver.findElement(By.id("box106"));
        dragDrop.dragAndDrop(rome,italy).perform();




    }
}
