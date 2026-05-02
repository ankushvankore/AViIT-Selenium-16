package com.StepDefinition;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class S07DataDrivenTesting {
    WebDriver driver;

    @Given("Launch Sauce Demo")
    public void launch_sauce_demo() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.saucedemo.com/");
    }

    @When("Enter user name as {string}")
    public void enter_user_name_as(String un) {
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(un);
    }

    @When("Enter password as {string}")
    public void enter_password_as(String ps) {
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(ps);
    }

    @When("I Click on login button")
    public void i_click_on_login_button() {
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
    }

    @Then("Inventroy page should display")
    public void inventroy_page_should_display() {
        Assert.assertTrue(driver.getCurrentUrl().contains("inventory"));
    }
}
