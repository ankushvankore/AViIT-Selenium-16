package com.StepDefinition;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class S06RediffRegistration {
    WebDriver driver;
    @Given("Launch Rediff registration page")
    public void launch_rediff_registration_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
    }

    @When("When Enter folloing details")
    public void when_enter_folloing_details(io.cucumber.datatable.DataTable dataTable) {
        System.out.println(dataTable);
        List<String>data = dataTable.asList();
        System.out.println(data);

        driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[2]/input")).sendKeys(data.get(0));
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[3]/div/input")).sendKeys(data.get(1));
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[3]/div/input")).sendKeys(data.get(2));
        driver.findElement(By.xpath("//*[@id=\"newpasswd1\"]")).sendKeys(data.get(2));
        new Select(driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[8]/select[1]"))).selectByVisibleText(data.get(3));
        new Select(driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[8]/select[2]"))).selectByVisibleText(data.get(4));
        new Select(driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[8]/select[3]"))).selectByVisibleText(data.get(5));
    }

    @Then("Registration process successful")
    public void registration_process_successful() {

    }
}
