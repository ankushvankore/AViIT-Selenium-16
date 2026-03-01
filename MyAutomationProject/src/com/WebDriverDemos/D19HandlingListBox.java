package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class D19HandlingListBox {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://omayo.blogspot.com/");

        //WebElement lstBox = driver.findElement(By.id("multiselect1"));
        //Select cars = new Select(lstBox);
        Select cars = new Select(driver.findElement(By.id("multiselect1")));

        List<WebElement>allCars = cars.getOptions();

        System.out.println("-------------- All Cars in the list ---------------");

        for (WebElement c : allCars)
            System.out.println(c.getText());

        if(cars.isMultiple()) {
            cars.selectByIndex(1);
            cars.selectByIndex(2);

            System.out.println("--------------- Selected Cars from the list ---------------");
            List<WebElement> selectedCars = cars.getAllSelectedOptions();
            for (WebElement sc : selectedCars)
                System.out.println(sc.getText());
        }

        //cars.deselectByIndex(1);
        //cars.deselectByValue("swiftx");
        //cars.deselectByVisibleText("Swift");
        //cars.deSelectByContainsVisibleText("Swi");
        cars.deselectAll();

    }
}
