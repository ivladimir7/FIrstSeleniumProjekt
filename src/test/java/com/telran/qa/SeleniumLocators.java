package com.telran.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SeleniumLocators {
    WebDriver wd;

    @BeforeMethod
    public void setUp() {
        wd = new ChromeDriver();
        wd.get("https://ilcarro-1578153671498.web.app/registration?url=%2Fsearch");
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void starFindLocators() {
        //id
        WebElement element = wd.findElement(By.id("name"));
        wd.findElement(By.className("input-label"));
        //name
        wd.findElement(By.name("viewport"));
        //Linktext
        WebElement car = wd.findElement(By.linkText("Let the car work"));
        System.out.println(car.getText());
        WebElement car1 = wd.findElement(By.partialLinkText("car"));
        System.out.println(car1.getText());

    }

    @Test
    public void StartFindLocators() {
        //tag name
        //cssSelector
        wd.findElement(By.cssSelector("div"));
        wd.findElement(By.cssSelector("#name"));
        wd.findElement(By.cssSelector(".inpunt-label"));
        wd.findElement(By.cssSelector("[href='/search']"));
        wd.findElement(By.cssSelector("[type='/password']"));
        //contains--> *("ssw")
        wd.findElement(By.cssSelector("[type*='ssw']"));
        // start with "pas"-->
        wd.findElement(By.cssSelector("[for$='rd']"));
    }
    @Test
    public void startFindXpath() {
        //tag name
        wd.findElement(By.xpath("//div"));
        wd.findElement(By.xpath("//*[@id=émail']"));
        //class name
        wd.findElement(By.xpath("//*[@class=ínput-label']"));
        //attribute
        wd.findElement(By.xpath("[href='/search']"));
        //start with pass
        wd.findElement((By.xpath("//[starts*-with(@for,'pas')]")));
        //contains
        wd.findElement(By.xpath("//*[contains(.,'ssw')]"));
    }

    @AfterMethod
    public void tearDown() {
        wd.quit();    }
}