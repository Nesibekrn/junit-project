package com.HW.hw1;

import com.github.javafaker.Faker;
import com.myfirstproject.utilities.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class SignInHomework extends TestBase {
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
    }
    @Test
    public void signInTest() throws InterruptedException {
        driver.get("http://automationpractice.com/index.php");

        driver.findElement(By.className("login")).click();
        Faker faker=new Faker();

        driver.findElement(By.id("email_create")).sendKeys(faker.internet().emailAddress());

        driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();

        Thread.sleep(15000);
        String registryPageTitle1=driver.findElement(By.className("page-heading")).getText();
        String expectedRegistryTitle1="CREATE AN ACCOUNT";
        Assert.assertEquals(expectedRegistryTitle1,registryPageTitle1);

        String registryPageTitle2=driver.findElement(By.className("page-subheading")).getText();
        String expectedRegistryTitle2="YOUR PERSONAL INFORMATION";
        Assert.assertEquals(expectedRegistryTitle2,registryPageTitle2);

        String registryPageTitle3=driver.findElement(By.xpath("//*[@id=\"account-creation_form\"]/div[1]/div[1]/label")).getText();
        String expectedRegistryTitle3="Title";
        Assert.assertEquals(expectedRegistryTitle3,registryPageTitle3);

        driver.findElement(By.id("id_gender2")).click();

        driver.findElement(By.id("customer_firstname")).sendKeys(faker.name().firstName());

        driver.findElement(By.id("customer_lastname")).sendKeys(faker.name().lastName());

        driver.findElement(By.id("passwd")).sendKeys(faker.number().digits(5));

        WebElement day=driver.findElement(By.id("days"));
        Select selectDay= new Select(day);
        selectDay.selectByValue("14");

        WebElement month=driver.findElement(By.id("months"));
        Select selectMonth=new Select(month);
        selectMonth.selectByValue("8");

        WebElement year=driver.findElement(By.id("years"));
        Select selectyear=new Select(year);
        selectyear.selectByValue("2022");

        driver.findElement(By.id("newsletter")).click();

        driver.findElement(By.id("firstname")).sendKeys(faker.name().firstName());

        driver.findElement(By.id("lastname")).sendKeys(faker.name().lastName());

        driver.findElement(By.id("company")).sendKeys(faker.company().name());

        driver.findElement(By.id("address1")).sendKeys(faker.address().fullAddress());

        driver.findElement(By.id("city")).sendKeys(faker.address().city());

        WebElement state=driver.findElement(By.id("id_state"));
        Select selectState=new Select(state);
        selectState.selectByVisibleText("Florida");

        driver.findElement(By.id("postcode")).sendKeys("20365");

        WebElement country=driver.findElement(By.id("id_country"));
        Select selectcountry=new Select(country);
        selectcountry.selectByVisibleText("United States");

        driver.findElement(By.id("other")).sendKeys("At the corner, top floor of the Market");

        driver.findElement(By.id("phone")).sendKeys(faker.phoneNumber().phoneNumber());

        driver.findElement(By.id("phone_mobile")).sendKeys(faker.phoneNumber().cellPhone());

        WebElement box=driver.findElement(By.id("alias"));
        box.clear();
        box.sendKeys(faker.name().title());

        driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span")).click();

        Thread.sleep(5000);
        String accountTitle=driver.findElement(By.className("page-heading")).getText();
        String expectedAccountTitle="MY ACCOUNT";
        Assert.assertEquals(expectedAccountTitle,accountTitle);
    }
    @After
    public void tearDown(){
       //driver.quit();
    }
}
