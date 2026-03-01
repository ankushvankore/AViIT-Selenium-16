package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class D15LocateByTagName {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com");

        List<WebElement>links =  driver.findElements(By.tagName("a"));
        System.out.println("Total Links: " + links.size());
        //System.out.println(links.get(0).getText());
        /*for(int i = 0; i < links.size(); i++) {
            System.out.println(links.get(i).getText() + " => " + links.get(i).getAttribute("href"));

        }*/

        for(WebElement l : links){
            System.out.println(l.getText() + "==> " + l.getAttribute("href"));
        }

        driver.close();
    }
}
