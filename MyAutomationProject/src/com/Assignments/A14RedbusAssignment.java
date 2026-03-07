package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class A14RedbusAssignment {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.redbus.in/");

        //From
        driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div[2]/search/div/div/div[1]/div[1]/div[1]/div")).click();
        driver.findElement(By.id("srcinput")).sendKeys("Kolh");
        driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div[2]/search/div/div/div[2]/div/div[3]/div[1]/div[1]/div/div/div")).click();
    }
}
