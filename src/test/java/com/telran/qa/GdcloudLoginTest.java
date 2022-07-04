package com.telran.qa;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import java.util.concurrent.TimeUnit;

public class GdcloudLoginTest {

    WebDriver driver;


    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://gdcloud.ru/release-17/auth/login.html#/?_k=gg6ctj");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void loginUserPositiveTest() {
        //click on Login link
        login();
        //click on the button Sign in
        driver.findElement(By.xpath("//*[@id='login_button']")).click();
        driver.findElement(By.xpath("//label[contains(@for, 'remember')]")).click();
        driver.findElement(By.xpath("//*[@id='page_content']/nav/div/div[3]/div[1]/span/span")).click();
        driver.findElement(By.xpath("//*[@id='page_content']/nav/div/div[3]/div[4]/div/ul/li[1]")).click();
        Assert.assertTrue(isElementPresent(By.cssSelector("#userName")));


    }

    public boolean isElementPresent(By locator) {
        return driver.findElements((By.cssSelector("#userName"))).size() > 0;
    }


    public void login() {
        driver.findElement(By.xpath("//input[@id='username']")).click();
        driver.findElement(By.xpath("//input[@id='username']")).clear();
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tester");
        driver.findElement(By.xpath("//input[@id='password']")).click();
        driver.findElement(By.xpath("//input[@id='password']")).clear();
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("K35G3U");



    }
    @AfterMethod(enabled = false)
    public void tearDown(){
        driver.quit();
    }
}
