package com.WebDriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D03ReadTitle {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

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
