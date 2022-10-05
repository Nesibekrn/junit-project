package com.practice.practice04;
import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Q05 extends TestBase {
    //Go to https://testpages.herokuapp.com/styled/basic-html-form-test.html
    //Fill the username, password and textArea comment:
    //Choose a file and upload it
    //Select checkbox, radio item and dropdowns
    //Click on submit
    //Verify that uploaded file name is on the Form Details.

    @Test
    public void uploadTest() {
        driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html");
        driver.findElement(By.name("username")).sendKeys("sdrtfga");
        driver.findElement(By.name("password")).sendKeys("klasdkrjf");
        driver.findElement(By.name("comments")).clear();
        driver.findElement(By.name("comments")).sendKeys("Hadi yaaa!!!");
        driver.findElement(By.xpath("//input[@name='filename']")).sendKeys("C:\\Users\\hp\\Downloads\\ibrahim-tatlises-leylim-ley.mp3");

            if (!(driver.findElement(By.xpath("//input[@type='checkbox'][1]")).isSelected())) {
                driver.findElement(By.xpath("//input[@type='checkbox'][1]")).click();
            }
        if (!(driver.findElement(By.xpath("//input[@type='checkbox'][2]")).isSelected())) {
            driver.findElement(By.xpath("//input[@type='checkbox'][2]")).click();
        }
        if (!(driver.findElement(By.xpath("//input[@type='checkbox'][3]")).isSelected())) {
            driver.findElement(By.xpath("//input[@type='checkbox'][3]")).click();
        }
            if (!driver.findElement(By.xpath("//input[@type='radio'][2]")).isSelected()) {
                driver.findElement(By.xpath("//input[@type='radio'][2]")).click();
            }
                WebElement multipleSelect3 = driver.findElement(By.xpath("//option[@value='ms3']"));
                if (!multipleSelect3.isSelected()) {
                    multipleSelect3.click();
                }
                WebElement dropdown = driver.findElement(By.name("dropdown"));
                Select select = new Select(dropdown);
                select.selectByIndex(2);
                driver.findElement(By.xpath("//input[@name='submitbutton'][2]")).click();
               Assert.assertEquals("ibrahim-tatlises-leylim-ley.mp3", driver.findElement(By.id("_valuefilename")).getText());
            }


//    @Test
//    public void test(){
//
//        //Go to https://testpages.herokuapp.com/styled/basic-html-form-test.html
//        driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html");
//
//        //Fill the username, password and textArea comment:
//        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("John");
//        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1234");
//        WebElement commentBox = driver.findElement(By.xpath("//textarea[@name='comments']"));
//        commentBox.clear();
//        commentBox.sendKeys("Hello, this is my comment");
//
//
//        //Choose a file and upload it
//        String filePath = "C:/Users/TechPro/Desktop/image.png";
//        driver.findElement(By.xpath("//input[@name='filename']")).sendKeys(filePath);
//
//        //Select checkbox, radio item and dropdowns
//        WebElement checkBox1 = driver.findElement(By.xpath("(//input[@name='checkboxes[]'])[1]"));
//        WebElement checkBox2 = driver.findElement(By.xpath("(//input[@name='checkboxes[]'])[2]"));
//        WebElement checkBox3 = driver.findElement(By.xpath("(//input[@name='checkboxes[]'])[3]"));
//
//        if(!checkBox1.isSelected()){
//            checkBox1.click();
//        }
//        if (checkBox2.isSelected()){
//            checkBox2.click();
//        }
//        if(checkBox3.isSelected()){
//            checkBox3.click();
//        }
//
//        driver.findElement(By.xpath("(//input[@name='radioval'])[3]")).click();
//
//        driver.findElement(By.xpath("//option[@value='ms4']")).click();
//
//        WebElement dropDown = driver.findElement(By.xpath("//select[@name='dropdown']"));
//        Select select = new Select(dropDown);
//        select.selectByValue("dd1");
//        //Click on submit
//        driver.findElement(By.xpath("//input[@type='submit']")).click();
//
//        //Verify that uploaded file name is on the Form Details.
//        String fileName = driver.findElement(By.id("_valuefilename")).getText();
//
//        Assert.assertEquals("image.png",fileName);
//    }


}