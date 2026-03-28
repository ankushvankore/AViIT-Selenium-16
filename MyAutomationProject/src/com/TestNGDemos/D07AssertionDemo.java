package com.TestNGDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class D07AssertionDemo {
    WebDriver driver;
    JavascriptExecutor js;
    String expUrl = "https://practice.expandtesting.com/secure", actUrl;

    @Test(dataProvider = "getLoginDetails")
    public void login(String un, String ps){
        driver.findElement(By.id("username")).sendKeys(un);
        driver.findElement(By.id("password")).sendKeys(ps);
        driver.findElement(By.id("submit-login")).submit();

        actUrl = driver.getCurrentUrl();

        //Assert.assertEquals(actUrl, expUrl);
        //Here TestNG will compare actUrl with expUrl, if both are equal then @Test will be marked as Pass otherwise fail
        //Assert.assertTrue(actUrl.equals(expUrl));
        Assert.assertTrue(actUrl.contains("secure"));
    }

    @DataProvider
    public Object[][] getLoginDetails(){
        return new Object[][] {
                new Object[]{"kamini", "kamini123"},
                new Object[]{"amit", "amit123"},
                new Object[] {"practice", "SuperSecretPassword!"},
                new Object[]{"pravin", "pravin"},
        };

        //Object[][] data = {{1, "A"}, {2, "B"}, {3, "C"}};
        //return data;
    }

    @AfterMethod
    public void logout(){
        if(driver.getCurrentUrl().contains("secure")) {
            js.executeScript("arguments[0].click()", driver.findElement(By.linkText("Logout")));
        }
        else {
            System.out.println("Login fail");
        }
    }

    @BeforeTest
    public void setup(){
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://practice.expandtesting.com/login");

        js = (JavascriptExecutor) driver;
    }
    @AfterTest
    public void tearDown(){
        driver.close();
    }
}
