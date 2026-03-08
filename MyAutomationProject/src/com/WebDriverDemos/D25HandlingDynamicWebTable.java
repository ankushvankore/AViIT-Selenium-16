package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class D25HandlingDynamicWebTable {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/?m=1");

        List<WebElement>headers = driver.findElements(By.xpath("//*[@id=\"headers\"]/th"));

        int headerIndex = 1;
        for(WebElement h : headers){
            if(h.getText().contains("CPU")){
                break;
            }
            headerIndex++;
        }

        List<WebElement>browserName = driver.findElements(By.xpath("//*[@id=\"rows\"]/tr/td[1]"));
        int rowIndex = 1;

        for(WebElement b : browserName){
            if(b.getText().contains("Chrome")){
                break;
            }
            rowIndex++;
        }

        String expCPU = driver.findElement(By.xpath("//*[@id=\"displayValues\"]/p[1]/strong")).getText();
        String actCPU = driver.findElement(By.xpath("//*[@id=\"rows\"]/tr["+rowIndex+"]/td["+headerIndex+"]")).getText();

        if(expCPU.equals(actCPU))
            System.out.println("Expected CPU Load: " + expCPU + "\nActual CPU Load: " + actCPU + "\nBoth are matching!!! Test case pass");
        else
            System.out.println("Expected CPU Load: " + expCPU + "\nActual CPU Load: " + actCPU + "\nBoth not are matching!!! Test case fail");

        driver.close();
    }
}
