package com.telran.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class  FindElemLcaroTest {

    WebDriver driver;


    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://ilcarro-1578153671498.web.app/search");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    @Test
    public void findElementByTagTest() {
        //find elements
        WebElement element = driver.findElement(By.tagName("img"));
        System.out.println(element.getText());
        //find size elements
        List<WebElement> elements = driver.findElements(By.tagName("img"));
        System.out.println(elements.size());
    }

    @AfterMethod
public void tearDown() {
        driver.quit();
    }

}

