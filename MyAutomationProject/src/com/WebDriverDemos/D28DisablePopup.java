package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class D28DisablePopup {
    public static void main(String[] args) {
        ChromeOptions op = new ChromeOptions();
        op.addArguments("--disable-notifications");

        WebDriver driver = new ChromeDriver(op);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://register.rediff.com/register/register.php?FormName=user_details");

        driver.findElement(By.partialLinkText("Rediff")).click();

    }
}
