package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class D14FindMultipleControls {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");

        String[] data = {"kamini", "kamini@123"};

        //List<WebElement>txtBoxes = driver.findElements(By.className("form-control"));
        List<WebElement>txtBoxes = driver.findElements(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/div/div/form/fieldset/div/fieldset/input"));
        //txtBoxes.get(0).sendKeys(data[0]);
        //txtBoxes.get(1).sendKeys(data[1]);
        for(int i = 0; i < txtBoxes.size(); i++)
            txtBoxes.get(i).sendKeys(data[i]);
    }
}
