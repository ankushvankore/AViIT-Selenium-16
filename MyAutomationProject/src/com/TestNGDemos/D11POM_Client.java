package com.TestNGDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class D11POM_Client {
    WebDriver driver;
    RediffUtility r1;

    @Test
    public void registration1() throws InterruptedException {
        r1.setFullName("Kamini Bhadane");
        r1.setRediffId("kamini");
        r1.setPassword("Kamini@123");
        r1.setBirthDate("17", "SEP", "2000");
        String message = r1.checkAvailablity();
        Assert.assertTrue(message.contains("Yippie"));
    }

    @Test
    public void registration2() throws InterruptedException {
        r1.setFullName("Pravin Ahire");
        r1.setRediffId("PravinAhire9654785256");
        r1.setPassword("Pravin@123");
        r1.setBirthDate("30", "SEP", "2000");

        Assert.assertTrue(r1.checkAvailablity().contains("Yippie"));
    }

    @AfterMethod
    public void clearAll() throws InterruptedException {
        Thread.sleep(5000);
        driver.navigate().refresh();
    }

    @BeforeTest
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://register.rediff.com/register/register.php?FormName=user_details");

        r1 = new RediffUtility(driver);
    }


}
