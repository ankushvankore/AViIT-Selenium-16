package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class D27MultipleWindowHandling {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.naukri.com/");

        driver.findElement(By.xpath("//span[contains(text(), 'Remote')]")).click();
        System.out.println("Title: " + driver.getTitle());

        Set<String>windows = driver.getWindowHandles();
        //System.out.println(windows);

        Object[]winArray = windows.toArray();
        String homePage = winArray[0].toString();
        String newPage = winArray[1].toString();

        //System.out.println(homePage + " " + newPage);

        driver.switchTo().window(newPage);
        Thread.sleep(5000);
        System.out.println("Title: " + driver.getTitle());

        driver.findElement(By.xpath("//*[@id=\"search-result-container\"]/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/label/i")).click();

        Thread.sleep(2000);
        driver.switchTo().window(homePage);

        driver.findElement(By.linkText("Login")).click();
        Thread.sleep(2000);

        driver.quit();
    }
}
