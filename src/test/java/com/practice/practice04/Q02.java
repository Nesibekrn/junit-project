package com.practice.practice04;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

/*
Go to https://testpages.herokuapp.com/styled/events/javascript-events.html
click all the buttons
 */
public class Q02 extends TestBase {
    @Test
    public void allButtonTest() throws InterruptedException {
        driver.get("https://testpages.herokuapp.com/styled/events/javascript-events.html");

        driver.findElement(By.id("onblur")).click();
        driver.findElement(By.id("onclick")).click();
        Assert.assertEquals("Event Triggered",driver.findElement(By.id("onblurstatus")).getText());
        driver.findElement(By.id("onclick")).click();
        Assert.assertEquals("Event Triggered",driver.findElement(By.id("onclickstatus")).getText());
        Actions actions=new Actions(driver);
        actions.
                contextClick(driver.findElement(By.id("oncontextmenu"))).
                doubleClick(driver.findElement(By.id("ondoubleclick"))).
                click(driver.findElement(By.id("onfocus"))).
                click(driver.findElement(By.id("onkeydown"))).sendKeys(Keys.ENTER).
                click(driver.findElement(By.id("onkeyup"))).sendKeys(Keys.ENTER).
                click(driver.findElement(By.id("onkeypress"))).sendKeys(Keys.ENTER).
                moveToElement( driver.findElement(By.id("onmouseover"))).
                moveToElement(driver.findElement(By.id("onmouseleave"))).
                perform();

        Assert.assertEquals("Event Triggered",driver.findElement(By.id("oncontextmenustatus")).getText());
        Assert.assertEquals("Event Triggered",driver.findElement(By.id("ondoubleclickstatus")).getText());
        Assert.assertEquals("Event Triggered",driver.findElement(By.id("onfocusstatus")).getText());
        Assert.assertEquals("Event Triggered",driver.findElement(By.id("onkeydownstatus")).getText());
        Assert.assertEquals("Event Triggered",driver.findElement(By.id("onkeyupstatus")).getText());
        Assert.assertEquals("Event Triggered",driver.findElement(By.id("onkeypressstatus")).getText());
        Assert.assertEquals("Event Triggered",driver.findElement(By.id("onmouseoverstatus")).getText());
        driver.findElement(By.id("onmousedown")).click();
        Assert.assertEquals("Event Triggered",driver.findElement(By.id("onmouseleavestatus")).getText());
        Assert.assertEquals("Event Triggered",driver.findElement(By.id("onmousedownstatus")).getText());

    }
/*
@Test
    public void test() throws InterruptedException {

        driver.get("https://testpages.herokuapp.com/styled/events/javascript-events.html");
        driver.findElement(By.id("onblur")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("onclick")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("onclick")).click();
        WebElement contextMenu = driver.findElement(By.id("oncontextmenu"));
        WebElement doubleClick = driver.findElement(By.id("ondoubleclick"));
        WebElement onFocus = driver.findElement(By.id("onfocus"));
        WebElement keyDown = driver.findElement(By.id("onkeydown"));
        WebElement keyUp = driver.findElement(By.id("onkeyup"));
        WebElement keyPress = driver.findElement(By.id("onkeypress"));
        WebElement mouseOver = driver.findElement(By.id("onmouseover"));
        WebElement mouseLeave = driver.findElement(By.id("onmouseleave"));
        WebElement mouseDown = driver.findElement(By.id("onmousedown"));


        Actions actions = new Actions(driver);
        actions.
                contextClick(contextMenu).
                doubleClick(doubleClick).
                click(onFocus).
                click(keyDown).
                sendKeys(Keys.ENTER).
                click(keyUp).
                sendKeys(Keys.ENTER).
                click(keyPress).
                sendKeys(Keys.ENTER).
                moveToElement(mouseOver).
                moveToElement(mouseLeave).
                moveToElement(mouseOver).
                click(mouseDown).
                perform();

        List<WebElement> clicked = driver.findElements(By.xpath("//p[.='Event Triggered']"));
        Assert.assertEquals(11, clicked.size());

    }
 */
}
