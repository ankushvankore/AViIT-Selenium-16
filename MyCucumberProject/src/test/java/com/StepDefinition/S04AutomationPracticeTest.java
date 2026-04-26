package com.StepDefinition;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class S04AutomationPracticeTest {
    WebDriver driver;
    @Given("Opan Automation Practice Page")
    public void opan_automation_practice_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/?m=1");
    }

    @When("Enter Name as {string}")
    public void enter_name_as(String sName) {
        driver.findElement(By.id("name")).sendKeys(sName);
    }

    @When("Enter email Id as {string}")
    public void enter_email_id_as(String email) {
        driver.findElement(By.id("email")).sendKeys(email);
    }

    @When("Enter mobile no as {string}")
    public void enter_mobile_no_as(String mNo) {
        driver.findElement(By.id("phone")).sendKeys(mNo);
        //String.valueOf(mNo)
    }

    @When("Enter address as {string}")
    public void enter_address_as(String address) {
        driver.findElement(By.id("textarea")).sendKeys(address);
    }

    @When("Select Gender as {string}")
    public void select_gender_as(String gn) {
        if(gn.equals("Male"))
            driver.findElement(By.id("male")).click();
        else
            driver.findElement(By.id("female")).click();
    }

}
