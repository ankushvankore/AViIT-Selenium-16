package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class D38Screenshot {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

        driver.findElement(By.id("datepicker")).click();

        String month = "Feb", day = "14";
        while (!driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")).getText().contains(month))
            driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();

        driver.findElement(By.xpath("//a[text()='"+day+"']")).click();

        TakesScreenshot ss = (TakesScreenshot) driver;
        File calenderSS = ss.getScreenshotAs(OutputType.FILE);
        FileHandler.copy(calenderSS, new File("Screenshots\\Calender.jpeg"));

        System.out.println("Screenshot captured!!!");

        driver.close();
    }
}
