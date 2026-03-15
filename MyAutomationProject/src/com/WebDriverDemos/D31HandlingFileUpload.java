package com.WebDriverDemos;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.time.Duration;

public class D31HandlingFileUpload {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demoqa.com/automation-practice-form");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.findElement(By.id("firstName")).sendKeys("Chetan");
        driver.findElement(By.id("lastName")).sendKeys("Sonavane");
        driver.findElement(By.id("userEmail")).sendKeys("chetan@gmail.com");
        driver.findElement(By.id("gender-radio-1")).click();
        driver.findElement(By.id("userNumber")).sendKeys("9890742718");
        driver.findElement(By.id("dateOfBirthInput")).sendKeys(Keys.CONTROL + "A");
        driver.findElement(By.id("dateOfBirthInput")).sendKeys("14 Feb 2000", Keys.ENTER);
        driver.findElement(By.id("subjectsInput")).sendKeys("H");
        driver.findElement(By.xpath("//*[@id=\"react-select-2-option-0\"]")).click();
        //Upload Picture
        driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\Dell\\Downloads\\ChatGPT Image Mar 8, 2026, 10_14_54 AM.png");
        //js.executeScript("window.scrollBy(0, 100)", "");
        //Hobbies
        WebElement hobby = driver.findElement(By.id("hobbies-checkbox-1"));
        js.executeScript("arguments[0].scrollIntoView()", hobby);
        hobby.click();
        driver.findElement(By.id("currentAddress")).sendKeys("Pune");

        js.executeScript("window.scrollBy(0, 600)", "");
        //Dropdown
        //js.executeScript("arguments[0].click()", driver.findElement(By.xpath("//*[@id=\"state\"]/div[1]/div[2]/div")));
        driver.findElement(By.xpath("//*[@id=\"state\"]/div[1]/div[2]/div")).click();
        js.executeScript("arguments[0].click()", driver.findElement(By.xpath("//*[@id=\"react-select-3-option-2\"]")));
    }
}
