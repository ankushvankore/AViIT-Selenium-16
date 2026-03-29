package com.TestNGDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class D10KeywordDrivenFramework {
    File f1;
    //As we are trying to communicate with file
    FileInputStream fis;
    //For reading the data from file
    Properties prop;
    //The data from the file is set of properties,
    //so the object of Properties class is used to read these properties

    WebDriver driver;

    @Test
    public void automobileTest(){
        driver.findElement(By.linkText(prop.getProperty("autoLinkText"))).click();
        Select makeDD = new Select(driver.findElement(By.id(prop.getProperty("makeID"))));
        makeDD.selectByIndex(3);
        driver.findElement(By.name(prop.getProperty("epName"))).sendKeys("1000");
        driver.findElement(By.cssSelector(prop.getProperty("domCSS"))).sendKeys("03/04/2026");
        new Select(driver.findElement(By.xpath(prop.getProperty("seatsXPath")))).selectByIndex(3);
    }

    @BeforeTest
    public void beforeTest() throws IOException {
        f1 = new File("src/com/TestNGDemos/MyLocators.properties");
        fis = new FileInputStream(f1);
        prop = new Properties();
        prop.load(fis);
        //Will load all the properties from .properties file to prop object
        //System.out.println(prop.getProperty("url"));

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get(prop.getProperty("url"));
    }
}
