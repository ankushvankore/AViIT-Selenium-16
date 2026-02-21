package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D10LocateByLinkText {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://register.rediff.com/register/register.php?FormName=user_details");

        WebElement signInLink = driver.findElement(By.linkText("Sign In"));
        System.out.println(signInLink.getText());
        signInLink.click();
    }
}
