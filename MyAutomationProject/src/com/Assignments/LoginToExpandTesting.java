package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginToExpandTesting {
    WebDriver driver;
    JavascriptExecutor js;

    @Test
    public void login1(){
        driver.findElement(By.id("username")).sendKeys("practice");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.id("submit-login")).submit();
    }

    @Test
    public void login2(){
        driver.findElement(By.id("username")).sendKeys("kamini");
        driver.findElement(By.id("password")).sendKeys("kamini123");
        driver.findElement(By.id("submit-login")).submit();
    }

    @Test
    public void login3(){
        driver.findElement(By.id("username")).sendKeys("chetan");
        driver.findElement(By.id("password")).sendKeys("chetan123");
        driver.findElement(By.id("submit-login")).submit();
    }

    @AfterMethod
    public void logout(){
        if(driver.getCurrentUrl().contains("secure")) {
            js.executeScript("arguments[0].click()", driver.findElement(By.linkText("Logout")));
        }
        else {
            System.out.println("Login fail");
        }
    }

    @BeforeTest
    public void setup(){
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://practice.expandtesting.com/login");

        js = (JavascriptExecutor) driver;
    }
    @AfterTest
    public void tearDown(){
        driver.close();
    }
}
