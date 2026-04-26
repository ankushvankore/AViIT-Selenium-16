package com.StepDefinition;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class S05GoogleLinks {
    WebDriver driver;
    @Given("Open {string}")
    public void open(String url) {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get(url);
    }

    @When("Click on About Link")
    public void click_on_about_link() {
        driver.findElement(By.linkText("About")).click();
    }

    @Then("About Page should open")
    public void about_page_should_open() {
        System.out.println("Title: " + driver.getTitle());
    }

    @When("Click on Store Link")
    public void click_on_store_link() {
        driver.findElement(By.linkText("Store")).click();
    }

    @Then("Store Page should open")
    public void store_page_should_open() {
        System.out.println("Title: " + driver.getTitle());
    }

    @When("Click on Gmail Link")
    public void click_on_gmail_link() {
        driver.findElement(By.linkText("Gmail")).click();
    }

    @Then("Gmail Page should open")
    public void gmail_page_should_open() {
        System.out.println("Title: " + driver.getTitle());
    }

    @When("Click on Images Link")
    public void click_on_images_link() {
        driver.findElement(By.linkText("Images")).click();
    }

    @Then("Images Page should open")
    public void images_page_should_open() {
        System.out.println("Title: " + driver.getTitle());
    }
}
