package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D09LocateByCssSelectorSpecialCharacters {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://register.rediff.com/register/register.php?FormName=user_details");

        //^ - Starts with
        WebElement fullName = driver.findElement(By.cssSelector("input[name^=\"name\"]"));
        fullName.sendKeys("Kamini");

        //$ - Ends with
        WebElement rediffId = driver.findElement(By.cssSelector("input[placeholder$=\"ID\"]"));
        rediffId.sendKeys("kamini2026");

        //* - Contains
        WebElement password = driver.findElement(By.cssSelector("input[placeholder*=\"Enter pass\"]"));
        password.sendKeys("kamini@123");
    }
}
