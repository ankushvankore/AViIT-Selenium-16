package com.MyTests;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class D03ReadingFromExcel {

    /*
    For Excel Handling you need to add 2 dependencies
    1. Apache POI
    2. Apache POI OOXML
     */

    String fPath = "D:\\AViIT\\Demos\\Selenium_16\\MyAutomationProject\\ExcelFiles\\LoginData.xlsx";
    File file;
    FileInputStream fis;
    XSSFWorkbook wb;
    XSSFSheet sheet;

    @Test
    public void readData(){
        int rows = sheet.getPhysicalNumberOfRows();
        int cells = sheet.getRow(0).getPhysicalNumberOfCells();

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cells; j++){
                System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
            }
        }
    }

    @BeforeTest
    public void setup() throws IOException {
        file = new File(fPath);
        fis = new FileInputStream(file);
        wb = new XSSFWorkbook(fis);
        sheet = wb.getSheetAt(0);
    }

    @AfterTest
    public void tearDown() throws IOException {
        wb.close();
        fis.close();
    }
}
