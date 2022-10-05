package com.HW.hw1;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class AmazonDropdown extends TestBase {
    @Test
    public void dropdownTest(){
        driver.get("https://www.amazon.com/");

         WebElement all= driver.findElement(By.id("searchDropdownBox"));
         all.click();

        Select select=new Select(all);
        String firstOption=select.getFirstSelectedOption().getText();
        System.out.println(firstOption);
        Assert.assertEquals("All Departments",firstOption);

        select.selectByIndex(3);
        String forthOption=select.getFirstSelectedOption().getText();
    //    Assert.assertEquals("Amazon Devices",forthOption);

        List<WebElement> allOptions1=select.getOptions();
        System.out.println("ALL OPTIONS : ");
        for (WebElement eachOption:allOptions1){
            System.out.println(eachOption.getText());
        }

        int numberOfOptions=allOptions1.size();
        System.out.println("Number Of Options : "+numberOfOptions);

        if (allOptions1.contains("Appliances")){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

        LinkedList<WebElement> allOptions2= new LinkedList<>();
        allOptions2.addAll(allOptions1);
        Assert.assertEquals(allOptions1,allOptions2);
        }
}
