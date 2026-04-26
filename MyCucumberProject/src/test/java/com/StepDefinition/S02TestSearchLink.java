package com.StepDefinition;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class S02TestSearchLink {
    WebDriver driver;
    @Given("Launch Google")
    public void launch_google() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://google.com");
    }

    @When("Click on How Search Works Link")
    public void click_on_how_search_works_link() {
        driver.findElement(By.partialLinkText("How")).click();
    }

    @Then("Search link should display")
    public void search_link_should_display() {
        Assert.assertTrue(driver.getCurrentUrl().contains("search"));
    }
}
