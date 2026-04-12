package com.TestNGDemos;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class D14ReadingFromExcel {
    String fPath = "ExcelFiles/LoginData.xlsx";
    File file;
    FileInputStream fis;
    XSSFWorkbook wb;
    XSSFSheet sheet;
    XSSFRow row;
    XSSFCell cell;

    @Test(enabled = false)
    public void readTheData(){
        row = sheet.getRow(0);
        cell = row.getCell(0);
        System.out.println(cell.getStringCellValue());

        System.out.println(sheet.getRow(0).getCell(1).getStringCellValue());
        System.out.println(sheet.getRow(0).getCell(2).getStringCellValue());
    }

    @Test
    public void readAllData(){
        int rows = sheet.getPhysicalNumberOfRows();
        int cells = sheet.getRow(0).getPhysicalNumberOfCells();

        /*for(int i = 0; i < rows; i++){
            row = sheet.getRow(i);
            for(int j = 0; j < cells; j++){
                cell = row.getCell(j);
                System.out.println(cell.getStringCellValue());
            }
            System.out.println("---------------------------");
        }*/
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cells; j++){
                System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
            }
            System.out.println("-----------------------------");
        }
    }

    @BeforeTest
    public void setup() throws IOException {
        file = new File(fPath);
        fis = new FileInputStream(file);
        wb = new XSSFWorkbook(fis);
        //As we are not creating the new workbook, rather we are supposed to read the data from
        //existing workbook so, while creating wb object we need to pass fileinputstream
        sheet = wb.getSheet("Sheet1");
    }

    @AfterTest
    public void tearDown() throws IOException {
        wb.close();
        fis.close();
    }
}
