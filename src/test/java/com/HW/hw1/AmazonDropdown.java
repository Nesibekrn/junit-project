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
/*
package com.myfirstproject.homework;
import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class AmazonDropdown extends TestBase {
    @Test
    public void dropdownTest(){
        driver.get("https://www.amazon.com/");
        WebElement dropdown = driver.findElement(By.xpath("//select[@aria-describedby='searchDropdownDescription']"));
        dropdown.click();

        Select options = new Select(dropdown);
//        Print the first selected option and assert if it equals “All Departments”
        Assert.assertEquals("All Departments",options.getFirstSelectedOption().getText());

//        Select the 3rd option by index (index of 2) and assert if the name is “Amazon Devices”.(after you
//        select you to need to use the get first selected option method)
        options.selectByIndex(2);
        Assert.assertEquals(options.getFirstSelectedOption().getText(),"Amazon Devices");

//        Print all of the dropdown options
        List<WebElement> allOptions =options.getOptions();
        for (WebElement eachOption:allOptions){
            System.out.println(eachOption.getText());
        }


//        Print the total number of options in the dropdown
        System.out.println("the size is : " + allOptions.size());

//        Check if Appliances is a drop-down option. Print true if “Appliances” is an option. Print false
//otherwise.
        boolean flag=false;
        for (WebElement each : allOptions) {
            if (each.getText().equals("Appliances")) {
                flag=true;
                break;
            }
        }
        if (flag){
            System.out.println("Appliances is an option TRUE");
        }else{
            System.out.println("Appliances is an option FALSE");
        }


        //BONUS: Check if the dropdown is in Alphabetical Order
        List<String> originalList  = new ArrayList<>();
        List<String> sortedList  = new ArrayList<>();
        for (WebElement each : allOptions) {
            originalList.add(each.getText());
            sortedList.add(each.getText());
        }
        Collections.sort(sortedList);

        String result = originalList.equals(sortedList)
                ? "The dropdown is in Alphabetical Order"
                : "The dropdown is NOT in Alphabetical Order";

        System.out.println("Result : "+result);
        System.out.println("Original List : "+originalList);
        System.out.println("Sorted List : "+sortedList);
    }

}
 */
