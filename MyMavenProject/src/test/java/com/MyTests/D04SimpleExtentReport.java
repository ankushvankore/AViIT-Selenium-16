package com.MyTests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class D04SimpleExtentReport {
    /*
    For Generating Extent Report you need to add following dependency
    ExtentReports
     */
    public static void main(String[] args) {
        ExtentSparkReporter htmlReport = new ExtentSparkReporter("SimpleReport.html");
        //This object represents the HTML file that will store the report
        ExtentReports report = new ExtentReports();
        //This object represents the report
        ExtentTest test;
        //This object represents the test case

        report.attachReporter(htmlReport);
        //Store this report in the above file

        WebDriver driver;

        //Add environment details
        report.setSystemInfo("Project Name", "Google");
        report.setSystemInfo("Machine", "Dell");
        report.setSystemInfo("User Name", "Pravin");
        report.setSystemInfo("Browser", "Google Chrome");
        report.setSystemInfo("OS", "Windows 10");
        report.setSystemInfo("Processor", "I5");

        //Add details about look and feel
        htmlReport.config().setDocumentTitle("My First Extent Report");
        htmlReport.config().setReportName("Google Tests");
        htmlReport.config().setTimeStampFormat("dd - MMM - yyyy");
        htmlReport.config().setTheme(Theme.STANDARD);

        //Create the test
        test = report.createTest("Google Title Test", "Trying for 1st test case");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.google.com");
        System.out.println("Title: " + driver.getTitle());

        driver.close();

        test.log(Status.PASS, MarkupHelper.createLabel("Google Title", ExtentColor.GREEN));

        //Adding one more test
        test = report.createTest("Google Search", "Search functionality on Google");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.google.com");

        driver.findElement(By.name("q")).sendKeys("Sara Ali Khan", Keys.ENTER);

        driver.close();

        test.log(Status.FAIL, MarkupHelper.createLabel("Google Search", ExtentColor.RED));

        report.flush();     //Will generate the report file
    }
}
