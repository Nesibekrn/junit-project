package com.AnswersOfHW.hw2;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class addElement extends TestBase {
    /*

Go to http://the-internet.herokuapp.com/add_remove_elements/
click on the "Add Element" button 100 times
write a method that takes a number, and clicks the "Delete" button given number of times,
and then validates that given number of buttons were deleted

  */
    @Test
    public void test() {

        //Go to http://the-internet.herokuapp.com/add_remove_elements/
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");

        //click on the "Add Element" button 100 times
        createButton(100);
        deleteButtonAndValidate(20);

    }


    public void createButton(int number) {

        WebElement addButton = driver.findElement(By.xpath("//div[@id='content']/div/button"));

        for (int i = 0; i < number; i++) {
            addButton.click();
        }
    }

    //write a method that takes a number, and clicks the "Delete" button given number of times
    public void deleteButtonAndValidate(int numberOfDelete) {
        List<WebElement> deleteButtonsBefore = driver.findElements(By.xpath("//*[@id='elements']/button"));
        int sizeBeforeDelete = deleteButtonsBefore.size();
        System.out.println("sizeBeforeDelete = " + sizeBeforeDelete);

        for (int i = 0; i < numberOfDelete; i++) {

            deleteButtonsBefore.get(i).click();

        }

        List<WebElement> deleteButtonsAfter = driver.findElements(By.xpath("//*[@id='elements']/button"));

        int sizeAfterDelete = deleteButtonsAfter.size();

        System.out.println("sizeAfterDelete = " + sizeAfterDelete);

        Assert.assertEquals(sizeBeforeDelete, sizeAfterDelete + numberOfDelete);
    }
}