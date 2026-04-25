package com.MyTests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class D05DetailedReport {
    ExtentSparkReporter htmlReport;
    ExtentReports report;
    ExtentTest test;

    WebDriver driver;

    @Test (priority = 1)
    public void loginToOHRM1(){
        test = report.createTest("Orange HRM Test Pass");

        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.className("oxd-button")).click();

        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));

        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/header[1]/div[1]/div[3]/ul[1]/li[1]/span[1]/i[1]")).click();
        driver.findElement(By.linkText("Logout")).click();
    }

    @Test (priority = 2)
    public void loginToOHRM2() {
        test = report.createTest("Orange HRM Test Fail");

        driver.findElement(By.name("username")).sendKeys("kamini");
        driver.findElement(By.name("password")).sendKeys("kamini123");
        driver.findElement(By.className("oxd-button")).click();

        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
    }

    @AfterMethod
    public void afterMethod(ITestResult result){
        //ITestResult is an interface that provided the information about the @Test
        if(result.getStatus() == ITestResult.SUCCESS){
            test.log(Status.PASS, MarkupHelper.createLabel(result.getName(), ExtentColor.GREEN));
        }
        else if(result.getStatus() == ITestResult.FAILURE){
            test.log(Status.FAIL, MarkupHelper.createLabel(result.getName(), ExtentColor.RED));
            test.fail(result.getThrowable());
            //getThrowable() --> Will return the failure log
        }
    }

    @BeforeTest
    public void setup(){
        htmlReport = new ExtentSparkReporter("OHRM Report.html");
        report = new ExtentReports();

        report.attachReporter(htmlReport);

        report.setSystemInfo("Project Name", "Orange HRM");
        report.setSystemInfo("Machine", "Dell");
        report.setSystemInfo("User Name", "Pravin");
        report.setSystemInfo("Browser", "Google Chrome");
        report.setSystemInfo("OS", "Windows 10");
        report.setSystemInfo("Processor", "I5");

        //Add details about look and feel
        htmlReport.config().setDocumentTitle("Orange HRM Test Report");
        htmlReport.config().setReportName("OHRM Report");
        htmlReport.config().setTimeStampFormat("dd - MMM - yyyy");
        htmlReport.config().setTheme(Theme.DARK);

        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @AfterTest
    public void tearDown(){
        report.flush();

        driver.close();
    }
}
