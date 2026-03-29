package com.TestNGDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class D09Parameterization {
    WebDriver driver;

    @Parameters({"userName", "password"})
    @Test()
    public void loginToEchoTrak(String un, String ps){
        driver.findElement(By.id("txtCustomerID")).sendKeys(un);
        driver.findElement(By.id("txtPassword")).sendKeys(ps);
        driver.findElement(By.id("Butsub")).click();
    }

    @Parameters({"userName1", "password1"})
    @Test()
    public void loginToEchoTrak1(String un, String ps){
        driver.findElement(By.id("txtCustomerID")).sendKeys(un);
        driver.findElement(By.id("txtPassword")).sendKeys(ps);
        driver.findElement(By.id("Butsub")).click();
    }

    @AfterMethod
    public void printErrorMessage(){
        System.out.println(driver.findElement(By.id("lblMsg")).getText());
    }

    @BeforeTest
    public void setup(){
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
    }

    @AfterTest
    public void tearDown(){
        driver.close();
    }
}
