package com.practice.practice04;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import java.nio.file.Files;
import java.nio.file.Paths;

//Go to https://testpages.herokuapp.com/
//Click on File Downloads
//Click on Server Download
//Verify that file is downloaded
    public class Q03 extends TestBase {
@Test
    public void downloadTest() throws InterruptedException {
    driver.get("https://testpages.herokuapp.com/");
    driver.findElement(By.id("download")).click();
    driver.findElement(By.id("server-download")).click();
    String homeDirectory=System.getProperty("user.home");
    System.out.println(homeDirectory);
    String pathFile=homeDirectory+"/Downloads/textfile.txt";
    System.out.println(pathFile);
    Thread.sleep(2000);
    boolean isDownloaded=Files.exists(Paths.get(pathFile));
    Assert.assertTrue(isDownloaded);
    }
//        @Test
//        public void test(){
//            //Go to https://testpages.herokuapp.com/
//            driver.get("https://testpages.herokuapp.com/");
//
//            //Click on File Downloads
//            driver.findElement(By.id("download")).click();
//
//            //Click on Server Download
//            driver.findElement(By.id("server-download")).click();
//
//            //Verify that file is downloaded
//            String homeDirectory = System.getProperty("user.home");
//            String filePath = homeDirectory+"/Downloads/textfile.txt";
//
//            boolean isDownloaded = Files.exists(Paths.get(filePath));
//            Assert.assertTrue(isDownloaded);
//    }
}
