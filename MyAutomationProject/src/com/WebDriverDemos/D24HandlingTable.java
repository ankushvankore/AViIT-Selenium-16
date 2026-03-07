package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class D24HandlingTable {
    /*
    1. Display all headers
    2. Display total no of rows
    3. Display any row randomly
     */

    /*
    <table>
        <thead> table header
            <tr>    Table Row
                <th>Sr.No</th>    Header of column
                <th>Company</th>
            </tr>
        </thead>
        <tdata>     Table Data
            <tr>
                <td>1</td>            Table Data
                <td>AViIT</td>
            </tr>
            <tr>
                <td>2</td>
                <td>Harshada Cashew</td>
            </tr>
        </tdata>
    </table>
     */
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/?m=1");

        //List<WebElement>headers = driver.findElements(By.tagName("th"));
        List<WebElement>headers = driver.findElements(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr[1]/th"));

        for(WebElement h : headers)
            System.out.println(h.getText());

        List<WebElement>rows = driver.findElements(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr"));
        System.out.println("Total Rows: " + rows.size());

        Random rnd = new Random();
        int i = rnd.nextInt(rows.size());


        System.out.println(rows.get(i).getText());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr["+(i+1)+"]")).getText());

        driver.close();
    }
}
