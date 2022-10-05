package com.HW.hw2;

import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;

import java.text.SimpleDateFormat;

public class Date extends TestBase {
    @Test
    public void dateTest(){
        driver.get("https://jqueryui.com/datepicker/");
        driver.switchTo().frame(0);
        driver.findElement(By.id("datepicker")).click();
        driver.findElement(By.xpath("//*[@class=' ui-datepicker-days-cell-over  ui-datepicker-today']//following::a[@data-date=.]")).click();
    }
}
