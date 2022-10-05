package com.practice.practice03;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Go to http://webdriveruniversity.com/To-Do-List/index.html
//Add todos: (Prepare breakfast, Wash the dishes, Take care of baby, Help your kid's homework, Study Selenium, Sleep)
//Strikethrough all todos.
//Delete all todos.
//Verify that all todos deleted.
public class Q04 extends TestBase {
    @Test
    public void todosTest() throws InterruptedException {
        Actions actions=new Actions(driver);
        driver.get("http://webdriveruniversity.com/To-Do-List/index.html");
        WebElement todoBox=driver.findElement(By.xpath(" //*[@type=\"text\"]"));
        List<String>todo=new ArrayList<>(Arrays.asList("Prepare breakfast","Wash the dishes","Take care of baby","Help your kid's homework","Study Selenium","Sleep"));
        for (String w:todo){
           actions.click(todoBox).sendKeys(w).sendKeys(Keys.ENTER).perform();
        }

//        todoBox.sendKeys("Prepare breakfast");
//        actions.sendKeys(Keys.ENTER).perform();
//        todoBox.sendKeys("Wash the dishes");
//        actions.sendKeys(Keys.ENTER).perform();
//        todoBox.sendKeys("Take care of baby");
//        actions.sendKeys(Keys.ENTER).perform();
//        todoBox.sendKeys("Help your kid's homework");
//        actions.sendKeys(Keys.ENTER).perform();
//        todoBox.sendKeys("Study Selenium");
//        actions.sendKeys(Keys.ENTER).perform();
//        todoBox.sendKeys("Sleep");
//        actions.sendKeys(Keys.ENTER).perform();

        List<WebElement> todos=driver.findElements(By.xpath("//*[@id=\"container\"]/ul/li"));
        for (WebElement w:todos){
            w.click();
        }
        List<WebElement> deleteTodos=driver.findElements(By.xpath("//*[@id=\"container\"]/ul/li/span/i"));
        for (WebElement w:deleteTodos) {
            w.click();
        }
        Thread.sleep(3000);
        List<WebElement> todos2=driver.findElements(By.xpath("//*[@id=\"container\"]/ul/li"));
        Assert.assertEquals(0,todos2.size());

    }
}
