package com.WebDriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class D30HeadlessBrowser {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions op = new ChromeOptions();
        op.addArguments("--headless");

        WebDriver driver = new ChromeDriver(op);
        driver.get("https://www.google.com/");

        String title = driver.getTitle();
        System.out.println("Title: " + title);

        //if(title.equals("Google"))
        if(title.contains("Goo"))
            System.out.println("Title verified\nTest case pass");
        else
            System.out.println("Title not matching\nTest case fail");

        driver.close();
    }
}
