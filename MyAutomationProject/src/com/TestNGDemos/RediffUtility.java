package com.TestNGDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RediffUtility {
    /*
    How to pass the driver object?
    1. Make driver from client as public static
    2. Make Utility class as a base class and client as derived class
       Mark driver as protected static
    3. Create a constructor in utility class and pass the object from client class
     */
    WebDriver driver;

    public RediffUtility(WebDriver d){
        this.driver = d;
    }

    public void setFullName(String fn){
        driver.findElement(By.xpath("//input[@placeholder='Enter your full name']")).sendKeys(fn);
    }

    public void setRediffId(String rid){
        driver.findElement(By.cssSelector("input[name^='login']")).sendKeys(rid);
    }

    public void setPassword(String ps){
        driver.findElement(By.id("newpasswd")).sendKeys(ps);
        driver.findElement(By.id("newpasswd1")).sendKeys(ps);
    }

    public void setBirthDate(String day, String month, String year){
        Select dayDD = new Select(driver.findElement(By.className("day")));
        dayDD.selectByVisibleText(day);

        new Select(driver.findElement(By.className("middle"))).selectByVisibleText(month);
        new Select(driver.findElement(By.className("year"))).selectByVisibleText(year);
    }

    public String checkAvailablity() throws InterruptedException {
        driver.findElement(By.className("btn_checkavail")).click();
        Thread.sleep(5000);
        String msg = driver.findElement(By.id("check_availability")).getText();
        System.out.println(msg);

        return msg;
    }
}
