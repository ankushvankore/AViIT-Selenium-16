package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class D26HandlingPaginationTable {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/?m=1");

        List<WebElement>pages = driver.findElements(By.xpath("//*[@id=\"pagination\"]/li/a"));
        System.out.println("Total Pages: " + pages.size());

        int totalRows = 0;

        for(WebElement p : pages){
            p.click();

            List<WebElement>rows = driver.findElements(By.xpath("//*[@id=\"productTable\"]/tbody/tr"));
            totalRows = totalRows + rows.size();

            for(WebElement r : rows)
                System.out.println(r.getText());

            Thread.sleep(2000);
            System.out.println("------------------------------------");
        }

        System.out.println("Total Rows: " + totalRows);

        driver.close();
    }
}
