package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class D22ExplicitWait {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://omayo.blogspot.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        WebElement chkBox = driver.findElement(By.id("dte"));

        System.out.println("----------- Before --------------");
        System.out.println("Enabled : " + chkBox.isEnabled());
        System.out.println("Selected: " + chkBox.isSelected());

        driver.findElement(By.xpath("//*[@id=\"HTML47\"]/div[1]/button")).click();
        //wait.until(ExpectedConditions.elementToBeClickable(chkBox));
        //chkBox.click();

        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("dte")))).click();

        System.out.println("----------- After --------------");
        System.out.println("Enabled : " + chkBox.isEnabled());
        System.out.println("Selected: " + chkBox.isSelected());
    }
}
