package com.HW.hw2;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class AddElement extends TestBase {

    public void add(int i) {
        WebElement addButton = driver.findElement(By.xpath("//*[@id='content']/div/button"));
        for (int j = 0; j < i; j++) {
            addButton.click();
        }
    }
    public void delete(int i) throws InterruptedException {
        List<WebElement> deletesFirst=driver.findElements(By.xpath("//*[@id='elements']/button"));
        System.out.println("after adding : "+deletesFirst.size());
        for (int j = 0; j <i ; j++) {
            deletesFirst.get(j).click();
        }
        List <WebElement> deletesSecond=driver.findElements(By.xpath("//*[@id='elements']/button"));
        System.out.println("after deleting : "+deletesSecond.size());
        Assert.assertEquals((deletesFirst.size()-deletesSecond.size()),i);
   }
    @Test
    public void buttonTest() throws InterruptedException {
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
        add(10);
        Thread.sleep(5000);
        delete(5);
        Thread.sleep(5000);
    }


}