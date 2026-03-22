package com.TestNGDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class D04Before_After_Method {
    WebDriver driver;

    @Test(priority = 4)
    public void testFlipkart(){
        driver.get("https://www.flipkart.com/");
    }

    @Test (priority = 3)
    public void testAmazon(){
        driver.get("https://www.amazon.in/");
    }

    @Test (priority = 1)
    public void testMyntra(){
        driver.get("https://www.myntra.com/");
    }

    @Test (priority = 2)
    public void testNyka(){
        driver.get("https://www.nykaa.com/");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method");
    }

    @AfterMethod
    public void printTitle(){
        System.out.println("Title: " + driver.getTitle());
        System.out.println("After Method");
    }

    @BeforeTest
    public void launchBrowser(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.out.println("Before Test");
    }

    @AfterTest
    public void closeBrowser(){
        driver.close();
        System.out.println("After Test");
    }
}
