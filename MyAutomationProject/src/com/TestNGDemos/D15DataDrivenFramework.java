package com.TestNGDemos;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class D15DataDrivenFramework {
    /*
    1. Read the data from LoginData.xlsx file
    2. Pass this data (user name and password) to the test case
    3. After executing the test case update the Result column from excel file
     */

    String fPath = "ExcelFiles/LoginData.xlsx";
    File file;
    FileInputStream fis;
    XSSFWorkbook wb;
    XSSFSheet sheet;
    XSSFRow row;
    XSSFCell cell;

    @Test (dataProvider = "getLoginData")
    public void login(String un, String ps){
        System.out.println(un);
        System.out.println(ps);
        System.out.println("---------------- xxx ------------");
    }

    @DataProvider
    public Object[][] getLoginData(){
        int rows = sheet.getPhysicalNumberOfRows();
        String[][]data = new String[rows][2];

        for(int i = 0; i < rows; i++){
            row = sheet.getRow(i);
            for(int j = 0; j < 2; j++){
                cell = row.getCell(j);
                data[i][j] = cell.getStringCellValue();
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
    }
}
