package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class TableHandling {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demo.guru99.com/test/web-table-element.php");

        List<WebElement>rows = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
        System.out.println("Total Rows: " + rows.size());

        int i = new Random().nextInt(rows.size());

        //Value of i is 5 at this moment

        System.out.println("Value if i is " + i + "at this moment");

        System.out.println(rows.get(i).getText());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[" + (i+1) + "]")).getText());

        driver.close();
    }
}
