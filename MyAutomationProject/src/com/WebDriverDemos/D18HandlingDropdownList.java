package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class D18HandlingDropdownList {
    public static void main(String[] args) {

        /*
        1. Display Selected Country
        2. Display total no of countries
        3. Display list of all the countries
        4. Select Finland from the list
         */

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://register.rediff.com/register/register.php?FormName=user_details");

        WebElement drpList = driver.findElement(By.id("country"));
        Select countries = new Select(drpList);
        //All the operations on drop down list can be performed only via this object.
        System.out.println("Selected Country: " + countries.getFirstSelectedOption().getText());

        List<WebElement>allCountries = countries.getOptions();
        System.out.println("Total no of countries: " + allCountries.size());

        int i = 0;
        for(WebElement c : allCountries){
            System.out.println(i + ". " + c.getText());
            i++;
        }

        //countries.selectByVisibleText("Finland");
        //countries.selectByContainsVisibleText("Finl");
        //countries.selectByValue("74");
        countries.selectByIndex(72);
        System.out.println("Selected Country: " + countries.getFirstSelectedOption().getText());
    }
}
