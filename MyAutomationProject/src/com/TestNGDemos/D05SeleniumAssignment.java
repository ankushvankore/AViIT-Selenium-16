package com.TestNGDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class D05SeleniumAssignment {
    WebDriver driver;

    @Test (priority = 1)
    public void testDownloads(){
        driver.findElement(By.partialLinkText("Down")).click();
    }

    @Test (priority = 2)
    public void testDocumentation(){
        driver.findElement(By.partialLinkText("Docu")).click();
    }

    @Test (priority = 3)
    public void testProjects(){
        driver.findElement(By.partialLinkText("Proj")).click();;
    }

    @Test (priority = 4, enabled = false)
    public void testSupport(){
        driver.findElement(By.partialLinkText("Supp")).click();
    }

    @BeforeMethod
    public void openSeleniumSite(){
        driver.get("https://www.selenium.dev/");
        System.out.println("Title: " + driver.getTitle());
    }

    @AfterMethod
    public void printTitle(){
        System.out.println("Title: " + driver.getTitle());
    }

    @BeforeTest
    public void setup(){
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterTest
    public void tearDown(){
        driver.close();
    }
}
