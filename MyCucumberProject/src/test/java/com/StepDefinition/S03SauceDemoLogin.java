package com.StepDefinition;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class S03SauceDemoLogin {
    WebDriver driver;
    @Given("Open Sauce Demo Application")
    public void open_sauce_demo_application() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.saucedemo.com/");
    }

    @When("Enter valid user name")
    public void enter_valid_user_name() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
    }

    @When("Enter valid password")
    public void enter_valid_password() {
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }

    @When("Click on Login button")
    public void click_on_login_button() {
        driver.findElement(By.id("login-button")).click();
    }

    @Then("Home page should display")
    public void home_page_should_display() {
        Assert.assertTrue(driver.getCurrentUrl().contains("inventory"));
    }

    @When("Enter invalid user name and invalid password")
    public void enter_invalid_user_name_and_invalid_password() {
        driver.findElement(By.id("user-name")).sendKeys("chetan");
        driver.findElement(By.id("password")).sendKeys("chetan");
    }

    @When("User clicks on Login button")
    public void user_clicks_on_login_button() {
        driver.findElement(By.id("login-button")).click();
    }

    @Then("Error message should display")
    public void error_message_should_display() {
        Assert.assertTrue(driver.findElement(By.xpath("//h3[@data-test='error']")).getText().contains("Epic sadface"));
    }
}
