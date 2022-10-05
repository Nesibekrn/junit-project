package com.practice.practice04;

import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.List;

public class Q04 extends TestBase {
    //Go to https://testpages.herokuapp.com/styled/key-click-display-test.html
    //Click on "click me" given number of times.
    //Press space button same given number of times
    //Add all the 2 digit numbers in down buttons(down 32==> add all 32s)
    //Subtract the length of all click texts
public void clicks(int a){
    Actions actions=new Actions(driver);
    for (int i = 0; i <a ; i++) {
       actions.click(driver.findElement(By.id("button"))).perform();
    }
    for (int i = 0; i <a ; i++) {
       actions.sendKeys(Keys.SPACE).perform();
    }
}
    @Test
    public void mathTest() throws InterruptedException {
        driver.get("https://testpages.herokuapp.com/styled/key-click-display-test.html");
        clicks(5);
        Thread.sleep(2000);
        List<WebElement> down32=driver.findElements(By.xpath("//p[.=' down 32']"));
        int plusOf32=0;
        for (WebElement w:down32){
            String str=w.getText().replaceAll("[^0-9]","");
            plusOf32+=Integer.valueOf(str);
           }
        System.out.println("plusOf32 : "+plusOf32);
        List<WebElement> click=driver.findElements(By.xpath("//p[.='click']"));
        int length=0;
        for(WebElement w:click){
           length+=w.getText().length();
        }
        System.out.println("Lenght of clicks : "+length);
        int subtract=plusOf32-length;
        System.out.println("subtract is : "+subtract);



    }

//    @Test
//    public void test(){
//
//        //Go to https://testpages.herokuapp.com/styled/key-click-display-test.html
//        driver.get("https://testpages.herokuapp.com/styled/key-click-display-test.html");
//
//        //Click on "click me" given number of times.
//        WebElement clickMe = driver.findElement(By.id("button"));
//
//        int number = 50;
//
//        for(int i = 0; i<number; i++){
//            clickMe.click();
//        }
//        //Press space button same given number of times
//        Actions actions = new Actions(driver);
//        for(int i = 0; i<number; i++){
//
//            actions.sendKeys(Keys.SPACE).perform();
//        }
//        List<WebElement> clickList = driver.findElements(By.xpath("//p[.='click']"));
//
//        int sumOfLength = 0;
//        for(WebElement w : clickList){
//
//            sumOfLength += w.getText().length();
//        }
//        System.out.println("sumOfLength = " + sumOfLength);//
//
//        //Add all the 2 digit numbers in down buttons(down 32==> add all 32s)
//        List<WebElement> keyList = driver.findElements(By.xpath("//*[@id='events']/p"));
//
//        int sumOfNumbers = 0;
//        for(WebElement w : keyList){
//            String str = w.getText().replaceAll("[^0-9]","");
//            if(!str.equals("")){
//
//                sumOfNumbers += Integer.valueOf(str);
//            }
//        }
//        System.out.println("sumOfNumbers = " + sumOfNumbers);
//        //Subtract the length of all click texts
//        System.out.println("Difference: "+(sumOfNumbers/2-sumOfLength));
//    }
}
