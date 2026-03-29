package com.TestNGDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class D05SeleniumAssignment {
    WebDriver driver;

    @Test (priority = 1, groups = "CoreLinks")
    public void testDownloads(){
        driver.findElement(By.partialLinkText("Down")).click();
    }

    @Test (priority = 2, groups = "CoreLinks")
    public void testDocumentation(){
        driver.findElement(By.partialLinkText("Docu")).click();
    }

    @Test (priority = 3, groups = "OtherLinks")
    public void testProjects(){
        driver.findElement(By.partialLinkText("Proj")).click();;
    }

    @Test (priority = 4, groups = "OtherLinks")
    public void testSupport(){
        driver.findElement(By.partialLinkText("Supp")).click();
    }

    @BeforeMethod (alwaysRun = true)
    public void openSeleniumSite(){
        driver.get("https://www.selenium.dev/");
        System.out.println("Title: " + driver.getTitle());
    }

    @AfterMethod(alwaysRun = true)
    public void printTitle(){
        System.out.println("Title: " + driver.getTitle());
    }

    @BeforeTest (alwaysRun = true)
    public void setup(){
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterTest (alwaysRun = true)
    public void tearDown(){
        driver.close();
    }
}
