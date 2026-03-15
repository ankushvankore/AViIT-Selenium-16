package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class D33MouseHover {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://istqb.in/");

        Actions act = new Actions(driver);

        WebElement fMenu = driver.findElement(By.xpath("(//span[contains(text(), 'FOUNDATION')])[1]"));

        act.moveToElement(fMenu).perform();
    }
}
