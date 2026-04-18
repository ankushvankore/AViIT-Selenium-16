package com.MyTests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;

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
        
    }
}
