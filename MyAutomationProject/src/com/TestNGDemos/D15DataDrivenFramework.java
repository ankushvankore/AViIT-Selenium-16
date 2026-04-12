package com.TestNGDemos;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

import java.io.*;
import java.time.Duration;

public class D15DataDrivenFramework {
    /*
    1. Read the data from LoginData.xlsx file
    2. Pass this data (user name and password) to the test case
    3. After executing the test case update the Result column from excel file
     */

    String fPath = "ExcelFiles/LoginData.xlsx";
    File file;
    FileInputStream fis;
    FileOutputStream fos;
    XSSFWorkbook wb;
    XSSFSheet sheet;
    XSSFRow row;
    XSSFCell cell;
    int index = 1;

    WebDriver driver;

    @Test (dataProvider = "getLoginData")
    public void login(String un, String ps){
        driver.findElement(By.id("user-name")).sendKeys(un);
        driver.findElement(By.id("password")).sendKeys(ps);
        driver.findElement(By.id("login-button")).click();
    }

    @AfterMethod
    public void logout() throws InterruptedException {
        cell = sheet.getRow(index).getCell(2);

        if(driver.getCurrentUrl().contains("inventory")){
            System.out.println("Test case pass");
            driver.findElement(By.id("react-burger-menu-btn")).click();
            driver.findElement(By.linkText("Logout")).click();

            cell.setCellValue("Pass");
        }
        else {
            System.out.println(driver.findElement(By.cssSelector("h3[data-test=\"error\"]")).getText());

            cell.setCellValue("Fail");
        }

        Thread.sleep(2000);
        driver.navigate().refresh();

        index++;
    }

    @DataProvider
    public Object[][] getLoginData(){
        int rows = sheet.getPhysicalNumberOfRows();
        String[][]data = new String[rows-1][2];

        for(int i = 1; i < rows; i++){
            row = sheet.getRow(i);
            for(int j = 0; j < 2; j++){
                cell = row.getCell(j);
                data[i-1][j] = cell.getStringCellValue();
            }
        }
        return  data;
    }

    @BeforeTest
    public void setup() throws IOException {
        file = new File(fPath);
        fis = new FileInputStream(file);
        wb = new XSSFWorkbook(fis);
        sheet = wb.getSheetAt(0);
        fos = new FileOutputStream(file);

        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.saucedemo.com/");
    }

    @AfterTest
    public void tearDown() throws IOException {
        wb.write(fos);
        wb.close();
        driver.close();
    }
}
