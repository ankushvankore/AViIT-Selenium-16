package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

public class D33MouseHover {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://istqb.in/");

        Actions act = new Actions(driver);

        WebElement spMenu = driver.findElement(By.linkText("SPECIALIST"));
        act.moveToElement(spMenu).perform();

        List<WebElement>subMenus = driver.findElements(By.xpath("//ul[@class=\"sp-dropdown-items\"]/li/a"));
        for(WebElement s : subMenus)
            System.out.println(s.getText());

        Thread.sleep(2000);
        driver.close();
    }
}
