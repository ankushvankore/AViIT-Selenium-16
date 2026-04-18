package com.MyTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class D02TrialTestNGClass {
    WebDriver driver;
    Actions act;
    @Test
    public void trialTest(){
        driver.findElement(By.linkText("Droppable")).click();

        //driver.switchTo().frame(0);
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));

        act.dragAndDrop(source, target).perform();
    }

    @BeforeTest
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://jqueryui.com/");

        act = new Actions(driver);
    }

    @AfterTest
    public void tearDown(){

    }
}
