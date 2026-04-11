package com.TestNGDemos;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class D12WritingToExcel {
    /*
    HSSF - .xls files
    XSSF - .xlsx files
     */
    File file;
    FileOutputStream fos;
    XSSFWorkbook wb;
    XSSFSheet sheet;
    XSSFRow row;
    XSSFCell cell;

    @Test
    public void writeData(){
        row = sheet.createRow(0);       //Create 1st row
        cell = row.createCell(0);   //Create 1st cell in 1st row

        cell.setCellValue("Pravin");
    }

    @BeforeTest
    public void setup() throws FileNotFoundException {
        file = new File("MyFirstExcelFile.xlsx");
        fos = new FileOutputStream(file);
        wb = new XSSFWorkbook();
        sheet = wb.createSheet("My Sheet");
        //If you are not providing name to the sheet, POI will create the sheet with Sheet0 name
    }

    @AfterTest
    public void saveData() throws IOException {
        wb.write(fos);
        //The data from workbook will be physically stored to the file
    }
}
