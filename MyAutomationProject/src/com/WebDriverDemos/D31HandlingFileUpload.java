package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.time.Duration;

public class D31HandlingFileUpload {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demoqa.com/automation-practice-form");

        driver.findElement(By.id("firstName")).sendKeys("Chetan");
        driver.findElement(By.id("lastName")).sendKeys("Sonavane");
        driver.findElement(By.id("userEmail")).sendKeys("chetan@gmail.com");
        driver.findElement(By.id("gender-radio-1")).click();
        driver.findElement(By.id("userNumber")).sendKeys("9890742718");
        driver.findElement(By.id("dateOfBirthInput")).sendKeys(Keys.CONTROL + "A");
        driver.findElement(By.id("dateOfBirthInput")).sendKeys("14 Feb 2000");
        driver.findElement(By.id("subjectsInput")).sendKeys("H");
        driver.findElement(By.xpath("//*[@id=\"react-select-2-option-0\"]")).click();
        //Upload Picture
        driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\Dell\\Downloads\\ChatGPT Image Mar 8, 2026, 10_14_54 AM.png");
    }
}
