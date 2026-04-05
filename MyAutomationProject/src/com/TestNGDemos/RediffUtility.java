package com.TestNGDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RediffUtility {
    /*
    How to pass the driver object?
    1. Make driver from client as public static
    2. Make Utility class as a base class and client as derived class
       Mark driver as protected static
    3. Create a constructor in utility class and pass the object from client class
     */

    /*
    Page Factory
    - It is subset of Page Object Model
    - It the collection / library of the WebElements
    - Which is also called as Object Repository
    - Each WebElement can be located only once and can be reused for multiple times
    - Each WebElement is located via @FindBy
     */
    WebDriver driver;

    @FindBy(xpath = "//input[@placeholder='Enter your full name']")
    WebElement fullName;

    @FindBy(css = "input[name^='login']") WebElement rediffId;
    @FindBy(id = "newpasswd")WebElement password;
    @FindBy(id = "newpasswd1")WebElement confirmPassword;
    @FindBy(className = "day")WebElement drpDay;
    @FindBy(className = "middle") WebElement drpMonth;
    @FindBy(className = "year")WebElement drpYear;

    public RediffUtility(WebDriver d){
        this.driver = d;
        PageFactory.initElements(driver, this);
    }

    public void setFullName(String fn){
        //driver.findElement(By.xpath("//input[@placeholder='Enter your full name']")).sendKeys(fn);
        fullName.sendKeys(fn);
    }

    public void setRediffId(String rid){
        //driver.findElement(By.cssSelector("input[name^='login']")).sendKeys(rid);
        rediffId.sendKeys(rid);
    }

    public void setPassword(String ps){
        //driver.findElement(By.id("newpasswd")).sendKeys(ps);
        //driver.findElement(By.id("newpasswd1")).sendKeys(ps);
        password.sendKeys(ps);
        confirmPassword.sendKeys(ps);
    }

    public void setBirthDate(String day, String month, String year){
       /* Select dayDD = new Select(driver.findElement(By.className("day")));
        dayDD.selectByVisibleText(day);

        new Select(driver.findElement(By.className("middle"))).selectByVisibleText(month);
        new Select(driver.findElement(By.className("year"))).selectByVisibleText(year);*/
        new Select(drpDay).selectByVisibleText(day);
        new Select(drpMonth).selectByVisibleText(month);
        new Select(drpYear).selectByVisibleText(year);
    }

    public String checkAvailablity() throws InterruptedException {
        driver.findElement(By.className("btn_checkavail")).click();
        Thread.sleep(5000);
        String msg = driver.findElement(By.id("check_availability")).getText();
        System.out.println(msg);

        return msg;
    }
}
