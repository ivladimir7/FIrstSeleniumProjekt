package com.telran.qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FirstSeleniumTest {
    //test
    WebDriver driver;


    //before-setUp
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
//        driver = new FirefoxDriver();
        driver.get("https://www.google.com/");
//        driver.navigate.to ("https://www.google.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void openGoogleTest() {
        System.out.println("Site opened!'");
    }



    //after - tearDawn
    @AfterMethod
    public void tearDown() {
        driver. navigate().back();
        driver.quit();

    }
}