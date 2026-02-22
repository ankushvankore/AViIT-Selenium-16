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
        System.out.println("Text on link : " + signInLink.getText());
        //System.out.println("Value of href: " + signInLink.getAttribute("href"));
        System.out.println("Value of href: " + signInLink.getDomAttribute("href"));
        signInLink.click();
    }
}
